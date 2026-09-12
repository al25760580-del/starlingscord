package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f(with = Serializer.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u000b*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0005\u0007\b\t\n\u000bR\u0014\u0010\u0004\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionAccessory;", "T", "Lcom/discord/chat/bridge/botuikit/Component;", "", "component", "getComponent", "()Lcom/discord/chat/bridge/botuikit/Component;", "Button", "Thumbnail", "Unknown", "Serializer", "Companion", "Lcom/discord/chat/bridge/botuikit/SectionAccessory$Button;", "Lcom/discord/chat/bridge/botuikit/SectionAccessory$Thumbnail;", "Lcom/discord/chat/bridge/botuikit/SectionAccessory$Unknown;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SectionAccessory<T extends Component> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0003¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionAccessory$Button;", "Lcom/discord/chat/bridge/botuikit/SectionAccessory;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "component", "constructor-impl", "(Lcom/discord/chat/bridge/botuikit/ButtonComponent;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "getComponent", "()Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "equals", "", "other", "", "equals-impl", "(Lcom/discord/chat/bridge/botuikit/ButtonComponent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/discord/chat/bridge/botuikit/ButtonComponent;)I", "toString", "", "toString-impl", "(Lcom/discord/chat/bridge/botuikit/ButtonComponent;)Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements SectionAccessory<ButtonComponent> {

        @NotNull
        private final ButtonComponent component;

        private /* synthetic */ Button(ButtonComponent buttonComponent) {
            this.component = buttonComponent;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Button m301boximpl(ButtonComponent buttonComponent) {
            return new Button(buttonComponent);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ButtonComponent m302constructorimpl(@NotNull ButtonComponent component) {
            Intrinsics.checkNotNullParameter(component, "component");
            return component;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m303equalsimpl(ButtonComponent buttonComponent, Object obj) {
            return (obj instanceof Button) && Intrinsics.areEqual(buttonComponent, ((Button) obj).m307unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m304equalsimpl0(ButtonComponent buttonComponent, ButtonComponent buttonComponent2) {
            return Intrinsics.areEqual(buttonComponent, buttonComponent2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m305hashCodeimpl(ButtonComponent buttonComponent) {
            return buttonComponent.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m306toStringimpl(ButtonComponent buttonComponent) {
            return "Button(component=" + buttonComponent + ")";
        }

        public boolean equals(Object obj) {
            return m303equalsimpl(this.component, obj);
        }

        public int hashCode() {
            return m305hashCodeimpl(this.component);
        }

        public String toString() {
            return m306toStringimpl(this.component);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ButtonComponent m307unboximpl() {
            return this.component;
        }

        @Override // com.discord.chat.bridge.botuikit.SectionAccessory
        @NotNull
        public ButtonComponent getComponent() {
            return this.component;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionAccessory$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SectionAccessory;", "T", "typeSerial0", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionAccessory$Serializer;", "Lcom/discord/chat/bridge/botuikit/ComponentUnionSerializer;", "Lcom/discord/chat/bridge/botuikit/SectionAccessory;", "<init>", "()V", "unionName", "", "getUnionName", "()Ljava/lang/String;", "toValue", "component", "Lcom/discord/chat/bridge/botuikit/Component;", "fromValue", "value", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Serializer extends ComponentUnionSerializer<SectionAccessory<?>> {

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
        public Component fromValue(@NotNull SectionAccessory<?> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getComponent();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.discord.chat.bridge.botuikit.ComponentUnionSerializer
        @NotNull
        public SectionAccessory<?> toValue(@NotNull Component component) {
            Intrinsics.checkNotNullParameter(component, "component");
            if (component instanceof ButtonComponent) {
                return Button.m301boximpl(Button.m302constructorimpl((ButtonComponent) component));
            }
            return component instanceof ThumbnailDisplayComponent ? Thumbnail.m308boximpl(Thumbnail.m309constructorimpl((ThumbnailDisplayComponent) component)) : new Unknown();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0003¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionAccessory$Thumbnail;", "Lcom/discord/chat/bridge/botuikit/SectionAccessory;", "Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "component", "constructor-impl", "(Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;)Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "getComponent", "()Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "equals", "", "other", "", "equals-impl", "(Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;)I", "toString", "", "toString-impl", "(Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;)Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Thumbnail implements SectionAccessory<ThumbnailDisplayComponent> {

        @NotNull
        private final ThumbnailDisplayComponent component;

        private /* synthetic */ Thumbnail(ThumbnailDisplayComponent thumbnailDisplayComponent) {
            this.component = thumbnailDisplayComponent;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Thumbnail m308boximpl(ThumbnailDisplayComponent thumbnailDisplayComponent) {
            return new Thumbnail(thumbnailDisplayComponent);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ThumbnailDisplayComponent m309constructorimpl(@NotNull ThumbnailDisplayComponent component) {
            Intrinsics.checkNotNullParameter(component, "component");
            return component;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m310equalsimpl(ThumbnailDisplayComponent thumbnailDisplayComponent, Object obj) {
            return (obj instanceof Thumbnail) && Intrinsics.areEqual(thumbnailDisplayComponent, ((Thumbnail) obj).m314unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m311equalsimpl0(ThumbnailDisplayComponent thumbnailDisplayComponent, ThumbnailDisplayComponent thumbnailDisplayComponent2) {
            return Intrinsics.areEqual(thumbnailDisplayComponent, thumbnailDisplayComponent2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m312hashCodeimpl(ThumbnailDisplayComponent thumbnailDisplayComponent) {
            return thumbnailDisplayComponent.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m313toStringimpl(ThumbnailDisplayComponent thumbnailDisplayComponent) {
            return "Thumbnail(component=" + thumbnailDisplayComponent + ")";
        }

        public boolean equals(Object obj) {
            return m310equalsimpl(this.component, obj);
        }

        public int hashCode() {
            return m312hashCodeimpl(this.component);
        }

        public String toString() {
            return m313toStringimpl(this.component);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ThumbnailDisplayComponent m314unboximpl() {
            return this.component;
        }

        @Override // com.discord.chat.bridge.botuikit.SectionAccessory
        @NotNull
        public ThumbnailDisplayComponent getComponent() {
            return this.component;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SectionAccessory$Unknown;", "Lcom/discord/chat/bridge/botuikit/SectionAccessory;", "Lcom/discord/chat/bridge/botuikit/Component;", "<init>", "()V", "component", "getComponent", "()Lcom/discord/chat/bridge/botuikit/Component;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unknown implements SectionAccessory<Component> {
        private final Component component;

        @Override // com.discord.chat.bridge.botuikit.SectionAccessory
        public Component getComponent() {
            return this.component;
        }
    }

    T getComponent();
}
