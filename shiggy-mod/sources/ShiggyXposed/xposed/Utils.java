package ShiggyXposed.xposed;

import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"LShiggyXposed/xposed/Utils;", "", "<init>", "()V", "Companion", "Log", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Utils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Json JSON = JsonKt.Json$default(null, new Function1() { // from class: ShiggyXposed.xposed.Utils$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Utils.JSON$lambda$0((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX INFO: compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"LShiggyXposed/xposed/Utils$Companion;", "", "<init>", "()V", "JSON", "Lkotlinx/serialization/json/Json;", "getJSON", "()Lkotlinx/serialization/json/Json;", "reloadApp", "", "showRecoveryAlert", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Json getJSON() {
            return Utils.JSON;
        }

        public final void reloadApp() {
            Application applicationCurrentApplication = AndroidAppHelper.currentApplication();
            Intent launchIntentForPackage = applicationCurrentApplication.getPackageManager().getLaunchIntentForPackage(applicationCurrentApplication.getPackageName());
            Intrinsics.checkNotNull(launchIntentForPackage);
            applicationCurrentApplication.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }

        public final void showRecoveryAlert(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            new AlertDialog.Builder(context).setTitle("ShiggyCord Recovery Options").setItems(new String[]{"Reload", "Delete Script", "Reset Loader Config"}, new DialogInterface.OnClickListener() { // from class: ShiggyXposed.xposed.Utils$Companion$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Utils.Companion.showRecoveryAlert$lambda$0(context, dialogInterface, i);
                }
            }).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showRecoveryAlert$lambda$0(Context context, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                Utils.INSTANCE.reloadApp();
            } else {
                if (i != 1) {
                    return;
                }
                File file = new File(context.getDataDir(), "cache/pyoncord/bundle.js");
                if (file.exists()) {
                    file.delete();
                }
                Utils.INSTANCE.reloadApp();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JSON$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"LShiggyXposed/xposed/Utils$Log;", "", "<init>", "()V", "e", "", NotificationCompat.CATEGORY_MESSAGE, "", "throwable", "", "i", "w", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Log {
        public static final Log INSTANCE = new Log();

        private Log() {
        }

        public final int e(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return android.util.Log.e(Constants.LOG_TAG, msg);
        }

        public final int e(String msg, Throwable throwable) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return android.util.Log.e(Constants.LOG_TAG, msg, throwable);
        }

        public final int i(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return android.util.Log.i(Constants.LOG_TAG, msg);
        }

        public final int i(String msg, Throwable throwable) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return android.util.Log.i(Constants.LOG_TAG, msg, throwable);
        }

        public final int w(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return android.util.Log.w(Constants.LOG_TAG, msg);
        }

        public final int w(String msg, Throwable throwable) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return android.util.Log.w(Constants.LOG_TAG, msg, throwable);
        }
    }
}
