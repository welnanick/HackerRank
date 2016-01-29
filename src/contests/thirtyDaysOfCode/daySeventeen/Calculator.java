package contests.thirtyDaysOfCode.daySeventeen;

/**
 * Created by Nick on 1/28/2016.
 */
class Calculator {

    public int power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {

            throw new Exception("n and p should be non-negative");

        }
        return (int) Math.pow(n, p);

    }

}