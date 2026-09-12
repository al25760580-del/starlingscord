package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class w extends IOException {
    public static w a() {
        return new w("Protocol message had invalid UTF-8.");
    }

    public static v b() {
        return new v("Protocol message tag had invalid wire type.");
    }

    public static w c() {
        return new w("CodedInputStream encountered a malformed varint.");
    }

    public static w d() {
        return new w("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static w e() {
        return new w("Failed to parse the message.");
    }

    public static w f() {
        return new w("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
