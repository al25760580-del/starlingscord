package com.discord.chat.bridge.botuikit;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006+"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "", StackTraceHelper.ID_KEY, "", StackTraceHelper.NAME_KEY, "src", "animated", "", "surrogates", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getName", "getSrc", "getAnimated", "()Z", "getSurrogates", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComponentEmoji {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean animated;
    private final String id;

    @NotNull
    private final String name;
    private final String src;
    private final String surrogates;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ComponentEmoji$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ComponentEmoji$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ComponentEmoji(int i7, String str, String str2, String str3, boolean z5, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i7 & 2)) {
            e1.l(i7, 2, ComponentEmoji$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i7 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.name = str2;
        if ((i7 & 4) == 0) {
            this.src = null;
        } else {
            this.src = str3;
        }
        if ((i7 & 8) == 0) {
            this.animated = false;
        } else {
            this.animated = z5;
        }
        if ((i7 & 16) == 0) {
            this.surrogates = null;
        } else {
            this.surrogates = str4;
        }
    }

    public static /* synthetic */ ComponentEmoji copy$default(ComponentEmoji componentEmoji, String str, String str2, String str3, boolean z5, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = componentEmoji.id;
        }
        if ((i7 & 2) != 0) {
            str2 = componentEmoji.name;
        }
        if ((i7 & 4) != 0) {
            str3 = componentEmoji.src;
        }
        if ((i7 & 8) != 0) {
            z5 = componentEmoji.animated;
        }
        if ((i7 & 16) != 0) {
            str4 = componentEmoji.surrogates;
        }
        String str5 = str4;
        String str6 = str3;
        return componentEmoji.copy(str, str2, str6, z5, str5);
    }

    public static final /* synthetic */ void write$Self$chat_release(ComponentEmoji self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.u(serialDesc, 0) || self.id != null) {
            output.r(serialDesc, 0, s1.f17602a, self.id);
        }
        output.q(serialDesc, 1, self.name);
        if (output.u(serialDesc, 2) || self.src != null) {
            output.r(serialDesc, 2, s1.f17602a, self.src);
        }
        if (output.u(serialDesc, 3) || self.animated) {
            output.p(serialDesc, 3, self.animated);
        }
        if (!output.u(serialDesc, 4) && self.surrogates == null) {
            return;
        }
        output.r(serialDesc, 4, s1.f17602a, self.surrogates);
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
    public final String getSrc() {
        return this.src;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAnimated() {
        return this.animated;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSurrogates() {
        return this.surrogates;
    }

    @NotNull
    public final ComponentEmoji copy(String id2, @NotNull String name, String src, boolean animated, String surrogates) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ComponentEmoji(id2, name, src, animated, surrogates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentEmoji)) {
            return false;
        }
        ComponentEmoji componentEmoji = (ComponentEmoji) other;
        return Intrinsics.areEqual(this.id, componentEmoji.id) && Intrinsics.areEqual(this.name, componentEmoji.name) && Intrinsics.areEqual(this.src, componentEmoji.src) && this.animated == componentEmoji.animated && Intrinsics.areEqual(this.surrogates, componentEmoji.surrogates);
    }

    public final boolean getAnimated() {
        return this.animated;
    }

    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final String getSrc() {
        return this.src;
    }

    public final String getSurrogates() {
        return this.surrogates;
    }

    public int hashCode() {
        String str = this.id;
        int iD = e.d((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
        String str2 = this.src;
        int iG = a.g((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.animated);
        String str3 = this.surrogates;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.src;
        boolean z5 = this.animated;
        String str4 = this.surrogates;
        StringBuilder sbU = e.u("ComponentEmoji(id=", str, ", name=", str2, ", src=");
        sbU.append(str3);
        sbU.append(", animated=");
        sbU.append(z5);
        sbU.append(", surrogates=");
        return a.k(sbU, str4, ")");
    }

    public ComponentEmoji(String str, @NotNull String name, String str2, boolean z5, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = str;
        this.name = name;
        this.src = str2;
        this.animated = z5;
        this.surrogates = str3;
    }

    public /* synthetic */ ComponentEmoji(String str, String str2, String str3, boolean z5, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? false : z5, (i7 & 16) != 0 ? null : str4);
    }
}
