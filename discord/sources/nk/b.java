package nk;

import com.linecorp.apng.ApngDrawable;
import com.linecorp.apng.decoder.Apng;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.Intrinsics;
import ls.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static ApngDrawable a(File file) {
        int i7 = ApngDrawable.L;
        Intrinsics.checkNotNullParameter(file, "file");
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file), 8192);
        try {
            Intrinsics.checkNotNullParameter(stream, "stream");
            Apng apngDecode = Apng.INSTANCE.decode(stream);
            ApngDrawable apngDrawable = new ApngDrawable(new a(apngDecode, apngDecode.getWidth(), apngDecode.getHeight(), 160, new i5.a(24)));
            stream.close();
            return apngDrawable;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(stream, th2);
                throw th3;
            }
        }
    }
}
