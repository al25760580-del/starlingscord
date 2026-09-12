package rd;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import gc.g0;
import java.util.Map;
import md.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends n0 {
    public final Map H;
    public mc.i I;

    public s(he.q qVar, mc.s sVar, mc.n nVar, Map map) {
        super(qVar, sVar, nVar);
        this.H = map;
    }

    @Override // md.n0
    public final Format l(Format format) {
        mc.i iVar;
        mc.i iVar2 = this.I;
        if (iVar2 == null) {
            iVar2 = format.L;
        }
        if (iVar2 != null && (iVar = (mc.i) this.H.get(iVar2.f15560i)) != null) {
            iVar2 = iVar;
        }
        Metadata metadata = format.G;
        Metadata metadata2 = null;
        if (metadata == null) {
            metadata = metadata2;
        } else {
            cd.b[] bVarArr = metadata.f5693d;
            int length = bVarArr.length;
            int i7 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                cd.b bVar = bVarArr[i10];
                if ((bVar instanceof hd.m) && "com.apple.streaming.transportStreamTimestamp".equals(((hd.m) bVar).f10579e)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    cd.b[] bVarArr2 = new cd.b[length - 1];
                    while (i7 < length) {
                        if (i7 != i10) {
                            bVarArr2[i7 < i10 ? i7 : i7 - 1] = bVarArr[i7];
                        }
                        i7++;
                    }
                    metadata2 = new Metadata(bVarArr2);
                }
                metadata = metadata2;
            }
        }
        if (iVar2 != format.L || metadata != format.G) {
            g0 g0VarA = format.a();
            g0VarA.f9646n = iVar2;
            g0VarA.f9643i = metadata;
            format = new Format(g0VarA);
        }
        return super.l(format);
    }
}
