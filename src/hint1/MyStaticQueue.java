package hint1;


public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private int[] items;
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyStaticQueue(int m){
		this.maxItems = m;
		this.items = new int[m];
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
		if(numItems == 0)
		{
			return true;
		}

		return false;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first(){
		if(!isEmpty())
		{
			return items[0];
		}
		
		System.out.println("ERROR: MyQueue is empty.");
		return -1;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){

		if(maxItems == numItems)
		{
			System.out.println("ERROR: MyQueue is full.");
		}
		else
		{
			items[numItems] = element;
			
			numItems++;
		}

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){

		if(isEmpty())
		{
			System.out.println("ERROR: MyQueue is empty.");
		}
		else
		{
			//Reset value to negative 1
			items[0] = -1;
			
			//Shift the rest of the items if there is more than 1 (No need to do if check, for loop won't start if 1 or less anyway)
			for(int i = 0; i < (numItems - 1); i++)
				items[i] = items[i + 1];
			
			numItems--;
			
		}
	}

}
