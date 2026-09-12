package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements v0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f1887o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f1888p = n1.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f1896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1897i;
    public final int j;
    public final o0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f1898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f1 f1899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0 f1900n;

    public m0(int[] iArr, Object[] objArr, int i7, int i10, a aVar, boolean z5, int[] iArr2, int i11, int i12, o0 o0Var, c0 c0Var, f1 f1Var, l lVar, i0 i0Var) {
        this.f1889a = iArr;
        this.f1890b = objArr;
        this.f1891c = i7;
        this.f1892d = i10;
        this.f1894f = aVar instanceof s;
        this.f1895g = z5;
        this.f1896h = iArr2;
        this.f1897i = i11;
        this.j = i12;
        this.k = o0Var;
        this.f1898l = c0Var;
        this.f1899m = f1Var;
        this.f1893e = aVar;
        this.f1900n = i0Var;
    }

    public static long A(long j, Object obj) {
        return ((Long) n1.f1911d.i(j, obj)).longValue();
    }

    public static Field D(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbN = com.discord.chat.presentation.list.a.n("Field ", str, " for ");
            a3.e.w(cls, sbN, " not found. Known fields are ");
            sbN.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbN.toString());
        }
    }

    public static int G(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void K(int i7, Object obj, e0 e0Var) throws h {
        if (!(obj instanceof String)) {
            e0Var.a(i7, (e) obj);
        } else {
            ((i) e0Var.f1840a).P(i7, (String) obj);
        }
    }

    public static List s(long j, Object obj) {
        return (List) n1.f1911d.i(j, obj);
    }

    public static m0 w(u0 u0Var, o0 o0Var, c0 c0Var, f1 f1Var, l lVar, i0 i0Var) {
        if (u0Var instanceof u0) {
            return x(u0Var, o0Var, c0Var, f1Var, lVar, i0Var);
        }
        u0Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0283  */
    /* JADX WARN: Code duplicated, block: B:127:0x0287  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:166:0x035b  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ad  */
    public static m0 x(u0 u0Var, o0 o0Var, c0 c0Var, f1 f1Var, l lVar, i0 i0Var) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
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
        char cCharAt8;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int i27;
        int i28;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        Field fieldD;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldD2;
        int i34;
        Object obj2;
        Field fieldD3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        char cCharAt14;
        int i40 = 0;
        boolean z5 = (u0Var.f1941d & 1) != 1;
        String str = u0Var.f1939b;
        int length = str.length();
        int iCharAt3 = str.charAt(0);
        if (iCharAt3 >= 55296) {
            int i41 = iCharAt3 & 8191;
            int i42 = 1;
            int i43 = 13;
            while (true) {
                i7 = i42 + 1;
                cCharAt14 = str.charAt(i42);
                if (cCharAt14 < 55296) {
                    break;
                }
                i41 |= (cCharAt14 & 8191) << i43;
                i43 += 13;
                i42 = i7;
            }
            iCharAt3 = i41 | (cCharAt14 << i43);
        } else {
            i7 = 1;
        }
        int i44 = i7 + 1;
        int iCharAt4 = str.charAt(i7);
        if (iCharAt4 >= 55296) {
            int i45 = iCharAt4 & 8191;
            int i46 = 13;
            while (true) {
                i39 = i44 + 1;
                cCharAt13 = str.charAt(i44);
                if (cCharAt13 < 55296) {
                    break;
                }
                i45 |= (cCharAt13 & 8191) << i46;
                i46 += 13;
                i44 = i39;
            }
            iCharAt4 = i45 | (cCharAt13 << i46);
            i44 = i39;
        }
        if (iCharAt4 == 0) {
            i12 = 0;
            i14 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            iArr = f1887o;
            i13 = 0;
        } else {
            int i47 = i44 + 1;
            int iCharAt5 = str.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    cCharAt8 = str.charAt(i47);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                iCharAt5 = i48 | (cCharAt8 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int iCharAt6 = str.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    cCharAt7 = str.charAt(i50);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                iCharAt6 = i51 | (cCharAt7 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    cCharAt6 = str.charAt(i53);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                iCharAt7 = i54 | (cCharAt6 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            int iCharAt8 = str.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    cCharAt5 = str.charAt(i56);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                iCharAt8 = i57 | (cCharAt5 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            iCharAt = str.charAt(i56);
            if (iCharAt >= 55296) {
                int i60 = iCharAt & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    cCharAt4 = str.charAt(i59);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                iCharAt = i60 | (cCharAt4 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            iCharAt2 = str.charAt(i59);
            if (iCharAt2 >= 55296) {
                int i63 = iCharAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    cCharAt3 = str.charAt(i62);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                iCharAt2 = i63 | (cCharAt3 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int iCharAt9 = str.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i16 = i67 + 1;
                    cCharAt2 = str.charAt(i67);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt2 & 8191) << i68;
                    i68 += 13;
                    i67 = i16;
                }
                iCharAt9 = i66 | (cCharAt2 << i68);
                i10 = i16;
            } else {
                i10 = i65;
            }
            int i69 = i10 + 1;
            int iCharAt10 = str.charAt(i10);
            if (iCharAt10 >= 55296) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i15 = i71 + 1;
                    cCharAt = str.charAt(i71);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i70 |= (cCharAt & 8191) << i72;
                    i72 += 13;
                    i71 = i15;
                }
                iCharAt10 = i70 | (cCharAt << i72);
                i69 = i15;
            }
            int[] iArr3 = new int[iCharAt10 + iCharAt2 + iCharAt9];
            i11 = (iCharAt5 * 2) + iCharAt6;
            int i73 = iCharAt7;
            iArr = iArr3;
            i12 = i73;
            i13 = iCharAt8;
            i14 = iCharAt10;
            i40 = iCharAt5;
            i44 = i69;
        }
        Unsafe unsafe = f1888p;
        Object[] objArr = u0Var.f1940c;
        int i74 = i40;
        Class<?> cls = u0Var.f1938a.getClass();
        int i75 = iCharAt3;
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i76 = iCharAt2 + i14;
        int i77 = i14;
        int i78 = i76;
        int i79 = 0;
        int i80 = 0;
        while (i44 < length) {
            int i81 = i44 + 1;
            int iCharAt11 = str.charAt(i44);
            int i82 = length;
            if (iCharAt11 >= 55296) {
                int i83 = iCharAt11 & 8191;
                int i84 = i81;
                int i85 = 13;
                while (true) {
                    i38 = i84 + 1;
                    cCharAt12 = str.charAt(i84);
                    iArr2 = iArr4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i83 |= (cCharAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i38;
                    iArr4 = iArr2;
                }
                iCharAt11 = i83 | (cCharAt12 << i85);
                i23 = i38;
            } else {
                iArr2 = iArr4;
                i23 = i81;
            }
            int i86 = i23 + 1;
            int iCharAt12 = str.charAt(i23);
            if (iCharAt12 >= 55296) {
                int i87 = iCharAt12 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i36 = i88 + 1;
                    cCharAt11 = str.charAt(i88);
                    i37 = i87;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i87 = i37 | ((cCharAt11 & 8191) << i89);
                    i89 += 13;
                    i88 = i36;
                }
                iCharAt12 = i37 | (cCharAt11 << i89);
                i24 = i36;
            } else {
                i24 = i86;
            }
            int i90 = i12;
            int i91 = iCharAt12 & 255;
            Object[] objArr3 = objArr;
            if ((iCharAt12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                iArr[i79] = i80;
                i79++;
            }
            int i92 = iCharAt11;
            if (i91 >= 51) {
                int i93 = i24 + 1;
                int iCharAt13 = str.charAt(i24);
                char c8 = 55296;
                if (iCharAt13 >= 55296) {
                    int i94 = iCharAt13 & 8191;
                    int i95 = 13;
                    while (true) {
                        i35 = i93 + 1;
                        cCharAt10 = str.charAt(i93);
                        if (cCharAt10 < c8) {
                            break;
                        }
                        i94 |= (cCharAt10 & 8191) << i95;
                        i95 += 13;
                        i93 = i35;
                        c8 = 55296;
                    }
                    iCharAt13 = i94 | (cCharAt10 << i95);
                    i93 = i35;
                }
                int i96 = i91 - 51;
                int i97 = iCharAt13;
                if (i96 == 9 || i96 == 17) {
                    i32 = i11 + 1;
                    objArr2[((i80 / 3) * 2) + 1] = objArr3[i11];
                } else {
                    if (i96 == 12 && (i75 & 1) == 1) {
                        i32 = i11 + 1;
                        objArr2[((i80 / 3) * 2) + 1] = objArr3[i11];
                    }
                    i33 = i97 * 2;
                    obj = objArr3[i33];
                    if (obj instanceof Field) {
                        fieldD2 = (Field) obj;
                    } else {
                        fieldD2 = D(cls, (String) obj);
                        objArr3[i33] = fieldD2;
                    }
                    int i98 = i93;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                    i34 = i33 + 1;
                    obj2 = objArr3[i34];
                    if (obj2 instanceof Field) {
                        fieldD3 = (Field) obj2;
                    } else {
                        fieldD3 = D(cls, (String) obj2);
                        objArr3[i34] = fieldD3;
                    }
                    int i99 = i11;
                    z5 = z5;
                    i29 = i99;
                    i44 = i98;
                    i30 = iObjectFieldOffset3;
                    i25 = i13;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD3);
                    i28 = 0;
                }
                i11 = i32;
                i33 = i97 * 2;
                obj = objArr3[i33];
                if (obj instanceof Field) {
                    fieldD2 = (Field) obj;
                } else {
                    fieldD2 = D(cls, (String) obj);
                    objArr3[i33] = fieldD2;
                }
                int i910 = i93;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldD2);
                i34 = i33 + 1;
                obj2 = objArr3[i34];
                if (obj2 instanceof Field) {
                    fieldD3 = (Field) obj2;
                } else {
                    fieldD3 = D(cls, (String) obj2);
                    objArr3[i34] = fieldD3;
                }
                int i911 = i11;
                z5 = z5;
                i29 = i911;
                i44 = i910;
                i30 = iObjectFieldOffset4;
                i25 = i13;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD3);
                i28 = 0;
            } else {
                int i100 = i11 + 1;
                Field fieldD4 = D(cls, (String) objArr3[i11]);
                if (i91 == 9 || i91 == 17) {
                    i25 = i13;
                    objArr2[((i80 / 3) * 2) + 1] = fieldD4.getType();
                } else {
                    if (i91 == 27 || i91 == 49) {
                        i25 = i13;
                        i31 = i11 + 2;
                        objArr2[((i80 / 3) * 2) + 1] = objArr3[i100];
                    } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                        i25 = i13;
                        if ((i75 & 1) == 1) {
                            i31 = i11 + 2;
                            objArr2[((i80 / 3) * 2) + 1] = objArr3[i100];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                        if ((i75 & 1) == 1 || i91 > 17) {
                            i27 = i24;
                            i28 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            int i101 = i24 + 1;
                            int iCharAt14 = str.charAt(i24);
                            if (iCharAt14 >= 55296) {
                                int i102 = iCharAt14 & 8191;
                                int i103 = 13;
                                while (true) {
                                    i27 = i101 + 1;
                                    cCharAt9 = str.charAt(i101);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i102 |= (cCharAt9 & 8191) << i103;
                                    i103 += 13;
                                    i101 = i27;
                                }
                                iCharAt14 = i102 | (cCharAt9 << i103);
                            } else {
                                i27 = i101;
                            }
                            int i104 = (iCharAt14 / 32) + (i74 * 2);
                            Object obj3 = objArr3[i104];
                            if (obj3 instanceof Field) {
                                fieldD = (Field) obj3;
                            } else {
                                fieldD = D(cls, (String) obj3);
                                objArr3[i104] = fieldD;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD);
                            i28 = iCharAt14 % 32;
                        }
                        if (i91 >= 18 && i91 <= 49) {
                            iArr[i78] = iObjectFieldOffset;
                            i78++;
                        }
                        i29 = i26;
                        i30 = iObjectFieldOffset;
                        i44 = i27;
                    } else {
                        if (i91 == 50) {
                            int i105 = i77 + 1;
                            iArr[i77] = i80;
                            int i106 = (i80 / 3) * 2;
                            int i107 = i11 + 2;
                            objArr2[i106] = objArr3[i100];
                            if ((iCharAt12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                                i26 = i11 + 3;
                                objArr2[i106 + 1] = objArr3[i107];
                                i25 = i13;
                                i77 = i105;
                            } else {
                                i26 = i107;
                                i77 = i105;
                                i25 = i13;
                            }
                        } else {
                            i25 = i13;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                        if ((i75 & 1) == 1) {
                            i27 = i24;
                            i28 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            i27 = i24;
                            i28 = 0;
                            iObjectFieldOffset2 = 0;
                        }
                        if (i91 >= 18) {
                            iArr[i78] = iObjectFieldOffset;
                            i78++;
                        }
                        i29 = i26;
                        i30 = iObjectFieldOffset;
                        i44 = i27;
                    }
                    i26 = i31;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                    if ((i75 & 1) == 1) {
                        i27 = i24;
                        i28 = 0;
                        iObjectFieldOffset2 = 0;
                    } else {
                        i27 = i24;
                        i28 = 0;
                        iObjectFieldOffset2 = 0;
                    }
                    if (i91 >= 18) {
                        iArr[i78] = iObjectFieldOffset;
                        i78++;
                    }
                    i29 = i26;
                    i30 = iObjectFieldOffset;
                    i44 = i27;
                }
                i26 = i100;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                if ((i75 & 1) == 1) {
                    i27 = i24;
                    i28 = 0;
                    iObjectFieldOffset2 = 0;
                } else {
                    i27 = i24;
                    i28 = 0;
                    iObjectFieldOffset2 = 0;
                }
                if (i91 >= 18) {
                    iArr[i78] = iObjectFieldOffset;
                    i78++;
                }
                i29 = i26;
                i30 = iObjectFieldOffset;
                i44 = i27;
            }
            int i108 = i80 + 1;
            iArr2[i80] = i92;
            int i109 = i80 + 2;
            String str2 = str;
            iArr2[i108] = ((iCharAt12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 536870912 : 0) | ((iCharAt12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 268435456 : 0) | (i91 << 20) | i30;
            i80 += 3;
            iArr2[i109] = (i28 << 20) | iObjectFieldOffset2;
            boolean z6 = z5;
            i11 = i29;
            z5 = z6;
            i12 = i90;
            length = i82;
            objArr = objArr3;
            iArr4 = iArr2;
            i13 = i25;
            str = str2;
        }
        return new m0(iArr4, objArr2, i12, i13, u0Var.f1938a, z5, iArr, i14, i76, o0Var, c0Var, f1Var, lVar, i0Var);
    }

    public static long y(int i7) {
        return i7 & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) n1.f1911d.i(j, obj)).intValue();
    }

    public final void B(Object obj, int i7, g gVar, v0 v0Var, k kVar) throws v {
        int iZ;
        List listC = this.f1898l.c(i7 & 1048575, obj);
        f fVar = (f) gVar.f1863e;
        int i10 = gVar.f1860b;
        if ((i10 & 7) != 2) {
            throw w.b();
        }
        do {
            listC.add(gVar.E(v0Var, kVar));
            if (fVar.c() || gVar.f1862d != 0) {
                return;
            } else {
                iZ = fVar.z();
            }
        } while (iZ == i10);
        gVar.f1862d = iZ;
    }

    public final void C(int i7, g gVar, Object obj) {
        if ((536870912 & i7) != 0) {
            n1.o(i7 & 1048575, obj, gVar.Q());
        } else if (this.f1894f) {
            n1.o(i7 & 1048575, obj, gVar.O());
        } else {
            n1.o(i7 & 1048575, obj, gVar.i());
        }
    }

    public final void E(int i7, Object obj) {
        if (this.f1895g) {
            return;
        }
        int i10 = this.f1889a[i7 + 2];
        long j = i10 & 1048575;
        n1.m(n1.f1911d.g(j, obj) | (1 << (i10 >>> 20)), j, obj);
    }

    public final void F(int i7, int i10, Object obj) {
        n1.m(i7, this.f1889a[i10 + 2] & 1048575, obj);
    }

    public final int H(int i7) {
        return this.f1889a[i7 + 1];
    }

    public final void I(Object obj, e0 e0Var) throws h {
        int i7;
        int i10;
        int i11;
        boolean z5;
        int[] iArr = this.f1889a;
        int length = iArr.length;
        Unsafe unsafe = f1888p;
        int i12 = -1;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 = i11 + 3) {
            int iH = H(i14);
            int i15 = iArr[i14];
            int iG = G(iH);
            if (this.f1895g || iG > 17) {
                i7 = 1048575;
                i10 = 0;
            } else {
                int i16 = iArr[i14 + 2];
                i7 = 1048575;
                int i17 = i16 & 1048575;
                if (i17 != i12) {
                    i13 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            }
            long j = iH & i7;
            switch (iG) {
                case 0:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        double dE = n1.f1911d.e(j, obj);
                        i iVar = (i) e0Var.f1840a;
                        iVar.getClass();
                        iVar.K(i15, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        float f2 = n1.f1911d.f(j, obj);
                        i iVar2 = (i) e0Var.f1840a;
                        iVar2.getClass();
                        iVar2.I(i15, Float.floatToRawIntBits(f2));
                    }
                    break;
                case 2:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).U(i15, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).U(i15, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).M(i15, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).K(i15, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).I(i15, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).F(i15, n1.f1911d.c(j, obj));
                    }
                    break;
                case 8:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        K(i15, unsafe.getObject(obj, j), e0Var);
                    }
                    break;
                case 9:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).O(i15, (a) unsafe.getObject(obj, j), n(i11));
                    }
                    break;
                case 10:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        e0Var.a(i15, (e) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).S(i15, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).M(i15, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).I(i15, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((i) e0Var.f1840a).K(i15, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        int i18 = unsafe.getInt(obj, j);
                        ((i) e0Var.f1840a).S(i15, (i18 >> 31) ^ (i18 << 1));
                    }
                    break;
                case 16:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        ((i) e0Var.f1840a).U(i15, (j5 >> 63) ^ (j5 << 1));
                    }
                    break;
                case 17:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        e0Var.b(i15, unsafe.getObject(obj, j), n(i11));
                    }
                    break;
                case 18:
                    i11 = i14;
                    w0.A(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 19:
                    i11 = i14;
                    w0.E(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 20:
                    i11 = i14;
                    w0.H(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 21:
                    i11 = i14;
                    w0.P(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 22:
                    i11 = i14;
                    w0.G(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 23:
                    i11 = i14;
                    w0.D(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 24:
                    i11 = i14;
                    w0.C(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 25:
                    i11 = i14;
                    w0.y(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 26:
                    i11 = i14;
                    w0.N(iArr[i11], (List) unsafe.getObject(obj, j), e0Var);
                    break;
                case 27:
                    i11 = i14;
                    w0.I(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, n(i11));
                    break;
                case 28:
                    i11 = i14;
                    w0.z(iArr[i11], (List) unsafe.getObject(obj, j), e0Var);
                    break;
                case 29:
                    i11 = i14;
                    z5 = false;
                    w0.O(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 30:
                    i11 = i14;
                    z5 = false;
                    w0.B(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 31:
                    i11 = i14;
                    z5 = false;
                    w0.J(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 32:
                    i11 = i14;
                    z5 = false;
                    w0.K(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 33:
                    i11 = i14;
                    z5 = false;
                    w0.L(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 34:
                    i11 = i14;
                    z5 = false;
                    w0.M(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, false);
                    break;
                case 35:
                    i11 = i14;
                    w0.A(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case 36:
                    i11 = i14;
                    w0.E(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    i11 = i14;
                    w0.H(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    i11 = i14;
                    w0.P(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                    i11 = i14;
                    w0.G(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case 40:
                    i11 = i14;
                    w0.D(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case 41:
                    i11 = i14;
                    w0.C(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case 42:
                    i11 = i14;
                    w0.y(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                    i11 = i14;
                    w0.O(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                    i11 = i14;
                    w0.B(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                    i11 = i14;
                    w0.J(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case 46:
                    i11 = i14;
                    w0.K(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                    i11 = i14;
                    w0.L(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case 48:
                    i11 = i14;
                    w0.M(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                    i11 = i14;
                    w0.F(iArr[i11], (List) unsafe.getObject(obj, j), e0Var, n(i11));
                    break;
                case 50:
                    i11 = i14;
                    J(e0Var, i15, unsafe.getObject(obj, j), i11);
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        double dDoubleValue = ((Double) n1.f1911d.i(j, obj)).doubleValue();
                        i iVar3 = (i) e0Var.f1840a;
                        iVar3.getClass();
                        iVar3.K(i15, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        float fFloatValue = ((Float) n1.f1911d.i(j, obj)).floatValue();
                        i iVar4 = (i) e0Var.f1840a;
                        iVar4.getClass();
                        iVar4.I(i15, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).U(i15, A(j, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).U(i15, A(j, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).M(i15, z(j, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).K(i15, A(j, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).I(i15, z(j, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).F(i15, ((Boolean) n1.f1911d.i(j, obj)).booleanValue());
                    }
                    break;
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        K(i15, unsafe.getObject(obj, j), e0Var);
                    }
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).O(i15, (a) unsafe.getObject(obj, j), n(i11));
                    }
                    break;
                case 61:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        e0Var.a(i15, (e) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).S(i15, z(j, obj));
                    }
                    break;
                case 63:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).M(i15, z(j, obj));
                    }
                    break;
                case 64:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).I(i15, z(j, obj));
                    }
                    break;
                case 65:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        ((i) e0Var.f1840a).K(i15, A(j, obj));
                    }
                    break;
                case 66:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        int iZ = z(j, obj);
                        ((i) e0Var.f1840a).S(i15, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case 67:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        long jA = A(j, obj);
                        ((i) e0Var.f1840a).U(i15, (jA >> 63) ^ (jA << 1));
                    }
                    break;
                case 68:
                    i11 = i14;
                    if (r(i15, i11, obj)) {
                        e0Var.b(i15, unsafe.getObject(obj, j), n(i11));
                    }
                    break;
                default:
                    i11 = i14;
                    break;
            }
        }
        this.f1899m.getClass();
        ((s) obj).unknownFields.d(e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:48:0x014e  */
    /* JADX WARN: Code duplicated, block: B:49:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x016f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0176  */
    /* JADX WARN: Code duplicated, block: B:53:0x017f  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0203  */
    /* JADX WARN: Code duplicated, block: B:72:0x020e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0215  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148 A[SYNTHETIC] */
    public final void J(e0 e0Var, int i7, Object obj, int i10) throws h {
        int iA;
        int size;
        int iZ;
        int i11;
        int iY;
        int size2;
        int iZ2;
        if (obj != null) {
            Object objM = m(i10);
            this.f1900n.getClass();
            f0 f0Var = ((g0) objM).f1864a;
            v1 v1Var = f0Var.f1857b;
            v1 v1Var2 = f0Var.f1856a;
            i iVar = (i) e0Var.f1840a;
            iVar.getClass();
            for (Map.Entry entry : ((h0) obj).entrySet()) {
                iVar.R(i7, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i12 = n.f1902c;
                int iY2 = i.y(1);
                s1 s1Var = v1.f1943v;
                if (v1Var2 == s1Var) {
                    iY2 *= 2;
                }
                int iA2 = 8;
                switch (v1Var2.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        iA = 8;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key2);
                                n.b(iVar, v1Var, 2, value2);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key3 = entry.getKey();
                                Object value3 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key3);
                                n.b(iVar, v1Var, 2, value3);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key4 = entry.getKey();
                                Object value4 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key4);
                                n.b(iVar, v1Var, 2, value4);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key5 = entry.getKey();
                                Object value5 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key5);
                                n.b(iVar, v1Var, 2, value5);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key6 = entry.getKey();
                                Object value6 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key6);
                                n.b(iVar, v1Var, 2, value6);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key7 = entry.getKey();
                                Object value7 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key7);
                                n.b(iVar, v1Var, 2, value7);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key8 = entry.getKey();
                                Object value8 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key8);
                                n.b(iVar, v1Var, 2, value8);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key9 = entry.getKey();
                                Object value9 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key9);
                                n.b(iVar, v1Var, 2, value9);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key10 = entry.getKey();
                                Object value10 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key10);
                                n.b(iVar, v1Var, 2, value10);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key11 = entry.getKey();
                                Object value11 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11);
                                n.b(iVar, v1Var, 2, value11);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key12 = entry.getKey();
                                Object value12 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key12);
                                n.b(iVar, v1Var, 2, value12);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key13 = entry.getKey();
                                Object value13 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key13);
                                n.b(iVar, v1Var, 2, value13);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key14 = entry.getKey();
                                Object value14 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key14);
                                n.b(iVar, v1Var, 2, value14);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key15 = entry.getKey();
                                Object value15 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key15);
                                n.b(iVar, v1Var, 2, value15);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key16 = entry.getKey();
                                Object value16 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key16);
                                n.b(iVar, v1Var, 2, value16);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key17 = entry.getKey();
                                Object value17 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key17);
                                n.b(iVar, v1Var, 2, value17);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue >> 31) ^ (iIntValue << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key18 = entry.getKey();
                                Object value18 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key18);
                                n.b(iVar, v1Var, 2, value18);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iA2 = i.A((jLongValue >> 63) ^ (jLongValue << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key19 = entry.getKey();
                                Object value19 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key19);
                                n.b(iVar, v1Var, 2, value19);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 1:
                        ((Float) key).getClass();
                        iA = 4;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key110 = entry.getKey();
                                Object value110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key110);
                                n.b(iVar, v1Var, 2, value110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111 = entry.getKey();
                                Object value111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111);
                                n.b(iVar, v1Var, 2, value111);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key112 = entry.getKey();
                                Object value112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key112);
                                n.b(iVar, v1Var, 2, value112);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key113 = entry.getKey();
                                Object value113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key113);
                                n.b(iVar, v1Var, 2, value113);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key114 = entry.getKey();
                                Object value114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key114);
                                n.b(iVar, v1Var, 2, value114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key115 = entry.getKey();
                                Object value115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key115);
                                n.b(iVar, v1Var, 2, value115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key116 = entry.getKey();
                                Object value116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key116);
                                n.b(iVar, v1Var, 2, value116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key117 = entry.getKey();
                                Object value117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key117);
                                n.b(iVar, v1Var, 2, value117);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key118 = entry.getKey();
                                Object value118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key118);
                                n.b(iVar, v1Var, 2, value118);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key119 = entry.getKey();
                                Object value119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key119);
                                n.b(iVar, v1Var, 2, value119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1110 = entry.getKey();
                                Object value1110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1110);
                                n.b(iVar, v1Var, 2, value1110);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111 = entry.getKey();
                                Object value1111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111);
                                n.b(iVar, v1Var, 2, value1111);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1112 = entry.getKey();
                                Object value1112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1112);
                                n.b(iVar, v1Var, 2, value1112);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1113 = entry.getKey();
                                Object value1113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1113);
                                n.b(iVar, v1Var, 2, value1113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1114 = entry.getKey();
                                Object value1114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1114);
                                n.b(iVar, v1Var, 2, value1114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1115 = entry.getKey();
                                Object value1115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1115);
                                n.b(iVar, v1Var, 2, value1115);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1116 = entry.getKey();
                                Object value1116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1116);
                                n.b(iVar, v1Var, 2, value1116);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1117 = entry.getKey();
                                Object value1117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1117);
                                n.b(iVar, v1Var, 2, value1117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 2:
                        iA = i.A(((Long) key).longValue());
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1118 = entry.getKey();
                                Object value1118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1118);
                                n.b(iVar, v1Var, 2, value1118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1119 = entry.getKey();
                                Object value1119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1119);
                                n.b(iVar, v1Var, 2, value1119);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11110 = entry.getKey();
                                Object value11110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11110);
                                n.b(iVar, v1Var, 2, value11110);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111 = entry.getKey();
                                Object value11111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111);
                                n.b(iVar, v1Var, 2, value11111);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11112 = entry.getKey();
                                Object value11112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11112);
                                n.b(iVar, v1Var, 2, value11112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11113 = entry.getKey();
                                Object value11113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11113);
                                n.b(iVar, v1Var, 2, value11113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11114 = entry.getKey();
                                Object value11114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11114);
                                n.b(iVar, v1Var, 2, value11114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key11115 = entry.getKey();
                                Object value11115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11115);
                                n.b(iVar, v1Var, 2, value11115);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key11116 = entry.getKey();
                                Object value11116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11116);
                                n.b(iVar, v1Var, 2, value11116);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key11117 = entry.getKey();
                                Object value11117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11117);
                                n.b(iVar, v1Var, 2, value11117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11118 = entry.getKey();
                                Object value11118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11118);
                                n.b(iVar, v1Var, 2, value11118);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11119 = entry.getKey();
                                Object value11119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11119);
                                n.b(iVar, v1Var, 2, value11119);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111110 = entry.getKey();
                                Object value111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111110);
                                n.b(iVar, v1Var, 2, value111110);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111 = entry.getKey();
                                Object value111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111);
                                n.b(iVar, v1Var, 2, value111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111112 = entry.getKey();
                                Object value111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111112);
                                n.b(iVar, v1Var, 2, value111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111113 = entry.getKey();
                                Object value111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111113);
                                n.b(iVar, v1Var, 2, value111113);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key111114 = entry.getKey();
                                Object value111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111114);
                                n.b(iVar, v1Var, 2, value111114);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key111115 = entry.getKey();
                                Object value111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111115);
                                n.b(iVar, v1Var, 2, value111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 3:
                        iA = i.A(((Long) key).longValue());
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111116 = entry.getKey();
                                Object value111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111116);
                                n.b(iVar, v1Var, 2, value111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111117 = entry.getKey();
                                Object value111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111117);
                                n.b(iVar, v1Var, 2, value111117);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111118 = entry.getKey();
                                Object value111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111118);
                                n.b(iVar, v1Var, 2, value111118);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111119 = entry.getKey();
                                Object value111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111119);
                                n.b(iVar, v1Var, 2, value111119);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111110 = entry.getKey();
                                Object value1111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111110);
                                n.b(iVar, v1Var, 2, value1111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111 = entry.getKey();
                                Object value1111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111);
                                n.b(iVar, v1Var, 2, value1111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111112 = entry.getKey();
                                Object value1111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111112);
                                n.b(iVar, v1Var, 2, value1111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key1111113 = entry.getKey();
                                Object value1111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111113);
                                n.b(iVar, v1Var, 2, value1111113);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key1111114 = entry.getKey();
                                Object value1111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111114);
                                n.b(iVar, v1Var, 2, value1111114);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key1111115 = entry.getKey();
                                Object value1111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111115);
                                n.b(iVar, v1Var, 2, value1111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111116 = entry.getKey();
                                Object value1111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111116);
                                n.b(iVar, v1Var, 2, value1111116);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111117 = entry.getKey();
                                Object value1111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111117);
                                n.b(iVar, v1Var, 2, value1111117);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111118 = entry.getKey();
                                Object value1111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111118);
                                n.b(iVar, v1Var, 2, value1111118);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111119 = entry.getKey();
                                Object value1111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111119);
                                n.b(iVar, v1Var, 2, value1111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111110 = entry.getKey();
                                Object value11111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111110);
                                n.b(iVar, v1Var, 2, value11111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111 = entry.getKey();
                                Object value11111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111);
                                n.b(iVar, v1Var, 2, value11111111);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111112 = entry.getKey();
                                Object value11111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111112);
                                n.b(iVar, v1Var, 2, value11111112);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111113 = entry.getKey();
                                Object value11111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111113);
                                n.b(iVar, v1Var, 2, value11111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 4:
                        iA = i.w(((Integer) key).intValue());
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111114 = entry.getKey();
                                Object value11111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111114);
                                n.b(iVar, v1Var, 2, value11111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111115 = entry.getKey();
                                Object value11111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111115);
                                n.b(iVar, v1Var, 2, value11111115);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111116 = entry.getKey();
                                Object value11111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111116);
                                n.b(iVar, v1Var, 2, value11111116);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111117 = entry.getKey();
                                Object value11111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111117);
                                n.b(iVar, v1Var, 2, value11111117);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111118 = entry.getKey();
                                Object value11111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111118);
                                n.b(iVar, v1Var, 2, value11111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111119 = entry.getKey();
                                Object value11111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111119);
                                n.b(iVar, v1Var, 2, value11111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111110 = entry.getKey();
                                Object value111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111110);
                                n.b(iVar, v1Var, 2, value111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111 = entry.getKey();
                                Object value111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111);
                                n.b(iVar, v1Var, 2, value111111111);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key111111112 = entry.getKey();
                                Object value111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111112);
                                n.b(iVar, v1Var, 2, value111111112);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key111111113 = entry.getKey();
                                Object value111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111113);
                                n.b(iVar, v1Var, 2, value111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key111111114 = entry.getKey();
                                Object value111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111114);
                                n.b(iVar, v1Var, 2, value111111114);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key111111115 = entry.getKey();
                                Object value111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111115);
                                n.b(iVar, v1Var, 2, value111111115);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111116 = entry.getKey();
                                Object value111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111116);
                                n.b(iVar, v1Var, 2, value111111116);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111117 = entry.getKey();
                                Object value111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111117);
                                n.b(iVar, v1Var, 2, value111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111118 = entry.getKey();
                                Object value111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111118);
                                n.b(iVar, v1Var, 2, value111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111119 = entry.getKey();
                                Object value111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111119);
                                n.b(iVar, v1Var, 2, value111111119);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111110 = entry.getKey();
                                Object value1111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111110);
                                n.b(iVar, v1Var, 2, value1111111110);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111 = entry.getKey();
                                Object value1111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111);
                                n.b(iVar, v1Var, 2, value1111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 5:
                        ((Long) key).getClass();
                        iA = 8;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111112 = entry.getKey();
                                Object value1111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111112);
                                n.b(iVar, v1Var, 2, value1111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111113 = entry.getKey();
                                Object value1111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111113);
                                n.b(iVar, v1Var, 2, value1111111113);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111114 = entry.getKey();
                                Object value1111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111114);
                                n.b(iVar, v1Var, 2, value1111111114);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111115 = entry.getKey();
                                Object value1111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111115);
                                n.b(iVar, v1Var, 2, value1111111115);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111116 = entry.getKey();
                                Object value1111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111116);
                                n.b(iVar, v1Var, 2, value1111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111117 = entry.getKey();
                                Object value1111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111117);
                                n.b(iVar, v1Var, 2, value1111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111118 = entry.getKey();
                                Object value1111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111118);
                                n.b(iVar, v1Var, 2, value1111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111119 = entry.getKey();
                                Object value1111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111119);
                                n.b(iVar, v1Var, 2, value1111111119);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key11111111110 = entry.getKey();
                                Object value11111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111110);
                                n.b(iVar, v1Var, 2, value11111111110);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111 = entry.getKey();
                                Object value11111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111);
                                n.b(iVar, v1Var, 2, value11111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111112 = entry.getKey();
                                Object value11111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111112);
                                n.b(iVar, v1Var, 2, value11111111112);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111113 = entry.getKey();
                                Object value11111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111113);
                                n.b(iVar, v1Var, 2, value11111111113);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111114 = entry.getKey();
                                Object value11111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111114);
                                n.b(iVar, v1Var, 2, value11111111114);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111115 = entry.getKey();
                                Object value11111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111115);
                                n.b(iVar, v1Var, 2, value11111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111116 = entry.getKey();
                                Object value11111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111116);
                                n.b(iVar, v1Var, 2, value11111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111117 = entry.getKey();
                                Object value11111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111117);
                                n.b(iVar, v1Var, 2, value11111111117);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111118 = entry.getKey();
                                Object value11111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111118);
                                n.b(iVar, v1Var, 2, value11111111118);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111119 = entry.getKey();
                                Object value11111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111119);
                                n.b(iVar, v1Var, 2, value11111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 6:
                        ((Integer) key).getClass();
                        iA = 4;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111110 = entry.getKey();
                                Object value111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111110);
                                n.b(iVar, v1Var, 2, value111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111 = entry.getKey();
                                Object value111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111);
                                n.b(iVar, v1Var, 2, value111111111111);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111112 = entry.getKey();
                                Object value111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111112);
                                n.b(iVar, v1Var, 2, value111111111112);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111113 = entry.getKey();
                                Object value111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111113);
                                n.b(iVar, v1Var, 2, value111111111113);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111114 = entry.getKey();
                                Object value111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111114);
                                n.b(iVar, v1Var, 2, value111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111115 = entry.getKey();
                                Object value111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111115);
                                n.b(iVar, v1Var, 2, value111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111116 = entry.getKey();
                                Object value111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111116);
                                n.b(iVar, v1Var, 2, value111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111117 = entry.getKey();
                                Object value111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111117);
                                n.b(iVar, v1Var, 2, value111111111117);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key111111111118 = entry.getKey();
                                Object value111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111118);
                                n.b(iVar, v1Var, 2, value111111111118);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111119 = entry.getKey();
                                Object value111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111119);
                                n.b(iVar, v1Var, 2, value111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111110 = entry.getKey();
                                Object value1111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111110);
                                n.b(iVar, v1Var, 2, value1111111111110);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111 = entry.getKey();
                                Object value1111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111);
                                n.b(iVar, v1Var, 2, value1111111111111);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111112 = entry.getKey();
                                Object value1111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111112);
                                n.b(iVar, v1Var, 2, value1111111111112);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111113 = entry.getKey();
                                Object value1111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111113);
                                n.b(iVar, v1Var, 2, value1111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111114 = entry.getKey();
                                Object value1111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111114);
                                n.b(iVar, v1Var, 2, value1111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111115 = entry.getKey();
                                Object value1111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111115);
                                n.b(iVar, v1Var, 2, value1111111111115);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111116 = entry.getKey();
                                Object value1111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111116);
                                n.b(iVar, v1Var, 2, value1111111111116);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111117 = entry.getKey();
                                Object value1111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111117);
                                n.b(iVar, v1Var, 2, value1111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 7:
                        ((Boolean) key).getClass();
                        iA = 1;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111118 = entry.getKey();
                                Object value1111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111118);
                                n.b(iVar, v1Var, 2, value1111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111119 = entry.getKey();
                                Object value1111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111119);
                                n.b(iVar, v1Var, 2, value1111111111119);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111110 = entry.getKey();
                                Object value11111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111110);
                                n.b(iVar, v1Var, 2, value11111111111110);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111 = entry.getKey();
                                Object value11111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111);
                                n.b(iVar, v1Var, 2, value11111111111111);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111112 = entry.getKey();
                                Object value11111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111112);
                                n.b(iVar, v1Var, 2, value11111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111113 = entry.getKey();
                                Object value11111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111113);
                                n.b(iVar, v1Var, 2, value11111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111114 = entry.getKey();
                                Object value11111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111114);
                                n.b(iVar, v1Var, 2, value11111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111115 = entry.getKey();
                                Object value11111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111115);
                                n.b(iVar, v1Var, 2, value11111111111115);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111116 = entry.getKey();
                                Object value11111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111116);
                                n.b(iVar, v1Var, 2, value11111111111116);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111117 = entry.getKey();
                                Object value11111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111117);
                                n.b(iVar, v1Var, 2, value11111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111118 = entry.getKey();
                                Object value11111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111118);
                                n.b(iVar, v1Var, 2, value11111111111118);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111119 = entry.getKey();
                                Object value11111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111119);
                                n.b(iVar, v1Var, 2, value11111111111119);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111110 = entry.getKey();
                                Object value111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111110);
                                n.b(iVar, v1Var, 2, value111111111111110);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111 = entry.getKey();
                                Object value111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111);
                                n.b(iVar, v1Var, 2, value111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111112 = entry.getKey();
                                Object value111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111112);
                                n.b(iVar, v1Var, 2, value111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111113 = entry.getKey();
                                Object value111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111113);
                                n.b(iVar, v1Var, 2, value111111111111113);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111114 = entry.getKey();
                                Object value111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111114);
                                n.b(iVar, v1Var, 2, value111111111111114);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111115 = entry.getKey();
                                Object value111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111115);
                                n.b(iVar, v1Var, 2, value111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 8:
                        if (key instanceof e) {
                            size = ((e) key).size();
                            iZ = i.z(size);
                            iA = size + iZ;
                        } else {
                            iA = i.x((String) key);
                        }
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111116 = entry.getKey();
                                Object value111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111116);
                                n.b(iVar, v1Var, 2, value111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111117 = entry.getKey();
                                Object value111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111117);
                                n.b(iVar, v1Var, 2, value111111111111117);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111118 = entry.getKey();
                                Object value111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111118);
                                n.b(iVar, v1Var, 2, value111111111111118);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111119 = entry.getKey();
                                Object value111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111119);
                                n.b(iVar, v1Var, 2, value111111111111119);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111110 = entry.getKey();
                                Object value1111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111110);
                                n.b(iVar, v1Var, 2, value1111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111 = entry.getKey();
                                Object value1111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111);
                                n.b(iVar, v1Var, 2, value1111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111112 = entry.getKey();
                                Object value1111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111112);
                                n.b(iVar, v1Var, 2, value1111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111113 = entry.getKey();
                                Object value1111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111113);
                                n.b(iVar, v1Var, 2, value1111111111111113);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111114 = entry.getKey();
                                Object value1111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111114);
                                n.b(iVar, v1Var, 2, value1111111111111114);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111115 = entry.getKey();
                                Object value1111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111115);
                                n.b(iVar, v1Var, 2, value1111111111111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111116 = entry.getKey();
                                Object value1111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111116);
                                n.b(iVar, v1Var, 2, value1111111111111116);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111117 = entry.getKey();
                                Object value1111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111117);
                                n.b(iVar, v1Var, 2, value1111111111111117);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111118 = entry.getKey();
                                Object value1111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111118);
                                n.b(iVar, v1Var, 2, value1111111111111118);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111119 = entry.getKey();
                                Object value1111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111119);
                                n.b(iVar, v1Var, 2, value1111111111111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111110 = entry.getKey();
                                Object value11111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111110);
                                n.b(iVar, v1Var, 2, value11111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111 = entry.getKey();
                                Object value11111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111);
                                n.b(iVar, v1Var, 2, value11111111111111111);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111112 = entry.getKey();
                                Object value11111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111112);
                                n.b(iVar, v1Var, 2, value11111111111111112);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111113 = entry.getKey();
                                Object value11111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111113);
                                n.b(iVar, v1Var, 2, value11111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 9:
                        iA = ((a) key).a();
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111114 = entry.getKey();
                                Object value11111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111114);
                                n.b(iVar, v1Var, 2, value11111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111115 = entry.getKey();
                                Object value11111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111115);
                                n.b(iVar, v1Var, 2, value11111111111111115);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111116 = entry.getKey();
                                Object value11111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111116);
                                n.b(iVar, v1Var, 2, value11111111111111116);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111117 = entry.getKey();
                                Object value11111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111117);
                                n.b(iVar, v1Var, 2, value11111111111111117);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111118 = entry.getKey();
                                Object value11111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111118);
                                n.b(iVar, v1Var, 2, value11111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111119 = entry.getKey();
                                Object value11111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111119);
                                n.b(iVar, v1Var, 2, value11111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111110 = entry.getKey();
                                Object value111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111110);
                                n.b(iVar, v1Var, 2, value111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111 = entry.getKey();
                                Object value111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111);
                                n.b(iVar, v1Var, 2, value111111111111111111);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111112 = entry.getKey();
                                Object value111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111112);
                                n.b(iVar, v1Var, 2, value111111111111111112);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111113 = entry.getKey();
                                Object value111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111113);
                                n.b(iVar, v1Var, 2, value111111111111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111114 = entry.getKey();
                                Object value111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111114);
                                n.b(iVar, v1Var, 2, value111111111111111114);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111115 = entry.getKey();
                                Object value111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111115);
                                n.b(iVar, v1Var, 2, value111111111111111115);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111116 = entry.getKey();
                                Object value111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111116);
                                n.b(iVar, v1Var, 2, value111111111111111116);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111117 = entry.getKey();
                                Object value111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111117);
                                n.b(iVar, v1Var, 2, value111111111111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111118 = entry.getKey();
                                Object value111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111118);
                                n.b(iVar, v1Var, 2, value111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111119 = entry.getKey();
                                Object value111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111119);
                                n.b(iVar, v1Var, 2, value111111111111111119);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111110 = entry.getKey();
                                Object value1111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111110);
                                n.b(iVar, v1Var, 2, value1111111111111111110);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111 = entry.getKey();
                                Object value1111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111);
                                n.b(iVar, v1Var, 2, value1111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 10:
                        size = ((a) key).a();
                        iZ = i.z(size);
                        iA = size + iZ;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111112 = entry.getKey();
                                Object value1111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111112);
                                n.b(iVar, v1Var, 2, value1111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111113 = entry.getKey();
                                Object value1111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111113);
                                n.b(iVar, v1Var, 2, value1111111111111111113);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111114 = entry.getKey();
                                Object value1111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111114);
                                n.b(iVar, v1Var, 2, value1111111111111111114);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111115 = entry.getKey();
                                Object value1111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111115);
                                n.b(iVar, v1Var, 2, value1111111111111111115);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111116 = entry.getKey();
                                Object value1111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111116);
                                n.b(iVar, v1Var, 2, value1111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111117 = entry.getKey();
                                Object value1111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111117);
                                n.b(iVar, v1Var, 2, value1111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111118 = entry.getKey();
                                Object value1111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111118);
                                n.b(iVar, v1Var, 2, value1111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111119 = entry.getKey();
                                Object value1111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111119);
                                n.b(iVar, v1Var, 2, value1111111111111111119);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111110 = entry.getKey();
                                Object value11111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111110);
                                n.b(iVar, v1Var, 2, value11111111111111111110);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111 = entry.getKey();
                                Object value11111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111);
                                n.b(iVar, v1Var, 2, value11111111111111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111112 = entry.getKey();
                                Object value11111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111112);
                                n.b(iVar, v1Var, 2, value11111111111111111112);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111113 = entry.getKey();
                                Object value11111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111113);
                                n.b(iVar, v1Var, 2, value11111111111111111113);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111114 = entry.getKey();
                                Object value11111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111114);
                                n.b(iVar, v1Var, 2, value11111111111111111114);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111115 = entry.getKey();
                                Object value11111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111115);
                                n.b(iVar, v1Var, 2, value11111111111111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111116 = entry.getKey();
                                Object value11111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111116);
                                n.b(iVar, v1Var, 2, value11111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111117 = entry.getKey();
                                Object value11111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111117);
                                n.b(iVar, v1Var, 2, value11111111111111111117);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111118 = entry.getKey();
                                Object value11111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111118);
                                n.b(iVar, v1Var, 2, value11111111111111111118);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111119 = entry.getKey();
                                Object value11111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111119);
                                n.b(iVar, v1Var, 2, value11111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 11:
                        if (key instanceof e) {
                            size = ((e) key).size();
                            iZ = i.z(size);
                        } else {
                            size = ((byte[]) key).length;
                            iZ = i.z(size);
                        }
                        iA = size + iZ;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111110 = entry.getKey();
                                Object value111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111110);
                                n.b(iVar, v1Var, 2, value111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111 = entry.getKey();
                                Object value111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111);
                                n.b(iVar, v1Var, 2, value111111111111111111111);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111112 = entry.getKey();
                                Object value111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111112);
                                n.b(iVar, v1Var, 2, value111111111111111111112);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111113 = entry.getKey();
                                Object value111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111113);
                                n.b(iVar, v1Var, 2, value111111111111111111113);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111114 = entry.getKey();
                                Object value111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111114);
                                n.b(iVar, v1Var, 2, value111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111115 = entry.getKey();
                                Object value111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111115);
                                n.b(iVar, v1Var, 2, value111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111116 = entry.getKey();
                                Object value111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111116);
                                n.b(iVar, v1Var, 2, value111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111117 = entry.getKey();
                                Object value111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111117);
                                n.b(iVar, v1Var, 2, value111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111118 = entry.getKey();
                                Object value111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111118);
                                n.b(iVar, v1Var, 2, value111111111111111111118);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111119 = entry.getKey();
                                Object value111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111119);
                                n.b(iVar, v1Var, 2, value111111111111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111110 = entry.getKey();
                                Object value1111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111110);
                                n.b(iVar, v1Var, 2, value1111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111);
                                n.b(iVar, v1Var, 2, value1111111111111111111111);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111112 = entry.getKey();
                                Object value1111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111112);
                                n.b(iVar, v1Var, 2, value1111111111111111111112);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111113 = entry.getKey();
                                Object value1111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111113);
                                n.b(iVar, v1Var, 2, value1111111111111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111114 = entry.getKey();
                                Object value1111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111114);
                                n.b(iVar, v1Var, 2, value1111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111115 = entry.getKey();
                                Object value1111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111115);
                                n.b(iVar, v1Var, 2, value1111111111111111111115);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111116 = entry.getKey();
                                Object value1111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111116);
                                n.b(iVar, v1Var, 2, value1111111111111111111116);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111117 = entry.getKey();
                                Object value1111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111117);
                                n.b(iVar, v1Var, 2, value1111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 12:
                        iA = i.z(((Integer) key).intValue());
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111118 = entry.getKey();
                                Object value1111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111118);
                                n.b(iVar, v1Var, 2, value1111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111119 = entry.getKey();
                                Object value1111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111119);
                                n.b(iVar, v1Var, 2, value1111111111111111111119);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111110 = entry.getKey();
                                Object value11111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111110);
                                n.b(iVar, v1Var, 2, value11111111111111111111110);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111);
                                n.b(iVar, v1Var, 2, value11111111111111111111111);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111112 = entry.getKey();
                                Object value11111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111112);
                                n.b(iVar, v1Var, 2, value11111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111113 = entry.getKey();
                                Object value11111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111113);
                                n.b(iVar, v1Var, 2, value11111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111114 = entry.getKey();
                                Object value11111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111114);
                                n.b(iVar, v1Var, 2, value11111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111115 = entry.getKey();
                                Object value11111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111115);
                                n.b(iVar, v1Var, 2, value11111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111116 = entry.getKey();
                                Object value11111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111116);
                                n.b(iVar, v1Var, 2, value11111111111111111111116);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111117 = entry.getKey();
                                Object value11111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111117);
                                n.b(iVar, v1Var, 2, value11111111111111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111118 = entry.getKey();
                                Object value11111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111118);
                                n.b(iVar, v1Var, 2, value11111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111119 = entry.getKey();
                                Object value11111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111119);
                                n.b(iVar, v1Var, 2, value11111111111111111111119);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111110);
                                n.b(iVar, v1Var, 2, value111111111111111111111110);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111);
                                n.b(iVar, v1Var, 2, value111111111111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111112);
                                n.b(iVar, v1Var, 2, value111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111113);
                                n.b(iVar, v1Var, 2, value111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111114);
                                n.b(iVar, v1Var, 2, value111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111115);
                                n.b(iVar, v1Var, 2, value111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 13:
                        iA = i.w(((Integer) key).intValue());
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111116);
                                n.b(iVar, v1Var, 2, value111111111111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111117);
                                n.b(iVar, v1Var, 2, value111111111111111111111117);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111118);
                                n.b(iVar, v1Var, 2, value111111111111111111111118);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111119);
                                n.b(iVar, v1Var, 2, value111111111111111111111119);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111110);
                                n.b(iVar, v1Var, 2, value1111111111111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111112);
                                n.b(iVar, v1Var, 2, value1111111111111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111113);
                                n.b(iVar, v1Var, 2, value1111111111111111111111113);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111114);
                                n.b(iVar, v1Var, 2, value1111111111111111111111114);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111115);
                                n.b(iVar, v1Var, 2, value1111111111111111111111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111116);
                                n.b(iVar, v1Var, 2, value1111111111111111111111116);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111117);
                                n.b(iVar, v1Var, 2, value1111111111111111111111117);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111118);
                                n.b(iVar, v1Var, 2, value1111111111111111111111118);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111119);
                                n.b(iVar, v1Var, 2, value1111111111111111111111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111110);
                                n.b(iVar, v1Var, 2, value11111111111111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111112);
                                n.b(iVar, v1Var, 2, value11111111111111111111111112);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111113);
                                n.b(iVar, v1Var, 2, value11111111111111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iA = 4;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111114);
                                n.b(iVar, v1Var, 2, value11111111111111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111115);
                                n.b(iVar, v1Var, 2, value11111111111111111111111115);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111116);
                                n.b(iVar, v1Var, 2, value11111111111111111111111116);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111117);
                                n.b(iVar, v1Var, 2, value11111111111111111111111117);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111118);
                                n.b(iVar, v1Var, 2, value11111111111111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111119);
                                n.b(iVar, v1Var, 2, value11111111111111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111110);
                                n.b(iVar, v1Var, 2, value111111111111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111112);
                                n.b(iVar, v1Var, 2, value111111111111111111111111112);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111113);
                                n.b(iVar, v1Var, 2, value111111111111111111111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111114);
                                n.b(iVar, v1Var, 2, value111111111111111111111111114);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111115);
                                n.b(iVar, v1Var, 2, value111111111111111111111111115);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111116);
                                n.b(iVar, v1Var, 2, value111111111111111111111111116);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111117);
                                n.b(iVar, v1Var, 2, value111111111111111111111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111118);
                                n.b(iVar, v1Var, 2, value111111111111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111119);
                                n.b(iVar, v1Var, 2, value111111111111111111111111119);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111110);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111110);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iA = 8;
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111112);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111113);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111113);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111114);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111114);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111115);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111115);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111116);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111117);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111118);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111119);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111119);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111110);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111110);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111112);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111112);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111113);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111113);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111114);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111114);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111115);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111116);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111117);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111117);
                                break;
                            case 16:
                                int iIntValue16 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111118);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111118);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111119);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 16:
                        int iIntValue17 = ((Integer) key).intValue();
                        iA = i.z((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111110);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111111);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111111);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111112);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111112);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111113);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111113);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111114);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111115);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111116);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111117);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111118);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111118);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111119);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111110);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111111);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111111);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111112);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111112);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111113);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111114);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111115);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111115);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111116);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111116);
                                break;
                            case 17:
                                long jLongValue17 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111117);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 17:
                        long jLongValue18 = ((Long) key).longValue();
                        iA = i.A((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                        i11 = iA + iY2;
                        iY = i.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111118);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key1111111111111111111111111111119);
                                n.b(iVar, v1Var, 2, value1111111111111111111111111111119);
                                break;
                            case 2:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111110);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111110);
                                break;
                            case 3:
                                iA2 = i.A(((Long) value).longValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111111);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111111);
                                break;
                            case 4:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111112);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111113);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111114);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111115);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = i.x((String) value);
                                }
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111111116 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111116);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111116);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111111117 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111117);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = i.z(size2);
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111111118 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111118);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof e) {
                                    size2 = ((e) value).size();
                                    iZ2 = i.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = i.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                iVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111111119 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key11111111111111111111111111111119);
                                n.b(iVar, v1Var, 2, value11111111111111111111111111111119);
                                break;
                            case 12:
                                iA2 = i.z(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111111110 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111111110);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111111110);
                                break;
                            case 13:
                                iA2 = i.w(((Integer) value).intValue());
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111111 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111111111);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111111112 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111111112);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111111113 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111111113);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iA2 = i.z((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111111114 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111111114);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iA2 = i.A((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                                iVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111111115 = entry.getValue();
                                n.b(iVar, v1Var2, 1, key111111111111111111111111111111115);
                                n.b(iVar, v1Var, 2, value111111111111111111111111111111115);
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
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void a(Object obj) {
        int[] iArr;
        int i7;
        int i10 = this.f1897i;
        while (true) {
            iArr = this.f1896h;
            i7 = this.j;
            if (i10 >= i7) {
                break;
            }
            long jH = H(iArr[i10]) & 1048575;
            Object objI = n1.f1911d.i(jH, obj);
            if (objI != null) {
                this.f1900n.getClass();
                ((h0) objI).f1867d = false;
                n1.o(jH, obj, objI);
            }
            i10++;
        }
        int length = iArr.length;
        while (i7 < length) {
            this.f1898l.a(iArr[i7], obj);
            i7++;
        }
        this.f1899m.getClass();
        ((s) obj).unknownFields.f1846e = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0123 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean b(Object obj) {
        int i7;
        int iG;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean zQ = true;
            if (i11 >= this.f1897i) {
                return true;
            }
            int i13 = this.f1896h[i11];
            int[] iArr = this.f1889a;
            int i14 = iArr[i13];
            int iH = H(i13);
            boolean z5 = this.f1895g;
            if (z5) {
                i7 = 0;
            } else {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                i7 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i12 = f1888p.getInt(obj, i16);
                    i10 = i16;
                }
            }
            if ((268435456 & iH) == 0) {
                iG = G(iH);
                if (iG != 9 || iG == 17) {
                    if (z5) {
                        zQ = q(i13, obj);
                    } else if ((i7 & i12) == 0) {
                        zQ = false;
                    }
                    if (zQ) {
                        continue;
                    } else if (!n(i13).b(n1.f1911d.i(iH & 1048575, obj))) {
                    }
                    i11++;
                } else {
                    if (iG != 27) {
                        if (iG == 60 || iG == 68) {
                            if (!r(i14, i13, obj)) {
                                continue;
                            } else if (!n(i13).b(n1.f1911d.i(iH & 1048575, obj))) {
                            }
                            i11++;
                        } else if (iG != 49) {
                            if (iG != 50) {
                                continue;
                            } else {
                                Object objI = n1.f1911d.i(iH & 1048575, obj);
                                this.f1900n.getClass();
                                h0 h0Var = (h0) objI;
                                if (!h0Var.isEmpty() && ((g0) m(i13)).f1864a.f1857b.f1946d == w1.F) {
                                    v0 v0VarA = null;
                                    for (Object obj2 : h0Var.values()) {
                                        if (v0VarA == null) {
                                            v0VarA = s0.f1930c.a(obj2.getClass());
                                        }
                                        if (!v0VarA.b(obj2)) {
                                        }
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                    List list = (List) n1.f1911d.i(iH & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        v0 v0VarN = n(i13);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            if (v0VarN.b(list.get(i17))) {
                            }
                        }
                    }
                    i11++;
                }
            } else {
                if (z5 ? q(i13, obj) : (i12 & i7) != 0) {
                    iG = G(iH);
                    if (iG != 9) {
                    }
                    if (z5) {
                        zQ = q(i13, obj);
                    } else if ((i7 & i12) == 0) {
                        zQ = false;
                    }
                    if (zQ) {
                        continue;
                    } else if (!n(i13).b(n1.f1911d.i(iH & 1048575, obj))) {
                    }
                    i11++;
                }
            }
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final Object c() {
        this.k.getClass();
        return ((s) this.f1893e).d(4);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void d(Object obj, e0 e0Var) throws h {
        e0Var.getClass();
        i iVar = (i) e0Var.f1840a;
        if (!this.f1895g) {
            I(obj, e0Var);
            return;
        }
        int[] iArr = this.f1889a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iH = H(i7);
            int i10 = iArr[i7];
            switch (G(iH)) {
                case 0:
                    if (q(i7, obj)) {
                        double dE = n1.f1911d.e(iH & 1048575, obj);
                        iVar.getClass();
                        iVar.K(i10, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if (q(i7, obj)) {
                        float f2 = n1.f1911d.f(iH & 1048575, obj);
                        iVar.getClass();
                        iVar.I(i10, Float.floatToRawIntBits(f2));
                    }
                    break;
                case 2:
                    if (q(i7, obj)) {
                        iVar.U(i10, n1.f1911d.h(iH & 1048575, obj));
                    }
                    break;
                case 3:
                    if (q(i7, obj)) {
                        iVar.U(i10, n1.f1911d.h(iH & 1048575, obj));
                    }
                    break;
                case 4:
                    if (q(i7, obj)) {
                        iVar.M(i10, n1.f1911d.g(iH & 1048575, obj));
                    }
                    break;
                case 5:
                    if (q(i7, obj)) {
                        iVar.K(i10, n1.f1911d.h(iH & 1048575, obj));
                    }
                    break;
                case 6:
                    if (q(i7, obj)) {
                        iVar.I(i10, n1.f1911d.g(iH & 1048575, obj));
                    }
                    break;
                case 7:
                    if (q(i7, obj)) {
                        iVar.F(i10, n1.f1911d.c(iH & 1048575, obj));
                    }
                    break;
                case 8:
                    if (q(i7, obj)) {
                        K(i10, n1.f1911d.i(iH & 1048575, obj), e0Var);
                    }
                    break;
                case 9:
                    if (q(i7, obj)) {
                        iVar.O(i10, (a) n1.f1911d.i(iH & 1048575, obj), n(i7));
                    }
                    break;
                case 10:
                    if (q(i7, obj)) {
                        e0Var.a(i10, (e) n1.f1911d.i(iH & 1048575, obj));
                    }
                    break;
                case 11:
                    if (q(i7, obj)) {
                        iVar.S(i10, n1.f1911d.g(iH & 1048575, obj));
                    }
                    break;
                case 12:
                    if (q(i7, obj)) {
                        iVar.M(i10, n1.f1911d.g(iH & 1048575, obj));
                    }
                    break;
                case 13:
                    if (q(i7, obj)) {
                        iVar.I(i10, n1.f1911d.g(iH & 1048575, obj));
                    }
                    break;
                case 14:
                    if (q(i7, obj)) {
                        iVar.K(i10, n1.f1911d.h(iH & 1048575, obj));
                    }
                    break;
                case 15:
                    if (q(i7, obj)) {
                        int iG = n1.f1911d.g(iH & 1048575, obj);
                        iVar.S(i10, (iG >> 31) ^ (iG << 1));
                    }
                    break;
                case 16:
                    if (q(i7, obj)) {
                        long jH = n1.f1911d.h(iH & 1048575, obj);
                        iVar.U(i10, (jH >> 63) ^ (jH << 1));
                    }
                    break;
                case 17:
                    if (q(i7, obj)) {
                        e0Var.b(i10, n1.f1911d.i(iH & 1048575, obj), n(i7));
                    }
                    break;
                case 18:
                    w0.A(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 19:
                    w0.E(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 20:
                    w0.H(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 21:
                    w0.P(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 22:
                    w0.G(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 23:
                    w0.D(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 24:
                    w0.C(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 25:
                    w0.y(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 26:
                    w0.N(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var);
                    break;
                case 27:
                    w0.I(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, n(i7));
                    break;
                case 28:
                    w0.z(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var);
                    break;
                case 29:
                    w0.O(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 30:
                    w0.B(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 31:
                    w0.J(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 32:
                    w0.K(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 33:
                    w0.L(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 34:
                    w0.M(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, false);
                    break;
                case 35:
                    w0.A(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case 36:
                    w0.E(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    w0.H(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    w0.P(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                    w0.G(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case 40:
                    w0.D(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case 41:
                    w0.C(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case 42:
                    w0.y(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                    w0.O(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                    w0.B(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                    w0.J(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case 46:
                    w0.K(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                    w0.L(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case 48:
                    w0.M(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, true);
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                    w0.F(iArr[i7], (List) n1.f1911d.i(iH & 1048575, obj), e0Var, n(i7));
                    break;
                case 50:
                    J(e0Var, i10, n1.f1911d.i(iH & 1048575, obj), i7);
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                    if (r(i10, i7, obj)) {
                        double dDoubleValue = ((Double) n1.f1911d.i(iH & 1048575, obj)).doubleValue();
                        iVar.getClass();
                        iVar.K(i10, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                    if (r(i10, i7, obj)) {
                        float fFloatValue = ((Float) n1.f1911d.i(iH & 1048575, obj)).floatValue();
                        iVar.getClass();
                        iVar.I(i10, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                    if (r(i10, i7, obj)) {
                        iVar.U(i10, A(iH & 1048575, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                    if (r(i10, i7, obj)) {
                        iVar.U(i10, A(iH & 1048575, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                    if (r(i10, i7, obj)) {
                        iVar.M(i10, z(iH & 1048575, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    if (r(i10, i7, obj)) {
                        iVar.K(i10, A(iH & 1048575, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    if (r(i10, i7, obj)) {
                        iVar.I(i10, z(iH & 1048575, obj));
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    if (r(i10, i7, obj)) {
                        iVar.F(i10, ((Boolean) n1.f1911d.i(iH & 1048575, obj)).booleanValue());
                    }
                    break;
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    if (r(i10, i7, obj)) {
                        K(i10, n1.f1911d.i(iH & 1048575, obj), e0Var);
                    }
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    if (r(i10, i7, obj)) {
                        iVar.O(i10, (a) n1.f1911d.i(iH & 1048575, obj), n(i7));
                    }
                    break;
                case 61:
                    if (r(i10, i7, obj)) {
                        e0Var.a(i10, (e) n1.f1911d.i(iH & 1048575, obj));
                    }
                    break;
                case 62:
                    if (r(i10, i7, obj)) {
                        iVar.S(i10, z(iH & 1048575, obj));
                    }
                    break;
                case 63:
                    if (r(i10, i7, obj)) {
                        iVar.M(i10, z(iH & 1048575, obj));
                    }
                    break;
                case 64:
                    if (r(i10, i7, obj)) {
                        iVar.I(i10, z(iH & 1048575, obj));
                    }
                    break;
                case 65:
                    if (r(i10, i7, obj)) {
                        iVar.K(i10, A(iH & 1048575, obj));
                    }
                    break;
                case 66:
                    if (r(i10, i7, obj)) {
                        int iZ = z(iH & 1048575, obj);
                        iVar.S(i10, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case 67:
                    if (r(i10, i7, obj)) {
                        long jA = A(iH & 1048575, obj);
                        iVar.U(i10, (jA >> 63) ^ (jA << 1));
                    }
                    break;
                case 68:
                    if (r(i10, i7, obj)) {
                        e0Var.b(i10, n1.f1911d.i(iH & 1048575, obj), n(i7));
                    }
                    break;
            }
        }
        this.f1899m.getClass();
        ((s) obj).unknownFields.d(e0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int e(a aVar) {
        return this.f1895g ? p(aVar) : o(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final void f(s sVar, s sVar2) {
        s sVar3;
        sVar2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f1889a;
            if (i7 >= iArr.length) {
                s sVar4 = sVar;
                if (this.f1895g) {
                    return;
                }
                w0.w(this.f1899m, sVar4, sVar2);
                return;
            }
            int iH = H(i7);
            long j = 1048575 & iH;
            int i10 = iArr[i7];
            switch (G(iH)) {
                case 0:
                    if (!q(i7, sVar2)) {
                        sVar3 = sVar;
                    } else {
                        m1 m1Var = n1.f1911d;
                        sVar3 = sVar;
                        m1Var.m(sVar3, j, m1Var.e(j, sVar2));
                        E(i7, sVar3);
                    }
                    break;
                case 1:
                    if (q(i7, sVar2)) {
                        m1 m1Var2 = n1.f1911d;
                        m1Var2.n(sVar, j, m1Var2.f(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 2:
                    if (q(i7, sVar2)) {
                        n1.n(sVar, j, n1.f1911d.h(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 3:
                    if (q(i7, sVar2)) {
                        n1.n(sVar, j, n1.f1911d.h(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 4:
                    if (q(i7, sVar2)) {
                        n1.m(n1.f1911d.g(j, sVar2), j, sVar);
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 5:
                    if (q(i7, sVar2)) {
                        n1.n(sVar, j, n1.f1911d.h(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 6:
                    if (q(i7, sVar2)) {
                        n1.m(n1.f1911d.g(j, sVar2), j, sVar);
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 7:
                    if (q(i7, sVar2)) {
                        m1 m1Var3 = n1.f1911d;
                        m1Var3.k(sVar, j, m1Var3.c(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 8:
                    if (q(i7, sVar2)) {
                        n1.o(j, sVar, n1.f1911d.i(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 9:
                    u(i7, sVar, sVar2);
                    sVar3 = sVar;
                    break;
                case 10:
                    if (q(i7, sVar2)) {
                        n1.o(j, sVar, n1.f1911d.i(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 11:
                    if (q(i7, sVar2)) {
                        n1.m(n1.f1911d.g(j, sVar2), j, sVar);
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 12:
                    if (q(i7, sVar2)) {
                        n1.m(n1.f1911d.g(j, sVar2), j, sVar);
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 13:
                    if (q(i7, sVar2)) {
                        n1.m(n1.f1911d.g(j, sVar2), j, sVar);
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 14:
                    if (q(i7, sVar2)) {
                        n1.n(sVar, j, n1.f1911d.h(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 15:
                    if (q(i7, sVar2)) {
                        n1.m(n1.f1911d.g(j, sVar2), j, sVar);
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 16:
                    if (q(i7, sVar2)) {
                        n1.n(sVar, j, n1.f1911d.h(j, sVar2));
                        E(i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 17:
                    u(i7, sVar, sVar2);
                    sVar3 = sVar;
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
                    this.f1898l.b(j, sVar, sVar2);
                    sVar3 = sVar;
                    break;
                case 50:
                    Class cls = w0.f1948a;
                    m1 m1Var4 = n1.f1911d;
                    Object objI = m1Var4.i(j, sVar);
                    Object objI2 = m1Var4.i(j, sVar2);
                    this.f1900n.getClass();
                    n1.o(j, sVar, i0.b(objI, objI2));
                    sVar3 = sVar;
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
                    if (r(i10, i7, sVar2)) {
                        n1.o(j, sVar, n1.f1911d.i(j, sVar2));
                        F(i10, i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    v(i7, sVar, sVar2);
                    sVar3 = sVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i10, i7, sVar2)) {
                        n1.o(j, sVar, n1.f1911d.i(j, sVar2));
                        F(i10, i7, sVar);
                    }
                    sVar3 = sVar;
                    break;
                case 68:
                    v(i7, sVar, sVar2);
                    sVar3 = sVar;
                    break;
                default:
                    sVar3 = sVar;
                    break;
            }
            i7 += 3;
            sVar = sVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final int g(s sVar) {
        int i7;
        int iB;
        int i10;
        int[] iArr = this.f1889a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iH = H(i12);
            int i13 = iArr[i12];
            long j = 1048575 & iH;
            int i14 = 1237;
            int iHashCode = 37;
            switch (G(iH)) {
                case 0:
                    i7 = i11 * 53;
                    iB = u.b(Double.doubleToLongBits(n1.f1911d.e(j, sVar)));
                    i11 = iB + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    iB = Float.floatToIntBits(n1.f1911d.f(j, sVar));
                    i11 = iB + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    iB = u.b(n1.f1911d.h(j, sVar));
                    i11 = iB + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    iB = u.b(n1.f1911d.h(j, sVar));
                    i11 = iB + i7;
                    break;
                case 4:
                    i7 = i11 * 53;
                    iB = n1.f1911d.g(j, sVar);
                    i11 = iB + i7;
                    break;
                case 5:
                    i7 = i11 * 53;
                    iB = u.b(n1.f1911d.h(j, sVar));
                    i11 = iB + i7;
                    break;
                case 6:
                    i7 = i11 * 53;
                    iB = n1.f1911d.g(j, sVar);
                    i11 = iB + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean zC = n1.f1911d.c(j, sVar);
                    Charset charset = u.f1936a;
                    if (zC) {
                        i14 = 1231;
                    }
                    i11 = i14 + i10;
                    break;
                case 8:
                    i7 = i11 * 53;
                    iB = ((String) n1.f1911d.i(j, sVar)).hashCode();
                    i11 = iB + i7;
                    break;
                case 9:
                    Object objI = n1.f1911d.i(j, sVar);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i11 * 53;
                    iB = n1.f1911d.i(j, sVar).hashCode();
                    i11 = iB + i7;
                    break;
                case 11:
                    i7 = i11 * 53;
                    iB = n1.f1911d.g(j, sVar);
                    i11 = iB + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    iB = n1.f1911d.g(j, sVar);
                    i11 = iB + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    iB = n1.f1911d.g(j, sVar);
                    i11 = iB + i7;
                    break;
                case 14:
                    i7 = i11 * 53;
                    iB = u.b(n1.f1911d.h(j, sVar));
                    i11 = iB + i7;
                    break;
                case 15:
                    i7 = i11 * 53;
                    iB = n1.f1911d.g(j, sVar);
                    i11 = iB + i7;
                    break;
                case 16:
                    i7 = i11 * 53;
                    iB = u.b(n1.f1911d.h(j, sVar));
                    i11 = iB + i7;
                    break;
                case 17:
                    Object objI2 = n1.f1911d.i(j, sVar);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
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
                    i7 = i11 * 53;
                    iB = n1.f1911d.i(j, sVar).hashCode();
                    i11 = iB + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    iB = n1.f1911d.i(j, sVar).hashCode();
                    i11 = iB + i7;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = u.b(Double.doubleToLongBits(((Double) n1.f1911d.i(j, sVar)).doubleValue()));
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = Float.floatToIntBits(((Float) n1.f1911d.i(j, sVar)).floatValue());
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = u.b(A(j, sVar));
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = u.b(A(j, sVar));
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = z(j, sVar);
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = u.b(A(j, sVar));
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = z(j, sVar);
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    if (r(i13, i12, sVar)) {
                        i10 = i11 * 53;
                        boolean zBooleanValue = ((Boolean) n1.f1911d.i(j, sVar)).booleanValue();
                        Charset charset2 = u.f1936a;
                        if (zBooleanValue) {
                            i14 = 1231;
                        }
                        i11 = i14 + i10;
                    }
                    break;
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = ((String) n1.f1911d.i(j, sVar)).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = n1.f1911d.i(j, sVar).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case 61:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = n1.f1911d.i(j, sVar).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case 62:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = z(j, sVar);
                        i11 = iB + i7;
                    }
                    break;
                case 63:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = z(j, sVar);
                        i11 = iB + i7;
                    }
                    break;
                case 64:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = z(j, sVar);
                        i11 = iB + i7;
                    }
                    break;
                case 65:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = u.b(A(j, sVar));
                        i11 = iB + i7;
                    }
                    break;
                case 66:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = z(j, sVar);
                        i11 = iB + i7;
                    }
                    break;
                case 67:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = u.b(A(j, sVar));
                        i11 = iB + i7;
                    }
                    break;
                case 68:
                    if (r(i13, i12, sVar)) {
                        i7 = i11 * 53;
                        iB = n1.f1911d.i(j, sVar).hashCode();
                        i11 = iB + i7;
                    }
                    break;
            }
        }
        this.f1899m.getClass();
        return sVar.unknownFields.hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean h(s sVar, s sVar2) {
        int[] iArr = this.f1889a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean zX = true;
            if (i7 < length) {
                int iH = H(i7);
                long j = iH & 1048575;
                switch (G(iH)) {
                    case 0:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var = n1.f1911d;
                            if (Double.doubleToLongBits(m1Var.e(j, sVar)) != Double.doubleToLongBits(m1Var.e(j, sVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var2 = n1.f1911d;
                            if (Float.floatToIntBits(m1Var2.f(j, sVar)) != Float.floatToIntBits(m1Var2.f(j, sVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var3 = n1.f1911d;
                            if (m1Var3.h(j, sVar) != m1Var3.h(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var4 = n1.f1911d;
                            if (m1Var4.h(j, sVar) != m1Var4.h(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var5 = n1.f1911d;
                            if (m1Var5.g(j, sVar) != m1Var5.g(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var6 = n1.f1911d;
                            if (m1Var6.h(j, sVar) != m1Var6.h(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var7 = n1.f1911d;
                            if (m1Var7.g(j, sVar) != m1Var7.g(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var8 = n1.f1911d;
                            if (m1Var8.c(j, sVar) != m1Var8.c(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var9 = n1.f1911d;
                            if (!w0.x(m1Var9.i(j, sVar), m1Var9.i(j, sVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var10 = n1.f1911d;
                            if (!w0.x(m1Var10.i(j, sVar), m1Var10.i(j, sVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var11 = n1.f1911d;
                            if (!w0.x(m1Var11.i(j, sVar), m1Var11.i(j, sVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var12 = n1.f1911d;
                            if (m1Var12.g(j, sVar) != m1Var12.g(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var13 = n1.f1911d;
                            if (m1Var13.g(j, sVar) != m1Var13.g(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var14 = n1.f1911d;
                            if (m1Var14.g(j, sVar) != m1Var14.g(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var15 = n1.f1911d;
                            if (m1Var15.h(j, sVar) != m1Var15.h(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var16 = n1.f1911d;
                            if (m1Var16.g(j, sVar) != m1Var16.g(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var17 = n1.f1911d;
                            if (m1Var17.h(j, sVar) != m1Var17.h(j, sVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(sVar, sVar2, i7)) {
                            zX = false;
                        } else {
                            m1 m1Var18 = n1.f1911d;
                            if (!w0.x(m1Var18.i(j, sVar), m1Var18.i(j, sVar2))) {
                                zX = false;
                            }
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
                        m1 m1Var19 = n1.f1911d;
                        zX = w0.x(m1Var19.i(j, sVar), m1Var19.i(j, sVar2));
                        break;
                    case 50:
                        m1 m1Var20 = n1.f1911d;
                        zX = w0.x(m1Var20.i(j, sVar), m1Var20.i(j, sVar2));
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
                        long j5 = iArr[i7 + 2] & 1048575;
                        m1 m1Var21 = n1.f1911d;
                        if (m1Var21.g(j5, sVar) != m1Var21.g(j5, sVar2) || !w0.x(m1Var21.i(j, sVar), m1Var21.i(j, sVar2))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i7 += 3;
                }
            } else {
                this.f1899m.getClass();
                if (sVar.unknownFields.equals(sVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0608 A[Catch: all -> 0x039e, TryCatch #11 {all -> 0x039e, blocks: (B:165:0x0603, B:167:0x0608, B:169:0x060f, B:171:0x0616, B:116:0x0388, B:117:0x0391, B:120:0x03a1, B:121:0x03b2, B:122:0x03c3, B:123:0x03d4, B:124:0x03e5, B:125:0x03f6, B:126:0x0407, B:127:0x0418, B:128:0x0429, B:130:0x0434, B:131:0x0453, B:132:0x0467, B:133:0x047c, B:134:0x0491, B:135:0x04a6, B:136:0x04bb, B:137:0x04d3, B:138:0x04e8, B:139:0x04fd, B:141:0x0508, B:142:0x0527, B:143:0x053b, B:144:0x0548, B:145:0x055f, B:146:0x0574, B:147:0x0589, B:148:0x059e, B:149:0x05b3, B:150:0x05c8, B:151:0x05de, B:157:0x05f4), top: B:202:0x0603 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x060f A[Catch: all -> 0x039e, TryCatch #11 {all -> 0x039e, blocks: (B:165:0x0603, B:167:0x0608, B:169:0x060f, B:171:0x0616, B:116:0x0388, B:117:0x0391, B:120:0x03a1, B:121:0x03b2, B:122:0x03c3, B:123:0x03d4, B:124:0x03e5, B:125:0x03f6, B:126:0x0407, B:127:0x0418, B:128:0x0429, B:130:0x0434, B:131:0x0453, B:132:0x0467, B:133:0x047c, B:134:0x0491, B:135:0x04a6, B:136:0x04bb, B:137:0x04d3, B:138:0x04e8, B:139:0x04fd, B:141:0x0508, B:142:0x0527, B:143:0x053b, B:144:0x0548, B:145:0x055f, B:146:0x0574, B:147:0x0589, B:148:0x059e, B:149:0x05b3, B:150:0x05c8, B:151:0x05de, B:157:0x05f4), top: B:202:0x0603 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x061e A[LOOP:3: B:173:0x061c->B:174:0x061e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0628  */
    /* JADX WARN: Code duplicated, block: B:182:0x0639 A[LOOP:4: B:181:0x0637->B:182:0x0639, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0643  */
    /* JADX WARN: Code duplicated, block: B:213:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final void i(Object obj, g gVar, k kVar) throws Throwable {
        m0 m0Var;
        int i7;
        g gVar2;
        s sVar;
        e1 e1VarB;
        m0 m0Var2 = this;
        Object obj2 = obj;
        g gVar3 = gVar;
        k kVar2 = kVar;
        kVar2.getClass();
        f1 f1Var = m0Var2.f1899m;
        int[] iArr = m0Var2.f1896h;
        int i10 = m0Var2.j;
        int i11 = m0Var2.f1897i;
        e1 e1VarB2 = null;
        while (true) {
            try {
                int iB = gVar3.b();
                if (iB < m0Var2.f1891c || iB > m0Var2.f1892d) {
                    i7 = -1;
                } else {
                    int[] iArr2 = m0Var2.f1889a;
                    int length = (iArr2.length / 3) - 1;
                    int i12 = 0;
                    while (true) {
                        if (i12 > length) {
                            i7 = -1;
                        } else {
                            int i13 = (length + i12) >>> 1;
                            int i14 = i13 * 3;
                            int i15 = iArr2[i14];
                            if (iB == i15) {
                                i7 = i14;
                            } else if (iB < i15) {
                                length = i13 - 1;
                            } else {
                                i12 = i13 + 1;
                            }
                        }
                    }
                }
                e1 e1Var = e1.f1841f;
                if (i7 >= 0) {
                    int iH = m0Var2.H(i7);
                    try {
                        int iG = G(iH);
                        c0 c0Var = m0Var2.f1898l;
                        switch (iG) {
                            case 0:
                                int i16 = i7;
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                try {
                                    try {
                                        n1.f1911d.m(obj, y(iH), gVar2.l());
                                        obj2 = obj;
                                        m0Var.E(i16, obj2);
                                    } catch (v unused) {
                                        obj2 = obj;
                                        try {
                                            f1Var.getClass();
                                            if (e1VarB2 == null) {
                                                sVar = (s) obj2;
                                                e1VarB = sVar.unknownFields;
                                                if (e1VarB == e1Var) {
                                                    e1VarB = e1.b();
                                                    sVar.unknownFields = e1VarB;
                                                }
                                                e1VarB2 = e1VarB;
                                            }
                                            if (!f1.a(e1VarB2, gVar2)) {
                                                while (i11 < i10) {
                                                    m0Var.k(iArr[i11], obj2, e1VarB2);
                                                    i11++;
                                                }
                                                if (e1VarB2 != null) {
                                                    ((s) obj2).unknownFields = e1VarB2;
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            while (i11 < i10) {
                                                m0Var.k(iArr[i11], obj2, e1VarB2);
                                                i11++;
                                            }
                                            if (e1VarB2 != null) {
                                                f1Var.getClass();
                                                ((s) obj2).unknownFields = e1VarB2;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj;
                                        while (i11 < i10) {
                                            m0Var.k(iArr[i11], obj2, e1VarB2);
                                            i11++;
                                        }
                                        if (e1VarB2 != null) {
                                            f1Var.getClass();
                                            ((s) obj2).unknownFields = e1VarB2;
                                        }
                                        throw th;
                                    }
                                } catch (v unused2) {
                                    obj2 = obj;
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj2 = obj;
                                }
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 1:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.f1911d.n(obj2, y(iH), gVar2.v());
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 2:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.n(obj2, y(iH), gVar2.C());
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 3:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.n(obj2, y(iH), gVar2.T());
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 4:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.m(gVar2.A(), y(iH), obj2);
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 5:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.n(obj2, y(iH), gVar2.t());
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 6:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.m(gVar2.r(), y(iH), obj2);
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 7:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.f1911d.k(obj2, y(iH), gVar2.g());
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 8:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                m0Var.C(iH, gVar2, obj2);
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 9:
                                int i17 = i7;
                                gVar2 = gVar3;
                                k kVar3 = kVar2;
                                m0Var = m0Var2;
                                if (m0Var.q(i17, obj2)) {
                                    n1.o(y(iH), obj2, u.c(n1.f1911d.i(y(iH), obj2), gVar2.F(m0Var.n(i17), kVar3)));
                                } else {
                                    n1.o(y(iH), obj2, gVar2.F(m0Var.n(i17), kVar3));
                                    m0Var.E(i17, obj2);
                                }
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 10:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.o(y(iH), obj2, gVar2.i());
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 11:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.m(gVar2.R(), y(iH), obj2);
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 12:
                                int i18 = i7;
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                int iN = gVar2.n();
                                m0Var.l(i18);
                                n1.m(iN, y(iH), obj2);
                                m0Var.E(i18, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 13:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.m(gVar2.G(), y(iH), obj2);
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 14:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.n(obj2, y(iH), gVar2.I());
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 15:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.m(gVar2.K(), y(iH), obj2);
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 16:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                n1.n(obj2, y(iH), gVar2.M());
                                m0Var.E(i7, obj2);
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 17:
                                int i19 = i7;
                                gVar2 = gVar3;
                                k kVar4 = kVar2;
                                m0Var = m0Var2;
                                if (m0Var.q(i19, obj2)) {
                                    n1.o(y(iH), obj2, u.c(n1.f1911d.i(y(iH), obj2), gVar2.y(m0Var.n(i19), kVar4)));
                                } else {
                                    n1.o(y(iH), obj2, gVar2.y(m0Var.n(i19), kVar4));
                                    m0Var.E(i19, obj2);
                                }
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 18:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                gVar2.m(c0Var.c(y(iH), obj2));
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 19:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                gVar2.w(c0Var.c(y(iH), obj2));
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 20:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                gVar2.D(c0Var.c(y(iH), obj2));
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 21:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                gVar2.U(c0Var.c(y(iH), obj2));
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 22:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                gVar2.B(c0Var.c(y(iH), obj2));
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 23:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                gVar2.u(c0Var.c(y(iH), obj2));
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 24:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                gVar2.s(c0Var.c(y(iH), obj2));
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 25:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                gVar2.h(c0Var.c(y(iH), obj2));
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 26:
                                gVar2 = gVar3;
                                m0Var = m0Var2;
                                if ((536870912 & iH) != 0) {
                                    try {
                                        gVar2.P(c0Var.c(iH & 1048575, obj2), true);
                                    } catch (v unused3) {
                                        f1Var.getClass();
                                        if (e1VarB2 == null) {
                                            sVar = (s) obj2;
                                            e1VarB = sVar.unknownFields;
                                            if (e1VarB == e1Var) {
                                                e1VarB = e1.b();
                                                sVar.unknownFields = e1VarB;
                                            }
                                            e1VarB2 = e1VarB;
                                        }
                                        if (!f1.a(e1VarB2, gVar2)) {
                                            while (i11 < i10) {
                                                m0Var.k(iArr[i11], obj2, e1VarB2);
                                                i11++;
                                            }
                                            if (e1VarB2 != null) {
                                                ((s) obj2).unknownFields = e1VarB2;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    gVar2.P(c0Var.c(iH & 1048575, obj2), false);
                                }
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 27:
                                try {
                                    try {
                                        m0Var2.B(obj2, iH, gVar3, m0Var2.n(i7), kVar);
                                        m0Var = m0Var2;
                                        gVar2 = gVar3;
                                    } catch (v unused4) {
                                        m0Var = m0Var2;
                                        gVar2 = gVar3;
                                        f1Var.getClass();
                                        if (e1VarB2 == null) {
                                            sVar = (s) obj2;
                                            e1VarB = sVar.unknownFields;
                                            if (e1VarB == e1Var) {
                                                e1VarB = e1.b();
                                                sVar.unknownFields = e1VarB;
                                            }
                                            e1VarB2 = e1VarB;
                                        }
                                        if (!f1.a(e1VarB2, gVar2)) {
                                            while (i11 < i10) {
                                                m0Var.k(iArr[i11], obj2, e1VarB2);
                                                i11++;
                                            }
                                            if (e1VarB2 != null) {
                                                ((s) obj2).unknownFields = e1VarB2;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (v unused5) {
                                    m0Var = m0Var2;
                                    gVar2 = gVar3;
                                    f1Var.getClass();
                                    if (e1VarB2 == null) {
                                        sVar = (s) obj2;
                                        e1VarB = sVar.unknownFields;
                                        if (e1VarB == e1Var) {
                                            e1VarB = e1.b();
                                            sVar.unknownFields = e1VarB;
                                        }
                                        e1VarB2 = e1VarB;
                                    }
                                    if (!f1.a(e1VarB2, gVar2)) {
                                        while (i11 < i10) {
                                            m0Var.k(iArr[i11], obj2, e1VarB2);
                                            i11++;
                                        }
                                        if (e1VarB2 != null) {
                                            ((s) obj2).unknownFields = e1VarB2;
                                            return;
                                        }
                                        return;
                                    }
                                    kVar2 = kVar;
                                    m0Var2 = m0Var;
                                    gVar3 = gVar2;
                                    break;
                                }
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 28:
                                gVar3.k(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 29:
                                gVar3.S(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 30:
                                gVar3.o(c0Var.c(y(iH), obj2));
                                m0Var2.l(i7);
                                Class cls = w0.f1948a;
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 31:
                                gVar3.H(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 32:
                                gVar3.J(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 33:
                                gVar3.L(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 34:
                                gVar3.N(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 35:
                                gVar3.m(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 36:
                                gVar3.w(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                                gVar3.D(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                                gVar3.U(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                                gVar3.B(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 40:
                                gVar3.u(c0Var.c(y(iH), obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 41:
                                gVar3.s(c0Var.c(iH & 1048575, obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 42:
                                gVar3.h(c0Var.c(iH & 1048575, obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                                gVar3.S(c0Var.c(iH & 1048575, obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                gVar3.o(c0Var.c(iH & 1048575, obj2));
                                m0Var2.l(i7);
                                Class cls2 = w0.f1948a;
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                gVar3.H(c0Var.c(iH & 1048575, obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 46:
                                gVar3.J(c0Var.c(iH & 1048575, obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                gVar3.L(c0Var.c(iH & 1048575, obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 48:
                                gVar3.N(c0Var.c(iH & 1048575, obj2));
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                gVar3.z(c0Var.c(iH & 1048575, obj2), m0Var2.n(i7), kVar2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 50:
                                try {
                                    try {
                                        m0Var2.t(obj2, i7, m0Var2.m(i7), kVar2, gVar);
                                        gVar3 = gVar;
                                        m0Var = m0Var2;
                                        gVar2 = gVar3;
                                    } catch (v unused6) {
                                        m0Var = m0Var2;
                                        gVar2 = gVar;
                                        f1Var.getClass();
                                        if (e1VarB2 == null) {
                                            sVar = (s) obj2;
                                            e1VarB = sVar.unknownFields;
                                            if (e1VarB == e1Var) {
                                                e1VarB = e1.b();
                                                sVar.unknownFields = e1VarB;
                                            }
                                            e1VarB2 = e1VarB;
                                        }
                                        if (!f1.a(e1VarB2, gVar2)) {
                                            while (i11 < i10) {
                                                m0Var.k(iArr[i11], obj2, e1VarB2);
                                                i11++;
                                            }
                                            if (e1VarB2 != null) {
                                                ((s) obj2).unknownFields = e1VarB2;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (v unused7) {
                                    gVar2 = gVar;
                                    m0Var = m0Var2;
                                }
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                n1.o(iH & 1048575, obj2, Double.valueOf(gVar3.l()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                n1.o(iH & 1048575, obj2, Float.valueOf(gVar3.v()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                n1.o(iH & 1048575, obj2, Long.valueOf(gVar3.C()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                n1.o(iH & 1048575, obj2, Long.valueOf(gVar3.T()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                                n1.o(iH & 1048575, obj2, Integer.valueOf(gVar3.A()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                                n1.o(iH & 1048575, obj2, Long.valueOf(gVar3.t()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                                n1.o(iH & 1048575, obj2, Integer.valueOf(gVar3.r()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                                n1.o(iH & 1048575, obj2, Boolean.valueOf(gVar3.g()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                                m0Var2.C(iH, gVar3, obj2);
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                                if (m0Var2.r(iB, i7, obj2)) {
                                    long j = iH & 1048575;
                                    n1.o(j, obj2, u.c(n1.f1911d.i(j, obj2), gVar3.F(m0Var2.n(i7), kVar2)));
                                } else {
                                    n1.o(iH & 1048575, obj2, gVar3.F(m0Var2.n(i7), kVar2));
                                    m0Var2.E(i7, obj2);
                                }
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 61:
                                n1.o(iH & 1048575, obj2, gVar3.i());
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 62:
                                n1.o(iH & 1048575, obj2, Integer.valueOf(gVar3.R()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 63:
                                int iN2 = gVar3.n();
                                m0Var2.l(i7);
                                n1.o(iH & 1048575, obj2, Integer.valueOf(iN2));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 64:
                                n1.o(iH & 1048575, obj2, Integer.valueOf(gVar3.G()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 65:
                                n1.o(iH & 1048575, obj2, Long.valueOf(gVar3.I()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 66:
                                n1.o(iH & 1048575, obj2, Integer.valueOf(gVar3.K()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 67:
                                n1.o(iH & 1048575, obj2, Long.valueOf(gVar3.M()));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            case 68:
                                n1.o(iH & 1048575, obj2, gVar3.y(m0Var2.n(i7), kVar2));
                                m0Var2.F(iB, i7, obj2);
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                            default:
                                if (e1VarB2 == null) {
                                    f1Var.getClass();
                                    e1VarB2 = e1.b();
                                }
                                f1Var.getClass();
                                if (!f1.a(e1VarB2, gVar3)) {
                                    while (i11 < i10) {
                                        m0Var2.k(iArr[i11], obj2, e1VarB2);
                                        i11++;
                                    }
                                }
                                m0Var = m0Var2;
                                gVar2 = gVar3;
                                kVar2 = kVar;
                                m0Var2 = m0Var;
                                gVar3 = gVar2;
                                break;
                        }
                    } catch (v unused8) {
                    }
                } else if (iB == Integer.MAX_VALUE) {
                    while (i11 < i10) {
                        m0Var2.k(iArr[i11], obj2, e1VarB2);
                        i11++;
                    }
                    if (e1VarB2 != null) {
                        f1Var.getClass();
                    }
                } else {
                    f1Var.getClass();
                    if (e1VarB2 == null) {
                        s sVar2 = (s) obj2;
                        e1 e1VarB3 = sVar2.unknownFields;
                        if (e1VarB3 == e1Var) {
                            e1VarB3 = e1.b();
                            sVar2.unknownFields = e1VarB3;
                        }
                        e1VarB2 = e1VarB3;
                    }
                    if (!f1.a(e1VarB2, gVar3)) {
                        while (i11 < i10) {
                            m0Var2.k(iArr[i11], obj2, e1VarB2);
                            i11++;
                        }
                        if (e1VarB2 != null) {
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                m0Var = m0Var2;
            }
        }
        ((s) obj2).unknownFields = e1VarB2;
    }

    public final boolean j(s sVar, Object obj, int i7) {
        return q(i7, sVar) == q(i7, obj);
    }

    public final void k(int i7, Object obj, Object obj2) {
        int i10 = this.f1889a[i7];
        if (n1.f1911d.i(H(i7) & 1048575, obj) == null) {
            return;
        }
        l(i7);
    }

    public final void l(int i7) {
        if (this.f1890b[((i7 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i7) {
        return this.f1890b[(i7 / 3) * 2];
    }

    public final v0 n(int i7) {
        int i10 = (i7 / 3) * 2;
        Object[] objArr = this.f1890b;
        v0 v0Var = (v0) objArr[i10];
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0VarA = s0.f1930c.a((Class) objArr[i10 + 1]);
        objArr[i10] = v0VarA;
        return v0VarA;
    }

    public final int o(Object obj) {
        int i7;
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iC;
        int iY4;
        int iV;
        Unsafe unsafe = f1888p;
        int i10 = -1;
        int i11 = 0;
        int iB = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f1889a;
            if (i11 >= iArr.length) {
                this.f1899m.getClass();
                return ((s) obj).unknownFields.a() + iB;
            }
            int iH = H(i11);
            int i13 = iArr[i11];
            int iG = G(iH);
            if (iG <= 17) {
                int i14 = iArr[i11 + 2];
                int i15 = i14 & 1048575;
                i7 = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    i12 = unsafe.getInt(obj, i15);
                    i10 = i15;
                }
            } else {
                i7 = 0;
            }
            long j = iH & 1048575;
            switch (iG) {
                case 0:
                    if ((i7 & i12) != 0) {
                        iB = a3.e.b(i13, 8, iB);
                    }
                    break;
                case 1:
                    if ((i12 & i7) != 0) {
                        iB = a3.e.b(i13, 4, iB);
                    }
                    break;
                case 2:
                    if ((i12 & i7) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        iY = i.y(i13);
                        iA = i.A(j5);
                        iY4 = iA + iY;
                        iB += iY4;
                    }
                    break;
                case 3:
                    if ((i12 & i7) != 0) {
                        long j7 = unsafe.getLong(obj, j);
                        iY = i.y(i13);
                        iA = i.A(j7);
                        iY4 = iA + iY;
                        iB += iY4;
                    }
                    break;
                case 4:
                    if ((i12 & i7) != 0) {
                        int i16 = unsafe.getInt(obj, j);
                        iY2 = i.y(i13);
                        iW = i.w(i16);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 5:
                    if ((i12 & i7) != 0) {
                        iU = i.u(i13);
                        iB += iU;
                    }
                    break;
                case 6:
                    if ((i12 & i7) != 0) {
                        iU = i.t(i13);
                        iB += iU;
                    }
                    break;
                case 7:
                    if ((i12 & i7) != 0) {
                        iB = a3.e.b(i13, 1, iB);
                    }
                    break;
                case 8:
                    if ((i12 & i7) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof e) {
                            int iY5 = i.y(i13);
                            int size = ((e) object).size();
                            iC = a3.e.c(size, size, iY5, iB);
                        } else {
                            iY3 = i.y(i13);
                            iX = i.x((String) object);
                            iC = iX + iY3 + iB;
                        }
                        iB = iC;
                    }
                    break;
                case 9:
                    if ((i12 & i7) != 0) {
                        Object object2 = unsafe.getObject(obj, j);
                        v0 v0VarN = n(i11);
                        Class cls = w0.f1948a;
                        int iY6 = i.y(i13);
                        int iB2 = ((a) object2).b(v0VarN);
                        iB = a3.e.c(iB2, iB2, iY6, iB);
                    }
                    break;
                case 10:
                    if ((i12 & i7) != 0) {
                        iU = i.r(i13, (e) unsafe.getObject(obj, j));
                        iB += iU;
                    }
                    break;
                case 11:
                    if ((i12 & i7) != 0) {
                        int i17 = unsafe.getInt(obj, j);
                        iY2 = i.y(i13);
                        iW = i.z(i17);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 12:
                    if ((i12 & i7) != 0) {
                        int i18 = unsafe.getInt(obj, j);
                        iY2 = i.y(i13);
                        iW = i.w(i18);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 13:
                    if ((i12 & i7) != 0) {
                        iB = a3.e.b(i13, 4, iB);
                    }
                    break;
                case 14:
                    if ((i7 & i12) != 0) {
                        iB = a3.e.b(i13, 8, iB);
                    }
                    break;
                case 15:
                    if ((i12 & i7) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        iY2 = i.y(i13);
                        iW = i.z((i19 >> 31) ^ (i19 << 1));
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 16:
                    if ((i12 & i7) != 0) {
                        long j10 = unsafe.getLong(obj, j);
                        iY = i.y(i13);
                        iA = i.A((j10 >> 63) ^ (j10 << 1));
                        iY4 = iA + iY;
                        iB += iY4;
                    }
                    break;
                case 17:
                    if ((i12 & i7) != 0) {
                        iU = i.v(i13, (a) unsafe.getObject(obj, j), n(i11));
                        iB += iU;
                    }
                    break;
                case 18:
                    iU = w0.f(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 19:
                    iU = w0.d(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 20:
                    iU = w0.j(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 21:
                    iU = w0.t(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 22:
                    iU = w0.h(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 23:
                    iU = w0.f(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 24:
                    iU = w0.d(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls2 = w0.f1948a;
                    int size2 = list.size();
                    iY4 = size2 == 0 ? 0 : (i.y(i13) + 1) * size2;
                    iB += iY4;
                    break;
                case 26:
                    iU = w0.q(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 27:
                    iU = w0.l(i13, (List) unsafe.getObject(obj, j), n(i11));
                    iB += iU;
                    break;
                case 28:
                    iU = w0.a(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 29:
                    iU = w0.r(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 30:
                    iU = w0.b(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 31:
                    iU = w0.d(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 32:
                    iU = w0.f(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 33:
                    iU = w0.m(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 34:
                    iU = w0.o(i13, (List) unsafe.getObject(obj, j));
                    iB += iU;
                    break;
                case 35:
                    int iG2 = w0.g((List) unsafe.getObject(obj, j));
                    if (iG2 > 0) {
                        iB = a3.e.c(iG2, i.y(i13), iG2, iB);
                    }
                    break;
                case 36:
                    int iE = w0.e((List) unsafe.getObject(obj, j));
                    if (iE > 0) {
                        iB = a3.e.c(iE, i.y(i13), iE, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    int iK = w0.k((List) unsafe.getObject(obj, j));
                    if (iK > 0) {
                        iB = a3.e.c(iK, i.y(i13), iK, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    int iU2 = w0.u((List) unsafe.getObject(obj, j));
                    if (iU2 > 0) {
                        iB = a3.e.c(iU2, i.y(i13), iU2, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                    int i20 = w0.i((List) unsafe.getObject(obj, j));
                    if (i20 > 0) {
                        iB = a3.e.c(i20, i.y(i13), i20, iB);
                    }
                    break;
                case 40:
                    int iG3 = w0.g((List) unsafe.getObject(obj, j));
                    if (iG3 > 0) {
                        iB = a3.e.c(iG3, i.y(i13), iG3, iB);
                    }
                    break;
                case 41:
                    int iE2 = w0.e((List) unsafe.getObject(obj, j));
                    if (iE2 > 0) {
                        iB = a3.e.c(iE2, i.y(i13), iE2, iB);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(obj, j);
                    Class cls3 = w0.f1948a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iB = a3.e.c(size3, i.y(i13), size3, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                    int iS = w0.s((List) unsafe.getObject(obj, j));
                    if (iS > 0) {
                        iB = a3.e.c(iS, i.y(i13), iS, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                    int iC2 = w0.c((List) unsafe.getObject(obj, j));
                    if (iC2 > 0) {
                        iB = a3.e.c(iC2, i.y(i13), iC2, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                    int iE3 = w0.e((List) unsafe.getObject(obj, j));
                    if (iE3 > 0) {
                        iB = a3.e.c(iE3, i.y(i13), iE3, iB);
                    }
                    break;
                case 46:
                    int iG4 = w0.g((List) unsafe.getObject(obj, j));
                    if (iG4 > 0) {
                        iB = a3.e.c(iG4, i.y(i13), iG4, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                    int iN = w0.n((List) unsafe.getObject(obj, j));
                    if (iN > 0) {
                        iB = a3.e.c(iN, i.y(i13), iN, iB);
                    }
                    break;
                case 48:
                    int iP = w0.p((List) unsafe.getObject(obj, j));
                    if (iP > 0) {
                        iB = a3.e.c(iP, i.y(i13), iP, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                    List list3 = (List) unsafe.getObject(obj, j);
                    v0 v0VarN2 = n(i11);
                    Class cls4 = w0.f1948a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i21 = 0; i21 < size4; i21++) {
                            iV += i.v(i13, (a) list3.get(i21), v0VarN2);
                        }
                    }
                    iB += iV;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    Object objM = m(i11);
                    this.f1900n.getClass();
                    iU = i0.a(i13, object3, objM);
                    iB += iU;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                    if (r(i13, i11, obj)) {
                        iB = a3.e.b(i13, 8, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                    if (r(i13, i11, obj)) {
                        iB = a3.e.b(i13, 4, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                    if (r(i13, i11, obj)) {
                        long jA = A(j, obj);
                        iY = i.y(i13);
                        iA = i.A(jA);
                        iY4 = iA + iY;
                        iB += iY4;
                    }
                    break;
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                    if (r(i13, i11, obj)) {
                        long jA2 = A(j, obj);
                        iY = i.y(i13);
                        iA = i.A(jA2);
                        iY4 = iA + iY;
                        iB += iY4;
                    }
                    break;
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                    if (r(i13, i11, obj)) {
                        int iZ = z(j, obj);
                        iY2 = i.y(i13);
                        iW = i.w(iZ);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    if (r(i13, i11, obj)) {
                        iU = i.u(i13);
                        iB += iU;
                    }
                    break;
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    if (r(i13, i11, obj)) {
                        iU = i.t(i13);
                        iB += iU;
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    if (r(i13, i11, obj)) {
                        iB = a3.e.b(i13, 1, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    if (r(i13, i11, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof e) {
                            int iY7 = i.y(i13);
                            int size5 = ((e) object4).size();
                            iC = a3.e.c(size5, size5, iY7, iB);
                        } else {
                            iY3 = i.y(i13);
                            iX = i.x((String) object4);
                            iC = iX + iY3 + iB;
                        }
                        iB = iC;
                    }
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    if (r(i13, i11, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        v0 v0VarN3 = n(i11);
                        Class cls5 = w0.f1948a;
                        int iY8 = i.y(i13);
                        int iB3 = ((a) object5).b(v0VarN3);
                        iB = a3.e.c(iB3, iB3, iY8, iB);
                    }
                    break;
                case 61:
                    if (r(i13, i11, obj)) {
                        iU = i.r(i13, (e) unsafe.getObject(obj, j));
                        iB += iU;
                    }
                    break;
                case 62:
                    if (r(i13, i11, obj)) {
                        int iZ2 = z(j, obj);
                        iY2 = i.y(i13);
                        iW = i.z(iZ2);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 63:
                    if (r(i13, i11, obj)) {
                        int iZ3 = z(j, obj);
                        iY2 = i.y(i13);
                        iW = i.w(iZ3);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 64:
                    if (r(i13, i11, obj)) {
                        iB = a3.e.b(i13, 4, iB);
                    }
                    break;
                case 65:
                    if (r(i13, i11, obj)) {
                        iB = a3.e.b(i13, 8, iB);
                    }
                    break;
                case 66:
                    if (r(i13, i11, obj)) {
                        int iZ4 = z(j, obj);
                        iY2 = i.y(i13);
                        iW = i.z((iZ4 >> 31) ^ (iZ4 << 1));
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 67:
                    if (r(i13, i11, obj)) {
                        long jA3 = A(j, obj);
                        iY = i.y(i13);
                        iA = i.A((jA3 >> 63) ^ (jA3 << 1));
                        iY4 = iA + iY;
                        iB += iY4;
                    }
                    break;
                case 68:
                    if (r(i13, i11, obj)) {
                        iU = i.v(i13, (a) unsafe.getObject(obj, j), n(i11));
                        iB += iU;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    public final int p(Object obj) {
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iY4;
        int iA2;
        int iV;
        Unsafe unsafe = f1888p;
        int i7 = 0;
        int iB = 0;
        while (true) {
            int[] iArr = this.f1889a;
            if (i7 >= iArr.length) {
                this.f1899m.getClass();
                return ((s) obj).unknownFields.a() + iB;
            }
            int iH = H(i7);
            int iG = G(iH);
            int i10 = iArr[i7];
            long j = iH & 1048575;
            if (iG >= o.f1916e.f1920d && iG <= o.f1917i.f1920d) {
                int i11 = iArr[i7 + 2];
            }
            switch (iG) {
                case 0:
                    if (q(i7, obj)) {
                        iB = a3.e.b(i10, 8, iB);
                    }
                    break;
                case 1:
                    if (q(i7, obj)) {
                        iB = a3.e.b(i10, 4, iB);
                    }
                    break;
                case 2:
                    if (q(i7, obj)) {
                        long jH = n1.f1911d.h(j, obj);
                        iY = i.y(i10);
                        iA = i.A(jH);
                        iU = iA + iY;
                        iB += iU;
                    }
                    break;
                case 3:
                    if (q(i7, obj)) {
                        long jH2 = n1.f1911d.h(j, obj);
                        iY = i.y(i10);
                        iA = i.A(jH2);
                        iU = iA + iY;
                        iB += iU;
                    }
                    break;
                case 4:
                    if (q(i7, obj)) {
                        int iG2 = n1.f1911d.g(j, obj);
                        iY2 = i.y(i10);
                        iW = i.w(iG2);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 5:
                    if (q(i7, obj)) {
                        iU = i.u(i10);
                        iB += iU;
                    }
                    break;
                case 6:
                    if (q(i7, obj)) {
                        iU = i.t(i10);
                        iB += iU;
                    }
                    break;
                case 7:
                    if (q(i7, obj)) {
                        iB = a3.e.b(i10, 1, iB);
                    }
                    break;
                case 8:
                    if (q(i7, obj)) {
                        Object objI = n1.f1911d.i(j, obj);
                        if (objI instanceof e) {
                            int iY5 = i.y(i10);
                            int size = ((e) objI).size();
                            iB = a3.e.c(size, size, iY5, iB);
                        } else {
                            iY3 = i.y(i10);
                            iX = i.x((String) objI);
                            iB = iX + iY3 + iB;
                        }
                    }
                    break;
                case 9:
                    if (q(i7, obj)) {
                        Object objI2 = n1.f1911d.i(j, obj);
                        v0 v0VarN = n(i7);
                        Class cls = w0.f1948a;
                        int iY6 = i.y(i10);
                        int iB2 = ((a) objI2).b(v0VarN);
                        iB = a3.e.c(iB2, iB2, iY6, iB);
                    }
                    break;
                case 10:
                    if (q(i7, obj)) {
                        iU = i.r(i10, (e) n1.f1911d.i(j, obj));
                        iB += iU;
                    }
                    break;
                case 11:
                    if (q(i7, obj)) {
                        int iG3 = n1.f1911d.g(j, obj);
                        iY2 = i.y(i10);
                        iW = i.z(iG3);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 12:
                    if (q(i7, obj)) {
                        int iG4 = n1.f1911d.g(j, obj);
                        iY2 = i.y(i10);
                        iW = i.w(iG4);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 13:
                    if (q(i7, obj)) {
                        iB = a3.e.b(i10, 4, iB);
                    }
                    break;
                case 14:
                    if (q(i7, obj)) {
                        iB = a3.e.b(i10, 8, iB);
                    }
                    break;
                case 15:
                    if (q(i7, obj)) {
                        int iG5 = n1.f1911d.g(j, obj);
                        iY2 = i.y(i10);
                        iW = i.z((iG5 >> 31) ^ (iG5 << 1));
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 16:
                    if (q(i7, obj)) {
                        long jH3 = n1.f1911d.h(j, obj);
                        iY4 = i.y(i10);
                        iA2 = i.A((jH3 >> 63) ^ (jH3 << 1));
                        iU = iA2 + iY4;
                        iB += iU;
                    }
                    break;
                case 17:
                    if (q(i7, obj)) {
                        iU = i.v(i10, (a) n1.f1911d.i(j, obj), n(i7));
                        iB += iU;
                    }
                    break;
                case 18:
                    iU = w0.f(i10, s(j, obj));
                    iB += iU;
                    break;
                case 19:
                    iU = w0.d(i10, s(j, obj));
                    iB += iU;
                    break;
                case 20:
                    iU = w0.j(i10, s(j, obj));
                    iB += iU;
                    break;
                case 21:
                    iU = w0.t(i10, s(j, obj));
                    iB += iU;
                    break;
                case 22:
                    iU = w0.h(i10, s(j, obj));
                    iB += iU;
                    break;
                case 23:
                    iU = w0.f(i10, s(j, obj));
                    iB += iU;
                    break;
                case 24:
                    iU = w0.d(i10, s(j, obj));
                    iB += iU;
                    break;
                case 25:
                    List listS = s(j, obj);
                    Class cls2 = w0.f1948a;
                    int size2 = listS.size();
                    iB += size2 == 0 ? 0 : (i.y(i10) + 1) * size2;
                    break;
                case 26:
                    iU = w0.q(i10, s(j, obj));
                    iB += iU;
                    break;
                case 27:
                    iU = w0.l(i10, s(j, obj), n(i7));
                    iB += iU;
                    break;
                case 28:
                    iU = w0.a(i10, s(j, obj));
                    iB += iU;
                    break;
                case 29:
                    iU = w0.r(i10, s(j, obj));
                    iB += iU;
                    break;
                case 30:
                    iU = w0.b(i10, s(j, obj));
                    iB += iU;
                    break;
                case 31:
                    iU = w0.d(i10, s(j, obj));
                    iB += iU;
                    break;
                case 32:
                    iU = w0.f(i10, s(j, obj));
                    iB += iU;
                    break;
                case 33:
                    iU = w0.m(i10, s(j, obj));
                    iB += iU;
                    break;
                case 34:
                    iU = w0.o(i10, s(j, obj));
                    iB += iU;
                    break;
                case 35:
                    int iG6 = w0.g((List) unsafe.getObject(obj, j));
                    if (iG6 > 0) {
                        iB = a3.e.c(iG6, i.y(i10), iG6, iB);
                    }
                    break;
                case 36:
                    int iE = w0.e((List) unsafe.getObject(obj, j));
                    if (iE > 0) {
                        iB = a3.e.c(iE, i.y(i10), iE, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    int iK = w0.k((List) unsafe.getObject(obj, j));
                    if (iK > 0) {
                        iB = a3.e.c(iK, i.y(i10), iK, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    int iU2 = w0.u((List) unsafe.getObject(obj, j));
                    if (iU2 > 0) {
                        iB = a3.e.c(iU2, i.y(i10), iU2, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                    int i12 = w0.i((List) unsafe.getObject(obj, j));
                    if (i12 > 0) {
                        iB = a3.e.c(i12, i.y(i10), i12, iB);
                    }
                    break;
                case 40:
                    int iG7 = w0.g((List) unsafe.getObject(obj, j));
                    if (iG7 > 0) {
                        iB = a3.e.c(iG7, i.y(i10), iG7, iB);
                    }
                    break;
                case 41:
                    int iE2 = w0.e((List) unsafe.getObject(obj, j));
                    if (iE2 > 0) {
                        iB = a3.e.c(iE2, i.y(i10), iE2, iB);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls3 = w0.f1948a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iB = a3.e.c(size3, i.y(i10), size3, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                    int iS = w0.s((List) unsafe.getObject(obj, j));
                    if (iS > 0) {
                        iB = a3.e.c(iS, i.y(i10), iS, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                    int iC = w0.c((List) unsafe.getObject(obj, j));
                    if (iC > 0) {
                        iB = a3.e.c(iC, i.y(i10), iC, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                    int iE3 = w0.e((List) unsafe.getObject(obj, j));
                    if (iE3 > 0) {
                        iB = a3.e.c(iE3, i.y(i10), iE3, iB);
                    }
                    break;
                case 46:
                    int iG8 = w0.g((List) unsafe.getObject(obj, j));
                    if (iG8 > 0) {
                        iB = a3.e.c(iG8, i.y(i10), iG8, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                    int iN = w0.n((List) unsafe.getObject(obj, j));
                    if (iN > 0) {
                        iB = a3.e.c(iN, i.y(i10), iN, iB);
                    }
                    break;
                case 48:
                    int iP = w0.p((List) unsafe.getObject(obj, j));
                    if (iP > 0) {
                        iB = a3.e.c(iP, i.y(i10), iP, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                    List listS2 = s(j, obj);
                    v0 v0VarN2 = n(i7);
                    Class cls4 = w0.f1948a;
                    int size4 = listS2.size();
                    if (size4 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i13 = 0; i13 < size4; i13++) {
                            iV += i.v(i10, (a) listS2.get(i13), v0VarN2);
                        }
                    }
                    iB += iV;
                    break;
                case 50:
                    Object objI3 = n1.f1911d.i(j, obj);
                    Object objM = m(i7);
                    this.f1900n.getClass();
                    iU = i0.a(i10, objI3, objM);
                    iB += iU;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                    if (r(i10, i7, obj)) {
                        iB = a3.e.b(i10, 8, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                    if (r(i10, i7, obj)) {
                        iB = a3.e.b(i10, 4, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                    if (r(i10, i7, obj)) {
                        long jA = A(j, obj);
                        iY = i.y(i10);
                        iA = i.A(jA);
                        iU = iA + iY;
                        iB += iU;
                    }
                    break;
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                    if (r(i10, i7, obj)) {
                        long jA2 = A(j, obj);
                        iY = i.y(i10);
                        iA = i.A(jA2);
                        iU = iA + iY;
                        iB += iU;
                    }
                    break;
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                    if (r(i10, i7, obj)) {
                        int iZ = z(j, obj);
                        iY2 = i.y(i10);
                        iW = i.w(iZ);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    if (r(i10, i7, obj)) {
                        iU = i.u(i10);
                        iB += iU;
                    }
                    break;
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    if (r(i10, i7, obj)) {
                        iU = i.t(i10);
                        iB += iU;
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    if (r(i10, i7, obj)) {
                        iB = a3.e.b(i10, 1, iB);
                    }
                    break;
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    if (r(i10, i7, obj)) {
                        Object objI4 = n1.f1911d.i(j, obj);
                        if (objI4 instanceof e) {
                            int iY7 = i.y(i10);
                            int size5 = ((e) objI4).size();
                            iB = a3.e.c(size5, size5, iY7, iB);
                        } else {
                            iY3 = i.y(i10);
                            iX = i.x((String) objI4);
                            iB = iX + iY3 + iB;
                        }
                    }
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    if (r(i10, i7, obj)) {
                        Object objI5 = n1.f1911d.i(j, obj);
                        v0 v0VarN3 = n(i7);
                        Class cls5 = w0.f1948a;
                        int iY8 = i.y(i10);
                        int iB3 = ((a) objI5).b(v0VarN3);
                        iB = a3.e.c(iB3, iB3, iY8, iB);
                    }
                    break;
                case 61:
                    if (r(i10, i7, obj)) {
                        iU = i.r(i10, (e) n1.f1911d.i(j, obj));
                        iB += iU;
                    }
                    break;
                case 62:
                    if (r(i10, i7, obj)) {
                        int iZ2 = z(j, obj);
                        iY2 = i.y(i10);
                        iW = i.z(iZ2);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 63:
                    if (r(i10, i7, obj)) {
                        int iZ3 = z(j, obj);
                        iY2 = i.y(i10);
                        iW = i.w(iZ3);
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 64:
                    if (r(i10, i7, obj)) {
                        iB = a3.e.b(i10, 4, iB);
                    }
                    break;
                case 65:
                    if (r(i10, i7, obj)) {
                        iB = a3.e.b(i10, 8, iB);
                    }
                    break;
                case 66:
                    if (r(i10, i7, obj)) {
                        int iZ4 = z(j, obj);
                        iY2 = i.y(i10);
                        iW = i.z((iZ4 >> 31) ^ (iZ4 << 1));
                        iU = iW + iY2;
                        iB += iU;
                    }
                    break;
                case 67:
                    if (r(i10, i7, obj)) {
                        long jA3 = A(j, obj);
                        iY4 = i.y(i10);
                        iA2 = i.A((jA3 >> 63) ^ (jA3 << 1));
                        iU = iA2 + iY4;
                        iB += iU;
                    }
                    break;
                case 68:
                    if (r(i10, i7, obj)) {
                        iU = i.v(i10, (a) n1.f1911d.i(j, obj), n(i7));
                        iB += iU;
                    }
                    break;
            }
            i7 += 3;
        }
    }

    public final boolean q(int i7, Object obj) {
        if (this.f1895g) {
            int iH = H(i7);
            long j = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (n1.f1911d.e(j, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (n1.f1911d.f(j, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (n1.f1911d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (n1.f1911d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (n1.f1911d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (n1.f1911d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (n1.f1911d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return n1.f1911d.c(j, obj);
                case 8:
                    Object objI = n1.f1911d.i(j, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof e) {
                        return !e.f1835i.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (n1.f1911d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !e.f1835i.equals(n1.f1911d.i(j, obj));
                case 11:
                    if (n1.f1911d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (n1.f1911d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (n1.f1911d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (n1.f1911d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (n1.f1911d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (n1.f1911d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (n1.f1911d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i10 = this.f1889a[i7 + 2];
            if ((n1.f1911d.g(i10 & 1048575, obj) & (1 << (i10 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(int i7, int i10, Object obj) {
        return n1.f1911d.g((long) (this.f1889a[i10 + 2] & 1048575), obj) == i7;
    }

    public final void t(Object obj, int i7, Object obj2, k kVar, g gVar) throws v {
        long jH = H(i7) & 1048575;
        Object objI = n1.f1911d.i(jH, obj);
        i0 i0Var = this.f1900n;
        if (objI == null) {
            i0Var.getClass();
            objI = h0.f1866e.b();
            n1.o(jH, obj, objI);
        } else {
            i0Var.getClass();
            if (!((h0) objI).f1867d) {
                h0 h0VarB = h0.f1866e.b();
                i0.b(h0VarB, objI);
                n1.o(jH, obj, h0VarB);
                objI = h0VarB;
            }
        }
        i0Var.getClass();
        h0 h0Var = (h0) objI;
        f0 f0Var = ((g0) obj2).f1864a;
        gVar.Y(2);
        f fVar = (f) gVar.f1863e;
        int iE = fVar.e(fVar.A());
        Object obj3 = f0Var.f1858c;
        Object objQ = "";
        Object objQ2 = obj3;
        while (true) {
            try {
                int iB = gVar.b();
                if (iB == Integer.MAX_VALUE || fVar.c()) {
                    break;
                }
                if (iB == 1) {
                    objQ = gVar.q(f0Var.f1856a, null, null);
                } else if (iB != 2) {
                    try {
                        if (!gVar.Z()) {
                            throw new w("Unable to parse map entry.");
                        }
                    } catch (v unused) {
                        if (!gVar.Z()) {
                            throw new w("Unable to parse map entry.");
                        }
                    }
                } else {
                    objQ2 = gVar.q(f0Var.f1857b, obj3.getClass(), kVar);
                }
            } catch (Throwable th2) {
                fVar.d(iE);
                throw th2;
            }
        }
        h0Var.put(objQ, objQ2);
        fVar.d(iE);
    }

    public final void u(int i7, Object obj, Object obj2) {
        long jH = H(i7) & 1048575;
        if (q(i7, obj2)) {
            m1 m1Var = n1.f1911d;
            Object objI = m1Var.i(jH, obj);
            Object objI2 = m1Var.i(jH, obj2);
            if (objI != null && objI2 != null) {
                n1.o(jH, obj, u.c(objI, objI2));
                E(i7, obj);
            } else if (objI2 != null) {
                n1.o(jH, obj, objI2);
                E(i7, obj);
            }
        }
    }

    public final void v(int i7, Object obj, Object obj2) {
        int iH = H(i7);
        int i10 = this.f1889a[i7];
        long j = iH & 1048575;
        if (r(i10, i7, obj2)) {
            m1 m1Var = n1.f1911d;
            Object objI = m1Var.i(j, obj);
            Object objI2 = m1Var.i(j, obj2);
            if (objI != null && objI2 != null) {
                n1.o(j, obj, u.c(objI, objI2));
                F(i10, i7, obj);
            } else if (objI2 != null) {
                n1.o(j, obj, objI2);
                F(i10, i7, obj);
            }
        }
    }
}
