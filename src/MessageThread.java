public class MessageThread extends Thread {
    @Override
    public void run() {
        for (int repetition = 0; repetition < 5; repetition++) {
            System.out.println("Jag arbetar!");

            if (repetition < 4) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
