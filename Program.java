
public class Program {
    public static void main(String[] args) {

        int[] nums = new int[] {5,4,3,2,1};
        mergeSort(nums, 0, nums.length -1 );

    }
    public static void mergeSort(int [] nums, int start, int end) {
        if (start >= end) return;

        int mid = (start+end)/2;
        mergeSort(nums, start,mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, mid, end);
        }

        public static void merge(int[] nums, int start, int mid, int end){
        int[] temp = new int[end - start + 1];
        int right = mid +1;
        int k = 0;
        while (start <= mid && right <= end) {
            if(nums[start] < nums[right]){
                temp[k++] = nums[start++];
            }else {
                temp[k++] = nums[right++];
            }
        }
        while (start <= mid) temp[k++] = nums[start++];
        while (right <= end) temp[k++] = nums[right++];

        System.arraycopy(temp, 0, nums, start, end + 1 - start);
        }
    }

