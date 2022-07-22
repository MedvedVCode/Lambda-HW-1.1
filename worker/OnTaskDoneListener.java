package worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void OnDone(String result);
}
