/*
1
23
345
4567
*/
package Patterns;

import java.util.Scanner;

public class forth_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                    val = i + j;
                    System.out.print(val);
                }
            System.out.println();
        }
    sc.close();
    }
}
