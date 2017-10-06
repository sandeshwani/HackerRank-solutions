

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
{
    Node ancestor = new Node();
    
    if((root.data == v1 || root.data == v2) || ((root.data > v1 && root.data < v2) || (root.data < v1 && root.data > v2))){
        return root;
    }
    else if(root.data < v1 && root.data < v2){
        ancestor = lca(root.right, v1, v2);
    }
    else if(root.data > v1 && root.data > v2){
        ancestor = lca(root.left, v1, v2);
    }
        return ancestor;
}
