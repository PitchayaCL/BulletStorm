import java.io.*;
import java.util.*;
 
public class ItemHP extends Item {
    public void ItemHP(){
        System.out.println("Healing HP 50");
        
    }
    public void print() {
        super.print();
        System.out.println("Healing HP 50");
    }
}