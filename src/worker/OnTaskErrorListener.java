package worker;
@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String result);
}