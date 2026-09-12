package f9;

import android.graphics.drawable.Animatable;
import android.util.Log;
import com.facebook.drawee.controller.ControllerListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class g implements ControllerListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9049d = new ArrayList(2);

    public final synchronized void a(ControllerListener controllerListener) {
        this.f9049d.add(controllerListener);
    }

    public final synchronized void b(String str, Exception exc) {
        Log.e("FdingControllerListener", str, exc);
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public final synchronized void onFailure(String str, Throwable th2) {
        int size = this.f9049d.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f9049d.get(i7);
                if (controllerListener != null) {
                    controllerListener.onFailure(str, th2);
                }
            } catch (Exception e10) {
                b("InternalListener exception in onFailure", e10);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public final synchronized void onFinalImageSet(String str, Object obj, Animatable animatable) {
        int size = this.f9049d.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f9049d.get(i7);
                if (controllerListener != null) {
                    controllerListener.onFinalImageSet(str, obj, animatable);
                }
            } catch (Exception e10) {
                b("InternalListener exception in onFinalImageSet", e10);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public final void onIntermediateImageFailed(String str, Throwable th2) {
        ArrayList arrayList = this.f9049d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ControllerListener controllerListener = (ControllerListener) arrayList.get(i7);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageFailed(str, th2);
                }
            } catch (Exception e10) {
                b("InternalListener exception in onIntermediateImageFailed", e10);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public final void onIntermediateImageSet(String str, Object obj) {
        ArrayList arrayList = this.f9049d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ControllerListener controllerListener = (ControllerListener) arrayList.get(i7);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageSet(str, obj);
                }
            } catch (Exception e10) {
                b("InternalListener exception in onIntermediateImageSet", e10);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public final synchronized void onRelease(String str) {
        int size = this.f9049d.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f9049d.get(i7);
                if (controllerListener != null) {
                    controllerListener.onRelease(str);
                }
            } catch (Exception e10) {
                b("InternalListener exception in onRelease", e10);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public final synchronized void onSubmit(String str, Object obj) {
        int size = this.f9049d.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f9049d.get(i7);
                if (controllerListener != null) {
                    controllerListener.onSubmit(str, obj);
                }
            } catch (Exception e10) {
                b("InternalListener exception in onSubmit", e10);
            }
        }
    }
}
