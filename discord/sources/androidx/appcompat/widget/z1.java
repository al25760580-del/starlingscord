package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class z1 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1191e;

    public /* synthetic */ z1(int i7, Object obj) {
        this.f1190d = i7;
        this.f1191e = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j) {
        t1 t1Var;
        switch (this.f1190d) {
            case 0:
                if (i7 != -1 && (t1Var = ((g2) this.f1191e).f990i) != null) {
                    t1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((com.swmansion.rnscreens.c) this.f1191e).o(i7);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f1190d;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
