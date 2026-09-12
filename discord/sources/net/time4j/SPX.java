package net.time4j;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Serializable f16588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16589e;

    public SPX() {
    }

    public static x0 a(ObjectInput objectInput, byte b10) throws IOException {
        int i7;
        int i10 = b10 & 15;
        byte b11 = objectInput.readByte();
        int i11 = (b11 >> 5) & 3;
        int i12 = b11 & 31;
        if (i11 == 1) {
            i7 = objectInput.readByte() + 1978;
        } else if (i11 == 2) {
            i7 = objectInput.readShort();
        } else {
            if (i11 != 3) {
                throw new StreamCorruptedException("Unknown year range.");
            }
            i7 = objectInput.readInt();
        }
        s0 s0VarB = s0.b(i10);
        x0 x0Var = x0.f16782v;
        return x0.z(i7, s0VarB.a(), i12, true);
    }

    public static b1 b(ObjectInput objectInput) throws IOException {
        int i7;
        byte b10 = objectInput.readByte();
        if (b10 < 0) {
            return b1.x(~b10);
        }
        int i10 = objectInput.readByte();
        int i11 = 0;
        if (i10 < 0) {
            i10 = ~i10;
            i7 = 0;
        } else {
            byte b11 = objectInput.readByte();
            if (b11 < 0) {
                i11 = ~b11;
                i7 = 0;
            } else {
                i7 = objectInput.readInt();
                i11 = b11;
            }
        }
        return b1.y(b10, i10, i11, i7, true);
    }

    public static void c(x0 x0Var, int i7, ObjectOutput objectOutput) throws IOException {
        int i10;
        int i11 = x0Var.f16786d;
        if (i11 < 1850 || i11 > 2100) {
            i10 = Math.abs(i11) < 10000 ? 2 : 3;
        } else {
            i10 = 1;
        }
        objectOutput.writeByte((i7 << 4) | x0Var.f16787e);
        objectOutput.writeByte(x0Var.f16788i | (i10 << 5));
        if (i10 == 1) {
            objectOutput.writeByte(i11 - 1978);
        } else if (i10 == 2) {
            objectOutput.writeShort(i11);
        } else {
            objectOutput.writeInt(i11);
        }
    }

    public static void d(b1 b1Var, ObjectOutput objectOutput) throws IOException {
        int i7 = b1Var.f16611v;
        byte b10 = b1Var.f16610i;
        byte b11 = b1Var.f16608d;
        byte b12 = b1Var.f16609e;
        if (i7 != 0) {
            objectOutput.writeByte(b11);
            objectOutput.writeByte(b12);
            objectOutput.writeByte(b10);
            objectOutput.writeInt(b1Var.f16611v);
            return;
        }
        if (b10 != 0) {
            objectOutput.writeByte(b11);
            objectOutput.writeByte(b12);
            objectOutput.writeByte(~b10);
        } else if (b12 == 0) {
            objectOutput.writeByte(~b11);
        } else {
            objectOutput.writeByte(b11);
            objectOutput.writeByte(~b12);
        }
    }

    private Object readResolve() {
        return this.f16588d;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019d  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e4, code lost:
    
        if (r0[r8].b() == 1) goto L135;
     */
    @Override // java.io.Externalizable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void readExternal(java.io.ObjectInput r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.SPX.readExternal(java.io.ObjectInput):void");
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int i7 = 0;
        boolean z5 = true;
        switch (this.f16589e) {
            case 1:
                c((x0) this.f16588d, 1, objectOutput);
                return;
            case 2:
                b1 b1Var = (b1) this.f16588d;
                objectOutput.writeByte(32);
                d(b1Var, objectOutput);
                return;
            case 3:
                v1 v1Var = (v1) this.f16588d;
                p1 p1Var = v1Var.f16774i;
                p1 p1Var2 = v1Var.f16775v;
                if (p1Var == p1.f16692x && p1Var2 == p1.f16693y) {
                    i7 = 1;
                }
                objectOutput.writeByte(i7 == 0 ? 49 : 48);
                objectOutput.writeByte((v1Var.f16772d.a() << 4) | v1Var.f16773e);
                if (i7 == 0) {
                    objectOutput.writeByte((v1Var.f16774i.a() << 4) | p1Var2.a());
                    return;
                }
                return;
            case 4:
                r0 r0Var = (r0) this.f16588d;
                int i10 = ((r0Var.f16703e >>> 30) != 0 ? 1 : 0) != 0 ? 65 : 64;
                int iR = r0Var.r();
                if (iR > 0) {
                    i10 |= 2;
                }
                objectOutput.writeByte(i10);
                objectOutput.writeLong(r0Var.f16702d);
                if (iR > 0) {
                    objectOutput.writeInt(iR);
                    return;
                }
                return;
            case 5:
                k0 k0Var = (k0) k0.class.cast(this.f16588d);
                as.e eVar = k0Var.f16654i;
                long j = k0Var.f16652d;
                int i11 = k0Var.f16653e;
                int i12 = eVar == as.e.f3001e ? 81 : 80;
                if ((i11 < 0 ? i11 + 1000000000 : i11) == 0) {
                    objectOutput.writeByte(i12);
                    if (i11 < 0) {
                        j--;
                    }
                    objectOutput.writeLong(j);
                    return;
                }
                objectOutput.writeByte(i12 | 2);
                if (i11 < 0) {
                    j--;
                }
                objectOutput.writeLong(j);
                if (i11 < 0) {
                    i11 += 1000000000;
                }
                objectOutput.writeInt(i11);
                return;
            case 6:
                c0 c0Var = (c0) c0.class.cast(this.f16588d);
                List list = c0Var.f16617d;
                int size = list.size();
                int iMin = Math.min(size, 6);
                int i13 = 0;
                while (true) {
                    if (i13 >= iMin) {
                        z5 = false;
                    } else if (((xr.r) list.get(i13)).a() < 1000) {
                        i13++;
                    }
                }
                objectOutput.writeByte(z5 ? 97 : 96);
                objectOutput.writeInt(size);
                while (i7 < size) {
                    xr.r rVar = (xr.r) list.get(i7);
                    if (z5) {
                        objectOutput.writeLong(rVar.a());
                    } else {
                        objectOutput.writeInt((int) rVar.a());
                    }
                    objectOutput.writeObject(rVar.b());
                    i7++;
                }
                if (size > 0) {
                    objectOutput.writeBoolean(c0Var.f16618e);
                    return;
                }
                return;
            case 7:
                w wVar = (w) w.class.cast(this.f16588d);
                y yVar = wVar.f16780e;
                Locale locale = yVar.f16792a;
                int i14 = wVar.f16779d ? 113 : 112;
                if (locale == null) {
                    i14 |= 2;
                }
                objectOutput.writeByte(i14);
                if (locale == null) {
                    objectOutput.writeObject(yVar.f16794c);
                    return;
                }
                String language = locale.getLanguage();
                if (!locale.getCountry().isEmpty()) {
                    StringBuilder sbO = kk.b.o(language, "-");
                    sbO.append(locale.getCountry());
                    language = sbO.toString();
                }
                objectOutput.writeUTF(language);
                objectOutput.writeUTF(yVar.f16793b);
                return;
            case 8:
                e1 e1Var = (e1) this.f16588d;
                c(e1Var.f16629d, 8, objectOutput);
                d(e1Var.f16630e, objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    public SPX(int i7, Serializable serializable) {
        this.f16588d = serializable;
        this.f16589e = i7;
    }
}
