package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends t1 {
    public final int J;
    public final int K;
    public h2 L;
    public n.l M;

    public k2(Context context, boolean z5) {
        super(context, z5);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.J = 21;
            this.K = 22;
        } else {
            this.J = 22;
            this.K = 21;
        }
    }

    @Override // androidx.appcompat.widget.t1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        n.g gVar;
        int headersCount;
        int iPointToPosition;
        int i7;
        if (this.L != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                gVar = (n.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (n.g) adapter;
                headersCount = 0;
            }
            n.l lVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = iPointToPosition - headersCount) < 0 || i7 >= gVar.getCount()) ? null : gVar.getItem(i7);
            n.l lVar = this.M;
            if (lVar != lVarB) {
                n.j jVar = gVar.f16135d;
                if (lVar != null) {
                    this.L.c(jVar, lVar);
                }
                this.M = lVarB;
                if (lVarB != null) {
                    this.L.m(jVar, lVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.J) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i7 != this.K) {
            return super.onKeyDown(i7, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (n.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (n.g) adapter).f16135d.c(false);
        return true;
    }

    public void setHoverListener(h2 h2Var) {
        this.L = h2Var;
    }

    @Override // androidx.appcompat.widget.t1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
