package es;

import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class d extends rs.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f8733e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f8734i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rs.b bVar, h hVar, e eVar) {
        super(bVar);
        this.f8733e = hVar;
        this.f8734i = eVar;
    }

    @Override // rs.g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f8732d) {
            return;
        }
        this.f8732d = true;
        h hVar = this.f8733e;
        e eVar = this.f8734i;
        synchronized (hVar) {
            try {
                int i7 = eVar.f8742h - 1;
                eVar.f8742h = i7;
                if (i7 == 0 && eVar.f8740f) {
                    hVar.O(eVar);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
