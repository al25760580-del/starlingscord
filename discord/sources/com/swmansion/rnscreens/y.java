package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/y;", "Landroidx/fragment/app/Fragment;", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "<init>", "()V", "com/swmansion/rnscreens/w", "com/swmansion/rnscreens/x", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenFragment.kt\ncom/swmansion/rnscreens/ScreenFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n1#2:354\n774#3:355\n865#3,2:356\n1869#3,2:358\n*S KotlinDebug\n*F\n+ 1 ScreenFragment.kt\ncom/swmansion/rnscreens/ScreenFragment\n*L\n233#1:355\n233#1:356,2\n233#1:358,2\n*E\n"})
public class y extends Fragment implements ScreenFragmentWrapper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Screen f7258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f7259e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7260i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f7261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7264y;

    public y() {
        this.f7259e = new ArrayList();
        this.f7261v = -1.0f;
        this.f7262w = true;
        this.f7263x = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final Screen a() {
        Screen screen = this.f7258d;
        if (screen != null) {
            return screen;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screen");
        return null;
    }

    public boolean b() {
        return false;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void c(ScreenContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f7259e.remove(container);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void d(w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            this.f7263x = false;
            return;
        }
        if (iOrdinal == 1) {
            this.f7262w = false;
        } else if (iOrdinal == 2) {
            this.f7263x = true;
        } else {
            if (iOrdinal != 3) {
                throw new rn.n();
            }
            this.f7262w = true;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final Activity e() {
        Fragment fragment;
        FragmentActivity activity;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = a().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = a().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof Screen) && (fragment = ((Screen) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final ReactContext i() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (a().getContext() instanceof ReactContext) {
            Context context2 = a().getContext();
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = a().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen = (Screen) container;
                if (screen.getContext() instanceof ReactContext) {
                    Context context3 = screen.getContext();
                    Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void k(w event) {
        ScreenFragmentWrapper fragmentWrapper;
        Intrinsics.checkNotNullParameter(event, "event");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f7259e) {
            if (((ScreenContainer) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Screen topScreen = ((ScreenContainer) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                u(event, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final List l() {
        return this.f7259e;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void m(ScreenContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f7259e.add(container);
    }

    public void n() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            this.f7260i = true;
        } else {
            io.sentry.config.a.Z(a(), activity, i());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        a().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        x xVar = new x(context);
        Screen screenA = a();
        ls.d.z(screenA);
        xVar.addView(screenA);
        return xVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ScreenContainer container = a().getContainer();
        if (container == null || !container.hasScreen(a().getFragmentWrapper())) {
            Context context = a().getContext();
            if (context instanceof ReactContext) {
                int surfaceId = UIManagerHelper.getSurfaceId(context);
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, a().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new k4.k(surfaceId, a().getId(), 6));
                }
            }
        }
        this.f7259e.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f7260i) {
            this.f7260i = false;
            io.sentry.config.a.Z(a(), e(), i());
        }
    }

    public final void t() {
        Context context = a().getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, a().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new k4.k(surfaceId, a().getId(), 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public final void u(w event, ScreenFragmentWrapper fragmentWrapper) {
        boolean z5;
        k4.k kVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        y yVarG = fragmentWrapper.g();
        if (yVarG instanceof e0) {
            e0 e0Var = (e0) yVarG;
            Intrinsics.checkNotNullParameter(event, "event");
            int iOrdinal = event.ordinal();
            if (iOrdinal == 0) {
                z5 = e0Var.f7263x;
            } else if (iOrdinal != 1) {
                z5 = false;
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new rn.n();
                    }
                    if (!e0Var.f7262w) {
                        z5 = true;
                    }
                } else if (!e0Var.f7263x) {
                    z5 = true;
                }
            } else {
                z5 = e0Var.f7262w;
            }
            if (z5) {
                Screen screenA = e0Var.a();
                fragmentWrapper.d(event);
                int surfaceId = UIManagerHelper.getSurfaceId(screenA);
                int iOrdinal2 = event.ordinal();
                if (iOrdinal2 == 0) {
                    kVar = new k4.k(surfaceId, screenA.getId(), 4);
                } else if (iOrdinal2 == 1) {
                    kVar = new k4.k(surfaceId, screenA.getId(), 7);
                } else if (iOrdinal2 == 2) {
                    kVar = new k4.k(surfaceId, screenA.getId(), 5);
                } else {
                    if (iOrdinal2 != 3) {
                        throw new rn.n();
                    }
                    kVar = new k4.k(surfaceId, screenA.getId(), 8);
                }
                Context context = a().getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, a().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(kVar);
                }
                fragmentWrapper.k(event);
            }
        }
    }

    public final void v(float f2, boolean z5) {
        int i7;
        if (!(this instanceof e0) || this.f7261v == f2) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f2));
        this.f7261v = fMax;
        if (fMax == 0.0f) {
            i7 = 1;
        } else {
            i7 = fMax == 1.0f ? 2 : 3;
        }
        short s2 = (short) i7;
        e0 e0Var = (e0) this;
        ScreenContainer container = e0Var.a().getContainer();
        boolean goingForward = container instanceof ScreenStack ? ((ScreenStack) container).getGoingForward() : false;
        Context context = e0Var.a().getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, e0Var.a().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new nm.d(UIManagerHelper.getSurfaceId(reactContext), e0Var.a().getId(), this.f7261v, z5, goingForward, s2));
        }
    }

    public final void w(boolean z5) {
        this.f7264y = !z5;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof y) && !((y) parentFragment).f7264y)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new com.facebook.react.devsupport.e(z5, this, 4));
            } else if (z5) {
                u(w.f7255i, this);
                v(1.0f, true);
            } else {
                u(w.f7256v, this);
                v(0.0f, true);
            }
        }
    }

    public y(Screen screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.f7259e = new ArrayList();
        this.f7261v = -1.0f;
        this.f7262w = true;
        this.f7263x = true;
        Intrinsics.checkNotNullParameter(screenView, "<set-?>");
        this.f7258d = screenView;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final y g() {
        return this;
    }
}
