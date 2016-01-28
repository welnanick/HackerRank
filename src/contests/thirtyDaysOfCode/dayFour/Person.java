package contests.thirtyDaysOfCode.dayFour;

/**
 * Created by Nick on 1/24/2016.
 */
public class Person {

    int initial_Age = 0;
    int age = 0;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("This person is not valid, setting age to 0.");
        }
        else {
            initial_Age = initialAge;
            age = initial_Age;
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        }
        else if (age < 18) {
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }

}