package jm;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.views.view.ReactViewGroup;
import im.q;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends ReactViewGroup {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f13968w = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13970e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13971i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f13972v;

    public final void c(c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m mVar = this.f13972v;
        if (mVar != null) {
            Intrinsics.checkNotNullParameter(view, "view");
            im.g gVar = mVar.f13962c;
            if (gVar != null) {
                Intrinsics.checkNotNullParameter(view, "view");
                ArrayList<im.f> arrayListG = gVar.f11919b.g(view);
                if (arrayListG != null) {
                    for (im.f fVar : arrayListG) {
                        if (fVar instanceof q) {
                            gVar.g(fVar, view);
                            i6.a closure = new i6.a(1, (q) fVar);
                            Intrinsics.checkNotNullParameter(closure, "closure");
                            fVar.k = true;
                            closure.invoke();
                            fVar.k = false;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f A[RETURN] */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent ev) {
        m mVar;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.f13970e) {
            if (a.a(ev)) {
                mVar = this.f13972v;
                Intrinsics.checkNotNull(mVar);
                if (mVar.a(ev)) {
                    return true;
                }
            } else {
                Intrinsics.checkNotNullParameter(ev, "<this>");
                if (ev.getActionMasked() == 11 || ev.getActionMasked() == 12) {
                    mVar = this.f13972v;
                    Intrinsics.checkNotNull(mVar);
                    if (mVar.a(ev)) {
                        return true;
                    }
                }
            }
        }
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f13970e && event.getActionMasked() == 0) {
            MotionEvent motionEventObtain = MotionEvent.obtain(event);
            motionEventObtain.setAction(3);
            super.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (this.f13970e) {
            m mVar = this.f13972v;
            Intrinsics.checkNotNull(mVar);
            if (mVar.a(event)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z5;
        super.onAttachedToWindow();
        if (!this.f13971i) {
            UiThreadUtil.assertOnUiThread();
            ViewParent parent = getParent();
            while (true) {
                if (parent != null) {
                    if (parent instanceof n) {
                        z5 = false;
                        break;
                    } else if (!(parent instanceof RootView)) {
                        parent = parent.getParent();
                    }
                }
                z5 = true;
                break;
            }
        } else {
            z5 = true;
            break;
        }
        this.f13970e = z5;
        if (!z5) {
            Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.f13970e && this.f13972v == null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f13972v = new m((ReactContext) context, this, this.f13969d);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        l lVar;
        if (this.f13970e) {
            m mVar = this.f13972v;
            Intrinsics.checkNotNull(mVar);
            if (mVar.f13962c != null && !mVar.f13967h && (lVar = mVar.f13963d) != null && lVar.f11896h == 2) {
                lVar.a(false);
                lVar.k();
            }
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    public final void setModuleId(int i7) {
        this.f13969d = i7;
    }

    public final void setUnstableForceActive(boolean z5) {
        this.f13971i = z5;
    }
}
