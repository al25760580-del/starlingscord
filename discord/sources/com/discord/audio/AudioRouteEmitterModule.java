package com.discord.audio;

import android.os.Build;
import com.discord.audio.react.events.AudioRouteEmitterAudioRouteChanged;
import com.discord.codegen.NativeAudioRouteEmitterModuleSpec;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/audio/AudioRouteEmitterModule;", "Lcom/discord/codegen/NativeAudioRouteEmitterModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "audioManager", "Lcom/discord/audio/DiscordAudioManagerInterface;", "audioManagerListener", "com/discord/audio/AudioRouteEmitterModule$audioManagerListener$1", "Lcom/discord/audio/AudioRouteEmitterModule$audioManagerListener$1;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getCurrentRoute", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "initialize", "invalidate", "addListener", "type", "", "removeListeners", "count", "", "Companion", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioRouteEmitterModule extends NativeAudioRouteEmitterModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private DiscordAudioManagerInterface audioManager;

    @NotNull
    private final AudioRouteEmitterModule$audioManagerListener$1 audioManagerListener;

    @NotNull
    private final ReactEvents reactEvents;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/discord/audio/AudioRouteEmitterModule$Companion;", "", "<init>", "()V", "toRouteTypeString", "", "Lcom/discord/audio/SimpleDeviceType;", "Lcom/discord/audio/AndroidAudioDevice;", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SimpleDeviceType.values().length];
                try {
                    iArr[SimpleDeviceType.EARPIECE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SimpleDeviceType.BLUETOOTH_HEADSET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SimpleDeviceType.SPEAKERPHONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SimpleDeviceType.WIRED_HEADSET.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String toRouteTypeString(SimpleDeviceType simpleDeviceType) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[simpleDeviceType.ordinal()];
            if (i7 == 1) {
                return "Receiver";
            }
            if (i7 == 2) {
                return "Bluetooth";
            }
            if (i7 != 3) {
                return i7 != 4 ? "Unknown" : "WiredHeadset";
            }
            return "Speaker";
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toRouteTypeString(AndroidAudioDevice androidAudioDevice) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[androidAudioDevice.getSimpleDeviceType().ordinal()];
            if (i7 == 1) {
                return "Receiver";
            }
            if (i7 == 2) {
                return "Bluetooth";
            }
            if (i7 == 3) {
                return "Speaker";
            }
            if (i7 != 4) {
                return "Unknown";
            }
            return "WiredHeadset";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.discord.audio.AudioRouteEmitterModule$audioManagerListener$1] */
    public AudioRouteEmitterModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.audioManagerListener = new DiscordAudioManagerListener() { // from class: com.discord.audio.AudioRouteEmitterModule$audioManagerListener$1
            @Override // com.discord.audio.DiscordAudioManagerListener
            public void onActiveAudioDeviceChanged(AndroidAudioDevice activeAudioDevice) {
                Intrinsics.checkNotNullParameter(activeAudioDevice, "activeAudioDevice");
                AudioRouteEmitterAudioRouteChanged audioRouteEmitterAudioRouteChanged = new AudioRouteEmitterAudioRouteChanged(AudioRouteEmitterModule.INSTANCE.toRouteTypeString(activeAudioDevice), false);
                ReactEvents reactEvents = this.this$0.reactEvents;
                ReactApplicationContext reactApplicationContext = this.this$0.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                reactEvents.emitModuleEvent(reactApplicationContext, audioRouteEmitterAudioRouteChanged);
            }

            @Override // com.discord.audio.DiscordAudioManagerListener
            public void onAudioDevicesUpdated(List<AndroidAudioDevice> audioDevices) {
                Intrinsics.checkNotNullParameter(audioDevices, "audioDevices");
            }
        };
        this.reactEvents = new ReactEvents(new Pair("audio-route-changed", Reflection.getOrCreateKotlinClass(AudioRouteEmitterAudioRouteChanged.class)));
    }

    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.discord.codegen.NativeAudioRouteEmitterModuleSpec
    public void getCurrentRoute(Promise promise) {
        if (promise != null) {
            Companion companion = INSTANCE;
            DiscordAudioManagerInterface discordAudioManagerInterface = this.audioManager;
            if (discordAudioManagerInterface == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioManager");
                discordAudioManagerInterface = null;
            }
            promise.resolve(NativeMapExtensionsKt.nativeMapOf(new Pair("routeType", companion.toRouteTypeString(discordAudioManagerInterface.getEffectiveAudioDevice())), new Pair("multipleRoutesAvailable", Boolean.FALSE)));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        DiscordAudioManagerInterface companion;
        super.initialize();
        if (Build.VERSION.SDK_INT >= 33) {
            DiscordAudioManager2.Companion companion2 = DiscordAudioManager2.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            companion = companion2.getInstance(reactApplicationContext);
        } else {
            DiscordAudioManager.Companion companion3 = DiscordAudioManager.INSTANCE;
            ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
            companion = companion3.getInstance(reactApplicationContext2);
        }
        this.audioManager = companion;
        if (companion == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            companion = null;
        }
        companion.addListener(this.audioManagerListener);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        DiscordAudioManagerInterface discordAudioManagerInterface = this.audioManager;
        if (discordAudioManagerInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            discordAudioManagerInterface = null;
        }
        discordAudioManagerInterface.removeListener(this.audioManagerListener);
    }

    public final void removeListeners(int count) {
    }
}
