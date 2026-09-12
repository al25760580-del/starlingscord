package d3;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import i.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7579a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7580b;

    public a(SavedStateRegistry registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f7580b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // d3.d
    public final Bundle a() {
        switch (this.f7579a) {
            case 0:
                w0.d().getClass();
                Bundle source = zs.a.f((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Intrinsics.checkNotNullParameter(source, "source");
                List value = CollectionsKt.i0((LinkedHashSet) this.f7580b);
                Intrinsics.checkNotNullParameter("classes_to_restore", "key");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(value, "<this>");
                source.putStringArrayList("classes_to_restore", value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                return source;
            default:
                Bundle bundle = new Bundle();
                ((h) this.f7580b).getDelegate().getClass();
                return bundle;
        }
    }

    public a(h hVar) {
        this.f7580b = hVar;
    }
}
