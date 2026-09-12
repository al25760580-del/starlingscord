package sg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import bd.u;
import bh.p;
import com.discord.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import cs.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import kh.a0;
import kh.m;
import kh.x;
import kh.y;
import kh.z;
import org.xmlpull.v1.XmlPullParserException;
import ue.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends LinearLayout {
    public int E;
    public a0 F;
    public boolean G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f19946e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pf.b f19947i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u f19948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer[] f19949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public x f19950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y f19951y;

    public c(Context context, AttributeSet attributeSet) {
        x xVarB;
        int next;
        a0 a0Var;
        int next2;
        super(oh.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f19945d = new ArrayList();
        this.f19946e = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f19947i = new pf.b(4, materialButtonToggleGroup);
        this.f19948v = new u(4, materialButtonToggleGroup);
        this.G = true;
        Context context2 = getContext();
        TypedArray typedArrayF = p.f(context2, attributeSet, kg.a.f14444q, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayF.hasValue(2)) {
            int resourceId = typedArrayF.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        a0Var = new a0();
                        a0Var.f14457c = new int[10][];
                        a0Var.f14458d = new i[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            a0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                    } catch (Throwable th2) {
                        if (xml == null) {
                            throw th2;
                        }
                        try {
                            xml.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    a0Var = null;
                }
            } else {
                a0Var = null;
            }
            this.F = a0Var;
        }
        if (typedArrayF.hasValue(4)) {
            y yVarB = y.b(context2, typedArrayF, 4);
            this.f19951y = yVarB;
            if (yVarB == null) {
                r rVar = new r(m.a(context2, typedArrayF.getResourceId(4, 0), typedArrayF.getResourceId(5, 0)).a());
                this.f19951y = rVar.f7466b != 0 ? new y(rVar) : null;
            }
        }
        if (typedArrayF.hasValue(3)) {
            kh.a aVar = new kh.a(0.0f);
            int resourceId2 = typedArrayF.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        xVarB = new x();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            xVarB.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } catch (Throwable th4) {
                        if (xml2 == null) {
                            throw th4;
                        }
                        try {
                            xml2.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    xVarB = x.b(aVar);
                }
            } else {
                xVarB = x.b(m.d(typedArrayF, 3, aVar));
            }
            this.f19950x = xVarB;
        }
        this.E = typedArrayF.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayF.getBoolean(0, true));
        typedArrayF.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (c(i7)) {
                return i7;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i7 = firstVisibleChildIndex + 1; i7 < getChildCount(); i7++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i7);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i7 - 1);
            if (this.E <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.E - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.E - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.G = true;
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f19947i);
        this.f19945d.add(materialButton.getShapeAppearanceModel());
        this.f19946e.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.F == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i7 = firstVisibleChildIndex; i7 <= lastVisibleChildIndex; i7++) {
            if (c(i7)) {
                int iMin2 = 0;
                if (c(i7) && this.F != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i7);
                    a0 a0Var = this.F;
                    int width = materialButton3.getWidth();
                    int i10 = -width;
                    for (int i11 = 0; i11 < a0Var.f14455a; i11++) {
                        z zVar = (z) a0Var.f14458d[i11].f21117d;
                        int i12 = zVar.f14548a;
                        float f2 = zVar.f14549b;
                        if (i12 == 2) {
                            fMax = Math.max(i10, f2);
                        } else {
                            if (i12 == 1) {
                                fMax = Math.max(i10, width * f2);
                            }
                        }
                        i10 = (int) fMax;
                    }
                    int iMax = Math.max(0, i10);
                    int i13 = i7 - 1;
                    while (true) {
                        materialButton = null;
                        if (i13 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i13)) {
                                materialButton2 = (MaterialButton) getChildAt(i13);
                                break;
                            }
                            i13--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    for (int i14 = i7 + 1; i14 < childCount; i14++) {
                        if (c(i14)) {
                            materialButton = (MaterialButton) getChildAt(i14);
                            break;
                        }
                    }
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i7 != firstVisibleChildIndex && i7 != lastVisibleChildIndex) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
        }
        int i15 = firstVisibleChildIndex;
        while (i15 <= lastVisibleChildIndex) {
            if (c(i15)) {
                ((MaterialButton) getChildAt(i15)).setSizeChange(this.F);
                ((MaterialButton) getChildAt(i15)).setWidthChangeMax((i15 == firstVisibleChildIndex || i15 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i15++;
        }
    }

    public final boolean c(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    public final void d() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = materialButton.S;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.S = null;
                materialButton.P = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f19948v);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            treeMap.put((MaterialButton) getChildAt(i7), Integer.valueOf(i7));
        }
        this.f19949w = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Serializable, kh.m[]] */
    public final void e() {
        r rVar;
        int i7;
        if (!(this.f19950x == null && this.f19951y == null) && this.G) {
            this.G = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = 0;
            while (i10 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                if (materialButton.getVisibility() != 8) {
                    boolean z5 = i10 == firstVisibleChildIndex;
                    boolean z6 = i10 == lastVisibleChildIndex;
                    y yVar = this.f19951y;
                    if (yVar == null || (!z5 && !z6)) {
                        yVar = (y) this.f19946e.get(i10);
                    }
                    if (yVar == null) {
                        rVar = new r((m) this.f19945d.get(i10));
                    } else {
                        r rVar2 = new r(1);
                        int i11 = yVar.f14540a;
                        rVar2.f7466b = i11;
                        rVar2.f7467c = yVar.f14541b;
                        int[][] iArr = yVar.f14542c;
                        ?? r14 = new int[iArr.length][];
                        rVar2.f7468d = r14;
                        m[] mVarArr = yVar.f14543d;
                        rVar2.f7469e = new m[mVarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i11);
                        System.arraycopy(mVarArr, 0, (m[]) rVar2.f7469e, 0, rVar2.f7466b);
                        rVar2.f7470f = yVar.f14544e;
                        rVar2.f7471g = yVar.f14545f;
                        rVar2.f7472h = yVar.f14546g;
                        rVar2.f7473i = yVar.f14547h;
                        rVar = rVar2;
                    }
                    boolean z7 = getOrientation() == 0;
                    boolean z10 = getLayoutDirection() == 1;
                    if (z7) {
                        i7 = z5 ? 5 : 0;
                        if (z6) {
                            i7 |= 10;
                        }
                        if (z10) {
                            i7 = ((i7 & 10) >> 1) | ((i7 & 5) << 1);
                        }
                    } else {
                        i7 = z5 ? 3 : 0;
                        if (z6) {
                            i7 |= 12;
                        }
                    }
                    int i12 = ~i7;
                    x xVar = this.f19950x;
                    if ((i12 | 1) == i12) {
                        rVar.f7470f = xVar;
                    }
                    if ((i12 | 2) == i12) {
                        rVar.f7471g = xVar;
                    }
                    if ((i12 | 4) == i12) {
                        rVar.f7472h = xVar;
                    }
                    if ((i12 | 8) == i12) {
                        rVar.f7473i = xVar;
                    }
                    y yVar2 = rVar.f7466b == 0 ? null : new y(rVar);
                    if (yVar2.d()) {
                        materialButton.setStateListShapeAppearanceModel(yVar2);
                    } else {
                        materialButton.setShapeAppearanceModel(yVar2.c());
                    }
                }
                i10++;
            }
        }
    }

    public a0 getButtonSizeChange() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i10) {
        Integer[] numArr = this.f19949w;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i10;
    }

    @NonNull
    public kh.d getInnerCornerSize() {
        return this.f19950x.f14537b;
    }

    @NonNull
    public x getInnerCornerSizeStateList() {
        return this.f19950x;
    }

    public m getShapeAppearance() {
        y yVar = this.f19951y;
        if (yVar == null) {
            return null;
        }
        return yVar.c();
    }

    public int getSpacing() {
        return this.E;
    }

    public y getStateListShapeAppearance() {
        return this.f19951y;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        if (z5) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        e();
        a();
        super.onMeasure(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f19945d.remove(iIndexOfChild);
            this.f19946e.remove(iIndexOfChild);
        }
        this.G = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(@NonNull a0 a0Var) {
        if (this.F != a0Var) {
            this.F = a0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((MaterialButton) getChildAt(i7)).setEnabled(z5);
        }
    }

    public void setInnerCornerSize(@NonNull kh.d dVar) {
        this.f19950x = x.b(dVar);
        this.G = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(@NonNull x xVar) {
        this.f19950x = xVar;
        this.G = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        if (getOrientation() != i7) {
            this.G = true;
        }
        super.setOrientation(i7);
    }

    public void setShapeAppearance(m mVar) {
        r rVar = new r(mVar);
        this.f19951y = rVar.f7466b == 0 ? null : new y(rVar);
        this.G = true;
        e();
        invalidate();
    }

    public void setSpacing(int i7) {
        this.E = i7;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(y yVar) {
        this.f19951y = yVar;
        this.G = true;
        e();
        invalidate();
    }
}
