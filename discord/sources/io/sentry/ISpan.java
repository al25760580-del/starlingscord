package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface ISpan {
    m6 a();

    o6 b();

    ISpan c(String str, j4 j4Var, k1 k1Var);

    void e(Number number, String str);

    void f(m6 m6Var);

    void g();

    String getDescription();

    void h(Object obj, String str);

    boolean isFinished();

    void j(String str);

    ISpan l(String str);

    void makeCurrent();

    void n(String str, Long l6, c2 c2Var);

    j6 o();

    j4 p();

    void q(m6 m6Var, j4 j4Var);

    ISpan r(String str, String str2, j4 j4Var, k1 k1Var, a3.f fVar);

    j4 s();
}
