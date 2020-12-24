import java.util.Scanner;

public class BubbleSort {
        public static void main(String[] args) {
            int size;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array elements");
            size = sc.nextInt();
            int a[] = new int[size];
            for(int i=0; i<size; i++){
                a[i] = sc.nextInt();
            }
            a = usingBubbleSort(a);
            System.out.println("after being sorted");
            for(int i=0; i<a.length; i++){
                System.out.print(" "+a[i]+" ");
            }
        }

        public static int[] usingBubbleSort(int arr[]){
            for(int i=0; i<arr.length-1; i++){
                for (int j = i+1; j<arr.length; j++){
                    if(arr[i]>arr[j]){
                        arr[i] = arr[i] + arr[j];
                        arr[j] = arr[i] - arr[j];
                        arr[i] = arr[i] - arr[j];
                    }
                }
            }
            return arr;
        }
}
