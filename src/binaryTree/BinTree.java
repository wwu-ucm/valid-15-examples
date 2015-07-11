package binaryTree;

public class BinTree<K extends Comparable<K>, D> {

    protected Node<K, D> root = null;

    public void insert(K key, D data) throws Exception {
        assert root == null || root.sorted() : "illegal input"; // A1
        if (root == null)
            root = new Node<K, D>(key, data, null, null);
        else root.insertNode(key, data);
        assert root.sorted() && find(key).equals(data) : "insert failed"; // A2
    }

    public D find(K key) throws Exception {
        assert root != null : "input empty"; // A3
        return root.findNode(key);
    }
}