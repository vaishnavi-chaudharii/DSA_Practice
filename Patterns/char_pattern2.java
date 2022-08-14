package Patterns;

import java.util.Scanner;

public class char_pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        for(int i = 1; i <= n; i++){
            char startChar = (char)('A' + i - 1);
            for(int j = 1; j <= n; j++){
                System.out.print(startChar);
                startChar = (char)(startChar + 1);
            }
            System.out.println();
        }
        sc.close();
    }   
}
