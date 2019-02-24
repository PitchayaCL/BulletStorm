import java.io.*;
import java.util.Scanner;

public class Item {
    String itemDrop;

   
    public Item initialItem(int getItem) {
        Item item = new Item();
        if (getItem == 0){
            item.itemDrop = "Hp Potion";
            
        }
        else if (getItem == 1){
            item.itemDrop = "Sp Potion";
            
        }
        else if (getItem == 2){
            item.itemDrop = "Glock G43X";
            
        }
        else if (getItem == 3){
            item.itemDrop = "Sniper AWM";
            
        }
        else if (getItem == 4){
            item.itemDrop = "M4A16";
            
        }
        else if (getItem == 5){
            item.itemDrop = "Armor";
            
        }
        return item;

       
    }
    public void print(){
        System.out.println(itemDrop);

    }


}