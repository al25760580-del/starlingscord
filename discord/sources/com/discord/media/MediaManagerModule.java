package com.discord.media;

import a3.e;
import android.graphics.BitmapFactory;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import ar.b0;
import ar.k0;
import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.discord.crash_reporting.CrashReporting;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.PublicFileDownloader;
import com.discord.logging.Log;
import com.discord.media.react.events.CompressionProgressEvent;
import com.discord.media.utils.EncodingConfig;
import com.discord.media.utils.MediaAssetUtils;
import com.discord.media.utils.MediaResolver;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import m3.m;
import org.jetbrains.annotations.NotNull;
import rn.n;
import rn.q;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J*\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010 \u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\rH\u0007J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001dH\u0007J\"\u0010%\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010&\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010'\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010(\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\"\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\rH\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J(\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u0002082\u0006\u00101\u001a\u000202H\u0002J\u0018\u00109\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010=\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010>\u001a\u0002002\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0010\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020AH\u0002J$\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010C2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010DJ\u0018\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010DR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/discord/media/MediaManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "mediaResolver", "Lcom/discord/media/utils/MediaResolver;", "getName", "", "getConstants", "", "", "invalidate", "", "getLosslessImageData", "uri", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "cancelResolveToMediaFilePath", "options", "Lcom/facebook/react/bridge/ReadableMap;", "resolveToMediaFilePath", "downloadMediaAsset", "mediaType", "", "downloadMediaAssetWithContentType", "contentType", "getVideoMetadata", "addListener", "type", "removeListeners", "count", "convertBase64ToJPEG", "convertBase64ToGIF", "convertToJPEG", "convertToCompatibleMOV", "convertToVideoFilePath", "getDeviceStateInfo", "isHEVCEncodingSupported", "getEncoderInfo", "Landroid/media/MediaCodecInfo;", "mimeType", "createCapabilitiesMap", "Lcom/facebook/react/bridge/WritableMap;", "videoCapabilities", "Landroid/media/MediaCodecInfo$VideoCapabilities;", "checkEncodingConstraints", "Lcom/facebook/react/bridge/WritableArray;", "width", "height", "frameRate", "", "isVideoEncodingSupported", "calculateImageQualityMetrics", "originalUri", "compressedUri", "getMediaOrigin", "detectMediaOrigin", "detectFileOrigin", "parsedUri", "Landroid/net/Uri;", "getImageDimensions", "Lkotlin/Pair;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadImageDataFromUri", "", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n29#2:752\n29#2:753\n29#2:754\n29#2:760\n1310#3:755\n12637#3,2:756\n1311#3:758\n1#4:759\n*S KotlinDebug\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule\n*L\n105#1:752\n115#1:753\n214#1:754\n611#1:760\n340#1:755\n341#1:756,2\n340#1:758\n*E\n"})
public final class MediaManagerModule extends ReactContextBaseJavaModule {
    private static final int MAX_IMAGE_DATA_SIZE = 52428800;
    private static final int MAX_IMAGE_DIMENSION = 8192;

    @NotNull
    private static final String QUALITY_METRICS_ERROR = "quality_metrics_error";

    @NotNull
    private final MediaResolver mediaResolver;

