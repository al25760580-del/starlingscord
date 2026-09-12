package com.facebook.react.devsupport;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.R;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J3\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J5\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J1\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "reactInstanceDevHelper", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "<init>", "(Lcom/facebook/react/devsupport/ReactInstanceDevHelper;)V", "devLoadingView", "Landroid/widget/TextView;", "devLoadingPopup", "Landroid/widget/PopupWindow;", "showMessage", "", "message", "", ViewProps.COLOR, "", ViewProps.BACKGROUND_COLOR, "dismissButton", "", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V", "updateProgress", "status", "done", "", "total", "percent", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "hide", "showInternal", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Z)V", "hideInternal", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultDevLoadingViewImplementation implements DevLoadingViewManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isEnabled = true;
    private PopupWindow devLoadingPopup;
    private TextView devLoadingView;

    @NotNull
    private final ReactInstanceDevHelper reactInstanceDevHelper;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation$Companion;", "", "<init>", "()V", "isEnabled", "", "setDevLoadingEnabled", "", ViewProps.ENABLED, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setDevLoadingEnabled(boolean enabled) {
            DefaultDevLoadingViewImplementation.isEnabled = enabled;
        }

        private Companion() {
        }
    }

    public DefaultDevLoadingViewImplementation(@NotNull ReactInstanceDevHelper reactInstanceDevHelper) {
        Intrinsics.checkNotNullParameter(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.reactInstanceDevHelper = reactInstanceDevHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideInternal() {
        PopupWindow popupWindow = this.devLoadingPopup;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.devLoadingPopup = null;
            this.devLoadingView = null;
        }
    }

    private final void showInternal(String message, Double color, Double backgroundColor, boolean dismissButton) {
        PopupWindow popupWindow = this.devLoadingPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity currentActivity = this.reactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null) {
                o8.a.g(ReactConstants.TAG, "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i7 = rect.top;
                Object systemService = currentActivity.getSystemService("layout_inflater");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dev_loading_view, (ViewGroup) null);
                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) viewInflate;
                TextView textView = (TextView) viewGroup.findViewById(R.id.loading_text);
                textView.setText(message);
                Button button = (Button) viewGroup.findViewById(R.id.dismiss_button);
                if (dismissButton) {
                    button.setVisibility(0);
                } else {
                    button.setVisibility(8);
                }
                int iDoubleValue = color != null ? (int) color.doubleValue() : -1;
                int iDoubleValue2 = backgroundColor != null ? (int) backgroundColor.doubleValue() : Color.rgb(64, 64, 64);
                textView.setTextColor(iDoubleValue);
                viewGroup.setBackgroundColor(iDoubleValue2);
                if (dismissButton) {
                    button.setTextColor(iDoubleValue);
                    int iRgb = Color.rgb((int) (((double) Color.red(iDoubleValue2)) * 0.7d), (int) (((double) Color.green(iDoubleValue2)) * 0.7d), (int) (((double) Color.blue(iDoubleValue2)) * 0.7d));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(iRgb);
                    gradientDrawable.setCornerRadius(15 * viewGroup.getResources().getDisplayMetrics().density);
                    button.setBackground(gradientDrawable);
                    final int i10 = 0;
                    button.setOnClickListener(new View.OnClickListener(this) { // from class: com.facebook.react.devsupport.g

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ DefaultDevLoadingViewImplementation f5175e;

                        {
                            this.f5175e = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    this.f5175e.hideInternal();
                                    break;
                                default:
                                    this.f5175e.hideInternal();
                                    break;
                            }
                        }
                    });
                }
                final int i11 = 1;
                viewGroup.setOnClickListener(new View.OnClickListener(this) { // from class: com.facebook.react.devsupport.g

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ DefaultDevLoadingViewImplementation f5175e;

                    {
                        this.f5175e = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                this.f5175e.hideInternal();
                                break;
                            default:
                                this.f5175e.hideInternal();
                                break;
                        }
                    }
                });
                PopupWindow popupWindow2 = new PopupWindow(viewGroup, -1, -2);
                popupWindow2.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i7);
                this.devLoadingView = textView;
                this.devLoadingPopup = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                o8.a.g(ReactConstants.TAG, "Unable to display loading message because react activity isn't active, message: " + message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$0(DefaultDevLoadingViewImplementation defaultDevLoadingViewImplementation, String str, Double d6, Double d7, Boolean bool) {
        defaultDevLoadingViewImplementation.showInternal(str, d6, d7, bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProgress$lambda$1(Integer num, Integer num2, Integer num3, DefaultDevLoadingViewImplementation defaultDevLoadingViewImplementation, String str) {
        String strQ;
        if (num != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strQ = a3.e.q(new Object[]{num}, 1, Locale.getDefault(), " %d%%", "format(...)");
        } else if (num2 == null || num3 == null || num3.intValue() <= 0) {
            strQ = "";
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            strQ = a3.e.q(new Object[]{Float.valueOf((num2.intValue() / num3.intValue()) * 100)}, 1, Locale.getDefault(), " %.1f%%", "format(...)");
        }
        TextView textView = defaultDevLoadingViewImplementation.devLoadingView;
        if (textView != null) {
            if (str == null) {
                str = "Loading";
            }
            textView.setText(str + strQ + "…");
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void hide() {
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new f(0, this));
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void showMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        showMessage(message, null, null, Boolean.FALSE);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void updateProgress(String status, Integer done, Integer total, Integer percent) {
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new h(percent, done, total, this, status, 0));
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void showMessage(@NotNull String message, Double color, Double backgroundColor, Boolean dismissButton) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new h(this, message, color, backgroundColor, dismissButton));
        }
    }
}
