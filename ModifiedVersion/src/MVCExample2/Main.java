package MVCExample2;


import MVCExample2.StudentView.StudentView;
import MVCExample2.StudentController.StudentController;
import MVCExample2.StudentModel.StudentModel;
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
        // Create a new StudentModel instance
        StudentModel student = new StudentModel("Areeba khan", 20, "fa22-bse-008");

        // Create a StudentView instance
        StudentView view = new StudentView();

        // Create a StudentController instance and link model and view
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Modify student details through the controller
        System.out.println("\nUpdating student details...");
        controller.setStudentName("Aiman Shabbir");
        controller.setStudentAge(22);
        controller.setStudentRollNumber("fa22-bse-104");

        // Display updated student details
        controller.updateView();
    }
}

