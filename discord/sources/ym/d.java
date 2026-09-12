package ym;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f2;
import androidx.core.view.r1;
import androidx.core.view.t;
import androidx.core.view.t1;
import androidx.core.view.u1;
import androidx.core.view.v1;
import androidx.core.view.w1;
import androidx.core.view.x1;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ReactViewGroup implements t, ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f23405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f23406e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f23407i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public StateWrapper f23409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public zm.a f23410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f23411y;

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View view, WindowInsetsCompat insets) {
        x1 t1Var;
        boolean z5;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        f2 f2Var = insets.f1605a;
        Insets insets2 = f2Var.f(647);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        if (!Intrinsics.areEqual(insets2, this.f23407i)) {
            Intrinsics.checkNotNullParameter(insets2, "insets");
            this.f23407i = new a(insets2.f1556a, insets2.f1557b, insets2.f1558c, insets2.f1559d);
            b bVar = this.f23411y;
            bVar.getClass();
            if (bVar == b.f23401d || bVar == b.f23402e) {
                this.f23408v = true;
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            t1Var = new w1(insets);
        } else if (i7 >= 31) {
            t1Var = new v1(insets);
        } else if (i7 >= 30) {
            t1Var = new u1(insets);
        } else {
            t1Var = i7 >= 29 ? new t1(insets) : new r1(insets);
        }
        b bVar2 = this.f23411y;
        bVar2.getClass();
        if (bVar2 == b.f23401d || bVar2 == b.f23402e) {
            Insets insetsF = f2Var.f(519);
            Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
            Insets insetsC = c(insetsF);
            Insets insetsF2 = f2Var.f(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            Intrinsics.checkNotNullExpressionValue(insetsF2, "getInsets(...)");
            Insets insetsC2 = c(insetsF2);
            boolean zAreEqual = Intrinsics.areEqual(insetsC2, Insets.f1555e);
            t1Var.c(519, insetsC);
            t1Var.c(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, insetsC2);
            z5 = zAreEqual;
        } else {
            z5 = false;
        }
        WindowInsetsCompat windowInsetsCompatB = t1Var.b();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatB, "build(...)");
        if (i7 >= 30 || !z5) {
            return windowInsetsCompatB;
        }
        WindowInsetsCompat windowInsetsCompatA = windowInsetsCompatB.f1605a.a();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatA, "consumeDisplayCutout(...)");
        return windowInsetsCompatA;
    }

    public final Insets c(Insets insets) {
        zm.a aVar = this.f23410x;
        Insets insetsB = Insets.b(aVar != null ? aVar.f24050a : false ? 0 : insets.f1556a, aVar != null ? aVar.f24051b : false ? 0 : insets.f1557b, aVar != null ? aVar.f24052c : false ? 0 : insets.f1558c, aVar != null ? aVar.f24053d : false ? 0 : insets.f1559d);
        Intrinsics.checkNotNullExpressionValue(insetsB, "of(...)");
        return insetsB;
    }

    public final void d() {
        b bVar = this.f23411y;
        bVar.getClass();
        b bVar2 = b.f23401d;
        a i7 = a.f23396e;
        a i10 = (bVar == bVar2 || bVar == b.f23403i) ? this.f23406e : i7;
        b bVar3 = this.f23411y;
        bVar3.getClass();
        if (bVar3 == bVar2 || bVar3 == b.f23402e) {
            i7 = this.f23407i;
        }
        Intrinsics.checkNotNullParameter(i10, "i1");
        Intrinsics.checkNotNullParameter(i7, "i2");
        float fMax = Math.max(i10.f23397a, i7.f23397a);
        float fMax2 = Math.max(i10.f23398b, i7.f23398b);
        float fMax3 = Math.max(i10.f23399c, i7.f23399c);
        float fMax4 = Math.max(i10.f23400d, i7.f23400d);
        StateWrapper stateWrapper = getStateWrapper();
        if (stateWrapper != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(fMax));
            writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(fMax2));
            writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(fMax3));
            writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(fMax4));
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putMap("insets", writableMapCreateMap);
            stateWrapper.updateState(writableMapCreateMap2);
        }
    }

    public final StateWrapper getStateWrapper() {
        return this.f23409w;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        getViewTreeObserver().addOnPreDrawListener(this);
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof c)) {
            parent = parent.getParent();
        }
        c cVar = parent instanceof c ? (c) parent : null;
        if (cVar == null) {
            super.onAttachedToWindow();
            return;
        }
        vm.e eVar = (vm.e) cVar;
        eVar.setOnInterfaceInsetsChangeListener(this);
        this.f23405d = new WeakReference(cVar);
        this.f23406e = eVar.getInterfaceInsets();
        d();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c cVar = (c) this.f23405d.get();
        if (cVar != null) {
            vm.e eVar = (vm.e) cVar;
            Intrinsics.checkNotNullParameter(this, "listener");
            if (Intrinsics.areEqual(eVar.I, this)) {
                eVar.I = null;
                eVar.f21765w.removeOnLayoutChangeListener(eVar);
            }
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z5 = false;
        if (this.f23408v) {
            this.f23408v = false;
            d();
            z5 = true;
        }
        if (z5) {
            requestLayout();
        }
        return !z5;
    }

    public final void setEdges(@NotNull zm.a edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f23410x = edges;
        requestApplyInsets();
        this.f23408v = true;
    }

    public final void setInsetType(@NotNull b insetType) {
        Intrinsics.checkNotNullParameter(insetType, "insetType");
        this.f23411y = insetType;
        requestApplyInsets();
        this.f23408v = true;
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f23409w = stateWrapper;
    }
}
