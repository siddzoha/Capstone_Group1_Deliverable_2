
public class Node {
	String payLoad;
	Node nextNode;
	
	public Node (String payLoad) {
		this.payLoad = payLoad;
		// this.nextNode = nextNode;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
