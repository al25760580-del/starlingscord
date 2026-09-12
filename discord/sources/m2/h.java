package m2;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f15366a;

    public h(EditText editText) {
        this.f15366a = new WeakReference(editText);
    }

    @Override // k2.g
    public final void b() {
        i.a((EditText) this.f15366a.get(), 1);
    }
}
