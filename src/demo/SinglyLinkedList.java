package demo;
public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head = null;
	private Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	void deleteNode(int key)
    {
        // Store head node
        Node temp = head;
        Node previousNode = null;
 
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
        
        while (temp != null && temp.data != key) {
            previousNode = temp;
            temp = temp.next;
        }
  
        if (temp == null)
            return;
       
        previousNode.next = temp.next;
    }
	public void displayList() {
		Node current = head;
		if(head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNode(10);
		list.addNode(90);
		list.addNode(40);
		list.addNode(23);
		list.addNode(50);
		list.addNode(56);
		list.addNode(89);
		
		list.displayList();
		
		list.deleteNode(23);
		System.out.println("-------------------------");
		list.displayList();
	}
}
