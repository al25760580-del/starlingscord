package na;

import com.facebook.imagepipeline.image.ImageInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ImageInfo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16534e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f16535i;

    public i(int i7, int i10, Map map) {
        this.f16533d = i7;
        this.f16534e = i10;
        this.f16535i = map;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo, v9.a
    public final Map getExtras() {
        return this.f16535i;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public final int getHeight() {
        return this.f16534e;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public final int getWidth() {
        return this.f16533d;
    }
}
