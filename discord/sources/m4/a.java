package m4;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import x4.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Paint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15466a;

    @Override // android.graphics.Paint
    public void setAlpha(int i7) {
        switch (this.f15466a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    PointF pointF = g.f22635a;
                    super.setAlpha(Math.max(0, Math.min(255, i7)));
                } else {
                    int color = getColor();
                    PointF pointF2 = g.f22635a;
                    setColor((Math.max(0, Math.min(255, i7)) << 24) | (color & 16777215));
                }
                break;
            default:
                super.setAlpha(i7);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f15466a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i10) {
        super(i7);
        this.f15466a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PorterDuff.Mode mode) {
        super(1);
        this.f15466a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
