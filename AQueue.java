

class AQueue<E> implements Queue<E> {

  // Keep this non-private for testing purposes!
  E queueArray[]; // Array holding queue elements

  private static final int defaultSize = 10;
  private int front; // Index of front element
  private int size; // Number of elements stored.

  // Constructors
  @SuppressWarnings("unchecked") // Generic array allocation
  AQueue(int capacity) {
    //COMPLETE THIS
    //Initialize front and size variable to 0
    this.front = 0;
    this.size = 0;
    // Create queueArray with capacity as the size of the array
    this.queueArray = (E[]) new Object[defaultSize];
  }


  AQueue() {
    this(defaultSize);
  }

  // Reinitialize
  public void clear() {
    //COMPLETE THIS
    this.front = 0;
    this.size = 0;
  }

  // Put "it" in queue
  public boolean enqueue(E it) {
    if(size >= queueArray.length) {
      return false;
    }
    else {
    int i = (front + size) % queueArray.length;
    queueArray[i] = it;
    size++;
    return true;
    }
  }

  // Remove and return front value
  public E dequeue() {
   //COMPLETE THIS
   if(size == 0) {
     return null;
   }
   E item = queueArray[front++];
   front %= queueArray.length;
   return item;
  }

  // Return front value
  public E frontValue() {
    //COMPLETE THIS
    return queueArray[front];
  }

  // Return queue size
  public int length() {
    //COMPLETE THIS
    return size;
  }
}