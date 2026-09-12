package androidx.core.view;

import android.view.Menu;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Menu f1708a;

    public o(Menu menu) {
        this.f1708a = menu;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new p(this.f1708a);
    }
}
