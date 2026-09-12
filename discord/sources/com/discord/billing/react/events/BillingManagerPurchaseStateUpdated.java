package com.discord.billing.react.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000e¨\u0006\""}, d2 = {"Lcom/discord/billing/react/events/BillingManagerPurchaseStateUpdated;", "Lcom/discord/reactevents/ReactEvent;", "billingResult", "", "isActivePurchase", "", "<init>", "(IZ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBillingResult", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$billing_androidRelease", "$serializer", "Companion", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BillingManagerPurchaseStateUpdated implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int billingResult;
    private final boolean isActivePurchase;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/billing/react/events/BillingManagerPurchaseStateUpdated$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/billing/react/events/BillingManagerPurchaseStateUpdated;", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return BillingManagerPurchaseStateUpdated$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BillingManagerPurchaseStateUpdated(int i7, int i10, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, BillingManagerPurchaseStateUpdated$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.billingResult = i10;
        this.isActivePurchase = z5;
    }

    public static /* synthetic */ BillingManagerPurchaseStateUpdated copy$default(BillingManagerPurchaseStateUpdated billingManagerPurchaseStateUpdated, int i7, boolean z5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = billingManagerPurchaseStateUpdated.billingResult;
        }
        if ((i10 & 2) != 0) {
            z5 = billingManagerPurchaseStateUpdated.isActivePurchase;
        }
        return billingManagerPurchaseStateUpdated.copy(i7, z5);
    }

    public static final /* synthetic */ void write$Self$billing_androidRelease(BillingManagerPurchaseStateUpdated self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.billingResult, serialDesc);
        output.p(serialDesc, 1, self.isActivePurchase);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBillingResult() {
        return this.billingResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsActivePurchase() {
        return this.isActivePurchase;
    }

    @NotNull
    public final BillingManagerPurchaseStateUpdated copy(int billingResult, boolean isActivePurchase) {
        return new BillingManagerPurchaseStateUpdated(billingResult, isActivePurchase);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingManagerPurchaseStateUpdated)) {
            return false;
        }
        BillingManagerPurchaseStateUpdated billingManagerPurchaseStateUpdated = (BillingManagerPurchaseStateUpdated) other;
        return this.billingResult == billingManagerPurchaseStateUpdated.billingResult && this.isActivePurchase == billingManagerPurchaseStateUpdated.isActivePurchase;
    }

    public final int getBillingResult() {
        return this.billingResult;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isActivePurchase) + (Integer.hashCode(this.billingResult) * 31);
    }

    public final boolean isActivePurchase() {
        return this.isActivePurchase;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        return "BillingManagerPurchaseStateUpdated(billingResult=" + this.billingResult + ", isActivePurchase=" + this.isActivePurchase + ")";
    }

    public BillingManagerPurchaseStateUpdated(int i7, boolean z5) {
        this.billingResult = i7;
        this.isActivePurchase = z5;
    }
}
