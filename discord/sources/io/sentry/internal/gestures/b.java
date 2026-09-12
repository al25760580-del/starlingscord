package io.sentry.internal.gestures;

import android.view.View;
import com.facebook.imagepipeline.nativecode.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f12761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12764d = "old_view_system";

    public b(View view, String str, String str2) {
        this.f12761a = new WeakReference(view);
        this.f12762b = str;
        this.f12763c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return c.r(this.f12762b, bVar.f12762b) && c.r(this.f12763c, bVar.f12763c) && c.r(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12761a, this.f12763c, null});
    }
}
