package com.discord.audio.react.events;

import com.discord.audio.AndroidAudioDevice;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, d2 = {"Lcom/discord/audio/react/events/AudioManagerAudioDeviceChanged;", "Lcom/discord/reactevents/ReactEvent;", "device", "Lcom/discord/audio/AndroidAudioDevice;", "<init>", "(Lcom/discord/audio/AndroidAudioDevice;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/audio/AndroidAudioDevice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDevice", "()Lcom/discord/audio/AndroidAudioDevice;", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$audio_release", "$serializer", "Companion", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AudioManagerAudioDeviceChanged implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AndroidAudioDevice device;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/audio/react/events/AudioManagerAudioDeviceChanged$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/audio/react/events/AudioManagerAudioDeviceChanged;", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AudioManagerAudioDeviceChanged$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AudioManagerAudioDeviceChanged(int i7, AndroidAudioDevice androidAudioDevice, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i7 & 1)) {
            this.device = androidAudioDevice;
        } else {
            e1.l(i7, 1, AudioManagerAudioDeviceChanged$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ AudioManagerAudioDeviceChanged copy$default(AudioManagerAudioDeviceChanged audioManagerAudioDeviceChanged, AndroidAudioDevice androidAudioDevice, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            androidAudioDevice = audioManagerAudioDeviceChanged.device;
        }
        return audioManagerAudioDeviceChanged.copy(androidAudioDevice);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AndroidAudioDevice getDevice() {
        return this.device;
    }

    @NotNull
    public final AudioManagerAudioDeviceChanged copy(@NotNull AndroidAudioDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        return new AudioManagerAudioDeviceChanged(device);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AudioManagerAudioDeviceChanged) && Intrinsics.areEqual(this.device, ((AudioManagerAudioDeviceChanged) other).device);
    }

    @NotNull
    public final AndroidAudioDevice getDevice() {
        return this.device;
    }

    public int hashCode() {
        return this.device.hashCode();
    }

    @NotNull
    public String toString() {
        return "AudioManagerAudioDeviceChanged(device=" + this.device + ")";
    }

    public AudioManagerAudioDeviceChanged(@NotNull AndroidAudioDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableNativeMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("device", this.device.toNativeMap()));
    }
}
