package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Toolbar {
    public boolean A0;
    public final d B0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ScreenStackHeaderConfig f7179u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final boolean f7180v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f7181w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f7182x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Insets f7183y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f7184z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, ScreenStackHeaderConfig config) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f7179u0 = config;
        this.f7180v0 = true;
        this.f7181w0 = true;
        Insets NONE = Insets.f1555e;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f7183y0 = NONE;
        getMenu();
        this.B0 = new d(this, 0);
    }

    @NotNull
    public final ScreenStackHeaderConfig getConfig() {
        return this.f7179u0;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        Insets insetsF = mo.c0.F(this, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, windowInsetsOnApplyWindowInsets);
        Insets insetsF2 = mo.c0.F(this, 519, windowInsetsOnApplyWindowInsets);
        ScreenStackHeaderConfig screenStackHeaderConfig = this.f7179u0;
        Insets insetsB = Insets.b(screenStackHeaderConfig.getConsumeLeftInset() ? insetsF.f1556a + insetsF2.f1556a : 0, 0, screenStackHeaderConfig.getConsumeRightInset() ? insetsF.f1558c + insetsF2.f1558c : 0, 0);
        Intrinsics.checkNotNullExpressionValue(insetsB, "of(...)");
        Insets insetsB2 = Insets.b(0, Math.max(insetsF.f1557b, this.f7181w0 ? insetsF2.f1557b : 0), 0, screenStackHeaderConfig.getConsumeBottomInset() ? Math.max(insetsF.f1559d, 0) : 0);
        Intrinsics.checkNotNullExpressionValue(insetsB2, "of(...)");
        Insets insetsB3 = Insets.b(insetsB.f1556a + insetsB2.f1556a, insetsB.f1557b + insetsB2.f1557b, insetsB.f1558c + insetsB2.f1558c, insetsB.f1559d + insetsB2.f1559d);
        Intrinsics.checkNotNullExpressionValue(insetsB3, "add(...)");
        if (!Intrinsics.areEqual(this.f7183y0, insetsB3)) {
            this.f7183y0 = insetsB3;
            int i7 = insetsB3.f1556a;
            int i10 = insetsB3.f1557b;
            int i11 = insetsB3.f1558c;
            int i12 = insetsB3.f1559d;
            this.f7182x0 = true;
            this.f7184z0 = this.f7180v0;
            setPadding(i7, i10, i11, i12);
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        this.f7179u0.c(this, z5 || this.f7184z0);
        this.f7184z0 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        d dVar;
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        ViewParent parent = getParent();
        Integer numValueOf = null;
        a aVar = parent instanceof a ? (a) parent : null;
        if (aVar != null && this.f7182x0 && !aVar.isInLayout()) {
            int paddingTop = getPaddingTop();
            aVar.measure(View.MeasureSpec.makeMeasureSpec(aVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(aVar.getHeight() + paddingTop, 1073741824));
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom() + paddingTop);
            this.f7182x0 = false;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((ThemedReactContext) context).getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            numValueOf = Integer.valueOf(attributes.softInputMode);
        }
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.A0 || (dVar = this.B0) == null) {
            return;
        }
        this.A0 = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, dVar);
    }
}
