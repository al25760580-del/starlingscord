package zp;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24077b = 0;

    public z(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        d0 d0VarJ;
        d0 d0VarJ2;
        d0 d0VarJ3;
        d0 d0VarJ4;
        switch (this.f24077b) {
            case 0:
                Intrinsics.checkNotNullParameter(module, "module");
                vo.f fVarO = c0.o(module, so.o.S);
                return (fVarO == null || (d0VarJ = fVarO.j()) == null) ? nq.l.c(nq.k.NOT_FOUND_UNSIGNED_TYPE, "UByte") : d0VarJ;
            case 1:
                Intrinsics.checkNotNullParameter(module, "module");
                vo.f fVarO2 = c0.o(module, so.o.U);
                return (fVarO2 == null || (d0VarJ2 = fVarO2.j()) == null) ? nq.l.c(nq.k.NOT_FOUND_UNSIGNED_TYPE, "UInt") : d0VarJ2;
            case 2:
                Intrinsics.checkNotNullParameter(module, "module");
                vo.f fVarO3 = c0.o(module, so.o.V);
                return (fVarO3 == null || (d0VarJ3 = fVarO3.j()) == null) ? nq.l.c(nq.k.NOT_FOUND_UNSIGNED_TYPE, "ULong") : d0VarJ3;
            default:
                Intrinsics.checkNotNullParameter(module, "module");
                vo.f fVarO4 = c0.o(module, so.o.T);
                return (fVarO4 == null || (d0VarJ4 = fVarO4.j()) == null) ? nq.l.c(nq.k.NOT_FOUND_UNSIGNED_TYPE, "UShort") : d0VarJ4;
        }
    }

    @Override // zp.g
    public final String toString() {
        switch (this.f24077b) {
            case 0:
                return ((Number) this.f24066a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f24066a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.f24066a).longValue() + ".toULong()";
            default:
                return ((Number) this.f24066a).intValue() + ".toUShort()";
        }
    }

    public z(short s2) {
        super(Short.valueOf(s2));
    }

    public z(int i7) {
        super(Integer.valueOf(i7));
    }

    public z(long j) {
        super(Long.valueOf(j));
    }
}
