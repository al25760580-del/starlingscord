package ye;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public class e extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Status f23289d;

    public e(Status status) {
        int i7 = status.f5936d;
        String str = status.f5937e;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 2 + String.valueOf(str).length());
        sb2.append(i7);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.f23289d = status;
    }
}
