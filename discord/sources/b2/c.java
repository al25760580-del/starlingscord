package b2;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.f3;
import androidx.appcompat.widget.h3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f3054a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((h3) this.f3054a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorG;
        h3 h3Var = (h3) this.f3054a;
        f3 f3Var = h3Var.H;
        String string = charSequence == null ? "" : charSequence.toString();
        if (f3Var.getVisibility() == 0 && f3Var.getWindowVisibility() == 0) {
            try {
                cursorG = h3Var.g(h3Var.I, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f3054a;
        Cursor cursor = bVar.f3049i;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((h3) bVar).b((Cursor) obj);
    }
}
