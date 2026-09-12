package com.discord.bundle_updater;

import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.h0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tBQ\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006'"}, d2 = {"Lcom/discord/bundle_updater/AppManifest;", "", "metadata", "Lcom/discord/bundle_updater/AppManifestMetadata;", "hashes", "", "", "patches", "<init>", "(Lcom/discord/bundle_updater/AppManifestMetadata;Ljava/util/Map;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/bundle_updater/AppManifestMetadata;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMetadata", "()Lcom/discord/bundle_updater/AppManifestMetadata;", "getHashes", "()Ljava/util/Map;", "getPatches", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$bundle_updater_release", "$serializer", "Companion", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AppManifest {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, String> hashes;

    @NotNull
    private final AppManifestMetadata metadata;

    @NotNull
    private final Map<String, String> patches;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/bundle_updater/AppManifest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/AppManifest;", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AppManifest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{null, l.a(mVar, new a7.a(6)), l.a(mVar, new a7.a(7))};
    }

    public /* synthetic */ AppManifest(int i7, AppManifestMetadata appManifestMetadata, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, AppManifest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.metadata = appManifestMetadata;
        if ((i7 & 2) == 0) {
            this.hashes = w0.d();
        } else {
            this.hashes = map;
        }
        if ((i7 & 4) == 0) {
            this.patches = w0.d();
        } else {
            this.patches = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        s1 s1Var = s1.f17602a;
        return new h0(s1Var, s1Var, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        s1 s1Var = s1.f17602a;
        return new h0(s1Var, s1Var, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppManifest copy$default(AppManifest appManifest, AppManifestMetadata appManifestMetadata, Map map, Map map2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            appManifestMetadata = appManifest.metadata;
        }
        if ((i7 & 2) != 0) {
            map = appManifest.hashes;
        }
        if ((i7 & 4) != 0) {
            map2 = appManifest.patches;
        }
        return appManifest.copy(appManifestMetadata, map, map2);
    }

    public static final /* synthetic */ void write$Self$bundle_updater_release(AppManifest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, AppManifestMetadata$$serializer.INSTANCE, self.metadata);
        if (output.u(serialDesc, 1) || !Intrinsics.areEqual(self.hashes, w0.d())) {
            output.g(serialDesc, 1, (KSerializer) lazyArr[1].getValue(), self.hashes);
        }
        if (!output.u(serialDesc, 2) && Intrinsics.areEqual(self.patches, w0.d())) {
            return;
        }
        output.g(serialDesc, 2, (KSerializer) lazyArr[2].getValue(), self.patches);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppManifestMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.hashes;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.patches;
    }

    @NotNull
    public final AppManifest copy(@NotNull AppManifestMetadata metadata, @NotNull Map<String, String> hashes, @NotNull Map<String, String> patches) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(hashes, "hashes");
        Intrinsics.checkNotNullParameter(patches, "patches");
        return new AppManifest(metadata, hashes, patches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppManifest)) {
            return false;
        }
        AppManifest appManifest = (AppManifest) other;
        return Intrinsics.areEqual(this.metadata, appManifest.metadata) && Intrinsics.areEqual(this.hashes, appManifest.hashes) && Intrinsics.areEqual(this.patches, appManifest.patches);
    }

    @NotNull
    public final Map<String, String> getHashes() {
        return this.hashes;
    }

    @NotNull
    public final AppManifestMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Map<String, String> getPatches() {
        return this.patches;
    }

    public int hashCode() {
        return this.patches.hashCode() + ((this.hashes.hashCode() + (this.metadata.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AppManifest(metadata=" + this.metadata + ", hashes=" + this.hashes + ", patches=" + this.patches + ")";
    }

    public AppManifest(@NotNull AppManifestMetadata metadata, @NotNull Map<String, String> hashes, @NotNull Map<String, String> patches) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(hashes, "hashes");
        Intrinsics.checkNotNullParameter(patches, "patches");
        this.metadata = metadata;
        this.hashes = hashes;
        this.patches = patches;
    }

    public /* synthetic */ AppManifest(AppManifestMetadata appManifestMetadata, Map map, Map map2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(appManifestMetadata, (i7 & 2) != 0 ? w0.d() : map, (i7 & 4) != 0 ? w0.d() : map2);
    }
}
