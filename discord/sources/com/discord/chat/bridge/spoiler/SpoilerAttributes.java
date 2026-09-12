package com.discord.chat.bridge.spoiler;

import a3.e;
import android.content.Context;
import ar.u;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.primitives.MessageId;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\\\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001cR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010!¨\u00066"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "identifier", "Lkotlin/Function1;", "Landroid/content/Context;", "", "label", "description", "Lcom/discord/chat/bridge/spoiler/SpoilerType;", "type", "", "verifyAge", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/spoiler/SpoilerType;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "hasSpoilerConfig", "()Z", "Lkotlin/Function0;", "", "onTapSpoiler", "onTapObscureToggle", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "configure", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "component1-Bq9X6Gg", "()Ljava/lang/String;", "component1", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "component4", "()Lcom/discord/chat/bridge/spoiler/SpoilerType;", "component5", "()Ljava/lang/Boolean;", "copy-5Uv3usY", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/spoiler/SpoilerType;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "copy", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier-Bq9X6Gg", "Lkotlin/jvm/functions/Function1;", "getLabel", "getDescription", "Lcom/discord/chat/bridge/spoiler/SpoilerType;", "getType", "Ljava/lang/Boolean;", "getVerifyAge", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpoilerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpoilerManager.kt\ncom/discord/chat/bridge/spoiler/SpoilerAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1#2:163\n*E\n"})
public final /* data */ class SpoilerAttributes {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function1<Context, String> description;

    @NotNull
    private final String identifier;

    @NotNull
    private final Function1<Context, String> label;

    @NotNull
    private final SpoilerType type;
    private final Boolean verifyAge;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0012J/\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0015J7\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u001dJ1\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerAttributes$Companion;", "", "<init>", "()V", "forEmbed", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "embed", "Lcom/discord/chat/bridge/embed/Embed;", "message", "Lcom/discord/chat/bridge/Message;", "index", "", "verifyAge", "", "(Lcom/discord/chat/bridge/embed/Embed;Lcom/discord/chat/bridge/Message;ILjava/lang/Boolean;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "forAttachment", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "(Lcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/Message;ILjava/lang/Boolean;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "forMediaPostPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "(Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;Lcom/discord/chat/bridge/Message;ILjava/lang/Boolean;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "forGenericMedia", "spoilerableData", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "containerId", "", "itemType", "itemKey", "(Lcom/discord/chat/bridge/spoiler/SpoilerableData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "forItem", "key", "(Lcom/discord/chat/bridge/spoiler/SpoilerableData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SpoilerAttributes forItem(SpoilerableData spoilerableData, String containerId, String key, Boolean verifyAge) {
            String obscureOrNull = spoilerableData.getObscureOrNull();
            if (obscureOrNull != null) {
                return new SpoilerAttributes(SpoilerIdentifier.m443constructorimpl("obscure:containerId(" + containerId + "):" + key), new a(obscureOrNull, 0), new a(obscureOrNull, 1), SpoilerType.OBSCURE, verifyAge, null);
            }
            String spoilerOrNull = spoilerableData.getSpoilerOrNull();
            if (spoilerOrNull == null) {
                return null;
            }
            return new SpoilerAttributes(SpoilerIdentifier.m443constructorimpl("spoiler:containerId(" + containerId + "):" + key), new u(24), new a(spoilerOrNull, 2), SpoilerType.SPOILER, verifyAge, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String forItem$lambda$2$lambda$0(String str, Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String forItem$lambda$2$lambda$1(String str, Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String forItem$lambda$5$lambda$3(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String upperCase = I18nUtilsKt.i18nFormat$default(context, I18nMessage.SPOILER, null, 2, null).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String forItem$lambda$5$lambda$4(String str, Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return str;
        }

        public final SpoilerAttributes forAttachment(@NotNull Attachment attachment, @NotNull Message message, int index, Boolean verifyAge) {
            Intrinsics.checkNotNullParameter(attachment, "attachment");
            Intrinsics.checkNotNullParameter(message, "message");
            return forItem(attachment, g.e("messageId(", MessageId.m1163toStringimpl(message.m267getId3Eiw7ao()), ")"), attachment.type().getIndexLabel() + "(" + index + ")", verifyAge);
        }

        public final SpoilerAttributes forEmbed(@NotNull Embed embed, @NotNull Message message, int index, Boolean verifyAge) {
            Intrinsics.checkNotNullParameter(embed, "embed");
            Intrinsics.checkNotNullParameter(message, "message");
            return forItem(embed, g.e("messageId(", MessageId.m1163toStringimpl(message.m267getId3Eiw7ao()), ")"), g.d(index, "embedIndex(", ")"), verifyAge);
        }

        public final SpoilerAttributes forGenericMedia(@NotNull SpoilerableData spoilerableData, @NotNull String containerId, @NotNull String itemType, @NotNull String itemKey, Boolean verifyAge) {
            Intrinsics.checkNotNullParameter(spoilerableData, "spoilerableData");
            Intrinsics.checkNotNullParameter(containerId, "containerId");
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(itemKey, "itemKey");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(itemType);
            return forItem(spoilerableData, containerId, e.o(sb2, "(", itemKey, ")"), verifyAge);
        }

        public final SpoilerAttributes forMediaPostPreviewEmbed(@NotNull PostPreviewEmbed embed, @NotNull Message message, int index, Boolean verifyAge) {
            Intrinsics.checkNotNullParameter(embed, "embed");
            Intrinsics.checkNotNullParameter(message, "message");
            return forItem(embed, g.e("messageId(", MessageId.m1163toStringimpl(message.m267getId3Eiw7ao()), ")"), g.d(index, "mediaPostPreviewEmbed(", ")"), verifyAge);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SpoilerAttributes(String str, Function1 function1, Function1 function2, SpoilerType spoilerType, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1, function2, spoilerType, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpoilerConfig configure$default(SpoilerAttributes spoilerAttributes, Function0 function0, Function1 function1, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            function0 = new com.discord.chat.bridge.contentnode.a(26);
        }
        if ((i7 & 2) != 0) {
            function1 = new u(23);
        }
        return spoilerAttributes.configure(function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configure$lambda$1(boolean z5) {
        return Unit.f14616a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-5Uv3usY$default, reason: not valid java name */
    public static /* synthetic */ SpoilerAttributes m436copy5Uv3usY$default(SpoilerAttributes spoilerAttributes, String str, Function1 function1, Function1 function2, SpoilerType spoilerType, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = spoilerAttributes.identifier;
        }
        if ((i7 & 2) != 0) {
            function1 = spoilerAttributes.label;
        }
        if ((i7 & 4) != 0) {
            function2 = spoilerAttributes.description;
        }
        if ((i7 & 8) != 0) {
            spoilerType = spoilerAttributes.type;
        }
        if ((i7 & 16) != 0) {
            bool = spoilerAttributes.verifyAge;
        }
        Boolean bool2 = bool;
        Function1 function3 = function2;
        return spoilerAttributes.m438copy5Uv3usY(str, function1, function3, spoilerType, bool2);
    }

    private final boolean hasSpoilerConfig() {
        return SpoilerManager.INSTANCE.m450isNotRevealedV2PEE7g(this.identifier) || this.type == SpoilerType.OBSCURE;
    }

    @NotNull
    /* JADX INFO: renamed from: component1-Bq9X6Gg, reason: not valid java name and from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final Function1<Context, String> component2() {
        return this.label;
    }

    @NotNull
    public final Function1<Context, String> component3() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SpoilerType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    public final SpoilerConfig configure(@NotNull final Function0<Unit> onTapSpoiler, @NotNull Function1<? super Boolean, Unit> onTapObscureToggle) {
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapObscureToggle, "onTapObscureToggle");
        SpoilerAttributes spoilerAttributes = hasSpoilerConfig() ? this : null;
        if (spoilerAttributes != null) {
            return new SpoilerConfig(spoilerAttributes, onTapObscureToggle, new Function1<SpoilerIdentifier, Unit>() { // from class: com.discord.chat.bridge.spoiler.SpoilerAttributes$configure$4$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m440invokeV2PEE7g(((SpoilerIdentifier) obj).m448unboximpl());
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke-V2PEE7g, reason: not valid java name */
                public final void m440invokeV2PEE7g(String spoilerId) {
                    Intrinsics.checkNotNullParameter(spoilerId, "spoilerId");
                    SpoilerManager.INSTANCE.m453markRevealedV2PEE7g(spoilerId);
                    onTapSpoiler.invoke();
                }
            }, new Function1<SpoilerIdentifier, Unit>() { // from class: com.discord.chat.bridge.spoiler.SpoilerAttributes$configure$4$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m441invokeV2PEE7g(((SpoilerIdentifier) obj).m448unboximpl());
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke-V2PEE7g, reason: not valid java name */
                public final void m441invokeV2PEE7g(String spoilerId) {
                    Intrinsics.checkNotNullParameter(spoilerId, "spoilerId");
                    SpoilerManager.INSTANCE.m452markHiddenV2PEE7g(spoilerId);
                    onTapSpoiler.invoke();
                }
            });
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-5Uv3usY, reason: not valid java name */
    public final SpoilerAttributes m438copy5Uv3usY(@NotNull String identifier, @NotNull Function1<? super Context, String> label, @NotNull Function1<? super Context, String> description, @NotNull SpoilerType type, Boolean verifyAge) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SpoilerAttributes(identifier, label, description, type, verifyAge, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpoilerAttributes)) {
            return false;
        }
        SpoilerAttributes spoilerAttributes = (SpoilerAttributes) other;
        return SpoilerIdentifier.m445equalsimpl0(this.identifier, spoilerAttributes.identifier) && Intrinsics.areEqual(this.label, spoilerAttributes.label) && Intrinsics.areEqual(this.description, spoilerAttributes.description) && this.type == spoilerAttributes.type && Intrinsics.areEqual(this.verifyAge, spoilerAttributes.verifyAge);
    }

    @NotNull
    public final Function1<Context, String> getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: getIdentifier-Bq9X6Gg, reason: not valid java name */
    public final String m439getIdentifierBq9X6Gg() {
        return this.identifier;
    }

    @NotNull
    public final Function1<Context, String> getLabel() {
        return this.label;
    }

    @NotNull
    public final SpoilerType getType() {
        return this.type;
    }

    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + e.e(e.e(SpoilerIdentifier.m446hashCodeimpl(this.identifier) * 31, 31, this.label), 31, this.description)) * 31;
        Boolean bool = this.verifyAge;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "SpoilerAttributes(identifier=" + SpoilerIdentifier.m447toStringimpl(this.identifier) + ", label=" + this.label + ", description=" + this.description + ", type=" + this.type + ", verifyAge=" + this.verifyAge + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SpoilerAttributes(String identifier, Function1<? super Context, String> label, Function1<? super Context, String> description, SpoilerType type, Boolean bool) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        this.identifier = identifier;
        this.label = label;
        this.description = description;
        this.type = type;
        this.verifyAge = bool;
    }
}
