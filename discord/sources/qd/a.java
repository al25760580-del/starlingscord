package qd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f18708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f18709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f18710f;

    public a(long j, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f18705a = j;
        this.f18706b = i7;
        this.f18707c = Collections.unmodifiableList(arrayList);
        this.f18708d = Collections.unmodifiableList(list);
        this.f18709e = Collections.unmodifiableList(list2);
        this.f18710f = Collections.unmodifiableList(list3);
    }
}
