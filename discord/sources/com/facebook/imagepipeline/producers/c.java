package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4953a = false;

    public static boolean d(int i7) {
        return (i7 & 1) == 1;
    }

    public static boolean e(int i7) {
        return !d(i7);
    }

    public static boolean k(int i7, int i10) {
        return (i7 & i10) == i10;
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public final synchronized void a() {
        if (this.f4953a) {
            return;
        }
        this.f4953a = true;
        try {
            f();
        } catch (Exception e10) {
            j(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public final synchronized void b(int i7, Object obj) {
        try {
            if (this.f4953a) {
                return;
            }
            this.f4953a = d(i7);
            try {
                h(i7, obj);
            } catch (Exception e10) {
                j(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public final synchronized void c(float f2) {
        if (this.f4953a) {
            return;
        }
        try {
            i(f2);
        } catch (Exception e10) {
            j(e10);
        }
    }

    public abstract void f();

    public abstract void g(Throwable th2);

    public abstract void h(int i7, Object obj);

    public abstract void i(float f2);

    public final void j(Exception exc) {
        Class<?> cls = getClass();
        if (o8.a.f17171a.isLoggable(6)) {
            o8.a.f17171a.wtf(cls.getSimpleName(), "unhandled exception", exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public final synchronized void onFailure(Throwable th2) {
        if (this.f4953a) {
            return;
        }
        this.f4953a = true;
        try {
            g(th2);
        } catch (Exception e10) {
            j(e10);
        }
    }
}
