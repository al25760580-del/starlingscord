package gs;

import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10219a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
        f10219a = iArr;
    }
}
