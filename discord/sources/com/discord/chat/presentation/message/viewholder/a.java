package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f4295e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4296i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f4297v;

    public /* synthetic */ a(Function2 function2, String str, long j, int i7) {
        this.f4294d = i7;
        this.f4295e = function2;
        this.f4296i = str;
        this.f4297v = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4294d) {
            case 0:
                AutoModerationNotificationEmbedViewHolder.bind$lambda$0(this.f4295e, this.f4296i, this.f4297v, view);
                break;
            case 1:
                AutoModerationNotificationEmbedViewHolder.bind$lambda$1(this.f4295e, this.f4296i, this.f4297v, view);
                break;
            case 2:
                FlaggedMessageActionBarViewHolder.bind$lambda$0(this.f4295e, this.f4296i, this.f4297v, view);
                break;
            default:
                FlaggedMessageActionBarViewHolder.bind$lambda$1(this.f4295e, this.f4296i, this.f4297v, view);
                break;
        }
    }
}
