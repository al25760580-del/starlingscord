package com.discord.share.util;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ar.b0;
import com.discord.image.fresco.FrescoFetchEncodedImageKt;
import com.discord.media_player.CacheDataSourceFactory;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.imagepipeline.core.ImagePipeline;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;
import wn.a;
import xn.c;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"SHARE_MEDIA_DIR", "", "STALE_FILE_AGE_MS", "", "stageShareableMedia", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "url", "fileExtension", "mediaType", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareShareDestination", "Ljava/io/File;", "subDir", "extension", "share_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaShareUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaShareUtils.kt\ncom/discord/share/util/MediaShareUtilsKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,64:1\n375#2:65\n13472#3,2:66\n*S KotlinDebug\n*F\n+ 1 MediaShareUtils.kt\ncom/discord/share/util/MediaShareUtilsKt\n*L\n40#1:65\n57#1:66,2\n*E\n"})
public final class MediaShareUtilsKt {

    @NotNull
    private static final String SHARE_MEDIA_DIR = "share-media";
    private static final long STALE_FILE_AGE_MS = 600000;

    /* JADX INFO: renamed from: com.discord.share.util.MediaShareUtilsKt$stageShareableMedia$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.share.util.MediaShareUtilsKt", f = "MediaShareUtils.kt", l = {ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE}, m = "stageShareableMedia")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaShareUtilsKt.stageShareableMedia(null, null, null, null, this);
        }
    }

    private static final File prepareShareDestination(Context context, String str, String str2) {
        File file = new File(context.getCacheDir(), str);
        long jCurrentTimeMillis = System.currentTimeMillis() - STALE_FILE_AGE_MS;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.lastModified() < jCurrentTimeMillis) {
                    file2.delete();
                }
            }
        }
        return new File(file, UUID.randomUUID() + "." + str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object stageShareableMedia(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        File filePrepareShareDestination;
        File file;
        boolean zCopyVideoToFile;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i7 = anonymousClass1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objFetchEncodedImageToFile = anonymousClass1.result;
        a aVar = a.f22354d;
        int i10 = anonymousClass1.label;
        if (i10 == 0) {
            ib.a.L(objFetchEncodedImageToFile);
            filePrepareShareDestination = prepareShareDestination(context, SHARE_MEDIA_DIR, str2);
            try {
                if (Intrinsics.areEqual(str3, MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    zCopyVideoToFile = CacheDataSourceFactory.INSTANCE.copyVideoToFile(str, filePrepareShareDestination);
                } else {
                    ImagePipeline imagePipelineS = c9.a.s();
                    Intrinsics.checkNotNullExpressionValue(imagePipelineS, "getImagePipeline(...)");
                    anonymousClass1.L$0 = context;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.L$2 = str3;
                    anonymousClass1.L$3 = filePrepareShareDestination;
                    anonymousClass1.label = 1;
                    objFetchEncodedImageToFile = FrescoFetchEncodedImageKt.fetchEncodedImageToFile(imagePipelineS, str, filePrepareShareDestination, context, anonymousClass1);
                    if (objFetchEncodedImageToFile == aVar) {
                        return aVar;
                    }
                    zCopyVideoToFile = ((Boolean) objFetchEncodedImageToFile).booleanValue();
                }
            } catch (Throwable th2) {
                th = th2;
                file = filePrepareShareDestination;
                file.delete();
                throw th;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) anonymousClass1.L$3;
            str3 = (String) anonymousClass1.L$2;
            str = (String) anonymousClass1.L$1;
            Context context2 = (Context) anonymousClass1.L$0;
            try {
                ib.a.L(objFetchEncodedImageToFile);
                filePrepareShareDestination = file;
                context = context2;
                zCopyVideoToFile = ((Boolean) objFetchEncodedImageToFile).booleanValue();
            } catch (Throwable th3) {
                th = th3;
                file.delete();
                throw th;
            }
        }
        b0.l(anonymousClass1.getContext());
        if (!zCopyVideoToFile) {
            throw new IOException("Could not stage " + str3 + " for " + str);
        }
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".file-provider", filePrepareShareDestination);
        Intrinsics.checkNotNull(uriForFile);
        return uriForFile;
    }
}
