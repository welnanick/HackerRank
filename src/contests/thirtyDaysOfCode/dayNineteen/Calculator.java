package contests.thirtyDaysOfCode.dayNineteen;

/**
 * Created by Nick on 1/28/2016.
 */
class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if(n%i == 0) {

                sum += i;

            }

        }
        return sum;

    }

}