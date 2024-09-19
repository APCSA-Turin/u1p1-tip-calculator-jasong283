package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                       
        double totalTip = (cost * ((double) percent / 100));
        double beforeTip = (cost / people);
        double tipPerPerson = (totalTip / people);
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + (totalTip));
        result.append("Total Bill with tip: $" + (cost + totalTip) + "\n");
        result.append("Per person cost before tip: $" + (beforeTip) + "\n");
        result.append("Tip per person: $" + (tipPerPerson) + "\n");
        result.append("Total cost per person: $" + (beforeTip + tipPerPerson) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;             
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
