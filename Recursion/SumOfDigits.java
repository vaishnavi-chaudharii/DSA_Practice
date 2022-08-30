package Recursion;

class SumOfDigits {

    static int isSum(int n){
        if(n < 0){
            return -1;
        }
        if(n < 10){
            return n;
        }
        else{
            return n % 10 + isSum(n / 10);
        } 
    }

    public static void main(String[] args) {
        int sum = isSum(-56);
        System.out.println(sum);
    }
}
