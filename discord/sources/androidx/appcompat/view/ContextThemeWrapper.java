package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class ContextThemeWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f765f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f770e;

    public ContextThemeWrapper(Context context, int i7) {
        super(context);
        this.f766a = i7;
    }

    public final void a(Configuration configuration) {
        if (this.f770e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f769d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f769d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f767b == null) {
            this.f767b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f767b.setTo(theme);
            }
        }
        this.f767b.applyStyle(this.f766a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f770e == null) {
            Configuration configuration = this.f769d;
            if (configuration == null) {
                this.f770e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f765f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f765f = configuration2;
                    }
                    if (configuration.equals(f765f)) {
                        this.f770e = super.getResources();
                    }
                }
                this.f770e = createConfigurationContext(this.f769d).getResources();
            }
        }
        return this.f770e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f768c == null) {
            this.f768c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f768c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f767b;
        if (theme != null) {
            return theme;
        }
        if (this.f766a == 0) {
            this.f766a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f767b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        if (this.f766a != i7) {
            this.f766a = i7;
            b();
        }
    }
}
