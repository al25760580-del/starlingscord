package im;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.x0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static MotionEvent.PointerProperties[] O;
    public static MotionEvent.PointerCoords[] P;
    public static short Q;
    public boolean A;
    public float B;
    public float C;
    public int D;
    public boolean E;
    public g F;
    public r G;
    public jm.i H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f11889a = new int[17];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f11891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f11894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jm.f f11895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f11897i;
    public float j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WritableArray f11900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WritableArray f11901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e[] f11904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11906t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11907u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11908v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float[] f11909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public short f11910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f11911y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f11912z;

    public f() {
        int[] iArr = new int[2];
        for (int i7 = 0; i7 < 2; i7++) {
            iArr[i7] = 0;
        }
        this.f11891c = iArr;
        this.f11898l = true;
        e[] eVarArr = new e[17];
        for (int i10 = 0; i10 < 17; i10++) {
            eVarArr[i10] = null;
        }
        this.f11904r = eVarArr;
        this.f11908v = true;
        this.I = 3;
    }

    public static WritableMap f(e eVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(StackTraceHelper.ID_KEY, eVar.f11884a);
        writableMapCreateMap.putDouble("x", PixelUtil.toDIPFromPixel(eVar.f11885b));
        writableMapCreateMap.putDouble("y", PixelUtil.toDIPFromPixel(eVar.f11886c));
        writableMapCreateMap.putDouble("absoluteX", PixelUtil.toDIPFromPixel(eVar.f11887d));
        writableMapCreateMap.putDouble("absoluteY", PixelUtil.toDIPFromPixel(eVar.f11888e));
        return writableMapCreateMap;
    }

    public static Activity n(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return n(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public void D() {
        this.f11893e = null;
        this.f11905s = false;
        this.A = false;
        this.E = false;
        if (this.f11894f != null && !this.f11898l) {
            UiThreadUtil.runOnUiThread(new c(0, this));
        }
        this.f11898l = true;
        this.f11909w = null;
        this.J = 0;
        this.f11906t = false;
        this.f11907u = false;
        this.f11908v = true;
    }

    public final void F(float f2, float f7, float f10, float f11, float f12, float f13) {
        if (this.f11909w == null) {
            this.f11909w = new float[6];
        }
        float[] fArr = this.f11909w;
        Intrinsics.checkNotNull(fArr);
        fArr[0] = f2;
        float[] fArr2 = this.f11909w;
        Intrinsics.checkNotNull(fArr2);
        fArr2[1] = f7;
        float[] fArr3 = this.f11909w;
        Intrinsics.checkNotNull(fArr3);
        fArr3[2] = f10;
        float[] fArr4 = this.f11909w;
        Intrinsics.checkNotNull(fArr4);
        fArr4[3] = f11;
        float[] fArr5 = this.f11909w;
        Intrinsics.checkNotNull(fArr5);
        fArr5[4] = f12;
        float[] fArr6 = this.f11909w;
        Intrinsics.checkNotNull(fArr6);
        fArr6[5] = f13;
        if (!Float.isNaN(f12) && !Float.isNaN(f2) && !Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (!Float.isNaN(f12) && Float.isNaN(f2) && Float.isNaN(f10)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (!Float.isNaN(f13) && !Float.isNaN(f11) && !Float.isNaN(f7)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (!Float.isNaN(f13) && Float.isNaN(f11) && Float.isNaN(f7)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    public boolean G(f otherHandler) {
        Intrinsics.checkNotNullParameter(otherHandler, "handler");
        if (otherHandler == this || this.H == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(this, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        if (otherHandler instanceof q) {
            return !((q) otherHandler).M(this);
        }
        return otherHandler instanceof jm.l;
    }

    public boolean H(ArrayList recorded) {
        Intrinsics.checkNotNullParameter(recorded, "recorded");
        return true;
    }

    public boolean I(f otherHandler) {
        Intrinsics.checkNotNullParameter(otherHandler, "handler");
        if (otherHandler == this) {
            return true;
        }
        jm.i iVar = this.H;
        if (iVar != null) {
            Intrinsics.checkNotNullParameter(this, "handler");
            Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
            int[] iArr = (int[]) iVar.f13954b.get(this.f11892d);
            if (iArr != null) {
                for (int i7 : iArr) {
                    if (i7 == otherHandler.f11892d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean J(f otherHandler) {
        jm.i iVar;
        Intrinsics.checkNotNullParameter(otherHandler, "handler");
        if (otherHandler != this && (iVar = this.H) != null) {
            Intrinsics.checkNotNullParameter(this, "handler");
            Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
            int[] iArr = (int[]) iVar.f13955c.get(this.f11892d);
            if (iArr != null) {
                for (int i7 : iArr) {
                    if (i7 == otherHandler.f11892d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean K(MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getActionMasked() != 0 && sourceEvent.getActionMasked() != 1 && sourceEvent.getActionMasked() != 6 && sourceEvent.getActionMasked() != 5) {
                if (sourceEvent.getActionMasked() != 2) {
                    int actionButton = sourceEvent.getActionButton();
                    int i7 = this.J;
                    if (i7 != 0 ? (actionButton & i7) != 0 : actionButton == 1) {
                    }
                }
                if (sourceEvent.getActionMasked() == 2) {
                    int buttonState = sourceEvent.getButtonState();
                    int i10 = this.J;
                    if (i10 != 0 ? (buttonState & i10) == 0 : buttonState != 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void L(int i7) {
        int[] iArr = this.f11889a;
        if (iArr[i7] != -1) {
            return;
        }
        int i10 = 0;
        while (i10 < this.f11890b) {
            int i11 = 0;
            while (i11 < iArr.length && iArr[i11] != i10) {
                i11++;
            }
            if (i11 == iArr.length) {
                break;
            } else {
                i10++;
            }
        }
        iArr[i7] = i10;
        this.f11890b++;
    }

    public void a(boolean z5) {
        if (!this.A || z5) {
            int i7 = this.f11896h;
            if (i7 == 0 || i7 == 2) {
                v(4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    public final MotionEvent b(MotionEvent event) throws d {
        int actionIndex;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerProperties[] pointerPropertiesArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        int pointerCount = event.getPointerCount();
        int i7 = this.f11890b;
        int[] iArr = this.f11889a;
        if (pointerCount == i7) {
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                if (i11 == -1 || i11 == i10) {
                }
            }
            return event;
        }
        int actionMasked = event.getActionMasked();
        int i12 = 2;
        if (actionMasked == 0) {
            actionIndex = event.getActionIndex();
            if (iArr[event.getPointerId(actionIndex)] != -1) {
                if (this.f11890b == 1) {
                    i12 = 0;
                } else {
                    i12 = 5;
                }
            }
        } else if (actionMasked == 1) {
            actionIndex = event.getActionIndex();
            if (iArr[event.getPointerId(actionIndex)] != -1) {
                if (this.f11890b == 1) {
                    i12 = 1;
                } else {
                    i12 = 6;
                }
            }
        } else if (actionMasked == 5) {
            actionIndex = event.getActionIndex();
            if (iArr[event.getPointerId(actionIndex)] != -1) {
                if (this.f11890b == 1) {
                    i12 = 0;
                } else {
                    i12 = 5;
                }
            }
        } else if (actionMasked != 6) {
            i12 = actionMasked;
            actionIndex = -1;
        } else {
            actionIndex = event.getActionIndex();
            if (iArr[event.getPointerId(actionIndex)] != -1) {
                if (this.f11890b == 1) {
                    i12 = 1;
                } else {
                    i12 = 6;
                }
            }
        }
        int i13 = this.f11890b;
        if (O == null) {
            O = new MotionEvent.PointerProperties[17];
            P = new MotionEvent.PointerCoords[17];
        }
        while (true) {
            pointerPropertiesArr = null;
            MotionEvent.PointerCoords[] pointerCoordsArr2 = null;
            if (i13 <= 0) {
                break;
            }
            MotionEvent.PointerProperties[] pointerPropertiesArr3 = O;
            if (pointerPropertiesArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                pointerPropertiesArr3 = null;
            }
            int i14 = i13 - 1;
            if (pointerPropertiesArr3[i14] != null) {
                break;
            }
            MotionEvent.PointerProperties[] pointerPropertiesArr4 = O;
            if (pointerPropertiesArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                pointerPropertiesArr4 = null;
            }
            pointerPropertiesArr4[i14] = new MotionEvent.PointerProperties();
            MotionEvent.PointerCoords[] pointerCoordsArr3 = P;
            if (pointerCoordsArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
            } else {
                pointerCoordsArr2 = pointerCoordsArr3;
            }
            pointerCoordsArr2[i14] = new MotionEvent.PointerCoords();
            i13--;
        }
        float rawX = event.getRawX() - event.getX();
        float rawY = event.getRawY() - event.getY();
        event.offsetLocation(rawX, rawY);
        int pointerCount2 = event.getPointerCount();
        int i15 = i12;
        int i16 = 0;
        for (int i17 = 0; i17 < pointerCount2; i17++) {
            int pointerId = event.getPointerId(i17);
            if (iArr[pointerId] != -1) {
                MotionEvent.PointerProperties[] pointerPropertiesArr5 = O;
                if (pointerPropertiesArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr5 = null;
                }
                event.getPointerProperties(i17, pointerPropertiesArr5[i16]);
                MotionEvent.PointerProperties[] pointerPropertiesArr6 = O;
                if (pointerPropertiesArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr6 = null;
                }
                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr6[i16];
                Intrinsics.checkNotNull(pointerProperties);
                pointerProperties.id = iArr[pointerId];
                MotionEvent.PointerCoords[] pointerCoordsArr4 = P;
                if (pointerCoordsArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                    pointerCoordsArr4 = null;
                }
                event.getPointerCoords(i17, pointerCoordsArr4[i16]);
                if (i17 == actionIndex) {
                    i15 |= i16 << 8;
                }
                i16++;
            }
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr7 = O;
        if (pointerPropertiesArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
            pointerPropertiesArr7 = null;
        }
        if (pointerPropertiesArr7.length != 0) {
            MotionEvent.PointerCoords[] pointerCoordsArr5 = P;
            if (pointerCoordsArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                pointerCoordsArr5 = null;
            }
            if (pointerCoordsArr5.length != 0) {
                try {
                    long downTime = event.getDownTime();
                    long eventTime = event.getEventTime();
                    MotionEvent.PointerProperties[] pointerPropertiesArr8 = O;
                    if (pointerPropertiesArr8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                        pointerPropertiesArr2 = null;
                    } else {
                        pointerPropertiesArr2 = pointerPropertiesArr8;
                    }
                    MotionEvent.PointerCoords[] pointerCoordsArr6 = P;
                    if (pointerCoordsArr6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                        pointerCoordsArr = null;
                    } else {
                        pointerCoordsArr = pointerCoordsArr6;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(downTime, eventTime, i15, i16, pointerPropertiesArr2, pointerCoordsArr, event.getMetaState(), event.getButtonState(), event.getXPrecision(), event.getYPrecision(), event.getDeviceId(), event.getEdgeFlags(), event.getSource(), event.getFlags());
                    Intrinsics.checkNotNullExpressionValue(motionEventObtain, "obtain(...)");
                    float f2 = -rawX;
                    float f7 = -rawY;
                    event.offsetLocation(f2, f7);
                    motionEventObtain.offsetLocation(f2, f7);
                    return motionEventObtain;
                } catch (IllegalArgumentException e10) {
                    Intrinsics.checkNotNullParameter(this, "handler");
                    Intrinsics.checkNotNullParameter(event, "event");
                    Intrinsics.checkNotNullParameter(e10, "e");
                    String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
                    int i18 = this.f11896h;
                    View view = this.f11894f;
                    g gVar = this.F;
                    boolean z5 = this.f11898l;
                    boolean z6 = this.L;
                    boolean z7 = this.M;
                    int i19 = this.f11890b;
                    String strY = kotlin.collections.y.y(62, iArr);
                    StringBuilder sbT = a3.e.t("\n    handler: ", simpleName, "\n    state: ", i18, "\n    view: ");
                    sbT.append(view);
                    sbT.append("\n    orchestrator: ");
                    sbT.append(gVar);
                    sbT.append("\n    isEnabled: ");
                    a3.e.B(sbT, z5, "\n    isActive: ", z6, "\n    isAwaiting: ");
                    sbT.append(z7);
                    sbT.append("\n    trackedPointersCount: ");
                    sbT.append(i19);
                    sbT.append("\n    trackedPointers: ");
                    sbT.append(strY);
                    sbT.append("\n    while handling event: ");
                    sbT.append(event);
                    sbT.append("\n      ");
                    throw new d(kotlin.text.r.b(sbT.toString()), e10);
                }
            }
        }
        MotionEvent.PointerCoords[] pointerCoordsArr7 = P;
        if (pointerCoordsArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
            pointerCoordsArr7 = null;
        }
        int length2 = pointerCoordsArr7.length;
        MotionEvent.PointerProperties[] pointerPropertiesArr9 = O;
        if (pointerPropertiesArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
        } else {
            pointerPropertiesArr = pointerPropertiesArr9;
        }
        throw new IllegalStateException(a3.e.g(length2, pointerPropertiesArr.length, "pointerCoords.size=", ", pointerProps.size="));
    }

    public final void c(e eVar) {
        if (this.f11900n == null) {
            this.f11900n = Arguments.createArray();
        }
        WritableArray writableArray = this.f11900n;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(f(eVar));
    }

    public final void d() {
        if (this.f11896h == 0) {
            v(2);
        }
    }

    public final void e() {
        int i7 = this.f11896h;
        if (i7 == 4 || i7 == 0 || i7 == 2 || this.M) {
            w();
            v(3);
        }
    }

    public void g(MotionEvent event) {
        com.facebook.imagepipeline.nativecode.c cVar;
        Intrinsics.checkNotNullParameter(event, "event");
        r rVar = this.G;
        if (rVar != null) {
            km.c cVar2 = (km.c) rVar;
            Intrinsics.checkNotNullParameter(this, "handler");
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f11892d < 0 || this.f11896h != 4) {
                return;
            }
            Intrinsics.checkNotNullParameter(this, "handler");
            int i7 = 0;
            while (true) {
                if (i7 >= 9) {
                    cVar = null;
                    break;
                }
                cVar = jm.h.f13952a[i7];
                if (Intrinsics.areEqual(cVar.y(), getClass())) {
                    break;
                } else {
                    i7++;
                }
            }
            if (cVar == null) {
                return;
            }
            int i10 = this.f11899m;
            switch (i10) {
                case 1:
                    Pools$SynchronizedPool pools$SynchronizedPool = km.b.f14586w;
                    cVar2.b(e4.f.l0(this, i10, cVar.p(this), km.a.f14582d));
                    break;
                case 2:
                    Pools$SynchronizedPool pools$SynchronizedPool2 = km.b.f14586w;
                    km.b event2 = e4.f.l0(this, i10, cVar.p(this), km.a.f14584i);
                    ReactApplicationContext reactApplicationContext = cVar2.f14591a;
                    Intrinsics.checkNotNullParameter(reactApplicationContext, "<this>");
                    Intrinsics.checkNotNullParameter(event2, "event");
                    UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, 2);
                    Intrinsics.checkNotNull(uIManager, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
                    ((FabricUIManager) uIManager).getEventDispatcher().dispatchEvent(event2);
                    break;
                case 3:
                    Pools$SynchronizedPool pools$SynchronizedPool3 = km.b.f14586w;
                    cVar2.a("onGestureHandlerEvent", e4.f.t(cVar.p(this)));
                    break;
                case 4:
                    Pools$SynchronizedPool pools$SynchronizedPool4 = km.b.f14586w;
                    cVar2.a("onGestureHandlerEvent", e4.f.t(cVar.p(this)));
                    break;
                case 5:
                case 6:
                    km.a aVar = this.f11906t ? km.a.f14584i : this.f11907u ? km.a.f14583e : km.a.f14582d;
                    Pools$SynchronizedPool pools$SynchronizedPool5 = km.b.f14586w;
                    km.b bVarL0 = e4.f.l0(this, i10, cVar.p(this), aVar);
                    jm.f fVar = this.f11895g;
                    if (fVar != null) {
                        fVar.g(bVarL0);
                    }
                    break;
            }
        }
    }

    public void h(int i7, int i10) {
        com.facebook.imagepipeline.nativecode.c cVar;
        r rVar = this.G;
        if (rVar != null) {
            km.c cVar2 = (km.c) rVar;
            Intrinsics.checkNotNullParameter(this, "handler");
            if (this.f11892d < 0) {
                return;
            }
            Intrinsics.checkNotNullParameter(this, "handler");
            int i11 = 0;
            while (true) {
                if (i11 >= 9) {
                    cVar = null;
                    break;
                }
                cVar = jm.h.f13952a[i11];
                if (Intrinsics.areEqual(cVar.y(), getClass())) {
                    break;
                } else {
                    i11++;
                }
            }
            if (cVar == null) {
                return;
            }
            int i12 = this.f11899m;
            switch (i12) {
                case 1:
                    Pools$SynchronizedPool pools$SynchronizedPool = km.d.E;
                    cVar2.b(gn.h.I(this, i7, i10, i12, cVar.p(this), km.a.f14582d));
                    break;
                case 2:
                case 3:
                    Pools$SynchronizedPool pools$SynchronizedPool2 = km.d.E;
                    cVar2.a("onGestureHandlerStateChange", gn.h.n(cVar.p(this), i7, i10));
                    break;
                case 4:
                    Pools$SynchronizedPool pools$SynchronizedPool3 = km.d.E;
                    cVar2.a("onGestureHandlerStateChange", gn.h.n(cVar.p(this), i7, i10));
                    break;
                case 5:
                case 6:
                    km.a aVar = this.f11907u ? km.a.f14583e : km.a.f14582d;
                    Pools$SynchronizedPool pools$SynchronizedPool4 = km.d.E;
                    km.d dVarI = gn.h.I(this, i7, i10, i12, cVar.p(this), aVar);
                    jm.f fVar = this.f11895g;
                    if (fVar != null) {
                        fVar.g(dVarI);
                    }
                    break;
            }
        }
    }

    public final void i() {
        r rVar;
        if (this.f11900n == null || (rVar = this.G) == null) {
            return;
        }
        km.c cVar = (km.c) rVar;
        Intrinsics.checkNotNullParameter(this, "handler");
        if (this.f11892d < 0) {
            return;
        }
        int i7 = this.f11896h;
        if (i7 == 2 || i7 == 4 || i7 == 0 || this.f11894f != null) {
            int i10 = this.f11899m;
            if (i10 == 1) {
                Pools$SynchronizedPool pools$SynchronizedPool = km.e.f14598w;
                cVar.b(ib.a.B(this, i10, km.a.f14582d));
                return;
            }
            if (i10 == 4) {
                Pools$SynchronizedPool pools$SynchronizedPool2 = km.e.f14598w;
                cVar.a("onGestureHandlerEvent", ib.a.n(this));
            } else if (i10 == 5 || i10 == 6) {
                km.a aVar = this.f11907u ? km.a.f14583e : km.a.f14582d;
                Pools$SynchronizedPool pools$SynchronizedPool3 = km.e.f14598w;
                km.e eVarB = ib.a.B(this, i10, aVar);
                jm.f fVar = this.f11895g;
                if (fVar != null) {
                    fVar.g(eVarB);
                }
            }
        }
    }

    public final void j(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f11900n = null;
        this.f11902p = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i7 = 0;
        for (int i10 = 0; i10 < pointerCount; i10++) {
            e eVar = this.f11904r[motionEvent.getPointerId(i10)];
            if (eVar != null && (eVar.f11885b != motionEvent.getX(i10) || eVar.f11886c != motionEvent.getY(i10))) {
                eVar.f11885b = motionEvent.getX(i10);
                eVar.f11886c = motionEvent.getY(i10);
                float x5 = motionEvent2.getX(i10) + rawX;
                int[] iArr = this.f11891c;
                eVar.f11887d = x5 - iArr[0];
                eVar.f11888e = (motionEvent2.getY(i10) + rawY) - iArr[1];
                c(eVar);
                i7++;
            }
        }
        if (i7 > 0) {
            l();
            i();
        }
    }

    public final void k() {
        int i7 = this.f11896h;
        if (i7 == 2 || i7 == 4) {
            v(5);
        }
    }

    public final void l() {
        this.f11901o = null;
        for (e eVar : this.f11904r) {
            if (eVar != null) {
                if (this.f11901o == null) {
                    this.f11901o = Arguments.createArray();
                }
                WritableArray writableArray = this.f11901o;
                Intrinsics.checkNotNull(writableArray);
                writableArray.pushMap(f(eVar));
            }
        }
    }

    public final void m() {
        int i7 = this.f11896h;
        if (i7 == 4 || i7 == 0 || i7 == 2) {
            x();
            v(1);
        }
    }

    public final View o() {
        View view = this.f11894f;
        if (!(view instanceof jm.f)) {
            return view;
        }
        jm.f fVar = (jm.f) view;
        return fVar.getChildCount() == 1 ? fVar.getChildAt(0) : view;
    }

    public final float p() {
        return (this.f11911y + this.B) - this.f11891c[0];
    }

    public final float q() {
        return (this.f11912z + this.C) - this.f11891c[1];
    }

    public final View r() {
        int i7 = this.f11899m;
        if (i7 == 5 || i7 == 6) {
            jm.f fVar = this.f11895g;
            Intrinsics.checkNotNull(fVar);
            return fVar;
        }
        View view = this.f11894f;
        Intrinsics.checkNotNull(view);
        return view;
    }

    public final boolean s(f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int[] iArr = this.f11889a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (iArr[i7] != -1 && other.f11889a[i7] != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        return false;
    }

    public final String toString() {
        String simpleName = this.f11893e;
        if (simpleName == null) {
            View view = this.f11894f;
            simpleName = view != null ? view.getClass().getSimpleName() : null;
        }
        return getClass().getSimpleName() + "@[" + this.f11892d + "]:" + simpleName;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:84:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0146 A[RETURN] */
    public final boolean u(float f2, float f7, View view) {
        SvgView svgView;
        boolean z5;
        float f10;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z6 = view instanceof VirtualView;
        if (!z6 && !(view instanceof SvgView)) {
            float width = view.getWidth();
            float height = view.getHeight();
            float[] fArr = this.f11909w;
            float f11 = 0.0f;
            if (fArr != null) {
                float f12 = fArr[0];
                float f13 = fArr[1];
                float f14 = fArr[2];
                float f15 = fArr[3];
                float f16 = !Float.isNaN(f12) ? 0.0f - f12 : 0.0f;
                f11 = Float.isNaN(f13) ? 0.0f : 0.0f - f13;
                if (!Float.isNaN(f14)) {
                    width += f14;
                }
                if (!Float.isNaN(f15)) {
                    height += f15;
                }
                float f17 = fArr[4];
                float f18 = fArr[5];
                if (!Float.isNaN(f17)) {
                    if (Float.isNaN(f12)) {
                        f16 = width - f17;
                    } else if (Float.isNaN(f14)) {
                        width = f17 + f16;
                    }
                }
                if (!Float.isNaN(f18)) {
                    if (Float.isNaN(f13)) {
                        f11 = height - f18;
                    } else if (Float.isNaN(f15)) {
                        height = f18 + f11;
                    }
                }
                f10 = f11;
                f11 = f16;
            } else {
                f10 = 0.0f;
            }
            if (f11 > f2 || f2 > width || f10 > f7 || f7 > height) {
                return false;
            }
            return true;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        if (z6) {
            svgView = ((VirtualView) view).getSvgView();
            Intrinsics.checkNotNull(svgView);
        } else {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
            svgView = (SvgView) view;
        }
        while (true) {
            ViewParent view2 = svgView.getParent();
            Intrinsics.checkNotNullExpressionValue(view2, "getParent(...)");
            Intrinsics.checkNotNullParameter(view2, "view");
            if (!(view2 instanceof VirtualView) && !(view2 instanceof SvgView)) {
                break;
            }
            if (svgView.getParent() instanceof VirtualView) {
                ViewParent parent = svgView.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type com.horcrux.svg.VirtualView");
                svgView = ((VirtualView) parent).getSvgView();
                Intrinsics.checkNotNull(svgView);
            } else {
                ViewParent parent2 = svgView.getParent();
                Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                svgView = (SvgView) parent2;
            }
        }
        int[] iArr = {0, 0};
        int[] iArr2 = {0, 0};
        view.getLocationOnScreen(iArr);
        svgView.getLocationOnScreen(iArr2);
        int iReactTagForTouch = svgView.reactTagForTouch((iArr[0] + f2) - iArr2[0], (iArr[1] + f7) - iArr2[1]);
        boolean z7 = view.getId() == iReactTagForTouch;
        double width2 = view.getWidth();
        double d6 = f2;
        if (0.0d > d6 || d6 > width2) {
            z5 = false;
        } else {
            double height2 = view.getHeight();
            double d7 = f7;
            if (0.0d > d7 || d7 > height2) {
                z5 = false;
            } else {
                z5 = true;
            }
        }
        if (!(view instanceof SvgView)) {
            if (z7 && z5) {
                return true;
            }
            return false;
        }
        xq.s sVarN = xq.r.n(new x0((ViewGroup) view), new f6.a(10));
        Integer numValueOf = Integer.valueOf(iReactTagForTouch);
        Intrinsics.checkNotNullParameter(sVarN, "<this>");
        boolean z10 = xq.r.l(sVarN, numValueOf) >= 0;
        if ((z7 || z10) && z5) {
            return true;
        }
        return false;
    }

    public final void v(int i7) {
        UiThreadUtil.assertOnUiThread();
        if (this.f11896h == i7) {
            return;
        }
        if (this.f11903q > 0 && (i7 == 5 || i7 == 3 || i7 == 1)) {
            this.f11902p = 4;
            this.f11900n = null;
            l();
            e[] eVarArr = this.f11904r;
            for (e eVar : eVarArr) {
                if (eVar != null) {
                    c(eVar);
                }
            }
            this.f11903q = 0;
            kotlin.collections.w.k(eVarArr, null, 0, eVarArr.length);
            i();
        }
        int i10 = this.f11896h;
        this.f11896h = i7;
        if (i7 == 4) {
            short s2 = Q;
            Q = (short) (s2 + 1);
            this.f11910x = s2;
        }
        jm.f fVar = this.f11895g;
        if (fVar == null && this.F == null) {
            throw new IllegalStateException("Manually handled gesture had not been assigned to any detector");
        }
        if (this.F == null && fVar != null) {
            fVar.h(this);
        }
        g gVar = this.F;
        Intrinsics.checkNotNull(gVar);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "handler");
        gVar.f11928m++;
        PointF pointF = g.f11913p;
        if (vi.d.e(i7)) {
            for (f fVar2 : CollectionsKt.i0(gVar.f11924g)) {
                if (vi.d.h(fVar2, this) && gVar.k.contains(Integer.valueOf(fVar2.f11892d))) {
                    if (i7 == 5) {
                        fVar2.e();
                        if (fVar2.f11896h == 5) {
                            fVar2.h(3, 2);
                        }
                        fVar2.M = false;
                    } else {
                        gVar.n(fVar2);
                    }
                }
            }
            gVar.a();
        }
        if (i7 == 4) {
            gVar.n(this);
        } else if (i10 == 4 || i10 == 5) {
            if (this.L) {
                h(i7, i10);
            } else if (i7 == 3 || i7 == 1) {
                h(i7, 2);
            }
        } else if (i10 != 0 || i7 != 3) {
            h(i7, i10);
        }
        int i11 = gVar.f11928m - 1;
        gVar.f11928m = i11;
        if (gVar.f11927l || i11 != 0) {
            gVar.f11929n = true;
        } else {
            gVar.b();
        }
        C();
    }

    public abstract void y(MotionEvent motionEvent, MotionEvent motionEvent2);

    public void z(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
    }

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }

    public void E() {
    }

    public void w() {
    }

    public void x() {
    }
}
