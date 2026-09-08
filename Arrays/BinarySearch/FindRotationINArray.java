package Arrays.BinarySearch;

// FIND THE MINIMUM IN ROTATED ARRAY;
public class FindRotationINArray {
    public static int PivotInRotatedArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int FindRotation(int[] arr){
        int pivot = PivotInRotatedArray(arr);

        if(pivot == -1){
            return 0;
        }

        return arr[pivot+1];
    }
    static void main(String[] args) {
        int[] arr = {11,13,15,17};
        int ans = FindRotation(arr);
        System.out.println(ans);
    }
}
