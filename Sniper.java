import java.io.*;
import java.util.*;
 
public class Sniper extends Job{
    // -weapon1 Sniper AWM
    // -weapon2 Glock G43X
    /* Status
        -HP 300
        -SP 200
        -Armor 200
        -Sniper AWM ATK 200
        -Glock  ATK 75
    */
    private int SniperAWM ; // weapon1
    private int GlockG43X; // weapon2
    private int HeadShot ; // Skill Ultimate SniperAWP

    public Sniper(){
        SniperAWM = 200 ; // 1 shot = 200 ATK
        GlockG43X = 75 ; // hit 
        HeadShot = 400 ; // 1 shot = 400 ATK , 
    }
    public void setShotBombs(){
        HeadShot += HeadShot ;
    }
    public int getShotBombs(){
        return HeadShot ;
    }

    public void setM4A16(){
        SniperAWM = SniperAWM + statusATK ;
    }
    public int getM4A16(){
        return SniperAWM ;
    }
  
    

}
