package ke;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static boolean a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i7 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i7 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
