package Item;

import Item.Items;

public class NullItem extends Items {
	
	@Override
    public String getName() {
        System.out.println("不存在对应的Item, 请检查getItem()中的输入.");
        return "";
    }

    @Override
    public int getCount() {
        System.out.println("不存在对应的Item, 请检查getItem()中的输入.");
        return 0;
    }
}

