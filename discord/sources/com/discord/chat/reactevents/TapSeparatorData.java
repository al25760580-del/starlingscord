package com.discord.chat.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/reactevents/TapSeparatorData;", "Lcom/discord/reactevents/ReactEvent;", "type", "", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getContext", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapSeparatorData implements ReactEvent {
    private final String context;

    @NotNull
    private final String type;

    public TapSeparatorData(@NotNull String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.context = str;
    }

    public static /* synthetic */ TapSeparatorData copy$default(TapSeparatorData tapSeparatorData, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tapSeparatorData.type;
        }
        if ((i7 & 2) != 0) {
            str2 = tapSeparatorData.context;
        }
        return tapSeparatorData.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final TapSeparatorData copy(@NotNull String type, String context) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new TapSeparatorData(type, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapSeparatorData)) {
            return false;
        }
        TapSeparatorData tapSeparatorData = (TapSeparatorData) other;
        return Intrinsics.areEqual(this.type, tapSeparatorData.type) && Intrinsics.areEqual(this.context, tapSeparatorData.context);
    }

    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.context;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        WritableNativeMap writableNativeMapNativeMapOf = NativeMapExtensionsKt.nativeMapOf(new Pair("type", this.type));
        String str = this.context;
        if (str != null) {
            writableNativeMapNativeMapOf.putString("context", str);
        }
        return writableNativeMapNativeMapOf;
    }

    @NotNull
    public String toString() {
        return g.f("TapSeparatorData(type=", this.type, ", context=", this.context, ")");
    }

    public /* synthetic */ TapSeparatorData(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : str2);
    }
}
