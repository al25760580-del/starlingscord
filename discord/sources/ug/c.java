package ug;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f21128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f21128b = carouselLayoutManager;
    }

    @Override // ug.e
    public final int a() {
        return this.f21128b.getHeight();
    }

    @Override // ug.e
    public final int b() {
        return this.f21128b.getPaddingLeft();
    }

    @Override // ug.e
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.f21128b;
        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
    }

    @Override // ug.e
    public final int d() {
        return 0;
    }

    @Override // ug.e
    public final int e() {
        return 0;
    }
}
