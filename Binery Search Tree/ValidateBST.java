import java.util.*;
class ValidateBST{
    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            // this.left=left;
            // this.right=right;
        }
    } 
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val){
            // right sub-tree..
            root.right = insert(root.right , val);
        }else{
            // left sub-tree...
            root.left = insert(root.left , val);
        }

        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean isValid(Node root , Node min , Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }else{
            return isValid(root.left , min ,root)
                    && isValid(root.right ,root,max);
        }
    }
    public static void main(String args[]){
        int values[] = {5,2,1,4,8,6};
        Node root = null;
        // Node min == null;
        // Node max == null;

        for(int i=0;i<values.length;i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
        System.out.println();

        if(isValid(root ,null,null)){
            System.out.println("Valid...");
        }else{
            System.out.println("Not Valid ...");
        }

    }
}