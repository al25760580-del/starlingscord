package com.discord.media.engine.video.texture_view;

import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4467d;

    public /* synthetic */ b(int i7) {
        this.f4467d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zClearEmptyReferences$lambda$33$lambda$30$lambda$28;
        switch (this.f4467d) {
            case 0:
                zClearEmptyReferences$lambda$33$lambda$30$lambda$28 = StreamManager.clearEmptyReferences$lambda$33$lambda$30$lambda$28((StreamManager.StreamConsumerData) obj);
                break;
            case 1:
                zClearEmptyReferences$lambda$33$lambda$30$lambda$28 = StreamManager.clearEmptyReferences$lambda$33$lambda$31((Map.Entry) obj);
                break;
            case 2:
                zClearEmptyReferences$lambda$33$lambda$30$lambda$28 = StreamManager.setActiveStreamConsumer$lambda$11$lambda$10$lambda$8((WeakReference) obj);
                break;
            case 3:
                zClearEmptyReferences$lambda$33$lambda$30$lambda$28 = StreamManager.clearEmptyReferences$lambda$33$lambda$21((Map.Entry) obj);
                break;
            case 4:
                zClearEmptyReferences$lambda$33$lambda$30$lambda$28 = StreamManager.clearEmptyReferences$lambda$33$lambda$25$lambda$23((WeakReference) obj);
                break;
            default:
                zClearEmptyReferences$lambda$33$lambda$30$lambda$28 = StreamManager.clearEmptyReferences$lambda$33$lambda$26((Map.Entry) obj);
                break;
        }
        return Boolean.valueOf(zClearEmptyReferences$lambda$33$lambda$30$lambda$28);
    }
}
