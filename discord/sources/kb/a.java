package kb;

import a5.b0;
import android.content.Context;
import android.util.Log;
import ci.q;
import com.facebook.soloader.w;
import e4.l;
import ga.k;
import java.io.File;
import o9.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f14312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f14313e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14314i;

    public a(Context context, int i7) {
        this.f14312d = context;
        this.f14314i = i7;
        b0 b0Var = new b0((char) 0, 9);
        this.f14313e = b0Var;
        b0Var.B(context.getApplicationInfo().sourceDir);
    }

    public b0 a() {
        Context context = this.f14312d;
        b0 b0Var = this.f14313e;
        a aVar = new a(context, b0Var);
        l lVar = new l(11, context, b0Var);
        i8.b bVar = new i8.b(11);
        q qVar = new q(context);
        d dVar = new d(4);
        dVar.f17185e = this.f14314i;
        return new b0(new b[]{aVar, lVar, bVar, qVar, dVar, new vi.d(10, (byte) 0), new k(), new i8.b(11)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kb.b
    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, com.facebook.soloader.b0[] b0VarArr) {
        int i7;
        b0 b0Var = this.f14313e;
        Context context = this.f14312d;
        String str = context.getApplicationInfo().sourceDir;
        if (new File(str).exists() && b0Var.B(str)) {
            for (int i10 = 0; i10 < b0VarArr.length; i10++) {
                Object[] objArr = b0VarArr[i10];
                if (objArr instanceof w) {
                    b0VarArr[i10] = ((w) objArr).a(context);
                }
            }
            return true;
        }
        int i11 = this.f14314i;
        synchronized (b0Var) {
            i7 = b0Var.f173e;
        }
        if (i11 == i7) {
            return false;
        }
        Log.w("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }

    public a(Context context, b0 b0Var) {
        int i7;
        this.f14312d = context;
        this.f14313e = b0Var;
        synchronized (b0Var) {
            i7 = b0Var.f173e;
        }
        this.f14314i = i7;
    }
}
