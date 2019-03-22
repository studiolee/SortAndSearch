package search;

import java.util.Random;

/**
 * @author leeray
 * @version 创建时间：2019年3月22日 下午6:49:51 <br>
 *          描述：二分查找<br>
 */
public class BinaySearch {
	/**
	 * 
	 * @param a:升序数组
	 * 
	 * @param n:二分查找的最大范围
	 * 
	 * @param target:目标数据
	 * 
	 * @return: 返回目标元素的序号，没有就返回-1
	 */
	static int BinSearch(int a[], int n, int target) {
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target < a[mid]) {
				high = mid - 1;
			} else if (target > a[mid]) {
				low = mid + 1;
			} else {
				return mid;// 返回目标的序号
			}
		}
		return -1;
	}

	/**
	 * 二分查找的时间复杂度是O(logn),前提是有序数组<br>
	 * 二分查找的思想是减治法，每次减少一半。<br>
	 */

	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(50);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "/");
		}
		System.out.println(BinSearch(a, a.length - 1, 20));
	}
}
