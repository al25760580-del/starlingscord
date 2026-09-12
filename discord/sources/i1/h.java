package i1;

import android.net.Uri;
import com.facebook.react.common.assets.ReactFontManager;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f11374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11379f;

    public h(Uri uri, int i7, int i10, boolean z5, int i11) {
        uri.getClass();
        this.f11374a = uri;
        this.f11375b = i7;
        this.f11376c = i10;
        this.f11377d = z5;
        this.f11378e = null;
        this.f11379f = i11;
    }

    public h(String str, String str2) {
        this.f11374a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f11375b = 0;
        this.f11376c = ReactFontManager.TypefaceStyle.NORMAL;
        this.f11377d = false;
        this.f11378e = str2;
        this.f11379f = 0;
    }
}
