package hj;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class v extends IOException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10913d;

    public static v a() {
        return new v("Protocol message had invalid UTF-8.");
    }

    public static u b() {
        return new u("Protocol message tag had invalid wire type.");
    }

    public static v c() {
        return new v("CodedInputStream encountered a malformed varint.");
    }

    public static v d() {
        return new v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static v e() {
        return new v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
