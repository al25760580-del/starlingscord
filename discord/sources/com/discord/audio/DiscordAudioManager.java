package com.discord.audio;

import a3.e;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.discord.logging.Log;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001I\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0010H\u0002¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b\u0015\u0010$J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010&J\u000f\u0010-\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010&J#\u00100\u001a\u00020\r2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0.H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R$\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u001903j\b\u0012\u0004\u0012\u00020\u0019`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010;\u001a\n :*\u0004\u0018\u000109098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010B\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00108R\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/discord/audio/DiscordAudioManager;", "Lcom/discord/audio/DiscordAudioManagerInterface;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "state", "", "scoStateToString", "(I)Ljava/lang/String;", "", ViewProps.ON, "", "setCommunicationModeOn", "(Z)V", "", "Lcom/discord/audio/AndroidAudioDevice;", "getAudioDevices", "()Ljava/util/Set;", "device", "setActiveAudioDevice", "(Lcom/discord/audio/AndroidAudioDevice;)V", "getEffectiveAudioDevice", "()Lcom/discord/audio/AndroidAudioDevice;", "Lcom/discord/audio/DiscordAudioManagerListener;", "listener", "addListener", "(Lcom/discord/audio/DiscordAudioManagerListener;)V", "removeListener", "count", "setSCORetryCount", "(I)V", "Lcom/discord/audio/SimpleDeviceType;", "getSimpleDevices", "deviceType", "(Lcom/discord/audio/SimpleDeviceType;)V", "emitEffectiveDevice", "()V", "getActiveAudioDevice", "()Lcom/discord/audio/SimpleDeviceType;", "Landroid/media/AudioDeviceCallback;", "setupAudioDeviceCallback", "()Landroid/media/AudioDeviceCallback;", "registerAudioManagerReceivers", "unRegisterAudioManagerReceivers", "Lkotlin/Function1;", "action", "notifyListeners", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "communicationModeOn", "Z", "Landroid/media/AudioManager;", "kotlin.jvm.PlatformType", "androidAudioManager", "Landroid/media/AudioManager;", "audioDeviceCallback", "Landroid/media/AudioDeviceCallback;", "scoRetryCount", "I", "scoRetryAttempts", "scoReceiverRegistered", "", "Landroid/media/AudioDeviceInfo;", "audioDevices", "Ljava/util/List;", "desiredDeviceType", "Lcom/discord/audio/SimpleDeviceType;", "com/discord/audio/DiscordAudioManager$audioManagerBroadcastReceiver$1", "audioManagerBroadcastReceiver", "Lcom/discord/audio/DiscordAudioManager$audioManagerBroadcastReceiver$1;", "Companion", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiscordAudioManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordAudioManager.kt\ncom/discord/audio/DiscordAudioManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,346:1\n1563#2:347\n1634#2,3:348\n774#2:351\n865#2,2:352\n1563#2:354\n1634#2,3:355\n1761#2,3:358\n1761#2,3:361\n1869#2,2:364\n*S KotlinDebug\n*F\n+ 1 DiscordAudioManager.kt\ncom/discord/audio/DiscordAudioManager\n*L\n154#1:347\n154#1:348,3\n161#1:351\n161#1:352,2\n162#1:354\n162#1:355,3\n244#1:358,3\n249#1:361,3\n318#1:364,2\n*E\n"})
public final class DiscordAudioManager implements DiscordAudioManagerInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static DiscordAudioManager instance;
    private final AudioManager androidAudioManager;

    @NotNull
    private final AudioDeviceCallback audioDeviceCallback;

    @NotNull
    private volatile List<AudioDeviceInfo> audioDevices;

    @NotNull
    private final DiscordAudioManager$audioManagerBroadcastReceiver$1 audioManagerBroadcastReceiver;
    private boolean communicationModeOn;

    @NotNull
    private final Context context;

    @NotNull
    private SimpleDeviceType desiredDeviceType;

    @NotNull
    private final ArrayList<DiscordAudioManagerListener> listeners;
    private boolean scoReceiverRegistered;
    private int scoRetryAttempts;
    private int scoRetryCount;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/audio/DiscordAudioManager$Companion;", "", "<init>", "()V", "instance", "Lcom/discord/audio/DiscordAudioManager;", "getInstance", "context", "Landroid/content/Context;", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiscordAudioManager getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (DiscordAudioManager.instance == null) {
                DiscordAudioManager.instance = new DiscordAudioManager(context);
            }
            DiscordAudioManager discordAudioManager = DiscordAudioManager.instance;
            Intrinsics.checkNotNull(discordAudioManager);
            return discordAudioManager;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SimpleDeviceType.values().length];
            try {
                iArr[SimpleDeviceType.SPEAKERPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SimpleDeviceType.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SimpleDeviceType.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SimpleDeviceType.BLUETOOTH_HEADSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SimpleDeviceType.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SimpleDeviceType.INVALID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.discord.audio.DiscordAudioManager$setupAudioDeviceCallback$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00032\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"com/discord/audio/DiscordAudioManager$setupAudioDeviceCallback$1", "Landroid/media/AudioDeviceCallback;", "onAudioDevicesAdded", "", "addedDevices", "", "Landroid/media/AudioDeviceInfo;", "([Landroid/media/AudioDeviceInfo;)V", "onAudioDevicesRemoved", "removedDevices", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDiscordAudioManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordAudioManager.kt\ncom/discord/audio/DiscordAudioManager$setupAudioDeviceCallback$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,346:1\n3829#2:347\n4344#2,2:348\n12637#2,2:350\n3829#2:352\n4344#2,2:353\n*S KotlinDebug\n*F\n+ 1 DiscordAudioManager.kt\ncom/discord/audio/DiscordAudioManager$setupAudioDeviceCallback$1\n*L\n262#1:347\n262#1:348,2\n267#1:350,2\n279#1:352\n279#1:353,2\n*E\n"})
    public static final class AnonymousClass1 extends AudioDeviceCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAudioDevicesAdded$lambda$1(DiscordAudioManager discordAudioManager, DiscordAudioManagerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            listener.onAudioDevicesUpdated(CollectionsKt.i0(discordAudioManager.getAudioDevices()));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAudioDevicesRemoved$lambda$4(DiscordAudioManager discordAudioManager, DiscordAudioManagerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            listener.onAudioDevicesUpdated(CollectionsKt.i0(discordAudioManager.getAudioDevices()));
            return Unit.f14616a;
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
            if (addedDevices == null || addedDevices.length == 0) {
                return;
            }
            DiscordAudioManager discordAudioManager = DiscordAudioManager.this;
            List list = discordAudioManager.audioDevices;
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : addedDevices) {
                if (audioDeviceInfo.isSink()) {
                    arrayList.add(audioDeviceInfo);
                }
            }
            discordAudioManager.audioDevices = CollectionsKt.V(list, arrayList);
            DiscordAudioManager discordAudioManager2 = DiscordAudioManager.this;
            discordAudioManager2.notifyListeners(new b(discordAudioManager2, 0));
            if (DiscordAudioManager.this.desiredDeviceType == SimpleDeviceType.DEFAULT) {
                for (AudioDeviceInfo audioDeviceInfo2 : addedDevices) {
                    if (audioDeviceInfo2.getType() == 7) {
                        DiscordAudioManager.this.androidAudioManager.startBluetoothSco();
                        DiscordAudioManager.this.androidAudioManager.setSpeakerphoneOn(false);
                        break;
                    }
                }
            }
            DiscordAudioManager.this.emitEffectiveDevice();
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
            List listI0;
            if (removedDevices == null || removedDevices.length == 0) {
                return;
            }
            DiscordAudioManager discordAudioManager = DiscordAudioManager.this;
            List list = discordAudioManager.audioDevices;
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : removedDevices) {
                if (audioDeviceInfo.isSink()) {
                    arrayList.add(audioDeviceInfo);
                }
            }
            Set elements = CollectionsKt.l0(arrayList);
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(elements, "<this>");
            Set setI0 = elements instanceof Collection ? elements : CollectionsKt.i0(elements);
            if (setI0.isEmpty()) {
                listI0 = CollectionsKt.i0(list);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (!setI0.contains(obj)) {
                        arrayList2.add(obj);
                    }
                }
                listI0 = arrayList2;
            }
            discordAudioManager.audioDevices = listI0;
            DiscordAudioManager discordAudioManager2 = DiscordAudioManager.this;
            discordAudioManager2.notifyListeners(new b(discordAudioManager2, 1));
            SimpleDeviceType simpleDeviceType = DiscordAudioManager.this.desiredDeviceType;
            SimpleDeviceType simpleDeviceType2 = SimpleDeviceType.DEFAULT;
            if (simpleDeviceType != simpleDeviceType2 && !DiscordAudioManager.this.getSimpleDevices().contains(DiscordAudioManager.this.desiredDeviceType)) {
                if (DiscordAudioManager.this.desiredDeviceType == SimpleDeviceType.BLUETOOTH_HEADSET) {
                    DiscordAudioManager.this.androidAudioManager.stopBluetoothSco();
                }
                DiscordAudioManager.this.desiredDeviceType = simpleDeviceType2;
            }
            DiscordAudioManager.this.emitEffectiveDevice();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.discord.audio.DiscordAudioManager$audioManagerBroadcastReceiver$1] */
    public DiscordAudioManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.listeners = new ArrayList<>();
        AudioManager audioManager = (AudioManager) context.getSystemService(AudioManager.class);
        this.androidAudioManager = audioManager;
        this.audioDeviceCallback = setupAudioDeviceCallback();
        this.audioDevices = n0.f14659d;
        this.desiredDeviceType = SimpleDeviceType.DEFAULT;
        this.audioManagerBroadcastReceiver = new BroadcastReceiver() { // from class: com.discord.audio.DiscordAudioManager$audioManagerBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String action = intent != null ? intent.getAction() : null;
                if (action != null && action.hashCode() == -1692127708 && action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                    int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    Log log = Log.INSTANCE;
                    Log.i$default(log, DiscordAudioManagerKt.TAG, e.m("Bluetooth SCO State Change - previous: ", this.this$0.scoStateToString(intExtra), " current: ", this.this$0.scoStateToString(intExtra2)), (Throwable) null, 4, (Object) null);
                    if (intExtra2 != -1 && intExtra2 != 0) {
                        if (intExtra2 == 1 && this.this$0.androidAudioManager.isBluetoothScoOn()) {
                            this.this$0.scoRetryAttempts = 0;
                            this.this$0.emitEffectiveDevice();
                            return;
                        }
                        return;
                    }
                    if (this.this$0.desiredDeviceType == SimpleDeviceType.BLUETOOTH_HEADSET) {
                        if (this.this$0.scoRetryAttempts >= this.this$0.scoRetryCount) {
                            this.this$0.desiredDeviceType = SimpleDeviceType.DEFAULT;
                            this.this$0.emitEffectiveDevice();
                        } else {
                            this.this$0.scoRetryAttempts++;
                            Log.i$default(log, DiscordAudioManagerKt.TAG, kk.b.h(this.this$0.scoRetryAttempts, "Retry SCO # "), (Throwable) null, 4, (Object) null);
                            this.this$0.androidAudioManager.startBluetoothSco();
                        }
                    }
                }
            }
        };
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        Intrinsics.checkNotNull(devices);
        this.audioDevices = y.H(devices);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitEffectiveDevice() {
        notifyListeners(new a(getEffectiveAudioDevice(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emitEffectiveDevice$lambda$3(AndroidAudioDevice androidAudioDevice, DiscordAudioManagerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.onActiveAudioDeviceChanged(androidAudioDevice);
        return Unit.f14616a;
    }

    private final SimpleDeviceType getActiveAudioDevice() {
        SimpleDeviceType simpleDeviceType = SimpleDeviceType.INVALID;
        if (this.androidAudioManager.isSpeakerphoneOn()) {
            return SimpleDeviceType.SPEAKERPHONE;
        }
        if (this.androidAudioManager.isBluetoothScoOn()) {
            return SimpleDeviceType.BLUETOOTH_HEADSET;
        }
        List<AudioDeviceInfo> list = this.audioDevices;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SimpleDeviceType orDefault = AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(Integer.valueOf(((AudioDeviceInfo) it.next()).getType()), SimpleDeviceType.INVALID);
                SimpleDeviceType simpleDeviceType2 = SimpleDeviceType.WIRED_HEADSET;
                if (orDefault == simpleDeviceType2) {
                    return simpleDeviceType2;
                }
            }
        }
        List<AudioDeviceInfo> list2 = this.audioDevices;
        if (list2 != null && list2.isEmpty()) {
            return simpleDeviceType;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            SimpleDeviceType orDefault2 = AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(Integer.valueOf(((AudioDeviceInfo) it2.next()).getType()), SimpleDeviceType.INVALID);
            SimpleDeviceType simpleDeviceType3 = SimpleDeviceType.EARPIECE;
            if (orDefault2 == simpleDeviceType3) {
                return simpleDeviceType3;
            }
        }
        return simpleDeviceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<SimpleDeviceType> getSimpleDevices() {
        List<AudioDeviceInfo> list = this.audioDevices;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Map<Integer, SimpleDeviceType> audioDeviceTypeToSimpleMapping = AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping();
            Integer numValueOf = Integer.valueOf(((AudioDeviceInfo) obj).getType());
            SimpleDeviceType simpleDeviceType = SimpleDeviceType.INVALID;
            if (audioDeviceTypeToSimpleMapping.getOrDefault(numValueOf, simpleDeviceType) != simpleDeviceType) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(Integer.valueOf(((AudioDeviceInfo) it.next()).getType()), SimpleDeviceType.INVALID));
        }
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(arrayList2);
        if (linkedHashSetK0.contains(SimpleDeviceType.WIRED_HEADSET)) {
            linkedHashSetK0.remove(SimpleDeviceType.EARPIECE);
        }
        return linkedHashSetK0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListeners(Function1<? super DiscordAudioManagerListener, Unit> action) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    private final void registerAudioManagerReceivers() {
        if (this.scoReceiverRegistered) {
            return;
        }
        Log.i$default(Log.INSTANCE, DiscordAudioManagerKt.TAG, "Registering SCO Callbacks", (Throwable) null, 4, (Object) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        y0.b.f(this.context, this.audioManagerBroadcastReceiver, intentFilter, null, 4);
        this.scoReceiverRegistered = true;
    }

    private final AudioDeviceCallback setupAudioDeviceCallback() {
        return new AnonymousClass1();
    }

    private final void unRegisterAudioManagerReceivers() {
        Log.i$default(Log.INSTANCE, DiscordAudioManagerKt.TAG, "Un-Registering SCO Callbacks", (Throwable) null, 4, (Object) null);
        try {
            this.context.unregisterReceiver(this.audioManagerBroadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
        this.scoReceiverRegistered = false;
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void addListener(@NotNull DiscordAudioManagerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    @NotNull
    public Set<AndroidAudioDevice> getAudioDevices() {
        Set<SimpleDeviceType> simpleDevices = getSimpleDevices();
        ArrayList arrayList = new ArrayList(e0.l(simpleDevices, 10));
        Iterator<T> it = simpleDevices.iterator();
        while (it.hasNext()) {
            arrayList.add(AndroidAudioDevice.INSTANCE.fromSimpleDeviceType((SimpleDeviceType) it.next()));
        }
        return CollectionsKt.k0(arrayList);
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    @NotNull
    public AndroidAudioDevice getEffectiveAudioDevice() {
        SimpleDeviceType activeAudioDevice = getActiveAudioDevice();
        SimpleDeviceType simpleDeviceType = this.desiredDeviceType;
        if (simpleDeviceType == SimpleDeviceType.DEFAULT) {
            return AndroidAudioDevice.INSTANCE.fromSimpleDeviceType(activeAudioDevice);
        }
        SimpleDeviceType simpleDeviceType2 = SimpleDeviceType.WIRED_HEADSET;
        return (activeAudioDevice == simpleDeviceType2 && simpleDeviceType == SimpleDeviceType.EARPIECE) ? AndroidAudioDevice.INSTANCE.fromSimpleDeviceType(simpleDeviceType2) : AndroidAudioDevice.INSTANCE.fromSimpleDeviceType(simpleDeviceType);
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void removeListener(@NotNull DiscordAudioManagerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    @NotNull
    public final String scoStateToString(int state) {
        if (state == -1) {
            return "SCO_AUDIO_STATE_ERROR";
        }
        if (state == 0) {
            return "SCO_AUDIO_STATE_DISCONNECTED";
        }
        if (state != 1) {
            return state != 2 ? "UNKNOWN" : "SCO_AUDIO_STATE_CONNECTING";
        }
        return "SCO_AUDIO_STATE_CONNECTED";
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void setActiveAudioDevice(@NotNull AndroidAudioDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        setActiveAudioDevice(device.getSimpleDeviceType());
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void setCommunicationModeOn(boolean on2) {
        this.communicationModeOn = on2;
        this.scoRetryAttempts = 0;
        Log.i$default(Log.INSTANCE, DiscordAudioManagerKt.TAG, "setCommunicationModeOn: " + on2, (Throwable) null, 4, (Object) null);
        if (on2) {
            AudioDeviceInfo[] devices = this.androidAudioManager.getDevices(2);
            Intrinsics.checkNotNull(devices);
            this.audioDevices = y.H(devices);
            this.androidAudioManager.registerAudioDeviceCallback(this.audioDeviceCallback, null);
            this.androidAudioManager.setMode(3);
            registerAudioManagerReceivers();
            SimpleDeviceType simpleDeviceType = this.desiredDeviceType;
            if (simpleDeviceType != SimpleDeviceType.DEFAULT) {
                setActiveAudioDevice(simpleDeviceType);
            } else {
                Set<SimpleDeviceType> simpleDevices = getSimpleDevices();
                SimpleDeviceType simpleDeviceType2 = SimpleDeviceType.BLUETOOTH_HEADSET;
                if (simpleDevices.contains(simpleDeviceType2)) {
                    this.desiredDeviceType = simpleDeviceType2;
                    this.androidAudioManager.setSpeakerphoneOn(false);
                    this.androidAudioManager.startBluetoothSco();
                } else if (getSimpleDevices().contains(SimpleDeviceType.WIRED_HEADSET)) {
                    this.androidAudioManager.setSpeakerphoneOn(false);
                } else {
                    this.androidAudioManager.setSpeakerphoneOn(true);
                }
            }
        } else {
            this.androidAudioManager.unregisterAudioDeviceCallback(this.audioDeviceCallback);
            this.androidAudioManager.setMode(0);
            unRegisterAudioManagerReceivers();
            this.androidAudioManager.stopBluetoothSco();
            this.androidAudioManager.setSpeakerphoneOn(false);
        }
        emitEffectiveDevice();
    }

    @Override // com.discord.audio.DiscordAudioManagerInterface
    public void setSCORetryCount(int count) {
        this.scoRetryCount = count;
    }

    private final void setActiveAudioDevice(SimpleDeviceType deviceType) {
        switch (WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()]) {
            case 1:
                this.androidAudioManager.stopBluetoothSco();
                this.androidAudioManager.setBluetoothScoOn(false);
                this.androidAudioManager.setSpeakerphoneOn(true);
                break;
            case 2:
                this.androidAudioManager.stopBluetoothSco();
                this.androidAudioManager.setBluetoothScoOn(false);
                this.androidAudioManager.setSpeakerphoneOn(false);
                break;
            case 3:
                this.androidAudioManager.stopBluetoothSco();
                this.androidAudioManager.setBluetoothScoOn(false);
                this.androidAudioManager.setSpeakerphoneOn(false);
                break;
            case 4:
                this.scoRetryAttempts = 0;
                this.androidAudioManager.setSpeakerphoneOn(false);
                this.androidAudioManager.startBluetoothSco();
                break;
            case 5:
            case 6:
                return;
            default:
                throw new n();
        }
        this.desiredDeviceType = deviceType;
        emitEffectiveDevice();
    }
}
