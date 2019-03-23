package sort;

import java.util.Random;

/**
 * @author leeray
 * @version 创建时间：2019年3月23日 上午11:45:33 <br>
 *          描述：冒泡排序<br>
 */
public class BubbleSort {
	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(50);
			System.out.print(a[i] + "/");
		}
		Bubble_Sort(a, a.length);
		System.out.println("///");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "/");
		}
	}

	/**
	 * 冒泡排序函数，时间复杂度为O(n^2)效率很低。
	 * 
	 * @param a：待排数组
	 * @param n：排序范围
	 */
	static void Bubble_Sort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
