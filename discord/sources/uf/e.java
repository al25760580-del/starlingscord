package uf;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f21124a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f21124a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
