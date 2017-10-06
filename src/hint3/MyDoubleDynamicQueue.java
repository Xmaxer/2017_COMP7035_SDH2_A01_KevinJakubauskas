package hint3;


public class MyDoubleDynamicQueue<T> implements MyQueue<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyDoubleLinkedNode<T> current = null;
	private MyDoubleLinkedNode<T> last = null;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicQueue(){

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: isEmpty
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
	public T first(){

		return current.getInfo();
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element){

		if(current == null)
		{
			current = new MyDoubleLinkedNode<T>(null ,element, null);
			last = current;
		}
		else
		{
			MyDoubleLinkedNode<T> newNode = new MyDoubleLinkedNode<T>(null , element, current);
			current.setLeft(newNode);
			current = newNode;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){

		if(current != null)
		{
			current = current.getRight();
			
			if(current != null)
			{
				current.setLeft(null);
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

		if(current == null)
		{
			System.out.println("ERROR: List is empty.");
			return null;
		}
		
		return last.getInfo();

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){

		if(current == null)
		{
			current = new MyDoubleLinkedNode<T>(null, element, null);
			last = current;
		}
		else
		{
			MyDoubleLinkedNode<T> newNode = new MyDoubleLinkedNode<T>(last, element, null);
			last.setRight(newNode);
			last = newNode;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){

		if(current == null)
		{
			System.out.println("ERROR: List is empty.");
			return;
		}
		
		last = last.getLeft();
		
		if(last != null)
		{
			last.setRight(null);
		}	
	}
}
