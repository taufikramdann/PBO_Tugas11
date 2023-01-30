//Name : Taufik Ramdan
//NIM : 20210040154
//Class : TI21f

package Nusput.Praktikum_2;

import java.lang.Exception;


public class Propagate{
    public static void main(String[] args){
        try
        {
            System.out.println(reverse("This is a string"));
        }
        catch(Exception e)
        {
            System.out.println("The String was blank");
        }
        finally
        {
            System.out.println("All done");
        }
    }
    public static String reverse(String s) throws Exception{
        if(s.length()==0)
        {
            throw new Exception();
        }
        String reverseStr = "";
        for(int i=s.length()-1 ; i>=0 ; --i){
            reverseStr+=s.charAt(i);
        }
        return reverseStr;
    }
}