package com.discord.play_delivery;

import a3.e;
import android.content.Context;
import android.os.SystemClock;
import com.discord.crash_reporting.CrashReporting;
import com.discord.crash_reporting.d;
import com.discord.lifecycle.AppLifecycle;
import com.discord.lifecycle.BackgroundStartSignals;
import com.discord.lifecycle.ForegroundServiceStartGuard;
import com.discord.logging.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kk.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;
import sh.m0;
import sh.v;
import th.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001A\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001GB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J-\u0010$\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+RT\u0010.\u001aB\u0012\f\u0012\n -*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n -*\u0004\u0018\u00010\t0\t -* \u0012\f\u0012\n -*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n -*\u0004\u0018\u00010\t0\t\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u0004008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R2\u00108\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b07068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/discord/play_delivery/PlayAssetDelivery;", "", "<init>", "()V", "Lcom/google/android/play/core/assetpacks/AssetPackManager;", "assetPackManager", "", "assetPackName", "Lkotlin/Function1;", "", "", "successCallback", "startFetch", "(Lcom/google/android/play/core/assetpacks/AssetPackManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "packs", "reason", "cancelFetches", "(Ljava/util/List;Ljava/lang/String;)Z", "registerBackgroundStartListener", "handleBackgroundOnlyStart", "retryPendingFetches", "(Ljava/lang/String;)V", "result", "flushAssetCallbacksWithResult", "(Ljava/lang/String;Z)V", "enqueueCallback", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "applicationContext", "initialize", "(Landroid/content/Context;)V", "isAssetDeliveryAvailable", "()Z", "getCachedAssetPackLocation", "(Ljava/lang/String;)Ljava/lang/String;", "fetchAssetPack", "TAG", "Ljava/lang/String;", "", "CANCEL_TIMEOUT_MS", "J", "backgroundStartCancelPacks", "Ljava/util/List;", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "kotlin.jvm.PlatformType", "backgroundCancelRequested", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "Ljava/lang/ref/WeakReference;", "assetPackManagerWeakRef", "Ljava/lang/ref/WeakReference;", "backgroundStartListenerRegistered", "Z", "assetDeliveryAvailable", "", "", "pendingCallbacks", "Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lsh/v;", "assetPackLocations", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/discord/play_delivery/PlayAssetDelivery$FetchState;", "fetchState", "Lcom/discord/play_delivery/PlayAssetDelivery$FetchState;", "com/discord/play_delivery/PlayAssetDelivery$appLifecycleListener$1", "appLifecycleListener", "Lcom/discord/play_delivery/PlayAssetDelivery$appLifecycleListener$1;", "Lcom/google/android/play/core/assetpacks/AssetPackStateUpdateListener;", "assetPackStateUpdateListener", "Lcom/google/android/play/core/assetpacks/AssetPackStateUpdateListener;", "FetchState", "play_delivery_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlayAssetDelivery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayAssetDelivery.kt\ncom/discord/play_delivery/PlayAssetDelivery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 com.google.android.play:asset-delivery-ktx@@2.3.0\ncom/google/android/play/core/ktx/AssetPackManagerKtxKt\n*L\n1#1,434:1\n1869#2,2:435\n384#3,7:437\n44#4:444\n*S KotlinDebug\n*F\n+ 1 PlayAssetDelivery.kt\ncom/discord/play_delivery/PlayAssetDelivery\n*L\n192#1:435,2\n264#1:437,7\n280#1:444\n*E\n"})
public final class PlayAssetDelivery {
    private static final long CANCEL_TIMEOUT_MS = 10000;

    @NotNull
    private static final String TAG = "PlayAssetDelivery";
    private static WeakReference<AssetPackManager> assetPackManagerWeakRef;
    private static boolean backgroundStartListenerRegistered;

    @NotNull
    public static final PlayAssetDelivery INSTANCE = new PlayAssetDelivery();

    @NotNull
    private static final List<String> backgroundStartCancelPacks = c0.c("krisp");
    private static final ConcurrentHashMap.KeySetView<String, Boolean> backgroundCancelRequested = ConcurrentHashMap.newKeySet();
    private static volatile boolean assetDeliveryAvailable = true;

    @NotNull
    private static final Map<String, List<Function1<Boolean, Unit>>> pendingCallbacks = new LinkedHashMap();

    @NotNull
    private static final ConcurrentHashMap<String, v> assetPackLocations = new ConcurrentHashMap<>();

    @NotNull
    private static final FetchState fetchState = new FetchState();

    @NotNull
    private static final PlayAssetDelivery$appLifecycleListener$1 appLifecycleListener = new AppLifecycle.Listener() { // from class: com.discord.play_delivery.PlayAssetDelivery$appLifecycleListener$1
        @Override // com.discord.lifecycle.AppLifecycle.Listener
        public void onBackgrounded() {
            PlayAssetDelivery.INSTANCE.cancelFetches(PlayAssetDelivery.fetchState.snapshotInFlight(), "app_backgrounded");
        }

        @Override // com.discord.lifecycle.AppLifecycle.Listener
        public void onForegrounded() {
            PlayAssetDelivery.INSTANCE.retryPendingFetches("app_foregrounded");
        }
    };

    @NotNull
    private static final AssetPackStateUpdateListener assetPackStateUpdateListener = new a();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006J\u0014\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0014\u0010\u001e\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006RN\u0010\u0004\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RN\u0010\t\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RN\u0010\n\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/discord/play_delivery/PlayAssetDelivery$FetchState;", "", "<init>", "()V", "inFlight", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "", "kotlin.jvm.PlatformType", "", "pending", "canceledForRetry", "cancelRequestedAt", "Ljava/util/concurrent/ConcurrentHashMap;", "", "pendingCount", "", "getPendingCount", "()I", "snapshotInFlight", "", "snapshotPending", "markPending", "", "assetPackName", "markFetchStarted", "markFetchCompleted", "markFetchFailed", "markCanceled", "markCancelRequested", "assetPackNames", "clearCancelRequestedState", "clearCancelStateIfTimedOut", "isRetryReady", "play_delivery_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPlayAssetDelivery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayAssetDelivery.kt\ncom/discord/play_delivery/PlayAssetDelivery$FetchState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n1869#2,2:435\n1869#2,2:437\n1#3:439\n*S KotlinDebug\n*F\n+ 1 PlayAssetDelivery.kt\ncom/discord/play_delivery/PlayAssetDelivery$FetchState\n*L\n399#1:435,2\n406#1:437,2\n*E\n"})
    public static final class FetchState {
        private final ConcurrentHashMap.KeySetView<String, Boolean> inFlight = ConcurrentHashMap.newKeySet();
        private final ConcurrentHashMap.KeySetView<String, Boolean> pending = ConcurrentHashMap.newKeySet();
        private final ConcurrentHashMap.KeySetView<String, Boolean> canceledForRetry = ConcurrentHashMap.newKeySet();

        @NotNull
        private final ConcurrentHashMap<String, Long> cancelRequestedAt = new ConcurrentHashMap<>();

        public final void clearCancelRequestedState(@NotNull List<String> assetPackNames) {
            Intrinsics.checkNotNullParameter(assetPackNames, "assetPackNames");
            for (String str : assetPackNames) {
                this.canceledForRetry.remove(str);
                this.cancelRequestedAt.remove(str);
            }
        }

        public final String clearCancelStateIfTimedOut(@NotNull String assetPackName) {
            String string;
            Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
            if (!this.canceledForRetry.contains(assetPackName)) {
                return null;
            }
            Long l6 = this.cancelRequestedAt.get(assetPackName);
            Long lValueOf = l6 != null ? Long.valueOf(SystemClock.elapsedRealtime() - l6.longValue()) : null;
            if (lValueOf != null && lValueOf.longValue() <= PlayAssetDelivery.CANCEL_TIMEOUT_MS) {
                return null;
            }
            this.canceledForRetry.remove(assetPackName);
            this.cancelRequestedAt.remove(assetPackName);
            this.inFlight.remove(assetPackName);
            return (lValueOf == null || (string = lValueOf.toString()) == null) ? "unknown" : string;
        }

        public final int getPendingCount() {
            return this.pending.size();
        }

        public final boolean isRetryReady(@NotNull String assetPackName) {
            Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
            return (this.inFlight.contains(assetPackName) || this.canceledForRetry.contains(assetPackName)) ? false : true;
        }

        public final void markCancelRequested(@NotNull List<String> assetPackNames) {
            Intrinsics.checkNotNullParameter(assetPackNames, "assetPackNames");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.pending.addAll(assetPackNames);
            for (String str : assetPackNames) {
                this.canceledForRetry.add(str);
                this.cancelRequestedAt.put(str, Long.valueOf(jElapsedRealtime));
            }
        }

        public final boolean markCanceled(@NotNull String assetPackName) {
            Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
            this.inFlight.remove(assetPackName);
            boolean zRemove = this.canceledForRetry.remove(assetPackName);
            this.cancelRequestedAt.remove(assetPackName);
            if (!zRemove) {
                this.pending.remove(assetPackName);
            }
            return zRemove;
        }

        public final void markFetchCompleted(@NotNull String assetPackName) {
            Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
            this.inFlight.remove(assetPackName);
            this.pending.remove(assetPackName);
            this.canceledForRetry.remove(assetPackName);
            this.cancelRequestedAt.remove(assetPackName);
        }

        public final void markFetchFailed(@NotNull String assetPackName) {
            Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
            this.inFlight.remove(assetPackName);
            this.pending.remove(assetPackName);
            this.canceledForRetry.remove(assetPackName);
            this.cancelRequestedAt.remove(assetPackName);
        }

        public final void markFetchStarted(@NotNull String assetPackName) {
            Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
            this.pending.remove(assetPackName);
            this.canceledForRetry.remove(assetPackName);
            this.cancelRequestedAt.remove(assetPackName);
            this.inFlight.add(assetPackName);
        }

        public final void markPending(@NotNull String assetPackName) {
            Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
            this.pending.add(assetPackName);
        }

        @NotNull
        public final List<String> snapshotInFlight() {
            ConcurrentHashMap.KeySetView<String, Boolean> inFlight = this.inFlight;
            Intrinsics.checkNotNullExpressionValue(inFlight, "inFlight");
            return CollectionsKt.i0(inFlight);
        }

        @NotNull
        public final List<String> snapshotPending() {
            ConcurrentHashMap.KeySetView<String, Boolean> pending = this.pending;
            Intrinsics.checkNotNullExpressionValue(pending, "pending");
            return CollectionsKt.i0(pending);
        }
    }

    private PlayAssetDelivery() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void assetPackStateUpdateListener$lambda$7(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "assetPackState");
        WeakReference<AssetPackManager> weakReference = assetPackManagerWeakRef;
        Boolean bool = null;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetPackManagerWeakRef");
            weakReference = null;
        }
        AssetPackManager assetPackManager = weakReference.get();
        if (assetPackManager == null) {
            return;
        }
        String strG = assetPackState.g();
        Intrinsics.checkNotNullExpressionValue(strG, "name(...)");
        int iH = assetPackState.h();
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = backgroundCancelRequested;
        boolean zContains = keySetView.contains(strG);
        if (iH == 4) {
            if (zContains) {
                CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "PlayAssetDelivery: background-only cancel not observed", w0.g(new Pair("pack", strG), new Pair("status", "completed")), "play_asset_delivery", null, false, 24, null);
            }
            keySetView.remove(strG);
            v vVarD = assetPackManager.d(strG);
            if (vVarD != null) {
                assetPackLocations.put(strG, vVarD);
            }
            Log.i$default(Log.INSTANCE, TAG, g.e("Download of ", strG, " Asset complete"), (Throwable) null, 4, (Object) null);
            fetchState.markFetchCompleted(strG);
            bool = Boolean.TRUE;
        } else if (iH == 5) {
            if (zContains) {
                CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "PlayAssetDelivery: background-only cancel not observed", w0.g(new Pair("pack", strG), new Pair("status", "failed")), "play_asset_delivery", null, false, 24, null);
            }
            keySetView.remove(strG);
            fetchState.markFetchFailed(strG);
            Log.i$default(Log.INSTANCE, TAG, g.e("Download of ", strG, " Asset failed"), (Throwable) null, 4, (Object) null);
            bool = Boolean.FALSE;
        } else if (iH == 6) {
            if (keySetView.remove(strG)) {
                CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "PlayAssetDelivery: background-only cancel confirmed", e.v("pack", strG), "play_asset_delivery", null, false, 24, null);
            }
            if (fetchState.markCanceled(strG)) {
                Log.i$default(Log.INSTANCE, TAG, g.e("Download of ", strG, " Asset canceled for retry"), (Throwable) null, 4, (Object) null);
                INSTANCE.retryPendingFetches("cancel_completed");
            } else {
                Log.i$default(Log.INSTANCE, TAG, g.e("Download of ", strG, " Asset failed"), (Throwable) null, 4, (Object) null);
                bool = Boolean.FALSE;
            }
        }
        if (bool != null) {
            INSTANCE.flushAssetCallbacksWithResult(strG, bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean cancelFetches(List<String> packs, String reason) {
        WeakReference<AssetPackManager> weakReference = assetPackManagerWeakRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetPackManagerWeakRef");
            weakReference = null;
        }
        AssetPackManager assetPackManager = weakReference.get();
        if (assetPackManager == null) {
            return false;
        }
        if (packs.isEmpty()) {
            return true;
        }
        FetchState fetchState2 = fetchState;
        fetchState2.markCancelRequested(packs);
        Log log = Log.INSTANCE;
        int pendingCount = fetchState2.getPendingCount();
        StringBuilder sb2 = new StringBuilder("Canceling asset fetches due to ");
        sb2.append(reason);
        sb2.append(": ");
        sb2.append(packs);
        sb2.append(" (Queued pending: ");
        Log.i$default(log, TAG, b.l(sb2, pendingCount, ")"), (Throwable) null, 4, (Object) null);
        try {
            assetPackManager.c(packs);
            return true;
        } catch (Throwable th2) {
            Log.INSTANCE.w(TAG, "Failed to cancel asset fetches for " + reason, th2);
            fetchState.clearCancelRequestedState(packs);
            return false;
        }
    }

    private final void enqueueCallback(String assetPackName, Function1<? super Boolean, Unit> successCallback) {
        if (successCallback == null) {
            return;
        }
        Map<String, List<Function1<Boolean, Unit>>> map = pendingCallbacks;
        synchronized (map) {
            try {
                List<Function1<Boolean, Unit>> arrayList = map.get(assetPackName);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(assetPackName, arrayList);
                }
                arrayList.add(successCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAssetPack$default(PlayAssetDelivery playAssetDelivery, String str, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            function1 = null;
        }
        playAssetDelivery.fetchAssetPack(str, function1);
    }

    private final void flushAssetCallbacksWithResult(String assetPackName, boolean result) {
        Map<String, List<Function1<Boolean, Unit>>> map = pendingCallbacks;
        synchronized (map) {
            try {
                List<Function1<Boolean, Unit>> list = map.get(assetPackName);
                if (list != null) {
                    Iterator<Function1<Boolean, Unit>> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().invoke(Boolean.valueOf(result));
                    }
                    list.clear();
                    Unit unit = Unit.f14616a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void handleBackgroundOnlyStart() {
        List<String> list = backgroundStartCancelPacks;
        if (list.isEmpty()) {
            return;
        }
        WeakReference<AssetPackManager> weakReference = assetPackManagerWeakRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetPackManagerWeakRef");
            weakReference = null;
        }
        if (weakReference.get() == null) {
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "PlayAssetDelivery: background-only cancel skipped (manager null)", e.v("packs", CollectionsKt.O(list, ",", null, null, null, 62)), "play_asset_delivery", null, false, 24, null);
            return;
        }
        backgroundCancelRequested.addAll(list);
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "PlayAssetDelivery: background-only cancel requested", e.v("packs", CollectionsKt.O(list, ",", null, null, null, 62)), "play_asset_delivery", null, false, 24, null);
        if (cancelFetches(list, "background_only_start")) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            backgroundCancelRequested.remove((String) it.next());
        }
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "PlayAssetDelivery: background-only cancel failed", e.v("packs", CollectionsKt.O(list, ",", null, null, null, 62)), "play_asset_delivery", null, false, 24, null);
    }

    private final void registerBackgroundStartListener() {
        if (backgroundStartListenerRegistered) {
            return;
        }
        BackgroundStartSignals.INSTANCE.addListener(new d(26));
        backgroundStartListenerRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerBackgroundStartListener$lambda$1() {
        INSTANCE.handleBackgroundOnlyStart();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryPendingFetches(String reason) {
        WeakReference<AssetPackManager> weakReference = assetPackManagerWeakRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetPackManagerWeakRef");
            weakReference = null;
        }
        AssetPackManager assetPackManager = weakReference.get();
        if (assetPackManager == null) {
            return;
        }
        List<String> listSnapshotPending = fetchState.snapshotPending();
        if (listSnapshotPending.isEmpty()) {
            return;
        }
        ForegroundServiceStartGuard.Result resultEvaluate$default = ForegroundServiceStartGuard.evaluate$default(ForegroundServiceStartGuard.INSTANCE, 0L, 1, null);
        if (!resultEvaluate$default.getAllowed()) {
            Log.i$default(Log.INSTANCE, TAG, "Skipping pending asset fetches due to " + resultEvaluate$default.getReason() + " (diagnostics: " + resultEvaluate$default.getDiagnostics() + ")", (Throwable) null, 4, (Object) null);
            return;
        }
        Log.i$default(Log.INSTANCE, TAG, "Retrying pending asset fetches due to " + reason + ": " + listSnapshotPending, (Throwable) null, 4, (Object) null);
        for (String str : listSnapshotPending) {
            FetchState fetchState2 = fetchState;
            String strClearCancelStateIfTimedOut = fetchState2.clearCancelStateIfTimedOut(str);
            if (strClearCancelStateIfTimedOut != null) {
                Log.w$default(Log.INSTANCE, TAG, g.f("Cancel timed out for ", str, "; forcing retry (elapsedMs=", strClearCancelStateIfTimedOut, ")"), (Throwable) null, 4, (Object) null);
            }
            if (fetchState2.isRetryReady(str)) {
                v vVarD = assetPackManager.d(str);
                if (vVarD != null) {
                    assetPackLocations.put(str, vVarD);
                    fetchState2.markFetchCompleted(str);
                    flushAssetCallbacksWithResult(str, true);
                    Log.i$default(Log.INSTANCE, TAG, g.e("Pending pack ", str, " already available; skipping fetch"), (Throwable) null, 4, (Object) null);
                } else {
                    startFetch(assetPackManager, str, null);
                }
            }
        }
    }

    private final void startFetch(AssetPackManager assetPackManager, String assetPackName, Function1<? super Boolean, Unit> successCallback) {
        Log.i$default(Log.INSTANCE, TAG, e.l("Starting fetch for ", assetPackName), (Throwable) null, 4, (Object) null);
        backgroundCancelRequested.remove(assetPackName);
        fetchState.markFetchStarted(assetPackName);
        enqueueCallback(assetPackName, successCallback);
        assetPackManager.b(c0.c(assetPackName)).addOnCompleteListener(new app.rive.runtime.kotlin.b(assetPackName, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startFetch$lambda$0(String str, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.h() != null) {
            fetchState.markFetchFailed(str);
            assetDeliveryAvailable = false;
            INSTANCE.flushAssetCallbacksWithResult(str, false);
        }
    }

    public final void fetchAssetPack(@NotNull String assetPackName, Function1<? super Boolean, Unit> successCallback) {
        Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
        WeakReference<AssetPackManager> weakReference = assetPackManagerWeakRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetPackManagerWeakRef");
            weakReference = null;
        }
        AssetPackManager assetPackManager = weakReference.get();
        if (assetPackManager == null) {
            if (successCallback != null) {
                successCallback.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, g.e("Fetching ", assetPackName, " Asset"), (Throwable) null, 4, (Object) null);
        v vVarD = assetPackManager.d(assetPackName);
        if (vVarD != null) {
            if (successCallback != null) {
                successCallback.invoke(Boolean.TRUE);
            }
            assetPackLocations.put(assetPackName, vVarD);
            backgroundCancelRequested.remove(assetPackName);
            return;
        }
        ForegroundServiceStartGuard.Result resultEvaluate$default = ForegroundServiceStartGuard.evaluate$default(ForegroundServiceStartGuard.INSTANCE, 0L, 1, null);
        if (resultEvaluate$default.getAllowed()) {
            startFetch(assetPackManager, assetPackName, successCallback);
            return;
        }
        String reason = resultEvaluate$default.getReason();
        Map<String, String> diagnostics = resultEvaluate$default.getDiagnostics();
        StringBuilder sbU = e.u("Skipping fetch for ", assetPackName, ": ", reason, " (diagnostics: ");
        sbU.append(diagnostics);
        sbU.append("). Queued pending");
        Log.i$default(log, TAG, sbU.toString(), (Throwable) null, 4, (Object) null);
        fetchState.markPending(assetPackName);
        enqueueCallback(assetPackName, successCallback);
    }

    public final String getCachedAssetPackLocation(@NotNull String assetPackName) {
        int i7;
        Intrinsics.checkNotNullParameter(assetPackName, "assetPackName");
        v vVar = assetPackLocations.get(assetPackName);
        if (vVar == null || (i7 = vVar.f20204a) == 1 || i7 != 0) {
            return null;
        }
        String str = vVar.f20206c;
        if (str != null) {
            return str;
        }
        Log.w$default(Log.INSTANCE, TAG, g.e("Asset ", assetPackName, " has been fetched and is in storage,but doesn't have a valid storage path."), (Throwable) null, 4, (Object) null);
        return null;
    }

    public final void initialize(@NotNull Context applicationContext) {
        AssetPackManager assetPackManager;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        synchronized (sh.a.class) {
            assetPackManager = (AssetPackManager) ((f) m0.b(applicationContext).f6610d).a();
        }
        Intrinsics.checkNotNullExpressionValue(assetPackManager, "getInstance(...)");
        assetPackManager.a(assetPackStateUpdateListener);
        assetPackManagerWeakRef = new WeakReference<>(assetPackManager);
        AppLifecycle.INSTANCE.addListener(appLifecycleListener);
        registerBackgroundStartListener();
    }

    public final boolean isAssetDeliveryAvailable() {
        return assetDeliveryAvailable;
    }
}
