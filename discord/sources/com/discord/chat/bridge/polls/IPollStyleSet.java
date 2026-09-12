package com.discord.chat.bridge.polls;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/bridge/polls/IPollStyleSet;", "", ViewProps.BORDER_COLOR, "", "getBorderColor", "()I", "borderWidthPx", "getBorderWidthPx", "labelColor", "getLabelColor", "fillColor", "getFillColor", "answerBackgroundColor", "getAnswerBackgroundColor", "answerFillColor", "getAnswerFillColor", "radioBackgroundColor", "getRadioBackgroundColor", "radioForegroundColor", "getRadioForegroundColor", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IPollStyleSet {
    int getAnswerBackgroundColor();

    int getAnswerFillColor();

    int getBorderColor();

    int getBorderWidthPx();

    int getFillColor();

    int getLabelColor();

    int getRadioBackgroundColor();

    int getRadioForegroundColor();
}
