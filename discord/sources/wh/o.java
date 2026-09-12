package wh;

import ci.c0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.integrity.c f22299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.google.android.play.core.integrity.c cVar, ig.g gVar) {
        super(gVar);
        Objects.requireNonNull(cVar);
        this.f22299e = cVar;
    }

    @Override // ci.c0
    public final void a(Exception exc) {
        if (!(exc instanceof ci.e)) {
            super.a(exc);
        } else if (com.google.android.play.core.integrity.c.d(this.f22299e)) {
            super.a(new b(-2, exc));
        } else {
            super.a(new b(-9, exc));
        }
    }
}
