/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblintower;

import java.util.Random;

/**
 *
 * @author Qube
 */
public class Hero {

    private static Random r = new Random();
    private String name;
    private int lvl;
    private int maxHP;
    private int currentHP;
    private int[] potions;

    public Hero(String name) {

        this.name = name;
        this.maxHP = 100;
        this.currentHP = 100;
        this.lvl = 1;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        if (currentHP > maxHP) {
            this.currentHP = maxHP;
        } else if (currentHP < 0) {
            this.currentHP = 0;
        } else {
            this.currentHP = currentHP;
        }
    }

    public void hit(Goblin target) {
        int dmg = 2;
        target.takeDamage(dmg);
    }
}
