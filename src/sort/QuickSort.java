package sort;

import java.util.Random;

/**
 * @author leeray
 * @version 创建时间：2019年3月22日 下午6:12:54 <br>
 *          描述：快排函数<br>
 */
public class QuickSort {

	/**
	 * 
	 * @param a：未排序的数组
	 * @param left：划分区域的起点
	 * @param right：划分区域的终点
	 * @return ：返回轴值
	 */
	static int Partition(int[] a, int left, int right) {
		int i = left, j = right;
		while (i < j) {
			while (i < j && a[i] <= a[j]) {
				j--;
			}
			// 从右到左碰到小于轴值的，要进行交换
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;//
			}

			while (i < j && a[i] <= a[j]) {
				i++;
			}
			// 从左到右碰到大于轴值的，要进行交换
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
			}
		}
		return i;// 返回轴值
	}

	static void Quick_Sort(int[] a, int left, int right) {
		int piv;
		if (left < right) {
			piv = Partition(a, left, right);// 获得轴值
			Quick_Sort(a, left, piv - 1);
			Quick_Sort(a, piv + 1, right);
		}
	}

	/**
	 * 快排函数用到的算法思想是分治法。<br>
	 * 在Quick_Sort()中使用递归调用对数组不断划分，使得最终的数组按序排列<br>
	 * 快排函数的平均算法复杂度是O(nlogn)<br>
	 * 在最坏的情况下（原数据有序）算法复杂度退化到O(n^2),因为每次划分只比上一次划分少一个记录的子序列<br>
	 * 此时必须n-1次递归调用才能把所有数据定位。<br>
	 */

	public static void main(String[] args) {

		int a[] = new int[20];

		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}

		Quick_Sort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print("/" + a[i]);
		}
	}
}
