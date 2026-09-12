package com.discord.audio.react.events;

import com.discord.audio.AndroidAudioDevice;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/discord/audio/react/events/AudioManagerAudioDevicesUpdated;", "Lcom/discord/reactevents/ReactEvent;", "devices", "", "Lcom/discord/audio/AndroidAudioDevice;", "<init>", "(Ljava/util/List;)V", "getDevices", "()Ljava/util/List;", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AudioManagerAudioDevicesUpdated implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<AndroidAudioDevice> devices;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¨\u0006\t"}, d2 = {"Lcom/discord/audio/react/events/AudioManagerAudioDevicesUpdated$Companion;", "", "<init>", "()V", "convertDevices", "Lcom/facebook/react/bridge/ReadableNativeArray;", "devices", "", "Lcom/discord/audio/AndroidAudioDevice;", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAudioManagerAudioDevicesUpdated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioManagerAudioDevicesUpdated.kt\ncom/discord/audio/react/events/AudioManagerAudioDevicesUpdated$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1563#2:24\n1634#2,3:25\n*S KotlinDebug\n*F\n+ 1 AudioManagerAudioDevicesUpdated.kt\ncom/discord/audio/react/events/AudioManagerAudioDevicesUpdated$Companion\n*L\n19#1:24\n19#1:25,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReadableNativeArray convertDevices(List<AndroidAudioDevice> devices) {
            ArrayList arrayList = new ArrayList(e0.l(devices, 10));
            Iterator<T> it = devices.iterator();
            while (it.hasNext()) {
                arrayList.add(((AndroidAudioDevice) it.next()).toNativeMap());
            }
            return NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null);
        }

        private Companion() {
        }
    }

    public AudioManagerAudioDevicesUpdated(@NotNull List<AndroidAudioDevice> devices) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        this.devices = devices;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioManagerAudioDevicesUpdated copy$default(AudioManagerAudioDevicesUpdated audioManagerAudioDevicesUpdated, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = audioManagerAudioDevicesUpdated.devices;
        }
        return audioManagerAudioDevicesUpdated.copy(list);
    }

    @NotNull
    public final List<AndroidAudioDevice> component1() {
        return this.devices;
    }

    @NotNull
    public final AudioManagerAudioDevicesUpdated copy(@NotNull List<AndroidAudioDevice> devices) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        return new AudioManagerAudioDevicesUpdated(devices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AudioManagerAudioDevicesUpdated) && Intrinsics.areEqual(this.devices, ((AudioManagerAudioDevicesUpdated) other).devices);
    }

    @NotNull
    public final List<AndroidAudioDevice> getDevices() {
        return this.devices;
    }

    public int hashCode() {
        return this.devices.hashCode();
    }

    @NotNull
    public String toString() {
        return "AudioManagerAudioDevicesUpdated(devices=" + this.devices + ")";
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableNativeMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("devices", INSTANCE.convertDevices(this.devices)));
    }
}
