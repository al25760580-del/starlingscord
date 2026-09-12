package ni;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f16940e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f16941i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u4.b f16942v;

    public /* synthetic */ d(e eVar, Runnable runnable, u4.b bVar, int i7) {
        this.f16939d = i7;
        this.f16940e = eVar;
        this.f16941i = runnable;
        this.f16942v = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16939d) {
            case 0:
                ExecutorService executorService = this.f16940e.f16943d;
                final int i7 = 0;
                final Runnable runnable = this.f16941i;
                final u4.b bVar = this.f16942v;
                executorService.execute(new Runnable() { // from class: ni.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i7) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    g gVar = (g) bVar.f20945e;
                                    if (o0.g.f17094x.g(gVar, null, new o0.b(e10))) {
                                        o0.g.e(gVar);
                                    }
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    g gVar2 = (g) bVar.f20945e;
                                    if (o0.g.f17094x.g(gVar2, null, new o0.b(e11))) {
                                        o0.g.e(gVar2);
                                        return;
                                    }
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                g gVar3 = (g) bVar.f20945e;
                                try {
                                    runnable2.run();
                                    if (o0.g.f17094x.g(gVar3, null, o0.g.f17095y)) {
                                        o0.g.e(gVar3);
                                        return;
                                    }
                                    return;
                                } catch (Exception e12) {
                                    if (o0.g.f17094x.g(gVar3, null, new o0.b(e12))) {
                                        o0.g.e(gVar3);
                                        return;
                                    }
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f16940e.f16943d;
                final int i10 = 2;
                final Runnable runnable2 = this.f16941i;
                final u4.b bVar2 = this.f16942v;
                executorService2.execute(new Runnable() { // from class: ni.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    g gVar = (g) bVar2.f20945e;
                                    if (o0.g.f17094x.g(gVar, null, new o0.b(e10))) {
                                        o0.g.e(gVar);
                                    }
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    g gVar2 = (g) bVar2.f20945e;
                                    if (o0.g.f17094x.g(gVar2, null, new o0.b(e11))) {
                                        o0.g.e(gVar2);
                                        return;
                                    }
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                g gVar3 = (g) bVar2.f20945e;
                                try {
                                    runnable3.run();
                                    if (o0.g.f17094x.g(gVar3, null, o0.g.f17095y)) {
                                        o0.g.e(gVar3);
                                        return;
                                    }
                                    return;
                                } catch (Exception e12) {
                                    if (o0.g.f17094x.g(gVar3, null, new o0.b(e12))) {
                                        o0.g.e(gVar3);
                                        return;
                                    }
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f16940e.f16943d;
                final int i11 = 1;
                final Runnable runnable3 = this.f16941i;
                final u4.b bVar3 = this.f16942v;
                executorService3.execute(new Runnable() { // from class: ni.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    g gVar = (g) bVar3.f20945e;
                                    if (o0.g.f17094x.g(gVar, null, new o0.b(e10))) {
                                        o0.g.e(gVar);
                                    }
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    g gVar2 = (g) bVar3.f20945e;
                                    if (o0.g.f17094x.g(gVar2, null, new o0.b(e11))) {
                                        o0.g.e(gVar2);
                                        return;
                                    }
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                g gVar3 = (g) bVar3.f20945e;
                                try {
                                    runnable4.run();
                                    if (o0.g.f17094x.g(gVar3, null, o0.g.f17095y)) {
                                        o0.g.e(gVar3);
                                        return;
                                    }
                                    return;
                                } catch (Exception e12) {
                                    if (o0.g.f17094x.g(gVar3, null, new o0.b(e12))) {
                                        o0.g.e(gVar3);
                                        return;
                                    }
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
