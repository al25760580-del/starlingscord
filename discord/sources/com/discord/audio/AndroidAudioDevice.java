package com.discord.audio;

import android.media.AudioDeviceInfo;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.b0;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B?\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0002\u0010\u000eJ\u0006\u0010\u001d\u001a\u00020\u001eJ%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lcom/discord/audio/AndroidAudioDevice;", "", "<init>", "()V", "seen0", "", "deviceType", "simpleDeviceType", "Lcom/discord/audio/SimpleDeviceType;", "deviceId", "deviceName", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/audio/SimpleDeviceType;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDeviceType", "()I", "setDeviceType", "(I)V", "getSimpleDeviceType", "()Lcom/discord/audio/SimpleDeviceType;", "setSimpleDeviceType", "(Lcom/discord/audio/SimpleDeviceType;)V", "getDeviceId", "setDeviceId", "getDeviceName", "()Ljava/lang/String;", "setDeviceName", "(Ljava/lang/String;)V", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$audio_release", "Companion", "$serializer", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidAudioDevice {
    private int deviceId;

    @NotNull
    private String deviceName;
    private int deviceType;

    @NotNull
    private SimpleDeviceType simpleDeviceType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, l.a(m.f19486e, new a7.a(4)), null, null};

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/audio/AndroidAudioDevice$Companion;", "", "<init>", "()V", "fromSimpleDeviceType", "Lcom/discord/audio/AndroidAudioDevice;", "deviceType", "Lcom/discord/audio/SimpleDeviceType;", "fromReadableMap", "map", "Lcom/facebook/react/bridge/ReadableMap;", "fromAudioDeviceInfo", "deviceInfo", "Landroid/media/AudioDeviceInfo;", "serializer", "Lkotlinx/serialization/KSerializer;", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AndroidAudioDevice fromAudioDeviceInfo(@NotNull AudioDeviceInfo deviceInfo) {
            Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            AndroidAudioDevice androidAudioDevice = new AndroidAudioDevice();
            androidAudioDevice.setDeviceName(deviceInfo.getProductName().toString());
            androidAudioDevice.setDeviceType(deviceInfo.getType());
            SimpleDeviceType simpleDeviceType = AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().get(Integer.valueOf(androidAudioDevice.getDeviceType()));
            if (simpleDeviceType == null) {
                simpleDeviceType = SimpleDeviceType.INVALID;
            }
            androidAudioDevice.setSimpleDeviceType(simpleDeviceType);
            androidAudioDevice.setDeviceId(deviceInfo.getId());
            return androidAudioDevice;
        }

        @NotNull
        public final AndroidAudioDevice fromReadableMap(@NotNull ReadableMap map) {
            Intrinsics.checkNotNullParameter(map, "map");
            AndroidAudioDevice androidAudioDevice = new AndroidAudioDevice();
            String string = map.getString("deviceName");
            if (string == null) {
                string = "";
            }
            androidAudioDevice.setDeviceName(string);
            if (map.hasKey("deviceId")) {
                androidAudioDevice.setDeviceId(map.getInt("deviceId"));
            }
            SimpleDeviceType simpleDeviceTypeValueOf = SimpleDeviceType.INVALID;
            try {
                String string2 = map.getString("simpleDeviceType");
                if (string2 != null) {
                    simpleDeviceTypeValueOf = SimpleDeviceType.valueOf(string2);
                }
            } catch (Exception unused) {
            }
            androidAudioDevice.setSimpleDeviceType(simpleDeviceTypeValueOf);
            if (map.hasKey("deviceType")) {
                androidAudioDevice.setDeviceType(map.getInt("deviceType"));
            }
            return androidAudioDevice;
        }

        @NotNull
        public final AndroidAudioDevice fromSimpleDeviceType(@NotNull SimpleDeviceType deviceType) {
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            AndroidAudioDevice androidAudioDevice = new AndroidAudioDevice();
            androidAudioDevice.setSimpleDeviceType(deviceType);
            androidAudioDevice.setDeviceId(deviceType.ordinal());
            return androidAudioDevice;
        }

        @NotNull
        public final KSerializer serializer() {
            return AndroidAudioDevice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AndroidAudioDevice() {
        this.simpleDeviceType = SimpleDeviceType.INVALID;
        this.deviceId = -1;
        this.deviceName = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        SimpleDeviceType[] values = SimpleDeviceType.values();
        Intrinsics.checkNotNullParameter("com.discord.audio.SimpleDeviceType", "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new b0("com.discord.audio.SimpleDeviceType", values);
    }

    public static final /* synthetic */ void write$Self$audio_release(AndroidAudioDevice self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        if (output.u(serialDesc, 0) || self.deviceType != 0) {
            output.l(0, self.deviceType, serialDesc);
        }
        if (output.u(serialDesc, 1) || self.simpleDeviceType != SimpleDeviceType.INVALID) {
            output.g(serialDesc, 1, (KSerializer) lazyArr[1].getValue(), self.simpleDeviceType);
        }
        if (output.u(serialDesc, 2) || self.deviceId != -1) {
            output.l(2, self.deviceId, serialDesc);
        }
        if (!output.u(serialDesc, 3) && Intrinsics.areEqual(self.deviceName, "")) {
            return;
        }
        output.q(serialDesc, 3, self.deviceName);
    }

    public final int getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final SimpleDeviceType getSimpleDeviceType() {
        return this.simpleDeviceType;
    }

    public final void setDeviceId(int i7) {
        this.deviceId = i7;
    }

    public final void setDeviceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceName = str;
    }

    public final void setDeviceType(int i7) {
        this.deviceType = i7;
    }

    public final void setSimpleDeviceType(@NotNull SimpleDeviceType simpleDeviceType) {
        Intrinsics.checkNotNullParameter(simpleDeviceType, "<set-?>");
        this.simpleDeviceType = simpleDeviceType;
    }

    @NotNull
    public final WritableNativeMap toNativeMap() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("deviceType", Integer.valueOf(this.deviceType)), new Pair("simpleDeviceType", this.simpleDeviceType.name()), new Pair("deviceId", Integer.valueOf(this.deviceId)), new Pair("deviceName", this.deviceName));
    }

    public /* synthetic */ AndroidAudioDevice(int i7, int i10, SimpleDeviceType simpleDeviceType, int i11, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.deviceType = (i7 & 1) == 0 ? 0 : i10;
        if ((i7 & 2) == 0) {
            this.simpleDeviceType = SimpleDeviceType.INVALID;
        } else {
            this.simpleDeviceType = simpleDeviceType;
        }
        if ((i7 & 4) == 0) {
            this.deviceId = -1;
        } else {
            this.deviceId = i11;
        }
        if ((i7 & 8) == 0) {
            this.deviceName = "";
        } else {
            this.deviceName = str;
        }
    }
}
