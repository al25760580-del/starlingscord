package n3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g {
    public static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;
    public final Matrix E;
    public final Rect F;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f16354e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f16355i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorFilter f16356v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f16359y;

    public p() {
        this.f16358x = true;
        this.f16359y = new float[9];
        this.E = new Matrix();
        this.F = new Rect();
        n nVar = new n();
        nVar.f16345c = null;
        nVar.f16346d = G;
        nVar.f16344b = new m();
        this.f16354e = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f16307d;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.F;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f16356v;
        if (colorFilter == null) {
            colorFilter = this.f16355i;
        }
        Matrix matrix = this.E;
        canvas.getMatrix(matrix);
        float[] fArr = this.f16359y;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(RecyclerView.ItemAnimator.FLAG_MOVED, iWidth);
        int iMin2 = Math.min(RecyclerView.ItemAnimator.FLAG_MOVED, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f16354e;
        Bitmap bitmap = nVar.f16348f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f16348f.getHeight()) {
            nVar.f16348f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.k = true;
        }
        if (this.f16358x) {
            n nVar2 = this.f16354e;
            if (nVar2.k || nVar2.f16349g != nVar2.f16345c || nVar2.f16350h != nVar2.f16346d || nVar2.j != nVar2.f16347e || nVar2.f16351i != nVar2.f16344b.getRootAlpha()) {
                n nVar3 = this.f16354e;
                nVar3.f16348f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f16348f);
                m mVar = nVar3.f16344b;
                mVar.a(mVar.f16336g, m.f16329p, canvas2, iMin, iMin2);
                n nVar4 = this.f16354e;
                nVar4.f16349g = nVar4.f16345c;
                nVar4.f16350h = nVar4.f16346d;
                nVar4.f16351i = nVar4.f16344b.getRootAlpha();
                nVar4.j = nVar4.f16347e;
                nVar4.k = false;
            }
        } else {
            n nVar5 = this.f16354e;
            nVar5.f16348f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f16348f);
            m mVar2 = nVar5.f16344b;
            mVar2.a(mVar2.f16336g, m.f16329p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f16354e;
        if (nVar6.f16344b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f16352l == null) {
                Paint paint2 = new Paint();
                nVar6.f16352l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f16352l.setAlpha(nVar6.f16344b.getRootAlpha());
            nVar6.f16352l.setColorFilter(colorFilter);
            paint = nVar6.f16352l;
        }
        canvas.drawBitmap(nVar6.f16348f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getAlpha() : this.f16354e.f16344b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f16354e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getColorFilter() : this.f16356v;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f16307d != null) {
            return new o(this.f16307d.getConstantState());
        }
        this.f16354e.f16343a = getChangingConfigurations();
        return this.f16354e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f16354e.f16344b.f16338i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f16354e.f16344b.f16337h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.isAutoMirrored() : this.f16354e.f16347e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f16354e;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f16344b;
        if (mVar.f16341n == null) {
            mVar.f16341n = Boolean.valueOf(mVar.f16336g.a());
        }
        if (mVar.f16341n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f16354e.f16345c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f16357w && super.mutate() == this) {
            n nVar = this.f16354e;
            n nVar2 = new n();
            nVar2.f16345c = null;
            nVar2.f16346d = G;
            if (nVar != null) {
                nVar2.f16343a = nVar.f16343a;
                m mVar = new m(nVar.f16344b);
                nVar2.f16344b = mVar;
                if (nVar.f16344b.f16334e != null) {
                    mVar.f16334e = new Paint(nVar.f16344b.f16334e);
                }
                if (nVar.f16344b.f16333d != null) {
                    nVar2.f16344b.f16333d = new Paint(nVar.f16344b.f16333d);
                }
                nVar2.f16345c = nVar.f16345c;
                nVar2.f16346d = nVar.f16346d;
                nVar2.f16347e = nVar.f16347e;
            }
            this.f16354e = nVar2;
            this.f16357w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f16354e;
        ColorStateList colorStateList = nVar.f16345c;
        if (colorStateList == null || (mode = nVar.f16346d) == null) {
            z5 = false;
        } else {
            this.f16355i = a(colorStateList, mode);
            invalidateSelf();
            z5 = true;
        }
        m mVar = nVar.f16344b;
        if (mVar.f16341n == null) {
            mVar.f16341n = Boolean.valueOf(mVar.f16336g.a());
        }
        if (mVar.f16341n.booleanValue()) {
            boolean zB = nVar.f16344b.f16336g.b(iArr);
            nVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f16354e.f16344b.getRootAlpha() != i7) {
            this.f16354e.f16344b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setAutoMirrored(z5);
        } else {
            this.f16354e.f16347e = z5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f16356v = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            xr.m.Q(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f16354e;
        if (nVar.f16345c != colorStateList) {
            nVar.f16345c = colorStateList;
            this.f16355i = a(colorStateList, nVar.f16346d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f16354e;
        if (nVar.f16346d != mode) {
            nVar.f16346d = mode;
            this.f16355i = a(nVar.f16345c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.setVisible(z5, z6) : super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i7;
        char c8;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f16354e;
        nVar.f16344b = new m();
        TypedArray typedArrayF = a1.b.f(resources, theme, attributeSet, a.f16290a);
        n nVar2 = this.f16354e;
        m mVar = nVar2.f16344b;
        int i11 = !a1.b.c(xmlPullParser, "tintMode") ? -1 : typedArrayF.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f16346d = mode;
        ColorStateList colorStateListA = null;
        int i12 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayF.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 >= 28 && i13 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayF.getResources();
                int resourceId = typedArrayF.getResourceId(1, 0);
                ThreadLocal threadLocal = a1.c.f15a;
                try {
                    colorStateListA = a1.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            nVar2.f16345c = colorStateList;
        }
        boolean z5 = nVar2.f16347e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z5 = typedArrayF.getBoolean(5, z5);
        }
        nVar2.f16347e = z5;
        float f2 = mVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f2 = typedArrayF.getFloat(7, f2);
        }
        mVar.j = f2;
        float f7 = mVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f7 = typedArrayF.getFloat(8, f7);
        }
        mVar.k = f7;
        if (mVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f7 > 0.0f) {
            mVar.f16337h = typedArrayF.getDimension(3, mVar.f16337h);
            float dimension = typedArrayF.getDimension(2, mVar.f16338i);
            mVar.f16338i = dimension;
            if (mVar.f16337h <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayF.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = typedArrayF.getString(0);
                if (string != null) {
                    mVar.f16340m = string;
                    mVar.f16342o.put(string, mVar);
                }
                typedArrayF.recycle();
                nVar.f16343a = getChangingConfigurations();
                nVar.k = true;
                n nVar3 = this.f16354e;
                m mVar2 = nVar3.f16344b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f16336g;
                s.e eVar = mVar2.f16342o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        if (jVar2 != null) {
                            ArrayList arrayList = jVar2.f16318b;
                            i7 = depth;
                            if ("path".equals(name)) {
                                i iVar = new i();
                                iVar.f16309e = 0.0f;
                                iVar.f16311g = 1.0f;
                                iVar.f16312h = 1.0f;
                                iVar.f16313i = 0.0f;
                                iVar.j = 1.0f;
                                iVar.k = 0.0f;
                                Paint.Cap cap2 = Paint.Cap.BUTT;
                                iVar.f16314l = cap2;
                                Paint.Join join2 = Paint.Join.MITER;
                                iVar.f16315m = join2;
                                iVar.f16316n = 4.0f;
                                TypedArray typedArrayF2 = a1.b.f(resources, theme, attributeSet, a.f16292c);
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    String string2 = typedArrayF2.getString(0);
                                    if (string2 != null) {
                                        iVar.f16327b = string2;
                                    }
                                    String string3 = typedArrayF2.getString(2);
                                    if (string3 != null) {
                                        iVar.f16326a = e4.f.v(string3);
                                    }
                                    iVar.f16310f = a1.b.b(typedArrayF2, xmlPullParser, theme, "fillColor", 1);
                                    float f10 = iVar.f16312h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                        f10 = typedArrayF2.getFloat(12, f10);
                                    }
                                    iVar.f16312h = f10;
                                    int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayF2.getInt(8, -1) : -1;
                                    Paint.Cap cap3 = iVar.f16314l;
                                    if (i14 == 0) {
                                        cap = cap2;
                                    } else if (i14 != 1) {
                                        cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                    iVar.f16314l = cap;
                                    int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayF2.getInt(9, -1) : -1;
                                    Paint.Join join3 = iVar.f16315m;
                                    if (i15 == 0) {
                                        join = join2;
                                    } else if (i15 != 1) {
                                        join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                    iVar.f16315m = join;
                                    float f11 = iVar.f16316n;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                        f11 = typedArrayF2.getFloat(10, f11);
                                    }
                                    iVar.f16316n = f11;
                                    iVar.f16308d = a1.b.b(typedArrayF2, xmlPullParser, theme, "strokeColor", 3);
                                    float f12 = iVar.f16311g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                        f12 = typedArrayF2.getFloat(11, f12);
                                    }
                                    iVar.f16311g = f12;
                                    float f13 = iVar.f16309e;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                        f13 = typedArrayF2.getFloat(4, f13);
                                    }
                                    iVar.f16309e = f13;
                                    float f14 = iVar.j;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                        f14 = typedArrayF2.getFloat(6, f14);
                                    }
                                    iVar.j = f14;
                                    float f15 = iVar.k;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                        f15 = typedArrayF2.getFloat(7, f15);
                                    }
                                    iVar.k = f15;
                                    float f16 = iVar.f16313i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                        f16 = typedArrayF2.getFloat(5, f16);
                                    }
                                    iVar.f16313i = f16;
                                    int i16 = iVar.f16328c;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                        i16 = typedArrayF2.getInt(13, i16);
                                    }
                                    iVar.f16328c = i16;
                                }
                                typedArrayF2.recycle();
                                arrayList.add(iVar);
                                if (iVar.getPathName() != null) {
                                    eVar.put(iVar.getPathName(), iVar);
                                }
                                nVar3.f16343a = nVar3.f16343a;
                                z6 = false;
                            } else {
                                c8 = '\b';
                                if ("clip-path".equals(name)) {
                                    h hVar = new h();
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        TypedArray typedArrayF3 = a1.b.f(resources, theme, attributeSet, a.f16293d);
                                        String string4 = typedArrayF3.getString(0);
                                        if (string4 != null) {
                                            hVar.f16327b = string4;
                                        }
                                        String string5 = typedArrayF3.getString(1);
                                        if (string5 != null) {
                                            hVar.f16326a = e4.f.v(string5);
                                        }
                                        hVar.f16328c = !a1.b.c(xmlPullParser, "fillType") ? 0 : typedArrayF3.getInt(2, 0);
                                        typedArrayF3.recycle();
                                    }
                                    arrayList.add(hVar);
                                    if (hVar.getPathName() != null) {
                                        eVar.put(hVar.getPathName(), hVar);
                                    }
                                    nVar3.f16343a = nVar3.f16343a;
                                } else if ("group".equals(name)) {
                                    j jVar3 = new j();
                                    TypedArray typedArrayF4 = a1.b.f(resources, theme, attributeSet, a.f16291b);
                                    float f17 = jVar3.f16319c;
                                    if (a1.b.c(xmlPullParser, ViewProps.ROTATION)) {
                                        f17 = typedArrayF4.getFloat(5, f17);
                                    }
                                    jVar3.f16319c = f17;
                                    jVar3.f16320d = typedArrayF4.getFloat(1, jVar3.f16320d);
                                    jVar3.f16321e = typedArrayF4.getFloat(2, jVar3.f16321e);
                                    float f18 = jVar3.f16322f;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.SCALE_X) != null) {
                                        f18 = typedArrayF4.getFloat(3, f18);
                                    }
                                    jVar3.f16322f = f18;
                                    float f19 = jVar3.f16323g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.SCALE_Y) != null) {
                                        f19 = typedArrayF4.getFloat(4, f19);
                                    }
                                    jVar3.f16323g = f19;
                                    float f20 = jVar3.f16324h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.TRANSLATE_X) != null) {
                                        f20 = typedArrayF4.getFloat(6, f20);
                                    }
                                    jVar3.f16324h = f20;
                                    float f21 = jVar3.f16325i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.TRANSLATE_Y) != null) {
                                        f21 = typedArrayF4.getFloat(7, f21);
                                    }
                                    jVar3.f16325i = f21;
                                    String string6 = typedArrayF4.getString(0);
                                    if (string6 != null) {
                                        jVar3.k = string6;
                                    }
                                    jVar3.c();
                                    typedArrayF4.recycle();
                                    arrayList.add(jVar3);
                                    arrayDeque.push(jVar3);
                                    if (jVar3.getGroupName() != null) {
                                        eVar.put(jVar3.getGroupName(), jVar3);
                                    }
                                    nVar3.f16343a = nVar3.f16343a;
                                }
                            }
                            i10 = 1;
                        } else {
                            i7 = depth;
                        }
                        c8 = '\b';
                        i10 = 1;
                    } else {
                        i7 = depth;
                        c8 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    depth = i7;
                }
                if (!z6) {
                    this.f16355i = a(nVar.f16345c, nVar.f16346d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f16358x = true;
        this.f16359y = new float[9];
        this.E = new Matrix();
        this.F = new Rect();
        this.f16354e = nVar;
        this.f16355i = a(nVar.f16345c, nVar.f16346d);
    }
}
