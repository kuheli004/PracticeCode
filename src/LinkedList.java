public class LinkedList {
	Node head;
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Node second=new Node(2);
		Node third=new Node(3);
		Node five=new Node(5);
		l.head=new Node(1);
		l.head.next=second;
		second.next=third;
		
		
		l.push(4);
		//l.insertAfter(third,five);
		l.append(1);
		l.append(1);
		//l.deleteNode(1);
		//l.deleteNodePos(1);
		//l.deleteList();
		l.printList();
	//	l.lengthLinkList();
		int len=l.recursiveLength(l.head);
		//l.swapNode(1,3);
		System.out.println();
		System.out.println(l.count(1));
		l.reversePrint(l.head);
		//l.printNthNode(0);
		//l.printNthNodeFromBack(5);
		//l.middleElement();
		/*System.out.println("len is:::"+len);
		System.out.println(l.Search(0));
		System.out.println(l.IterativeSearch(l.head,3));*/
	}







private void reversePrint(Node n) {
	if(n==null)
		return;
	else 
		 reversePrint(n.next);
	System.out.print(n.data+"----> ");
	}







private int count(int i) {
	int count=0;
		Node n=head;
		while(n!=null){
			if(n.data==i)
				count++;
			n=n.next;
		}
		
		return count;
		
	}



private void deleteList() {
		head=null;
		
	}



private void middleElement() {
	Node n=head,n1=head;
	while(n!=null && n.next!=null){
		n=n.next.next;
		n1=n1.next;
	}
		System.out.println(n1.data);
	}



private void printNthNodeFromBack(int pos) {
	Node n=head,n1=head;
	int len=0;
	while(n1!=null){
		len++;
		n1=n1.next;
	}
	for(int i=0;i<len-pos-1;i++){
		n=n.next;
	}
	System.out.println(n.data);
	}



private void printNthNode(int k) {

	Node n=head;
	for(int i=0;i<k;i++){
		n=n.next;
	}
		System.out.println(n.data);
	}



private void swapNode(int x, int y) {

		if(x==y)
			return;
		Node currX=head,currY=head;
			Node prevX=null,prevY=null;
		while(currX!=null && currY!=null){
			if(currX.data==x && currY.data==y)
				return;
			while(currX.data!=x){
				prevX=currX;
				currX=currX.next;
			}
			while(currY.data!=y){
				prevY=currY;
				currY=currY.next;
			}
		
			if(prevX!=null){
				prevX.next=currY;
				
			}
			else
				head=currY;
			if(prevY!=null){
				prevY.next=currX;
				
			}
			else
				head=currX;
			
			Node temp=currY.next;
			currY.next=currX.next;
			currX.next=temp;
		}

	}



private boolean IterativeSearch(Node n, int i) {
		if(n!=null)
		return (n.data==i)?true:IterativeSearch(n.next,i);
		else
			return false;
	}



private  boolean Search(int i) {
	Node n=head;
	while(n!=null){
		if(n.data==i)
		return true;
		n=n.next;
	}
	return false;
	}

private int recursiveLength(Node n) {
		if (n==null){
			return 0;
		}
		else
			return 1+recursiveLength(n.next);
		
	}

private void lengthLinkList() {
	
	int count=0;
	Node n=head;
	while(n!=null){
		n=n.next;
		count++;
	}
	System.out.println();
		System.out.println("length::::"+count);
	}

private void deleteNodePos(int pos) {
		
		Node n=head;
		if(pos==0)
			head=n.next;
		else{
		for(int i=0;i<pos-1;i++){
			n=n.next;
			}
		n.next=n.next.next;
		}
	}

private void deleteNode(int i) {
	Node temp=head;
	Node prev=null;
	
	while(temp!=null && temp.data==i)
	{
		head=temp.next;
				
	}
	while(temp!=null && temp.data!=i){
		prev=temp;
		temp=temp.next;
	}
	if(temp==null)
		System.out.println("Key Not Found");
	prev.next=temp.next;
	
	}

private void insertAfter(Node Prev, Node NewNode) {
		Node n=head;
		if(Prev==null)
			System.out.println("Previous node cant be null");
		while(n.data!=Prev.data){
			n=n.next;
			
		}
	
		NewNode.next=Prev.next;
		Prev.next=NewNode;
		
	}

private void append(int i) {
	Node temp=new Node(i);
		Node n=head;
		while(n.next!=null)
			n=n.next;
		n.next=temp;
		
		
	}
private void push(int i) {
	Node n=new Node(4);
	n.next=head;
	head=n;
		
	}
private  void printList() {
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"----->");
			n=n.next;
		}
		
	}

	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}

}