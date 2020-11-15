import java.util.*;

class GameCharacter
{
    Scanner inputUser = new Scanner(System.in);
    String name;
    int lifepoint, totalhit, totalkick, attackHitPoint, attackKickPoint, pukulan, tendangan, totalpointRaiden, totalpointSubzero; 
    GameCharacter()
    {
        System.out.println("-----RONDE 1-----");
        attackKickPoint(1, 20, 100);
        System.out.println("Lifepoint sementara Subzero : " + totalkick);
        attackKickPoint(1, 25, 100);
        System.out.println("Lifepoint sementara Raiden : " + totalkick + "\n");

        System.out.println("-----RONDE 2-----");
        attackHitPoint(3, 5, 75);
        System.out.println("Lifepoint Sementara Raiden = " + totalhit);
        attackKickPoint(4, 20, 80);
        System.out.println("Lifepoint Sementara Subzero = " + totalkick + "\n");

        if (totalkick == 0 || totalhit == 0)
        {
            System.out.println("---GAME SELESAI---");
            totalpointRaiden = totalhit;
            System.out.println("Lifepoint Akhir Raiden : " + totalpointRaiden);
            totalpointSubzero = totalkick;
            System.out.println("Lifepoint Akhir Subzero: " + totalpointSubzero + "\n");
        }

        // penentuan
        if (totalpointRaiden == totalpointSubzero)
        {
            System.out.println("SERI");
        }
        else if (totalpointSubzero >= totalpointRaiden)
        {
            System.out.println("SUBZERO MENANG");
        }
        else
        {
            System.out.println("RAIDEN MENANG");
        }

    }

    public void attackKickPoint(int tendangan,int attackKickPoint, int lifepoint)
    {
        for(int i = 1; i <= tendangan; i++)
        {
            totalkick = lifepoint - (attackKickPoint*tendangan);
        }  
    }

    public void attackHitPoint(int pukulan, int attackHitPoint, int lifepoint)
    {
        for(int i = 1; i <= pukulan; i++)
        {
            totalhit = lifepoint - (attackHitPoint*pukulan);
        } 
    }
    
    public int getlifePoint() 
    {
        return lifepoint;
    }

    public String getName() {
        return name;
    }
}
public class Tugas_GameCharacter
{
    public static void main(String[] args)
    {
        GameCharacter obj = new GameCharacter();
    }
}