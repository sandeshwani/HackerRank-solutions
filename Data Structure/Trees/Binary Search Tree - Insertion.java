 /*
 Method 1: without recursion
 */
 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
    
    Node n = new Node();
    n.left = null;
    n.data = value;
    n.right = null;
    
    if(root == null){
        return n;
    }
    
    Node current = root;
    Node parent = new Node();
    while(true){
        if(current == null){
            if(parent.data > value){
                parent.left = n;
                break;
            }
            else if(parent.data <= value){
                parent.right = n;
                break;
            }
        }
        else if(current != null){
            if(current.data < value){
            current = current.right;
            }
        else if(current.data > value){
            parent = current;
            current = current.left;
            }
        }
       
    }
    return root;
}

/*
Method 2: with recursion
*/

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
   
    Node current = root;
    if(root == null){
        Node n = new Node();
        n.left = null;
        n.right = null;
        n.data = value;
        return n;
    }
    
   if(root.data < value){
       root.right = Insert(root.right, value);
   }
    else if(root.data >= value){
        root.left = Insert(root.left, value);
    }
    
    return current;

}