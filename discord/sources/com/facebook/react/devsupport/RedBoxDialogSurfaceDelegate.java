package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.l0;
import androidx.core.view.u0;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.R;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;", "Lcom/facebook/react/common/SurfaceDelegate;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "<init>", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V", "doubleTapReloadRecognizer", "Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;", "dialog", "Landroid/app/Dialog;", "redBoxContentView", "Lcom/facebook/react/devsupport/RedBoxContentView;", "createContentView", "", "appKey", "", "isContentViewReady", "", "destroyContentView", "show", "hide", "isShowing", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRedBoxDialogSurfaceDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedBoxDialogSurfaceDelegate.kt\ncom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
public final class RedBoxDialogSurfaceDelegate implements SurfaceDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DevSupportManager devSupportManager;
    private Dialog dialog;

    @NotNull
    private final DoubleTapReloadRecognizer doubleTapReloadRecognizer;
    private RedBoxContentView redBoxContentView;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$Companion;", "", "<init>", "()V", "runAfterHostResume", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "runnable", "Ljava/lang/Runnable;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runAfterHostResume(final ReactContext reactContext, final Runnable runnable) {
            reactContext.addLifecycleEventListener(new LifecycleEventListener() { // from class: com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate$Companion$runAfterHostResume$1
                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostDestroy() {
                }

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostPause() {
                }

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostResume() {
                    runnable.run();
                    reactContext.removeLifecycleEventListener(this);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate$show$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\f"}, d2 = {"com/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$show$2", "Landroid/app/Dialog;", "onKeyUp", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends Dialog {
        final /* synthetic */ RedBoxDialogSurfaceDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Activity activity, RedBoxDialogSurfaceDelegate redBoxDialogSurfaceDelegate, int i7) {
            super(activity, i7);
            this.this$0 = redBoxDialogSurfaceDelegate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WindowInsetsCompat onCreate$lambda$0(int i7, View view, WindowInsetsCompat windowInsetsCompat) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
            Insets insetsF = windowInsetsCompat.f1605a.f(i7);
            Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).setMargins(insetsF.f1556a, insetsF.f1557b, insetsF.f1558c, insetsF.f1559d);
            return WindowInsetsCompat.f1604b;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle savedInstanceState) {
            Window window = getWindow();
            if (window == null) {
                throw new IllegalStateException("Required value was null.");
            }
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            RedBoxContentView redBoxContentView = this.this$0.redBoxContentView;
            if (redBoxContentView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            t tVar = new t(0);
            WeakHashMap weakHashMap = u0.f1729a;
            l0.m(redBoxContentView, tVar);
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyUp(int keyCode, KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (keyCode == 82) {
                this.this$0.devSupportManager.showDevOptionsDialog();
                return true;
            }
            if (this.this$0.doubleTapReloadRecognizer.didDoubleTapR(keyCode, getCurrentFocus())) {
                this.this$0.devSupportManager.handleReloadJS();
            }
            return super.onKeyUp(keyCode, event);
        }
    }

    public RedBoxDialogSurfaceDelegate(@NotNull DevSupportManager devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
        this.doubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$4$lambda$3(RedBoxDialogSurfaceDelegate redBoxDialogSurfaceDelegate, DialogInterface dialogInterface) {
        redBoxDialogSurfaceDelegate.devSupportManager.hideRedboxDialog();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void createContentView(@NotNull String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        RedBoxHandler redBoxHandler = this.devSupportManager.getRedBoxHandler();
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            RedBoxContentView redBoxContentView = new RedBoxContentView(currentActivity, this.devSupportManager, redBoxHandler);
            redBoxContentView.init();
            this.redBoxContentView = redBoxContentView;
        } else {
            String lastErrorTitle = this.devSupportManager.getLastErrorTitle();
            if (lastErrorTitle == null) {
                lastErrorTitle = "N/A";
            }
            o8.a.g(ReactConstants.TAG, "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ".concat(lastErrorTitle));
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void destroyContentView() {
        this.redBoxContentView = null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void hide() {
        try {
            Dialog dialog = this.dialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (IllegalArgumentException e10) {
            o8.a.h(ReactConstants.TAG, "RedBoxDialogSurfaceDelegate: error while dismissing dialog: ", e10);
        }
        destroyContentView();
        this.dialog = null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isContentViewReady() {
        return this.redBoxContentView != null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isShowing() {
        Dialog dialog = this.dialog;
        return dialog != null && dialog.isShowing();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void show() {
        String lastErrorTitle = this.devSupportManager.getLastErrorTitle();
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            ReactContext currentReactContext = this.devSupportManager.getCurrentReactContext();
            if (currentReactContext != null) {
                INSTANCE.runAfterHostResume(currentReactContext, new f(3, this));
                return;
            }
            if (lastErrorTitle == null) {
                lastErrorTitle = "N/A";
            }
            o8.a.g(ReactConstants.TAG, "Unable to launch redbox because react activity and react context is not available, here is the error that redbox would've displayed: ".concat(lastErrorTitle));
            return;
        }
        RedBoxContentView redBoxContentView = this.redBoxContentView;
        if ((redBoxContentView != null ? redBoxContentView.getContext() : null) != currentActivity) {
            createContentView(NativeRedBoxSpec.NAME);
        }
        RedBoxContentView redBoxContentView2 = this.redBoxContentView;
        if (redBoxContentView2 != null) {
            redBoxContentView2.refreshContentView();
        }
        if (this.dialog == null) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(currentActivity, this, R.style.Theme_Catalyst_RedBox);
            anonymousClass2.requestWindowFeature(1);
            RedBoxContentView redBoxContentView3 = this.redBoxContentView;
            if (redBoxContentView3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            anonymousClass2.setContentView(redBoxContentView3);
            anonymousClass2.setOnCancelListener(new p(2, this));
            this.dialog = anonymousClass2;
        }
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.show();
        }
    }
}
