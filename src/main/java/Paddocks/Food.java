package Paddocks;

public class Food {
    
    private FoodType foodtype;


    public Food(FoodType foodtype){
        this.foodtype = foodtype;
    }


    public String getPrey(){ return this.foodtype.getPrey(); }

    public int getEnergy(){ return this.foodtype.getEnergy(); }


}
