package com.discord.chat.presentation.message.view.botuikit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ<\u0010\u000e\u001a\u00020\u00002\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/GeneralEventHandlers;", "", "Lkotlin/Function2;", "", "", "onLinkClicked", "Lkotlin/Function0;", "onTapSpoiler", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "component2", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)Lcom/discord/chat/presentation/message/view/botuikit/GeneralEventHandlers;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function2;", "getOnLinkClicked", "Lkotlin/jvm/functions/Function0;", "getOnTapSpoiler", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GeneralEventHandlers {

    @NotNull
    private final Function2<String, String, Unit> onLinkClicked;

    @NotNull
    private final Function0<Unit> onTapSpoiler;

    /* JADX WARN: Multi-variable type inference failed */
    public GeneralEventHandlers(@NotNull Function2<? super String, ? super String, Unit> onLinkClicked, @NotNull Function0<Unit> onTapSpoiler) {
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        this.onLinkClicked = onLinkClicked;
        this.onTapSpoiler = onTapSpoiler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeneralEventHandlers copy$default(GeneralEventHandlers generalEventHandlers, Function2 function2, Function0 function0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            function2 = generalEventHandlers.onLinkClicked;
        }
        if ((i7 & 2) != 0) {
            function0 = generalEventHandlers.onTapSpoiler;
        }
        return generalEventHandlers.copy(function2, function0);
    }

    @NotNull
    public final Function2<String, String, Unit> component1() {
        return this.onLinkClicked;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onTapSpoiler;
    }

    @NotNull
    public final GeneralEventHandlers copy(@NotNull Function2<? super String, ? super String, Unit> onLinkClicked, @NotNull Function0<Unit> onTapSpoiler) {
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        return new GeneralEventHandlers(onLinkClicked, onTapSpoiler);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneralEventHandlers)) {
            return false;
        }
        GeneralEventHandlers generalEventHandlers = (GeneralEventHandlers) other;
        return Intrinsics.areEqual(this.onLinkClicked, generalEventHandlers.onLinkClicked) && Intrinsics.areEqual(this.onTapSpoiler, generalEventHandlers.onTapSpoiler);
    }

    @NotNull
    public final Function2<String, String, Unit> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @NotNull
    public final Function0<Unit> getOnTapSpoiler() {
        return this.onTapSpoiler;
    }

    public int hashCode() {
        return this.onTapSpoiler.hashCode() + (this.onLinkClicked.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "GeneralEventHandlers(onLinkClicked=" + this.onLinkClicked + ", onTapSpoiler=" + this.onTapSpoiler + ")";
    }
}
