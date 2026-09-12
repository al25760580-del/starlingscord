package la;

import com.facebook.imagepipeline.image.EncodedImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EncodedImage f14989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, EncodedImage encodedImage) {
        super(str);
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.f14989d = encodedImage;
    }
}
