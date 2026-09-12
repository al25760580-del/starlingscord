package com.discord.chat.bridge.botuikit;

import a3.e;
import a7.a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.d;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002?@Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013B}\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001J\u0013\u00102\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001J%\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006A"}, d2 = {"Lcom/discord/chat/bridge/botuikit/MentionableSelectComponent;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "type", "", StackTraceHelper.ID_KEY, "", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "customId", "placeholder", ViewProps.ACCESSIBILITY_LABEL, "minValues", "maxValues", "disabled", "", "selectedOptions", "", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "<init>", "(ILjava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()I", "getId", "()Ljava/lang/String;", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getCustomId", "getPlaceholder", "getAccessibilityLabel", "getMinValues", "getMaxValues", "getDisabled", "()Z", "getSelectedOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MentionableSelectComponent extends SearchableSelectComponent {
    private final String accessibilityLabel;

    @NotNull
    private final String customId;
    private final boolean disabled;

    @NotNull
    private final String id;
    private final int maxValues;
    private final int minValues;
    private final String placeholder;

    @NotNull
    private final List<SearchableSelectItem> selectedOptions;

    @NotNull
    private final ActionComponentState state;
    private final int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, null, l.a(m.f19486e, new a(19))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/MentionableSelectComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/MentionableSelectComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MentionableSelectComponent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MentionableSelectComponent(int i7, int i10, String str, ActionComponentState actionComponentState, String str2, String str3, String str4, int i11, int i12, boolean z5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
        if (719 != (i7 & 719)) {
            e1.l(i7, 719, MentionableSelectComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = i10;
        this.id = str;
        this.state = actionComponentState;
        this.customId = str2;
        if ((i7 & 16) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str3;
        }
        if ((i7 & 32) == 0) {
            this.accessibilityLabel = null;
        } else {
            this.accessibilityLabel = str4;
        }
        this.minValues = i11;
        this.maxValues = i12;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z5;
        }
        this.selectedOptions = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(SearchableSelectItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MentionableSelectComponent copy$default(MentionableSelectComponent mentionableSelectComponent, int i7, String str, ActionComponentState actionComponentState, String str2, String str3, String str4, int i10, int i11, boolean z5, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i7 = mentionableSelectComponent.type;
        }
        if ((i12 & 2) != 0) {
            str = mentionableSelectComponent.id;
        }
        if ((i12 & 4) != 0) {
            actionComponentState = mentionableSelectComponent.state;
        }
        if ((i12 & 8) != 0) {
            str2 = mentionableSelectComponent.customId;
        }
        if ((i12 & 16) != 0) {
            str3 = mentionableSelectComponent.placeholder;
        }
        if ((i12 & 32) != 0) {
            str4 = mentionableSelectComponent.accessibilityLabel;
        }
        if ((i12 & 64) != 0) {
            i10 = mentionableSelectComponent.minValues;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            i11 = mentionableSelectComponent.maxValues;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            z5 = mentionableSelectComponent.disabled;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            list = mentionableSelectComponent.selectedOptions;
        }
        boolean z6 = z5;
        List list2 = list;
        int i13 = i10;
        int i14 = i11;
        String str5 = str3;
        String str6 = str4;
        return mentionableSelectComponent.copy(i7, str, actionComponentState, str2, str5, str6, i13, i14, z6, list2);
    }

    public static final /* synthetic */ void write$Self$chat_release(MentionableSelectComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        SelectComponent.write$Self(self, output, serialDesc);
        Lazy[] lazyArr = $childSerializers;
        output.l(0, self.getType(), serialDesc);
        output.q(serialDesc, 1, self.getId());
        output.g(serialDesc, 2, ActionComponentState.Serializer.INSTANCE, self.getState());
        output.q(serialDesc, 3, self.getCustomId());
        if (output.u(serialDesc, 4) || self.getPlaceholder() != null) {
            output.r(serialDesc, 4, s1.f17602a, self.getPlaceholder());
        }
        if (output.u(serialDesc, 5) || self.getAccessibilityLabel() != null) {
            output.r(serialDesc, 5, s1.f17602a, self.getAccessibilityLabel());
        }
        output.l(6, self.getMinValues(), serialDesc);
        output.l(7, self.getMaxValues(), serialDesc);
        if (output.u(serialDesc, 8) || self.getDisabled()) {
            output.p(serialDesc, 8, self.getDisabled());
        }
        output.g(serialDesc, 9, (KSerializer) lazyArr[9].getValue(), self.getSelectedOptions());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final List<SearchableSelectItem> component10() {
        return this.selectedOptions;
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

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomId() {
        return this.customId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMinValues() {
        return this.minValues;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxValues() {
        return this.maxValues;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    @NotNull
    public final MentionableSelectComponent copy(int type, @NotNull String id2, @NotNull ActionComponentState state, @NotNull String customId, String placeholder, String accessibilityLabel, int minValues, int maxValues, boolean disabled, @NotNull List<SearchableSelectItem> selectedOptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(customId, "customId");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return new MentionableSelectComponent(type, id2, state, customId, placeholder, accessibilityLabel, minValues, maxValues, disabled, selectedOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MentionableSelectComponent)) {
            return false;
        }
        MentionableSelectComponent mentionableSelectComponent = (MentionableSelectComponent) other;
        return this.type == mentionableSelectComponent.type && Intrinsics.areEqual(this.id, mentionableSelectComponent.id) && this.state == mentionableSelectComponent.state && Intrinsics.areEqual(this.customId, mentionableSelectComponent.customId) && Intrinsics.areEqual(this.placeholder, mentionableSelectComponent.placeholder) && Intrinsics.areEqual(this.accessibilityLabel, mentionableSelectComponent.accessibilityLabel) && this.minValues == mentionableSelectComponent.minValues && this.maxValues == mentionableSelectComponent.maxValues && this.disabled == mentionableSelectComponent.disabled && Intrinsics.areEqual(this.selectedOptions, mentionableSelectComponent.selectedOptions);
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @Override // com.discord.chat.bridge.botuikit.BaseActionComponent
    @NotNull
    public String getCustomId() {
        return this.customId;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public boolean getDisabled() {
        return this.disabled;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public int getMaxValues() {
        return this.maxValues;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public int getMinValues() {
        return this.minValues;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.discord.chat.bridge.botuikit.SearchableSelectComponent
    @NotNull
    public List<SearchableSelectItem> getSelectedOptions() {
        return this.selectedOptions;
    }

    @Override // com.discord.chat.bridge.botuikit.BaseActionComponent
    @NotNull
    public ActionComponentState getState() {
        return this.state;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int iD = e.d((this.state.hashCode() + e.d(Integer.hashCode(this.type) * 31, 31, this.id)) * 31, 31, this.customId);
        String str = this.placeholder;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accessibilityLabel;
        return this.selectedOptions.hashCode() + com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.u(this.maxValues, com.discord.chat.presentation.list.a.u(this.minValues, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31, this.disabled);
    }

    @NotNull
    public String toString() {
        int i7 = this.type;
        String str = this.id;
        ActionComponentState actionComponentState = this.state;
        String str2 = this.customId;
        String str3 = this.placeholder;
        String str4 = this.accessibilityLabel;
        int i10 = this.minValues;
        int i11 = this.maxValues;
        boolean z5 = this.disabled;
        List<SearchableSelectItem> list = this.selectedOptions;
        StringBuilder sbO = com.discord.chat.presentation.list.a.o("MentionableSelectComponent(type=", ", id=", str, i7, ", state=");
        sbO.append(actionComponentState);
        sbO.append(", customId=");
        sbO.append(str2);
        sbO.append(", placeholder=");
        e.A(sbO, str3, ", accessibilityLabel=", str4, ", minValues=");
        e.z(sbO, i10, ", maxValues=", i11, ", disabled=");
        sbO.append(z5);
        sbO.append(", selectedOptions=");
        sbO.append(list);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ MentionableSelectComponent(int i7, String str, ActionComponentState actionComponentState, String str2, String str3, String str4, int i10, int i11, boolean z5, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, actionComponentState, str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, i10, i11, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z5, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionableSelectComponent(int i7, @NotNull String id2, @NotNull ActionComponentState state, @NotNull String customId, String str, String str2, int i10, int i11, boolean z5, @NotNull List<SearchableSelectItem> selectedOptions) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(customId, "customId");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        this.type = i7;
        this.id = id2;
        this.state = state;
        this.customId = customId;
        this.placeholder = str;
        this.accessibilityLabel = str2;
        this.minValues = i10;
        this.maxValues = i11;
        this.disabled = z5;
        this.selectedOptions = selectedOptions;
    }
}
