public class CountdownThread extends Thread {
    @Override
    public void run() {
        for (int number = 10; number >= 1; number--) {
            System.out.println("Nedräkning: " + number);

            if (number > 1) {
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
