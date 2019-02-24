import java.io.*;
import java.util.*;
 
public class Hunter extends Job{
    // Job Hunter
    // -weapon1 M4A16
    // -weapon2 Glock G43X
    /* Status
        -HP 500
        -SP 500
        -Armor 300
        -M4A16 ATK 100
        -Glock  ATK 75
    */
    private int M4A16; // weapon1
    private int GlockG43X; // weapon1
    private int ShotBombs ; // Skill Ultimate

    public Hunter(){
        ShotBombs = 50 ; // 1 shot = 50 ATK
        GlockG43X = 75 ;
        M4A16 = 100 ; // 10 shot = 100 ATK , 1 shot = 10 ATK
    }
    public void setShotBombs(){
        ShotBombs += ShotBombs ;
    }
    public int getShotBombs(){
        return ShotBombs ;
    }

    public void setM4A16(){
        M4A16 = M4A16 + statusATK ;
    }
    public int getM4A16(){
        return M4A16 ;
    }
}