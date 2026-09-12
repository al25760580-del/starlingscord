package m3;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class z extends Transition {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f15463f0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Transition[] f15465i0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ArrayList f15461d0 = new ArrayList();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f15462e0 = true;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f15464g0 = false;
    public int h0 = 0;

    @Override // androidx.transition.Transition
    public final void B(View view) {
        super.B(view);
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f15461d0.get(i7)).B(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void C() {
        this.W = 0L;
        int i7 = 0;
        y yVar = new y(this, i7);
        while (i7 < this.f15461d0.size()) {
            Transition transition = (Transition) this.f15461d0.get(i7);
            transition.a(yVar);
            transition.C();
            long j = transition.W;
            if (this.f15462e0) {
                this.W = Math.max(this.W, j);
            } else {
                long j5 = this.W;
                transition.Y = j5;
                this.W = j5 + j;
            }
            i7++;
        }
    }

    @Override // androidx.transition.Transition
    public final Transition D(s sVar) {
        super.D(sVar);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void E(View view) {
        for (int i7 = 0; i7 < this.f15461d0.size(); i7++) {
            ((Transition) this.f15461d0.get(i7)).E(view);
        }
        this.f2788x.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void F(View view) {
        super.F(view);
        Transition[] transitionArr = this.f15465i0;
        this.f15465i0 = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.f15461d0.size()];
        }
        Transition[] transitionArr2 = (Transition[]) this.f15461d0.toArray(transitionArr);
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            transitionArr2[i7].F(view);
        }
        Arrays.fill(transitionArr2, (Object) null);
        this.f15465i0 = transitionArr2;
    }

    @Override // androidx.transition.Transition
    public final void G() {
        if (this.f15461d0.isEmpty()) {
            O();
            n();
            return;
        }
        y yVar = new y();
        yVar.f15460b = this;
        Iterator it = this.f15461d0.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).a(yVar);
        }
        this.f15463f0 = this.f15461d0.size();
        if (this.f15462e0) {
            Iterator it2 = this.f15461d0.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).G();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f15461d0.size(); i7++) {
            ((Transition) this.f15461d0.get(i7 - 1)).a(new y((Transition) this.f15461d0.get(i7), 2));
        }
        Transition transition = (Transition) this.f15461d0.get(0);
        if (transition != null) {
            transition.G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    public final void H(long j, long j5) {
        long j7;
        long j10 = this.W;
        long j11 = 0;
        if (this.G != null) {
            if (j < 0 && j5 < 0) {
                return;
            }
            if (j > j10 && j5 > j10) {
                return;
            }
        }
        boolean z5 = j < j5;
        if ((j >= 0 && j5 < 0) || (j <= j10 && j5 > j10)) {
            this.P = false;
            A(this, t.f15447m, z5);
        }
        if (!this.f15462e0) {
            int size = 1;
            while (true) {
                if (size >= this.f15461d0.size()) {
                    size = this.f15461d0.size();
                    break;
                } else if (((Transition) this.f15461d0.get(size)).Y > j5) {
                    break;
                } else {
                    size++;
                }
            }
            int i7 = size - 1;
            if (j >= j5) {
                while (true) {
                    if (i7 < this.f15461d0.size()) {
                        Transition transition = (Transition) this.f15461d0.get(i7);
                        long j12 = transition.Y;
                        j7 = j11;
                        long j13 = j - j12;
                        if (j13 < j7) {
                            break;
                        }
                        transition.H(j13, j5 - j12);
                        i7++;
                        j11 = j7;
                    }
                }
            } else {
                j7 = 0;
                while (i7 >= 0) {
                    Transition transition2 = (Transition) this.f15461d0.get(i7);
                    long j14 = transition2.Y;
                    long j15 = j - j14;
                    transition2.H(j15, j5 - j14);
                    if (j15 >= 0) {
                        break;
                    } else {
                        i7--;
                    }
                }
            }
            if (this.G != null) {
                if ((j > j10 || j5 > j10) && (j >= 0 || j5 < j7)) {
                    return;
                }
                if (j > j10) {
                    this.P = true;
                }
                A(this, t.f15448n, z5);
            }
        }
        for (int i10 = 0; i10 < this.f15461d0.size(); i10++) {
            ((Transition) this.f15461d0.get(i10)).H(j, j5);
        }
        j7 = j11;
        if (this.G != null) {
            if (j > j10) {
                return;
            } else {
                return;
            }
            if (j > j10) {
                this.P = true;
            }
            A(this, t.f15448n, z5);
        }
    }

    @Override // androidx.transition.Transition
    public final void J(ls.l lVar) {
        this.U = lVar;
        this.h0 |= 8;
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f15461d0.get(i7)).J(lVar);
        }
    }

    @Override // androidx.transition.Transition
    public final void L(vi.d dVar) {
        super.L(dVar);
        this.h0 |= 4;
        if (this.f15461d0 != null) {
            for (int i7 = 0; i7 < this.f15461d0.size(); i7++) {
                ((Transition) this.f15461d0.get(i7)).L(dVar);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void M(l lVar) {
        this.T = lVar;
        this.h0 |= 2;
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f15461d0.get(i7)).M(lVar);
        }
    }

    @Override // androidx.transition.Transition
    public final void N(long j) {
        this.f2784e = j;
    }

    @Override // androidx.transition.Transition
    public final String P(String str) {
        String strP = super.P(str);
        for (int i7 = 0; i7 < this.f15461d0.size(); i7++) {
            StringBuilder sbO = kk.b.o(strP, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sbO.append(((Transition) this.f15461d0.get(i7)).P(str + "  "));
            strP = sbO.toString();
        }
        return strP;
    }

    public final void Q(Transition transition) {
        this.f15461d0.add(transition);
        transition.G = this;
        long j = this.f2785i;
        if (j >= 0) {
            transition.I(j);
        }
        if ((this.h0 & 1) != 0) {
            transition.K(this.f2786v);
        }
        if ((this.h0 & 2) != 0) {
            transition.M(this.T);
        }
        if ((this.h0 & 4) != 0) {
            transition.L(this.V);
        }
        if ((this.h0 & 8) != 0) {
            transition.J(this.U);
        }
    }

    public final Transition R(int i7) {
        if (i7 < 0 || i7 >= this.f15461d0.size()) {
            return null;
        }
        return (Transition) this.f15461d0.get(i7);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void I(long j) {
        ArrayList arrayList;
        this.f2785i = j;
        if (j < 0 || (arrayList = this.f15461d0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f15461d0.get(i7)).I(j);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void K(TimeInterpolator timeInterpolator) {
        this.h0 |= 1;
        ArrayList arrayList = this.f15461d0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((Transition) this.f15461d0.get(i7)).K(timeInterpolator);
            }
        }
        this.f2786v = timeInterpolator;
    }

    public final void U(int i7) {
        if (i7 == 0) {
            this.f15462e0 = true;
        } else {
            if (i7 != 1) {
                throw new AndroidRuntimeException(kk.b.h(i7, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f15462e0 = false;
        }
    }

    @Override // androidx.transition.Transition
    public final void b(View view) {
        for (int i7 = 0; i7 < this.f15461d0.size(); i7++) {
            ((Transition) this.f15461d0.get(i7)).b(view);
        }
        this.f2788x.add(view);
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        Transition[] transitionArr = this.f15465i0;
        this.f15465i0 = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.f15461d0.size()];
        }
        Transition[] transitionArr2 = (Transition[]) this.f15461d0.toArray(transitionArr);
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            transitionArr2[i7].cancel();
        }
        Arrays.fill(transitionArr2, (Object) null);
        this.f15465i0 = transitionArr2;
    }

    @Override // androidx.transition.Transition
    public final void d(b0 b0Var) {
        View view = b0Var.f15373b;
        if (x(view)) {
            for (Transition transition : this.f15461d0) {
                if (transition.x(view)) {
                    transition.d(b0Var);
                    b0Var.f15374c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void f(b0 b0Var) {
        super.f(b0Var);
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f15461d0.get(i7)).f(b0Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void g(b0 b0Var) {
        View view = b0Var.f15373b;
        if (x(view)) {
            for (Transition transition : this.f15461d0) {
                if (transition.x(view)) {
                    transition.g(b0Var);
                    b0Var.f15374c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: k */
    public final Transition clone() {
        z zVar = (z) super.clone();
        zVar.f15461d0 = new ArrayList();
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            Transition transitionClone = ((Transition) this.f15461d0.get(i7)).clone();
            zVar.f15461d0.add(transitionClone);
            transitionClone.G = zVar;
        }
        return zVar;
    }

    @Override // androidx.transition.Transition
    public final void m(ViewGroup viewGroup, com.google.firebase.messaging.r rVar, com.google.firebase.messaging.r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f2784e;
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            Transition transition = (Transition) this.f15461d0.get(i7);
            if (j > 0 && (this.f15462e0 || i7 == 0)) {
                long j5 = transition.f2784e;
                if (j5 > 0) {
                    transition.N(j5 + j);
                } else {
                    transition.N(j);
                }
            }
            transition.m(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final void o() {
        for (int i7 = 0; i7 < this.f15461d0.size(); i7++) {
            ((Transition) this.f15461d0.get(i7)).o();
        }
        super.o();
    }

    @Override // androidx.transition.Transition
    public final boolean u() {
        for (int i7 = 0; i7 < this.f15461d0.size(); i7++) {
            if (((Transition) this.f15461d0.get(i7)).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        int size = this.f15461d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((Transition) this.f15461d0.get(i7)).v()) {
                return false;
            }
        }
        return true;
    }
}
