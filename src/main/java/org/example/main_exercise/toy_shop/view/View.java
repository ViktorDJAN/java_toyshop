package org.example.main_exercise.toy_shop.view;

import org.example.main_exercise.toy_shop.Toy;
import org.example.main_exercise.toy_shop.ToyStore;

import java.util.Set;

public class View {
    public void printToy(Toy toy){
        System.out.println(toy);
    }
    public void printPrizeToys(Prizelist prizelist){
        System.out.println(prizelist);
    }
    public void printToyStore(ToyStore toyStore){
        System.out.println(toyStore);
    }

}
