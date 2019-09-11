package dev.shreyas.java.programs.geeksforgeeks.dp;


// refer https://www.geeksforgeeks.org/count-number-of-ways-to-cover-a-distance/
public class Part12CountWays {

    public static int noOfWays(int n){
        int count[]= new int [n+1];
        count[0]=1;
        count[1]=1;
        count[2]=2;
        for (int i=3;i<=n;i++){
            count[i]=count[i-1]+count[i-2]+count[i-3];
        }
        return count[n];
    }

    public static void main(String[] args) {
        int dist = 4;
        System.out.println(noOfWays(dist));
    }
}
