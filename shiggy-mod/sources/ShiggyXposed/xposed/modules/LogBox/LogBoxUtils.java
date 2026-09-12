package ShiggyXposed.xposed.modules.LogBox;

import ShiggyXposed.xposed.Constants;
import ShiggyXposed.xposed.Utils;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.ContentType;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: LogBoxUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u001c"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxUtils;", "", "<init>", "()V", "dpToPx", "", "context", "Landroid/content/Context;", "dp", "createM3Background", "Landroid/graphics/drawable/GradientDrawable;", "color", "cornerRadius", "", "getPyoncordDirectory", "Ljava/io/File;", "showM3Toast", "", ContentType.Message.TYPE, "", "getAppearanceMode", "setAppearanceMode", "mode", "saveMenuFlavor", "flavor", "isBundleInjectionDisabled", "", "isSafeModeEnabled", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxUtils {
    public static final LogBoxUtils INSTANCE = new LogBoxUtils();

    private LogBoxUtils() {
    }

    public final int dpToPx(Context context, int dp) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    public final GradientDrawable createM3Background(Context context, int color, float cornerRadius) {
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(INSTANCE.dpToPx(context, (int) cornerRadius));
        return gradientDrawable;
    }

    public final File getPyoncordDirectory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir(), "pyoncord");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final void showM3Toast(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        Toast.makeText(context, message, 0).show();
    }

    public final String getAppearanceMode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getFilesDir(), "logbox/LOGBOX_SETTINGS");
            if (!file.exists()) {
                return "system";
            }
            String strOptString = new JSONObject(FilesKt.readText$default(file, null, 1, null)).optString("appearanceMode", "system");
            Intrinsics.checkNotNull(strOptString);
            return strOptString;
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error reading appearance mode: " + e.getMessage());
            return "system";
        }
    }

    public final void setAppearanceMode(Context context, String mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        try {
            File file = new File(context.getFilesDir(), "logbox/LOGBOX_SETTINGS");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            JSONObject jSONObject = file.exists() ? new JSONObject(FilesKt.readText$default(file, null, 1, null)) : new JSONObject();
            jSONObject.put("appearanceMode", mode);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt.writeText$default(file, string, null, 2, null);
        } catch (Exception e) {
            LogBoxActions.INSTANCE.showError(context, "Failed to set appearance", e.getMessage());
        }
    }

    public final void saveMenuFlavor(Context context, String flavor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flavor, "flavor");
        try {
            File file = new File(context.getFilesDir(), "logbox/LOGBOX_THEMES");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("menuFlavor", flavor);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt.writeText$default(file, string, null, 2, null);
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error saving menu flavor: " + e.getMessage());
            LogBoxActions.INSTANCE.showError(context, "Failed to save flavor", e.getMessage());
        }
    }

    public final boolean isBundleInjectionDisabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getDataDir(), Constants.CACHE_DIR);
            File file2 = new File(file, Constants.MAIN_SCRIPT_FILE);
            if (new File(file, "bundle.js.disabled").exists()) {
                if (file2.exists()) {
                    file2.delete();
                }
                return true;
            }
            if (file2.exists()) {
                return false;
            }
            File file3 = new File(context.getFilesDir(), "logbox/LOGBOX_SETTINGS");
            if (file3.exists()) {
                return new JSONObject(FilesKt.readText$default(file3, null, 1, null)).optBoolean("bundleInjectionDisabled", false);
            }
            return false;
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error reading injection setting: " + e.getMessage());
            return false;
        }
    }

    public final boolean isSafeModeEnabled(Context context) {
        JSONObject jSONObjectOptJSONObject;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getFilesDir(), "vd_mmkv/VENDETTA_SETTINGS");
            if (file.exists() && (jSONObjectOptJSONObject = new JSONObject(FilesKt.readText$default(file, null, 1, null)).optJSONObject("safeMode")) != null) {
                return jSONObjectOptJSONObject.optBoolean("enabled", false);
            }
            return false;
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error checking safe mode: " + e.getMessage());
            return false;
        }
    }
}
