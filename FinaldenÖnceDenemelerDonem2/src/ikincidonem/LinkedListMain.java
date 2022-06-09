package ikincidonem;
import ikincidonem.LinkedList.Node;
public class LinkedListMain {
	 Node head;
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
     ll.head = new Node(1);
     Node second = new Node(2);
     Node third = new Node(3);  
     ll.head.next = second;
     second.next = third;
	 ll.InsertMiddle(second , 10);
     ll.insertAtEnd(4);
     ll.deletNode(2);
	 System.out.println("LinkedList : ");

     while (ll.head != null) {
    	 System.out.print(ll.head.value);
    	 ll.head = ll.head.next;
     }}
 public void insertAtEnd(int data) {
	 Node new_node = new Node (data);
	 
	 if(head == null) {
		 head = new Node(data);
		 return;
	 } 
	 new_node.next = null;
	 
	 Node last = head;
	 while(last.next != null) {
		 last = last.next;
		 last.next = new_node;
	 }
 }
 public void InsertMiddle(Node prev_node , int data) {
	 if(prev_node == null ) 
		 System.out.println("Can not insert at this position");
	    Node new_node = new Node (data);
	    new_node.next = prev_node.next;
	    prev_node.next = new_node;
	  
 }
 public void deletNode(int position) {
	 if(head == null) {
 System.out.println("Empty LinkedList !!! ");

     Node node = head;
 if(position == 0) {
	 head = node.next;
	 for (int i = 0; node != null && i < position -1 ; i++) {
		node = node.next;
		if(node == null && node.next == null) 
			 System.out.println("Empty LinkedList !!! ");
         Node next = node.next;
         node.next = next;
	 }
 }
	 }}}



