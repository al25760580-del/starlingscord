package pa;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f17810c;

    static {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        f17808a = ((long) iMin) > CxxInspectorPackagerConnection.MAX_QUEUE_SIZE ? (iMin / 4) * 3 : iMin / 2;
        f17809b = 384;
    }
}
