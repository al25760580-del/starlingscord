package ol;

import android.app.Activity;
import android.content.Intent;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends BaseActivityEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RNDocumentPickerModule f17462d;

    public j(RNDocumentPickerModule rNDocumentPickerModule) {
        this.f17462d = rNDocumentPickerModule;
    }

    @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i7, int i10, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (i7 == 41 || i7 == 42 || i7 == 43) {
            RNDocumentPickerModule rNDocumentPickerModule = this.f17462d;
            if (i10 != -1) {
                if (i10 == 0) {
                    rNDocumentPickerModule.promiseWrapper.b("OPERATION_CANCELED", "user canceled the document picker", null);
                    return;
                }
                rNDocumentPickerModule.promiseWrapper.b("UNEXPECTED_ACTIVITY_RESULT", "Unknown activity result: " + i10, null);
                return;
            }
            if (intent == null) {
                rNDocumentPickerModule.promiseWrapper.b("INVALID_DATA_RETURNED", "Data from document picker is null", null);
                return;
            }
            switch (i7) {
                case 41:
                    rNDocumentPickerModule.processFilePickerResult(intent);
                    break;
                case 42:
                    rNDocumentPickerModule.processDirectoryPickerResult(intent);
                    break;
                case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                    rNDocumentPickerModule.processSaveAsResult(intent);
                    break;
                default:
                    rNDocumentPickerModule.promiseWrapper.b("UNEXPECTED_ACTIVITY_RESULT", "Unknown activity result: " + i10, null);
                    break;
            }
        }
    }
}
