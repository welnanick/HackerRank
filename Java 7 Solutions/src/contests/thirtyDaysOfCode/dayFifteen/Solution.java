package contests.thirtyDaysOfCode.dayFifteen;

/**
 * Created by Nick on 1/28/2016.
 */
class Solution {

    public static Node insert(Node head, int data) {

        if (head == null) {

            return new Node(data);

        }
        else {

            Node currentNode = head;
            while (currentNode.next != null) {

                currentNode = currentNode.next;

            }
            currentNode.next = new Node(data);
            return head;

        }

    }

}