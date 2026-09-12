package com.discord.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.RemoteException;
import com.discord.device.utils.IsMetaQuestKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f1;
import kotlin.collections.p0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\n\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R$\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\r0+j\b\u0012\u0004\u0012\u00020\r`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/discord/audio/DiscordAudioManager2;", "Lcom/discord/audio/DiscordAudioManagerInterface;", "Landroid/media/AudioManager$OnCommunicationDeviceChangedListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/media/AudioDeviceInfo;", "device", "", "setActiveAudioDevice", "(Landroid/media/AudioDeviceInfo;)V", "Lkotlin/Function1;", "Lcom/discord/audio/DiscordAudioManagerListener;", "action", "notifyListeners", "(Lkotlin/jvm/functions/Function1;)V", "emitEffectiveDevice", "()V", "Landroid/media/AudioDeviceCallback;", "setupAudioDeviceCallback", "()Landroid/media/AudioDeviceCallback;", "", ViewProps.ON, "setCommunicationModeOn", "(Z)V", "Lcom/discord/audio/AndroidAudioDevice;", "(Lcom/discord/audio/AndroidAudioDevice;)V", "onCommunicationDeviceChanged", "getEffectiveAudioDevice", "()Lcom/discord/audio/AndroidAudioDevice;", "", "count", "setSCORetryCount", "(I)V", "", "getAudioDevices", "()Ljava/util/Set;", "listener", "addListener", "(Lcom/discord/audio/DiscordAudioManagerListener;)V", "removeListener", "Landroid/content/Context;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "Landroid/media/AudioManager;", "kotlin.jvm.PlatformType", "androidAudioManager", "Landroid/media/AudioManager;", "audioDevices", "Ljava/util/Set;", "audioDeviceCallback", "Landroid/media/AudioDeviceCallback;", "scoRetryCount", "I", "communicationDeviceChangedRegistered", "Z", "preferredAudioDevice", "Landroid/media/AudioDeviceInfo;", "Companion", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiscordAudioManager2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordAudioManager2.kt\ncom/discord/audio/DiscordAudioManager2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n295#2,2:232\n774#2:234\n865#2,2:235\n774#2:237\n865#2,2:238\n1563#2:240\n1634#2,3:241\n1869#2,2:244\n*S KotlinDebug\n*F\n+ 1 DiscordAudioManager2.kt\ncom/discord/audio/DiscordAudioManager2\n*L\n98#1:232,2\n136#1:234\n136#1:235,2\n155#1:237\n155#1:238,2\n157#1:240\n157#1:241,3\n170#1:244,2\n*E\n"})
public final class DiscordAudioManager2 implements DiscordAudioManagerInterface, AudioManager$OnCommunicationDeviceChangedListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static DiscordAudioManager2 instance;
    private final AudioManager androidAudioManager;

    @NotNull
    private final AudioDeviceCallback audioDeviceCallback;

    @NotNull
    private Set<AudioDeviceInfo> audioDevices;
    private boolean communicationDeviceChangedRegistered;

    @NotNull
    private final Context context;

    @NotNull
    private final ArrayList<DiscordAudioManagerListener> listeners;
    private AudioDeviceInfo preferredAudioDevice;
    private int scoRetryCount;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/audio/DiscordAudioManager2$Companion;", "", "<init>", "()V", "instance", "Lcom/discord/audio/DiscordAudioManager2;", "getInstance", "context", "Landroid/content/Context;", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiscordAudioManager2 getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (DiscordAudioManager2.instance == null) {
                DiscordAudioManager2.instance = new DiscordAudioManager2(context);
            }
            DiscordAudioManager2 discordAudioManager2 = DiscordAudioManager2.instance;
            Intrinsics.checkNotNull(discordAudioManager2);
            return discordAudioManager2;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.audio.DiscordAudioManager2$setupAudioDeviceCallback$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00032\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"com/discord/audio/DiscordAudioManager2$setupAudioDeviceCallback$1", "Landroid/media/AudioDeviceCallback;", "onAudioDevicesAdded", "", "addedDevices", "", "Landroid/media/AudioDeviceInfo;", "([Landroid/media/AudioDeviceInfo;)V", "onAudioDevicesRemoved", "removedDevices", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDiscordAudioManager2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordAudioManager2.kt\ncom/discord/audio/DiscordAudioManager2$setupAudioDeviceCallback$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,231:1\n3829#2:232\n4344#2,2:233\n3829#2:235\n4344#2,2:236\n*S KotlinDebug\n*F\n+ 1 DiscordAudioManager2.kt\ncom/discord/audio/DiscordAudioManager2$setupAudioDeviceCallback$1\n*L\n183#1:232\n183#1:233,2\n223#1:235\n223#1:236,2\n*E\n"})
    public static final class AnonymousClass1 extends AudioDeviceCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAudioDevicesAdded$lambda$1(DiscordAudioManager2 discordAudioManager2, DiscordAudioManagerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            listener.onAudioDevicesUpdated(CollectionsKt.i0(discordAudioManager2.getAudioDevices()));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAudioDevicesRemoved$lambda$5(DiscordAudioManager2 discordAudioManager2, DiscordAudioManagerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            listener.onAudioDevicesUpdated(CollectionsKt.i0(discordAudioManager2.getAudioDevices()));
            return Unit.f14616a;
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
            AudioDeviceInfo audioDeviceInfo;
            AudioDeviceInfo audioDeviceInfo2;
            if (addedDevices == null || addedDevices.length == 0) {
                return;
            }
            DiscordAudioManager2 discordAudioManager2 = DiscordAudioManager2.this;
            Set set = discordAudioManager2.audioDevices;
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo3 : addedDevices) {
                if (audioDeviceInfo3.isSink()) {
                    arrayList.add(audioDeviceInfo3);
                }
            }
            discordAudioManager2.audioDevices = f1.d(set, arrayList);
            DiscordAudioManager2 discordAudioManager3 = DiscordAudioManager2.this;
            discordAudioManager3.notifyListeners(new c(discordAudioManager3, 0));
            if (DiscordAudioManager2.this.preferredAudioDevice == null) {
                int length = addedDevices.length;
                int i7 = 0;
                while (true) {
                    audioDeviceInfo = null;
                    if (i7 >= length) {
                        audioDeviceInfo2 = null;
                        break;
                    }
                    audioDeviceInfo2 = addedDevices[i7];
                    if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(Integer.valueOf(audioDeviceInfo2.getType()), SimpleDeviceType.INVALID) == SimpleDeviceType.BLUETOOTH_HEADSET) {
                        break;
                    } else {
                        i7++;
                    }
                }
                for (AudioDeviceInfo audioDeviceInfo4 : addedDevices) {
                    if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(Integer.valueOf(audioDeviceInfo4.getType()), SimpleDeviceType.INVALID) == SimpleDeviceType.WIRED_HEADSET) {
                        audioDeviceInfo = audioDeviceInfo4;
                        break;
                    }
                }
                try {
                    if (audioDeviceInfo2 != null) {
                        DiscordAudioManager2.this.androidAudioManager.setCommunicationDevice(audioDeviceInfo2);
                    } else if (audioDeviceInfo != null) {
                        DiscordAudioManager2.this.androidAudioManager.setCommunicationDevice(audioDeviceInfo);
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                }
            }
            DiscordAudioManager2.this.emitEffectiveDevice();
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
            if (removedDevices == null || removedDevices.length == 0) {
                return;
            }
            DiscordAudioManager2 discordAudioManager2 = DiscordAudioManager2.this;
            Set set = discordAudioManager2.audioDevices;
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : removedDevices) {
                if (audioDeviceInfo.isSink()) {
                    arrayList.add(audioDeviceInfo);
                }
            }
            discordAudioManager2.audioDevices = f1.c(set, CollectionsKt.l0(arrayList));
            DiscordAudioManager2 discordAudioManager3 = DiscordAudioManager2.this;
            discordAudioManager3.notifyListeners(new c(discordAudioManager3, 1));
            DiscordAudioManager2.this.emitEffectiveDevice();
        }
    }

    public DiscordAudioManager2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.listeners = new ArrayList<>();
        AudioManager audioManager = (AudioManager) context.getSystemService(AudioManager.class);
        this.androidAudioManager = audioManager;
        this.audioDevices = p0.f14661d;
        this.audioDeviceCallback = setupAudioDeviceCallback();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        Intrinsics.checkNotNull(devices);
        this.audioDevices = y.J(devices);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitEffectiveDevice() {
        notifyListeners(new a(getEffectiveAudioDevice(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emitEffectiveDevice$lambda$7(AndroidAudioDevice androidAudioDevice, DiscordAudioManagerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.onActiveAudioDeviceChanged(androidAudioDevice);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListeners(Function1<? super DiscordAudioManagerListener, Unit> action) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    private final AudioDeviceCallback setupAudioDeviceCallback() {
        return new AnonymousClass1();
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void addListener(@NotNull DiscordAudioManagerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    @NotNull
    public Set<AndroidAudioDevice> getAudioDevices() {
        Set<AudioDeviceInfo> set = this.audioDevices;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            int type = ((AudioDeviceInfo) obj).getType();
            if (type != 1) {
                if (type != 8 && type != 18 && type != 24 && type != 27 && type != 30) {
                    arrayList.add(obj);
                }
            } else if (!IsMetaQuestKt.isMetaQuest()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Map<Integer, SimpleDeviceType> audioDeviceTypeToSimpleMapping = AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping();
            Integer numValueOf = Integer.valueOf(((AudioDeviceInfo) obj2).getType());
            SimpleDeviceType simpleDeviceType = SimpleDeviceType.INVALID;
            if (audioDeviceTypeToSimpleMapping.getOrDefault(numValueOf, simpleDeviceType) != simpleDeviceType) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(e0.l(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AndroidAudioDevice.INSTANCE.fromAudioDeviceInfo((AudioDeviceInfo) it.next()));
        }
        return CollectionsKt.k0(arrayList3);
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    @NotNull
    public AndroidAudioDevice getEffectiveAudioDevice() {
        AudioDeviceInfo communicationDevice = this.androidAudioManager.getCommunicationDevice();
        return communicationDevice != null ? AndroidAudioDevice.INSTANCE.fromAudioDeviceInfo(communicationDevice) : new AndroidAudioDevice();
    }

    public void onCommunicationDeviceChanged(AudioDeviceInfo device) {
        emitEffectiveDevice();
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void removeListener(@NotNull DiscordAudioManagerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void setActiveAudioDevice(@NotNull AndroidAudioDevice device) {
        Object next;
        Intrinsics.checkNotNullParameter(device, "device");
        Iterator<T> it = this.audioDevices.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AudioDeviceInfo) next).getId() != device.getDeviceId());
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) next;
        if (audioDeviceInfo == null) {
            return;
        }
        this.preferredAudioDevice = audioDeviceInfo;
        setActiveAudioDevice(audioDeviceInfo);
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void setCommunicationModeOn(boolean on2) {
        Object next;
        Object next2;
        if (!on2) {
            if (this.communicationDeviceChangedRegistered) {
                this.communicationDeviceChangedRegistered = false;
                this.androidAudioManager.removeOnCommunicationDeviceChangedListener(this);
            }
            this.androidAudioManager.unregisterAudioDeviceCallback(this.audioDeviceCallback);
            this.androidAudioManager.clearCommunicationDevice();
            this.androidAudioManager.setMode(0);
            return;
        }
        this.androidAudioManager.setMode(3);
        Object obj = null;
        this.androidAudioManager.registerAudioDeviceCallback(this.audioDeviceCallback, null);
        if (!this.communicationDeviceChangedRegistered) {
            this.androidAudioManager.addOnCommunicationDeviceChangedListener(this.context.getMainExecutor(), this);
            this.communicationDeviceChangedRegistered = true;
        }
        AudioDeviceInfo audioDeviceInfo = this.preferredAudioDevice;
        Iterator<T> it = this.audioDevices.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(Integer.valueOf(((AudioDeviceInfo) next).getType()), SimpleDeviceType.INVALID) != SimpleDeviceType.BLUETOOTH_HEADSET);
        AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) next;
        Iterator<T> it2 = this.audioDevices.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(Integer.valueOf(((AudioDeviceInfo) next2).getType()), SimpleDeviceType.INVALID) != SimpleDeviceType.WIRED_HEADSET);
        AudioDeviceInfo audioDeviceInfo3 = (AudioDeviceInfo) next2;
        for (Object obj2 : this.audioDevices) {
            if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(Integer.valueOf(((AudioDeviceInfo) obj2).getType()), SimpleDeviceType.INVALID) == SimpleDeviceType.SPEAKERPHONE) {
                obj = obj2;
                break;
            }
        }
        AudioDeviceInfo audioDeviceInfo4 = (AudioDeviceInfo) obj;
        if (audioDeviceInfo != null && this.audioDevices.contains(audioDeviceInfo)) {
            setActiveAudioDevice(audioDeviceInfo);
            return;
        }
        if (audioDeviceInfo2 != null) {
            setActiveAudioDevice(audioDeviceInfo2);
        } else if (audioDeviceInfo3 != null) {
            setActiveAudioDevice(audioDeviceInfo3);
        } else if (audioDeviceInfo4 != null) {
            setActiveAudioDevice(audioDeviceInfo4);
        }
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void setSCORetryCount(int count) {
        this.scoRetryCount = count;
    }

    private final void setActiveAudioDevice(AudioDeviceInfo device) {
        try {
            this.androidAudioManager.setCommunicationDevice(device);
        } catch (RemoteException | IllegalArgumentException unused) {
        }
    }
}
