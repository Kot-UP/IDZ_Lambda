package Worker;

public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener_error = System.out::println;

        Worker worker = new Worker(listener, listener_error);
        worker.start();
    }
}

@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);
}

@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String result);
}