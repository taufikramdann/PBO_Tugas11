//Name : Taufik Ramdan
//NIM : 20210040154
//Class : TI21f

package Nusput.Praktikum_2;

import java.lang.Exception;

public class MyException3 extends Exception{
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
