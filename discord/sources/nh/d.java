package nh;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(n nVar, int i7) {
        super(nVar);
        this.f16841e = i7;
    }

    @Override // nh.o
    public void q() {
        switch (this.f16841e) {
            case 0:
                n nVar = this.f16870b;
                nVar.L = null;
                CheckableImageButton checkableImageButton = nVar.f16868y;
                checkableImageButton.setOnLongClickListener(null);
                sa.a.F(checkableImageButton, null);
                break;
        }
    }
}
