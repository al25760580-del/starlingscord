package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import androidx.appcompat.widget.k1;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010%\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/appsflyer/internal/AFe1aSDK;", "Lcom/appsflyer/internal/AFe1lSDK;", "", "Lcom/appsflyer/internal/AFe1rSDK;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lcom/appsflyer/internal/AFc1pSDK;", "p2", "Lcom/appsflyer/internal/AFc1gSDK;", "p3", "Lcom/appsflyer/internal/AFg1rSDK;", "p4", "Lcom/appsflyer/internal/AFf1cSDK;", "p5", "Lkotlin/Function1;", "Lcom/appsflyer/internal/AFe1uSDK;", "p6", "<init>", "(Lcom/appsflyer/internal/AFe1rSDK;Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFc1gSDK;Lcom/appsflyer/internal/AFg1rSDK;Lcom/appsflyer/internal/AFf1cSDK;Lkotlin/jvm/functions/Function1;)V", "", "getCurrencyIso4217Code", "()J", "getMediationNetwork", "()Lcom/appsflyer/internal/AFe1uSDK;", "getRevenue", "()V", "", "AFAdRevenueData", "()Z", "component3", "Ljava/util/concurrent/Executor;", "getMonetizationNetwork", "component4", "Lcom/appsflyer/internal/AFc1gSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFe1rSDK;", "component2", "Lcom/appsflyer/internal/AFg1rSDK;", "component1", "Lcom/appsflyer/internal/AFc1pSDK;", "toString", "Lkotlin/jvm/functions/Function1;", "copy", "Lcom/appsflyer/internal/AFf1cSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegisterTriggerTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,169:1\n215#2,2:170\n*S KotlinDebug\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n*L\n163#1:170,2\n*E\n"})
public final class AFe1aSDK extends AFe1lSDK<Unit> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    public AFe1rSDK getRevenue;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    public AFc1pSDK getMediationNetwork;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @NotNull
    public AFg1rSDK getCurrencyIso4217Code;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    public Executor getMonetizationNetwork;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public AFc1gSDK AFAdRevenueData;

    /* JADX INFO: renamed from: copy, reason: from kotlin metadata */
    @NotNull
    public AFf1cSDK component2;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    @NotNull
    public Function1<AFe1uSDK, Unit> component3;

    public static final class AFa1zSDK implements OutcomeReceiver {
        private /* synthetic */ Ref.ObjectRef<AFe1uSDK> getCurrencyIso4217Code;
        private /* synthetic */ AFe1aSDK getMediationNetwork;
        private /* synthetic */ CountDownLatch getMonetizationNetwork;

        public AFa1zSDK(Ref.ObjectRef<AFe1uSDK> objectRef, CountDownLatch countDownLatch, AFe1aSDK aFe1aSDK) {
            this.getCurrencyIso4217Code = objectRef;
            this.getMonetizationNetwork = countDownLatch;
            this.getMediationNetwork = aFe1aSDK;
        }

        public final /* synthetic */ void onError(Throwable th2) {
            Exception exc = (Exception) th2;
            Intrinsics.checkNotNullParameter(exc, "");
            AFe1aSDK.AFAdRevenueData(exc);
            this.getMonetizationNetwork.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1uSDK] */
        public final void onResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getCurrencyIso4217Code.element = AFe1uSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getMonetizationNetwork.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFe1aSDK(@NotNull AFe1rSDK aFe1rSDK, @NotNull Executor executor, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1gSDK aFc1gSDK, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFf1cSDK aFf1cSDK, @NotNull Function1<? super AFe1uSDK, Unit> function1) {
        super(AFe1mSDK.REGISTER_TRIGGER, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFf1cSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getRevenue = aFe1rSDK;
        this.getMonetizationNetwork = executor;
        this.getMediationNetwork = aFc1pSDK;
        this.AFAdRevenueData = aFc1gSDK;
        this.getCurrencyIso4217Code = aFg1rSDK;
        this.component2 = aFf1cSDK;
        this.component3 = function1;
        if (aFe1rSDK instanceof AFe1rSDK.AFa1uSDK) {
            this.getMediationNetwork.add(AFe1mSDK.CONVERSION);
        }
        if (this.getRevenue instanceof AFe1rSDK.AFa1tSDK) {
            this.getRevenue.add(AFe1mSDK.CONVERSION);
        }
        if (this.getRevenue instanceof AFe1rSDK.AFa1ySDK) {
            this.getRevenue.add(AFe1mSDK.INAPP);
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return 20000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1uSDK] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.appsflyer.internal.AFe1uSDK] */
    @Override // com.appsflyer.internal.AFe1lSDK
    @SuppressLint({"NewApi"})
    @NotNull
    public final AFe1uSDK getMediationNetwork() {
        MeasurementManager measurementManagerC;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1uSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.AFAdRevenueData.getRevenue;
            if (context != null && (measurementManagerC = k1.c(context.getSystemService(k1.h()))) != null) {
                new AFj1eSDK(this.getMediationNetwork, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1eSDK.AFAdRevenueData()).buildUpon();
                String strComponent4 = this.getMediationNetwork.component4();
                if (strComponent4 == null) {
                    strComponent4 = "";
                }
                LinkedHashMap linkedHashMapH = w0.h(new Pair("event_name", this.getRevenue.getMonetizationNetwork), new Pair("app_id", this.getMediationNetwork.getRevenue.getRevenue.getPackageName()), new Pair("app_version", this.getMediationNetwork.n_().versionName), new Pair("sdk_version", AFc1pSDK.getCurrencyIso4217Code()), new Pair("api_version", AFc1pSDK.AFAdRevenueData()), new Pair("timestamp", String.valueOf(this.getCurrencyIso4217Code.getCurrencyIso4217Code())), new Pair("request_id", AFc1pSDK.getMonetizationNetwork()), new Pair("gaid", strComponent4));
                String revenue = AFb1jSDK.getRevenue(this.getMediationNetwork.getMonetizationNetwork);
                if (revenue != null) {
                    linkedHashMapH.put("appsflyer_id", revenue);
                }
                Long lAFAdRevenueData = this.getCurrencyIso4217Code.AFAdRevenueData();
                if (lAFAdRevenueData != null) {
                    linkedHashMapH.put("install_time", String.valueOf(lAFAdRevenueData.longValue()));
                }
                AFe1rSDK aFe1rSDK = this.getRevenue;
                if (aFe1rSDK instanceof AFe1rSDK.AFa1ySDK) {
                    Float f2 = ((AFe1rSDK.AFa1ySDK) aFe1rSDK).getCurrencyIso4217Code;
                    if (f2 != null) {
                        linkedHashMapH.put("event_revenue", String.valueOf(f2.floatValue()));
                    }
                    Integer num = ((AFe1rSDK.AFa1ySDK) this.getRevenue).getRevenue;
                    if (num != null) {
                        linkedHashMapH.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : linkedHashMapH.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                measurementManagerC.registerTrigger(uriBuild, this.getMonetizationNetwork, new AFa1zSDK(objectRef, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            objectRef.element = AFe1uSDK.TIMEOUT;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, a3.e.l("Error occurred: ", th2.getMessage()), th2, false, false, false, true);
        }
        return (AFe1uSDK) objectRef.element;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        super.getRevenue();
        AFe1uSDK aFe1uSDK = this.AFAdRevenueData;
        if (aFe1uSDK != null) {
            this.component3.invoke(aFe1uSDK);
        }
    }

    public static final /* synthetic */ void AFAdRevenueData(Throwable th2) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, a3.e.l("Error occurred: ", th2.getMessage()), th2, false, false, false, true);
    }
}
