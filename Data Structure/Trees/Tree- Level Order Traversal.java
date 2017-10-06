   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       
       if(root == null){
           return ;
       }
       Queue<Node> q = new LinkedList<Node>();
       Node current = root;
       q.add(current);
       while(!q.isEmpty()){
           current = q.poll();
          /*
          this algo can also be used for finding the size of the tree. which is number of nodes. below size++ will do that.
          */
           // size++;
           System.out.print(current.data + " ");
           if(current.left != null){
               q.add(current.left);
           }
           if(current.right != null){
               q.add(current.right);
           }
           
       }
      
    }

