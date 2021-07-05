package com.java.programs.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 Example 1:

 Input: candies = [2,3,5,1,3], extraCandies = 3
 Output: [true,true,true,false,true]
 Explanation:
 Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
 Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
 Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
 Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 Example 2:

 Input: candies = [4,2,1,1,2], extraCandies = 1
 Output: [true,false,false,false,false]
 Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless of who takes the extra candy.
 Example 3:

 Input: candies = [12,1,12], extraCandies = 10
 Output: [true,false,true]
 *
 * solution
 *  - find max from array and add the extra candies and check if added extra candy greater than max
 */
public class Array_1431 {

    public static void main(String[] args) {

        int[] input = {1,5,10,15,2,3};

        System.out.println(kidsWithCandies(input,3));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max= candies[0];

        for(int i=0;i<candies.length;i++)
        {

            if(max<candies[i])
            {
                max=candies[i];
            }
        }
        ArrayList result = new ArrayList();
        for(int i=0;i<candies.length;i++)
        {

            result.add(candies[i]+extraCandies>=max);
        }

        return result;
    }
}
