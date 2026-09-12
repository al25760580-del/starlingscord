package n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.discord.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16127d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f16128e;

    public e(f fVar) {
        this.f16128e = fVar;
        a();
    }

    public final void a() {
        j jVar = this.f16128e.f16131i;
        l lVar = jVar.f16161v;
        if (lVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((l) arrayList.get(i7)) == lVar) {
                    this.f16127d = i7;
                    return;
                }
            }
        }
        this.f16127d = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l getItem(int i7) {
        f fVar = this.f16128e;
        j jVar = fVar.f16131i;
        jVar.i();
        ArrayList arrayList = jVar.j;
        fVar.getClass();
        int i10 = this.f16127d;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (l) arrayList.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        f fVar = this.f16128e;
        j jVar = fVar.f16131i;
        jVar.i();
        int size = jVar.j.size();
        fVar.getClass();
        return this.f16127d < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f16128e.f16130e.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((w) view).a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
