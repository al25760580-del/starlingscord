package com.discord.chat.presentation.message.view.botuikit;

import a3.e;
import com.discord.primitives.UserId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u008a\u0001\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\u000fR/\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0013R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionEventHandlers;", "", "Lkotlin/Function1;", "", "", "onTapButtonActionComponent", "onTapButtonLinkComponent", "onTapSelectActionComponent", "Lkotlin/Function3;", "Lcom/discord/primitives/UserId;", "onTapContentInventoryEntry", "onTapCheckpointCard", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "component3", "component4", "()Lkotlin/jvm/functions/Function3;", "component5", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionEventHandlers;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getOnTapButtonActionComponent", "getOnTapButtonLinkComponent", "getOnTapSelectActionComponent", "Lkotlin/jvm/functions/Function3;", "getOnTapContentInventoryEntry", "getOnTapCheckpointCard", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComponentActionEventHandlers {

    @NotNull
    private final Function1<String, Unit> onTapButtonActionComponent;

    @NotNull
    private final Function1<String, Unit> onTapButtonLinkComponent;

    @NotNull
    private final Function1<UserId, Unit> onTapCheckpointCard;

    @NotNull
    private final Function3 onTapContentInventoryEntry;

    @NotNull
    private final Function1<String, Unit> onTapSelectActionComponent;

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentActionEventHandlers(@NotNull Function1<? super String, Unit> onTapButtonActionComponent, @NotNull Function1<? super String, Unit> onTapButtonLinkComponent, @NotNull Function1<? super String, Unit> onTapSelectActionComponent, @NotNull Function3 onTapContentInventoryEntry, @NotNull Function1<? super UserId, Unit> onTapCheckpointCard) {
        Intrinsics.checkNotNullParameter(onTapButtonActionComponent, "onTapButtonActionComponent");
        Intrinsics.checkNotNullParameter(onTapButtonLinkComponent, "onTapButtonLinkComponent");
        Intrinsics.checkNotNullParameter(onTapSelectActionComponent, "onTapSelectActionComponent");
        Intrinsics.checkNotNullParameter(onTapContentInventoryEntry, "onTapContentInventoryEntry");
        Intrinsics.checkNotNullParameter(onTapCheckpointCard, "onTapCheckpointCard");
        this.onTapButtonActionComponent = onTapButtonActionComponent;
        this.onTapButtonLinkComponent = onTapButtonLinkComponent;
        this.onTapSelectActionComponent = onTapSelectActionComponent;
        this.onTapContentInventoryEntry = onTapContentInventoryEntry;
        this.onTapCheckpointCard = onTapCheckpointCard;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComponentActionEventHandlers copy$default(ComponentActionEventHandlers componentActionEventHandlers, Function1 function1, Function1 function2, Function1 function3, Function3 function4, Function1 function5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            function1 = componentActionEventHandlers.onTapButtonActionComponent;
        }
        if ((i7 & 2) != 0) {
            function2 = componentActionEventHandlers.onTapButtonLinkComponent;
        }
        if ((i7 & 4) != 0) {
            function3 = componentActionEventHandlers.onTapSelectActionComponent;
        }
        if ((i7 & 8) != 0) {
            function4 = componentActionEventHandlers.onTapContentInventoryEntry;
        }
        if ((i7 & 16) != 0) {
            function5 = componentActionEventHandlers.onTapCheckpointCard;
        }
        Function1 function6 = function5;
        Function1 function7 = function3;
        return componentActionEventHandlers.copy(function1, function2, function7, function4, function6);
    }

    @NotNull
    public final Function1<String, Unit> component1() {
        return this.onTapButtonActionComponent;
    }

    @NotNull
    public final Function1<String, Unit> component2() {
        return this.onTapButtonLinkComponent;
    }

    @NotNull
    public final Function1<String, Unit> component3() {
        return this.onTapSelectActionComponent;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Function3 getOnTapContentInventoryEntry() {
        return this.onTapContentInventoryEntry;
    }

    @NotNull
    public final Function1<UserId, Unit> component5() {
        return this.onTapCheckpointCard;
    }

    @NotNull
    public final ComponentActionEventHandlers copy(@NotNull Function1<? super String, Unit> onTapButtonActionComponent, @NotNull Function1<? super String, Unit> onTapButtonLinkComponent, @NotNull Function1<? super String, Unit> onTapSelectActionComponent, @NotNull Function3 onTapContentInventoryEntry, @NotNull Function1<? super UserId, Unit> onTapCheckpointCard) {
        Intrinsics.checkNotNullParameter(onTapButtonActionComponent, "onTapButtonActionComponent");
        Intrinsics.checkNotNullParameter(onTapButtonLinkComponent, "onTapButtonLinkComponent");
        Intrinsics.checkNotNullParameter(onTapSelectActionComponent, "onTapSelectActionComponent");
        Intrinsics.checkNotNullParameter(onTapContentInventoryEntry, "onTapContentInventoryEntry");
        Intrinsics.checkNotNullParameter(onTapCheckpointCard, "onTapCheckpointCard");
        return new ComponentActionEventHandlers(onTapButtonActionComponent, onTapButtonLinkComponent, onTapSelectActionComponent, onTapContentInventoryEntry, onTapCheckpointCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentActionEventHandlers)) {
            return false;
        }
        ComponentActionEventHandlers componentActionEventHandlers = (ComponentActionEventHandlers) other;
        return Intrinsics.areEqual(this.onTapButtonActionComponent, componentActionEventHandlers.onTapButtonActionComponent) && Intrinsics.areEqual(this.onTapButtonLinkComponent, componentActionEventHandlers.onTapButtonLinkComponent) && Intrinsics.areEqual(this.onTapSelectActionComponent, componentActionEventHandlers.onTapSelectActionComponent) && Intrinsics.areEqual(this.onTapContentInventoryEntry, componentActionEventHandlers.onTapContentInventoryEntry) && Intrinsics.areEqual(this.onTapCheckpointCard, componentActionEventHandlers.onTapCheckpointCard);
    }

    @NotNull
    public final Function1<String, Unit> getOnTapButtonActionComponent() {
        return this.onTapButtonActionComponent;
    }

    @NotNull
    public final Function1<String, Unit> getOnTapButtonLinkComponent() {
        return this.onTapButtonLinkComponent;
    }

    @NotNull
    public final Function1<UserId, Unit> getOnTapCheckpointCard() {
        return this.onTapCheckpointCard;
    }

    @NotNull
    public final Function3 getOnTapContentInventoryEntry() {
        return this.onTapContentInventoryEntry;
    }

    @NotNull
    public final Function1<String, Unit> getOnTapSelectActionComponent() {
        return this.onTapSelectActionComponent;
    }

    public int hashCode() {
        return this.onTapCheckpointCard.hashCode() + ((this.onTapContentInventoryEntry.hashCode() + e.e(e.e(this.onTapButtonActionComponent.hashCode() * 31, 31, this.onTapButtonLinkComponent), 31, this.onTapSelectActionComponent)) * 31);
    }

    @NotNull
    public String toString() {
        return "ComponentActionEventHandlers(onTapButtonActionComponent=" + this.onTapButtonActionComponent + ", onTapButtonLinkComponent=" + this.onTapButtonLinkComponent + ", onTapSelectActionComponent=" + this.onTapSelectActionComponent + ", onTapContentInventoryEntry=" + this.onTapContentInventoryEntry + ", onTapCheckpointCard=" + this.onTapCheckpointCard + ")";
    }
}
