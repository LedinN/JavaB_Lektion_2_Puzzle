package com.nick.demo.Modules;
public class Lister {

    public void itemLister(){

        for (int i = 0; i < ShoppingList.shoppingList.size(); i++) {

            System.out.println(ShoppingList.shoppingList.get(i));

        }
    }
}
