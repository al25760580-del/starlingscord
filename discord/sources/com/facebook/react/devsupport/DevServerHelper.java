package com.facebook.react.devsupport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.inspector.DevSupportHttpClient;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.NotificationOnlyHandler;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.util.RNLog;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.x;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import rs.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 O2\u00020\u0001:\u0003MNOB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020$J\u0006\u0010*\u001a\u00020$J\u0006\u0010+\u001a\u00020$J6\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0002\u00104\u001a\u000205H\u0007J\u0018\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0002J6\u00109\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020;2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u0010<\u001a\u00020\u001e2\b\b\u0002\u0010=\u001a\u00020\u001eH\u0002J\u0010\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000bH\u0016J\u0010\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000bH\u0016J\u0010\u0010A\u001a\u00020$2\u0006\u0010-\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000bH\u0016J\u0010\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000bH\u0016J\u0018\u0010F\u001a\u0004\u0018\u0001002\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010/\u001a\u000200J$\u0010H\u001a\u00020$2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\b\u0010L\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006P"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper;", "", "settings", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "applicationContext", "Landroid/content/Context;", "packagerConnectionSettings", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "<init>", "(Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;Landroid/content/Context;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;)V", "websocketProxyURL", "", "getWebsocketProxyURL", "()Ljava/lang/String;", "client", "Lokhttp3/OkHttpClient;", "bundleDownloader", "Lcom/facebook/react/devsupport/BundleDownloader;", "packagerStatusCheck", "Lcom/facebook/react/devsupport/PackagerStatusCheck;", "packageName", "packagerClient", "Lcom/facebook/react/packagerconnection/JSPackagerClient;", "inspectorPackagerConnection", "Lcom/facebook/react/devsupport/IInspectorPackagerConnection;", "inspectorDeviceId", "getInspectorDeviceId", "inspectorDeviceUrl", "getInspectorDeviceUrl", "devMode", "", "getDevMode", "()Z", "jSMinifyMode", "getJSMinifyMode", "openPackagerConnection", "", "clientId", "commandListener", "Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "closePackagerConnection", "openInspectorConnection", "disableDebugger", "closeInspectorConnection", "downloadBundleFromURL", "callback", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "outputFile", "Ljava/io/File;", "bundleURL", "bundleInfo", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "requestBuilder", "Lokhttp3/Request$Builder;", "createSplitBundleURL", "mainModuleID", "host", "createBundleURL", "type", "Lcom/facebook/react/devsupport/DevServerHelper$BundleType;", "modulesOnly", "runModule", "getDevServerBundleURL", "jsModulePath", "getDevServerSplitBundleURL", "isPackagerRunning", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "getSourceMapUrl", "mainModuleName", "getSourceUrl", "downloadBundleResourceFromUrlSync", "resourcePath", "openDebugger", "context", "Lcom/facebook/react/bridge/ReactContext;", "errorMessage", "panel", "PackagerCommandListener", "BundleType", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public class DevServerHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEBUGGER_MSG_DISABLE = "{ \"id\":1,\"method\":\"Debugger.disable\" }";

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final BundleDownloader bundleDownloader;

    @NotNull
    private final OkHttpClient client;
    private IInspectorPackagerConnection inspectorPackagerConnection;

    @NotNull
    private final String packageName;
    private JSPackagerClient packagerClient;

    @NotNull
    private final PackagerConnectionSettings packagerConnectionSettings;

    @NotNull
    private final PackagerStatusCheck packagerStatusCheck;

    @NotNull
    private final DeveloperSettings settings;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$BundleType;", "", "typeID", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeID", "()Ljava/lang/String;", "BUNDLE", "MAP", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum BundleType {
        BUNDLE("bundle"),
        MAP("map");

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        private final String typeID;

        BundleType(String str) {
            this.typeID = str;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getTypeID() {
            return this.typeID;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$Companion;", "", "<init>", "()V", "DEBUGGER_MSG_DISABLE", "", "getSHA256", "string", "createResourceURL", "host", "resourcePathParam", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createResourceURL(String host, String resourcePathParam) {
            if (x.o(resourcePathParam, "/", false)) {
                o8.a.v(ReactConstants.TAG, "Resource path should not begin with `/`, removing it.");
                resourcePathParam = resourcePathParam.substring(1);
                Intrinsics.checkNotNullExpressionValue(resourcePathParam, "substring(...)");
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return a3.e.q(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(host), host, resourcePathParam}, 3, Locale.US, "%s://%s/%s", "format(...)");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getSHA256(String string) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.reset();
                try {
                    Charset charsetForName = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                    byte[] bytes = string.getBytes(charsetForName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    byte[] bArrDigest = messageDigest.digest(bytes);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19])}, 20));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    return str;
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError("This environment doesn't support UTF-8 encoding", e10);
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new AssertionError("Could not get standard SHA-256 algorithm", e11);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "", "onPackagerConnected", "", "onPackagerDisconnected", "onPackagerReloadCommand", "onPackagerDevMenuCommand", "customCommandHandlers", "", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PackagerCommandListener {
        Map<String, RequestHandler> customCommandHandlers();

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();
    }

    public DevServerHelper(@NotNull DeveloperSettings settings, @NotNull Context applicationContext, @NotNull PackagerConnectionSettings packagerConnectionSettings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(packagerConnectionSettings, "packagerConnectionSettings");
        this.settings = settings;
        this.applicationContext = applicationContext;
        this.packagerConnectionSettings = packagerConnectionSettings;
        OkHttpClient httpClient$ReactAndroid_release = DevSupportHttpClient.INSTANCE.getHttpClient$ReactAndroid_release();
        this.client = httpClient$ReactAndroid_release;
        this.bundleDownloader = new BundleDownloader(httpClient$ReactAndroid_release);
        this.packagerStatusCheck = new PackagerStatusCheck(httpClient$ReactAndroid_release);
        String packageName = applicationContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.packageName = packageName;
    }

    private final String createBundleURL(String mainModuleID, BundleType type, String host, boolean modulesOnly, boolean runModule) {
        boolean devMode = getDevMode();
        StringBuilder sb2 = new StringBuilder();
        PackagerConnectionSettings packagerConnectionSettings = this.packagerConnectionSettings;
        for (Map.Entry<String, String> entry : packagerConnectionSettings.updatePackagerOptions(packagerConnectionSettings.getAdditionalOptionsForPackager()).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() != 0) {
                sb2.append("&" + key + "=" + Uri.encode(value));
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return a3.e.q(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(host), host, mainModuleID, type.getTypeID(), Boolean.valueOf(devMode), Boolean.valueOf(devMode), Boolean.valueOf(getJSMinifyMode()), this.packageName, modulesOnly ? "true" : "false", runModule ? "true" : "false"}, 10, Locale.US, "%s://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", "format(...)") + (InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "") + ((Object) sb2);
    }

    public static /* synthetic */ String createBundleURL$default(DevServerHelper devServerHelper, String str, BundleType bundleType, String str2, boolean z5, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBundleURL");
        }
        if ((i7 & 4) != 0) {
            str2 = devServerHelper.packagerConnectionSettings.getDebugServerHost();
        }
        String str3 = str2;
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        boolean z7 = z5;
        if ((i7 & 16) != 0) {
            z6 = true;
        }
        return devServerHelper.createBundleURL(str, bundleType, str3, z7, z6);
    }

    private final String createSplitBundleURL(String mainModuleID, String host) {
        return createBundleURL(mainModuleID, BundleType.BUNDLE, host, true, false);
    }

    public static /* synthetic */ void downloadBundleFromURL$default(DevServerHelper devServerHelper, DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo, Request.Builder builder, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadBundleFromURL");
        }
        if ((i7 & 16) != 0) {
            builder = new Request.Builder();
        }
        devServerHelper.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, builder);
    }

    private final boolean getDevMode() {
        return this.settings.isJSDevModeEnabled();
    }

    private final String getInspectorDeviceId() {
        String str = this.packageName;
        String string = Settings.Secure.getString(this.applicationContext.getContentResolver(), "android_id");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return Companion.getSHA256(a3.e.q(new Object[]{str, string, InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"}, 3, Locale.US, "android-%s-%s-%s", "format(...)"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInspectorDeviceUrl() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return a3.e.q(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(this.packagerConnectionSettings.getDebugServerHost()), this.packagerConnectionSettings.getDebugServerHost(), Uri.encode(AndroidInfoHelpers.getFriendlyDeviceName()), Uri.encode(this.packageName), Uri.encode(getInspectorDeviceId()), Boolean.valueOf(InspectorFlags.getIsProfilingBuild())}, 6, Locale.US, "%s://%s/inspector/device?name=%s&app=%s&device=%s&profiling=%b", "format(...)");
    }

    private final boolean getJSMinifyMode() {
        return this.settings.isJSMinifyEnabled();
    }

    public final void closeInspectorConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.closeInspectorConnection.1
            @Override // android.os.AsyncTask
            @rn.d
            public Void doInBackground(Void... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                IInspectorPackagerConnection iInspectorPackagerConnection = DevServerHelper.this.inspectorPackagerConnection;
                if (iInspectorPackagerConnection != null) {
                    iInspectorPackagerConnection.closeQuietly();
                }
                DevServerHelper.this.inspectorPackagerConnection = null;
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void closePackagerConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.closePackagerConnection.1
            @Override // android.os.AsyncTask
            @rn.d
            public Void doInBackground(Void... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                JSPackagerClient jSPackagerClient = DevServerHelper.this.packagerClient;
                if (jSPackagerClient != null) {
                    jSPackagerClient.close();
                }
                DevServerHelper.this.packagerClient = null;
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void disableDebugger() {
        IInspectorPackagerConnection iInspectorPackagerConnection = this.inspectorPackagerConnection;
        if (iInspectorPackagerConnection != null) {
            iInspectorPackagerConnection.sendEventToAllConnections(DEBUGGER_MSG_DISABLE);
        }
    }

    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, String str, BundleDownloader.BundleInfo bundleInfo) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        downloadBundleFromURL$default(this, callback, outputFile, str, bundleInfo, null, 16, null);
    }

    public final File downloadBundleResourceFromUrlSync(@NotNull String resourcePath, @NotNull File outputFile) {
        Intrinsics.checkNotNullParameter(resourcePath, "resourcePath");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        String strCreateResourceURL = Companion.createResourceURL(this.packagerConnectionSettings.getDebugServerHost(), resourcePath);
        Request.Builder builder = new Request.Builder();
        builder.i(strCreateResourceURL);
        try {
            Response responseE = this.client.a(builder.b()).e();
            try {
                boolean zG = responseE.g();
                ResponseBody responseBody = responseE.f17385y;
                if (!zG || responseBody == null) {
                    responseE.close();
                    return null;
                }
                Intrinsics.checkNotNullParameter(outputFile, "file");
                rs.a aVarK = v.k(outputFile);
                try {
                    BufferedSource source = responseBody.source();
                    Intrinsics.checkNotNull(source);
                    Intrinsics.checkNotNullParameter(source, "source");
                    v.d(source).Z(aVarK);
                    aVarK.close();
                    responseE.close();
                    return outputFile;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(aVarK, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ls.d.k(responseE, th4);
                    throw th5;
                }
            }
        } catch (Exception e10) {
            o8.a.i(ReactConstants.TAG, "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", resourcePath, outputFile.getAbsolutePath(), e10);
            return null;
        }
        o8.a.i(ReactConstants.TAG, "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", resourcePath, outputFile.getAbsolutePath(), e10);
        return null;
    }

    @NotNull
    public String getDevServerBundleURL(@NotNull String jsModulePath) {
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        return createBundleURL$default(this, jsModulePath, BundleType.BUNDLE, this.packagerConnectionSettings.getDebugServerHost(), false, false, 24, null);
    }

    @NotNull
    public String getDevServerSplitBundleURL(@NotNull String jsModulePath) {
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        return createSplitBundleURL(jsModulePath, this.packagerConnectionSettings.getDebugServerHost());
    }

    @NotNull
    public String getSourceMapUrl(@NotNull String mainModuleName) {
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        return createBundleURL$default(this, mainModuleName, BundleType.MAP, null, false, false, 28, null);
    }

    @NotNull
    public String getSourceUrl(@NotNull String mainModuleName) {
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        return createBundleURL$default(this, mainModuleName, BundleType.BUNDLE, null, false, false, 28, null);
    }

    @NotNull
    public final String getWebsocketProxyURL() {
        return DevSupportHttpClient.INSTANCE.wsScheme$ReactAndroid_release(this.packagerConnectionSettings.getDebugServerHost()) + "://" + this.packagerConnectionSettings.getDebugServerHost() + "/debugger-proxy?role=client";
    }

    public void isPackagerRunning(@NotNull PackagerStatusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.packagerStatusCheck.run(this.packagerConnectionSettings.getDebugServerHost(), callback);
    }

    public final void openDebugger(final ReactContext context, final String errorMessage, String panel) {
        StringBuilder sb2 = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        sb2.append(a3.e.q(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(this.packagerConnectionSettings.getDebugServerHost()), this.packagerConnectionSettings.getDebugServerHost(), Uri.encode(getInspectorDeviceId())}, 3, Locale.US, "%s://%s/open-debugger?device=%s", "format(...)"));
        if (panel != null) {
            sb2.append("&panel=" + Uri.encode(panel));
        }
        Request.Builder builder = new Request.Builder();
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        builder.i(string);
        RequestBody.Companion.getClass();
        Intrinsics.checkNotNullParameter("", "content");
        builder.f("POST", RequestBody.Companion.a("", null));
        this.client.a(builder.b()).d(new cs.h() { // from class: com.facebook.react.devsupport.DevServerHelper.openDebugger.1
            @Override // cs.h
            public void onFailure(Call call, IOException e10) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                ReactContext reactContext = context;
                String str = errorMessage;
                if (str == null) {
                    str = "openDebugger error";
                }
                RNLog.w(reactContext, str);
            }

            @Override // cs.h
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
            }
        });
    }

    public final void openInspectorConnection() {
        if (this.inspectorPackagerConnection != null) {
            o8.a.v(ReactConstants.TAG, "Inspector connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.openInspectorConnection.1
                @Override // android.os.AsyncTask
                @rn.d
                public Void doInBackground(Void... params) {
                    Intrinsics.checkNotNullParameter(params, "params");
                    String str = AndroidInfoHelpers.getInspectorHostMetadata(DevServerHelper.this.applicationContext).get("deviceName");
                    if (str == null) {
                        o8.a.v(ReactConstants.TAG, "Could not get device name from Inspector Host Metadata.");
                        return null;
                    }
                    DevServerHelper devServerHelper = DevServerHelper.this;
                    CxxInspectorPackagerConnection cxxInspectorPackagerConnection = new CxxInspectorPackagerConnection(DevServerHelper.this.getInspectorDeviceUrl(), str, DevServerHelper.this.packageName);
                    cxxInspectorPackagerConnection.connect();
                    devServerHelper.inspectorPackagerConnection = cxxInspectorPackagerConnection;
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void openPackagerConnection(final String clientId, @NotNull final PackagerCommandListener commandListener) {
        Intrinsics.checkNotNullParameter(commandListener, "commandListener");
        if (this.packagerClient != null) {
            o8.a.v(ReactConstants.TAG, "Packager connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.openPackagerConnection.1
                @Override // android.os.AsyncTask
                @rn.d
                public Void doInBackground(Void... backgroundParams) {
                    Intrinsics.checkNotNullParameter(backgroundParams, "backgroundParams");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final PackagerCommandListener packagerCommandListener = commandListener;
                    linkedHashMap.put("reload", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$1
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object params) {
                            packagerCommandListener.onPackagerReloadCommand();
                        }
                    });
                    final PackagerCommandListener packagerCommandListener2 = commandListener;
                    linkedHashMap.put("devMenu", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$2
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object params) {
                            packagerCommandListener2.onPackagerDevMenuCommand();
                        }
                    });
                    Map<String, RequestHandler> mapCustomCommandHandlers = commandListener.customCommandHandlers();
                    if (mapCustomCommandHandlers != null) {
                        linkedHashMap.putAll(mapCustomCommandHandlers);
                    }
                    linkedHashMap.putAll(new FileIoHandler().handlers());
                    final PackagerCommandListener packagerCommandListener3 = commandListener;
                    ReconnectingWebSocket.ConnectionCallback connectionCallback = new ReconnectingWebSocket.ConnectionCallback() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$onPackagerConnectedCallback$1
                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onConnected() {
                            packagerCommandListener3.onPackagerConnected();
                        }

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onDisconnected() {
                            packagerCommandListener3.onPackagerDisconnected();
                        }
                    };
                    if (clientId == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    DevServerHelper devServerHelper = this;
                    JSPackagerClient jSPackagerClient = new JSPackagerClient(clientId, this.packagerConnectionSettings, linkedHashMap, connectionCallback);
                    jSPackagerClient.init();
                    devServerHelper.packagerClient = jSPackagerClient;
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, String bundleURL, BundleDownloader.BundleInfo bundleInfo, @NotNull Request.Builder requestBuilder) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        this.bundleDownloader.downloadBundleFromURL(callback, outputFile, bundleURL, bundleInfo, requestBuilder);
    }
}
