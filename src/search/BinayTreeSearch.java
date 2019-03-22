package search;

import java.util.Random;

/**
 * @author leeray
 * @version 创建时间：2019年3月22日 下午7:05:39 <br>
 *          描述：二叉查找树<br>
 *          二叉查找树的特点：左子树的值都小于节点值，右子树的值都大于节点值<br>
 */
public class BinayTreeSearch {
	public static void main(String[] args) {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(10);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "/");
		}

		Binode root = new Binode();

		root = Binode.CreateBST(a, a.length - 1);

		System.out.println(Binode.SearchBST(root,5));
	}
}
