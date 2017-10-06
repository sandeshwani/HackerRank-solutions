
/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
/*
Link of algo:
https://www.youtube.com/watch?v=j_UNYW6Ap0k
*/
Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    if(headA == null)
        return headB;
    if(headB == null)
        return headA;
    
    Node S = new Node();
    if(headA.data <= headB.data){
        S = headA;
        headA = S.next;   
    }
    else {
        S = headB;
        headB = S.next;
    }
    
    Node mainNode = S;
    
    while((headA != null) && (headB != null)){
        if(headA.data <= headB.data){
            S.next = headA;
            S = headA;
            headA = S.next;
        }
        else {
            S.next = headB;
            S = headB;
            headB = S.next;
            }
    }
    if(headA == null){
        S.next = headB;
    }
    if(headB == null){
        S.next = headA;
    }
    return mainNode;
}

