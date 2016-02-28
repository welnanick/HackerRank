package contests.thirtyDaysOfCode.dayTwentyThree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nick on 1/29/2016.
 */
public class Solution {

    static void levelOrder(Node root) {

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {

            Node current = nodes.remove();
            System.out.print(current.data + " ");
            if (current.left != null) {

                nodes.add(current.left);

            }
            if (current.right != null) {

                nodes.add(current.right);

            }

        }

    }

}