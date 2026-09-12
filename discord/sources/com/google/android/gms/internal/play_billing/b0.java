package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Map, Serializable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b0 f5973y = new b0(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient y f5974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient z f5975e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient a0 f5976i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object f5977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Object[] f5978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int f5979x;

    public b0(Object obj, Object[] objArr, int i7) {
        this.f5977v = obj;
        this.f5978w = objArr;
        this.f5979x = i7;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static b0 a(int i7, Object[] objArr, a1.d dVar) {
        boolean z5;
        int i10;
        char c8;
        ?? r5;
        char c10;
        short[] sArr;
        boolean z6;
        int i11;
        ?? r16;
        boolean z7;
        ?? r6;
        Object[] objArr2;
        t tVar;
        boolean z10;
        int i12 = i7;
        Object[] objArrCopyOf = objArr;
        if (i12 == 0) {
            return f5973y;
        }
        t tVar2 = null;
        ?? r7 = 0;
        t tVar3 = null;
        t tVar4 = null;
        boolean z11 = false;
        int i13 = 1;
        if (i12 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new b0(null, objArrCopyOf, 1);
        }
        z1.q(i12, objArrCopyOf.length >> 1);
        int iJ = u.j(i12);
        char c11 = 2;
        if (i12 != 1) {
            int i14 = iJ - 1;
            if (iJ <= 128) {
                byte[] bArr = new byte[iJ];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj = objArrCopyOf[i18];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i18 ^ i13];
                    Objects.requireNonNull(obj2);
                    int iA = z1.a(obj.hashCode());
                    while (true) {
                        int i19 = iA & i14;
                        z6 = z11;
                        i11 = i13;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArrCopyOf[i17] = obj;
                                objArrCopyOf[i17 ^ 1] = obj2;
                            }
                            i16++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                            int i21 = ~i20;
                            Object obj3 = objArrCopyOf[i21 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            t tVar5 = new t(obj, obj2, obj3);
                            objArrCopyOf[i21 == true ? 1 : 0] = obj2;
                            tVar3 = tVar5;
                            break;
                        }
                        iA = i19 + 1;
                        z11 = z6;
                        i13 = i11;
                    }
                    i15++;
                    z11 = z6;
                    i13 = i11;
                }
                z5 = z11;
                i10 = i13;
                if (i16 == i12) {
                    r7 = bArr;
                    z10 = z5;
                } else {
                    sArr = new Object[3];
                    sArr[z5 ? 1 : 0] = bArr;
                    sArr[i10] = Integer.valueOf(i16);
                    sArr[2] = tVar3;
                    r7 = sArr;
                    z10 = z5;
                }
            } else {
                z5 = false;
                i10 = 1;
                if (iJ <= 32768) {
                    sArr = new short[iJ];
                    Arrays.fill(sArr, (short) -1);
                    int i22 = 0;
                    for (int i23 = 0; i23 < i12; i23++) {
                        int i24 = i22 + i22;
                        int i25 = i23 + i23;
                        Object obj4 = objArrCopyOf[i25];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i25 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iA2 = z1.a(obj4.hashCode());
                        while (true) {
                            int i26 = iA2 & i14;
                            char c12 = (char) sArr[i26];
                            if (c12 == 65535) {
                                sArr[i26] = (short) i24;
                                if (i22 < i23) {
                                    objArrCopyOf[i24] = obj4;
                                    objArrCopyOf[i24 ^ 1] = obj5;
                                }
                                i22++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c12])) {
                                int i27 = c12 ^ 1;
                                Object obj6 = objArrCopyOf[i27 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                t tVar6 = new t(obj4, obj5, obj6);
                                objArrCopyOf[i27 == true ? 1 : 0] = obj5;
                                tVar4 = tVar6;
                                break;
                            }
                            iA2 = i26 + 1;
                        }
                    }
                    if (i22 == i12) {
                        r7 = sArr;
                        z10 = z5;
                    } else {
                        r7 = new Object[]{sArr, Integer.valueOf(i22), tVar4};
                        z10 = z5;
                    }
                } else {
                    int[] iArr = new int[iJ];
                    Arrays.fill(iArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i12) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj7 = objArrCopyOf[i31];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i31 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iA3 = z1.a(obj7.hashCode());
                        while (true) {
                            int i32 = iA3 & i14;
                            int i33 = iArr[i32];
                            if (i33 == -1) {
                                iArr[i32] = i30;
                                if (i29 < i28) {
                                    objArrCopyOf[i30] = obj7;
                                    objArrCopyOf[i30 ^ 1] = obj8;
                                }
                                i29++;
                                c10 = c11;
                                break;
                            }
                            c10 = c11;
                            if (obj7.equals(objArrCopyOf[i33])) {
                                int i34 = i33 ^ 1;
                                Object obj9 = objArrCopyOf[i34];
                                Objects.requireNonNull(obj9);
                                t tVar7 = new t(obj7, obj8, obj9);
                                objArrCopyOf[i34] = obj8;
                                tVar2 = tVar7;
                                break;
                            }
                            iA3 = i32 + 1;
                            c11 = c10;
                        }
                        i28++;
                        c11 = c10;
                    }
                    c8 = c11;
                    if (i29 == i12) {
                        r5 = iArr;
                        r16 = z5;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i29);
                        objArr3[c8] = tVar2;
                        r5 = objArr3;
                        r16 = z5;
                    }
                }
            }
            z7 = r5 instanceof Object[];
            r6 = r5;
            if (z7) {
                objArr2 = (Object[]) r5;
                tVar = (t) objArr2[c8];
                if (dVar != null) {
                    throw tVar.a();
                }
                dVar.f19v = tVar;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i10]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r6 = obj10;
                i12 = iIntValue;
            }
            return new b0(r6, objArrCopyOf, i12);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z10 = false;
        i12 = 1;
        i10 = 1;
        c8 = 2;
        r5 = r7;
        r16 = z10;
        z7 = r5 instanceof Object[];
        r6 = r5;
        if (z7) {
            objArr2 = (Object[]) r5;
            tVar = (t) objArr2[c8];
            if (dVar != null) {
                throw tVar.a();
            }
            dVar.f19v = tVar;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r6 = obj11;
            i12 = iIntValue2;
        }
        return new b0(r6, objArrCopyOf, i12);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        a0 a0Var = this.f5976i;
        if (a0Var == null) {
            a0Var = new a0(this.f5978w, 1, this.f5979x);
            this.f5976i = a0Var;
        }
        return a0Var.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        y yVar = this.f5974d;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, this.f5978w, this.f5979x);
        this.f5974d = yVar2;
        return yVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i7 = this.f5979x;
            Object[] objArr = this.f5978w;
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f5977v;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = z1.a(obj.hashCode());
                    while (true) {
                        int i10 = iA & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                        } else {
                            iA = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = z1.a(obj.hashCode());
                    while (true) {
                        int i12 = iA2 & length2;
                        char c8 = (char) sArr[i12];
                        if (c8 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c8])) {
                            obj2 = objArr[c8 ^ 1];
                        } else {
                            iA2 = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = z1.a(obj.hashCode());
                    while (true) {
                        int i13 = iA3 & length3;
                        int i14 = iArr[i13];
                        if (i14 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                        } else {
                            iA3 = i13 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        y yVar = this.f5974d;
        if (yVar == null) {
            yVar = new y(this, this.f5978w, this.f5979x);
            this.f5974d = yVar;
        }
        Iterator it = yVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        z zVar = this.f5975e;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this, new a0(this.f5978w, 0, this.f5979x));
        this.f5975e = zVar2;
        return zVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5979x;
    }

    public final String toString() {
        int i7 = this.f5979x;
        if (i7 < 0) {
            throw new IllegalArgumentException(kk.b.h(i7, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i7) * 8, 1073741824L));
        sb2.append('{');
        boolean z5 = true;
        for (Map.Entry entry : (y) entrySet()) {
            if (!z5) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z5 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        a0 a0Var = this.f5976i;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this.f5978w, 1, this.f5979x);
        this.f5976i = a0Var2;
        return a0Var2;
    }
}
