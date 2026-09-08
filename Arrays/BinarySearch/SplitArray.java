package Arrays.BinarySearch;

public class SplitArray {

    static int splitArray(int[] nums,int m){
        int start = maxV(nums);
        int end = sum(nums);
        while(start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // if arr[ sum ] is greater than the max sum than it will create new array ;
                    sum = num;
                    pieces++;
                } else {
                    // else it will add that nums to sum ;
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid +1;
            }else{
                end = mid;
            }
        }

        return start;
    }
    static int maxV(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    static int sum(int[] arr){
        int sum =0;
        for(int x : arr){
            sum += x;
        }
        return sum;
    }
    static void main(String[] args) {
        int[] arr = {1,4,4};

        int ans = splitArray(arr,2);
        System.out.println(ans);
    }
}
