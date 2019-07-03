/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroster.view;

import classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Qube
 */
public class ClassRosterView {

    private UserIO io;

    public ClassRosterView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu\n"
                + "1. List Student IDs\n"
                + "2. Create New Student\n"
                + "3. View a Student\n"
                + "4. Remove a Student\n"
                + "5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }

    public void displayCreateStudentBanner() {
        io.print("== Create Student ==");
    }

    public Student getNewStudentInfo() {
        String studentId = io.readString("Please enter student ID"),
                firstName = io.readString("Please enter first name"),
                lastName = io.readString("Please enter last name"),
                cohort = io.readString("Please enter cohort");
        Student currentStudent = new Student(studentId);
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        return currentStudent;
    }

    public void displayCreateSuccessBanner() {
        io.readString("Student successfully created. Please hit enter to continue");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All Students ===");
    }

    public void displayStudentList(List<Student> studentList) {
        for (Student currentStudent : studentList) {
            io.print(currentStudent.getStudentId() + ": "
                    + currentStudent.getFirstName() + " "
                    + currentStudent.getLastName());
        }
        io.readString("Please hit enter to continue");
    }

    public void displayDisplayStudentBanner() {
        io.print("=== Display Student ===");
    }

    public String getStudentIdChoice() {
        return io.readString("Please enter the student ID");
    }

    public void displayStudent(Student student) {
        if (student != null) {
            io.print(student.getStudentId());
            io.print(student.getFirstName() + " " + student.getLastName());
            io.print(student.getCohort() + "\n");

        } else {
            io.print("No such student");
        }
        io.readString("PLease hit enter to continue");
    }

    public void displayRemoveStudentBanner() {
        io.print("=== Remove Student ===");
    }

    public void displayRemoveSuccessBanner() {
        io.readString("Student successfully removed. Please hit enter to continue");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}
