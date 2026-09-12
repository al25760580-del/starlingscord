package a1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f31a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f32b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f31a = colorStateList;
        this.f32b = configuration;
        this.f33c = theme == null ? 0 : theme.hashCode();
    }
}
