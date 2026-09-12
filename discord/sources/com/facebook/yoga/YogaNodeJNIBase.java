package com.facebook.yoga;

import f0.e;
import java.util.ArrayList;
import kk.b;
import kotlin.jvm.internal.Intrinsics;
import nb.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public abstract class YogaNodeJNIBase extends YogaNode implements Cloneable {

    @a
    private float[] arr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public YogaNodeJNIBase f5464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public YogaConfig f5465e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f5466i;

    @a
    private int mLayoutDirection;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public YogaMeasureFunction f5467v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public YogaBaselineFunction f5468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f5469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5470y;

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f5470y = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f5469x = j;
    }

    public static YogaValue m0(long j) {
        YogaUnit yogaUnit;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        int i7 = (int) (j >> 32);
        switch (i7) {
            case 0:
                yogaUnit = YogaUnit.UNDEFINED;
                break;
            case 1:
                yogaUnit = YogaUnit.POINT;
                break;
            case 2:
                yogaUnit = YogaUnit.PERCENT;
                break;
            case 3:
                yogaUnit = YogaUnit.AUTO;
                break;
            case 4:
                yogaUnit = YogaUnit.MAX_CONTENT;
                break;
            case 5:
                yogaUnit = YogaUnit.FIT_CONTENT;
                break;
            case 6:
                yogaUnit = YogaUnit.STRETCH;
                break;
            default:
                throw new IllegalArgumentException(b.h(i7, "Unknown enum value: "));
        }
        Intrinsics.checkNotNullExpressionValue(yogaUnit, "fromInt(...)");
        return new YogaValue(fIntBitsToFloat, yogaUnit);
    }

    @a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i7) {
        ArrayList arrayList = this.f5466i;
        if (arrayList == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        arrayList.remove(i7);
        this.f5466i.add(i7, yogaNodeJNIBase);
        yogaNodeJNIBase.f5464d = this;
        return yogaNodeJNIBase.f5469x;
    }

    @Override // com.facebook.yoga.YogaNode
    public final void A(int i7, float f2) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void B(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f5469x, yogaDirection.f5435d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void C(YogaDisplay yogaDisplay) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f5469x, yogaDisplay.f5439d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void D(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void E(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void F() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f5469x);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void G(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void H(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f5469x, yogaFlexDirection.f5445d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void I(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void J(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void K(float f2, int i7) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void L(float f2, int i7) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void M(float f2) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void N() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f5469x);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void O(float f2) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void P(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f5469x, yogaJustify.f5452d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void Q(int i7, float f2) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void R(int i7) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f5469x, e.b(i7));
    }

    @Override // com.facebook.yoga.YogaNode
    public final void S(int i7, float f2) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void T(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void U(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void V(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void W(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void X(YogaMeasureFunction yogaMeasureFunction) {
        this.f5467v = yogaMeasureFunction;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f5469x, yogaMeasureFunction != null);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void Y(float f2) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void Z(float f2) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void a(YogaNode yogaNode, int i7) {
        if (yogaNode instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) yogaNode;
            if (yogaNodeJNIBase.f5464d != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f5466i == null) {
                this.f5466i = new ArrayList(4);
            }
            this.f5466i.add(i7, yogaNodeJNIBase);
            yogaNodeJNIBase.f5464d = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f5469x, yogaNodeJNIBase.f5469x, i7);
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public final void a0(float f2) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void b(float f2, float f7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ArrayList<YogaNodeJNIBase> arrayList2 = ((YogaNodeJNIBase) arrayList.get(i7)).f5466i;
            if (arrayList2 != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase : arrayList2) {
                    yogaNodeJNIBase.getClass();
                    arrayList.add(yogaNodeJNIBase);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i10 = 0; i10 < yogaNodeJNIBaseArr.length; i10++) {
            jArr[i10] = yogaNodeJNIBaseArr[i10].f5469x;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f5469x, f2, f7, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void b0(float f2) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f5469x, f2);
    }

    @a
    public final float baseline(float f2, float f7) {
        return this.f5468w.a();
    }

    @Override // com.facebook.yoga.YogaNode
    public final void c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f5469x);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void c0(YogaOverflow yogaOverflow) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f5469x, yogaOverflow.f5475d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final float d() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f5469x);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void d0(int i7, float f2) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final YogaValue e() {
        return m0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f5469x));
    }

    @Override // com.facebook.yoga.YogaNode
    public final void e0(int i7, float f2) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final YogaDirection f() {
        float[] fArr = this.arr;
        int i7 = fArr != null ? (int) fArr[5] : this.mLayoutDirection;
        YogaDirection.f5430e.getClass();
        if (i7 == 0) {
            return YogaDirection.INHERIT;
        }
        if (i7 == 1) {
            return YogaDirection.LTR;
        }
        if (i7 == 2) {
            return YogaDirection.RTL;
        }
        throw new IllegalArgumentException(b.h(i7, "Unknown enum value: "));
    }

    @Override // com.facebook.yoga.YogaNode
    public final void f0(int i7, float f2) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public final void g0(int i7, float f2) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f5469x, e.b(i7), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final float h(int i7) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i10 = (int) fArr[0];
        if ((i10 & 2) != 2) {
            return 0.0f;
        }
        int i11 = (i10 & 1) != 1 ? 4 : 0;
        int i12 = 10 - i11;
        int iB = e.b(i7);
        if (iB == 0) {
            return this.arr[i12];
        }
        if (iB == 1) {
            return this.arr[11 - i11];
        }
        if (iB == 2) {
            return this.arr[12 - i11];
        }
        if (iB == 3) {
            return this.arr[13 - i11];
        }
        if (iB == 4) {
            return f() == YogaDirection.RTL ? this.arr[12 - i11] : this.arr[i12];
        }
        if (iB == 5) {
            return f() == YogaDirection.RTL ? this.arr[i12] : this.arr[12 - i11];
        }
        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
    }

    @Override // com.facebook.yoga.YogaNode
    public final void h0(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f5469x, yogaPositionType.f5479d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void i0(float f2) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public final void j0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f5469x);
    }

    @Override // com.facebook.yoga.YogaNode
    public final float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public final void k0(float f2) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final float l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public final void l0(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f5469x, yogaWrap.f5495d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final YogaValue m(int i7) {
        return m0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f5469x, e.b(i7)));
    }

    @a
    public final long measure(float f2, int i7, float f7, int i10) {
        if (!q()) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        YogaMeasureFunction yogaMeasureFunction = this.f5467v;
        YogaMeasureMode.a(i7);
        YogaMeasureMode.a(i10);
        return yogaMeasureFunction.a();
    }

    @Override // com.facebook.yoga.YogaNode
    public final YogaValue n() {
        return m0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f5469x));
    }

    @Override // com.facebook.yoga.YogaNode
    public final boolean o() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.f5470y;
    }

    @Override // com.facebook.yoga.YogaNode
    public final boolean p() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f5469x);
    }

    @Override // com.facebook.yoga.YogaNode
    public final boolean q() {
        return this.f5467v != null;
    }

    @Override // com.facebook.yoga.YogaNode
    public final void r() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f5470y = false;
    }

    @Override // com.facebook.yoga.YogaNode
    public final YogaNodeJNIBase s(int i7) {
        ArrayList arrayList = this.f5466i;
        if (arrayList == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.remove(i7);
        yogaNodeJNIBase.f5464d = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f5469x, yogaNodeJNIBase.f5469x);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.YogaNode
    public final void t() {
        this.f5467v = null;
        this.f5468w = null;
        this.arr = null;
        this.f5470y = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f5469x);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void u(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f5469x, yogaAlign.f5429d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void v(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f5469x, yogaAlign.f5429d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void w(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f5469x, yogaAlign.f5429d);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void x(float f2) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f5469x, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public final void z(YogaBaselineFunction yogaBaselineFunction) {
        this.f5468w = yogaBaselineFunction;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f5469x, yogaBaselineFunction != null);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }
}
