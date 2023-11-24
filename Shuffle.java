package Java;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5,6,7};
        int i=0,temp,randomIndex;
        Random ran = new Random();
        for (i = arr.length - 1; i > 0; i--) {
            randomIndex = ran.nextInt(i + 1);
            temp = arr[i];
            arr [i] = arr [randomIndex];
            arr[randomIndex] = temp;
        }
        for (i=0;i<7;i++){
            System.out.println(arr[i] + "\t");
        }
    }
}

