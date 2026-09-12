package net.time4j.tz.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.time4j.b1;
import net.time4j.p1;
import net.time4j.s0;
import net.time4j.v0;
import net.time4j.x0;
import xr.q;

/* JADX INFO: loaded from: classes3.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 6526945678752534989L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Serializable f16738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16739e;

    public SPX() {
    }

    public static c a(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        s0 s0VarB = s0.b((b10 & 255) >>> 4);
        int i7 = b10 & 15;
        l lVar = l.f16756d[i7 % 3];
        int iF = f(i7);
        byte b11 = objectInput.readByte();
        int i10 = (b11 & 255) >>> 3;
        p1 p1VarD = p1.d(b11 & 7);
        byte b12 = objectInput.readByte();
        boolean z5 = ((b12 & 255) >>> 7) == 1;
        int i11 = b12 & 63;
        if (iF == -1) {
            iF = d(objectInput);
        }
        return new c(s0VarB, i10, p1VarD, i11 == 63 ? objectInput.readInt() : i11 * 1800, lVar, iF, z5);
    }

    public static f b(ObjectInput objectInput) throws IOException {
        int i7;
        byte b10 = objectInput.readByte();
        int i10 = (b10 & 255) >>> 4;
        int i11 = b10 & 15;
        l lVar = l.f16756d[i11 % 3];
        int iF = f(i11);
        byte b11 = objectInput.readByte();
        int i12 = (b11 & 255) >>> 3;
        switch (b11 & 7) {
            case 1:
                i7 = 0;
                break;
            case 2:
                i7 = 3600;
                break;
            case 3:
                i7 = 7200;
                break;
            case 4:
                i7 = 10800;
                break;
            case 5:
                i7 = 79200;
                break;
            case 6:
                i7 = 82800;
                break;
            case 7:
                i7 = 86400;
                break;
            default:
                i7 = -1;
                break;
        }
        if (iF == -1) {
            iF = d(objectInput);
        }
        int i13 = iF;
        if (i7 == -1) {
            i7 = objectInput.readInt();
        }
        return new f(s0.b(i10), i12, i7, lVar, i13);
    }

    public static h c(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        s0 s0VarB = s0.b((b10 & 255) >>> 4);
        int i7 = b10 & 15;
        l lVar = l.f16756d[i7 % 3];
        int iF = f(i7);
        byte b11 = objectInput.readByte();
        p1 p1VarD = p1.d((b11 & 255) >>> 5);
        int i10 = b11 & 31;
        if (iF == -1) {
            iF = d(objectInput);
        }
        return new h(s0VarB, p1VarD, i10 == 31 ? objectInput.readInt() : i10 * 3600, lVar, iF);
    }

    public static int d(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? dataInput.readInt() : b10 * 900;
    }

    public static List e(ObjectInput objectInput) throws IOException {
        d dVarB;
        byte b10 = objectInput.readByte();
        if (b10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(b10);
        d dVar = null;
        int i7 = 0;
        while (i7 < b10) {
            switch (objectInput.readByte()) {
                case 120:
                    dVarB = b(objectInput);
                    break;
                case 121:
                    dVarB = a(objectInput);
                    break;
                case 122:
                    dVarB = c(objectInput);
                    break;
                default:
                    dVarB = (d) objectInput.readObject();
                    break;
            }
            if (dVar != null) {
                g gVar = (g) dVar;
                x0 x0VarB = gVar.b(2000);
                long j = gVar.f16749d;
                net.time4j.k kVar = net.time4j.m.E;
                x0 x0Var = (x0) x0VarB.l(j, kVar);
                g gVar2 = (g) dVarB;
                int iCompareTo = x0Var.compareTo((x0) gVar2.b(2000).l(gVar2.f16749d, kVar));
                if (iCompareTo == 0) {
                    iCompareTo = dVar.f16750e.compareTo(dVarB.f16750e);
                }
                if (iCompareTo >= 0) {
                    throw new InvalidObjectException("Order of daylight saving rules is not ascending.");
                }
            }
            arrayList.add(dVarB);
            i7++;
            dVar = dVarB;
        }
        return arrayList;
    }

    public static int f(int i7) {
        int i10 = i7 / 3;
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1800;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 7200;
        }
        return 3600;
    }

    public static List g(ObjectInput objectInput) throws IOException {
        int i7;
        int iD;
        int i10 = objectInput.readInt();
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(i10);
        int iD2 = d(objectInput);
        long j = Long.MIN_VALUE;
        int i11 = iD2;
        int i12 = 0;
        while (i12 < i10) {
            byte b10 = objectInput.readByte();
            boolean z5 = b10 < 0;
            int i13 = (b10 >>> 5) & 3;
            switch ((b10 >>> 2) & 7) {
                case 1:
                    i7 = 0;
                    break;
                case 2:
                    i7 = 60;
                    break;
                case 3:
                    i7 = 3600;
                    break;
                case 4:
                    i7 = 7200;
                    break;
                case 5:
                    i7 = 10800;
                    break;
                case 6:
                    i7 = 14400;
                    break;
                case 7:
                    i7 = 18000;
                    break;
                default:
                    i7 = -1;
                    break;
            }
            long j5 = i7 == -1 ? objectInput.readLong() : ((((((long) ((((b10 & 3) << 16) | ((objectInput.readByte() & 255) << 8)) | (objectInput.readByte() & 255))) * 86400) - 4575744000L) + ((long) i7)) - 7200) - ((long) iD2);
            if (j5 <= j) {
                throw new StreamCorruptedException("Wrong order of transitions.");
            }
            if (i13 == 1) {
                iD = 0;
            } else if (i13 != 2) {
                iD = i13 != 3 ? d(objectInput) : 7200;
            } else {
                iD = 3600;
            }
            if (z5) {
                iD2 = d(objectInput);
            }
            int i14 = iD2 + (iD == Integer.MAX_VALUE ? 0 : iD);
            long j7 = j5;
            arrayList.add(new net.time4j.tz.n(j7, i11, i14, iD));
            i12++;
            j = j7;
            i11 = i14;
        }
        return arrayList;
    }

    public static int h(g gVar) {
        int iA;
        q qVar = gVar.f16750e;
        xr.d dVar = b1.W;
        v0 v0Var = (v0) qVar.e().f23069v.get(dVar);
        try {
            if (v0Var == null) {
                iA = ((Integer) qVar.d(dVar)).intValue();
            } else {
                qVar.f();
                v0Var.getClass();
                iA = v0Var.a((x0) qVar);
            }
        } catch (xr.f unused) {
            iA = Integer.MIN_VALUE;
        }
        return yk.a.B(gVar.f16749d * 86400) + iA;
    }

    public static void i(Object obj, ObjectOutput objectOutput) throws IOException {
        int i7;
        c cVar = (c) obj;
        boolean zL = l(cVar, objectOutput);
        objectOutput.writeByte(((cVar.f16747x << 3) | cVar.f16748y) & 255);
        boolean z5 = false;
        int i10 = cVar.E ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0;
        int iH = h(cVar);
        if (iH % 1800 == 0) {
            i7 = i10 | (iH / 1800);
            z5 = true;
        } else {
            i7 = i10 | 63;
        }
        objectOutput.writeByte(i7 & 255);
        if (!zL) {
            m(objectOutput, cVar.f16752v);
        }
        if (z5) {
            return;
        }
        objectOutput.writeInt(iH);
    }

    public static void j(Object obj, ObjectOutput objectOutput) throws IOException {
        f fVar = (f) obj;
        boolean zL = l(fVar, objectOutput);
        int i7 = 3;
        int i10 = fVar.f16753x << 3;
        int iH = h(fVar);
        if (iH == 0) {
            i7 = 1;
        } else if (iH == 3600) {
            i7 = 2;
        } else if (iH != 7200) {
            if (iH == 10800) {
                i7 = 4;
            } else if (iH == 79200) {
                i7 = 5;
            } else if (iH != 82800) {
                i7 = iH != 86400 ? 0 : 7;
            } else {
                i7 = 6;
            }
        }
        objectOutput.writeByte((i10 | i7) & 255);
        if (!zL) {
            m(objectOutput, fVar.f16752v);
        }
        if (i7 == 0) {
            objectOutput.writeInt(iH);
        }
    }

    public static void k(Object obj, ObjectOutput objectOutput) throws IOException {
        int i7;
        boolean z5;
        h hVar = (h) obj;
        boolean zL = l(hVar, objectOutput);
        int i10 = hVar.f16755x << 5;
        int iH = h(hVar);
        if (iH % 3600 == 0) {
            i7 = i10 | (iH / 3600);
            z5 = true;
        } else {
            i7 = i10 | 31;
            z5 = false;
        }
        objectOutput.writeByte(i7 & 255);
        if (!zL) {
            m(objectOutput, hVar.f16752v);
        }
        if (z5) {
            return;
        }
        objectOutput.writeInt(iH);
    }

    public static boolean l(g gVar, DataOutput dataOutput) throws IOException {
        int i7;
        int i10 = gVar.f16754w << 4;
        int iOrdinal = gVar.f16751i.ordinal();
        int i11 = gVar.f16752v;
        boolean z5 = true;
        if (i11 == 0) {
            i7 = i10 | iOrdinal;
        } else {
            if (i11 == 1800) {
                iOrdinal += 3;
            } else if (i11 == 3600) {
                iOrdinal += 6;
            } else if (i11 != 7200) {
                i7 = i10 | (iOrdinal + 12);
                z5 = false;
            } else {
                iOrdinal += 9;
            }
            i7 = i10 | iOrdinal;
        }
        dataOutput.writeByte(i7 & 255);
        return z5;
    }

    public static void m(DataOutput dataOutput, int i7) throws IOException {
        if (i7 % 900 == 0) {
            dataOutput.writeByte(i7 / 900);
        } else {
            dataOutput.writeByte(127);
            dataOutput.writeInt(i7);
        }
    }

    public static void n(List list, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            objectOutput.writeByte(dVar.a());
            switch (dVar.a()) {
                case 120:
                    j(dVar, objectOutput);
                    break;
                case 121:
                    i(dVar, objectOutput);
                    break;
                case 122:
                    k(dVar, objectOutput);
                    break;
                default:
                    objectOutput.writeObject(dVar);
                    break;
            }
        }
    }

    private Object readResolve() {
        return this.f16738d;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        long j;
        Serializable bVar;
        switch (objectInput.readByte()) {
            case 120:
                this.f16738d = b(objectInput);
                return;
            case 121:
                this.f16738d = a(objectInput);
                return;
            case 122:
                this.f16738d = c(objectInput);
                return;
            case 123:
            case 124:
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
            case 125:
                int i7 = objectInput.readByte() & 255;
                if (i7 == 255) {
                    j = objectInput.readLong();
                } else {
                    j = (((long) (((i7 << 16) + ((objectInput.readByte() & 255) << 8)) + (255 & objectInput.readByte()))) * 900) - 4575744000L;
                }
                this.f16738d = new m(new net.time4j.tz.n(j, d(objectInput), d(objectInput), d(objectInput)), e(objectInput));
                return;
            case 126:
                this.f16738d = new a(g(objectInput));
                return;
            case 127:
                List listG = g(objectInput);
                net.time4j.tz.m mVarE = net.time4j.tz.m.e(((net.time4j.tz.n) listG.get(0)).d(), 0);
                List listE = e(objectInput);
                int i10 = o.f16763d;
                int size = listG.size();
                if (size != 0) {
                    net.time4j.tz.m.e(((net.time4j.tz.n) listG.get(0)).d(), 0);
                    if (listE.isEmpty()) {
                        bVar = new a(listG);
                    } else {
                        net.time4j.tz.n nVar = (net.time4j.tz.n) listG.get(size - 1);
                        long jC = 1 + nVar.c();
                        long jA = o.a(1);
                        if (jC < jA) {
                            listG.addAll(m.d(nVar, listE, jC, jA));
                        }
                        bVar = new b(size, listG, listE);
                    }
                } else if (listE.isEmpty()) {
                    bVar = new e(mVarE);
                } else {
                    int i11 = mVarE.f16735d;
                    bVar = new m(new net.time4j.tz.n(Long.MIN_VALUE, i11, i11, 0), listE);
                }
                this.f16738d = bVar;
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int i7 = this.f16739e;
        objectOutput.writeByte(i7);
        switch (i7) {
            case 120:
                j(this.f16738d, objectOutput);
                return;
            case 121:
                i(this.f16738d, objectOutput);
                return;
            case 122:
                k(this.f16738d, objectOutput);
                return;
            case 123:
            case 124:
            default:
                throw new InvalidClassException("Unknown serialized type.");
            case 125:
                m mVar = (m) this.f16738d;
                net.time4j.tz.n nVar = mVar.f16758e;
                long jC = nVar.c();
                if (jC < -4575744000L || jC >= 10464767099L || jC % 900 != 0) {
                    objectOutput.writeByte(255);
                    objectOutput.writeLong(nVar.c());
                } else {
                    int i10 = (int) ((jC - (-4575744000L)) / 900);
                    objectOutput.writeByte((i10 >>> 16) & 255);
                    objectOutput.writeByte((i10 >>> 8) & 255);
                    objectOutput.writeByte(i10 & 255);
                }
                m(objectOutput, nVar.d());
                m(objectOutput, nVar.f());
                m(objectOutput, nVar.b());
                n(mVar.f16759i, objectOutput);
                return;
            case 126:
                a aVar = (a) this.f16738d;
                aVar.c(aVar.f16740e.length, objectOutput);
                return;
            case 127:
                b bVar = (b) this.f16738d;
                bVar.f16744i.c(bVar.f16743e, objectOutput);
                n(bVar.f16745v.f16759i, objectOutput);
                return;
        }
    }

    public SPX(int i7, Serializable serializable) {
        this.f16738d = serializable;
        this.f16739e = i7;
    }
}
