package jsong00505.study.hack30days;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {
	// my solution
	static void levelOrder(Node3 root){
	    //Write your code here
		ArrayList<Node3> queue = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		// set up root
		if(root != null) {
			queue.add(root);
			result.add(root.data);
		}
		
		// loop for true
		while(true) {
			
			if(root.left != null && !queue.contains(root.left)) {
				// has left child of root and not in queue
				queue.add(root.left);
				result.add(root.left.data);
			} else if(root.right != null && !queue.contains(root.right)) {
				// has right child of root and not in queue
				queue.add(root.right);
				result.add(root.right.data);
			} else if(queue.contains(root.left) || queue.contains(root.right) || queue.size() > 1) {
				// in queue and size is bigger than 1
				queue.remove(0);
				root = queue.get(0);
			} else {
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < result.size(); i++) {
			sb.append(result.get(i)).append(" ");
		}
	     
		System.out.println(sb.toString());
	}
	
	// editorial
	static Queue<Node3> queue = new LinkedList<Node3>();

	static void levelOrder2(Node3 root){
	    if( root != null ){
	        queue.add(root);
	    }
	    while( !queue.isEmpty() ){
	        Node3 tree = queue.remove();
	        System.out.print(tree.data + " ");

	        if( tree.left != null ){
	            queue.add( tree.left );
	        }
	        if( tree.right != null ){
	            queue.add( tree.right );
	        }
	    }
	}

	public static Node3 insert(Node3 root,int data){
        if(root==null){
            return new Node3(data);
        }
        else{
            Node3 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node3 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}

class Node3{
    Node3 left,right;
    int data;
    Node3(int data){
        this.data=data;
        left=right=null;
    }
}
