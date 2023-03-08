package tempoDaExecução;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var inicio = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
        }
        System.out.println((System.currentTimeMillis() - inicio));
    }
}
