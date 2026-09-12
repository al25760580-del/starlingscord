package a1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.discord.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f15a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f2;
        int iD;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r5 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r5 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = w0.a.f21974a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i7, i7);
                int resourceId = ObtainAttributes.getResourceId(i7, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f15a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r5);
                    int i11 = typedValue.type;
                    if (i11 < 28 || i11 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i7, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i7, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i7, -65281);
                }
                if (ObtainAttributes.hasValue(r5)) {
                    f2 = ObtainAttributes.getFloat(r5, 1.0f);
                } else {
                    f2 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r5;
                float f7 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i12 = i7;
                int i13 = i12;
                while (i12 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i14 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i13] = attributeNameResource;
                        i13 = i14;
                    }
                    i12++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i13);
                float f10 = 100.0f;
                boolean z5 = (f7 < 0.0f || f7 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f2 != 1.0f || z5) {
                    int iF = yk.a.f((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                    if (z5) {
                        a aVarA = a.a(color);
                        float f11 = aVarA.f2a;
                        float f12 = aVarA.f3b;
                        o oVar = o.k;
                        if (f12 >= 1.0d && Math.round(f7) > 0.0d && Math.round(f7) < 100.0d) {
                            float fMin = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
                            float f13 = 0.0f;
                            float f14 = f12;
                            boolean z6 = r16 == true ? 1 : 0;
                            a aVar = null;
                            while (true) {
                                if (Math.abs(f13 - f12) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iD = aVar.c(oVar);
                                        break;
                                    }
                                    iD = b.d(f7);
                                    break;
                                }
                                float f15 = 1000.0f;
                                float f16 = f10;
                                float f17 = 0.0f;
                                float f18 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f17 - f16) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f10 = f10;
                                        break;
                                    }
                                    f10 = f10;
                                    float f19 = ((f16 - f17) / 2.0f) + f17;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC = a.b(f19, f14, fMin).c(o.k);
                                    float fE = b.e(Color.red(iC));
                                    float fE2 = b.e(Color.green(iC));
                                    float fE3 = b.e(Color.blue(iC));
                                    float[] fArr = b.f11d[r16 == true ? 1 : 0];
                                    float f20 = ((fE3 * fArr[2]) + ((fE2 * fArr[r16 == true ? 1 : 0]) + (fE * fArr[0]))) / f10;
                                    float fCbrt = f20 <= 0.008856452f ? f20 * 903.2963f : (((float) Math.cbrt(f20)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f7 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        a aVarB = a.b(aVarA2.f4c, aVarA2.f3b, fMin);
                                        float f21 = aVarA2.f5d - aVarB.f5d;
                                        float f22 = aVarA2.f6e - aVarB.f6e;
                                        float f23 = aVarA2.f7f - aVarB.f7f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f18 = fPow;
                                            f15 = fAbs;
                                            aVar2 = aVarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f15 == 0.0f && f18 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f7) {
                                        f17 = f19;
                                    } else {
                                        f16 = f19;
                                    }
                                    f10 = f10;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                a aVar3 = aVar2;
                                if (!z6) {
                                    if (aVar3 == null) {
                                        f12 = f14;
                                    } else {
                                        aVar = aVar3;
                                        f13 = f14;
                                    }
                                    f14 = ((f12 - f13) / 2.0f) + f13;
                                } else {
                                    if (aVar3 != null) {
                                        iD = aVar3.c(oVar);
                                        break;
                                    }
                                    f14 = ((f12 - f13) / 2.0f) + f13;
                                    z6 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iD = b.d(f7);
                        }
                        color = iD;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iF << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i15 = i10 + 1;
                if (i15 > iArr.length) {
                    int[] iArr4 = new int[i10 <= 4 ? 8 : i10 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i10);
                    iArr = iArr4;
                }
                iArr[i10] = color;
                if (i15 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10 > 4 ? i10 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i10);
                    objArr = objArr2;
                }
                objArr[i10] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i10 = i15;
                r5 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i7 = 0;
            } else {
                int i16 = depth2;
                r5 = r5 == true ? 1 : 0;
                depth2 = i16;
                i7 = 0;
            }
        }
        int[] iArr5 = new int[i10];
        int[][] iArr6 = new int[i10][];
        System.arraycopy(iArr, 0, iArr5, 0, i10);
        System.arraycopy(objArr, 0, iArr6, 0, i10);
        return new ColorStateList(iArr6, iArr5);
    }
}
