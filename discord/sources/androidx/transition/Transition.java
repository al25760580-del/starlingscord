package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.b1;
import androidx.core.view.l0;
import androidx.core.view.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;
import m3.b0;
import m3.l;
import m3.p;
import m3.r;
import m3.s;
import m3.t;
import m3.z;
import s.e;
import s.k;
import vi.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] Z = new Animator[0];
    public static final int[] a0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final d f2781b0 = new d(11, 0);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final ThreadLocal f2782c0 = new ThreadLocal();
    public ArrayList I;
    public ArrayList J;
    public s[] K;
    public l T;
    public ls.l U;
    public long W;
    public r X;
    public long Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2783d = getClass().getName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2784e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2785i = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TimeInterpolator f2786v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f2787w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f2788x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f2789y = null;
    public com.google.firebase.messaging.r E = new com.google.firebase.messaging.r(10);
    public com.google.firebase.messaging.r F = new com.google.firebase.messaging.r(10);
    public z G = null;
    public final int[] H = a0;
    public final ArrayList L = new ArrayList();
    public Animator[] M = Z;
    public int N = 0;
    public boolean O = false;
    public boolean P = false;
    public Transition Q = null;
    public ArrayList R = null;
    public ArrayList S = new ArrayList();
    public d V = f2781b0;

    public static void c(com.google.firebase.messaging.r rVar, View view, b0 b0Var) {
        e eVar = (e) rVar.f6610d;
        e eVar2 = (e) rVar.f6613v;
        SparseArray sparseArray = (SparseArray) rVar.f6611e;
        k kVar = (k) rVar.f6612i;
        eVar.put(view, b0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = u0.f1729a;
        String strF = l0.f(view);
        if (strF != null) {
            if (eVar2.containsKey(strF)) {
                eVar2.put(strF, null);
            } else {
                eVar2.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (kVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    kVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) kVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    kVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static e r() {
        ThreadLocal threadLocal = f2782c0;
        e eVar = (e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean z(b0 b0Var, b0 b0Var2, String str) {
        Object obj = b0Var.f15372a.get(str);
        Object obj2 = b0Var2.f15372a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(Transition transition, t tVar, boolean z5) {
        Transition transition2 = this.Q;
        if (transition2 != null) {
            transition2.A(transition, tVar, z5);
        }
        ArrayList arrayList = this.R;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.R.size();
        s[] sVarArr = this.K;
        if (sVarArr == null) {
            sVarArr = new s[size];
        }
        this.K = null;
        s[] sVarArr2 = (s[]) this.R.toArray(sVarArr);
        for (int i7 = 0; i7 < size; i7++) {
            tVar.a(sVarArr2[i7], transition, z5);
            sVarArr2[i7] = null;
        }
        this.K = sVarArr2;
    }

    public void B(View view) {
        if (this.P) {
            return;
        }
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.M);
        this.M = Z;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.pause();
        }
        this.M = animatorArr;
        A(this, t.f15450p, false);
        this.O = true;
    }

    public void C() {
        e eVarR = r();
        this.W = 0L;
        for (int i7 = 0; i7 < this.S.size(); i7++) {
            Animator animator = (Animator) this.S.get(i7);
            p pVar = (p) eVarR.get(animator);
            if (animator != null && pVar != null) {
                Animator animator2 = pVar.f15436f;
                long j = this.f2785i;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j5 = this.f2784e;
                if (j5 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j5);
                }
                TimeInterpolator timeInterpolator = this.f2786v;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.L.add(animator);
                this.W = Math.max(this.W, animator.getTotalDuration());
            }
        }
        this.S.clear();
    }

    public Transition D(s sVar) {
        Transition transition;
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            if (!arrayList.remove(sVar) && (transition = this.Q) != null) {
                transition.D(sVar);
            }
            if (this.R.size() == 0) {
                this.R = null;
            }
        }
        return this;
    }

    public void E(View view) {
        this.f2788x.remove(view);
    }

    public void F(View view) {
        if (this.O) {
            if (!this.P) {
                ArrayList arrayList = this.L;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.M);
                this.M = Z;
                for (int i7 = size - 1; i7 >= 0; i7--) {
                    Animator animator = animatorArr[i7];
                    animatorArr[i7] = null;
                    animator.resume();
                }
                this.M = animatorArr;
                A(this, t.f15451q, false);
            }
            this.O = false;
        }
    }

    public void G() {
        O();
        e eVarR = r();
        for (Animator animator : this.S) {
            if (eVarR.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new b1(this, eVarR));
                    long j = this.f2785i;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j5 = this.f2784e;
                    if (j5 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j5);
                    }
                    TimeInterpolator timeInterpolator = this.f2786v;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new androidx.appcompat.widget.c(2, this));
                    animator.start();
                }
            }
        }
        this.S.clear();
        n();
    }

    public void H(long j, long j5) {
        long j7 = this.W;
        int i7 = 0;
        boolean z5 = j < j5;
        if ((j5 < 0 && j >= 0) || (j5 > j7 && j <= j7)) {
            this.P = false;
            A(this, t.f15447m, z5);
        }
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.M);
        this.M = Z;
        while (i7 < size) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            hf.a.l(animator, Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i7++;
            j7 = j7;
        }
        long j10 = j7;
        this.M = animatorArr;
        if ((j <= j10 || j5 > j10) && (j >= 0 || j5 < 0)) {
            return;
        }
        if (j > j10) {
            this.P = true;
        }
        A(this, t.f15448n, z5);
    }

    public void I(long j) {
        this.f2785i = j;
    }

    public void J(ls.l lVar) {
        this.U = lVar;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.f2786v = timeInterpolator;
    }

    public void L(d dVar) {
        if (dVar == null) {
            this.V = f2781b0;
        } else {
            this.V = dVar;
        }
    }

    public void M(l lVar) {
        this.T = lVar;
    }

    public void N(long j) {
        this.f2784e = j;
    }

    public final void O() {
        if (this.N == 0) {
            A(this, t.f15447m, false);
            this.P = false;
        }
        this.N++;
    }

    public String P(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f2785i != -1) {
            sb2.append("dur(");
            sb2.append(this.f2785i);
            sb2.append(") ");
        }
        if (this.f2784e != -1) {
            sb2.append("dly(");
            sb2.append(this.f2784e);
            sb2.append(") ");
        }
        if (this.f2786v != null) {
            sb2.append("interp(");
            sb2.append(this.f2786v);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f2787w;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2788x;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (i7 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i7));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i10));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(s sVar) {
        if (this.R == null) {
            this.R = new ArrayList();
        }
        this.R.add(sVar);
    }

    public void b(View view) {
        this.f2788x.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.M);
        this.M = Z;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.cancel();
        }
        this.M = animatorArr;
        A(this, t.f15449o, false);
    }

    public abstract void d(b0 b0Var);

    public final void e(View view, boolean z5) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.f2789y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((Class) this.f2789y.get(i7)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            b0 b0Var = new b0(view);
            if (z5) {
                g(b0Var);
            } else {
                d(b0Var);
            }
            b0Var.f15374c.add(this);
            f(b0Var);
            if (z5) {
                c(this.E, view, b0Var);
            } else {
                c(this.F, view, b0Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z5);
            }
        }
    }

    public void f(b0 b0Var) {
        if (this.T != null) {
            HashMap map = b0Var.f15372a;
            if (map.isEmpty()) {
                return;
            }
            this.T.getClass();
            for (int i7 = 0; i7 < 2; i7++) {
                if (!map.containsKey(l.f15426b[i7])) {
                    this.T.getClass();
                    View view = b0Var.f15373b;
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void g(b0 b0Var);

    public final void h(ViewGroup viewGroup, boolean z5) {
        j(z5);
        ArrayList arrayList = this.f2787w;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2788x;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z5);
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i7)).intValue());
            if (viewFindViewById != null) {
                b0 b0Var = new b0(viewFindViewById);
                if (z5) {
                    g(b0Var);
                } else {
                    d(b0Var);
                }
                b0Var.f15374c.add(this);
                f(b0Var);
                if (z5) {
                    c(this.E, viewFindViewById, b0Var);
                } else {
                    c(this.F, viewFindViewById, b0Var);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            b0 b0Var2 = new b0(view);
            if (z5) {
                g(b0Var2);
            } else {
                d(b0Var2);
            }
            b0Var2.f15374c.add(this);
            f(b0Var2);
            if (z5) {
                c(this.E, view, b0Var2);
            } else {
                c(this.F, view, b0Var2);
            }
        }
    }

    public final void j(boolean z5) {
        if (z5) {
            ((e) this.E.f6610d).clear();
            ((SparseArray) this.E.f6611e).clear();
            ((k) this.E.f6612i).a();
        } else {
            ((e) this.F.f6610d).clear();
            ((SparseArray) this.F.f6611e).clear();
            ((k) this.F.f6612i).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.S = new ArrayList();
            transition.E = new com.google.firebase.messaging.r(10);
            transition.F = new com.google.firebase.messaging.r(10);
            transition.I = null;
            transition.J = null;
            transition.X = null;
            transition.Q = this;
            transition.R = null;
            return transition;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator l(ViewGroup viewGroup, b0 b0Var, b0 b0Var2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:121:0x0203  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:131:0x0221  */
    /* JADX WARN: Code duplicated, block: B:136:0x0257  */
    /* JADX WARN: Code duplicated, block: B:149:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0144  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0155  */
    /* JADX WARN: Code duplicated, block: B:92:0x0187  */
    /* JADX WARN: Code duplicated, block: B:93:0x0190  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3  */
    public void m(ViewGroup viewGroup, com.google.firebase.messaging.r rVar, com.google.firebase.messaging.r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorL;
        int i7;
        boolean z5;
        int i10;
        View view;
        Animator animator;
        b0 b0Var;
        Animator animator2;
        l lVar;
        Object obj;
        ls.l lVar2;
        Rect rectU;
        Rect rect;
        int i11;
        int i12;
        int i13;
        int i14;
        int iRound;
        int iRound2;
        int width;
        int height;
        int iCenterY;
        int iCenterX;
        int i15;
        int i16;
        int i17;
        int i18;
        int iAbs;
        int iAbs2;
        int i19;
        int width2;
        long j;
        long jRound;
        int[] iArr;
        int[] iArr2;
        int iIntValue;
        Integer num;
        e eVarR = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z6 = q().X != null;
        long jMin = LongCompanionObject.MAX_VALUE;
        int i20 = 0;
        while (i20 < size) {
            b0 b0Var2 = (b0) arrayList.get(i20);
            b0 b0Var3 = (b0) arrayList2.get(i20);
            if (b0Var2 != null && !b0Var2.f15374c.contains(this)) {
                b0Var2 = null;
            }
            if (b0Var3 != null && !b0Var3.f15374c.contains(this)) {
                b0Var3 = null;
            }
            if (!(b0Var2 == null && b0Var3 == null) && ((b0Var2 == null || b0Var3 == null || w(b0Var2, b0Var3)) && (animatorL = l(viewGroup, b0Var2, b0Var3)) != null)) {
                String str = this.f2783d;
                if (b0Var3 != null) {
                    i10 = 1;
                    view = b0Var3.f15373b;
                    i7 = size;
                    String[] strArrS = s();
                    z5 = z6;
                    if (strArrS != null && strArrS.length > 0) {
                        b0Var = new b0(view);
                        i20 = i20;
                        b0 b0Var4 = (b0) ((e) rVar2.f6610d).get(view);
                        if (b0Var4 != null) {
                            int i21 = 0;
                            while (i21 < strArrS.length) {
                                String str2 = strArrS[i21];
                                b0Var.f15372a.put(str2, b0Var4.f15372a.get(str2));
                                i21++;
                                strArrS = strArrS;
                            }
                        }
                        int i22 = eVarR.f1222i;
                        int i23 = 0;
                        while (true) {
                            if (i23 >= i22) {
                                animator2 = animatorL;
                                break;
                            }
                            p pVar = (p) eVarR.get((Animator) eVarR.f(i23));
                            if (pVar.f15433c != null && pVar.f15431a == view && pVar.f15432b.equals(str) && pVar.f15433c.equals(b0Var)) {
                                animator2 = null;
                                break;
                            }
                            i23++;
                        }
                    } else {
                        animator = animatorL;
                    }
                    if (animator2 == null) {
                        lVar = this.T;
                        if (lVar != null) {
                            if (b0Var2 == null || b0Var3 != null) {
                                lVar2 = this.U;
                                if (lVar2 == null) {
                                    rectU = null;
                                } else {
                                    rectU = lVar2.u();
                                }
                                if (b0Var3 != null) {
                                    iIntValue = 8;
                                    if (b0Var2 == null) {
                                        rect = rectU;
                                    } else {
                                        rect = rectU;
                                        num = (Integer) b0Var2.f15372a.get("android:visibilityPropagation:visibility");
                                        if (num != null) {
                                            iIntValue = num.intValue();
                                        }
                                    }
                                    if (iIntValue != 0) {
                                        b0Var2 = b0Var3;
                                        i11 = i10;
                                    }
                                    if (b0Var2 == null && (iArr2 = (int[]) b0Var2.f15372a.get("android:visibilityPropagation:center")) != null) {
                                        i12 = iArr2[0];
                                    } else {
                                        i12 = -1;
                                    }
                                    if (b0Var2 == null && (iArr = (int[]) b0Var2.f15372a.get("android:visibilityPropagation:center")) != null) {
                                        i13 = iArr[i10];
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = i13;
                                    int[] iArr3 = new int[2];
                                    viewGroup.getLocationOnScreen(iArr3);
                                    iRound = Math.round(viewGroup.getTranslationX()) + iArr3[0];
                                    iRound2 = Math.round(viewGroup.getTranslationY()) + iArr3[i10];
                                    width = viewGroup.getWidth() + iRound;
                                    height = viewGroup.getHeight() + iRound2;
                                    if (rect != null) {
                                        iCenterX = rect.centerX();
                                        iCenterY = rect.centerY();
                                    } else {
                                        iCenterY = (iRound2 + height) / 2;
                                        iCenterX = (iRound + width) / 2;
                                    }
                                    i15 = lVar.f15427a;
                                    i16 = iCenterX;
                                    if (i15 == 8388611) {
                                        i17 = i10;
                                        if (i15 == 8388613) {
                                            if (viewGroup.getLayoutDirection() == i17) {
                                                i15 = 3;
                                            } else {
                                                i15 = 5;
                                            }
                                        }
                                    } else if (viewGroup.getLayoutDirection() == i10) {
                                        i15 = 5;
                                    } else {
                                        i15 = 3;
                                    }
                                    if (i15 != 3) {
                                        if (i15 != 5) {
                                            iAbs2 = Math.abs(iCenterY - i14) + (i12 - iRound);
                                        } else if (i15 != 48) {
                                            iAbs2 = Math.abs(i16 - i12) + (height - i14);
                                        } else if (i15 != 80) {
                                            iAbs2 = 0;
                                        } else {
                                            i18 = i14 - iRound2;
                                            iAbs = Math.abs(i16 - i12);
                                        }
                                        float f2 = iAbs2;
                                        i19 = lVar.f15427a;
                                        if (i19 != 3 || i19 == 5 || i19 == 8388611 || i19 == 8388613) {
                                            width2 = viewGroup.getWidth();
                                        } else {
                                            width2 = viewGroup.getHeight();
                                        }
                                        float f7 = f2 / width2;
                                        j = this.f2785i;
                                        if (j < 0) {
                                            j = 300;
                                        }
                                        jRound = Math.round(((((long) i11) * j) / 3.0f) * f7);
                                    } else {
                                        i18 = width - i12;
                                        iAbs = Math.abs(iCenterY - i14);
                                    }
                                    iAbs2 = iAbs + i18;
                                    float f10 = iAbs2;
                                    i19 = lVar.f15427a;
                                    if (i19 != 3) {
                                        width2 = viewGroup.getWidth();
                                    } else {
                                        width2 = viewGroup.getWidth();
                                    }
                                    float f11 = f10 / width2;
                                    j = this.f2785i;
                                    if (j < 0) {
                                        j = 300;
                                    }
                                    jRound = Math.round(((((long) i11) * j) / 3.0f) * f11);
                                } else {
                                    rect = rectU;
                                }
                                i11 = -1;
                                if (b0Var2 == null) {
                                    i12 = -1;
                                } else {
                                    i12 = iArr2[0];
                                }
                                if (b0Var2 == null) {
                                    i13 = -1;
                                } else {
                                    i13 = iArr[i10];
                                }
                                i14 = i13;
                                int[] iArr4 = new int[2];
                                viewGroup.getLocationOnScreen(iArr4);
                                iRound = Math.round(viewGroup.getTranslationX()) + iArr4[0];
                                iRound2 = Math.round(viewGroup.getTranslationY()) + iArr4[i10];
                                width = viewGroup.getWidth() + iRound;
                                height = viewGroup.getHeight() + iRound2;
                                if (rect != null) {
                                    iCenterX = rect.centerX();
                                    iCenterY = rect.centerY();
                                } else {
                                    iCenterY = (iRound2 + height) / 2;
                                    iCenterX = (iRound + width) / 2;
                                }
                                i15 = lVar.f15427a;
                                i16 = iCenterX;
                                if (i15 == 8388611) {
                                    i17 = i10;
                                    if (i15 == 8388613) {
                                        if (viewGroup.getLayoutDirection() == i17) {
                                            i15 = 3;
                                        } else {
                                            i15 = 5;
                                        }
                                    }
                                } else if (viewGroup.getLayoutDirection() == i10) {
                                    i15 = 5;
                                } else {
                                    i15 = 3;
                                }
                                if (i15 != 3) {
                                    if (i15 != 5) {
                                        iAbs2 = Math.abs(iCenterY - i14) + (i12 - iRound);
                                    } else if (i15 != 48) {
                                        iAbs2 = Math.abs(i16 - i12) + (height - i14);
                                    } else if (i15 != 80) {
                                        iAbs2 = 0;
                                    } else {
                                        i18 = i14 - iRound2;
                                        iAbs = Math.abs(i16 - i12);
                                    }
                                    float f12 = iAbs2;
                                    i19 = lVar.f15427a;
                                    if (i19 != 3) {
                                        width2 = viewGroup.getWidth();
                                    } else {
                                        width2 = viewGroup.getWidth();
                                    }
                                    float f13 = f12 / width2;
                                    j = this.f2785i;
                                    if (j < 0) {
                                        j = 300;
                                    }
                                    jRound = Math.round(((((long) i11) * j) / 3.0f) * f13);
                                } else {
                                    i18 = width - i12;
                                    iAbs = Math.abs(iCenterY - i14);
                                }
                                iAbs2 = iAbs + i18;
                                float f14 = iAbs2;
                                i19 = lVar.f15427a;
                                if (i19 != 3) {
                                    width2 = viewGroup.getWidth();
                                } else {
                                    width2 = viewGroup.getWidth();
                                }
                                float f15 = f14 / width2;
                                j = this.f2785i;
                                if (j < 0) {
                                    j = 300;
                                }
                                jRound = Math.round(((((long) i11) * j) / 3.0f) * f15);
                            } else {
                                jRound = 0;
                            }
                            sparseIntArray.put(this.S.size(), (int) jRound);
                            jMin = Math.min(jRound, jMin);
                        }
                        WindowId windowId = viewGroup.getWindowId();
                        p pVar2 = new p();
                        pVar2.f15431a = view;
                        pVar2.f15432b = str;
                        pVar2.f15433c = b0Var;
                        pVar2.f15434d = windowId;
                        pVar2.f15435e = this;
                        pVar2.f15436f = animator2;
                        obj = animator2;
                        if (z5) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator2);
                            obj = animatorSet;
                        }
                        eVarR.put(obj, pVar2);
                        this.S.add(obj);
                    }
                } else {
                    i7 = size;
                    z5 = z6;
                    i10 = 1;
                    view = b0Var2.f15373b;
                    animator = animatorL;
                }
                b0Var = null;
                animator2 = animator;
                if (animator2 == null) {
                    lVar = this.T;
                    if (lVar != null) {
                        if (b0Var2 == null) {
                            lVar2 = this.U;
                            if (lVar2 == null) {
                                rectU = null;
                            } else {
                                rectU = lVar2.u();
                            }
                            if (b0Var3 != null) {
                                iIntValue = 8;
                                if (b0Var2 == null) {
                                    rect = rectU;
                                } else {
                                    rect = rectU;
                                    num = (Integer) b0Var2.f15372a.get("android:visibilityPropagation:visibility");
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    }
                                }
                                if (iIntValue != 0) {
                                    b0Var2 = b0Var3;
                                    i11 = i10;
                                }
                                if (b0Var2 == null) {
                                    i12 = -1;
                                } else {
                                    i12 = iArr2[0];
                                }
                                if (b0Var2 == null) {
                                    i13 = -1;
                                } else {
                                    i13 = iArr[i10];
                                }
                                i14 = i13;
                                int[] iArr5 = new int[2];
                                viewGroup.getLocationOnScreen(iArr5);
                                iRound = Math.round(viewGroup.getTranslationX()) + iArr5[0];
                                iRound2 = Math.round(viewGroup.getTranslationY()) + iArr5[i10];
                                width = viewGroup.getWidth() + iRound;
                                height = viewGroup.getHeight() + iRound2;
                                if (rect != null) {
                                    iCenterX = rect.centerX();
                                    iCenterY = rect.centerY();
                                } else {
                                    iCenterY = (iRound2 + height) / 2;
                                    iCenterX = (iRound + width) / 2;
                                }
                                i15 = lVar.f15427a;
                                i16 = iCenterX;
                                if (i15 == 8388611) {
                                    i17 = i10;
                                    if (i15 == 8388613) {
                                        if (viewGroup.getLayoutDirection() == i17) {
                                            i15 = 3;
                                        } else {
                                            i15 = 5;
                                        }
                                    }
                                } else if (viewGroup.getLayoutDirection() == i10) {
                                    i15 = 5;
                                } else {
                                    i15 = 3;
                                }
                                if (i15 != 3) {
                                    if (i15 != 5) {
                                        iAbs2 = Math.abs(iCenterY - i14) + (i12 - iRound);
                                    } else if (i15 != 48) {
                                        iAbs2 = Math.abs(i16 - i12) + (height - i14);
                                    } else if (i15 != 80) {
                                        iAbs2 = 0;
                                    } else {
                                        i18 = i14 - iRound2;
                                        iAbs = Math.abs(i16 - i12);
                                    }
                                    float f16 = iAbs2;
                                    i19 = lVar.f15427a;
                                    if (i19 != 3) {
                                        width2 = viewGroup.getWidth();
                                    } else {
                                        width2 = viewGroup.getWidth();
                                    }
                                    float f17 = f16 / width2;
                                    j = this.f2785i;
                                    if (j < 0) {
                                        j = 300;
                                    }
                                    jRound = Math.round(((((long) i11) * j) / 3.0f) * f17);
                                } else {
                                    i18 = width - i12;
                                    iAbs = Math.abs(iCenterY - i14);
                                }
                                iAbs2 = iAbs + i18;
                                float f18 = iAbs2;
                                i19 = lVar.f15427a;
                                if (i19 != 3) {
                                    width2 = viewGroup.getWidth();
                                } else {
                                    width2 = viewGroup.getWidth();
                                }
                                float f19 = f18 / width2;
                                j = this.f2785i;
                                if (j < 0) {
                                    j = 300;
                                }
                                jRound = Math.round(((((long) i11) * j) / 3.0f) * f19);
                            } else {
                                rect = rectU;
                            }
                            i11 = -1;
                            if (b0Var2 == null) {
                                i12 = -1;
                            } else {
                                i12 = iArr2[0];
                            }
                            if (b0Var2 == null) {
                                i13 = -1;
                            } else {
                                i13 = iArr[i10];
                            }
                            i14 = i13;
                            int[] iArr6 = new int[2];
                            viewGroup.getLocationOnScreen(iArr6);
                            iRound = Math.round(viewGroup.getTranslationX()) + iArr6[0];
                            iRound2 = Math.round(viewGroup.getTranslationY()) + iArr6[i10];
                            width = viewGroup.getWidth() + iRound;
                            height = viewGroup.getHeight() + iRound2;
                            if (rect != null) {
                                iCenterX = rect.centerX();
                                iCenterY = rect.centerY();
                            } else {
                                iCenterY = (iRound2 + height) / 2;
                                iCenterX = (iRound + width) / 2;
                            }
                            i15 = lVar.f15427a;
                            i16 = iCenterX;
                            if (i15 == 8388611) {
                                i17 = i10;
                                if (i15 == 8388613) {
                                    if (viewGroup.getLayoutDirection() == i17) {
                                        i15 = 3;
                                    } else {
                                        i15 = 5;
                                    }
                                }
                            } else if (viewGroup.getLayoutDirection() == i10) {
                                i15 = 5;
                            } else {
                                i15 = 3;
                            }
                            if (i15 != 3) {
                                if (i15 != 5) {
                                    iAbs2 = Math.abs(iCenterY - i14) + (i12 - iRound);
                                } else if (i15 != 48) {
                                    iAbs2 = Math.abs(i16 - i12) + (height - i14);
                                } else if (i15 != 80) {
                                    iAbs2 = 0;
                                } else {
                                    i18 = i14 - iRound2;
                                    iAbs = Math.abs(i16 - i12);
                                }
                                float f110 = iAbs2;
                                i19 = lVar.f15427a;
                                if (i19 != 3) {
                                    width2 = viewGroup.getWidth();
                                } else {
                                    width2 = viewGroup.getWidth();
                                }
                                float f111 = f110 / width2;
                                j = this.f2785i;
                                if (j < 0) {
                                    j = 300;
                                }
                                jRound = Math.round(((((long) i11) * j) / 3.0f) * f111);
                            } else {
                                i18 = width - i12;
                                iAbs = Math.abs(iCenterY - i14);
                            }
                            iAbs2 = iAbs + i18;
                            float f112 = iAbs2;
                            i19 = lVar.f15427a;
                            if (i19 != 3) {
                                width2 = viewGroup.getWidth();
                            } else {
                                width2 = viewGroup.getWidth();
                            }
                            float f113 = f112 / width2;
                            j = this.f2785i;
                            if (j < 0) {
                                j = 300;
                            }
                            jRound = Math.round(((((long) i11) * j) / 3.0f) * f113);
                        } else {
                            lVar2 = this.U;
                            if (lVar2 == null) {
                                rectU = null;
                            } else {
                                rectU = lVar2.u();
                            }
                            if (b0Var3 != null) {
                                iIntValue = 8;
                                if (b0Var2 == null) {
                                    rect = rectU;
                                } else {
                                    rect = rectU;
                                    num = (Integer) b0Var2.f15372a.get("android:visibilityPropagation:visibility");
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    }
                                }
                                if (iIntValue != 0) {
                                    b0Var2 = b0Var3;
                                    i11 = i10;
                                }
                                if (b0Var2 == null) {
                                    i12 = -1;
                                } else {
                                    i12 = iArr2[0];
                                }
                                if (b0Var2 == null) {
                                    i13 = -1;
                                } else {
                                    i13 = iArr[i10];
                                }
                                i14 = i13;
                                int[] iArr7 = new int[2];
                                viewGroup.getLocationOnScreen(iArr7);
                                iRound = Math.round(viewGroup.getTranslationX()) + iArr7[0];
                                iRound2 = Math.round(viewGroup.getTranslationY()) + iArr7[i10];
                                width = viewGroup.getWidth() + iRound;
                                height = viewGroup.getHeight() + iRound2;
                                if (rect != null) {
                                    iCenterX = rect.centerX();
                                    iCenterY = rect.centerY();
                                } else {
                                    iCenterY = (iRound2 + height) / 2;
                                    iCenterX = (iRound + width) / 2;
                                }
                                i15 = lVar.f15427a;
                                i16 = iCenterX;
                                if (i15 == 8388611) {
                                    i17 = i10;
                                    if (i15 == 8388613) {
                                        if (viewGroup.getLayoutDirection() == i17) {
                                            i15 = 3;
                                        } else {
                                            i15 = 5;
                                        }
                                    }
                                } else if (viewGroup.getLayoutDirection() == i10) {
                                    i15 = 5;
                                } else {
                                    i15 = 3;
                                }
                                if (i15 != 3) {
                                    if (i15 != 5) {
                                        iAbs2 = Math.abs(iCenterY - i14) + (i12 - iRound);
                                    } else if (i15 != 48) {
                                        iAbs2 = Math.abs(i16 - i12) + (height - i14);
                                    } else if (i15 != 80) {
                                        iAbs2 = 0;
                                    } else {
                                        i18 = i14 - iRound2;
                                        iAbs = Math.abs(i16 - i12);
                                    }
                                    float f114 = iAbs2;
                                    i19 = lVar.f15427a;
                                    if (i19 != 3) {
                                        width2 = viewGroup.getWidth();
                                    } else {
                                        width2 = viewGroup.getWidth();
                                    }
                                    float f115 = f114 / width2;
                                    j = this.f2785i;
                                    if (j < 0) {
                                        j = 300;
                                    }
                                    jRound = Math.round(((((long) i11) * j) / 3.0f) * f115);
                                } else {
                                    i18 = width - i12;
                                    iAbs = Math.abs(iCenterY - i14);
                                }
                                iAbs2 = iAbs + i18;
                                float f116 = iAbs2;
                                i19 = lVar.f15427a;
                                if (i19 != 3) {
                                    width2 = viewGroup.getWidth();
                                } else {
                                    width2 = viewGroup.getWidth();
                                }
                                float f117 = f116 / width2;
                                j = this.f2785i;
                                if (j < 0) {
                                    j = 300;
                                }
                                jRound = Math.round(((((long) i11) * j) / 3.0f) * f117);
                            } else {
                                rect = rectU;
                            }
                            i11 = -1;
                            if (b0Var2 == null) {
                                i12 = -1;
                            } else {
                                i12 = iArr2[0];
                            }
                            if (b0Var2 == null) {
                                i13 = -1;
                            } else {
                                i13 = iArr[i10];
                            }
                            i14 = i13;
                            int[] iArr8 = new int[2];
                            viewGroup.getLocationOnScreen(iArr8);
                            iRound = Math.round(viewGroup.getTranslationX()) + iArr8[0];
                            iRound2 = Math.round(viewGroup.getTranslationY()) + iArr8[i10];
                            width = viewGroup.getWidth() + iRound;
                            height = viewGroup.getHeight() + iRound2;
                            if (rect != null) {
                                iCenterX = rect.centerX();
                                iCenterY = rect.centerY();
                            } else {
                                iCenterY = (iRound2 + height) / 2;
                                iCenterX = (iRound + width) / 2;
                            }
                            i15 = lVar.f15427a;
                            i16 = iCenterX;
                            if (i15 == 8388611) {
                                i17 = i10;
                                if (i15 == 8388613) {
                                    if (viewGroup.getLayoutDirection() == i17) {
                                        i15 = 3;
                                    } else {
                                        i15 = 5;
                                    }
                                }
                            } else if (viewGroup.getLayoutDirection() == i10) {
                                i15 = 5;
                            } else {
                                i15 = 3;
                            }
                            if (i15 != 3) {
                                if (i15 != 5) {
                                    iAbs2 = Math.abs(iCenterY - i14) + (i12 - iRound);
                                } else if (i15 != 48) {
                                    iAbs2 = Math.abs(i16 - i12) + (height - i14);
                                } else if (i15 != 80) {
                                    iAbs2 = 0;
                                } else {
                                    i18 = i14 - iRound2;
                                    iAbs = Math.abs(i16 - i12);
                                }
                                float f118 = iAbs2;
                                i19 = lVar.f15427a;
                                if (i19 != 3) {
                                    width2 = viewGroup.getWidth();
                                } else {
                                    width2 = viewGroup.getWidth();
                                }
                                float f119 = f118 / width2;
                                j = this.f2785i;
                                if (j < 0) {
                                    j = 300;
                                }
                                jRound = Math.round(((((long) i11) * j) / 3.0f) * f119);
                            } else {
                                i18 = width - i12;
                                iAbs = Math.abs(iCenterY - i14);
                            }
                            iAbs2 = iAbs + i18;
                            float f1110 = iAbs2;
                            i19 = lVar.f15427a;
                            if (i19 != 3) {
                                width2 = viewGroup.getWidth();
                            } else {
                                width2 = viewGroup.getWidth();
                            }
                            float f1111 = f1110 / width2;
                            j = this.f2785i;
                            if (j < 0) {
                                j = 300;
                            }
                            jRound = Math.round(((((long) i11) * j) / 3.0f) * f1111);
                        }
                        sparseIntArray.put(this.S.size(), (int) jRound);
                        jMin = Math.min(jRound, jMin);
                    }
                    WindowId windowId2 = viewGroup.getWindowId();
                    p pVar3 = new p();
                    pVar3.f15431a = view;
                    pVar3.f15432b = str;
                    pVar3.f15433c = b0Var;
                    pVar3.f15434d = windowId2;
                    pVar3.f15435e = this;
                    pVar3.f15436f = animator2;
                    obj = animator2;
                    if (z5) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(animator2);
                        obj = animatorSet2;
                    }
                    eVarR.put(obj, pVar3);
                    this.S.add(obj);
                }
            } else {
                i7 = size;
                z5 = z6;
                i20 = i20;
            }
            i20++;
            size = i7;
            z6 = z5;
        }
        if (sparseIntArray.size() != 0) {
            for (int i24 = 0; i24 < sparseIntArray.size(); i24++) {
                p pVar4 = (p) eVarR.get((Animator) this.S.get(sparseIntArray.keyAt(i24)));
                pVar4.f15436f.setStartDelay(pVar4.f15436f.getStartDelay() + (((long) sparseIntArray.valueAt(i24)) - jMin));
            }
        }
    }

    public final void n() {
        int i7 = this.N - 1;
        this.N = i7;
        if (i7 == 0) {
            A(this, t.f15448n, false);
            for (int i10 = 0; i10 < ((k) this.E.f6612i).f(); i10++) {
                View view = (View) ((k) this.E.f6612i).g(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((k) this.F.f6612i).f(); i11++) {
                View view2 = (View) ((k) this.F.f6612i).g(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.P = true;
        }
    }

    public void o() {
        ArrayList arrayList = this.f2789y;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.f2789y = arrayList;
    }

    public final b0 p(View view, boolean z5) {
        z zVar = this.G;
        if (zVar != null) {
            return zVar.p(view, z5);
        }
        ArrayList arrayList = z5 ? this.I : this.J;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            b0 b0Var = (b0) arrayList.get(i7);
            if (b0Var == null) {
                return null;
            }
            if (b0Var.f15373b == view) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            return (b0) (z5 ? this.J : this.I).get(i7);
        }
        return null;
    }

    public final Transition q() {
        z zVar = this.G;
        return zVar != null ? zVar.q() : this;
    }

    public String[] s() {
        return null;
    }

    public final b0 t(View view, boolean z5) {
        z zVar = this.G;
        if (zVar != null) {
            return zVar.t(view, z5);
        }
        return (b0) ((e) (z5 ? this.E : this.F).f6610d).get(view);
    }

    public final String toString() {
        return P("");
    }

    public boolean u() {
        return !this.L.isEmpty();
    }

    public boolean v() {
        return this instanceof a;
    }

    public boolean w(b0 b0Var, b0 b0Var2) {
        if (b0Var != null && b0Var2 != null) {
            String[] strArrS = s();
            if (strArrS != null) {
                for (String str : strArrS) {
                    if (z(b0Var, b0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = b0Var.f15372a.keySet().iterator();
                while (it.hasNext()) {
                    if (z(b0Var, b0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean x(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f2789y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((Class) this.f2789y.get(i7)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.f2787w;
        int size2 = arrayList2.size();
        ArrayList arrayList3 = this.f2788x;
        return (size2 == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id2)) || arrayList3.contains(view);
    }
}
