package Item;

import Item.Items;

public class NullItem extends Items {
	
	@Override
    public String getName() {
        System.out.println("No available item, check your input in getItem().");
        return "";
    }

    @Override
    public int getCount() {
        System.out.println("No available item, check your input in getItem().");
        return 0;
    }
}

