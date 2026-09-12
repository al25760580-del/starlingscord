package app.rive.runtime.kotlin;

import c5.p;
import c5.t;
import com.discord.play_delivery.PlayAssetDelivery;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.sentry.IScope;
import io.sentry.protocol.v;
import io.sentry.r3;
import io.sentry.util.d;
import io.sentry.util.l;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p, OnCompleteListener, d, r3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2875e;

    public /* synthetic */ b(v vVar, String str) {
        this.f2874d = 4;
        this.f2875e = str;
    }

    @Override // io.sentry.util.d
    public Object b() {
        int i7 = this.f2874d;
        String str = this.f2875e;
        switch (i7) {
            case 2:
                return str;
            default:
                Charset charset = l.f13233a;
                if (str.equals("0000-0000")) {
                    str = "00000000-0000-0000-0000-000000000000";
                }
                return str.replace("-", "");
        }
    }

    @Override // c5.p
    public void d(t tVar) throws IOException {
        RiveAnimationView.loadFromNetwork$lambda$5(this.f2875e, tVar);
    }

    @Override // io.sentry.r3
    public void g(IScope iScope) {
        iScope.B(this.f2875e);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        PlayAssetDelivery.startFetch$lambda$0(this.f2875e, task);
    }

    public /* synthetic */ b(String str, int i7) {
        this.f2874d = i7;
        this.f2875e = str;
    }
}
