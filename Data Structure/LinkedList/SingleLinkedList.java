/* Single Linked List with every operation */

public class SingleLinkedList{
	
	public void display(ListNode head){
		if(head == null){
			return;
		}
		ListNode current = head;
		while(current != null){
			
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);
		
	}
	
	public int length(ListNode head){
		if(head == null)
		return 0;
		ListNode current = head;
		int count = 0;
		while(current !=null){
			count++;
			current = current.next;
		}
		return count;
		
	}
	
	public ListNode insertAtBegnining(ListNode head, int data){
		ListNode newNode = new ListNode(data);
		if(head == null)
			return newNode;
		
		newNode.next = head;
		head = newNode;
		return head;
		//System.out.println(head);
	}
	
	public ListNode insertAtEnd(ListNode head, int data){
		ListNode newNode = new ListNode(data);
		if(head == null)
			return newNode;
		ListNode current = head;
		while(current.next !=null){
			current = current.next;
		}
		current.next = newNode;
		return head;
	}
	
	public ListNode insertAfter(ListNode previous, int data, ListNode head){
		if(previous == null){
			System.out.println("The given previous node cannot be null");
			return null;
		}
		ListNode newNode = new ListNode(data);
		newNode.next = previous.next;
		previous.next = newNode;
		return head;
	}
	
	public ListNode insertAtPosition(ListNode head, int position, int data){
		int size = length(head);
		if(position > size +1 || position < 1 ){
			System.out.println("Invalid Position");
			return head;
		}
		ListNode newNode = new ListNode(data);
		if(position == 1){
			newNode.next = head;
			head = newNode;
			return head;
		}
		ListNode temp = head;
		int count = 1;
		while(count < position -1 ){
			temp = temp.next;
			count++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
		
	}
	
	public ListNode deleteFirstNode(ListNode head){
		if(head == null)
			return head;
		
		ListNode current = head;
		current = head.next;
		head.next = null;
		return current;
		
	}
	public ListNode deleteLastNode(ListNode head){
		if(head == null)
			return head;
		
		ListNode current = head;
		ListNode previousToLast = null;
		
		while(current.next!= null){
			previousToLast = current;
			current = current.next;
		}
		
		previousToLast.next = null;
		return head;
		
		
		
	}
	public ListNode deleteAtPosition(ListNode head, int position){
		int size = length(head);
		if(size < position || position < 1 ){
			System.out.println("Invalid Position");
			return head;
		}
		
		if(position == 1){
			ListNode newhead = head.next;
			head.next =null;
			return newhead;
		}
		else{
			ListNode previous = head;
			int count =1;
			while(count < position - 1){
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
			current.next = null;
			return head;
			
		}
		
	}
	
	public boolean search(ListNode head, int searchKey){
		if(head == null){
			return false;
		}
		ListNode current = head;
		while(current !=null){
			if(current.data == searchKey)
				return true;
			current = current.next;
		}
		return false;
	}
	
	public ListNode reverse(ListNode head){
		if(head == null){
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

public static class ListNode{
	
	int data;
	ListNode next;
	
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
	
	public String toString(){
		return Integer.toString(data) +"-->" + next;
	}
	
}
	
	public static void main(String args[]) {  
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		//System.out.println(head);
		
		SingleLinkedList obj = new SingleLinkedList();
		
		System.out.println("Display of original list:");
		obj.display(head);
		System.out.println();
		
		System.out.println("Insert after second node (second node is pointing to 8 here):");
		head = obj.insertAfter(second, 26, head);
		System.out.println(head);
		System.out.println();
		
		System.out.println("Length of list: " + obj.length(head));
		System.out.println();
		
		/* if you are inserting at the begnining, you should the head so here we have, head = obj..... */
		System.out.println("Insert in the begnining: 15");
		head = obj.insertAtBegnining(head, 15);
		System.out.println("Display after inserting new node at begnining:");
		obj.display(head);
		System.out.println();
		
		/*we dont have to update anything if we are adding at the end. */
		System.out.println("Insert in the end: 100");
		head = obj.insertAtEnd(head, 100);
		//obj.insertAtEnd(head, 100); we can use this but its better to do which applies to everything.
		System.out.println("Display after inserting new node at end:");
		obj.display(head);
		System.out.println();
		
		System.out.println("Insert after second node (second node is pointing to 8 here):");
		head = obj.insertAfter(second, 30, head);
		obj.display(head);
		System.out.println();
		
		System.out.println("Insert at position 2:");
		head = obj.insertAtPosition(head, 2, 87);
		obj.display(head);
		System.out.println();
		
		System.out.println("Delete first node");
		head = obj.deleteFirstNode(head);
		obj.display(head);
		System.out.println();
		
		System.out.println("Delete last node");
		head = obj.deleteLastNode(head);
		obj.display(head);
		System.out.println();
		
		System.out.println("Delete at position 3:");
		head = obj.deleteAtPosition(head, 3);
		obj.display(head);
		System.out.println();
		
		System.out.println("Search");
		if(obj.search(head, 1)){
			System.out.println("found");
		}
		else{
			System.out.println("not found");
		}
		System.out.println();
		
		System.out.println("Reverse");
		head = obj.reverse(head);
		obj.display(head);
		System.out.println();
			   
	  }  
	
	
}