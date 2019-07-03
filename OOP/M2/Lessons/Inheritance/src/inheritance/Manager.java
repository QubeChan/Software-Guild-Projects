/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Qube
 */
public class Manager extends Employee {

    public void hire() {

    }

    public void fire() {

    }

    public void givePerformanceReview() {

    }

    @Override
    public void createYearObjectives() {
        // we're overriding the version of this method in Employee
        // put new code here...
        super.createYearObjectives(); //To change body of generated methods, choose Tools | Templates.
        // put more new code here...

    }

}
