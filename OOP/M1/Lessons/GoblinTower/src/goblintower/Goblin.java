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
public class Goblin {

    private static Random r = new Random();
    private int maxHP;
    private int currentHP;
    private boolean isDead;

    public Goblin() {
        this.maxHP = r.nextInt(20 - 1) + 1;
        this.currentHP = maxHP;

    }

    public void setCurrentHP(int currentHP) {
        if (currentHP <= 0) {
            this.isDead = true;
            this.currentHP = 0;
        } else if (currentHP > maxHP) {
            this.currentHP = maxHP;
        } else {
            this.currentHP = currentHP;
        }
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public boolean IsDead() {
        return isDead;
    }

    public void TakeDamage(int dmg) {
        int currentHealth = this.currentHP - dmg;
        this.setCurrentHP(currentHealth);
    }

}
