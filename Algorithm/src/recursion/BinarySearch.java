package recursion;

/**     折半查找    */

public class BinarySearch {
    public static boolean BinarySearch(int[] sequence, int target, int low, int high){
        if (low>high)
            return false;
        else {
            int mid = (low+high)/2;
            if (target == sequence[mid])
                return true;
            else if (target<sequence[mid])
                return BinarySearch(sequence,target,low,mid-1);
            else
                return BinarySearch(sequence,target,mid+1,high);
        }
    }
}
