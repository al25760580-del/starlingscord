package androidx.appcompat.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class u2 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1131e;

    public /* synthetic */ u2(int i7, Object obj) {
        this.f1130d = i7;
        this.f1131e = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f1130d) {
            case 0:
                com.swmansion.rnscreens.c cVar = (com.swmansion.rnscreens.c) this.f1131e;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = cVar.M;
                View view2 = cVar.U;
                if (view2.getWidth() > 1) {
                    Resources resources = cVar.getContext().getResources();
                    int paddingLeft = cVar.O.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z5 = f4.f976a;
                    boolean z6 = cVar.getLayoutDirection() == 1;
                    int dimensionPixelSize = cVar.f964o0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchView$SearchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchView$SearchAutoComplete.setDropDownHorizontalOffset(z6 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchView$SearchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                throw null;
        }
    }
}
