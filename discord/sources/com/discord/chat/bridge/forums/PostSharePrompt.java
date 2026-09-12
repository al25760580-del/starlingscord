package com.discord.chat.bridge.forums;

import a3.e;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.chat.presentation.list.a;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\fHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006,"}, d2 = {"Lcom/discord/chat/bridge/forums/PostSharePrompt;", "", AlertFragment.ARG_TITLE, "", "subtitle", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "cta", "icon", "closeIcon", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getCta", "getIcon", "getCloseIcon", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PostSharePrompt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String closeIcon;

    @NotNull
    private final String cta;

    @NotNull
    private final String icon;

    @NotNull
    private final StructurableText subtitle;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/forums/PostSharePrompt$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PostSharePrompt$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PostSharePrompt(int i7, String str, StructurableText structurableText, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, PostSharePrompt$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.subtitle = structurableText;
        this.cta = str2;
        this.icon = str3;
        this.closeIcon = str4;
    }

    public static /* synthetic */ PostSharePrompt copy$default(PostSharePrompt postSharePrompt, String str, StructurableText structurableText, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = postSharePrompt.title;
        }
        if ((i7 & 2) != 0) {
            structurableText = postSharePrompt.subtitle;
        }
        if ((i7 & 4) != 0) {
            str2 = postSharePrompt.cta;
        }
        if ((i7 & 8) != 0) {
            str3 = postSharePrompt.icon;
        }
        if ((i7 & 16) != 0) {
            str4 = postSharePrompt.closeIcon;
        }
        String str5 = str4;
        String str6 = str2;
        return postSharePrompt.copy(str, structurableText, str6, str3, str5);
    }

    public static final /* synthetic */ void write$Self$chat_release(PostSharePrompt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.title);
        output.g(serialDesc, 1, StructurableTextSerializer.INSTANCE, self.subtitle);
        output.q(serialDesc, 2, self.cta);
        output.q(serialDesc, 3, self.icon);
        output.q(serialDesc, 4, self.closeIcon);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StructurableText getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCloseIcon() {
        return this.closeIcon;
    }

    @NotNull
    public final PostSharePrompt copy(@NotNull String title, @NotNull StructurableText subtitle, @NotNull String cta, @NotNull String icon, @NotNull String closeIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(closeIcon, "closeIcon");
        return new PostSharePrompt(title, subtitle, cta, icon, closeIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSharePrompt)) {
            return false;
        }
        PostSharePrompt postSharePrompt = (PostSharePrompt) other;
        return Intrinsics.areEqual(this.title, postSharePrompt.title) && Intrinsics.areEqual(this.subtitle, postSharePrompt.subtitle) && Intrinsics.areEqual(this.cta, postSharePrompt.cta) && Intrinsics.areEqual(this.icon, postSharePrompt.icon) && Intrinsics.areEqual(this.closeIcon, postSharePrompt.closeIcon);
    }

    @NotNull
    public final String getCloseIcon() {
        return this.closeIcon;
    }

    @NotNull
    public final String getCta() {
        return this.cta;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final StructurableText getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.closeIcon.hashCode() + e.d(e.d((this.subtitle.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.cta), 31, this.icon);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        StructurableText structurableText = this.subtitle;
        String str2 = this.cta;
        String str3 = this.icon;
        String str4 = this.closeIcon;
        StringBuilder sb2 = new StringBuilder("PostSharePrompt(title=");
        sb2.append(str);
        sb2.append(", subtitle=");
        sb2.append(structurableText);
        sb2.append(", cta=");
        e.A(sb2, str2, ", icon=", str3, ", closeIcon=");
        return a.k(sb2, str4, ")");
    }

    public PostSharePrompt(@NotNull String title, @NotNull StructurableText subtitle, @NotNull String cta, @NotNull String icon, @NotNull String closeIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(closeIcon, "closeIcon");
        this.title = title;
        this.subtitle = subtitle;
        this.cta = cta;
        this.icon = icon;
        this.closeIcon = closeIcon;
    }
}
