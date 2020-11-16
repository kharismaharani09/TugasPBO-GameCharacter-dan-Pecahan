class Game_Character
{
    String name;
    int lifepoint = 100;
    int attackHitpoint;
    int attackKickpoint;

    Game_Character(String inputName, int inputAttackHitpoint, int inputAttackKickpoint)
    {
        this.name = inputName;
        this.attackHitpoint = inputAttackHitpoint;
        this.attackKickpoint = inputAttackKickpoint;
        int lifepoint;
    }

    void hit(Game_Character lawan, int inputAttackhitpoint)
    {
        this.attackHitpoint = inputAttackhitpoint;
        System.out.print(this.name + " memukul " + lawan.name + " dengan kekuatan " + inputAttackhitpoint + " maka lifepoint " + lawan.name + " : ");
        
        if(lifepoint >= inputAttackhitpoint)
        {
            lifepoint -= inputAttackhitpoint;
            System.out.println(lifepoint);
        }
        else
        {
            lifepoint = 0;
        }
    }

    void kick(Game_Character lawan, int inputAttackkickpoint)
    {
        this.attackKickpoint = inputAttackkickpoint;
        System.out.print(this.name + " menendang " + lawan.name + " dengan kekuatan " + inputAttackkickpoint + " maka lifepoint " + lawan.name + " : ");
        
        if(lifepoint >= inputAttackkickpoint)
        {
            lifepoint -= inputAttackkickpoint;
            System.out.println(lifepoint);
        }
        else
        {
            lifepoint = 0;
        }
    }

    void selesai(Game_Character lawan)
    {
        if(lifepoint == 0)
        {
            System.out.print("PEMENANG = " + this.name);
        }
    }
    
    int lifepoint()
    {
        return lifepoint;
    }

    String name()
    {
        return name;
    }

}
public class Tugas_GameCharacter{
    public static void main(String[] args) {
        System.out.println("---GAME---");
        System.out.println("Lifepoints Raiden : 100");
        System.out.println("Lifepoints Subzero : 100\n");

        Game_Character Obj1 = new Game_Character("Raiden", 10, 20);
        Game_Character Obj2 = new Game_Character("Subzero", 5, 25);

        System.out.println("---RONDE 1---");
        Obj1.kick(Obj2, 20); 
        Obj2.kick(Obj1, 25); 
        System.out.print("\n");

        System.out.println(("---RONDE 2---"));
        for (int i = 1; i <= 3; i++)
        {
            Obj2.hit(Obj1, 5);
        }
        for (int i = 1; i <= 4; i++)
        {
            Obj1.kick(Obj2, 20);
        }
        System.out.print("\n");

        System.out.println(("---PENENTUAN---"));
        Obj1.selesai(Obj2);
        System.out.println("\n");
    }
}
