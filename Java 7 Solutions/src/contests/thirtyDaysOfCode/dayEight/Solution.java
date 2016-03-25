package contests.thirtyDaysOfCode.dayEight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nick on 1/28/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfEntries = input.nextInt();
        input.nextLine(); //Removes \n

        Map<String, String> phoneBook = new HashMap<>();

        for (int i = 0; i < numberOfEntries; i++) {

            String name = input.nextLine();
            String phoneNumber = input.nextLine();

            phoneBook.put(name, phoneNumber);

        }
        while (input.hasNext()) {

            String query = input.nextLine();
            if (phoneBook.containsKey(query)) {

                System.out.println(query + "=" + phoneBook.get(query));

            }
            else {

                System.out.println("Not found");

            }

        }

    }

}