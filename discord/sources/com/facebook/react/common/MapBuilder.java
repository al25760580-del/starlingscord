package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005j\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007`\b\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007H\u0007J \u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007H\u0007J5\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\f\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\rJE\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u00062\u0006\u0010\u000f\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\u0010JU\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u00062\u0006\u0010\u000f\u001a\u0002H\u00072\u0006\u0010\u0011\u001a\u0002H\u00062\u0006\u0010\u0012\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\u0013Je\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u00062\u0006\u0010\u000f\u001a\u0002H\u00072\u0006\u0010\u0011\u001a\u0002H\u00062\u0006\u0010\u0012\u001a\u0002H\u00072\u0006\u0010\u0014\u001a\u0002H\u00062\u0006\u0010\u0015\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\u0016Ju\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u00062\u0006\u0010\u000f\u001a\u0002H\u00072\u0006\u0010\u0011\u001a\u0002H\u00062\u0006\u0010\u0012\u001a\u0002H\u00072\u0006\u0010\u0014\u001a\u0002H\u00062\u0006\u0010\u0015\u001a\u0002H\u00072\u0006\u0010\u0017\u001a\u0002H\u00062\u0006\u0010\u0018\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\u0019J\u0085\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u00062\u0006\u0010\u000f\u001a\u0002H\u00072\u0006\u0010\u0011\u001a\u0002H\u00062\u0006\u0010\u0012\u001a\u0002H\u00072\u0006\u0010\u0014\u001a\u0002H\u00062\u0006\u0010\u0015\u001a\u0002H\u00072\u0006\u0010\u0017\u001a\u0002H\u00062\u0006\u0010\u0018\u001a\u0002H\u00072\u0006\u0010\u001a\u001a\u0002H\u00062\u0006\u0010\u001b\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\u001cJ\u0095\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u00062\u0006\u0010\u000f\u001a\u0002H\u00072\u0006\u0010\u0011\u001a\u0002H\u00062\u0006\u0010\u0012\u001a\u0002H\u00072\u0006\u0010\u0014\u001a\u0002H\u00062\u0006\u0010\u0015\u001a\u0002H\u00072\u0006\u0010\u0017\u001a\u0002H\u00062\u0006\u0010\u0018\u001a\u0002H\u00072\u0006\u0010\u001a\u001a\u0002H\u00062\u0006\u0010\u001b\u001a\u0002H\u00072\u0006\u0010\u001d\u001a\u0002H\u00062\u0006\u0010\u001e\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\u001fJ \u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070!\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007H\u0007¨\u0006#"}, d2 = {"Lcom/facebook/react/common/MapBuilder;", "", "<init>", "()V", "newHashMap", "Ljava/util/HashMap;", "K", "V", "Lkotlin/collections/HashMap;", "of", "", "k1", "v1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "k2", "v2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "k3", "v3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "k4", "v4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "k5", "v5", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "k6", "v6", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "k7", "v7", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "builder", "Lcom/facebook/react/common/MapBuilder$Builder;", "Builder", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public final class MapBuilder {

    @NotNull
    public static final MapBuilder INSTANCE = new MapBuilder();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/common/MapBuilder$Builder;", "K", "V", "", "<init>", "()V", "map", "", "underConstruction", "", "put", "k", "v", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;", "build", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\ncom/facebook/react/common/MapBuilder$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
    public static final class Builder<K, V> {

        @NotNull
        private final Map<K, V> map = MapBuilder.newHashMap();
        private boolean underConstruction = true;

        @NotNull
        public final Map<K, V> build() {
            if (!this.underConstruction) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.underConstruction = false;
            return this.map;
        }

        @NotNull
        public final Builder<K, V> put(K k, V v6) {
            if (!this.underConstruction) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.map.put(k, v6);
            return this;
        }
    }

    private MapBuilder() {
    }

    @NotNull
    public static final <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @NotNull
    public static final <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    @NotNull
    public static final <K, V> Map<K, V> of() {
        return newHashMap();
    }

    @NotNull
    public static final <K, V> Map<K, V> of(K k5, V v6) {
        return w0.f(new Pair(k5, v6));
    }

    @NotNull
    public static final <K, V> Map<K, V> of(K k5, V v6, K k7, V v7) {
        return w0.f(new Pair(k5, v6), new Pair(k7, v7));
    }

    @NotNull
    public static final <K, V> Map<K, V> of(K k5, V v6, K k7, V v7, K k10, V v10) {
        return w0.f(new Pair(k5, v6), new Pair(k7, v7), new Pair(k10, v10));
    }

    @NotNull
    public static final <K, V> Map<K, V> of(K k5, V v6, K k7, V v7, K k10, V v10, K k11, V v11) {
        return w0.f(new Pair(k5, v6), new Pair(k7, v7), new Pair(k10, v10), new Pair(k11, v11));
    }

    @NotNull
    public static final <K, V> Map<K, V> of(K k5, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12) {
        return w0.f(new Pair(k5, v6), new Pair(k7, v7), new Pair(k10, v10), new Pair(k11, v11), new Pair(k12, v12));
    }

    @NotNull
    public static final <K, V> Map<K, V> of(K k5, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        return w0.f(new Pair(k5, v6), new Pair(k7, v7), new Pair(k10, v10), new Pair(k11, v11), new Pair(k12, v12), new Pair(k13, v13));
    }

    @NotNull
    public static final <K, V> Map<K, V> of(K k5, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        return w0.f(new Pair(k5, v6), new Pair(k7, v7), new Pair(k10, v10), new Pair(k11, v11), new Pair(k12, v12), new Pair(k13, v13), new Pair(k14, v14));
    }
}
