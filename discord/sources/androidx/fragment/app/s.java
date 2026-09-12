package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b2 {
    public static void o(s.e eVar, View view) {
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        String strF = androidx.core.view.l0.f(view);
        if (strF != null) {
            eVar.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View child = viewGroup.getChildAt(i7);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    o(eVar, child);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    /* JADX WARN: Code duplicated, block: B:191:0x055f A[LOOP:20: B:189:0x0559->B:191:0x055f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    @Override // androidx.fragment.app.b2
    public final void b(ArrayList operations, boolean z5) {
        z1 z1Var;
        z1 z1Var2;
        z1 z1Var3;
        float f2;
        Object next;
        int i7;
        Object objPrevious;
        int i10;
        Object obj;
        z1 z1Var4;
        ArrayList<g> arrayList;
        p pVar;
        String str;
        Iterator it;
        ArrayList arrayList2;
        t1 t1Var;
        ArrayList arrayList3;
        ArrayList arrayList4;
        z1 z1Var5;
        ArrayList arrayList5;
        int i11;
        SharedElementCallback sharedElementCallback;
        Object obj2;
        String strB;
        z1 z1Var6;
        z1 z1Var7;
        Intrinsics.checkNotNullParameter(operations, "operations");
        int i12 = 2;
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it2 = operations.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            z1Var = z1.f2291i;
            z1Var2 = z1.f2290e;
            z1Var3 = z1.f2292v;
            if (!zHasNext) {
                f2 = 0.0f;
                next = null;
                break;
            }
            next = it2.next();
            f2 = 0.0f;
            x1 x1Var = (x1) next;
            View view = x1Var.f2274c.mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                z1Var7 = z1Var3;
            } else {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    z1Var7 = z1Var2;
                } else if (visibility == 4) {
                    z1Var7 = z1Var3;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(kk.b.h(visibility, "Unknown visibility "));
                    }
                    z1Var7 = z1Var;
                }
            }
            if (z1Var7 == z1Var2 && x1Var.f2272a != z1Var2) {
                break;
            }
        }
        x1 x1Var2 = (x1) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i7 = i12;
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            x1 x1Var3 = (x1) objPrevious;
            i7 = i12;
            View view2 = x1Var3.f2274c.mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (view2.getAlpha() == f2 && view2.getVisibility() == 0) {
                z1Var6 = z1Var3;
            } else {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    z1Var6 = z1Var2;
                } else if (visibility2 == 4) {
                    z1Var6 = z1Var3;
                } else {
                    if (visibility2 != 8) {
                        throw new IllegalArgumentException(kk.b.h(visibility2, "Unknown visibility "));
                    }
                    z1Var6 = z1Var;
                }
            }
            if (z1Var6 != z1Var2 && x1Var3.f2272a == z1Var2) {
                break;
            } else {
                i12 = i7;
            }
        }
        x1 x1Var4 = (x1) objPrevious;
        if (FragmentManager.M(i7)) {
            Log.v("FragmentManager", "Executing operations from " + x1Var2 + " to " + x1Var4);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Fragment fragment = ((x1) CollectionsKt.Q(operations)).f2274c;
        Iterator it3 = operations.iterator();
        while (it3.hasNext()) {
            Fragment.AnimationInfo animationInfo = ((x1) it3.next()).f2274c.mAnimationInfo;
            Fragment.AnimationInfo animationInfo2 = fragment.mAnimationInfo;
            animationInfo.f2013b = animationInfo2.f2013b;
            animationInfo.f2014c = animationInfo2.f2014c;
            animationInfo.f2015d = animationInfo2.f2015d;
            animationInfo.f2016e = animationInfo2.f2016e;
        }
        Iterator it4 = operations.iterator();
        while (true) {
            i10 = 0;
            if (!it4.hasNext()) {
                break;
            }
            x1 x1Var5 = (x1) it4.next();
            arrayList6.add(new g(x1Var5, z5));
            arrayList7.add(new q(x1Var5, z5, !z5 ? x1Var5 != x1Var4 : x1Var5 != x1Var2));
            d listener = new d(i10, this, x1Var5);
            Intrinsics.checkNotNullParameter(listener, "listener");
            x1Var5.f2275d.add(listener);
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj3 : arrayList7) {
            if (!((q) obj3).a()) {
                arrayList8.add(obj3);
            }
        }
        ArrayList<q> arrayList9 = new ArrayList();
        for (Object obj4 : arrayList8) {
            if (((q) obj4).b() != null) {
                arrayList9.add(obj4);
            }
        }
        t1 t1Var2 = null;
        for (q qVar : arrayList9) {
            t1 t1VarB = qVar.b();
            if (t1Var2 != null && t1VarB != t1Var2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + qVar.f2178a.f2274c + " returned Transition " + qVar.f2235b + " which uses a different Transition type than other Fragments.").toString());
            }
            t1Var2 = t1VarB;
        }
        if (t1Var2 == null) {
            z1Var4 = z1Var;
            arrayList = arrayList6;
            str = "effect";
        } else {
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            s.e eVar = new s.e(0);
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            s.e eVar2 = new s.e(0);
            ArrayList<String> arrayList14 = arrayList12;
            s.e namedViews = new s.e(0);
            Iterator it5 = arrayList9.iterator();
            loop10: while (true) {
                obj = null;
                while (true) {
                    if (!it5.hasNext()) {
                        break loop10;
                    }
                    Object obj5 = ((q) it5.next()).f2237d;
                    if (obj5 == null || x1Var2 == null) {
                        arrayList2 = arrayList9;
                    } else {
                        arrayList2 = arrayList9;
                        Fragment fragment2 = x1Var2.f2274c;
                        if (x1Var4 != null) {
                            arrayList3 = arrayList10;
                            Fragment fragment3 = x1Var4.f2274c;
                            Object objY = t1Var2.y(t1Var2.h(obj5));
                            t1Var = t1Var2;
                            ArrayList<String> sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                            arrayList4 = arrayList11;
                            Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                            z1Var5 = z1Var;
                            Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                            Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                            int size = sharedElementTargetNames.size();
                            arrayList5 = arrayList6;
                            int i13 = 0;
                            while (i13 < size) {
                                int i14 = size;
                                int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i13));
                                if (iIndexOf != -1) {
                                    sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i13));
                                }
                                i13++;
                                size = i14;
                            }
                            ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                            Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                            Pair pair = !z5 ? new Pair(fragment2.getExitTransitionCallback(), fragment3.getEnterTransitionCallback()) : new Pair(fragment2.getEnterTransitionCallback(), fragment3.getExitTransitionCallback());
                            SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.f14612d;
                            SharedElementCallback sharedElementCallback3 = (SharedElementCallback) pair.f14613e;
                            int size2 = sharedElementSourceNames.size();
                            int i15 = 0;
                            while (true) {
                                sharedElementCallback = sharedElementCallback3;
                                if (i15 >= size2) {
                                    break;
                                }
                                int i16 = size2;
                                String str2 = sharedElementSourceNames.get(i15);
                                Intrinsics.checkNotNullExpressionValue(str2, "exitingNames[i]");
                                String str3 = sharedElementTargetNames2.get(i15);
                                Intrinsics.checkNotNullExpressionValue(str3, "enteringNames[i]");
                                eVar.put(str2, str3);
                                i15++;
                                sharedElementCallback3 = sharedElementCallback;
                                size2 = i16;
                            }
                            if (FragmentManager.M(i7)) {
                                Log.v("FragmentManager", ">>> entering view names <<<");
                                Iterator<String> it6 = sharedElementTargetNames2.iterator();
                                while (true) {
                                    Iterator<String> it7 = it6;
                                    if (!it6.hasNext()) {
                                        break;
                                    }
                                    Log.v("FragmentManager", "Name: " + it7.next());
                                    it6 = it7;
                                    objY = objY;
                                }
                                obj2 = objY;
                                Log.v("FragmentManager", ">>> exiting view names <<<");
                                for (Iterator<String> it8 = sharedElementSourceNames.iterator(); it8.hasNext(); it8 = it8) {
                                    Log.v("FragmentManager", "Name: " + it8.next());
                                }
                            } else {
                                obj2 = objY;
                            }
                            View view3 = fragment2.mView;
                            Intrinsics.checkNotNullExpressionValue(view3, "firstOut.fragment.mView");
                            o(eVar2, view3);
                            eVar2.l(sharedElementSourceNames);
                            if (sharedElementCallback2 != null) {
                                if (FragmentManager.M(i7)) {
                                    Log.v("FragmentManager", "Executing exit callback for operation " + x1Var2);
                                }
                                int size3 = sharedElementSourceNames.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i17 = size3 - 1;
                                        String str4 = sharedElementSourceNames.get(size3);
                                        Intrinsics.checkNotNullExpressionValue(str4, "exitingNames[i]");
                                        String str5 = str4;
                                        View view4 = (View) eVar2.get(str5);
                                        if (view4 == null) {
                                            eVar.remove(str5);
                                        } else {
                                            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                                            if (!Intrinsics.areEqual(str5, androidx.core.view.l0.f(view4))) {
                                                eVar.put(androidx.core.view.l0.f(view4), (String) eVar.remove(str5));
                                            }
                                        }
                                        if (i17 < 0) {
                                            break;
                                        } else {
                                            size3 = i17;
                                        }
                                    }
                                }
                            } else {
                                eVar.l(eVar2.keySet());
                            }
                            View view5 = fragment3.mView;
                            Intrinsics.checkNotNullExpressionValue(view5, "lastIn.fragment.mView");
                            o(namedViews, view5);
                            namedViews.l(sharedElementTargetNames2);
                            namedViews.l(eVar.values());
                            if (sharedElementCallback != null) {
                                if (FragmentManager.M(i7)) {
                                    Log.v("FragmentManager", "Executing enter callback for operation " + x1Var4);
                                }
                                int size4 = sharedElementTargetNames2.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i18 = size4 - 1;
                                        String str6 = sharedElementTargetNames2.get(size4);
                                        Intrinsics.checkNotNullExpressionValue(str6, "enteringNames[i]");
                                        String str7 = str6;
                                        View view6 = (View) namedViews.get(str7);
                                        if (view6 == null) {
                                            String strB2 = m1.b(eVar, str7);
                                            if (strB2 != null) {
                                                eVar.remove(strB2);
                                            }
                                        } else {
                                            WeakHashMap weakHashMap2 = androidx.core.view.u0.f1729a;
                                            if (!Intrinsics.areEqual(str7, androidx.core.view.l0.f(view6)) && (strB = m1.b(eVar, str7)) != null) {
                                                eVar.put(strB, androidx.core.view.l0.f(view6));
                                            }
                                        }
                                        if (i18 < 0) {
                                            break;
                                        } else {
                                            size4 = i18;
                                        }
                                    }
                                }
                            } else {
                                r1 r1Var = m1.f2198a;
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                Intrinsics.checkNotNullParameter(namedViews, "namedViews");
                                for (int i19 = eVar.f1222i - 1; -1 < i19; i19--) {
                                    if (!namedViews.containsKey((String) eVar.i(i19))) {
                                        eVar.g(i19);
                                    }
                                }
                            }
                            Set setKeySet = eVar.keySet();
                            Intrinsics.checkNotNullExpressionValue(setKeySet, "sharedElementNameMapping.keys");
                            Set entries = eVar2.entrySet();
                            Intrinsics.checkNotNullExpressionValue(entries, "entries");
                            i11 = 0;
                            r predicate = new r(i11, setKeySet);
                            Intrinsics.checkNotNullParameter(entries, "<this>");
                            Intrinsics.checkNotNullParameter(predicate, "predicate");
                            kotlin.collections.i0.r(entries, predicate, false);
                            Collection collectionValues = eVar.values();
                            Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                            Set entries2 = namedViews.entrySet();
                            Intrinsics.checkNotNullExpressionValue(entries2, "entries");
                            r predicate2 = new r(i11, collectionValues);
                            Intrinsics.checkNotNullParameter(entries2, "<this>");
                            Intrinsics.checkNotNullParameter(predicate2, "predicate");
                            kotlin.collections.i0.r(entries2, predicate2, false);
                            if (eVar.isEmpty()) {
                                Log.i("FragmentManager", "Ignoring shared elements transition " + obj2 + " between " + x1Var2 + " and " + x1Var4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                arrayList3.clear();
                                arrayList4.clear();
                                arrayList13 = sharedElementSourceNames;
                                arrayList14 = sharedElementTargetNames2;
                                i10 = 0;
                                arrayList9 = arrayList2;
                                arrayList10 = arrayList3;
                                t1Var2 = t1Var;
                                arrayList11 = arrayList4;
                                z1Var = z1Var5;
                                arrayList6 = arrayList5;
                            } else {
                                obj = obj2;
                                arrayList13 = sharedElementSourceNames;
                                arrayList14 = sharedElementTargetNames2;
                            }
                        }
                        i10 = i11;
                        arrayList9 = arrayList2;
                        arrayList10 = arrayList3;
                        t1Var2 = t1Var;
                        arrayList11 = arrayList4;
                        z1Var = z1Var5;
                        arrayList6 = arrayList5;
                    }
                    t1Var = t1Var2;
                    arrayList3 = arrayList10;
                    arrayList4 = arrayList11;
                    z1Var5 = z1Var;
                    arrayList5 = arrayList6;
                    i11 = 0;
                    i10 = i11;
                    arrayList9 = arrayList2;
                    arrayList10 = arrayList3;
                    t1Var2 = t1Var;
                    arrayList11 = arrayList4;
                    z1Var = z1Var5;
                    arrayList6 = arrayList5;
                }
            }
            ArrayList arrayList15 = arrayList9;
            t1 t1Var3 = t1Var2;
            ArrayList arrayList16 = arrayList10;
            ArrayList arrayList17 = arrayList11;
            z1Var4 = z1Var;
            arrayList = arrayList6;
            if (obj != null) {
                str = "effect";
                pVar = new p(arrayList15, x1Var2, x1Var4, t1Var3, obj, arrayList16, arrayList17, eVar, arrayList14, arrayList13, eVar2, namedViews, z5);
                it = arrayList15.iterator();
                while (it.hasNext()) {
                    x1 x1Var6 = ((q) it.next()).f2178a;
                    x1Var6.getClass();
                    Intrinsics.checkNotNullParameter(pVar, str);
                    x1Var6.j.add(pVar);
                }
            } else {
                if (!arrayList15.isEmpty()) {
                    Iterator it9 = arrayList15.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (((q) it9.next()).f2235b != null) {
                                str = "effect";
                                pVar = new p(arrayList15, x1Var2, x1Var4, t1Var3, obj, arrayList16, arrayList17, eVar, arrayList14, arrayList13, eVar2, namedViews, z5);
                                it = arrayList15.iterator();
                                while (it.hasNext()) {
                                    x1 x1Var7 = ((q) it.next()).f2178a;
                                    x1Var7.getClass();
                                    Intrinsics.checkNotNullParameter(pVar, str);
                                    x1Var7.j.add(pVar);
                                }
                            }
                        }
                    }
                }
                str = "effect";
            }
        }
        ArrayList<g> arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            kotlin.collections.i0.o(arrayList19, ((g) it10.next()).f2178a.k);
        }
        boolean zIsEmpty = arrayList19.isEmpty();
        boolean z6 = false;
        for (g gVar : arrayList) {
            Context context = this.f2102a.getContext();
            x1 x1Var8 = gVar.f2178a;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            k0 k0VarB = gVar.b(context);
            if (k0VarB != null) {
                if (((AnimatorSet) k0VarB.f2173b) == null) {
                    arrayList18.add(gVar);
                } else {
                    Fragment fragment4 = x1Var8.f2274c;
                    if (x1Var8.k.isEmpty()) {
                        z1 z1Var8 = z1Var4;
                        if (x1Var8.f2272a == z1Var8) {
                            x1Var8.f2280i = false;
                        }
                        i iVar = new i(gVar);
                        Intrinsics.checkNotNullParameter(iVar, str);
                        x1Var8.j.add(iVar);
                        z1Var4 = z1Var8;
                        z6 = true;
                    } else if (FragmentManager.M(i7)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (g gVar2 : arrayList18) {
            x1 x1Var9 = gVar2.f2178a;
            Fragment fragment5 = x1Var9.f2274c;
            if (zIsEmpty) {
                if (!z6) {
                    f fVar = new f(gVar2);
                    Intrinsics.checkNotNullParameter(fVar, str);
                    x1Var9.j.add(fVar);
                } else if (FragmentManager.M(i7)) {
                    Log.v(r3, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.M(i7)) {
                Log.v(r3, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
            }
        }
    }
}
