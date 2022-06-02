import org.apache.commons.lang.ArrayUtils;
import org.testng.annotations.Test;

import java.util.Arrays;

public class task6 {

    public void arrayDiff(int arr1[], int arr2[]){


        for(int i=0; i<arr2.length; i++){
            for (int x=0; x<arr1.length; x++){
                if(arr2[i]==arr1[x]){
                    arr1 = ArrayUtils.removeElement(arr1, arr1[x]);
                    x=0;
                }
            }

        }
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void differenceOfArrays(){
        arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2});
    }
}
