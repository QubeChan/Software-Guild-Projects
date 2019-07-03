/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentquizgrades.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import studentquizgrades.view.UserIOImp;

/**
 *
 * @author Qube
 */
public class Controller {

    private String name;
    private int userInput,
            grade;
    private UserIOImp userIO = new UserIOImp();
    private Map<String, List> scores = new HashMap();

    public void run() {

        userInput = Integer.parseInt(userIO.readString("1) View List Of Students\n"
                + "2) Add Student\n"
                + "3) Remove Student\n"
                + "4) View Quiz Scores Of A Student\n"
                + "5) View Average Score Of A Student\n"
                + "6) Exit\n"));

        switch (userInput) {
            case 1:
                viewStudents();
                run();
                break;
            case 2:
                addStudent();
                run();
                break;
            case 3:
                removeStudent();
                run();
                break;
            case 4:
                viewStudentQuizScores();
                run();
                break;
            case 5:
                viewStudentAverage();
                run();
                break;
            case 6:
                exitProgram();
                break;
        }
    }

    public void viewStudents() {
        Set<String> students = scores.keySet();
        for (String student : students) {
            userIO.print(student);
        }
    }

    public void addStudent() {
        List<Integer> grades = new ArrayList<>();
        String choice = "y";
        name = userIO.readString("What's the student's name you'd like to add?");
        while (choice.equals("y")) {
            grade = userIO.readInt("Input grade");
            grades.add(grade);
            choice = userIO.readString("Input quiz score? (y/n)");
        }
        scores.put(name, (ArrayList) grades);
        userIO.print(name + " has been added");
    }

    public void removeStudent() {
        name = userIO.readString("What's the student's name you'd like to remove?");
        scores.remove(name);
        userIO.print(name + " has been removed");
    }

    public void viewStudentQuizScores() {
        List<Integer> grades = new ArrayList<>();
        name = userIO.readString("Which student quiz scores did you want to view?");
        grades = scores.get(name);
        userIO.print("grades for " + name + " is:");
        for (Integer score : grades) {
            userIO.print("" + score);
        }
    }

    public void viewStudentAverage() {
        int sum = 0,
                average;
        List<Integer> grades = new ArrayList<>();
        name = userIO.readString("Which student average did you want to view?");
        grades = scores.get(name);
        for (Integer score : grades) {
            sum += score;
        }
        average = sum / grades.size();
        userIO.print("Average for " + name + " is: " + average);
    }

    public void exitProgram() {
        userIO.print("Thanks for using my application!");
    }

}
