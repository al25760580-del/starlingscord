package x9;

import com.facebook.react.views.scroll.ReactScrollViewHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f22730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f22731e;

    static {
        v vVar = new v("AUTO", 0);
        f22730d = vVar;
        f22731e = new v[]{vVar, new v("ALWAYS", 1), new v("NEVER", 2), new v("EXCEPTZERO", 3)};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f22731e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "auto";
        }
        if (iOrdinal == 1) {
            return ReactScrollViewHelper.OVER_SCROLL_ALWAYS;
        }
        if (iOrdinal == 2) {
            return ReactScrollViewHelper.OVER_SCROLL_NEVER;
        }
        if (iOrdinal == 3) {
            return "exceptZero";
        }
        throw new IllegalArgumentException();
    }
}
