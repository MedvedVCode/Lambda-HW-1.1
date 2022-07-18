package Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void OnDone(String result);
}
