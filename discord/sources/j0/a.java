package j0;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ar.b0;
import ar.k0;
import com.margelo.nitro.rive.o0;
import fr.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0 {
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final a O;
    public static final a P;
    public static final a Q;
    public static final a R;
    public static final a S;
    public static final a T;
    public static final a U;
    public static final a V;
    public static final a W;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13576e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f13577i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f13578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f13579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f13580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f13581y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13582d;

    static {
        int i7 = 0;
        f13576e = new a(i7, 0);
        f13577i = new a(i7, 1);
        f13578v = new a(i7, 2);
        f13579w = new a(i7, 3);
        f13580x = new a(i7, 4);
        f13581y = new a(i7, 5);
        E = new a(i7, 6);
        F = new a(i7, 7);
        G = new a(i7, 8);
        H = new a(i7, 9);
        I = new a(i7, 10);
        J = new a(i7, 11);
        K = new a(i7, 12);
        L = new a(i7, 13);
        M = new a(i7, 14);
        N = new a(i7, 15);
        O = new a(i7, 16);
        P = new a(i7, 17);
        Q = new a(i7, 18);
        R = new a(i7, 19);
        S = new a(i7, 20);
        T = new a(i7, 21);
        U = new a(i7, 22);
        V = new a(i7, 23);
        W = new a(i7, 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i10) {
        super(i7);
        this.f13582d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        Continuation continuation = null;
        switch (this.f13582d) {
            case 0:
                b.a("LocalConfiguration");
                throw null;
            case 1:
                b.a("LocalContext");
                throw null;
            case 2:
                b.a("LocalImageVectorCache");
                throw null;
            case 3:
                b.a("LocalLifecycleOwner");
                throw null;
            case 4:
                b.a("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                b.a("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    hr.e eVar = k0.f2938a;
                    choreographer = (Choreographer) b0.w(q.f9394a, new o0(2, continuation, 1));
                }
                Intrinsics.checkNotNullExpressionValue(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
                Handler handlerC = a.a.c(Looper.getMainLooper());
                Intrinsics.checkNotNullExpressionValue(handlerC, "createAsync(Looper.getMainLooper())");
                d dVar = new d(choreographer, handlerC);
                return kotlin.coroutines.e.c(dVar, dVar.I);
            case 7:
            case 8:
                return null;
            case 9:
                g.a("LocalAutofillTree");
                throw null;
            case 10:
                g.a("LocalClipboardManager");
                throw null;
            case 11:
                g.a("LocalDensity");
                throw null;
            case 12:
                g.a("LocalFocusManager");
                throw null;
            case 13:
                g.a("LocalFontFamilyResolver");
                throw null;
            case 14:
                g.a("LocalFontLoader");
                throw null;
            case 15:
                g.a("LocalHapticFeedback");
                throw null;
            case 16:
                g.a("LocalInputManager");
                throw null;
            case 17:
                g.a("LocalLayoutDirection");
                throw null;
            case 18:
                throw new IllegalStateException("No PlatformTextInputPluginRegistry provided");
            case 19:
            case 20:
                return null;
            case 21:
                g.a("LocalTextToolbar");
                throw null;
            case 22:
                g.a("LocalUriHandler");
                throw null;
            case 23:
                g.a("LocalViewConfiguration");
                throw null;
            default:
                g.a("LocalWindowInfo");
                throw null;
        }
    }
}
