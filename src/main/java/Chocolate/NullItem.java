package Chocolate;

public class NullItem extends Items{
	
	@Override
    public String getName() {
        System.out.println("No available item, check your input.");
        return "";
    }

    @Override
    public int getCount() {
        System.out.println("No available item, check your input.");
        return 0;
    }
}

