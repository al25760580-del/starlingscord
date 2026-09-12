package xl;

import am.d;
import am.e;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.core.view.l0;
import androidx.core.view.u0;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.facebook.react.views.modal.ReactModalHostView;
import com.facebook.react.views.modal.ShowEvent;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.Intrinsics;
import vl.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements EventDispatcherListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThemedReactContext f22971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f22972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f22973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UIManager f22974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EventDispatcher f22975f;

    public b(e view, ThemedReactContext reactContext, f config, d callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f22970a = view;
        this.f22971b = reactContext;
        this.f22972c = config;
        this.f22973d = callback;
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        this.f22974e = UIManagerHelper.getUIManager(reactContext, 2);
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        this.f22975f = UIManagerHelper.getEventDispatcher(reactContext, 2);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public final void onEventDispatch(Event event) {
        ReactModalHostView reactModalHostView;
        View decorView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.internal_getEventNameCompat(), ShowEvent.EVENT_NAME)) {
            View rootView = null;
            try {
                UIManager uIManager = this.f22974e;
                View viewResolveView = uIManager != null ? uIManager.resolveView(event.getViewTag()) : null;
                reactModalHostView = viewResolveView instanceof ReactModalHostView ? (ReactModalHostView) viewResolveView : null;
            } catch (Exception unused) {
                boolean z5 = c.f22976a;
                String message = "Can not resolve view for Modal#" + event.getViewTag();
                Intrinsics.checkNotNullParameter(message, "message");
            }
            if (reactModalHostView == null) {
                return;
            }
            ComponentDialog dialog = reactModalHostView.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                rootView = decorView.getRootView();
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            if (viewGroup != null) {
                ThemedReactContext themedReactContext = this.f22971b;
                final ReactViewGroup reactViewGroup = new ReactViewGroup(themedReactContext);
                reactViewGroup.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                final vl.e eVar = new vl.e(this.f22970a, viewGroup, themedReactContext, this.f22972c);
                viewGroup.addView(reactViewGroup);
                if (c.f22976a) {
                    vl.e eVar2 = (vl.e) this.f22973d.invoke();
                    if (eVar2 != null) {
                        eVar2.L = true;
                    }
                    u0.r(viewGroup, eVar);
                    l0.m(reactViewGroup, eVar);
                    eVar.g(Boolean.FALSE, Double.valueOf(0.0d));
                }
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xl.a
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            vl.e eVar3 = eVar;
                            eVar3.g(null, null);
                            eVar3.J = null;
                            eVar3.f21735e.getViewTreeObserver().removeOnGlobalFocusChangeListener(eVar3.M);
                            ReactViewGroup reactViewGroup2 = reactViewGroup;
                            ViewParent parent = reactViewGroup2.getParent();
                            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(reactViewGroup2);
                            }
                            vl.e eVar4 = (vl.e) this.f22973d.invoke();
                            if (eVar4 != null) {
                                eVar4.L = false;
                            }
                        }
                    });
                }
                if (window != null) {
                    window.setSoftInputMode(48);
                }
            }
        }
    }
}
