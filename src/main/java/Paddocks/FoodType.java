package Paddocks;

public enum FoodType {

        MEATY("Meaty", 5),
        HERBS("Herbs", 2),
        FISHY("Fishy", 3);

        private String prey;
        private int energy;

        FoodType(String prey, int energy){
            this.prey = prey;
            this.energy = energy;
        }

        public String getPrey(){ return this.prey; }

        public int getEnergy(){ return this.energy; }
}
