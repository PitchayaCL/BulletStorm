import java.io.*;
import java.util.*;

public class Bag {
    ArrayList<Item> items;

    public Bag(){
        items = new ArrayList<Item>();
        for (int i=0; i<10; i++){
            items.add(new Item().initialItem(0));
        }
        for (int i=0; i<10; i++){
            items.add(new Item().initialItem(1));
        }
    }
    

    public void getItem(){
        int randomm = (int)(Math.random() * 6);
        items.add(new Item().initialItem(randomm));
        
    }

	public void showBag() {
		for(int i = 0; i < items.size(); i++){
            System.out.println(i +". "+items.get(i).itemDrop);
        }
    }
    
    public int useItemHP(int index) {
        String used = new String();
        int heal = 0;
        if(index <= items.size()){
           used = items.get(index).itemDrop;
           if(used.equals("Hp Potion")){
           items.remove(index);
           System.out.println(used + " has used");
           return 50;
           }
           
           System.out.println(used + " has used");
    }
    return heal;
    }
    public int useItemSP(int index) {
        String used = new String();
        int heal = 0;
        if(index <= items.size()){
           used = items.get(index).itemDrop;
           if(used.equals("Sp Potion")){
           items.remove(index);
           System.out.println(used + " has used");
           return 50;
           }
           
           System.out.println(used + " has used");
    }
    return heal;
    }
}