    @NotNull
    private final ReactEvents reactEvents;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.discord.media.MediaManagerModule$calculateImageQualityMetrics$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.MediaManagerModule$calculateImageQualityMetrics$1", f = "MediaManagerModule.kt", l = {509, 510, 543, 544, 557}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $compressedUri;
        final /* synthetic */ String $originalUri;
        final /* synthetic */ Promise $promise;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.$originalUri = str;
            this.$compressedUri = str2;
            this.$promise = promise;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = MediaManagerModule.this.new AnonymousClass1(this.$originalUri, this.$compressedUri, this.$promise, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00e3 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x0029, B:70:0x01ba, B:72:0x01be, B:76:0x023b, B:73:0x01c4, B:17:0x004c, B:62:0x017d, B:64:0x0181, B:66:0x0194, B:67:0x01a5, B:20:0x0064, B:58:0x0168, B:23:0x0082, B:36:0x00df, B:38:0x00e3, B:42:0x00fa, B:43:0x010b, B:46:0x0128, B:49:0x013b, B:51:0x0146, B:54:0x0151, B:74:0x01f4, B:75:0x020f, B:26:0x009b, B:33:0x00c9, B:29:0x00b0), top: B:84:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:42:0x00fa A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x0029, B:70:0x01ba, B:72:0x01be, B:76:0x023b, B:73:0x01c4, B:17:0x004c, B:62:0x017d, B:64:0x0181, B:66:0x0194, B:67:0x01a5, B:20:0x0064, B:58:0x0168, B:23:0x0082, B:36:0x00df, B:38:0x00e3, B:42:0x00fa, B:43:0x010b, B:46:0x0128, B:49:0x013b, B:51:0x0146, B:54:0x0151, B:74:0x01f4, B:75:0x020f, B:26:0x009b, B:33:0x00c9, B:29:0x00b0), top: B:84:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x010b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x0029, B:70:0x01ba, B:72:0x01be, B:76:0x023b, B:73:0x01c4, B:17:0x004c, B:62:0x017d, B:64:0x0181, B:66:0x0194, B:67:0x01a5, B:20:0x0064, B:58:0x0168, B:23:0x0082, B:36:0x00df, B:38:0x00e3, B:42:0x00fa, B:43:0x010b, B:46:0x0128, B:49:0x013b, B:51:0x0146, B:54:0x0151, B:74:0x01f4, B:75:0x020f, B:26:0x009b, B:33:0x00c9, B:29:0x00b0), top: B:84:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x017b  */
        /* JADX WARN: Code duplicated, block: B:61:0x017c  */
        /* JADX WARN: Code duplicated, block: B:64:0x0181 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x0029, B:70:0x01ba, B:72:0x01be, B:76:0x023b, B:73:0x01c4, B:17:0x004c, B:62:0x017d, B:64:0x0181, B:66:0x0194, B:67:0x01a5, B:20:0x0064, B:58:0x0168, B:23:0x0082, B:36:0x00df, B:38:0x00e3, B:42:0x00fa, B:43:0x010b, B:46:0x0128, B:49:0x013b, B:51:0x0146, B:54:0x0151, B:74:0x01f4, B:75:0x020f, B:26:0x009b, B:33:0x00c9, B:29:0x00b0), top: B:84:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0192 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:66:0x0194 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x0029, B:70:0x01ba, B:72:0x01be, B:76:0x023b, B:73:0x01c4, B:17:0x004c, B:62:0x017d, B:64:0x0181, B:66:0x0194, B:67:0x01a5, B:20:0x0064, B:58:0x0168, B:23:0x0082, B:36:0x00df, B:38:0x00e3, B:42:0x00fa, B:43:0x010b, B:46:0x0128, B:49:0x013b, B:51:0x0146, B:54:0x0151, B:74:0x01f4, B:75:0x020f, B:26:0x009b, B:33:0x00c9, B:29:0x00b0), top: B:84:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x01a5 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x0029, B:70:0x01ba, B:72:0x01be, B:76:0x023b, B:73:0x01c4, B:17:0x004c, B:62:0x017d, B:64:0x0181, B:66:0x0194, B:67:0x01a5, B:20:0x0064, B:58:0x0168, B:23:0x0082, B:36:0x00df, B:38:0x00e3, B:42:0x00fa, B:43:0x010b, B:46:0x0128, B:49:0x013b, B:51:0x0146, B:54:0x0151, B:74:0x01f4, B:75:0x020f, B:26:0x009b, B:33:0x00c9, B:29:0x00b0), top: B:84:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x020f A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x0029, B:70:0x01ba, B:72:0x01be, B:76:0x023b, B:73:0x01c4, B:17:0x004c, B:62:0x017d, B:64:0x0181, B:66:0x0194, B:67:0x01a5, B:20:0x0064, B:58:0x0168, B:23:0x0082, B:36:0x00df, B:38:0x00e3, B:42:0x00fa, B:43:0x010b, B:46:0x0128, B:49:0x013b, B:51:0x0146, B:54:0x0151, B:74:0x01f4, B:75:0x020f, B:26:0x009b, B:33:0x00c9, B:29:0x00b0), top: B:84:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x0252  */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01b7, code lost:
        
            if (r0 == r7) goto L69;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:38:0x00e3, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:42:0x00fa, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:64:0x0181, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:66:0x0194, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:75:0x020f, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:81:0x0252, please report this as an issue */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 659
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.media.MediaManagerModule.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.MediaManagerModule$downloadMediaAssetWithContentType$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.MediaManagerModule$downloadMediaAssetWithContentType$1", f = "MediaManagerModule.kt", l = {195}, m = "invokeSuspend")
    public static final class C01281 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $contentType;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $uri;
        int label;
        final /* synthetic */ MediaManagerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01281(String str, String str2, MediaManagerModule mediaManagerModule, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.$uri = str;
            this.$contentType = str2;
            this.this$0 = mediaManagerModule;
            this.$promise = promise;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01281(this.$uri, this.$contentType, this.this$0, this.$promise, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                String strGuessFileName = MediaAssetUtils.INSTANCE.guessFileName(this.$uri, this.$contentType);
                PublicFileDownloader publicFileDownloader = PublicFileDownloader.INSTANCE;
                ReactApplicationContext reactApplicationContext = this.this$0.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                Flow flowDownloadFile$default = PublicFileDownloader.downloadFile$default(publicFileDownloader, reactApplicationContext, this.$uri, strGuessFileName, null, 8, null);
                final Promise promise = this.$promise;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.media.MediaManagerModule.downloadMediaAssetWithContentType.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(DownloadState downloadState, Continuation continuation) {
                        if (downloadState instanceof DownloadState.Completed) {
                            promise.resolve(Boolean.TRUE);
                        } else if (downloadState instanceof DownloadState.Failure) {
                            promise.reject(new IllegalStateException("Unable to download asset."));
                        } else if (!(downloadState instanceof DownloadState.InProgress)) {
                            throw new n();
                        }
                        return Unit.f14616a;
                    }
                };
                this.label = 1;
                if (flowDownloadFile$default.collect(flowCollector, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01281) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.MediaManagerModule$getImageDimensions$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.MediaManagerModule$getImageDimensions$2", f = "MediaManagerModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nMediaManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule$getImageDimensions$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,751:1\n29#2:752\n*S KotlinDebug\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule$getImageDimensions$2\n*L\n706#1:752\n*E\n"})
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $uri;
        int label;
        final /* synthetic */ MediaManagerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, MediaManagerModule mediaManagerModule, Continuation continuation) {
            super(2, continuation);
            this.$uri = str;
            this.this$0 = mediaManagerModule;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$uri, this.this$0, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                InputStream inputStreamOpenInputStream = this.this$0.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.$uri));
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    int i7 = options.outWidth;
                    Pair pair = (i7 <= 0 || options.outHeight <= 0) ? null : new Pair(new Integer(i7), new Integer(options.outHeight));
                    inputStreamOpenInputStream.close();
                    return pair;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(inputStreamOpenInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                Log.INSTANCE.e("MediaManagerModule", "Failed to get image dimensions from URI: " + this.$uri, e10);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.MediaManagerModule$getVideoMetadata$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.MediaManagerModule$getVideoMetadata$1", f = "MediaManagerModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nMediaManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule$getVideoMetadata$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,751:1\n216#2,2:752\n*S KotlinDebug\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule$getVideoMetadata$1\n*L\n219#1:752,2\n*E\n"})
    public static final class C01291 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Uri $inputUri;
        final /* synthetic */ Promise $promise;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01291(Uri uri, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.$inputUri = uri;
            this.$promise = promise;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C01291 c01291 = MediaManagerModule.this.new C01291(this.$inputUri, this.$promise, continuation);
            c01291.L$0 = obj;
            return c01291;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Object objO;
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            MediaManagerModule mediaManagerModule = MediaManagerModule.this;
            Uri uri = this.$inputUri;
            Promise promise = this.$promise;
            try {
                q qVar = Result.f14614e;
                Map<String, Object> mapHandleVideoMetadata = mediaManagerModule.mediaResolver.handleVideoMetadata(uri);
                WritableMap writableMapCreateMap = Arguments.createMap();
                for (Map.Entry<String, Object> entry : mapHandleVideoMetadata.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        writableMapCreateMap.putInt(key, ((Number) value).intValue());
                    } else if (value instanceof Boolean) {
                        writableMapCreateMap.putBoolean(key, ((Boolean) value).booleanValue());
                    } else {
                        if (!(value instanceof String)) {
                            throw new IllegalArgumentException("Unsupported value type " + value.getClass().getName() + " for key [" + key + "]");
                        }
                        writableMapCreateMap.putString(key, (String) value);
                    }
                }
                promise.resolve(writableMapCreateMap);
                objO = Unit.f14616a;
            } catch (Throwable th2) {
                q qVar2 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            Promise promise2 = this.$promise;
            Throwable thA = Result.a(objO);
            if (thA != null) {
                promise2.reject(thA);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01291) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.MediaManagerModule$loadImageDataFromUri$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.MediaManagerModule$loadImageDataFromUri$2", f = "MediaManagerModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nMediaManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule$loadImageDataFromUri$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,751:1\n29#2:752\n*S KotlinDebug\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule$loadImageDataFromUri$2\n*L\n727#1:752\n*E\n"})
    public static final class C01302 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $uri;
        int label;
        final /* synthetic */ MediaManagerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01302(String str, MediaManagerModule mediaManagerModule, Continuation continuation) {
            super(2, continuation);
            this.$uri = str;
            this.this$0 = mediaManagerModule;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01302(this.$uri, this.this$0, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            int iAvailable;
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                InputStream inputStreamOpenInputStream = this.this$0.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.$uri));
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                try {
                    try {
                        iAvailable = inputStreamOpenInputStream.available();
                    } catch (Exception unused) {
                        iAvailable = 0;
                    }
                    if (iAvailable <= MediaManagerModule.MAX_IMAGE_DATA_SIZE) {
                        byte[] bArrK = m.K(inputStreamOpenInputStream);
                        inputStreamOpenInputStream.close();
                        return bArrK;
                    }
                    Log.w$default(Log.INSTANCE, "MediaManagerModule", "Image file too large: " + iAvailable + " bytes (max: 52428800)", (Throwable) null, 4, (Object) null);
                    inputStreamOpenInputStream.close();
                    return null;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(inputStreamOpenInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                Log.INSTANCE.e("MediaManagerModule", "Failed to load image data from URI: " + this.$uri, e10);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01302) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.MediaManagerModule$resolveToMediaFilePath$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.MediaManagerModule$resolveToMediaFilePath$1", f = "MediaManagerModule.kt", l = {MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH}, m = "invokeSuspend")
    public static final class C01311 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $allowOptimization;
        final /* synthetic */ EncodingConfig $encodingConfig;
        final /* synthetic */ int $imageCompressionQuality;
        final /* synthetic */ Uri $inputUri;
        final /* synthetic */ boolean $isLowQuality;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ boolean $skipVideoTranscode;
        final /* synthetic */ String $uri;
        final /* synthetic */ boolean $useOriginalIfSmaller;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01311(Uri uri, int i7, boolean z5, boolean z6, boolean z7, EncodingConfig encodingConfig, boolean z10, Promise promise, String str, Continuation continuation) {
            super(2, continuation);
            this.$inputUri = uri;
            this.$imageCompressionQuality = i7;
            this.$isLowQuality = z5;
            this.$skipVideoTranscode = z6;
            this.$useOriginalIfSmaller = z7;
            this.$encodingConfig = encodingConfig;
            this.$allowOptimization = z10;
            this.$promise = promise;
            this.$uri = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C01311 c01311 = MediaManagerModule.this.new C01311(this.$inputUri, this.$imageCompressionQuality, this.$isLowQuality, this.$skipVideoTranscode, this.$useOriginalIfSmaller, this.$encodingConfig, this.$allowOptimization, this.$promise, this.$uri, continuation);
            c01311.L$0 = obj;
            return c01311;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Object objO;
            Promise promise;
            Object objResolveToUri$media_release;
            a aVar = a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    MediaManagerModule mediaManagerModule = MediaManagerModule.this;
                    Uri uri = this.$inputUri;
                    int i10 = this.$imageCompressionQuality;
                    boolean z5 = this.$isLowQuality;
                    boolean z6 = this.$skipVideoTranscode;
                    boolean z7 = this.$useOriginalIfSmaller;
                    EncodingConfig encodingConfig = this.$encodingConfig;
                    boolean z10 = this.$allowOptimization;
                    promise = this.$promise;
                    q qVar = Result.f14614e;
                    MediaResolver mediaResolver = mediaManagerModule.mediaResolver;
                    this.L$0 = promise;
                    this.label = 1;
                    objResolveToUri$media_release = mediaResolver.resolveToUri$media_release(uri, i10, z5, z6, z7, encodingConfig, z10, this);
                    if (objResolveToUri$media_release == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Promise promise2 = (Promise) this.L$0;
                    ib.a.L(obj);
                    promise = promise2;
                    objResolveToUri$media_release = obj;
                }
                promise.resolve(((Uri) objResolveToUri$media_release).toString());
                objO = Unit.f14616a;
                q qVar2 = Result.f14614e;
            } catch (Throwable th2) {
                q qVar3 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            Promise promise3 = this.$promise;
            String str = this.$uri;
            MediaManagerModule mediaManagerModule2 = MediaManagerModule.this;
            Uri uri2 = this.$inputUri;
            Throwable thA = Result.a(objO);
            if (thA != null) {
                if (thA instanceof CancellationException) {
                    promise3.reject(thA);
                }
                CrashReporting crashReporting = CrashReporting.INSTANCE;
                CrashReporting.addBreadcrumb$default(crashReporting, "Failed to resolve URI to file", w0.g(new Pair("uri", str), new Pair("mimeType", String.valueOf(mediaManagerModule2.mediaResolver.getMimeType(uri2)))), null, null, false, 28, null);
                CrashReporting.captureException$default(crashReporting, thA, false, 2, null);
                promise3.reject(thA);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01311) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(new Pair("compression-progress", Reflection.getOrCreateKotlinClass(CompressionProgressEvent.class)));
        this.scope = b0.c();
        this.mediaResolver = new MediaResolver(reactContext, new com.discord.chat.input.views.a(4, this));
    }

    private final WritableArray checkEncodingConstraints(int width, int height, double frameRate, MediaCodecInfo.VideoCapabilities videoCapabilities) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (width % videoCapabilities.getWidthAlignment() != 0 || height % videoCapabilities.getHeightAlignment() != 0) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("type", "resolution_alignment");
            writableMapCreateMap.putString("message", e.g(videoCapabilities.getWidthAlignment(), videoCapabilities.getHeightAlignment(), "Resolution must be aligned to ", "x"));
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("width", width);
            writableMapCreateMap2.putInt("height", height);
            Unit unit = Unit.f14616a;
            writableMapCreateMap.putMap("current", writableMapCreateMap2);
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            writableMapCreateMap3.putInt("width", videoCapabilities.getWidthAlignment());
            writableMapCreateMap3.putInt("height", videoCapabilities.getHeightAlignment());
            writableMapCreateMap.putMap("alignment", writableMapCreateMap3);
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            return writableArrayCreateArray;
        }
        if (videoCapabilities.isSizeSupported(width, height)) {
            if (!videoCapabilities.areSizeAndRateSupported(width, height, frameRate)) {
                WritableMap writableMapCreateMap4 = Arguments.createMap();
                writableMapCreateMap4.putString("type", "frameRate");
                writableMapCreateMap4.putString("message", "Frame rate " + frameRate + " not supported at resolution " + width + "x" + height);
                writableMapCreateMap4.putDouble("current", frameRate);
                writableArrayCreateArray.pushMap(writableMapCreateMap4);
            }
            return writableArrayCreateArray;
        }
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putString("type", "resolution");
        writableMapCreateMap5.putString("message", "Resolution " + width + "x" + height + " not supported");
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.putInt("width", width);
        writableMapCreateMap6.putInt("height", height);
        Unit unit2 = Unit.f14616a;
        writableMapCreateMap5.putMap("current", writableMapCreateMap6);
        writableArrayCreateArray.pushMap(writableMapCreateMap5);
        return writableArrayCreateArray;
    }

    private final WritableMap createCapabilitiesMap(MediaCodecInfo.VideoCapabilities videoCapabilities) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Object lower = videoCapabilities.getSupportedWidths().getLower();
        Intrinsics.checkNotNullExpressionValue(lower, "getLower(...)");
        writableMapCreateMap2.putInt(ViewProps.MIN_WIDTH, ((Number) lower).intValue());
        Object upper = videoCapabilities.getSupportedWidths().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        writableMapCreateMap2.putInt(ViewProps.MAX_WIDTH, ((Number) upper).intValue());
        Object lower2 = videoCapabilities.getSupportedHeights().getLower();
        Intrinsics.checkNotNullExpressionValue(lower2, "getLower(...)");
        writableMapCreateMap2.putInt(ViewProps.MIN_HEIGHT, ((Number) lower2).intValue());
        Object upper2 = videoCapabilities.getSupportedHeights().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper2, "getUpper(...)");
        writableMapCreateMap2.putInt(ViewProps.MAX_HEIGHT, ((Number) upper2).intValue());
        writableMapCreateMap.putMap("resolution", writableMapCreateMap2);
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        Integer num = (Integer) videoCapabilities.getSupportedFrameRates().getLower();
        if (num != null) {
            writableMapCreateMap3.putDouble("min", num.intValue());
        }
        Integer num2 = (Integer) videoCapabilities.getSupportedFrameRates().getUpper();
        if (num2 != null) {
            writableMapCreateMap3.putDouble("max", num2.intValue());
        }
        writableMapCreateMap.putMap("frameRate", writableMapCreateMap3);
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        Object lower3 = videoCapabilities.getBitrateRange().getLower();
        Intrinsics.checkNotNullExpressionValue(lower3, "getLower(...)");
        writableMapCreateMap4.putInt("min", ((Number) lower3).intValue());
        Object upper3 = videoCapabilities.getBitrateRange().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper3, "getUpper(...)");
        writableMapCreateMap4.putInt("max", ((Number) upper3).intValue());
        writableMapCreateMap.putMap("bitrate", writableMapCreateMap4);
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putInt("widthAlignment", videoCapabilities.getWidthAlignment());
        writableMapCreateMap5.putInt("heightAlignment", videoCapabilities.getHeightAlignment());
        writableMapCreateMap.putMap("blockSize", writableMapCreateMap5);
        return writableMapCreateMap;
    }

    private final WritableMap detectFileOrigin(Uri parsedUri) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String path = parsedUri.getPath();
        if (path == null) {
            path = "";
        }
        String lastPathSegment = parsedUri.getLastPathSegment();
        String str = lastPathSegment != null ? lastPathSegment : "";
        if (StringsKt.D(path, "/tmp/", false) || StringsKt.D(path, "/temp/", false) || StringsKt.D(path, "/cache/", false)) {
            writableMapCreateMap.putString("source", "picker");
            writableMapCreateMap.putString("confidence", "medium");
        } else if (StringsKt.D(path, "/DCIM/Camera/", false) || x.o(str, "IMG_", false)) {
            writableMapCreateMap.putString("source", "camera");
            writableMapCreateMap.putString("confidence", "high");
        } else if (StringsKt.D(path, "/DCIM/Screenshots/", false) || StringsKt.D(path, "/Pictures/Screenshots/", false) || StringsKt.D(str, "Screenshot", false) || StringsKt.D(str, "Screen Shot", false)) {
            writableMapCreateMap.putString("source", "screenshot");
            writableMapCreateMap.putString("confidence", "high");
        } else if (StringsKt.D(path, "/Download/", false)) {
            writableMapCreateMap.putString("source", "downloads");
            writableMapCreateMap.putString("confidence", "medium");
        } else if (StringsKt.D(str, "edited", false) || StringsKt.D(path, "edited", false)) {
            writableMapCreateMap.putString("source", "edited");
            writableMapCreateMap.putString("confidence", "medium");
        } else {
            writableMapCreateMap.putString("source", "file");
            writableMapCreateMap.putString("confidence", "low");
        }
        if (str.length() == 0) {
            str = "unknown";
        }
        writableMapCreateMap.putString("filename", str);
        if (path.length() == 0) {
            path = "unknown";
        }
        writableMapCreateMap.putString("path", path);
        return writableMapCreateMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final WritableMap detectMediaOrigin(String uri) {
        String lowerCase;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("source", "unknown");
        writableMapCreateMap.putString("confidence", "low");
        try {
            Uri uri2 = Uri.parse(uri);
            String scheme = uri2.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                switch (lowerCase.hashCode()) {
                    case 3143036:
                        if (lowerCase.equals("file")) {
                            return detectFileOrigin(uri2);
                        }
                        break;
                    case 3213448:
                        if (!lowerCase.equals("http")) {
                            break;
                        }
                        writableMapCreateMap.putString("source", "network");
                        writableMapCreateMap.putString("confidence", "medium");
                        return writableMapCreateMap;
                    case 99617003:
                        if (!lowerCase.equals("https")) {
                            break;
                        }
                        writableMapCreateMap.putString("source", "network");
                        writableMapCreateMap.putString("confidence", "medium");
                        return writableMapCreateMap;
                    case 951530617:
                        if (lowerCase.equals("content")) {
                            String authority = uri2.getAuthority();
                            if (authority != null && StringsKt.D(authority, "media", false)) {
                                writableMapCreateMap.putString("source", "gallery");
                                writableMapCreateMap.putString("confidence", "medium");
                                return writableMapCreateMap;
                            }
                            if (authority == null || !StringsKt.D(authority, "downloads", false)) {
                                writableMapCreateMap.putString("source", "gallery");
                                writableMapCreateMap.putString("confidence", "low");
                                return writableMapCreateMap;
                            }
                            writableMapCreateMap.putString("source", "downloads");
                            writableMapCreateMap.putString("confidence", "medium");
                            return writableMapCreateMap;
                        }
                        break;
                }
            }
            writableMapCreateMap.putString("source", "unknown");
            writableMapCreateMap.putString("confidence", "low");
            return writableMapCreateMap;
        } catch (Exception e10) {
            Log.INSTANCE.w("MediaManagerModule", "Error parsing URI for origin detection: " + uri, e10);
            return writableMapCreateMap;
        }
    }

    private final MediaCodecInfo getEncoderInfo(String mimeType) {
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                for (String str : supportedTypes) {
                    if (Intrinsics.areEqual(str, mimeType)) {
                        return mediaCodecInfo;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getImageDimensions(String str, Continuation continuation) {
        hr.e eVar = k0.f2938a;
        return b0.A(hr.d.f11103i, new AnonymousClass2(str, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadImageDataFromUri(String str, Continuation continuation) {
        hr.e eVar = k0.f2938a;
        return b0.A(hr.d.f11103i, new C01302(str, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mediaResolver$lambda$0(MediaManagerModule mediaManagerModule, Uri uri, int i7) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ReactEvents reactEvents = mediaManagerModule.reactEvents;
        ReactApplicationContext reactApplicationContext = mediaManagerModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        reactEvents.emitModuleEvent(reactApplicationContext, new CompressionProgressEvent(string, i7));
        return Unit.f14616a;
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @ReactMethod
    public final void calculateImageQualityMetrics(@NotNull String originalUri, @NotNull String compressedUri, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(originalUri, "originalUri");
        Intrinsics.checkNotNullParameter(compressedUri, "compressedUri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.scope, null, new AnonymousClass1(originalUri, compressedUri, promise, null), 3);
    }

    @ReactMethod
    public final void cancelResolveToMediaFilePath(@NotNull String uri, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.mediaResolver.cancel(Uri.parse(uri));
        promise.resolve(null);
    }

    @ReactMethod
    public final void convertBase64ToGIF(@NotNull String uri, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        throw new IllegalStateException("Unused on Android");
    }

    @ReactMethod
    public final void convertBase64ToJPEG(@NotNull String uri, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        throw new IllegalStateException("Unused on Android");
    }

    @ReactMethod
    public final void convertToCompatibleMOV(@NotNull String uri, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        throw new IllegalStateException("Unused on Android");
    }

    @ReactMethod
    public final void convertToJPEG(@NotNull String uri, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        throw new IllegalStateException("Unused on Android");
    }

    @ReactMethod
    public final void convertToVideoFilePath(@NotNull String uri, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        throw new IllegalStateException("Unused on Android");
    }

    @ReactMethod
    public final void downloadMediaAsset(@NotNull String uri, int mediaType, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        downloadMediaAssetWithContentType(uri, mediaType, null, promise);
    }

    @ReactMethod
    public final void downloadMediaAssetWithContentType(@NotNull String uri, int mediaType, String contentType, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        CoroutineScope coroutineScope = this.scope;
        hr.e eVar = k0.f2938a;
        b0.t(coroutineScope, hr.d.f11103i, new C01281(uri, contentType, this, promise, null), 2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @NotNull
    public Map<String, List<String>> getConstants() {
        return v0.b(new Pair("supportedExtensions", d0.g("mp4", "mov", "qt", "png", "jpg", "jpeg", "gif", "webp")));
    }

    @ReactMethod
    public final void getDeviceStateInfo(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        Object systemService = reactApplicationContext.getSystemService("batterymanager");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        double intProperty = ((double) ((BatteryManager) systemService).getIntProperty(4)) / 100.0d;
        String str = "UNKNOWN";
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService2 = reactApplicationContext.getSystemService("power");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
            int currentThermalStatus = ((PowerManager) systemService2).getCurrentThermalStatus();
            if (currentThermalStatus == 0) {
                str = "NOMINAL";
            } else if (currentThermalStatus == 1 || currentThermalStatus == 2) {
                str = "FAIR";
            } else if (currentThermalStatus == 3) {
                str = "SERIOUS";
            } else if (currentThermalStatus == 4 || currentThermalStatus == 5) {
                str = "CRITICAL";
            }
        }
        Object systemService3 = reactApplicationContext.getSystemService("power");
        Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.os.PowerManager");
        boolean zIsPowerSaveMode = ((PowerManager) systemService3).isPowerSaveMode();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("thermalState", str);
        writableMapCreateMap.putDouble("batteryLevel", intProperty);
        writableMapCreateMap.putBoolean("isLowPowerMode", zIsPowerSaveMode);
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public final void getLosslessImageData(@NotNull String uri, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(uri);
    }

    @ReactMethod
    public final void getMediaOrigin(@NotNull String uri, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(detectMediaOrigin(uri));
        } catch (Exception e10) {
            Log.INSTANCE.e("MediaManagerModule", "Failed to detect media origin for URI: " + uri, e10);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("source", "unknown");
            writableMapCreateMap.putString("confidence", "low");
            promise.resolve(writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "MediaManager";
    }

    @ReactMethod
    public final void getVideoMetadata(@NotNull String uri, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.scope, null, new C01291(Uri.parse(uri), promise, null), 3);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        b0.f(this.scope, new CancellationException("Module destroyed"));
    }

    @ReactMethod
    public final void isHEVCEncodingSupported(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(getEncoderInfo("video/hevc") != null));
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public final void isVideoEncodingSupported(@NotNull ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            int i7 = options.getInt("width");
            int i10 = options.getInt("height");
            double d6 = options.getDouble("frameRate");
            String str = options.getBoolean("isHEVC") ? "video/hevc" : "video/avc";
            WritableMap writableMapCreateMap = Arguments.createMap();
            MediaCodecInfo encoderInfo = getEncoderInfo(str);
            if (encoderInfo == null) {
                writableMapCreateMap.putBoolean("isSupported", false);
                WritableArray writableArrayCreateArray = Arguments.createArray();
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("type", "codec_not_found");
                writableMapCreateMap2.putString("message", "No encoder found for mime type: ".concat(str));
                writableArrayCreateArray.pushMap(writableMapCreateMap2);
                writableMapCreateMap.putArray("failures", writableArrayCreateArray);
                writableMapCreateMap.putMap("capabilities", Arguments.createMap());
                promise.resolve(writableMapCreateMap);
                return;
            }
            writableMapCreateMap.putString("encoderName", encoderInfo.getName());
            MediaCodecInfo.VideoCapabilities videoCapabilities = encoderInfo.getCapabilitiesForType(str).getVideoCapabilities();
            Intrinsics.checkNotNull(videoCapabilities);
            writableMapCreateMap.putMap("capabilities", createCapabilitiesMap(videoCapabilities));
            ReadableArray readableArrayCheckEncodingConstraints = checkEncodingConstraints(i7, i10, d6, videoCapabilities);
            if (readableArrayCheckEncodingConstraints.size() > 0) {
                writableMapCreateMap.putBoolean("isSupported", false);
                writableMapCreateMap.putArray("failures", readableArrayCheckEncodingConstraints);
            } else {
                writableMapCreateMap.putBoolean("isSupported", true);
            }
            promise.resolve(writableMapCreateMap);
        } catch (Exception e10) {
            promise.reject("ERROR", "Error checking video encoding support: " + e10.getMessage());
        }
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void resolveToMediaFilePath(@NotNull String uri, ReadableMap options, @NotNull Promise promise) {
        EncodingConfig encodingConfig;
        ReadableMap map;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Uri uri2 = Uri.parse(uri);
        int i7 = (int) (NativeMapExtensionsKt.getDouble(options, "compressionQuality", 1.0d) * ((double) 100));
        boolean z5 = NativeMapExtensionsKt.getBoolean(options, "isLowQuality", false);
        boolean z6 = NativeMapExtensionsKt.getBoolean(options, "skipVideoTranscode", false);
        boolean z7 = NativeMapExtensionsKt.getBoolean(options, "useOriginalIfSmaller", false);
        boolean z10 = NativeMapExtensionsKt.getBoolean(options, "allowOptimization", true);
        if (options == null || (map = options.getMap("encodingConfig")) == null) {
            encodingConfig = null;
        } else {
            try {
                int i10 = map.getInt(Snapshot.TARGET_WIDTH);
                int i11 = map.getInt(Snapshot.TARGET_HEIGHT);
                double d6 = map.getDouble("keyFrameIntervalSeconds");
                int i12 = map.getInt("targetBitrate");
                encodingConfig = new EncodingConfig(i10, i11, Double.valueOf(map.getDouble("frameRate")), Double.valueOf(d6), Integer.valueOf(i12), map.getBoolean("useHEVC"), map.getBoolean("createHDR"), Integer.valueOf(map.getInt("rotationDegrees")), map.getInt("progressUpdateGranularity"));
            } catch (Exception e10) {
                promise.reject(new IllegalArgumentException(e.l("Invalid encodingConfig: ", e10.getMessage())));
                return;
            }
        }
        b0.t(this.scope, null, new C01311(uri2, i7, z5, z6, z7, encodingConfig, z10, promise, uri, null), 3);
    }
}
