package org.webrtc;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17684e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17685i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17686v;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        this.f17683d = i7;
        this.f17684e = obj;
        this.f17685i = obj2;
        this.f17686v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f17683d) {
            case 0:
                ((EglRenderer) this.f17684e).lambda$removeFrameListener$2((CountDownLatch) this.f17685i, (EglRenderer.FrameListener) this.f17686v);
                return;
            case 1:
                ((EglRenderer) this.f17684e).lambda$removeRenderListener$3((CountDownLatch) this.f17685i, (EglRenderer.RenderListener) this.f17686v);
                return;
            case 2:
                ((VideoFileRenderer) this.f17684e).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f17685i, (VideoFrame) this.f17686v);
                return;
            default:
                w3.e eVar = (w3.e) this.f17684e;
                ListenableFuture listenableFuture = (ListenableFuture) this.f17685i;
                w3.r rVar = (w3.r) this.f17686v;
                try {
                    zBooleanValue = ((Boolean) listenableFuture.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (eVar.k) {
                    try {
                        e4.j jVarH = a.a.h(rVar.f22058i);
                        String str = jVarH.f7984a;
                        if (eVar.c(str) == rVar) {
                            eVar.b(str);
                        }
                        v3.q.d().a(w3.e.f22015l, w3.e.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                        Iterator it = eVar.j.iterator();
                        while (it.hasNext()) {
                            ((w3.c) it.next()).e(jVarH, zBooleanValue);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }
}
