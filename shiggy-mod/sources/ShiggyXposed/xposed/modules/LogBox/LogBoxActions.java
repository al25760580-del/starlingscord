package ShiggyXposed.xposed.modules.LogBox;

import ShiggyXposed.xposed.Constants;
import ShiggyXposed.xposed.Utils;
import android.content.Context;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: LogBoxActions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ \u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxActions;", "", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "toggleSafeMode", "", "context", "Landroid/content/Context;", "toggleBundleInjection", "refetchBundle", "clearCacheAndReset", "setCustomBundleURL", "url", "", "enabled", "", "deleteDevtools", "showError", LinkHeader.Parameters.Title, ContentType.Message.TYPE, "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxActions {
    public static final LogBoxActions INSTANCE = new LogBoxActions();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));

    private LogBoxActions() {
    }

    public final void toggleSafeMode(Context context) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getFilesDir(), "logbox/LOGBOX_SETTINGS");
            File file2 = new File(context.getFilesDir(), "logbox/LOGBOX_THEMES");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (file.exists()) {
                jSONObject = new JSONObject(FilesKt.readText$default(file, null, 1, null));
            } else {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("safeMode");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
            jSONObjectOptJSONObject.put("enabled", !zOptBoolean);
            if (!zOptBoolean && file2.exists()) {
                String strOptString = new JSONObject(FilesKt.readText$default(file2, null, 1, null)).optString("id");
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() > 0) {
                    jSONObjectOptJSONObject.put("currentThemeId", strOptString);
                    file2.delete();
                }
            }
            jSONObject.put("safeMode", jSONObjectOptJSONObject);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt.writeText$default(file, string, null, 2, null);
            Toast.makeText(context, "Safe Mode ".concat(!zOptBoolean ? "Enabled" : "Disabled"), 0).show();
            Utils.INSTANCE.reloadApp();
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error toggling safe mode: " + e.getMessage());
            showError(context, "Failed to toggle safe mode", e.getMessage());
        }
    }

    public final void toggleBundleInjection(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getDataDir(), Constants.CACHE_DIR);
            file.mkdirs();
            File file2 = new File(file, Constants.MAIN_SCRIPT_FILE);
            File file3 = new File(file, "bundle.js.disabled");
            File file4 = new File(context.getFilesDir(), "logbox/LOGBOX_SETTINGS");
            File parentFile = file4.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            JSONObject jSONObject = file4.exists() ? new JSONObject(FilesKt.readText$default(file4, null, 1, null)) : new JSONObject();
            boolean zIsBundleInjectionDisabled = LogBoxUtils.INSTANCE.isBundleInjectionDisabled(context);
            if (file2.exists() && file3.exists()) {
                file2.delete();
            }
            if (!zIsBundleInjectionDisabled) {
                if (file3.exists()) {
                    file3.delete();
                }
                if (file2.exists()) {
                    file2.renameTo(file3);
                } else {
                    FilesKt.writeText$default(file3, "", null, 2, null);
                }
                jSONObject.put("bundleInjectionDisabled", true);
                Toast.makeText(context, "Bundle injection disabled", 0).show();
            } else {
                if (file3.exists()) {
                    file3.renameTo(file2);
                } else if (!file2.exists()) {
                    FilesKt.writeText$default(file2, "", null, 2, null);
                }
                jSONObject.put("bundleInjectionDisabled", false);
                Toast.makeText(context, "Bundle injection enabled", 0).show();
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt.writeText$default(file4, string, null, 2, null);
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error toggling bundle injection: " + e.getMessage());
            showError(context, "Failed to toggle bundle injection", e.getMessage());
        }
    }

    public final void refetchBundle(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File pyoncordDirectory = LogBoxUtils.INSTANCE.getPyoncordDirectory(context);
            File file = new File(pyoncordDirectory, Constants.MAIN_SCRIPT_FILE);
            File file2 = new File(pyoncordDirectory, "bundle.js.backup");
            if (file.exists()) {
                file2.delete();
                file.renameTo(file2);
                Utils.Log.INSTANCE.e("Bundle moved to backup");
            }
            Utils.INSTANCE.reloadApp();
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error refetching bundle: " + e.getMessage());
            showError(context, "Failed to refetch bundle", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ShiggyXposed.xposed.modules.LogBox.LogBoxActions$clearCacheAndReset$1, reason: invalid class name */
    /* JADX INFO: compiled from: LogBoxActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "ShiggyXposed.xposed.modules.LogBox.LogBoxActions$clearCacheAndReset$1", f = "LogBoxActions.kt", i = {}, l = {142, 149}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new ShiggyXposed.xposed.modules.LogBox.LogBoxActions.AnonymousClass1.C00001(r9.$context, null), r9) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new ShiggyXposed.xposed.modules.LogBox.LogBoxActions.AnonymousClass1.AnonymousClass2(r9.$context, null), r9) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ShiggyXposed.xposed.modules.LogBox.LogBoxActions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: ShiggyXposed.xposed.modules.LogBox.LogBoxActions$clearCacheAndReset$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: LogBoxActions.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "ShiggyXposed.xposed.modules.LogBox.LogBoxActions$clearCacheAndReset$1$1", f = "LogBoxActions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C00001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00001(Context context, Continuation<? super C00001> continuation) {
                super(2, continuation);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00001(this.$context, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Toast.makeText(this.$context, "Cache cleared successfully", 0).show();
                Utils.INSTANCE.reloadApp();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: ShiggyXposed.xposed.modules.LogBox.LogBoxActions$clearCacheAndReset$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: LogBoxActions.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "ShiggyXposed.xposed.modules.LogBox.LogBoxActions$clearCacheAndReset$1$2", f = "LogBoxActions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Context context, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$context, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Toast.makeText(this.$context, "Failed to clear cache", 0).show();
                return Unit.INSTANCE;
            }
        }
    }

    public final void clearCacheAndReset(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(scope, Dispatchers.getIO(), null, new AnonymousClass1(context, null), 2, null);
    }

    public final void setCustomBundleURL(Context context, String url, boolean enabled) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            File pyoncordDirectory = LogBoxUtils.INSTANCE.getPyoncordDirectory(context);
            File file = new File(pyoncordDirectory, "loader.json");
            if (file.exists()) {
                jSONObject = new JSONObject(FilesKt.readText$default(file, null, 1, null));
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("loadReactDevTools", false);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customLoadUrl");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.put("enabled", enabled);
            jSONObjectOptJSONObject.put("url", url);
            jSONObject.put("customLoadUrl", jSONObjectOptJSONObject);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt.writeText$default(file, string, null, 2, null);
            if (enabled) {
                new File(pyoncordDirectory, Constants.MAIN_SCRIPT_FILE).delete();
                Toast.makeText(context, "Custom bundle enabled", 0).show();
            } else {
                Toast.makeText(context, "Custom bundle disabled", 0).show();
            }
            Utils.INSTANCE.reloadApp();
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error setting custom bundle URL: " + e.getMessage());
            showError(context, "Failed to save configuration", e.getMessage());
        }
    }

    public final void deleteDevtools(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(LogBoxUtils.INSTANCE.getPyoncordDirectory(context), "preloads/reactDevtools.js");
            if (file.exists()) {
                if (file.delete()) {
                    Toast.makeText(context, "Devtools deleted", 0).show();
                    return;
                } else {
                    Toast.makeText(context, "Failed to delete Devtools", 0).show();
                    return;
                }
            }
            Toast.makeText(context, "Devtools not found", 0).show();
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error deleting Devtools: " + e.getMessage());
            showError(context, "Failed to delete Devtools", e.getMessage());
        }
    }

    public final void showError(Context context, String title, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        LogBoxMenu.INSTANCE.showErrorDialog(context, title, message);
    }
}
