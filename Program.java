import  java.util.ArrayList;
import  java.util.List;
public class Program {

    public static int count = 8;


    public static void main(String[] args) {

        int[][] board = new int[8][8];
        print(board);
        Quen(board, 0);


    }

    public static void print(int[][] board) {
        int n = board.length;
        System.out.println("------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }

    public static boolean Power(int[][] board, int row, int col) {
        int i, j;

            for (i = 0; i < col; i++)
                if (board[row][i] == 1)
                    return false;
            for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
                if (board[i][j] == 1)
                    return false;
            for (i = row, j = col; j >= 0 && i < count; i++, j--)
                if (board[i][j] == 1)
                    return false;

            return true;

    }



    public static boolean Quen(int board[][], int col) {
        if (col >= count)
            return true;

        for (int i = 0; i < count; i++) {
            if (Power(board, i, col)) {
                board[i][col] = 1;

                if (Quen(board, col + 1) == true)
                    return true;

                board[i][col] = 0;
            }
        }

        print(board);
        return false;
    }
}








//public  static
//        List<List<Integer>> ans = new ArrayList<>();
//    public static void main(String[] args) {
//
//        /*int[] nums = new int[] {5,4,3,2,1};
//        mergeSort(nums, 0, nums.length -1 );
//
//    }
//    public static void mergeSort(int [] nums, int start, int end) {
//        if (start >= end) return;
//
//        int mid = (start+end)/2;
//        mergeSort(nums, start,mid);
//        mergeSort(nums, mid+1, end);
//        merge(nums, start, mid, end);
//        }
//
//        public static void merge(int[] nums, int start, int mid, int end){
//        int[] temp = new int[end - start + 1];
//        int right = mid +1;
//        int k = 0;
//        while (start <= mid && right <= end) {
//            if(nums[start] < nums[right]){
//                temp[k++] = nums[start++];
//            }else {
//                temp[k++] = nums[right++];
//            }
//        }
//        while (start <= mid) temp[k++] = nums[start++];
//        while (right <= end) temp[k++] = nums[right++];
//
//        System.arraycopy(temp, 0, nums, start, end + 1 - start);
//        }*/
//    }
//    public List<List<Integer>> combine(int n, int k) {
//        genComb(n, k, 0, new ArrayList<>());
//        return ans;
//    }
//    private void genComb(int n, int k, int prevEl, List<Integer> curComb){
//        if(curComb.size() == k){
//            ans.add(new ArrayList<>(curComb));
//        }
//
//        for (int i = prevEl + 1; i <= n; i++){
//            curComb.add(i);
//            genComb(n, k, i, curComb);
//            curComb.remove(curComb.size() - 1);
//        }
//    }
//}
