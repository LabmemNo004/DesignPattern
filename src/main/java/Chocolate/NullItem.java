package Chocolate;

public class NullItem extends Items{
	
	@Override
    public String getName() {
        System.out.printf("No available chocolate currently.");
        return "";
    }

    @Override
    public int getCount() {
        System.out.println("No available chocolate currently.");
        return 0;
    }
}

