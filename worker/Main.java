package Worker;
public class Main {
    public static void main(String[] args)  throws InterruptedException {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error = System.out::println;
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}