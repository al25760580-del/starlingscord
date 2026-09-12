package m3;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Transition f15454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f15455e;

    /* JADX WARN: Code duplicated, block: B:100:0x021b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0227  */
    /* JADX WARN: Code duplicated, block: B:105:0x023e  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:149:0x0305  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0317  */
    /* JADX WARN: Code duplicated, block: B:154:0x031e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0321  */
    /* JADX WARN: Code duplicated, block: B:158:0x0331 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x01e5 A[EDGE_INSN: B:161:0x01e5->B:88:0x01e5 BREAK  A[LOOP:1: B:19:0x0087->B:87:0x01dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x020d  */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x02f6, please report this as an issue */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i7;
        com.google.firebase.messaging.r rVar;
        com.google.firebase.messaging.r rVar2;
        s.e eVar;
        s.e eVar2;
        int i10;
        int[] iArr;
        boolean z5;
        int i11;
        int i12;
        s.e eVarR;
        ArrayList arrayList2;
        int i13;
        int i14;
        r rVar3;
        int i15;
        Transition transition;
        Animator animator;
        p pVar;
        b0 b0Var;
        b0 b0Var2;
        int i16;
        boolean z6;
        int i17;
        View view;
        b0 b0Var3;
        s.e eVar3;
        int i18;
        int i19;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i20;
        View view4;
        View view5;
        s.k kVar;
        int iF;
        int i21;
        View view6;
        boolean z7;
        Iterator it;
        Transition transition2 = this.f15454d;
        ViewGroup viewGroup = this.f15455e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z10 = true;
        if (!x.f15458c.remove(viewGroup)) {
            return true;
        }
        s.e eVarB = x.b();
        ArrayList arrayList3 = (ArrayList) eVarB.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(transition2);
            transition2.a(new v(this, eVarB));
            i7 = 0;
            transition2.h(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).F(viewGroup);
                }
            }
            transition2.I = new ArrayList();
            transition2.J = new ArrayList();
            rVar = transition2.E;
            rVar2 = transition2.F;
            eVar = new s.e((s.e) rVar.f6610d);
            eVar2 = new s.e((s.e) rVar2.f6610d);
            i10 = 0;
            while (true) {
                iArr = transition2.H;
                if (i10 < iArr.length) {
                    break;
                }
                i16 = iArr[i10];
                if (i16 != z10) {
                    z6 = z10;
                    for (i17 = eVar.f1222i - 1; i17 >= 0; i17--) {
                        view = (View) eVar.f(i17);
                        if (view == null && transition2.x(view) && (b0Var3 = (b0) eVar2.remove(view)) != null && transition2.x(b0Var3.f15373b)) {
                            transition2.I.add((b0) eVar.g(i17));
                            transition2.J.add(b0Var3);
                        }
                    }
                } else if (i16 != 2) {
                    z6 = z10;
                    eVar3 = (s.e) rVar.f6613v;
                    s.e eVar4 = (s.e) rVar2.f6613v;
                    i18 = eVar3.f1222i;
                    for (i19 = 0; i19 < i18; i19++) {
                        view2 = (View) eVar3.i(i19);
                        if (view2 == null && transition2.x(view2) && (view3 = (View) eVar4.get((String) eVar3.f(i19))) != null && transition2.x(view3)) {
                            b0 b0Var4 = (b0) eVar.get(view2);
                            b0 b0Var5 = (b0) eVar2.get(view3);
                            if (b0Var4 != null && b0Var5 != null) {
                                transition2.I.add(b0Var4);
                                transition2.J.add(b0Var5);
                                eVar.remove(view2);
                                eVar2.remove(view3);
                            }
                        }
                    }
                } else if (i16 != 3) {
                    if (i16 == 4) {
                        kVar = (s.k) rVar.f6612i;
                        s.k kVar2 = (s.k) rVar2.f6612i;
                        iF = kVar.f();
                        i21 = i7;
                        while (i21 < iF) {
                            view6 = (View) kVar.g(i21);
                            if (view6 == null && transition2.x(view6)) {
                                z7 = z10;
                                View view7 = (View) kVar2.b(kVar.d(i21));
                                if (view7 != null && transition2.x(view7)) {
                                    b0 b0Var6 = (b0) eVar.get(view6);
                                    b0 b0Var7 = (b0) eVar2.get(view7);
                                    if (b0Var6 != null && b0Var7 != null) {
                                        transition2.I.add(b0Var6);
                                        transition2.J.add(b0Var7);
                                        eVar.remove(view6);
                                        eVar2.remove(view7);
                                    }
                                }
                            } else {
                                z7 = z10;
                            }
                            i21++;
                            z10 = z7;
                        }
                    }
                    z6 = z10;
                } else {
                    z6 = z10;
                    sparseArray = (SparseArray) rVar.f6611e;
                    SparseArray sparseArray2 = (SparseArray) rVar2.f6611e;
                    size = sparseArray.size();
                    for (i20 = 0; i20 < size; i20++) {
                        view4 = (View) sparseArray.valueAt(i20);
                        if (view4 == null && transition2.x(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i20))) != null && transition2.x(view5)) {
                            b0 b0Var8 = (b0) eVar.get(view4);
                            b0 b0Var9 = (b0) eVar2.get(view5);
                            if (b0Var8 != null && b0Var9 != null) {
                                transition2.I.add(b0Var8);
                                transition2.J.add(b0Var9);
                                eVar.remove(view4);
                                eVar2.remove(view5);
                            }
                        }
                    }
                }
                i10++;
                z10 = z6;
                i7 = 0;
            }
            z5 = z10;
            for (i11 = 0; i11 < eVar.f1222i; i11++) {
                b0Var2 = (b0) eVar.i(i11);
                if (transition2.x(b0Var2.f15373b)) {
                    transition2.I.add(b0Var2);
                    transition2.J.add(null);
                }
            }
            for (i12 = 0; i12 < eVar2.f1222i; i12++) {
                b0Var = (b0) eVar2.i(i12);
                if (transition2.x(b0Var.f15373b)) {
                    transition2.J.add(b0Var);
                    transition2.I.add(null);
                }
            }
            eVarR = Transition.r();
            int i22 = eVarR.f1222i;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i13 = i22 - 1;
            while (i13 >= 0) {
                animator = (Animator) eVarR.f(i13);
                if (animator == null && (pVar = (p) eVarR.get(animator)) != null) {
                    Transition transition3 = pVar.f15435e;
                    View view8 = pVar.f15431a;
                    if (view8 != null && Objects.equals(windowId, pVar.f15434d)) {
                        b0 b0Var10 = pVar.f15433c;
                        boolean z11 = z5;
                        b0 b0VarT = transition2.t(view8, z11);
                        b0 b0VarP = transition2.p(view8, z11);
                        if (b0VarT == null && b0VarP == null) {
                            b0VarP = (b0) ((s.e) transition2.F.f6610d).get(view8);
                        }
                        if ((b0VarT != null || b0VarP != null) && transition3.w(b0Var10, b0VarP)) {
                            Transition transitionQ = transition3.q();
                            ArrayList arrayList4 = transition3.L;
                            if (transitionQ.X != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                eVarR.g(i13);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(transition3);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                eVarR.g(i13);
                            }
                        }
                    }
                }
                i13--;
                z5 = true;
            }
            for (i14 = 0; i14 < arrayList2.size(); i14++) {
                transition = (Transition) arrayList2.get(i14);
                transition.A(transition, t.f15449o, false);
                if (!transition.P) {
                    transition.P = true;
                    transition.A(transition, t.f15448n, false);
                }
            }
            transition2.m(viewGroup, transition2.E, transition2.F, transition2.I, transition2.J);
            if (transition2.X == null) {
                transition2.G();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            transition2.C();
            r rVar4 = transition2.X;
            z zVar = rVar4.f15446h;
            long j = zVar.W == 0 ? 1L : 0L;
            zVar.H(j, rVar4.f15439a);
            rVar4.f15439a = j;
            rVar3 = transition2.X;
            rVar3.f15440b = true;
            i15 = rVar3.f15442d;
            if (i15 == 1) {
                rVar3.f15442d = 0;
                rVar3.a();
                return true;
            }
            if (i15 == 2) {
                return true;
            }
            rVar3.f15442d = 0;
            rVar3.f15445g = rVar3.f15445g;
            rVar3.b();
            rVar3.f15443e.a(0.0f);
            return true;
        }
        arrayList3 = new ArrayList();
        eVarB.put(viewGroup, arrayList3);
        arrayList3.add(transition2);
        transition2.a(new v(this, eVarB));
        i7 = 0;
        transition2.h(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).F(viewGroup);
            }
        }
        transition2.I = new ArrayList();
        transition2.J = new ArrayList();
        rVar = transition2.E;
        rVar2 = transition2.F;
        eVar = new s.e((s.e) rVar.f6610d);
        eVar2 = new s.e((s.e) rVar2.f6610d);
        i10 = 0;
        while (true) {
            iArr = transition2.H;
            if (i10 < iArr.length) {
                break;
                break;
            }
            i16 = iArr[i10];
            if (i16 != z10) {
                z6 = z10;
                while (i17 >= 0) {
                    view = (View) eVar.f(i17);
                    if (view == null) {
                    }
                }
            } else if (i16 != 2) {
                z6 = z10;
                eVar3 = (s.e) rVar.f6613v;
                s.e eVar5 = (s.e) rVar2.f6613v;
                i18 = eVar3.f1222i;
                while (i19 < i18) {
                    view2 = (View) eVar3.i(i19);
                    if (view2 == null) {
                    }
                }
            } else if (i16 != 3) {
                if (i16 == 4) {
                    kVar = (s.k) rVar.f6612i;
                    s.k kVar3 = (s.k) rVar2.f6612i;
                    iF = kVar.f();
                    i21 = i7;
                    while (i21 < iF) {
                        view6 = (View) kVar.g(i21);
                        if (view6 == null) {
                            z7 = z10;
                        } else {
                            z7 = z10;
                        }
                        i21++;
                        z10 = z7;
                    }
                }
                z6 = z10;
            } else {
                z6 = z10;
                sparseArray = (SparseArray) rVar.f6611e;
                SparseArray sparseArray3 = (SparseArray) rVar2.f6611e;
                size = sparseArray.size();
                while (i20 < size) {
                    view4 = (View) sparseArray.valueAt(i20);
                    if (view4 == null) {
                    }
                }
            }
            i10++;
            z10 = z6;
            i7 = 0;
        }
        z5 = z10;
        while (i11 < eVar.f1222i) {
            b0Var2 = (b0) eVar.i(i11);
            if (transition2.x(b0Var2.f15373b)) {
                transition2.I.add(b0Var2);
                transition2.J.add(null);
            }
        }
        while (i12 < eVar2.f1222i) {
            b0Var = (b0) eVar2.i(i12);
            if (transition2.x(b0Var.f15373b)) {
                transition2.J.add(b0Var);
                transition2.I.add(null);
            }
        }
        eVarR = Transition.r();
        int i23 = eVarR.f1222i;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i13 = i23 - 1;
        while (i13 >= 0) {
            animator = (Animator) eVarR.f(i13);
            if (animator == null) {
            }
            i13--;
            z5 = true;
        }
        while (i14 < arrayList2.size()) {
            transition = (Transition) arrayList2.get(i14);
            transition.A(transition, t.f15449o, false);
            if (!transition.P) {
                transition.P = true;
                transition.A(transition, t.f15448n, false);
            }
        }
        transition2.m(viewGroup, transition2.E, transition2.F, transition2.I, transition2.J);
        if (transition2.X == null) {
            transition2.G();
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        transition2.C();
        r rVar5 = transition2.X;
        z zVar2 = rVar5.f15446h;
        if (zVar2.W == 0) {
        }
        zVar2.H(j, rVar5.f15439a);
        rVar5.f15439a = j;
        rVar3 = transition2.X;
        rVar3.f15440b = true;
        i15 = rVar3.f15442d;
        if (i15 == 1) {
            rVar3.f15442d = 0;
            rVar3.a();
            return true;
        }
        if (i15 == 2) {
            return true;
        }
        rVar3.f15442d = 0;
        rVar3.f15445g = rVar3.f15445g;
        rVar3.b();
        rVar3.f15443e.a(0.0f);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f15455e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        x.f15458c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) x.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).F(viewGroup);
            }
        }
        this.f15454d.j(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
