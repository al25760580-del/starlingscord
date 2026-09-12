package com.discord.billing.types;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/discord/billing/types/ProductType;", "", "rawProductType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawProductType", "()Ljava/lang/String;", "IAP", "SUBSCRIPTIONS", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum ProductType {
    IAP("inapp"),
    SUBSCRIPTIONS("subs");

    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    @NotNull
    private final String rawProductType;

    ProductType(String str) {
        this.rawProductType = str;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getRawProductType() {
        return this.rawProductType;
    }
}
