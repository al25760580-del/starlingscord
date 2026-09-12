package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.bridge.embed.EmbedThumbnail;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.view.EmbedView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4114e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4115i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4118x;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4113d = i7;
        this.f4114e = obj;
        this.f4115i = obj2;
        this.f4116v = obj3;
        this.f4117w = obj4;
        this.f4118x = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4113d) {
            case 0:
                ConnectionsRoleTagView.configureConnectionsRoleTag_uESh2Cg$lambda$0((ChatEventHandler) this.f4114e, (UserId) this.f4115i, (GuildId) this.f4116v, (ChannelId) this.f4117w, (ConnectionsRoleTag) this.f4118x, view);
                break;
            default:
                EmbedView.setThumbnail_xk5Fe9g$lambda$25$lambda$24$lambda$23((Function3) this.f4114e, (String) this.f4115i, (String) this.f4116v, (EmbedThumbnail) this.f4117w, (String) this.f4118x, view);
                break;
        }
    }
}
