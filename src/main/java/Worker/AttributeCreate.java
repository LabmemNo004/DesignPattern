package Worker;

import java.util.Random;

public class AttributeCreate {
    private Attribute _attribute;

    private   String getName(int len)
    {
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";//含有字符和数字的字符串
        Random random = new Random();//随机类初始化
        StringBuffer sb = new StringBuffer();//StringBuffer类生成，为了拼接字符串

        for (int i = 0; i < len; ++i) {
            int number = random.nextInt(62);// [0,62)
 
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
    private   String getSex()
    {
        String str="男女";//含有字符和数字的字符串
        Random random = new Random();//随机类初始化
        StringBuffer sb = new StringBuffer();//StringBuffer类生成，为了拼接字符串


            int number = random.nextInt(2);// [0,62)

            sb.append(str.charAt(number));

        return sb.toString();
    }
    private String getBirthYear()
    {
        Random random = new Random();//随机类初始化
        return String.valueOf(random.nextInt(40)+1960);
    }
    private double getSalary()
    {
        Random random = new Random();
        return random.nextDouble()*1000+3000;
    }





    public Attribute randomAttribute()
    {
        _attribute=new Attribute(getName(10),getBirthYear(),getSex(),getSalary());
        return _attribute;
    }




}
