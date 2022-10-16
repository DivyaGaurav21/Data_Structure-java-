package trees;

import java.util.Scanner;

public class binaryTreeUse {
	
	//@@(1)@@ create binary tree for understanding
	public static BinaryTreeNode<Integer> createBinaryTree(){
		 BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(1);
	     BinaryTreeNode<Integer> rootLeft= new BinaryTreeNode<Integer>(2);
	     BinaryTreeNode<Integer> rootRight= new BinaryTreeNode<Integer>(3);
	     
	     root.left=rootLeft;
	     root.right=rootRight;
	     
	     BinaryTreeNode<Integer> twoRight=new BinaryTreeNode<Integer>(4);
	     BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<Integer>(5);
	    		 
	     rootLeft.right=twoRight;
	     rootRight.left=threeLeft;
	     
	     return root;
	}
	
	//@@(2)@@ for print Binary tree
	public static void printTree1(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printTree1(root.left);
		printTree1(root.right);
//		if(root.left!=null) {
//			printTree1(root.left);
//		}
//		if(root.right!=null) {
//			printTree1(root.right);
//		}
	}
	
	// better way to print binary tree
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	//@@(3|)@@ for take input by user to form binary tree
	public static BinaryTreeNode<Integer> takeInput(){
		System.out.println("Enter root data");
		Scanner scn=new Scanner(System.in);
		int rootData=scn.nextInt();
		
		if(rootData==-1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeInput();
		BinaryTreeNode<Integer> rightChild=takeInput();
		root.left=leftChild;
		root.right=rightChild;
		
		return root;
	}
	
	//better way to take input of binary trre
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root Data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of "+ parentData);
			}else {
				System.out.println("Enter right child of "+ parentData);
			}
		}
		
		Scanner scn=new Scanner(System.in);
		int rootData=scn.nextInt();
		
		if(rootData==-1) {
			return null;
		}
	
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild=takeInputBetter(false, rootData, false);
		root.left=leftChild;
		root.right=rightChild;
		
		return root;
	}
	
	//@@(4)@@ for find num of node in BT
	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftNodeCount=numNodes(root.left);
		int rightNodeCount=numNodes(root.right);
		return 1+leftNodeCount+rightNodeCount;
	}
	
	
	//@@(5)@@ for sum of all the node of binary tree
	public static int getSum(BinaryTreeNode<Integer> root) {
		   if (root == null)
	        return 0;
	    return (root.data + getSum(root.left) + getSum(root.right));
		}
	
	//@@(6)@@ preOrder triversal
	public static void preOrderTPrint(BinaryTreeNode<Integer> root) {
		if (root == null) {
            return;
		}
        System.out.print(root.data + " ");
        preOrderTPrint(root.left);
        preOrderTPrint(root.right);
	}

	//@@(7)@@ postOrder triversal
	public static void postOrderTprint(BinaryTreeNode<Integer> root) {
	  if(root==null) {
		  return;
	  }
	  postOrderTprint(root.left);
	  postOrderTprint(root.right);
	  System.out.print(root.data+" ");
	}
	
	//@@(8)@@ Inorder triversal
	public static void inOrderTPoint(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		inOrderTPoint(root.left);
		System.out.print(root.data+" ");
		inOrderTPoint(root.right);
	}
	
	
	//@@(9)@@ find Node with largest data in BinaryTree
	public static int largestDataBT(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return -1;
		}
		int largestLeft=largestDataBT(root.left);
		int largestRight=largestDataBT(root.right);
		return Math.max(Math.max(largestLeft, largestRight),root.data);
	}
	
	//@@(10)@@ find the count of Node greater than x
	public static int nodeGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return 0;
		}
		int count=0;
		if(root.data>x) {
			count++;
		}
		int countLeft=nodeGreaterThanX(root.left, x);
		int countRight=nodeGreaterThanX(root.right, x);
		return count+countLeft+countRight;
	}
	
	//@@(11)@@ find the height of binary tree
	public static int heightOfBT(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return Math.max(heightOfBT(root.left), heightOfBT(root.right))+1;
	}
	
	//@@(12)@@ find number of leaf node in binaryTree
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null&&root.right==null) {
			return 1;
		}
		return numLeaves(root.left)+numLeaves(root.right);
	}
	
	
	//@@(13)@@ print node of binary tree at depth k
	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root==null) {
		 return;	
		}
		if(k==0) {
			System.out.print(root.data+" ");
			return;
		}
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}
	
	//@@(14)@@ check whether element x present in BinaryTree
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return false;
		}
		if(root.data.equals(x)) {
			return true;
		}
		return (isNodePresent(root.left, x)|| isNodePresent(root.right, x));
	}
	
	//@@(15)@@ print all the node without sibling
		public static void printNodeWithoutSibling(BinaryTreeNode<Integer> root) {
			if(root==null) {
				return;
			}
			if(root.left!=null&&root.right==null ) {
				System.out.print(root.left.data+" ");
			}
			if(root.left==null && root.right!=null) {
				System.out.print(root.right.data+" ");
			}
			printNodeWithoutSibling(root.left);
			printNodeWithoutSibling(root.right);
		}
	
	//@@(16)@@ remove leaf node
	public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.left==null&&root.right==null) {
			return null;
		}
		root.left=removeLeafNodes(root.left);
		root.right=removeLeafNodes(root.right);
		return root;
		
	}
	
	//@@(17)@@ program to remove leaf node of binaryTree
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	
	//@@(18)@@ program to check whether binary tree is balanced or not
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		
		int leftHeigth=heightOfBT(root.left);
		int rigthHeight=heightOfBT(root.right);
		
		if(Math.abs(leftHeigth-rigthHeight)>1) {
			return false;
		}
		
		boolean isLeftBalanced=isBalanced(root.left);
		boolean isRightBalanced=isBalanced(root.right);
		
		return isLeftBalanced && isRightBalanced;
	}
	
	//@@(19)@@ program to find diameter of binary tree
	public static int diameterOfBT(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int leftHeight=heightOfBT(root.left);
		int rightHeight=heightOfBT(root.right);
		
		int leftDiameter=diameterOfBT(root.left);
		int rightDiameter=diameterOfBT(root.right);
		
		return Math.max(1+leftHeight+rightHeight,Math.max(leftDiameter, rightDiameter));
	}
	public static void main(String[] args) {
	BinaryTreeNode<Integer> BTroot=takeInputBetter(true, 0,true);
	int d=diameterOfBT(BTroot);
	System.out.println(d);
//	printTreeDetailed(rroot);
//	System.out.println(isBalanced(rroot));
////	System.out.println("Num of nodes =>"+numNodes(rroot));
//	int larNode=largestDataBT(rroot);
//	System.out.println("Largest Node in BT-->"+larNode);
//	System.out.println("number of node greater than 3-->"+nodeGreaterThanX(rroot, 3));
//	System.out.println("require height of BT -->"+heightOfBT(rroot));
//	System.out.println("number of leaves in BT-->"+numLeaves(rroot));
//	printAtDepthK(rroot, 2);
//	System.out.println();
//	printAtDepthK(rroot, 3);
//	
//	System.out.println("pre order-->");
//	preOrderTPrint(rroot);
//	System.out.println();
//	System.out.println("postOrder-->");
//	System.out.println();
//	postOrderTprint(rroot);
//	System.out.println("inOrder-->");
//	inOrderTPoint(rroot);
//	System.out.println();
//    System.out.println("sum of nodes=>"+ getSum(rroot));
	}
	

}
