package worker;

public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener_error = System.out::println;

        Worker worker = new Worker(listener, listener_error);
        worker.start();
    }
}