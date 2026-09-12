package ag;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t0[] f581e;

    static {
        t0 t0Var = new t0("INSTANCE", 0);
        f580d = t0Var;
        f581e = new t0[]{t0Var};
    }

    public static t0[] values() {
        return (t0[]) f581e.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            int i10 = (bArr[i7] & 255) - (bArr2[i7] & 255);
            if (i10 != 0) {
                return i10;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
