package week7Task;

public class LinkedList {
	
	static int size = 0;
	 Node head;
	 static class Node { 
	 
	     int data; 
	     Node next;
	 
	     Node(int d) 
	     { 
	         data = d; 
	         next = null; 
	     } 
	 } 
	 
	 public static LinkedList insert(LinkedList list, int data) 
	 { 
	     Node new_node = new Node(data); 
	       
	 
	     if (list.head == null) { 
	         list.head = new_node;
	         size++;
	     } 
	     else { 
	         Node last = list.head; 
	         while (last.next != null) { 
	             last = last.next; 
	         } 
	 
	         last.next = new_node; 
	         size++;
	     } 
	 
	     return list; 
	 }
	 
	 public static LinkedList reverse(LinkedList list) {
		 
		 int tempArray[] = new int[size];
		 
		 Node currNode = list.head; 
		  
		 for(int i=0; i<size; i++) {
			
			 tempArray[i] = currNode.data;
	        
			 currNode = currNode.next;
		 }
		 
		 list.head = new Node(tempArray[size - 1]);
		 currNode = list.head; 
		 
         for(int i=size - 2; i>=0; i--) {
 			
			 Node newNode = new Node(tempArray[i]);
	        
			 currNode.next = newNode;
			 currNode = currNode.next;
		 }
		 
		 return list; 
	 }
	 
	 public static LinkedList sort(LinkedList list) {
		 
		 if(list.head == null) {
			 return list;
		 }
		 
		 Node outerNode = list.head;
		 Node innerNode;
		 int temp;
		 
		 while(outerNode != null) {
			 
			 innerNode = outerNode.next;
			 
			 while(innerNode != null) {
				 
				 if(outerNode.data > innerNode.data) {
					  temp = outerNode.data;
					  outerNode.data = innerNode.data;
					  innerNode.data = temp;
				 }
				 
				 innerNode = innerNode.next;
				 
			 }	 
			 
			 outerNode = outerNode.next;
		 }
		 
		 
		 return list;
	 }
	 
	 public static LinkedList delete3rdElement(LinkedList list) {
		 
		 Node secondNode = list.head.next;
		 
		 if(secondNode.next.next == null) {
			 secondNode.next = null;
		 }else {
			 secondNode.next = secondNode.next.next;
		 }
		
		 return list;
	 }
	 
	 public static LinkedList delete1stElement(LinkedList list) {
		 
		 if(list.head.next == null) {
			 list.head = null;
		 }else {
			 list.head = list.head.next;
		 }
		
		 return list;
	 }
	 
	 public static LinkedList delete3rdElementFromLast(LinkedList list) {
		 
		 Node slow = list.head;
		 Node fast = list.head;
		 for(int i=0; i<2; i++) {
			 fast = fast.next;
		 }
		 
		 while(fast.next != null) {
			 if(fast.next.next == null) {
				 slow.next = slow.next.next;
				 break;
			 }
			 fast = fast.next;
			 slow = slow.next;
		 }
		
		 return list;
	 }
	 

	 
	 public static LinkedList deleteNthElement(LinkedList list, int n) {
		 
		 if(n>size) {
			 return list;
		 }
		 
		 if(n==1) {
			 if(list.head.next == null) {
				 list.head = null;
			 }else {
				 list.head = list.head.next;
			 }
			 
			 return list;
		 }
		 
		 Node currNode = list.head;
		 for(int i=1; i<n-1; i++) {
			 currNode = currNode.next;
		 }
		 
		 if(currNode.next.next == null) {
			 currNode.next = null;
		 }else {
			 currNode.next = currNode.next.next;
		 }
		
		 return list;
		 
	 }
	 
	 public static LinkedList deleteNthElementFromLast(LinkedList list, int n) {
		 if(n>size) {
			 return list;
		 }
		 
		 if(n==size) {
			 if(list.head.next == null) {
				 list.head = null;
			 }else {
				 list.head = list.head.next;
			 }
			 
			 return list;
		 }
		 
		 Node slow = list.head;
		 Node fast = list.head;
		 for(int i=1; i<n; i++) {
			 fast = fast.next;
		 }
		 
		 while(fast.next != null) {
			 if(fast.next.next == null) {
				 slow.next = slow.next.next;
				 break;
			 }
			 fast = fast.next;
			 slow = slow.next;
		 }
		
		 return list;
		 
	 }
	 
	 
	 public static void printList(LinkedList list) 
	 { 
	     Node currNode = list.head; 
	  
	     while (currNode != null) { 
	         System.out.print(currNode.data + " "); 
	  
	         currNode = currNode.next; 
	     } 
	 } 
	  
	 public static void main(String[] args) 
	 { 
	     LinkedList list = new LinkedList(); 
	 
	     list = insert(list, 1); 
	     list = insert(list, 5); 
	     list = insert(list, 9); 
	     list = insert(list, 12); 
	     list = insert(list, 100); 
	     list = insert(list, 150); 
	 
	     System.out.print("LinkedList: "); 
	     printList(list); 
	     
	     System.out.print("\nReverse LinkedList: "); 
	     reverse(list);
	     printList(list);
	     
	     System.out.print("\nSorted LinkedList: "); 
	     sort(list);
	     printList(list);
	     
	     System.out.print("\n3rd element deleted: "); 
	     delete3rdElement(list);
	     printList(list);
	     
	     System.out.print("\n1st element deleted: "); 
	     delete1stElement(list);
	     printList(list);
	     
	     System.out.print("\n3rd element from last deleted: "); 
	     delete3rdElementFromLast(list);
	     printList(list);
	     
	     //Extra from task
	     
	     //deleteNthElement(list,2);
	     //printList(list);
	     
	     //deleteNthElementFromLast(list,4);
	     //printList(list);

	     
	 } 
	
}
