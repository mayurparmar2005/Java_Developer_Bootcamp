package Arrays.BinarySearch;

public class FirstNLastPositionOfNumber {
    static int[] FirstNLastOccurrence(int[] arr, int target){

        int low = 0;
        int high = arr.length -1;
        int[] ans = new int[2];
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target < arr[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }  ans[0] = mid ;
        }

        int start = 0 , end = arr.length;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
            ans[1] = low;
            return ans;
        }

        return new int[]{-1,-1};
    }
    static void main(String[] args) {
        int[] nums = {3,5,7,7,7,7,8,8,10};
        int[] answer = FirstNLastOccurrence(nums,7);
        System.out.println("["+answer[0]+","+answer[1]+"]");
    }
}
