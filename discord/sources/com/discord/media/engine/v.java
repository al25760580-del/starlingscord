package com.discord.media.engine;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4451e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4452i;

    public /* synthetic */ v(int i7, Object obj, Object obj2) {
        this.f4450d = i7;
        this.f4451e = obj;
        this.f4452i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4450d) {
            case 0:
                return MediaEngineModule.C01761.invokeSuspend$lambda$0((CoroutineScope) this.f4451e, (MediaEngineModule) this.f4452i, (String) obj);
            default:
                return MediaEngine.setBroadcastThumbnailParams$lambda$64$lambda$63((MediaEngine) this.f4451e, (Function1) this.f4452i, (Bitmap) obj);
        }
    }
}
