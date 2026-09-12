package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes.dex */
public class y extends fh.s implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f16211c;

    public y(Context context, j jVar) {
        super(context);
        if (jVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f16211c = jVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(this.f16211c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f16211c.addIntentOptions(i7, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = h(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f16211c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.f9257b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        this.f16211c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f16211c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        return h(this.f16211c.findItem(i7));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return h(this.f16211c.getItem(i7));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f16211c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f16211c.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return this.f16211c.performIdentifierAction(i7, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        return this.f16211c.performShortcut(i7, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        if (((SimpleArrayMap) this.f9257b) != null) {
            int i10 = 0;
            while (true) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.f9257b;
                if (i10 >= simpleArrayMap.f1222i) {
                    break;
                }
                if (((d1.a) simpleArrayMap.f(i10)).getGroupId() == i7) {
                    ((SimpleArrayMap) this.f9257b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f16211c.removeGroup(i7);
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        if (((SimpleArrayMap) this.f9257b) != null) {
            int i10 = 0;
            while (true) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.f9257b;
                if (i10 >= simpleArrayMap.f1222i) {
                    break;
                }
                if (((d1.a) simpleArrayMap.f(i10)).getItemId() == i7) {
                    ((SimpleArrayMap) this.f9257b).g(i10);
                    break;
                }
                i10++;
            }
        }
        this.f16211c.removeItem(i7);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z5, boolean z6) {
        this.f16211c.setGroupCheckable(i7, z5, z6);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z5) {
        this.f16211c.setGroupEnabled(i7, z5);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z5) {
        this.f16211c.setGroupVisible(i7, z5);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f16211c.setQwertyMode(z5);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f16211c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return this.f16211c.addSubMenu(i7);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return h(this.f16211c.add(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return this.f16211c.addSubMenu(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return h(this.f16211c.a(i7, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return this.f16211c.addSubMenu(i7, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return h(this.f16211c.add(i7, i10, i11, i12));
    }
}
