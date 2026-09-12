package com.discord.chat.bridge.botuikit;

import a7.a;
import com.facebook.react.uimanager.ViewProps;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \"2\u00020\u0001:\u0001\"B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\bJ\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002#$¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SelectComponent;", "Lcom/discord/chat/bridge/botuikit/BaseActionComponent;", "<init>", "()V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "placeholder", "", "getPlaceholder", "()Ljava/lang/String;", ViewProps.ACCESSIBILITY_LABEL, "getAccessibilityLabel", "minValues", "getMinValues", "()I", "maxValues", "getMaxValues", "disabled", "", "getDisabled", "()Z", "getSelectedItems", "", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "Lcom/discord/chat/bridge/botuikit/StringSelectComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SelectComponent extends BaseActionComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy $cachedSerializer$delegate = l.a(m.f19486e, new a(23));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SelectComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SelectComponent.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SelectComponent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.discord.chat.bridge.botuikit.SelectComponent", Reflection.getOrCreateKotlinClass(SelectComponent.class), new KClass[]{Reflection.getOrCreateKotlinClass(ChannelSelectComponent.class), Reflection.getOrCreateKotlinClass(MentionableSelectComponent.class), Reflection.getOrCreateKotlinClass(RoleSelectComponent.class), Reflection.getOrCreateKotlinClass(UserSelectComponent.class), Reflection.getOrCreateKotlinClass(StringSelectComponent.class)}, new KSerializer[]{ChannelSelectComponent$$serializer.INSTANCE, MentionableSelectComponent$$serializer.INSTANCE, RoleSelectComponent$$serializer.INSTANCE, UserSelectComponent$$serializer.INSTANCE, StringSelectComponent$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(SelectComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
    }

    public abstract String getAccessibilityLabel();

    public abstract boolean getDisabled();

    public abstract int getMaxValues();

    public abstract int getMinValues();

    public abstract String getPlaceholder();

    @NotNull
    public abstract List<SelectItem> getSelectedItems();

    public /* synthetic */ SelectComponent(int i7, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
    }

    private SelectComponent() {
        super(null);
    }
}
