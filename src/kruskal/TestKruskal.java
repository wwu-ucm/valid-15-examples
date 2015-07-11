package kruskal;

import junit.framework.*;

import tools.MayBe;

public class TestKruskal extends TestCase{
  
  public TestKruskal(String name){super(name);}
  
  public static Test suite(){
    return new TestSuite(TestKruskal.class);}
  
  public static void main(String[] args){
    junit.textui.TestRunner.run(suite());}
  
  public void testKruskal(){
	  Node node1 = new Node(1);
	  Node node2 = new Node(2);
	  Node node3 = new Node(3);
	  Node node4 = new Node(4);
	  Node node5 = new Node(5);
	  Node node6 = new Node(6);
	  Node node7 = new Node(7);
	  Node[] nodes = {node1,node2,node3,node3,node4,node5,node6,node7};
	  Edge edge1 = new Edge(node1, node2, 7);
	  Edge edge2 = new Edge(node1, node4, 5);
	  Edge edge3 = new Edge(node2, node3, 8);
	  Edge edge4 = new Edge(node2, node4, 9);
	  Edge edge5 = new Edge(node2, node5, 7);
	  Edge edge6 = new Edge(node3, node5, 5);
	  Edge edge7 = new Edge(node4, node5, 15);
	  Edge edge8 = new Edge(node4, node6, 6);
	  Edge edge9 = new Edge(node5, node6, 8);
	  Edge edge10 = new Edge(node5, node7, 9);
	  Edge edge11 = new Edge(node6, node7, 11);
	  Edge[] edges = {edge1, edge2, edge3, edge4, edge5, edge6, edge7, 
	                  edge8, edge9, edge10, edge11};
	  assertTrue(Kruskal.check(edges,nodes));
  }   
}

