package com.facebook.react.uimanager;

import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import mb.c;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@ReactPropertyHolder
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
public class ReactShadowNodeImpl implements ReactShadowNode<ReactShadowNodeImpl> {
    private static final YogaConfig sYogaConfig;
    private ArrayList<ReactShadowNodeImpl> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    private ReactShadowNodeImpl mLayoutParent;
    private ArrayList<ReactShadowNodeImpl> mNativeChildren;
    private ReactShadowNodeImpl mNativeParent;
    private final float[] mPadding;
    private ReactShadowNodeImpl mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private ThemedReactContext mThemedContext;
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private YogaNode mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final Spacing mDefaultPadding = new Spacing(0.0f);

    static {
        long jJni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        mb.a aVar = new mb.a();
        aVar.f15480a = jJni_YGConfigNewJNI;
        if (jJni_YGConfigNewJNI == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        sYogaConfig = aVar;
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(jJni_YGConfigNewJNI, 0.0f);
        mb.b errata = mb.b.ALL;
        Intrinsics.checkNotNullParameter(errata, "errata");
        YogaNative.jni_YGConfigSetErrataJNI(aVar.f15480a, Integer.MAX_VALUE);
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactShadowNodeImpl", LegacyArchitectureLogLevel.ERROR);
    }

    public ReactShadowNodeImpl() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        if (isVirtual()) {
            this.mYogaNode = null;
            return;
        }
        YogaConfig config = sYogaConfig;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(config, "config");
        c cVar = new c(YogaNative.jni_YGNodeNewWithConfigJNI(((mb.a) config).f15480a));
        cVar.f5465e = config;
        this.mYogaNode = cVar;
        Arrays.fill(fArr, Float.NaN);
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            sb2.append("  ");
        }
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" view='");
        sb2.append(getViewClass());
        sb2.append("' tag=");
        sb2.append(getReactTag());
        if (this.mYogaNode != null) {
            sb2.append(" layout='x:");
            sb2.append(getScreenX());
            sb2.append(" y:");
            sb2.append(getScreenY());
            sb2.append(" w:");
            sb2.append(getLayoutWidth());
            sb2.append(" h:");
            sb2.append(getLayoutHeight());
            sb2.append("'");
        } else {
            sb2.append("(virtual node)");
        }
        sb2.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).getHierarchyInfoWithIndentation(sb2, i7 + 1);
        }
    }

    private int getTotalNativeNodeContributionToParent() {
        return 0;
    }

    private void updateNativeChildrenCountInParent(int i7) {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    private void updatePadding() {
        for (int i7 = 0; i7 <= 8; i7++) {
            if (i7 == 0 || i7 == 2 || i7 == 4 || i7 == 5) {
                if (yk.a.x(this.mPadding[i7]) && yk.a.x(this.mPadding[6]) && yk.a.x(this.mPadding[8])) {
                    this.mYogaNode.d0(kk.b.a(i7), this.mDefaultPadding.getRaw(i7));
                } else if (this.mPaddingIsPercent[i7]) {
                    this.mYogaNode.e0(kk.b.a(i7), this.mPadding[i7]);
                } else {
                    this.mYogaNode.d0(kk.b.a(i7), this.mPadding[i7]);
                }
            } else if (i7 == 1 || i7 == 3) {
                if (yk.a.x(this.mPadding[i7]) && yk.a.x(this.mPadding[7]) && yk.a.x(this.mPadding[8])) {
                    this.mYogaNode.d0(kk.b.a(i7), this.mDefaultPadding.getRaw(i7));
                } else if (this.mPaddingIsPercent[i7]) {
                    this.mYogaNode.e0(kk.b.a(i7), this.mPadding[i7]);
                } else {
                    this.mYogaNode.d0(kk.b.a(i7), this.mPadding[i7]);
                }
            } else if (yk.a.x(this.mPadding[i7])) {
                this.mYogaNode.d0(kk.b.a(i7), this.mDefaultPadding.getRaw(i7));
            } else if (this.mPaddingIsPercent[i7]) {
                this.mYogaNode.e0(kk.b.a(i7), this.mPadding[i7]);
            } else {
                this.mYogaNode.d0(kk.b.a(i7), this.mPadding[i7]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Iterable<? extends ReactShadowNode> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.c();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispatchUpdates(float f2, float f7, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue);
        }
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f10 = f2 + layoutX;
            int iRound = Math.round(f10);
            float f11 = f7 + layoutY;
            int iRound2 = Math.round(f11);
            int iRound3 = Math.round(getLayoutWidth() + f10);
            int iRound4 = Math.round(getLayoutHeight() + f11);
            int iRound5 = Math.round(layoutX);
            int iRound6 = Math.round(layoutY);
            this.mScreenX = iRound5;
            this.mScreenY = iRound6;
            this.mScreenWidth = iRound3 - iRound;
            this.mScreenHeight = iRound4 - iRound2;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean dispatchUpdatesWillChangeLayout(float f2, float f7) {
        if (!hasNewLayout()) {
            return false;
        }
        float layoutX = getLayoutX();
        float layoutY = getLayoutY();
        float f10 = f2 + layoutX;
        int iRound = Math.round(f10);
        float f11 = f7 + layoutY;
        int iRound2 = Math.round(f11);
        return (Math.round(layoutX) == this.mScreenX && Math.round(layoutY) == this.mScreenY && Math.round(getLayoutWidth() + f10) - iRound == this.mScreenWidth && Math.round(getLayoutHeight() + f11) - iRound2 == this.mScreenHeight) ? false : true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispose() {
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode.t();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public float getFlex() {
        return this.mYogaNode.d();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public String getHierarchyInfo() {
        StringBuilder sb2 = new StringBuilder();
        getHierarchyInfoWithIndentation(sb2, 0);
        return sb2.toString();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.f();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutHeight() {
        return this.mYogaNode.g();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutWidth() {
        return this.mYogaNode.j();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutX() {
        return this.mYogaNode.k();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutY() {
        return this.mYogaNode.l();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getPadding(int i7) {
        return this.mYogaNode.h(kk.b.a(i7));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getRootTag() {
        io.sentry.config.a.d(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleHeight() {
        return this.mYogaNode.e();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStylePadding(int i7) {
        return this.mYogaNode.m(kk.b.a(i7));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleWidth() {
        return this.mYogaNode.n();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ThemedReactContext getThemedContext() {
        ThemedReactContext themedReactContext = this.mThemedContext;
        io.sentry.config.a.f(themedReactContext);
        return themedReactContext;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final String getViewClass() {
        String str = this.mViewClassName;
        io.sentry.config.a.f(str);
        return str;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasNewLayout() {
        YogaNode yogaNode = this.mYogaNode;
        return yogaNode != null && yogaNode.o();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isDirty() {
        YogaNode yogaNode = this.mYogaNode;
        return yogaNode != null && yogaNode.p();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isMeasureDefined() {
        return this.mYogaNode.q();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markLayoutSeen() {
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode.r();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        ReactShadowNodeImpl parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void removeAllNativeChildren() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int totalNativeNodeContributionToParent = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.s(childCount);
            }
            ReactShadowNodeImpl childAt = getChildAt(childCount);
            childAt.mParent = null;
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
            childAt.dispose();
        }
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        io.sentry.config.a.f(arrayList);
        arrayList.clear();
        markUpdated();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignContent(YogaAlign yogaAlign) {
        this.mYogaNode.u(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignItems(YogaAlign yogaAlign) {
        this.mYogaNode.v(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignSelf(YogaAlign yogaAlign) {
        this.mYogaNode.w(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mYogaNode.z(yogaBaselineFunction);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBorder(int i7, float f2) {
        this.mYogaNode.A(kk.b.a(i7), f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGap(float f2) {
        this.mYogaNode.K(f2, 1);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGapPercent(float f2) {
        this.mYogaNode.L(f2, 1);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDefaultPadding(int i7, float f2) {
        this.mDefaultPadding.set(i7, f2);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDisplay(YogaDisplay yogaDisplay) {
        this.mYogaNode.C(yogaDisplay);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlex(float f2) {
        this.mYogaNode.D(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasis(float f2) {
        this.mYogaNode.E(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisAuto() {
        this.mYogaNode.F();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisPercent(float f2) {
        this.mYogaNode.G(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        this.mYogaNode.H(yogaFlexDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexGrow(float f2) {
        this.mYogaNode.I(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexShrink(float f2) {
        this.mYogaNode.J(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexWrap(YogaWrap yogaWrap) {
        this.mYogaNode.l0(yogaWrap);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGap(float f2) {
        this.mYogaNode.K(f2, 3);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGapPercent(float f2) {
        this.mYogaNode.K(f2, 3);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setIsLayoutOnly(boolean z5) {
        io.sentry.config.a.e(getParent() == null, "Must remove from no opt parent first");
        io.sentry.config.a.e(this.mNativeParent == null, "Must remove from native parent first");
        io.sentry.config.a.e(getNativeChildCount() == 0, "Must remove all native children first");
        this.mIsLayoutOnly = z5;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setJustifyContent(YogaJustify yogaJustify) {
        this.mYogaNode.P(yogaJustify);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLayoutDirection(YogaDirection yogaDirection) {
        this.mYogaNode.B(yogaDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMargin(int i7, float f2) {
        this.mYogaNode.Q(kk.b.a(i7), f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginAuto(int i7) {
        this.mYogaNode.R(kk.b.a(i7));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginPercent(int i7, float f2) {
        this.mYogaNode.S(kk.b.a(i7), f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mYogaNode.X(yogaMeasureFunction);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureSpecs(int i7, int i10) {
        this.mWidthMeasureSpec = Integer.valueOf(i7);
        this.mHeightMeasureSpec = Integer.valueOf(i10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setOverflow(YogaOverflow yogaOverflow) {
        this.mYogaNode.c0(yogaOverflow);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i7, float f2) {
        this.mPadding[i7] = f2;
        this.mPaddingIsPercent[i7] = false;
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    /* JADX INFO: renamed from: setPaddingPercent */
    public void mo979setPaddingPercent(int i7, float f2) {
        this.mPadding[i7] = f2;
        this.mPaddingIsPercent[i7] = !yk.a.x(f2);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPosition(int i7, float f2) {
        this.mYogaNode.f0(kk.b.a(i7), f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionPercent(int i7, float f2) {
        this.mYogaNode.g0(kk.b.a(i7), f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionType(YogaPositionType yogaPositionType) {
        this.mYogaNode.h0(yogaPositionType);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setReactTag(int i7) {
        this.mReactTag = i7;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setRootTag(int i7) {
        this.mRootTag = i7;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGap(float f2) {
        this.mYogaNode.K(f2, 2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGapPercent(float f2) {
        this.mYogaNode.L(f2, 2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setShouldNotifyOnLayout(boolean z5) {
        this.mShouldNotifyOnLayout = z5;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleAspectRatio(float f2) {
        this.mYogaNode.x(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeight(float f2) {
        this.mYogaNode.M(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightAuto() {
        this.mYogaNode.N();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightPercent(float f2) {
        this.mYogaNode.O(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeight(float f2) {
        this.mYogaNode.T(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeightPercent(float f2) {
        this.mYogaNode.U(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidth(float f2) {
        this.mYogaNode.V(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidthPercent(float f2) {
        this.mYogaNode.W(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeight(float f2) {
        this.mYogaNode.Y(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeightPercent(float f2) {
        this.mYogaNode.Z(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidth(float f2) {
        this.mYogaNode.a0(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidthPercent(float f2) {
        this.mYogaNode.b0(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidth(float f2) {
        this.mYogaNode.i0(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthAuto() {
        this.mYogaNode.j0();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthPercent(float f2) {
        this.mYogaNode.k0(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        this.mThemedContext = themedReactContext;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + " " + getReactTag() + "]";
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void updateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, reactStylesDiffMap);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i7) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i7, reactShadowNodeImpl);
        reactShadowNodeImpl.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            YogaNode yogaNode = reactShadowNodeImpl.mYogaNode;
            if (yogaNode == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + reactShadowNodeImpl.toString() + "' to a '" + toString() + "')");
            }
            this.mYogaNode.a(yogaNode, i7);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImpl.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i7) {
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i7, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout(float f2, float f7) {
        this.mYogaNode.b(f2, f7);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getChildAt(int i7) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i7);
        }
        throw new ArrayIndexOutOfBoundsException(g.d(i7, "Index ", " out of bounds: node has no children"));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getLayoutParent() {
        ReactShadowNodeImpl reactShadowNodeImpl = this.mLayoutParent;
        return reactShadowNodeImpl != null ? reactShadowNodeImpl : getNativeParent();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        int totalNativeNodeContributionToParent = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ReactShadowNodeImpl childAt = getChildAt(i7);
            if (reactShadowNodeImpl == childAt) {
                return totalNativeNodeContributionToParent;
            }
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
        }
        throw new RuntimeException("Child " + reactShadowNodeImpl.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        io.sentry.config.a.f(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public ReactShadowNodeImpl removeChildAt(int i7) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException(g.d(i7, "Index ", " out of bounds: node has no children"));
        }
        ReactShadowNodeImpl reactShadowNodeImplRemove = arrayList.remove(i7);
        reactShadowNodeImplRemove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.s(i7);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImplRemove.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
        return reactShadowNodeImplRemove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl removeNativeChildAt(int i7) {
        io.sentry.config.a.f(this.mNativeChildren);
        ReactShadowNodeImpl reactShadowNodeImplRemove = this.mNativeChildren.remove(i7);
        reactShadowNodeImplRemove.mNativeParent = null;
        return reactShadowNodeImplRemove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setLayoutParent(ReactShadowNodeImpl reactShadowNodeImpl) {
        this.mLayoutParent = reactShadowNodeImpl;
    }
}
