package dl;

import android.graphics.Matrix;
import com.discord.zoom_layout.ZoomLayoutFixed;
import com.otaliastudios.zoom.ZoomEngine;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ZoomLayoutFixed f7686a;

    public j(ZoomLayoutFixed zoomLayoutFixed) {
        this.f7686a = zoomLayoutFixed;
    }

    @Override // dl.d
    public final void onIdle(ZoomEngine engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
    }

    @Override // dl.d
    public final void onUpdate(ZoomEngine engine, Matrix matrix) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f7686a.a();
    }
}
