package jm;

import android.graphics.PointF;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import im.q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactContext f13960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final im.g f13962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f13963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f13964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13967h;

    public m(ReactContext context, n wrappedView, int i7) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrappedView, "wrappedView");
        this.f13960a = context;
        this.f13961b = i7;
        RNGestureHandlerModule.Companion.getClass();
        k kVar = (k) RNGestureHandlerModule.registries.get(Integer.valueOf(i7));
        if (kVar == null) {
            throw new Exception("Tried to access a non-existent registry");
        }
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        NativeModule nativeModule = context.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        UiThreadUtil.assertOnUiThread();
        ViewParent parent = wrappedView;
        while (parent != null && !(parent instanceof RootView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            throw new IllegalStateException(("View " + wrappedView + " has not been mounted under ReactRootView").toString());
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f13964e = viewGroup;
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Initialize gesture handler for root view " + viewGroup);
        im.g gVar = new im.g(wrappedView, kVar, new i8.c(10), viewGroup, new ga.l(18, this));
        gVar.f11922e = 0.1f;
        this.f13962c = gVar;
        l lVar = new l(this, -id2);
        this.f13963d = lVar;
        kVar.h(lVar);
        kVar.a(lVar.f11892d, id2, 3, null);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean a(MotionEvent event) {
        boolean z5;
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13967h = true;
        im.g gVar = this.f13962c;
        Intrinsics.checkNotNull(gVar);
        ArrayList arrayList = gVar.f11923f;
        Intrinsics.checkNotNullParameter(event, "event");
        gVar.f11927l = true;
        int actionMasked = event.getActionMasked();
        SparseArray sparseArray = gVar.j;
        int actionIndex = event.getActionIndex();
        int actionMasked2 = event.getActionMasked();
        if (actionMasked2 == 0) {
            sparseArray.put(event.getPointerId(actionIndex), new PointF(event.getX(actionIndex), event.getY(actionIndex)));
        } else if (actionMasked2 == 1 || actionMasked2 == 3) {
            sparseArray.clear();
        } else if (actionMasked2 == 5) {
            sparseArray.put(event.getPointerId(actionIndex), new PointF(event.getX(actionIndex), event.getY(actionIndex)));
        } else if (actionMasked2 == 6) {
            sparseArray.remove(event.getPointerId(actionIndex));
        }
        if (actionMasked == 0) {
            int actionIndex2 = event.getActionIndex();
            int pointerId = event.getPointerId(actionIndex2);
            float[] fArr = im.g.f11916s;
            fArr[0] = event.getX(actionIndex2);
            fArr[1] = event.getY(actionIndex2);
            n nVar = gVar.f11918a;
            gVar.m(nVar, fArr, pointerId, event);
            gVar.e(nVar, fArr, pointerId, event);
        } else if (actionMasked == 3) {
            Iterator it = CollectionsKt.i0(j0.y(gVar.f11924g)).iterator();
            while (it.hasNext()) {
                ((im.f) it.next()).e();
            }
            Iterator it2 = CollectionsKt.X(arrayList).iterator();
            while (it2.hasNext()) {
                ((im.f) it2.next()).e();
            }
        } else if (actionMasked == 5 || actionMasked == 7) {
            int actionIndex3 = event.getActionIndex();
            int pointerId2 = event.getPointerId(actionIndex3);
            float[] fArr2 = im.g.f11916s;
            fArr2[0] = event.getX(actionIndex3);
            fArr2[1] = event.getY(actionIndex3);
            n nVar2 = gVar.f11918a;
            gVar.m(nVar2, fArr2, pointerId2, event);
            gVar.e(nVar2, fArr2, pointerId2, event);
        }
        ArrayDeque arrayDeque = gVar.f11925h;
        ArrayList arrayList2 = (ArrayList) arrayDeque.pollLast();
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        arrayList2.addAll(arrayList);
        h0.n(arrayList2, im.g.f11917t);
        try {
            Iterator it3 = arrayList2.iterator();
            Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
            while (it3.hasNext()) {
                gVar.d((im.f) it3.next(), event);
            }
            arrayList2.clear();
            arrayDeque.addLast(arrayList2);
            gVar.f11927l = false;
            if (gVar.f11929n && gVar.f11928m == 0) {
                gVar.b();
            }
            if ((actionMasked == 1 || actionMasked == 3 || actionMasked == 10) && arrayList.isEmpty()) {
                ViewGroup viewGroup = gVar.f11920c;
                if (viewGroup instanceof RootView) {
                    ((RootView) viewGroup).onChildEndedNativeGesture(viewGroup, event);
                }
            }
            this.f13967h = false;
            if (this.f13965f && !this.f13966g) {
                im.g gVar2 = this.f13962c;
                Intrinsics.checkNotNull(gVar2);
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                gVar2.f11926i.clear();
                int size = gVar2.j.size();
                for (int i7 = 0; i7 < size; i7++) {
                    PointF pointF = (PointF) gVar2.j.valueAt(i7);
                    float[] fArr3 = im.g.f11916s;
                    fArr3[0] = pointF.x;
                    fArr3[1] = pointF.y;
                    gVar2.c(fArr3, gVar2.f11918a, gVar2.f11926i);
                }
                if (!gVar2.f11926i.isEmpty()) {
                    ArrayList arrayList3 = gVar2.f11923f;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : arrayList3) {
                        if (((im.f) obj).L) {
                            arrayList4.add(obj);
                        }
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(event);
                    motionEventObtain.setAction(3);
                    Iterator it4 = gVar2.f11926i.iterator();
                    Intrinsics.checkNotNullExpressionValue(it4, "iterator(...)");
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                        View view = (View) next;
                        if (view != gVar2.f11918a) {
                            ArrayList arrayListG = gVar2.f11919b.g(view);
                            if (arrayListG != null) {
                                synchronized (arrayListG) {
                                    if (arrayListG.isEmpty()) {
                                        z5 = false;
                                    } else {
                                        Iterator it5 = arrayListG.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                im.f fVar = (im.f) it5.next();
                                                if (fVar instanceof q) {
                                                    if (!fVar.L && !arrayList4.isEmpty()) {
                                                        Iterator it6 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                im.f fVar2 = (im.f) it6.next();
                                                                PointF pointF2 = im.g.f11913p;
                                                                if (vi.d.f(fVar, fVar2)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z5 = true;
                                                }
                                            } else {
                                                z5 = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                view.onTouchEvent(motionEventObtain);
                            }
                        }
                    }
                    motionEventObtain.recycle();
                    gVar2.f11926i.clear();
                }
            }
            boolean z6 = this.f13965f;
            this.f13966g = z6;
            return z6;
        } catch (Throwable th2) {
            arrayList2.clear();
            arrayDeque.addLast(arrayList2);
            throw th2;
        }
    }

    public final void b() {
        RNGestureHandlerModule.Companion.getClass();
        k kVar = (k) RNGestureHandlerModule.registries.get(Integer.valueOf(this.f13961b));
        if (kVar == null) {
            throw new Exception("Tried to access a non-existent registry");
        }
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f13964e);
        ReactContext reactContext = this.f13960a;
        Intrinsics.checkNotNull(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((ThemedReactContext) reactContext).getReactApplicationContext().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        l lVar = this.f13963d;
        Intrinsics.checkNotNull(lVar);
        kVar.e(lVar.f11892d);
        ((RNGestureHandlerModule) nativeModule).unregisterRootHelper(this);
    }
}
