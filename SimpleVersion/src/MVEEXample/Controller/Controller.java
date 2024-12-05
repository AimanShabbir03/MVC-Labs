package MVEEXample.Controller;


import MVEEXample.View2.View;
import MVEEXample.Model.Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
// Controller.java
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setData(String Data) {
        model.setData(Data);
    }
    public String getData(){
        return model.getData();
    }
    public void updateView(){
        view.printData(model.getData());
    }
}

