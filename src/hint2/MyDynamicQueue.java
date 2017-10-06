package hint2;


public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode current = null;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		if(current == null)
		{
			return true;
		}

		return false;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first(){

		if(current == null)
		{
			System.out.print("ERROR: MyQueue is empty.");
			return -1;
		}
		else
		{
			return current.getInfo();
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){

		if(current == null)
		{
			current = new MyNode(element, null);
		}
		else
		{
			MyNode next = current.getNext();
			MyNode previous = current;
			
			while(next != null)
			{
				previous = next;
				next = next.getNext();
			}
			
			previous.setNext(new MyNode(element, null));
			
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){

		if(current == null)
		{
			System.out.println("ERROR: MyQueue is empty.");
		}
		else
		{
			current = current.getNext();
		}
	}
}
