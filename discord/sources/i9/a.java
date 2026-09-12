package i9;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.e;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.view.DraweeHolder;
import e9.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f11400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DraweeHolder f11401e;

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            DraweeHolder draweeHolder = this.f11401e;
            if (draweeHolder != null && !draweeHolder.f4726a) {
                o8.a.t(d.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(draweeHolder)), Integer.valueOf(System.identityHashCode(draweeHolder.f4730e)), draweeHolder.toString());
                draweeHolder.f4727b = true;
                draweeHolder.f4728c = true;
                draweeHolder.b();
            }
            super.draw(canvas);
            Drawable drawable = this.f11400d;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f11400d.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        DraweeHolder draweeHolder = this.f11401e;
        if (draweeHolder != null) {
            draweeHolder.e(z5);
        }
        return super.setVisible(z5, z6);
    }
}
