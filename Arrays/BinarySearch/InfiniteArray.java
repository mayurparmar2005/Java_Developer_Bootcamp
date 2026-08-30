package Arrays.BinarySearch;

public class InfiniteArray {

    public static int findRange(int[] arr,int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newstart = end + 1;
            end = end + ( end - start + 1 ) * 2;
            start = newstart;
        }
        return BinarySearch(arr , target , start , end);
    }

    public static int BinarySearch(int[] arr, int target,int start ,int end){

        while(start <= end){
            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;

    }
    static void main(String[] args) {
        int[] nums = {2,4,7,9,14,17,19,25,28,32,34,48,50,57,59,78,89};
        System.out.println("Answer : "+findRange(nums,50) );
    }

}
