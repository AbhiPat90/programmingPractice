import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer array elements");
        int size = scanner.nextInt();
        int arrayInt[] = new int[size];
        for (int i=0; i<size;i++) {
            arrayInt[i] = scanner.nextInt();
        }
        bubbleSortTechnique(arrayInt);
    }

    public static void bubbleSortTechnique(int [] arrayInput){
        for(int i=0; i<arrayInput.length-1;i++){
            for (int j = i+1; j<arrayInput.length;j++){
                if(arrayInput[i]>arrayInput[j]){
                    int temp = arrayInput[i];
                    arrayInput[i] = arrayInput[j];
                    arrayInput[j] = temp;
                }
            }
        }
        for(int i = 0; i < arrayInput.length; ++i) {
            System.out.print(" " + arrayInput[i] + " ");
        }
    }
}
