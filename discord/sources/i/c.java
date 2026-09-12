package i;

import android.widget.ArrayAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
