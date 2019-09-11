package dev.shreyas.java.programs.geeksforgeeks.dp;

import java.util.HashMap;
import java.util.Map;

public class Part10CoinChange {
    /**
     * Top down dynamic programing. Using map to store intermediate results.
     * Returns Integer.MAX_VALUE if total cannot be formed with given coins
     */
    private static int getMinChangeRequired(int total, int[] coins, Map<Integer,Integer> alreadyCalculated){
        //if total is 0 then there is nothing to do. return 0.
           if (total ==0)
               return 0;
        //if map contains the result means we calculated it before. Lets return that value.
           if (alreadyCalculated.containsKey(total))
               return alreadyCalculated.get(total);

           int min = Integer.MAX_VALUE;
        //iterate through all coins and see which one gives best result.
           for (int i=0;i<coins.length;i++){
               //if value of coin is greater than total we are looking for just continue.
               if (coins[i]>total)
                   continue;
               //recurse with total - coins[i] as new total
               int val=getMinChangeRequired(total-coins[i],coins,alreadyCalculated);

               //if val we get from picking coins[i] as first coin for current total is less
               // than value found so far make it minimum.
               if (val < min)
                   min = val;
           }
           // if min is MAX_VAL dont change it. Just result it as is. Otherwise add 1 to it.
           min= min == Integer.MAX_VALUE? min:min+1;

           alreadyCalculated.put(total,min);
           return min;
    }
    public static void main(String[] args) {
        int total = 13;
        int[] coins = {7, 3, 2, 6};
        Map<Integer, Integer> map = new HashMap<>();
        int topDownValue = getMinChangeRequired(total, coins, map);
        System.out.print(String.format("Bottom  %s", topDownValue));
    }
}
