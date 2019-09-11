package dev.shreyas.java.programs.singleInput;

public class ReverseIntegers {
    public static int reversed(int n){
        boolean negative = false;
        if (n < 0) {
            negative = true;
            n = n * -1;
        }
        int reversed =0 ;
        while (n >0){
            reversed = (reversed*10) + n %10;
            n/=10;
        }
        return negative ? -1 * reversed : reversed;
    }
    public static void main(String[] args) {
        System.out.println(reversed(9875));
        System.out.println(reversed(-9875));
    }
}
