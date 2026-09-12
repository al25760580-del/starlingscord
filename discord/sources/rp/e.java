package rp;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f19536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f19537h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19538f;

    static {
        e eVar = new e(2, 1, 0);
        f19536g = eVar;
        int i7 = eVar.f19508c;
        int i10 = eVar.f19507b;
        f19537h = (i10 == 1 && i7 == 9) ? new e(2, 0, 0) : new e(i10, i7 + 1, 0);
        new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] versionArray, boolean z5) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.f19538f = z5;
    }

    public final boolean b(e metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        metadataVersionFromLanguageVersion.getClass();
        e eVar = this.f19538f ? f19536g : f19537h;
        int i7 = eVar.f19507b;
        int i10 = metadataVersionFromLanguageVersion.f19507b;
        if (i7 > i10 || (i7 >= i10 && eVar.f19508c > metadataVersionFromLanguageVersion.f19508c)) {
            metadataVersionFromLanguageVersion = eVar;
        }
        int i11 = this.f19508c;
        boolean z5 = false;
        int i12 = this.f19507b;
        if ((i12 == 1 && i11 == 0) || i12 == 0) {
            return false;
        }
        int i13 = metadataVersionFromLanguageVersion.f19507b;
        if (i12 > i13 || (i12 >= i13 && i11 > metadataVersionFromLanguageVersion.f19508c)) {
            z5 = true;
        }
        return !z5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }
}
