class Pecahan
{
    int newpembilang, newpenyebut, pembilang, penyebut, pembilang2, penyebut2;
    Pecahan(int inputPembilang, int inputPenyebut)
    {
        this.pembilang = inputPembilang;
        this.penyebut = inputPenyebut;
    }
    public int getPembilang()
    {
        return newpembilang;
    }

    public int getPenyebut()
    {
        return newpembilang;
    }

    public void tambah(int pembilang2, int penyebut2)
    {
        newpembilang = (penyebut*pembilang2) + (penyebut2*pembilang);
        newpenyebut = penyebut*penyebut2;
        System.out.println(pembilang + "/" + penyebut + " + " + pembilang2 + "/" + penyebut2 + " = " + newpembilang + "/" + newpenyebut);
    }
}

public class Tugas_Pecahan
{
    public static void main(String[] args) 
    {
        System.out.println("---PENJUMLAHAN DUA PECAHAN---");
        System.out.println("Pecahan 1 = 3/2");
        System.out.println("Pecahan 2 = 5/6");
        Pecahan obj1 = new Pecahan(3, 2);
        Pecahan obj2 = new Pecahan(5, 6);

        obj1.tambah(5,6);
    }
}
