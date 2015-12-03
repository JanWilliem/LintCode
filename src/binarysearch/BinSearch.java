package binarysearch;

public class BinSearch {
	public static void main(String[] args) {
		int[] src = new int[] { 1, 3, 5, 7, 8, 9 };
		int des = 8;
		int k = binarySearch(src,0,src.length,des);
		System.err.println(k);
	}

	private static int binarySearch(int[] src, int low,int high,int des) {
		
		if (low <= high) {
			int mid = (low + high) >>1;
			if (des == src[mid]) {
				return mid;
			}else if(des < src[mid])
			{
				return binarySearch(src,low,mid-1,des);
			}else if (des > src[mid])
			{
				return binarySearch(src,mid+1,high,des);
			}
		}
		
		return -1;
	}
}
