package hk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final /* synthetic */ c[] E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f10926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f10927e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f10928i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f10929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f10930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f10931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f10932y;

    static {
        c cVar = new c("DAY", 0);
        f10926d = cVar;
        c cVar2 = new c("DATE", 1);
        f10927e = cVar2;
        c cVar3 = new c("MONTH", 2);
        f10928i = cVar3;
        c cVar4 = new c("YEAR", 3);
        f10929v = cVar4;
        c cVar5 = new c("HOUR", 4);
        f10930w = cVar5;
        c cVar6 = new c("MINUTE", 5);
        f10931x = cVar6;
        c cVar7 = new c("AM_PM", 6);
        f10932y = cVar7;
        E = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) E.clone();
    }
}
