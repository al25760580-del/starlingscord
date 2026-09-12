package f9;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.ControllerListener;

/* JADX INFO: loaded from: classes3.dex */
public class f implements ControllerListener {
    private static final ControllerListener NO_OP_LISTENER = new f();

    public static <INFO> ControllerListener getNoOpListener() {
        return NO_OP_LISTENER;
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(String str) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(String str, Throwable th2) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String str, Throwable th2) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String str, Object obj) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String str, Object obj) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String str, Object obj, Animatable animatable) {
    }
}
