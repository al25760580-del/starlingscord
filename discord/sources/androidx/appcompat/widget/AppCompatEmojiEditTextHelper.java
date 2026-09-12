package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatEmojiEditTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.c f830b;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f829a = editText;
        u4.c cVar = new u4.c();
        cVar.f20946d = new e4.c(editText);
        this.f830b = cVar;
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((e4.c) this.f830b.f20946d).getClass();
        if (keyListener instanceof m2.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new m2.e(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f829a.getContext().obtainStyledAttributes(attributeSet, h.a.f10261i, i7, 0);
        try {
            boolean z5 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z5);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final m2.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        u4.c cVar = this.f830b;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            e4.c cVar2 = (e4.c) cVar.f20946d;
            cVar2.getClass();
            if (!(inputConnection instanceof m2.b)) {
                inputConnection = new m2.b((EditText) cVar2.f7966e, inputConnection, editorInfo);
            }
        }
        return (m2.b) inputConnection;
    }

    public final void d(boolean z5) {
        m2.i iVar = (m2.i) ((e4.c) this.f830b.f20946d).f7967i;
        if (iVar.f15369i != z5) {
            if (iVar.f15368e != null) {
                k2.i iVarA = k2.i.a();
                m2.h hVar = iVar.f15368e;
                iVarA.getClass();
                yk.a.d(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = iVarA.f14233a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    iVarA.f14234b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th2;
                }
            }
            iVar.f15369i = z5;
            if (z5) {
                m2.i.a(iVar.f15367d, k2.i.a().b());
            }
        }
    }
}
