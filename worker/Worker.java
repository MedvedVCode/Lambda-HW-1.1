package Worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                callback.OnDone("������ " + i + " ���������!");
                Thread.sleep(75);
            } else {
                errorCallback.onError("������ " + i + " �� ���������!");
                Thread.sleep(3000);
            }
        }
    }
}
