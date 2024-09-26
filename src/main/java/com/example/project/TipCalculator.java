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
        result.append("Total tip: $" + Math.round(totalTip * 100) / 100.0 +  "\n");
        result.append("Total Bill with tip: $" + Math.round((cost + totalTip) * 100) / 100.0 + "\n");
        result.append("Per person cost before tip: $" + Math.round(beforeTip * 100) / 100.0 + "\n");
        result.append("Tip per person: $" + Math.round(tipPerPerson * 100) / 100.0 + "\n");
        result.append("Total cost per person: $" + Math.round((beforeTip + tipPerPerson) * 100) / 100.0 + "\n");
        result.append("-------------------------------\n");

        //https://www.w3schools.com/jsref/jsref_round.asp - for Math.round

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
        
