
public class LinkedListRunnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MinkedList ll = new MinkedList();
//        ll.display();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addFirst(50);
        ll.addLast(40);
        ll.display();
	}


}

class MinkedList {

	private class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	
	public void display()
	{
	   Node temp = this.head;
	   while(temp!=null)
	   {
		   System.out.print(temp.data+"->");
		   temp = temp.next;
		   
	   }
	   System.out.print("null");
	}
	public void addLast(int item)
	{
		
		//creating node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		//attach
		        
		// when there is atleast one node in linked list
	       if(this.size>=1)
	       {
	    	   this.tail.next = nn;
	       }
	       
	       //  update summary objects
		if(this.size==0) {			
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else
		{
			this.tail = nn;
			this.size++;
		}
	}
	
	public void addFirst(int item)
	{
		//create node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		//attach
		if(this.size>=1)
		{
			nn.next = this.head;
		}
		
		//summary object updation
		if(this.size==0)
		{
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else
		{
			this.head = nn;
			this.size++;
		}
	}
}