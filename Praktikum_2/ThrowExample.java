//Name : Taufik Ramdan
//NIM : 20210040154
//Class : TI21f

package Nusput.Praktikum_2;

import java.lang.Exception;

public class ThrowExample extends Exception{
    static void demo()
    {
        NullPointerException t;
        t=new NullPointerException("Coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan;
        //System.out.println("Ini tidak lagi dicetak");
    }
    public static void main(String[] args) {
        try
        {
            demo();
            System.out.println("Selesai");
        }
        catch(NullPointerException e)
        {
            System.out.println("Ada pesan error: "+e);
        }
    }
}
