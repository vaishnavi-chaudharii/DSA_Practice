package Patterns;

import java.util.Scanner;

class sixth_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
