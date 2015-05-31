import java.util.Arrays;

/**
 * Created by Sahan on 5/30/2015.
 */
public class ListingPermutation {
    public static void permutaion(Object[] permList) {
        permute(permList, 0);
    }

    private static void permute(Object[] permList, int index) {
        int i, j, arrSize = permList.length;
        Object temp;
        if (index == arrSize - 1)
            System.out.println(Arrays.toString(permList));

        else {
            Object[] newPermList = new Object[arrSize];
            for (i = 0; i < arrSize; i++)
                newPermList[i] = permList[i];
            permute(newPermList, index + 1);
            for (i = index + 1; i < arrSize; i++) {
                temp = permList[i];
                permList[i] = permList[index];
                permList[index] = temp;
                newPermList = new Object[arrSize];
                for (j = 0; j < arrSize; j++)
                    newPermList[j] = permList[j];
                permute(newPermList, index + 1);
            }
        }
    }


    public static  void main(String[] args){
        Integer[] itemArr={1,2,3};
        permutaion(itemArr);
    }
}