package com.discord.chat.bridge.polls;

import a3.e;
import com.discord.emoji.RenderableEmoji;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/polls/PollMediaEmoji;", "", StackTraceHelper.ID_KEY, "", StackTraceHelper.NAME_KEY, "displayName", "animated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getName", "getDisplayName", "getAnimated", "()Z", "renderable", "Lcom/discord/emoji/RenderableEmoji;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PollMediaEmoji {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean animated;
    private final String displayName;
    private final String id;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/polls/PollMediaEmoji$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/polls/PollMediaEmoji;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PollMediaEmoji$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PollMediaEmoji(int i7, String str, String str2, String str3, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, PollMediaEmoji$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        if ((i7 & 4) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str3;
        }
        if ((i7 & 8) == 0) {
            this.animated = false;
        } else {
            this.animated = z5;
        }
    }

    public static /* synthetic */ PollMediaEmoji copy$default(PollMediaEmoji pollMediaEmoji, String str, String str2, String str3, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = pollMediaEmoji.id;
        }
        if ((i7 & 2) != 0) {
            str2 = pollMediaEmoji.name;
        }
        if ((i7 & 4) != 0) {
            str3 = pollMediaEmoji.displayName;
        }
        if ((i7 & 8) != 0) {
            z5 = pollMediaEmoji.animated;
        }
        return pollMediaEmoji.copy(str, str2, str3, z5);
    }

    public static final /* synthetic */ void write$Self$chat_release(PollMediaEmoji self, CompositeEncoder output, SerialDescriptor serialDesc) {
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 0, s1Var, self.id);
        output.q(serialDesc, 1, self.name);
        if (output.u(serialDesc, 2) || self.displayName != null) {
            output.r(serialDesc, 2, s1Var, self.displayName);
        }
        if (output.u(serialDesc, 3) || self.animated) {
            output.p(serialDesc, 3, self.animated);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAnimated() {
        return this.animated;
    }

    @NotNull
    public final PollMediaEmoji copy(String id2, @NotNull String name, String displayName, boolean animated) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new PollMediaEmoji(id2, name, displayName, animated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollMediaEmoji)) {
            return false;
        }
        PollMediaEmoji pollMediaEmoji = (PollMediaEmoji) other;
        return Intrinsics.areEqual(this.id, pollMediaEmoji.id) && Intrinsics.areEqual(this.name, pollMediaEmoji.name) && Intrinsics.areEqual(this.displayName, pollMediaEmoji.displayName) && this.animated == pollMediaEmoji.animated;
    }

    public final boolean getAnimated() {
        return this.animated;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int iD = e.d((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
        String str2 = this.displayName;
        return Boolean.hashCode(this.animated) + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final RenderableEmoji renderable() {
        Long lA0;
        String str = this.id;
        if (str != null && (lA0 = StringsKt.a0(str)) != null) {
            long jLongValue = lA0.longValue();
            RenderableEmoji.Companion companion = RenderableEmoji.INSTANCE;
            boolean z5 = this.animated;
            String str2 = this.displayName;
            if (str2 == null) {
                str2 = this.name;
            }
            RenderableEmoji.CustomWithEmojiId customWithEmojiId = companion.customWithEmojiId(jLongValue, z5, str2);
            if (customWithEmojiId != null) {
                return customWithEmojiId;
            }
        }
        return RenderableEmoji.INSTANCE.unicode(this.name);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.displayName;
        boolean z5 = this.animated;
        StringBuilder sbU = e.u("PollMediaEmoji(id=", str, ", name=", str2, ", displayName=");
        sbU.append(str3);
        sbU.append(", animated=");
        sbU.append(z5);
        sbU.append(")");
        return sbU.toString();
    }

    public PollMediaEmoji(String str, @NotNull String name, String str2, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = str;
        this.name = name;
        this.displayName = str2;
        this.animated = z5;
    }

    public /* synthetic */ PollMediaEmoji(String str, String str2, String str3, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? false : z5);
    }
}
