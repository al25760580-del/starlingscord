package com.discord.chat.bridge.botuikit;

import a3.e;
import a7.a;
import com.facebook.react.devsupport.StackTraceHelper;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\b\u0012\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0003J\r\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u000bHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\b\u0002\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionComponent;", "Lcom/discord/chat/bridge/botuikit/BaseLayoutComponent;", "type", "", StackTraceHelper.ID_KEY, "", "errorText", "components", "", "Lcom/discord/chat/bridge/botuikit/SectionChildComponent;", "accessory", "Lcom/discord/chat/bridge/botuikit/SectionAccessory;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/botuikit/SectionAccessory;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/botuikit/SectionAccessory;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()I", "getId", "()Ljava/lang/String;", "getErrorText", "getComponents", "()Ljava/util/List;", "getAccessory", "()Lcom/discord/chat/bridge/botuikit/SectionAccessory;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SectionComponent extends BaseLayoutComponent {

    @NotNull
    private final SectionAccessory<?> accessory;

    @NotNull
    private final List<SectionChildComponent<?>> components;
    private final String errorText;

    @NotNull
    private final String id;
    private final int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, l.a(m.f19486e, new a(22)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SectionComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SectionComponent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SectionComponent(int i7, int i10, String str, String str2, List list, SectionAccessory sectionAccessory, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (27 != (i7 & 27)) {
            e1.l(i7, 27, SectionComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = i10;
        this.id = str;
        if ((i7 & 4) == 0) {
            this.errorText = null;
        } else {
            this.errorText = str2;
        }
        this.components = list;
        this.accessory = sectionAccessory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(SectionChildComponent.Serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionComponent copy$default(SectionComponent sectionComponent, int i7, String str, String str2, List list, SectionAccessory sectionAccessory, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = sectionComponent.type;
        }
        if ((i10 & 2) != 0) {
            str = sectionComponent.id;
        }
        if ((i10 & 4) != 0) {
            str2 = sectionComponent.errorText;
        }
        if ((i10 & 8) != 0) {
            list = sectionComponent.components;
        }
        if ((i10 & 16) != 0) {
            sectionAccessory = sectionComponent.accessory;
        }
        SectionAccessory sectionAccessory2 = sectionAccessory;
        String str3 = str2;
        return sectionComponent.copy(i7, str, str3, list, sectionAccessory2);
    }

    public static final /* synthetic */ void write$Self$chat_release(SectionComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.l(0, self.getType(), serialDesc);
        output.q(serialDesc, 1, self.getId());
        if (output.u(serialDesc, 2) || self.getErrorText() != null) {
            output.r(serialDesc, 2, s1.f17602a, self.getErrorText());
        }
        output.g(serialDesc, 3, (KSerializer) lazyArr[3].getValue(), self.components);
        output.g(serialDesc, 4, SectionAccessory.Serializer.INSTANCE, self.accessory);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    @NotNull
    public final List<SectionChildComponent<?>> component4() {
        return this.components;
    }

    @NotNull
    public final SectionAccessory<?> component5() {
        return this.accessory;
    }

    @NotNull
    public final SectionComponent copy(int type, @NotNull String id2, String errorText, @NotNull List<? extends SectionChildComponent<?>> components, @NotNull SectionAccessory<?> accessory) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        return new SectionComponent(type, id2, errorText, components, accessory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionComponent)) {
            return false;
        }
        SectionComponent sectionComponent = (SectionComponent) other;
        return this.type == sectionComponent.type && Intrinsics.areEqual(this.id, sectionComponent.id) && Intrinsics.areEqual(this.errorText, sectionComponent.errorText) && Intrinsics.areEqual(this.components, sectionComponent.components) && Intrinsics.areEqual(this.accessory, sectionComponent.accessory);
    }

    @NotNull
    public final SectionAccessory<?> getAccessory() {
        return this.accessory;
    }

    @NotNull
    public final List<SectionChildComponent<?>> getComponents() {
        return this.components;
    }

    @Override // com.discord.chat.bridge.botuikit.BaseLayoutComponent
    public String getErrorText() {
        return this.errorText;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int iD = e.d(Integer.hashCode(this.type) * 31, 31, this.id);
        String str = this.errorText;
        return this.accessory.hashCode() + e.f(this.components, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i7 = this.type;
        String str = this.id;
        String str2 = this.errorText;
        List<SectionChildComponent<?>> list = this.components;
        SectionAccessory<?> sectionAccessory = this.accessory;
        StringBuilder sbO = com.discord.chat.presentation.list.a.o("SectionComponent(type=", ", id=", str, i7, ", errorText=");
        sbO.append(str2);
        sbO.append(", components=");
        sbO.append(list);
        sbO.append(", accessory=");
        sbO.append(sectionAccessory);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ SectionComponent(int i7, String str, String str2, List list, SectionAccessory sectionAccessory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, (i10 & 4) != 0 ? null : str2, list, sectionAccessory);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SectionComponent(int i7, @NotNull String id2, String str, @NotNull List<? extends SectionChildComponent<?>> components, @NotNull SectionAccessory<?> accessory) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.type = i7;
        this.id = id2;
        this.errorText = str;
        this.components = components;
        this.accessory = accessory;
    }
}
