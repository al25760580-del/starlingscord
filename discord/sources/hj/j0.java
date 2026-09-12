package hj;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements q0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f10851n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f10852o = c1.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f10854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f10857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10861i;
    public final l0 j;
    public final a0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u0 f10862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f10863m;

    public j0(int[] iArr, Object[] objArr, int i7, int i10, b bVar, int[] iArr2, int i11, int i12, l0 l0Var, a0 a0Var, u0 u0Var, m mVar, f0 f0Var) {
        this.f10853a = iArr;
        this.f10854b = objArr;
        this.f10855c = i7;
        this.f10856d = i10;
        this.f10858f = bVar instanceof r;
        this.f10859g = iArr2;
        this.f10860h = i11;
        this.f10861i = i12;
        this.j = l0Var;
        this.k = a0Var;
        this.f10862l = u0Var;
        this.f10857e = bVar;
        this.f10863m = f0Var;
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

    public static int I(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof r) {
            return ((r) obj).e();
        }
        return true;
    }

    public static j0 u(p0 p0Var, l0 l0Var, a0 a0Var, u0 u0Var, m mVar, f0 f0Var) {
        if (p0Var instanceof p0) {
            return v(p0Var, l0Var, a0Var, u0Var, mVar, f0Var);
        }
        p0Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    public static j0 v(p0 p0Var, l0 l0Var, a0 a0Var, u0 u0Var, m mVar, f0 f0Var) {
        int i7;
        int iCharAt;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        int i31;
        Field fieldD;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldD2;
        int i35;
        Object obj2;
        Field fieldD3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String str = p0Var.f10897b;
        int length = str.length();
        int i40 = 55296;
        if (str.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i7 = i41 + 1;
                if (str.charAt(i41) < 55296) {
                    break;
                }
                i41 = i7;
            }
        } else {
            i7 = 1;
        }
        int i42 = i7 + 1;
        int iCharAt2 = str.charAt(i7);
        if (iCharAt2 >= 55296) {
            int i43 = iCharAt2 & 8191;
            int i44 = 13;
            while (true) {
                i39 = i42 + 1;
                cCharAt13 = str.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i39;
            }
            iCharAt2 = i43 | (cCharAt13 << i44);
            i42 = i39;
        }
        if (iCharAt2 == 0) {
            i11 = 0;
            i14 = 0;
            iCharAt = 0;
            i10 = 0;
            i13 = 0;
            i15 = 0;
            iArr = f10851n;
            i12 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt3 = str.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt8 = str.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt3 = i46 | (cCharAt8 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt4 = str.charAt(i45);
            if (iCharAt4 >= 55296) {
                int i49 = iCharAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt7 = str.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt4 = i49 | (cCharAt7 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int iCharAt5 = str.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt6 = str.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt5 = i52 | (cCharAt6 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            int iCharAt6 = str.charAt(i51);
            if (iCharAt6 >= 55296) {
                int i55 = iCharAt6 & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt5 = str.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt6 = i55 | (cCharAt5 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            iCharAt = str.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt4 = str.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt = i58 | (cCharAt4 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            int iCharAt7 = str.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i61 = iCharAt7 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt3 = str.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt7 = i61 | (cCharAt3 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int iCharAt8 = str.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt2 = str.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i17;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i17;
            }
            int i66 = i63 + 1;
            int iCharAt9 = str.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i16 = i66 + 1;
                    cCharAt = str.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i16;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i16;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i69 = (iCharAt3 * 2) + iCharAt4;
            int i70 = iCharAt7;
            i10 = iCharAt5;
            i11 = i70;
            i12 = iCharAt3;
            i42 = i66;
            iArr = iArr2;
            i13 = iCharAt6;
            i14 = i69;
            i15 = iCharAt9;
        }
        Unsafe unsafe = f10852o;
        Object[] objArr = p0Var.f10898c;
        Class<?> cls = p0Var.f10896a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i71 = i15 + i11;
        int i72 = i71;
        int i73 = i15;
        int i74 = 0;
        int i75 = 0;
        while (i42 < length) {
            int i76 = i42 + 1;
            int iCharAt10 = str.charAt(i42);
            if (iCharAt10 >= i40) {
                int i77 = iCharAt10 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i38 = i78 + 1;
                    cCharAt12 = str.charAt(i78);
                    i24 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt12 & 8191) << i79;
                    i79 += 13;
                    i78 = i38;
                    length = i24;
                }
                iCharAt10 = i77 | (cCharAt12 << i79);
                i25 = i38;
            } else {
                i24 = length;
                i25 = i76;
            }
            int i80 = i25 + 1;
            int iCharAt11 = str.charAt(i25);
            Object[] objArr3 = objArr;
            char c8 = 55296;
            if (iCharAt11 >= 55296) {
                int i81 = iCharAt11 & 8191;
                int i82 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = str.charAt(i80);
                    if (cCharAt11 < c8) {
                        break;
                    }
                    i81 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i80 = i37;
                    c8 = 55296;
                }
                iCharAt11 = i81 | (cCharAt11 << i82);
                i80 = i37;
            }
            int i83 = iCharAt11 & 255;
            int i84 = iCharAt10;
            if ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                iArr[i74] = i75;
                i74++;
            }
            int[] iArr4 = iArr3;
            if (i83 >= 51) {
                int i85 = i80 + 1;
                int iCharAt12 = str.charAt(i80);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = 13;
                    while (true) {
                        i36 = i85 + 1;
                        cCharAt10 = str.charAt(i85);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i85 = i36;
                        c10 = 55296;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i87);
                    i85 = i36;
                }
                int i88 = i83 - 51;
                int i89 = i85;
                if (i88 == 9 || i88 == 17) {
                    i33 = i14 + 1;
                    objArr2[((i75 / 3) * 2) + 1] = objArr3[i14];
                } else {
                    if (i88 == 12 && (f0.e.a(p0Var.a(), 1) || (iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0)) {
                        i33 = i14 + 1;
                        objArr2[((i75 / 3) * 2) + 1] = objArr3[i14];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objArr3[i34];
                    if (obj instanceof Field) {
                        fieldD2 = (Field) obj;
                    } else {
                        fieldD2 = D(cls, (String) obj);
                        objArr3[i34] = fieldD2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                    i35 = i34 + 1;
                    obj2 = objArr3[i35];
                    if (obj2 instanceof Field) {
                        fieldD3 = (Field) obj2;
                    } else {
                        fieldD3 = D(cls, (String) obj2);
                        objArr3[i35] = fieldD3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldD3);
                    int i90 = i12;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i31 = iObjectFieldOffset3;
                    i26 = i90;
                    i30 = i14;
                    i28 = i89;
                    i29 = 0;
                    cls = cls;
                }
                i14 = i33;
                i34 = iCharAt12 * 2;
                obj = objArr3[i34];
                if (obj instanceof Field) {
                    fieldD2 = (Field) obj;
                } else {
                    fieldD2 = D(cls, (String) obj);
                    objArr3[i34] = fieldD2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldD2);
                i35 = i34 + 1;
                obj2 = objArr3[i35];
                if (obj2 instanceof Field) {
                    fieldD3 = (Field) obj2;
                } else {
                    fieldD3 = D(cls, (String) obj2);
                    objArr3[i35] = fieldD3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldD3);
                int i91 = i12;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i31 = iObjectFieldOffset5;
                i26 = i91;
                i30 = i14;
                i28 = i89;
                i29 = 0;
                cls = cls;
            } else {
                int i92 = i14 + 1;
                Field fieldD4 = D(cls, (String) objArr3[i14]);
                if (i83 == 9 || i83 == 17) {
                    i26 = i12;
                    objArr2[((i75 / 3) * 2) + 1] = fieldD4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i26 = i12;
                        i32 = i14 + 2;
                        objArr2[((i75 / 3) * 2) + 1] = objArr3[i92];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i26 = i12;
                        if (p0Var.a() == 1 || (iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                            i32 = i14 + 2;
                            objArr2[((i75 / 3) * 2) + 1] = objArr3[i92];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                        if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 || i83 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i80;
                            i29 = 0;
                        } else {
                            int i93 = i80 + 1;
                            int iCharAt13 = str.charAt(i80);
                            if (iCharAt13 >= 55296) {
                                int i94 = iCharAt13 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i28 = i93 + 1;
                                    cCharAt9 = str.charAt(i93);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i94 |= (cCharAt9 & 8191) << i95;
                                    i95 += 13;
                                    i93 = i28;
                                }
                                iCharAt13 = i94 | (cCharAt9 << i95);
                            } else {
                                i28 = i93;
                            }
                            int i96 = (iCharAt13 / 32) + (i26 * 2);
                            Object obj3 = objArr3[i96];
                            if (obj3 instanceof Field) {
                                fieldD = (Field) obj3;
                            } else {
                                fieldD = D(cls, (String) obj3);
                                objArr3[i96] = fieldD;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD);
                            i29 = iCharAt13 % 32;
                        }
                        if (i83 >= 18 || i83 > 49) {
                            i30 = i27;
                            i31 = iObjectFieldOffset;
                        } else {
                            iArr[i72] = iObjectFieldOffset;
                            i30 = i27;
                            i31 = iObjectFieldOffset;
                            i72++;
                        }
                    } else {
                        if (i83 == 50) {
                            int i97 = i73 + 1;
                            iArr[i73] = i75;
                            int i98 = (i75 / 3) * 2;
                            int i99 = i14 + 2;
                            objArr2[i98] = objArr3[i92];
                            if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                                i27 = i14 + 3;
                                objArr2[i98 + 1] = objArr3[i99];
                                i26 = i12;
                                i73 = i97;
                            } else {
                                i27 = i99;
                                i73 = i97;
                                i26 = i12;
                            }
                        } else {
                            i26 = i12;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                        if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i80;
                            i29 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i80;
                            i29 = 0;
                        }
                        if (i83 >= 18) {
                            i30 = i27;
                            i31 = iObjectFieldOffset;
                        } else {
                            i30 = i27;
                            i31 = iObjectFieldOffset;
                        }
                    }
                    i27 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                    if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i80;
                        i29 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i80;
                        i29 = 0;
                    }
                    if (i83 >= 18) {
                        i30 = i27;
                        i31 = iObjectFieldOffset;
                    } else {
                        i30 = i27;
                        i31 = iObjectFieldOffset;
                    }
                }
                i27 = i92;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i80;
                    i29 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i80;
                    i29 = 0;
                }
                if (i83 >= 18) {
                    i30 = i27;
                    i31 = iObjectFieldOffset;
                } else {
                    i30 = i27;
                    i31 = iObjectFieldOffset;
                }
            }
            int i100 = i75 + 1;
            iArr4[i75] = i84;
            int i101 = i75 + 2;
            String str2 = str;
            iArr4[i100] = ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 536870912 : 0) | ((iCharAt11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 268435456 : 0) | ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i31;
            i75 += 3;
            iArr4[i101] = (i29 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i24;
            i12 = i26;
            i42 = i28;
            i40 = 55296;
            i14 = i30;
            iArr3 = iArr4;
        }
        return new j0(iArr3, objArr2, i10, i13, p0Var.f10896a, iArr, i15, i71, l0Var, a0Var, u0Var, mVar, f0Var);
    }

    public static long w(int i7) {
        return i7 & 1048575;
    }

    public static int x(long j, Object obj) {
        return ((Integer) c1.f10811c.i(j, obj)).intValue();
    }

    public static long y(long j, Object obj) {
        return ((Long) c1.f10811c.i(j, obj)).longValue();
    }

    public final void A(Object obj, int i7, androidx.datastore.preferences.protobuf.g gVar, q0 q0Var, l lVar) throws v {
        int iV;
        List listC = this.k.c(i7 & 1048575, obj);
        j jVar = (j) gVar.f1863e;
        int i10 = gVar.f1860b;
        if ((i10 & 7) != 2) {
            throw v.b();
        }
        do {
            r rVarC = q0Var.c();
            gVar.f(rVarC, q0Var, lVar);
            q0Var.a(rVarC);
            listC.add(rVarC);
            if (jVar.c() || gVar.f1862d != 0) {
                return;
            } else {
                iV = jVar.v();
            }
        } while (iV == i10);
        gVar.f1862d = iV;
    }

    public final void B(int i7, androidx.datastore.preferences.protobuf.g gVar, Object obj) throws u {
        j jVar = (j) gVar.f1863e;
        if ((536870912 & i7) != 0) {
            gVar.X(2);
            c1.o(i7 & 1048575, obj, jVar.u());
        } else if (!this.f10858f) {
            c1.o(i7 & 1048575, obj, gVar.j());
        } else {
            gVar.X(2);
            c1.o(i7 & 1048575, obj, jVar.t());
        }
    }

    public final void C(int i7, androidx.datastore.preferences.protobuf.g gVar, Object obj) throws u, androidx.datastore.preferences.protobuf.v {
        int i10 = 536870912 & i7;
        a0 a0Var = this.k;
        if (i10 != 0) {
            gVar.P(a0Var.c(i7 & 1048575, obj), true);
        } else {
            gVar.P(a0Var.c(i7 & 1048575, obj), false);
        }
    }

    public final void E(int i7, Object obj) {
        int i10 = this.f10853a[i7 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        c1.m((1 << (i10 >>> 20)) | c1.f10811c.g(j, obj), j, obj);
    }

    public final void F(int i7, int i10, Object obj) {
        c1.m(i7, this.f10853a[i10 + 2] & 1048575, obj);
    }

    public final void G(Object obj, int i7, b bVar) {
        f10852o.putObject(obj, J(i7) & 1048575, bVar);
        E(i7, obj);
    }

    public final void H(Object obj, int i7, int i10, b bVar) {
        f10852o.putObject(obj, J(i10) & 1048575, bVar);
        F(i7, i10, obj);
    }

    public final int J(int i7) {
        return this.f10853a[i7 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e A[SYNTHETIC] */
    @Override // hj.q0
    public final void a(Object obj) {
        if (n(obj)) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                rVar.f10901b = (rVar.f10901b & Integer.MIN_VALUE) | (Integer.MAX_VALUE & Integer.MAX_VALUE);
                rVar.f10803a = 0;
                rVar.f10901b = Integer.MAX_VALUE & rVar.f10901b;
            }
            int[] iArr = this.f10853a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iJ = J(i7);
                long j = 1048575 & iJ;
                int I = I(iJ);
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
                            case 17:
                                if (l(i7, obj)) {
                                    k(i7).a(f10852o.getObject(obj, j));
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
                                this.k.a(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f10852o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f10863m.getClass();
                                    ((e0) object).f10824d = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (o(iArr[i7], i7, obj)) {
                        k(i7).a(f10852o.getObject(obj, j));
                    }
                } else if (l(i7, obj)) {
                    k(i7).a(f10852o.getObject(obj, j));
                }
            }
            this.f10862l.getClass();
            t0 t0Var = ((r) obj).f10902c;
            if (t0Var.f10912d) {
                t0Var.f10912d = false;
            }
        }
    }

    @Override // hj.q0
    public final boolean b(Object obj) {
        int i7;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f10860h) {
            int i14 = this.f10859g[i13];
            int[] iArr = this.f10853a;
            int i15 = iArr[i14];
            int iJ = J(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = f10852o.getInt(obj, i17);
                }
                i10 = i12;
                i7 = i17;
            } else {
                int i19 = i12;
                i7 = i11;
                i10 = i19;
            }
            if ((268435456 & iJ) == 0 || m(obj, i14, i7, i10, i18)) {
                int I = I(iJ);
                if (I == 9 || I == 17) {
                    if (m(obj, i14, i7, i10, i18)) {
                        if (!k(i14).b(c1.f10811c.i(iJ & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i13++;
                    i11 = i7;
                    i12 = i10;
                } else {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (o(i15, i14, obj)) {
                                if (!k(i14).b(c1.f10811c.i(iJ & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i13++;
                            i11 = i7;
                            i12 = i10;
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object objI = c1.f10811c.i(iJ & 1048575, obj);
                                this.f10863m.getClass();
                                e0 e0Var = (e0) objI;
                                if (e0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((j1) ((d0) this.f10854b[(i14 / 3) * 2]).f10818a.f6612i).f10868d != k1.F) {
                                        continue;
                                    } else {
                                        q0 q0VarA = null;
                                        for (Object obj2 : e0Var.values()) {
                                            if (q0VarA == null) {
                                                q0VarA = n0.f10886c.a(obj2.getClass());
                                            }
                                            if (!q0VarA.b(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i13++;
                            i11 = i7;
                            i12 = i10;
                        }
                    }
                    List list = (List) c1.f10811c.i(iJ & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        q0 q0VarK = k(i14);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (q0VarK.b(list.get(i20))) {
                            }
                        }
                    }
                    i13++;
                    i11 = i7;
                    i12 = i10;
                }
            }
            return false;
        }
        return true;
    }

    @Override // hj.q0
    public final r c() {
        this.j.getClass();
        return ((r) this.f10857e).f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // hj.q0
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!n(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f10853a;
            if (i7 >= iArr.length) {
                r0.a(this.f10862l, obj, obj2);
                return;
            }
            int iJ = J(i7);
            long j = 1048575 & iJ;
            int i10 = iArr[i7];
            switch (I(iJ)) {
                case 0:
                    if (!l(i7, obj2)) {
                        obj3 = obj;
                    } else {
                        b1 b1Var = c1.f10811c;
                        obj3 = obj;
                        b1Var.l(obj3, j, b1Var.e(j, obj2));
                        E(i7, obj3);
                    }
                    break;
                case 1:
                    if (l(i7, obj2)) {
                        b1 b1Var2 = c1.f10811c;
                        b1Var2.m(obj, j, b1Var2.f(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (l(i7, obj2)) {
                        c1.n(obj, j, c1.f10811c.h(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (l(i7, obj2)) {
                        c1.n(obj, j, c1.f10811c.h(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (l(i7, obj2)) {
                        c1.m(c1.f10811c.g(j, obj2), j, obj);
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (l(i7, obj2)) {
                        c1.n(obj, j, c1.f10811c.h(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (l(i7, obj2)) {
                        c1.m(c1.f10811c.g(j, obj2), j, obj);
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (l(i7, obj2)) {
                        b1 b1Var3 = c1.f10811c;
                        b1Var3.k(obj, j, b1Var3.c(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (l(i7, obj2)) {
                        c1.o(j, obj, c1.f10811c.i(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    q(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (l(i7, obj2)) {
                        c1.o(j, obj, c1.f10811c.i(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (l(i7, obj2)) {
                        c1.m(c1.f10811c.g(j, obj2), j, obj);
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (l(i7, obj2)) {
                        c1.m(c1.f10811c.g(j, obj2), j, obj);
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (l(i7, obj2)) {
                        c1.m(c1.f10811c.g(j, obj2), j, obj);
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (l(i7, obj2)) {
                        c1.n(obj, j, c1.f10811c.h(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (l(i7, obj2)) {
                        c1.m(c1.f10811c.g(j, obj2), j, obj);
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (l(i7, obj2)) {
                        c1.n(obj, j, c1.f10811c.h(j, obj2));
                        E(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    q(i7, obj, obj2);
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
                    this.k.b(j, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = r0.f10903a;
                    b1 b1Var4 = c1.f10811c;
                    Object objI = b1Var4.i(j, obj);
                    Object objI2 = b1Var4.i(j, obj2);
                    this.f10863m.getClass();
                    c1.o(j, obj, f0.a(objI, objI2));
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
                    if (o(i10, i7, obj2)) {
                        c1.o(j, obj, c1.f10811c.i(j, obj2));
                        F(i10, i7, obj);
                    }
                    obj3 = obj;
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    r(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (o(i10, i7, obj2)) {
                        c1.o(j, obj, c1.f10811c.i(j, obj2));
                        F(i10, i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    r(i7, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // hj.q0
    public final int e(r rVar) {
        int i7;
        int iB;
        int i10;
        int[] iArr = this.f10853a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iJ = J(i12);
            int i13 = iArr[i12];
            long j = 1048575 & iJ;
            int i14 = 1237;
            int iHashCode = 37;
            switch (I(iJ)) {
                case 0:
                    i7 = i11 * 53;
                    iB = t.b(Double.doubleToLongBits(c1.f10811c.e(j, rVar)));
                    i11 = iB + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    iB = Float.floatToIntBits(c1.f10811c.f(j, rVar));
                    i11 = iB + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    iB = t.b(c1.f10811c.h(j, rVar));
                    i11 = iB + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    iB = t.b(c1.f10811c.h(j, rVar));
                    i11 = iB + i7;
                    break;
                case 4:
                    i7 = i11 * 53;
                    iB = c1.f10811c.g(j, rVar);
                    i11 = iB + i7;
                    break;
                case 5:
                    i7 = i11 * 53;
                    iB = t.b(c1.f10811c.h(j, rVar));
                    i11 = iB + i7;
                    break;
                case 6:
                    i7 = i11 * 53;
                    iB = c1.f10811c.g(j, rVar);
                    i11 = iB + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean zC = c1.f10811c.c(j, rVar);
                    Charset charset = t.f10906a;
                    if (zC) {
                        i14 = 1231;
                    }
                    i11 = i14 + i10;
                    break;
                case 8:
                    i7 = i11 * 53;
                    iB = ((String) c1.f10811c.i(j, rVar)).hashCode();
                    i11 = iB + i7;
                    break;
                case 9:
                    Object objI = c1.f10811c.i(j, rVar);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i11 * 53;
                    iB = c1.f10811c.i(j, rVar).hashCode();
                    i11 = iB + i7;
                    break;
                case 11:
                    i7 = i11 * 53;
                    iB = c1.f10811c.g(j, rVar);
                    i11 = iB + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    iB = c1.f10811c.g(j, rVar);
                    i11 = iB + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    iB = c1.f10811c.g(j, rVar);
                    i11 = iB + i7;
                    break;
                case 14:
                    i7 = i11 * 53;
                    iB = t.b(c1.f10811c.h(j, rVar));
                    i11 = iB + i7;
                    break;
                case 15:
                    i7 = i11 * 53;
                    iB = c1.f10811c.g(j, rVar);
                    i11 = iB + i7;
                    break;
                case 16:
                    i7 = i11 * 53;
                    iB = t.b(c1.f10811c.h(j, rVar));
                    i11 = iB + i7;
                    break;
                case 17:
                    Object objI2 = c1.f10811c.i(j, rVar);
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
                    iB = c1.f10811c.i(j, rVar).hashCode();
                    i11 = iB + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    iB = c1.f10811c.i(j, rVar).hashCode();
                    i11 = iB + i7;
                    break;
                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = t.b(Double.doubleToLongBits(((Double) c1.f10811c.i(j, rVar)).doubleValue()));
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = Float.floatToIntBits(((Float) c1.f10811c.i(j, rVar)).floatValue());
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = t.b(y(j, rVar));
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = t.b(y(j, rVar));
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = x(j, rVar);
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = t.b(y(j, rVar));
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = x(j, rVar);
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    if (o(i13, i12, rVar)) {
                        i10 = i11 * 53;
                        boolean zBooleanValue = ((Boolean) c1.f10811c.i(j, rVar)).booleanValue();
                        Charset charset2 = t.f10906a;
                        if (zBooleanValue) {
                            i14 = 1231;
                        }
                        i11 = i14 + i10;
                    }
                    break;
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = ((String) c1.f10811c.i(j, rVar)).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = c1.f10811c.i(j, rVar).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case 61:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = c1.f10811c.i(j, rVar).hashCode();
                        i11 = iB + i7;
                    }
                    break;
                case 62:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = x(j, rVar);
                        i11 = iB + i7;
                    }
                    break;
                case 63:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = x(j, rVar);
                        i11 = iB + i7;
                    }
                    break;
                case 64:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = x(j, rVar);
                        i11 = iB + i7;
                    }
                    break;
                case 65:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = t.b(y(j, rVar));
                        i11 = iB + i7;
                    }
                    break;
                case 66:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = x(j, rVar);
                        i11 = iB + i7;
                    }
                    break;
                case 67:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = t.b(y(j, rVar));
                        i11 = iB + i7;
                    }
                    break;
                case 68:
                    if (o(i13, i12, rVar)) {
                        i7 = i11 * 53;
                        iB = c1.f10811c.i(j, rVar).hashCode();
                        i11 = iB + i7;
                    }
                    break;
            }
        }
        this.f10862l.getClass();
        return rVar.f10902c.hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // hj.q0
    public final boolean f(r rVar, r rVar2) {
        int[] iArr = this.f10853a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean zB = true;
            if (i7 < length) {
                int iJ = J(i7);
                long j = iJ & 1048575;
                switch (I(iJ)) {
                    case 0:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var = c1.f10811c;
                            if (Double.doubleToLongBits(b1Var.e(j, rVar)) != Double.doubleToLongBits(b1Var.e(j, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 1:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var2 = c1.f10811c;
                            if (Float.floatToIntBits(b1Var2.f(j, rVar)) != Float.floatToIntBits(b1Var2.f(j, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 2:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var3 = c1.f10811c;
                            if (b1Var3.h(j, rVar) != b1Var3.h(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 3:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var4 = c1.f10811c;
                            if (b1Var4.h(j, rVar) != b1Var4.h(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 4:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var5 = c1.f10811c;
                            if (b1Var5.g(j, rVar) != b1Var5.g(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 5:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var6 = c1.f10811c;
                            if (b1Var6.h(j, rVar) != b1Var6.h(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 6:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var7 = c1.f10811c;
                            if (b1Var7.g(j, rVar) != b1Var7.g(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 7:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var8 = c1.f10811c;
                            if (b1Var8.c(j, rVar) != b1Var8.c(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 8:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var9 = c1.f10811c;
                            if (!r0.b(b1Var9.i(j, rVar), b1Var9.i(j, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 9:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var10 = c1.f10811c;
                            if (!r0.b(b1Var10.i(j, rVar), b1Var10.i(j, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 10:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var11 = c1.f10811c;
                            if (!r0.b(b1Var11.i(j, rVar), b1Var11.i(j, rVar2))) {
                                zB = false;
                            }
                        }
                        break;
                    case 11:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var12 = c1.f10811c;
                            if (b1Var12.g(j, rVar) != b1Var12.g(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 12:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var13 = c1.f10811c;
                            if (b1Var13.g(j, rVar) != b1Var13.g(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 13:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var14 = c1.f10811c;
                            if (b1Var14.g(j, rVar) != b1Var14.g(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 14:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var15 = c1.f10811c;
                            if (b1Var15.h(j, rVar) != b1Var15.h(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 15:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var16 = c1.f10811c;
                            if (b1Var16.g(j, rVar) != b1Var16.g(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 16:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var17 = c1.f10811c;
                            if (b1Var17.h(j, rVar) != b1Var17.h(j, rVar2)) {
                                zB = false;
                            }
                        }
                        break;
                    case 17:
                        if (!h(rVar, rVar2, i7)) {
                            zB = false;
                        } else {
                            b1 b1Var18 = c1.f10811c;
                            if (!r0.b(b1Var18.i(j, rVar), b1Var18.i(j, rVar2))) {
                                zB = false;
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
                        b1 b1Var19 = c1.f10811c;
                        zB = r0.b(b1Var19.i(j, rVar), b1Var19.i(j, rVar2));
                        break;
                    case 50:
                        b1 b1Var20 = c1.f10811c;
                        zB = r0.b(b1Var20.i(j, rVar), b1Var20.i(j, rVar2));
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
                        b1 b1Var21 = c1.f10811c;
                        if (b1Var21.g(j5, rVar) != b1Var21.g(j5, rVar2) || !r0.b(b1Var21.i(j, rVar), b1Var21.i(j, rVar2))) {
                            zB = false;
                        }
                        break;
                }
                if (zB) {
                    i7 += 3;
                }
            } else {
                this.f10862l.getClass();
                if (rVar.f10902c.equals(rVar2.f10902c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // hj.q0
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.g r20, hj.l r21) {
        /*
            Method dump skipped, instruction units count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.j0.g(java.lang.Object, androidx.datastore.preferences.protobuf.g, hj.l):void");
    }

    public final boolean h(r rVar, r rVar2, int i7) {
        return l(i7, rVar) == l(i7, rVar2);
    }

    public final void i(int i7, Object obj, Object obj2) {
        int i10 = this.f10853a[i7];
        if (c1.f10811c.i(J(i7) & 1048575, obj) == null) {
            return;
        }
        j(i7);
    }

    public final void j(int i7) {
        if (this.f10854b[((i7 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final q0 k(int i7) {
        int i10 = (i7 / 3) * 2;
        Object[] objArr = this.f10854b;
        q0 q0Var = (q0) objArr[i10];
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0VarA = n0.f10886c.a((Class) objArr[i10 + 1]);
        objArr[i10] = q0VarA;
        return q0VarA;
    }

    public final boolean l(int i7, Object obj) {
        int i10 = this.f10853a[i7 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int iJ = J(i7);
            long j5 = iJ & 1048575;
            switch (I(iJ)) {
                case 0:
                    if (Double.doubleToRawLongBits(c1.f10811c.e(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(c1.f10811c.f(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (c1.f10811c.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (c1.f10811c.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (c1.f10811c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (c1.f10811c.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (c1.f10811c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return c1.f10811c.c(j5, obj);
                case 8:
                    Object objI = c1.f10811c.i(j5, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof g) {
                        return !g.f10828i.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (c1.f10811c.i(j5, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.f10828i.equals(c1.f10811c.i(j5, obj));
                case 11:
                    if (c1.f10811c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (c1.f10811c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (c1.f10811c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (c1.f10811c.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (c1.f10811c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (c1.f10811c.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (c1.f10811c.i(j5, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & c1.f10811c.g(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean m(Object obj, int i7, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return l(i7, obj);
        }
        return (i11 & i12) != 0;
    }

    public final boolean o(int i7, int i10, Object obj) {
        return c1.f10811c.g((long) (this.f10853a[i10 + 2] & 1048575), obj) == i7;
    }

    public final void p(Object obj, int i7, Object obj2, l lVar, androidx.datastore.preferences.protobuf.g gVar) throws u {
        long J = J(i7) & 1048575;
        Object objI = c1.f10811c.i(J, obj);
        f0 f0Var = this.f10863m;
        if (objI == null) {
            f0Var.getClass();
            objI = e0.f10823e.b();
            c1.o(J, obj, objI);
        } else {
            f0Var.getClass();
            if (!((e0) objI).f10824d) {
                e0 e0VarB = e0.f10823e.b();
                f0.a(e0VarB, objI);
                c1.o(J, obj, e0VarB);
                objI = e0VarB;
            }
        }
        f0Var.getClass();
        e0 e0Var = (e0) objI;
        com.google.firebase.messaging.r rVar = ((d0) obj2).f10818a;
        gVar.X(2);
        j jVar = (j) gVar.f1863e;
        int iE = jVar.e(jVar.w());
        Object objP = rVar.f6611e;
        Object obj3 = rVar.f6613v;
        Object objP2 = obj3;
        while (true) {
            try {
                int iB = gVar.b();
                if (iB == Integer.MAX_VALUE || jVar.c()) {
                    break;
                }
                if (iB == 1) {
                    objP = gVar.p((j1) rVar.f6610d, null, null);
                } else if (iB != 2) {
                    try {
                        if (!gVar.Z()) {
                            throw new v("Unable to parse map entry.");
                        }
                    } catch (u unused) {
                        if (!gVar.Z()) {
                            throw new v("Unable to parse map entry.");
                        }
                    }
                } else {
                    objP2 = gVar.p((j1) rVar.f6612i, obj3.getClass(), lVar);
                }
            } catch (Throwable th2) {
                jVar.d(iE);
                throw th2;
            }
        }
        e0Var.put(objP, objP2);
        jVar.d(iE);
    }

    public final void q(int i7, Object obj, Object obj2) {
        if (l(i7, obj2)) {
            long J = J(i7) & 1048575;
            Unsafe unsafe = f10852o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10853a[i7] + " is present but null: " + obj2);
            }
            q0 q0VarK = k(i7);
            if (!l(i7, obj)) {
                if (n(object)) {
                    r rVarC = q0VarK.c();
                    q0VarK.d(rVarC, object);
                    unsafe.putObject(obj, J, rVarC);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                E(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!n(object2)) {
                r rVarC2 = q0VarK.c();
                q0VarK.d(rVarC2, object2);
                unsafe.putObject(obj, J, rVarC2);
                object2 = rVarC2;
            }
            q0VarK.d(object2, object);
        }
    }

    public final void r(int i7, Object obj, Object obj2) {
        int[] iArr = this.f10853a;
        int i10 = iArr[i7];
        if (o(i10, i7, obj2)) {
            long J = J(i7) & 1048575;
            Unsafe unsafe = f10852o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            q0 q0VarK = k(i7);
            if (!o(i10, i7, obj)) {
                if (n(object)) {
                    r rVarC = q0VarK.c();
                    q0VarK.d(rVarC, object);
                    unsafe.putObject(obj, J, rVarC);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                F(i10, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!n(object2)) {
                r rVarC2 = q0VarK.c();
                q0VarK.d(rVarC2, object2);
                unsafe.putObject(obj, J, rVarC2);
                object2 = rVarC2;
            }
            q0VarK.d(object2, object);
        }
    }

    public final Object s(int i7, Object obj) {
        q0 q0VarK = k(i7);
        long J = J(i7) & 1048575;
        if (!l(i7, obj)) {
            return q0VarK.c();
        }
        Object object = f10852o.getObject(obj, J);
        if (n(object)) {
            return object;
        }
        r rVarC = q0VarK.c();
        if (object != null) {
            q0VarK.d(rVarC, object);
        }
        return rVarC;
    }

    public final Object t(int i7, int i10, Object obj) {
        q0 q0VarK = k(i10);
        if (!o(i7, i10, obj)) {
            return q0VarK.c();
        }
        Object object = f10852o.getObject(obj, J(i10) & 1048575);
        if (n(object)) {
            return object;
        }
        r rVarC = q0VarK.c();
        if (object != null) {
            q0VarK.d(rVarC, object);
        }
        return rVarC;
    }

    public final void z(Object obj, long j, androidx.datastore.preferences.protobuf.g gVar, q0 q0Var, l lVar) throws u {
        int iV;
        List listC = this.k.c(j, obj);
        j jVar = (j) gVar.f1863e;
        int i7 = gVar.f1860b;
        if ((i7 & 7) != 3) {
            throw v.b();
        }
        do {
            r rVarC = q0Var.c();
            gVar.e(rVarC, q0Var, lVar);
            q0Var.a(rVarC);
            listC.add(rVarC);
            if (jVar.c() || gVar.f1862d != 0) {
                return;
            } else {
                iV = jVar.v();
            }
        } while (iV == i7);
        gVar.f1862d = iV;
    }
}
