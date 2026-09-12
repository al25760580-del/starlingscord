package com.discord.chat.bridge.botuikit;

import a3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00065"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "label", "", "value", "type", "Lcom/discord/chat/bridge/botuikit/SelectOptionType;", "iconSrc", "iconColor", "", "iconEmoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/SelectOptionType;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/SelectOptionType;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getType", "()Lcom/discord/chat/bridge/botuikit/SelectOptionType;", "getIconSrc", "getIconColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconEmoji", "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/SelectOptionType;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;)Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SearchableSelectItem extends SelectItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer iconColor;
    private final ComponentEmoji iconEmoji;
    private final String iconSrc;

    @NotNull
    private final String label;

    @NotNull
    private final SelectOptionType type;

    @NotNull
    private final String value;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SearchableSelectItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchableSelectItem(int i7, String str, String str2, SelectOptionType selectOptionType, String str3, Integer num, ComponentEmoji componentEmoji, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, SearchableSelectItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.label = str;
        this.value = str2;
        this.type = selectOptionType;
        if ((i7 & 8) == 0) {
            this.iconSrc = null;
        } else {
            this.iconSrc = str3;
        }
        if ((i7 & 16) == 0) {
            this.iconColor = null;
        } else {
            this.iconColor = num;
        }
        if ((i7 & 32) == 0) {
            this.iconEmoji = null;
        } else {
            this.iconEmoji = componentEmoji;
        }
    }

    public static /* synthetic */ SearchableSelectItem copy$default(SearchableSelectItem searchableSelectItem, String str, String str2, SelectOptionType selectOptionType, String str3, Integer num, ComponentEmoji componentEmoji, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = searchableSelectItem.label;
        }
        if ((i7 & 2) != 0) {
            str2 = searchableSelectItem.value;
        }
        if ((i7 & 4) != 0) {
            selectOptionType = searchableSelectItem.type;
        }
        if ((i7 & 8) != 0) {
            str3 = searchableSelectItem.iconSrc;
        }
        if ((i7 & 16) != 0) {
            num = searchableSelectItem.iconColor;
        }
        if ((i7 & 32) != 0) {
            componentEmoji = searchableSelectItem.iconEmoji;
        }
        Integer num2 = num;
        ComponentEmoji componentEmoji2 = componentEmoji;
        return searchableSelectItem.copy(str, str2, selectOptionType, str3, num2, componentEmoji2);
    }

    public static final /* synthetic */ void write$Self$chat_release(SearchableSelectItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        SelectItem.write$Self(self, output, serialDesc);
        output.q(serialDesc, 0, self.getLabel());
        output.q(serialDesc, 1, self.getValue());
        output.g(serialDesc, 2, SelectOptionType.Serializer.INSTANCE, self.type);
        if (output.u(serialDesc, 3) || self.iconSrc != null) {
            output.r(serialDesc, 3, s1.f17602a, self.iconSrc);
        }
        if (output.u(serialDesc, 4) || self.iconColor != null) {
            output.r(serialDesc, 4, m0.f17573a, self.iconColor);
        }
        if (!output.u(serialDesc, 5) && self.iconEmoji == null) {
            return;
        }
        output.r(serialDesc, 5, ComponentEmoji$$serializer.INSTANCE, self.iconEmoji);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SelectOptionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconSrc() {
        return this.iconSrc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ComponentEmoji getIconEmoji() {
        return this.iconEmoji;
    }

    @NotNull
    public final SearchableSelectItem copy(@NotNull String label, @NotNull String value, @NotNull SelectOptionType type, String iconSrc, Integer iconColor, ComponentEmoji iconEmoji) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SearchableSelectItem(label, value, type, iconSrc, iconColor, iconEmoji);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchableSelectItem)) {
            return false;
        }
        SearchableSelectItem searchableSelectItem = (SearchableSelectItem) other;
        return Intrinsics.areEqual(this.label, searchableSelectItem.label) && Intrinsics.areEqual(this.value, searchableSelectItem.value) && this.type == searchableSelectItem.type && Intrinsics.areEqual(this.iconSrc, searchableSelectItem.iconSrc) && Intrinsics.areEqual(this.iconColor, searchableSelectItem.iconColor) && Intrinsics.areEqual(this.iconEmoji, searchableSelectItem.iconEmoji);
    }

    public final Integer getIconColor() {
        return this.iconColor;
    }

    public final ComponentEmoji getIconEmoji() {
        return this.iconEmoji;
    }

    public final String getIconSrc() {
        return this.iconSrc;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    @NotNull
    public String getLabel() {
        return this.label;
    }

    @NotNull
    public final SelectOptionType getType() {
        return this.type;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    @NotNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + e.d(this.label.hashCode() * 31, 31, this.value)) * 31;
        String str = this.iconSrc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.iconColor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ComponentEmoji componentEmoji = this.iconEmoji;
        return iHashCode3 + (componentEmoji != null ? componentEmoji.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.label;
        String str2 = this.value;
        SelectOptionType selectOptionType = this.type;
        String str3 = this.iconSrc;
        Integer num = this.iconColor;
        ComponentEmoji componentEmoji = this.iconEmoji;
        StringBuilder sbU = e.u("SearchableSelectItem(label=", str, ", value=", str2, ", type=");
        sbU.append(selectOptionType);
        sbU.append(", iconSrc=");
        sbU.append(str3);
        sbU.append(", iconColor=");
        sbU.append(num);
        sbU.append(", iconEmoji=");
        sbU.append(componentEmoji);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ SearchableSelectItem(String str, String str2, SelectOptionType selectOptionType, String str3, Integer num, ComponentEmoji componentEmoji, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, selectOptionType, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : num, (i7 & 32) != 0 ? null : componentEmoji);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchableSelectItem(@NotNull String label, @NotNull String value, @NotNull SelectOptionType type, String str, Integer num, ComponentEmoji componentEmoji) {
        super(null);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.label = label;
        this.value = value;
        this.type = type;
        this.iconSrc = str;
        this.iconColor = num;
        this.iconEmoji = componentEmoji;
    }
}
