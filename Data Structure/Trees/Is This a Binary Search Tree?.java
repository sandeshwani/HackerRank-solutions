/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    boolean checkBST(Node root) {
      
      int min = Integer.MIN_VALUE;
      int max = Integer.MAX_VALUE;
      
      return isBST(root, min, max);
        
    }
    
    boolean isBST(Node root, int min, int max){
        
        if(root == null){
            return true;
        }
        else if(root.data > min && root.data < max){
            return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
        }
        else {
            return false;
        }
        
    }

