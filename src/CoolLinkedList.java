
public class CoolLinkedList {
	private static int size;
	private Node head;
	private Node current;
	// private Node tail;
	
	
	public CoolLinkedList() {
		this.head = null;
		this.current = null;
		this.size = 0;
	}
	
	public Integer size() {
		return size;
	}
	
//	public void addToFront(String payLoad) {
//		Node newNode = new Node(payLoad);
//		if (head == null) {
//			head = newNode;
//			current = newNode;
//		}
//		newNode.setNextNode(head);
//		head = newNode;
//		size++;
//	}
	
	public void addToFront(String payLoad) {
		Node newNode = new Node(payLoad);
		newNode.setNextNode(head);
	    head = newNode;
		size++;
	}
	
	public void addToEnd(String payLoad) {
		Node newNode = new Node(payLoad);
		if (head == null) { // If head is null, the list is empty
			head = newNode;
			size++;
		} else {
			Node current = head;
			while (current.nextNode != null) { // Going through the last node
				current = current.nextNode;
			}
			current.setNextNode(newNode);
			size++;
		}
		
		
	}
	
	public String getIndex(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		Node current = head;
		if (index == 0) {
			return current.payLoad;
		} else {
			for (int i = 0; i != index; i++) {
				current = current.nextNode;
			}
			return current.payLoad;
		}
		
	}
	
	@Override
	public String toString() {
		Node current = head;
		String value = "";
			while (current.nextNode != null) {
				value += current.payLoad;
				current = current.nextNode;
			}
		value += current.payLoad;
		return value;
	}
	
	public static void main(String[] args) {
		CoolLinkedList list = new CoolLinkedList();
		list.addToFront("1");
		list.addToFront("2");
		list.addToFront("3");
		System.out.println(list.getIndex(0)); // Output: 3
		System.out.println(list.getIndex(1)); // Output: 2
		System.out.println(list.getIndex(2)); // Output: 1
		System.out.println(list.getIndex(3)); // Output: null
		
		
		list.addToEnd("4");
		list.addToFront("5");
		list.addToEnd("6");
		list.addToEnd("7");
		list.addToFront("8");
		list.addToFront("9");
		list.addToEnd("10");
		System.out.println(list.toString());
		System.out.println(list.size());
		
	}
	
	
}
