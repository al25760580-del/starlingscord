package x9;

import com.facebook.react.devsupport.StackTraceHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f22720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f22721e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s[] f22722i;

    static {
        s sVar = new s("SYMBOL", 0);
        f22720d = sVar;
        s sVar2 = new s("NARROWSYMBOL", 1);
        s sVar3 = new s("CODE", 2);
        f22721e = sVar3;
        f22722i = new s[]{sVar, sVar2, sVar3, new s("NAME", 3)};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f22722i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "symbol";
        }
        if (iOrdinal == 1) {
            return "narrowSymbol";
        }
        if (iOrdinal == 2) {
            return "code";
        }
        if (iOrdinal == 3) {
            return StackTraceHelper.NAME_KEY;
        }
        throw new IllegalArgumentException();
    }
}
