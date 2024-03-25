package pckg_arrays;

import java.util.Arrays;

public class TestArr {
    public static void main(String[] args) {

        int[] arr = AUX_CLS.populateArrayRandInt(5);
        System.out.println(Arrays.toString(arr));
        //AUX_CLS.listIntArray(arr);

       // int[]arrNew = AUX_CLS.userPopulatedArray(3);
        //AUX_CLS.listIntArray(arrNew);
        String[]strArr={"Vasa","Vasa plurimum", "sonant",};
        String linked = AUX_CLS.linkStringsUsingJoin(strArr);
        System.out.println(linked);
        String sbLinked = AUX_CLS.linkUsingStringBuilder(strArr);
        System.out.println(sbLinked);
        String concate = AUX_CLS.concatenateArrayElements(strArr);
        System.out.println(concate);
        int[][] arr2D = AUX_CLS.gen2DIntArray(3,3);
        System.out.println(Arrays.deepToString(arr2D));
        AUX_CLS.list2DArray(arr2D);



    }
}
