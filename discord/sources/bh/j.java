package bh;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends e4.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3284c;

    public /* synthetic */ j(int i7, Object obj) {
        this.f3283b = i7;
        this.f3284c = obj;
    }

    @Override // e4.f
    public final void m0(int i7) {
        switch (this.f3283b) {
            case 0:
                l lVar = (l) this.f3284c;
                lVar.f3289e = true;
                k kVar = (k) lVar.f3290f.get();
                if (kVar != null) {
                    kVar.a();
                }
                break;
        }
    }

    @Override // e4.f
    public final void n0(Typeface typeface, boolean z5) {
        switch (this.f3283b) {
            case 0:
                if (!z5) {
                    l lVar = (l) this.f3284c;
                    lVar.f3289e = true;
                    k kVar = (k) lVar.f3290f.get();
                    if (kVar != null) {
                        kVar.a();
                    }
                    break;
                }
                break;
            default:
                Chip chip = (Chip) this.f3284c;
                wg.e eVar = chip.f6320w;
                chip.setText(eVar.f22245j1 ? eVar.f22248l0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    private final void A0(int i7) {
    }
}
