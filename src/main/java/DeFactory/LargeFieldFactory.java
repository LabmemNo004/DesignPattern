package DeFactory;

import Land.Land;
import Land.LargeField;

import java.util.ArrayList;
import java.util.*;

/**
 * The Large field factory.
 * 大片土地工厂
 *
 * @className: LargeFieldFactory
 * @description:
 * @designPattern:
 */
public class LargeFieldFactory extends DeFactory{
    private static final Map _usages = new HashMap<String,Land>();     // 土地用途记录表，统计注册土地的用途

    public LargeFieldFactory() {
        System.out.println("======== 使用工厂 Factory 模式 ========");
        System.out.println("成功创建大片土地工厂");
    }

    @Override
    protected Land createLand(String usage) {
        return new LargeField(usage);
    }

    /**
     * Lazy Factory method, gets the Land instance associated with a
     * certain usage. Instantiates new ones as needed.
     * @param usage Any string that describes the usage of a land.
     * @return The Land instance associated with that usage.
     */
    public static synchronized Land getLand(String usage) {
        System.out.println("======== 使用惰性初始 Lazy Initialization 模式 ========");
        if(!_usages.containsKey(usage)){
            System.out.println("usage:"+usage+"在土地用途记录表中不存在时，才进行初始化，即：使用惰性初始");
            _usages.put(usage,new LargeField(usage));
        }
        else{
            System.out.println("usage:"+usage+"在土地用途记录表中存在，不进行进行初始化，直接返回");
        }
        return (Land)_usages.get(usage);
    }

    @Override
    protected void registerLand(Land land) {
        _usages.put( ((LargeField)land).getUsage() ,land);
    }

    /**
     * Gets usages.
     * 获取土地用途记录表
     *
     * @return the usages
     */
    public Map getUsages() {
        return _usages;
    }
}
