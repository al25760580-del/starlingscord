package com.discord.billing;

import com.discord.billing.react.events.BillingManagerConnectionStateUpdated;
import com.discord.billing.react.events.BillingManagerPurchaseStateUpdated;
import com.discord.billing.react.events.BillingManagerPurchaseUpdated;
import com.discord.billing.types.ProductType;
import com.discord.client_info.ClientInfo;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0007J\b\u0010\u0011\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J>\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000fH\u0007J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&H\u0007J$\u0010'\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/discord/billing/BillingManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "billingManager", "Lcom/discord/billing/BillingManager;", "emitEvent", "", "event", "Lcom/discord/reactevents/ReactEvent;", "getName", "", "open", "close", "getIAPSkus", "productIds", "Lcom/facebook/react/bridge/ReadableArray;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getSubscriptionSkus", "purchase", "productId", "userId", "subscribe", "oldProductId", "purchaseToken", "offerId", "consumePurchase", "loadPurchases", "getUserCountry", "addListener", "type", "removeListeners", "count", "", "getProducts", "productType", "Lcom/discord/billing/types/ProductType;", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillingManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingManagerModule.kt\ncom/discord/billing/BillingManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n808#2,11:174\n*S KotlinDebug\n*F\n+ 1 BillingManagerModule.kt\ncom/discord/billing/BillingManagerModule\n*L\n164#1:174,11\n*E\n"})
public final class BillingManagerModule extends ReactContextBaseJavaModule {

    @NotNull
    private final BillingManager billingManager;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(new Pair("billing-manager-connection-state-updated", Reflection.getOrCreateKotlinClass(BillingManagerConnectionStateUpdated.class)), new Pair("billing-manager-purchase-updated", Reflection.getOrCreateKotlinClass(BillingManagerPurchaseUpdated.class)), new Pair("billing-manager-purchase-state-updated", Reflection.getOrCreateKotlinClass(BillingManagerPurchaseStateUpdated.class)));
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        this.billingManager = new BillingManager(reactApplicationContext, ClientInfo.INSTANCE.isProdBuild(), new e(7, this), new Function2() { // from class: com.discord.billing.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BillingManagerModule.billingManager$lambda$1(this.f3987d, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
            }
        }, new Function5() { // from class: com.discord.billing.g
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int iIntValue = ((Integer) obj4).intValue();
                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                return BillingManagerModule.billingManager$lambda$2(this.f3988d, (String) obj, (String) obj2, (String) obj3, iIntValue, zBooleanValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit billingManager$lambda$0(BillingManagerModule billingManagerModule, int i7) {
        billingManagerModule.emitEvent(new BillingManagerConnectionStateUpdated(i7));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit billingManager$lambda$1(BillingManagerModule billingManagerModule, int i7, boolean z5) {
        billingManagerModule.emitEvent(new BillingManagerPurchaseStateUpdated(i7, z5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit billingManager$lambda$2(BillingManagerModule billingManagerModule, String purchaseToken, String packageName, String product, int i7, boolean z5) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(product, "product");
        billingManagerModule.emitEvent(new BillingManagerPurchaseUpdated(purchaseToken, packageName, product, i7, z5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit consumePurchase$lambda$7(Promise promise) {
        promise.resolve(Boolean.TRUE);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit consumePurchase$lambda$8(Promise promise, BillingManagerException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        promise.reject(e10.getErrorCode(), e10.getReason(), e10);
        return Unit.f14616a;
    }

    private final void emitEvent(ReactEvent event) {
        this.reactEvents.emitModuleEvent(this.reactContext, event);
    }

    private final void getProducts(BillingManager billingManager, ReadableArray readableArray, ProductType productType, Promise promise) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof String) {
                arrayList2.add(obj);
            }
        }
        billingManager.getProducts(arrayList2, productType, promise, new e(2, promise));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getProducts$lambda$13(Promise promise, BillingManagerException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        promise.reject(e10.getErrorCode(), e10.getReason(), e10);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserCountry$lambda$11(Promise promise, String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        promise.resolve(countryCode);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserCountry$lambda$12(Promise promise, BillingManagerException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        promise.reject(e10.getErrorCode(), e10.getReason(), e10);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadPurchases$lambda$10(Promise promise, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        promise.reject(e10);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadPurchases$lambda$9(Promise promise) {
        promise.resolve(Boolean.TRUE);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit purchase$lambda$3(Promise promise) {
        promise.resolve(Boolean.TRUE);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit purchase$lambda$4(Promise promise, BillingManagerException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        promise.reject(e10.getErrorCode(), e10.getReason(), e10);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$5(Promise promise) {
        promise.resolve(Boolean.TRUE);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$6(Promise promise, BillingManagerException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        promise.reject(e10.getErrorCode(), e10.getReason(), e10);
        return Unit.f14616a;
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @ReactMethod
    public final void close() {
        this.billingManager.close();
    }

    @ReactMethod
    public final void consumePurchase(@NotNull String purchaseToken, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.billingManager.consumePurchase(purchaseToken, new d(promise, 2), new e(4, promise));
    }

    @ReactMethod
    public final void getIAPSkus(@NotNull ReadableArray productIds, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(promise, "promise");
        getProducts(this.billingManager, productIds, ProductType.IAP, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "BillingManager";
    }

    @ReactMethod
    public final void getSubscriptionSkus(@NotNull ReadableArray productIds, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(promise, "promise");
        getProducts(this.billingManager, productIds, ProductType.SUBSCRIPTIONS, promise);
    }

    @ReactMethod
    public final void getUserCountry(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.billingManager.getUserCountry(new e(5, promise), new e(6, promise));
    }

    @ReactMethod
    public final void loadPurchases(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.billingManager.loadPurchases(new d(promise, 1), new e(1, promise));
    }

    @ReactMethod
    public final void open() {
        this.billingManager.open();
    }

    @ReactMethod
    public final void purchase(@NotNull String productId, @NotNull String userId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BillingManager.purchase$default(this.billingManager, this.reactContext.getCurrentActivity(), productId, ProductType.IAP, userId, null, null, null, new d(promise, 3), new e(0, promise), 112, null);
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void subscribe(@NotNull String productId, @NotNull String userId, String oldProductId, String purchaseToken, String offerId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.billingManager.purchase(this.reactContext.getCurrentActivity(), productId, ProductType.SUBSCRIPTIONS, userId, oldProductId, purchaseToken, offerId, new d(promise, 0), new e(3, promise));
    }
}
