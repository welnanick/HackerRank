package contests.thirtyDaysOfCode.dayFourteen;

/**
 * Created by Nick on 1/28/2016.
 */
class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {

        this.elements = elements;

    }

    public void computeDifference() {

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {

            if (elements[i] < minNumber) {
                minNumber = elements[i];
            }
            if (elements[i] > maxNumber) {
                maxNumber = elements[i];
            }

        }

        maximumDifference = maxNumber - minNumber;

    }

}