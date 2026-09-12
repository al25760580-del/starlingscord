package ShiggyXposed.xposed.modules.LogBox;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: CustomBundleDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/CustomBundleDialog;", "", "<init>", "()V", "showCustomBundleDialog", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CustomBundleDialog {
    public static final CustomBundleDialog INSTANCE = new CustomBundleDialog();

    private CustomBundleDialog() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    public final void showCustomBundleDialog(final Context context) {
        boolean zOptBoolean;
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        final M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        File file = new File(LogBoxUtils.INSTANCE.getPyoncordDirectory(context), "loader.json");
        String strOptString = null;
        if (file.exists()) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(FilesKt.readText$default(file, null, 1, null)).optJSONObject("customLoadUrl");
                if (jSONObjectOptJSONObject != null) {
                    zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
                    try {
                        strOptString = jSONObjectOptJSONObject.optString("url", "");
                    } catch (Exception unused) {
                    }
                    z = zOptBoolean;
                    str = strOptString;
                } else {
                    str = null;
                    z = false;
                }
            } catch (Exception unused2) {
                zOptBoolean = false;
            }
        } else {
            str = null;
            z = false;
        }
        LinearLayout linearLayoutCreateMenuContainer$default = LogBoxComponents.createMenuContainer$default(LogBoxComponents.INSTANCE, context, m3Colors, 0, 4, null);
        linearLayoutCreateMenuContainer$default.addView(LogBoxComponents.createTitle$default(LogBoxComponents.INSTANCE, context, m3Colors, "Custom Bundle URL", false, 8, null));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 16));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setText("Enable Custom URL");
        textView.setTextSize(14.0f);
        textView.setTextColor(m3Colors.getOnSurface());
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        final View viewCreateM3Switch = LogBoxComponents.INSTANCE.createM3Switch(context, m3Colors, z);
        linearLayout.addView(textView);
        linearLayout.addView(viewCreateM3Switch);
        linearLayoutCreateMenuContainer$default.addView(linearLayout);
        final EditText editText = new EditText(context);
        editText.setHint("http://localhost:4040/shiggycord.js");
        editText.setTextColor(m3Colors.getOnSurface());
        editText.setHintTextColor(m3Colors.getOnSurfaceVariant());
        editText.setBackground(LogBoxUtils.INSTANCE.createM3Background(context, m3Colors.getSurfaceVariant(), 12.0f));
        editText.setInputType(16);
        editText.setText(str != null ? str : "");
        editText.setTextSize(14.0f);
        editText.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 12), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 12));
        editText.setAlpha(z ? 1.0f : 0.5f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 24));
        editText.setLayoutParams(layoutParams2);
        linearLayoutCreateMenuContainer$default.addView(editText);
        viewCreateM3Switch.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.CustomBundleDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomBundleDialog.showCustomBundleDialog$lambda$6(viewCreateM3Switch, context, m3Colors, editText, view);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(GravityCompat.END);
        TextView textView2 = new TextView(context);
        textView2.setText("Cancel");
        textView2.setTextColor(m3Colors.getPrimary());
        textView2.setTextSize(14.0f);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView2.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        TextView textView3 = new TextView(context);
        textView3.setText("Save");
        textView3.setTextColor(m3Colors.getPrimary());
        textView3.setTextSize(14.0f);
        textView3.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView3.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        final AlertDialog alertDialogCreateDialog = LogBoxDialogs.INSTANCE.createDialog(context, linearLayoutCreateMenuContainer$default);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.CustomBundleDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreateDialog.dismiss();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.CustomBundleDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomBundleDialog.showCustomBundleDialog$lambda$12(editText, viewCreateM3Switch, context, alertDialogCreateDialog, view);
            }
        });
        linearLayout2.addView(textView2);
        linearLayout2.addView(textView3);
        linearLayoutCreateMenuContainer$default.addView(linearLayout2);
        LogBoxDialogs.INSTANCE.setCurrentMenuContainer(linearLayoutCreateMenuContainer$default);
        alertDialogCreateDialog.show();
        LogBoxDialogs.INSTANCE.setDialogWindowWidth(alertDialogCreateDialog, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCustomBundleDialog$lambda$6(View view, Context context, M3Colors m3Colors, final EditText editText, View view2) {
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) tag).booleanValue();
        final boolean z = !zBooleanValue;
        view.setTag(Boolean.valueOf(z));
        LogBoxComponents.INSTANCE.updateSwitchAppearance(context, view, m3Colors, z);
        editText.animate().alpha(!zBooleanValue ? 1.0f : 0.5f).setDuration(250L).withEndAction(new Runnable() { // from class: ShiggyXposed.xposed.modules.LogBox.CustomBundleDialog$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                editText.setEnabled(z);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCustomBundleDialog$lambda$12(EditText editText, View view, Context context, AlertDialog alertDialog, View view2) {
        String string;
        String string2;
        try {
            Editable text = editText.getText();
            if (text == null || (string2 = text.toString()) == null || (string = StringsKt.trim((CharSequence) string2).toString()) == null) {
                string = "";
            }
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) tag).booleanValue();
            if (zBooleanValue && string.length() > 0) {
                LogBoxActions.INSTANCE.setCustomBundleURL(context, string, true);
                alertDialog.dismiss();
            } else {
                if (!zBooleanValue) {
                    LogBoxActions logBoxActions = LogBoxActions.INSTANCE;
                    String str = string;
                    if (str.length() == 0) {
                        str = "http://localhost:4040/shiggycord.js";
                    }
                    logBoxActions.setCustomBundleURL(context, str, false);
                    alertDialog.dismiss();
                    return;
                }
                Toast.makeText(context, "Please enter a valid URL", 0).show();
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            Toast.makeText(context, "Failed to set custom bundle: " + message, 1).show();
        }
    }
}
