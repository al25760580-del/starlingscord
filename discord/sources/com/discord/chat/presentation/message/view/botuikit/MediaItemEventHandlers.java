package com.discord.chat.presentation.message.view.botuikit;

import a3.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\rj\u0002`\u000e\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\rj\u0002`\u000eHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u009a\u0001\u0010\u001d\u001a\u00020\u00002(\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\rj\u0002`\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R7\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0015R-\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0017R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0019R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\rj\u0002`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010\u001bR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b.\u0010\u001b¨\u0006/"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/MediaItemEventHandlers;", "", "Lkotlin/Function4;", "Landroid/view/View;", "", "", "", "", "onMediaItemClicked", "Lkotlin/Function2;", "onMediaItemLongClicked", "Lkotlin/Function0;", "onMediaItemSpoilerClicked", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onMediaItemAltTextButtonClicked", "", "onMediaItemObscureToggle", "<init>", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function4;", "component2", "()Lkotlin/jvm/functions/Function2;", "component3", "()Lkotlin/jvm/functions/Function0;", "component4", "()Lkotlin/jvm/functions/Function1;", "component5", "copy", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/presentation/message/view/botuikit/MediaItemEventHandlers;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function4;", "getOnMediaItemClicked", "Lkotlin/jvm/functions/Function2;", "getOnMediaItemLongClicked", "Lkotlin/jvm/functions/Function0;", "getOnMediaItemSpoilerClicked", "Lkotlin/jvm/functions/Function1;", "getOnMediaItemAltTextButtonClicked", "getOnMediaItemObscureToggle", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MediaItemEventHandlers {

    @NotNull
    private final Function1<String, Unit> onMediaItemAltTextButtonClicked;

    @NotNull
    private final Function4 onMediaItemClicked;
    private final Function2<String, Integer, Unit> onMediaItemLongClicked;

    @NotNull
    private final Function1<Boolean, Unit> onMediaItemObscureToggle;

    @NotNull
    private final Function0<Unit> onMediaItemSpoilerClicked;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaItemEventHandlers(@NotNull Function4 onMediaItemClicked, Function2<? super String, ? super Integer, Unit> function2, @NotNull Function0<Unit> onMediaItemSpoilerClicked, @NotNull Function1<? super String, Unit> onMediaItemAltTextButtonClicked, @NotNull Function1<? super Boolean, Unit> onMediaItemObscureToggle) {
        Intrinsics.checkNotNullParameter(onMediaItemClicked, "onMediaItemClicked");
        Intrinsics.checkNotNullParameter(onMediaItemSpoilerClicked, "onMediaItemSpoilerClicked");
        Intrinsics.checkNotNullParameter(onMediaItemAltTextButtonClicked, "onMediaItemAltTextButtonClicked");
        Intrinsics.checkNotNullParameter(onMediaItemObscureToggle, "onMediaItemObscureToggle");
        this.onMediaItemClicked = onMediaItemClicked;
        this.onMediaItemLongClicked = function2;
        this.onMediaItemSpoilerClicked = onMediaItemSpoilerClicked;
        this.onMediaItemAltTextButtonClicked = onMediaItemAltTextButtonClicked;
        this.onMediaItemObscureToggle = onMediaItemObscureToggle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaItemEventHandlers copy$default(MediaItemEventHandlers mediaItemEventHandlers, Function4 function4, Function2 function2, Function0 function0, Function1 function1, Function1 function3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            function4 = mediaItemEventHandlers.onMediaItemClicked;
        }
        if ((i7 & 2) != 0) {
            function2 = mediaItemEventHandlers.onMediaItemLongClicked;
        }
        if ((i7 & 4) != 0) {
            function0 = mediaItemEventHandlers.onMediaItemSpoilerClicked;
        }
        if ((i7 & 8) != 0) {
            function1 = mediaItemEventHandlers.onMediaItemAltTextButtonClicked;
        }
        if ((i7 & 16) != 0) {
            function3 = mediaItemEventHandlers.onMediaItemObscureToggle;
        }
        Function1 function5 = function3;
        Function0 function6 = function0;
        return mediaItemEventHandlers.copy(function4, function2, function6, function1, function5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Function4 getOnMediaItemClicked() {
        return this.onMediaItemClicked;
    }

    public final Function2<String, Integer, Unit> component2() {
        return this.onMediaItemLongClicked;
    }

    @NotNull
    public final Function0<Unit> component3() {
        return this.onMediaItemSpoilerClicked;
    }

    @NotNull
    public final Function1<String, Unit> component4() {
        return this.onMediaItemAltTextButtonClicked;
    }

    @NotNull
    public final Function1<Boolean, Unit> component5() {
        return this.onMediaItemObscureToggle;
    }

    @NotNull
    public final MediaItemEventHandlers copy(@NotNull Function4 onMediaItemClicked, Function2<? super String, ? super Integer, Unit> onMediaItemLongClicked, @NotNull Function0<Unit> onMediaItemSpoilerClicked, @NotNull Function1<? super String, Unit> onMediaItemAltTextButtonClicked, @NotNull Function1<? super Boolean, Unit> onMediaItemObscureToggle) {
        Intrinsics.checkNotNullParameter(onMediaItemClicked, "onMediaItemClicked");
        Intrinsics.checkNotNullParameter(onMediaItemSpoilerClicked, "onMediaItemSpoilerClicked");
        Intrinsics.checkNotNullParameter(onMediaItemAltTextButtonClicked, "onMediaItemAltTextButtonClicked");
        Intrinsics.checkNotNullParameter(onMediaItemObscureToggle, "onMediaItemObscureToggle");
        return new MediaItemEventHandlers(onMediaItemClicked, onMediaItemLongClicked, onMediaItemSpoilerClicked, onMediaItemAltTextButtonClicked, onMediaItemObscureToggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaItemEventHandlers)) {
            return false;
        }
        MediaItemEventHandlers mediaItemEventHandlers = (MediaItemEventHandlers) other;
        return Intrinsics.areEqual(this.onMediaItemClicked, mediaItemEventHandlers.onMediaItemClicked) && Intrinsics.areEqual(this.onMediaItemLongClicked, mediaItemEventHandlers.onMediaItemLongClicked) && Intrinsics.areEqual(this.onMediaItemSpoilerClicked, mediaItemEventHandlers.onMediaItemSpoilerClicked) && Intrinsics.areEqual(this.onMediaItemAltTextButtonClicked, mediaItemEventHandlers.onMediaItemAltTextButtonClicked) && Intrinsics.areEqual(this.onMediaItemObscureToggle, mediaItemEventHandlers.onMediaItemObscureToggle);
    }

    @NotNull
    public final Function1<String, Unit> getOnMediaItemAltTextButtonClicked() {
        return this.onMediaItemAltTextButtonClicked;
    }

    @NotNull
    public final Function4 getOnMediaItemClicked() {
        return this.onMediaItemClicked;
    }

    public final Function2<String, Integer, Unit> getOnMediaItemLongClicked() {
        return this.onMediaItemLongClicked;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnMediaItemObscureToggle() {
        return this.onMediaItemObscureToggle;
    }

    @NotNull
    public final Function0<Unit> getOnMediaItemSpoilerClicked() {
        return this.onMediaItemSpoilerClicked;
    }

    public int hashCode() {
        int iHashCode = this.onMediaItemClicked.hashCode() * 31;
        Function2<String, Integer, Unit> function2 = this.onMediaItemLongClicked;
        return this.onMediaItemObscureToggle.hashCode() + e.e((this.onMediaItemSpoilerClicked.hashCode() + ((iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31)) * 31, 31, this.onMediaItemAltTextButtonClicked);
    }

    @NotNull
    public String toString() {
        return "MediaItemEventHandlers(onMediaItemClicked=" + this.onMediaItemClicked + ", onMediaItemLongClicked=" + this.onMediaItemLongClicked + ", onMediaItemSpoilerClicked=" + this.onMediaItemSpoilerClicked + ", onMediaItemAltTextButtonClicked=" + this.onMediaItemAltTextButtonClicked + ", onMediaItemObscureToggle=" + this.onMediaItemObscureToggle + ")";
    }
}
