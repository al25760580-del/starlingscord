package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public interface IScope {
    h6 A(n3 n3Var);

    void B(String str);

    z0 C();

    Map D();

    void E();

    List F();

    void G(Object obj, String str);

    List H();

    void I(SentryEvent sentryEvent);

    io.sentry.protocol.c J();

    void K();

    e4.m L(m3 m3Var);

    void M(o3 o3Var);

    void N(io.sentry.protocol.v vVar);

    void O(f1 f1Var);

    List P();

    io.sentry.protocol.h0 Q();

    io.sentry.protocol.p R();

    List S();

    String T();

    String a();

    void c(Breadcrumb breadcrumb);

    void clear();

    IScope clone();

    void f(String str, String str2);

    void g(Breadcrumb breadcrumb, Hint hint);

    Map getExtras();

    io.sentry.protocol.h h();

    void i(List list);

    void j(String str, String str2);

    void k(io.sentry.protocol.v vVar);

    w5 l();

    void m(io.sentry.protocol.h0 h0Var);

    f1 n();

    h6 o();

    io.sentry.internal.debugmeta.c p();

    void q(e4.m mVar);

    void r();

    io.sentry.featureflags.b s();

    ISpan t();

    void u(String str);

    h6 v();

    Queue w();

    SentryLevel x();

    io.sentry.protocol.v y();

    e4.m z();
}
