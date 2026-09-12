package j8;

import com.facebook.common.internal.Supplier;
import e4.m;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier f13699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i8.b f13701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile j f13702e = new j((b) null, (File) null);

    public h(int i7, Supplier supplier, String str, i8.b bVar) {
        this.f13698a = i7;
        this.f13701d = bVar;
        this.f13699b = supplier;
        this.f13700c = str;
    }

    @Override // j8.e
    public final h8.a a(Object obj, String str) {
        return i().a(obj, str);
    }

    @Override // j8.e
    public final void b() {
        try {
            i().b();
        } catch (IOException e10) {
            o8.a.e(h.class, "purgeUnexpectedResources", e10);
        }
    }

    @Override // j8.e
    public final Collection c() {
        return i().c();
    }

    @Override // j8.e
    public final long d(a aVar) {
        return i().d(aVar);
    }

    @Override // j8.e
    public final void e() {
        i().e();
    }

    @Override // j8.e
    public final m f(Object obj, String str) {
        return i().f(obj, str);
    }

    @Override // j8.e
    public final boolean g(Object obj, String str) {
        return i().g(obj, str);
    }

    public final void h() throws m8.b {
        File file = new File((File) this.f13699b.get(), this.f13700c);
        try {
            xr.m.E(file);
            String absolutePath = file.getAbsolutePath();
            if (o8.a.f17171a.isLoggable(3)) {
                o8.a.f17171a.d(h.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.f13702e = new j(new b(file, this.f13698a, this.f13701d), file);
        } catch (m8.b e10) {
            this.f13701d.getClass();
            throw e10;
        }
    }

    public final synchronized e i() {
        e eVar;
        File file;
        j jVar = this.f13702e;
        if (((e) jVar.f13707e) == null || (file = (File) jVar.f13708i) == null || !file.exists()) {
            if (((e) this.f13702e.f13707e) != null && ((File) this.f13702e.f13708i) != null) {
                q.o((File) this.f13702e.f13708i);
            }
            h();
        }
        eVar = (e) this.f13702e.f13707e;
        eVar.getClass();
        return eVar;
    }

    @Override // j8.e
    public final boolean isExternal() {
        try {
            return i().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // j8.e
    public final long remove(String str) {
        return i().remove(str);
    }
}
