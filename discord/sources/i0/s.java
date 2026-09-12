package i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f11311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s[] f11312e;

    /* JADX INFO: Fake field, exist only in values array */
    s EF0;

    static {
        s sVar = new s("InMeasureBlock", 0);
        s sVar2 = new s("InLayoutBlock", 1);
        s sVar3 = new s("NotUsed", 2);
        f11311d = sVar3;
        f11312e = new s[]{sVar, sVar2, sVar3};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f11312e.clone();
    }
}
