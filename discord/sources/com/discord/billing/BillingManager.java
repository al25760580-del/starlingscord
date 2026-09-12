package com.discord.billing;

import a5.e0;
import a5.n;
import a5.o;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.b1;
import androidx.lifecycle.q;
import ar.b0;
import ar.k0;
import ar.p;
import ar.u;
import ar.u1;
import ar.v0;
import ar.x1;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.discord.billing.react.events.serialization.SerializeMockProductDetailsKt;
import com.discord.billing.types.BillingFlowParams;
import com.discord.billing.types.ProductType;
import com.discord.billing.types.QueryProductDetailsParams;
import com.discord.crash_reporting.CrashReporting;
import com.discord.jank_stats.JankRecordStore;
import com.discord.metric_monitor.MetricEvent;
import com.discord.metric_monitor.MonitoringAgent;
import com.discord.misc.utilities.backoff.ExponentialBackoff;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import ga.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ã\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001o\b\u0000\u0018\u00002\u00020\u0001:\u0004vwxyBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\n\u0012*\u0010\u000e\u001a&\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0012J?\u0010\u001c\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u001c\u0010\u001dJu\u0010'\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b)\u0010*J7\u0010-\u001a\u00020\b2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%2\u0018\b\u0002\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060+j\u0002`,\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u00020\b2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\b2\u0006\u00105\u001a\u00020\r2\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u001a\u0010@\u001a\u00020?2\b\b\u0002\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ1\u0010I\u001a\u00020\b2\u0006\u0010C\u001a\u00020B2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010\u00142\b\b\u0002\u0010H\u001a\u00020\u0004H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010\u0012J\u000f\u0010L\u001a\u00020\u0004H\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\b2\u0006\u0010'\u001a\u00020F2\u0006\u0010H\u001a\u00020\u0004H\u0002¢\u0006\u0004\bN\u0010OJ\u0013\u0010P\u001a\u00020\u0004*\u00020BH\u0002¢\u0006\u0004\bP\u0010EJ,\u0010R\u001a\u00020\b*\u0012\u0012\b\u0012\u00060+j\u0002`,\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010Q\u001a\u00020\rH\u0082\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\bW\u0010XR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Y\u001a\u0004\bZ\u0010[R;\u0010\u000e\u001a&\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010_\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010UR \u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040c0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\bh\u0010gR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\r0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bs\u0010t\u0012\u0004\bu\u0010\u0012¨\u0006z"}, d2 = {"Lcom/discord/billing/BillingManager;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "isProdBuild", "Lkotlin/Function1;", "", "", "onConnectionUpdated", "Lkotlin/Function2;", "onPurchaseStateUpdated", "Lkotlin/Function5;", "", "onPurchaseUpdated", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "open", "()V", "close", "", "productIds", "Lcom/discord/billing/types/ProductType;", "productType", "Lcom/facebook/react/bridge/Promise;", "reactPromise", "Lcom/discord/billing/BillingManagerException;", "onError", "getProducts", "(Ljava/util/List;Lcom/discord/billing/types/ProductType;Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", "activity", "productId", "userId", "oldProductId", "purchaseToken", "offerId", "Lkotlin/Function0;", "onSuccess", "purchase", "(Landroid/app/Activity;Ljava/lang/String;Lcom/discord/billing/types/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "consumePurchase", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "loadPurchases", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getUserCountry", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "context", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lkotlinx/coroutines/CoroutineScope;", "metricName", "tags", "trackBillingMetric", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/discord/billing/BillingManager$ConnectionState;", "state", "updateConnectionState", "(Lcom/discord/billing/BillingManager$ConnectionState;)V", "", "timeoutMs", "Lcom/discord/billing/BillingManager$ClientReadyState;", "suspendUntilReady", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "isRetryableError", "(Lcom/android/billingclient/api/BillingResult;)Z", "Lcom/android/billingclient/api/Purchase;", "purchases", "isActivePurchase", "handlePurchases", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;Z)V", "reconnect", "isBillingClientReady", "()Z", "verifyPurchase", "(Lcom/android/billingclient/api/Purchase;Z)V", "isNotOk", "errorMessage", "invoke", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Z", "Lkotlin/jvm/functions/Function1;", "getOnConnectionUpdated", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "getOnPurchaseStateUpdated", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function5;", "getOnPurchaseUpdated", "()Lkotlin/jvm/functions/Function5;", "currentConnectionState", "Lcom/discord/billing/BillingManager$ConnectionState;", "mockBillingMode", "", "Lkotlinx/coroutines/CompletableDeferred;", "connectionReadyListeners", "Ljava/util/List;", "prodPackageName", "Ljava/lang/String;", "devPackageName", "", "allowedPackageNames", "Ljava/util/Set;", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "com/discord/billing/BillingManager$billingClientStateListener$1", "billingClientStateListener", "Lcom/discord/billing/BillingManager$billingClientStateListener$1;", "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "connectionBackoff", "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "getConnectionBackoff$annotations", "ConnectionState", "ClientReadyState", "ProductDetailsResponse", "BillingConfigResponse", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingManager.kt\ncom/discord/billing/BillingManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,787:1\n1869#2,2:788\n1869#2,2:790\n1869#2,2:793\n1869#2,2:795\n1#3:792\n*S KotlinDebug\n*F\n+ 1 BillingManager.kt\ncom/discord/billing/BillingManager\n*L\n264#1:788,2\n269#1:790,2\n325#1:793,2\n769#1:795,2\n*E\n"})
public final class BillingManager {

    @NotNull
    private final Set<String> allowedPackageNames;
    private BillingClient billingClient;

    @NotNull
    private final BillingManager$billingClientStateListener$1 billingClientStateListener;

    @NotNull
    private final ExponentialBackoff connectionBackoff;

    @NotNull
    private final List<CompletableDeferred> connectionReadyListeners;

    @NotNull
    private volatile ConnectionState currentConnectionState;

    @NotNull
    private final String devPackageName;
    private final boolean isProdBuild;
    private volatile boolean mockBillingMode;

    @NotNull
    private final Function1<Integer, Unit> onConnectionUpdated;

    @NotNull
    private final Function2<Integer, Boolean, Unit> onPurchaseStateUpdated;

    @NotNull
    private final Function5 onPurchaseUpdated;

    @NotNull
    private final String prodPackageName;

    @NotNull
    private final ReactApplicationContext reactContext;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/billing/BillingManager$BillingConfigResponse;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "billingConfig", "Lcom/android/billingclient/api/BillingConfig;", "<init>", "(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/BillingConfig;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getBillingConfig", "()Lcom/android/billingclient/api/BillingConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BillingConfigResponse {
        private final BillingConfig billingConfig;

        @NotNull
        private final BillingResult billingResult;

        public BillingConfigResponse(@NotNull BillingResult billingResult, BillingConfig billingConfig) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            this.billingResult = billingResult;
            this.billingConfig = billingConfig;
        }

        public static /* synthetic */ BillingConfigResponse copy$default(BillingConfigResponse billingConfigResponse, BillingResult billingResult, BillingConfig billingConfig, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                billingResult = billingConfigResponse.billingResult;
            }
            if ((i7 & 2) != 0) {
                billingConfig = billingConfigResponse.billingConfig;
            }
            return billingConfigResponse.copy(billingResult, billingConfig);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final BillingConfig getBillingConfig() {
            return this.billingConfig;
        }

        @NotNull
        public final BillingConfigResponse copy(@NotNull BillingResult billingResult, BillingConfig billingConfig) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            return new BillingConfigResponse(billingResult, billingConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingConfigResponse)) {
                return false;
            }
            BillingConfigResponse billingConfigResponse = (BillingConfigResponse) other;
            return Intrinsics.areEqual(this.billingResult, billingConfigResponse.billingResult) && Intrinsics.areEqual(this.billingConfig, billingConfigResponse.billingConfig);
        }

        public final BillingConfig getBillingConfig() {
            return this.billingConfig;
        }

        @NotNull
        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            int iHashCode = this.billingResult.hashCode() * 31;
            BillingConfig billingConfig = this.billingConfig;
            return iHashCode + (billingConfig == null ? 0 : billingConfig.hashCode());
        }

        @NotNull
        public String toString() {
            return "BillingConfigResponse(billingResult=" + this.billingResult + ", billingConfig=" + this.billingConfig + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/discord/billing/BillingManager$ClientReadyState;", "", "metricValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMetricValue", "()Ljava/lang/String;", "IMMEDIATE", "AFTER_WAIT", "TIMEOUT", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ClientReadyState {
        IMMEDIATE("immediate"),
        AFTER_WAIT("after_wait"),
        TIMEOUT("timeout");

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        private final String metricValue;

        ClientReadyState(String str) {
            this.metricValue = str;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getMetricValue() {
            return this.metricValue;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/discord/billing/BillingManager$ConnectionState;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DISCONNECTED", "CONNECTING", "CONNECTED", "ERROR", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ConnectionState {
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2),
        ERROR(3);

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());
        private final int value;

        ConnectionState(int i7) {
            this.value = i7;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/discord/billing/BillingManager$ProductDetailsResponse;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "productDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "<init>", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getProductDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsResponse {

        @NotNull
        private final BillingResult billingResult;
        private final List<ProductDetails> productDetails;

        public ProductDetailsResponse(@NotNull BillingResult billingResult, List<ProductDetails> list) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            this.billingResult = billingResult;
            this.productDetails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductDetailsResponse copy$default(ProductDetailsResponse productDetailsResponse, BillingResult billingResult, List list, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                billingResult = productDetailsResponse.billingResult;
            }
            if ((i7 & 2) != 0) {
                list = productDetailsResponse.productDetails;
            }
            return productDetailsResponse.copy(billingResult, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        public final List<ProductDetails> component2() {
            return this.productDetails;
        }

        @NotNull
        public final ProductDetailsResponse copy(@NotNull BillingResult billingResult, List<ProductDetails> productDetails) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            return new ProductDetailsResponse(billingResult, productDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductDetailsResponse)) {
                return false;
            }
            ProductDetailsResponse productDetailsResponse = (ProductDetailsResponse) other;
            return Intrinsics.areEqual(this.billingResult, productDetailsResponse.billingResult) && Intrinsics.areEqual(this.productDetails, productDetailsResponse.productDetails);
        }

        @NotNull
        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        public final List<ProductDetails> getProductDetails() {
            return this.productDetails;
        }

        public int hashCode() {
            int iHashCode = this.billingResult.hashCode() * 31;
            List<ProductDetails> list = this.productDetails;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "ProductDetailsResponse(billingResult=" + this.billingResult + ", productDetails=" + this.productDetails + ")";
        }
    }

    /* JADX INFO: renamed from: com.discord.billing.BillingManager$consumePurchase$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.BillingManager$consumePurchase$1", f = "BillingManager.kt", l = {597}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<BillingManagerException, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $purchaseToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super BillingManagerException, Unit> function1, String str, Function0<Unit> function0, Continuation continuation) {
            super(2, continuation);
            this.$onError = function1;
            this.$purchaseToken = str;
            this.$onSuccess = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(BillingManager billingManager, Function1 function1, Function0 function0, BillingResult billingResult, String str) {
            Intrinsics.checkNotNull(billingResult);
            if (billingManager.isNotOk(billingResult)) {
                function1.invoke(BillingManagerException.INSTANCE.fromBillingResult(billingResult.f3788a));
            } else {
                function0.invoke();
            }
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return BillingManager.this.new AnonymousClass1(this.$onError, this.$purchaseToken, this.$onSuccess, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005e A[Catch: Exception -> 0x006b, CancellationException -> 0x006e, TryCatch #6 {CancellationException -> 0x006e, Exception -> 0x006b, blocks: (B:19:0x0037, B:21:0x005e, B:27:0x0071, B:29:0x0075, B:31:0x0089, B:32:0x008f, B:33:0x009e, B:34:0x00a5, B:16:0x0030), top: B:43:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0071 A[Catch: Exception -> 0x006b, CancellationException -> 0x006e, TryCatch #6 {CancellationException -> 0x006e, Exception -> 0x006b, blocks: (B:19:0x0037, B:21:0x005e, B:27:0x0071, B:29:0x0075, B:31:0x0089, B:32:0x008f, B:33:0x009e, B:34:0x00a5, B:16:0x0030), top: B:43:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0075 A[Catch: Exception -> 0x006b, CancellationException -> 0x006e, TryCatch #6 {CancellationException -> 0x006e, Exception -> 0x006b, blocks: (B:19:0x0037, B:21:0x005e, B:27:0x0071, B:29:0x0075, B:31:0x0089, B:32:0x008f, B:33:0x009e, B:34:0x00a5, B:16:0x0030), top: B:43:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: Exception -> 0x006b, CancellationException -> 0x006e, TryCatch #6 {CancellationException -> 0x006e, Exception -> 0x006b, blocks: (B:19:0x0037, B:21:0x005e, B:27:0x0071, B:29:0x0075, B:31:0x0089, B:32:0x008f, B:33:0x009e, B:34:0x00a5, B:16:0x0030), top: B:43:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x009e A[Catch: Exception -> 0x006b, CancellationException -> 0x006e, TryCatch #6 {CancellationException -> 0x006e, Exception -> 0x006b, blocks: (B:19:0x0037, B:21:0x005e, B:27:0x0071, B:29:0x0075, B:31:0x0089, B:32:0x008f, B:33:0x009e, B:34:0x00a5, B:16:0x0030), top: B:43:0x0030 }] */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Exception exc;
            ClientReadyState clientReadyState;
            String str;
            BillingClient billingClient;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                try {
                    BillingManager billingManager = BillingManager.this;
                    this.label = 1;
                    anonymousClass1 = this;
                    try {
                        obj = BillingManager.suspendUntilReady$default(billingManager, 0L, anonymousClass1, 1, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                        clientReadyState = (ClientReadyState) obj;
                        BillingManager.this.trackBillingMetric("operation", d0.g("method:consume_purchase", "client_ready:" + clientReadyState.getMetricValue()));
                        if (clientReadyState == ClientReadyState.TIMEOUT) {
                            anonymousClass1.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                            return Unit.f14616a;
                        }
                        str = anonymousClass1.$purchaseToken;
                        if (str != null) {
                            throw new IllegalArgumentException("Purchase token must be set");
                        }
                        a5.h hVar = new a5.h();
                        hVar.f189b = str;
                        Intrinsics.checkNotNullExpressionValue(hVar, "build(...)");
                        billingClient = BillingManager.this.billingClient;
                        if (billingClient == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                            billingClient = null;
                        }
                        billingClient.a(hVar, new a(BillingManager.this, anonymousClass1.$onError, anonymousClass1.$onSuccess));
                    } catch (CancellationException e10) {
                        e = e10;
                        throw e;
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        CrashReporting.captureException$default(CrashReporting.INSTANCE, exc, false, 2, null);
                        anonymousClass1.$onError.invoke(BillingManagerException.INSTANCE.wrap(exc, "consumePurchase"));
                    }
                } catch (CancellationException e12) {
                    e = e12;
                } catch (Exception e13) {
                    e = e13;
                    anonymousClass1 = this;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ib.a.L(obj);
                    anonymousClass1 = this;
                    clientReadyState = (ClientReadyState) obj;
                    BillingManager.this.trackBillingMetric("operation", d0.g("method:consume_purchase", "client_ready:" + clientReadyState.getMetricValue()));
                    if (clientReadyState == ClientReadyState.TIMEOUT) {
                        anonymousClass1.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                        return Unit.f14616a;
                    }
                    str = anonymousClass1.$purchaseToken;
                    if (str != null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    a5.h hVar2 = new a5.h();
                    hVar2.f189b = str;
                    Intrinsics.checkNotNullExpressionValue(hVar2, "build(...)");
                    billingClient = BillingManager.this.billingClient;
                    if (billingClient == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                        billingClient = null;
                    }
                    billingClient.a(hVar2, new a(BillingManager.this, anonymousClass1.$onError, anonymousClass1.$onSuccess));
                } catch (CancellationException e14) {
                    throw e14;
                } catch (Exception e15) {
                    exc = e15;
                    anonymousClass1 = this;
                    CrashReporting.captureException$default(CrashReporting.INSTANCE, exc, false, 2, null);
                    anonymousClass1.$onError.invoke(BillingManagerException.INSTANCE.wrap(exc, "consumePurchase"));
                }
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.billing.BillingManager$getProducts$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.BillingManager$getProducts$1", f = "BillingManager.kt", l = {411, 424}, m = "invokeSuspend")
    public static final class C01051 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ ExponentialBackoff $getProductsBackoff;
        final /* synthetic */ Function1<BillingManagerException, Unit> $onError;
        final /* synthetic */ List<String> $productIds;
        final /* synthetic */ ProductType $productType;
        final /* synthetic */ Promise $reactPromise;
        int label;

        /* JADX INFO: renamed from: com.discord.billing.BillingManager$getProducts$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/discord/billing/BillingManager$ProductDetailsResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.billing.BillingManager$getProducts$1$1", f = "BillingManager.kt", l = {448}, m = "invokeSuspend")
        public static final class C00171 extends h implements Function1<Continuation, Object> {
            final /* synthetic */ List<String> $productIds;
            final /* synthetic */ ProductType $productType;
            int label;
            final /* synthetic */ BillingManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00171(BillingManager billingManager, ProductType productType, List<String> list, Continuation continuation) {
                super(1, continuation);
                this.this$0 = billingManager;
                this.$productType = productType;
                this.$productIds = list;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(CompletableDeferred completableDeferred, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                Intrinsics.checkNotNull(billingResult);
                completableDeferred.U(new ProductDetailsResponse(billingResult, queryProductDetailsResult.f3822a));
            }

            @Override // xn.a
            public final Continuation create(Continuation continuation) {
                return new C00171(this.this$0, this.$productType, this.$productIds, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                ib.a.L(obj);
                p pVarA = b0.a();
                b bVar = new b(3, pVarA);
                BillingClient billingClient = this.this$0.billingClient;
                if (billingClient == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                    billingClient = null;
                }
                billingClient.f(QueryProductDetailsParams.INSTANCE.create(ProductType.valueOf(this.$productType.name()), this.$productIds), bVar);
                this.label = 1;
                Object objW = pVarA.w(this);
                return objW == aVar ? aVar : objW;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C00171) create(continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX INFO: renamed from: com.discord.billing.BillingManager$getProducts$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "productDetailsResponse", "Lcom/discord/billing/BillingManager$ProductDetailsResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.billing.BillingManager$getProducts$1$2", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends h implements Function2<ProductDetailsResponse, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BillingManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BillingManager billingManager, Continuation continuation) {
                super(2, continuation);
                this.this$0 = billingManager;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ProductDetailsResponse productDetailsResponse, Continuation continuation) {
                return ((AnonymousClass2) create(productDetailsResponse, continuation)).invokeSuspend(Unit.f14616a);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                return Boolean.valueOf(this.this$0.isRetryableError(((ProductDetailsResponse) this.L$0).getBillingResult()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01051(Function1<? super BillingManagerException, Unit> function1, ExponentialBackoff exponentialBackoff, Promise promise, ProductType productType, List<String> list, Continuation continuation) {
            super(2, continuation);
            this.$onError = function1;
            this.$getProductsBackoff = exponentialBackoff;
            this.$reactPromise = promise;
            this.$productType = productType;
            this.$productIds = list;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return BillingManager.this.new C01051(this.$onError, this.$getProductsBackoff, this.$reactPromise, this.$productType, this.$productIds, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
        
            if (r0 == r8) goto L28;
         */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.billing.BillingManager.C01051.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01051) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.billing.BillingManager$getUserCountry$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.BillingManager$getUserCountry$1", f = "BillingManager.kt", l = {692, 705}, m = "invokeSuspend")
    public static final class C01061 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ ExponentialBackoff $getUserCountryBackoff;
        final /* synthetic */ Function1<BillingManagerException, Unit> $onError;
        final /* synthetic */ Function1<String, Unit> $onSuccess;
        int label;

        /* JADX INFO: renamed from: com.discord.billing.BillingManager$getUserCountry$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/discord/billing/BillingManager$BillingConfigResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.billing.BillingManager$getUserCountry$1$1", f = "BillingManager.kt", l = {728}, m = "invokeSuspend")
        public static final class C00181 extends h implements Function1<Continuation, Object> {
            int label;
            final /* synthetic */ BillingManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00181(BillingManager billingManager, Continuation continuation) {
                super(1, continuation);
                this.this$0 = billingManager;
            }

            @Override // xn.a
            public final Continuation create(Continuation continuation) {
                return new C00181(this.this$0, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [com.discord.billing.BillingManager$getUserCountry$1$1$1] */
            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                BillingClient billingClient;
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                ib.a.L(obj);
                final p pVarA = b0.a();
                Intrinsics.checkNotNullExpressionValue(new k(), "build(...)");
                BillingClient billingClient2 = this.this$0.billingClient;
                if (billingClient2 == null) {
                    billingClient = billingClient2;
                    Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                    billingClient = 0;
                }
                billingClient = billingClient2;
                billingClient.c(new a5.d() { // from class: com.discord.billing.BillingManager.getUserCountry.1.1.1
                    @Override // a5.d
                    public void onBillingConfigResponse(BillingResult billingResult, BillingConfig billingConfig) {
                        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                        pVarA.U(new BillingConfigResponse(billingResult, billingConfig));
                    }
                });
                this.label = 1;
                Object objW = pVarA.w(this);
                return objW == aVar ? aVar : objW;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C00181) create(continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX INFO: renamed from: com.discord.billing.BillingManager$getUserCountry$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lcom/discord/billing/BillingManager$BillingConfigResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.billing.BillingManager$getUserCountry$1$2", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends h implements Function2<BillingConfigResponse, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BillingManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BillingManager billingManager, Continuation continuation) {
                super(2, continuation);
                this.this$0 = billingManager;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BillingConfigResponse billingConfigResponse, Continuation continuation) {
                return ((AnonymousClass2) create(billingConfigResponse, continuation)).invokeSuspend(Unit.f14616a);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                return Boolean.valueOf(this.this$0.isRetryableError(((BillingConfigResponse) this.L$0).getBillingResult()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01061(Function1<? super BillingManagerException, Unit> function1, ExponentialBackoff exponentialBackoff, Function1<? super String, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$onError = function1;
            this.$getUserCountryBackoff = exponentialBackoff;
            this.$onSuccess = function2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return BillingManager.this.new C01061(this.$onError, this.$getUserCountryBackoff, this.$onSuccess, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006b A[Catch: Exception -> 0x0078, MaxAttemptsExceededException -> 0x007c, CancellationException -> 0x0080, TryCatch #6 {MaxAttemptsExceededException -> 0x007c, CancellationException -> 0x0080, Exception -> 0x0078, blocks: (B:37:0x009d, B:39:0x00a9, B:40:0x00b6, B:42:0x00be, B:43:0x00cc, B:24:0x0044, B:26:0x006b, B:34:0x0084, B:21:0x003d), top: B:56:0x003d }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0084 A[Catch: Exception -> 0x0078, MaxAttemptsExceededException -> 0x007c, CancellationException -> 0x0080, TryCatch #6 {MaxAttemptsExceededException -> 0x007c, CancellationException -> 0x0080, Exception -> 0x0078, blocks: (B:37:0x009d, B:39:0x00a9, B:40:0x00b6, B:42:0x00be, B:43:0x00cc, B:24:0x0044, B:26:0x006b, B:34:0x0084, B:21:0x003d), top: B:56:0x003d }] */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        
            if (r13 == r1) goto L36;
         */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.billing.BillingManager.C01061.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01061) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.billing.BillingManager$loadPurchases$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.BillingManager$loadPurchases$3", f = "BillingManager.kt", l = {639}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<Exception, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super Exception, Unit> function1, Function0<Unit> function0, Continuation continuation) {
            super(2, continuation);
            this.$onError = function1;
            this.$onSuccess = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(BillingManager billingManager, BillingResult billingResult, List list) {
            Intrinsics.checkNotNull(billingResult);
            billingManager.handlePurchases(billingResult, list, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(BillingManager billingManager, BillingResult billingResult, List list) {
            Intrinsics.checkNotNull(billingResult);
            billingManager.handlePurchases(billingResult, list, false);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return BillingManager.this.new AnonymousClass3(this.$onError, this.$onSuccess, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005d A[Catch: Exception -> 0x006a, CancellationException -> 0x006d, TryCatch #6 {CancellationException -> 0x006d, Exception -> 0x006a, blocks: (B:19:0x0036, B:21:0x005d, B:27:0x0070, B:30:0x007a, B:31:0x007e, B:33:0x00a0, B:34:0x00a4, B:16:0x002f), top: B:44:0x002f }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: Exception -> 0x006a, CancellationException -> 0x006d, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x006d, Exception -> 0x006a, blocks: (B:19:0x0036, B:21:0x005d, B:27:0x0070, B:30:0x007a, B:31:0x007e, B:33:0x00a0, B:34:0x00a4, B:16:0x002f), top: B:44:0x002f }] */
        /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: Exception -> 0x006a, CancellationException -> 0x006d, TRY_ENTER, TryCatch #6 {CancellationException -> 0x006d, Exception -> 0x006a, blocks: (B:19:0x0036, B:21:0x005d, B:27:0x0070, B:30:0x007a, B:31:0x007e, B:33:0x00a0, B:34:0x00a4, B:16:0x002f), top: B:44:0x002f }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00a0 A[Catch: Exception -> 0x006a, CancellationException -> 0x006d, TryCatch #6 {CancellationException -> 0x006d, Exception -> 0x006a, blocks: (B:19:0x0036, B:21:0x005d, B:27:0x0070, B:30:0x007a, B:31:0x007e, B:33:0x00a0, B:34:0x00a4, B:16:0x002f), top: B:44:0x002f }] */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass3 anonymousClass3;
            Exception exc;
            ClientReadyState clientReadyState;
            BillingClient billingClient;
            BillingClient billingClient2;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                try {
                    BillingManager billingManager = BillingManager.this;
                    this.label = 1;
                    anonymousClass3 = this;
                    try {
                        obj = BillingManager.suspendUntilReady$default(billingManager, 0L, anonymousClass3, 1, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                        clientReadyState = (ClientReadyState) obj;
                        BillingManager.this.trackBillingMetric("operation", d0.g("method:load_purchases", "client_ready:" + clientReadyState.getMetricValue()));
                        if (clientReadyState == ClientReadyState.TIMEOUT) {
                            anonymousClass3.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                            return Unit.f14616a;
                        }
                        billingClient = BillingManager.this.billingClient;
                        if (billingClient == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                            billingClient = null;
                        }
                        n nVar = new n();
                        nVar.f232a = "subs";
                        billingClient.g(new o(nVar), new b(0, BillingManager.this));
                        billingClient2 = BillingManager.this.billingClient;
                        if (billingClient2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                            billingClient2 = null;
                        }
                        n nVar2 = new n();
                        nVar2.f232a = "inapp";
                        billingClient2.g(new o(nVar2), new b(1, BillingManager.this));
                        anonymousClass3.$onSuccess.invoke();
                    } catch (CancellationException e10) {
                        e = e10;
                        throw e;
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        CrashReporting.captureException$default(CrashReporting.INSTANCE, exc, false, 2, null);
                        anonymousClass3.$onError.invoke(exc);
                    }
                } catch (CancellationException e12) {
                    e = e12;
                } catch (Exception e13) {
                    e = e13;
                    anonymousClass3 = this;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ib.a.L(obj);
                    anonymousClass3 = this;
                    clientReadyState = (ClientReadyState) obj;
                    BillingManager.this.trackBillingMetric("operation", d0.g("method:load_purchases", "client_ready:" + clientReadyState.getMetricValue()));
                    if (clientReadyState == ClientReadyState.TIMEOUT) {
                        anonymousClass3.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                        return Unit.f14616a;
                    }
                    billingClient = BillingManager.this.billingClient;
                    if (billingClient == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                        billingClient = null;
                    }
                    n nVar3 = new n();
                    nVar3.f232a = "subs";
                    billingClient.g(new o(nVar3), new b(0, BillingManager.this));
                    billingClient2 = BillingManager.this.billingClient;
                    if (billingClient2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                        billingClient2 = null;
                    }
                    n nVar4 = new n();
                    nVar4.f232a = "inapp";
                    billingClient2.g(new o(nVar4), new b(1, BillingManager.this));
                    anonymousClass3.$onSuccess.invoke();
                } catch (CancellationException e14) {
                    throw e14;
                } catch (Exception e15) {
                    exc = e15;
                    anonymousClass3 = this;
                    CrashReporting.captureException$default(CrashReporting.INSTANCE, exc, false, 2, null);
                    anonymousClass3.$onError.invoke(exc);
                }
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.billing.BillingManager$purchase$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.BillingManager$purchase$1", f = "BillingManager.kt", l = {513}, m = "invokeSuspend")
    public static final class C01071 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $offerId;
        final /* synthetic */ String $oldProductId;
        final /* synthetic */ Function1<BillingManagerException, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $productId;
        final /* synthetic */ ProductType $productType;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01071(Function1<? super BillingManagerException, Unit> function1, ProductType productType, String str, String str2, String str3, String str4, String str5, Activity activity, Function0<Unit> function0, Continuation continuation) {
            super(2, continuation);
            this.$onError = function1;
            this.$productType = productType;
            this.$productId = str;
            this.$oldProductId = str2;
            this.$purchaseToken = str3;
            this.$userId = str4;
            this.$offerId = str5;
            this.$activity = activity;
            this.$onSuccess = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(BillingManager billingManager, Function1 function1, String str, String str2, String str3, String str4, String str5, Activity activity, Function0 function0, Ref.BooleanRef booleanRef, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
            synchronized (billingManager) {
                if (booleanRef.element) {
                    return;
                }
                booleanRef.element = true;
                Unit unit = Unit.f14616a;
                Intrinsics.checkNotNull(billingResult);
                if (billingManager.isNotOk(billingResult)) {
                    function1.invoke(BillingManagerException.INSTANCE.fromBillingResult(billingResult.f3788a));
                    return;
                }
                try {
                    BillingFlowParams billingFlowParams = BillingFlowParams.INSTANCE;
                    List<ProductDetails> list = queryProductDetailsResult.f3822a;
                    Intrinsics.checkNotNullExpressionValue(list, "getProductDetailsList(...)");
                    com.android.billingclient.api.BillingFlowParams billingFlowParamsCreateWithProductDetails = billingFlowParams.createWithProductDetails(list, str, str2, str3, str4, str5);
                    if (billingFlowParamsCreateWithProductDetails == null) {
                        function1.invoke(new BillingManagerException.BillingException("purchase failed to create BillingFlowParams"));
                        return;
                    }
                    if (!activity.isFinishing() && !activity.isDestroyed()) {
                        BillingClient billingClient = billingManager.billingClient;
                        if (billingClient == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                            billingClient = null;
                        }
                        billingClient.e(activity, billingFlowParamsCreateWithProductDetails);
                        function0.invoke();
                        return;
                    }
                    function1.invoke(new BillingManagerException.BillingException("Activity is no longer valid"));
                } catch (AssertionError e10) {
                    String message = e10.getMessage();
                    Intrinsics.checkNotNull(message);
                    function1.invoke(new BillingManagerException.BillingException("purchase AssertionError: " + message));
                }
            }
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return BillingManager.this.new C01071(this.$onError, this.$productType, this.$productId, this.$oldProductId, this.$purchaseToken, this.$userId, this.$offerId, this.$activity, this.$onSuccess, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Object objSuspendUntilReady$default;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    BillingManager billingManager = BillingManager.this;
                    this.label = 1;
                    objSuspendUntilReady$default = BillingManager.suspendUntilReady$default(billingManager, 0L, this, 1, null);
                    if (objSuspendUntilReady$default == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    objSuspendUntilReady$default = obj;
                }
                ClientReadyState clientReadyState = (ClientReadyState) objSuspendUntilReady$default;
                BillingManager.this.trackBillingMetric("operation", d0.g("method:purchase", "client_ready:" + clientReadyState.getMetricValue()));
                if (clientReadyState == ClientReadyState.TIMEOUT) {
                    this.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                    return Unit.f14616a;
                }
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                BillingClient billingClient = BillingManager.this.billingClient;
                if (billingClient == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                    billingClient = null;
                }
                QueryProductDetailsParams queryProductDetailsParams = QueryProductDetailsParams.INSTANCE;
                ProductType productType = this.$productType;
                String[] elements = {this.$productId, this.$oldProductId};
                Intrinsics.checkNotNullParameter(elements, "elements");
                com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParamsCreate = queryProductDetailsParams.create(productType, y.r(elements));
                final BillingManager billingManager2 = BillingManager.this;
                final Function1<BillingManagerException, Unit> function1 = this.$onError;
                final String str = this.$productId;
                final String str2 = this.$oldProductId;
                final String str3 = this.$purchaseToken;
                final String str4 = this.$userId;
                final String str5 = this.$offerId;
                final Activity activity = this.$activity;
                final Function0<Unit> function0 = this.$onSuccess;
                billingClient.f(queryProductDetailsParamsCreate, new a5.k() { // from class: com.discord.billing.c
                    @Override // a5.k
                    public final void a(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                        BillingManager.C01071.invokeSuspend$lambda$1(billingManager2, function1, str, str2, str3, str4, str5, activity, function0, booleanRef, billingResult, queryProductDetailsResult);
                    }
                });
                return Unit.f14616a;
            } catch (CancellationException e10) {
                throw e10;
            } catch (Exception e11) {
                CrashReporting.captureException$default(CrashReporting.INSTANCE, e11, false, 2, null);
                this.$onError.invoke(BillingManagerException.INSTANCE.wrap(e11, "purchase"));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01071) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.billing.BillingManager$reconnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.BillingManager$reconnect$1", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
    public static final class C01081 extends h implements Function1<Continuation, Object> {
        int label;

        public C01081(Continuation continuation) {
            super(1, continuation);
        }

        @Override // xn.a
        public final Continuation create(Continuation continuation) {
            return BillingManager.this.new C01081(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            BillingClient billingClient = BillingManager.this.billingClient;
            if (billingClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                billingClient = null;
            }
            billingClient.h(BillingManager.this.billingClientStateListener);
            BillingManager.this.updateConnectionState(ConnectionState.CONNECTING);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((C01081) create(continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.billing.BillingManager$suspendUntilReady$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.BillingManager", f = "BillingManager.kt", l = {297}, m = "suspendUntilReady")
    public static final class C01091 extends xn.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01091(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BillingManager.this.suspendUntilReady(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.discord.billing.BillingManager$suspendUntilReady$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/discord/billing/BillingManager$ClientReadyState;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.billing.BillingManager$suspendUntilReady$3", f = "BillingManager.kt", l = {298}, m = "invokeSuspend")
    public static final class C01103 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ CompletableDeferred $deferred;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01103(CompletableDeferred completableDeferred, Continuation continuation) {
            super(2, continuation);
            this.$deferred = completableDeferred;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01103(this.$deferred, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                CompletableDeferred completableDeferred = this.$deferred;
                this.label = 1;
                obj = completableDeferred.z(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return ((Boolean) obj).booleanValue() ? ClientReadyState.AFTER_WAIT : ClientReadyState.TIMEOUT;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01103) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.discord.billing.BillingManager$billingClientStateListener$1] */
    public BillingManager(@NotNull ReactApplicationContext reactContext, boolean z5, @NotNull Function1<? super Integer, Unit> onConnectionUpdated, @NotNull Function2<? super Integer, ? super Boolean, Unit> onPurchaseStateUpdated, @NotNull Function5 onPurchaseUpdated) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(onConnectionUpdated, "onConnectionUpdated");
        Intrinsics.checkNotNullParameter(onPurchaseStateUpdated, "onPurchaseStateUpdated");
        Intrinsics.checkNotNullParameter(onPurchaseUpdated, "onPurchaseUpdated");
        this.reactContext = reactContext;
        this.isProdBuild = z5;
        this.onConnectionUpdated = onConnectionUpdated;
        this.onPurchaseStateUpdated = onPurchaseStateUpdated;
        this.onPurchaseUpdated = onPurchaseUpdated;
        this.currentConnectionState = ConnectionState.DISCONNECTED;
        this.connectionReadyListeners = new ArrayList();
        this.prodPackageName = com.discord.BuildConfig.APPLICATION_ID;
        this.devPackageName = "com.discord.debug.billingtesting";
        String[] elements = {com.discord.BuildConfig.APPLICATION_ID, "com.discord.debug.billingtesting"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.allowedPackageNames = y.J(elements);
        this.billingClientStateListener = new a5.c() { // from class: com.discord.billing.BillingManager$billingClientStateListener$1
            @Override // a5.c
            public void onBillingServiceDisconnected() {
                if (this.this$0.mockBillingMode) {
                    this.this$0.updateConnectionState(BillingManager.ConnectionState.CONNECTED);
                    return;
                }
                this.this$0.updateConnectionState(BillingManager.ConnectionState.DISCONNECTED);
                BillingClient billingClient = this.this$0.billingClient;
                if (billingClient == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                    billingClient = null;
                }
                if (billingClient.d()) {
                    return;
                }
                this.this$0.reconnect();
            }

            @Override // a5.c
            public void onBillingSetupFinished(BillingResult billingResult) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (!this.this$0.isNotOk(billingResult)) {
                    this.this$0.mockBillingMode = false;
                    this.this$0.connectionBackoff.succeed();
                    this.this$0.updateConnectionState(BillingManager.ConnectionState.CONNECTED);
                    BillingManager.loadPurchases$default(this.this$0, null, null, 3, null);
                    return;
                }
                if (this.this$0.allowedPackageNames.contains(this.this$0.reactContext.getPackageName()) || this.this$0.isRetryableError(billingResult)) {
                    this.this$0.reconnect();
                } else {
                    this.this$0.mockBillingMode = true;
                    this.this$0.updateConnectionState(BillingManager.ConnectionState.CONNECTED);
                }
            }
        };
        this.connectionBackoff = new ExponentialBackoff(v0.f2972d, 1000L, LogThrottleSingleton.RATE_LIMIT_FIVE_MINUTES, 10);
    }

    private static /* synthetic */ void getConnectionBackoff$annotations() {
    }

    private final CoroutineScope getCoroutineScope(ReactApplicationContext context) {
        ComponentCallbacks2 currentActivity = context.getCurrentActivity();
        LifecycleOwner lifecycleOwner = currentActivity instanceof LifecycleOwner ? (LifecycleOwner) currentActivity : null;
        q qVarC = lifecycleOwner != null ? b1.c(lifecycleOwner) : null;
        return qVarC != null ? qVarC : v0.f2972d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePurchases(BillingResult billingResult, List<? extends Purchase> purchases, boolean isActivePurchase) {
        this.onPurchaseStateUpdated.invoke(Integer.valueOf(billingResult.f3788a), Boolean.valueOf(isActivePurchase));
        if (purchases == null || purchases.isEmpty()) {
            return;
        }
        Iterator<T> it = purchases.iterator();
        while (it.hasNext()) {
            verifyPurchase((Purchase) it.next(), isActivePurchase);
        }
    }

    public static /* synthetic */ void handlePurchases$default(BillingManager billingManager, BillingResult billingResult, List list, boolean z5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z5 = true;
        }
        billingManager.handlePurchases(billingResult, list, z5);
    }

    private final void invoke(Function1<? super Exception, Unit> function1, String str) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        function1.invoke(new IllegalStateException(str));
    }

    private final boolean isBillingClientReady() {
        BillingClient billingClient = this.billingClient;
        return billingClient != null && billingClient.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotOk(BillingResult billingResult) {
        return billingResult.f3788a != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRetryableError(BillingResult billingResult) {
        if (!isNotOk(billingResult)) {
            return false;
        }
        Integer[] elements = {6, -1, 2, 12};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return y.J(elements).contains(Integer.valueOf(billingResult.f3788a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadPurchases$default(BillingManager billingManager, Function0 function0, Function1 function1, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            function0 = new a7.a(5);
        }
        if ((i7 & 2) != 0) {
            function1 = new u(8);
        }
        billingManager.loadPurchases(function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadPurchases$lambda$8(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    public static /* synthetic */ void purchase$default(BillingManager billingManager, Activity activity, String str, ProductType productType, String str2, String str3, String str4, String str5, Function0 function0, Function1 function1, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            str4 = null;
        }
        if ((i7 & 64) != 0) {
            str5 = null;
        }
        billingManager.purchase(activity, str, productType, str2, str3, str4, str5, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reconnect() {
        try {
            this.connectionBackoff.fail(new C01081(null));
        } catch (Exception unused) {
            updateConnectionState(ConnectionState.ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:64:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object suspendUntilReady(long j, Continuation continuation) {
        C01091 c01091;
        CompletableDeferred completableDeferred;
        if (continuation instanceof C01091) {
            c01091 = (C01091) continuation;
            int i7 = c01091.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c01091.label = i7 - Integer.MIN_VALUE;
            } else {
                c01091 = new C01091(continuation);
            }
        } else {
            c01091 = new C01091(continuation);
        }
        Object obj = c01091.result;
        wn.a aVar = wn.a.f22354d;
        int i10 = c01091.label;
        if (i10 == 0) {
            ib.a.L(obj);
            if (isBillingClientReady()) {
                return ClientReadyState.IMMEDIATE;
            }
            if (this.currentConnectionState == ConnectionState.DISCONNECTED || this.currentConnectionState == ConnectionState.ERROR) {
                reconnect();
            }
            p pVarA = b0.a();
            synchronized (this.connectionReadyListeners) {
                if (this.currentConnectionState == ConnectionState.CONNECTED) {
                    return ClientReadyState.IMMEDIATE;
                }
                if (this.currentConnectionState == ConnectionState.ERROR) {
                    return ClientReadyState.TIMEOUT;
                }
                this.connectionReadyListeners.add(pVarA);
                try {
                    C01103 c01103 = new C01103(pVarA, null);
                    c01091.L$0 = pVarA;
                    c01091.label = 1;
                    Object objB = x1.b(j, c01103, c01091);
                    if (objB == aVar) {
                        return aVar;
                    }
                    obj = objB;
                    completableDeferred = pVarA;
                } catch (u1 unused) {
                    completableDeferred = pVarA;
                    synchronized (this.connectionReadyListeners) {
                        this.connectionReadyListeners.remove(completableDeferred);
                        return ClientReadyState.TIMEOUT;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableDeferred = (CompletableDeferred) c01091.L$0;
            try {
                ib.a.L(obj);
            } catch (u1 unused2) {
                synchronized (this.connectionReadyListeners) {
                    this.connectionReadyListeners.remove(completableDeferred);
                }
                return ClientReadyState.TIMEOUT;
            }
        }
        return (ClientReadyState) obj;
    }

    public static /* synthetic */ Object suspendUntilReady$default(BillingManager billingManager, long j, Continuation continuation, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = JankRecordStore.FIRST_FLUSH_DELAY_MS;
        }
        return billingManager.suspendUntilReady(j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackBillingMetric(String metricName, List<String> tags) {
        try {
            MonitoringAgent.INSTANCE.increment(new MetricEvent("billing_manager." + metricName, tags));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void trackBillingMetric$default(BillingManager billingManager, String str, List list, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            list = n0.f14659d;
        }
        billingManager.trackBillingMetric(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConnectionState(ConnectionState state) {
        this.currentConnectionState = state;
        this.onConnectionUpdated.invoke(Integer.valueOf(state.getValue()));
        if (state == ConnectionState.CONNECTED) {
            synchronized (this.connectionReadyListeners) {
                try {
                    Iterator<T> it = this.connectionReadyListeners.iterator();
                    while (it.hasNext()) {
                        ((CompletableDeferred) it.next()).U(Boolean.TRUE);
                    }
                    this.connectionReadyListeners.clear();
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (state == ConnectionState.ERROR) {
            synchronized (this.connectionReadyListeners) {
                try {
                    Iterator<T> it2 = this.connectionReadyListeners.iterator();
                    while (it2.hasNext()) {
                        ((CompletableDeferred) it2.next()).U(Boolean.FALSE);
                    }
                    this.connectionReadyListeners.clear();
                    Unit unit2 = Unit.f14616a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private final void verifyPurchase(Purchase purchase, boolean isActivePurchase) {
        JSONObject jSONObject = purchase.f3820c;
        JSONObject jSONObject2 = purchase.f3820c;
        boolean z5 = (jSONObject.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 1 && !jSONObject2.optBoolean("acknowledged", true);
        boolean z6 = jSONObject2.optInt("purchaseState", 1) == 4;
        if ((z5 || z6) && this.allowedPackageNames.contains(jSONObject2.optString("packageName"))) {
            ArrayList<String> arrayList = new ArrayList();
            if (jSONObject2.has("productIds")) {
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("productIds");
                if (jSONArrayOptJSONArray != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                        arrayList.add(jSONArrayOptJSONArray.optString(i7));
                    }
                }
            } else if (jSONObject2.has("productId")) {
                arrayList.add(jSONObject2.optString("productId"));
            }
            Intrinsics.checkNotNullExpressionValue(arrayList, "getProducts(...)");
            for (String str : arrayList) {
                ExternalPurchaseIdReporter externalPurchaseIdReporter = ExternalPurchaseIdReporter.INSTANCE;
                String strOptString = jSONObject2.optString("token", jSONObject2.optString("purchaseToken"));
                Intrinsics.checkNotNullExpressionValue(strOptString, "getPurchaseToken(...)");
                Intrinsics.checkNotNull(str);
                externalPurchaseIdReporter.report(strOptString, str);
                Function5 function5 = this.onPurchaseUpdated;
                String strOptString2 = jSONObject2.optString("token", jSONObject2.optString("purchaseToken"));
                Intrinsics.checkNotNullExpressionValue(strOptString2, "getPurchaseToken(...)");
                String strOptString3 = jSONObject2.optString("packageName");
                Intrinsics.checkNotNullExpressionValue(strOptString3, "getPackageName(...)");
                function5.invoke(strOptString2, strOptString3, str, Integer.valueOf(jSONObject2.optInt("purchaseState", 1) != 4 ? 1 : 2), Boolean.valueOf(isActivePurchase));
            }
        }
    }

    public final void close() {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            updateConnectionState(ConnectionState.ERROR);
            return;
        }
        billingClient.b();
        this.connectionBackoff.cancel();
        updateConnectionState(ConnectionState.DISCONNECTED);
    }

    public final void consumePurchase(@NotNull String purchaseToken, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super BillingManagerException, Unit> onError) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        b0.t(getCoroutineScope(this.reactContext), k0.f2938a, new AnonymousClass1(onError, purchaseToken, onSuccess, null), 2);
    }

    @NotNull
    public final Function1<Integer, Unit> getOnConnectionUpdated() {
        return this.onConnectionUpdated;
    }

    @NotNull
    public final Function2<Integer, Boolean, Unit> getOnPurchaseStateUpdated() {
        return this.onPurchaseStateUpdated;
    }

    @NotNull
    public final Function5 getOnPurchaseUpdated() {
        return this.onPurchaseUpdated;
    }

    public final void getProducts(@NotNull List<String> productIds, @NotNull ProductType productType, @NotNull Promise reactPromise, @NotNull Function1<? super BillingManagerException, Unit> onError) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(reactPromise, "reactPromise");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (this.mockBillingMode) {
            reactPromise.resolve(SerializeMockProductDetailsKt.serializeMockProductDetails(productIds, productType));
            return;
        }
        CoroutineScope coroutineScope = getCoroutineScope(this.reactContext);
        b0.t(coroutineScope, k0.f2938a, new C01051(onError, new ExponentialBackoff(coroutineScope, 1000L, 4000L, 3), reactPromise, productType, productIds, null), 2);
    }

    public final void getUserCountry(@NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super BillingManagerException, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (this.mockBillingMode) {
            onSuccess.invoke("US");
            return;
        }
        CoroutineScope coroutineScope = getCoroutineScope(this.reactContext);
        b0.t(coroutineScope, k0.f2938a, new C01061(onError, new ExponentialBackoff(coroutineScope, 1000L, 4000L, 3), onSuccess, null), 2);
    }

    public final void loadPurchases(@NotNull Function0<Unit> onSuccess, @NotNull Function1<? super Exception, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        b0.t(getCoroutineScope(this.reactContext), k0.f2938a, new AnonymousClass3(onError, onSuccess, null), 2);
    }

    public final void open() {
        a5.b e0Var;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        a5.a aVar = new a5.a(reactApplicationContext);
        aVar.f144b = new i8.b(1);
        aVar.f145c = new b(2, this);
        if (reactApplicationContext == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((b) aVar.f145c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((i8.b) aVar.f144b) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((i8.b) aVar.f144b).getClass();
        if (((b) aVar.f145c) != null) {
            i8.b bVar = (i8.b) aVar.f144b;
            b bVar2 = (b) aVar.f145c;
            e0Var = aVar.a() ? new e0(bVar, reactApplicationContext, bVar2, aVar) : new a5.b(bVar, reactApplicationContext, bVar2, aVar);
        } else {
            i8.b bVar3 = (i8.b) aVar.f144b;
            e0Var = aVar.a() ? new e0(bVar3, reactApplicationContext, aVar) : new a5.b(bVar3, reactApplicationContext, aVar);
        }
        this.billingClient = e0Var;
        if (e0Var.I()) {
            updateConnectionState(ConnectionState.CONNECTED);
            return;
        }
        try {
            BillingClient billingClient = this.billingClient;
            if (billingClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                billingClient = null;
            }
            billingClient.h(this.billingClientStateListener);
            updateConnectionState(ConnectionState.CONNECTING);
        } catch (Exception unused) {
            updateConnectionState(ConnectionState.ERROR);
        }
    }

    public final void purchase(Activity activity, @NotNull String productId, @NotNull ProductType productType, @NotNull String userId, String oldProductId, String purchaseToken, String offerId, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super BillingManagerException, Unit> onError) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (activity == null) {
            onError.invoke(new BillingManagerException.BillingException("Current React Activity not found"));
        } else {
            b0.t(getCoroutineScope(this.reactContext), k0.f2938a, new C01071(onError, productType, productId, oldProductId, purchaseToken, userId, offerId, activity, onSuccess, null), 2);
        }
    }
}
