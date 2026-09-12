package gk;

import android.widget.EditText;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f10055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10056e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10057i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10058v;

    public g(EditText editText) {
        this.f10055d = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10058v = false;
        this.f10055d.setSelection(this.f10056e, this.f10057i);
    }
}
