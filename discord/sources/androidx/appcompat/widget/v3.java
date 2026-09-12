package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class v3 implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n.a f1144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3 f1145e;

    public v3(x3 x3Var) {
        this.f1145e = x3Var;
        Context context = x3Var.f1164a.getContext();
        CharSequence charSequence = x3Var.f1171h;
        n.a aVar = new n.a();
        aVar.f16101e = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        aVar.f16103g = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        aVar.f16106l = null;
        aVar.f16107m = null;
        aVar.f16108n = false;
        aVar.f16109o = false;
        aVar.f16110p = 16;
        aVar.f16105i = context;
        aVar.f16097a = charSequence;
        this.f1144d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x3 x3Var = this.f1145e;
        Window.Callback callback = x3Var.k;
        if (callback == null || !x3Var.f1173l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1144d);
    }
}
