package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.i2;
import androidx.appcompat.widget.j2;
import androidx.appcompat.widget.l2;
import androidx.appcompat.widget.t1;
import com.discord.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View K;
    public View L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean S;
    public u T;
    public ViewTreeObserver U;
    public PopupWindow.OnDismissListener V;
    public boolean W;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f16121e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16122i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f16123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f16124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f16125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f16126y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final i0 F = new i0(3, this);
    public final dl.i G = new dl.i(2, this);
    public final ue.i H = new ue.i(this);
    public int I = 0;
    public int J = 0;
    public boolean R = false;

    public d(Context context, View view, int i7, boolean z5) {
        this.f16121e = context;
        this.K = view;
        this.f16123v = i7;
        this.f16124w = z5;
        this.M = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f16122i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f16125x = new Handler();
    }

    @Override // n.v
    public final void a(boolean z5) {
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((c) it.next()).f16118a.f990i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // n.v
    public final void b(j jVar, boolean z5) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (jVar == ((c) arrayList.get(i7)).f16119b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i10 = i7 + 1;
        if (i10 < arrayList.size()) {
            ((c) arrayList.get(i10)).f16119b.c(false);
        }
        c cVar = (c) arrayList.remove(i7);
        j jVar2 = cVar.f16119b;
        l2 l2Var = cVar.f16118a;
        androidx.appcompat.widget.a0 a0Var = l2Var.W;
        jVar2.r(this);
        if (this.W) {
            i2.b(a0Var, null);
            a0Var.setAnimationStyle(0);
        }
        l2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.M = ((c) arrayList.get(size2 - 1)).f16120c;
        } else {
            this.M = this.K.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z5) {
                ((c) arrayList.get(0)).f16119b.c(false);
                return;
            }
            return;
        }
        dismiss();
        u uVar = this.T;
        if (uVar != null) {
            uVar.b(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.U;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.U.removeGlobalOnLayoutListener(this.F);
            }
            this.U = null;
        }
        this.L.removeOnAttachStateChangeListener(this.G);
        this.V.onDismiss();
    }

    @Override // n.v
    public final boolean d(b0 b0Var) {
        for (c cVar : this.E) {
            if (b0Var == cVar.f16119b) {
                cVar.f16118a.f990i.requestFocus();
                return true;
            }
        }
        if (!b0Var.hasVisibleItems()) {
            return false;
        }
        l(b0Var);
        u uVar = this.T;
        if (uVar != null) {
            uVar.f(b0Var);
        }
        return true;
    }

    @Override // n.z
    public final void dismiss() {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        if (size > 0) {
            c[] cVarArr = (c[]) arrayList.toArray(new c[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                c cVar = cVarArr[i7];
                if (cVar.f16118a.W.isShowing()) {
                    cVar.f16118a.dismiss();
                }
            }
        }
    }

    @Override // n.v
    public final boolean e() {
        return false;
    }

    @Override // n.z
    public final t1 g() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((c) kk.b.e(1, arrayList)).f16118a.f990i;
    }

    @Override // n.v
    public final Parcelable i() {
        return null;
    }

    @Override // n.z
    public final boolean isShowing() {
        ArrayList arrayList = this.E;
        return arrayList.size() > 0 && ((c) arrayList.get(0)).f16118a.W.isShowing();
    }

    @Override // n.v
    public final void j(u uVar) {
        this.T = uVar;
    }

    @Override // n.r
    public final void l(j jVar) {
        jVar.b(this, this.f16121e);
        if (isShowing()) {
            u(jVar);
        } else {
            this.f16126y.add(jVar);
        }
    }

    @Override // n.r
    public final void n(View view) {
        if (this.K != view) {
            this.K = view;
            this.J = Gravity.getAbsoluteGravity(this.I, view.getLayoutDirection());
        }
    }

    @Override // n.r
    public final void o(boolean z5) {
        this.R = z5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        c cVar;
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                cVar = null;
                break;
            }
            cVar = (c) arrayList.get(i7);
            if (!cVar.f16118a.W.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (cVar != null) {
            cVar.f16119b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // n.r
    public final void p(int i7) {
        if (this.I != i7) {
            this.I = i7;
            this.J = Gravity.getAbsoluteGravity(i7, this.K.getLayoutDirection());
        }
    }

    @Override // n.r
    public final void q(int i7) {
        this.N = true;
        this.P = i7;
    }

    @Override // n.r
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.V = onDismissListener;
    }

    @Override // n.r
    public final void s(boolean z5) {
        this.S = z5;
    }

    @Override // n.z
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f16126y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((j) it.next());
        }
        arrayList.clear();
        View view = this.K;
        this.L = view;
        if (view != null) {
            boolean z5 = this.U == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.U = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.F);
            }
            this.L.addOnAttachStateChangeListener(this.G);
        }
    }

    @Override // n.r
    public final void t(int i7) {
        this.O = true;
        this.Q = i7;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:101:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b  */
    /* JADX WARN: Code duplicated, block: B:75:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x017c  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc A[PHI: r5
      0x01bc: PHI (r5v17 int) = (r5v9 int), (r5v18 int) binds: [B:89:0x01be, B:87:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dc  */
    public final void u(j jVar) {
        boolean z5;
        int i7;
        c cVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i10;
        androidx.appcompat.widget.a0 a0Var;
        t1 t1Var;
        int[] iArr;
        Rect rect3;
        int i11;
        boolean z6;
        int[] iArr2;
        int[] iArr3;
        int i12;
        int i13;
        int width;
        Method method;
        MenuItem item;
        g gVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f16121e;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        g gVar2 = new g(jVar, layoutInflaterFrom, this.f16124w, R.layout.abc_cascading_menu_item_layout);
        if (!isShowing() && this.R) {
            gVar2.f16137i = true;
        } else if (isShowing()) {
            int size = jVar.f16147f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z5 = false;
                    break;
                }
                MenuItem item2 = jVar.getItem(i14);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z5 = true;
                    break;
                }
                i14++;
            }
            gVar2.f16137i = z5;
        }
        int iM = r.m(gVar2, context, this.f16122i);
        l2 l2Var = new l2(context, null, this.f16123v, 0);
        l2Var.Z = this.H;
        l2Var.M = this;
        l2Var.W.setOnDismissListener(this);
        l2Var.L = this.K;
        l2Var.I = this.J;
        l2Var.V = true;
        l2Var.W.setFocusable(true);
        l2Var.W.setInputMethodMode(2);
        l2Var.n(gVar2);
        l2Var.p(iM);
        l2Var.I = this.J;
        ArrayList arrayList = this.E;
        if (arrayList.size() > 0) {
            cVar = (c) kk.b.e(1, arrayList);
            j jVar2 = cVar.f16119b;
            int size2 = jVar2.f16147f.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    item = null;
                    break;
                }
                item = jVar2.getItem(i15);
                if (item.hasSubMenu() && jVar == item.getSubMenu()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (item == null) {
                i7 = 1;
                childAt = null;
            } else {
                t1 t1Var2 = cVar.f16118a.f990i;
                ListAdapter adapter = t1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (g) adapter;
                    headersCount = 0;
                }
                int count = gVar.getCount();
                i7 = 1;
                int i16 = 0;
                while (true) {
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else if (item == gVar.getItem(i16)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i16 != -1 && (firstVisiblePosition = (i16 + headersCount) - t1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < t1Var2.getChildCount()) {
                    childAt = t1Var2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i10 = Build.VERSION.SDK_INT;
                a0Var = l2Var.W;
                if (i10 <= 28) {
                    method = l2.a0;
                    if (method != null) {
                        try {
                            method.invoke(a0Var, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    j2.a(a0Var, false);
                }
                i2.a(l2Var.W, null);
                t1Var = ((c) arrayList.get(arrayList.size() - 1)).f16118a.f990i;
                iArr = new int[2];
                t1Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.L.getWindowVisibleDisplayFrame(rect3);
                if (this.M == i7) {
                    if (t1Var.getWidth() + iArr[0] + iM > rect3.right) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                } else if (iArr[0] - iM < 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i11 == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.M = i11;
                if (Build.VERSION.SDK_INT >= 26) {
                    l2Var.L = childAt;
                    i13 = 0;
                    i12 = 0;
                } else {
                    iArr2 = new int[2];
                    this.K.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.J & 7) == 5) {
                        iArr2[0] = this.K.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i12 = iArr3[0] - iArr2[0];
                    i13 = iArr3[1] - iArr2[1];
                }
                if ((this.J & 5) == 5) {
                    if (z6) {
                        width = i12 + iM;
                    } else {
                        iM = childAt.getWidth();
                        width = i12 - iM;
                    }
                } else if (z6) {
                    width = i12 + childAt.getWidth();
                } else {
                    width = i12 - iM;
                }
                l2Var.f993x = width;
                l2Var.H = true;
                l2Var.G = true;
                l2Var.i(i13);
            } else {
                if (this.N) {
                    l2Var.f993x = this.P;
                }
                if (this.O) {
                    l2Var.i(this.Q);
                }
                rect = this.f16200d;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                l2Var.U = rect2;
            }
            arrayList.add(new c(l2Var, jVar, this.M));
            l2Var.show();
            t1 t1Var3 = l2Var.f990i;
            t1Var3.setOnKeyListener(this);
            if (cVar == null || !this.S || jVar.f16152m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) t1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jVar.f16152m);
            t1Var3.addHeaderView(frameLayout, null, false);
            l2Var.show();
            return;
        }
        i7 = 1;
        cVar = null;
        childAt = null;
        if (childAt != null) {
            i10 = Build.VERSION.SDK_INT;
            a0Var = l2Var.W;
            if (i10 <= 28) {
                method = l2.a0;
                if (method != null) {
                    method.invoke(a0Var, Boolean.FALSE);
                }
            } else {
                j2.a(a0Var, false);
            }
            i2.a(l2Var.W, null);
            t1Var = ((c) arrayList.get(arrayList.size() - 1)).f16118a.f990i;
            iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.L.getWindowVisibleDisplayFrame(rect3);
            if (this.M == i7) {
                if (t1Var.getWidth() + iArr[0] + iM > rect3.right) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i11 == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.M = i11;
            if (Build.VERSION.SDK_INT >= 26) {
                l2Var.L = childAt;
                i13 = 0;
                i12 = 0;
            } else {
                iArr2 = new int[2];
                this.K.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.J & 7) == 5) {
                    iArr2[0] = this.K.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i12 = iArr3[0] - iArr2[0];
                i13 = iArr3[1] - iArr2[1];
            }
            if ((this.J & 5) == 5) {
                if (z6) {
                    width = i12 + iM;
                } else {
                    iM = childAt.getWidth();
                    width = i12 - iM;
                }
            } else if (z6) {
                width = i12 + childAt.getWidth();
            } else {
                width = i12 - iM;
            }
            l2Var.f993x = width;
            l2Var.H = true;
            l2Var.G = true;
            l2Var.i(i13);
        } else {
            if (this.N) {
                l2Var.f993x = this.P;
            }
            if (this.O) {
                l2Var.i(this.Q);
            }
            rect = this.f16200d;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            l2Var.U = rect2;
        }
        arrayList.add(new c(l2Var, jVar, this.M));
        l2Var.show();
        t1 t1Var4 = l2Var.f990i;
        t1Var4.setOnKeyListener(this);
        if (cVar == null) {
        }
    }

    @Override // n.v
    public final void f(Parcelable parcelable) {
    }
}
