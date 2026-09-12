package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f22712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o[] f22713e;

    /* JADX INFO: Fake field, exist only in values array */
    o EF0;

    static {
        o oVar = new o("LONG", 0);
        o oVar2 = new o("LONGOFFSET", 1);
        o oVar3 = new o("LONGGENERIC", 2);
        o oVar4 = new o("SHORT", 3);
        o oVar5 = new o("SHORTOFFSET", 4);
        o oVar6 = new o("SHORTGENERIC", 5);
        o oVar7 = new o("UNDEFINED", 6);
        f22712d = oVar7;
        f22713e = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f22713e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (ordinal()) {
            case 0:
                return "long";
            case 1:
                return "longOffset";
            case 2:
                return "longGeneric";
            case 3:
                return "short";
            case 4:
                return "shortOffset";
            case 5:
                return "shortGeneric";
            case 6:
                return "";
            default:
                throw new IllegalArgumentException();
        }
    }
}
