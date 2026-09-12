package com.discord.chat.bridge.spoiler;

import a3.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0010J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\\\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000eR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!¨\u0006#"}, d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "attributes", "Lkotlin/Function1;", "", "", "onTapObscureToggle", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "onReveal", "onHide", "<init>", "(Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component3", "()Lkotlin/jvm/functions/Function1;", "component4", "()V", "component1", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "component2", "copy", "(Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getAttributes", "Lkotlin/jvm/functions/Function1;", "getOnTapObscureToggle", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SpoilerConfig {

    @NotNull
    private final SpoilerAttributes attributes;

    @NotNull
    private final Function1<SpoilerIdentifier, Unit> onHide;

    @NotNull
    private final Function1<SpoilerIdentifier, Unit> onReveal;

    @NotNull
    private final Function1<Boolean, Unit> onTapObscureToggle;

    /* JADX WARN: Multi-variable type inference failed */
    public SpoilerConfig(@NotNull SpoilerAttributes attributes, @NotNull Function1<? super Boolean, Unit> onTapObscureToggle, @NotNull Function1<? super SpoilerIdentifier, Unit> onReveal, @NotNull Function1<? super SpoilerIdentifier, Unit> onHide) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(onTapObscureToggle, "onTapObscureToggle");
        Intrinsics.checkNotNullParameter(onReveal, "onReveal");
        Intrinsics.checkNotNullParameter(onHide, "onHide");
        this.attributes = attributes;
        this.onTapObscureToggle = onTapObscureToggle;
        this.onReveal = onReveal;
        this.onHide = onHide;
    }

    private final Function1<SpoilerIdentifier, Unit> component3() {
        return this.onReveal;
    }

    private final Function1<SpoilerIdentifier, Unit> component4() {
        return this.onHide;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpoilerConfig copy$default(SpoilerConfig spoilerConfig, SpoilerAttributes spoilerAttributes, Function1 function1, Function1 function2, Function1 function3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            spoilerAttributes = spoilerConfig.attributes;
        }
        if ((i7 & 2) != 0) {
            function1 = spoilerConfig.onTapObscureToggle;
        }
        if ((i7 & 4) != 0) {
            function2 = spoilerConfig.onReveal;
        }
        if ((i7 & 8) != 0) {
            function3 = spoilerConfig.onHide;
        }
        return spoilerConfig.copy(spoilerAttributes, function1, function2, function3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SpoilerAttributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final Function1<Boolean, Unit> component2() {
        return this.onTapObscureToggle;
    }

    @NotNull
    public final SpoilerConfig copy(@NotNull SpoilerAttributes attributes, @NotNull Function1<? super Boolean, Unit> onTapObscureToggle, @NotNull Function1<? super SpoilerIdentifier, Unit> onReveal, @NotNull Function1<? super SpoilerIdentifier, Unit> onHide) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(onTapObscureToggle, "onTapObscureToggle");
        Intrinsics.checkNotNullParameter(onReveal, "onReveal");
        Intrinsics.checkNotNullParameter(onHide, "onHide");
        return new SpoilerConfig(attributes, onTapObscureToggle, onReveal, onHide);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpoilerConfig)) {
            return false;
        }
        SpoilerConfig spoilerConfig = (SpoilerConfig) other;
        return Intrinsics.areEqual(this.attributes, spoilerConfig.attributes) && Intrinsics.areEqual(this.onTapObscureToggle, spoilerConfig.onTapObscureToggle) && Intrinsics.areEqual(this.onReveal, spoilerConfig.onReveal) && Intrinsics.areEqual(this.onHide, spoilerConfig.onHide);
    }

    @NotNull
    public final SpoilerAttributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnTapObscureToggle() {
        return this.onTapObscureToggle;
    }

    public int hashCode() {
        return this.onHide.hashCode() + e.e(e.e(this.attributes.hashCode() * 31, 31, this.onTapObscureToggle), 31, this.onReveal);
    }

    public final void onHide() {
        this.onHide.invoke(SpoilerIdentifier.m442boximpl(this.attributes.m439getIdentifierBq9X6Gg()));
    }

    public final void onReveal() {
        this.onReveal.invoke(SpoilerIdentifier.m442boximpl(this.attributes.m439getIdentifierBq9X6Gg()));
    }

    @NotNull
    public String toString() {
        return "SpoilerConfig(attributes=" + this.attributes + ", onTapObscureToggle=" + this.onTapObscureToggle + ", onReveal=" + this.onReveal + ", onHide=" + this.onHide + ")";
    }
}
