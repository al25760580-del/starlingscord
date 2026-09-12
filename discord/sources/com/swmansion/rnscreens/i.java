package com.swmansion.rnscreens;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements androidx.core.view.t, LifecycleEventListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f7200v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f7201w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f7197d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f7198e = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static WeakReference f7199i = new WeakReference(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f7202x = true;

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View v6, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v6, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompatK = f7202x ? androidx.core.view.u0.k(v6, insets) : insets;
        Intrinsics.checkNotNull(windowInsetsCompatK);
        Iterator it = f7198e.iterator();
        while (it.hasNext()) {
            windowInsetsCompatK = ((androidx.core.view.t) it.next()).a(v6, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatK, "onApplyWindowInsets(...)");
        }
        return windowInsetsCompatK;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        View view = (View) f7199i.get();
        if (f7200v && view != null) {
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            androidx.core.view.l0.m(view, null);
            f7200v = false;
            f7199i.clear();
        }
        f7201w = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }
}
