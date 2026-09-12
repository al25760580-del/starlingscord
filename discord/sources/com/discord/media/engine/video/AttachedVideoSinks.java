package com.discord.media.engine.video;

import com.discord.media.engine.MediaEngine;
import com.discord.media.engine.types.VideoSink;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/media/engine/video/AttachedVideoSinks;", "", "<init>", "()V", "streamOutputMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;", "addSink", "", "mediaEngine", "Lcom/discord/media/engine/MediaEngine;", "sink", "Lcom/discord/media/engine/types/VideoSink;", "streamId", "removeSink", "anySinksActive", "VideoOutputSinks", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachedVideoSinks {

    @NotNull
    public static final AttachedVideoSinks INSTANCE = new AttachedVideoSinks();

    @NotNull
    private static final ConcurrentHashMap<String, VideoOutputSinks> streamOutputMap = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;", "", "sink", "Lcom/discord/media/engine/types/VideoSink;", "<init>", "(Lcom/discord/media/engine/types/VideoSink;)V", "sinks", "", "add", "", "remove", "isEmpty", "onFrame", "frame", "Lorg/webrtc/VideoFrame;", "mirror", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAttachedVideoSinks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachedVideoSinks.kt\ncom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1869#2,2:78\n*S KotlinDebug\n*F\n+ 1 AttachedVideoSinks.kt\ncom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks\n*L\n71#1:78,2\n*E\n"})
    public static final class VideoOutputSinks {

        @NotNull
        private final Set<VideoSink> sinks;

        public VideoOutputSinks(@NotNull VideoSink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.sinks = copyOnWriteArraySet;
            copyOnWriteArraySet.add(sink);
        }

        public final boolean add(@NotNull VideoSink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return this.sinks.add(sink);
        }

        public final boolean isEmpty() {
            return this.sinks.isEmpty();
        }

        public final boolean onFrame(@NotNull VideoFrame frame, boolean mirror) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            Iterator<T> it = this.sinks.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(frame, mirror);
            }
            frame.release();
            return true;
        }

        public final boolean remove(@NotNull VideoSink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return this.sinks.remove(sink);
        }
    }

    private AttachedVideoSinks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoOutputSinks addSink$lambda$1(Ref.BooleanRef booleanRef, VideoSink videoSink, MediaEngine mediaEngine, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        booleanRef.element = true;
        VideoOutputSinks videoOutputSinks = new VideoOutputSinks(videoSink);
        mediaEngine.setVideoOutputSink$media_engine_release(str, new AttachedVideoSinks$addSink$outputSinks$1$1$1(videoOutputSinks));
        return videoOutputSinks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoOutputSinks addSink$lambda$2(Function1 function1, Object obj) {
        return (VideoOutputSinks) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoOutputSinks removeSink$lambda$4(VideoSink videoSink, MediaEngine mediaEngine, String str, String str2, VideoOutputSinks videoOutputSinks) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        if (videoOutputSinks == null) {
            return null;
        }
        videoOutputSinks.remove(videoSink);
        if (!videoOutputSinks.isEmpty()) {
            return videoOutputSinks;
        }
        mediaEngine.setVideoOutputSink$media_engine_release(str, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoOutputSinks removeSink$lambda$5(Function2 function2, Object obj, Object obj2) {
        return (VideoOutputSinks) function2.invoke(obj, obj2);
    }

    public final boolean addSink(@NotNull MediaEngine mediaEngine, @NotNull VideoSink sink, @NotNull String streamId) {
        Intrinsics.checkNotNullParameter(mediaEngine, "mediaEngine");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(streamId, "streamId");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        VideoOutputSinks videoOutputSinksComputeIfAbsent = streamOutputMap.computeIfAbsent(streamId, new com.discord.avatar.react.a(1, new a(0, booleanRef, sink, mediaEngine, streamId)));
        Intrinsics.checkNotNullExpressionValue(videoOutputSinksComputeIfAbsent, "computeIfAbsent(...)");
        videoOutputSinksComputeIfAbsent.add(sink);
        return booleanRef.element;
    }

    public final boolean anySinksActive() {
        return !streamOutputMap.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.discord.media.engine.video.b] */
    public final boolean removeSink(@NotNull final MediaEngine mediaEngine, @NotNull final VideoSink sink, @NotNull final String streamId) {
        Intrinsics.checkNotNullParameter(mediaEngine, "mediaEngine");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(streamId, "streamId");
        ConcurrentHashMap<String, VideoOutputSinks> concurrentHashMap = streamOutputMap;
        final ?? r5 = new Function2() { // from class: com.discord.media.engine.video.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AttachedVideoSinks.removeSink$lambda$4(sink, mediaEngine, streamId, (String) obj, (AttachedVideoSinks.VideoOutputSinks) obj2);
            }
        };
        return concurrentHashMap.compute(streamId, new BiFunction() { // from class: com.discord.media.engine.video.c
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AttachedVideoSinks.removeSink$lambda$5(r5, obj, obj2);
            }
        }) != null;
    }
}
