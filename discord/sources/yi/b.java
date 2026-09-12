package yi;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f23355e;

    public /* synthetic */ b(c cVar, int i7) {
        this.f23354d = i7;
        this.f23355e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zi.a aVarT;
        zi.a aVarG;
        switch (this.f23354d) {
            case 0:
                this.f23355e.a();
                return;
            case 1:
                c cVar = this.f23355e;
                Object obj = c.f23356m;
                synchronized (obj) {
                    try {
                        ji.f fVar = cVar.f23357a;
                        fVar.a();
                        io.sentry.internal.debugmeta.c cVarR0 = io.sentry.internal.debugmeta.c.r0(fVar.f13890a);
                        try {
                            aVarT = cVar.f23359c.t();
                            if (cVarR0 != null) {
                                cVarR0.E0();
                            }
                        } catch (Throwable th2) {
                            if (cVarR0 != null) {
                                cVarR0.E0();
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                try {
                    int i7 = aVarT.f24008b;
                    if (i7 == 5) {
                        aVarG = cVar.g(aVarT);
                    } else {
                        if (i7 == 3) {
                            aVarG = cVar.g(aVarT);
                        } else if (!cVar.f23360d.a(aVarT)) {
                            return;
                        } else {
                            aVarG = cVar.b(aVarT);
                        }
                    }
                    synchronized (obj) {
                        try {
                            ji.f fVar2 = cVar.f23357a;
                            fVar2.a();
                            io.sentry.internal.debugmeta.c cVarR1 = io.sentry.internal.debugmeta.c.r0(fVar2.f13890a);
                            try {
                                cVar.f23359c.r(aVarG);
                                if (cVarR1 != null) {
                                    cVarR1.E0();
                                }
                            } catch (Throwable th4) {
                                if (cVarR1 != null) {
                                    cVarR1.E0();
                                }
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.k.size() != 0 && !TextUtils.equals(aVarT.f24007a, aVarG.f24007a)) {
                                Iterator it = cVar.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    if (aVarG.f24008b == 4) {
                        String str = aVarG.f24007a;
                        synchronized (cVar) {
                            cVar.j = str;
                        }
                    }
                    int i10 = aVarG.f24008b;
                    if (i10 == 5) {
                        cVar.h(new e());
                        return;
                    } else if (i10 == 2 || i10 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(aVarG);
                        return;
                    }
                } catch (e e10) {
                    cVar.h(e10);
                    return;
                }
            default:
                this.f23355e.a();
                return;
        }
    }
}
