package kruskal;

//import java.util.ArrayList;

/**
 * 
 * @author kuchen
 *
 */
public class Node {
	private int				number;
//	private ArrayList<Edge>	edges;

	public Node(int number) {
		this.number = number;
//		this.edges = new ArrayList<Edge>();
	}

	public int getNumber() {
		return this.number;
	}

//	public ArrayList<Edge> getEdges() {
//		return this.edges;
//	}

//	public void addEdge(Edge edge) {
//		this.edges.add(edge);
//	}
	
//	public boolean hasEdgeWith(Node node) {
//		for (Edge edge : this.edges)
//		{
//			if (edge.getNode1() == node || edge.getNode2() == node)
//				return true;
//		}
//		return false;
//	}
	
//	@Override
//	public String toString() {
//		return "Node " + this.number; 
//	}

}