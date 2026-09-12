package com.discord.media.utils;

import a5.b0;
import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import ar.k;
import com.linkedin.android.litr.MediaTransformer;
import com.linkedin.android.litr.io.MediaRange;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import ok.c;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;
import qk.b;
import rn.q;
import vk.d;
import vk.e;
import wn.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006JL\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015H\u0086@¢\u0006\u0002\u0010\u0017R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/media/utils/Transcoder;", "", "<init>", "()V", "cancelCallbacks", "", "", "Lkotlin/Function0;", "", "cancel", "requestId", "convertCompress", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "mediaSource", "Lcom/discord/media/utils/DiscordVideoMediaSource;", "outputUri", "encodingConfig", "Lcom/discord/media/utils/EncodingConfig;", "onProgress", "Lkotlin/Function1;", "", "(Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Landroid/net/Uri;Lcom/discord/media/utils/EncodingConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTranscoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transcoder.kt\ncom/discord/media/utils/Transcoder\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n426#2,9:115\n435#2,2:125\n1#3:124\n*S KotlinDebug\n*F\n+ 1 Transcoder.kt\ncom/discord/media/utils/Transcoder\n*L\n29#1:115,9\n29#1:125,2\n*E\n"})
public final class Transcoder {

    @NotNull
    public static final Transcoder INSTANCE = new Transcoder();

    @NotNull
    private static final Map<String, Function0<Unit>> cancelCallbacks = new LinkedHashMap();

    private Transcoder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertCompress$lambda$0(float f2) {
        return Unit.f14616a;
    }

    public final void cancel(@NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Function0<Unit> function0Remove = cancelCallbacks.remove(requestId);
        if (function0Remove != null) {
            function0Remove.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.discord.media.utils.Transcoder$convertCompress$3$2, ok.c] */
    public final Object convertCompress(@NotNull final String str, @NotNull Context context, @NotNull DiscordVideoMediaSource discordVideoMediaSource, @NotNull final Uri uri, @NotNull EncodingConfig encodingConfig, @NotNull final Function1<? super Float, Unit> function1, @NotNull Continuation frame) {
        MediaFormat mediaFormat;
        b bVar;
        MediaFormat mediaFormat2;
        b bVar2;
        e bVar3;
        uk.a aVar;
        ArrayList arrayList;
        int i7;
        boolean z5 = true;
        final k kVar = new k(1, f.b(frame));
        kVar.t();
        final MediaTransformer mediaTransformer = new MediaTransformer(context);
        cancelCallbacks.put(str, new Function0<Unit>() { // from class: com.discord.media.utils.Transcoder$convertCompress$3$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1011invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1011invoke() {
                MediaTransformer mediaTransformer2 = mediaTransformer;
                Future future = (Future) mediaTransformer2.f6891d.get(str);
                if (future == null || future.isCancelled() || future.isDone()) {
                    return;
                }
                future.cancel(true);
            }
        });
        MediaFormat mediaFormat3 = new MediaFormat();
        if (encodingConfig.getUseHEVC()) {
            mediaFormat3.setString("mime", "video/hevc");
            if (encodingConfig.getCreateHDR()) {
                mediaFormat3.setInteger("profile", RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            } else {
                mediaFormat3.setInteger("profile", 1);
            }
        } else {
            mediaFormat3.setString("mime", "video/avc");
        }
        mediaFormat3.setInteger("width", encodingConfig.getTargetWidth());
        mediaFormat3.setInteger("height", encodingConfig.getTargetHeight());
        mediaFormat3.setInteger("bitrate", encodingConfig.getTargetBitrate().intValue());
        mediaFormat3.setFloat("frame-rate", encodingConfig.getFrameRate().floatValue());
        mediaFormat3.setFloat("operating-rate", encodingConfig.getFrameRate().floatValue());
        mediaFormat3.setFloat("i-frame-interval", encodingConfig.getKeyFrameIntervalSeconds().floatValue());
        mediaFormat3.setInteger("rotation-degrees", encodingConfig.getRotationDegrees().intValue());
        mediaFormat3.setInteger("priority", 1);
        DiscordVideoMediaSource.ColorFormatSettings colorFormatSettings = discordVideoMediaSource.getColorFormatSettings();
        if (colorFormatSettings != null) {
            Integer colorTransfer = colorFormatSettings.getColorTransfer();
            if (colorTransfer != null) {
                mediaFormat3.setInteger("color-transfer", colorTransfer.intValue());
            }
            Integer colorStandard = colorFormatSettings.getColorStandard();
            if (colorStandard != null) {
                mediaFormat3.setInteger("color-standard", colorStandard.intValue());
            }
            Integer colorRange = colorFormatSettings.getColorRange();
            if (colorRange != null) {
                mediaFormat3.setInteger("color-range", colorRange.intValue());
            }
            ByteBuffer hdrStaticInfo = colorFormatSettings.getHdrStaticInfo();
            if (hdrStaticInfo != null) {
                mediaFormat3.setByteBuffer("hdr-static-info", hdrStaticInfo);
            }
        }
        b0 b0Var = new b0(encodingConfig.getProgressUpdateGranularity(), true);
        Intrinsics.checkNotNullExpressionValue(b0Var, "build(...)");
        Uri inputUri = discordVideoMediaSource.getInputUri();
        MediaFormat audioFormat = discordVideoMediaSource.getAudioFormat();
        ?? r5 = new c() { // from class: com.discord.media.utils.Transcoder$convertCompress$3$2
            @Override // ok.c
            public void onCancelled(String id2, List<pk.a> infos) {
                Intrinsics.checkNotNullParameter(id2, "id");
                mediaTransformer.f6889b.shutdownNow();
                Transcoder.cancelCallbacks.remove(str);
                if (kVar.c()) {
                    CancellableContinuation cancellableContinuation = kVar;
                    q qVar = Result.f14614e;
                    cancellableContinuation.resumeWith(ib.a.o(new CancellationException("Video transcoding was cancelled")));
                }
            }

            @Override // ok.c
            public void onCompleted(String id2, List<pk.a> infos) {
                Intrinsics.checkNotNullParameter(id2, "id");
                mediaTransformer.f6889b.shutdownNow();
                function1.invoke(Float.valueOf(1.0f));
                Transcoder.cancelCallbacks.remove(str);
                CancellableContinuation cancellableContinuation = kVar;
                q qVar = Result.f14614e;
                cancellableContinuation.resumeWith(uri);
            }

            @Override // ok.c
            public void onError(String id2, Throwable cause, List<pk.a> infos) {
                Intrinsics.checkNotNullParameter(id2, "id");
                mediaTransformer.f6889b.shutdownNow();
                Transcoder.cancelCallbacks.remove(str);
                CancellableContinuation cancellableContinuation = kVar;
                q qVar = Result.f14614e;
                if (cause == null) {
                    cause = new Throwable("Unknown transcoding error");
                }
                cancellableContinuation.resumeWith(ib.a.o(cause));
            }

            @Override // ok.c
            public void onProgress(String id2, float progress) {
                Intrinsics.checkNotNullParameter(id2, "id");
                function1.invoke(Float.valueOf(progress));
            }

            @Override // ok.c
            public void onStarted(String id2) {
                Intrinsics.checkNotNullParameter(id2, "id");
                function1.invoke(Float.valueOf(0.0f));
            }
        };
        try {
            uk.a aVar2 = new uk.a(mediaTransformer.f6888a, inputUri, (MediaRange) b0Var.f174i);
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < aVar2.getTrackCount(); i12++) {
                MediaFormat trackFormat = aVar2.getTrackFormat(i12);
                if (MediaTransformer.b(trackFormat.containsKey("mime") ? trackFormat.getString("mime") : null, true)) {
                    i11++;
                }
            }
            int i13 = (mediaFormat3.containsKey("mime") && (TextUtils.equals(mediaFormat3.getString("mime"), "video/x-vnd.on2.vp9") || TextUtils.equals(mediaFormat3.getString("mime"), "video/x-vnd.on2.vp8"))) ? 1 : 0;
            if (i11 <= 0) {
                throw new rk.c(4, uri, i13, new IllegalArgumentException("No output tracks left"));
            }
            uk.b bVar4 = new uk.b(mediaTransformer.f6888a, uri, i11, aVar2.getOrientationHint(), i13);
            int trackCount = aVar2.getTrackCount();
            ArrayList arrayList2 = new ArrayList(trackCount);
            while (i10 < trackCount) {
                MediaFormat trackFormat2 = aVar2.getTrackFormat(i10);
                String string = trackFormat2.containsKey("mime") ? trackFormat2.getString("mime") : null;
                if (MediaTransformer.b(string, z5)) {
                    ArrayList arrayList3 = arrayList2;
                    int size = arrayList3.size();
                    if (string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        bVar = new b(0);
                        d dVar = new d();
                        mediaFormat = mediaFormat3;
                        bVar2 = new b(1);
                        bVar3 = dVar;
                        mediaFormat2 = mediaFormat;
                    } else {
                        mediaFormat = mediaFormat3;
                        if (string.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                            b bVar5 = new b(1);
                            bVar = new b(0);
                            bVar2 = bVar5;
                            bVar3 = new vk.b(bVar5);
                            mediaFormat2 = audioFormat;
                        } else {
                            bVar = null;
                            mediaFormat2 = null;
                            bVar2 = null;
                            bVar3 = null;
                        }
                    }
                    aVar = aVar2;
                    arrayList = arrayList3;
                    i7 = i10;
                    ok.a aVar3 = new ok.a(i7, size, mediaFormat2, bVar, bVar2, aVar, bVar4, bVar3);
                    bVar4 = bVar4;
                    arrayList.add(aVar3);
                } else {
                    mediaFormat = mediaFormat3;
                    aVar = aVar2;
                    arrayList = arrayList2;
                    i7 = i10;
                }
                i10 = i7 + 1;
                trackCount = trackCount;
                arrayList2 = arrayList;
                aVar2 = aVar;
                mediaFormat3 = mediaFormat;
                z5 = true;
            }
            mediaTransformer.c(str, arrayList2, r5, b0Var.f173e);
            kVar.v(new Function1<Throwable, Unit>() { // from class: com.discord.media.utils.Transcoder$convertCompress$3$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.f14616a;
                }

                public final void invoke(Throwable th2) {
                    Transcoder.INSTANCE.cancel(str);
                }
            });
            Object objR = kVar.r();
            if (objR == wn.a.f22354d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objR;
        } catch (rk.b e10) {
            e = e10;
            r5.onError(str, e, null);
        } catch (rk.c e11) {
            e = e11;
            r5.onError(str, e, null);
        }
    }
}
