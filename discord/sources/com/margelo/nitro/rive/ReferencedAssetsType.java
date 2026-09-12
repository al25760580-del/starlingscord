package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/margelo/nitro/rive/ReferencedAssetsType;", "", "data", "", "", "Lcom/margelo/nitro/rive/ResolvedReferencedAsset;", "<init>", "(Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReferencedAssetsType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @xa.a
    @Keep
    private final Map<String, ResolvedReferencedAsset> data;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/rive/ReferencedAssetsType$Companion;", "", "", "", "Lcom/margelo/nitro/rive/ResolvedReferencedAsset;", "data", "Lcom/margelo/nitro/rive/ReferencedAssetsType;", "fromCpp", "(Ljava/util/Map;)Lcom/margelo/nitro/rive/ReferencedAssetsType;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        @xa.a
        @Keep
        public final ReferencedAssetsType fromCpp(Map<String, ResolvedReferencedAsset> data) {
            return new ReferencedAssetsType(data);
        }
    }

    public ReferencedAssetsType(Map<String, ResolvedReferencedAsset> map) {
        this.data = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferencedAssetsType copy$default(ReferencedAssetsType referencedAssetsType, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            map = referencedAssetsType.data;
        }
        return referencedAssetsType.copy(map);
    }

    @xa.a
    @Keep
    private static final ReferencedAssetsType fromCpp(Map<String, ResolvedReferencedAsset> map) {
        return INSTANCE.fromCpp(map);
    }

    public final Map<String, ResolvedReferencedAsset> component1() {
        return this.data;
    }

    @NotNull
    public final ReferencedAssetsType copy(Map<String, ResolvedReferencedAsset> data) {
        return new ReferencedAssetsType(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReferencedAssetsType) && Intrinsics.areEqual(this.data, ((ReferencedAssetsType) other).data);
    }

    public final Map<String, ResolvedReferencedAsset> getData() {
        return this.data;
    }

    public int hashCode() {
        Map<String, ResolvedReferencedAsset> map = this.data;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReferencedAssetsType(data=" + this.data + ")";
    }
}
