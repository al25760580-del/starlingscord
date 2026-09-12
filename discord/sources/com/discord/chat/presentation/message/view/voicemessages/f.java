package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import com.discord.app_database.AppDatabase;
import com.discord.cache.Cache;
import com.discord.image.fresco.FrescoModuleDiscord;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f4280e;

    public /* synthetic */ f(Context context, int i7) {
        this.f4279d = i7;
        this.f4280e = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4279d) {
            case 0:
                return AudioPlayerView.bounceAnimator_delegate$lambda$2(this.f4280e);
            case 1:
                return AudioPlayerWipeAnimatorManager.buttonContainerDefaultDrawable_delegate$lambda$0(this.f4280e);
            case 2:
                return FrescoModuleDiscord.Companion.startFrescoInitializationAsync$lambda$1(this.f4280e);
            case 3:
                return AppDatabase.initializeAppDatabase$lambda$0(this.f4280e);
            case 4:
                return Cache.sharedPrefs_delegate$lambda$0(this.f4280e);
            default:
                return Cache.fastCacheSharedPrefs_delegate$lambda$1(this.f4280e);
        }
    }
}
