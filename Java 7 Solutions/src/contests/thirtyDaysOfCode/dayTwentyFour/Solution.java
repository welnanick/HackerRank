package contests.thirtyDaysOfCode.dayTwentyFour;

/**
 * Created by Nick on 1/29/2016.
 */
public class Solution {

    public static Node removeDuplicates(Node head) {

        if (head != null) {
            Node currentNode = head;
            while (currentNode.next != null) {

                if (currentNode.data == currentNode.next.data) {

                    currentNode.next = currentNode.next.next;

                }
                else {

                    currentNode = currentNode.next;

                }

            }
        }
        return head;

    }

}