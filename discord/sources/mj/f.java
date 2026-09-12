package mj;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f15863b;

    static {
        String strName = Charset.defaultCharset().name();
        f15862a = strName;
        f15863b = "SJIS".equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }
}
