package MVCExample2.StudentController;

import MVCExample2.StudentView.StudentView;
import MVCExample2.StudentModel.StudentModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
// StudentController.java
public class StudentController {
    private StudentModel model;
    private StudentView view;

    // Constructor
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Methods to update model data
    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentAge(int age) {
        model.setAge(age);
    }

    public void setStudentRollNumber(String rollNumber) {
        model.setRollNumber(rollNumber);
    }

    // Methods to retrieve model data
    public String getStudentName() {
        return model.getName();
    }

    public int getStudentAge() {
        return model.getAge();
    }

    public String getStudentRollNumber() {
        return model.getRollNumber();
    }

    // Update view
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getAge(), model.getRollNumber());
    }
}

