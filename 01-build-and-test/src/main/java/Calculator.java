public class Calculator {

    /** Internal counter */
    private int counter;

    Calculator() {
        counter = 0;
    }


    public int getCounter() {
        return counter;
    }

    void add(int i) {
        counter += i;
    }
}

