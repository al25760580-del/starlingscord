package ub;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21012a;

    public m(long j) {
        this.f21012a = j;
    }

    public static m a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        m mVar = new m(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return mVar;
                    }
                    m mVar2 = new m(jsonReader.nextLong());
                    jsonReader.close();
                    return mVar2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof m) && this.f21012a == ((m) obj).f21012a;
    }

    public final int hashCode() {
        long j = this.f21012a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return a3.e.n(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f21012a, "}");
    }
}
