package a2;

import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;
import com.facebook.imagepipeline.nativecode.c;
import kotlin.jvm.internal.Intrinsics;
import ls.l;
import mf.f;
import n1.p;
import o1.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static d a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        CreateCredentialException createCredentialException = (CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", CreateCredentialException.class);
        if (createCredentialException == null) {
            return null;
        }
        String type = createCredentialException.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return c.L(createCredentialException.getMessage(), type);
    }

    public static n1.c b(Intent intent, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(intent, "intent");
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
        if (createCredentialResponse == null) {
            return null;
        }
        Bundle data = createCredentialResponse.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return l.o(type, data);
    }

    public static o1.l c(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return c.M(getCredentialException.getMessage(), type);
    }

    public static p d(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
        Intrinsics.checkNotNullParameter(credential, "credential");
        String type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Bundle data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return new p(f.o(type, data));
    }

    public static AccessibilityNodeInfo.AccessibilityAction e() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float f(VelocityTracker velocityTracker, int i7) {
        return velocityTracker.getAxisVelocity(i7);
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int i(ViewConfiguration viewConfiguration, int i7, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i7, i10, i11);
    }

    public static int j(ViewConfiguration viewConfiguration, int i7, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i7, i10, i11);
    }

    public static boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static float l(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public static void m(TextView textView, int i7, float f2) {
        textView.setLineHeight(i7, f2);
    }

    public static int n(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public static float o(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public static float p(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
