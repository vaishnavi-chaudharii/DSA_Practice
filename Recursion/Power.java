package Recursion;

class Power {

    static int isPower(int n, int e){
        if(e == 0){
            return 1;
        }
        else{
            return n * isPower(n, e-1);
        }
    }

    public static void main(String[] args) {
        int pow = isPower(10, 1);
        System.out.println(pow);
    }
}
