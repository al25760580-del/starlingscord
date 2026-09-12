package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1644a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1645b;

    public d(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f1645b = contentInfo;
    }

    @Override // androidx.core.view.e
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.f1645b).setLinkUri(uri);
    }

    @Override // androidx.core.view.e
    public void b(int i7) {
        ((ContentInfo.Builder) this.f1645b).setFlags(i7);
    }

    @Override // androidx.core.view.e
    public ContentInfoCompat build() {
        return new ContentInfoCompat(new d(((ContentInfo.Builder) this.f1645b).build()));
    }

    @Override // androidx.core.view.e
    public void c(ClipData clipData) {
        ((ContentInfo.Builder) this.f1645b).setClip(clipData);
    }

    @Override // androidx.core.view.g
    public int d() {
        return ((ContentInfo) this.f1645b).getSource();
    }

    @Override // androidx.core.view.g
    public Uri e() {
        return ((ContentInfo) this.f1645b).getLinkUri();
    }

    @Override // androidx.core.view.g
    public ClipData f() {
        return ((ContentInfo) this.f1645b).getClip();
    }

    @Override // androidx.core.view.g
    public int g() {
        return ((ContentInfo) this.f1645b).getFlags();
    }

    @Override // androidx.core.view.g
    public Bundle getExtras() {
        return ((ContentInfo) this.f1645b).getExtras();
    }

    @Override // androidx.core.view.g
    public ContentInfo h() {
        return (ContentInfo) this.f1645b;
    }

    @Override // androidx.core.view.e
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f1645b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f1644a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f1645b) + "}";
            default:
                return super.toString();
        }
    }

    public d(ClipData clipData, int i7) {
        this.f1645b = c.b(clipData, i7);
    }

    public d(ContentInfoCompat contentInfoCompat) {
        c.d();
        this.f1645b = c.c(contentInfoCompat.c());
    }
}
