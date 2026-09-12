package ge;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f9997a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f9997a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
