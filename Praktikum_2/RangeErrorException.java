//Name : Taufik Ramdan
//NIM : 20210040154
//Class : TI21f

package Nusput.Praktikum_2;

import java.lang.Throwable;

public class RangeErrorException extends Throwable{
    public RangeErrorException(String s){
    super(s);
    }
    public static void main(String[] args){
        int position=1;
        try
        {
        if(position>0)
        {
        throw new RangeErrorException("Position " +position);
        }
        }
        catch(RangeErrorException e)
        {
        System.out.println("Range error: " +e.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
