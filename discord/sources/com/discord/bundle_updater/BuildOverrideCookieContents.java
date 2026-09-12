package com.discord.bundle_updater;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/discord/bundle_updater/BuildOverrideCookieContents;", "", "meta", "Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "builds", "", "", "Lcom/discord/bundle_updater/BuildOverrideCookieBuild;", "<init>", "(Lcom/discord/bundle_updater/BuildOverrideCookieMeta;Ljava/util/Map;)V", "getMeta", "()Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "getBuilds", "()Ljava/util/Map;", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCookieValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/BuildOverrideCookieContents\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n465#2:107\n415#2:108\n1252#3,4:109\n*S KotlinDebug\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/BuildOverrideCookieContents\n*L\n55#1:107\n55#1:108\n55#1:109,4\n*E\n"})
public final /* data */ class BuildOverrideCookieContents {

    @NotNull
    private final Map<String, BuildOverrideCookieBuild> builds;

    @NotNull
    private final BuildOverrideCookieMeta meta;

    public BuildOverrideCookieContents(@NotNull BuildOverrideCookieMeta meta, @NotNull Map<String, BuildOverrideCookieBuild> builds) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(builds, "builds");
        this.meta = meta;
        this.builds = builds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuildOverrideCookieContents copy$default(BuildOverrideCookieContents buildOverrideCookieContents, BuildOverrideCookieMeta buildOverrideCookieMeta, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            buildOverrideCookieMeta = buildOverrideCookieContents.meta;
        }
        if ((i7 & 2) != 0) {
            map = buildOverrideCookieContents.builds;
        }
        return buildOverrideCookieContents.copy(buildOverrideCookieMeta, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BuildOverrideCookieMeta getMeta() {
        return this.meta;
    }

    @NotNull
    public final Map<String, BuildOverrideCookieBuild> component2() {
        return this.builds;
    }

    @NotNull
    public final BuildOverrideCookieContents copy(@NotNull BuildOverrideCookieMeta meta, @NotNull Map<String, BuildOverrideCookieBuild> builds) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(builds, "builds");
        return new BuildOverrideCookieContents(meta, builds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildOverrideCookieContents)) {
            return false;
        }
        BuildOverrideCookieContents buildOverrideCookieContents = (BuildOverrideCookieContents) other;
        return Intrinsics.areEqual(this.meta, buildOverrideCookieContents.meta) && Intrinsics.areEqual(this.builds, buildOverrideCookieContents.builds);
    }

    @NotNull
    public final Map<String, BuildOverrideCookieBuild> getBuilds() {
        return this.builds;
    }

    @NotNull
    public final BuildOverrideCookieMeta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return this.builds.hashCode() + (this.meta.hashCode() * 31);
    }

    @NotNull
    public final WritableNativeMap toNativeMap() {
        Map<String, BuildOverrideCookieBuild> map = this.builds;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((BuildOverrideCookieBuild) entry.getValue()).toNativeMap());
        }
        WritableNativeMap nativeMap = NativeMapExtensionsKt.toNativeMap(linkedHashMap);
        NativeMapExtensionsKt.put(nativeMap, "$meta", this.meta.toNativeMap());
        return nativeMap;
    }

    @NotNull
    public String toString() {
        return "BuildOverrideCookieContents(meta=" + this.meta + ", builds=" + this.builds + ")";
    }
}
