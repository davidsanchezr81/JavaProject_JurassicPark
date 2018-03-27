package Dinosaurs;

public enum CarnSubType {

        BIG("Great Beasts"),
        SMALL("Wee Critters");


        private String name;

        CarnSubType(String name){
            this.name = name; }

        public String getName(){ return this.name; }
}
