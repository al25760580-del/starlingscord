package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class v2 implements View.OnKeyListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.swmansion.rnscreens.c f1143d;

    public v2(com.swmansion.rnscreens.c cVar) {
        this.f1143d = cVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        com.swmansion.rnscreens.c cVar = this.f1143d;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = cVar.M;
        if (cVar.B0 != null) {
            if (!searchView$SearchAutoComplete.isPopupShowing() || searchView$SearchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchView$SearchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i7 == 66) {
                    view.cancelLongPress();
                    cVar.getContext().startActivity(cVar.j("android.intent.action.SEARCH", null, null, searchView$SearchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (cVar.B0 != null && cVar.f966q0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i7 == 66 || i7 == 84 || i7 == 61) {
                    cVar.n(searchView$SearchAutoComplete.getListSelection());
                    return true;
                }
                if (i7 == 21 || i7 == 22) {
                    searchView$SearchAutoComplete.setSelection(i7 == 21 ? 0 : searchView$SearchAutoComplete.length());
                    searchView$SearchAutoComplete.setListSelection(0);
                    searchView$SearchAutoComplete.clearListSelection();
                    searchView$SearchAutoComplete.a();
                    return true;
                }
                if (i7 == 19) {
                    searchView$SearchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
