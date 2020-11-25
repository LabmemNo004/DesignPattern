package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;

import Chocolate.Chocolate;

public class SmashArea{

    public List<Chocolate> smash() {
		List<Chocolate> chocolates = new ArrayList<>();
		for(int i=0;i<10;i++){//假设每一个系统时间产生10个巧克力
			System.out.println("制造了一份巧克力粉末");
			chocolates.add(new Chocolate());
		}
		return chocolates;
	}
}
