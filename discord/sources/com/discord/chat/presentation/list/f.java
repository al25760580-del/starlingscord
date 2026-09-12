package com.discord.chat.presentation.list;

import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerWipeAnimatorManager;
import com.discord.chat.presentation.root.MessageContextType;
import com.discord.chat.reactevents.TapCopyText;
import com.discord.chat.reactevents.TapOpTagData;
import com.discord.chat.reactevents.TapSuppressNotificationsIconData;
import com.discord.chat.reactevents.TapTimeoutIconData;
import com.discord.client_info.ClientInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4103d;

    public /* synthetic */ f(int i7) {
        this.f4103d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4103d) {
            case 0:
                return Unit.f14616a;
            case 1:
                return Unit.f14616a;
            case 2:
                return SharedRecycledViewPools.chatListViewPool_delegate$lambda$0();
            case 3:
                return SharedRecycledViewPools.accessoriesViewPool_delegate$lambda$2();
            case 4:
                return MessageView.ChainPart.ONLY;
            case 5:
                return Unit.f14616a;
            case 6:
                return MessageAccessoriesView.forwardBarPaint_delegate$lambda$1();
            case 7:
                return MessageFrameFeedHeaderView.MessageBundleHeader._childSerializers$_anonymous_();
            case 8:
                return MessageView.ChainPart.ONLY;
            case 9:
                return MessageView.ChainPart.ONLY;
            case 10:
                return Unit.f14616a;
            case 11:
                return Unit.f14616a;
            case 12:
                return Unit.f14616a;
            case 13:
                return Unit.f14616a;
            case 14:
                return Unit.f14616a;
            case 15:
                return Unit.f14616a;
            case 16:
                return Unit.f14616a;
            case 17:
                return Unit.f14616a;
            case 18:
                return Unit.f14616a;
            case 19:
                return Unit.f14616a;
            case 20:
                return SelectComponentView.postProcessor_delegate$lambda$1();
            case 21:
                return AudioPlayerWipeAnimatorManager.buttonContainerActiveDrawable_delegate$lambda$2();
            case 22:
                return Unit.f14616a;
            case 23:
                return Unit.f14616a;
            case 24:
                return MessageContextType._init_$_anonymous_();
            case 25:
                return TapCopyText._childSerializers$_anonymous_();
            case 26:
                return TapOpTagData._init_$_anonymous_();
            case 27:
                return TapSuppressNotificationsIconData._init_$_anonymous_();
            case 28:
                return TapTimeoutIconData._init_$_anonymous_();
            default:
                return Boolean.valueOf(ClientInfo.isProdBuild_delegate$lambda$1());
        }
    }
}
