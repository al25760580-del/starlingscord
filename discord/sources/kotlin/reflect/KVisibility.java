package kotlin.reflect;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KVisibility {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KVisibility f14695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KVisibility f14696e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final KVisibility f14697i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final KVisibility f14698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ KVisibility[] f14699w;

    static {
        KVisibility kVisibility = new KVisibility("PUBLIC", 0);
        f14695d = kVisibility;
        KVisibility kVisibility2 = new KVisibility("PROTECTED", 1);
        f14696e = kVisibility2;
        KVisibility kVisibility3 = new KVisibility("INTERNAL", 2);
        f14697i = kVisibility3;
        KVisibility kVisibility4 = new KVisibility("PRIVATE", 3);
        f14698v = kVisibility4;
        KVisibility[] kVisibilityArr = {kVisibility, kVisibility2, kVisibility3, kVisibility4};
        f14699w = kVisibilityArr;
        b.l(kVisibilityArr);
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f14699w.clone();
    }
}
