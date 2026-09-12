package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J^\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, d2 = {"Lcom/margelo/nitro/rive/UnifiedRiveEvent;", "", StackTraceHelper.NAME_KEY, "", "type", "Lcom/margelo/nitro/rive/RiveEventType;", "delay", "", "properties", "", "Lcom/margelo/nitro/rive/EventPropertiesOutput;", "url", "target", "<init>", "(Ljava/lang/String;Lcom/margelo/nitro/rive/RiveEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/margelo/nitro/rive/RiveEventType;", "getDelay", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProperties", "()Ljava/util/Map;", "getUrl", "getTarget", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/margelo/nitro/rive/RiveEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/margelo/nitro/rive/UnifiedRiveEvent;", "equals", "", "other", "hashCode", "", "toString", "Companion", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UnifiedRiveEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @xa.a
    @Keep
    private final Double delay;

    @xa.a
    @Keep
    @NotNull
    private final String name;

    @xa.a
    @Keep
    private final Map<String, EventPropertiesOutput> properties;

    @xa.a
    @Keep
    private final String target;

    @xa.a
    @Keep
    @NotNull
    private final RiveEventType type;

    @xa.a
    @Keep
    private final String url;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JS\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/rive/UnifiedRiveEvent$Companion;", "", "", StackTraceHelper.NAME_KEY, "Lcom/margelo/nitro/rive/RiveEventType;", "type", "", "delay", "", "Lcom/margelo/nitro/rive/EventPropertiesOutput;", "properties", "url", "target", "Lcom/margelo/nitro/rive/UnifiedRiveEvent;", "fromCpp", "(Ljava/lang/String;Lcom/margelo/nitro/rive/RiveEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/margelo/nitro/rive/UnifiedRiveEvent;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        @xa.a
        @Keep
        public final UnifiedRiveEvent fromCpp(String name, RiveEventType type, Double delay, Map<String, ? extends EventPropertiesOutput> properties, String url, String target) {
            return new UnifiedRiveEvent(name, type, delay, properties, url, target);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedRiveEvent(@NotNull String name, @NotNull RiveEventType type, Double d6, Map<String, ? extends EventPropertiesOutput> map, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.name = name;
        this.type = type;
        this.delay = d6;
        this.properties = map;
        this.url = str;
        this.target = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifiedRiveEvent copy$default(UnifiedRiveEvent unifiedRiveEvent, String str, RiveEventType riveEventType, Double d6, Map map, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = unifiedRiveEvent.name;
        }
        if ((i7 & 2) != 0) {
            riveEventType = unifiedRiveEvent.type;
        }
        if ((i7 & 4) != 0) {
            d6 = unifiedRiveEvent.delay;
        }
        if ((i7 & 8) != 0) {
            map = unifiedRiveEvent.properties;
        }
        if ((i7 & 16) != 0) {
            str2 = unifiedRiveEvent.url;
        }
        if ((i7 & 32) != 0) {
            str3 = unifiedRiveEvent.target;
        }
        String str4 = str2;
        String str5 = str3;
        return unifiedRiveEvent.copy(str, riveEventType, d6, map, str4, str5);
    }

    @xa.a
    @Keep
    private static final UnifiedRiveEvent fromCpp(String str, RiveEventType riveEventType, Double d6, Map<String, ? extends EventPropertiesOutput> map, String str2, String str3) {
        return INSTANCE.fromCpp(str, riveEventType, d6, map, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RiveEventType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getDelay() {
        return this.delay;
    }

    public final Map<String, EventPropertiesOutput> component4() {
        return this.properties;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    @NotNull
    public final UnifiedRiveEvent copy(@NotNull String name, @NotNull RiveEventType type, Double delay, Map<String, ? extends EventPropertiesOutput> properties, String url, String target) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new UnifiedRiveEvent(name, type, delay, properties, url, target);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedRiveEvent)) {
            return false;
        }
        UnifiedRiveEvent unifiedRiveEvent = (UnifiedRiveEvent) other;
        return Intrinsics.areEqual(this.name, unifiedRiveEvent.name) && this.type == unifiedRiveEvent.type && Intrinsics.areEqual((Object) this.delay, (Object) unifiedRiveEvent.delay) && Intrinsics.areEqual(this.properties, unifiedRiveEvent.properties) && Intrinsics.areEqual(this.url, unifiedRiveEvent.url) && Intrinsics.areEqual(this.target, unifiedRiveEvent.target);
    }

    public final Double getDelay() {
        return this.delay;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final Map<String, EventPropertiesOutput> getProperties() {
        return this.properties;
    }

    public final String getTarget() {
        return this.target;
    }

    @NotNull
    public final RiveEventType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.name.hashCode() * 31)) * 31;
        Double d6 = this.delay;
        int iHashCode2 = (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        Map<String, EventPropertiesOutput> map = this.properties;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.url;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.target;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        RiveEventType riveEventType = this.type;
        Double d6 = this.delay;
        Map<String, EventPropertiesOutput> map = this.properties;
        String str2 = this.url;
        String str3 = this.target;
        StringBuilder sb2 = new StringBuilder("UnifiedRiveEvent(name=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(riveEventType);
        sb2.append(", delay=");
        sb2.append(d6);
        sb2.append(", properties=");
        sb2.append(map);
        sb2.append(", url=");
        return com.discord.chat.presentation.list.a.l(sb2, str2, ", target=", str3, ")");
    }
}
