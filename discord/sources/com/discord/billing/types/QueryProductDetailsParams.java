package com.discord.billing.types;

import a5.l;
import a5.m;
import com.google.android.gms.internal.play_billing.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u4.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/discord/billing/types/QueryProductDetailsParams;", "", "<init>", "()V", "create", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "productType", "Lcom/discord/billing/types/ProductType;", "productIds", "", "", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryProductDetailsParams {

    @NotNull
    public static final QueryProductDetailsParams INSTANCE = new QueryProductDetailsParams();

    private QueryProductDetailsParams() {
    }

    @NotNull
    public final com.android.billingclient.api.QueryProductDetailsParams create(@NotNull ProductType productType, @NotNull List<String> productIds) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        ArrayList<m> arrayList = new ArrayList();
        for (String str : productIds) {
            l lVar = new l(0);
            lVar.f227b = str;
            String rawProductType = productType.getRawProductType();
            lVar.f228c = rawProductType;
            if ("first_party".equals(rawProductType)) {
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }
            if (lVar.f227b == null) {
                throw new IllegalArgumentException("Product id must be provided.");
            }
            if (rawProductType == null) {
                throw new IllegalArgumentException("Product type must be provided.");
            }
            m mVar = new m(lVar);
            Intrinsics.checkNotNullExpressionValue(mVar, "build(...)");
            arrayList.add(mVar);
        }
        c cVar = new c();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        for (m mVar2 : arrayList) {
            if (!"play_pass_subs".equals(mVar2.f230b)) {
                hashSet.add(mVar2.f230b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        cVar.f20946d = s.m(arrayList);
        Intrinsics.checkNotNullExpressionValue(cVar, "setProductList(...)");
        if (((s) cVar.f20946d) == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams = new com.android.billingclient.api.QueryProductDetailsParams(cVar);
        Intrinsics.checkNotNullExpressionValue(queryProductDetailsParams, "build(...)");
        return queryProductDetailsParams;
    }
}
