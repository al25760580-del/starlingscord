package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import com.reactnativecommunity.webview.RNCWebViewManager;
import je.e0;
import md.r;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends PlaybackException {
    public final r E;
    public final boolean F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5634i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f5635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Format f5637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f5638y;

    static {
        int i7 = e0.f13788a;
        Integer.toString(RNCWebViewManager.COMMAND_CLEAR_CACHE, 36);
        Integer.toString(RNCWebViewManager.COMMAND_CLEAR_HISTORY, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public b(int i7, Exception exc, int i10) {
        this(i7, exc, i10, null, -1, null, 4, false);
    }

    public final b a(r rVar) {
        String message = getMessage();
        int i7 = e0.f13788a;
        return new b(message, getCause(), this.f5571d, this.f5634i, this.f5635v, this.f5636w, this.f5637x, this.f5638y, rVar, this.f5572e, this.F);
    }

    public b(String str, Throwable th2, int i7, int i10, String str2, int i11, Format format, int i12, r rVar, long j, boolean z5) {
        super(str, th2, i7, j);
        je.b.g(!z5 || i10 == 1);
        je.b.g(th2 != null || i10 == 3);
        this.f5634i = i10;
        this.f5635v = str2;
        this.f5636w = i11;
        this.f5637x = format;
        this.f5638y = i12;
        this.E = rVar;
        this.F = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i7, Throwable th2, int i10, String str, int i11, Format format, int i12, boolean z5) {
        String str2;
        int i13;
        Format format2;
        String string;
        String str3;
        if (i7 == 0) {
            str2 = str;
            i13 = i11;
            format2 = format;
            string = "Source error";
        } else if (i7 != 1) {
            if (i7 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i13 = i11;
            format2 = format;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            format2 = format;
            sb2.append(format2);
            sb2.append(", format_supported=");
            int i14 = e0.f13788a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i12 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : kk.b.j(string, ": null"), th2, i10, i7, str2, i13, format2, i12, null, SystemClock.elapsedRealtime(), z5);
    }
}
