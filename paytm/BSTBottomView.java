package paytm;

// Java Program to print Bottom View of Binary Tree 
import java.util.*;
        import java.util.Map.Entry;

// Tree BNode class 
class BNode
{
    int data; //data of the BNode 
    int hd; //horizontal distance of the BNode 
    BNode left, right; //left and right references 

    // Constructor of tree BNode 
    public BNode(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}

//Tree class 
class Tree
{
    BNode root; //root BNode of tree 

    // Default constructor 
    public Tree() {}

    // Parameterized tree constructor 
    public Tree(BNode BNode)
    {
        root = BNode;
    }

    // Method that prints the bottom view. 
    public void bottomView()
    {
        if (root == null)
            return;

        // Initialize a variable 'hd' with 0 for the root element. 
        int hd = 0;

        // TreeMap which stores key value pair sorted on key value 
        Map<Integer, Integer> map = new TreeMap<>();

        // Queue to store tree BNodes in level order traversal 
        Queue<BNode> queue = new LinkedList<BNode>();

        // Assign initialized horizontal distance value to root 
        // BNode and add it to the queue. 
        root.hd = hd;
        queue.add(root);

        // Loop until the queue is empty (standard level order loop) 
        while (!queue.isEmpty())
        {
            BNode temp = queue.remove();

            // Extract the horizontal distance value from the 
            // dequeued tree BNode. 
            hd = temp.hd;

            // Put the dequeued tree BNode to TreeMap having key 
            // as horizontal distance. Every time we find a BNode 
            // having same horizontal distance we need to replace 
            // the data in the map. 
            map.put(hd, temp.data);

            // If the dequeued BNode has a left child add it to the 
            // queue with a horizontal distance hd-1. 
            if (temp.left != null)
            {
                temp.left.hd = hd-1;
                queue.add(temp.left);
            }
            // If the dequeued BNode has a left child add it to the 
            // queue with a horizontal distance hd+1. 
            if (temp.right != null)
            {
                temp.right.hd = hd+1;
                queue.add(temp.right);
            }
        }

        // Extract the entries of map into a set to traverse 
        // an iterator over that. 
        Set<Entry<Integer, Integer>> set = map.entrySet();

        // Make an iterator 
        Iterator<Entry<Integer, Integer>> iterator = set.iterator();

        // Traverse the map elements using the iterator. 
        while (iterator.hasNext())
        {
            Map.Entry<Integer, Integer> me = iterator.next();
            System.out.print(me.getValue()+" ");
        }
    }
}

// Main driver class 
public class BSTBottomView
{
    public static void main(String[] args)
    {
        BNode root = new BNode(20);
        root.left = new BNode(8);
        root.right = new BNode(22);
        root.left.left = new BNode(5);
        root.left.right = new BNode(3);
        root.right.left = new BNode(4);
        root.right.right = new BNode(25);
        root.left.right.left = new BNode(10);
        root.left.right.right = new BNode(14);
        Tree tree = new Tree(root);
        System.out.println("Bottom view of the given binary tree:");
        tree.bottomView();
    }
} 

