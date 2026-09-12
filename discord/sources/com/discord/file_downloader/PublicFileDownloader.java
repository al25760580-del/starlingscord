package com.discord.file_downloader;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import com.discord.file_downloader.utils.FilenameSanitizedKt;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import dr.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007J*\u0010\u0012\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J*\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/file_downloader/PublicFileDownloader;", "", "<init>", "()V", "onDownloadListeners", "", "", "Lkotlin/Function0;", "", "downloadFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/file_downloader/DownloadState;", "context", "Landroid/content/Context;", "url", "", "fileName", "description", "onFileDownloaded", "", "Lkotlinx/coroutines/channels/ProducerScope;", "downloadManager", "Landroid/app/DownloadManager;", "downloadId", "downloadFileName", "getFileDownloadRequest", "Landroid/app/DownloadManager$Request;", "kotlin.jvm.PlatformType", "PublicFileDownloadBroadcastReceiver", "file_downloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PublicFileDownloader {

    @NotNull
    public static final PublicFileDownloader INSTANCE = new PublicFileDownloader();

    @NotNull
    private static final Map<Long, Function0<Unit>> onDownloadListeners = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discord/file_downloader/PublicFileDownloader$PublicFileDownloadBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "file_downloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublicFileDownloadBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            String action = intent != null ? intent.getAction() : null;
            if (action != null && action.hashCode() == 1248865515 && action.equals("android.intent.action.DOWNLOAD_COMPLETE")) {
                Function0 function0 = (Function0) PublicFileDownloader.onDownloadListeners.get(Long.valueOf(intent.getLongExtra("extra_download_id", 0L)));
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.discord.file_downloader.PublicFileDownloader$downloadFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/discord/file_downloader/DownloadState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_downloader.PublicFileDownloader$downloadFile$1", f = "PublicFileDownloader.kt", l = {30, ChatViewRecyclerTypes.POLL_IMAGE_ONLY, 63}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<ProducerScope, Continuation, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $description;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $url;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
            this.$url = str;
            this.$fileName = str2;
            this.$description = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Ref.LongRef longRef, ProducerScope producerScope, DownloadManager downloadManager, String str) throws IOException {
            PublicFileDownloader.onDownloadListeners.remove(Long.valueOf(longRef.element));
            PublicFileDownloader.INSTANCE.onFileDownloaded(producerScope, downloadManager, longRef.element, str);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(Ref.LongRef longRef) {
            PublicFileDownloader.onDownloadListeners.remove(Long.valueOf(longRef.element));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$url, this.$fileName, this.$description, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
        
            if (mf.f.c(r11, r1, r10) == r0) goto L37;
         */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.file_downloader.PublicFileDownloader.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope producerScope, Continuation continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    private PublicFileDownloader() {
    }

    public static /* synthetic */ Flow downloadFile$default(PublicFileDownloader publicFileDownloader, Context context, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        return publicFileDownloader.downloadFile(context, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DownloadManager.Request getFileDownloadRequest(String url, String fileName, String description) {
        DownloadManager.Request notificationVisibility = new DownloadManager.Request(Uri.parse(url)).setTitle(fileName).setDescription(description).setNotificationVisibility(1);
        String strFilenameSanitized = FilenameSanitizedKt.filenameSanitized(fileName);
        notificationVisibility.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strFilenameSanitized);
        String mimeTypeFromFilename = FilenameSanitizedKt.getMimeTypeFromFilename(strFilenameSanitized);
        if (mimeTypeFromFilename != null) {
            notificationVisibility.setMimeType(mimeTypeFromFilename);
        }
        notificationVisibility.allowScanningByMediaScanner();
        return notificationVisibility;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onFileDownloaded(ProducerScope producerScope, DownloadManager downloadManager, long j, String str) throws IOException {
        Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(j));
        try {
            if (cursorQuery.moveToFirst()) {
                producerScope.o(new DownloadState.Completed(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str)));
            } else {
                producerScope.o(new DownloadState.Failure(new IllegalStateException(new FileNotFoundException())));
            }
            boolean zB = producerScope.b(null);
            cursorQuery.close();
            return zB;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(cursorQuery, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final Flow downloadFile(@NotNull Context context, @NotNull String url, @NotNull String fileName, String description) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new c(new AnonymousClass1(context, url, fileName, description, null), g.f14681d, -2, cr.a.f7342d);
    }
}
