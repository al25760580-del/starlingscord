package com.discord.media.engine.video.events;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/discord/media/engine/video/events/AudioInputInitializedEvent;", "Lcom/discord/reactevents/ReactEvent;", "timeToInitialized", "", "description", "", "", "", "<init>", "(DLjava/util/Map;)V", "getTimeToInitialized", "()D", "getDescription", "()Ljava/util/Map;", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AudioInputInitializedEvent implements ReactEvent {

    @NotNull
    private final Map<String, Object> description;
    private final double timeToInitialized;

    public AudioInputInitializedEvent(double d6, @NotNull Map<String, ? extends Object> description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.timeToInitialized = d6;
        this.description = description;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioInputInitializedEvent copy$default(AudioInputInitializedEvent audioInputInitializedEvent, double d6, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            d6 = audioInputInitializedEvent.timeToInitialized;
        }
        if ((i7 & 2) != 0) {
            map = audioInputInitializedEvent.description;
        }
        return audioInputInitializedEvent.copy(d6, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getTimeToInitialized() {
        return this.timeToInitialized;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.description;
    }

    @NotNull
    public final AudioInputInitializedEvent copy(double timeToInitialized, @NotNull Map<String, ? extends Object> description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new AudioInputInitializedEvent(timeToInitialized, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioInputInitializedEvent)) {
            return false;
        }
        AudioInputInitializedEvent audioInputInitializedEvent = (AudioInputInitializedEvent) other;
        return Double.compare(this.timeToInitialized, audioInputInitializedEvent.timeToInitialized) == 0 && Intrinsics.areEqual(this.description, audioInputInitializedEvent.description);
    }

    @NotNull
    public final Map<String, Object> getDescription() {
        return this.description;
    }

    public final double getTimeToInitialized() {
        return this.timeToInitialized;
    }

    public int hashCode() {
        return this.description.hashCode() + (Double.hashCode(this.timeToInitialized) * 31);
    }

    @NotNull
    public String toString() {
        return "AudioInputInitializedEvent(timeToInitialized=" + this.timeToInitialized + ", description=" + this.description + ")";
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableNativeMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("timeToInitialized", Double.valueOf(this.timeToInitialized)), new Pair("description", NativeMapExtensionsKt.toNativeMap(this.description)));
    }
}
