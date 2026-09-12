package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f15258c;

    public v0(w0 substitution, int i7) {
        this.f15257b = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(substitution, "substitution");
                this.f15258c = substitution;
                break;
            default:
                this.f15258c = substitution;
                break;
        }
    }

    @Override // lq.w0
    public boolean a() {
        switch (this.f15257b) {
            case 1:
                return this.f15258c.a();
            default:
                return super.a();
        }
    }

    @Override // lq.w0
    public boolean b() {
        switch (this.f15257b) {
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override // lq.w0
    public final wo.h d(wo.h annotations) {
        switch (this.f15257b) {
            case 0:
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                break;
            default:
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                break;
        }
        return this.f15258c.d(annotations);
    }

    @Override // lq.w0
    public final t0 e(z key) {
        switch (this.f15257b) {
            case 0:
                Intrinsics.checkNotNullParameter(key, "key");
                return this.f15258c.e(key);
            default:
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(key, "key");
                t0 t0VarE = this.f15258c.e(key);
                if (t0VarE == null) {
                    return null;
                }
                vo.i iVarG = key.r0().g();
                return com.facebook.imagepipeline.nativecode.c.m(t0VarE, iVarG instanceof vo.r0 ? (vo.r0) iVarG : null);
        }
    }

    @Override // lq.w0
    public final boolean f() {
        switch (this.f15257b) {
            case 0:
                break;
        }
        return this.f15258c.f();
    }

    @Override // lq.w0
    public final z g(z topLevelType, e1 position) {
        switch (this.f15257b) {
            case 0:
                Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
                Intrinsics.checkNotNullParameter(position, "position");
                break;
            default:
                Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
                Intrinsics.checkNotNullParameter(position, "position");
                break;
        }
        return this.f15258c.g(topLevelType, position);
    }
}
