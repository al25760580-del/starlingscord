package a5;

import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.d1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f182c;

    public f(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f182c = messageDigest;
        this.f180a = i7;
    }

    @Override // androidx.core.view.d1
    public void a() {
        this.f181b = true;
    }

    @Override // androidx.core.view.d1
    public void d() {
        super/*android.view.View*/.setVisibility(0);
        this.f181b = false;
    }

    @Override // androidx.core.view.d1
    public void onAnimationEnd() {
        if (this.f181b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f182c;
        actionBarContextView.f808x = null;
        super/*android.view.View*/.setVisibility(this.f180a);
    }

    public f(lq.d0 d0Var, int i7, boolean z5) {
        this.f182c = d0Var;
        this.f180a = i7;
        this.f181b = z5;
    }
}
