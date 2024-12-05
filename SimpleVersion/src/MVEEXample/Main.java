package MVEEXample;


import MVEEXample.View2.View;
import MVEEXample.Controller.Controller;
import MVEEXample.Model.Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Initialize Model, View, and Controller
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.setData("Hello, MVC!");

        // Simulate another user input
        controller.updateView();
    }
}

