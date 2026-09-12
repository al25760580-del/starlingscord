package com.discord.media_player.reactevents;

import com.discord.chat.presentation.list.a;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006&"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerProgress;", "Lcom/discord/reactevents/ReactEvent;", StackTraceHelper.ID_KEY, "", "time", "duration", "<init>", "(DDD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()D", "getTime", "getDuration", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_player_release", "$serializer", "Companion", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MediaPlayerProgress implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final double duration;
    private final double id;
    private final double time;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerProgress$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media_player/reactevents/MediaPlayerProgress;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MediaPlayerProgress$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MediaPlayerProgress(int i7, double d6, double d7, double d8, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, MediaPlayerProgress$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = d6;
        this.time = d7;
        this.duration = d8;
    }

    public static /* synthetic */ MediaPlayerProgress copy$default(MediaPlayerProgress mediaPlayerProgress, double d6, double d7, double d8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            d6 = mediaPlayerProgress.id;
        }
        double d9 = d6;
        if ((i7 & 2) != 0) {
            d7 = mediaPlayerProgress.time;
        }
        double d10 = d7;
        if ((i7 & 4) != 0) {
            d8 = mediaPlayerProgress.duration;
        }
        return mediaPlayerProgress.copy(d9, d10, d8);
    }

    public static final /* synthetic */ void write$Self$media_player_release(MediaPlayerProgress self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.A(serialDesc, 0, self.id);
        output.A(serialDesc, 1, self.time);
        output.A(serialDesc, 2, self.duration);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getDuration() {
        return this.duration;
    }

    @NotNull
    public final MediaPlayerProgress copy(double id2, double time, double duration) {
        return new MediaPlayerProgress(id2, time, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaPlayerProgress)) {
            return false;
        }
        MediaPlayerProgress mediaPlayerProgress = (MediaPlayerProgress) other;
        return Double.compare(this.id, mediaPlayerProgress.id) == 0 && Double.compare(this.time, mediaPlayerProgress.time) == 0 && Double.compare(this.duration, mediaPlayerProgress.duration) == 0;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final double getId() {
        return this.id;
    }

    public final double getTime() {
        return this.time;
    }

    public int hashCode() {
        return Double.hashCode(this.duration) + a.d(Double.hashCode(this.id) * 31, this.time, 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        return "MediaPlayerProgress(id=" + this.id + ", time=" + this.time + ", duration=" + this.duration + ")";
    }

    public MediaPlayerProgress(double d6, double d7, double d8) {
        this.id = d6;
        this.time = d7;
        this.duration = d8;
    }
}
