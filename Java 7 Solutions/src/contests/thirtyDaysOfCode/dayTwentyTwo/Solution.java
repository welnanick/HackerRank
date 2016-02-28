package contests.thirtyDaysOfCode.dayTwentyTwo;

/**
 * Created by Nick on 1/29/2016.
 */
public class Solution {

    public static int getHeight(Node root) {

        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftHeight = 0;
        int rightHeight = 0;
        if (root.left != null) {
            leftHeight = getHeight(root.left);
        }
        if (root.right != null) {
            rightHeight = getHeight(root.right);
        }
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        }
        else {
            return rightHeight + 1;
        }

    }

}