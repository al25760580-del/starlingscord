package com.discord.chat.bridge.botuikit;

import a7.a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\bJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "<init>", "()V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "selectedOptions", "", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "getSelectedOptions", "()Ljava/util/List;", "getSelectedItems", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lcom/discord/chat/bridge/botuikit/ChannelSelectComponent;", "Lcom/discord/chat/bridge/botuikit/MentionableSelectComponent;", "Lcom/discord/chat/bridge/botuikit/RoleSelectComponent;", "Lcom/discord/chat/bridge/botuikit/UserSelectComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SearchableSelectComponent extends SelectComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy $cachedSerializer$delegate = l.a(m.f19486e, new a(21));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SearchableSelectComponent.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SearchableSelectComponent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.discord.chat.bridge.botuikit.SearchableSelectComponent", Reflection.getOrCreateKotlinClass(SearchableSelectComponent.class), new KClass[]{Reflection.getOrCreateKotlinClass(ChannelSelectComponent.class), Reflection.getOrCreateKotlinClass(MentionableSelectComponent.class), Reflection.getOrCreateKotlinClass(RoleSelectComponent.class), Reflection.getOrCreateKotlinClass(UserSelectComponent.class)}, new KSerializer[]{ChannelSelectComponent$$serializer.INSTANCE, MentionableSelectComponent$$serializer.INSTANCE, RoleSelectComponent$$serializer.INSTANCE, UserSelectComponent$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    @NotNull
    public List<SearchableSelectItem> getSelectedItems() {
        return getSelectedOptions();
    }

    @NotNull
    public abstract List<SearchableSelectItem> getSelectedOptions();

    public /* synthetic */ SearchableSelectComponent(int i7, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
    }

    private SearchableSelectComponent() {
        super(null);
    }
}
