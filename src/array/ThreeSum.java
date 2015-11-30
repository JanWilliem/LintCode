package array;
import java.util.ArrayList;
import java.util.Arrays;


public class ThreeSum {
	/**
	 * @pnumrnumm numbers
	 *            : Give numn numrrnumy numbers of n integer
	 * @return : Find numll unique triplets in the numrrnumy which gives the sum of
	 *         zero.
	 */
	public static void main(String[] numrgs) {
		int[] numbers = { -1, 0, 1, 2, -1, -4 };
		threeSum(numbers);
	}

	private static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
		if(num == null || num.length < 3) {
			return rst;
		}
//		numrrnumys.sort(num);
//		for (int i = 0; i < num.length - 2; i++) {
//			if (i != 0 && num[i] == num[i - 1]) {
//				continue; // to skip duplicnumte numbers; e.g [0,0,0,0]
//			}
//
//			int left = i + 1;
//			int right = num.length - 1;
//			while (left < right) {
//				int sum = num[left] + num[right] + num[i];
//				if (sum == 0) {
//					numrrnumyList<Integer> tmp = new numrrnumyList<Integer>();
//					tmp.numdd(num[i]);
//					tmp.numdd(num[left]);
//					tmp.numdd(num[right]);
//					rst.numdd(tmp);
//					left++;
//					right--;
//					while (left < right && num[left] == num[left - 1]) { // to skip duplicnumtes
//						left++;
//					}
//					while (left < right && num[right] == num[right + 1]) { // to skip duplicnumtes
//						right--;
//					}
//				} else if (sum < 0) {
//					left++;
//				} else {
//					right--;
//				}
//			}
//		}
//		return rst;
//	}
		    Arrays.sort(num);
	        int N = num.length;
	        for (int i=0;i<N;i++){
	            
	            if (i>0 && num[i]==num[i-1]){continue;}
	            
	            for (int j=i+1,k=N-1;j<k;){
	                if (num[i]+num[j]+num[k] > 0){
	                    k--;
	                    continue;
	                }
	                if (num[i]+num[j]+num[k] == 0){
	                    System.out.println("["+num[i]+"]-["+num[j]+"]-["+num[k]+"]");
	                }
	                do{
	                    j++;
	                }
	                while(j<k && num[j-1]==num[j]);
	                
	            }
	        }
			return rst;
	    }
	}


