package androidx.constraintlayout.core;

import a3.e;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class Metrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1236h;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb2.append(this.f1229a);
        sb2.append("\nmeasuresWrap: 0\nmeasuresWrapInfeasible: 0\ndetermineGroups: 0\ninfeasibleDetermineGroups: 0\ngraphOptimizer: ");
        sb2.append(this.f1231c);
        sb2.append("\nwidgets: ");
        sb2.append(this.f1236h);
        sb2.append("\ngraphSolved: ");
        sb2.append(this.f1232d);
        sb2.append("\nlinearSolved: ");
        return e.n(sb2, this.f1233e, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }
}
