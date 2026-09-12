package com.discord.billing.types;

import a5.b0;
import a5.f;
import a5.i;
import a5.j;
import android.text.TextUtils;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.a;
import e4.e;
import e4.m;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kk.b;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nJD\u0010\u000e\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002¨\u0006\u001c"}, d2 = {"Lcom/discord/billing/types/BillingFlowParams;", "", "<init>", "()V", "create", "Lcom/android/billingclient/api/BillingFlowParams;", "productDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "productId", "", "productIdOld", "purchaseToken", "userId", "createWithProductDetails", "offerId", "getObfuscatedUserId", "getPriceAmountMicros", "", "getPricingPhase", "Lcom/android/billingclient/api/ProductDetails$PricingPhase;", "calculateStandardizedUnits", "", "oldPeriod", "newPeriod", "getReplacementMode", "oldProductDetails", "newProductDetails", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillingFlowParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingFlowParams.kt\ncom/discord/billing/types/BillingFlowParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,176:1\n1#2:177\n295#3,2:178\n295#3,2:180\n295#3,2:185\n12897#4,3:182\n*S KotlinDebug\n*F\n+ 1 BillingFlowParams.kt\ncom/discord/billing/types/BillingFlowParams\n*L\n76#1:178,2\n78#1:180,2\n135#1:185,2\n113#1:182,3\n*E\n"})
public final class BillingFlowParams {

    @NotNull
    public static final BillingFlowParams INSTANCE = new BillingFlowParams();

    private BillingFlowParams() {
    }

    private final int calculateStandardizedUnits(String oldPeriod, String newPeriod) {
        if (Intrinsics.areEqual(oldPeriod, "P1M") && Intrinsics.areEqual(newPeriod, "P1Y")) {
            return 12;
        }
        if (Intrinsics.areEqual(oldPeriod, "P1M") && Intrinsics.areEqual(newPeriod, "P6M")) {
            return 6;
        }
        if (Intrinsics.areEqual(oldPeriod, "P1M") && Intrinsics.areEqual(newPeriod, "P3M")) {
            return 3;
        }
        if (Intrinsics.areEqual(oldPeriod, "P3M") && Intrinsics.areEqual(newPeriod, "P1Y")) {
            return 4;
        }
        if (Intrinsics.areEqual(oldPeriod, "P3M") && Intrinsics.areEqual(newPeriod, "P6M")) {
            return 2;
        }
        return (Intrinsics.areEqual(oldPeriod, "P6M") && Intrinsics.areEqual(newPeriod, "P1Y")) ? 2 : 1;
    }

