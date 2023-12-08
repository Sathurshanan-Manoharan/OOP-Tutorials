public class MainCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Counter.MyListener handler = new Counter.MyListener();
        btnCount.addActionListener(handler);
    }
    }
}
