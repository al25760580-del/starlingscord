package jn;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13983g;

    public void a(int i7, boolean z5) {
        if (z5) {
            this.f13979c = i7 | this.f13979c;
        } else {
            this.f13979c = (~i7) & this.f13979c;
        }
    }
}
