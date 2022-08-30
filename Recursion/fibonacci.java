package Recursion;

class fibonacci {

    static int isFibonacci(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return n;
        }
        else{
            return isFibonacci(n - 1) + isFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int fibo = isFibonacci(10);
        System.out.println(fibo);
    }
}
