package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends r {
    public final a3.h E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f3 f860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f861y;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = new a3.h(3, this);
        this.f859w = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i7 >= 960 && i10 >= 720 && configuration.orientation == 2) {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (i7 >= 600) {
            return JfifUtil.MARKER_SOFn;
        }
        if (i7 < 640 || i10 < 480) {
            return 160;
        }
        return JfifUtil.MARKER_SOFn;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            x2.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
                return;
            }
            return;
        }
        b3 b3Var = f3.G0;
        b3Var.getClass();
        b3.a();
        Method method = b3Var.f908c;
        if (method != null) {
            try {
                method.invoke(this, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f859w <= 0 || super.enoughToFilter();
    }

    @Override // androidx.appcompat.widget.r, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f861y) {
            a3.h hVar = this.E;
            removeCallbacks(hVar);
            post(hVar);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z5, int i7, Rect rect) {
        super.onFocusChanged(z5, i7, rect);
        f3 f3Var = this.f860x;
        f3Var.x(f3Var.f965p0);
        f3Var.post(f3Var.D0);
        if (f3Var.M.hasFocus()) {
            f3Var.l();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.f860x.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i7, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        if (z5 && this.f860x.hasFocus() && getVisibility() == 0) {
            this.f861y = true;
            Context context = getContext();
            b3 b3Var = f3.G0;
            if (context.getResources().getConfiguration().orientation == 2) {
                a();
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z5) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        a3.h hVar = this.E;
        if (!z5) {
            this.f861y = false;
            removeCallbacks(hVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f861y = true;
                return;
            }
            this.f861y = false;
            removeCallbacks(hVar);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(f3 f3Var) {
        this.f860x = f3Var;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i7) {
        super.setThreshold(i7);
        this.f859w = i7;
    }
}
