package je;

import a5.i0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f13807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f13808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f13809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f13810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f13811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f13812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f13813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13815i;

    public m(Looper looper, y yVar, k kVar) {
        this(new CopyOnWriteArraySet(), looper, yVar, kVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f13813g) {
            try {
                if (this.f13814h) {
                    return;
                }
                this.f13810d.add(new l(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f13812f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        a0 a0Var = this.f13808b;
        if (!a0Var.f13757a.hasMessages(0)) {
            a0Var.getClass();
            z zVarB = a0.b();
            Message messageObtainMessage = a0Var.f13757a.obtainMessage(0);
            zVarB.f13867a = messageObtainMessage;
            Handler handler = a0Var.f13757a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            zVarB.a();
        }
        ArrayDeque arrayDeque2 = this.f13811e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i7, j jVar) {
        f();
        this.f13812f.add(new ab.a(new CopyOnWriteArraySet(this.f13810d), i7, jVar, 10));
    }

    public final void d() {
        f();
        synchronized (this.f13813g) {
            this.f13814h = true;
        }
        for (l lVar : this.f13810d) {
            k kVar = this.f13809c;
            lVar.f13806d = true;
            if (lVar.f13805c) {
                lVar.f13805c = false;
                kVar.h(lVar.f13803a, lVar.f13804b.k());
            }
        }
        this.f13810d.clear();
    }

    public final void e(int i7, j jVar) {
        c(i7, jVar);
        b();
    }

    public final void f() {
        if (this.f13815i) {
            b.k(Thread.currentThread() == this.f13808b.f13757a.getLooper().getThread());
        }
    }

    public m(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, y yVar, k kVar, boolean z5) {
        this.f13807a = yVar;
        this.f13810d = copyOnWriteArraySet;
        this.f13809c = kVar;
        this.f13813g = new Object();
        this.f13811e = new ArrayDeque();
        this.f13812f = new ArrayDeque();
        this.f13808b = yVar.a(looper, new Handler.Callback() { // from class: je.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                m mVar = this.f13802d;
                for (l lVar : mVar.f13810d) {
                    k kVar2 = mVar.f13809c;
                    if (!lVar.f13806d && lVar.f13805c) {
                        g gVarK = lVar.f13804b.k();
                        lVar.f13804b = new i0();
                        lVar.f13805c = false;
                        kVar2.h(lVar.f13803a, gVarK);
                    }
                    if (mVar.f13808b.f13757a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f13815i = z5;
    }
}
