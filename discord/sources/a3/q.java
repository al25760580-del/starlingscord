package a3;

import android.content.Context;
import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import ar.b0;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.rive.v0;
import e2.z;
import i0.f0;
import i0.u;
import i0.x;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public final class q extends Lambda implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f115e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i7, Object obj) {
        super(0);
        this.f114d = i7;
        this.f115e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h3.g sQLiteOpenHelper;
        switch (this.f114d) {
            case 0:
                return ((r) this.f115e).b();
            case 1:
                return new a4.c[((Flow[]) this.f115e).length];
            case 2:
                try {
                    return (List) ((Lambda) this.f115e).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return n0.f14659d;
                }
            case 3:
                File file = (File) ((z) this.f115e).f7946a.invoke();
                String it = file.getAbsolutePath();
                synchronized (z.j) {
                    LinkedHashSet linkedHashSet = z.f7945i;
                    if (linkedHashSet.contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    linkedHashSet.add(it);
                }
                return file;
            case 4:
                cs.q qVar = ((gs.l) this.f115e).f10228e;
                Intrinsics.checkNotNull(qVar);
                List listA = qVar.a();
                ArrayList arrayList = new ArrayList(e0.l(listA, 10));
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it2.next()));
                }
                return arrayList;
            case 5:
                Context context = (Context) this.f115e;
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter("media_performance_class", StackTraceHelper.NAME_KEY);
                String fileName = Intrinsics.stringPlus("media_performance_class", ".preferences_pb");
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), Intrinsics.stringPlus("datastore/", fileName));
            case 6:
                return (Integer) b0.w(kotlin.coroutines.g.f14681d, new v0((PlayServicesDevicePerformance) this.f115e, null, 2));
            case 7:
                File file2 = (File) ((q) this.f115e).invoke();
                Intrinsics.checkNotNullParameter(file2, "<this>");
                String name = file2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(StringsKt.W('.', name, ""), "preferences_pb")) {
                    return file2;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 8:
                h3.h hVar = (h3.h) this.f115e;
                String str = hVar.f10317e;
                if (str == null || !hVar.f10319v) {
                    sQLiteOpenHelper = new h3.g(hVar.f10316d, hVar.f10317e, new ga.l(10), hVar.f10318i, hVar.f10320w);
                } else {
                    Context context2 = hVar.f10316d;
                    Intrinsics.checkNotNullParameter(context2, "context");
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                    sQLiteOpenHelper = new h3.g(hVar.f10316d, new File(noBackupFilesDir, str).getAbsolutePath(), new ga.l(10), hVar.f10318i, hVar.f10320w);
                }
                boolean z5 = hVar.f10322y;
                Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
                sQLiteOpenHelper.setWriteAheadLoggingEnabled(z5);
                return sQLiteOpenHelper;
            case 9:
                i0.z zVar = ((u) this.f115e).f11326m;
                zVar.f11348i.J = true;
                x xVar = zVar.j;
                if (xVar != null) {
                    xVar.H = true;
                }
                return Unit.f14616a;
            default:
                f0 f0Var = ((f0) this.f115e).G;
                if (f0Var != null) {
                    f0Var.H();
                }
                return Unit.f14616a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Function0 function0) {
        super(0);
        this.f114d = 2;
        this.f115e = (Lambda) function0;
    }
}
