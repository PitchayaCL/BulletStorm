import java.io.*;
import java.util.Scanner;

public class Novice {
    public String name;
    public int HP;
    public int MaxHP;
    public int SP;
    public int MaxSP;
    public int Exp;
    public int MaxExp;
    public int Armor;
    public int MaxArmor;
    public int Level;
    public int MaxLevel;
    public int ATK;
    public Bag bag;
    public Job job;
    
    public Novice(String _name) {
        bag = new Bag();
        this.HP = 300;
        this.MaxHP = 300;
        this.SP = 300;
        this.MaxSP = 300;
        this.Exp = 0;
        this.MaxExp = 1000;
        this.Armor = 200;
        this.MaxArmor = 200;
        this.Level = 1;
        this.MaxLevel = 99;
        this.name = _name;
        this.ATK = 75;
    } 
    public int ATK(){


        return ATK;

    }

    public int Kill_Monter() {
        Exp = Exp + 200;
        if (Exp >= MaxExp) {
            Exp = Exp - MaxExp;
            MaxHP = MaxHP + (Level * 5);
            MaxSP = MaxSP + (Level * 10);
            MaxExp = MaxExp + 400;
            HP = MaxHP;
            SP = MaxSP;
            this.LevelUp();
        }
        else if (Level == MaxLevel){
            System.out.println("MAX LEVEL");
        }
        bag.getItem();
        System.out.println("    You get " + bag.items.get(bag.items.size() - 1).itemDrop);
        return Level;

    }

    public int LevelUp() {
        Level = Level + 1;
        return Level;
    }

    public void Up_Job() {
        if(Level == 10){
            
        }
        else if(Level <= 10){

        }
    }
    
    // public int disArmor() {
    //     Armor = Armor - 50;
    //     if(Armor >= 0){
    //         Armor = 0;
    //         System.out.println("!!! Broken Armor !!!");
    //      }
    //     else if(Armor <= 50){
    //         System.out.println("!!! Armor Repair !!!");
    //     }

    //     return Armor;

    // }

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
        HP = HP - 50;
        if (0 >= HP) {
            HP = 0;
            System.out.println("!!! YOU DAED !!!");
        }
        else if (50 >= HP){
            System.out.println("!!! Plese Ues HP Potion !!!");

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
        SP = SP - 50;;
        if (0 >= SP) {
            SP = 0;
            System.out.println("!!! Not Enough SP !!!");
        } else if (50 >= SP) {
            System.out.println("!!! Plese Ues SP Potion !!!");
            
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

