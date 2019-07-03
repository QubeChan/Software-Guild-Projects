/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmodeling;

/**
 *
 * @author Qube
 */
class Cafeteria {
    private int numOfStoves,
            seatingCapacity,
            numofServingLines,
            mealsPerHour;
    private double squareFootage;

    public int getNumOfStoves() {
        return numOfStoves;
    }

    public void setNumOfStoves(int numOfStoves) {
        this.numOfStoves = numOfStoves;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getNumofServingLines() {
        return numofServingLines;
    }

    public void setNumofServingLines(int numofServingLines) {
        this.numofServingLines = numofServingLines;
    }

    public int getMealsPerHour() {
        return mealsPerHour;
    }

    public void setMealsPerHour(int mealsPerHour) {
        this.mealsPerHour = mealsPerHour;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }
    
    
}
