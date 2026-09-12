package com.discord.chat.presentation.message.view;

import com.discord.chat.presentation.message.view.botuikit.react.ComponentContextDefaults;
import com.discord.chat.presentation.message.view.botuikit.react.TextDisplayComponentViewManager;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.primitives.UserId;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4189d;

    public /* synthetic */ b(int i7) {
        this.f4189d = i7;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4189d) {
            case 0:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$7((String) obj, (String) obj2, (String) obj3);
            case 1:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$5((String) obj, (String) obj2, (String) obj3);
            case 2:
                return ComponentContextDefaults.COMPONENT_HANDLERS$lambda$24((UserId) obj, (String) obj2, (String) obj3);
            case 3:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$4((String) obj, (String) obj2, (String) obj3);
            case 4:
                return TextDisplayComponentViewManager.createTextDisplayComponentContext$lambda$4((String) obj, (String) obj2, (String) obj3);
            default:
                return TextUtilsKt.toSpannable$lambda$2((String) obj, (String) obj2, (String) obj3);
        }
    }
}
