package Paddocks;

public class Food {

    private String diet;
    private FoodType foodtype;


    public Food(String diet, FoodType foodtype){
        this.diet = diet;
        this.foodtype = foodtype;
    }

    public String getDiet(){ return this.diet;}

    public String getPrey(){ return this.foodtype.getPrey(); }

    public int getEnergy(){ return this.foodtype.getEnergy(); }


}
