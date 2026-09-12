package com.facebook.react.uimanager;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
public interface ReactShadowNode<T extends ReactShadowNode> {
    void addChildAt(T t5, int i7);

    void addNativeChildAt(T t5, int i7);

    void calculateLayout();

    void calculateLayout(float f2, float f7);

    Iterable<? extends ReactShadowNode> calculateLayoutOnChildren();

    void dirty();

    void dispatchUpdates(float f2, float f7, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer);

    boolean dispatchUpdatesWillChangeLayout(float f2, float f7);

    void dispose();

    T getChildAt(int i7);

    int getChildCount();

    float getFlex();

    Integer getHeightMeasureSpec();

    String getHierarchyInfo();

    YogaDirection getLayoutDirection();

    float getLayoutHeight();

    T getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    int getNativeOffsetForChild(T t5);

    T getNativeParent();

    float getPadding(int i7);

    T getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    YogaValue getStyleHeight();

    YogaValue getStylePadding(int i7);

    YogaValue getStyleWidth();

    ThemedReactContext getThemedContext();

    int getTotalNativeChildren();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasNewLayout();

    boolean hasUnseenUpdates();

    boolean hasUpdates();

    boolean hoistNativeChildren();

    int indexOf(T t5);

    int indexOfNativeChild(T t5);

    boolean isDescendantOf(T t5);

    boolean isDirty();

    boolean isLayoutOnly();

    boolean isMeasureDefined();

    boolean isVirtual();

    boolean isVirtualAnchor();

    boolean isYogaLeafNode();

    void markLayoutSeen();

    void markUpdateSeen();

    void markUpdated();

    void onAfterUpdateTransaction();

    void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer);

    void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    T removeChildAt(int i7);

    T removeNativeChildAt(int i7);

    void setAlignContent(YogaAlign yogaAlign);

    void setAlignItems(YogaAlign yogaAlign);

    void setAlignSelf(YogaAlign yogaAlign);

    void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction);

    void setBorder(int i7, float f2);

    void setColumnGap(float f2);

    void setColumnGapPercent(float f2);

    void setDefaultPadding(int i7, float f2);

    void setDisplay(YogaDisplay yogaDisplay);

    void setFlex(float f2);

    void setFlexBasis(float f2);

    void setFlexBasisAuto();

    void setFlexBasisPercent(float f2);

    void setFlexDirection(YogaFlexDirection yogaFlexDirection);

    void setFlexGrow(float f2);

    void setFlexShrink(float f2);

    void setFlexWrap(YogaWrap yogaWrap);

    void setGap(float f2);

    void setGapPercent(float f2);

    void setIsLayoutOnly(boolean z5);

    void setJustifyContent(YogaJustify yogaJustify);

    void setLayoutDirection(YogaDirection yogaDirection);

    void setLayoutParent(T t5);

    void setLocalData(Object obj);

    void setMargin(int i7, float f2);

    void setMarginAuto(int i7);

    void setMarginPercent(int i7, float f2);

    void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction);

    void setMeasureSpecs(int i7, int i10);

    void setOverflow(YogaOverflow yogaOverflow);

    void setPadding(int i7, float f2);

    /* JADX INFO: renamed from: setPaddingPercent */
    void mo979setPaddingPercent(int i7, float f2);

    void setPosition(int i7, float f2);

    void setPositionPercent(int i7, float f2);

    void setPositionType(YogaPositionType yogaPositionType);

    void setReactTag(int i7);

    void setRootTag(int i7);

    void setRowGap(float f2);

    void setRowGapPercent(float f2);

    void setShouldNotifyOnLayout(boolean z5);

    void setStyleAspectRatio(float f2);

    void setStyleHeight(float f2);

    void setStyleHeightAuto();

    void setStyleHeightPercent(float f2);

    void setStyleMaxHeight(float f2);

    void setStyleMaxHeightPercent(float f2);

    void setStyleMaxWidth(float f2);

    void setStyleMaxWidthPercent(float f2);

    void setStyleMinHeight(float f2);

    void setStyleMinHeightPercent(float f2);

    void setStyleMinWidth(float f2);

    void setStyleMinWidthPercent(float f2);

    void setStyleWidth(float f2);

    void setStyleWidthAuto();

    void setStyleWidthPercent(float f2);

    void setThemedContext(ThemedReactContext themedReactContext);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(ReactStylesDiffMap reactStylesDiffMap);
}
