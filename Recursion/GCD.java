package Recursion;

class GCD {
    static int isGcd(int a, int b){
        if(a < 0 || b < 0){
            return -1;
        }
        if(a == 1 || b == 1 || a == 0 || b == 0){
            return a;
        }
        else{
            return isGcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int gcd = isGcd(48, 18);
        System.out.println(gcd);
    }
}
