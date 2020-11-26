package Area.ProcessChocolateArea;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Chocolate.Chocolate;
import Chocolate.IChocolate;

public class SmashArea implements Serializable {

    public List<IChocolate> smash() {
		List<IChocolate> chocolates = new ArrayList<>();
		for(int i=0;i<10;i++){//假设每一个系统时间产生10个巧克力
			IChocolate chocolate = new Chocolate();
			System.out.println("制造了一份巧克力粉末");
			chocolates.add(chocolate);
		}
		return chocolates;
	}
}
