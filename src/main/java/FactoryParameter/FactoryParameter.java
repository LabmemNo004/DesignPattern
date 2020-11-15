package FactoryParameter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*公共类：工厂参数类*/
public class FactoryParameter implements Serializable{
	public static double whiteMeterialPrice;//白巧克力原材料价格
	public static double blackMeterialPrice;//黑巧克力原材料价格
	public static String SERVICE_DISPLAY_CHOCOLATE;
	public static Map<String,Double> chocolatePrice;//黑/白/大/中/小/圆/方巧克力价格
	public Set<String> size;//大/中/小
	public Set<String> shape;//圆/方
	public Set<String> color;//黑/白
	public double quality=0.2;//质量高的巧克力价格*=（1+quality）

	public FactoryParameter(){
		whiteMeterialPrice=20;
		blackMeterialPrice=10;
		SERVICE_DISPLAY_CHOCOLATE= "DisplayChocolate";
		chocolatePrice=new HashMap<String,Double>(){{
			put("black",20.0);
			put("white",20.0);
			put("big",20.0);
			put("middle",20.0);
			put("small",20.0);
			put("round",20.0);
			put("square",20.0);
		}};
		size=new HashSet<String>(){{
			add("big");
			add("middle");
			add("small");
		}};
		shape=new HashSet<String>(){{
			add("round");
			add("square");
		}};
		color=new HashSet<String>(){{
			add("black");
			add("white");
		}};
		quality=0.2;
	}
}