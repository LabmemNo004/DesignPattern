/*公共类：工厂参数类*/
public class FactoryParameter implements Serializable{
	public static double whiteMeterialPrice;//白巧克力原材料价格
	public static double blackMeterialPrice;//黑巧克力原材料价格
	public static map<string,double> chocolatePrice;//黑/白/大/中/小/圆/方巧克力价格
	public set<string> size;//大/中/小
	public set<string> shape;//圆/方
	public set<string> color;//黑/白
	public double quality=0.2;//质量高的巧克力价格*=（1+quality）

	public init_Parameter(){
		whiteMeterialPrice=20;
		blackMeterialPrice=10;
		chocolatePrice=new HashMap<String,Double>(){{
			put("black",20);
			put("white",20);
			put("big",20);
			put("middle",20);
			put("small",20);
			put("round",20);
			put("square",20);
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
		}}
		quality=0.2;
	}
}