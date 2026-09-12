package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/margelo/nitro/rive/ArtboardBy;", "", "type", "Lcom/margelo/nitro/rive/ArtboardByTypes;", "index", "", StackTraceHelper.NAME_KEY, "", "<init>", "(Lcom/margelo/nitro/rive/ArtboardByTypes;Ljava/lang/Double;Ljava/lang/String;)V", "getType", "()Lcom/margelo/nitro/rive/ArtboardByTypes;", "getIndex", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lcom/margelo/nitro/rive/ArtboardByTypes;Ljava/lang/Double;Ljava/lang/String;)Lcom/margelo/nitro/rive/ArtboardBy;", "equals", "", "other", "hashCode", "", "toString", "Companion", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArtboardBy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @xa.a
    @Keep
    private final Double index;

    @xa.a
    @Keep
    private final String name;

    @xa.a
    @Keep
    @NotNull
    private final ArtboardByTypes type;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/rive/ArtboardBy$Companion;", "", "Lcom/margelo/nitro/rive/ArtboardByTypes;", "type", "", "index", "", StackTraceHelper.NAME_KEY, "Lcom/margelo/nitro/rive/ArtboardBy;", "fromCpp", "(Lcom/margelo/nitro/rive/ArtboardByTypes;Ljava/lang/Double;Ljava/lang/String;)Lcom/margelo/nitro/rive/ArtboardBy;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        @xa.a
        @Keep
        public final ArtboardBy fromCpp(ArtboardByTypes type, Double index, String name) {
            return new ArtboardBy(type, index, name);
        }
    }

    public ArtboardBy(@NotNull ArtboardByTypes type, Double d6, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.index = d6;
        this.name = str;
    }

    public static /* synthetic */ ArtboardBy copy$default(ArtboardBy artboardBy, ArtboardByTypes artboardByTypes, Double d6, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            artboardByTypes = artboardBy.type;
        }
        if ((i7 & 2) != 0) {
            d6 = artboardBy.index;
        }
        if ((i7 & 4) != 0) {
            str = artboardBy.name;
        }
        return artboardBy.copy(artboardByTypes, d6, str);
    }

    @xa.a
    @Keep
    private static final ArtboardBy fromCpp(ArtboardByTypes artboardByTypes, Double d6, String str) {
        return INSTANCE.fromCpp(artboardByTypes, d6, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ArtboardByTypes getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ArtboardBy copy(@NotNull ArtboardByTypes type, Double index, String name) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ArtboardBy(type, index, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtboardBy)) {
            return false;
        }
        ArtboardBy artboardBy = (ArtboardBy) other;
        return this.type == artboardBy.type && Intrinsics.areEqual((Object) this.index, (Object) artboardBy.index) && Intrinsics.areEqual(this.name, artboardBy.name);
    }

    public final Double getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ArtboardByTypes getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Double d6 = this.index;
        int iHashCode2 = (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        String str = this.name;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ArtboardByTypes artboardByTypes = this.type;
        Double d6 = this.index;
        String str = this.name;
        StringBuilder sb2 = new StringBuilder("ArtboardBy(type=");
        sb2.append(artboardByTypes);
        sb2.append(", index=");
        sb2.append(d6);
        sb2.append(", name=");
        return com.discord.chat.presentation.list.a.k(sb2, str, ")");
    }
}
