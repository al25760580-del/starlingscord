package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: OID.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "algorithm", "keysGenerationAlgorithm", "(Ljava/lang/String;)Ljava/lang/String;", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class OIDKt {
    public static final String keysGenerationAlgorithm(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        if (StringsKt.endsWith(algorithm, "ecdsa", true)) {
            return "EC";
        }
        if (StringsKt.endsWith(algorithm, "dsa", true)) {
            return "DSA";
        }
        if (StringsKt.endsWith(algorithm, "rsa", true)) {
            return "RSA";
        }
        throw new IllegalStateException(("Couldn't find KeyPairGenerator algorithm for " + algorithm).toString());
    }
}
