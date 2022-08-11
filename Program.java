import  java.util.ArrayList;
import  java.util.List;
public class Program {
    List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {

        /*int[] nums = new int[] {5,4,3,2,1};
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
        }*/
    }
    public List<List<Integer>> combine(int n, int k) {
        genComb(n, k, 0, new ArrayList<>());
        return ans;
    }
    private void genComb(int n, int k, int prevEl, List<Integer> curComb){
        if(curComb.size() == k){
            ans.add(new ArrayList<>(curComb));
        }

        for (int i = prevEl + 1; i <= n; i++){
            curComb.add(i);
            genComb(n, k, i, curComb);
            curComb.remove(curComb.size() - 1);
        }
    }
}
