package Java;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5,6,7};
        int i=0;
        ArrShuffle(arr);// Function Calling for Array Shuffle.
        for (i=0;i<7;i++){
            System.out.println(arr[i] + "\t"); // To print all the array elements in Shuffle
        }
    }

    public static void ArrShuffle(int [] shuffle){
        Random ran = new Random(); // To create an object of the 'Random' Class
        for (int i = shuffle.length - 1; i > 0; i--) {
            int randomIndex = ran.nextInt(i + 1); // Generate a random integer
            // Swapping of the array element 
            int temp = shuffle[i];
            shuffle [i] = shuffle [randomIndex];
            shuffle[randomIndex] = temp;
        }
    }
}

