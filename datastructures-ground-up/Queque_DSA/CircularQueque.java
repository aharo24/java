
public class CircularQueque <E> implements BareBonesQueque<E>
{

	// Data 
	private E[] Q;								//Array reference for the actual queue
	private int front;							// front of the queue
	private int rear;							// Back of the queue
	private int size;							// Number of elements in the queue
	private int capacity;						// Total number of spots in the queue
	private final int DEFAULT_CAPACITY = 7;		//Default Capacity
	
	
	// DVX
	public CircularQueque() 
    {
		Q = (E[]) new Object[this.DEFAULT_CAPACITY];	//Queue is created
		this.front = 0;
		this.rear = 0;			//Front and rear 0, no element to begin with
		this.size =0;
		this.capacity = this.DEFAULT_CAPACITY;	
	}
		// EVC
	public CircularQueque(int capacity) 
    {
		this.capacity = capacity; 		// Capacity is given by user
		Q = (E[]) new Object[this.capacity];	//Queue is created
		this.front = 0;
		this.rear = 0;			//Front and rear 0, no element to begin with
		this.size = 0;
		this.capacity = this.DEFAULT_CAPACITY;
	}
	
	@Override
	public void offer(E obj) 
    {

		if(isFull()) {		
			System.out.println("Queue is out of space; calling reallocate");
			reallocate();
			this.offer(obj);	
		
        } else {

			Q[rear] = obj;			// Insert the element
			rear = (rear+1)% this.capacity; 	// Update rear
			size++;								
		}
	}

	private void reallocate() 
    {
				this.capacity *= 2;
				E[] temp = (E[]) new Object[this.capacity];		
				
                for(int i = 0; i < Q.length; i++) 
                {
					temp[i] = Q[i];
				}
	}
	@Override
	public E poll() 
    {
		if(isEmpty()) 
        {
			System.out.println("Queue Underflow!");	

		}

		E temp = Q[front];		// Store the data to be returned
		front = (front + 1)% this.capacity;		//Updates front
		size--;									// Update size
		return temp;							// Return the deleted element
	}

	@Override
	public boolean isEmpty() 
    {
		return (this.size == 0);
	}

	@Override
	public boolean isFull() 
    {
		return(this.size == this.capacity);
	}

	@Override
	public E peek() 
    { return null; }

	public String toString() 
    {
		String s = "Q: ";
		for(int i = front; i < front + size; i++) 
        {
			s += Q[i % this.capacity] + " | ";
		
        } return s;
	}
}