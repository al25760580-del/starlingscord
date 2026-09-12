package hs;

import cs.u;
import gs.l;
import okhttp3.Request;
import okhttp3.Response;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public interface e {
    void a();

    void b(Request request);

    Source c(Response response);

    void cancel();

    u d(boolean z5);

    l e();

    void f();

    long g(Response response);

    Sink h(Request request, long j);
}
