/*
ABCD
ABCD
ABCD
ABCD
 */
package Patterns;

import java.util.Scanner;

class char_pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)('A' + j -1));
            }
            System.out.println();
        }
        sc.close();
    }
}
