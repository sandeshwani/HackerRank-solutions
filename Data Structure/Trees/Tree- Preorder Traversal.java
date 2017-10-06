/* Method 1:  recursion 
Time C : O(n)
Space com: O(n)
*/

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    
    if(root == null){
        return;
    }
    
    System.out.print(root.data + " " );
    preOrder(root.left);
    preOrder(root.right);
    
    
}


/* Method 2:  using stack 
https://www.youtube.com/watch?v=elQcrJrfObg&t=245s
Time C : O(n)
Space com: O(n)
*/


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    
    if(root == null){
        return;
    }
    Node current = root;
    Stack<Node> s = new Stack<Node>();
    s.push(current);
    while(!s.isEmpty() ){
        
        current = s.pop();
        System.out.print(current.data + " ");
        
        if(current.right != null){
            s.push(current.right);
        }
        
        if(current.left != null){
            s.push(current.left);
        }
        
    }
    
    
}

