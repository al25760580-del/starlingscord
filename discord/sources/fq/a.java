package fq;

import af.w;
import android.os.Bundle;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.gms.internal.gtm.zzbv;
import e4.l;
import he.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lq.z;
import np.m;
import pe.i;
import wo.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements e, DataSource.Factory, m, r4.e, wo.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9357e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f9356d = i7;
        this.f9357e = obj;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 1 || i7 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2) ? 2 : 3];
        if (i7 == 1 || i7 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i7 == 1) {
            objArr[1] = "getType";
        } else if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i7 != 1 && i7 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void w0(int i7) {
        String str = i7 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 1 ? 3 : 2];
        if (i7 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i7 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i7 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // np.m
    public void K(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.f9357e).add((String) obj);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DataSource createDataSource() {
        oc.b bVar = (oc.b) this;
        oc.a aVar = new oc.a(bVar.f17202i, bVar.f17203v, (l) this.f9357e);
        u0 u0Var = bVar.f17204w;
        if (u0Var != null) {
            aVar.B(u0Var);
        }
        return aVar;
    }

    @Override // np.m
    public np.l e0(up.b bVar) {
        return null;
    }

    @Override // wo.a
    public h getAnnotations() {
        h hVar = (h) this.f9357e;
        if (hVar != null) {
            return hVar;
        }
        w0(1);
        throw null;
    }

    @Override // fq.e
    public z getType() {
        z zVar = (z) this.f9357e;
        if (zVar != null) {
            return zVar;
        }
        v0(1);
        throw null;
    }

    @Override // np.m
    public void i() {
        y0((String[]) ((ArrayList) this.f9357e).toArray(new String[0]));
    }

    @Override // r4.e
    public List q0() {
        return (List) this.f9357e;
    }

    @Override // r4.e
    public boolean t0() {
        List list = (List) this.f9357e;
        return list.isEmpty() || (list.size() == 1 && ((y4.a) list.get(0)).c());
    }

    public String toString() {
        switch (this.f9356d) {
            case 6:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f9357e;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public gl.a x0() {
        return (gl.a) ((Lambda) this.f9357e).invoke();
    }

    public abstract void y0(String[] strArr);

    public a(zzbv zzbvVar) {
        this.f9356d = 5;
        i iVarZzd = zzbvVar.zzd();
        ff.a aVarZzr = zzbvVar.zzr();
        w.g(iVarZzd);
        new ArrayList();
        w.g(aVarZzr);
        new HashMap();
        new ArrayList();
        this.f9357e = zzbvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function0 controllerProvider) {
        this.f9356d = 2;
        Intrinsics.checkNotNullParameter(controllerProvider, "controllerProvider");
        this.f9357e = (Lambda) controllerProvider;
    }

    public a(h hVar) {
        this.f9356d = 8;
        if (hVar != null) {
            this.f9357e = hVar;
        } else {
            w0(0);
            throw null;
        }
    }

    public a(z zVar) {
        this.f9356d = 0;
        if (zVar != null) {
            this.f9357e = zVar;
        } else {
            v0(0);
            throw null;
        }
    }

    public a(String type, Bundle data) {
        this.f9356d = 3;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f9357e = type;
    }

    public a(int i7) {
        this.f9356d = i7;
        switch (i7) {
            case 4:
                this.f9357e = new ArrayList();
                break;
            default:
                this.f9357e = new l(7);
                break;
        }
    }

    @Override // np.m
    public void r0(zp.f fVar) {
    }

    @Override // np.m
    public void B(up.b bVar, up.e eVar) {
    }
}
