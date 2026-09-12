package n;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.v0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f16141y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f16143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f16146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f16148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f16150i;
    public final ArrayList j;
    public boolean k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f16152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f16153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f16154o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l f16161v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16163x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16151l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16155p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16156q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16157r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16158s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f16159t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f16160u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16162w = false;

    public j(Context context) {
        boolean zW;
        boolean z5 = false;
        this.f16142a = context;
        Resources resources = context.getResources();
        this.f16143b = resources;
        this.f16147f = new ArrayList();
        this.f16148g = new ArrayList();
        this.f16149h = true;
        this.f16150i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = v0.f1735a;
            if (Build.VERSION.SDK_INT >= 28) {
                zW = androidx.core.view.h.w(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zW = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zW) {
                z5 = true;
            }
        }
        this.f16145d = z5;
    }

    public l a(int i7, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f16141y[i13] << 16) | (65535 & i11);
        l lVar = new l(this, i7, i10, i11, i14, charSequence, this.f16151l);
        ArrayList arrayList = this.f16147f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((l) arrayList.get(size)).f16170d <= i14) {
                i12 = size + 1;
                arrayList.add(i12, lVar);
                p(true);
                return lVar;
            }
        }
        i12 = 0;
        arrayList.add(i12, lVar);
        p(true);
        return lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f16142a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            l lVarA = a(i7, i10, i11, resolveInfo.loadLabel(packageManager));
            lVarA.setIcon(resolveInfo.loadIcon(packageManager));
            lVarA.f16173g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = lVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(v vVar, Context context) {
        this.f16160u.add(new WeakReference(vVar));
        vVar.c(context, this);
        this.k = true;
    }

    public final void c(boolean z5) {
        if (this.f16158s) {
            return;
        }
        this.f16158s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16160u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                vVar.b(this, z5);
            }
        }
        this.f16158s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        l lVar = this.f16161v;
        if (lVar != null) {
            d(lVar);
        }
        this.f16147f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f16153n = null;
        this.f16152m = null;
        this.f16154o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(l lVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16160u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f16161v == lVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                v vVar = (v) weakReference.get();
                if (vVar != null) {
                    zK = vVar.k(lVar);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zK) {
                this.f16161v = null;
            }
        }
        return zK;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        h hVar = this.f16146e;
        return hVar != null && hVar.o(jVar, menuItem);
    }

    public boolean f(l lVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16160u;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar != null) {
                zH = vVar.h(lVar);
                if (zH) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zH) {
            this.f16161v = lVar;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f16147f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) arrayList.get(i10);
            if (lVar.f16167a == i7) {
                return lVar;
            }
            if (lVar.hasSubMenu() && (menuItemFindItem = lVar.f16179o.findItem(i7)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final l g(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f16159t;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (l) arrayList.get(0);
        }
        boolean zN = n();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) arrayList.get(i10);
            char c8 = zN ? lVar.j : lVar.f16174h;
            char[] cArr = keyData.meta;
            if ((c8 == cArr[0] && (metaState & 2) == 0) || ((c8 == cArr[2] && (metaState & 2) != 0) || (zN && c8 == '\b' && i7 == 67))) {
                return lVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f16147f.get(i7);
    }

    public final void h(List list, int i7, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList = this.f16147f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                l lVar = (l) arrayList.get(i10);
                if (lVar.hasSubMenu()) {
                    lVar.f16179o.h(list, i7, keyEvent);
                }
                char c8 = zN ? lVar.j : lVar.f16174h;
                if ((modifiers & 69647) == ((zN ? lVar.k : lVar.f16175i) & 69647) && c8 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c8 == cArr[0] || c8 == cArr[2] || (zN && c8 == '\b' && i7 == 67)) && lVar.isEnabled()) {
                        list.add(lVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f16163x) {
            return true;
        }
        ArrayList arrayList = this.f16147f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((l) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16160u;
            boolean zE = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                v vVar = (v) weakReference.get();
                if (vVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= vVar.e();
                }
            }
            ArrayList arrayList = this.f16150i;
            ArrayList arrayList2 = this.j;
            if (zE) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i7 = 0; i7 < size; i7++) {
                    l lVar = (l) arrayListL.get(i7);
                    if ((lVar.f16188x & 32) == 32) {
                        arrayList.add(lVar);
                    } else {
                        arrayList2.add(lVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return g(i7, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z5 = this.f16149h;
        ArrayList arrayList = this.f16148g;
        if (!z5) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f16147f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            l lVar = (l) arrayList2.get(i7);
            if (lVar.isVisible()) {
                arrayList.add(lVar);
            }
        }
        this.f16149h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f16162w;
    }

    public boolean n() {
        return this.f16144c;
    }

    public boolean o() {
        return this.f16145d;
    }

    public void p(boolean z5) {
        if (this.f16155p) {
            this.f16156q = true;
            if (z5) {
                this.f16157r = true;
                return;
            }
            return;
        }
        if (z5) {
            this.f16149h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16160u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                vVar.a(z5);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return q(findItem(i7), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        l lVarG = g(i7, keyEvent);
        boolean zQ = lVarG != null ? q(lVarG, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, v vVar, int i7) {
        m mVar;
        boolean zExpandActionView;
        m mVar2;
        boolean z5;
        b0 b0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        v vVar2;
        l lVar = (l) menuItem;
        boolean zD = false;
        if (lVar == null || !lVar.isEnabled()) {
            return false;
        }
        j jVar = lVar.f16178n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = lVar.f16180p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(lVar)) && !jVar.e(jVar, lVar)) {
            Intent intent = lVar.f16173g;
            if (intent != null) {
                try {
                    jVar.f16142a.startActivity(intent);
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    mVar = lVar.A;
                    if (mVar == null) {
                    }
                    zExpandActionView = false;
                    mVar2 = lVar.A;
                    if (mVar2 == null) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (lVar.e()) {
                        zExpandActionView |= lVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (lVar.hasSubMenu()) {
                        if ((i7 & 4) == 0) {
                            c(false);
                        }
                        if (!lVar.hasSubMenu()) {
                            b0 b0Var2 = new b0(this.f16142a, this, lVar);
                            lVar.f16179o = b0Var2;
                            b0Var2.setHeaderTitle(lVar.f16171e);
                        }
                        b0Var = lVar.f16179o;
                        if (z5) {
                            mVar2.f16192b.onPrepareSubMenu(b0Var);
                        }
                        copyOnWriteArrayList = this.f16160u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (vVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                vVar2 = (v) weakReference.get();
                                if (vVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zD) {
                                    zD = vVar2.d(b0Var);
                                }
                            }
                        }
                        zExpandActionView |= zD;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i7 & 4) == 0) {
                            c(false);
                        }
                        if (!lVar.hasSubMenu()) {
                            b0 b0Var3 = new b0(this.f16142a, this, lVar);
                            lVar.f16179o = b0Var3;
                            b0Var3.setHeaderTitle(lVar.f16171e);
                        }
                        b0Var = lVar.f16179o;
                        if (z5) {
                            mVar2.f16192b.onPrepareSubMenu(b0Var);
                        }
                        copyOnWriteArrayList = this.f16160u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zD = vVar != null ? vVar.d(b0Var) : false;
                            while (r8.hasNext()) {
                                vVar2 = (v) weakReference.get();
                                if (vVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zD) {
                                    zD = vVar2.d(b0Var);
                                }
                            }
                        }
                        zExpandActionView |= zD;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                mVar = lVar.A;
                if (mVar == null && mVar.f16192b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        mVar2 = lVar.A;
        if (mVar2 == null && mVar2.f16192b.hasSubMenu()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (lVar.e()) {
            zExpandActionView |= lVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (lVar.hasSubMenu() || z5) {
            if ((i7 & 4) == 0) {
                c(false);
            }
            if (!lVar.hasSubMenu()) {
                b0 b0Var4 = new b0(this.f16142a, this, lVar);
                lVar.f16179o = b0Var4;
                b0Var4.setHeaderTitle(lVar.f16171e);
            }
            b0Var = lVar.f16179o;
            if (z5) {
                mVar2.f16192b.onPrepareSubMenu(b0Var);
            }
            copyOnWriteArrayList = this.f16160u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (vVar != null) {
                }
                while (r8.hasNext()) {
                    vVar2 = (v) weakReference.get();
                    if (vVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zD) {
                        zD = vVar2.d(b0Var);
                    }
                }
            }
            zExpandActionView |= zD;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i7 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(v vVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16160u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar2 = (v) weakReference.get();
            if (vVar2 == null || vVar2 == vVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f16147f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((l) arrayList.get(i11)).f16168b == i7) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((l) arrayList.get(i11)).f16168b != i7) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f16147f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((l) arrayList.get(i10)).f16167a == i7) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i10);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f16147f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((b0) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z5, boolean z6) {
        ArrayList arrayList = this.f16147f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) arrayList.get(i10);
            if (lVar.f16168b == i7) {
                lVar.f16188x = (lVar.f16188x & (-5)) | (z6 ? 4 : 0);
                lVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.f16162w = z5;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z5) {
        ArrayList arrayList = this.f16147f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) arrayList.get(i10);
            if (lVar.f16168b == i7) {
                lVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z5) {
        ArrayList arrayList = this.f16147f;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) arrayList.get(i10);
            if (lVar.f16168b == i7) {
                int i11 = lVar.f16188x;
                int i12 = (i11 & (-9)) | (z5 ? 0 : 8);
                lVar.f16188x = i12;
                if (i11 != i12) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f16144c = z5;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f16147f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f16147f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((b0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i7, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f16154o = view;
            this.f16152m = null;
            this.f16153n = null;
        } else {
            if (i7 > 0) {
                this.f16152m = this.f16143b.getText(i7);
            } else if (charSequence != null) {
                this.f16152m = charSequence;
            }
            if (i10 > 0) {
                this.f16153n = this.f16142a.getDrawable(i10);
            } else if (drawable != null) {
                this.f16153n = drawable;
            }
            this.f16154o = null;
        }
        p(false);
    }

    public final void v() {
        this.f16155p = false;
        if (this.f16156q) {
            this.f16156q = false;
            p(this.f16157r);
        }
    }

    public final void w() {
        if (this.f16155p) {
            return;
        }
        this.f16155p = true;
        this.f16156q = false;
        this.f16157r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f16143b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f16143b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return a(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        l lVarA = a(i7, i10, i11, charSequence);
        b0 b0Var = new b0(this.f16142a, this, lVarA);
        lVarA.f16179o = b0Var;
        b0Var.setHeaderTitle(lVarA.f16171e);
        return b0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return a(i7, i10, i11, this.f16143b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return addSubMenu(i7, i10, i11, this.f16143b.getString(i12));
    }

    public j k() {
        return this;
    }
}
