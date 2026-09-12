package com.discord.avatar.react;

import android.content.Context;
import com.discord.media.engine.video.AttachedVideoSinks;
import com.discord.media_player.HttpEngineFactoryResolver;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3966b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f3965a = i7;
        this.f3966b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f3965a) {
            case 0:
                return APNGPreloadModule.getOrStartDownload$lambda$1((b7.a) this.f3966b, obj);
            case 1:
                return AttachedVideoSinks.addSink$lambda$2((com.discord.media.engine.video.a) this.f3966b, obj);
            default:
                return HttpEngineFactoryResolver.init$lambda$0((Context) this.f3966b, (String) obj);
        }
    }
}
