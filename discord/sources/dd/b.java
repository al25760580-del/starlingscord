package dd;

import cd.d;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import je.v;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.facebook.imagepipeline.nativecode.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7616f;

    public static ed.a E(w wVar) {
        String strP = wVar.p();
        strP.getClass();
        String strP2 = wVar.p();
        strP2.getClass();
        return new ed.a(strP, strP2, wVar.o(), wVar.o(), Arrays.copyOfRange(wVar.f13860a, wVar.f13861b, wVar.f13862c));
    }

    @Override // com.facebook.imagepipeline.nativecode.b
    public final Metadata j(d dVar, ByteBuffer byteBuffer) {
        switch (this.f7616f) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                v vVar = new v(byteBuffer.array(), byteBuffer.limit());
                int i7 = 12;
                vVar.s(12);
                int iF = (vVar.f() + vVar.i(12)) - 4;
                vVar.s(44);
                vVar.t(vVar.i(12));
                vVar.s(16);
                ArrayList arrayList = new ArrayList();
                while (vVar.f() < iF) {
                    vVar.s(48);
                    int i10 = vVar.i(8);
                    vVar.s(4);
                    int iF2 = vVar.f() + vVar.i(i7);
                    String str = null;
                    String str2 = null;
                    while (vVar.f() < iF2) {
                        int i11 = vVar.i(8);
                        int i12 = vVar.i(8);
                        int iF3 = vVar.f() + i12;
                        if (i11 == 2) {
                            int i13 = vVar.i(16);
                            vVar.s(8);
                            if (i13 == 3) {
                                while (vVar.f() < iF3) {
                                    int i14 = vVar.i(8);
                                    Charset charset = di.d.f7629a;
                                    byte[] bArr = new byte[i14];
                                    vVar.k(bArr, i14);
                                    String str3 = new String(bArr, charset);
                                    int i15 = vVar.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        vVar.t(vVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = di.d.f7629a;
                            byte[] bArr2 = new byte[i12];
                            vVar.k(bArr2, i12);
                            str2 = new String(bArr2, charset2);
                        }
                        vVar.p(iF3 * 8);
                    }
                    vVar.p(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i10, str.concat(str2)));
                    }
                    i7 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new Metadata(arrayList);
            default:
                return new Metadata(E(new w(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
