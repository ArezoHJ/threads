public class NumberThread extends Thread {
    @Override
    public void run() {
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);

            if (number < 10) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
