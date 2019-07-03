/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblintower.view;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class GoblinTowerView {

    public String getHeroName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your hero name?");
        return input.nextLine();
    }
}
