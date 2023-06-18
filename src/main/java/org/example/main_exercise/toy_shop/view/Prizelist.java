package org.example.main_exercise.toy_shop.view;

import org.example.main_exercise.toy_shop.Toy;

import java.util.ArrayList;
import java.util.List;

public class Prizelist {
    List<Toy>prizes = new ArrayList<>();
    public List<Toy> getPrizes() {
        return prizes;
    }
    public void addPrizeToy(Toy toy){
        prizes.add(toy);
    }
    @Override
    public String toString() {
        return prizes+"";
    }
    public void setPrizes(List<Toy> prizes) {
        this.prizes = prizes;
    }
}
