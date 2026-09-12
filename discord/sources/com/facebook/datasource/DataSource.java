package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSource {
    boolean a();

    Throwable b();

    float c();

    boolean close();

    void d(DataSubscriber dataSubscriber, Executor executor);

    Map getExtras();

    Object getResult();

    boolean isFinished();
}
