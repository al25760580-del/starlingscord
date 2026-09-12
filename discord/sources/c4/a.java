package c4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f3446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3447g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, h4.b taskExecutor, int i7) {
        super(context, taskExecutor);
        this.f3447g = i7;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f3446f = new d(0, this);
    }

    @Override // c4.f
    public final Object a() {
        switch (this.f3447g) {
            case 0:
                Intent intentRegisterReceiver = this.f3454b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    q.d().b(b.f3448a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = this.f3454b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    q.d().b(c.f3449a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z5 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            default:
                Intent intentRegisterReceiver3 = this.f3454b.registerReceiver(null, e());
                boolean z6 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z6 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z6 = false;
                    }
                }
                return Boolean.valueOf(z6);
        }
    }

    @Override // c4.f
    public final void c() {
        q.d().a(e.f3452a, getClass().getSimpleName().concat(": registering receiver"));
        this.f3454b.registerReceiver(this.f3446f, e());
    }

    @Override // c4.f
    public final void d() {
        q.d().a(e.f3452a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f3454b.unregisterReceiver(this.f3446f);
    }

    public final IntentFilter e() {
        switch (this.f3447g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
