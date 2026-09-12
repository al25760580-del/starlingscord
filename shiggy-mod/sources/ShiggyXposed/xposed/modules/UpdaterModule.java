package ShiggyXposed.xposed.modules;

import ShiggyXposed.xposed.Constants;
import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import ShiggyXposed.xposed.modules.bridge.BridgeModule;
import android.app.Activity;
import android.content.Context;
import android.util.AtomicFile;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientKt;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.cio.CIO;
import io.ktor.client.plugins.HttpRedirectConfig;
import io.ktor.client.plugins.HttpRedirectKt;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.ResponseException;
import io.ktor.client.plugins.UserAgentConfig;
import io.ktor.client.plugins.UserAgentKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.reflect.TypeInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: UpdaterModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010#\u001a\u00020\u0007J\u0016\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&H\u0082@¢\u0006\u0002\u0010'J \u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\rH\u0016J\u0016\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007J\u0012\u00100\u001a\u00020\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"LShiggyXposed/xposed/modules/UpdaterModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "config", "LShiggyXposed/xposed/modules/LoaderConfig;", "isCustomUrlEnabled", "", "()Z", "scope", "Lkotlinx/coroutines/CoroutineScope;", "lastActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "cacheDir", "Ljava/io/File;", "bundle", "etag", "TIMEOUT_STRICT", "", "MIN_BYTECODE_SIZE", "", "ETAG_FILE", "", "CONFIG_FILE", "DEFAULT_BASE_URL", "FALLBACK_BASE_URL", "DEFAULT_BUNDLE_NAME", "onLoad", "", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "downloadScript", "Lkotlinx/coroutines/Job;", "activity", "showUpdateDialog", "resolveTargetUrl", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryResolveUrl", "baseUrl", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActivity", "setDisableInjection", "context", "Landroid/content/Context;", "disabled", "isInjectionDisabled", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UpdaterModule extends Module {
    private static final String CONFIG_FILE = "loader.json";
    private static final String DEFAULT_BASE_URL = "https://github.com/kmmiio99o/ShiggyCord/releases/latest/download/";
    private static final String DEFAULT_BUNDLE_NAME = "shiggycord.min.js";
    private static final String ETAG_FILE = "etag.txt";
    private static final String FALLBACK_BASE_URL = "https://bundle.shiggycord.dev/";
    private static final int MIN_BYTECODE_SIZE = 512;
    private static final long TIMEOUT_STRICT = 15000;
    private static File bundle;
    private static File cacheDir;
    private static LoaderConfig config;
    private static File etag;
    private static WeakReference<Activity> lastActivity;
    public static final UpdaterModule INSTANCE = new UpdaterModule();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    /* JADX INFO: renamed from: ShiggyXposed.xposed.modules.UpdaterModule$resolveTargetUrl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UpdaterModule.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "ShiggyXposed.xposed.modules.UpdaterModule", f = "UpdaterModule.kt", i = {0, 0}, l = {138, 139}, m = "resolveTargetUrl", n = {"this", "client"}, s = {"L$0", "L$1"})
    static final class C00121 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00121(Continuation<? super C00121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdaterModule.this.resolveTargetUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: ShiggyXposed.xposed.modules.UpdaterModule$tryResolveUrl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UpdaterModule.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "ShiggyXposed.xposed.modules.UpdaterModule", f = "UpdaterModule.kt", i = {0, 1, 2, 2}, l = {193, 147, 148}, m = "tryResolveUrl", n = {"baseUrl", "baseUrl", "baseUrl", "info"}, s = {"L$0", "L$0", "L$0", "L$1"})
    static final class C00131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00131(Continuation<? super C00131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdaterModule.this.tryResolveUrl(null, null, this);
        }
    }

    private UpdaterModule() {
    }

    public final boolean isCustomUrlEnabled() {
        LoaderConfig loaderConfig = config;
        if (loaderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            loaderConfig = null;
        }
        return loaderConfig.getCustomLoadUrl().getEnabled();
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) {
        Object objM453constructorimpl;
        LoaderConfig loaderConfig;
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        File file = new File(packageParam.appInfo.dataDir, Constants.CACHE_DIR);
        file.mkdirs();
        cacheDir = file;
        File file2 = new File(packageParam.appInfo.dataDir, Constants.FILES_DIR);
        file2.mkdirs();
        File file3 = cacheDir;
        if (file3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cacheDir");
            file3 = null;
        }
        bundle = new File(file3, Constants.MAIN_SCRIPT_FILE);
        File file4 = cacheDir;
        if (file4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cacheDir");
            file4 = null;
        }
        etag = new File(file4, ETAG_FILE);
        File file5 = new File(file2, CONFIG_FILE);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!file5.exists()) {
                loaderConfig = new LoaderConfig((CustomLoadUrl) null, false, 3, (DefaultConstructorMarker) null);
            } else {
                Json json = Utils.INSTANCE.getJSON();
                String text$default = FilesKt.readText$default(file5, null, 1, null);
                json.getSerializersModule();
                loaderConfig = (LoaderConfig) json.decodeFromString(LoaderConfig.INSTANCE.serializer(), text$default);
            }
            objM453constructorimpl = Result.m453constructorimpl(loaderConfig);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM453constructorimpl = Result.m453constructorimpl(ResultKt.createFailure(th));
        }
        LoaderConfig loaderConfig2 = new LoaderConfig((CustomLoadUrl) null, false, 3, (DefaultConstructorMarker) null);
        if (Result.m459isFailureimpl(objM453constructorimpl)) {
            objM453constructorimpl = loaderConfig2;
        }
        config = (LoaderConfig) objM453constructorimpl;
        BridgeModule.INSTANCE.registerMethod("revenge.updater.clear", new Function1() { // from class: ShiggyXposed.xposed.modules.UpdaterModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdaterModule.onLoad$lambda$4$lambda$3((ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onLoad$lambda$4$lambda$3(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        File file = bundle;
        if (file == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bundle");
            file = null;
        }
        if (file.exists()) {
            File file2 = bundle;
            if (file2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bundle");
                file2 = null;
            }
            file2.delete();
        }
        File file3 = etag;
        if (file3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etag");
            file3 = null;
        }
        if (file3.exists()) {
            File file4 = etag;
            if (file4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etag");
                file4 = null;
            }
            file4.delete();
        }
        return null;
    }

    /* JADX INFO: renamed from: ShiggyXposed.xposed.modules.UpdaterModule$downloadScript$1, reason: invalid class name */
    /* JADX INFO: compiled from: UpdaterModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "ShiggyXposed.xposed.modules.UpdaterModule$downloadScript$1", f = "UpdaterModule.kt", i = {0, 2}, l = {90, 189, 190}, m = "invokeSuspend", n = {"client", "response"}, s = {"L$1", "L$1"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ce A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #6 {all -> 0x003d, blocks: (B:15:0x0038, B:34:0x00bc, B:36:0x00ce, B:40:0x00dc, B:71:0x0189, B:73:0x0195, B:76:0x01a0, B:77:0x01b6), top: B:98:0x0038 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f4 A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00fb A[Catch: all -> 0x0029, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0103 A[Catch: all -> 0x0029, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0128 A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x012e A[Catch: all -> 0x0029, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0136 A[Catch: all -> 0x0029, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x013c A[Catch: all -> 0x0029, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0167 A[Catch: all -> 0x0029, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0181 A[Catch: all -> 0x0029, TryCatch #2 {all -> 0x0029, blocks: (B:8:0x0024, B:45:0x00f4, B:47:0x00fb, B:49:0x0103, B:50:0x0109, B:51:0x0110, B:52:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x0132, B:63:0x0147, B:59:0x0136, B:61:0x013c, B:62:0x0140, B:65:0x0163, B:66:0x0166, B:67:0x0167, B:68:0x0180, B:69:0x0181, B:70:0x0188), top: B:91:0x0024, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x0189 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #6 {all -> 0x003d, blocks: (B:15:0x0038, B:34:0x00bc, B:36:0x00ce, B:40:0x00dc, B:71:0x0189, B:73:0x0195, B:76:0x01a0, B:77:0x01b6), top: B:98:0x0038 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x0195 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #6 {all -> 0x003d, blocks: (B:15:0x0038, B:34:0x00bc, B:36:0x00ce, B:40:0x00dc, B:71:0x0189, B:73:0x0195, B:76:0x01a0, B:77:0x01b6), top: B:98:0x0038 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x01a0 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #6 {all -> 0x003d, blocks: (B:15:0x0038, B:34:0x00bc, B:36:0x00ce, B:40:0x00dc, B:71:0x0189, B:73:0x0195, B:76:0x01a0, B:77:0x01b6), top: B:98:0x0038 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Closeable closeable;
            Throwable th;
            HttpClient httpClient;
            Closeable closeable2;
            Closeable closeable3;
            HttpResponse httpResponse;
            HttpStatusCode status;
            KType kTypeTypeOf;
            Object objBodyNullable;
            HttpResponse httpResponse2;
            byte[] bArr;
            AtomicFile atomicFile;
            File file;
            FileOutputStream fileOutputStreamStartWrite;
            String str;
            File file2;
            File file3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpClient HttpClient = HttpClientKt.HttpClient(CIO.INSTANCE, new Function1() { // from class: ShiggyXposed.xposed.modules.UpdaterModule$downloadScript$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return UpdaterModule.AnonymousClass1.invokeSuspend$lambda$3((HttpClientConfig) obj2);
                        }
                    });
                    try {
                        httpClient = HttpClient;
                        UpdaterModule updaterModule = UpdaterModule.INSTANCE;
                        this.L$0 = HttpClient;
                        this.L$1 = httpClient;
                        this.label = 1;
                        Object objResolveTargetUrl = updaterModule.resolveTargetUrl(httpClient, this);
                        if (objResolveTargetUrl != coroutine_suspended) {
                            closeable2 = HttpClient;
                            obj = objResolveTargetUrl;
                            String str2 = (String) obj;
                            Utils.Log.INSTANCE.i("Fetching bundle: " + str2);
                            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                            HttpRequestKt.url(httpRequestBuilder, str2);
                            HttpRequestKt.headers(httpRequestBuilder, new Function1() { // from class: ShiggyXposed.xposed.modules.UpdaterModule$downloadScript$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return UpdaterModule.AnonymousClass1.invokeSuspend$lambda$8$lambda$5$lambda$4((HeadersBuilder) obj2);
                                }
                            });
                            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                            HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                            this.L$0 = closeable2;
                            this.L$1 = null;
                            this.label = 2;
                            obj = httpStatement.execute(this);
                            if (obj != coroutine_suspended) {
                                closeable3 = closeable2;
                                httpResponse = (HttpResponse) obj;
                                status = httpResponse.getStatus();
                                if (!Intrinsics.areEqual(status, HttpStatusCode.INSTANCE.getOK())) {
                                    if (!Intrinsics.areEqual(status, HttpStatusCode.INSTANCE.getNotModified())) {
                                        throw new ResponseException(httpResponse, "HTTP " + httpResponse.getStatus());
                                    }
                                    Utils.Log.INSTANCE.i("Bundle is up to date (304)");
                                } else {
                                    HttpClientCall call = httpResponse.getCall();
                                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
                                    kTypeTypeOf = Reflection.typeOf(byte[].class);
                                    TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kTypeTypeOf);
                                    this.L$0 = closeable3;
                                    this.L$1 = httpResponse;
                                    this.label = 3;
                                    objBodyNullable = call.bodyNullable(typeInfo, this);
                                    if (objBodyNullable != coroutine_suspended) {
                                        httpResponse2 = httpResponse;
                                        obj = objBodyNullable;
                                        closeable = closeable3;
                                        if (obj != null) {
                                            bArr = (byte[]) obj;
                                            if (bArr.length >= 512) {
                                                file = UpdaterModule.bundle;
                                                if (file == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("bundle");
                                                    file = null;
                                                }
                                                atomicFile = new AtomicFile(file);
                                                fileOutputStreamStartWrite = atomicFile.startWrite();
                                                fileOutputStreamStartWrite.write(bArr);
                                                atomicFile.finishWrite(fileOutputStreamStartWrite);
                                                str = httpResponse2.getHeaders().get(HttpHeaders.INSTANCE.getETag());
                                                if (str != null) {
                                                    file3 = UpdaterModule.etag;
                                                    if (file3 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("etag");
                                                        file3 = null;
                                                    }
                                                    FilesKt.writeText$default(file3, str, null, 2, null);
                                                } else {
                                                    file2 = UpdaterModule.etag;
                                                    if (file2 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("etag");
                                                        file2 = null;
                                                    }
                                                    Boxing.boxBoolean(file2.delete());
                                                }
                                                Utils.Log.INSTANCE.i("Bundle updated: " + bArr.length + " bytes");
                                                closeable3 = closeable;
                                            } else {
                                                throw new Exception("Payload too small (" + bArr.length + " bytes). Possible corrupt build.");
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                        }
                                    }
                                }
                                CloseableKt.closeFinally(closeable3, null);
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        closeable = HttpClient;
                        th = th2;
                        throw th;
                    }
                }
                if (i == 1) {
                    httpClient = (HttpClient) this.L$1;
                    closeable2 = (Closeable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        String str3 = (String) obj;
                        Utils.Log.INSTANCE.i("Fetching bundle: " + str3);
                        HttpRequestBuilder httpRequestBuilder2 = new HttpRequestBuilder();
                        HttpRequestKt.url(httpRequestBuilder2, str3);
                        HttpRequestKt.headers(httpRequestBuilder2, new Function1() { // from class: ShiggyXposed.xposed.modules.UpdaterModule$downloadScript$1$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return UpdaterModule.AnonymousClass1.invokeSuspend$lambda$8$lambda$5$lambda$4((HeadersBuilder) obj2);
                            }
                        });
                        httpRequestBuilder2.setMethod(HttpMethod.INSTANCE.getGet());
                        HttpStatement httpStatement2 = new HttpStatement(httpRequestBuilder2, httpClient);
                        this.L$0 = closeable2;
                        this.L$1 = null;
                        this.label = 2;
                        obj = httpStatement2.execute(this);
                        if (obj != coroutine_suspended) {
                            closeable3 = closeable2;
                            httpResponse = (HttpResponse) obj;
                            status = httpResponse.getStatus();
                            if (!Intrinsics.areEqual(status, HttpStatusCode.INSTANCE.getOK())) {
                                if (!Intrinsics.areEqual(status, HttpStatusCode.INSTANCE.getNotModified())) {
                                    throw new ResponseException(httpResponse, "HTTP " + httpResponse.getStatus());
                                }
                                Utils.Log.INSTANCE.i("Bundle is up to date (304)");
                            } else {
                                HttpClientCall call2 = httpResponse.getCall();
                                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(byte[].class);
                                kTypeTypeOf = Reflection.typeOf(byte[].class);
                                TypeInfo typeInfo2 = new TypeInfo(orCreateKotlinClass2, kTypeTypeOf);
                                this.L$0 = closeable3;
                                this.L$1 = httpResponse;
                                this.label = 3;
                                objBodyNullable = call2.bodyNullable(typeInfo2, this);
                                if (objBodyNullable != coroutine_suspended) {
                                    httpResponse2 = httpResponse;
                                    obj = objBodyNullable;
                                    closeable = closeable3;
                                    if (obj != null) {
                                        bArr = (byte[]) obj;
                                        if (bArr.length >= 512) {
                                            file = UpdaterModule.bundle;
                                            if (file == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("bundle");
                                                file = null;
                                            }
                                            atomicFile = new AtomicFile(file);
                                            fileOutputStreamStartWrite = atomicFile.startWrite();
                                            fileOutputStreamStartWrite.write(bArr);
                                            atomicFile.finishWrite(fileOutputStreamStartWrite);
                                            str = httpResponse2.getHeaders().get(HttpHeaders.INSTANCE.getETag());
                                            if (str != null) {
                                                file3 = UpdaterModule.etag;
                                                if (file3 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("etag");
                                                    file3 = null;
                                                }
                                                FilesKt.writeText$default(file3, str, null, 2, null);
                                            } else {
                                                file2 = UpdaterModule.etag;
                                                if (file2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("etag");
                                                    file2 = null;
                                                }
                                                Boxing.boxBoolean(file2.delete());
                                            }
                                            Utils.Log.INSTANCE.i("Bundle updated: " + bArr.length + " bytes");
                                            closeable3 = closeable;
                                        } else {
                                            throw new Exception("Payload too small (" + bArr.length + " bytes). Possible corrupt build.");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                    }
                                }
                            }
                            CloseableKt.closeFinally(closeable3, null);
                        }
                        return coroutine_suspended;
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = closeable2;
                        throw th;
                    }
                }
                if (i == 2) {
                    closeable3 = (Closeable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        httpResponse = (HttpResponse) obj;
                        status = httpResponse.getStatus();
                        if (!Intrinsics.areEqual(status, HttpStatusCode.INSTANCE.getOK())) {
                            if (!Intrinsics.areEqual(status, HttpStatusCode.INSTANCE.getNotModified())) {
                                throw new ResponseException(httpResponse, "HTTP " + httpResponse.getStatus());
                            }
                            Utils.Log.INSTANCE.i("Bundle is up to date (304)");
                        } else {
                            HttpClientCall call3 = httpResponse.getCall();
                            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(byte[].class);
                            try {
                                kTypeTypeOf = Reflection.typeOf(byte[].class);
                            } catch (Throwable unused) {
                                kTypeTypeOf = null;
                            }
                            TypeInfo typeInfo3 = new TypeInfo(orCreateKotlinClass3, kTypeTypeOf);
                            this.L$0 = closeable3;
                            this.L$1 = httpResponse;
                            this.label = 3;
                            objBodyNullable = call3.bodyNullable(typeInfo3, this);
                            if (objBodyNullable != coroutine_suspended) {
                                httpResponse2 = httpResponse;
                                obj = objBodyNullable;
                                closeable = closeable3;
                                if (obj != null) {
                                    bArr = (byte[]) obj;
                                    if (bArr.length >= 512) {
                                        file = UpdaterModule.bundle;
                                        if (file == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("bundle");
                                            file = null;
                                        }
                                        atomicFile = new AtomicFile(file);
                                        fileOutputStreamStartWrite = atomicFile.startWrite();
                                        fileOutputStreamStartWrite.write(bArr);
                                        atomicFile.finishWrite(fileOutputStreamStartWrite);
                                        str = httpResponse2.getHeaders().get(HttpHeaders.INSTANCE.getETag());
                                        if (str != null) {
                                            file3 = UpdaterModule.etag;
                                            if (file3 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("etag");
                                                file3 = null;
                                            }
                                            FilesKt.writeText$default(file3, str, null, 2, null);
                                        } else {
                                            file2 = UpdaterModule.etag;
                                            if (file2 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("etag");
                                                file2 = null;
                                            }
                                            Boxing.boxBoolean(file2.delete());
                                        }
                                        Utils.Log.INSTANCE.i("Bundle updated: " + bArr.length + " bytes");
                                        closeable3 = closeable;
                                    } else {
                                        throw new Exception("Payload too small (" + bArr.length + " bytes). Possible corrupt build.");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                }
                            }
                            return coroutine_suspended;
                        }
                        CloseableKt.closeFinally(closeable3, null);
                    } catch (Throwable th4) {
                        th = th4;
                        closeable = closeable3;
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpResponse2 = (HttpResponse) this.L$1;
                    closeable = (Closeable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (obj != null) {
                            bArr = (byte[]) obj;
                            if (bArr.length >= 512) {
                                file = UpdaterModule.bundle;
                                if (file == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("bundle");
                                    file = null;
                                }
                                atomicFile = new AtomicFile(file);
                                fileOutputStreamStartWrite = atomicFile.startWrite();
                                try {
                                    fileOutputStreamStartWrite.write(bArr);
                                    atomicFile.finishWrite(fileOutputStreamStartWrite);
                                    str = httpResponse2.getHeaders().get(HttpHeaders.INSTANCE.getETag());
                                    if (str != null) {
                                        file3 = UpdaterModule.etag;
                                        if (file3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("etag");
                                            file3 = null;
                                        }
                                        FilesKt.writeText$default(file3, str, null, 2, null);
                                    } else {
                                        file2 = UpdaterModule.etag;
                                        if (file2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("etag");
                                            file2 = null;
                                        }
                                        Boxing.boxBoolean(file2.delete());
                                    }
                                    Utils.Log.INSTANCE.i("Bundle updated: " + bArr.length + " bytes");
                                    closeable3 = closeable;
                                    CloseableKt.closeFinally(closeable3, null);
                                } catch (Exception e) {
                                    atomicFile.failWrite(fileOutputStreamStartWrite);
                                    throw e;
                                }
                            } else {
                                throw new Exception("Payload too small (" + bArr.length + " bytes). Possible corrupt build.");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } catch (Throwable th6) {
                            CloseableKt.closeFinally(closeable, th);
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                Utils.Log.INSTANCE.e("Updater Error", th7);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(HttpClientConfig httpClientConfig) {
            httpClientConfig.setExpectSuccess(false);
            httpClientConfig.install(HttpTimeoutKt.getHttpTimeout(), new Function1() { // from class: ShiggyXposed.xposed.modules.UpdaterModule$downloadScript$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdaterModule.AnonymousClass1.invokeSuspend$lambda$3$lambda$0((HttpTimeoutConfig) obj);
                }
            });
            httpClientConfig.install(UserAgentKt.getUserAgent(), new Function1() { // from class: ShiggyXposed.xposed.modules.UpdaterModule$downloadScript$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdaterModule.AnonymousClass1.invokeSuspend$lambda$3$lambda$1((UserAgentConfig) obj);
                }
            });
            httpClientConfig.install(HttpRedirectKt.getHttpRedirect(), new Function1() { // from class: ShiggyXposed.xposed.modules.UpdaterModule$downloadScript$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdaterModule.AnonymousClass1.invokeSuspend$lambda$3$lambda$2((HttpRedirectConfig) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$0(HttpTimeoutConfig httpTimeoutConfig) {
            Long lValueOf = Long.valueOf(UpdaterModule.TIMEOUT_STRICT);
            httpTimeoutConfig.setRequestTimeoutMillis(lValueOf);
            httpTimeoutConfig.setConnectTimeoutMillis(5000L);
            httpTimeoutConfig.setSocketTimeoutMillis(lValueOf);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$1(UserAgentConfig userAgentConfig) {
            userAgentConfig.setAgent("ShiggyXposed");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$2(HttpRedirectConfig httpRedirectConfig) {
            httpRedirectConfig.setCheckHttpMethod(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$8$lambda$5$lambda$4(HeadersBuilder headersBuilder) {
            File file = UpdaterModule.etag;
            if (file == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etag");
                file = null;
            }
            if (file.exists()) {
                File file2 = UpdaterModule.bundle;
                if (file2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bundle");
                    file2 = null;
                }
                if (file2.exists()) {
                    String ifNoneMatch = HttpHeaders.INSTANCE.getIfNoneMatch();
                    File file3 = UpdaterModule.etag;
                    if (file3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("etag");
                        file3 = null;
                    }
                    headersBuilder.append(ifNoneMatch, FilesKt.readText$default(file3, null, 1, null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Job downloadScript$default(UpdaterModule updaterModule, Activity activity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return updaterModule.downloadScript(activity, z);
    }

    public final Job downloadScript(Activity activity, boolean showUpdateDialog) {
        return BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r8 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveTargetUrl(io.ktor.client.HttpClient r7, kotlin.coroutines.Continuation<? super java.lang.String> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ShiggyXposed.xposed.modules.UpdaterModule.C00121
            if (r0 == 0) goto L14
            r0 = r8
            ShiggyXposed.xposed.modules.UpdaterModule$resolveTargetUrl$1 r0 = (ShiggyXposed.xposed.modules.UpdaterModule.C00121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            ShiggyXposed.xposed.modules.UpdaterModule$resolveTargetUrl$1 r0 = new ShiggyXposed.xposed.modules.UpdaterModule$resolveTargetUrl$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r8)
            goto La7
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.L$1
            io.ktor.client.HttpClient r7 = (io.ktor.client.HttpClient) r7
            java.lang.Object r2 = r0.L$0
            ShiggyXposed.xposed.modules.UpdaterModule r2 = (ShiggyXposed.xposed.modules.UpdaterModule) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L94
        L43:
            kotlin.ResultKt.throwOnFailure(r8)
            ShiggyXposed.xposed.modules.LoaderConfig r8 = ShiggyXposed.xposed.modules.UpdaterModule.config
            java.lang.String r2 = "config"
            if (r8 != 0) goto L50
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r8 = r5
        L50:
            ShiggyXposed.xposed.modules.CustomLoadUrl r8 = r8.getCustomLoadUrl()
            boolean r8 = r8.getEnabled()
            if (r8 == 0) goto L84
            ShiggyXposed.xposed.modules.LoaderConfig r8 = ShiggyXposed.xposed.modules.UpdaterModule.config
            if (r8 != 0) goto L62
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r8 = r5
        L62:
            ShiggyXposed.xposed.modules.CustomLoadUrl r8 = r8.getCustomLoadUrl()
            java.lang.String r8 = r8.getUrl()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L84
            ShiggyXposed.xposed.modules.LoaderConfig r7 = ShiggyXposed.xposed.modules.UpdaterModule.config
            if (r7 != 0) goto L7a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L7b
        L7a:
            r5 = r7
        L7b:
            ShiggyXposed.xposed.modules.CustomLoadUrl r7 = r5.getCustomLoadUrl()
            java.lang.String r7 = r7.getUrl()
            return r7
        L84:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.String r8 = "https://github.com/kmmiio99o/ShiggyCord/releases/latest/download/"
            java.lang.Object r8 = r6.tryResolveUrl(r7, r8, r0)
            if (r8 != r1) goto L93
            goto La6
        L93:
            r2 = r6
        L94:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto Lae
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.String r8 = "https://bundle.shiggycord.dev/"
            java.lang.Object r8 = r2.tryResolveUrl(r7, r8, r0)
            if (r8 != r1) goto La7
        La6:
            return r1
        La7:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto Lae
            java.lang.String r7 = "https://github.com/kmmiio99o/ShiggyCord/releases/latest/download/shiggycord.min.js"
            return r7
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ShiggyXposed.xposed.modules.UpdaterModule.resolveTargetUrl(io.ktor.client.HttpClient, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        if (r12 == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryResolveUrl(io.ktor.client.HttpClient r10, java.lang.String r11, kotlin.coroutines.Continuation<? super java.lang.String> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ShiggyXposed.xposed.modules.UpdaterModule.tryResolveUrl(io.ktor.client.HttpClient, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ShiggyXposed.xposed.Module
    public void onActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        lastActivity = new WeakReference<>(activity);
    }

    public final void setDisableInjection(Context context, boolean disabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getDataDir(), Constants.FILES_DIR);
        file.mkdirs();
        File file2 = new File(file, CONFIG_FILE);
        LoaderConfig loaderConfig = config;
        if (loaderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            loaderConfig = null;
        }
        LoaderConfig loaderConfigCopy$default = LoaderConfig.copy$default(loaderConfig, null, disabled, 1, null);
        Json json = Utils.INSTANCE.getJSON();
        json.getSerializersModule();
        FilesKt.writeText$default(file2, json.encodeToString(LoaderConfig.INSTANCE.serializer(), loaderConfigCopy$default), null, 2, null);
        config = loaderConfigCopy$default;
        Toast.makeText(context, "Injection ".concat(disabled ? "disabled" : "enabled"), 0).show();
    }

    public static /* synthetic */ boolean isInjectionDisabled$default(UpdaterModule updaterModule, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return updaterModule.isInjectionDisabled(context);
    }

    public final boolean isInjectionDisabled(Context context) {
        LoaderConfig loaderConfig = config;
        if (loaderConfig == null) {
            return false;
        }
        if (loaderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            loaderConfig = null;
        }
        return loaderConfig.getDisableInjection();
    }
}
