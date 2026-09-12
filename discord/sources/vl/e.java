package vl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f1;
import androidx.core.view.g1;
import androidx.core.view.m0;
import androidx.core.view.p1;
import androidx.core.view.t;
import androidx.core.view.u0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import we.k;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends g1 implements t {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public h J;
    public final HashSet K;
    public boolean L;
    public final d M;
    public final k N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final am.e f21734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f21735e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThemedReactContext f21736i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f21737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f21738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f21739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f21740y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.ViewTreeObserver$OnGlobalFocusChangeListener, vl.d] */
    public e(am.e eventPropagationView, ViewGroup view, ThemedReactContext themedReactContext, f config) {
        super(1);
        Intrinsics.checkNotNullParameter(eventPropagationView, "eventPropagationView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(config, "config");
        config.getClass();
        this.f21734d = eventPropagationView;
        this.f21735e = view;
        this.f21736i = themedReactContext;
        this.f21737v = config;
        this.f21738w = UIManagerHelper.getSurfaceId(eventPropagationView);
        this.I = -1;
        this.K = new HashSet();
        ?? r5 = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: vl.d
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                if (view3 instanceof EditText) {
                    int id2 = ((EditText) view3).getId();
                    e eVar = this.f21733d;
                    eVar.I = id2;
                    am.e eVar2 = eVar.f21734d;
                    ThemedReactContext themedReactContext2 = eVar.f21736i;
                    if (!eVar.E || view2 == null) {
                        return;
                    }
                    sl.b.a(themedReactContext2, eVar2.getId(), new rl.c(eVar.f21738w, eVar2.getId(), rl.c.F, eVar.f21739x, 1.0d, 0, eVar.I));
                    sl.b.a(themedReactContext2, eVar2.getId(), new rl.c(eVar.f21738w, eVar2.getId(), rl.c.G, eVar.f21739x, 1.0d, 0, eVar.I));
                    sl.b.b(themedReactContext2, "KeyboardController::keyboardWillShow", eVar.d(eVar.f21739x));
                    sl.b.b(themedReactContext2, "KeyboardController::keyboardDidShow", eVar.d(eVar.f21739x));
                }
            }
        };
        this.M = r5;
        this.N = new k(view, eventPropagationView, themedReactContext);
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(r5);
    }

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View v6, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v6, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        double dC = c();
        boolean z5 = this.E && e();
        boolean z6 = this.F || gn.h.f10142a;
        boolean z7 = z5 && !z6;
        boolean z10 = this.f21739x == dC;
        if (!z6 && !this.G) {
            g(Boolean.valueOf(e()), Double.valueOf(dC));
        }
        if (z7 && !z10 && !g.f21742a) {
            String message = "onApplyWindowInsets: " + this.f21739x + " -> " + dC;
            Intrinsics.checkNotNullParameter(message, "message");
            f(dC);
        }
        return insets;
    }

    public final void b() {
        h hVar = this.J;
        if (hVar == null) {
            return;
        }
        this.J = null;
        am.e eVar = this.f21734d;
        sl.b.a(this.f21736i, eVar.getId(), new rl.c(this.f21738w, eVar.getId(), rl.c.F, hVar.f21743a, hVar.f21744b, hVar.f21745c, hVar.f21746d));
    }

    public final double c() {
        Insets insetsF;
        Insets insetsF2;
        WeakHashMap weakHashMap = u0.f1729a;
        WindowInsetsCompat windowInsetsCompatA = m0.a(this.f21735e);
        int i7 = 0;
        int i10 = (windowInsetsCompatA == null || (insetsF2 = windowInsetsCompatA.f1605a.f(8)) == null) ? 0 : insetsF2.f1559d;
        if (!this.f21737v.f21741a && windowInsetsCompatA != null && (insetsF = windowInsetsCompatA.f1605a.f(2)) != null) {
            i7 = insetsF.f1559d;
        }
        double dC = sl.c.c(i10 - i7);
        if (dC < 0.0d) {
            return 0.0d;
        }
        return dC;
    }

    public final WritableMap d(double d6) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("height", d6);
        writableMapCreateMap.putInt("duration", this.H);
        writableMapCreateMap.putDouble("timestamp", System.currentTimeMillis());
        writableMapCreateMap.putInt("target", this.I);
        writableMapCreateMap.putString("type", null);
        ThemedReactContext themedReactContext = this.f21736i;
        String str = "light";
        if (themedReactContext != null && sl.a.b(themedReactContext)) {
            str = "dark";
        }
        writableMapCreateMap.putString("appearance", str);
        return writableMapCreateMap;
    }

    public final boolean e() {
        WeakHashMap weakHashMap = u0.f1729a;
        WindowInsetsCompat windowInsetsCompatA = m0.a(this.f21735e);
        if (windowInsetsCompatA != null) {
            return windowInsetsCompatA.f1605a.p(8);
        }
        return false;
    }

    public final void f(double d6) {
        this.H = 0;
        WritableMap writableMapD = d(d6);
        ThemedReactContext themedReactContext = this.f21736i;
        sl.b.b(themedReactContext, "KeyboardController::keyboardWillShow", writableMapD);
        Iterator it = d0.g(rl.c.F, rl.c.E, rl.c.G).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            am.e eVar = this.f21734d;
            if (!zHasNext) {
                sl.b.b(themedReactContext, "KeyboardController::keyboardDidShow", d(d6));
                int[] iArr = {eVar.getId()};
                WritableArray writableArrayCreateArray = Arguments.createArray();
                writableArrayCreateArray.pushInt(iArr[0]);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putArray("tags", writableArrayCreateArray);
                sl.b.b(themedReactContext, "onUserDrivenAnimationEnded", writableMapCreateMap);
                this.f21739x = d6;
                return;
            }
            rl.b bVar = (rl.b) it.next();
            sl.b.a(themedReactContext, eVar.getId(), new rl.c(this.f21738w, eVar.getId(), bVar, d6, 1.0d, 0, this.I));
        }
    }

    public final void g(Boolean bool, Double d6) {
        double dDoubleValue = d6 != null ? d6.doubleValue() : c();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : e();
        this.E = zBooleanValue;
        this.f21740y = dDoubleValue;
        this.F = false;
        this.H = 0;
        this.J = null;
        String strConcat = "KeyboardController::".concat(!zBooleanValue ? "keyboardDidHide" : "keyboardDidShow");
        WritableMap writableMapD = d(dDoubleValue);
        ThemedReactContext themedReactContext = this.f21736i;
        sl.b.b(themedReactContext, strConcat, writableMapD);
        for (rl.b bVar : d0.g(rl.c.E, rl.c.G)) {
            am.e eVar = this.f21734d;
            sl.b.a(themedReactContext, eVar.getId(), new rl.c(this.f21738w, eVar.getId(), bVar, dDoubleValue, !this.E ? 0.0d : 1.0d, this.H, this.I));
        }
    }

    @Override // androidx.core.view.g1
    public final void onEnd(p1 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (!sl.c.e(animation) || this.L) {
            return;
        }
        this.G = false;
        this.F = false;
        int iA = (int) animation.f1715a.a();
        this.H = iA;
        io.sentry.react.d dVar = new io.sentry.react.d(24, this, animation);
        if (iA == -1) {
            this.f21735e.postDelayed(dVar, ql.b.f18923a);
        } else {
            dVar.run();
        }
    }

    @Override // androidx.core.view.g1
    public final void onPrepare(p1 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onPrepare(animation);
        if (sl.c.e(animation)) {
            this.G = true;
        }
    }

    @Override // androidx.core.view.g1
    public final WindowInsetsCompat onProgress(WindowInsetsCompat insets, List runningAnimations) {
        Object next;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        Iterator it = runningAnimations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            p1 p1Var = (p1) next;
            if (sl.c.e(p1Var) && !this.K.contains(p1Var)) {
                break;
            }
        }
        boolean z5 = next == null;
        if (!this.L && !z5) {
            f fVar = this.f21737v;
            fVar.getClass();
            Insets insetsF = insets.f1605a.f(8);
            Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
            Insets insetsF2 = insets.f1605a.f(519);
            Intrinsics.checkNotNullExpressionValue(insetsF2, "getInsets(...)");
            boolean z6 = fVar.f21741a;
            Insets NONE = Insets.f1555e;
            if (z6) {
                Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
                insetsF2 = NONE;
            }
            Insets insetsA = Insets.a(Insets.b(insetsF.f1556a - insetsF2.f1556a, insetsF.f1557b - insetsF2.f1557b, insetsF.f1558c - insetsF2.f1558c, insetsF.f1559d - insetsF2.f1559d), NONE);
            Intrinsics.checkNotNullExpressionValue(insetsA, "let(...)");
            float f2 = insetsA.f1559d - insetsA.f1557b;
            double dC = sl.c.c(f2);
            double d6 = 0.0d;
            try {
                double dAbs = Math.abs(dC / this.f21739x);
                if (!Double.isNaN(dAbs) && !Double.isInfinite(dAbs)) {
                    d6 = dAbs;
                }
            } catch (ArithmeticException e10) {
                boolean z7 = g.f21742a;
                String message = "Caught arithmetic exception during `progress` calculation: " + e10;
                Intrinsics.checkNotNullParameter(message, "message");
            }
            double d7 = d6;
            boolean z10 = g.f21742a;
            String message2 = "DiffY: " + f2 + " " + dC + " " + d7 + " " + gn.h.f10142a + " " + this.I;
            Intrinsics.checkNotNullParameter(message2, "message");
            b();
            if (this.F) {
                rl.b bVar = gn.h.f10142a ? rl.c.H : rl.c.E;
                am.e eVar = this.f21734d;
                sl.b.a(this.f21736i, eVar.getId(), new rl.c(this.f21738w, eVar.getId(), bVar, dC, d7, this.H, this.I));
            }
        }
        return insets;
    }

    @Override // androidx.core.view.g1
    public final f1 onStart(p1 animation, f1 bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (sl.c.e(animation) && !this.L) {
            boolean z5 = false;
            this.G = false;
            this.F = true;
            this.J = null;
            this.E = e();
            this.H = (int) animation.f1715a.a();
            double dC = c();
            boolean z6 = this.E;
            if (z6) {
                this.f21739x = dC;
            }
            boolean z7 = (dC == 0.0d || this.f21740y == dC) ? false : true;
            if (z6 && this.f21740y != 0.0d) {
                z5 = true;
            }
            if (z7 && z5 && g.f21742a) {
                f(dC);
                this.K.add(animation);
                return bounds;
            }
            sl.b.b(this.f21736i, "KeyboardController::".concat(!z6 ? "keyboardWillHide" : "keyboardWillShow"), d(dC));
            boolean z10 = g.f21742a;
            String message = "HEIGHT:: " + dC + " TAG:: " + this.I;
            Intrinsics.checkNotNullParameter(message, "message");
            this.J = new h(dC, this.E ? 1.0d : 0.0d, this.H, this.I);
            Intrinsics.checkNotNullExpressionValue(bounds, "onStart(...)");
        }
        return bounds;
    }
}
