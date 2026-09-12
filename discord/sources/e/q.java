package e;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.activity.BackEventCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f7839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f7840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f7842d;

    public q(o oVar, o oVar2, p pVar, p pVar2) {
        this.f7839a = oVar;
        this.f7840b = oVar2;
        this.f7841c = pVar;
        this.f7842d = pVar2;
    }

    public final void onBackCancelled() {
        this.f7842d.invoke();
    }

    public final void onBackInvoked() {
        this.f7841c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f7840b.invoke(new BackEventCompat(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f7839a.invoke(new BackEventCompat(backEvent));
    }
}
