import java.io.*;
import java.util.*;
 
public class ItemSP extends Item{
    public void ItemSP(){
        System.out.println("Healing SP 50");
    }
    public void print() {
        super.print();
        System.out.println("Healing SP 50");
    }
}