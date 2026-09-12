package com.google.android.gms.internal.play_billing;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 implements x2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f6122i = new int[0];
    public static final Unsafe j = k3.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f6124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o1 f6127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f6128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6130h;

    public s2(int[] iArr, Object[] objArr, int i7, int i10, o1 o1Var, int[] iArr2, int i11, int i12, a aVar, a aVar2) {
        this.f6123a = iArr;
        this.f6124b = objArr;
        this.f6125c = i7;
        this.f6126d = i10;
        this.f6128f = iArr2;
        this.f6129g = i11;
        this.f6130h = i12;
        this.f6127e = o1Var;
    }

    public static long A(long j5, Object obj) {
        return ((Long) k3.d(j5, obj)).longValue();
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbU = a3.e.u("Field ", str, " for ", name, " not found. Known fields are ");
            sbU.append(string);
            throw new RuntimeException(sbU.toString(), e10);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof d2) {
            return ((d2) obj).h();
        }
        return true;
    }

    public static final int t(byte[] bArr, int i7, int i10, q3 q3Var, Class cls, r1 r1Var) throws m2 {
        q3 q3Var2 = q3.f6099i;
        switch (q3Var.ordinal()) {
            case 0:
                int i11 = i7 + 8;
                r1Var.f6108c = Double.valueOf(Double.longBitsToDouble(z1.P(bArr, i7)));
                return i11;
            case 1:
                int i12 = i7 + 4;
                r1Var.f6108c = Float.valueOf(Float.intBitsToFloat(z1.n(bArr, i7)));
                return i12;
            case 2:
            case 3:
                int iL = z1.L(bArr, i7, r1Var);
                r1Var.f6108c = Long.valueOf(r1Var.f6107b);
                return iL;
            case 4:
            case 12:
            case 13:
                int I = z1.I(bArr, i7, r1Var);
                r1Var.f6108c = Integer.valueOf(r1Var.f6106a);
                return I;
            case 5:
            case 15:
                int i13 = i7 + 8;
                r1Var.f6108c = Long.valueOf(z1.P(bArr, i7));
                return i13;
            case 6:
            case 14:
                int i14 = i7 + 4;
                r1Var.f6108c = Integer.valueOf(z1.n(bArr, i7));
                return i14;
            case 7:
                int iL2 = z1.L(bArr, i7, r1Var);
                r1Var.f6108c = Boolean.valueOf(r1Var.f6107b != 0);
                return iL2;
            case 8:
                return z1.F(bArr, i7, r1Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                x2 x2VarA = u2.f6145b.a(cls);
                d2 d2VarG = x2VarA.g();
                int iN = z1.N(d2VarG, x2VarA, bArr, i7, i10, r1Var);
                x2VarA.a(d2VarG);
                r1Var.f6108c = d2VarG;
                return iN;
            case 11:
                return z1.c(bArr, i7, r1Var);
            case 16:
                int I2 = z1.I(bArr, i7, r1Var);
                r1Var.f6108c = Integer.valueOf(z1.l(r1Var.f6106a));
                return I2;
            case 17:
                int iL3 = z1.L(bArr, i7, r1Var);
                long j5 = r1Var.f6107b;
                r1Var.f6108c = Long.valueOf((j5 >>> 1) ^ (-(1 & j5)));
                return iL3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0259  */
    /* JADX WARN: Code duplicated, block: B:129:0x025c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0278  */
    /* JADX WARN: Code duplicated, block: B:133:0x027b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0348  */
    /* JADX WARN: Code duplicated, block: B:175:0x034e  */
    /* JADX WARN: Code duplicated, block: B:177:0x035b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0367 A[LOOP:6: B:178:0x035f->B:180:0x0367, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0384  */
    /* JADX WARN: Code duplicated, block: B:185:0x0387  */
    /* JADX WARN: Code duplicated, block: B:187:0x039d  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:216:0x0371 A[EDGE_INSN: B:216:0x0371->B:181:0x0371 BREAK  A[LOOP:6: B:178:0x035f->B:180:0x0367], SYNTHETIC] */
    public static s2 v(w2 w2Var, a aVar, a aVar2) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int i15;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        int i23;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int i26;
        int i27;
        int iObjectFieldOffset2;
        int i28;
        int iCharAt3;
        int i29;
        Object obj;
        Field fieldF;
        int i30;
        int i31;
        int i32;
        char cCharAt8;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj2;
        Field fieldF2;
        int i38;
        Object obj3;
        Field fieldF3;
        int i39;
        char cCharAt9;
        int i40;
        char cCharAt10;
        int i41;
        char cCharAt11;
        int i42;
        char cCharAt12;
        Unsafe unsafe = j;
        if (unsafe == null) {
            throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
        }
        if (!(w2Var instanceof w2)) {
            w2Var.getClass();
            throw new ClassCastException();
        }
        String str = w2Var.f6177b;
        int length = str.length();
        int i43 = 0;
        char c8 = 55296;
        if (str.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i7 = i44 + 1;
                if (str.charAt(i44) < 55296) {
                    break;
                }
                i44 = i7;
            }
        } else {
            i7 = 1;
        }
        int i45 = i7 + 1;
        int iCharAt4 = str.charAt(i7);
        if (iCharAt4 >= 55296) {
            int i46 = iCharAt4 & 8191;
            int i47 = 13;
            while (true) {
                i42 = i45 + 1;
                cCharAt12 = str.charAt(i45);
                if (cCharAt12 < 55296) {
                    break;
                }
                i46 |= (cCharAt12 & 8191) << i47;
                i47 += 13;
                i45 = i42;
            }
            iCharAt4 = i46 | (cCharAt12 << i47);
            i45 = i42;
        }
        if (iCharAt4 == 0) {
            iArr = f6122i;
            iCharAt = 0;
            iCharAt2 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        } else {
            int i48 = i45 + 1;
            int iCharAt5 = str.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt7 = str.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt5 = i49 | (cCharAt7 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int iCharAt6 = str.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt6 = str.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt6 = i52 | (cCharAt6 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            int iCharAt7 = str.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt5 = str.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt7 = i55 | (cCharAt5 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            int iCharAt8 = str.charAt(i54);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt4 = str.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt8 = i58 | (cCharAt4 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            iCharAt = str.charAt(i57);
            if (iCharAt >= 55296) {
                int i61 = iCharAt & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt3 = str.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt = i61 | (cCharAt3 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            iCharAt2 = str.charAt(i60);
            if (iCharAt2 >= 55296) {
                int i64 = iCharAt2 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    cCharAt2 = str.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                iCharAt2 = i64 | (cCharAt2 << i65);
                i63 = i16;
            }
            int i66 = i63 + 1;
            if (str.charAt(i63) >= 55296) {
                while (true) {
                    i15 = i66 + 1;
                    if (str.charAt(i66) < 55296) {
                        break;
                    }
                    i66 = i15;
                }
                i66 = i15;
            }
            int i67 = i66 + 1;
            int iCharAt9 = str.charAt(i66);
            if (iCharAt9 >= 55296) {
                int i68 = iCharAt9 & 8191;
                int i69 = 13;
                while (true) {
                    i14 = i67 + 1;
                    cCharAt = str.charAt(i67);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i68 |= (cCharAt & 8191) << i69;
                    i69 += 13;
                    i67 = i14;
                }
                iCharAt9 = i68 | (cCharAt << i69);
                i67 = i14;
            }
            i10 = iCharAt5 + iCharAt5 + iCharAt6;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt5];
            i43 = iCharAt5;
            i11 = iCharAt7;
            i12 = iCharAt8;
            i45 = i67;
            i13 = iCharAt9;
        }
        int[] iArr2 = iArr;
        Object[] objArr = w2Var.f6178c;
        Class<?> cls = w2Var.f6176a.getClass();
        int i70 = i13 + iCharAt2;
        int i71 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[i71];
        int i72 = i13;
        int i73 = i70;
        int i74 = 0;
        int i75 = 0;
        while (i45 < length) {
            int i76 = i45 + 1;
            int iCharAt10 = str.charAt(i45);
            if (iCharAt10 >= c8) {
                int i77 = iCharAt10 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i41 = i78 + 1;
                    cCharAt11 = str.charAt(i78);
                    if (cCharAt11 < c8) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i41;
                }
                iCharAt10 = i77 | (cCharAt11 << i79);
                i22 = i41;
            } else {
                i22 = i76;
            }
            int i80 = i22 + 1;
            int iCharAt11 = str.charAt(i22);
            if (iCharAt11 >= c8) {
                int i81 = iCharAt11 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i40 = i82 + 1;
                    cCharAt10 = str.charAt(i82);
                    if (cCharAt10 < c8) {
                        break;
                    }
                    i81 |= (cCharAt10 & 8191) << i83;
                    i83 += 13;
                    i82 = i40;
                }
                iCharAt11 = i81 | (cCharAt10 << i83);
                i23 = i40;
            } else {
                i23 = i80;
            }
            if ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                iArr2[i74] = i75;
                i74++;
            }
            int i84 = iCharAt11 & 255;
            int i85 = length;
            int i86 = iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED;
            if (i84 >= 51) {
                int i87 = i23 + 1;
                int iCharAt12 = str.charAt(i23);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i39 = i89 + 1;
                        cCharAt9 = str.charAt(i89);
                        if (cCharAt9 < c10) {
                            break;
                        }
                        i88 |= (cCharAt9 & 8191) << i90;
                        i90 += 13;
                        i89 = i39;
                        c10 = 55296;
                    }
                    iCharAt12 = i88 | (cCharAt9 << i90);
                    i34 = i39;
                } else {
                    i34 = i87;
                }
                int i91 = i34;
                int i92 = i84 - 51;
                i24 = i43;
                if (i92 == 9 || i92 == 17) {
                    i35 = i10 + 1;
                    int i93 = i75 / 3;
                    objArr2[i93 + i93 + 1] = objArr[i10];
                } else {
                    if (i92 != 12) {
                        i36 = i86;
                    } else if (w2Var.a() == 1 || i86 != 0) {
                        i35 = i10 + 1;
                        int i94 = i75 / 3;
                        objArr2[i94 + i94 + 1] = objArr[i10];
                    } else {
                        i36 = 0;
                    }
                    i37 = iCharAt12 + iCharAt12;
                    obj2 = objArr[i37];
                    int i95 = i36;
                    if (obj2 instanceof Field) {
                        fieldF2 = (Field) obj2;
                    } else {
                        fieldF2 = F(cls, (String) obj2);
                        objArr[i37] = fieldF2;
                        iArr2[i73] = i75;
                        i73++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                    i38 = i37 + 1;
                    obj3 = objArr[i38];
                    if (obj3 instanceof Field) {
                        fieldF3 = (Field) obj3;
                    } else {
                        fieldF3 = F(cls, (String) obj3);
                        objArr[i38] = fieldF3;
                    }
                    str = str;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                    i25 = i95;
                    i23 = i91;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i27 = 0;
                    iCharAt10 = iCharAt10;
                    i26 = i84;
                }
                i10 = i35;
                i36 = i86;
                i37 = iCharAt12 + iCharAt12;
                obj2 = objArr[i37];
                int i96 = i36;
                if (obj2 instanceof Field) {
                    fieldF2 = (Field) obj2;
                } else {
                    fieldF2 = F(cls, (String) obj2);
                    objArr[i37] = fieldF2;
                    iArr2[i73] = i75;
                    i73++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF2);
                i38 = i37 + 1;
                obj3 = objArr[i38];
                if (obj3 instanceof Field) {
                    fieldF3 = (Field) obj3;
                } else {
                    fieldF3 = F(cls, (String) obj3);
                    objArr[i38] = fieldF3;
                }
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                i25 = i96;
                i23 = i91;
                iObjectFieldOffset = iObjectFieldOffset4;
                i27 = 0;
                iCharAt10 = iCharAt10;
                i26 = i84;
            } else {
                i24 = i43;
                int i97 = i10 + 1;
                Field fieldF4 = F(cls, (String) objArr[i10]);
                if (i84 == 9 || i84 == 17) {
                    int i98 = i75 / 3;
                    objArr2[i98 + i98 + 1] = fieldF4.getType();
                } else {
                    if (i84 != 27) {
                        if (i84 == 49) {
                            i10 += 2;
                            i33 = 1;
                        } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                            iCharAt10 = iCharAt10;
                            if (w2Var.a() == 1 || i86 != 0) {
                                i10 += 2;
                                int i99 = i75 / 3;
                                objArr2[i99 + i99 + 1] = objArr[i97];
                                i84 = i84;
                                i25 = i86;
                            } else {
                                i84 = i84;
                                i10 = i97;
                                i25 = 0;
                            }
                        } else if (i84 == 50) {
                            int i100 = i10 + 2;
                            i72++;
                            iArr2[i72] = i75;
                            int i101 = i75 / 3;
                            int i102 = i101 + i101;
                            objArr2[i102] = objArr[i97];
                            if (i86 != 0) {
                                i10 += 3;
                                objArr2[i102 + 1] = objArr[i100];
                                i25 = i86;
                            } else {
                                i10 = i100;
                                i25 = 0;
                            }
                            iCharAt10 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                            i26 = i84;
                            if (i26 <= 17) {
                                i28 = i23 + 1;
                                iCharAt3 = str.charAt(i23);
                                int i103 = i25;
                                if (iCharAt3 >= 55296) {
                                    i30 = iCharAt3 & 8191;
                                    i31 = 13;
                                    while (true) {
                                        i32 = i28 + 1;
                                        cCharAt8 = str.charAt(i28);
                                        if (cCharAt8 < 55296) {
                                            break;
                                        }
                                        i30 |= (cCharAt8 & 8191) << i31;
                                        i31 += 13;
                                        i28 = i32;
                                    }
                                    iCharAt3 = i30 | (cCharAt8 << i31);
                                    i28 = i32;
                                }
                                i29 = (iCharAt3 / 32) + i24 + i24;
                                obj = objArr[i29];
                                str = str;
                                if (obj instanceof Field) {
                                    fieldF = (Field) obj;
                                } else {
                                    fieldF = F(cls, (String) obj);
                                    objArr[i29] = fieldF;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                                i27 = iCharAt3 % 32;
                                i25 = i103;
                                i23 = i28;
                            }
                        } else {
                            i26 = i84;
                        }
                        i27 = 0;
                        iObjectFieldOffset2 = 1048575;
                    } else {
                        i33 = 1;
                        i10 += 2;
                    }
                    int i104 = i75 / 3;
                    objArr2[i104 + i104 + i33] = objArr[i97];
                    i84 = i84;
                    i25 = i86;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        i26 = i84;
                        if (i26 <= 17) {
                            i28 = i23 + 1;
                            iCharAt3 = str.charAt(i23);
                            int i105 = i25;
                            if (iCharAt3 >= 55296) {
                                i30 = iCharAt3 & 8191;
                                i31 = 13;
                                while (true) {
                                    i32 = i28 + 1;
                                    cCharAt8 = str.charAt(i28);
                                    if (cCharAt8 < 55296) {
                                        break;
                                        break;
                                    }
                                    i30 |= (cCharAt8 & 8191) << i31;
                                    i31 += 13;
                                    i28 = i32;
                                }
                                iCharAt3 = i30 | (cCharAt8 << i31);
                                i28 = i32;
                            }
                            i29 = (iCharAt3 / 32) + i24 + i24;
                            obj = objArr[i29];
                            str = str;
                            if (obj instanceof Field) {
                                fieldF = (Field) obj;
                            } else {
                                fieldF = F(cls, (String) obj);
                                objArr[i29] = fieldF;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i27 = iCharAt3 % 32;
                            i25 = i105;
                            i23 = i28;
                        }
                    } else {
                        i26 = i84;
                    }
                    i27 = 0;
                    iObjectFieldOffset2 = 1048575;
                }
                i84 = i84;
                i25 = i86;
                i10 = i97;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i26 = i84;
                    if (i26 <= 17) {
                        i28 = i23 + 1;
                        iCharAt3 = str.charAt(i23);
                        int i106 = i25;
                        if (iCharAt3 >= 55296) {
                            i30 = iCharAt3 & 8191;
                            i31 = 13;
                            while (true) {
                                i32 = i28 + 1;
                                cCharAt8 = str.charAt(i28);
                                if (cCharAt8 < 55296) {
                                    break;
                                    break;
                                }
                                i30 |= (cCharAt8 & 8191) << i31;
                                i31 += 13;
                                i28 = i32;
                            }
                            iCharAt3 = i30 | (cCharAt8 << i31);
                            i28 = i32;
                        }
                        i29 = (iCharAt3 / 32) + i24 + i24;
                        obj = objArr[i29];
                        str = str;
                        if (obj instanceof Field) {
                            fieldF = (Field) obj;
                        } else {
                            fieldF = F(cls, (String) obj);
                            objArr[i29] = fieldF;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                        i27 = iCharAt3 % 32;
                        i25 = i106;
                        i23 = i28;
                    }
                } else {
                    i26 = i84;
                }
                i27 = 0;
                iObjectFieldOffset2 = 1048575;
            }
            int i107 = i75 + 1;
            iArr3[i75] = iCharAt10;
            int i108 = i75 + 2;
            Unsafe unsafe2 = unsafe;
            iArr3[i107] = ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 536870912 : 0) | ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 268435456 : 0) | (i25 != 0 ? Integer.MIN_VALUE : 0) | (i26 << 20) | iObjectFieldOffset;
            i75 += 3;
            iArr3[i108] = (i27 << 20) | iObjectFieldOffset2;
            i45 = i23;
            length = i85;
            unsafe = unsafe2;
            str = str;
            i43 = i24;
            c8 = 55296;
        }
        return new s2(iArr3, objArr2, i11, i12, w2Var.f6176a, iArr2, i13, i70, aVar, aVar2);
    }

    public static int w(long j5, Object obj) {
        return ((Integer) k3.d(j5, obj)).intValue();
    }

    public static int y(int i7) {
        return (i7 >>> 20) & 255;
    }

    public final f2 B(int i7) {
        int i10 = i7 / 3;
        return (f2) this.f6124b[i10 + i10 + 1];
    }

    public final x2 C(int i7) {
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f6124b;
        x2 x2Var = (x2) objArr[i11];
        if (x2Var != null) {
            return x2Var;
        }
        x2 x2VarA = u2.f6145b.a((Class) objArr[i11 + 1]);
        objArr[i11] = x2VarA;
        return x2VarA;
    }

    public final Object D(int i7, Object obj) {
        x2 x2VarC = C(i7);
        int iZ = z(i7) & 1048575;
        if (!p(i7, obj)) {
            return x2VarC.g();
        }
        Object object = j.getObject(obj, iZ);
        if (r(object)) {
            return object;
        }
        d2 d2VarG = x2VarC.g();
        if (object != null) {
            x2VarC.f(d2VarG, object);
        }
        return d2VarG;
    }

    public final Object E(int i7, int i10, Object obj) {
        x2 x2VarC = C(i10);
        if (!s(i7, i10, obj)) {
            return x2VarC.g();
        }
        Object object = j.getObject(obj, z(i10) & 1048575);
        if (r(object)) {
            return object;
        }
        d2 d2VarG = x2VarC.g();
        if (object != null) {
            x2VarC.f(d2VarG, object);
        }
        return d2VarG;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.x2
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof d2) {
            d2 d2Var = (d2) obj;
            d2Var.g();
            d2Var.zza = 0;
            d2Var.e();
        }
        int i7 = 0;
        while (true) {
            int[] iArr = this.f6123a;
            if (i7 >= iArr.length) {
                f3 f3Var = ((d2) obj).zzc;
                if (f3Var.f6011e) {
                    f3Var.f6011e = false;
                    return;
                }
                return;
            }
            int iZ = z(i7);
            int i10 = 1048575 & iZ;
            int iY = y(iZ);
            long j5 = i10;
            if (iY != 9) {
                if (iY != 60 && iY != 68) {
                    switch (iY) {
                        case 17:
                            if (p(i7, obj)) {
                                C(i7).a(j.getObject(obj, j5));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                        case 40:
                        case 41:
                        case 42:
                        case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                        case 46:
                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                        case 48:
                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                            p1 p1Var = (p1) ((h2) k3.d(j5, obj));
                            if (p1Var.f6091d) {
                                p1Var.f6091d = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = j;
                            Object object = unsafe.getObject(obj, j5);
                            if (object != null) {
                                ((q2) object).f6098d = false;
                                unsafe.putObject(obj, j5, object);
                            }
                            break;
                    }
                } else if (s(iArr[i7], i7, obj)) {
                    C(i7).a(j.getObject(obj, j5));
                }
            } else if (p(i7, obj)) {
                C(i7).a(j.getObject(obj, j5));
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x037e  */
    /* JADX WARN: Code duplicated, block: B:136:0x038c  */
    /* JADX WARN: Code duplicated, block: B:137:0x039d  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:146:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:152:0x0401  */
    /* JADX WARN: Code duplicated, block: B:154:0x0405  */
    /* JADX WARN: Code duplicated, block: B:157:0x0414  */
    /* JADX WARN: Code duplicated, block: B:158:0x041b  */
    /* JADX WARN: Code duplicated, block: B:160:0x041f  */
    /* JADX WARN: Code duplicated, block: B:161:0x042a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0437  */
    /* JADX WARN: Code duplicated, block: B:163:0x043f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0446  */
    /* JADX WARN: Code duplicated, block: B:165:0x044d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0459  */
    /* JADX WARN: Code duplicated, block: B:167:0x0464  */
    /* JADX WARN: Code duplicated, block: B:168:0x046f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0476  */
    /* JADX WARN: Code duplicated, block: B:224:0x068c A[PHI: r21 r23
      0x068c: PHI (r21v21 int) = (r21v3 int), (r21v4 int), (r21v10 int), (r21v12 int), (r21v13 int), (r21v14 int), (r21v18 int), (r21v22 int) binds: [B:279:0x0836, B:275:0x0816, B:258:0x0794, B:244:0x072b, B:240:0x070b, B:236:0x06ed, B:229:0x06ad, B:223:0x068a] A[DONT_GENERATE, DONT_INLINE]
      0x068c: PHI (r23v20 int) = (r23v3 int), (r23v4 int), (r23v10 int), (r23v12 int), (r23v13 int), (r23v14 int), (r23v17 int), (r23v21 int) binds: [B:279:0x0836, B:275:0x0816, B:258:0x0794, B:244:0x072b, B:240:0x070b, B:236:0x06ed, B:229:0x06ad, B:223:0x068a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:269:0x07d8 A[PHI: r21 r23
      0x07d8: PHI (r21v8 int) = (r21v2 int), (r21v9 int) binds: [B:283:0x0856, B:268:0x07d6] A[DONT_GENERATE, DONT_INLINE]
      0x07d8: PHI (r23v8 int) = (r23v2 int), (r23v9 int) binds: [B:283:0x0856, B:268:0x07d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:352:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0410 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.x2
    public final int b(o1 o1Var) {
        int i7;
        int iS;
        int iT;
        int i10;
        int i11;
        int iC;
        int iH;
        int i12;
        int i13;
        int iS2;
        int size;
        int iN;
        int iS3;
        int iS4;
        int iS5;
        int iC2;
        int iF;
        int iT2;
        int iM;
        int iS6;
        int i14;
        int iS7;
        int iT3;
        int iM2;
        int iS8;
        int iS9;
        int iT4;
        Unsafe unsafe = j;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int iE = 0;
        while (true) {
            int[] iArr = this.f6123a;
            if (i17 >= iArr.length) {
                return ((d2) o1Var).zzc.a() + iE;
            }
            int iZ = z(i17);
            int iY = y(iZ);
            int i19 = iArr[i17];
            int i20 = iArr[i17 + 2];
            int i21 = i20 & i15;
            int i22 = 1;
            if (iY <= 17) {
                if (i21 != i16) {
                    i18 = i21 == i15 ? 0 : unsafe.getInt(o1Var, i21);
                    i16 = i21;
                }
                i7 = 1 << (i20 >>> 20);
            } else {
                i7 = 0;
            }
            int i23 = iZ & i15;
            if (iY >= b2.f5980e.f5984d) {
                b2.f5981i.getClass();
            }
            long j5 = i23;
            char c8 = '?';
            int i24 = 4;
            int i25 = 8;
            switch (iY) {
                case 0:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 8, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 1:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 4, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 2:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        long j7 = unsafe.getLong(o1Var, j5);
                        iS = v1.S(i19 << 3);
                        iT = v1.T(j7);
                        i10 = iT + iS;
                        iE += i10;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 3:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        long j10 = unsafe.getLong(o1Var, j5);
                        iS = v1.S(i19 << 3);
                        iT = v1.T(j10);
                        i10 = iT + iS;
                        iE += i10;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 4:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        long j11 = unsafe.getInt(o1Var, j5);
                        iS = v1.S(i19 << 3);
                        iT = v1.T(j11);
                        i10 = iT + iS;
                        iE += i10;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 5:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 8, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 6:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 4, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 7:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 1, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 8:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        int i26 = i19 << 3;
                        Object object = unsafe.getObject(o1Var, j5);
                        if (object instanceof t1) {
                            int iS10 = v1.S(i26);
                            int iD = ((t1) object).d();
                            iE = com.discord.chat.presentation.list.a.f(iD, iD, iS10, iE);
                        } else {
                            int iS11 = v1.S(i26);
                            int i27 = n3.f6076a;
                            int iM3 = z1.m((String) object);
                            iE = com.discord.chat.presentation.list.a.f(iM3, iM3, iS11, iE);
                        }
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 9:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        Object object2 = unsafe.getObject(o1Var, j5);
                        x2 x2VarC = C(i17);
                        a aVar = y2.f6191a;
                        int iS12 = v1.S(i19 << 3);
                        int iC3 = ((o1) object2).c(x2VarC);
                        iE = com.discord.chat.presentation.list.a.f(iC3, iC3, iS12, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 10:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        t1 t1Var = (t1) unsafe.getObject(o1Var, j5);
                        int iS13 = v1.S(i19 << 3);
                        int iD2 = t1Var.d();
                        iE = com.discord.chat.presentation.list.a.f(iD2, iD2, iS13, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 11:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        iE = com.discord.chat.presentation.list.a.e(unsafe.getInt(o1Var, j5), v1.S(i19 << 3), iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 12:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        long j12 = unsafe.getInt(o1Var, j5);
                        iS = v1.S(i19 << 3);
                        iT = v1.T(j12);
                        i10 = iT + iS;
                        iE += i10;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 13:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 4, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 14:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 8, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 15:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        int i28 = unsafe.getInt(o1Var, j5);
                        iE = com.discord.chat.presentation.list.a.e((i28 >> 31) ^ (i28 + i28), v1.S(i19 << 3), iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 16:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        long j13 = unsafe.getLong(o1Var, j5);
                        iS = v1.S(i19 << 3);
                        iT = v1.T((j13 >> 63) ^ (j13 + j13));
                        i10 = iT + iS;
                        iE += i10;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 17:
                    if (q(o1Var, i17, i16, i18, i7)) {
                        o1 o1Var2 = (o1) unsafe.getObject(o1Var, j5);
                        x2 x2VarC2 = C(i17);
                        a aVar2 = y2.f6191a;
                        int iS14 = v1.S(i19 << 3);
                        i11 = iS14 + iS14;
                        iC = o1Var2.c(x2VarC2);
                        i10 = iC + i11;
                        iE += i10;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 18:
                    iH = y2.h(i19, (List) unsafe.getObject(o1Var, j5));
                    iE += iH;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 19:
                    iH = y2.g(i19, (List) unsafe.getObject(o1Var, j5));
                    iE += iH;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 20:
                    i12 = i16;
                    i13 = i18;
                    List list = (List) unsafe.getObject(o1Var, j5);
                    a aVar3 = y2.f6191a;
                    if (list.size() == 0) {
                        iS2 = 0;
                    } else {
                        iS2 = (v1.S(i19 << 3) * list.size()) + y2.j(list);
                    }
                    iE += iS2;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 21:
                    i12 = i16;
                    i13 = i18;
                    List list2 = (List) unsafe.getObject(o1Var, j5);
                    a aVar4 = y2.f6191a;
                    size = list2.size();
                    if (size == 0) {
                        iS4 = 0;
                    } else {
                        iN = y2.n(list2);
                        iS3 = v1.S(i19 << 3);
                        iS4 = (iS3 * size) + iN;
                    }
                    iE += iS4;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 22:
                    i12 = i16;
                    i13 = i18;
                    List list3 = (List) unsafe.getObject(o1Var, j5);
                    a aVar5 = y2.f6191a;
                    size = list3.size();
                    if (size == 0) {
                        iS4 = 0;
                    } else {
                        iN = y2.i(list3);
                        iS3 = v1.S(i19 << 3);
                        iS4 = (iS3 * size) + iN;
                    }
                    iE += iS4;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 23:
                    iH = y2.h(i19, (List) unsafe.getObject(o1Var, j5));
                    iE += iH;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 24:
                    iH = y2.g(i19, (List) unsafe.getObject(o1Var, j5));
                    iE += iH;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 25:
                    i12 = i16;
                    i13 = i18;
                    List list4 = (List) unsafe.getObject(o1Var, j5);
                    a aVar6 = y2.f6191a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iS2 = 0;
                    } else {
                        iS2 = (v1.S(i19 << 3) + 1) * size2;
                    }
                    iE += iS2;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 26:
                    i12 = i16;
                    i13 = i18;
                    List list5 = (List) unsafe.getObject(o1Var, j5);
                    a aVar7 = y2.f6191a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iS4 = 0;
                    } else {
                        iS4 = v1.S(i19 << 3) * size3;
                        for (int i29 = 0; i29 < size3; i29++) {
                            Object obj = list5.get(i29);
                            if (obj instanceof t1) {
                                int iD3 = ((t1) obj).d();
                                iS4 = com.discord.chat.presentation.list.a.e(iD3, iD3, iS4);
                            } else {
                                int i30 = n3.f6076a;
                                int iM4 = z1.m((String) obj);
                                iS4 = com.discord.chat.presentation.list.a.e(iM4, iM4, iS4);
                            }
                        }
                    }
                    iE += iS4;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 27:
                    i12 = i16;
                    i13 = i18;
                    List list6 = (List) unsafe.getObject(o1Var, j5);
                    x2 x2VarC3 = C(i17);
                    a aVar8 = y2.f6191a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iS5 = 0;
                    } else {
                        iS5 = v1.S(i19 << 3) * size4;
                        for (int i31 = 0; i31 < size4; i31++) {
                            int iC4 = ((o1) list6.get(i31)).c(x2VarC3);
                            iS5 = com.discord.chat.presentation.list.a.e(iC4, iC4, iS5);
                        }
                    }
                    iE += iS5;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 28:
                    i12 = i16;
                    i13 = i18;
                    List list7 = (List) unsafe.getObject(o1Var, j5);
                    a aVar9 = y2.f6191a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iS4 = 0;
                    } else {
                        iS4 = v1.S(i19 << 3) * size5;
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iD4 = ((t1) list7.get(i32)).d();
                            iS4 = com.discord.chat.presentation.list.a.e(iD4, iD4, iS4);
                        }
                    }
                    iE += iS4;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 29:
                    i12 = i16;
                    i13 = i18;
                    List list8 = (List) unsafe.getObject(o1Var, j5);
                    a aVar10 = y2.f6191a;
                    size = list8.size();
                    if (size == 0) {
                        iS4 = 0;
                    } else {
                        iN = y2.m(list8);
                        iS3 = v1.S(i19 << 3);
                        iS4 = (iS3 * size) + iN;
                    }
                    iE += iS4;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 30:
                    i12 = i16;
                    i13 = i18;
                    List list9 = (List) unsafe.getObject(o1Var, j5);
                    a aVar11 = y2.f6191a;
                    size = list9.size();
                    if (size == 0) {
                        iS4 = 0;
                    } else {
                        iN = y2.f(list9);
                        iS3 = v1.S(i19 << 3);
                        iS4 = (iS3 * size) + iN;
                    }
                    iE += iS4;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 31:
                    iH = y2.g(i19, (List) unsafe.getObject(o1Var, j5));
                    iE += iH;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 32:
                    iH = y2.h(i19, (List) unsafe.getObject(o1Var, j5));
                    iE += iH;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 33:
                    i12 = i16;
                    i13 = i18;
                    List list10 = (List) unsafe.getObject(o1Var, j5);
                    a aVar12 = y2.f6191a;
                    size = list10.size();
                    if (size == 0) {
                        iS4 = 0;
                    } else {
                        iN = y2.k(list10);
                        iS3 = v1.S(i19 << 3);
                        iS4 = (iS3 * size) + iN;
                    }
                    iE += iS4;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 34:
                    i12 = i16;
                    i13 = i18;
                    List list11 = (List) unsafe.getObject(o1Var, j5);
                    a aVar13 = y2.f6191a;
                    size = list11.size();
                    if (size == 0) {
                        iS4 = 0;
                    } else {
                        iN = y2.l(list11);
                        iS3 = v1.S(i19 << 3);
                        iS4 = (iS3 * size) + iN;
                    }
                    iE += iS4;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 35:
                    i12 = i16;
                    i13 = i18;
                    List list12 = (List) unsafe.getObject(o1Var, j5);
                    a aVar14 = y2.f6191a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(size6, v1.S(i19 << 3), size6, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 36:
                    i12 = i16;
                    i13 = i18;
                    List list13 = (List) unsafe.getObject(o1Var, j5);
                    a aVar15 = y2.f6191a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(size7, v1.S(i19 << 3), size7, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    i12 = i16;
                    i13 = i18;
                    int iJ = y2.j((List) unsafe.getObject(o1Var, j5));
                    if (iJ > 0) {
                        iE = com.discord.chat.presentation.list.a.f(iJ, v1.S(i19 << 3), iJ, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    i12 = i16;
                    i13 = i18;
                    int iN2 = y2.n((List) unsafe.getObject(o1Var, j5));
                    if (iN2 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(iN2, v1.S(i19 << 3), iN2, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                    i12 = i16;
                    i13 = i18;
                    int i33 = y2.i((List) unsafe.getObject(o1Var, j5));
                    if (i33 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(i33, v1.S(i19 << 3), i33, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 40:
                    i12 = i16;
                    i13 = i18;
                    List list14 = (List) unsafe.getObject(o1Var, j5);
                    a aVar16 = y2.f6191a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(size8, v1.S(i19 << 3), size8, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 41:
                    i12 = i16;
                    i13 = i18;
                    List list15 = (List) unsafe.getObject(o1Var, j5);
                    a aVar17 = y2.f6191a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(size9, v1.S(i19 << 3), size9, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 42:
                    i12 = i16;
                    i13 = i18;
                    List list16 = (List) unsafe.getObject(o1Var, j5);
                    a aVar18 = y2.f6191a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(size10, v1.S(i19 << 3), size10, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                    i12 = i16;
                    i13 = i18;
                    int iM5 = y2.m((List) unsafe.getObject(o1Var, j5));
                    if (iM5 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(iM5, v1.S(i19 << 3), iM5, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                    i12 = i16;
                    i13 = i18;
                    int iF2 = y2.f((List) unsafe.getObject(o1Var, j5));
                    if (iF2 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(iF2, v1.S(i19 << 3), iF2, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                    i12 = i16;
                    i13 = i18;
                    List list17 = (List) unsafe.getObject(o1Var, j5);
                    a aVar19 = y2.f6191a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(size11, v1.S(i19 << 3), size11, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 46:
                    i12 = i16;
                    i13 = i18;
                    List list18 = (List) unsafe.getObject(o1Var, j5);
                    a aVar20 = y2.f6191a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iE = com.discord.chat.presentation.list.a.f(size12, v1.S(i19 << 3), size12, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                    i12 = i16;
                    i13 = i18;
                    int iK = y2.k((List) unsafe.getObject(o1Var, j5));
                    if (iK > 0) {
                        iE = com.discord.chat.presentation.list.a.f(iK, v1.S(i19 << 3), iK, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 48:
                    i12 = i16;
                    i13 = i18;
                    int iL = y2.l((List) unsafe.getObject(o1Var, j5));
                    if (iL > 0) {
                        iE = com.discord.chat.presentation.list.a.f(iL, v1.S(i19 << 3), iL, iE);
                    }
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                    i12 = i16;
                    i13 = i18;
                    List list19 = (List) unsafe.getObject(o1Var, j5);
                    x2 x2VarC4 = C(i17);
                    a aVar21 = y2.f6191a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iC2 = 0;
                    } else {
                        iC2 = 0;
                        for (int i34 = 0; i34 < size13; i34++) {
                            o1 o1Var3 = (o1) list19.get(i34);
                            int iS15 = v1.S(i19 << 3);
                            iC2 += o1Var3.c(x2VarC4) + iS15 + iS15;
                        }
                    }
                    iE += iC2;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 50:
                    int i35 = i17 / 3;
                    q2 q2Var = (q2) unsafe.getObject(o1Var, j5);
                    p2 p2Var = (p2) this.f6124b[i35 + i35];
                    if (q2Var.isEmpty()) {
                        iF = 0;
                    } else {
                        iF = 0;
                        for (Map.Entry entry : q2Var.entrySet()) {
                            char c10 = c8;
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i36 = i22;
                            e4.m mVar = p2Var.f6092a;
                            int i37 = i24;
                            int iS16 = v1.S(i19 << 3);
                            int i38 = i25;
                            q3 q3Var = (q3) mVar.f7993e;
                            q3 q3Var2 = (q3) mVar.f7994i;
                            int i39 = a2.f5968c;
                            int iS17 = v1.S(i38);
                            int i40 = i16;
                            q3 q3Var3 = q3.f6100v;
                            if (q3Var == q3Var3) {
                                iS17 += iS17;
                            }
                            r3 r3Var = r3.f6111d;
                            Object obj2 = null;
                            int i41 = i18;
                            switch (q3Var.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iT2 = i38;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i42 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i42, i42, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i43 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i43, i43, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i44 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i44, i44, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i45 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i45, i45, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i46 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i46, i46, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i47 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i47, i47, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i48 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i48, i48, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i49 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i49, i49, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i50 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i410 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i410, i410, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i411 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411, i411, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i412 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i412, i412, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i413 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i413, i413, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i414 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i414, i414, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i415 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i415, i415, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i416 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i416, i416, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i417 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i417, i417, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue >> 31) ^ (iIntValue + iIntValue));
                                            int i418 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i418, i418, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue >> c10) ^ (jLongValue + jLongValue));
                                            int i419 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i419, i419, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iT2 = i37;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i4110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4110, i4110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i4111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111, i4111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4112, i4112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4113, i4113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i4114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4114, i4114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4115, i4115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4116, i4116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i4117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4117, i4117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i51 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4118, i4118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i4119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4119, i4119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i41110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41110, i41110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111, i41111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i41112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41112, i41112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i41113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41113, i41113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41114, i41114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41115, i41115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                                            int i41116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41116, i41116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue2 >> c10) ^ (jLongValue2 + jLongValue2));
                                            int i41117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41117, i41117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    p2Var = p2Var;
                                    iT2 = v1.T(((Long) key).longValue());
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i41118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41118, i41118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i41119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41119, i41119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411110, i411110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111, i411111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i411112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411112, i411112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411113, i411113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411114, i411114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i411115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411115, i411115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i52 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411116, i411116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i411117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411117, i411117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i411118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411118, i411118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411119, i411119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i4111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111110, i4111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i4111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111, i4111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111112, i4111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111113, i4111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                                            int i4111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111114, i4111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue3 >> c10) ^ (jLongValue3 + jLongValue3));
                                            int i4111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111115, i4111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    p2Var = p2Var;
                                    iT2 = v1.T(((Long) key).longValue());
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i4111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111116, i4111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i4111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111117, i4111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111118, i4111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111119, i4111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i41111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111110, i41111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111, i41111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111112, i41111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i41111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111113, i41111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i53 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111114, i41111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i41111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111115, i41111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i41111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111116, i41111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111117, i41111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i41111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111118, i41111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i41111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111119, i41111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111110, i411111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111, i411111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                                            int i411111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111112, i411111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue4 >> c10) ^ (jLongValue4 + jLongValue4));
                                            int i411111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111113, i411111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    p2Var = p2Var;
                                    iT2 = v1.T(((Integer) key).intValue());
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i411111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111114, i411111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i411111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111115, i411111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111116, i411111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111117, i411111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i411111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111118, i411111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111119, i411111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111110, i4111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i4111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111, i4111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i54 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111112, i4111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i4111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111113, i4111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i4111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111114, i4111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111115, i4111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i4111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111116, i4111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i4111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111117, i4111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111118, i4111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111119, i4111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                                            int i41111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111110, i41111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue5 >> c10) ^ (jLongValue5 + jLongValue5));
                                            int i41111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111, i41111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iT2 = i38;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i41111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111112, i41111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i41111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111113, i41111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i41111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111114, i41111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i41111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111115, i41111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i41111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111116, i41111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111117, i41111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111118, i41111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i41111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111119, i41111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i55 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111110, i411111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i411111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111, i411111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i411111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111112, i411111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111113, i411111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i411111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111114, i411111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i411111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111115, i411111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111116, i411111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111117, i411111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                                            int i411111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111118, i411111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue6 >> c10) ^ (jLongValue6 + jLongValue6));
                                            int i411111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111119, i411111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iT2 = i37;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i4111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111110, i4111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111, i4111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111112, i4111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111113, i4111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i4111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111114, i4111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111115, i4111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111116, i4111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i4111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111117, i4111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i56 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111118, i4111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i4111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111119, i4111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i41111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111110, i41111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111, i41111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i41111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111112, i41111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i41111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111113, i41111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111114, i41111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111115, i41111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                                            int i41111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111116, i41111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue7 >> c10) ^ (jLongValue7 + jLongValue7));
                                            int i41111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111117, i41111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    p2Var = p2Var;
                                    ((Boolean) key).getClass();
                                    iT2 = i36;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i41111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111118, i41111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i41111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111119, i41111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111110, i411111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111, i411111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i411111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111112, i411111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111113, i411111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111114, i411111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i411111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111115, i411111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i57 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111116, i411111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i411111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111117, i411111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i411111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111118, i411111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111119, i411111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i4111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111110, i4111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i4111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111, i4111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111112, i4111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111113, i4111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                                            int i4111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111114, i4111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue8 >> c10) ^ (jLongValue8 + jLongValue8));
                                            int i4111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111115, i4111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    p2Var = p2Var;
                                    if (key instanceof t1) {
                                        iM = ((t1) key).d();
                                        iS6 = v1.S(iM);
                                    } else {
                                        int i58 = n3.f6076a;
                                        iM = z1.m((String) key);
                                        iS6 = v1.S(iM);
                                    }
                                    iT2 = iM + iS6;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111116, i4111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111117, i4111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111118, i4111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111119, i4111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i41111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111110, i41111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111, i41111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111112, i41111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i41111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111113, i41111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i59 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111114, i41111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i41111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111115, i41111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i41111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111116, i41111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111117, i41111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i41111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111118, i41111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i41111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111119, i41111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111110, i411111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111, i411111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                                            int i411111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111112, i411111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue9 >> c10) ^ (jLongValue9 + jLongValue9));
                                            int i411111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111113, i411111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    p2Var = p2Var;
                                    iT2 = ((o1) key).d();
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111114, i411111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i411111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111115, i411111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111116, i411111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111117, i411111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i411111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111118, i411111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111119, i411111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111110, i4111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i4111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111, i4111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i510 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111112, i4111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i4111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111113, i4111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i4111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111114, i4111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111115, i4111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i4111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111116, i4111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i4111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111117, i4111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111118, i4111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111119, i4111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                                            int i41111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111110, i41111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue10 >> c10) ^ (jLongValue10 + jLongValue10));
                                            int i41111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111, i41111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    p2Var = p2Var;
                                    if (key instanceof j2) {
                                        obj2.getClass();
                                        throw null;
                                    }
                                    iM = ((o1) key).d();
                                    iS6 = v1.S(iM);
                                    iT2 = iM + iS6;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111112, i41111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111113, i41111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i41111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111114, i41111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i41111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111115, i41111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i41111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111116, i41111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111117, i41111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111118, i41111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i41111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111119, i41111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i511 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111110, i411111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i411111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111, i411111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111112, i411111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111113, i411111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i411111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111114, i411111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i411111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111115, i411111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111116, i411111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111117, i411111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                                            int i411111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111118, i411111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue11 >> c10) ^ (jLongValue11 + jLongValue11));
                                            int i411111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111119, i411111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    p2Var = p2Var;
                                    if (key instanceof t1) {
                                        iM = ((t1) key).d();
                                        iS6 = v1.S(iM);
                                    } else {
                                        iM = ((byte[]) key).length;
                                        iS6 = v1.S(iM);
                                    }
                                    iT2 = iM + iS6;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111110, i4111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111, i4111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111112, i4111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111113, i4111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i4111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111114, i4111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111115, i4111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111116, i4111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i4111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111117, i4111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i512 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111118, i4111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i4111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111119, i4111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i41111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111110, i41111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111, i41111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i41111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111112, i41111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i41111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111113, i41111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111114, i41111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111115, i41111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                                            int i41111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111116, i41111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue12 >> c10) ^ (jLongValue12 + jLongValue12));
                                            int i41111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111117, i41111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    p2Var = p2Var;
                                    iT2 = v1.S(((Integer) key).intValue());
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111118, i41111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111119, i41111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111110, i411111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111, i411111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i411111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111112, i411111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111113, i411111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111114, i411111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i411111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111115, i411111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i513 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111116, i411111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i411111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111117, i411111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111118, i411111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111119, i411111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i4111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111110, i4111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i4111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111, i4111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111112, i4111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111113, i4111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                                            int i4111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111114, i4111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue13 >> c10) ^ (jLongValue13 + jLongValue13));
                                            int i4111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111115, i4111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    if (key instanceof z3) {
                                        p2Var = p2Var;
                                        iT2 = v1.T(((z3) key).f6210d);
                                    } else {
                                        p2Var = p2Var;
                                        iT2 = v1.T(((Integer) key).intValue());
                                    }
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111116, i4111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111117, i4111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111118, i4111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111119, i4111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i41111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111110, i41111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111, i41111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111112, i41111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i41111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111113, i41111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i514 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111114, i41111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i41111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111115, i41111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i41111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111116, i41111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111117, i41111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i41111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111118, i41111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i41111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111119, i41111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111110, i411111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111, i411111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                                            int i411111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111112, i411111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue14 >> c10) ^ (jLongValue14 + jLongValue14));
                                            int i411111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111113, i411111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iT2 = i37;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111114, i411111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i411111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111115, i411111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111116, i411111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111117, i411111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i411111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111118, i411111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111119, i411111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111110, i4111111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i4111111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111, i4111111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i515 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111112, i4111111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i4111111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111113, i4111111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i4111111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111114, i4111111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111115, i4111111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i4111111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111116, i4111111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i4111111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111117, i4111111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111118, i4111111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111119, i4111111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                                            int i41111111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111110, i41111111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue15 >> c10) ^ (jLongValue15 + jLongValue15));
                                            int i41111111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111, i41111111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iT2 = i38;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111112, i41111111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111113, i41111111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i41111111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111114, i41111111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i41111111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111115, i41111111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i41111111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111116, i41111111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111117, i41111111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111118, i41111111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i41111111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111119, i41111111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i516 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111110, i411111111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i411111111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111, i411111111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111112, i411111111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111113, i411111111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i411111111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111114, i411111111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i411111111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111115, i411111111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111116, i411111111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111117, i411111111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                                            int i411111111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111118, i411111111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue16 >> c10) ^ (jLongValue16 + jLongValue16));
                                            int i411111111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111119, i411111111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iT2 = v1.S((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                                    p2Var = p2Var;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111110, i4111111111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111111, i4111111111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111112, i4111111111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i4111111111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111113, i4111111111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i4111111111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111114, i4111111111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111115, i4111111111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111116, i4111111111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i4111111111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111117, i4111111111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i517 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i4111111111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111118, i4111111111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i4111111111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111119, i4111111111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i41111111111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111110, i41111111111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i41111111111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111111, i41111111111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i41111111111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111112, i41111111111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i41111111111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111113, i41111111111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111114, i41111111111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111115, i41111111111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                                            int i41111111111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111116, i41111111111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue17 >> c10) ^ (jLongValue17 + jLongValue17));
                                            int i41111111111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111117, i41111111111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iT2 = v1.T((jLongValue18 + jLongValue18) ^ (jLongValue18 >> c10));
                                    p2Var = p2Var;
                                    i14 = iT2 + iS17;
                                    iS7 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS7 += iS7;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT3 = i38;
                                            int i41111111111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111118, i41111111111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT3 = i37;
                                            int i41111111111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i41111111111111111111111111111119, i41111111111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 2:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111110, i411111111111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 3:
                                            iT3 = v1.T(((Long) value).longValue());
                                            int i411111111111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111111, i411111111111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 4:
                                            iT3 = v1.T(((Integer) value).intValue());
                                            int i411111111111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111112, i411111111111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i411111111111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111113, i411111111111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i411111111111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111114, i411111111111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT3 = i36;
                                            int i411111111111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111115, i411111111111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                int i518 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111111111111116 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111116, i411111111111111111111111111111116, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 9:
                                            iT3 = ((o1) value).d();
                                            int i411111111111111111111111111111117 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111117, i411111111111111111111111111111117, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj2.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS8 = v1.S(iM2);
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111111111111118 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111118, i411111111111111111111111111111118, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS8 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS8 = v1.S(iM2);
                                            }
                                            iT3 = iM2 + iS8;
                                            int i411111111111111111111111111111119 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i411111111111111111111111111111119, i411111111111111111111111111111119, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 12:
                                            iT3 = v1.S(((Integer) value).intValue());
                                            int i4111111111111111111111111111111110 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111111110, i4111111111111111111111111111111110, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT3 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT3 = v1.T(((Integer) value).intValue());
                                            }
                                            int i4111111111111111111111111111111111 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111111111, i4111111111111111111111111111111111, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT3 = i37;
                                            int i4111111111111111111111111111111112 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111111112, i4111111111111111111111111111111112, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT3 = i38;
                                            int i4111111111111111111111111111111113 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111111113, i4111111111111111111111111111111113, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iT3 = v1.S((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                                            int i4111111111111111111111111111111114 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111111114, i4111111111111111111111111111111114, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iT3 = v1.T((jLongValue19 >> c10) ^ (jLongValue19 + jLongValue19));
                                            int i4111111111111111111111111111111115 = iT3 + iS7 + i14;
                                            iF = com.discord.chat.presentation.list.a.f(i4111111111111111111111111111111115, i4111111111111111111111111111111115, iS16, iF);
                                            c8 = c10;
                                            i22 = i36;
                                            i25 = i38;
                                            i24 = i37;
                                            i16 = i40;
                                            i18 = i41;
                                            p2Var = p2Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i12 = i16;
                    i13 = i18;
                    iE += iF;
                    i16 = i12;
                    i18 = i13;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                    if (s(i19, i17, o1Var)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 8, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                    if (s(i19, i17, o1Var)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 4, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                    if (s(i19, i17, o1Var)) {
                        long jA = A(j5, o1Var);
                        iS9 = v1.S(i19 << 3);
                        iT4 = v1.T(jA);
                        iE += iT4 + iS9;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                    if (s(i19, i17, o1Var)) {
                        long jA2 = A(j5, o1Var);
                        iS9 = v1.S(i19 << 3);
                        iT4 = v1.T(jA2);
                        iE += iT4 + iS9;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                    if (s(i19, i17, o1Var)) {
                        long jW = w(j5, o1Var);
                        iS9 = v1.S(i19 << 3);
                        iT4 = v1.T(jW);
                        iE += iT4 + iS9;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    if (s(i19, i17, o1Var)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 8, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    if (s(i19, i17, o1Var)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 4, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    if (s(i19, i17, o1Var)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 1, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    if (s(i19, i17, o1Var)) {
                        int i60 = i19 << 3;
                        Object object3 = unsafe.getObject(o1Var, j5);
                        if (object3 instanceof t1) {
                            int iS18 = v1.S(i60);
                            int iD5 = ((t1) object3).d();
                            iE = com.discord.chat.presentation.list.a.f(iD5, iD5, iS18, iE);
                        } else {
                            int iS19 = v1.S(i60);
                            int i61 = n3.f6076a;
                            int iM6 = z1.m((String) object3);
                            iE = com.discord.chat.presentation.list.a.f(iM6, iM6, iS19, iE);
                        }
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    if (s(i19, i17, o1Var)) {
                        Object object4 = unsafe.getObject(o1Var, j5);
                        x2 x2VarC5 = C(i17);
                        a aVar22 = y2.f6191a;
                        int iS20 = v1.S(i19 << 3);
                        int iC5 = ((o1) object4).c(x2VarC5);
                        iE = com.discord.chat.presentation.list.a.f(iC5, iC5, iS20, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 61:
                    if (s(i19, i17, o1Var)) {
                        t1 t1Var2 = (t1) unsafe.getObject(o1Var, j5);
                        int iS21 = v1.S(i19 << 3);
                        int iD6 = t1Var2.d();
                        iE = com.discord.chat.presentation.list.a.f(iD6, iD6, iS21, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 62:
                    if (s(i19, i17, o1Var)) {
                        iE = com.discord.chat.presentation.list.a.e(w(j5, o1Var), v1.S(i19 << 3), iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 63:
                    if (s(i19, i17, o1Var)) {
                        long jW2 = w(j5, o1Var);
                        iS9 = v1.S(i19 << 3);
                        iT4 = v1.T(jW2);
                        iE += iT4 + iS9;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 64:
                    if (s(i19, i17, o1Var)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 4, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 65:
                    if (s(i19, i17, o1Var)) {
                        iE = com.discord.chat.presentation.list.a.e(i19 << 3, 8, iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 66:
                    if (s(i19, i17, o1Var)) {
                        int iW = w(j5, o1Var);
                        iE = com.discord.chat.presentation.list.a.e((iW >> 31) ^ (iW + iW), v1.S(i19 << 3), iE);
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 67:
                    if (s(i19, i17, o1Var)) {
                        long jA3 = A(j5, o1Var);
                        iS9 = v1.S(i19 << 3);
                        iT4 = v1.T((jA3 >> 63) ^ (jA3 + jA3));
                        iE += iT4 + iS9;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 68:
                    if (s(i19, i17, o1Var)) {
                        o1 o1Var4 = (o1) unsafe.getObject(o1Var, j5);
                        x2 x2VarC6 = C(i17);
                        a aVar23 = y2.f6191a;
                        int iS22 = v1.S(i19 << 3);
                        i11 = iS22 + iS22;
                        iC = o1Var4.c(x2VarC6);
                        i10 = iC + i11;
                        iE += i10;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                default:
                    i17 += 3;
                    i15 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.x2
    public final boolean c(d2 d2Var, d2 d2Var2) {
        boolean zE;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f6123a;
            if (i7 < iArr.length) {
                int iZ = z(i7);
                int iY = y(iZ);
                if (iY <= 50 || iY >= 69) {
                    long j5 = iZ & 1048575;
                    switch (iY) {
                        case 0:
                            if (o(d2Var, d2Var2, i7)) {
                                j3 j3Var = k3.f6035c;
                                if (Double.doubleToLongBits(j3Var.a(j5, d2Var)) != Double.doubleToLongBits(j3Var.a(j5, d2Var2))) {
                                }
                            }
                            break;
                        case 1:
                            if (o(d2Var, d2Var2, i7)) {
                                j3 j3Var2 = k3.f6035c;
                                if (Float.floatToIntBits(j3Var2.b(j5, d2Var)) != Float.floatToIntBits(j3Var2.b(j5, d2Var2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!o(d2Var, d2Var2, i7) || k3.b(j5, d2Var) != k3.b(j5, d2Var2)) {
                            }
                            break;
                        case 3:
                            if (!o(d2Var, d2Var2, i7) || k3.b(j5, d2Var) != k3.b(j5, d2Var2)) {
                            }
                            break;
                        case 4:
                            if (!o(d2Var, d2Var2, i7) || k3.a(j5, d2Var) != k3.a(j5, d2Var2)) {
                            }
                            break;
                        case 5:
                            if (!o(d2Var, d2Var2, i7) || k3.b(j5, d2Var) != k3.b(j5, d2Var2)) {
                            }
                            break;
                        case 6:
                            if (!o(d2Var, d2Var2, i7) || k3.a(j5, d2Var) != k3.a(j5, d2Var2)) {
                            }
                            break;
                        case 7:
                            if (o(d2Var, d2Var2, i7)) {
                                j3 j3Var3 = k3.f6035c;
                                if (j3Var3.f(j5, d2Var) != j3Var3.f(j5, d2Var2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!o(d2Var, d2Var2, i7) || !y2.e(k3.d(j5, d2Var), k3.d(j5, d2Var2))) {
                            }
                            break;
                        case 9:
                            if (!o(d2Var, d2Var2, i7) || !y2.e(k3.d(j5, d2Var), k3.d(j5, d2Var2))) {
                            }
                            break;
                        case 10:
                            if (!o(d2Var, d2Var2, i7) || !y2.e(k3.d(j5, d2Var), k3.d(j5, d2Var2))) {
                            }
                            break;
                        case 11:
                            if (!o(d2Var, d2Var2, i7) || k3.a(j5, d2Var) != k3.a(j5, d2Var2)) {
                            }
                            break;
                        case 12:
                            if (!o(d2Var, d2Var2, i7) || k3.a(j5, d2Var) != k3.a(j5, d2Var2)) {
                            }
                            break;
                        case 13:
                            if (!o(d2Var, d2Var2, i7) || k3.a(j5, d2Var) != k3.a(j5, d2Var2)) {
                            }
                            break;
                        case 14:
                            if (!o(d2Var, d2Var2, i7) || k3.b(j5, d2Var) != k3.b(j5, d2Var2)) {
                            }
                            break;
                        case 15:
                            if (!o(d2Var, d2Var2, i7) || k3.a(j5, d2Var) != k3.a(j5, d2Var2)) {
                            }
                            break;
                        case 16:
                            if (!o(d2Var, d2Var2, i7) || k3.b(j5, d2Var) != k3.b(j5, d2Var2)) {
                            }
                            break;
                        case 17:
                            if (!o(d2Var, d2Var2, i7) || !y2.e(k3.d(j5, d2Var), k3.d(j5, d2Var2))) {
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                        case 40:
                        case 41:
                        case 42:
                        case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                        case 46:
                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                        case 48:
                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                            zE = y2.e(k3.d(j5, d2Var), k3.d(j5, d2Var2));
                            if (zE) {
                            }
                            break;
                        case 50:
                            zE = y2.e(k3.d(j5, d2Var), k3.d(j5, d2Var2));
                            if (zE) {
                            }
                            break;
                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                        case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                        case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                        case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                        case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                        case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                        case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                        case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                        case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                            long j7 = iArr[i7 + 2] & 1048575;
                            if (k3.a(j7, d2Var) == k3.a(j7, d2Var2) && y2.e(k3.d(j5, d2Var), k3.d(j5, d2Var2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i7 += 3;
            } else {
                int i10 = this.f6130h;
                while (true) {
                    int[] iArr2 = this.f6128f;
                    if (i10 < iArr2.length) {
                        int i11 = iArr2[i10];
                        long j10 = iArr[i11 + 2] & 1048575;
                        if (k3.a(j10, d2Var) == k3.a(j10, d2Var2)) {
                            if (!s(0, i11, d2Var)) {
                                long jZ = z(i11) & 1048575;
                                if (!y2.e(k3.d(jZ, d2Var), k3.d(jZ, d2Var2))) {
                                }
                            }
                            i10++;
                        }
                    } else if (d2Var.zzc.equals(d2Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final boolean d(Object obj) {
        int i7;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i11 < this.f6129g) {
            int i14 = this.f6128f[i11];
            int iZ = z(i14);
            int[] iArr = this.f6123a;
            int i15 = iArr[i14 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i13) {
                if (i16 != 1048575) {
                    i12 = j.getInt(obj, i16);
                }
                i10 = i12;
                i7 = i16;
            } else {
                i7 = i13;
                i10 = i12;
            }
            Object obj2 = obj;
            if ((268435456 & iZ) == 0 || q(obj2, i14, i7, i10, i17)) {
                int iY = y(iZ);
                if (iY != 9 && iY != 17) {
                    if (iY != 27) {
                        if (iY == 60 || iY == 68) {
                            if (!s(iArr[i14], i14, obj2) || C(i14).d(k3.d(iZ & 1048575, obj2))) {
                                i11++;
                                obj = obj2;
                                i13 = i7;
                                i12 = i10;
                            }
                        } else if (iY != 49) {
                            if (iY != 50) {
                                continue;
                            } else {
                                q2 q2Var = (q2) k3.d(iZ & 1048575, obj2);
                                if (q2Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i18 = i14 / 3;
                                    if (((q3) ((p2) this.f6124b[i18 + i18]).f6092a.f7994i).f6103d == r3.F) {
                                        x2 x2VarA = null;
                                        for (Object obj3 : q2Var.values()) {
                                            if (x2VarA == null) {
                                                x2VarA = u2.f6145b.a(obj3.getClass());
                                            }
                                            if (!x2VarA.d(obj3)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i11++;
                            obj = obj2;
                            i13 = i7;
                            i12 = i10;
                        }
                    }
                    List list = (List) k3.d(iZ & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        x2 x2VarC = C(i14);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (x2VarC.d(list.get(i19))) {
                            }
                        }
                    }
                    i11++;
                    obj = obj2;
                    i13 = i7;
                    i12 = i10;
                } else if (!q(obj2, i14, i7, i10, i17) || C(i14).d(k3.d(iZ & 1048575, obj2))) {
                    i11++;
                    obj = obj2;
                    i13 = i7;
                    i12 = i10;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x0347  */
    /* JADX WARN: Code duplicated, block: B:129:0x0355  */
    /* JADX WARN: Code duplicated, block: B:130:0x0366  */
    /* JADX WARN: Code duplicated, block: B:131:0x0377  */
    /* JADX WARN: Code duplicated, block: B:133:0x0380  */
    /* JADX WARN: Code duplicated, block: B:135:0x0388  */
    /* JADX WARN: Code duplicated, block: B:137:0x038c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0397  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:150:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:154:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:156:0x0406  */
    /* JADX WARN: Code duplicated, block: B:157:0x040d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0414  */
    /* JADX WARN: Code duplicated, block: B:159:0x0420  */
    /* JADX WARN: Code duplicated, block: B:160:0x042b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0436  */
    /* JADX WARN: Code duplicated, block: B:162:0x043d  */
    /* JADX WARN: Code duplicated, block: B:290:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.x2
    public final void e(Object obj, w1 w1Var) throws ag.a1 {
        int i7;
        int i10;
        int i11;
        boolean z5;
        int iT;
        int iM;
        int iS;
        int i12;
        int iS2;
        int iT2;
        int iM2;
        int iS3;
        Unsafe unsafe = j;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f6123a;
            if (i15 >= iArr.length) {
                ((d2) obj).zzc.d(w1Var);
                return;
            }
            int iZ = z(i15);
            int iY = y(iZ);
            int i17 = iArr[i15];
            if (iY <= 17) {
                int i18 = iArr[i15 + 2];
                int i19 = i18 & i13;
                if (i19 != i14) {
                    i16 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i7 = 1 << (i18 >>> 20);
            } else {
                i7 = 0;
            }
            long j5 = iZ & i13;
            int i20 = 2;
            switch (iY) {
                case 0:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.I(i17, Double.doubleToRawLongBits(k3.f6035c.a(j5, obj)));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 1:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.G(i17, Float.floatToRawIntBits(k3.f6035c.b(j5, obj)));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 2:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.Q(i17, unsafe.getLong(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 3:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.Q(i17, unsafe.getLong(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 4:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.K(i17, unsafe.getInt(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 5:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.I(i17, unsafe.getLong(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 6:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.G(i17, unsafe.getInt(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 7:
                    if (q(obj, i15, i14, i16, i7)) {
                        boolean zF = k3.f6035c.f(j5, obj);
                        v1 v1Var = w1Var.f6175a;
                        v1Var.P(i17 << 3);
                        v1Var.E(zF ? (byte) 1 : (byte) 0);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 8:
                    if (q(obj, i15, i14, i16, i7)) {
                        Object object = unsafe.getObject(obj, j5);
                        v1 v1Var2 = w1Var.f6175a;
                        if (object instanceof String) {
                            v1Var2.P((i17 << 3) | 2);
                            v1Var2.M((String) object);
                        } else {
                            t1 t1Var = (t1) object;
                            v1Var2.P((i17 << 3) | 2);
                            v1Var2.P(t1Var.d());
                            t1Var.i(v1Var2);
                        }
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 9:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.a(i17, unsafe.getObject(obj, j5), C(i15));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 10:
                    if (q(obj, i15, i14, i16, i7)) {
                        t1 t1Var2 = (t1) unsafe.getObject(obj, j5);
                        v1 v1Var3 = w1Var.f6175a;
                        v1Var3.P((i17 << 3) | 2);
                        v1Var3.P(t1Var2.d());
                        t1Var2.i(v1Var3);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 11:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.O(i17, unsafe.getInt(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 12:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.K(i17, unsafe.getInt(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 13:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.G(i17, unsafe.getInt(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 14:
                    if (q(obj, i15, i14, i16, i7)) {
                        w1Var.f6175a.I(i17, unsafe.getLong(obj, j5));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 15:
                    if (q(obj, i15, i14, i16, i7)) {
                        int i21 = unsafe.getInt(obj, j5);
                        w1Var.f6175a.O(i17, (i21 >> 31) ^ (i21 + i21));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 16:
                    if (q(obj, i15, i14, i16, i7)) {
                        long j7 = unsafe.getLong(obj, j5);
                        w1Var.f6175a.Q(i17, (j7 >> 63) ^ (j7 + j7));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 17:
                    if (q(obj, i15, i14, i16, i7)) {
                        Object object2 = unsafe.getObject(obj, j5);
                        x2 x2VarC = C(i15);
                        v1 v1Var4 = w1Var.f6175a;
                        v1Var4.N(i17, 3);
                        x2VarC.e((o1) object2, w1Var);
                        v1Var4.N(i17, 4);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 18:
                    i14 = i14;
                    i16 = i16;
                    y2.q(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 19:
                    i14 = i14;
                    i16 = i16;
                    y2.u(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 20:
                    i14 = i14;
                    i16 = i16;
                    y2.w(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 21:
                    i14 = i14;
                    i16 = i16;
                    y2.d(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 22:
                    i14 = i14;
                    i16 = i16;
                    y2.v(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 23:
                    i14 = i14;
                    i16 = i16;
                    y2.t(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 24:
                    i14 = i14;
                    i16 = i16;
                    y2.s(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 25:
                    i14 = i14;
                    i16 = i16;
                    y2.p(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 26:
                    i10 = i14;
                    i11 = i16;
                    int i22 = iArr[i15];
                    List list = (List) unsafe.getObject(obj, j5);
                    a aVar = y2.f6191a;
                    if (list != null && !list.isEmpty()) {
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            v1 v1Var5 = w1Var.f6175a;
                            String str = (String) list.get(i23);
                            v1Var5.P((i22 << 3) | 2);
                            v1Var5.M(str);
                        }
                    }
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 27:
                    i10 = i14;
                    i11 = i16;
                    int i24 = iArr[i15];
                    List list2 = (List) unsafe.getObject(obj, j5);
                    x2 x2VarC2 = C(i15);
                    a aVar2 = y2.f6191a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            w1Var.a(i24, list2.get(i25), x2VarC2);
                        }
                    }
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 28:
                    i10 = i14;
                    i11 = i16;
                    int i26 = iArr[i15];
                    List list3 = (List) unsafe.getObject(obj, j5);
                    a aVar3 = y2.f6191a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            v1 v1Var6 = w1Var.f6175a;
                            t1 t1Var3 = (t1) list3.get(i27);
                            v1Var6.P((i26 << 3) | 2);
                            v1Var6.P(t1Var3.d());
                            t1Var3.i(v1Var6);
                        }
                    }
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 29:
                    z5 = false;
                    y2.c(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 30:
                    z5 = false;
                    y2.r(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 31:
                    z5 = false;
                    y2.x(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 32:
                    z5 = false;
                    y2.y(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 33:
                    z5 = false;
                    y2.a(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 34:
                    z5 = false;
                    y2.b(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, false);
                    i14 = i14;
                    i16 = i16;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 35:
                    i10 = i14;
                    i11 = i16;
                    y2.q(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 36:
                    i10 = i14;
                    i11 = i16;
                    y2.u(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    i10 = i14;
                    i11 = i16;
                    y2.w(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    i10 = i14;
                    i11 = i16;
                    y2.d(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                    i10 = i14;
                    i11 = i16;
                    y2.v(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 40:
                    i10 = i14;
                    i11 = i16;
                    y2.t(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 41:
                    i10 = i14;
                    i11 = i16;
                    y2.s(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 42:
                    i10 = i14;
                    i11 = i16;
                    y2.p(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                    i10 = i14;
                    i11 = i16;
                    y2.c(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                    i10 = i14;
                    i11 = i16;
                    y2.r(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                    i10 = i14;
                    i11 = i16;
                    y2.x(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 46:
                    i10 = i14;
                    i11 = i16;
                    y2.y(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                    i10 = i14;
                    i11 = i16;
                    y2.a(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 48:
                    i10 = i14;
                    i11 = i16;
                    y2.b(iArr[i15], (List) unsafe.getObject(obj, j5), w1Var, true);
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                    i10 = i14;
                    i11 = i16;
                    int i28 = iArr[i15];
                    List list4 = (List) unsafe.getObject(obj, j5);
                    x2 x2VarC3 = C(i15);
                    a aVar4 = y2.f6191a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            Object obj2 = list4.get(i29);
                            v1 v1Var7 = w1Var.f6175a;
                            v1Var7.N(i28, 3);
                            x2VarC3.e((o1) obj2, w1Var);
                            v1Var7.N(i28, 4);
                        }
                    }
                    i14 = i10;
                    i16 = i11;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j5);
                    if (object3 != null) {
                        int i30 = i15 / 3;
                        e4.m mVar = ((p2) this.f6124b[i30 + i30]).f6092a;
                        for (Map.Entry entry : ((q2) object3).entrySet()) {
                            v1 v1Var8 = w1Var.f6175a;
                            v1Var8.N(i17, i20);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            q3 q3Var = (q3) mVar.f7993e;
                            q3 q3Var2 = (q3) mVar.f7994i;
                            int i31 = a2.f5968c;
                            int iS4 = v1.S(8);
                            int i32 = i14;
                            q3 q3Var3 = q3.f6100v;
                            if (q3Var == q3Var3) {
                                iS4 += iS4;
                            }
                            r3 r3Var = r3.f6111d;
                            Object obj3 = null;
                            int i33 = i16;
                            switch (q3Var.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iT = 8;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key2);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value2);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key3);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value3);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key4);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value4);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key5);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value5);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key6);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value6);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key7);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value7);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key8);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value8);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key9);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value9);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i34 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key10);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value10);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key12);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value12);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key13);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value13);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key14);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value14);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key15);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value15);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key16);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value16);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key17);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value17);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue >> 31) ^ (iIntValue + iIntValue));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key18);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value18);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue >> 63) ^ (jLongValue + jLongValue));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key19);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value19);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iT = 4;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i35 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    i17 = i17;
                                    iT = v1.T(((Long) key).longValue());
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i36 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    i17 = i17;
                                    iT = v1.T(((Long) key).longValue());
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i37 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    i17 = i17;
                                    iT = v1.T(((Integer) key).intValue());
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i38 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iT = 8;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i39 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iT = 4;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i310 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    i17 = i17;
                                    ((Boolean) key).getClass();
                                    iT = 1;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i311 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    i17 = i17;
                                    if (key instanceof t1) {
                                        iM = ((t1) key).d();
                                        iS = v1.S(iM);
                                    } else {
                                        int i40 = n3.f6076a;
                                        iM = z1.m((String) key);
                                        iS = v1.S(iM);
                                    }
                                    iT = iM + iS;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i312 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    i17 = i17;
                                    iT = ((o1) key).d();
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i313 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    i17 = i17;
                                    if (key instanceof j2) {
                                        obj3.getClass();
                                        throw null;
                                    }
                                    iM = ((o1) key).d();
                                    iS = v1.S(iM);
                                    iT = iM + iS;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i314 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    i17 = i17;
                                    if (key instanceof t1) {
                                        iM = ((t1) key).d();
                                        iS = v1.S(iM);
                                    } else {
                                        iM = ((byte[]) key).length;
                                        iS = v1.S(iM);
                                    }
                                    iT = iM + iS;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i315 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    i17 = i17;
                                    iT = v1.S(((Integer) key).intValue());
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i316 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    if (key instanceof z3) {
                                        i17 = i17;
                                        iT = v1.T(((z3) key).f6210d);
                                    } else {
                                        i17 = i17;
                                        iT = v1.T(((Integer) key).intValue());
                                    }
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i317 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iT = 4;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i318 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iT = 8;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i319 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iT = v1.S((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                                    i17 = i17;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i3110 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iT = v1.T((jLongValue18 + jLongValue18) ^ (jLongValue18 >> 63));
                                    i17 = i17;
                                    i12 = iT + iS4;
                                    iS2 = v1.S(16);
                                    if (q3Var2 == q3Var3) {
                                        iS2 += iS2;
                                    }
                                    switch (q3Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key1111111111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value1111111111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 2:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 3:
                                            iT2 = v1.T(((Long) value).longValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 4:
                                            iT2 = v1.T(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iT2 = 1;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 8:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                int i3111 = n3.f6076a;
                                                iM2 = z1.m((String) value);
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111116);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111116);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 9:
                                            iT2 = ((o1) value).d();
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111117);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111117);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 10:
                                            if (!(value instanceof j2)) {
                                                obj3.getClass();
                                                throw null;
                                            }
                                            iM2 = ((o1) value).d();
                                            iS3 = v1.S(iM2);
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111118);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111118);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                            break;
                                        case 11:
                                            if (value instanceof t1) {
                                                iM2 = ((t1) value).d();
                                                iS3 = v1.S(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                iS3 = v1.S(iM2);
                                            }
                                            iT2 = iM2 + iS3;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key11111111111111111111111111111119);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value11111111111111111111111111111119);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 12:
                                            iT2 = v1.S(((Integer) value).intValue());
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111111110);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111111110);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 13:
                                            if (value instanceof z3) {
                                                iT2 = v1.T(((z3) value).f6210d);
                                            } else {
                                                iT2 = v1.T(((Integer) value).intValue());
                                            }
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111111111);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111111111);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iT2 = 4;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111111112);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111111112);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iT2 = 8;
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111111113);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111111113);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iT2 = v1.S((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111111114);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111111114);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iT2 = v1.T((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                                            v1Var8.P(iT2 + iS2 + i12);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            a2.b(v1Var8, (q3) mVar.f7993e, 1, key111111111111111111111111111111115);
                                            a2.b(v1Var8, (q3) mVar.f7994i, 2, value111111111111111111111111111111115);
                                            i20 = 2;
                                            i17 = i17;
                                            i14 = i32;
                                            i16 = i33;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.I(i17, Double.doubleToRawLongBits(((Double) k3.d(j5, obj)).doubleValue()));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.G(i17, Float.floatToRawIntBits(((Float) k3.d(j5, obj)).floatValue()));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.Q(i17, A(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.Q(i17, A(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.K(i17, w(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.I(i17, A(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.G(i17, w(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    if (s(i17, i15, obj)) {
                        boolean zBooleanValue = ((Boolean) k3.d(j5, obj)).booleanValue();
                        v1 v1Var9 = w1Var.f6175a;
                        v1Var9.P(i17 << 3);
                        v1Var9.E(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    if (s(i17, i15, obj)) {
                        Object object4 = unsafe.getObject(obj, j5);
                        v1 v1Var10 = w1Var.f6175a;
                        if (object4 instanceof String) {
                            v1Var10.P((i17 << 3) | 2);
                            v1Var10.M((String) object4);
                        } else {
                            t1 t1Var4 = (t1) object4;
                            v1Var10.P((i17 << 3) | 2);
                            v1Var10.P(t1Var4.d());
                            t1Var4.i(v1Var10);
                        }
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    if (s(i17, i15, obj)) {
                        w1Var.a(i17, unsafe.getObject(obj, j5), C(i15));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 61:
                    if (s(i17, i15, obj)) {
                        t1 t1Var5 = (t1) unsafe.getObject(obj, j5);
                        v1 v1Var11 = w1Var.f6175a;
                        v1Var11.P((i17 << 3) | 2);
                        v1Var11.P(t1Var5.d());
                        t1Var5.i(v1Var11);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 62:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.O(i17, w(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 63:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.K(i17, w(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 64:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.G(i17, w(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 65:
                    if (s(i17, i15, obj)) {
                        w1Var.f6175a.I(i17, A(j5, obj));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 66:
                    if (s(i17, i15, obj)) {
                        int iW = w(j5, obj);
                        w1Var.f6175a.O(i17, (iW >> 31) ^ (iW + iW));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 67:
                    if (s(i17, i15, obj)) {
                        long jA = A(j5, obj);
                        w1Var.f6175a.Q(i17, (jA >> 63) ^ (jA + jA));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 68:
                    if (s(i17, i15, obj)) {
                        Object object5 = unsafe.getObject(obj, j5);
                        x2 x2VarC4 = C(i15);
                        v1 v1Var12 = w1Var.f6175a;
                        v1Var12.N(i17, 3);
                        x2VarC4.e((o1) object5, w1Var);
                        v1Var12.N(i17, 4);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                default:
                    i15 += 3;
                    i13 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.play_billing.x2
    public final void f(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f6123a;
            if (i7 >= iArr.length) {
                y2.o(obj, obj2);
                return;
            }
            int iZ = z(i7);
            int i10 = iZ & 1048575;
            int iY = y(iZ);
            int i11 = iArr[i7];
            long j5 = i10;
            switch (iY) {
                case 0:
                    if (!p(i7, obj2)) {
                        obj3 = obj;
                    } else {
                        j3 j3Var = k3.f6035c;
                        obj3 = obj;
                        j3Var.d(obj3, j5, j3Var.a(j5, obj2));
                        l(i7, obj3);
                    }
                    break;
                case 1:
                    if (p(i7, obj2)) {
                        j3 j3Var2 = k3.f6035c;
                        j3Var2.e(obj, j5, j3Var2.b(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i7, obj2)) {
                        k3.i(obj, j5, k3.b(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i7, obj2)) {
                        k3.i(obj, j5, k3.b(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i7, obj2)) {
                        k3.h(k3.a(j5, obj2), j5, obj);
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i7, obj2)) {
                        k3.i(obj, j5, k3.b(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i7, obj2)) {
                        k3.h(k3.a(j5, obj2), j5, obj);
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i7, obj2)) {
                        j3 j3Var3 = k3.f6035c;
                        j3Var3.c(obj, j5, j3Var3.f(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i7, obj2)) {
                        k3.j(j5, obj, k3.d(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i7, obj2)) {
                        k3.j(j5, obj, k3.d(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i7, obj2)) {
                        k3.h(k3.a(j5, obj2), j5, obj);
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i7, obj2)) {
                        k3.h(k3.a(j5, obj2), j5, obj);
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i7, obj2)) {
                        k3.h(k3.a(j5, obj2), j5, obj);
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i7, obj2)) {
                        k3.i(obj, j5, k3.b(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i7, obj2)) {
                        k3.h(k3.a(j5, obj2), j5, obj);
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i7, obj2)) {
                        k3.i(obj, j5, k3.b(j5, obj2));
                        l(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    j(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                case 40:
                case 41:
                case 42:
                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                case 46:
                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                case 48:
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                    h2 h2VarL = (h2) k3.d(j5, obj);
                    h2 h2Var = (h2) k3.d(j5, obj2);
                    int size = h2VarL.size();
                    int size2 = h2Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((p1) h2VarL).f6091d) {
                            h2VarL = h2VarL.l(size2 + size);
                        }
                        h2VarL.addAll(h2Var);
                    }
                    if (size > 0) {
                        h2Var = h2VarL;
                    }
                    k3.j(j5, obj, h2Var);
                    obj3 = obj;
                    break;
                case 50:
                    a aVar = y2.f6191a;
                    k3.j(j5, obj, z1.f(k3.d(j5, obj), k3.d(j5, obj2)));
                    obj3 = obj;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    if (s(i11, i7, obj2)) {
                        k3.j(j5, obj, k3.d(j5, obj2));
                        k3.h(i11, iArr[i7 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    k(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i11, i7, obj2)) {
                        k3.j(j5, obj, k3.d(j5, obj2));
                        k3.h(i11, iArr[i7 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(i7, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i7 += 3;
            obj = obj3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final d2 g() {
        return ((d2) this.f6127e).n();
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final int h(d2 d2Var) {
        int i7;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int i11;
        int i12;
        int iHashCode = 0;
        for (int i13 = 0; i13 < this.f6123a.length; i13 += 3) {
            int iZ = z(i13);
            int iY = y(iZ);
            if (iY <= 50 || iY >= 69) {
                long j5 = iZ & 1048575;
                int iHashCode2 = 37;
                switch (iY) {
                    case 0:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(k3.f6035c.a(j5, d2Var));
                        byte[] bArr = i2.f6021a;
                        i11 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + i11;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(k3.f6035c.b(j5, d2Var));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = k3.b(j5, d2Var);
                        byte[] bArr2 = i2.f6021a;
                        i11 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + i11;
                        break;
                    case 3:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = k3.b(j5, d2Var);
                        byte[] bArr3 = i2.f6021a;
                        i11 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + i11;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.a(j5, d2Var);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = k3.b(j5, d2Var);
                        byte[] bArr4 = i2.f6021a;
                        i11 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + i11;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.a(j5, d2Var);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i7 = iHashCode * 53;
                        boolean zF = k3.f6035c.f(j5, d2Var);
                        byte[] bArr5 = i2.f6021a;
                        i11 = zF ? 1231 : 1237;
                        iHashCode = i7 + i11;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) k3.d(j5, d2Var)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i12 = iHashCode * 53;
                        Object objD = k3.d(j5, d2Var);
                        if (objD != null) {
                            iHashCode2 = objD.hashCode();
                        }
                        iHashCode = i12 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.d(j5, d2Var).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.a(j5, d2Var);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.a(j5, d2Var);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.a(j5, d2Var);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = k3.b(j5, d2Var);
                        byte[] bArr6 = i2.f6021a;
                        i11 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + i11;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.a(j5, d2Var);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = k3.b(j5, d2Var);
                        byte[] bArr7 = i2.f6021a;
                        i11 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + i11;
                        break;
                    case 17:
                        i12 = iHashCode * 53;
                        Object objD2 = k3.d(j5, d2Var);
                        if (objD2 != null) {
                            iHashCode2 = objD2.hashCode();
                        }
                        iHashCode = i12 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                    case 40:
                    case 41:
                    case 42:
                    case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                    case 46:
                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                    case 48:
                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.d(j5, d2Var).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = k3.d(j5, d2Var).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i14 = this.f6130h;
        while (true) {
            int[] iArr = this.f6128f;
            if (i14 >= iArr.length) {
                return d2Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i15 = iArr[i14];
            if (!s(0, i15, d2Var)) {
                iHashCode = k3.d(z(i15) & 1048575, d2Var).hashCode() + (iHashCode * 53);
            }
            i14++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.x2
    public final void i(Object obj, byte[] bArr, int i7, int i10, r1 r1Var) {
        u(obj, bArr, i7, i10, 0, r1Var);
    }

    public final void j(int i7, Object obj, Object obj2) {
        if (p(i7, obj2)) {
            int iZ = z(i7) & 1048575;
            Unsafe unsafe = j;
            long j5 = iZ;
            Object object = unsafe.getObject(obj2, j5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6123a[i7] + " is present but null: " + obj2.toString());
            }
            x2 x2VarC = C(i7);
            if (!p(i7, obj)) {
                if (r(object)) {
                    d2 d2VarG = x2VarC.g();
                    x2VarC.f(d2VarG, object);
                    unsafe.putObject(obj, j5, d2VarG);
                } else {
                    unsafe.putObject(obj, j5, object);
                }
                l(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!r(object2)) {
                d2 d2VarG2 = x2VarC.g();
                x2VarC.f(d2VarG2, object2);
                unsafe.putObject(obj, j5, d2VarG2);
                object2 = d2VarG2;
            }
            x2VarC.f(object2, object);
        }
    }

    public final void k(int i7, Object obj, Object obj2) {
        int[] iArr = this.f6123a;
        int i10 = iArr[i7];
        if (s(i10, i7, obj2)) {
            int iZ = z(i7) & 1048575;
            Unsafe unsafe = j;
            long j5 = iZ;
            Object object = unsafe.getObject(obj2, j5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2.toString());
            }
            x2 x2VarC = C(i7);
            if (!s(i10, i7, obj)) {
                if (r(object)) {
                    d2 d2VarG = x2VarC.g();
                    x2VarC.f(d2VarG, object);
                    unsafe.putObject(obj, j5, d2VarG);
                } else {
                    unsafe.putObject(obj, j5, object);
                }
                k3.h(i10, iArr[i7 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!r(object2)) {
                d2 d2VarG2 = x2VarC.g();
                x2VarC.f(d2VarG2, object2);
                unsafe.putObject(obj, j5, d2VarG2);
                object2 = d2VarG2;
            }
            x2VarC.f(object2, object);
        }
    }

    public final void l(int i7, Object obj) {
        int i10 = this.f6123a[i7 + 2];
        long j5 = 1048575 & i10;
        if (j5 == 1048575) {
            return;
        }
        k3.h((1 << (i10 >>> 20)) | k3.a(j5, obj), j5, obj);
    }

    public final void m(int i7, Object obj, Object obj2) {
        j.putObject(obj, z(i7) & 1048575, obj2);
        l(i7, obj);
    }

    public final void n(Object obj, int i7, Object obj2, int i10) {
        j.putObject(obj, z(i10) & 1048575, obj2);
        k3.h(i7, this.f6123a[i10 + 2] & 1048575, obj);
    }

    public final boolean o(d2 d2Var, d2 d2Var2, int i7) {
        return p(i7, d2Var) == p(i7, d2Var2);
    }

    public final boolean p(int i7, Object obj) {
        int i10 = this.f6123a[i7 + 2];
        long j5 = i10 & 1048575;
        if (j5 == 1048575) {
            int iZ = z(i7);
            long j7 = iZ & 1048575;
            switch (y(iZ)) {
                case 0:
                    if (Double.doubleToRawLongBits(k3.f6035c.a(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(k3.f6035c.b(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (k3.b(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (k3.b(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (k3.a(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (k3.b(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (k3.a(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return k3.f6035c.f(j7, obj);
                case 8:
                    Object objD = k3.d(j7, obj);
                    if (objD instanceof String) {
                        if (((String) objD).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objD instanceof t1)) {
                            throw new IllegalArgumentException();
                        }
                        if (t1.f6136e.equals(objD)) {
                            return false;
                        }
                    }
                case 9:
                    if (k3.d(j7, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (t1.f6136e.equals(k3.d(j7, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (k3.a(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (k3.a(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (k3.a(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (k3.b(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (k3.a(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (k3.b(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (k3.d(j7, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & k3.a(j5, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i7, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return p(i7, obj);
        }
        return (i11 & i12) != 0;
    }

    public final boolean s(int i7, int i10, Object obj) {
        return k3.a((long) (this.f6123a[i10 + 2] & 1048575), obj) == i7;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 51261. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int u(java.lang.Object r42, byte[] r43, int r44, int r45, int r46, com.google.android.gms.internal.play_billing.r1 r47) {
        /*
            Method dump skipped, instruction units count: 5126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.s2.u(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.r1):int");
    }

    public final int x(int i7, int i10) {
        int[] iArr = this.f6123a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i7 == i13) {
                return i12;
            }
            if (i7 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final int z(int i7) {
        return this.f6123a[i7 + 1];
    }
}
