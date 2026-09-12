package qd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f18749d;

    public h(String str, long j, ArrayList arrayList, List list) {
        this.f18746a = str;
        this.f18747b = j;
        this.f18748c = Collections.unmodifiableList(arrayList);
        this.f18749d = Collections.unmodifiableList(list);
    }
}
