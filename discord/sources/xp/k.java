package xp;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f23008c = new k(j.f23004d, "SUCCESS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f23009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23010b;

    public k(j jVar, String str) {
        this.f23009a = jVar;
        this.f23010b = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) ? 3 : 2];
        if (i7 == 1 || i7 == 2) {
            objArr[0] = "debugMessage";
        } else if (i7 == 3) {
            objArr[0] = "success";
        } else if (i7 != 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
        } else {
            objArr[0] = "debugMessage";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            case 5:
                objArr[1] = "getResult";
                break;
            case 6:
                objArr[1] = "getDebugMessage";
                break;
            default:
                objArr[1] = "success";
                break;
        }
        if (i7 == 1) {
            objArr[2] = "incompatible";
        } else if (i7 == 2) {
            objArr[2] = "conflict";
        } else if (i7 == 3 || i7 == 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    public static k c(String str) {
        return new k(j.f23005e, str);
    }

    public final j b() {
        j jVar = this.f23009a;
        if (jVar != null) {
            return jVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f23009a + ": " + this.f23010b;
    }
}
