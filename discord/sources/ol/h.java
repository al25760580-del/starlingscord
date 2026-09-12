package ol;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.reactnativedocumentpicker.NativeDocumentPickerSpec;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Promise f17460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17461b;

    public final void a(String code, Exception e10) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(e10, "e");
        String localizedMessage = e10.getLocalizedMessage();
        if (localizedMessage == null && (localizedMessage = e10.getMessage()) == null) {
            localizedMessage = "unknown error";
        }
        b(code, localizedMessage, e10);
    }

    public final void b(String code, String message, Exception exc) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Promise promise = this.f17460a;
        if (promise == null) {
            Log.e(NativeDocumentPickerSpec.NAME, "cannot reject promise because it's null");
            return;
        }
        this.f17461b = null;
        this.f17460a = null;
        promise.reject(code, message, exc);
    }

    public final void c(Object obj) {
        Promise promise = this.f17460a;
        if (promise == null) {
            Log.e(NativeDocumentPickerSpec.NAME, "cannot resolve promise because it's null");
            return;
        }
        this.f17461b = null;
        this.f17460a = null;
        promise.resolve(obj);
    }

    public final boolean d(Promise promise, String fromCallsite) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(fromCallsite, "fromCallsite");
        if (this.f17460a != null) {
            promise.reject("ASYNC_OP_IN_PROGRESS", s0.g.f("Warning: previous promise did not settle and you attempted to overwrite it. You've called \"", fromCallsite, "\" while \"", this.f17461b, "\" was already in progress and has not completed yet."));
            return false;
        }
        this.f17460a = promise;
        this.f17461b = fromCallsite;
        return true;
    }
}
