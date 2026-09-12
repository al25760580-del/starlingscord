package com.discord.billing.react.events.serialization;

import a3.e;
import a5.i;
import a5.j;
import com.android.billingclient.api.ProductDetails;
import com.appsflyer.AppsFlyerProperties;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"serializeProductDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "Lcom/android/billingclient/api/ProductDetails;", "billing_androidRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSerializeProductDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializeProductDetails.kt\ncom/discord/billing/react/events/serialization/SerializeProductDetailsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1563#2:76\n1634#2,2:77\n295#2,2:79\n1563#2:81\n1634#2,3:82\n1636#2:85\n*S KotlinDebug\n*F\n+ 1 SerializeProductDetails.kt\ncom/discord/billing/react/events/serialization/SerializeProductDetailsKt\n*L\n9#1:76\n9#1:77,2\n26#1:79,2\n41#1:81\n41#1:82,3\n9#1:85\n*E\n"})
public final class SerializeProductDetailsKt {
    @NotNull
    public static final ReadableNativeArray serializeProductDetails(@NotNull List<ProductDetails> list) {
        Iterator it;
        ArrayList arrayList;
        String str;
        String str2;
        Object obj;
        long j;
        String str3;
        String str4;
        String str5;
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList2 = new ArrayList(e0.l(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ProductDetails productDetails = (ProductDetails) it2.next();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            String str6 = productDetails.f3794d;
            String str7 = productDetails.f3793c;
            boolean zAreEqual = Intrinsics.areEqual(str6, "inapp");
            String str8 = AppsFlyerProperties.CURRENCY_CODE;
            String str9 = "billingPeriod";
            if (zAreEqual) {
                i iVarA = productDetails.a();
                if (iVarA == null) {
                    throw new AssertionError(e.l("Could not find oneTimePurchaseOfferDetails for product: ", str7));
                }
                j = iVarA.f207b;
                String str10 = iVarA.f206a;
                str5 = iVarA.f208c;
                it = it2;
                arrayList = arrayList2;
                str = AppsFlyerProperties.CURRENCY_CODE;
                str2 = "billingPeriod";
                obj = "price";
                str3 = str10;
                str4 = null;
            } else {
                if (Intrinsics.areEqual(str6, "subs")) {
                    ArrayList arrayList5 = productDetails.f3799i;
                    if (arrayList5 != null) {
                        Iterator it3 = arrayList5.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((j) next).f217b != null);
                        j jVar = (j) next;
                        if (jVar != null) {
                            ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) jVar.f219d.f3824a.get(0);
                            if (pricingPhase == null) {
                                throw new AssertionError(e.l("Could not find pricingPhase for product: ", str7));
                            }
                            Object obj2 = "price";
                            long j5 = pricingPhase.f3801b;
                            String str11 = pricingPhase.f3800a;
                            String str12 = pricingPhase.f3803d;
                            String str13 = pricingPhase.f3802c;
                            Iterator it4 = arrayList5.iterator();
                            while (it4.hasNext()) {
                                j jVar2 = (j) it4.next();
                                it2 = it2;
                                String str14 = jVar2.f217b;
                                if (str14 != null) {
                                    arrayList3.add(str14);
                                    Iterator it5 = it4;
                                    ArrayList arrayList6 = jVar2.f219d.f3824a;
                                    String str15 = str13;
                                    Intrinsics.checkNotNullExpressionValue(arrayList6, "getPricingPhaseList(...)");
                                    String str16 = str12;
                                    long j7 = j5;
                                    ArrayList arrayList7 = new ArrayList(e0.l(arrayList6, 10));
                                    Iterator it6 = arrayList6.iterator();
                                    while (it6.hasNext()) {
                                        ProductDetails.PricingPhase pricingPhase2 = (ProductDetails.PricingPhase) it6.next();
                                        String str17 = str8;
                                        Object obj3 = obj2;
                                        arrayList7.add(NativeMapExtensionsKt.nativeMapOf(new Pair(obj3, Integer.valueOf((int) (pricingPhase2.f3801b / ((long) 10000)))), new Pair("formattedPrice", pricingPhase2.f3800a), new Pair(str9, pricingPhase2.f3803d), new Pair("billingCycleCount", Integer.valueOf(pricingPhase2.f3804e)), new Pair(str17, pricingPhase2.f3802c)));
                                        obj2 = obj3;
                                        str8 = str17;
                                        it6 = it6;
                                        str11 = str11;
                                        arrayList2 = arrayList2;
                                        str9 = str9;
                                    }
                                    arrayList4.add(NativeMapExtensionsKt.nativeMapOf(new Pair("basePlanId", jVar2.f216a), new Pair("offerId", str14), new Pair("pricingPhases", NativeArrayExtensionsKt.toNativeArray$default(arrayList7, null, 1, null))));
                                    str8 = str8;
                                    it4 = it5;
                                    str13 = str15;
                                    str12 = str16;
                                    j5 = j7;
                                    str11 = str11;
                                    arrayList2 = arrayList2;
                                }
                            }
                            it = it2;
                            arrayList = arrayList2;
                            String str18 = str12;
                            str2 = str9;
                            long j10 = j5;
                            str = str8;
                            obj = obj2;
                            str5 = str13;
                            str4 = str18;
                            j = j10;
                            str3 = str11;
                        }
                    }
                    throw new AssertionError(e.l("Could not find subscriptionOfferDetails for product: ", str7));
                }
                it = it2;
                arrayList = arrayList2;
                str = AppsFlyerProperties.CURRENCY_CODE;
                str2 = "billingPeriod";
                obj = "price";
                j = 0;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            WritableNativeMap writableNativeMapNativeMapOf = NativeMapExtensionsKt.nativeMapOf(new Pair("identifier", str7), new Pair(AlertFragment.ARG_TITLE, productDetails.f3795e), new Pair("description", productDetails.f3796f), new Pair("priceString", str3), new Pair(str, str5), new Pair(obj, Integer.valueOf((int) (j / ((long) 10000)))), new Pair("type", str6), new Pair("offerIds", NativeArrayExtensionsKt.toNativeArray$default(arrayList3, null, 1, null)), new Pair(str2, str4), new Pair("subscriptionOffers", NativeArrayExtensionsKt.toNativeArray$default(arrayList4, null, 1, null)));
            arrayList2 = arrayList;
            arrayList2.add(writableNativeMapNativeMapOf);
            it2 = it;
        }
        return NativeArrayExtensionsKt.toNativeArray$default(arrayList2, null, 1, null);
    }
}
