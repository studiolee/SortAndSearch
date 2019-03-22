package search;

/**
 * @author leeray
 * @version 创建时间：2019年3月22日 下午7:09:28 <br>
 *          描述：二叉树节点结构<br>
 */
public class BiNode {
	int data;// 节点值
	BiNode lchild, rchild;// 左右孩子

	public BiNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BiNode(int data, BiNode lchild, BiNode rchild) {
		super();
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}

	@Override
	public String toString() {
		return "Binode [data=" + data + ", lchild=" + lchild + ", rchild=" + rchild + "]";
	}

	/**
	 * 在根为root的二叉查找树里查找值为k的函数
	 * 
	 * @param root：二叉查找树的根节点
	 * @param k：目标值
	 * @return：返回目标值的节点
	 */
	static BiNode SearchBST(BiNode root, int k) {
		if (root == null)
			return null;// 二叉查找树为空，返回null
		else if (k == root.data)
			// 查找成功
			return root;
		else if (k < root.data)
			// 在左子树里找
			return SearchBST(root.lchild, k);
		else
			// 在右子树里查找
			return SearchBST(root.rchild, k);
		
	}

	/**
	 * 
	 * @param root:二叉查找树的根节点
	 * @param data：要插入的数据
	 * @return：返回插入了数据的二叉查找树的根节点
	 */
	static BiNode InsertBST(BiNode root, int data) {
		// 如果root为空
		if (root == null) {
			root = new BiNode();
			root.data = data;
			root.lchild = null;
			root.rchild = null;
			return root;// 这里注意要return 我之前忘了导致stack内存溢出
		}
		if (data <= root.data) {
			// 在左子树里插入
			root.lchild = InsertBST(root.lchild, data);
		} else {
			// 在右子树里插入
			root.rchild = InsertBST(root.rchild, data);
		}
		return root;
	}

	/**
	 * 
	 * @param a,无序数组
	 * @param n：数组大小
	 * @return：返回该数组的对应的二叉查找树的根节点
	 */
	static BiNode CreateBST(int a[], int n) {
		BiNode root = null;
		for (int i = 0; i < n; i++) {
			root = InsertBST(root, a[i]);
		}
		return root;
	}
}
