package com.discord.media_player.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import ls.d;
import or.e1;
import org.jetbrains.annotations.NotNull;
import rr.b;
import sr.a;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSourceChanged;", "Lcom/discord/reactevents/ReactEvent;", "source", "Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;", "<init>", "(Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSource", "()Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_player_release", "$serializer", "Companion", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MediaPlayerPlaybackSourceChanged implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final MediaPlayerPlaybackSource source;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSourceChanged$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSourceChanged;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MediaPlayerPlaybackSourceChanged$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MediaPlayerPlaybackSourceChanged(int i7, MediaPlayerPlaybackSource mediaPlayerPlaybackSource, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i7 & 1)) {
            this.source = mediaPlayerPlaybackSource;
        } else {
            e1.l(i7, 1, MediaPlayerPlaybackSourceChanged$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ MediaPlayerPlaybackSourceChanged copy$default(MediaPlayerPlaybackSourceChanged mediaPlayerPlaybackSourceChanged, MediaPlayerPlaybackSource mediaPlayerPlaybackSource, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            mediaPlayerPlaybackSource = mediaPlayerPlaybackSourceChanged.source;
        }
        return mediaPlayerPlaybackSourceChanged.copy(mediaPlayerPlaybackSource);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MediaPlayerPlaybackSource getSource() {
        return this.source;
    }

    @NotNull
    public final MediaPlayerPlaybackSourceChanged copy(MediaPlayerPlaybackSource source) {
        return new MediaPlayerPlaybackSourceChanged(source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MediaPlayerPlaybackSourceChanged) && Intrinsics.areEqual(this.source, ((MediaPlayerPlaybackSourceChanged) other).source);
    }

    public final MediaPlayerPlaybackSource getSource() {
        return this.source;
    }

    public int hashCode() {
        MediaPlayerPlaybackSource mediaPlayerPlaybackSource = this.source;
        if (mediaPlayerPlaybackSource == null) {
            return 0;
        }
        return mediaPlayerPlaybackSource.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        if (this.source == null) {
            return NativeMapExtensionsKt.toNativeMap(w0.d());
        }
        a aVar = a.f20556b;
        Intrinsics.checkNotNullParameter(MediaPlayerPlaybackSource.class, "type");
        return NativeMapExtensionsKt.nativeMapOf(new Pair("source", NativeMapExtensionsKt.toNativeMap(aVar.a(d.E(b.f19552a, MediaPlayerPlaybackSource.class), this.source))));
    }

    @NotNull
    public String toString() {
        return "MediaPlayerPlaybackSourceChanged(source=" + this.source + ")";
    }

    public MediaPlayerPlaybackSourceChanged(MediaPlayerPlaybackSource mediaPlayerPlaybackSource) {
        this.source = mediaPlayerPlaybackSource;
    }
}
