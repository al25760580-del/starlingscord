package io.sentry.cache.tape;

import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.w5;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import vp.t;
import vp.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12545e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Iterable f12546i;

    public c(d dVar, g gVar) {
        this.f12544d = 0;
        this.f12546i = dVar;
        this.f12545e = gVar;
    }

    public t a() {
        t tVar;
        Stack stack = (Stack) this.f12545e;
        t tVar2 = (t) this.f12546i;
        if (tVar2 == null) {
            throw new NoSuchElementException();
        }
        while (!stack.isEmpty()) {
            vp.d dVar = ((x) stack.pop()).f21926v;
            while (dVar instanceof x) {
                x xVar = (x) dVar;
                stack.push(xVar);
                dVar = xVar.f21925i;
            }
            t tVar3 = (t) dVar;
            if (tVar3.f21919e.length != 0) {
                tVar = tVar3;
                this.f12546i = tVar;
                return tVar2;
            }
        }
        tVar = null;
        this.f12546i = tVar;
        return tVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12544d) {
            case 0:
                return ((g) this.f12545e).hasNext();
            default:
                return ((t) this.f12546i) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12544d) {
            case 0:
                byte[] bArr = (byte[]) ((g) this.f12545e).next();
                w5 w5Var = ((io.sentry.cache.g) ((d) this.f12546i).f12549i.f20946d).f12542a;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.g.f12541c));
                    try {
                        Breadcrumb breadcrumb = (Breadcrumb) w5Var.getSerializer().d(bufferedReader, Breadcrumb.class);
                        bufferedReader.close();
                        return breadcrumb;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    w5Var.getLogger().e(SentryLevel.ERROR, th4, "Error reading entity from scope cache", new Object[0]);
                    return null;
                }
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12544d) {
            case 0:
                ((g) this.f12545e).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c(vp.d dVar) {
        this.f12544d = 1;
        this.f12545e = new Stack();
        while (dVar instanceof x) {
            x xVar = (x) dVar;
            ((Stack) this.f12545e).push(xVar);
            dVar = xVar.f21925i;
        }
        this.f12546i = (t) dVar;
    }
}
