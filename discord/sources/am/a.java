package am;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ReactViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThemedReactContext f635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f636e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f637i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f638v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f635d = reactContext;
    }

    public static ScrollView d(View view) {
        if (view instanceof ScrollView) {
            return (ScrollView) view;
        }
        ScrollView scrollViewD = null;
        if (view instanceof ViewGroup) {
            int i7 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i7 >= viewGroup.getChildCount() || scrollViewD != null) {
                    break;
                }
                scrollViewD = d(viewGroup.getChildAt(i7));
                i7++;
            }
        }
        return scrollViewD;
    }

    public final void c() {
        ScrollView scrollViewD = d(this);
        if (scrollViewD == null) {
            return;
        }
        scrollViewD.setClipToPadding(false);
        int i7 = (int) (((float) this.f637i) * Resources.getSystem().getDisplayMetrics().density);
        View childAt = scrollViewD.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTranslationY(i7);
        scrollViewD.setPadding(scrollViewD.getPaddingLeft(), scrollViewD.getPaddingTop(), scrollViewD.getPaddingRight(), (int) (((float) (this.f636e + this.f637i)) * Resources.getSystem().getDisplayMetrics().density));
        int i10 = i7 - this.f638v;
        if (i10 != 0) {
            scrollViewD.scrollBy(0, i10);
        }
        this.f638v = i7;
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.f635d;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    public final void setContentInsetBottom(double d6) {
        this.f636e = d6;
        c();
    }

    public final void setContentInsetTop(double d6) {
        this.f637i = d6;
        c();
    }

    public final void setApplyWorkaroundForContentInsetHitTestBug(boolean z5) {
    }
}
