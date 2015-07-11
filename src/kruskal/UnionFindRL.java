package kruskal;

import java.util.HashMap;

public class UnionFindRL {
  private HashMap<Node,Node> parent = new HashMap<Node,Node>();
  
  public UnionFindRL(Node[] nodes){
    for(Node n: nodes)
      parent.put(n,n);
  }
  
  public void union(Node n1, Node n2){
    Node r1 = find(n1);
    Node r2 = find(n2);
    // correct: parent.put(r1,r2);
    parent.put(n1,r2); // similar to Rabhi/Lapalme, p. 147
  }
  
  public Node find(Node n){
    while (!n.equals(parent.get(n)))
      n = parent.get(n);
    return n;
  }

}
