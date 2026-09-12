package androidx.recyclerview.widget;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2559a;

    public a1(RecyclerView recyclerView) {
        this.f2559a = recyclerView;
    }

    public final void a(a aVar) {
        int i7 = aVar.f2553a;
        RecyclerView recyclerView = this.f2559a;
        if (i7 == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, aVar.f2554b, aVar.f2556d);
            return;
        }
        if (i7 == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, aVar.f2554b, aVar.f2556d);
        } else if (i7 == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, aVar.f2554b, aVar.f2556d, aVar.f2555c);
        } else {
            if (i7 != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, aVar.f2554b, aVar.f2556d, 1);
        }
    }

    public final RecyclerView.ViewHolder b(int i7) {
        RecyclerView recyclerView = this.f2559a;
        RecyclerView.ViewHolder viewHolderFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i7, true);
        if (viewHolderFindViewHolderForPosition != null) {
            ChildHelper childHelper = recyclerView.mChildHelper;
            if (!childHelper.f2447c.contains(viewHolderFindViewHolderForPosition.itemView)) {
                return viewHolderFindViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }
}
