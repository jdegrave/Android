package com.slipstreamcommunications.seedsthatfeed;

import java.lang.*;
/**
 * Custom class that holds the array of Produce categories:
 * - Fruit
 * - Vegetables
 *
 * @author Jodi A DeGrave
 * @version 1.0.0
 * @params (none)
 * @see ProduceCategoryActivity
 */
public class ProduceCategory {
    private String ProduceType;

    public static final ProduceCategory[] availProduceCategories = {
            new ProduceCategory("Fruit"),
            new ProduceCategory("Vegetable"),
    };

    //Produce Category constructor
    private ProduceCategory(String ProduceType){
        this.ProduceType = ProduceType;
    }

    //Getters
    public String getProduceType(){
        return ProduceType;
    }

    //This is what is displayed in the ProduceCategoryActivity - i.e., "Fruit" and "Vegetable"
    public String toString(){
        return this.ProduceType;
    }
}   // end class
