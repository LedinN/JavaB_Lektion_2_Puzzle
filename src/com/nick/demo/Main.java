package com.nick.demo;

import com.nick.demo.Modules.Adder;
import com.nick.demo.Modules.Lister;
import com.nick.demo.Modules.Remover;
import com.nick.demo.Modules.ShoppingList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("[1] List items.\n[2] Add item.\n[3] Clear list.\n[4] Exit program.");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Lister lister = new Lister();
                    lister.itemLister();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("What item do you want to add?");
                    String item = sc.nextLine();
                    Adder bla = new Adder();
                    bla.itemAdder(item);
                    break;
                case 3:
                    Remover remover = new Remover();
                    remover.listRemover();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("You messed up!");
                    break;

            }

        }
    }
}
