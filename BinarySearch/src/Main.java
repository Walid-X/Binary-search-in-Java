import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int[] array;
        array = new int[size];
        for(int i = 0; i < size;i++){
            System.out.print("Array[" + (i+1) + "] = ");
            array[i] = scan.nextInt();
        }
        System.out.print("Enter the value you are searching for : ");
        int value = scan.nextInt();
        binary.sort(array,size);
        binary.search(array,size,0,value);
    }
}

class binary {
    public static void sort(int[] array,int size){
        int i,j,help;
        for(i = 0 ; i < size - 1 ; i++){
            for(j = i + 1 ; j < size;j++){
                if(array[i] > array[j]){
                    help = array[i];
                    array[i] = array[j];
                    array[j] = help;
                }
            }
        }
    }
    public static void search(int[] array, int end, int start, int value) {
        // Initialize a flag to indicate whether the value was found
        boolean flag = false;
        int middle;
        do {
            // Calculate the middle index
            middle = (end + start) / 2;

            // Check if the middle element is equal to the target value
            if (array[middle] == value) {
                System.out.println("The value " + value + " was found in the array ");
                flag = true; // Set the flag to true, indicating the value was found
            } else if (array[middle] < value) {
                // If the middle element is less than the value, update the 'start' index
                start = middle + 1;
            } else {
                // If the middle element is greater than the value, update the 'end' index
                end = middle - 1;
            }
        } while (!flag); // Continue the loop until the value is found
    }
}