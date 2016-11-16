class Stack<T>
{
	LinkedList l1= new LinkedList() ;
	int i,j,size=0;
	Node head, tail;
	public void push( T data)
	{
		// Node obj= new Node(data);
		l1.pushFront(data);
	}
	public Object pop()
	{
		if(l1.popBack()==null)	return null; 
		else return l1.popBack();
	}
	public boolean isEmpty()
	{
		if (l1.isEmpty()) return true;
		else return false;
	}
	public Object peek()
	{
		return (l1.gethead()).getData();
	}
	public void print()
	{
		l1.print();
	}
}
class TestStack<T>
{
	public static void main(String[] args) {
	Stack s = new Stack();
	s.push(1);
	s.push('w');
	s.push("s");
	s.print();
	}

	
}