    private final String getObfuscatedUserId(String userId) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = userId.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        String strJ = "";
        for (byte b10 : bArrDigest) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            strJ = b.j(strJ, str);
        }
        return strJ;
    }

    private final long getPriceAmountMicros(ProductDetails productDetails) {
        if (!Intrinsics.areEqual(productDetails.f3794d, "inapp")) {
            if (Intrinsics.areEqual(productDetails.f3794d, "subs")) {
                return getPricingPhase(productDetails).f3801b;
            }
            return 0L;
        }
        i iVarA = productDetails.a();
        if (iVarA != null) {
            return iVarA.f207b;
        }
        return 0L;
    }

    private final ProductDetails.PricingPhase getPricingPhase(ProductDetails productDetails) {
        j jVar;
        a aVar;
        ArrayList arrayList;
        Object next;
        if (Intrinsics.areEqual(productDetails.f3794d, "inapp")) {
            throw new AssertionError("Attempted to retrieve pricing phase for one time purchase");
        }
        ArrayList arrayList2 = productDetails.f3799i;
        ProductDetails.PricingPhase pricingPhase = null;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((j) next).f217b != null);
            jVar = (j) next;
        } else {
            jVar = null;
        }
        if (jVar != null && (aVar = jVar.f219d) != null && (arrayList = aVar.f3824a) != null) {
            pricingPhase = (ProductDetails.PricingPhase) arrayList.get(0);
        }
        if (pricingPhase != null) {
            return pricingPhase;
        }
        throw new AssertionError("No pricing phase found for subscription product details");
    }

    private final int getReplacementMode(ProductDetails oldProductDetails, ProductDetails newProductDetails) {
        long priceAmountMicros = getPriceAmountMicros(oldProductDetails);
        long priceAmountMicros2 = getPriceAmountMicros(newProductDetails);
        String str = getPricingPhase(oldProductDetails).f3803d;
        Intrinsics.checkNotNullExpressionValue(str, "getBillingPeriod(...)");
        String str2 = getPricingPhase(newProductDetails).f3803d;
        Intrinsics.checkNotNullExpressionValue(str2, "getBillingPeriod(...)");
        return priceAmountMicros2 / ((long) calculateStandardizedUnits(str, str2)) <= priceAmountMicros ? 6 : 2;
    }

    public final com.android.billingclient.api.BillingFlowParams create(List<ProductDetails> productDetails, @NotNull String productId, String productIdOld, String purchaseToken, @NotNull String userId) {
        ProductDetails productDetails2;
        ProductDetails productDetails3;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (productDetails != null) {
            Iterator<T> it = productDetails.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.areEqual(((ProductDetails) next2).f3793c, productId));
            productDetails2 = (ProductDetails) next2;
        } else {
            productDetails2 = null;
        }
        if (productDetails != null) {
            Iterator<T> it2 = productDetails.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((ProductDetails) next).f3793c, productIdOld));
            productDetails3 = (ProductDetails) next;
        } else {
            productDetails3 = null;
        }
        if (productDetails2 == null || (productIdOld != null && productDetails3 == null)) {
            return null;
        }
        m mVar = new m(1);
        f fVar = new f();
        fVar.f180a = 0;
        fVar.f181b = true;
        mVar.f7995v = fVar;
        e eVar = new e((char) 0, 1);
        eVar.f7971e = productDetails2;
        if (productDetails2.a() != null) {
            productDetails2.a().getClass();
            String str = productDetails2.a().f209d;
            if (str != null) {
                eVar.f7972i = str;
            }
        }
        if (((ProductDetails) eVar.f7971e) == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        mVar.f7994i = new ArrayList(c0.c(new a5.e(eVar)));
        mVar.f7993e = getObfuscatedUserId(userId);
        if (productDetails3 != null && purchaseToken != null) {
            int replacementMode = INSTANCE.getReplacementMode(productDetails3, productDetails2);
            boolean z5 = (TextUtils.isEmpty(purchaseToken) && TextUtils.isEmpty(null)) ? false : true;
            boolean zIsEmpty = TextUtils.isEmpty(null);
            if (z5 && !zIsEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!z5 && zIsEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            b0 b0Var = new b0(1, (short) 0);
            b0Var.f174i = purchaseToken;
            b0Var.f173e = replacementMode;
            f fVar2 = new f();
            fVar2.f182c = (String) b0Var.f174i;
            fVar2.f180a = b0Var.f173e;
            mVar.f7995v = fVar2;
        }
        return mVar.s();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    public final com.android.billingclient.api.BillingFlowParams createWithProductDetails(@NotNull List<ProductDetails> productDetails, @NotNull String productId, String productIdOld, String purchaseToken, @NotNull String userId, String offerId) {
        Object next;
        Object next2;
        Object next3;
        String str;
        Object next4;
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Iterator<T> it = productDetails.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ProductDetails) next).f3793c, productId));
        ProductDetails productDetails2 = (ProductDetails) next;
        if (productDetails2 == null) {
            throw new AssertionError("Could not find product detail for new product");
        }
        ArrayList arrayList = productDetails2.f3799i;
        Iterator<T> it2 = productDetails.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.areEqual(((ProductDetails) next2).f3793c, productIdOld));
        ProductDetails productDetails3 = (ProductDetails) next2;
        if (productIdOld != null && productDetails3 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        e eVar = new e((char) 0, 1);
        eVar.f7971e = productDetails2;
        if (productDetails2.a() != null) {
            productDetails2.a().getClass();
            String str2 = productDetails2.a().f209d;
            if (str2 != null) {
                eVar.f7972i = str2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(eVar, "setProductDetails(...)");
        if (Intrinsics.areEqual(productDetails2.f3794d, "subs")) {
            if (offerId != null) {
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it3.next();
                    } while (!Intrinsics.areEqual(((j) next4).f217b, offerId));
                    j jVar = (j) next4;
                    if (jVar != null) {
                        str = jVar.f218c;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
            } else if (arrayList != null) {
                Iterator it4 = arrayList.iterator();
                do {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                } while (((j) next3).f217b != null);
                j jVar2 = (j) next3;
                if (jVar2 != null) {
                    str = jVar2.f218c;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (str == null) {
                throw new AssertionError(a3.e.m("Could not find offer token for productId: ", productDetails2.f3793c, " offerId: ", offerId));
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            eVar.f7972i = str;
        }
        if (((ProductDetails) eVar.f7971e) == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        a5.e eVar2 = new a5.e(eVar);
        Intrinsics.checkNotNullExpressionValue(eVar2, "build(...)");
        arrayList2.add(eVar2);
        m mVar = new m(1);
        f fVar = new f();
        fVar.f180a = 0;
        fVar.f181b = true;
        mVar.f7995v = fVar;
        mVar.f7994i = new ArrayList(arrayList2);
        mVar.f7993e = getObfuscatedUserId(userId);
        if (productDetails3 != null && purchaseToken != null) {
            int replacementMode = INSTANCE.getReplacementMode(productDetails3, productDetails2);
            boolean z5 = (TextUtils.isEmpty(purchaseToken) && TextUtils.isEmpty(null)) ? false : true;
            boolean zIsEmpty = TextUtils.isEmpty(null);
            if (z5 && !zIsEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!z5 && zIsEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            b0 b0Var = new b0(1, (short) 0);
            b0Var.f174i = purchaseToken;
            b0Var.f173e = replacementMode;
            f fVar2 = new f();
            fVar2.f182c = (String) b0Var.f174i;
            fVar2.f180a = b0Var.f173e;
            mVar.f7995v = fVar2;
        }
        return mVar.s();
    }
}
