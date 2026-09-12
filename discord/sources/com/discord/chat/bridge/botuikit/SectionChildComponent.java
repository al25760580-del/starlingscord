package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f(with = Serializer.class)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \n*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0004\u0007\b\t\nR\u0014\u0010\u0004\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionChildComponent;", "T", "Lcom/discord/chat/bridge/botuikit/Component;", "", "component", "getComponent", "()Lcom/discord/chat/bridge/botuikit/Component;", "TextDisplay", "Unknown", "Serializer", "Companion", "Lcom/discord/chat/bridge/botuikit/SectionChildComponent$TextDisplay;", "Lcom/discord/chat/bridge/botuikit/SectionChildComponent$Unknown;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SectionChildComponent<T extends Component> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionChildComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SectionChildComponent;", "T", "typeSerial0", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            return Serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionChildComponent$Serializer;", "Lcom/discord/chat/bridge/botuikit/ComponentUnionSerializer;", "Lcom/discord/chat/bridge/botuikit/SectionChildComponent;", "<init>", "()V", "unionName", "", "getUnionName", "()Ljava/lang/String;", "toValue", "component", "Lcom/discord/chat/bridge/botuikit/Component;", "fromValue", "value", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Serializer extends ComponentUnionSerializer<SectionChildComponent<?>> {

        @NotNull
        public static final Serializer INSTANCE = new Serializer();

        @NotNull
        private static final String unionName = "SectionAccessory";

        private Serializer() {
        }

        @Override // com.discord.chat.bridge.botuikit.ComponentUnionSerializer
        @NotNull
        public String getUnionName() {
            return unionName;
        }

        @Override // com.discord.chat.bridge.botuikit.ComponentUnionSerializer
        public Component fromValue(@NotNull SectionChildComponent<?> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getComponent();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.discord.chat.bridge.botuikit.ComponentUnionSerializer
        @NotNull
        public SectionChildComponent<?> toValue(@NotNull Component component) {
            Intrinsics.checkNotNullParameter(component, "component");
            return component instanceof TextDisplayComponent ? TextDisplay.m315boximpl(TextDisplay.m316constructorimpl((TextDisplayComponent) component)) : new Unknown();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0003¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionChildComponent$TextDisplay;", "Lcom/discord/chat/bridge/botuikit/SectionChildComponent;", "Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "component", "constructor-impl", "(Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;)Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "getComponent", "()Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "equals", "", "other", "", "equals-impl", "(Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;)I", "toString", "", "toString-impl", "(Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;)Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextDisplay implements SectionChildComponent<TextDisplayComponent> {

        @NotNull
        private final TextDisplayComponent component;

        private /* synthetic */ TextDisplay(TextDisplayComponent textDisplayComponent) {
            this.component = textDisplayComponent;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ TextDisplay m315boximpl(TextDisplayComponent textDisplayComponent) {
            return new TextDisplay(textDisplayComponent);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static TextDisplayComponent m316constructorimpl(@NotNull TextDisplayComponent component) {
            Intrinsics.checkNotNullParameter(component, "component");
            return component;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m317equalsimpl(TextDisplayComponent textDisplayComponent, Object obj) {
            return (obj instanceof TextDisplay) && Intrinsics.areEqual(textDisplayComponent, ((TextDisplay) obj).m321unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m318equalsimpl0(TextDisplayComponent textDisplayComponent, TextDisplayComponent textDisplayComponent2) {
            return Intrinsics.areEqual(textDisplayComponent, textDisplayComponent2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m319hashCodeimpl(TextDisplayComponent textDisplayComponent) {
            return textDisplayComponent.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m320toStringimpl(TextDisplayComponent textDisplayComponent) {
            return "TextDisplay(component=" + textDisplayComponent + ")";
        }

        public boolean equals(Object obj) {
            return m317equalsimpl(this.component, obj);
        }

        public int hashCode() {
            return m319hashCodeimpl(this.component);
        }

        public String toString() {
            return m320toStringimpl(this.component);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ TextDisplayComponent m321unboximpl() {
            return this.component;
        }

        @Override // com.discord.chat.bridge.botuikit.SectionChildComponent
        @NotNull
        public TextDisplayComponent getComponent() {
            return this.component;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionChildComponent$Unknown;", "Lcom/discord/chat/bridge/botuikit/SectionChildComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "<init>", "()V", "component", "getComponent", "()Lcom/discord/chat/bridge/botuikit/Component;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unknown implements SectionChildComponent<Component> {
        private final Component component;

        @Override // com.discord.chat.bridge.botuikit.SectionChildComponent
        public Component getComponent() {
            return this.component;
        }
    }

    T getComponent();
}
