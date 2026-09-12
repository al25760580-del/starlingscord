package b2;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.provider.Settings;
import androidx.appcompat.widget.h3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3045a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qb.a aVar, Handler handler) {
        super(handler);
        this.f3046b = aVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f3045a) {
        }
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        Cursor cursor;
        switch (this.f3045a) {
            case 0:
                h3 h3Var = (h3) this.f3046b;
                if (h3Var.f3048e && (cursor = h3Var.f3049i) != null && !cursor.isClosed()) {
                    h3Var.f3047d = h3Var.f3049i.requery();
                    break;
                }
                break;
            default:
                super.onChange(z5);
                qb.a aVar = (qb.a) this.f3046b;
                aVar.f18676e.invoke(Boolean.valueOf(Settings.System.getInt(aVar.f18675d.getContentResolver(), aVar.f18678v, 0) == 1));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h3 h3Var) {
        super(new Handler());
        this.f3046b = h3Var;
    }
}
