package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f4183e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4184i;

    public /* synthetic */ a(Function2 function2, String str, int i7) {
        this.f4182d = i7;
        this.f4183e = function2;
        this.f4184i = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4182d) {
            case 0:
                return ActivityRichPresenceInviteEmbedView.configureHiddenContent_2dg2Uz0$lambda$24(this.f4183e, this.f4184i, (LinkContentNode) obj);
            case 1:
                return EmbedView.setFields_oCLp7l4$lambda$29(this.f4183e, this.f4184i, (LinkContentNode) obj);
            case 2:
                return EmbedView.setEmbed_fDtLluY$lambda$6(this.f4183e, this.f4184i, (LinkContentNode) obj);
            case 3:
                return EmbeddedActivityInviteView.setSubtitleText_2dg2Uz0$lambda$8$lambda$7(this.f4183e, this.f4184i, (LinkContentNode) obj);
            case 4:
                return EphemeralIndicationView.setEphemeralIndication_AFFcxXc$lambda$7$lambda$5(this.f4183e, this.f4184i, (LinkContentNode) obj);
            case 5:
                return ForumPostActionBarView.setSharePrompt_LdU2QRA$lambda$16$lambda$15(this.f4183e, this.f4184i, (LinkContentNode) obj);
            case 6:
                return GuildEventInviteView.setDescription_63A0Z80$lambda$12$lambda$11(this.f4183e, this.f4184i, (LinkContentNode) obj);
            default:
                return SurveyIndicationView.setSurveyIndication_u7_MRrM$lambda$3$lambda$1(this.f4183e, this.f4184i, (LinkContentNode) obj);
        }
    }
}
