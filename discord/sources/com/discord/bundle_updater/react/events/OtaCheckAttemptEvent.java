package com.discord.bundle_updater.react.events;

import com.discord.bundle_updater.BundleUpdater;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import i5.a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.d;
import or.e1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006#"}, d2 = {"Lcom/discord/bundle_updater/react/events/OtaCheckAttemptEvent;", "Lcom/discord/reactevents/ReactEvent;", "metrics", "", "Lcom/discord/bundle_updater/BundleUpdater$OtaMetric;", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMetrics", "()Ljava/util/List;", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$bundle_updater_release", "$serializer", "Companion", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOtaCheckAttemptEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaCheckAttemptEvent.kt\ncom/discord/bundle_updater/react/events/OtaCheckAttemptEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1563#2:30\n1634#2,3:31\n*S KotlinDebug\n*F\n+ 1 OtaCheckAttemptEvent.kt\ncom/discord/bundle_updater/react/events/OtaCheckAttemptEvent\n*L\n26#1:30\n26#1:31,3\n*E\n"})
public final /* data */ class OtaCheckAttemptEvent implements ReactEvent {

    @NotNull
    private final List<BundleUpdater.OtaMetric> metrics;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {l.a(m.f19486e, new a(2))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/bundle_updater/react/events/OtaCheckAttemptEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/react/events/OtaCheckAttemptEvent;", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return OtaCheckAttemptEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OtaCheckAttemptEvent(int i7, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i7 & 1)) {
            this.metrics = list;
        } else {
            e1.l(i7, 1, OtaCheckAttemptEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(new kr.d(Reflection.getOrCreateKotlinClass(BundleUpdater.OtaMetric.class), new Annotation[0]), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtaCheckAttemptEvent copy$default(OtaCheckAttemptEvent otaCheckAttemptEvent, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = otaCheckAttemptEvent.metrics;
        }
        return otaCheckAttemptEvent.copy(list);
    }

    @NotNull
    public final List<BundleUpdater.OtaMetric> component1() {
        return this.metrics;
    }

    @NotNull
    public final OtaCheckAttemptEvent copy(@NotNull List<? extends BundleUpdater.OtaMetric> metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return new OtaCheckAttemptEvent(metrics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OtaCheckAttemptEvent) && Intrinsics.areEqual(this.metrics, ((OtaCheckAttemptEvent) other).metrics);
    }

    @NotNull
    public final List<BundleUpdater.OtaMetric> getMetrics() {
        return this.metrics;
    }

    public int hashCode() {
        return this.metrics.hashCode();
    }

    @NotNull
    public String toString() {
        return "OtaCheckAttemptEvent(metrics=" + this.metrics + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OtaCheckAttemptEvent(@NotNull List<? extends BundleUpdater.OtaMetric> metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.metrics = metrics;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableNativeMap getData() {
        List<BundleUpdater.OtaMetric> list = this.metrics;
        ArrayList arrayList = new ArrayList(e0.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BundleUpdater.OtaMetric) it.next()).toNativeMap());
        }
        return NativeMapExtensionsKt.nativeMapOf(new Pair("metrics", NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null)));
    }
}
