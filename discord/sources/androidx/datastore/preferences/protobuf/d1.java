package androidx.datastore.preferences.protobuf;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class d1 extends RuntimeException {
    public /* synthetic */ d1() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public d1(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        sb2.append(str);
        sb2.append(" Parcel: pos=");
        sb2.append(iDataPosition);
        sb2.append(" size=");
        sb2.append(iDataSize);
        super(sb2.toString());
    }

    public d1(Exception exc) {
        super("An exception was thrown by an Executor", exc);
    }

    public d1(String str) {
        super("Invalid request builder: ".concat(str));
    }

    public d1(Integer num) {
        super("Invalid size: " + num.toString());
    }
}
