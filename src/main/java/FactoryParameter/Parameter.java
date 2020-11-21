package FactoryParameter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

/*公共类：工厂参数类*/
public class Parameter implements Serializable{
	public static double whiteMeterialPrice;//白巧克力原材料价格
	public static double blackMeterialPrice;//黑巧克力原材料价格
	public static String SERVICE_DISPLAY_CHOCOLATE;
	public static String SERVICE_DISPLAY_WORKERS;
	public static Map<String,Double> chocolatePrice;//黑/白/大/中/小/圆/方巧克力价格
	public static Set<String> size;//大/中/小
	public static Set<String> shape;//圆/方
	public static Set<String> color;//黑/白
	public static double quality=0.2;//质量高的巧克力价格*=（1+quality）
	public static int powerState=11;
	public static int liquidState=12;
	public static int producedState=2;
	public static int decoratedState=3;
	public static int soldState=4;


	public final static double VALUE_WHITE_MATERIAL = 6.0;
	public final static double VALUE_BLACK_MATERIAL = 3.0;

	public final static double QUALITY = 0.2;
	//巧克力产品的价值
	public final static double VALUE_BIG_SPHERICAL_BLACK = 15.0;
	public final static double VALUE_BIG_SQUARE_BLACK = 15.0;
	public final static double VALUE_BIG_STAR_BLACK = 20.0;
	public final static double VALUE_BIG_HEART_BLACK = 20.0;

	public final static double VALUE_MIDDLE_SPHERICAL_BLACK = 10.0;
	public final static double VALUE_MIDDLE_SQUARE_BLACK = 10.0;
	public final static double VALUE_MIDDLE_STAR_BLACK = 15.0;
	public final static double VALUE_MIDDLE_HEART_BLACK = 15.0;

	public final static double VALUE_SMALL_SPHERICAL_BLACK = 5.0;
	public final static double VALUE_SMALL_SQUARE_BLACK = 5.0;
	public final static double VALUE_SMALL_STAR_BLACK = 10.0;
	public final static double VALUE_SMALL_HEART_BLACK = 10.0;

	public final static double VALUE_BIG_SPHERICAL_WHITE = 25.0;
	public final static double VALUE_BIG_SQUARE_WHITE = 25.0;
	public final static double VALUE_BIG_STAR_WHITE = 30.0;
	public final static double VALUE_BIG_HEART_WHITE = 30.0;

	public final static double VALUE_MIDDLE_SPHERICAL_WHITE = 20.0;
	public final static double VALUE_MIDDLE_SQUARE_WHITE = 20.0;
	public final static double VALUE_MIDDLE_STAR_WHITE = 25.0;
	public final static double VALUE_MIDDLE_HEART_WHITE = 25.0;

	public final static double VALUE_SMALL_SPHERICAL_WHITE = 15.0;
	public final static double VALUE_SMALL_SQUARE_WHITE = 15.0;
	public final static double VALUE_SMALL_STAR_WHITE = 20.0;
	public final static double VALUE_SMALL_HEART_WHITE = 20.0;

	public Parameter(){
		whiteMeterialPrice=6;
		blackMeterialPrice=3;
		SERVICE_DISPLAY_CHOCOLATE= "DisplayChocolate";
		SERVICE_DISPLAY_WORKERS="DisplayWorkers";

		size=new HashSet<String>(){{
			add("big");
			add("middle");
			add("small");
		}};
		shape=new HashSet<String>(){{
			add("spherical");
			add("square");
			add("star");
			add("heart");
		}};
		color=new HashSet<String>(){{
			add("black");
			add("white");
		}};
		quality=0.2;
	}
}