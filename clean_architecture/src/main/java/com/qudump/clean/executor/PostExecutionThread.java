package com.qudump.clean.executor;

import rx.Scheduler;

/**
 * Created by qidong on 2016/6/3.
 */
public interface PostExecutionThread {
    Scheduler getScheduler();
}
