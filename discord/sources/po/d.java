package po;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class d implements vo.n, ze.i, ig.d, th.g, ci.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18079e;

    public /* synthetic */ d(int i7, Object obj) {
        this.f18078d = i7;
        this.f18079e = obj;
    }

    @Override // th.g
    public Object a() {
        switch (this.f18078d) {
            case 4:
                th.f fVar = (th.f) this.f18079e;
                if (fVar != null) {
                    return fVar.a();
                }
                throw new IllegalStateException();
            default:
                return new wh.d((wh.g) ((ci.o) this.f18079e).a());
        }
    }

    @Override // ze.i
    public void accept(Object obj, Object obj2) {
        GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.f18079e;
        sf.f fVar = new sf.f((ig.g) obj2, 1);
        sf.d dVar = (sf.d) ((sf.e) obj).o();
        ye.f fVarA = bg.c.a();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i7 = bg.b.f3229a;
        parcelObtain.writeStrongBinder(fVar);
        bg.b.b(parcelObtain, getCredentialRequest);
        bg.b.b(parcelObtain, fVarA);
        ((sf.b) dVar).j(1, parcelObtain);
    }

    public ByteBuffer b(int i7) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i7).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "{\n            ByteBuffer….LITTLE_ENDIAN)\n        }");
        return byteBufferOrder;
    }

    @Override // vo.n
    public Object c(yo.i0 i0Var, Object obj) {
        return d(i0Var, obj);
    }

    @Override // vo.n
    public Object d(vo.u descriptor, Object obj) {
        Unit data = (Unit) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new i0((g0) this.f18079e, descriptor);
    }

    @Override // vo.n
    public Object f(yo.h0 descriptor, Object obj) {
        Unit data = (Unit) obj;
        g0 g0Var = (g0) this.f18079e;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        int i7 = (descriptor.R != null ? 1 : 0) + (descriptor.S != null ? 1 : 0);
        if (descriptor.f23445y) {
            if (i7 == 0) {
                return new k0(g0Var, descriptor);
            }
            if (i7 == 1) {
                return new m0(g0Var, descriptor);
            }
            if (i7 == 2) {
                return new o0(g0Var, descriptor);
            }
        } else {
            if (i7 == 0) {
                return new a1(g0Var, descriptor);
            }
            if (i7 == 1) {
                return new d1(g0Var, descriptor);
            }
            if (i7 == 2) {
                return new g1(g0Var, descriptor);
            }
        }
        throw new ar.a0("Unsupported property: " + descriptor);
    }

    @Override // vo.n
    public Object j(yo.h hVar, Object obj) {
        return d(hVar, obj);
    }

    @Override // vo.n
    public Object k(yo.j0 j0Var, Object obj) {
        return d(j0Var, obj);
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        sh.s sVar = (sh.s) this.f18079e;
        List list = (List) obj;
        int iA = sVar.f20173b.a();
        for (File file : sVar.e()) {
            if (!list.contains(file.getName()) && sh.s.b(file, true) != iA) {
                sh.s.g(file);
            }
        }
    }

    public d(g0 container) {
        this.f18078d = 0;
        Intrinsics.checkNotNullParameter(container, "container");
        this.f18079e = container;
    }

    public d(int i7) {
        this.f18078d = i7;
        switch (i7) {
            case 4:
                break;
            case 5:
            case 7:
            default:
                this.f18079e = new SparseArray();
                break;
            case 6:
                this.f18079e = new HashSet();
                break;
            case 8:
                this.f18079e = new LinkedBlockingQueue();
                break;
        }
    }
}
