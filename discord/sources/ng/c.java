package ng;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import bh.p;
import com.discord.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16821b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f16825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f16826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f16827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16828i;
    public final int j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16829l;

    public c(Context context, b bVar) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        b bVar2 = bVar == null ? new b() : bVar;
        int i7 = bVar2.f16813d;
        if (i7 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i7);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i7));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayF = p.f(context, attributeSet, kg.a.f14432c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f16822c = typedArrayF.getDimensionPixelSize(5, -1);
        this.f16828i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f16823d = typedArrayF.getDimensionPixelSize(15, -1);
        this.f16824e = typedArrayF.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.f16826g = typedArrayF.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f16825f = typedArrayF.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f16827h = typedArrayF.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayF.getInt(25, 1);
        this.f16829l = typedArrayF.getInt(2, 0);
        b bVar3 = this.f16821b;
        int i10 = bVar2.F;
        bVar3.F = i10 == -2 ? 255 : i10;
        int i11 = bVar2.H;
        if (i11 != -2) {
            bVar3.H = i11;
        } else if (typedArrayF.hasValue(24)) {
            this.f16821b.H = typedArrayF.getInt(24, 0);
        } else {
            this.f16821b.H = -1;
        }
        String str = bVar2.G;
        if (str != null) {
            this.f16821b.G = str;
        } else if (typedArrayF.hasValue(8)) {
            this.f16821b.G = typedArrayF.getString(8);
        }
        b bVar4 = this.f16821b;
        bVar4.L = bVar2.L;
        CharSequence charSequence = bVar2.M;
        bVar4.M = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar5 = this.f16821b;
        int i12 = bVar2.N;
        bVar5.N = i12 == 0 ? R.plurals.mtrl_badge_content_description : i12;
        int i13 = bVar2.O;
        bVar5.O = i13 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i13;
        Boolean bool = bVar2.Q;
        bVar5.Q = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar6 = this.f16821b;
        int i14 = bVar2.I;
        bVar6.I = i14 == -2 ? typedArrayF.getInt(22, -2) : i14;
        b bVar7 = this.f16821b;
        int i15 = bVar2.J;
        bVar7.J = i15 == -2 ? typedArrayF.getInt(23, -2) : i15;
        b bVar8 = this.f16821b;
        Integer num = bVar2.f16817w;
        bVar8.f16817w = Integer.valueOf(num == null ? typedArrayF.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar9 = this.f16821b;
        Integer num2 = bVar2.f16818x;
        bVar9.f16818x = Integer.valueOf(num2 == null ? typedArrayF.getResourceId(7, 0) : num2.intValue());
        b bVar10 = this.f16821b;
        Integer num3 = bVar2.f16819y;
        bVar10.f16819y = Integer.valueOf(num3 == null ? typedArrayF.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar11 = this.f16821b;
        Integer num4 = bVar2.E;
        bVar11.E = Integer.valueOf(num4 == null ? typedArrayF.getResourceId(17, 0) : num4.intValue());
        b bVar12 = this.f16821b;
        Integer num5 = bVar2.f16814e;
        bVar12.f16814e = Integer.valueOf(num5 == null ? com.facebook.imagepipeline.nativecode.c.t(context, typedArrayF, 1).getDefaultColor() : num5.intValue());
        b bVar13 = this.f16821b;
        Integer num6 = bVar2.f16816v;
        bVar13.f16816v = Integer.valueOf(num6 == null ? typedArrayF.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar2.f16815i;
        if (num7 != null) {
            this.f16821b.f16815i = num7;
        } else if (typedArrayF.hasValue(10)) {
            this.f16821b.f16815i = Integer.valueOf(com.facebook.imagepipeline.nativecode.c.t(context, typedArrayF, 10).getDefaultColor());
        } else {
            int iIntValue = this.f16821b.f16816v.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, h.a.f10274x);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListT = com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 3);
            com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 4);
            com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i16 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i16, 0);
            typedArrayObtainStyledAttributes.getString(i16);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, kg.a.A);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            if (Build.VERSION.SDK_INT >= 26) {
                typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f16821b.f16815i = Integer.valueOf(colorStateListT.getDefaultColor());
        }
        b bVar14 = this.f16821b;
        Integer num8 = bVar2.P;
        bVar14.P = Integer.valueOf(num8 == null ? typedArrayF.getInt(3, 8388661) : num8.intValue());
        b bVar15 = this.f16821b;
        Integer num9 = bVar2.R;
        bVar15.R = Integer.valueOf(num9 == null ? typedArrayF.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar16 = this.f16821b;
        Integer num10 = bVar2.S;
        bVar16.S = Integer.valueOf(num10 == null ? typedArrayF.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar17 = this.f16821b;
        Integer num11 = bVar2.T;
        bVar17.T = Integer.valueOf(num11 == null ? typedArrayF.getDimensionPixelOffset(19, 0) : num11.intValue());
        b bVar18 = this.f16821b;
        Integer num12 = bVar2.U;
        bVar18.U = Integer.valueOf(num12 == null ? typedArrayF.getDimensionPixelOffset(26, 0) : num12.intValue());
        b bVar19 = this.f16821b;
        Integer num13 = bVar2.V;
        bVar19.V = Integer.valueOf(num13 == null ? typedArrayF.getDimensionPixelOffset(20, bVar19.T.intValue()) : num13.intValue());
        b bVar20 = this.f16821b;
        Integer num14 = bVar2.W;
        bVar20.W = Integer.valueOf(num14 == null ? typedArrayF.getDimensionPixelOffset(27, bVar20.U.intValue()) : num14.intValue());
        b bVar21 = this.f16821b;
        Integer num15 = bVar2.Z;
        bVar21.Z = Integer.valueOf(num15 == null ? typedArrayF.getDimensionPixelOffset(21, 0) : num15.intValue());
        b bVar22 = this.f16821b;
        Integer num16 = bVar2.X;
        bVar22.X = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar23 = this.f16821b;
        Integer num17 = bVar2.Y;
        bVar23.Y = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar24 = this.f16821b;
        Boolean bool2 = bVar2.a0;
        bVar24.a0 = Boolean.valueOf(bool2 == null ? typedArrayF.getBoolean(0, false) : bool2.booleanValue());
        typedArrayF.recycle();
        Locale locale = bVar2.K;
        if (locale == null) {
            this.f16821b.K = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f16821b.K = locale;
        }
        this.f16820a = bVar2;
    }

    public final boolean a() {
        return this.f16821b.G != null;
    }
}
