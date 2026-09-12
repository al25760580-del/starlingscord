package com.discord.age_assurance;

import ar.u;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\b"}, d2 = {"isTokenProviderInvalid", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sha256Hex", "", "value", "age_assurance_androidRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PlayIntegrityModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTokenProviderInvalid(Exception exc) {
        return (exc instanceof wh.b) && ((wh.b) exc).f23289d.f5936d == -19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sha256Hex(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        return y.z(bArrDigest, new u(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence sha256Hex$lambda$0(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b10 & 255)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
