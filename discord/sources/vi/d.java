package vi;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import bh.s;
import bh.t;
import ci.b0;
import ci.p;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.soloader.a0;
import com.facebook.soloader.g0;
import com.facebook.soloader.i0;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.regex.Pattern;
import jm.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import rn.u;
import sh.q;

/* JADX INFO: loaded from: classes3.dex */
public class d implements t2.b, kb.b, xr.g, s, q, qm.a, p, y2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21680d;

    public /* synthetic */ d(int i7, byte b10) {
        this.f21680d = i7;
    }

    public static final int b(ImageRequest imageRequest) {
        String path = imageRequest.getSourceUri().getPath();
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strSubstring = path.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Integer.parseInt(strSubstring);
    }

    public static final boolean e(int i7) {
        PointF pointF = im.g.f11913p;
        return i7 == 3 || i7 == 1 || i7 == 5;
    }

    public static final boolean f(im.f fVar, im.f fVar2) {
        PointF pointF = im.g.f11913p;
        if (!fVar.s(fVar2) || fVar == fVar2 || fVar.I(fVar2) || fVar2.I(fVar)) {
            return false;
        }
        if (fVar == fVar2) {
            return true;
        }
        if (fVar.M || fVar.f11896h == 4) {
            return fVar.G(fVar2);
        }
        return true;
    }

    public static final boolean h(im.f handler, im.f otherHandler) {
        i iVar;
        PointF pointF = im.g.f11913p;
        if (handler != otherHandler) {
            handler.getClass();
            Intrinsics.checkNotNullParameter(otherHandler, "handler");
            if (otherHandler != handler && (iVar = handler.H) != null) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
                int[] iArr = (int[]) iVar.f13953a.get(handler.f11892d);
                if (iArr != null) {
                    for (int i7 : iArr) {
                        if (i7 == otherHandler.f11892d) {
                            return true;
                        }
                    }
                }
            }
            if (otherHandler.J(handler)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean l(float[] fArr, View view) {
        PointF pointF = im.g.f11913p;
        return (!(view instanceof ViewGroup) || (view.getBackground() != null) || (view.getParent() instanceof jm.f)) && q(fArr[0], fArr[1], view);
    }

    public static final String m(int i7) {
        u uVar = BytesRange.f4806c;
        return i7 == Integer.MAX_VALUE ? "" : String.valueOf(i7);
    }

    public static BytesRange o(String str) {
        if (str == null) {
            return null;
        }
        try {
            Object value = BytesRange.f4806c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            String[] strArrSplit = ((Pattern) value).split(str);
            if (!(strArrSplit.length == 4)) {
                throw new IllegalArgumentException();
            }
            if (!Intrinsics.areEqual(strArrSplit[0], "bytes")) {
                throw new IllegalArgumentException();
            }
            String str2 = strArrSplit[1];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            int i7 = Integer.parseInt(str2);
            String str3 = strArrSplit[2];
            Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
            int i10 = Integer.parseInt(str3);
            String str4 = strArrSplit[3];
            Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
            int i11 = Integer.parseInt(str4);
            if (!(i10 > i7)) {
                throw new IllegalArgumentException();
            }
            if (i11 > i10) {
                return i10 < i11 - 1 ? new BytesRange(i7, i10) : new BytesRange(i7, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e10) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new IllegalArgumentException(a3.e.q(new Object[]{str}, 1, null, "Invalid Content-Range header value: \"%s\"", "format(...)"), e10);
        }
    }

    public static Path p(float f2, float f7, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f2, f7);
        path.lineTo(f10, f11);
        return path;
    }

    public static boolean q(float f2, float f7, View view) {
        return 0.0f <= f2 && f2 <= ((float) view.getWidth()) && 0.0f <= f7 && f7 <= ((float) view.getHeight());
    }

    public static void r(float f2, float f7, ViewGroup parent, View child, PointF outLocalPoint) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(outLocalPoint, "outLocalPoint");
        float scrollX = (f2 + parent.getScrollX()) - child.getLeft();
        float scrollY = (f7 + parent.getScrollY()) - child.getTop();
        Matrix matrix = child.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = im.g.f11914q;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = im.g.f11915r;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f10 = fArr[0];
            scrollY = fArr[1];
            scrollX = f10;
        }
        outLocalPoint.set(scrollX, scrollY);
    }

    public static final CharSequence s(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // ci.r
    public Object a() {
        switch (this.f21680d) {
            case 18:
                return new b0("IntegrityService");
            default:
                return new pa.s();
        }
    }

    @Override // bh.s
    public WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat, t tVar) {
        tVar.f3304e = windowInsetsCompat.a() + tVar.f3304e;
        boolean z5 = view.getLayoutDirection() == 1;
        int iB = windowInsetsCompat.b();
        int iC = windowInsetsCompat.c();
        int i7 = tVar.f3301b + (z5 ? iC : iB);
        tVar.f3301b = i7;
        int i10 = tVar.f3303d;
        if (!z5) {
            iB = iC;
        }
        int i11 = i10 + iB;
        tVar.f3303d = i11;
        view.setPaddingRelative(i7, tVar.f3302c, i11, tVar.f3304e);
        return windowInsetsCompat;
    }

    @Override // qm.a
    public String g() {
        return "onNativeDismissPrevented";
    }

    @Override // qm.a
    public String getEventName() {
        return "topNativeDismissPrevented";
    }

    @Override // kb.b
    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, com.facebook.soloader.b0[] b0VarArr) {
        if (!(unsatisfiedLinkError instanceof a0)) {
            return false;
        }
        Log.e("SoLoader", "Checking /data/data missing libraries.");
        boolean z5 = false;
        for (com.facebook.soloader.b0 b0Var : b0VarArr) {
            if ((b0Var instanceof i0) && !(b0Var instanceof com.facebook.soloader.b)) {
                i0 i0Var = (i0) b0Var;
                try {
                    for (g0 g0Var : i0Var.f()) {
                        File file = new File(i0Var.f5386a, g0Var.f5395d);
                        if (!file.exists()) {
                            file = null;
                        }
                        if (file == null) {
                            Log.e("SoLoader", "Missing " + g0Var.f5395d + " from " + i0Var.b() + ", will force prepare.");
                            i0Var.d(2);
                            z5 = true;
                            break;
                        }
                    }
                } catch (Exception e10) {
                    Log.e("SoLoader", "Encountered an exception while recovering from /data/data failure ", e10);
                    return false;
                }
            }
        }
        if (z5) {
            Log.e("SoLoader", "Successfully recovered from /data/data disk failure.");
            return true;
        }
        Log.e("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }

    public float n(float f2) {
        return 1.0f;
    }

    public d(int i7) {
        this.f21680d = 6;
        new LinkedHashSet(i7);
    }

    @Override // y2.b
    public void c() {
    }

    @Override // sh.q
    public int k(int i7) {
        return i7;
    }

    @Override // y2.b
    public void j(int i7, Object obj) {
    }
}
