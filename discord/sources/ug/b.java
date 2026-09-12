package ug;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f21126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21127b;

    public b() {
        Paint paint = new Paint();
        this.f21126a = paint;
        this.f21127b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, state);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f21126a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f21127b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).getClass();
            paint.setColor(b1.c.b(-65281, -16776961, 0.0f));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).e()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f6318e.e(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f6318e.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f6318e.b(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f6318e.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
