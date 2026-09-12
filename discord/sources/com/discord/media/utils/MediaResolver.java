package com.discord.media.utils;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ar.b0;
import ar.k0;
import com.discord.crash_reporting.CrashReporting;
import com.facebook.imageutils.JfifUtil;
import com.margelo.nitro.rive.w1;
import hr.e;
import id.zelory.compressor.constraint.Compression;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import kotlinx.coroutines.CoroutineScope;
import net.ypresto.qtfaststart.QtFastStart;
import org.jetbrains.annotations.NotNull;
import qn.b;
import xn.c;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0083@¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001d\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0082@¢\u0006\u0004\b\"\u0010#J/\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u0004\u0018\u00010$2\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b,\u0010-JN\u00101\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010.\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b/\u00100J!\u00103\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001022\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u001c\u00108\u001a\n 7*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0018\u0010?\u001a\u00020$*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010+¨\u0006A"}, d2 = {"Lcom/discord/media/utils/MediaResolver;", "", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Landroid/net/Uri;", "", "", "onProgress", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "checkFreeSpace", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inputUri", "compressedUri", "", "mediaSourceSize", "createMP4FastStartUri", "(Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;", "", "skipVideoTranscode", "Lcom/discord/media/utils/EncodingConfig;", "encodingConfig", "handleVideo", "(Landroid/net/Uri;ZLcom/discord/media/utils/EncodingConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compressionQuality", "isLowQuality", "useOriginalIfSmaller", "allowOptimization", "handleImage", "(Landroid/net/Uri;IZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uri", "Ljava/io/File;", "targetFile", "copyToFile", "(Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tag", "message", "outputUri", "logMediaError", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V", "getMimeType", "(Landroid/net/Uri;)Ljava/lang/String;", "cancel", "(Landroid/net/Uri;)V", "imageCompressionQuality", "resolveToUri$media_release", "(Landroid/net/Uri;IZZZLcom/discord/media/utils/EncodingConfig;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveToUri", "", "handleVideoMetadata", "(Landroid/net/Uri;)Ljava/util/Map;", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function2;", "kotlin.jvm.PlatformType", "cacheDir", "Ljava/io/File;", "Landroid/content/ContentResolver;", "getResolver", "()Landroid/content/ContentResolver;", "resolver", "getRequestId", "requestId", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaResolver.kt\ncom/discord/media/utils/MediaResolver\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n36#2:271\n36#2:272\n36#2:274\n36#2:275\n36#2:276\n1#3:273\n*S KotlinDebug\n*F\n+ 1 MediaResolver.kt\ncom/discord/media/utils/MediaResolver\n*L\n114#1:271\n138#1:272\n217#1:274\n226#1:275\n229#1:276\n*E\n"})
public final class MediaResolver {

    @Deprecated
    public static final double FREE_SPACE_PERCENT = 0.2d;
    private final File cacheDir;

    @NotNull
    private final Context context;

    @NotNull
    private final Function2<Uri, Integer, Unit> onProgress;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long HALF_DAY_MILLIS = TimeUnit.HOURS.toMillis(12);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/discord/media/utils/MediaResolver$Companion;", "", "<init>", "()V", "FREE_SPACE_PERCENT", "", "HALF_DAY_MILLIS", "", "getHALF_DAY_MILLIS", "()J", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getHALF_DAY_MILLIS() {
            return MediaResolver.HALF_DAY_MILLIS;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.media.utils.MediaResolver$checkFreeSpace$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.utils.MediaResolver$checkFreeSpace$2", f = "MediaResolver.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nMediaResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaResolver.kt\ncom/discord/media/utils/MediaResolver$checkFreeSpace$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,270:1\n13472#2:271\n13472#2,2:272\n13473#2:274\n*S KotlinDebug\n*F\n+ 1 MediaResolver.kt\ncom/discord/media/utils/MediaResolver$checkFreeSpace$2\n*L\n85#1:271\n89#1:272,2\n85#1:274\n*E\n"})
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaResolver.this.new AnonymousClass2(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006d  */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            File[] fileArrListFiles;
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            if (MediaResolver.this.cacheDir.getUsableSpace() / MediaResolver.this.cacheDir.getTotalSpace() < 0.2d) {
                long jCurrentTimeMillis = System.currentTimeMillis() - MediaResolver.Companion.getHALF_DAY_MILLIS();
                File[] fileArrListFiles2 = MediaResolver.this.cacheDir.listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file : fileArrListFiles2) {
                        if (file.isFile()) {
                            String name = file.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            if (x.o(name, "temp_", false) && file.lastModified() < jCurrentTimeMillis) {
                                file.delete();
                            } else if (!file.isDirectory() && Intrinsics.areEqual(file.getName(), "compressor") && (fileArrListFiles = file.listFiles()) != null) {
                                for (File file2 : fileArrListFiles) {
                                    if (file2.isFile() && file2.lastModified() < jCurrentTimeMillis) {
                                        file2.delete();
                                    }
                                }
                            }
                        } else if (!file.isDirectory()) {
                        }
                    }
                }
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.utils.MediaResolver$copyToFile$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.utils.MediaResolver$copyToFile$2", f = "MediaResolver.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nMediaResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaResolver.kt\ncom/discord/media/utils/MediaResolver$copyToFile$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,270:1\n36#2:271\n*S KotlinDebug\n*F\n+ 1 MediaResolver.kt\ncom/discord/media/utils/MediaResolver$copyToFile$2\n*L\n248#1:271\n*E\n"})
    public static final class C01962 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ File $targetFile;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ MediaResolver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01962(File file, MediaResolver mediaResolver, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.$targetFile = file;
            this.this$0 = mediaResolver;
            this.$uri = uri;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01962(this.$targetFile, this.this$0, this.$uri, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws IOException {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            File fileCreateTempFile$default = this.$targetFile;
            if (fileCreateTempFile$default == null) {
                fileCreateTempFile$default = ContentResolverUtils.createTempFile$default(ContentResolverUtils.INSTANCE, this.this$0.getResolver(), this.$uri, null, null, 6, null);
            }
            MediaResolver mediaResolver = this.this$0;
            InputStream inputStreamOpenInputStream = mediaResolver.getResolver().openInputStream(this.$uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    FileUtilsKt.writeTo(inputStreamOpenInputStream, fileCreateTempFile$default);
                    Unit unit = Unit.f14616a;
                    inputStreamOpenInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(inputStreamOpenInputStream, th2);
                        throw th3;
                    }
                }
            }
            return Uri.fromFile(fileCreateTempFile$default);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01962) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.utils.MediaResolver$handleImage$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.utils.MediaResolver", f = "MediaResolver.kt", l = {204, JfifUtil.MARKER_SOI, 232}, m = "handleImage")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaResolver.this.handleImage(null, 0, false, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.utils.MediaResolver$handleVideo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.utils.MediaResolver", f = "MediaResolver.kt", l = {152, 173, 176}, m = "handleVideo")
    public static final class C01971 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C01971(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaResolver.this.handleVideo(null, false, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaResolver(@NotNull Context context, @NotNull Function2<? super Uri, ? super Integer, Unit> onProgress) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.context = context;
        this.onProgress = onProgress;
        this.cacheDir = context.getCacheDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UsableSpace"})
    public final Object checkFreeSpace(Continuation continuation) throws Throwable {
        e eVar = k0.f2938a;
        Object objA = b0.A(hr.d.f11103i, new AnonymousClass2(null), continuation);
        return objA == wn.a.f22354d ? objA : Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object copyToFile(Uri uri, File file, Continuation continuation) {
        e eVar = k0.f2938a;
        return b0.A(hr.d.f11103i, new C01962(file, this, uri, null), continuation);
    }

    public static /* synthetic */ Object copyToFile$default(MediaResolver mediaResolver, Uri uri, File file, Continuation continuation, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            file = null;
        }
        return mediaResolver.copyToFile(uri, file, continuation);
    }

    private final Uri createMP4FastStartUri(Uri inputUri, Uri compressedUri, long mediaSourceSize) throws IOException {
        String path = compressedUri.getPath();
        if (path == null) {
            return null;
        }
        Uri uri = new File(path).length() > mediaSourceSize ? inputUri : compressedUri;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = getResolver().openFileDescriptor(uri, "r");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            return null;
        }
        File fileCreateTempFile$default = ContentResolverUtils.createTempFile$default(ContentResolverUtils.INSTANCE, getResolver(), uri, null, "mp4", 2, null);
        boolean zFastStart = false;
        try {
            zFastStart = QtFastStart.fastStart(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), fileCreateTempFile$default);
            Uri uriFromFile = zFastStart ? Uri.fromFile(fileCreateTempFile$default) : uri;
            parcelFileDescriptorOpenFileDescriptor.close();
            if (zFastStart) {
                new File(path).delete();
                return uriFromFile;
            }
            fileCreateTempFile$default.delete();
            if (!Intrinsics.areEqual(uri, compressedUri)) {
                new File(path).delete();
            }
            return uriFromFile;
        } catch (Throwable th2) {
            parcelFileDescriptorOpenFileDescriptor.close();
            if (zFastStart) {
                new File(path).delete();
            } else {
                fileCreateTempFile$default.delete();
                if (!Intrinsics.areEqual(uri, compressedUri)) {
                    new File(path).delete();
                }
            }
            throw th2;
        }
    }

    private final String getRequestId(Uri uri) {
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getResolver() {
        ContentResolver contentResolver = this.context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object handleImage(final Uri uri, final int i7, boolean z5, boolean z6, boolean z7, Continuation continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        boolean zIsHeif;
        Uri uri2;
        boolean z10;
        File file;
        Uri uri3;
        File file2;
        String path;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object obj2 = wn.a.f22354d;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                z10 = anonymousClass1.Z$0;
                Uri uri4 = (Uri) anonymousClass1.L$0;
                ib.a.L(obj);
                uri2 = uri4;
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                file = (File) anonymousClass1.L$0;
                ib.a.L(obj);
            }
            uri3 = (Uri) obj;
            path = uri3.getPath();
            if (path == null) {
                return Uri.fromFile(file);
            }
            file2 = new File(path);
            if (file2.length() <= file.length()) {
                file.delete();
                return uri3;
            }
            file2.delete();
            return Uri.fromFile(file);
        }
        ib.a.L(obj);
        final boolean z11 = false;
        if (z7) {
            ContentResolver resolver = getResolver();
            ContentResolverUtils contentResolverUtils = ContentResolverUtils.INSTANCE;
            zIsHeif = contentResolverUtils.isHeif(resolver, uri) || contentResolverUtils.isJpeg(resolver, uri) || (z5 && contentResolverUtils.isPng(resolver, uri));
        } else {
            zIsHeif = ContentResolverUtils.INSTANCE.isHeif(getResolver(), uri);
        }
        if (zIsHeif && z5) {
            z11 = true;
        }
        if (zIsHeif) {
            Context context = this.context;
            Function1 function1 = new Function1() { // from class: com.discord.media.utils.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return MediaResolver.handleImage$lambda$7(i7, z11, this, uri, (Compression) obj3);
                }
            };
            anonymousClass1.L$0 = uri;
            anonymousClass1.Z$0 = z6;
            anonymousClass1.label = 1;
            e eVar = k0.f2938a;
            Object objA = b0.A(hr.d.f11103i, new w1(function1, context, uri, null), anonymousClass1);
            if (objA != obj2) {
                uri2 = uri;
                z10 = z6;
                obj = objA;
            }
        } else {
            anonymousClass1.label = 3;
            Object objCopyToFile$default = copyToFile$default(this, uri, null, anonymousClass1, 2, null);
            if (objCopyToFile$default != obj2) {
                return objCopyToFile$default;
            }
        }
        return obj2;
        File file3 = (File) obj;
        this.onProgress.invoke(uri2, new Integer(100));
        if (z10) {
            ContentResolverUtils contentResolverUtils2 = ContentResolverUtils.INSTANCE;
            if (contentResolverUtils2.isJpeg(getResolver(), uri2)) {
                File fileCreateTempFile$default = ContentResolverUtils.createTempFile$default(contentResolverUtils2, getResolver(), uri2, null, "jpeg", 2, null);
                anonymousClass1.L$0 = file3;
                anonymousClass1.label = 2;
                Object objCopyToFile = copyToFile(uri2, fileCreateTempFile$default, anonymousClass1);
                if (objCopyToFile != obj2) {
                    obj = objCopyToFile;
                    file = file3;
                    uri3 = (Uri) obj;
                    path = uri3.getPath();
                    if (path == null) {
                        return Uri.fromFile(file);
                    }
                    file2 = new File(path);
                    if (file2.length() <= file.length()) {
                        file.delete();
                        return uri3;
                    }
                    file2.delete();
                    return Uri.fromFile(file);
                }
                return obj2;
            }
        }
        return Uri.fromFile(file3);
    }

    public static /* synthetic */ Object handleImage$default(MediaResolver mediaResolver, Uri uri, int i7, boolean z5, boolean z6, boolean z7, Continuation continuation, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z7 = true;
        }
        return mediaResolver.handleImage(uri, i7, z5, z6, z7, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleImage$lambda$7(int i7, boolean z5, MediaResolver mediaResolver, Uri uri, Compression destination) {
        Intrinsics.checkNotNullParameter(destination, "$this$compress");
        destination.a(new QualityAndResolutionConstraint(i7, z5));
        Bitmap.CompressFormat format = Bitmap.CompressFormat.JPEG;
        Intrinsics.checkParameterIsNotNull(destination, "$this$format");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(format, "format");
        destination.a(new qn.c());
        File destination2 = ContentResolverUtils.createTempFile$default(ContentResolverUtils.INSTANCE, mediaResolver.getResolver(), uri, null, "jpeg", 2, null);
        Intrinsics.checkParameterIsNotNull(destination, "$this$destination");
        Intrinsics.checkParameterIsNotNull(destination2, "destination");
        destination.a(new b(destination2));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013c, code lost:
    
        if (r0 == r10) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleVideo(android.net.Uri r14, boolean r15, com.discord.media.utils.EncodingConfig r16, kotlin.coroutines.Continuation r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.MediaResolver.handleVideo(android.net.Uri, boolean, com.discord.media.utils.EncodingConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleVideo$lambda$4$lambda$3(MediaResolver mediaResolver, Uri uri, float f2) {
        mediaResolver.onProgress.invoke(uri, Integer.valueOf((int) (f2 * 100)));
        return Unit.f14616a;
    }

    private final void logMediaError(String tag, String message, Uri inputUri, Uri outputUri) {
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        CrashReporting.addBreadcrumb$default(crashReporting, message, w0.g(new Pair("inputUri", inputUri.toString()), new Pair("outputUri", outputUri.toString())), null, null, false, 28, null);
        crashReporting.captureMessage(tag, message, CrashReporting.ErrorLevel.WARNING);
    }

    public final void cancel(@NotNull Uri inputUri) {
        Intrinsics.checkNotNullParameter(inputUri, "inputUri");
        Transcoder.INSTANCE.cancel(getRequestId(inputUri));
    }

    public final String getMimeType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return getResolver().getType(uri);
    }

    @NotNull
    public final Map<String, Object> handleVideoMetadata(@NotNull Uri inputUri) {
        Intrinsics.checkNotNullParameter(inputUri, "inputUri");
        return new DiscordVideoMediaSource(this.context, inputUri).getMetadata();
    }

    public final Object resolveToUri$media_release(@NotNull Uri uri, int i7, boolean z5, boolean z6, boolean z7, EncodingConfig encodingConfig, boolean z10, @NotNull Continuation continuation) {
        e eVar = k0.f2938a;
        return b0.A(hr.d.f11103i, new MediaResolver$resolveToUri$2(this, uri, z6, encodingConfig, i7, z5, z7, z10, null), continuation);
    }
}
