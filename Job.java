import java.io.*;
import java.util.*;


public class Job {

    protected String status;
    protected int statusHP;
    protected int statusATK;
    

    public Job(){
        statusHP = 50 ;
        statusATK = 75;
        status = "Novice";
    }

    public int getstatusHP(){
        return statusHP;
    }

    public int getstatusATK(){
        return statusATK;
    }
    
    public String getstatus(){
        
        return status;

    }


}