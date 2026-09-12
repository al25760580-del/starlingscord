package vp;

import androidx.datastore.preferences.protobuf.d1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements v {
    static {
        int i7 = g.f21884b;
    }

    public final a b(ByteArrayInputStream byteArrayInputStream, g gVar) throws q {
        a aVar;
        try {
            int i7 = byteArrayInputStream.read();
            if (i7 == -1) {
                aVar = null;
            } else {
                if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                    i7 &= 127;
                    int i10 = 7;
                    while (true) {
                        if (i10 < 32) {
                            int i11 = byteArrayInputStream.read();
                            if (i11 == -1) {
                                throw q.a();
                            }
                            i7 |= (i11 & 127) << i10;
                            if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                                break;
                            }
                            i10 += 7;
                        } else {
                            while (true) {
                                if (i10 >= 64) {
                                    throw new q("CodedInputStream encountered a malformed varint.");
                                }
                                int i12 = byteArrayInputStream.read();
                                if (i12 == -1) {
                                    throw q.a();
                                }
                                if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                                    break;
                                }
                                i10 += 7;
                            }
                        }
                    }
                }
                e eVar = new e(new hj.a(byteArrayInputStream, i7, 1));
                a aVar2 = (a) a(eVar, gVar);
                try {
                    eVar.a(0);
                    aVar = aVar2;
                } catch (q e10) {
                    e10.f21916d = aVar2;
                    throw e10;
                }
            }
            if (aVar == null || aVar.b()) {
                return aVar;
            }
            q qVar = new q(new d1().getMessage());
            qVar.f21916d = aVar;
            throw qVar;
        } catch (IOException e11) {
            throw new q(e11.getMessage());
        }
    }
}
