package com.discord.chat.presentation.message.view;

import com.discord.chat.presentation.message.view.botuikit.react.ComponentContextDefaults;
import com.discord.chat.presentation.message.view.polls.PollAnswerAdapter;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.chat.reactevents.ViewResizeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4191d;

    public /* synthetic */ d(int i7) {
        this.f4191d = i7;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.f4191d) {
            case 0:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$11((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
            case 1:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$9((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
            case 2:
                return PollAnswerAdapter.onLongPressImage$lambda$1((String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), ((Integer) obj5).intValue(), (ViewResizeMode) obj6);
            case 3:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$8((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
            case 4:
                return TextUtilsKt.toSpannable$lambda$6((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
            default:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                ((Double) obj3).doubleValue();
                ((Double) obj4).doubleValue();
                ((Double) obj5).doubleValue();
                ((Double) obj6).doubleValue();
                return Unit.f14616a;
        }
    }
}
