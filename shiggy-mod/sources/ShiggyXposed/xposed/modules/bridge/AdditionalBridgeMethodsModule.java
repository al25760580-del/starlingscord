package ShiggyXposed.xposed.modules.bridge;

import ShiggyXposed.xposed.AppInfo;
import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AdditionalBridgeMethodsModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010\u000b\u001a\u00020\u0005*\u00020\fH\u0002¨\u0006\r"}, d2 = {"LShiggyXposed/xposed/modules/bridge/AdditionalBridgeMethodsModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "onContext", "", "context", "Landroid/content/Context;", "onActivity", "activity", "Landroid/app/Activity;", "openFileGuarded", "Ljava/io/File;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AdditionalBridgeMethodsModule extends Module {
    public static final AdditionalBridgeMethodsModule INSTANCE = new AdditionalBridgeMethodsModule();

    private AdditionalBridgeMethodsModule() {
    }

    @Override // ShiggyXposed.xposed.Module
    public void onContext(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BridgeModule.INSTANCE.registerMethod("Shiggy.fs.getConstants", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalBridgeMethodsModule.onContext$lambda$10$lambda$0(context, (ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.fs.delete", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalBridgeMethodsModule.onContext$lambda$10$lambda$2((ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.fs.exists", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalBridgeMethodsModule.onContext$lambda$10$lambda$3((ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.fs.read", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalBridgeMethodsModule.onContext$lambda$10$lambda$6((ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.fs.write", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalBridgeMethodsModule.onContext$lambda$10$lambda$8((ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.app.reload", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalBridgeMethodsModule.onContext$lambda$10$lambda$9((ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$10$lambda$0(Context context, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MapsKt.mapOf(TuplesKt.to("data", context.getDataDir().getAbsolutePath()), TuplesKt.to("files", context.getFilesDir().getAbsolutePath()), TuplesKt.to("cache", context.getCacheDir().getAbsolutePath()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$10$lambda$2(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        File file = new File((String) obj);
        return Boolean.valueOf(file.isDirectory() ? FilesKt.deleteRecursively(file) : file.delete());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$10$lambda$3(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return Boolean.valueOf(new File((String) obj).exists());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$10$lambda$6(ArrayList it) throws IOException {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        File file = new File((String) obj);
        INSTANCE.openFileGuarded(file);
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return text;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContext$lambda$10$lambda$8(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = it;
        Object obj = arrayList.get(0);
        Object obj2 = arrayList.get(1);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        File file = new File((String) obj);
        INSTANCE.openFileGuarded(file);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        FilesKt.writeText$default(file, (String) obj2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$10$lambda$9(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Utils.INSTANCE.reloadApp();
        return null;
    }

    @Override // ShiggyXposed.xposed.Module
    public void onActivity(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BridgeModule.INSTANCE.registerMethod("Shiggy.alertError", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalBridgeMethodsModule.onActivity$lambda$15$lambda$13(activity, (ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.showRecoveryAlert", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalBridgeMethodsModule.onActivity$lambda$15$lambda$14(activity, (ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onActivity$lambda$15$lambda$13(final Activity activity, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = it;
        Object obj = arrayList.get(0);
        Object obj2 = arrayList.get(1);
        Activity activity2 = activity;
        AppInfo appInfo = INSTANCE.getAppInfo(activity2);
        String strValueOf = String.valueOf(obj);
        Object systemService = activity.getApplicationContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        final ClipboardManager clipboardManager = (ClipboardManager) systemService;
        final ClipData clipDataNewPlainText = ClipData.newPlainText("Stack Trace", strValueOf);
        new AlertDialog.Builder(activity2).setTitle("ShiggyCord Error").setMessage(StringsKt.trimIndent("\n                    ShiggyCord: " + obj2 + "\n                    " + appInfo.getName() + ": " + appInfo.getVersion() + " (" + appInfo.getVersionCode() + ")\n                    Device: " + Build.MANUFACTURER + ' ' + Build.MODEL + "\n\n\n                ") + strValueOf).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setNeutralButton("Copy", new DialogInterface.OnClickListener() { // from class: ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AdditionalBridgeMethodsModule.onActivity$lambda$15$lambda$13$lambda$12(clipboardManager, clipDataNewPlainText, activity, dialogInterface, i);
            }
        }).show();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivity$lambda$15$lambda$13$lambda$12(ClipboardManager clipboardManager, ClipData clipData, Activity activity, DialogInterface dialogInterface, int i) {
        clipboardManager.setPrimaryClip(clipData);
        Toast.makeText(activity.getApplicationContext(), "Copied stack trace", 0).show();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivity$lambda$15$lambda$14(Activity activity, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Utils.INSTANCE.showRecoveryAlert(activity);
        return Unit.INSTANCE;
    }

    private final void openFileGuarded(File file) {
        if (!file.exists()) {
            throw new Error("Path does not exist: " + file.getPath());
        }
        if (!file.isFile()) {
            throw new Error("Path is not a file: " + file.getPath());
        }
    }
}
