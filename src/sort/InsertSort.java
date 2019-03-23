package sort;

import java.util.Random;

/**
 * @author leeray
 * @version 创建时间：2019年3月23日 上午11:24:24 <br>
 *          描述：插入排序<br>
 */
public class InsertSort {
	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(50);
			System.out.print(a[i] + "/");
		}
		Inser_Sort(a, a.length);
		System.out.println("///");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "/");
		}

	}

	/**
	 * 插入排序，减治法,时间复杂度为O(n^2)。
	 * 
	 * @param a:待排数组
	 * @param n：要排序的最大范围
	 */
	static void Inser_Sort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int ins = a[i];// 保存要插入的数据
			int j = i - 1;
			while (j >= 0 && ins < a[j]) {
				a[j + 1] = a[j];// 后移
				j--;
			}
			a[j + 1] = ins;//最后腾出来的位置用于插入ins
		}
	}
}
