package Arrays;

import java.util.Scanner;

class Return_sum {
    
    public static int isSum(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int j = 0; j < N; j++){
                arr[j] = sc.nextInt();
            }
            int total = isSum(arr);
            System.out.println(total);
        }
        sc.close();
    }
}
