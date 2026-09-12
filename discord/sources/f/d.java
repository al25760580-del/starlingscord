package f;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f8767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8768b;

    public d(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f8767a = lifecycle;
        this.f8768b = new ArrayList();
    }
}
