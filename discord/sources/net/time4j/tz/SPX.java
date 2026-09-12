package net.time4j.tz;

import com.facebook.imageutils.JfifUtil;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes3.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = -1000776907354520172L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Serializable f16719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16720e;

    public SPX() {
    }

    private Object readResolve() {
        return this.f16719d;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        switch ((b10 & 255) >> 4) {
            case 12:
                this.f16719d = new a((f) objectInput.readObject(), (i) objectInput.readObject());
                return;
            case 13:
                int i7 = b10 & 15;
                this.f16719d = k.a(f0.e.c(3)[i7 / 2], f0.e.c(2)[i7 % 2]);
                return;
            case 14:
                f fVar = (f) objectInput.readObject();
                j jVar = (j) objectInput.readObject();
                l lVar = i.f16725i;
                if ((b10 & 15) == 1) {
                    lVar = (l) objectInput.readObject();
                }
                this.f16719d = new b(fVar, jVar, lVar);
                return;
            case 15:
                this.f16719d = m.e(objectInput.readInt(), (b10 & 15) == 1 ? objectInput.readInt() : 0);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        boolean z5;
        switch (this.f16720e) {
            case 12:
                a aVar = (a) this.f16719d;
                objectOutput.writeByte(JfifUtil.MARKER_SOFn);
                objectOutput.writeObject(aVar.a());
                objectOutput.writeObject(aVar.d());
                return;
            case 13:
                k kVar = (k) this.f16719d;
                objectOutput.writeByte((f0.e.b(kVar.f16732e) + (f0.e.b(kVar.f16731d) * 2)) | JfifUtil.MARKER_RST0);
                return;
            case 14:
                b bVar = (b) this.f16719d;
                z5 = bVar.O != i.f16725i;
                objectOutput.writeByte(z5 ? JfifUtil.MARKER_APP1 : 224);
                objectOutput.writeObject(bVar.M);
                objectOutput.writeObject(bVar.N);
                if (z5) {
                    objectOutput.writeObject(bVar.O);
                    return;
                }
                return;
            case 15:
                m mVar = (m) this.f16719d;
                z5 = mVar.f16736e != 0;
                objectOutput.writeByte(z5 ? 241 : 240);
                objectOutput.writeInt(mVar.f16735d);
                if (z5) {
                    objectOutput.writeInt(mVar.f16736e);
                    return;
                }
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    public SPX(int i7, Serializable serializable) {
        this.f16719d = serializable;
        this.f16720e = i7;
    }
}
