void Print(Node head) {
    if(head != null){
        Node current = head;
        while(current !=null){
        System.out.println(current.data);
        current = current.next;
        }
   }
}