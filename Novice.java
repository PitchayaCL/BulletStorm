import java.io.*;
import java.util.Scanner;

public class Novice {
    /**
     *
     */

    private static final int _0 = 0;
    public String name;
    public int HP;
    public int MaxHP;
    public int SP;
    public int MaxSP;
    public int Exp;
    public int MaxExp;
    public int Level;
    public int MaxLevel;
    public Bag bag;

    public Novice(String _name) {
        bag = new Bag();
        this.HP = 150;
        this.MaxHP = 1000;
        this.SP = 150;
        this.MaxSP = 750;
        this.Exp = 0;
        this.MaxExp = 1000;
        this.Level = 1;
        this.MaxLevel = 99;
        this.name = _name;
    } 
    public int Kill_Monter() {
        Exp = Exp + 200;
        if (Exp >= MaxExp) {
            
            this.LevelUp();
        }
        else if (Level == MaxLevel){
            System.out.println("MAX LEVEL");
        }
        bag.getItem();
        System.out.println("You get " + bag.items.get(bag.items.size() - 1).itemDrop);
        return Level;

    }

    public int LevelUp() {
        Level = Level + 1;
        System.out.println("+ 250");
        System.out.println("ATK 50");
        
        return Level;

    }


    public void Up_HP() {
        for(int i = 0; i < bag.items.size(); i++){
            if(bag.items.get(i).itemDrop.equals("HP_Potion")){
                if (HP != 0) {
                    HP = HP + 50;
                    System.out.println("+ 50");
                }
            }
        }
    }

    public int Down_HP() {
        if (HP <= 0) {
            HP = 0;
            System.out.println("!!! YOU DAED !!!");
        } else if (HP > 0) {
            HP = HP - 25;
        }
        return HP;
    }

    public void Up_SP() {
        if (SP != 0) {
            SP = SP + 50;
            System.out.println("+ 50");
        }
        
    }

    public int Down_SP() {
        if (SP <= 0) {
            SP = 0;
            System.out.println("!!! DON'T SP !!!");
        } else if (HP > 0) {
            SP = SP - 25;
        }
        return SP;
    }

   

    public int HP_Potion(int i) {
        if (HP < MaxHP) {
            Up_HP();
            HP+=bag.useItemHP(i);
        } 
        else if (HP == MaxHP) {
            System.out.println("FULL HP");
        }
        return HP;
    }


    public int SP_Potion(int i) {
        if (SP < MaxSP) {
            Up_SP();
            SP+=bag.useItemSP(i);
        } 
        else if (SP == MaxSP) {
            System.out.println("FULL SP");
        }
        return SP;
    }

    
}

