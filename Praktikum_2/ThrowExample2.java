//Name : Taufik Ramdan
//NIM :20210040154
//Class : TI21f

package Nusput.Praktikum_2;

import java.lang.Exception;

public class ThrowExample2 extends Exception{
    public static void main(String[] args) {
        try
        {
            throw new Exception("Here's my Exception");
        }
        catch(Exception e)
        {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}
