package com.discord.chat.presentation.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0017\u001a\u00020\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/list/SwipeReplyInitiator;", "", "onInitiateReply", "Lkotlin/Function0;", "", "getOnInitiateReply", "()Lkotlin/jvm/functions/Function0;", "setOnInitiateReply", "(Lkotlin/jvm/functions/Function0;)V", "onInitiateEdit", "getOnInitiateEdit", "setOnInitiateEdit", "onSwipeStart", "onSwipeEnd", "enableSwipeToReply", "", "getEnableSwipeToReply", "()Z", "setEnableSwipeToReply", "(Z)V", "enableSwipeToEdit", "getEnableSwipeToEdit", "setEnableSwipeToEdit", "shadowView", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "getShadowView", "()Lcom/discord/chat/presentation/list/MaskedShadowView;", "setShadowView", "(Lcom/discord/chat/presentation/list/MaskedShadowView;)V", "usingGradientTheme", "getUsingGradientTheme", "setUsingGradientTheme", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SwipeReplyInitiator {
    boolean getEnableSwipeToEdit();

    boolean getEnableSwipeToReply();

    @NotNull
    Function0<Unit> getOnInitiateEdit();

    @NotNull
    Function0<Unit> getOnInitiateReply();

    @NotNull
    MaskedShadowView getShadowView();

    boolean getUsingGradientTheme();

    void onSwipeEnd();

    void onSwipeStart();

    void setEnableSwipeToEdit(boolean z5);

    void setEnableSwipeToReply(boolean z5);

    void setOnInitiateEdit(@NotNull Function0<Unit> function0);

    void setOnInitiateReply(@NotNull Function0<Unit> function0);

    void setShadowView(@NotNull MaskedShadowView maskedShadowView);

    void setUsingGradientTheme(boolean z5);
}
