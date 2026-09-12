package ug;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f21129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f21129b = carouselLayoutManager;
    }

    @Override // ug.e
    public final int a() {
        CarouselLayoutManager carouselLayoutManager = this.f21129b;
        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
    }

    @Override // ug.e
    public final int b() {
        return 0;
    }

    @Override // ug.e
    public final int c() {
        return this.f21129b.getWidth();
    }

    @Override // ug.e
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f21129b;
        if (carouselLayoutManager.f()) {
            return carouselLayoutManager.getWidth();
        }
        return 0;
    }

    @Override // ug.e
    public final int e() {
        return this.f21129b.getPaddingTop();
    }
}
