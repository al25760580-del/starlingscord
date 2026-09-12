package we;

import a5.l0;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import ig.l;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements ig.a, ig.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c f22195e = new c(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c f22196i = new c(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c f22197v = new c(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22198d;

    public /* synthetic */ c(int i7) {
        this.f22198d = i7;
    }

    @Override // ig.a
    public Object f(Task task) throws IOException {
        switch (this.f22198d) {
            case 0:
                if (task.m()) {
                    return (Bundle) task.i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.h())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.h());
            default:
                Intent intent = (Intent) ((Bundle) task.i()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // ig.f
    public l i(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i7 = Rpc.f5920h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? l0.v(bundle) : l0.v(null);
    }
}
