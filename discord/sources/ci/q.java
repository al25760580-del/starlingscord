package ci;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.CredentialManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.soloader.g0;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements p, kb.b, CredentialManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f3721d;

    public /* synthetic */ q(Context context) {
        this.f3721d = context;
    }

    @Override // ci.r
    public Object a() {
        return this.f3721d;
    }

    @Override // androidx.credentials.CredentialManager
    public void c(Context context, n1.o request, CancellationSignal cancellationSignal, com.discord.misc.utilities.threading.a executor, u4.b callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        n1.j jVarA = hf.b.a(new hf.b(context), request);
        if (jVarA == null) {
            callback.h(new o1.n("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            jVarA.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public void e(Context ctx, n1.e request, CancellationSignal cancellationSignal, com.discord.misc.utilities.threading.a executor, ga.l callback) {
        Intrinsics.checkNotNullParameter(ctx, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        n1.j jVarA = hf.b.a(new hf.b(this.f3721d), request);
        if (jVarA == null) {
            callback.h(new o1.g("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
            return;
        }
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            callback.h(new o1.i("createCredential is not supported on this device"));
        } else {
            jVarA.onCreateCredential(ctx, request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public void g(n1.v request, com.discord.misc.utilities.threading.a executor, u4.c callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        n1.j jVarA = hf.b.a(new hf.b(this.f3721d), request);
        if (jVarA == null) {
            callback.h(new q1.c("No Credential Manager provider found"));
        } else {
            jVarA.onSignalCredentialState(request, executor, callback);
        }
    }

    @Override // kb.b
    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, com.facebook.soloader.b0[] b0VarArr) {
        if (!(unsatisfiedLinkError instanceof com.facebook.soloader.a0)) {
            return false;
        }
        Log.e("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.f3721d.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            Log.e("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (com.facebook.soloader.b0 b0Var : b0VarArr) {
            if (b0Var instanceof com.facebook.soloader.b) {
                com.facebook.soloader.b bVar = (com.facebook.soloader.b) b0Var;
                try {
                    for (g0 g0Var : bVar.f()) {
                        if (!new File(file, g0Var.f5395d).exists()) {
                            arrayList.add(g0Var.f5395d);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Log.e("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                        bVar.d(0);
                        break;
                    }
                    Log.e("SoLoader", "No libraries missing from " + file);
                    return false;
                } catch (Exception e10) {
                    Log.e("SoLoader", "Encountered an exception while recovering from /data/app failure ", e10);
                    return false;
                }
            }
        }
        for (com.facebook.soloader.b0 b0Var2 : b0VarArr) {
            if ((b0Var2 instanceof com.facebook.soloader.e) && !(b0Var2 instanceof com.facebook.soloader.b)) {
                com.facebook.soloader.e eVar = (com.facebook.soloader.e) b0Var2;
                eVar.f5387b = 1 | eVar.f5387b;
            }
        }
        Log.e("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }

    public q(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3721d = context;
    }
}
