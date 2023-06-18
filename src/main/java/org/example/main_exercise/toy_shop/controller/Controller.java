package org.example.main_exercise.toy_shop.controller;

import org.example.main_exercise.toy_shop.ToyStore;
import org.example.main_exercise.toy_shop.model.Model;
import org.example.main_exercise.toy_shop.view.View;

import java.io.IOException;
public class Controller {
    Model model = new Model();
    View view = new View();
    ToyStore toyStore = new ToyStore();
    public Controller(Model model, View view) throws IOException {
        this.model = model;
        this.view = view;
    }
    public void update(){
        System.out.println(model);
    }
}
