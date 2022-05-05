import java.util.Scanner;
public class LinkedListReverse{
	static Node head;
	static class Node{
	int data;
	Node next;
	Node(int value)
	{
		data=value;
		next=null;
	}
	
	}
	static void displayReverse(Node h)
	{
		Node n = h;
		if(n==null)
		return;
		System.out.print("output : ");
		while(n!=null){
		
			System.out.print(n.data+" ");
			n=n.next;
		
		}
	
	}
	static void insertionEnd(int value)
	{
		Node n=head;
		Node newNode=new Node(value);
		if(head==null)
		{
			head = newNode;
			return;
		}
		while(n.next!=null)//{
		
			//System.out.println(n.data+" ");
			n=n.next;
			n.next = newNode;
			return;
		
		//}//check this
	
	
	
	}
	static Node reverseList(Node h){
	
		Node n=h;
		if(n==null)
		{
			System.out.println("list is empty ");
			return n;
			
		}
		else{
			Node current = n;
			Node next=null;
			Node prev=null;
			while(current !=null){
			
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			
			}
			return prev;
		
		
		}
	
	
	
	}
	static int count()
	{
		Node n=head;
		int count=0;
		while(n!=null){
			count++;
			n=n.next;
		
		
		}
		return count;
	
	
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1=sc.nextInt();
		int limit=sc.nextInt();
		
		for(int i=0;i<limit;i++)//{
			insertionEnd(sc.nextInt());
			displayReverse(reverseList(head));
			sc.close();
		
		
		//}//
		
	
	}
	
	
	
	
	
}