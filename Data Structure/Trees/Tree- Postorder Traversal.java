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

void postOrder(Node root) {
    
    if(root == null){
        return ;
    }
    
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
    
}


/* Method 2:  using two stack, s1 and s2
https://www.youtube.com/watch?v=qT65HltK2uE
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

void postOrder(Node root) {
    
    if(root == null){
        return;
    }
    Node current = root;
    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();
    s1.push(current);
    
    while(!s1.isEmpty()){
        
        current = s1.pop();
        s2.push(current);
        if(current.left != null){
             s1.push(current.left);
        }
        if(current.right != null){
            s1.push(current.right);
        }
        
    }
    while(!s2.isEmpty()){
        Node print = s2.pop();
        System.out.print(print.data+ " ");
    }
}


/* Method 3:  using one stack
https://www.youtube.com/watch?v=xLQKdq0Ffjg
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

void postOrder(Node root) {
    
    if(root == null){
        return;
    }
    Node current = root;
    Stack<Node> s = new Stack<Node>();
    
   try{
       while(current != null || !s.isEmpty()){
        
        if(current != null){
            s.push(current);
            current = current.left;
        }
        else if(current == null){
            Node temp1 = s.pop();
            if(temp1.right == null){
                System.out.print(temp1.data + " ");
            }
            else if(temp1.right != null){
                s.push(temp1);
                current = temp1.right;
                continue;
            }
            
            Node temp2 = s.pop();
            while(temp2.right == temp1){
                System.out.print(temp2.data + " ");
                temp1 = temp2;
                temp2 = s.pop();
                current = null;
                continue;
            }
            s.push(temp2);
            current = temp2.right;   
        
        }
    }
       
       
   } 
    catch(Exception e){
           
       }
    
}



