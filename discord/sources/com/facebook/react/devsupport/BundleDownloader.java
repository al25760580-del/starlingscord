package com.facebook.react.devsupport;

import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import rs.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002 !B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007J:\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0002JB\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader;", "", "client", "Lokhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "downloadBundleFromURLCall", "Lokhttp3/Call;", "downloadBundleFromURL", "", "callback", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "outputFile", "Ljava/io/File;", "bundleURL", "", "bundleInfo", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "requestBuilder", "Lokhttp3/Request$Builder;", "processMultipartResponse", "url", "response", "Lokhttp3/Response;", "boundary", "processBundleResult", "statusCode", "", "headers", "Lokhttp3/Headers;", "body", "Lokio/BufferedSource;", "BundleInfo", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BundleDownloader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;

    @NotNull
    private static final String TAG = "BundleDownloader";

    @NotNull
    private final OkHttpClient client;
    private Call downloadBundleFromURLCall;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "", "<init>", "()V", "_url", "", "get_url$ReactAndroid_release", "()Ljava/lang/String;", "set_url$ReactAndroid_release", "(Ljava/lang/String;)V", "url", "getUrl", "value", "", "filesChangedCount", "getFilesChangedCount", "()I", "setFilesChangedCount$ReactAndroid_release", "(I)V", "toJSONString", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private String _url;
        private int filesChangedCount;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo$Companion;", "", "<init>", "()V", "fromJSONString", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "jsonStr", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BundleInfo fromJSONString(String jsonStr) {
                if (jsonStr == null) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(jsonStr);
                    BundleInfo bundleInfo = new BundleInfo();
                    bundleInfo.set_url$ReactAndroid_release(jSONObject.getString("url"));
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(jSONObject.getInt("filesChangedCount"));
                    return bundleInfo;
                } catch (JSONException e10) {
                    o8.a.h(BundleDownloader.TAG, "Invalid bundle info: ", e10);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public static final BundleInfo fromJSONString(String str) {
            return INSTANCE.fromJSONString(str);
        }

        public final int getFilesChangedCount() {
            return this.filesChangedCount;
        }

        @NotNull
        public final String getUrl() {
            String str = this._url;
            return str == null ? "unknown" : str;
        }

        /* JADX INFO: renamed from: get_url$ReactAndroid_release, reason: from getter */
        public final String get_url() {
            return this._url;
        }

        public final void setFilesChangedCount$ReactAndroid_release(int i7) {
            this.filesChangedCount = i7;
        }

        public final void set_url$ReactAndroid_release(String str) {
            this._url = str;
        }

        public final String toJSONString() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", this._url);
                jSONObject.put("filesChangedCount", this.filesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e10) {
                o8.a.h(BundleDownloader.TAG, "Can't serialize bundle info: ", e10);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$Companion;", "", "<init>", "()V", "TAG", "", "FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER", "", "storePlainJSInFile", "", "body", "Lokio/BufferedSource;", "outputFile", "Ljava/io/File;", "populateBundleInfo", "", "url", "headers", "Lokhttp3/Headers;", "bundleInfo", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBundleDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleDownloader.kt\ncom/facebook/react/devsupport/BundleDownloader$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void populateBundleInfo(String url, Headers headers, BundleInfo bundleInfo) {
            bundleInfo.set_url$ReactAndroid_release(url);
            String strA = headers.a("X-Metro-Files-Changed-Count");
            if (strA != null) {
                try {
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(Integer.parseInt(strA));
                } catch (NumberFormatException e10) {
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(BundleDownloader.FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER);
                    o8.a.h(BundleDownloader.TAG, "Can't populate bundle info: ", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean storePlainJSInFile(BufferedSource body, File outputFile) throws IOException {
            Intrinsics.checkNotNullParameter(outputFile, "file");
            rs.a aVarK = v.k(outputFile);
            try {
                body.Z(aVarK);
                aVarK.close();
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(aVarK, th2);
                    throw th3;
                }
            }
        }

        private Companion() {
        }
    }

    public BundleDownloader(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    public static /* synthetic */ void downloadBundleFromURL$default(BundleDownloader bundleDownloader, DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo, Request.Builder builder, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            builder = new Request.Builder();
        }
        bundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processBundleResult(String url, int statusCode, Headers headers, BufferedSource body, File outputFile, BundleInfo bundleInfo, DevBundleDownloadListener callback) throws IOException {
        if (statusCode != 200) {
            String strV = body.V();
            DebugServerException debugServerException = DebugServerException.INSTANCE.parse(url, strV);
            if (debugServerException != null) {
                callback.onFailure(debugServerException);
                return;
            }
            StringBuilder sbO = com.discord.chat.presentation.list.a.o("The development server returned response error code: ", "\n\nURL: ", url, statusCode, "\n\nBody:\n");
            sbO.append(strV);
            String string = sbO.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            callback.onFailure(new DebugServerException(string));
            return;
        }
        if (bundleInfo != null) {
            INSTANCE.populateBundleInfo(url, headers, bundleInfo);
        }
        File file = new File(kk.b.j(outputFile.getPath(), ".tmp"));
        if (!INSTANCE.storePlainJSInFile(body, file) || file.renameTo(outputFile)) {
            callback.onSuccess();
            return;
        }
        throw new IOException("Couldn't rename " + file + " to " + outputFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMultipartResponse(final String url, final Response response, String boundary, final File outputFile, final BundleInfo bundleInfo, final DevBundleDownloadListener callback) {
        ResponseBody responseBody = response.f17385y;
        int i7 = response.f17382v;
        if (responseBody == null) {
            callback.onFailure(new DebugServerException(kotlin.text.r.b("\n                    Error while reading multipart response.\n\n                    Response body was empty: " + i7 + "\n\n                    URL: " + url + "\n\n\n                    ")));
            return;
        }
        BufferedSource bufferedSourceSource = responseBody.source();
        if (bufferedSourceSource == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (new MultipartStreamReader(bufferedSourceSource, boundary).readAllParts(new MultipartStreamReader.ChunkListener() { // from class: com.facebook.react.devsupport.BundleDownloader$processMultipartResponse$completed$1
            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> headers, Buffer body, boolean isLastChunk) throws IOException {
                Intrinsics.checkNotNullParameter(headers, "headers");
                Intrinsics.checkNotNullParameter(body, "body");
                if (isLastChunk) {
                    int i10 = response.f17382v;
                    if (headers.containsKey("X-Http-Status")) {
                        i10 = Integer.parseInt(headers.getOrDefault("X-Http-Status", "0"));
                    }
                    this.processBundleResult(url, i10, zs.a.a(headers), body, outputFile, bundleInfo, callback);
                    return;
                }
                if (headers.containsKey("Content-Type") && Intrinsics.areEqual(headers.get("Content-Type"), "application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(body.V());
                        callback.onProgress(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null, jSONObject.has("percent") ? Integer.valueOf(jSONObject.getInt("percent")) : null);
                    } catch (JSONException e10) {
                        o8.a.g(ReactConstants.TAG, "Error parsing progress JSON. " + e10);
                    }
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> headers, long loaded, long total) {
                Intrinsics.checkNotNullParameter(headers, "headers");
                if (Intrinsics.areEqual("application/javascript", headers.get("Content-Type"))) {
                    DevBundleDownloadListener devBundleDownloadListener = callback;
                    long j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    devBundleDownloadListener.onProgress("Downloading", Integer.valueOf((int) (loaded / j)), Integer.valueOf((int) (total / j)), null);
                }
            }
        })) {
            return;
        }
        callback.onFailure(new DebugServerException(kotlin.text.r.b("\n                    Error while reading multipart response.\n\n                    Response code: " + i7 + "\n\n                    URL: " + url + "\n\n\n                    ")));
    }

    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, String str, BundleInfo bundleInfo) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        downloadBundleFromURL$default(this, callback, outputFile, str, bundleInfo, null, 16, null);
    }

    public final void downloadBundleFromURL(@NotNull final DevBundleDownloadListener callback, @NotNull final File outputFile, String bundleURL, final BundleInfo bundleInfo, @NotNull Request.Builder requestBuilder) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        if (bundleURL == null) {
            throw new IllegalStateException("Required value was null.");
        }
        requestBuilder.i(bundleURL);
        requestBuilder.a("Accept", "multipart/mixed");
        gs.i iVarA = this.client.a(requestBuilder.b());
        this.downloadBundleFromURLCall = iVarA;
        iVarA.d(new cs.h() { // from class: com.facebook.react.devsupport.BundleDownloader.downloadBundleFromURL.1
            @Override // cs.h
            public void onFailure(Call call, IOException e10) {
                Call call2;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                if (BundleDownloader.this.downloadBundleFromURLCall == null || ((call2 = BundleDownloader.this.downloadBundleFromURLCall) != null && call2.y())) {
                    BundleDownloader.this.downloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.downloadBundleFromURLCall = null;
                String str = call.i().f17368a.f17327h;
                callback.onFailure(DebugServerException.INSTANCE.makeGeneric(str, "Could not connect to development server.", a3.e.l("URL: ", str), e10));
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                if (r11.y() == true) goto L10;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v10 */
            /* JADX WARN: Type inference failed for: r11v15, types: [okhttp3.Response] */
            /* JADX WARN: Type inference failed for: r11v16, types: [okhttp3.Response] */
            /* JADX WARN: Type inference failed for: r11v17 */
            /* JADX WARN: Type inference failed for: r11v18 */
            /* JADX WARN: Type inference failed for: r11v19 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v20 */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v5, types: [okhttp3.Call] */
            /* JADX WARN: Type inference failed for: r11v6 */
            @Override // cs.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onResponse(okhttp3.Call r11, okhttp3.Response r12) {
                /*
                    r10 = this;
                    java.lang.String r0 = "call"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                    java.lang.String r11 = "response"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r11)
                    com.facebook.react.devsupport.BundleDownloader r0 = com.facebook.react.devsupport.BundleDownloader.this
                    java.io.File r4 = r3
                    com.facebook.react.devsupport.BundleDownloader$BundleInfo r5 = r4
                    com.facebook.react.devsupport.interfaces.DevBundleDownloadListener r6 = r2
                    okhttp3.Call r11 = com.facebook.react.devsupport.BundleDownloader.access$getDownloadBundleFromURLCall$p(r0)     // Catch: java.lang.Throwable -> L6e
                    r8 = 0
                    if (r11 == 0) goto L26
                    okhttp3.Call r11 = com.facebook.react.devsupport.BundleDownloader.access$getDownloadBundleFromURLCall$p(r0)     // Catch: java.lang.Throwable -> L6e
                    r1 = 1
                    if (r11 == 0) goto L30
                    boolean r11 = r11.y()     // Catch: java.lang.Throwable -> L29
                    if (r11 != r1) goto L30
                L26:
                    r11 = r12
                    goto L9c
                L29:
                    r0 = move-exception
                    r11 = r0
                    r9 = r12
                    r12 = r11
                    r11 = r9
                    goto La3
                L30:
                    com.facebook.react.devsupport.BundleDownloader.access$setDownloadBundleFromURLCall$p(r0, r8)     // Catch: java.lang.Throwable -> L6e
                    okhttp3.Request r11 = r12.f17379d     // Catch: java.lang.Throwable -> L6e
                    okhttp3.HttpUrl r11 = r11.f17368a     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r11 = r11.f17327h     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r2 = "content-type"
                    java.lang.String r2 = r12.f(r2, r8)     // Catch: java.lang.Throwable -> L6e
                    if (r2 != 0) goto L43
                    java.lang.String r2 = ""
                L43:
                    java.lang.String r3 = "multipart/mixed;.*boundary=\"([^\"]+)\""
                    java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Throwable -> L6e
                    java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch: java.lang.Throwable -> L6e
                    int r2 = r2.length()     // Catch: java.lang.Throwable -> L6e
                    if (r2 <= 0) goto L71
                    boolean r2 = r3.find()     // Catch: java.lang.Throwable -> L6e
                    if (r2 == 0) goto L71
                    java.lang.String r3 = r3.group(r1)     // Catch: java.lang.Throwable -> L6e
                    io.sentry.config.a.f(r3)     // Catch: java.lang.Throwable -> L6e
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L6e
                    r1 = r11
                    r2 = r12
                    com.facebook.react.devsupport.BundleDownloader.access$processMultipartResponse(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a
                    r11 = r2
                    goto L8e
                L6a:
                    r0 = move-exception
                    r11 = r2
                L6c:
                    r12 = r0
                    goto La3
                L6e:
                    r0 = move-exception
                    r11 = r12
                    goto L6c
                L71:
                    r1 = r11
                    r11 = r12
                    okhttp3.ResponseBody r12 = r11.f17385y     // Catch: java.lang.Throwable -> L94
                    if (r12 == 0) goto L89
                    int r2 = r11.f17382v     // Catch: java.lang.Throwable -> L86
                    okhttp3.Headers r3 = r11.f17384x     // Catch: java.lang.Throwable -> L86
                    r7 = r6
                    r6 = r5
                    r5 = r4
                    okio.BufferedSource r4 = r12.source()     // Catch: java.lang.Throwable -> L86
                    com.facebook.react.devsupport.BundleDownloader.access$processBundleResult(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L86
                    goto L89
                L86:
                    r0 = move-exception
                    r1 = r0
                    goto L96
                L89:
                    kotlin.Unit r0 = kotlin.Unit.f14616a     // Catch: java.lang.Throwable -> L86
                    ls.d.k(r12, r8)     // Catch: java.lang.Throwable -> L94
                L8e:
                    kotlin.Unit r12 = kotlin.Unit.f14616a     // Catch: java.lang.Throwable -> L94
                    r11.close()
                    return
                L94:
                    r0 = move-exception
                    goto L6c
                L96:
                    throw r1     // Catch: java.lang.Throwable -> L97
                L97:
                    r0 = move-exception
                    ls.d.k(r12, r1)     // Catch: java.lang.Throwable -> L94
                    throw r0     // Catch: java.lang.Throwable -> L94
                L9c:
                    com.facebook.react.devsupport.BundleDownloader.access$setDownloadBundleFromURLCall$p(r0, r8)     // Catch: java.lang.Throwable -> L94
                    ls.d.k(r11, r8)
                    return
                La3:
                    throw r12     // Catch: java.lang.Throwable -> La4
                La4:
                    r0 = move-exception
                    ls.d.k(r11, r12)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.AnonymousClass1.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }
}
