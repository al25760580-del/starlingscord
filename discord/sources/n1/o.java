package n1;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16230a;

    public o(List credentialOptions) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        this.f16230a = credentialOptions;
        if (credentialOptions.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (credentialOptions.size() > 1) {
            int i7 = 0;
            if (!credentialOptions.isEmpty()) {
                Iterator it = credentialOptions.iterator();
                while (it.hasNext()) {
                    if ((((i) it.next()) instanceof q) && (i7 = i7 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i7 > 0 && i7 != this.f16230a.size()) {
                throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
            }
            for (i iVar : this.f16230a) {
            }
        }
    }
}
