package org.example.main_exercise.toy_shop;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    @Override
    public String toString() {
        return toys +"";
    }
    private Toy toy;
    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }
    List<Toy> toys = new ArrayList<>();
    public void addToy(Toy toy){
        toys.add(toy);
    }
    public List<Toy> getToys() {
        return toys;
    }
}
