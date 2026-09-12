package com.discord.misc.utilities.threading;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4495d;

    public /* synthetic */ a(int i7) {
        this.f4495d = i7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4495d) {
            case 0:
                ThreadUtilsKt.uiExecutor$lambda$1(runnable);
                break;
            case 1:
                runnable.run();
                break;
            default:
                o.a.T().f17070b.f17073c.execute(runnable);
                break;
        }
    }
}
