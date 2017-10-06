/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    if(headA == null && headB == null){
        return 1;
    }
    if((headA == null && headB != null ) || (headA != null && headB == null)){
        return 0;
    }
    Node a = headA;
    Node b = headB;
    while(a != null || b != null){
        try {
            if(a.data != b.data){
            return 0;
            }
        }
        catch(Exception e){
                return 0;
            }
        a = a.next;
        b = b.next;
    }
    return 1;
}

