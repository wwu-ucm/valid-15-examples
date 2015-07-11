package binaryTree;

class Node<K extends Comparable<K>, D> {
    K key;
    D data;
    Node<K, D> left;
    Node<K, D> right;

    Node(K k, D d, Node<K, D> l, Node<K, D> r) {
        key = k;
        data = d;
        left = l;
        right = r;
    }

    public void insertNode(K k, D d) {
        if (key.compareTo(k) < 0)
            if (right == null)
                right = new Node<K, D>(k, d, null, null);
            else right.insertNode(k, d);
        else if (left == null)
            left = new Node<K, D>(k, d, null, null);
        else left.insertNode(k, d);
    }

    public D findNode(K k) throws Exception {
        if (key.compareTo(k) < 0)
            if (right == null) throw new Exception(k + " not found");
            else return right.findNode(k);
        else if (k.compareTo(key) < 0)
            if (left == null) throw new Exception(k + " not found");
            else return left.findNode(k);
        else return data;
    }

    boolean sorted() {
        return ((left == null) || ((left.sorted() && left.max().compareTo(key) < 0)) &&
                ((right == null) || (right.sorted() && right.max().compareTo(key) > 0)));
    }

    private K max() {
        if (right == null) return key;
        else return right.max();
    }

} 
