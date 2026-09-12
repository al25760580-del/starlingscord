package androidx.activity;

import am.d;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.p3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import e.e;
import e.o;
import e.p;
import e.q;
import e.r;
import e.s;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f710b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnBackPressedCallback f711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f715g;

    public OnBackPressedDispatcher(Runnable runnable) {
        OnBackInvokedCallback p3Var;
        this.f709a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            if (i7 >= 34) {
                o onBackStarted = new o(this, 0);
                o onBackProgressed = new o(this, 1);
                p onBackInvoked = new p(this, 0);
                p onBackCancelled = new p(this, 1);
                Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
                Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
                Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
                Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
                p3Var = new q(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
            } else {
                p onBackInvoked2 = new p(this, 2);
                Intrinsics.checkNotNullParameter(onBackInvoked2, "onBackInvoked");
                p3Var = new p3(1, onBackInvoked2);
            }
            this.f712d = p3Var;
        }
    }

    public final void a(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.f2295d) {
            return;
        }
        onBackPressedCallback.addCancellable(new r(this, lifecycle, onBackPressedCallback));
        f();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new d(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1));
    }

    public final s b(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f710b.addLast(onBackPressedCallback);
        s sVar = new s(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(sVar);
        f();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new d(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2));
        return sVar;
    }

    public final void c() {
        Object objPrevious;
        OnBackPressedCallback onBackPressedCallback = this.f711c;
        if (onBackPressedCallback == null) {
            ArrayDeque arrayDeque = this.f710b;
            ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((OnBackPressedCallback) objPrevious).isEnabled());
            onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        }
        this.f711c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackCancelled();
        }
    }

    public final void d() {
        Object objPrevious;
        OnBackPressedCallback onBackPressedCallback = this.f711c;
        if (onBackPressedCallback == null) {
            ArrayDeque arrayDeque = this.f710b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.a());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((OnBackPressedCallback) objPrevious).isEnabled());
            onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        }
        this.f711c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
        } else {
            this.f709a.run();
        }
    }

    public final void e(boolean z5) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f713e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f712d) == null) {
            return;
        }
        if (z5 && !this.f714f) {
            e.g(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f714f = true;
        } else {
            if (z5 || !this.f714f) {
                return;
            }
            e.i(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f714f = false;
        }
    }

    public final void f() {
        boolean z5 = this.f715g;
        boolean z6 = false;
        ArrayDeque arrayDeque = this.f710b;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((OnBackPressedCallback) it.next()).isEnabled()) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f715g = z6;
        if (z6 == z5 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z6);
    }
}
