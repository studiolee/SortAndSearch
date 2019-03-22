package search;

/**
 * @author leeray
 * @version 创建时间：2019年3月22日 下午7:05:39 <br>
 *          描述：二叉查找树<br>
 *          二叉查找树的特点：左子树的值都小于节点值，右子树的值都大于节点值<br>
 */
public class BinayTreeSearch {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 5;
		a[2] = 20;
		a[3] = 15;
		a[4] = 3;

		Binode root = Binode.CreateBST(a, a.length);

		System.out.println(root);

		System.out.println(Binode.SearchBST(root, 5));
	}
}
