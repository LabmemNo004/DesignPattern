package DeFactory;

import Land.Land;
import Land.LargeField;

import java.util.ArrayList;
import java.util.List;

/**
 * The Large field factory.
 * 大片土地工厂
 *
 * @className: LargeFieldFactory
 * @description:
 * @designPattern:
 */
public class LargeFieldFactory extends DeFactory{
    private List _usages = new ArrayList();     // 土地用途记录表，统计注册土地的用途

    public LargeFieldFactory() {
        System.out.println("======== 使用工厂 Factory 模式 ========");
        System.out.println("成功创建大片土地工厂");
    }

    @Override
    protected Land createLand(String usage) {
        return new LargeField(usage);
    }

    @Override
    protected void registerLand(Land land) {
        _usages.add( ((LargeField)land).getUsage() );
    }

    /**
     * Gets usages.
     * 获取土地用途记录表
     *
     * @return the usages
     */
    public List getUsages() {
        return _usages;
    }
}
