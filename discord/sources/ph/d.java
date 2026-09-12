package ph;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ResultReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18032d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ig.g f18033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Handler handler, ig.g gVar) {
        super(handler);
        this.f18033e = gVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        switch (this.f18032d) {
            case 0:
                ig.g gVar = this.f18033e;
                if (i7 != 1) {
                    gVar.d(new i(2));
                } else {
                    gVar.d(new i(1));
                }
                break;
            default:
                this.f18033e.d(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Handler handler, ig.g gVar2) {
        super(handler);
        this.f18033e = gVar2;
        Objects.requireNonNull(gVar);
    }
}
