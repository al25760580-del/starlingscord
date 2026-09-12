package com.discord.chat.bridge.botuikit;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002@ABm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jw\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b¨\u0006B"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "Lcom/discord/chat/bridge/botuikit/BaseActionComponent;", "type", "", StackTraceHelper.ID_KEY, "", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "customId", "label", "style", "Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "disabled", "", "emoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "url", "skuId", "<init>", "(ILjava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()I", "getId", "()Ljava/lang/String;", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getCustomId", "getLabel", "getStyle", "()Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "getDisabled", "()Z", "getEmoji", "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "getUrl", "getSkuId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ButtonComponent extends BaseActionComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String customId;
    private final boolean disabled;
    private final ComponentEmoji emoji;

    @NotNull
    private final String id;
    private final String label;
    private final String skuId;

    @NotNull
    private final ActionComponentState state;

    @NotNull
    private final ButtonStyle style;
    private final int type;
    private final String url;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ButtonComponent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ButtonComponent(int i7, int i10, String str, ActionComponentState actionComponentState, String str2, String str3, ButtonStyle buttonStyle, boolean z5, ComponentEmoji componentEmoji, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (39 != (i7 & 39)) {
            e1.l(i7, 39, ButtonComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = i10;
        this.id = str;
        this.state = actionComponentState;
        if ((i7 & 8) == 0) {
            this.customId = null;
        } else {
            this.customId = str2;
        }
        if ((i7 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        this.style = buttonStyle;
        if ((i7 & 64) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.emoji = null;
        } else {
            this.emoji = componentEmoji;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.url = null;
        } else {
            this.url = str4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.skuId = null;
        } else {
            this.skuId = str5;
        }
    }

    public static /* synthetic */ ButtonComponent copy$default(ButtonComponent buttonComponent, int i7, String str, ActionComponentState actionComponentState, String str2, String str3, ButtonStyle buttonStyle, boolean z5, ComponentEmoji componentEmoji, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = buttonComponent.type;
        }
        if ((i10 & 2) != 0) {
            str = buttonComponent.id;
        }
        if ((i10 & 4) != 0) {
            actionComponentState = buttonComponent.state;
        }
        if ((i10 & 8) != 0) {
            str2 = buttonComponent.customId;
        }
        if ((i10 & 16) != 0) {
            str3 = buttonComponent.label;
        }
        if ((i10 & 32) != 0) {
            buttonStyle = buttonComponent.style;
        }
        if ((i10 & 64) != 0) {
            z5 = buttonComponent.disabled;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            componentEmoji = buttonComponent.emoji;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str4 = buttonComponent.url;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            str5 = buttonComponent.skuId;
        }
        String str6 = str4;
        String str7 = str5;
        boolean z6 = z5;
        ComponentEmoji componentEmoji2 = componentEmoji;
        String str8 = str3;
        ButtonStyle buttonStyle2 = buttonStyle;
        return buttonComponent.copy(i7, str, actionComponentState, str2, str8, buttonStyle2, z6, componentEmoji2, str6, str7);
    }

    public static final /* synthetic */ void write$Self$chat_release(ButtonComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getType(), serialDesc);
        output.q(serialDesc, 1, self.getId());
        output.g(serialDesc, 2, ActionComponentState.Serializer.INSTANCE, self.getState());
        if (output.u(serialDesc, 3) || self.getCustomId() != null) {
            output.r(serialDesc, 3, s1.f17602a, self.getCustomId());
        }
        if (output.u(serialDesc, 4) || self.label != null) {
            output.r(serialDesc, 4, s1.f17602a, self.label);
        }
        output.g(serialDesc, 5, ButtonStyle.Serializer.INSTANCE, self.style);
        if (output.u(serialDesc, 6) || self.disabled) {
            output.p(serialDesc, 6, self.disabled);
        }
        if (output.u(serialDesc, 7) || self.emoji != null) {
            output.r(serialDesc, 7, ComponentEmoji$$serializer.INSTANCE, self.emoji);
        }
        if (output.u(serialDesc, 8) || self.url != null) {
            output.r(serialDesc, 8, s1.f17602a, self.url);
        }
        if (!output.u(serialDesc, 9) && self.skuId == null) {
            return;
        }
        output.r(serialDesc, 9, s1.f17602a, self.skuId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ActionComponentState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomId() {
        return this.customId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ButtonStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ComponentEmoji getEmoji() {
        return this.emoji;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final ButtonComponent copy(int type, @NotNull String id2, @NotNull ActionComponentState state, String customId, String label, @NotNull ButtonStyle style, boolean disabled, ComponentEmoji emoji, String url, String skuId) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(style, "style");
        return new ButtonComponent(type, id2, state, customId, label, style, disabled, emoji, url, skuId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonComponent)) {
            return false;
        }
        ButtonComponent buttonComponent = (ButtonComponent) other;
        return this.type == buttonComponent.type && Intrinsics.areEqual(this.id, buttonComponent.id) && this.state == buttonComponent.state && Intrinsics.areEqual(this.customId, buttonComponent.customId) && Intrinsics.areEqual(this.label, buttonComponent.label) && this.style == buttonComponent.style && this.disabled == buttonComponent.disabled && Intrinsics.areEqual(this.emoji, buttonComponent.emoji) && Intrinsics.areEqual(this.url, buttonComponent.url) && Intrinsics.areEqual(this.skuId, buttonComponent.skuId);
    }

    @Override // com.discord.chat.bridge.botuikit.BaseActionComponent
    public String getCustomId() {
        return this.customId;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final ComponentEmoji getEmoji() {
        return this.emoji;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    @NotNull
    public String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    @Override // com.discord.chat.bridge.botuikit.BaseActionComponent
    @NotNull
    public ActionComponentState getState() {
        return this.state;
    }

    @NotNull
    public final ButtonStyle getStyle() {
        return this.style;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = (this.state.hashCode() + e.d(Integer.hashCode(this.type) * 31, 31, this.id)) * 31;
        String str = this.customId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iG = a.g((this.style.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.disabled);
        ComponentEmoji componentEmoji = this.emoji;
        int iHashCode3 = (iG + (componentEmoji == null ? 0 : componentEmoji.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.skuId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i7 = this.type;
        String str = this.id;
        ActionComponentState actionComponentState = this.state;
        String str2 = this.customId;
        String str3 = this.label;
        ButtonStyle buttonStyle = this.style;
        boolean z5 = this.disabled;
        ComponentEmoji componentEmoji = this.emoji;
        String str4 = this.url;
        String str5 = this.skuId;
        StringBuilder sbO = a.o("ButtonComponent(type=", ", id=", str, i7, ", state=");
        sbO.append(actionComponentState);
        sbO.append(", customId=");
        sbO.append(str2);
        sbO.append(", label=");
        sbO.append(str3);
        sbO.append(", style=");
        sbO.append(buttonStyle);
        sbO.append(", disabled=");
        sbO.append(z5);
        sbO.append(", emoji=");
        sbO.append(componentEmoji);
        sbO.append(", url=");
        return a.l(sbO, str4, ", skuId=", str5, ")");
    }

    public /* synthetic */ ButtonComponent(int i7, String str, ActionComponentState actionComponentState, String str2, String str3, ButtonStyle buttonStyle, boolean z5, ComponentEmoji componentEmoji, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, actionComponentState, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, buttonStyle, (i10 & 64) != 0 ? false : z5, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : componentEmoji, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str4, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonComponent(int i7, @NotNull String id2, @NotNull ActionComponentState state, String str, String str2, @NotNull ButtonStyle style, boolean z5, ComponentEmoji componentEmoji, String str3, String str4) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(style, "style");
        this.type = i7;
        this.id = id2;
        this.state = state;
        this.customId = str;
        this.label = str2;
        this.style = style;
        this.disabled = z5;
        this.emoji = componentEmoji;
        this.url = str3;
        this.skuId = str4;
    }
}
