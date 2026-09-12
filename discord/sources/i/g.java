package i;

import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class g implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f11213a;

    public g(h hVar) {
        this.f11213a = hVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void a(ComponentActivity componentActivity) {
        h hVar = this.f11213a;
        AppCompatDelegate delegate = hVar.getDelegate();
        delegate.j();
        hVar.getSavedStateRegistry().a("androidx:appcompat");
        delegate.n();
    }
}
