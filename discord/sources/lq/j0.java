package lq;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15219d;

    public /* synthetic */ j0(int i7, Object obj) {
        this.f15218c = i7;
        this.f15219d = obj;
    }

    @Override // lq.w0
    public boolean a() {
        switch (this.f15218c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // lq.w0
    public boolean f() {
        switch (this.f15218c) {
            case 1:
                return ((Map) this.f15219d).isEmpty();
            default:
                return super.f();
        }
    }

    @Override // lq.r0
    public final t0 h(q0 key) {
        switch (this.f15218c) {
            case 0:
                Intrinsics.checkNotNullParameter(key, "key");
                if (!((ArrayList) this.f15219d).contains(key)) {
                    return null;
                }
                vo.i iVarG = key.g();
                Intrinsics.checkNotNull(iVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return b1.j((vo.r0) iVarG);
            default:
                Intrinsics.checkNotNullParameter(key, "key");
                return (t0) ((Map) this.f15219d).get(key);
        }
    }
}
