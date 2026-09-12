package sd;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements ld.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19909c;

    public m(String str, List list, boolean z5) {
        this.f19907a = str;
        this.f19908b = Collections.unmodifiableList(list);
        this.f19909c = z5;
    }
}
