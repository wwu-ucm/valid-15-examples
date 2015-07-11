package kruskal;

public class Edge implements Comparable<Edge> {
	private Node	node1;
	private Node	node2;
	private int		weight;
//	private boolean	inMinimalSpanningTree;

	public Edge(Node node1, Node node2, int weight) {
		this.node1 = node1;
//		this.node1.addEdge(this);
		this.node2 = node2;
//		this.node2.addEdge(this);
		this.weight = weight;
//		this.inMinimalSpanningTree = false;
	}

	public Node getNode1() {
		return this.node1;
	}

	public Node getNode2() {
		return this.node2;
	}

	public int getWeight() {
		return this.weight;
	}

//	public boolean isInMinimalSpanningTree() {
//		return this.inMinimalSpanningTree;
//	}
//
//	public void setInMinimalSpanningTree(boolean value) {
//		this.inMinimalSpanningTree = value;
//	}

	public int compareTo(Edge e) {
		if (this.weight < e.weight) return -1;
		if (this.weight > e.weight) return 1;
		return 0;
	}
	
//	@Override
//	public String toString() {
//		String info = "";
//		if (this.inMinimalSpanningTree) info = " (in minimal spanning tree)";
//		return "Edge between " + this.node1.getNumber() + " and " + this.node2.getNumber() + " with weight " + this.weight + info; 
//	}

}