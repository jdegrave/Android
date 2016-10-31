package com.slipstreamcommunications.seedsthatfeed;

/**
 * Custom class that contains the array of fruit objects for display in FruitActivity, and the names
 * of each fruit for selection on ProduceListActivity. Calculates the total fruit quantity, and converts
 * quantity and total fruit values from integers to strings so they can display in the TextView of
 * FruitActivity
 *
 */
public class Fruit {
    private String fruitName;
    private String fruitColor;
    private int fruitQuantity;
    private int imageResourceId;
    private int totalFruit;
    private int fruitArrayLength;



    public static final Fruit[] availFruits = {
            new Fruit("Apples", "Red", 7, R.drawable.apple),
            new Fruit("Grapes", "Green", 5, R.drawable.grapes),
            new Fruit("Bananas", "Yellow", 16, R.drawable.banana),
    };

    //Fruit constructor
    private Fruit(String fruitName, String fruitColor, int fruitQuantity, int imageResourceId){
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.fruitQuantity = fruitQuantity;
        this.imageResourceId = imageResourceId;
    }

    //Getters
    public String getFruitName(){

        return fruitName;
    }

    public String getFruitColor(){
        return fruitColor;
    }

    public String getFruitQuantity(){
        return convertFruitQuantities(fruitQuantity);   //Convert fruitQuantity to String to display
    }

    public int getImageResourceId(){

        return imageResourceId;
    }


    public String getTotalFruit() {
        totalFruit = fruitCalc();                   //calculate total amount of fruit of all types
        return convertFruitQuantities(totalFruit);  //convert the total from an int to a String
    }

    //Calculates the Total Fruit count
    private int fruitCalc(){
        int allFruit = 0;
        for (int i=0; i < availFruits.length; i++){
            allFruit = allFruit + availFruits[i].fruitQuantity;
        }
        return allFruit;
    }

    //TextViews expect a String, not an integer. This function takes an integer and converts it to a String
    //This is necessary for displaying the quantity of each fruit, as well as the Total Fruit count.
    private String convertFruitQuantities(int fruitCount){
        String fruitQuantityAsString;
        fruitQuantityAsString = String.valueOf(fruitCount);
        return fruitQuantityAsString;
    }


    //This is the represenation of a fruit - the fruitName, which is a String. This is what is displayed in the ProductListActivity
    public String toString(){
        return this.fruitName;
    }

 /*   //This returns the array length so that we can display all fruits on one page
    public int getFruitArrayLength(){
        fruitArrayLength = availFruits.length;
        return fruitArrayLength;
    }
*/
} // end class
