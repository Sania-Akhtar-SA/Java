package Java;
import java.io.*;
public class Roman {
    public static void main(String[] args)throws IOException {
        int Integer=0,i,current,next;
        String Roman;
        char ch,chr;
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the Roman number for conversion:"); // To take a Roman number from the user for the conversion
        Roman= in.readLine();
        Roman=Roman.toUpperCase(); // Change the Roman number into uppercase 

        for(i=0;i<Roman.length();i++){
            ch=Roman.charAt(i); // To extract the current Roman number
            current=getValue(ch); // To convert them into Integer

         if (i < Roman.length() - 1) {
            chr=Roman.charAt(i+1); // To extract the next Roman number
            next=getValue(chr); // To convert them into Integer

            if (current < next) {
                Integer -= current;
            } else {
                Integer += current;
            }// To compare the curent and the next value
        }else {
            Integer += current;
        }
    }
        System.out.println(Integer); // To print the Integer value
}
        private static int getValue(char RomanChar) { // Function to convert Roman number into Integer
            switch (RomanChar) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }
        }
    }