package org.example.main_exercise.toy_shop;

import org.example.main_exercise.toy_shop.controller.Controller;
import org.example.main_exercise.toy_shop.model.Model;
import org.example.main_exercise.toy_shop.view.View;

import java.io.IOException;
import java.util.Scanner;
public class App {
    public static void ButtonClick() throws IOException {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        Toy toy1  = new Toy(1,"car",3,3);
        Toy toy2 = new Toy(2,"bear",5,5);
        Toy toy3 = new Toy(3,"plane",4,2);
        Toy toy4  = new Toy(4,"tank",3,4);
        Toy toy5 = new Toy(5,"ship",6,1);
        Toy toy6 = new Toy(6,"bird",7,6);
        Toy toy7  = new Toy(7,"shark",4,4);
        Toy toy8 = new Toy(8,"ball",8,1);
        Toy toy9 = new Toy(9,"hippo",6,6);
        model.addToyToStore(toy1);
        model.addToyToStore(toy2);
        model.addToyToStore(toy3);
        model.addToyToStore(toy4);
        model.addToyToStore(toy5);
        model.addToyToStore(toy6);
        model.addToyToStore(toy7);
        model.addToyToStore(toy8);
        model.addToyToStore(toy9);
        System.out.println("Welcome to the Toy shop! ");
        System.out.println("Press next buttons in order to :");
        System.out.println("1 - show whole toy list"+" 2 - form prize list"+" 3 - show prize list"+" 4 - issue prize"+ " 5 - close app");
        Scanner in = new Scanner(System.in);

        boolean flag = true;
        while (flag){
            String inputCommand = in.next();
            switch (inputCommand){
                case ("1"):
                    System.out.println("This is the whole toy list");
                    controller.update();
                    break;
                case ("2"):
                    System.out.println("The toy list has formed successfully");
                    model.addToysToPrizes(model.getToystore());
                    break;
                case("3"):
                    System.out.println("This is the prize list");
                    view.printPrizeToys(model.getPrizesFromStore());
                    break;
                case ("4"):
                    model.deleteToy();
                    break;
                case ("5"):
                    model.closeFile();
                    flag = false;
                    break;
            }
        }
    }
}
