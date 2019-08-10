package com.freeouting.event;

public interface ExecTask {
    void beforeExecTask();
    void execTask();
    void afterExecTask();
}
