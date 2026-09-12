package androidx.core.view;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f1741a;

    public x0(ViewGroup viewGroup) {
        this.f1741a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new y0(this.f1741a);
    }
}
