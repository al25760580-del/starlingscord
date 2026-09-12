package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.chat.presentation.message.view.botuikit.react.ComponentContextDefaults;
import com.discord.chat.presentation.message.view.botuikit.react.TextDisplayComponentViewManager;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4190d;

    public /* synthetic */ c(int i7) {
        this.f4190d = i7;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f4190d) {
            case 0:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$8((String) obj, (String) obj2, (String) obj3, (String) obj4);
            case 1:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$6((String) obj, (String) obj2, (String) obj3, (String) obj4);
            case 2:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$5((String) obj, (String) obj2, (String) obj3, (String) obj4);
            case 3:
                return ComponentContextDefaults.MEDIA_HANDLERS$lambda$16((View) obj, (String) obj2, ((Integer) obj3).intValue(), (Double) obj4);
            case 4:
                return TextDisplayComponentViewManager.createTextDisplayComponentContext$lambda$5((String) obj, (String) obj2, (String) obj3, (String) obj4);
            default:
                return TextUtilsKt.toSpannable$lambda$3((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
    }
}
