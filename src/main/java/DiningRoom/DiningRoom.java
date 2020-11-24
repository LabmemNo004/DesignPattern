package DiningRoom;

public class DiningRoom {
    private int food_remained;
    private int threshold;

    public DiningRoom()
    {
        food_remained=0;
        threshold=10;
    }

    public void addFoodAmount(int food_add_amount)
    {
        food_remained+=food_add_amount;
    }

    public int getFoodAmount()
    {
        return food_remained;
    }

    public void removeFoodAmount(int food_add_amount){ food_remained-=food_add_amount; }

    public boolean foodIsEnough()
    {
        if(food_remained>=threshold)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
