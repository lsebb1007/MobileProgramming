package org.androidtown.hello;
import java.util.Arrays;

/**
 * Created by seungeonlee on 2016. 10. 3..
 */

public class Minimum extends Result {
    public int getresult(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length-1; i++) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
        }
        return min;
    }
}
