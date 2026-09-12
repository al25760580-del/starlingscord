package com.discord.audio;

import android.os.Build;
import com.discord.audio.react.events.AudioManagerAudioDeviceChanged;
import com.discord.audio.react.events.AudioManagerAudioDevicesUpdated;
import com.discord.codegen.NativeAudioManagerModuleSpec;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/audio/AudioManagerModule;", "Lcom/discord/codegen/NativeAudioManagerModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "audioManager", "Lcom/discord/audio/DiscordAudioManagerInterface;", "getAudioDevices", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "setActiveAudioDevice", "deviceMap", "Lcom/facebook/react/bridge/ReadableMap;", "getActiveAudioDevice", "setCommunicationModeOn", ViewProps.ON, "", "setSCORetryCount", "count", "", "addListener", "eventType", "", "removeListeners", "Companion", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioManagerModule.kt\ncom/discord/audio/AudioManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1563#2:88\n1634#2,3:89\n*S KotlinDebug\n*F\n+ 1 AudioManagerModule.kt\ncom/discord/audio/AudioManagerModule\n*L\n20#1:88\n20#1:89,3\n*E\n"})
public final class AudioManagerModule extends NativeAudioManagerModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReactEvents reactEvents = new ReactEvents(new Pair("android-audio-devices-updated", Reflection.getOrCreateKotlinClass(AudioManagerAudioDevicesUpdated.class)), new Pair("android-active-audio-device-changed", Reflection.getOrCreateKotlinClass(AudioManagerAudioDeviceChanged.class)));
    private DiscordAudioManagerInterface audioManager;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/audio/AudioManagerModule$Companion;", "", "<init>", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NativeModule create(@NotNull final ReactApplicationContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            AudioManagerModule audioManagerModule = new AudioManagerModule(reactContext);
            if (Build.VERSION.SDK_INT >= 33) {
                audioManagerModule.audioManager = DiscordAudioManager2.INSTANCE.getInstance(reactContext);
            } else {
                audioManagerModule.audioManager = DiscordAudioManager.INSTANCE.getInstance(reactContext);
            }
            DiscordAudioManagerListener discordAudioManagerListener = new DiscordAudioManagerListener() { // from class: com.discord.audio.AudioManagerModule$Companion$create$audioManagerListener$1
                @Override // com.discord.audio.DiscordAudioManagerListener
                public void onActiveAudioDeviceChanged(AndroidAudioDevice activeAudioDevice) {
                    Intrinsics.checkNotNullParameter(activeAudioDevice, "activeAudioDevice");
                    AudioManagerModule.reactEvents.emitModuleEvent(reactContext, new AudioManagerAudioDeviceChanged(activeAudioDevice));
                }

                @Override // com.discord.audio.DiscordAudioManagerListener
                public void onAudioDevicesUpdated(List<AndroidAudioDevice> audioDevices) {
                    Intrinsics.checkNotNullParameter(audioDevices, "audioDevices");
                    AudioManagerModule.reactEvents.emitModuleEvent(reactContext, new AudioManagerAudioDevicesUpdated(audioDevices));
                }
            };
            DiscordAudioManagerInterface discordAudioManagerInterface = audioManagerModule.audioManager;
            if (discordAudioManagerInterface == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioManager");
                discordAudioManagerInterface = null;
            }
            discordAudioManagerInterface.addListener(discordAudioManagerListener);
            return audioManagerModule;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeAudioManagerModuleSpec
    public void addListener(@NotNull String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
    }

    @Override // com.discord.codegen.NativeAudioManagerModuleSpec
    public void getActiveAudioDevice(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        DiscordAudioManagerInterface discordAudioManagerInterface = this.audioManager;
        if (discordAudioManagerInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            discordAudioManagerInterface = null;
        }
        promise.resolve(discordAudioManagerInterface.getEffectiveAudioDevice().toNativeMap());
    }

    @Override // com.discord.codegen.NativeAudioManagerModuleSpec
    public void getAudioDevices(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        DiscordAudioManagerInterface discordAudioManagerInterface = this.audioManager;
        if (discordAudioManagerInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            discordAudioManagerInterface = null;
        }
        Set<AndroidAudioDevice> audioDevices = discordAudioManagerInterface.getAudioDevices();
        ArrayList arrayList = new ArrayList(e0.l(audioDevices, 10));
        Iterator<T> it = audioDevices.iterator();
        while (it.hasNext()) {
            arrayList.add(((AndroidAudioDevice) it.next()).toNativeMap());
        }
        promise.resolve(NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null));
    }

    @Override // com.discord.codegen.NativeAudioManagerModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.discord.codegen.NativeAudioManagerModuleSpec
    public void setActiveAudioDevice(@NotNull ReadableMap deviceMap) {
        Intrinsics.checkNotNullParameter(deviceMap, "deviceMap");
        AndroidAudioDevice androidAudioDeviceFromReadableMap = AndroidAudioDevice.INSTANCE.fromReadableMap(deviceMap);
        DiscordAudioManagerInterface discordAudioManagerInterface = this.audioManager;
        if (discordAudioManagerInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            discordAudioManagerInterface = null;
        }
        discordAudioManagerInterface.setActiveAudioDevice(androidAudioDeviceFromReadableMap);
    }

    @Override // com.discord.codegen.NativeAudioManagerModuleSpec
    public void setCommunicationModeOn(boolean on2) {
        DiscordAudioManagerInterface discordAudioManagerInterface = this.audioManager;
        if (discordAudioManagerInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            discordAudioManagerInterface = null;
        }
        discordAudioManagerInterface.setCommunicationModeOn(on2);
    }

    @Override // com.discord.codegen.NativeAudioManagerModuleSpec
    public void setSCORetryCount(double count) {
        DiscordAudioManagerInterface discordAudioManagerInterface = this.audioManager;
        if (discordAudioManagerInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            discordAudioManagerInterface = null;
        }
        discordAudioManagerInterface.setSCORetryCount((int) count);
    }
}
