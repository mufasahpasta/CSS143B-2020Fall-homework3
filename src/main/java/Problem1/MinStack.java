package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    private Stack<Integer> minimums;

    public MinStack(int size) {
        // homework
        super(size);
        minimums = new ArrayStack<Integer>(size);
    }

    @Override
    public boolean push(Integer val) {
        // homework
        if (isNewMinimum(val)) {
            minimums.push(val);
        }
        return super.push(val); // place holder
    }

    @Override
    public Integer pop() {
        // homework
        int removed = super.pop();
        if (removed == getMin()) {
            minimums.pop();
        }
        return removed; // place holder
    }


    public Integer getMin() {
        return minimums.peek();
    }

    private boolean isNewMinimum(int x) {
        if (minimums.size() == 0) {
            return true;
        }
        return x <= getMin();
    }
}

