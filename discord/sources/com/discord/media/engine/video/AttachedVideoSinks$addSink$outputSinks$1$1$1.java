package com.discord.media.engine.video;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class AttachedVideoSinks$addSink$outputSinks$1$1$1 extends FunctionReferenceImpl implements Function2<VideoFrame, Boolean, Boolean> {
    public AttachedVideoSinks$addSink$outputSinks$1$1$1(Object obj) {
        super(2, obj, AttachedVideoSinks.VideoOutputSinks.class, "onFrame", "onFrame(Lorg/webrtc/VideoFrame;Z)Z", 0);
    }

    public final Boolean invoke(VideoFrame p3, boolean z5) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return Boolean.valueOf(((AttachedVideoSinks.VideoOutputSinks) this.receiver).onFrame(p3, z5));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((VideoFrame) obj, ((Boolean) obj2).booleanValue());
    }
}
