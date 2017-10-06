package hint2;


public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode head = null;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		if(head == null)
		{
			return true;
		}

		return false;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first(){

		if(head == null)
		{
			System.out.print("ERROR: MyQueue is empty.");
			return -1;
		}
		
		return head.getInfo();
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){

		MyNode newNode = new MyNode(element, null);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			MyNode next = head.getNext();
			MyNode previous = head;

			while(next != null)
			{
				previous = next;
				next = next.getNext();
			}

			previous.setNext(newNode);

		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){

		if(head == null)
		{
			System.out.println("ERROR: MyQueue is empty.");
		}
		else
		{
			head = head.getNext();
		}
	}
}
