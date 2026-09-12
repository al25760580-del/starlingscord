package com.discord.notifications.renderer.utils;

import android.content.Context;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import ar.b0;
import ar.k0;
import com.discord.crash_reporting.CrashReporting;
import com.discord.file_downloader.FileDownloader;
import com.reactnativecommunity.clipboard.ClipboardModule;
import hr.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import m3.m;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a,\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0010\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"notificationsDir", "Ljava/io/File;", "Landroid/content/Context;", "getNotificationsDir", "(Landroid/content/Context;)Ljava/io/File;", "MAX_NOTIFICATIONS_CACHE_TTL_MILLIS", "", "enforceNotificationsCacheTTL", "", "directory", "storeRemoteImageViaFileProvider", "Lkotlin/Pair;", "Landroid/net/Uri;", "", "context", "imageUrl", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notification_renderer_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationImageCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationImageCache.kt\ncom/discord/notifications/renderer/utils/NotificationImageCacheKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n3829#2:82\n4344#2,2:83\n1869#3,2:85\n*S KotlinDebug\n*F\n+ 1 NotificationImageCache.kt\ncom/discord/notifications/renderer/utils/NotificationImageCacheKt\n*L\n29#1:82\n29#1:83,2\n31#1:85,2\n*E\n"})
public final class NotificationImageCacheKt {
    private static final long MAX_NOTIFICATIONS_CACHE_TTL_MILLIS = 864000000;

    /* JADX INFO: renamed from: com.discord.notifications.renderer.utils.NotificationImageCacheKt$storeRemoteImageViaFileProvider$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.notifications.renderer.utils.NotificationImageCacheKt$storeRemoteImageViaFileProvider$2", f = "NotificationImageCache.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nNotificationImageCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationImageCache.kt\ncom/discord/notifications/renderer/utils/NotificationImageCacheKt$storeRemoteImageViaFileProvider$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
            this.$imageUrl = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$context, this.$imageUrl, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0072  */
        /* JADX WARN: Code duplicated, block: B:71:0x013d A[DONT_GENERATE, PHI: r2
          0x013d: PHI (r2v5 okhttp3.Response) = (r2v4 okhttp3.Response), (r2v6 okhttp3.Response) binds: [B:70:0x013b, B:77:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Response responseDownloadBlob$default;
            String lowerCase;
            InputStream inputStreamByteStream;
            String str;
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                NotificationImageCacheKt.enforceNotificationsCacheTTL(NotificationImageCacheKt.getNotificationsDir(this.$context));
                responseDownloadBlob$default = FileDownloader.downloadBlob$default(FileDownloader.INSTANCE, this.$imageUrl, null, null, 6, null);
                try {
                    boolean zG = responseDownloadBlob$default.g();
                    ResponseBody responseBody = responseDownloadBlob$default.f17385y;
                    if (!zG) {
                        responseDownloadBlob$default.close();
                        return null;
                    }
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.$imageUrl);
                    if (fileExtensionFromUrl != null) {
                        lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    String mimeTypeFromExtension = lowerCase != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : null;
                    MediaType mediaTypeContentType = responseBody != null ? responseBody.contentType() : null;
                    if (mediaTypeContentType != null && (str = mediaTypeContentType.f17331a) != null) {
                        if (StringsKt.K(str)) {
                            str = null;
                        }
                        if (str != null) {
                            mimeTypeFromExtension = str;
                        } else if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = ClipboardModule.MIMETYPE_JPEG;
                        }
                    } else if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = ClipboardModule.MIMETYPE_JPEG;
                    }
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeTypeFromExtension);
                    if (extensionFromMimeType == null) {
                        extensionFromMimeType = "jpg";
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    jo.d.f13988d.getClass();
                    File file = new File(NotificationImageCacheKt.getNotificationsDir(this.$context), "discord_" + jCurrentTimeMillis + "_" + jo.d.f13989e.c(1, 100000) + "." + extensionFromMimeType);
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    if (responseBody == null || (inputStreamByteStream = responseBody.byteStream()) == null) {
                        responseDownloadBlob$default.close();
                        return null;
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            m.k(inputStreamByteStream, fileOutputStream, 8192);
                            fileOutputStream.close();
                            inputStreamByteStream.close();
                            Pair pair = new Pair(FileProvider.getUriForFile(this.$context, this.$context.getPackageName() + ".file-provider", file), mimeTypeFromExtension);
                            responseDownloadBlob$default.close();
                            return pair;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ls.d.k(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ls.d.k(inputStreamByteStream, th4);
                            throw th5;
                        }
                    }
                } catch (IOException unused) {
                    if (responseDownloadBlob$default != null) {
                    }
                    return null;
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        CrashReporting crashReporting = CrashReporting.INSTANCE;
                        CrashReporting.addBreadcrumb$default(crashReporting, "storeRemoteImageViaFileProvider url=" + this.$imageUrl, null, null, null, false, 30, null);
                        CrashReporting.captureException$default(crashReporting, th, false, 2, null);
                        return null;
                    } finally {
                        if (responseDownloadBlob$default != null) {
                            responseDownloadBlob$default.close();
                        }
                    }
                }
            } catch (IOException unused2) {
                responseDownloadBlob$default = null;
            } catch (Throwable th7) {
                th = th7;
                responseDownloadBlob$default = null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enforceNotificationsCacheTTL(File file) {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile() && jCurrentTimeMillis - file2.lastModified() > MAX_NOTIFICATIONS_CACHE_TTL_MILLIS) {
                        arrayList.add(file2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        }
    }

    @NotNull
    public static final File getNotificationsDir(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return new File(context.getCacheDir(), "notifications");
    }

    public static final Object storeRemoteImageViaFileProvider(@NotNull Context context, @NotNull String str, @NotNull Continuation continuation) {
        e eVar = k0.f2938a;
        return b0.A(hr.d.f11103i, new AnonymousClass2(context, str, null), continuation);
    }
}
