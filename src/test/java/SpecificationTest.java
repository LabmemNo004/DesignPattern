import Chocolate.Chocolate;
import Mould.Mould;
import Specification.DetailedSpecification.BigSizeSpecification;
import Specification.DetailedSpecification.HighQualitySpecification;
import Specification.Specification;
import org.junit.Test;

public class SpecificationTest {
    @Test
    public void test()
    {
        String[] chocolateTag ={
                "质量为低的大巧克力",
                "质量为低的中巧克力",
                "质量为低的小巧克力",
                "质量为中的大巧克力",
                "质量为中的中巧克力",
                "质量为中的小巧克力",
                "质量为高的大巧克力",
                "质量为高的中巧克力",
                "质量为高的小巧克力"
        };
        Chocolate[] chocolates={new Chocolate(),new Chocolate(),new Chocolate(),new Chocolate(),new Chocolate()
                ,new Chocolate(),new Chocolate(),new Chocolate(),new Chocolate()};
        chocolates[0].setQuality(1);chocolates[0].setSize(Mould.Size.big);
        chocolates[1].setQuality(1);chocolates[0].setSize(Mould.Size.middle);
        chocolates[2].setQuality(1);chocolates[0].setSize(Mould.Size.small);
        chocolates[3].setQuality(2);chocolates[0].setSize(Mould.Size.big);
        chocolates[4].setQuality(2);chocolates[0].setSize(Mould.Size.middle);
        chocolates[5].setQuality(2);chocolates[0].setSize(Mould.Size.small);
        chocolates[6].setQuality(3);chocolates[0].setSize(Mould.Size.big);
        chocolates[7].setQuality(3);chocolates[0].setSize(Mould.Size.middle);
        chocolates[8].setQuality(3);chocolates[0].setSize(Mould.Size.small);

        for(int i=0;i<chocolates.length;i++)
        {
            System.out.println("生成巧克力"+chocolateTag[i]+"@"+chocolates[i].hashCode());
        }

        BigSizeSpecification isBig= new BigSizeSpecification();
        HighQualitySpecification isHighQua=new HighQualitySpecification();
        System.out.println("新建规约类 BigSizeSpecification@"+isBig.hashCode()+" 和HighQualitySpecification@"+isHighQua.hashCode());

        System.out.println("组合得到四个具体规约法则。");
        Specification big_high = isBig.and(isHighQua);
        System.out.println("big_high@"+big_high.hashCode());
        Specification big_not_high = isBig.and(isHighQua.not());
        System.out.println("big_not_high@"+big_not_high.hashCode());
        Specification not_big_high = isBig.not().and(isHighQua);
        System.out.println("not_big_high@"+not_big_high.hashCode());
        Specification not_big_not_high = isBig.not().and(isHighQua.not());
        System.out.println("not_big_not_high@"+not_big_not_high.hashCode());

        System.out.println("开始筛选：");
        System.out.println("1. 使用规约模式big_high筛选质量高的大巧克力。");
        for(int i=0;i<chocolates.length;i++){
            if(big_high.isSatisfiedBy(chocolates[i])){
                System.out.println("筛选出:"+chocolateTag[i]+" @"+chocolates[i].hashCode());
            }
        }
        System.out.println("2. 使用规约模式big_not_high筛选质量高的中小巧克力。");
        for(int i=0;i<chocolates.length;i++){
            if(big_not_high.isSatisfiedBy(chocolates[i])){
                System.out.println("筛选出:"+chocolateTag[i]+" @"+chocolates[i].hashCode());
            }
        }
        System.out.println("3. 使用规约模式not_big_high筛选不饥饿成熟的动物。");
        for(int i=0;i<chocolates.length;i++){
            if(not_big_high.isSatisfiedBy(chocolates[i])){
                System.out.println("筛选出:"+chocolateTag[i]+" @"+chocolates[i].hashCode());
            }
        }
        System.out.println("4. 使用规约模式not_big_not_high筛选不饥饿不成熟的动物。");
        for(int i=0;i<chocolates.length;i++){
            if(not_big_not_high.isSatisfiedBy(chocolates[i])){
                System.out.println("筛选出:"+chocolateTag[i]+" @"+chocolates[i].hashCode());
            }
        }
    }
}
