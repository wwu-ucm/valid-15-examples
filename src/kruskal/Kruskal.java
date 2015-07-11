package kruskal;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

import tools.MayBe;


public class Kruskal {

	public static Vector<Edge> minimalSpanningTree(Edge[] edges, Node[] nodes) {
		// Put all edges into a PriorityQueue.
		PriorityQueue<Edge> queue = new PriorityQueue<Edge>();
		for (Edge edge : edges) 
			queue.add(edge);
		UnionFind uf = new UnionFind(nodes);
		Vector<Edge> spanningEdges = new Vector<Edge>();

		// Find the edges...
		while (queue.size() > 0) {
			// Get the next edge...
			Edge edge = queue.poll();
			// edge produces no circle?
			if (!uf.find(edge.getNode1()).equals(uf.find(edge.getNode2()))){
			  // add it to the minimal spanning tree
			  spanningEdges.add(edge);
			  uf.union(edge.getNode1(),edge.getNode2());
			}}
		return spanningEdges;
	}
	
    /**
     * So here RL made an error in their algorithm.
     */
	public static Vector<Edge> minimalSpanningTreeRL(Edge[] edges, Node[] nodes) {
		// Put all edges into a PriorityQueue.
		PriorityQueue<Edge> queue = new PriorityQueue<Edge>();
		for (Edge edge : edges) 
			queue.add(edge);
		UnionFindRL uf = new UnionFindRL(nodes);
		Vector<Edge> spanningEdges = new Vector<Edge>();

		// Find the edges...
		while (queue.size() > 0) {
			// Get the next edge...
			Edge edge = queue.poll();
			// edge produces no circle?
			if (!uf.find(edge.getNode1()).equals(uf.find(edge.getNode2()))){
			  // add it to the minimal spanning tree
			  spanningEdges.add(edge);
			  uf.union(edge.getNode1(),edge.getNode2());
			}}
		return spanningEdges;
	}
	
	  public static int sum(Vector<Edge> edges){
		  int result = 0;
		  for (Edge e: edges)
			  result += e.getWeight();
		  return result;
	  }
	
	public static boolean check(Edge[] edges, Node[] nodes){
		boolean check = sum(Kruskal.minimalSpanningTree(edges,nodes)) ==
		                sum(Kruskal.minimalSpanningTreeRL(edges, nodes));
		assert check : "error of Rabhi/Lapalme exposed";
		return check;
	}
}
