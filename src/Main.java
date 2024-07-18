public class Main {
    public static void main(String[] args) {
        Thread t = new NewThread();
        t.start();
        for (int i = 0; i < 3; i++) {
            new RunnableNew().run();
        }
    }
}