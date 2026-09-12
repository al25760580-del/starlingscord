package nh;

import android.text.Editable;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends bh.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f16860d;

    public l(n nVar) {
        this.f16860d = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f16860d.b().a();
    }

    @Override // bh.o, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        this.f16860d.b().b();
    }
}
