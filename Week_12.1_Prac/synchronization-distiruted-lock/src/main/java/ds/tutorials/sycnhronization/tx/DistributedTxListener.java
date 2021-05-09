package ds.tutorials.sycnhronization.tx;

public interface DistributedTxListener {
    void onGlobalCommit();
    void onGlobalAbort();
}
