package f4;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8835a = v3.q.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z5) {
        String str = f8835a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z6 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z6 = true;
            }
            if (z5 == z6) {
                v3.q.d().a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z5 ? 1 : 2, 1);
            v3.q qVarD = v3.q.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z5 ? ViewProps.ENABLED : "disabled");
            qVarD.a(str, sb2.toString());
        } catch (Exception e10) {
            v3.q qVarD2 = v3.q.d();
            StringBuilder sb3 = new StringBuilder();
            a3.e.w(cls, sb3, "could not be ");
            sb3.append(z5 ? ViewProps.ENABLED : "disabled");
            String string = sb3.toString();
            if (qVarD2.f21419a <= 3) {
                Log.d(str, string, e10);
            }
        }
    }
}
