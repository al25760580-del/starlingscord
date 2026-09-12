package io.sentry.react;

import android.os.Bundle;
import androidx.transition.Transition;
import gc.f;
import gc.g;
import gc.o;
import io.sentry.IScope;
import io.sentry.r3;
import m3.s;
import m3.t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements r3, f, t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13099d;

    public /* synthetic */ b(int i7) {
        this.f13099d = i7;
    }

    @Override // m3.t
    public void a(s sVar, Transition transition, boolean z5) {
        switch (this.f13099d) {
            case 25:
                sVar.onTransitionStart(transition, z5);
                break;
            case 26:
                sVar.onTransitionEnd(transition, z5);
                break;
            case 27:
                sVar.onTransitionCancel(transition);
                break;
            case 28:
                sVar.onTransitionPause(transition);
                break;
            default:
                sVar.onTransitionResume(transition);
                break;
        }
    }

    @Override // gc.f
    public g b(Bundle bundle) {
        return new ke.b(bundle.getInt(ke.b.f14326y, -1), bundle.getInt(ke.b.E, -1), bundle.getInt(ke.b.F, -1), bundle.getByteArray(ke.b.G));
    }

    @Override // io.sentry.r3
    public void g(IScope iScope) {
        switch (this.f13099d) {
            case 0:
                iScope.E();
                break;
            default:
                iScope.L(new o(26, iScope));
                break;
        }
    }
}
