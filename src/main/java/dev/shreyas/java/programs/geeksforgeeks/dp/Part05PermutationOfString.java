package dev.shreyas.java.programs.geeksforgeeks.dp;

public class Part05PermutationOfString {

    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n-1);
    }

    public static void permute(String str,int l, int r){
        if (l == r)
            System.out.println(str);
        for ( int i=l ;i<=r ;i++ ){
            str =swap(str,l,i);
            permute(str,l+1,r);
            str = swap(str,l,i);
        }
    }

    public static String swap(String str,int l,int r){
        char[] chars = str.toCharArray();
        char temp = chars[l];
        chars[l]= chars[r];
        chars[r]=temp;
        return new String(chars);
    }
}
