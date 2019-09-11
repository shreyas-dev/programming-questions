package dev.shreyas.java.programs.geeksforgeeks.dp;


// refer https://www.geeksforgeeks.org/ugly-numbers/
/*

Tabulation -> Bottom Up approach

initialize
   ugly[] =  | 1 |
   i2 =  i3 = i5 = 0;

First iteration
   ugly[1] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
            = Min(2, 3, 5)
            = 2
   ugly[] =  | 1 | 2 |
   i2 = 1,  i3 = i5 = 0  (i2 got incremented )

Second iteration
    ugly[2] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
             = Min(4, 3, 5)
             = 3
    ugly[] =  | 1 | 2 | 3 |
    i2 = 1,  i3 =  1, i5 = 0  (i3 got incremented )

Third iteration
    ugly[3] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
             = Min(4, 6, 5)
             = 4
    ugly[] =  | 1 | 2 | 3 |  4 |
    i2 = 2,  i3 =  1, i5 = 0  (i2 got incremented )

Fourth iteration
    ugly[4] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
              = Min(6, 6, 5)
              = 5
    ugly[] =  | 1 | 2 | 3 |  4 | 5 |
    i2 = 2,  i3 =  1, i5 = 1  (i5 got incremented )

Fifth iteration
    ugly[4] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
              = Min(6, 6, 10)
              = 6
    ugly[] =  | 1 | 2 | 3 |  4 | 5 | 6 |
    i2 = 3,  i3 =  2, i5 = 1  (i2 and i3 got incremented )

Will continue same way till I < 150
 */
public class Part01UglyNumber {

    private static int findNextUglyNumber(int n){
        int i2=0,i3=0,i5=0;
        int[] ugly= new int[n];
        ugly[0]=1;
        for(int i=1;i<n;i++){
            ugly[i] = Math.min(ugly[i2]*2,Math.min(ugly[i3]*3,ugly[i5]*5));
            if (ugly[i] == ugly[i2]*2){
                i2+=1;
            }
            if (ugly[i] == ugly[i3]*3){
                i3+=1;
            }
            if (ugly[i] == ugly[i5]*5){
                i5+=1;
            }
        }
        return ugly[n-1];
    }

    public static void main(String[] args) {
        int n = 150;
        System.out.println(n+"th ugly number is:"+findNextUglyNumber(n));
    }
}
