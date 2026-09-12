package ge;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends FrameLayout implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f10025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f10026e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f10027i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f10028v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f10029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f10030x;

    public w(Context context) {
        super(context, null);
        this.f10027i = Collections.EMPTY_LIST;
        this.f10028v = d.f9972g;
        this.f10029w = 0.0533f;
        this.f10030x = 0.08f;
        c cVar = new c(context, 0);
        this.f10025d = cVar;
        u uVar = new u(context, null);
        this.f10026e = uVar;
        uVar.setBackgroundColor(0);
        addView(cVar);
        addView(uVar);
    }

    @Override // ge.p
    public final void a(List list, d dVar, float f2, float f7) {
        this.f10028v = dVar;
        this.f10029w = f2;
        this.f10030x = f7;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            vd.c cVar = (vd.c) list.get(i7);
            if (cVar.f21642v != null) {
                arrayList.add(cVar);
            } else {
                arrayList2.add(cVar);
            }
        }
        if (!this.f10027i.isEmpty() || !arrayList2.isEmpty()) {
            this.f10027i = arrayList2;
            c();
        }
        this.f10025d.a(arrayList, dVar, f2, f7);
        invalidate();
    }

    public final String b(float f2, int i7) {
        float fH = mf.f.H(i7, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), f2);
        if (fH == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fH / getContext().getResources().getDisplayMetrics().density)};
        int i10 = e0.f13788a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0242  */
    /* JADX WARN: Code duplicated, block: B:106:0x0248  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:109:0x0275 A[LOOP:2: B:108:0x0273->B:109:0x0275, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0298 A[LOOP:3: B:111:0x0292->B:113:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:121:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x030f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0327  */
    /* JADX WARN: Code duplicated, block: B:126:0x032d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0343  */
    /* JADX WARN: Code duplicated, block: B:129:0x0349  */
    /* JADX WARN: Code duplicated, block: B:130:0x034c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0350  */
    /* JADX WARN: Code duplicated, block: B:134:0x0359  */
    /* JADX WARN: Code duplicated, block: B:135:0x035f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0379  */
    /* JADX WARN: Code duplicated, block: B:139:0x037d  */
    /* JADX WARN: Code duplicated, block: B:140:0x039a  */
    /* JADX WARN: Code duplicated, block: B:142:0x039e  */
    /* JADX WARN: Code duplicated, block: B:144:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x03da  */
    /* JADX WARN: Code duplicated, block: B:158:0x03de  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:172:0x0401  */
    /* JADX WARN: Code duplicated, block: B:173:0x0405  */
    /* JADX WARN: Code duplicated, block: B:175:0x0409  */
    /* JADX WARN: Code duplicated, block: B:177:0x041c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0420  */
    /* JADX WARN: Code duplicated, block: B:181:0x0426  */
    /* JADX WARN: Code duplicated, block: B:183:0x042e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0431 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0433  */
    /* JADX WARN: Code duplicated, block: B:188:0x0436  */
    /* JADX WARN: Code duplicated, block: B:189:0x043a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0440  */
    /* JADX WARN: Code duplicated, block: B:191:0x0446  */
    /* JADX WARN: Code duplicated, block: B:192:0x044c  */
    /* JADX WARN: Code duplicated, block: B:195:0x045a  */
    /* JADX WARN: Code duplicated, block: B:196:0x045d  */
    /* JADX WARN: Code duplicated, block: B:199:0x046f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0487  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:243:0x0502  */
    /* JADX WARN: Code duplicated, block: B:246:0x0517  */
    /* JADX WARN: Code duplicated, block: B:252:0x0546  */
    /* JADX WARN: Code duplicated, block: B:255:0x0572 A[LOOP:6: B:253:0x056c->B:255:0x0572, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x058d A[LOOP:7: B:257:0x0587->B:259:0x058d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:267:0x05db  */
    /* JADX WARN: Code duplicated, block: B:271:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:275:0x0603  */
    /* JADX WARN: Code duplicated, block: B:277:0x0606  */
    /* JADX WARN: Code duplicated, block: B:281:0x060d  */
    /* JADX WARN: Code duplicated, block: B:284:0x0626  */
    /* JADX WARN: Code duplicated, block: B:287:0x0643  */
    /* JADX WARN: Code duplicated, block: B:289:0x064e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0651  */
    /* JADX WARN: Code duplicated, block: B:292:0x0654  */
    /* JADX WARN: Code duplicated, block: B:293:0x0657  */
    /* JADX WARN: Code duplicated, block: B:295:0x0675  */
    /* JADX WARN: Code duplicated, block: B:313:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0207  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x0298, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        String str2;
        int i7;
        float f2;
        String str3;
        Layout.Alignment alignment;
        String str4;
        int i10;
        int i11;
        Object obj;
        int i12;
        String str5;
        int i13;
        String str6;
        String str7;
        String str8;
        Object obj2;
        String str9;
        CharSequence charSequence;
        float f7;
        String str10;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i14;
        HashMap map;
        Iterator it;
        String str11;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i15;
        String str12;
        StringBuilder sb2;
        int i16;
        int i17;
        cg.b bVar;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z5;
        boolean z6;
        Object[] objArr;
        zd.d dVar;
        int i18;
        int i19;
        StringBuilder sb3;
        int i20;
        String str13;
        String strE;
        int i21;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str14;
        int spanStart;
        int spanEnd;
        m mVar;
        m mVar2;
        float f10;
        String str15;
        Layout.Alignment alignment2;
        String str16;
        int i22;
        String str17;
        String str18;
        String str19;
        boolean z7;
        StringBuilder sb4 = new StringBuilder();
        String strA = ls.l.A(this.f10028v.f9973a);
        int i23 = 0;
        String strB = b(this.f10029w, 0);
        float f11 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        d dVar2 = this.f10028v;
        int i24 = dVar2.f9976d;
        int i25 = dVar2.f9977e;
        int i26 = 2;
        int i27 = 1;
        if (i24 == 1) {
            Object[] objArr2 = {ls.l.A(i25)};
            int i28 = e0.f13788a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i24 == 2) {
            String strA2 = ls.l.A(i25);
            int i29 = e0.f13788a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strA2);
        } else if (i24 == 3) {
            String strA3 = ls.l.A(i25);
            int i30 = e0.f13788a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strA3);
        } else if (i24 != 4) {
            strConcat = "unset";
        } else {
            String strA4 = ls.l.A(i25);
            int i31 = e0.f13788a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strA4);
        }
        Object[] objArr3 = {strA, strB, fValueOf, strConcat};
        int i32 = e0.f13788a;
        sb4.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map2 = new HashMap();
        String strA5 = ls.l.A(this.f10028v.f9974b);
        String str20 = "background-color:";
        StringBuilder sb5 = new StringBuilder("background-color:");
        sb5.append(strA5);
        String str21 = ";";
        sb5.append(";");
        map2.put(".default_bg,.default_bg *", sb5.toString());
        int i33 = 0;
        while (i33 < this.f10027i.size()) {
            vd.c cVar = (vd.c) this.f10027i.get(i33);
            float f12 = cVar.E;
            int i34 = cVar.f21645y;
            int i35 = cVar.M;
            float f13 = f12 != -3.4028235E38f ? f12 * 100.0f : 50.0f;
            float f14 = f11;
            int i36 = cVar.F;
            int i37 = -100;
            int i38 = i36 != i27 ? i36 != i26 ? i23 : -100 : -50;
            float f15 = cVar.f21643w;
            if (f15 != -3.4028235E38f) {
                if (cVar.f21644x != i27) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f15 * 100.0f));
                    if (i35 == i27) {
                        i37 = -(i34 != i27 ? i34 != 2 ? 0 : -100 : -50);
                    } else {
                        i37 = i34 != i27 ? i34 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    if (f15 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f15 * f14));
                        i7 = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f15) - 1.0f) * f14));
                        i7 = i27;
                    }
                    i37 = 0;
                }
                f2 = cVar.G;
                if (f2 != -3.4028235E38f) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f2 * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str22 = str3;
                alignment = cVar.f21640e;
                str4 = ViewProps.END;
                if (alignment == null) {
                    i12 = i27;
                    obj = "center";
                    i11 = 2;
                } else {
                    i10 = v.f10024a[alignment.ordinal()];
                    if (i10 != i27) {
                        i11 = 2;
                        if (i10 != 2) {
                            obj = "center";
                        } else {
                            obj = ViewProps.END;
                        }
                    } else {
                        i11 = 2;
                        obj = ViewProps.START;
                    }
                    i12 = 1;
                }
                if (i35 != i12) {
                    str5 = "vertical-rl";
                } else if (i35 != i11) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str23 = str5;
                String strB2 = b(cVar.L, cVar.K);
                if (cVar.I) {
                    i13 = cVar.J;
                } else {
                    i13 = this.f10028v.f9975c;
                }
                String strA6 = ls.l.A(i13);
                str6 = ViewProps.TOP;
                if (i35 != 1) {
                    if (i7 != 0) {
                        str7 = ViewProps.LEFT;
                    } else {
                        str7 = ViewProps.RIGHT;
                    }
                    str8 = str7;
                    obj2 = ViewProps.TOP;
                } else if (i35 != 2) {
                    if (i7 != 0) {
                        str6 = ViewProps.BOTTOM;
                    }
                    str8 = str6;
                    obj2 = ViewProps.LEFT;
                } else {
                    if (i7 != 0) {
                        str7 = ViewProps.RIGHT;
                    } else {
                        str7 = ViewProps.LEFT;
                    }
                    str8 = str7;
                    obj2 = ViewProps.TOP;
                }
                if (i35 != 2 || i35 == 1) {
                    str9 = "height";
                    int i39 = i37;
                    i37 = i38;
                    i38 = i39;
                } else {
                    str9 = "width";
                }
                String str24 = str9;
                charSequence = cVar.f21639d;
                f7 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = n.f9997a;
                int i40 = i38;
                int i41 = i33;
                if (charSequence == null) {
                    bVar = new cg.b("", (byte) 0);
                    str10 = "";
                } else {
                    str10 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i14 = 0;
                        while (i14 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i14].getBackgroundColor()));
                            i14++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strH = kk.b.h(iIntValue, "bg_");
                            Iterator it4 = it;
                            String strF = s0.g.f(".", strH, ",.", strH, " *");
                            String strA7 = ls.l.A(iIntValue);
                            int i42 = e0.f13788a;
                            Locale locale4 = Locale.US;
                            map.put(strF, str20 + strA7 + str21);
                            it = it4;
                            str4 = str4;
                        }
                        str11 = str4;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i15 = 0;
                        for (length2 = spans.length; i15 < length2; length2 = length2) {
                            obj3 = spans[i15];
                            String str25 = str21;
                            z5 = obj3 instanceof StrikethroughSpan;
                            String str26 = null;
                            if (z5) {
                                z6 = z5;
                                strE = "<span style='text-decoration:line-through;'>";
                            } else {
                                z6 = z5;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strA8 = ls.l.A(((ForegroundColorSpan) obj3).getForegroundColor());
                                    int i43 = e0.f13788a;
                                    Locale locale5 = Locale.US;
                                    strE = s0.g.e("<span style='color:", strA8, ";'>");
                                } else {
                                    str20 = str20;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        int i44 = e0.f13788a;
                                        Locale locale6 = Locale.US;
                                        objArr = spans;
                                        strE = s0.g.d(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj3 instanceof zd.a) {
                                            strE = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f7;
                                            }
                                            Object[] objArr4 = {Float.valueOf(size)};
                                            int i45 = e0.f13788a;
                                            strE = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            int i46 = e0.f13788a;
                                            strE = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                int i47 = e0.f13788a;
                                                Locale locale7 = Locale.US;
                                                strE = s0.g.e("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strE = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strE = "<b>";
                                            } else if (style != 2) {
                                                strE = "<i>";
                                            } else if (style != 3) {
                                                strE = null;
                                            } else {
                                                strE = "<b><i>";
                                            }
                                        } else if (obj3 instanceof zd.c) {
                                            i21 = ((zd.c) obj3).f23909b;
                                            if (i21 != -1) {
                                                strE = "<ruby style='ruby-position:unset;'>";
                                            } else if (i21 != 1) {
                                                strE = "<ruby style='ruby-position:over;'>";
                                            } else if (i21 != 2) {
                                                strE = null;
                                            } else {
                                                strE = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strE = "<u>";
                                        } else if (obj3 instanceof zd.d) {
                                            dVar = (zd.d) obj3;
                                            i18 = dVar.f23910a;
                                            i19 = dVar.f23911b;
                                            sb3 = new StringBuilder();
                                            if (i19 != 1) {
                                                i20 = 2;
                                                if (i19 == 2) {
                                                    sb3.append("open ");
                                                }
                                            } else {
                                                i20 = 2;
                                                sb3.append("filled ");
                                            }
                                            if (i18 != 0) {
                                                sb3.append(ViewProps.NONE);
                                            } else if (i18 != 1) {
                                                sb3.append("circle");
                                            } else if (i18 != i20) {
                                                sb3.append("dot");
                                            } else if (i18 != 3) {
                                                sb3.append("unset");
                                            } else {
                                                sb3.append("sesame");
                                            }
                                            String string = sb3.toString();
                                            if (dVar.f23912c != 2) {
                                                str13 = "over right";
                                            } else {
                                                str13 = "under left";
                                            }
                                            Object[] objArr6 = {string, str13};
                                            int i48 = e0.f13788a;
                                            strE = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                        } else {
                                            strE = null;
                                        }
                                    }
                                }
                                if (z6 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof zd.a) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof zd.d)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str14 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str26 = "</b>";
                                            } else if (style2 == 2) {
                                                str26 = "</i>";
                                            } else if (style2 == 3) {
                                                str26 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof zd.c) {
                                            str26 = "<rt>" + n.a(((zd.c) obj3).f23908a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str26 = "</u>";
                                        }
                                        str14 = str26;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strE != null) {
                                    str14.getClass();
                                    l lVar = new l(spanStart, spanEnd, strE, str14);
                                    mVar = (m) sparseArray.get(spanStart);
                                    if (mVar == null) {
                                        mVar = new m();
                                        sparseArray.put(spanStart, mVar);
                                    }
                                    mVar.f9995a.add(lVar);
                                    mVar2 = (m) sparseArray.get(spanEnd);
                                    if (mVar2 == null) {
                                        mVar2 = new m();
                                        sparseArray.put(spanEnd, mVar2);
                                    }
                                    mVar2.f9996b.add(lVar);
                                }
                                i15++;
                                str21 = str25;
                                str20 = str20;
                                spans = objArr;
                            }
                            objArr = spans;
                            str14 = z6 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strE != null) {
                                str14.getClass();
                                l lVar2 = new l(spanStart, spanEnd, strE, str14);
                                mVar = (m) sparseArray.get(spanStart);
                                if (mVar == null) {
                                    mVar = new m();
                                    sparseArray.put(spanStart, mVar);
                                }
                                mVar.f9995a.add(lVar2);
                                mVar2 = (m) sparseArray.get(spanEnd);
                                if (mVar2 == null) {
                                    mVar2 = new m();
                                    sparseArray.put(spanEnd, mVar2);
                                }
                                mVar2.f9996b.add(lVar2);
                            }
                            i15++;
                            str21 = str25;
                            str20 = str20;
                            spans = objArr;
                        }
                        str21 = str21;
                        str12 = str20;
                        sb2 = new StringBuilder(spanned.length());
                        i16 = 0;
                        i17 = 0;
                        while (i16 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i16);
                            sb2.append(n.a(spanned.subSequence(i17, iKeyAt)));
                            m mVar3 = (m) sparseArray.get(iKeyAt);
                            ArrayList arrayList = mVar3.f9996b;
                            ArrayList arrayList2 = mVar3.f9995a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, l.f9990f);
                            it2 = mVar3.f9996b.iterator();
                            while (it2.hasNext()) {
                                sb2.append(((l) it2.next()).f9994d);
                            }
                            Collections.sort(arrayList2, l.f9989e);
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                sb2.append(((l) it3.next()).f9993c);
                            }
                            i16++;
                            i17 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb2.append(n.a(spanned.subSequence(i17, spanned.length())));
                        bVar = new cg.b(sb2.toString(), (byte) 0);
                    } else {
                        bVar = new cg.b(n.a(charSequence), (byte) 0);
                    }
                    for (String str27 : map2.keySet()) {
                        str19 = (String) map2.put(str27, (String) map2.get(str27));
                        if (str19 != null || str19.equals(map2.get(str27))) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        je.b.k(z7);
                    }
                    Integer numValueOf = Integer.valueOf(i41);
                    Float fValueOf2 = Float.valueOf(f13);
                    Integer numValueOf2 = Integer.valueOf(i40);
                    Integer numValueOf3 = Integer.valueOf(i37);
                    f10 = cVar.N;
                    if (f10 != 0.0f) {
                        if (i35 != 2 || i35 == 1) {
                            str18 = "skewY";
                        } else {
                            str18 = "skewX";
                        }
                        Object[] objArr7 = {str18, Float.valueOf(f10)};
                        int i49 = e0.f13788a;
                        str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                    } else {
                        str15 = str10;
                    }
                    sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str8, str2, str24, str22, obj, str23, strB2, strA6, numValueOf2, numValueOf3, str15));
                    sb4.append("<span class='default_bg'>");
                    alignment2 = cVar.f21641i;
                    str16 = bVar.f3649d;
                    if (alignment2 != null) {
                        i22 = v.f10024a[alignment2.ordinal()];
                        if (i22 != 1) {
                            i26 = 2;
                            if (i22 != 2) {
                                str17 = "center";
                            } else {
                                str17 = str11;
                            }
                        } else {
                            i26 = 2;
                            str17 = ViewProps.START;
                        }
                        sb4.append("<span style='display:inline-block; text-align:" + str17 + ";'>");
                        sb4.append(str16);
                        sb4.append("</span>");
                    } else {
                        i26 = 2;
                        sb4.append(str16);
                    }
                    sb4.append("</span></div>");
                    i33 = i41 + 1;
                    f11 = f14;
                    str21 = str21;
                    str20 = str12;
                    i23 = 0;
                    i27 = 1;
                }
                str12 = str20;
                str11 = ViewProps.END;
                while (r3.hasNext()) {
                    str19 = (String) map2.put(str27, (String) map2.get(str27));
                    if (str19 != null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    je.b.k(z7);
                }
                Integer numValueOf4 = Integer.valueOf(i41);
                Float fValueOf3 = Float.valueOf(f13);
                Integer numValueOf5 = Integer.valueOf(i40);
                Integer numValueOf6 = Integer.valueOf(i37);
                f10 = cVar.N;
                if (f10 != 0.0f) {
                    if (i35 != 2) {
                        str18 = "skewY";
                    } else {
                        str18 = "skewY";
                    }
                    Object[] objArr8 = {str18, Float.valueOf(f10)};
                    int i410 = e0.f13788a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
                } else {
                    str15 = str10;
                }
                sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str8, str2, str24, str22, obj, str23, strB2, strA6, numValueOf5, numValueOf6, str15));
                sb4.append("<span class='default_bg'>");
                alignment2 = cVar.f21641i;
                str16 = bVar.f3649d;
                if (alignment2 != null) {
                    i22 = v.f10024a[alignment2.ordinal()];
                    if (i22 != 1) {
                        i26 = 2;
                        if (i22 != 2) {
                            str17 = "center";
                        } else {
                            str17 = str11;
                        }
                    } else {
                        i26 = 2;
                        str17 = ViewProps.START;
                    }
                    sb4.append("<span style='display:inline-block; text-align:" + str17 + ";'>");
                    sb4.append(str16);
                    sb4.append("</span>");
                } else {
                    i26 = 2;
                    sb4.append(str16);
                }
                sb4.append("</span></div>");
                i33 = i41 + 1;
                f11 = f14;
                str21 = str21;
                str20 = str12;
                i23 = 0;
                i27 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f10030x) * 100.0f));
            }
            str2 = str;
            i7 = 0;
            f2 = cVar.G;
            if (f2 != -3.4028235E38f) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f2 * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str28 = str3;
            alignment = cVar.f21640e;
            str4 = ViewProps.END;
            if (alignment == null) {
                i12 = i27;
                obj = "center";
                i11 = 2;
            } else {
                i10 = v.f10024a[alignment.ordinal()];
                if (i10 != i27) {
                    i11 = 2;
                    if (i10 != 2) {
                        obj = "center";
                    } else {
                        obj = ViewProps.END;
                    }
                } else {
                    i11 = 2;
                    obj = ViewProps.START;
                }
                i12 = 1;
            }
            if (i35 != i12) {
                str5 = "vertical-rl";
            } else if (i35 != i11) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str29 = str5;
            String strB3 = b(cVar.L, cVar.K);
            if (cVar.I) {
                i13 = cVar.J;
            } else {
                i13 = this.f10028v.f9975c;
            }
            String strA9 = ls.l.A(i13);
            str6 = ViewProps.TOP;
            if (i35 != 1) {
                if (i7 != 0) {
                    str7 = ViewProps.LEFT;
                } else {
                    str7 = ViewProps.RIGHT;
                }
                str8 = str7;
                obj2 = ViewProps.TOP;
            } else if (i35 != 2) {
                if (i7 != 0) {
                    str6 = ViewProps.BOTTOM;
                }
                str8 = str6;
                obj2 = ViewProps.LEFT;
            } else {
                if (i7 != 0) {
                    str7 = ViewProps.RIGHT;
                } else {
                    str7 = ViewProps.LEFT;
                }
                str8 = str7;
                obj2 = ViewProps.TOP;
            }
            if (i35 != 2) {
                str9 = "height";
                int i310 = i37;
                i37 = i38;
                i38 = i310;
            } else {
                str9 = "height";
                int i311 = i37;
                i37 = i38;
                i38 = i311;
            }
            String str210 = str9;
            charSequence = cVar.f21639d;
            f7 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = n.f9997a;
            int i411 = i38;
            int i412 = i33;
            if (charSequence == null) {
                bVar = new cg.b("", (byte) 0);
                str10 = "";
            } else {
                str10 = "";
                if (charSequence instanceof Spanned) {
                    bVar = new cg.b(n.a(charSequence), (byte) 0);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i14 = 0;
                    while (i14 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i14].getBackgroundColor()));
                        i14++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strH2 = kk.b.h(iIntValue2, "bg_");
                        Iterator it5 = it;
                        String strF2 = s0.g.f(".", strH2, ",.", strH2, " *");
                        String strA10 = ls.l.A(iIntValue2);
                        int i413 = e0.f13788a;
                        Locale locale8 = Locale.US;
                        map.put(strF2, str20 + strA10 + str21);
                        it = it5;
                        str4 = str4;
                    }
                    str11 = str4;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i15 = 0;
                    while (i15 < length2) {
                        obj3 = spans[i15];
                        String str211 = str21;
                        z5 = obj3 instanceof StrikethroughSpan;
                        String str212 = null;
                        if (z5) {
                            z6 = z5;
                            strE = "<span style='text-decoration:line-through;'>";
                        } else {
                            z6 = z5;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strA11 = ls.l.A(((ForegroundColorSpan) obj3).getForegroundColor());
                                int i414 = e0.f13788a;
                                Locale locale9 = Locale.US;
                                strE = s0.g.e("<span style='color:", strA11, ";'>");
                            } else {
                                str20 = str20;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    int i415 = e0.f13788a;
                                    Locale locale10 = Locale.US;
                                    objArr = spans;
                                    strE = s0.g.d(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    objArr = spans;
                                    if (obj3 instanceof zd.a) {
                                        strE = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f7;
                                        }
                                        Object[] objArr9 = {Float.valueOf(size)};
                                        int i416 = e0.f13788a;
                                        strE = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr9);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr10 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        int i417 = e0.f13788a;
                                        strE = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr10);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            int i418 = e0.f13788a;
                                            Locale locale11 = Locale.US;
                                            strE = s0.g.e("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strE = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strE = "<b>";
                                        } else if (style != 2) {
                                            strE = "<i>";
                                        } else if (style != 3) {
                                            strE = null;
                                        } else {
                                            strE = "<b><i>";
                                        }
                                    } else if (obj3 instanceof zd.c) {
                                        i21 = ((zd.c) obj3).f23909b;
                                        if (i21 != -1) {
                                            strE = "<ruby style='ruby-position:unset;'>";
                                        } else if (i21 != 1) {
                                            strE = "<ruby style='ruby-position:over;'>";
                                        } else if (i21 != 2) {
                                            strE = null;
                                        } else {
                                            strE = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strE = "<u>";
                                    } else if (obj3 instanceof zd.d) {
                                        dVar = (zd.d) obj3;
                                        i18 = dVar.f23910a;
                                        i19 = dVar.f23911b;
                                        sb3 = new StringBuilder();
                                        if (i19 != 1) {
                                            i20 = 2;
                                            if (i19 == 2) {
                                                sb3.append("open ");
                                            }
                                        } else {
                                            i20 = 2;
                                            sb3.append("filled ");
                                        }
                                        if (i18 != 0) {
                                            sb3.append(ViewProps.NONE);
                                        } else if (i18 != 1) {
                                            sb3.append("circle");
                                        } else if (i18 != i20) {
                                            sb3.append("dot");
                                        } else if (i18 != 3) {
                                            sb3.append("unset");
                                        } else {
                                            sb3.append("sesame");
                                        }
                                        String string2 = sb3.toString();
                                        if (dVar.f23912c != 2) {
                                            str13 = "over right";
                                        } else {
                                            str13 = "under left";
                                        }
                                        Object[] objArr11 = {string2, str13};
                                        int i419 = e0.f13788a;
                                        strE = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr11);
                                    } else {
                                        strE = null;
                                    }
                                }
                            }
                            if (z6) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strE != null) {
                                str14.getClass();
                                l lVar3 = new l(spanStart, spanEnd, strE, str14);
                                mVar = (m) sparseArray.get(spanStart);
                                if (mVar == null) {
                                    mVar = new m();
                                    sparseArray.put(spanStart, mVar);
                                }
                                mVar.f9995a.add(lVar3);
                                mVar2 = (m) sparseArray.get(spanEnd);
                                if (mVar2 == null) {
                                    mVar2 = new m();
                                    sparseArray.put(spanEnd, mVar2);
                                }
                                mVar2.f9996b.add(lVar3);
                            }
                            i15++;
                            str21 = str211;
                            str20 = str20;
                            spans = objArr;
                        }
                        objArr = spans;
                        if (z6) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strE != null) {
                            str14.getClass();
                            l lVar4 = new l(spanStart, spanEnd, strE, str14);
                            mVar = (m) sparseArray.get(spanStart);
                            if (mVar == null) {
                                mVar = new m();
                                sparseArray.put(spanStart, mVar);
                            }
                            mVar.f9995a.add(lVar4);
                            mVar2 = (m) sparseArray.get(spanEnd);
                            if (mVar2 == null) {
                                mVar2 = new m();
                                sparseArray.put(spanEnd, mVar2);
                            }
                            mVar2.f9996b.add(lVar4);
                        }
                        i15++;
                        str21 = str211;
                        str20 = str20;
                        spans = objArr;
                    }
                    str21 = str21;
                    str12 = str20;
                    sb2 = new StringBuilder(spanned.length());
                    i16 = 0;
                    i17 = 0;
                    while (i16 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i16);
                        sb2.append(n.a(spanned.subSequence(i17, iKeyAt2)));
                        m mVar4 = (m) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = mVar4.f9996b;
                        ArrayList arrayList4 = mVar4.f9995a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList3, l.f9990f);
                        it2 = mVar4.f9996b.iterator();
                        while (it2.hasNext()) {
                            sb2.append(((l) it2.next()).f9994d);
                        }
                        Collections.sort(arrayList4, l.f9989e);
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            sb2.append(((l) it3.next()).f9993c);
                        }
                        i16++;
                        i17 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb2.append(n.a(spanned.subSequence(i17, spanned.length())));
                    bVar = new cg.b(sb2.toString(), (byte) 0);
                }
                while (r3.hasNext()) {
                    str19 = (String) map2.put(str27, (String) map2.get(str27));
                    if (str19 != null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    je.b.k(z7);
                }
                Integer numValueOf7 = Integer.valueOf(i412);
                Float fValueOf4 = Float.valueOf(f13);
                Integer numValueOf8 = Integer.valueOf(i411);
                Integer numValueOf9 = Integer.valueOf(i37);
                f10 = cVar.N;
                if (f10 != 0.0f) {
                    if (i35 != 2) {
                        str18 = "skewY";
                    } else {
                        str18 = "skewY";
                    }
                    Object[] objArr12 = {str18, Float.valueOf(f10)};
                    int i4110 = e0.f13788a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str15 = str10;
                }
                sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str8, str2, str210, str28, obj, str29, strB3, strA9, numValueOf8, numValueOf9, str15));
                sb4.append("<span class='default_bg'>");
                alignment2 = cVar.f21641i;
                str16 = bVar.f3649d;
                if (alignment2 != null) {
                    i22 = v.f10024a[alignment2.ordinal()];
                    if (i22 != 1) {
                        i26 = 2;
                        if (i22 != 2) {
                            str17 = "center";
                        } else {
                            str17 = str11;
                        }
                    } else {
                        i26 = 2;
                        str17 = ViewProps.START;
                    }
                    sb4.append("<span style='display:inline-block; text-align:" + str17 + ";'>");
                    sb4.append(str16);
                    sb4.append("</span>");
                } else {
                    i26 = 2;
                    sb4.append(str16);
                }
                sb4.append("</span></div>");
                i33 = i412 + 1;
                f11 = f14;
                str21 = str21;
                str20 = str12;
                i23 = 0;
                i27 = 1;
            }
            str12 = str20;
            str11 = ViewProps.END;
            while (r3.hasNext()) {
                str19 = (String) map2.put(str27, (String) map2.get(str27));
                if (str19 != null) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                je.b.k(z7);
            }
            Integer numValueOf10 = Integer.valueOf(i412);
            Float fValueOf5 = Float.valueOf(f13);
            Integer numValueOf11 = Integer.valueOf(i411);
            Integer numValueOf12 = Integer.valueOf(i37);
            f10 = cVar.N;
            if (f10 != 0.0f) {
                if (i35 != 2) {
                    str18 = "skewY";
                } else {
                    str18 = "skewY";
                }
                Object[] objArr13 = {str18, Float.valueOf(f10)};
                int i4111 = e0.f13788a;
                str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr13);
            } else {
                str15 = str10;
            }
            sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str8, str2, str210, str28, obj, str29, strB3, strA9, numValueOf11, numValueOf12, str15));
            sb4.append("<span class='default_bg'>");
            alignment2 = cVar.f21641i;
            str16 = bVar.f3649d;
            if (alignment2 != null) {
                i22 = v.f10024a[alignment2.ordinal()];
                if (i22 != 1) {
                    i26 = 2;
                    if (i22 != 2) {
                        str17 = "center";
                    } else {
                        str17 = str11;
                    }
                } else {
                    i26 = 2;
                    str17 = ViewProps.START;
                }
                sb4.append("<span style='display:inline-block; text-align:" + str17 + ";'>");
                sb4.append(str16);
                sb4.append("</span>");
            } else {
                i26 = 2;
                sb4.append(str16);
            }
            sb4.append("</span></div>");
            i33 = i412 + 1;
            f11 = f14;
            str21 = str21;
            str20 = str12;
            i23 = 0;
            i27 = 1;
        }
        sb4.append("</div></body></html>");
        StringBuilder sb6 = new StringBuilder("<html><head><style>");
        for (String str30 : map2.keySet()) {
            sb6.append(str30);
            sb6.append("{");
            sb6.append((String) map2.get(str30));
            sb6.append("}");
        }
        sb6.append("</style></head>");
        sb4.insert(0, sb6.toString());
        this.f10026e.loadData(Base64.encodeToString(sb4.toString().getBytes(di.d.f7631c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        if (!z5 || this.f10027i.isEmpty()) {
            return;
        }
        c();
    }
}
