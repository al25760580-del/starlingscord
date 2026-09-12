package ge;

import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9965e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9966i;

    public /* synthetic */ b(ViewGroup viewGroup, int i7) {
        this.f9964d = i7;
        this.f9966i = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f9964d;
        ViewGroup viewGroup = this.f9966i;
        switch (i7) {
            case 0:
                this.f9965e = false;
                int i10 = AspectRatioFrameLayout.f5760v;
                ((AspectRatioFrameLayout) viewGroup).getClass();
                break;
            default:
                gk.i iVar = (gk.i) viewGroup;
                iVar.a(this.f9965e);
                iVar.postDelayed(this, iVar.O);
                break;
        }
    }
}
