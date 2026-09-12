package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1653a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f1654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f1657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f1658f;

    public /* synthetic */ f() {
    }

    @Override // androidx.core.view.e
    public void a(Uri uri) {
        this.f1657e = uri;
    }

    @Override // androidx.core.view.e
    public void b(int i7) {
        this.f1656d = i7;
    }

    @Override // androidx.core.view.e
    public ContentInfoCompat build() {
        return new ContentInfoCompat(new f(this));
    }

    @Override // androidx.core.view.e
    public void c(ClipData clipData) {
        this.f1654b = clipData;
    }

    @Override // androidx.core.view.g
    public int d() {
        return this.f1655c;
    }

    @Override // androidx.core.view.g
    public Uri e() {
        return this.f1657e;
    }

    @Override // androidx.core.view.g
    public ClipData f() {
        return this.f1654b;
    }

    @Override // androidx.core.view.g
    public int g() {
        return this.f1656d;
    }

    @Override // androidx.core.view.g
    public Bundle getExtras() {
        return this.f1658f;
    }

    @Override // androidx.core.view.g
    public ContentInfo h() {
        return null;
    }

    @Override // androidx.core.view.e
    public void setExtras(Bundle bundle) {
        this.f1658f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f1653a) {
            case 1:
                Uri uri = this.f1657e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f1654b.getDescription());
                sb2.append(", source=");
                int i7 = this.f1655c;
                if (i7 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i7 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i7 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i7 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i7 != 4) {
                    strValueOf = i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb2.append(strValueOf);
                sb2.append(", flags=");
                int i10 = this.f1656d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return com.discord.chat.presentation.list.a.k(sb2, this.f1658f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public f(f fVar) {
        ClipData clipData = fVar.f1654b;
        clipData.getClass();
        this.f1654b = clipData;
        int i7 = fVar.f1655c;
        if (i7 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i7 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f1655c = i7;
        int i10 = fVar.f1656d;
        if ((i10 & 1) == i10) {
            this.f1656d = i10;
            this.f1657e = fVar.f1657e;
            this.f1658f = fVar.f1658f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
