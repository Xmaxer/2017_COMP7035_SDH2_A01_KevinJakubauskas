package hint3;


public class MyDoubleDynamicQueue<T> implements MyQueue<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyDoubleLinkedNode<T> head = null;
	private MyDoubleLinkedNode<T> tail = null;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicQueue(){

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: isEmpty
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
	public T first(){
		
		if(head == null)
		{
			System.out.println("ERROR: List is empty.");
			return null;
		}
		return head.getInfo();
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element){

		if(head == null)
		{
			head = new MyDoubleLinkedNode<T>(null ,element, null);
			tail = head;
		}
		else
		{
			MyDoubleLinkedNode<T> newNode = new MyDoubleLinkedNode<T>(null , element, head);
			head.setLeft(newNode);
			head = newNode;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){

		if(head != null)
		{
			head = head.getRight();
			
			if(head != null)
			{
				head.setLeft(null);
			}
			else
			{
				tail = null;
			}
			/*if(current.getRight() != null)
			{
				current.getRight().setLeft(null);
				current = current.getRight();
			}
			else
			{
				current = null;
				old = null;
			}*/
		}
		else
		{
			System.out.println("ERROR: List is empty.");
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: last
	//-------------------------------------------------------------------
	public T last(){

		if(head == null)
		{
			System.out.println("ERROR: List is empty.");
			return null;
		}
		
		return tail.getInfo();

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){

		if(head == null)
		{
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head;
		}
		else
		{
			MyDoubleLinkedNode<T> newNode = new MyDoubleLinkedNode<T>(tail, element, null);
			tail.setRight(newNode);
			tail = newNode;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){

		if(head == null)
		{
			System.out.println("ERROR: List is empty.");
			return;
		}
		
		tail = tail.getLeft();
		
		if(tail != null)
		{
			tail.setRight(null);
		}
		else
		{
			head = null;
		}
	}
}
