package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import j3.b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // j3.b
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new com.facebook.react.modules.core.b(this, context.getApplicationContext()));
        return new i8.b(21);
    }

    @Override // j3.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
