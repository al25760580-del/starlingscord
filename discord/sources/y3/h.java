package y3;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f4.l;
import f4.o;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f23185e;

    public /* synthetic */ h(i iVar, int i7) {
        this.f23184d = i7;
        this.f23185e = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001a, B:8:0x001e, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005a, B:20:0x0064, B:22:0x006c, B:23:0x006e, B:27:0x0078, B:29:0x0085, B:37:0x0097, B:33:0x008b, B:34:0x008c, B:36:0x0094, B:41:0x009b, B:24:0x006f, B:25:0x0075, B:17:0x005b, B:18:0x0061), top: B:66:0x001a, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0094 A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001a, B:8:0x001e, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005a, B:20:0x0064, B:22:0x006c, B:23:0x006e, B:27:0x0078, B:29:0x0085, B:37:0x0097, B:33:0x008b, B:34:0x008c, B:36:0x0094, B:41:0x009b, B:24:0x006f, B:25:0x0075, B:17:0x005b, B:18:0x0061), top: B:66:0x001a, inners: #2, #3 }] */
    @Override // java.lang.Runnable
    public final void run() {
        h4.a aVar;
        h hVar;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.f23184d) {
            case 0:
                synchronized (this.f23185e.f23192y) {
                    i iVar = this.f23185e;
                    iVar.E = (Intent) iVar.f23192y.get(0);
                    break;
                }
                Intent intent = this.f23185e.E;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f23185e.E.getIntExtra("KEY_START_ID", 0);
                    q qVarD = q.d();
                    String str = i.H;
                    qVarD.a(str, "Processing command " + this.f23185e.E + ", " + intExtra);
                    PowerManager.WakeLock wakeLockA = o.a(this.f23185e.f23186d, action + " (" + intExtra + ")");
                    try {
                        q.d().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.acquire();
                        i iVar2 = this.f23185e;
                        iVar2.f23191x.a(iVar2.E, intExtra, iVar2);
                        q.d().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        i iVar3 = this.f23185e;
                        aVar = iVar3.f23187e.f10330d;
                        hVar = new h(iVar3, 1);
                    } catch (Throwable th2) {
                        try {
                            q qVarD2 = q.d();
                            String str2 = i.H;
                            qVarD2.c(str2, "Unexpected error in onHandleIntent", th2);
                            q.d().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                            wakeLockA.release();
                            i iVar4 = this.f23185e;
                            aVar = iVar4.f23187e.f10330d;
                            hVar = new h(iVar4, 1);
                        } catch (Throwable th3) {
                            q.d().a(i.H, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                            wakeLockA.release();
                            i iVar5 = this.f23185e;
                            iVar5.f23187e.f10330d.execute(new h(iVar5, 1));
                            throw th3;
                        }
                    }
                    aVar.execute(hVar);
                    return;
                }
                return;
            default:
                i iVar6 = this.f23185e;
                q qVarD3 = q.d();
                String str3 = i.H;
                qVarD3.a(str3, "Checking if commands are complete.");
                i.b();
                synchronized (iVar6.f23192y) {
                    try {
                        if (iVar6.E != null) {
                            q.d().a(str3, "Removing command " + iVar6.E);
                            if (!((Intent) iVar6.f23192y.remove(0)).equals(iVar6.E)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            iVar6.E = null;
                        }
                        l lVar = iVar6.f23187e.f10327a;
                        c cVar = iVar6.f23191x;
                        synchronized (cVar.f23167i) {
                            zIsEmpty = cVar.f23166e.isEmpty();
                            break;
                        }
                        if (zIsEmpty && iVar6.f23192y.isEmpty()) {
                            synchronized (lVar.f8838e) {
                                zIsEmpty2 = lVar.f8839i.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                q.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = iVar6.F;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            } else if (!iVar6.f23192y.isEmpty()) {
                                iVar6.c();
                            }
                        } else if (!iVar6.f23192y.isEmpty()) {
                            iVar6.c();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
