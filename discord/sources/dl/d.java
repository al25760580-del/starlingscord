package dl;

import android.graphics.Matrix;
import com.otaliastudios.zoom.ZoomEngine;

/* JADX INFO: loaded from: classes3.dex */
public interface d {
    void onIdle(ZoomEngine zoomEngine);

    void onUpdate(ZoomEngine zoomEngine, Matrix matrix);
}
