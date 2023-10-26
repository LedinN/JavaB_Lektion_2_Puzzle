package com.nick.demo.Modules;

public class Adder {
    public void itemAdder(String item){
        ShoppingList.shoppingList.add(item);
        System.out.println("You added: "+item+" to the list!");
    }

}
