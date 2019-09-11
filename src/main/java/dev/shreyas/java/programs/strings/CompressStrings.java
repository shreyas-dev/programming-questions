package dev.shreyas.java.programs.strings;

public class CompressStrings {
    private static String compress(String unCompressedString){
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr=unCompressedString.toCharArray();
        char last = arr[0];
        int count=1;
        for (int i=1;i<arr.length;i++){
           if (last!=arr[i]){
               stringBuilder.append(last);
               stringBuilder.append(count);
               last=arr[i];
               count=1;
           }else {
               count++;
           }
        }
        stringBuilder.append(last);
        stringBuilder.append(count);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabbbccdddd"));
    }
}
