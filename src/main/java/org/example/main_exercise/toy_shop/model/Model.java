package org.example.main_exercise.toy_shop.model;

import org.example.main_exercise.toy_shop.Toy;
import org.example.main_exercise.toy_shop.ToyStore;
import org.example.main_exercise.toy_shop.view.Prizelist;

import java.io.*;
import java.util.*;



public class Model {
    Prizelist prizelist = new Prizelist();
    ToyStore toyStore = new ToyStore();
    public Model() throws IOException {
    }
    public ToyStore addToyToStore(Toy toy) {
        toyStore.addToy(toy);
        return toyStore;
    }

    public void changeWeight(Toy toy) {
        System.out.println("enter new weight value: ");
        double numA = scanner.nextDouble();
        toy.setWeight(numA);
        toy.setFreqOfGetting();
    }

    Scanner scanner = new Scanner(System.in);

    public Toy getToyFromToys() {
        System.out.println("enter index of toy where you want to change weight: ");
        return toyStore.getToys().get(scanner.nextInt());
    }

    @Override
    public String toString() {
        return toyStore + "";
    }

    public ToyStore getToystore() {
        return this.toyStore;
    }
    private void setOneQuantity(Prizelist prizelist) {
        for (int i = 0; i < prizelist.getPrizes().size(); i++) {
            prizelist.getPrizes().get(i).setQuantity(1);
        }
    }
    FileWriter file = new FileWriter("extradition1.txt");
    public void deleteToy() throws IOException {
        String nameToy = prizelist.getPrizes().get(0).getName();
        int idToy = prizelist.getPrizes().get(0).getId();
        file.append(prizelist.getPrizes().get(0).toString()+"\n");

        System.out.println("ok");
        prizelist.getPrizes().remove(0);
        if (!prizelist.getPrizes().isEmpty()) {
            System.out.println("Issuing toy: id = " + idToy + " name = " + nameToy);

        } else {
            System.out.println("Last toy: id = " + idToy + " name = " + nameToy);
            System.out.println("All toys are issued");
        }
    }
    public void closeFile(){
        try {
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addToysToPrizes(ToyStore toyStore) {
        int[] ints = new Random().ints(1, toyStore.getToys().size()).distinct().limit(3).distinct().toArray();
        while (prizelist.getPrizes().size() < 3) {
            for (int i = 0; i < toyStore.getToys().size(); i++) {
                for (int item : ints) {
                    if (toyStore.getToys().get(i).getId() == item) {
                        toyStore.getToys().get(i).setQuantity(toyStore.getToys().get(i).getQuantity() - 1);
                        Toy toy1 = toyStore.getToys().get(i);
                        Toy toy2 = new Toy(toy1.getId(), toy1.getName(), 1, toy1.getWeight());
                        prizelist.addPrizeToy(toy2);
                    }
                }
            }


        }
    }
    public Prizelist getPrizesFromStore() {
        return prizelist;
    }
    public void issueToyToPerson() {
        System.out.println("Enter toy name that you want to issue: ");
        for (int i = 0; i < prizelist.getPrizes().size(); i++) {
            if (prizelist.getPrizes().get(i).getName().equals(scanner.next())) {
                prizelist.getPrizes().remove(i);
            }
        }
    }
}