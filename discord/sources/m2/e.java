package m2;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import e4.m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f15362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.c f15363b;

    public e(KeyListener keyListener) {
        q8.c cVar = new q8.c();
        this.f15362a = keyListener;
        this.f15363b = cVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f15362a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f15362a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean zV;
        boolean z5;
        this.f15363b.getClass();
        if (i7 != 67) {
            zV = i7 != 112 ? false : m.v(editable, keyEvent, true);
        } else {
            zV = m.v(editable, keyEvent, false);
        }
        if (zV) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z5 = true;
        } else {
            z5 = false;
        }
        return z5 || this.f15362a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f15362a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f15362a.onKeyUp(view, editable, i7, keyEvent);
    }
}
