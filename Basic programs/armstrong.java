import java.util.Scanner;

class armstrong {
    public static void main(String []args){
        int temp, res = 0, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        num = sc. nextInt();
        temp = num;
        while(num > 0){
            res = num % 10;
            sum += res * res * res;
            num = num /10;
        }
        if(sum == temp){
            System.out.println("Armstrong no.");
        }
        else
            System.out.println("Not a Armstrong no.");

        sc.close();
    }
}
