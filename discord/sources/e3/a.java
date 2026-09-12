package e3;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r0;
import d3.e;
import e.b;
import java.util.LinkedHashMap;
import kh.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f7955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f7956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f7959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7961h;

    public a(e owner, r0 onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.f7954a = owner;
        this.f7955b = onAttach;
        this.f7956c = new f(5);
        this.f7957d = new LinkedHashMap();
        this.f7961h = true;
    }

    public final void a() {
        e eVar = this.f7954a;
        if (eVar.getLifecycle().b() != Lifecycle.State.f2296e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f7958e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f7955b.invoke();
        eVar.getLifecycle().a(new b(2, this));
        this.f7958e = true;
    }
}
