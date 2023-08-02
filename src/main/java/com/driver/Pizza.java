package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int CheesePrice;

    private int ToppingsPrice;

    private int PaperBagPrice;

    private Boolean isCheeseAdded;

    private Boolean isToppingsAdded;

    private Boolean isPaperBagAdded;

    private Boolean isBillGenerated;

    public int totalCost;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg == true) {
            this.price = 300;
            this.ToppingsPrice = 70;
        }
        else {
            this.price = 400;
            this.ToppingsPrice = 120;
        }
        this.CheesePrice = 80;
        this.PaperBagPrice = 20;
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isPaperBagAdded = false;
        this.isBillGenerated = false;
        this.totalCost = this.price;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false) {
            totalCost += CheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false)
        {
            totalCost += ToppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false)
        {
            totalCost+= PaperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false)
        {
            if(isCheeseAdded == true)
                this.bill += "Extra Cheese Added: " + CheesePrice + "\n";

            if(isToppingsAdded == true)
                this.bill += "Extra Toppings Added: " + ToppingsPrice + "\n";

            if(isPaperBagAdded == true)
                this.bill += "Paperbag Added: " + PaperBagPrice + "\n";

            this.bill += "Total Price: " + totalCost;
            isBillGenerated = true;
        }
        return this.bill;

    }
}
