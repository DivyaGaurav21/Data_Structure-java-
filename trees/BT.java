package trees;

import java.util.Scanner;

public class BT {

	
	//formation of binary tree
	public static BinaryTreeNode<Integer> createBT(){
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<Integer>(3);
		root.left=rootLeft;
		root.right=rootRight;
		BinaryTreeNode<Integer> twoRight=new BinaryTreeNode<Integer>(5);
		BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<Integer>(6);
		rootLeft.right=twoRight;
		rootRight.left=threeLeft;
		return root;	
	}
	
	//for print BT
	public static void printBT(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printBT(root.left);
		printBT(root.right);
	}
	
	//for print better way of binary tree
	public static void printBTbetter(BinaryTreeNode<Integer> root) {
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
		
		printBTbetter(root.left);
		printBTbetter(root.right);
		
	}
	
	//take input
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData,boolean isLeft){
		if(isRoot) {
		System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of :"+parentData);
			}else {
				System.out.println("Enter right child of :"+parentData);
			}
		}
		
		Scanner scn=new Scanner(System.in);
		int rootData=scn.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightChild=takeInputBetter(false, rootData, false);
		root.left=leftChild;
		root.right=rightChild;
		
		return root;
	}
	
	//for count node in binaryTree
	public static int countNodeBT(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftNodeCount=countNodeBT(root.left);
		int rightNodeCount=countNodeBT(root.right);
		return 1+leftNodeCount+rightNodeCount;
	}
	
	//find node data sum
	public static int nodeSumBT(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftSum=nodeSumBT(root.left);
		int rightSum=nodeSumBT(root.right);
		return root.data+leftSum+rightSum;
	}
	
	public static void main(String[] args) {
	BinaryTreeNode<Integer> bt=takeInputBetter(true, 0,false);
	printBTbetter(bt);
    System.out.println("count of node-->"+countNodeBT(bt));
    System.out.println("sum of node data in BT-->"+nodeSumBT(bt));

	}

}
