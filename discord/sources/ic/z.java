package ic;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f11691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f11692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f11693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f11694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f11695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f11696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11697h;

    public z() {
        ByteBuffer byteBuffer = n.f11577a;
        this.f11695f = byteBuffer;
        this.f11696g = byteBuffer;
        l lVar = l.f11561e;
        this.f11693d = lVar;
        this.f11694e = lVar;
        this.f11691b = lVar;
        this.f11692c = lVar;
    }

    @Override // ic.n
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f11696g;
        this.f11696g = n.f11577a;
        return byteBuffer;
    }

    @Override // ic.n
    public final l b(l lVar) {
        this.f11693d = lVar;
        this.f11694e = g(lVar);
        return c() ? this.f11694e : l.f11561e;
    }

    @Override // ic.n
    public boolean c() {
        return this.f11694e != l.f11561e;
    }

    @Override // ic.n
    public final void e() {
        this.f11697h = true;
        i();
    }

    @Override // ic.n
    public boolean f() {
        return this.f11697h && this.f11696g == n.f11577a;
    }

    @Override // ic.n
    public final void flush() {
        this.f11696g = n.f11577a;
        this.f11697h = false;
        this.f11691b = this.f11693d;
        this.f11692c = this.f11694e;
        h();
    }

    public abstract l g(l lVar);

    public final ByteBuffer k(int i7) {
        if (this.f11695f.capacity() < i7) {
            this.f11695f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f11695f.clear();
        }
        ByteBuffer byteBuffer = this.f11695f;
        this.f11696g = byteBuffer;
        return byteBuffer;
    }

    @Override // ic.n
    public final void reset() {
        flush();
        this.f11695f = n.f11577a;
        l lVar = l.f11561e;
        this.f11693d = lVar;
        this.f11694e = lVar;
        this.f11691b = lVar;
        this.f11692c = lVar;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
