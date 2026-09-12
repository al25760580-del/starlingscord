package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f2207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2208e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2209i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2210v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, ViewGroup viewGroup, Object obj, Ref.ObjectRef objectRef) {
        super(0);
        this.f2207d = pVar;
        this.f2208e = viewGroup;
        this.f2209i = obj;
        this.f2210v = objectRef;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.n] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Attempting to create TransitionSeekController");
        }
        p pVar = this.f2207d;
        t1 t1Var = pVar.f2217f;
        ViewGroup viewGroup = this.f2208e;
        Object obj = this.f2209i;
        Object objI = t1Var.i(viewGroup, obj);
        pVar.f2226q = objI;
        if (objI == null) {
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "TransitionSeekController was not created.");
            }
            pVar.f2227r = true;
        } else {
            this.f2210v.element = new n(pVar, obj, viewGroup);
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "Started executing operations from " + pVar.f2215d + " to " + pVar.f2216e);
            }
        }
        return Unit.f14616a;
    }
}
