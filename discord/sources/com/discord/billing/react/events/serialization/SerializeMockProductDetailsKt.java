package com.discord.billing.react.events.serialization;

import com.appsflyer.AppsFlyerProperties;
import com.discord.billing.types.ProductType;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"serializeMockProductDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "", "productType", "Lcom/discord/billing/types/ProductType;", "billing_androidRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSerializeMockProductDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializeMockProductDetails.kt\ncom/discord/billing/react/events/serialization/SerializeMockProductDetailsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1563#2:33\n1634#2,3:34\n*S KotlinDebug\n*F\n+ 1 SerializeMockProductDetails.kt\ncom/discord/billing/react/events/serialization/SerializeMockProductDetailsKt\n*L\n17#1:33\n17#1:34,3\n*E\n"})
public final class SerializeMockProductDetailsKt {
    @NotNull
    public static final ReadableNativeArray serializeMockProductDetails(@NotNull List<String> list, @NotNull ProductType productType) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(productType, "productType");
        String str = productType == ProductType.SUBSCRIPTIONS ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList(e0.l(list, 10));
        for (String str2 : list) {
            Pair pair = new Pair("identifier", str2);
            Pair pair2 = new Pair(AlertFragment.ARG_TITLE, str2);
            Pair pair3 = new Pair("description", str2);
            Pair pair4 = new Pair("priceString", "");
            Pair pair5 = new Pair(AppsFlyerProperties.CURRENCY_CODE, "USD");
            Pair pair6 = new Pair("price", 0);
            Pair pair7 = new Pair("type", str);
            n0 n0Var = n0.f14659d;
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("offerIds", NativeArrayExtensionsKt.toNativeArray$default(n0Var, null, 1, null)), new Pair("billingPeriod", null), new Pair("subscriptionOffers", NativeArrayExtensionsKt.toNativeArray$default(n0Var, null, 1, null))));
        }
        return NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null);
    }
}
