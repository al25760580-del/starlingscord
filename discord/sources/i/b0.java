package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f11165b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f11166c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f11167d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f11168e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f11169f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f11170g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleArrayMap f11171h = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f11172a = new Object[2];

    public androidx.appcompat.widget.r a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    public androidx.appcompat.widget.s b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet, com.discord.R.attr.buttonStyle);
    }

    public androidx.appcompat.widget.t c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet, com.discord.R.attr.checkboxStyle);
    }

    public androidx.appcompat.widget.c0 d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.c0(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        SimpleArrayMap simpleArrayMap = f11171h;
        Constructor constructor = (Constructor) simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f11165b);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f11172a);
    }
}
