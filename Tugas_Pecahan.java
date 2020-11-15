import java.util.*;
class Pecahan
{
    Scanner inputUser = new Scanner(System.in);
    int atas, bawah,  pembilang1, penyebut1, pembilang2, penyebut2;
    Pecahan()
    {
        System.out.println("----PENJUMLAHAN DUA PECAHAN----");
        System.out.print("Pembilang : ");
        pembilang1 = inputUser.nextInt();
        System.out.print("Penyebut : ");
        penyebut1 = inputUser.nextInt();
        System.out.println("Pecahan ke-1 : " + pembilang1 + "/" + penyebut1 + "\n");

        System.out.print("Pembilang : ");
        pembilang2 = inputUser.nextInt();
        System.out.print("Penyebut : ");
        penyebut2 = inputUser.nextInt();
        System.out.println("Pecahan ke-2 : " + pembilang2 + "/" + penyebut2 + "\n" );

        tambah();
    }
    public int getPembilang()
    {
        return atas;
    }

    public int getPenyebut()
    {
        return bawah;
    }

    public void tambah()
    {
        if (penyebut1 == penyebut2)
        {
            atas = pembilang1 + pembilang2;
            bawah = penyebut1;
            System.out.println("Hasil Penjumlahan Pecahan = " + atas + "/" + bawah);
        }
        else
        {
            atas = (penyebut1*pembilang2) + (penyebut2*pembilang1);
            bawah = penyebut1*penyebut2;
            System.out.println("Hasil Penjumlahan Pecahan = " + atas + "/" + bawah);
        }
    }
    public static void main(String[] args) 
    {
        Pecahan obj = new Pecahan();
    }
}