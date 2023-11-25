package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram {
    public static void main(String[] args)throws IOException {
        //int [] arr = new int[len];
        int result;
        String str;
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.print("Enter a sentence: ");
        str=in.readLine(); // To store a string from user.
        str=str.toLowerCase(); // To convert the string in the LowerCase
        str=str.replaceAll("\\s", "");// To remove all the WhiteSpace from the string
        result=Check(str); // Function Calling
        if(result==26){
            System.out.println("It is a Pangram.");
        }
        else{
            System.out.println("It is not a Pangram.");
        }
    }
    public static int Check(String str1){
        int i,j,res=1;
        for(i=1;i< str1.length();i++){
            for(j=0;j<=i;j++)
                if(str1.charAt(i)==str1.charAt(j)) // To compare each Character of the String
                    break;
            if(i == j)
                res++; // To store the no. of characters
        }
        return res;
    }
}

