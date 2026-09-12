package a5;

import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f2;
import androidx.lifecycle.Observer;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements n.u, m8.a, bh.s, Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f214e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f215i;

    public /* synthetic */ i0(int i7, byte b10) {
        this.f213d = i7;
    }

    @Override // m8.a
    public void a(File file) {
        j8.b bVar;
        j8.j jVarH;
        if (this.f214e && (jVarH = j8.b.h((bVar = (j8.b) this.f215i), file)) != null) {
            String str = (String) jVarH.f13707e;
            if (str != ".tmp") {
                n8.i.e(str == ".cnt");
                return;
            }
            long jLastModified = file.lastModified();
            bVar.f13676e.getClass();
            if (jLastModified > System.currentTimeMillis() - j8.b.f13670f) {
                return;
            }
        }
        file.delete();
    }

    @Override // n.u
    public void b(n.j jVar, boolean z5) {
        androidx.appcompat.widget.n nVar;
        i.e0 e0Var = (i.e0) this.f215i;
        if (this.f214e) {
            return;
        }
        this.f214e = true;
        ActionMenuView actionMenuView = e0Var.f11200a.f1164a.f865d;
        if (actionMenuView != null && (nVar = actionMenuView.Q) != null) {
            nVar.l();
            androidx.appcompat.widget.h hVar = nVar.R;
            if (hVar != null && hVar.b()) {
                hVar.f16210i.dismiss();
            }
        }
        e0Var.f11201b.onPanelClosed(108, jVar);
        this.f214e = false;
    }

    @Override // m8.a
    public void c(File file) {
        if (this.f214e || !file.equals(((j8.b) this.f215i).f13674c)) {
            return;
        }
        this.f214e = true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    @Override // bh.s
    public WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat, bh.t tVar) {
        boolean z5;
        f2 f2Var = windowInsetsCompat.f1605a;
        Insets insetsF = f2Var.f(519);
        Insets insetsF2 = f2Var.f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f215i;
        boolean z6 = bottomSheetBehavior.f6288o;
        int i7 = insetsF.f1557b;
        int i10 = insetsF.f1558c;
        int i11 = insetsF.f1556a;
        bottomSheetBehavior.f6296w = i7;
        boolean z7 = true;
        boolean z10 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (z6) {
            int iA = windowInsetsCompat.a();
            bottomSheetBehavior.f6295v = iA;
            paddingBottom = iA + tVar.f3304e;
        }
        if (bottomSheetBehavior.f6289p) {
            paddingLeft = (z10 ? tVar.f3303d : tVar.f3301b) + i11;
        }
        if (bottomSheetBehavior.f6290q) {
            paddingRight = (z10 ? tVar.f3301b : tVar.f3303d) + i10;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f6292s || marginLayoutParams.leftMargin == i11) {
            z5 = false;
        } else {
            marginLayoutParams.leftMargin = i11;
            z5 = true;
        }
        if (bottomSheetBehavior.f6293t && marginLayoutParams.rightMargin != i10) {
            marginLayoutParams.rightMargin = i10;
            z5 = true;
        }
        if (bottomSheetBehavior.f6294u) {
            int i12 = marginLayoutParams.topMargin;
            int i13 = insetsF.f1557b;
            if (i12 != i13) {
                marginLayoutParams.topMargin = i13;
            } else {
                z7 = z5;
            }
        } else {
            z7 = z5;
        }
        if (z7) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z11 = this.f214e;
        if (z11) {
            bottomSheetBehavior.f6286m = insetsF2.f1559d;
        }
        if (!z6 && !z11) {
            return windowInsetsCompat;
        }
        bottomSheetBehavior.N();
        return windowInsetsCompat;
    }

    @Override // m8.a
    public void e(File file) {
        j8.b bVar = (j8.b) this.f215i;
        if (!bVar.f13672a.equals(file) && !this.f214e) {
            file.delete();
        }
        if (this.f214e && file.equals(bVar.f13674c)) {
            this.f214e = false;
        }
    }

    @Override // n.u
    public boolean f(n.j jVar) {
        ((i.e0) this.f215i).f11201b.onMenuOpened(108, jVar);
        return true;
    }

    public void g(int i7) {
        je.b.k(!this.f214e);
        ((SparseBooleanArray) this.f215i).append(i7, true);
    }

    public synchronized void h() {
        while (!this.f214e) {
            wait();
        }
    }

    public synchronized boolean i(long j) {
        try {
            if (j <= 0) {
                return this.f214e;
            }
            ((je.y) this.f215i).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j5 = j + jElapsedRealtime;
            if (j5 < jElapsedRealtime) {
                h();
            } else {
                while (!this.f214e && jElapsedRealtime < j5) {
                    wait(j5 - jElapsedRealtime);
                    ((je.y) this.f215i).getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
            }
            return this.f214e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void j() {
        boolean z5 = false;
        while (!this.f214e) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z5 = true;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    public je.g k() {
        je.b.k(!this.f214e);
        this.f214e = true;
        return new je.g((SparseBooleanArray) this.f215i);
    }

    public synchronized void l() {
        this.f214e = false;
    }

    public boolean m() {
        return this.f214e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    public boolean n(int i7, CharSequence charSequence) {
        if (charSequence == null || i7 < 0 || charSequence.length() - i7 < 0) {
            throw new IllegalArgumentException();
        }
        j1.c cVar = (j1.c) this.f215i;
        if (cVar == null) {
            return m();
        }
        cVar.getClass();
        char c8 = 0;
        c8 = 2;
        for (int i10 = 0; i10 < i7 && c8 == 2; i10++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i10));
            i0 i0Var = j1.d.f13608a;
            if (directionality == 0) {
                c8 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c8 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c8 = 2;
                        continue;
                }
            }
        }
        if (c8 == 0) {
            return true;
        }
        if (c8 != 1) {
            return m();
        }
        return false;
    }

    public void o() {
        this.f214e = false;
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(Object obj) {
        this.f214e = true;
        po.d dVar = (po.d) this.f215i;
        dVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) dVar.f18079e;
        signInHubActivity.setResult(signInHubActivity.f5918w, signInHubActivity.f5919x);
        signInHubActivity.finish();
    }

    public synchronized boolean p() {
        if (this.f214e) {
            return false;
        }
        this.f214e = true;
        notifyAll();
        return true;
    }

    public void q(byte b10) {
        ((b0) this.f215i).H(String.valueOf(b10));
    }

    public void r(char c8) {
        b0 b0Var = (b0) this.f215i;
        b0Var.q(b0Var.f173e, 1);
        char[] cArr = (char[]) b0Var.f174i;
        int i7 = b0Var.f173e;
        b0Var.f173e = i7 + 1;
        cArr[i7] = c8;
    }

    public void s(int i7) {
        ((b0) this.f215i).H(String.valueOf(i7));
    }

    public void t(long j) {
        ((b0) this.f215i).H(String.valueOf(j));
    }

    public String toString() {
        switch (this.f213d) {
            case 8:
                return this.f214e ? "FALL_THROUGH" : String.valueOf(this.f215i);
            case 12:
                return ((po.d) this.f215i).toString();
            default:
                return super.toString();
        }
    }

    public void u(String v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
        ((b0) this.f215i).H(v6);
    }

    public void v(short s2) {
        ((b0) this.f215i).H(String.valueOf(s2));
    }

    public void w(String text) {
        byte b10;
        Intrinsics.checkNotNullParameter(text, "value");
        b0 b0Var = (b0) this.f215i;
        Intrinsics.checkNotNullParameter(text, "text");
        b0Var.q(b0Var.f173e, text.length() + 2);
        char[] cArr = (char[]) b0Var.f174i;
        int i7 = b0Var.f173e;
        int i10 = i7 + 1;
        cArr[i7] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c8 = cArr[i12];
            byte[] bArr = qr.c0.f19001b;
            if (c8 < bArr.length && bArr[c8] != 0) {
                int length2 = text.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    b0Var.q(i12, 2);
                    char cCharAt = text.charAt(i13);
                    byte[] bArr2 = qr.c0.f19001b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i14 = i12 + 1;
                        ((char[]) b0Var.f174i)[i12] = cCharAt;
                        i12 = i14;
                    } else if (b10 == 1) {
                        String str = qr.c0.f19000a[cCharAt];
                        Intrinsics.checkNotNull(str);
                        b0Var.q(i12, str.length());
                        str.getChars(0, str.length(), (char[]) b0Var.f174i, i12);
                        int length3 = str.length() + i12;
                        b0Var.f173e = length3;
                        i12 = length3;
                    } else {
                        char[] cArr2 = (char[]) b0Var.f174i;
                        cArr2[i12] = '\\';
                        cArr2[i12 + 1] = (char) b10;
                        i12 += 2;
                        b0Var.f173e = i12;
                    }
                }
                b0Var.q(i12, 1);
                ((char[]) b0Var.f174i)[i12] = '\"';
                b0Var.f173e = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        b0Var.f173e = i11 + 1;
    }

    public void z(k4 k4Var) {
        if (this.f214e) {
            com.google.android.gms.internal.play_billing.r.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((o9.c) this.f215i).c(new sb.a(k4Var, null));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.r.h("BillingLogger", "logging failed.");
        }
    }

    public /* synthetic */ i0(int i7, Object obj) {
        this.f213d = i7;
        this.f215i = obj;
    }

    public /* synthetic */ i0(Object obj, boolean z5, int i7) {
        this.f213d = i7;
        this.f215i = obj;
        this.f214e = z5;
    }

    public i0(b0 writer) {
        this.f213d = 10;
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f215i = writer;
        this.f214e = true;
    }

    public i0() {
        this.f213d = 7;
        this.f215i = new SparseBooleanArray();
    }

    public i0(int i7) {
        this.f213d = 6;
        this.f215i = je.y.f13866a;
    }

    public i0(String[] strArr, boolean z5) {
        this.f213d = 2;
        this.f214e = z5;
        this.f215i = strArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(j1.c cVar, boolean z5) {
        this(4, cVar);
        this.f213d = 4;
        this.f214e = z5;
    }

    public i0(List descriptors, boolean z5) {
        this.f213d = 3;
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        this.f215i = descriptors;
        this.f214e = z5;
    }

    public i0(ue.d dVar, po.d dVar2) {
        this.f213d = 12;
        this.f214e = false;
        this.f215i = dVar2;
    }

    public void x() {
    }

    public void y() {
    }
}
