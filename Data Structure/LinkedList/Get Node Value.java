/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    
    int size = -2;
    Node tempHead = head;
    while(tempHead != null){
        //System.out.println(tempHead.data);
        tempHead = tempHead.next;
        size++;
    }
    
    tempHead = head.next; 
    //System.out.println(head.data);
    for(int i=size; i>=0; i-- ){
        if(i != n){
            //System.out.println(tempHead.data);
            tempHead = tempHead.next;;
        }if(i == n){
            break;
        }
        
    }
    return tempHead.data;
}

