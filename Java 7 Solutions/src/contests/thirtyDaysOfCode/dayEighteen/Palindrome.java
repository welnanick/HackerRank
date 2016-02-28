package contests.thirtyDaysOfCode.dayEighteen;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Nick on 1/28/2016.
 */
class Palindrome {

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    public void pushCharacter(char character) {

        stack.push(character);

    }

    public void enqueueCharacter(char character) {

        queue.add(character);

    }

    public char popCharacter() {

        return stack.pop();

    }

    public char dequeueCharacter() {

        return queue.remove();

    }

}