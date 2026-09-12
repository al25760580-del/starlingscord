package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends g {
    public boolean E;
    public j0 F;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7212x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7213y;

    public final ScreenStackHeaderConfig getConfig() {
        ViewParent parent = getParent();
        e eVar = parent instanceof e ? (e) parent : null;
        if (eVar != null) {
            return eVar.getConfig();
        }
        return null;
    }

    @NotNull
    public final j0 getType() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        if (z5) {
            int i13 = i11 - i7;
            int i14 = i12 - i10;
            if (this.E) {
                float dIPFromPixel = PixelUtil.toDIPFromPixel(i13);
                float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i14);
                float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i7);
                float dIPFromPixel4 = PixelUtil.toDIPFromPixel(i10);
                if (Math.abs(this.f7193e - dIPFromPixel) >= 0.9f || Math.abs(this.f7194i - dIPFromPixel2) >= 0.9f || Math.abs(this.f7195v - dIPFromPixel3) >= 0.9f || Math.abs(this.f7196w - dIPFromPixel4) >= 0.9f) {
                    this.f7193e = dIPFromPixel;
                    this.f7194i = dIPFromPixel2;
                    this.f7195v = dIPFromPixel3;
                    this.f7196w = dIPFromPixel4;
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("frameWidth", dIPFromPixel);
                    writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
                    writableNativeMap.putDouble("contentOffsetX", dIPFromPixel3);
                    writableNativeMap.putDouble("contentOffsetY", dIPFromPixel4);
                    StateWrapper stateWrapper = this.f7192d;
                    if (stateWrapper != null) {
                        stateWrapper.updateState(writableNativeMap);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getMode(i7) == 1073741824 && View.MeasureSpec.getMode(i10) == 1073741824) {
            this.f7212x = View.MeasureSpec.getSize(i7);
            this.f7213y = View.MeasureSpec.getSize(i10);
            this.E = true;
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f7212x, this.f7213y);
    }

    public final void setType(@NotNull j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
        this.F = j0Var;
    }
}
