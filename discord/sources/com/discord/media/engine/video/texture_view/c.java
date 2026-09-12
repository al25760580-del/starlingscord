package com.discord.media.engine.video.texture_view;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f4469b;

    public /* synthetic */ c(Function1 function1, int i7) {
        this.f4468a = i7;
        this.f4469b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f4468a) {
            case 0:
                return StreamManager.clearEmptyReferences$lambda$33$lambda$30$lambda$29((b) this.f4469b, obj);
            case 1:
                return StreamManager.clearEmptyReferences$lambda$33$lambda$32((b) this.f4469b, obj);
            case 2:
                return StreamManager.releaseIfActiveStreamConsumer$lambda$17$lambda$16((d) this.f4469b, obj);
            case 3:
                return StreamManager.clearEmptyReferences$lambda$33$lambda$22((b) this.f4469b, obj);
            case 4:
                return StreamManager.clearEmptyReferences$lambda$33$lambda$25$lambda$24((b) this.f4469b, obj);
            default:
                return StreamManager.clearEmptyReferences$lambda$33$lambda$27((b) this.f4469b, obj);
        }
    }
}
