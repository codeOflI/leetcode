package mars.leetcode.binary_tree.summary;

import mars.leetcode.binary_tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PadPlus117 {
    /**
     * 层次遍历
     *
     * @param root
     * @return
     */
    public Node connect1(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize - 1; i++) {
                Node cur = queue.poll();
                //不是最后一个结点
                if (i < queueSize - 1) {
                    cur.next = queue.peek();
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }

        }

        return root;
    }

    /*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

    Node nextLeftMost = null;
    Node preNode = null;
    /**
     * 利用next指针遍历
     *
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMost = root;

        while (leftMost != null) {
            checkChild(leftMost.left);
            checkChild(leftMost.right);
            //继续移动
            // 有next，则右移
            if (leftMost.next != null) {
                leftMost = leftMost.next;
            } else {
                //没有next，则到下一层最左结点
                leftMost = nextLeftMost;
                nextLeftMost = null;//重置标记
                preNode = null; //重置标记
            }
        }
        return root;
    }
    public void checkChild(Node childNode) {
        if (childNode != null) {
            if (nextLeftMost == null) {
                nextLeftMost = childNode;
            }
            if (preNode == null) {
                preNode = childNode;
            } else {
                preNode.next = childNode;
                preNode = preNode.next; //右移
            }
        }
    }
}
