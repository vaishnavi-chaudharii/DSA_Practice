/*
   1
  121
 12321
1234321
 */

package Patterns;

import java.util.Scanner;

class isosceles_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++){
            for(int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            int val = i - 1;
            for(int k = 1; k <= i - 1; k++){
                System.out.print(val);
                val--;
            }
            System.out.println();
        }
        sc.close();
    }
}
