package j4;

import f4.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f13645b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13647d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f13648a = new n(3);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f13646c = iAvailableProcessors + 1;
        f13647d = (iAvailableProcessors * 2) + 1;
    }
}
