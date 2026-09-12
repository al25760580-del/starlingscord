package b2;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.d2;
import androidx.appcompat.widget.h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3048e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Cursor f3049i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f3051w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d2 f3052x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f3053y;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f3049i;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f3051w;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                d2 d2Var = this.f3052x;
                if (d2Var != null) {
                    cursor2.unregisterDataSetObserver(d2Var);
                }
            }
            this.f3049i = cursor;
            if (cursor != null) {
                a aVar2 = this.f3051w;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                d2 d2Var2 = this.f3052x;
                if (d2Var2 != null) {
                    cursor.registerDataSetObserver(d2Var2);
                }
                this.f3050v = cursor.getColumnIndexOrThrow("_id");
                this.f3047d = true;
                notifyDataSetChanged();
            } else {
                this.f3050v = -1;
                this.f3047d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f3047d || (cursor = this.f3049i) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f3047d) {
            return null;
        }
        this.f3049i.moveToPosition(i7);
        if (view == null) {
            h3 h3Var = (h3) this;
            view = h3Var.G.inflate(h3Var.F, viewGroup, false);
        }
        a(view, this.f3049i);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f3053y == null) {
            c cVar = new c();
            cVar.f3054a = this;
            this.f3053y = cVar;
        }
        return this.f3053y;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        Cursor cursor;
        if (!this.f3047d || (cursor = this.f3049i) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f3049i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        Cursor cursor;
        if (this.f3047d && (cursor = this.f3049i) != null && cursor.moveToPosition(i7)) {
            return this.f3049i.getLong(this.f3050v);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f3047d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f3049i.moveToPosition(i7)) {
            throw new IllegalStateException(kk.b.h(i7, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f3049i);
        return view;
    }
}
