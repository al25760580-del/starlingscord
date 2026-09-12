package yr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x[] f23563d = {new o("ARABIC", 0, "latn"), new p("ARABIC_INDIC", 1, "arab"), new q("ARABIC_INDIC_EXT", 2, "arabext"), new r("BENGALI", 3, "beng"), new s("DEVANAGARI", 4, "deva"), new t("DOZENAL", 5, "dozenal"), new u("ETHIOPIC", 6, "ethiopic"), new v("GUJARATI", 7, "gujr"), new w("JAPANESE", 8, "jpan"), new i("KHMER", 9, "khmr"), new j("MYANMAR", 10, "mymr"), new k("ORYA", 11, "orya"), new l("ROMAN", 12, "roman"), new m("TELUGU", 13, "telu"), new n("THAI", 14, "thai")};
    private final String code;

    /* JADX INFO: Fake field, exist only in values array */
    x EF7;

    public x(String str, int i7, String str2) {
        super(str, i7);
        this.code = str2;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f23563d.clone();
    }

    public final String a() {
        return this.code;
    }
}
