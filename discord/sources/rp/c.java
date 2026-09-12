package rp;

import vp.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ij.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f19511d;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i7, o[] oVarArr) {
        if (oVarArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i10 = 1;
        int length = oVarArr.length - 1;
        if (length != 0) {
            for (int i11 = 31; i11 >= 0; i11--) {
                if (((1 << i11) & length) != 0) {
                    i10 = 1 + i11;
                }
            }
            throw new IllegalStateException("Empty enum: " + oVarArr.getClass());
        }
        super(i7, i10, 1);
        this.f19511d = oVarArr;
    }

    public final Object g(int i7) {
        int i10 = (1 << this.f11805c) - 1;
        int i11 = this.f11804b;
        int i12 = (i7 & (i10 << i11)) >> i11;
        for (o oVar : this.f19511d) {
            if (oVar.a() == i12) {
                return oVar;
            }
        }
        return null;
    }
}
