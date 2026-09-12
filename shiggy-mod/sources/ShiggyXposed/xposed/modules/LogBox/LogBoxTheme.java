package ShiggyXposed.xposed.modules.LogBox;

import ShiggyXposed.xposed.Utils;
import android.content.Context;
import android.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import java.io.File;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: LogBoxTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxTheme;", "", "<init>", "()V", "isDarkMode", "", "context", "Landroid/content/Context;", "getM3Colors", "LShiggyXposed/xposed/modules/LogBox/M3Colors;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxTheme {
    public static final LogBoxTheme INSTANCE = new LogBoxTheme();

    private LogBoxTheme() {
    }

    public final boolean isDarkMode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getFilesDir(), "logbox/LOGBOX_SETTINGS");
            if (file.exists()) {
                String strOptString = new JSONObject(FilesKt.readText$default(file, null, 1, null)).optString("appearanceMode", "");
                if (Intrinsics.areEqual(strOptString, "light")) {
                    return false;
                }
                if (Intrinsics.areEqual(strOptString, "dark")) {
                    return true;
                }
            }
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error reading LogBox appearance settings: " + e.getMessage());
        }
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00ea  */
    public final M3Colors getM3Colors(Context context) {
        M3Colors m3Colors;
        String lowerCase;
        Pair<String, String> pair;
        Intrinsics.checkNotNullParameter(context, "context");
        if (isDarkMode(context)) {
            m3Colors = new M3Colors(Color.parseColor("#1C1B1F"), Color.parseColor("#49454F"), Color.parseColor("#E6E1E5"), Color.parseColor("#CAC4D0"), Color.parseColor("#D0BCFF"), Color.parseColor("#381E72"), Color.parseColor("#4F378B"), Color.parseColor("#EADDFF"), Color.parseColor("#4A4458"), Color.parseColor("#E8DEF8"), Color.parseColor("#F2B8B5"), Color.parseColor("#601410"));
        } else {
            m3Colors = new M3Colors(Color.parseColor("#FFFBFE"), Color.parseColor("#E7E0EC"), Color.parseColor("#1C1B1F"), Color.parseColor("#49454F"), Color.parseColor("#6750A4"), Color.parseColor("#FFFFFF"), Color.parseColor("#EADDFF"), Color.parseColor("#21005D"), Color.parseColor("#E8DEF8"), Color.parseColor("#1D192B"), Color.parseColor("#B3261E"), Color.parseColor("#FFFFFF"));
        }
        try {
            File file = new File(context.getFilesDir(), "logbox/LOGBOX_THEMES");
            if (file.exists()) {
                JSONObject jSONObject = new JSONObject(FilesKt.readText$default(file, null, 1, null));
                String strOptString = jSONObject.optString("menuFlavor", jSONObject.optString("flavor", jSONObject.optString("id", "")));
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                lowerCase = strOptString.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase.length() <= 0) {
                    lowerCase = "mocha";
                }
            } else {
                lowerCase = "mocha";
            }
            return (lowerCase.length() <= 0 || (pair = LogBoxConstants.INSTANCE.getFLAVOR_COLORS().get(lowerCase)) == null) ? m3Colors : M3Colors.copy$default(m3Colors, 0, 0, 0, 0, Color.parseColor(pair.getFirst()), -1, Color.parseColor(pair.getSecond()), ViewCompat.MEASURED_STATE_MASK, 0, 0, 0, 0, 3855, null);
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error applying LogBox flavor: " + e.getMessage());
            return m3Colors;
        }
    }
}
