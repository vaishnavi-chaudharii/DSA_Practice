package Arrays;

import java.util.Scanner;


class Array1 {

    public static int isLargest(int arr[]){
        int size = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] getData() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void printArr(int arr[]) {
        int size = arr.length;
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = getData();
        printArr(arr);
    }
}
