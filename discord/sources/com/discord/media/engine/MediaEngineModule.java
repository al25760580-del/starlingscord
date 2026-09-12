package com.discord.media.engine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import ar.b0;
import ar.k0;
import ar.t1;
import ar.u0;
import com.discord.codegen.NativeMediaEngineModuleSpec;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.video.events.ActiveSinksChangeEvent;
import com.discord.media.engine.video.events.AudioInputInitializedEvent;
import com.discord.media.engine.video.events.DeviceChangedEvent;
import com.discord.media.engine.video.events.FirstFrameCallbackEvent;
import com.discord.media.engine.video.events.MlsFailureCallbackEvent;
import com.discord.media.engine.video.events.NoInputCallbackEvent;
import com.discord.media.engine.video.events.OnBroadcastRequestedEvent;
import com.discord.media.engine.video.events.OnBroadcastThumbnailEvent;
import com.discord.media.engine.video.events.OnVideoCallbackEvent;
import com.discord.media.engine.video.events.OnVoiceEvent;
import com.discord.media.engine.video.events.PingCallbackEvent;
import com.discord.media.engine.video.events.PingTimeoutCallbackEvent;
import com.discord.media.engine.video.events.SecureFramesStateUpdateCallbackEvent;
import com.discord.media.engine.video.events.SpeakingWhileMutedCallbackEvent;
import com.discord.media.engine.video.events.UserSpeakingEvent;
import com.discord.media.engine.video.events.VoiceProcessingErrorCallbackEvent;
import com.discord.media.engine.video.texture_view.StreamManager;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\bP\u0018\u0000 «\u00012\u00020\u0001:\u0002«\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0012J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010'0%H\u0014J\b\u0010(\u001a\u00020\"H\u0016J \u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020\"H\u0016J\u0018\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020&H\u0016J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020+H\u0016J\u0010\u00107\u001a\u00020\"2\u0006\u00106\u001a\u00020+H\u0016J\u0010\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020+H\u0016J\u0010\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020&H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010C\u001a\u00020\"2\u0006\u0010?\u001a\u00020+H\u0016J\u0010\u0010D\u001a\u00020\"2\u0006\u0010A\u001a\u00020&H\u0016J\u0010\u0010E\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010F\u001a\u00020\"2\u0006\u0010?\u001a\u00020+H\u0016J\u0010\u0010G\u001a\u00020\"2\u0006\u0010A\u001a\u00020&H\u0016J\u0010\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020+H\u0016J\u0010\u0010J\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010K\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010L\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020O2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010P\u001a\u00020\"2\u0006\u00103\u001a\u0002042\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010Q\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010R\u001a\u00020\"2\u0006\u0010S\u001a\u00020:H\u0016J\u0010\u0010T\u001a\u00020\"2\u0006\u0010U\u001a\u00020\u0019H\u0002J(\u0010V\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010W\u001a\u00020&2\u0006\u0010X\u001a\u0002042\u0006\u0010<\u001a\u00020=H\u0016J(\u0010Y\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010W\u001a\u00020&2\u0006\u0010X\u001a\u0002042\u0006\u0010<\u001a\u00020=H\u0016JF\u0010Z\u001a\u00020\"2\u0006\u0010U\u001a\u00020\u00192\u0006\u0010W\u001a\u00020&2\u0006\u0010X\u001a\u0002042$\u0010<\u001a \u0012\u0004\u0012\u00020&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\\\u0012\u0004\u0012\u00020\"0[H\u0002J\u0018\u0010]\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010^\u001a\u00020:H\u0016J(\u0010_\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010`\u001a\u00020+2\u0006\u0010a\u001a\u00020+2\u0006\u0010b\u001a\u00020+H\u0016J\u0018\u0010c\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010d\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u00103\u001a\u000204H\u0016J\u0018\u0010e\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010f\u001a\u00020OH\u0016J\u0018\u0010g\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010W\u001a\u00020&H\u0016J\u0018\u0010h\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010i\u001a\u00020:H\u0016J(\u0010j\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010W\u001a\u00020&2\u0006\u0010k\u001a\u00020+2\u0006\u0010l\u001a\u00020+H\u0016J \u0010m\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010W\u001a\u00020&2\u0006\u00106\u001a\u00020+H\u0016J \u0010n\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010W\u001a\u00020&2\u0006\u0010o\u001a\u00020:H\u0016J\u0010\u0010p\u001a\u00020\"2\u0006\u0010U\u001a\u00020+H\u0016J\u0018\u0010q\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010r\u001a\u00020:H\u0016J\u0018\u0010s\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010t\u001a\u00020:H\u0016J\u0018\u0010u\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010v\u001a\u00020+H\u0016J\u0018\u0010w\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010I\u001a\u00020+H\u0016J\u0010\u0010x\u001a\u00020\"2\u0006\u0010U\u001a\u00020+H\u0016J(\u0010y\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010z\u001a\u00020:2\u0006\u0010{\u001a\u00020:2\u0006\u0010|\u001a\u00020:H\u0016J\u0018\u0010}\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010~\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010\u007f\u001a\u00020+H\u0016J\"\u0010\u0080\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u0081\u0001\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0016J+\u0010\u0082\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u0083\u0001\u001a\u00020+2\u0007\u0010\u0084\u0001\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0016J\u001a\u0010\u0085\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u0083\u0001\u001a\u00020+H\u0016J,\u0010\u0086\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u0087\u0001\u001a\u00020&2\u0007\u0010\u0083\u0001\u001a\u00020+2\u0007\u0010\u0088\u0001\u001a\u00020&H\u0016J\u0019\u0010\u0089\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0016J\u001a\u0010\u008a\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u008b\u0001\u001a\u00020&H\u0016J\"\u0010\u008c\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u008d\u0001\u001a\u00020&2\u0006\u0010<\u001a\u00020=H\u0016J+\u0010\u008e\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u0083\u0001\u001a\u00020+2\u0007\u0010\u008f\u0001\u001a\u00020&2\u0006\u0010<\u001a\u00020=H\u0016J+\u0010\u0090\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u0083\u0001\u001a\u00020+2\u0007\u0010\u0091\u0001\u001a\u00020&2\u0006\u0010<\u001a\u00020=H\u0016J*\u0010\u0092\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u0093\u0001\u001a\u00020+2\u0006\u0010W\u001a\u00020&2\u0006\u0010<\u001a\u00020=H\u0016J#\u0010\u0094\u0001\u001a\u00020\"2\u0007\u0010\u0095\u0001\u001a\u00020&2\u0007\u0010\u0096\u0001\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0016J\u0011\u0010\u0097\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+H\u0016J\u0011\u0010\u0098\u0001\u001a\u00020\"2\u0006\u0010S\u001a\u00020:H\u0016J\u001b\u0010\u0099\u0001\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020&2\u0007\u0010\u009b\u0001\u001a\u00020&H\u0016J,\u0010\u009c\u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+2\u0007\u0010\u009d\u0001\u001a\u00020&2\u0007\u0010\u009e\u0001\u001a\u00020:2\u0007\u0010\u009f\u0001\u001a\u00020&H\u0016J\u0011\u0010 \u0001\u001a\u00020\"2\u0006\u0010U\u001a\u00020+H\u0016J\u0012\u0010¡\u0001\u001a\u00020\"2\u0007\u0010¢\u0001\u001a\u00020&H\u0016J\u0012\u0010£\u0001\u001a\u00020\"2\u0007\u0010¤\u0001\u001a\u00020OH\u0016J\u0012\u0010¥\u0001\u001a\u00020\"2\u0007\u0010\u009f\u0001\u001a\u00020&H\u0016J\u0012\u0010¦\u0001\u001a\u00020\"2\u0007\u0010§\u0001\u001a\u00020+H\u0016J\u0012\u0010¨\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020:H\u0016J\u0011\u0010ª\u0001\u001a\u00020\"2\u0006\u0010S\u001a\u00020:H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¬\u0001"}, d2 = {"Lcom/discord/media/engine/MediaEngineModule;", "Lcom/discord/codegen/NativeMediaEngineModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "getAppScope$annotations", "()V", "startNs", "", "mediaEngineDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/discord/media/engine/MediaEngine;", "awaitMediaEngine", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mediaEngine", "getMediaEngine", "()Lcom/discord/media/engine/MediaEngine;", "setMediaEngine", "(Lcom/discord/media/engine/MediaEngine;)V", "streamConnectionId", "", "Ljava/lang/Integer;", "streamPermissions", "Landroid/content/Intent;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "activityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "initializeEngine", "", "invalidate", "getTypedExportedConstants", "", "", "", "startBroadcast", "setBroadcastThumbnailParams", "width", "", "height", "intervalSeconds", "stopBroadcast", "stopBroadcastWithError", "errorCode", "errorMessage", "setTransportOptions", "options", "Lcom/facebook/react/bridge/ReadableMap;", "setInputVolume", "volume", "setOutputVolume", "setEmitVADLevel2", "enable", "", "getInputDevices", "callback", "Lcom/facebook/react/bridge/Callback;", "setInputDevice", "deviceIndex", "setInputDeviceById", "deviceName", "getOutputDevices", "setOutputDevice", "setOutputDeviceById", "getVideoInputDevices", "setVideoInputDevice", "setVideoInputDeviceById", "setNoInputThreshold", "threshold", "getAudioSubsystem", "getCodecCapabilities", "getCodecSurvey", "rankRtcRegions", "regionsWithIps", "Lcom/facebook/react/bridge/ReadableArray;", "startLocalAudioRecording", "stopLocalAudioRecording", "setAudioInputEnabled", ViewProps.ENABLED, "addConnectionCallbacks", "connectionId", "createVoiceConnectionWithOptions", "userId", "connectionOptions", "createOwnStreamConnectionWithOptions", "createConnection", "Lkotlin/Function2;", "", "connectionInstanceDestroy", "willReconnect", "connectionInstanceConfigureConnectionRetries", "baseDelayMs", "maxDelayMs", "maxAttempts", "connectionInstanceGetEncryptionModes", "connectionInstanceSetTransportOptions", "connectionInstanceMergeUsers", "users", "connectionInstanceDestroyUser", "connectionInstanceSetVideoBroadcast", "broadcasting", "connectionInstanceSetLocalPan", ViewProps.LEFT, ViewProps.RIGHT, "connectionInstanceSetLocalVolume", "connectionInstanceSetLocalMute", "mute", "connectionInstanceFastUdpReconnect", "connectionInstanceSetSelfMute", "muted", "connectionInstanceSetSelfDeafen", "deafened", "connectionInstanceSetMinimumOutputDelay", "delay", "connectionInstanceSetNoInputThreshold", "connectionInstanceTriggerOnVideoCallback", "connectionInstanceSetPTTActive", AppStateModule.APP_STATE_ACTIVE, "priority", "muteOverride", "connectionInstanceGetStats", "connectionInstanceSetPingInterval", "pingInterval", "connectionInstanceGetFilteredStats", ViewProps.FILTER, "connectionInstancePrepareSecureFramesTransition", "transitionId", "protocolVersion", "connectionInstanceExecuteSecureFramesTransition", "connectionInstancePrepareSecureFramesEpoch", "epoch", "groupId", "connectionInstanceGetMLSKeyPackageB64", "connectionInstanceUpdateMLSExternalSenderB64", "externalSenderB64", "connectionInstanceProcessMLSProposalsB64", "proposals", "connectionInstancePrepareMLSCommitTransitionB64", "commit", "connectionInstanceProcessMLSWelcomeB64", "welcome", "connectionInstanceGetMLSPairwiseFingerprintB64", "version", "getMLSSigningKeyB64", "sessionId", "signatureVersion", "connectionInstanceTriggerOnSpeakingCallback", "setSidechainCompression", "updateFieldTrial", "key", "value", "connectionInstanceSetDesktopSource", "stringId", "useVideoHook", "type", "connectionInstanceWasRemoteDisconnected", "setAVAudioSessionMode", "mode", "setNcModels", "models", "addListener", "removeListeners", "count", "setHasFullbandPerformance", "hasFullbandPerformance", "setOffloadAdmControls", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaEngineModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngineModule.kt\ncom/discord/media/engine/MediaEngineModule\n+ 2 Debug.kt\ncom/discord/media/engine/types/Debug\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,890:1\n65#2,7:891\n40#3,13:898\n*S KotlinDebug\n*F\n+ 1 MediaEngineModule.kt\ncom/discord/media/engine/MediaEngineModule\n*L\n74#1:891,7\n876#1:898,13\n*E\n"})
public final class MediaEngineModule extends NativeMediaEngineModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int START_SCREENSHARE_REQUEST_CODE = 420;

    @NotNull
    private static final String TAG = "MediaEngineModule";

    @NotNull
    private final ActivityEventListener activityEventListener;

    @NotNull
    private final CoroutineScope appScope;
    public MediaEngine mediaEngine;

    @NotNull
    private final CompletableDeferred mediaEngineDeferred;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;
    private final long startNs;
    private Integer streamConnectionId;
    private Intent streamPermissions;

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$1", f = "MediaEngineModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nMediaEngineModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngineModule.kt\ncom/discord/media/engine/MediaEngineModule$1\n+ 2 Debug.kt\ncom/discord/media/engine/types/Debug\n*L\n1#1,890:1\n65#2,7:891\n*S KotlinDebug\n*F\n+ 1 MediaEngineModule.kt\ncom/discord/media/engine/MediaEngineModule$1\n*L\n67#1:891,7\n*E\n"})
    public static final class AnonymousClass1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new AnonymousClass1(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            MediaEngine mediaEngine = new MediaEngine(MediaEngineModule.this.getReactContext(), null, 2, null);
            MediaEngineModule.this.setMediaEngine(mediaEngine);
            Debug debug = Debug.INSTANCE;
            System.nanoTime();
            MediaEngineModule.this.mediaEngineDeferred.U(mediaEngine);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/media/engine/MediaEngineModule$Companion;", "", "<init>", "()V", "TAG", "", "START_SCREENSHARE_REQUEST_CODE", "", "createScreenCaptureIntent", "Landroid/content/Intent;", "Landroid/content/Context;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Intent createScreenCaptureIntent(Context context) {
            Object systemService = context.getSystemService("media_projection");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            Intent intentCreateScreenCaptureIntent = ((MediaProjectionManager) systemService).createScreenCaptureIntent();
            Intrinsics.checkNotNullExpressionValue(intentCreateScreenCaptureIntent, "createScreenCaptureIntent(...)");
            return intentCreateScreenCaptureIntent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$addConnectionCallbacks$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$addConnectionCallbacks$1", f = "MediaEngineModule.kt", l = {421}, m = "invokeSuspend")
    public static final class C01321 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ int $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01321(int i7, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MediaEngineModule mediaEngineModule, int i7, String str, int i10, float f2) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new UserSpeakingEvent(i7, str, i10, f2));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(MediaEngineModule mediaEngineModule, int i7, int i10, String str, int i11, int i12) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new PingCallbackEvent(i7, i10, str, i11, i12));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(MediaEngineModule mediaEngineModule, int i7, String str, int i10, int i11, int i12) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new PingTimeoutCallbackEvent(i7, str, i10, i11, i12));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(MediaEngineModule mediaEngineModule, int i7) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new SpeakingWhileMutedCallbackEvent(i7));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(MediaEngineModule mediaEngineModule, int i7, String str, long j, String str2) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new FirstFrameCallbackEvent(i7, str, j, str2));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$5(MediaEngineModule mediaEngineModule, int i7, String str, String str2) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new MlsFailureCallbackEvent(i7, str, str2));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$6(MediaEngineModule mediaEngineModule, int i7, String str) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new SecureFramesStateUpdateCallbackEvent(i7, str));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01321(this.$connectionId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngine mediaEngine = MediaEngineModule.this.getMediaEngine();
            final int i10 = this.$connectionId;
            final MediaEngineModule mediaEngineModule2 = MediaEngineModule.this;
            final int i11 = 0;
            mediaEngine.connectionInstanceSetOnSpeakingCallback$media_engine_release(i10, new Function3() { // from class: com.discord.media.engine.g
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i11) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            float fFloatValue = ((Float) obj4).floatValue();
                            return MediaEngineModule.C01321.invokeSuspend$lambda$0(mediaEngineModule2, i10, (String) obj2, iIntValue, fFloatValue);
                        default:
                            return MediaEngineModule.C01321.invokeSuspend$lambda$4(mediaEngineModule2, i10, (String) obj2, ((Long) obj3).longValue(), (String) obj4);
                    }
                }
            });
            MediaEngine mediaEngine2 = MediaEngineModule.this.getMediaEngine();
            final int i12 = this.$connectionId;
            final MediaEngineModule mediaEngineModule3 = MediaEngineModule.this;
            mediaEngine2.connectionInstanceSetOnPingCallback$media_engine_release(i12, new Function4() { // from class: com.discord.media.engine.h
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    switch (i11) {
                        case 0:
                            int iIntValue = ((Integer) obj4).intValue();
                            int iIntValue2 = ((Integer) obj5).intValue();
                            return MediaEngineModule.C01321.invokeSuspend$lambda$1(mediaEngineModule3, i12, ((Integer) obj2).intValue(), (String) obj3, iIntValue, iIntValue2);
                        default:
                            int iIntValue3 = ((Integer) obj3).intValue();
                            int iIntValue4 = ((Integer) obj4).intValue();
                            int iIntValue5 = ((Integer) obj5).intValue();
                            return MediaEngineModule.C01321.invokeSuspend$lambda$2(mediaEngineModule3, i12, (String) obj2, iIntValue3, iIntValue4, iIntValue5);
                    }
                }
            });
            MediaEngine mediaEngine3 = MediaEngineModule.this.getMediaEngine();
            final int i13 = this.$connectionId;
            final MediaEngineModule mediaEngineModule4 = MediaEngineModule.this;
            final int i14 = 1;
            mediaEngine3.connectionInstanceSetOnPingTimeoutCallback$media_engine_release(i13, new Function4() { // from class: com.discord.media.engine.h
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    switch (i14) {
                        case 0:
                            int iIntValue = ((Integer) obj4).intValue();
                            int iIntValue2 = ((Integer) obj5).intValue();
                            return MediaEngineModule.C01321.invokeSuspend$lambda$1(mediaEngineModule4, i13, ((Integer) obj2).intValue(), (String) obj3, iIntValue, iIntValue2);
                        default:
                            int iIntValue3 = ((Integer) obj3).intValue();
                            int iIntValue4 = ((Integer) obj4).intValue();
                            int iIntValue5 = ((Integer) obj5).intValue();
                            return MediaEngineModule.C01321.invokeSuspend$lambda$2(mediaEngineModule4, i13, (String) obj2, iIntValue3, iIntValue4, iIntValue5);
                    }
                }
            });
            MediaEngine mediaEngine4 = MediaEngineModule.this.getMediaEngine();
            final int i15 = this.$connectionId;
            final MediaEngineModule mediaEngineModule5 = MediaEngineModule.this;
            mediaEngine4.connectionInstanceSetOnSpeakingWhileMutedCallback$media_engine_release(i15, new Function0() { // from class: com.discord.media.engine.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaEngineModule.C01321.invokeSuspend$lambda$3(mediaEngineModule5, i15);
                }
            });
            MediaEngine mediaEngine5 = MediaEngineModule.this.getMediaEngine();
            final int i16 = this.$connectionId;
            final MediaEngineModule mediaEngineModule6 = MediaEngineModule.this;
            mediaEngine5.connectionInstanceSetOnFirstFrameCallback$media_engine_release(i16, new Function3() { // from class: com.discord.media.engine.g
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i14) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            float fFloatValue = ((Float) obj4).floatValue();
                            return MediaEngineModule.C01321.invokeSuspend$lambda$0(mediaEngineModule6, i16, (String) obj2, iIntValue, fFloatValue);
                        default:
                            return MediaEngineModule.C01321.invokeSuspend$lambda$4(mediaEngineModule6, i16, (String) obj2, ((Long) obj3).longValue(), (String) obj4);
                    }
                }
            });
            MediaEngine mediaEngine6 = MediaEngineModule.this.getMediaEngine();
            final int i17 = this.$connectionId;
            final MediaEngineModule mediaEngineModule7 = MediaEngineModule.this;
            mediaEngine6.connectionInstanceSetOnMLSFailureCallback$media_engine_release(i17, new Function2() { // from class: com.discord.media.engine.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MediaEngineModule.C01321.invokeSuspend$lambda$5(mediaEngineModule7, i17, (String) obj2, (String) obj3);
                }
            });
            MediaEngine mediaEngine7 = MediaEngineModule.this.getMediaEngine();
            final int i18 = this.$connectionId;
            final MediaEngineModule mediaEngineModule8 = MediaEngineModule.this;
            mediaEngine7.connectionInstanceSetSecureFramesStateUpdateCallback$media_engine_release(i18, new Function1() { // from class: com.discord.media.engine.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MediaEngineModule.C01321.invokeSuspend$lambda$6(mediaEngineModule8, i18, (String) obj2);
                }
            });
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01321) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceConfigureConnectionRetries$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceConfigureConnectionRetries$1", f = "MediaEngineModule.kt", l = {545}, m = "invokeSuspend")
    public static final class C01331 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $baseDelayMs;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $maxAttempts;
        final /* synthetic */ double $maxDelayMs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01331(double d6, double d7, double d8, double d9, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$baseDelayMs = d7;
            this.$maxDelayMs = d8;
            this.$maxAttempts = d9;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01331(this.$connectionId, this.$baseDelayMs, this.$maxDelayMs, this.$maxAttempts, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceConfigureConnectionRetries$media_engine_release((int) this.$connectionId, (int) this.$baseDelayMs, (int) this.$maxDelayMs, (int) this.$maxAttempts);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01331) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceDestroy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceDestroy$1", f = "MediaEngineModule.kt", l = {530}, m = "invokeSuspend")
    public static final class C01341 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01341(double d6, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01341(this.$connectionId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceDestroy$media_engine_release((int) this.$connectionId);
            int i10 = (int) this.$connectionId;
            Integer num = MediaEngineModule.this.streamConnectionId;
            if (num != null && i10 == num.intValue()) {
                MediaEngineModule.this.streamConnectionId = null;
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01341) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceDestroyUser$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceDestroyUser$1", f = "MediaEngineModule.kt", l = {580}, m = "invokeSuspend")
    public static final class C01351 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01351(double d6, String str, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$userId = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01351(this.$connectionId, this.$userId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceDestroyUser$media_engine_release((int) this.$connectionId, this.$userId);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01351) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceExecuteSecureFramesTransition$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceExecuteSecureFramesTransition$1", f = "MediaEngineModule.kt", l = {717}, m = "invokeSuspend")
    public static final class C01361 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $transitionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01361(double d6, double d7, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$transitionId = d7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01361(this.$connectionId, this.$transitionId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceExecuteSecureFramesTransition$media_engine_release((int) this.$connectionId, (int) this.$transitionId);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01361) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceFastUdpReconnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceFastUdpReconnect$1", f = "MediaEngineModule.kt", l = {624}, m = "invokeSuspend")
    public static final class C01371 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01371(double d6, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01371(this.$connectionId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceFastUdpReconnect$media_engine_release((int) this.$connectionId);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01371) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceGetEncryptionModes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceGetEncryptionModes$1", f = "MediaEngineModule.kt", l = {557}, m = "invokeSuspend")
    public static final class C01381 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01381(double d6, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String[] strArr) {
            callback.invoke(NativeArrayExtensionsKt.toNativeArray(strArr));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01381(this.$connectionId, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceGetEncryptionModes$media_engine_release((int) this.$connectionId, new l(this.$callback, 0));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01381) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceGetFilteredStats$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceGetFilteredStats$1", f = "MediaEngineModule.kt", l = {692}, m = "invokeSuspend")
    public static final class C01391 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $filter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01391(double d6, double d7, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$filter = d7;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str) {
            callback.invoke(str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01391(this.$connectionId, this.$filter, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceGetFilteredStats$media_engine_release((int) this.$connectionId, (int) this.$filter, new l(this.$callback, 1));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01391) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceGetMLSKeyPackageB64$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceGetMLSKeyPackageB64$1", f = "MediaEngineModule.kt", l = {731}, m = "invokeSuspend")
    public static final class C01401 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01401(double d6, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str) {
            callback.invoke(str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01401(this.$connectionId, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceGetMLSKeyPackageB64$media_engine_release((int) this.$connectionId, new l(this.$callback, 2));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01401) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceGetMLSPairwiseFingerprintB64$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceGetMLSPairwiseFingerprintB64$1", f = "MediaEngineModule.kt", l = {787}, m = "invokeSuspend")
    public static final class C01411 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ String $userId;
        final /* synthetic */ double $version;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01411(double d6, double d7, String str, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$version = d7;
            this.$userId = str;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str) {
            callback.invoke(str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01411(this.$connectionId, this.$version, this.$userId, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceGetMLSPairwiseFingerprintB64$media_engine_release((int) this.$connectionId, (int) this.$version, this.$userId, new l(this.$callback, 3));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01411) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceGetStats$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceGetStats$1", f = "MediaEngineModule.kt", l = {678}, m = "invokeSuspend")
    public static final class C01421 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01421(double d6, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str) {
            callback.invoke(str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01421(this.$connectionId, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceGetStats$media_engine_release((int) this.$connectionId, new l(this.$callback, 4));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01421) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceMergeUsers$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceMergeUsers$1", f = "MediaEngineModule.kt", l = {573}, m = "invokeSuspend")
    public static final class C01431 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ ReadableArray $users;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01431(double d6, ReadableArray readableArray, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$users = readableArray;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01431(this.$connectionId, this.$users, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceMergeUsers$media_engine_release((int) this.$connectionId, NativeArrayExtensionsKt.toJsonString(this.$users));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01431) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstancePrepareMLSCommitTransitionB64$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstancePrepareMLSCommitTransitionB64$1", f = "MediaEngineModule.kt", l = {761}, m = "invokeSuspend")
    public static final class C01441 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ String $commit;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $transitionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01441(double d6, double d7, String str, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$transitionId = d7;
            this.$commit = str;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, boolean z5, int i7, String str) {
            callback.invoke(Boolean.valueOf(z5), Integer.valueOf(i7), str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01441(this.$connectionId, this.$transitionId, this.$commit, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstancePrepareMLSCommitTransitionB64$media_engine_release((int) this.$connectionId, (int) this.$transitionId, this.$commit, new m(0, this.$callback));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01441) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstancePrepareSecureFramesEpoch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstancePrepareSecureFramesEpoch$1", f = "MediaEngineModule.kt", l = {724}, m = "invokeSuspend")
    public static final class C01451 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ String $epoch;
        final /* synthetic */ String $groupId;
        final /* synthetic */ double $transitionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01451(double d6, String str, double d7, String str2, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$epoch = str;
            this.$transitionId = d7;
            this.$groupId = str2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01451(this.$connectionId, this.$epoch, this.$transitionId, this.$groupId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstancePrepareSecureFramesEpoch$media_engine_release((int) this.$connectionId, this.$epoch, (int) this.$transitionId, this.$groupId);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01451) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstancePrepareSecureFramesTransition$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstancePrepareSecureFramesTransition$1", f = "MediaEngineModule.kt", l = {706}, m = "invokeSuspend")
    public static final class C01461 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $protocolVersion;
        final /* synthetic */ double $transitionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01461(double d6, double d7, double d8, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$transitionId = d7;
            this.$protocolVersion = d8;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback) {
            callback.invoke(new Object[0]);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01461(this.$connectionId, this.$transitionId, this.$protocolVersion, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngine mediaEngine = MediaEngineModule.this.getMediaEngine();
            int i10 = (int) this.$connectionId;
            int i11 = (int) this.$transitionId;
            int i12 = (int) this.$protocolVersion;
            final Callback callback = this.$callback;
            mediaEngine.connectionInstancePrepareSecureFramesTransition$media_engine_release(i10, i11, i12, new Function0() { // from class: com.discord.media.engine.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaEngineModule.C01461.invokeSuspend$lambda$0(callback);
                }
            });
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01461) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceProcessMLSProposalsB64$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceProcessMLSProposalsB64$1", f = "MediaEngineModule.kt", l = {747}, m = "invokeSuspend")
    public static final class C01471 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ String $proposals;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01471(double d6, String str, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$proposals = str;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str) {
            callback.invoke(str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01471(this.$connectionId, this.$proposals, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceProcessMLSProposalsB64$media_engine_release((int) this.$connectionId, this.$proposals, new l(this.$callback, 5));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01471) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceProcessMLSWelcomeB64$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceProcessMLSWelcomeB64$1", f = "MediaEngineModule.kt", l = {774}, m = "invokeSuspend")
    public static final class C01481 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $transitionId;
        final /* synthetic */ String $welcome;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01481(double d6, double d7, String str, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$transitionId = d7;
            this.$welcome = str;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, boolean z5, int i7, String str) {
            callback.invoke(Boolean.valueOf(z5), Integer.valueOf(i7), str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01481(this.$connectionId, this.$transitionId, this.$welcome, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceProcessMLSWelcomeB64$media_engine_release((int) this.$connectionId, (int) this.$transitionId, this.$welcome, new m(1, this.$callback));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01481) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetLocalMute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetLocalMute$1", f = "MediaEngineModule.kt", l = {617}, m = "invokeSuspend")
    public static final class C01491 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ boolean $mute;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01491(double d6, String str, boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$userId = str;
            this.$mute = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01491(this.$connectionId, this.$userId, this.$mute, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetLocalMute$media_engine_release((int) this.$connectionId, this.$userId, this.$mute);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01491) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetLocalPan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetLocalPan$1", f = "MediaEngineModule.kt", l = {599}, m = "invokeSuspend")
    public static final class C01501 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $left;
        final /* synthetic */ double $right;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01501(double d6, String str, double d7, double d8, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$userId = str;
            this.$left = d7;
            this.$right = d8;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01501(this.$connectionId, this.$userId, this.$left, this.$right, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetLocalPan$media_engine_release((int) this.$connectionId, this.$userId, (float) this.$left, (float) this.$right);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01501) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetLocalVolume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetLocalVolume$1", f = "MediaEngineModule.kt", l = {610}, m = "invokeSuspend")
    public static final class C01511 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ String $userId;
        final /* synthetic */ double $volume;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01511(double d6, String str, double d7, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$userId = str;
            this.$volume = d7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01511(this.$connectionId, this.$userId, this.$volume, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetLocalVolume$media_engine_release((int) this.$connectionId, this.$userId, (float) this.$volume);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01511) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetMinimumOutputDelay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetMinimumOutputDelay$1", f = "MediaEngineModule.kt", l = {645}, m = "invokeSuspend")
    public static final class C01521 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $delay;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01521(double d6, double d7, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$delay = d7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01521(this.$connectionId, this.$delay, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetMinimumOutputDelay$media_engine_release((int) this.$connectionId, (int) this.$delay);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01521) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetNoInputThreshold$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetNoInputThreshold$1", f = "MediaEngineModule.kt", l = {652}, m = "invokeSuspend")
    public static final class C01531 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $threshold;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01531(double d6, double d7, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$threshold = d7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01531(this.$connectionId, this.$threshold, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetNoInputThreshold$media_engine_release((int) this.$connectionId, (float) this.$threshold);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01531) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetPTTActive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetPTTActive$1", f = "MediaEngineModule.kt", l = {671}, m = "invokeSuspend")
    public static final class C01541 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $active;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ boolean $muteOverride;
        final /* synthetic */ boolean $priority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01541(double d6, boolean z5, boolean z6, boolean z7, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$active = z5;
            this.$priority = z6;
            this.$muteOverride = z7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01541(this.$connectionId, this.$active, this.$priority, this.$muteOverride, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetPTTActive$media_engine_release((int) this.$connectionId, this.$active, this.$priority, this.$muteOverride);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01541) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetPingInterval$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetPingInterval$1", f = "MediaEngineModule.kt", l = {685}, m = "invokeSuspend")
    public static final class C01551 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ double $pingInterval;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01551(double d6, double d7, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$pingInterval = d7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01551(this.$connectionId, this.$pingInterval, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetPingInterval$media_engine_release((int) this.$connectionId, (int) this.$pingInterval);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01551) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetSelfDeafen$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetSelfDeafen$1", f = "MediaEngineModule.kt", l = {638}, m = "invokeSuspend")
    public static final class C01561 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ boolean $deafened;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01561(double d6, boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$deafened = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01561(this.$connectionId, this.$deafened, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetSelfDeafen$media_engine_release((int) this.$connectionId, this.$deafened);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01561) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetSelfMute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetSelfMute$1", f = "MediaEngineModule.kt", l = {631}, m = "invokeSuspend")
    public static final class C01571 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ boolean $muted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01571(double d6, boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$muted = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01571(this.$connectionId, this.$muted, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetSelfMute$media_engine_release((int) this.$connectionId, this.$muted);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01571) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetTransportOptions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetTransportOptions$1", f = "MediaEngineModule.kt", l = {566}, m = "invokeSuspend")
    public static final class C01581 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ ReadableMap $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01581(double d6, ReadableMap readableMap, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$options = readableMap;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01581(this.$connectionId, this.$options, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetTransportOptions$media_engine_release((int) this.$connectionId, NativeMapExtensionsKt.toJsonString(this.$options));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01581) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceSetVideoBroadcast$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceSetVideoBroadcast$1", f = "MediaEngineModule.kt", l = {587}, m = "invokeSuspend")
    public static final class C01591 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $broadcasting;
        final /* synthetic */ double $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01591(double d6, boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$broadcasting = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01591(this.$connectionId, this.$broadcasting, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceSetVideoBroadcast$media_engine_release((int) this.$connectionId, this.$broadcasting);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01591) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceTriggerOnSpeakingCallback$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceTriggerOnSpeakingCallback$1", f = "MediaEngineModule.kt", l = {805}, m = "invokeSuspend")
    public static final class C01601 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01601(double d6, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MediaEngineModule mediaEngineModule, double d6, String str, int i7, float f2) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new UserSpeakingEvent((int) d6, str, i7, f2));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01601(this.$connectionId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngine mediaEngine = MediaEngineModule.this.getMediaEngine();
            final double d6 = this.$connectionId;
            final MediaEngineModule mediaEngineModule2 = MediaEngineModule.this;
            mediaEngine.connectionInstanceSetOnSpeakingCallback$media_engine_release((int) d6, new Function3() { // from class: com.discord.media.engine.o
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj3).intValue();
                    float fFloatValue = ((Float) obj4).floatValue();
                    return MediaEngineModule.C01601.invokeSuspend$lambda$0(mediaEngineModule2, d6, (String) obj2, iIntValue, fFloatValue);
                }
            });
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01601) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1", f = "MediaEngineModule.kt", l = {659}, m = "invokeSuspend")
    public static final class C01611 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01611(double d6, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MediaEngineModule mediaEngineModule, double d6, String str, long j, String str2, String str3) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new OnVideoCallbackEvent((int) d6, str, j, str2, str3));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01611(this.$connectionId, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngine mediaEngine = MediaEngineModule.this.getMediaEngine();
            final double d6 = this.$connectionId;
            final MediaEngineModule mediaEngineModule2 = MediaEngineModule.this;
            mediaEngine.connectionInstanceSetOnVideoCallback$media_engine_release((int) d6, new Function4() { // from class: com.discord.media.engine.p
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    return MediaEngineModule.C01611.invokeSuspend$lambda$0(mediaEngineModule2, d6, (String) obj2, ((Long) obj3).longValue(), (String) obj4, (String) obj5);
                }
            });
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01611) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$connectionInstanceUpdateMLSExternalSenderB64$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$connectionInstanceUpdateMLSExternalSenderB64$1", f = "MediaEngineModule.kt", l = {740}, m = "invokeSuspend")
    public static final class C01621 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $connectionId;
        final /* synthetic */ String $externalSenderB64;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01621(double d6, String str, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$externalSenderB64 = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01621(this.$connectionId, this.$externalSenderB64, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().connectionInstanceUpdateMLSExternalSenderB64$media_engine_release((int) this.$connectionId, this.$externalSenderB64);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01621) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$createConnection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$createConnection$1", f = "MediaEngineModule.kt", l = {517}, m = "invokeSuspend")
    public static final class C01631 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<String, Map<String, ? extends Object>, Unit> $callback;
        final /* synthetic */ int $connectionId;
        final /* synthetic */ ReadableMap $connectionOptions;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01631(int i7, String str, ReadableMap readableMap, Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = i7;
            this.$userId = str;
            this.$connectionOptions = readableMap;
            this.$callback = function2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01631(this.$connectionId, this.$userId, this.$connectionOptions, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().createVoiceConnection(this.$connectionId, this.$userId, NativeMapExtensionsKt.toJsonString(this.$connectionOptions), this.$callback);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01631) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$createOwnStreamConnectionWithOptions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$createOwnStreamConnectionWithOptions$1", f = "MediaEngineModule.kt", l = {493}, m = "invokeSuspend")
    public static final class C01641 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ double $connectionId;
        final /* synthetic */ ReadableMap $connectionOptions;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01641(double d6, String str, ReadableMap readableMap, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = d6;
            this.$userId = str;
            this.$connectionOptions = readableMap;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(Callback callback, MediaEngineModule mediaEngineModule, double d6, String str, Map map) {
            callback.invoke(str, NativeMapExtensionsKt.toNativeMap(map));
            Intent intent = mediaEngineModule.streamPermissions;
            if (intent != null) {
                mediaEngineModule.getMediaEngine().connectionInstanceStartBroadcast$media_engine_release((int) d6, intent);
                mediaEngineModule.streamPermissions = null;
            }
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01641(this.$connectionId, this.$userId, this.$connectionOptions, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            final MediaEngineModule mediaEngineModule2 = MediaEngineModule.this;
            final double d6 = this.$connectionId;
            String str = this.$userId;
            ReadableMap readableMap = this.$connectionOptions;
            final Callback callback = this.$callback;
            mediaEngineModule2.createConnection((int) d6, str, readableMap, new Function2() { // from class: com.discord.media.engine.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MediaEngineModule.C01641.invokeSuspend$lambda$1(callback, mediaEngineModule2, d6, (String) obj2, (Map) obj3);
                }
            });
            MediaEngineModule.this.streamConnectionId = new Integer((int) this.$connectionId);
            MediaEngineModule.this.addConnectionCallbacks((int) this.$connectionId);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01641) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$getAudioSubsystem$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$getAudioSubsystem$1", f = "MediaEngineModule.kt", l = {359}, m = "invokeSuspend")
    public static final class C01651 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01651(Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str, String str2) {
            callback.invoke(str, str2);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01651(this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().getAudioSubsystem$media_engine_release(new s(this.$callback, 0));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01651) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$getCodecCapabilities$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$getCodecCapabilities$1", f = "MediaEngineModule.kt", l = {368}, m = "invokeSuspend")
    public static final class C01661 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01661(Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str) {
            callback.invoke(str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01661(this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().getCodecCapabilities$media_engine_release(new l(this.$callback, 6));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01661) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$getCodecSurvey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$getCodecSurvey$1", f = "MediaEngineModule.kt", l = {377}, m = "invokeSuspend")
    public static final class C01671 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01671(Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str) {
            callback.invoke(str);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01671(this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().getCodecSurvey$media_engine_release(new l(this.$callback, 7));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01671) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$getInputDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$getInputDevices$1", f = "MediaEngineModule.kt", l = {283}, m = "invokeSuspend")
    public static final class C01681 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01681(Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, List list) {
            callback.invoke(NativeArrayExtensionsKt.toNativeArrayOfMaps(list));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01681(this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().getInputDevices$media_engine_release(new l(this.$callback, 8));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01681) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$getMLSSigningKeyB64$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$getMLSSigningKeyB64$1", f = "MediaEngineModule.kt", l = {796}, m = "invokeSuspend")
    public static final class C01691 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ String $sessionId;
        final /* synthetic */ double $signatureVersion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01691(String str, double d6, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$sessionId = str;
            this.$signatureVersion = d6;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str, String str2) {
            callback.invoke(str, str2);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01691(this.$sessionId, this.$signatureVersion, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().getMLSSigningKeyB64$media_engine_release(this.$sessionId, (int) this.$signatureVersion, new s(this.$callback, 1));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01691) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$getOutputDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$getOutputDevices$1", f = "MediaEngineModule.kt", l = {306}, m = "invokeSuspend")
    public static final class C01701 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01701(Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, List list) {
            callback.invoke(NativeArrayExtensionsKt.toNativeArrayOfMaps(list));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01701(this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().getOutputDevices$media_engine_release(new l(this.$callback, 9));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01701) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$getVideoInputDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$getVideoInputDevices$1", f = "MediaEngineModule.kt", l = {329}, m = "invokeSuspend")
    public static final class C01711 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01711(Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, List list) {
            callback.invoke(NativeArrayExtensionsKt.toNativeArrayOfMaps(list));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01711(this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().getVideoInputDevices$media_engine_release(new l(this.$callback, 10));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01711) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$initializeEngine$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$initializeEngine$1", f = "MediaEngineModule.kt", l = {117}, m = "invokeSuspend")
    public static final class C01721 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public C01721(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MediaEngineModule mediaEngineModule, boolean z5) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new NoInputCallbackEvent(z5));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(MediaEngineModule mediaEngineModule, float f2, int i7) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new OnVoiceEvent(f2, i7));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(MediaEngineModule mediaEngineModule, String str, boolean z5) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new ActiveSinksChangeEvent(str, z5));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(MediaEngineModule mediaEngineModule, List list, List list2, List list3) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new DeviceChangedEvent(list, list2, list3));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(MediaEngineModule mediaEngineModule, double d6, Map map) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new AudioInputInitializedEvent(d6, map));
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$5(MediaEngineModule mediaEngineModule, int i7) {
            mediaEngineModule.reactEvents.emitModuleEvent(mediaEngineModule.getReactContext(), new VoiceProcessingErrorCallbackEvent(i7));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01721(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngine mediaEngine = MediaEngineModule.this.getMediaEngine();
            final MediaEngineModule mediaEngineModule2 = MediaEngineModule.this;
            final int i10 = 0;
            mediaEngine.setOnNoInputCallback$media_engine_release(new Function1() { // from class: com.discord.media.engine.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i10) {
                        case 0:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$0(mediaEngineModule2, ((Boolean) obj2).booleanValue());
                        default:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$5(mediaEngineModule2, ((Integer) obj2).intValue());
                    }
                }
            });
            MediaEngine mediaEngine2 = MediaEngineModule.this.getMediaEngine();
            final MediaEngineModule mediaEngineModule3 = MediaEngineModule.this;
            mediaEngine2.setOnVoiceCallback$media_engine_release(new Function2() { // from class: com.discord.media.engine.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i10) {
                        case 0:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$1(mediaEngineModule3, ((Float) obj2).floatValue(), ((Integer) obj3).intValue());
                        case 1:
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            return MediaEngineModule.C01721.invokeSuspend$lambda$2(mediaEngineModule3, (String) obj2, zBooleanValue);
                        default:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$4(mediaEngineModule3, ((Double) obj2).doubleValue(), (Map) obj3);
                    }
                }
            });
            MediaEngine mediaEngine3 = MediaEngineModule.this.getMediaEngine();
            final MediaEngineModule mediaEngineModule4 = MediaEngineModule.this;
            final int i11 = 1;
            mediaEngine3.setActiveSinksChangeCallback$media_engine_release(new Function2() { // from class: com.discord.media.engine.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i11) {
                        case 0:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$1(mediaEngineModule4, ((Float) obj2).floatValue(), ((Integer) obj3).intValue());
                        case 1:
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            return MediaEngineModule.C01721.invokeSuspend$lambda$2(mediaEngineModule4, (String) obj2, zBooleanValue);
                        default:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$4(mediaEngineModule4, ((Double) obj2).doubleValue(), (Map) obj3);
                    }
                }
            });
            final int i12 = 2;
            MediaEngineModule.this.getMediaEngine().setDeviceChangeCallback$media_engine_release(new m(i12, MediaEngineModule.this));
            MediaEngine mediaEngine4 = MediaEngineModule.this.getMediaEngine();
            final MediaEngineModule mediaEngineModule5 = MediaEngineModule.this;
            mediaEngine4.setAudioInputInitializationCallback$media_engine_release(new Function2() { // from class: com.discord.media.engine.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i12) {
                        case 0:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$1(mediaEngineModule5, ((Float) obj2).floatValue(), ((Integer) obj3).intValue());
                        case 1:
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            return MediaEngineModule.C01721.invokeSuspend$lambda$2(mediaEngineModule5, (String) obj2, zBooleanValue);
                        default:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$4(mediaEngineModule5, ((Double) obj2).doubleValue(), (Map) obj3);
                    }
                }
            });
            MediaEngine mediaEngine5 = MediaEngineModule.this.getMediaEngine();
            final MediaEngineModule mediaEngineModule6 = MediaEngineModule.this;
            final int i13 = 1;
            mediaEngine5.setVoiceProcessingErrorCallback$media_engine_release(new Function1() { // from class: com.discord.media.engine.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i13) {
                        case 0:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$0(mediaEngineModule6, ((Boolean) obj2).booleanValue());
                        default:
                            return MediaEngineModule.C01721.invokeSuspend$lambda$5(mediaEngineModule6, ((Integer) obj2).intValue());
                    }
                }
            });
            MediaEngineModule.this.getReactContext().addActivityEventListener(MediaEngineModule.this.activityEventListener);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01721) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$invalidate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$invalidate$1", f = "MediaEngineModule.kt", l = {155}, m = "invokeSuspend")
    public static final class C01731 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public C01731(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01731(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().reset();
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01731) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$rankRtcRegions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$rankRtcRegions$1", f = "MediaEngineModule.kt", l = {386}, m = "invokeSuspend")
    public static final class C01741 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ ReadableArray $regionsWithIps;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01741(ReadableArray readableArray, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$regionsWithIps = readableArray;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String[] strArr) {
            callback.invoke(NativeArrayExtensionsKt.toNativeArray(strArr));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01741(this.$regionsWithIps, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().rankRtcRegions$media_engine_release(NativeArrayExtensionsKt.toJsonString(this.$regionsWithIps), new l(this.$callback, 11));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01741) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setAudioInputEnabled$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setAudioInputEnabled$1", f = "MediaEngineModule.kt", l = {414}, m = "invokeSuspend")
    public static final class C01751 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $enabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01751(boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$enabled = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01751(this.$enabled, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setAudioInputEnabled$media_engine_release(this.$enabled);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01751) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setBroadcastThumbnailParams$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setBroadcastThumbnailParams$1", f = "MediaEngineModule.kt", l = {228}, m = "invokeSuspend")
    public static final class C01761 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $height;
        final /* synthetic */ double $intervalSeconds;
        final /* synthetic */ double $width;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01761(double d6, double d7, double d8, Continuation continuation) {
            super(2, continuation);
            this.$width = d6;
            this.$height = d7;
            this.$intervalSeconds = d8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope, MediaEngineModule mediaEngineModule, String str) {
            hr.e eVar = k0.f2938a;
            b0.t(coroutineScope, fr.q.f9394a, new MediaEngineModule$setBroadcastThumbnailParams$1$1$1(mediaEngineModule, str, null), 2);
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C01761 c01761 = MediaEngineModule.this.new C01761(this.$width, this.$height, this.$intervalSeconds, continuation);
            c01761.L$0 = obj;
            return c01761;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setBroadcastThumbnailParams$media_engine_release((int) this.$width, (int) this.$height, (int) this.$intervalSeconds, new v(0, coroutineScope, MediaEngineModule.this));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01761) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setEmitVADLevel2$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setEmitVADLevel2$1", f = "MediaEngineModule.kt", l = {276}, m = "invokeSuspend")
    public static final class C01771 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $enable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01771(boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$enable = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01771(this.$enable, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setEmitVADLevel2$media_engine_release(this.$enable);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01771) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setHasFullbandPerformance$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setHasFullbandPerformance$1", f = "MediaEngineModule.kt", l = {870}, m = "invokeSuspend")
    public static final class C01781 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $hasFullbandPerformance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01781(boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$hasFullbandPerformance = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01781(this.$hasFullbandPerformance, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setHasFullbandPerformance$media_engine_release(this.$hasFullbandPerformance);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01781) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setInputDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setInputDevice$1", f = "MediaEngineModule.kt", l = {292}, m = "invokeSuspend")
    public static final class C01791 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $deviceIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01791(double d6, Continuation continuation) {
            super(2, continuation);
            this.$deviceIndex = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01791(this.$deviceIndex, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setInputDevice$media_engine_release((int) this.$deviceIndex);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01791) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setInputDeviceById$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setInputDeviceById$1", f = "MediaEngineModule.kt", l = {299}, m = "invokeSuspend")
    public static final class C01801 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $deviceName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01801(String str, Continuation continuation) {
            super(2, continuation);
            this.$deviceName = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01801(this.$deviceName, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setInputDevice$media_engine_release(this.$deviceName);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01801) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setInputVolume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setInputVolume$1", f = "MediaEngineModule.kt", l = {262}, m = "invokeSuspend")
    public static final class C01811 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $volume;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01811(double d6, Continuation continuation) {
            super(2, continuation);
            this.$volume = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01811(this.$volume, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setInputVolume$media_engine_release((float) this.$volume);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01811) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setNoInputThreshold$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setNoInputThreshold$1", f = "MediaEngineModule.kt", l = {352}, m = "invokeSuspend")
    public static final class C01821 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $threshold;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01821(double d6, Continuation continuation) {
            super(2, continuation);
            this.$threshold = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01821(this.$threshold, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setNoInputThreshold$media_engine_release((float) this.$threshold);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01821) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setOutputDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setOutputDevice$1", f = "MediaEngineModule.kt", l = {315}, m = "invokeSuspend")
    public static final class C01831 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $deviceIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01831(double d6, Continuation continuation) {
            super(2, continuation);
            this.$deviceIndex = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01831(this.$deviceIndex, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setOutputDevice$media_engine_release((int) this.$deviceIndex);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01831) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setOutputDeviceById$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setOutputDeviceById$1", f = "MediaEngineModule.kt", l = {322}, m = "invokeSuspend")
    public static final class C01841 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $deviceName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01841(String str, Continuation continuation) {
            super(2, continuation);
            this.$deviceName = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01841(this.$deviceName, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setOutputDevice$media_engine_release(this.$deviceName);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01841) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setOutputVolume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setOutputVolume$1", f = "MediaEngineModule.kt", l = {269}, m = "invokeSuspend")
    public static final class C01851 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $volume;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01851(double d6, Continuation continuation) {
            super(2, continuation);
            this.$volume = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01851(this.$volume, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setOutputVolume$media_engine_release((float) this.$volume);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01851) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setSidechainCompression$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setSidechainCompression$1", f = "MediaEngineModule.kt", l = {817}, m = "invokeSuspend")
    public static final class C01861 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $enabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01861(boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$enabled = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01861(this.$enabled, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setSidechainCompression$media_engine_release(this.$enabled);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01861) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setTransportOptions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setTransportOptions$1", f = "MediaEngineModule.kt", l = {255}, m = "invokeSuspend")
    public static final class C01871 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ ReadableMap $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01871(ReadableMap readableMap, Continuation continuation) {
            super(2, continuation);
            this.$options = readableMap;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01871(this.$options, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setTransportOptions$media_engine_release(NativeMapExtensionsKt.toJsonString(this.$options));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01871) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setVideoInputDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setVideoInputDevice$1", f = "MediaEngineModule.kt", l = {338}, m = "invokeSuspend")
    public static final class C01881 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $deviceIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01881(double d6, Continuation continuation) {
            super(2, continuation);
            this.$deviceIndex = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01881(this.$deviceIndex, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setVideoInputDevice$media_engine_release((int) this.$deviceIndex);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01881) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$setVideoInputDeviceById$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$setVideoInputDeviceById$1", f = "MediaEngineModule.kt", l = {345}, m = "invokeSuspend")
    public static final class C01891 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $deviceName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01891(String str, Continuation continuation) {
            super(2, continuation);
            this.$deviceName = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01891(this.$deviceName, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().setVideoInputDevice$media_engine_release(this.$deviceName);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01891) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$startLocalAudioRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$startLocalAudioRecording$1", f = "MediaEngineModule.kt", l = {395}, m = "invokeSuspend")
    public static final class C01901 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ ReadableMap $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01901(ReadableMap readableMap, Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$options = readableMap;
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, boolean z5) {
            callback.invoke(Boolean.valueOf(z5));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01901(this.$options, this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().startLocalAudioRecording$media_engine_release(NativeMapExtensionsKt.toJsonString(this.$options), new l(this.$callback, 12));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01901) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$stopBroadcast$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$stopBroadcast$1", f = "MediaEngineModule.kt", l = {239}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nMediaEngineModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngineModule.kt\ncom/discord/media/engine/MediaEngineModule$stopBroadcast$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1#2:891\n*E\n"})
    public static final class C01911 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public C01911(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01911(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            Integer num = MediaEngineModule.this.streamConnectionId;
            if (num != null) {
                MediaEngineModule.this.getMediaEngine().connectionInstanceStopBroadcast$media_engine_release(num.intValue());
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01911) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$stopBroadcastWithError$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$stopBroadcastWithError$1", f = "MediaEngineModule.kt", l = {246}, m = "invokeSuspend")
    public static final class C01921 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ double $errorCode;
        final /* synthetic */ String $errorMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01921(double d6, String str, Continuation continuation) {
            super(2, continuation);
            this.$errorCode = d6;
            this.$errorMessage = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01921(this.$errorCode, this.$errorMessage, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            Integer num = MediaEngineModule.this.streamConnectionId;
            if (num != null) {
                MediaEngineModule mediaEngineModule2 = MediaEngineModule.this;
                double d6 = this.$errorCode;
                String str = this.$errorMessage;
                mediaEngineModule2.getMediaEngine().connectionInstanceStopBroadcastWithError$media_engine_release(num.intValue(), (int) d6, str);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01921) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$stopLocalAudioRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$stopLocalAudioRecording$1", f = "MediaEngineModule.kt", l = {404}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nMediaEngineModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngineModule.kt\ncom/discord/media/engine/MediaEngineModule$stopLocalAudioRecording$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,890:1\n36#2:891\n*S KotlinDebug\n*F\n+ 1 MediaEngineModule.kt\ncom/discord/media/engine/MediaEngineModule$stopLocalAudioRecording$1\n*L\n406#1:891\n*E\n"})
    public static final class C01931 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Callback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01931(Callback callback, Continuation continuation) {
            super(2, continuation);
            this.$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Callback callback, String str, int i7) {
            callback.invoke(Uri.fromFile(new File(str)).toString(), Integer.valueOf(i7));
            return Unit.f14616a;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01931(this.$callback, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().stopLocalAudioRecording$media_engine_release(new s(this.$callback, 2));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01931) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.engine.MediaEngineModule$updateFieldTrial$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media.engine.MediaEngineModule$updateFieldTrial$1", f = "MediaEngineModule.kt", l = {824}, m = "invokeSuspend")
    public static final class C01941 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01941(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = str2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaEngineModule.this.new C01941(this.$key, this.$value, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaEngineModule mediaEngineModule = MediaEngineModule.this;
                this.label = 1;
                if (mediaEngineModule.awaitMediaEngine(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            MediaEngineModule.this.getMediaEngine().updateFieldTrial$media_engine_release(this.$key, this.$value);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01941) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        fr.d dVarB = b0.b(new u0(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(1, new t1(new AtomicInteger())))));
        this.appScope = dVarB;
        this.startNs = System.nanoTime();
        this.mediaEngineDeferred = b0.a();
        StreamManager.INSTANCE.ensureInstalled();
        b0.t(dVarB, null, new AnonymousClass1(null), 3);
        Debug.INSTANCE.logDebugLoggingConfig();
        this.reactEvents = new ReactEvents(new Pair("no-input-callback", Reflection.getOrCreateKotlinClass(NoInputCallbackEvent.class)), new Pair("on-voice", Reflection.getOrCreateKotlinClass(OnVoiceEvent.class)), new Pair("device-changed", Reflection.getOrCreateKotlinClass(DeviceChangedEvent.class)), new Pair("audio-input-initialized", Reflection.getOrCreateKotlinClass(AudioInputInitializedEvent.class)), new Pair("on-broadcast-requested", Reflection.getOrCreateKotlinClass(OnBroadcastRequestedEvent.class)), new Pair("on-broadcast-thumbnail", Reflection.getOrCreateKotlinClass(OnBroadcastThumbnailEvent.class)), new Pair("user-speaking", Reflection.getOrCreateKotlinClass(UserSpeakingEvent.class)), new Pair("ping-callback", Reflection.getOrCreateKotlinClass(PingCallbackEvent.class)), new Pair("ping-timeout-callback", Reflection.getOrCreateKotlinClass(PingTimeoutCallbackEvent.class)), new Pair("speaking-while-muted", Reflection.getOrCreateKotlinClass(SpeakingWhileMutedCallbackEvent.class)), new Pair("on-video-callback", Reflection.getOrCreateKotlinClass(OnVideoCallbackEvent.class)), new Pair("active-sinks-change", Reflection.getOrCreateKotlinClass(ActiveSinksChangeEvent.class)), new Pair("on-first-frame-callback", Reflection.getOrCreateKotlinClass(FirstFrameCallbackEvent.class)), new Pair("mls-failure-callback", Reflection.getOrCreateKotlinClass(MlsFailureCallbackEvent.class)), new Pair("secure-frames-state-update-callback", Reflection.getOrCreateKotlinClass(SecureFramesStateUpdateCallbackEvent.class)), new Pair("voice-processing-error-callback", Reflection.getOrCreateKotlinClass(VoiceProcessingErrorCallbackEvent.class)));
        this.activityEventListener = new ActivityEventListener() { // from class: com.discord.media.engine.MediaEngineModule$activityEventListener$1
            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (resultCode == -1 && requestCode == 420 && data != null) {
                    this.this$0.streamPermissions = data;
                    this.this$0.reactEvents.emitModuleEvent(this.this$0.getReactContext(), new OnBroadcastRequestedEvent());
                }
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addConnectionCallbacks(int connectionId) {
        b0.t(this.appScope, null, new C01321(connectionId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitMediaEngine(Continuation continuation) {
        return this.mediaEngineDeferred.z(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createConnection(int connectionId, String userId, ReadableMap connectionOptions, Function2<? super String, ? super Map<String, ? extends Object>, Unit> callback) {
        b0.t(this.appScope, null, new C01631(connectionId, userId, connectionOptions, callback, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createVoiceConnectionWithOptions$lambda$1(Callback callback, String errorMessage, Map connectionInfo) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(connectionInfo, "connectionInfo");
        callback.invoke(errorMessage, NativeMapExtensionsKt.toNativeMap(connectionInfo));
        return Unit.f14616a;
    }

    private static /* synthetic */ void getAppScope$annotations() {
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceConfigureConnectionRetries(double connectionId, double baseDelayMs, double maxDelayMs, double maxAttempts) {
        b0.t(this.appScope, null, new C01331(connectionId, baseDelayMs, maxDelayMs, maxAttempts, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceDestroy(double connectionId, boolean willReconnect) {
        b0.t(this.appScope, null, new C01341(connectionId, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceDestroyUser(double connectionId, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        b0.t(this.appScope, null, new C01351(connectionId, userId, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceExecuteSecureFramesTransition(double connectionId, double transitionId) {
        b0.t(this.appScope, null, new C01361(connectionId, transitionId, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceFastUdpReconnect(double connectionId) {
        b0.t(this.appScope, null, new C01371(connectionId, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceGetEncryptionModes(double connectionId, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01381(connectionId, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceGetFilteredStats(double connectionId, double filter, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01391(connectionId, filter, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceGetMLSKeyPackageB64(double connectionId, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01401(connectionId, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceGetMLSPairwiseFingerprintB64(double connectionId, double version, @NotNull String userId, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01411(connectionId, version, userId, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceGetStats(double connectionId, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01421(connectionId, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceMergeUsers(double connectionId, @NotNull ReadableArray users) {
        Intrinsics.checkNotNullParameter(users, "users");
        b0.t(this.appScope, null, new C01431(connectionId, users, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstancePrepareMLSCommitTransitionB64(double connectionId, double transitionId, @NotNull String commit, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(commit, "commit");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01441(connectionId, transitionId, commit, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstancePrepareSecureFramesEpoch(double connectionId, @NotNull String epoch, double transitionId, @NotNull String groupId) {
        Intrinsics.checkNotNullParameter(epoch, "epoch");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        b0.t(this.appScope, null, new C01451(connectionId, epoch, transitionId, groupId, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstancePrepareSecureFramesTransition(double connectionId, double transitionId, double protocolVersion, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01461(connectionId, transitionId, protocolVersion, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceProcessMLSProposalsB64(double connectionId, @NotNull String proposals, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(proposals, "proposals");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01471(connectionId, proposals, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceProcessMLSWelcomeB64(double connectionId, double transitionId, @NotNull String welcome, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(welcome, "welcome");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01481(connectionId, transitionId, welcome, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetDesktopSource(double connectionId, @NotNull String stringId, boolean useVideoHook, @NotNull String type) {
        Intrinsics.checkNotNullParameter(stringId, "stringId");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetLocalMute(double connectionId, @NotNull String userId, boolean mute) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        b0.t(this.appScope, null, new C01491(connectionId, userId, mute, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetLocalPan(double connectionId, @NotNull String userId, double left, double right) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        b0.t(this.appScope, null, new C01501(connectionId, userId, left, right, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetLocalVolume(double connectionId, @NotNull String userId, double volume) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        b0.t(this.appScope, null, new C01511(connectionId, userId, volume, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetMinimumOutputDelay(double connectionId, double delay) {
        b0.t(this.appScope, null, new C01521(connectionId, delay, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetNoInputThreshold(double connectionId, double threshold) {
        b0.t(this.appScope, null, new C01531(connectionId, threshold, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetPTTActive(double connectionId, boolean active, boolean priority, boolean muteOverride) {
        b0.t(this.appScope, null, new C01541(connectionId, active, priority, muteOverride, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetPingInterval(double connectionId, double pingInterval) {
        b0.t(this.appScope, null, new C01551(connectionId, pingInterval, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetSelfDeafen(double connectionId, boolean deafened) {
        b0.t(this.appScope, null, new C01561(connectionId, deafened, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetSelfMute(double connectionId, boolean muted) {
        b0.t(this.appScope, null, new C01571(connectionId, muted, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetTransportOptions(double connectionId, @NotNull ReadableMap options) {
        Intrinsics.checkNotNullParameter(options, "options");
        b0.t(this.appScope, null, new C01581(connectionId, options, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceSetVideoBroadcast(double connectionId, boolean broadcasting) {
        b0.t(this.appScope, null, new C01591(connectionId, broadcasting, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceTriggerOnSpeakingCallback(double connectionId) {
        b0.t(this.appScope, null, new C01601(connectionId, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceTriggerOnVideoCallback(double connectionId) {
        b0.t(this.appScope, null, new C01611(connectionId, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceUpdateMLSExternalSenderB64(double connectionId, @NotNull String externalSenderB64) {
        Intrinsics.checkNotNullParameter(externalSenderB64, "externalSenderB64");
        b0.t(this.appScope, null, new C01621(connectionId, externalSenderB64, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void connectionInstanceWasRemoteDisconnected(double connectionId) {
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void createOwnStreamConnectionWithOptions(double connectionId, @NotNull String userId, @NotNull ReadableMap connectionOptions, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(connectionOptions, "connectionOptions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01641(connectionId, userId, connectionOptions, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void createVoiceConnectionWithOptions(double connectionId, @NotNull String userId, @NotNull ReadableMap connectionOptions, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(connectionOptions, "connectionOptions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i7 = (int) connectionId;
        createConnection(i7, userId, connectionOptions, new s(callback, 3));
        addConnectionCallbacks(i7);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void getAudioSubsystem(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01651(callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void getCodecCapabilities(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01661(callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void getCodecSurvey(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01671(callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void getInputDevices(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01681(callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void getMLSSigningKeyB64(@NotNull String sessionId, double signatureVersion, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01691(sessionId, signatureVersion, callback, null), 3);
    }

    @NotNull
    public final MediaEngine getMediaEngine() {
        MediaEngine mediaEngine = this.mediaEngine;
        if (mediaEngine != null) {
            return mediaEngine;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaEngine");
        return null;
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void getOutputDevices(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01701(callback, null), 3);
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        return w0.h(new Pair("DegradationPreference", w0.g(new Pair("MAINTAIN_RESOLUTION", 0), new Pair("MAINTAIN_FRAMERATE", 1), new Pair("BALANCED", 2))), new Pair("AVAudioSessionMode", w0.g(new Pair("VOICE", "AVAudioSessionModeVoiceChat"), new Pair("VIDEO", "AVAudioSessionModeVideoChat"), new Pair("LISTEN", "AVAudioSessionModeSpokenAudio"), new Pair("DEFAULT", "AVAudioSessionModeDefault"))), new Pair("SupportedSecureFramesProtocolVersion", Integer.valueOf(MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION)), new Pair("supportedFeatures", d0.g("voice_sound_stop_loop", "voice_relative_sounds", "voice_legacy_subsystem", "voice_experimental_subsystem", "elevated_hook", "soundshare", "soundshare_loopback", "set_audio_device_by_id", "set_video_device_by_id", "loopback", "wumpus_video", "hybrid_video", "experimental_encoders", "experiment_config", "remote_locus_network_control", "screen_previews", "window_previews", "audio_debug_state", "connection_replay", "simulcast_bugfix", "RTC_REGION_RANKING", "video_effects", "direct_video", "electron_video", "mediapipe", "fixed_keyframe_interval", "clips", "first_frame_callback", "remote_user_multi_stream", "mls_pairwise_fingerprints", "offload_adm_controls", "krisp_native_error")));
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void getVideoInputDevices(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01711(callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void initializeEngine() {
        b0.t(this.appScope, null, new C01721(null), 3);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.reactContext.removeActivityEventListener(this.activityEventListener);
        b0.t(this.appScope, null, new C01731(null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void rankRtcRegions(@NotNull ReadableArray regionsWithIps, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(regionsWithIps, "regionsWithIps");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01741(regionsWithIps, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setAVAudioSessionMode(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setAudioInputEnabled(boolean enabled) {
        b0.t(this.appScope, null, new C01751(enabled, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setBroadcastThumbnailParams(double width, double height, double intervalSeconds) {
        b0.t(this.appScope, null, new C01761(width, height, intervalSeconds, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setEmitVADLevel2(boolean enable) {
        b0.t(this.appScope, null, new C01771(enable, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setHasFullbandPerformance(boolean hasFullbandPerformance) {
        b0.t(this.appScope, null, new C01781(hasFullbandPerformance, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setInputDevice(double deviceIndex) {
        b0.t(this.appScope, null, new C01791(deviceIndex, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setInputDeviceById(@NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        b0.t(this.appScope, null, new C01801(deviceName, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setInputVolume(double volume) {
        b0.t(this.appScope, null, new C01811(volume, null), 3);
    }

    public final void setMediaEngine(@NotNull MediaEngine mediaEngine) {
        Intrinsics.checkNotNullParameter(mediaEngine, "<set-?>");
        this.mediaEngine = mediaEngine;
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setNcModels(@NotNull ReadableArray models) {
        Intrinsics.checkNotNullParameter(models, "models");
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setNoInputThreshold(double threshold) {
        b0.t(this.appScope, null, new C01821(threshold, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setOffloadAdmControls(boolean enabled) {
        SharedPreferences sharedPreferences = this.reactContext.getSharedPreferences("MediaEngine", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("offloadAdmControls", enabled);
        editorEdit.apply();
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setOutputDevice(double deviceIndex) {
        b0.t(this.appScope, null, new C01831(deviceIndex, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setOutputDeviceById(@NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        b0.t(this.appScope, null, new C01841(deviceName, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setOutputVolume(double volume) {
        b0.t(this.appScope, null, new C01851(volume, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setSidechainCompression(boolean enabled) {
        b0.t(this.appScope, null, new C01861(enabled, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setTransportOptions(@NotNull ReadableMap options) {
        Intrinsics.checkNotNullParameter(options, "options");
        b0.t(this.appScope, null, new C01871(options, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setVideoInputDevice(double deviceIndex) {
        b0.t(this.appScope, null, new C01881(deviceIndex, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void setVideoInputDeviceById(@NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        b0.t(this.appScope, null, new C01891(deviceName, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void startBroadcast() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            ActivityUtilities.startActivityForResultAsync$default(ActivityUtilities.INSTANCE, currentActivity, INSTANCE.createScreenCaptureIntent(currentActivity), START_SCREENSHARE_REQUEST_CODE, null, 8, null);
        }
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void startLocalAudioRecording(@NotNull ReadableMap options, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01901(options, callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void stopBroadcast() {
        b0.t(this.appScope, null, new C01911(null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void stopBroadcastWithError(double errorCode, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        b0.t(this.appScope, null, new C01921(errorCode, errorMessage, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void stopLocalAudioRecording(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        b0.t(this.appScope, null, new C01931(callback, null), 3);
    }

    @Override // com.discord.codegen.NativeMediaEngineModuleSpec
    public void updateFieldTrial(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        b0.t(this.appScope, null, new C01941(key, value, null), 3);
    }
}
