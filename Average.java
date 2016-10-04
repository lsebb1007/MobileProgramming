package org.androidtown.hello;

/**
 * Created by seungeonlee on 2016. 10. 3..
 */

public class Average extends Result {
    public int getresult(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            sum+= arr[i];
        }
        sum = sum/arr.length;
        return sum;
    }
}
