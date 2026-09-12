package com.discord.file_downloader;

import android.content.Context;
import com.discord.crash_reporting.d;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import rn.l;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0005J:\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/discord/file_downloader/FileDownloader;", "", "<init>", "()V", "defaultClient", "Lokhttp3/OkHttpClient;", "getDefaultClient", "()Lokhttp3/OkHttpClient;", "defaultClient$delegate", "Lkotlin/Lazy;", "downloadBlob", "Lokhttp3/Response;", "fileUrl", "", "headers", "", "client", "downloadFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/file_downloader/DownloadState;", "context", "Landroid/content/Context;", "fileName", "downloadDirectory", "Ljava/io/File;", "logErrors", "", "file_downloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDownloader.kt\ncom/discord/file_downloader/FileDownloader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,88:1\n1869#2,2:89\n563#3:91\n*S KotlinDebug\n*F\n+ 1 FileDownloader.kt\ncom/discord/file_downloader/FileDownloader\n*L\n33#1:89,2\n21#1:91\n*E\n"})
public final class FileDownloader {

    @NotNull
    public static final FileDownloader INSTANCE = new FileDownloader();

    /* JADX INFO: renamed from: defaultClient$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy defaultClient = l.b(new d(11));

    /* JADX INFO: renamed from: com.discord.file_downloader.FileDownloader$downloadFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/discord/file_downloader/DownloadState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.file_downloader.FileDownloader$downloadFile$1", f = "FileDownloader.kt", l = {ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE, 61, 69, 76, 82}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ File $downloadDirectory;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $fileUrl;
        final /* synthetic */ boolean $logErrors;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, String str, String str2, boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$downloadDirectory = file;
            this.$fileName = str;
            this.$fileUrl = str2;
            this.$logErrors = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$downloadDirectory, this.$fileName, this.$fileUrl, this.$logErrors, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x00c3, Exception -> 0x00c8, TryCatch #1 {all -> 0x00c3, blocks: (B:63:0x010f, B:65:0x0113, B:66:0x0116, B:39:0x0095, B:41:0x00a7, B:49:0x00cc, B:51:0x00e8, B:61:0x010b, B:62:0x010e), top: B:79:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: all -> 0x00c3, Exception -> 0x00c8, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, blocks: (B:63:0x010f, B:65:0x0113, B:66:0x0116, B:39:0x0095, B:41:0x00a7, B:49:0x00cc, B:51:0x00e8, B:61:0x010b, B:62:0x010e), top: B:79:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0103 A[PHI: r13
          0x0103: PHI (r13v16 okhttp3.ResponseBody) = (r13v15 okhttp3.ResponseBody), (r13v19 okhttp3.ResponseBody) binds: [B:55:0x0101, B:71:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:65:0x0113 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:63:0x010f, B:65:0x0113, B:66:0x0116, B:39:0x0095, B:41:0x00a7, B:49:0x00cc, B:51:0x00e8, B:61:0x010b, B:62:0x010e), top: B:79:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0129  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
        
            if (r13.emit(r2, r12) == r1) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
        
            if (r13.emit(r4, r12) == r1) goto L68;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v9, types: [T, okhttp3.ResponseBody] */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.file_downloader.FileDownloader.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    private FileDownloader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient defaultClient_delegate$lambda$0() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
        Interceptor interceptor = new Interceptor() { // from class: com.discord.file_downloader.FileDownloader$defaultClient_delegate$lambda$0$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                return companion.downloadInterceptor(chain);
            }
        };
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        builder.f17346c.add(interceptor);
        return new OkHttpClient(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response downloadBlob$default(FileDownloader fileDownloader, String str, Map map, OkHttpClient okHttpClient, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            map = w0.d();
        }
        if ((i7 & 4) != 0) {
            okHttpClient = fileDownloader.getDefaultClient();
        }
        return fileDownloader.downloadBlob(str, map, okHttpClient);
    }

    public static /* synthetic */ Flow downloadFile$default(FileDownloader fileDownloader, Context context, String str, String str2, File file, boolean z5, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            file = context.getCacheDir();
        }
        File file2 = file;
        if ((i7 & 16) != 0) {
            z5 = false;
        }
        return fileDownloader.downloadFile(context, str, str2, file2, z5);
    }

    private final OkHttpClient getDefaultClient() {
        return (OkHttpClient) defaultClient.getValue();
    }

    @NotNull
    public final Response downloadBlob(@NotNull String fileUrl, @NotNull Map<String, String> headers, @NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(client, "client");
        Request.Builder builder = new Request.Builder();
        Iterator<T> it = headers.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        builder.i(fileUrl);
        return client.a(builder.b()).e();
    }

    @NotNull
    public final Flow downloadFile(@NotNull Context context, @NotNull String fileUrl, @NotNull String fileName, @NotNull File downloadDirectory, boolean logErrors) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(downloadDirectory, "downloadDirectory");
        return new a4.h(new AnonymousClass1(downloadDirectory, fileName, fileUrl, logErrors, null));
    }
}
