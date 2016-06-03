package com.qudump.clean.interactor;

import rx.Subscriber;

/**
 * Created by qidong on 2016/6/3.
 */
public interface Interactor {

    void execute(Subscriber useCaseSubscriber);

    void unsubscriber();
}
