package com.facebook.react.modules.toast;

import ab.a;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.mounting.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.toast.ToastModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "ToastAndroid")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0014J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J2\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/modules/toast/ToastModule;", "Lcom/facebook/fbreact/specs/NativeToastAndroidSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "show", "", "message", "durationDouble", "", "showWithGravity", "gravityDouble", "showWithGravityAndOffset", "xOffsetDouble", "yOffsetDouble", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ToastModule extends NativeToastAndroidSpec {

    @NotNull
    private static final String DURATION_LONG_KEY = "LONG";

    @NotNull
    private static final String DURATION_SHORT_KEY = "SHORT";

    @NotNull
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";

    @NotNull
    private static final String GRAVITY_CENTER = "CENTER";

    @NotNull
    private static final String GRAVITY_TOP_KEY = "TOP";

    @NotNull
    public static final String NAME = "ToastAndroid";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(ToastModule toastModule, String str, int i7) {
        Toast.makeText(toastModule.getReactApplicationContext(), str, i7).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravity$lambda$1(ToastModule toastModule, String str, int i7, int i10) {
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i7);
        toastMakeText.setGravity(i10, 0, 0);
        toastMakeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravityAndOffset$lambda$2(ToastModule toastModule, String str, int i7, int i10, int i11, int i12) {
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i7);
        toastMakeText.setGravity(i10, i11, i12);
        toastMakeText.show();
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        return w0.h(new Pair(DURATION_SHORT_KEY, 0), new Pair(DURATION_LONG_KEY, 1), new Pair(GRAVITY_TOP_KEY, 49), new Pair(GRAVITY_BOTTOM_KEY, 81), new Pair(GRAVITY_CENTER, 17));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(String message, double durationDouble) {
        UiThreadUtil.runOnUiThread(new a(this, message, (int) durationDouble, 8));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(String message, double durationDouble, double gravityDouble) {
        UiThreadUtil.runOnUiThread(new c(this, message, (int) durationDouble, (int) gravityDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(final String message, double durationDouble, double gravityDouble, double xOffsetDouble, double yOffsetDouble) {
        final int i7 = (int) durationDouble;
        final int i10 = (int) gravityDouble;
        final int i11 = (int) xOffsetDouble;
        final int i12 = (int) yOffsetDouble;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: eb.a
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravityAndOffset$lambda$2(this.f8124d, message, i7, i10, i11, i12);
            }
        });
    }
}
