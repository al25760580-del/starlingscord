package rk;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19434e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19435i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f19436v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i7, Uri uri, int i10, Throwable th2) {
        super(th2);
        String string = uri.toString();
        String strValueOf = String.valueOf(i10);
        this.f19434e = i7;
        this.f19435i = string;
        this.f19436v = strValueOf;
    }

    @Override // rk.d, java.lang.Throwable
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append('\n');
        int i7 = this.f19434e;
        if (i7 == 1) {
            str = "Invalid parameters";
        } else if (i7 == 2) {
            str = "Failed to open the media target for write.";
        } else if (i7 == 3) {
            str = "URI type not supported at API level below 26";
        } else {
            if (i7 != 4) {
                throw null;
            }
            str = "No output tracks";
        }
        sb2.append(str);
        sb2.append("\nOutput file path or Uri encoded string: ");
        sb2.append(this.f19435i);
        sb2.append("\nMediaMuxer output format: ");
        sb2.append(this.f19436v);
        return sb2.toString();
    }
}
