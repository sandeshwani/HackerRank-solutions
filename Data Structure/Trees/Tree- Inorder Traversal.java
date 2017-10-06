/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

/* Method 1:  recursion 
Time C : O(n)
Space com: O(n)
*/

void inOrder(Node root) {
    
    if(root == null){
        return;
    }
    
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
}

/* Method 2:  using stack 
https://www.youtube.com/watch?v=nzmtCFNae9k&t=327s
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

void inOrder(Node root) {
    
    if(root == null){
        return;
    }
   Stack<Node> s = new Stack<Node>();
    Node current = root;
    
   while(true){
       
       if (current != null){
       s.push(current);
       current = current.left;   
       }
       
       if(current == null){
           
           if(s.isEmpty()){
               break;
           }
           
           current = s.pop();
           System.out.print(current.data + " ");
           current = current.right;   
       }   
   }
}

