package e9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final c E;
    public static final c F;
    public static final c G;
    public static final c H;
    public static final c I;
    public static final c J;
    public static final c K;
    public static final c L;
    public static final c M;
    public static final c N;
    public static final c O;
    public static final c P;
    public static final /* synthetic */ c[] Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f8114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f8115e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f8116i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f8117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f8118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f8119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f8120y;

    static {
        c cVar = new c("ON_SET_HIERARCHY", 0);
        f8114d = cVar;
        c cVar2 = new c("ON_CLEAR_HIERARCHY", 1);
        f8115e = cVar2;
        c cVar3 = new c("ON_SET_CONTROLLER", 2);
        f8116i = cVar3;
        c cVar4 = new c("ON_CLEAR_OLD_CONTROLLER", 3);
        f8117v = cVar4;
        c cVar5 = new c("ON_CLEAR_CONTROLLER", 4);
        f8118w = cVar5;
        c cVar6 = new c("ON_INIT_CONTROLLER", 5);
        f8119x = cVar6;
        c cVar7 = new c("ON_ATTACH_CONTROLLER", 6);
        f8120y = cVar7;
        c cVar8 = new c("ON_DETACH_CONTROLLER", 7);
        E = cVar8;
        c cVar9 = new c("ON_RELEASE_CONTROLLER", 8);
        F = cVar9;
        c cVar10 = new c("ON_DATASOURCE_SUBMIT", 9);
        G = cVar10;
        c cVar11 = new c("ON_DATASOURCE_RESULT", 10);
        H = cVar11;
        c cVar12 = new c("ON_DATASOURCE_RESULT_INT", 11);
        I = cVar12;
        c cVar13 = new c("ON_DATASOURCE_FAILURE", 12);
        J = cVar13;
        c cVar14 = new c("ON_DATASOURCE_FAILURE_INT", 13);
        K = cVar14;
        c cVar15 = new c("ON_HOLDER_ATTACH", 14);
        L = cVar15;
        c cVar16 = new c("ON_HOLDER_DETACH", 15);
        M = cVar16;
        c cVar17 = new c("ON_DRAWABLE_SHOW", 16);
        N = cVar17;
        c cVar18 = new c("ON_DRAWABLE_HIDE", 17);
        O = cVar18;
        c cVar19 = new c("ON_ACTIVITY_START", 18);
        c cVar20 = new c("ON_ACTIVITY_STOP", 19);
        c cVar21 = new c("ON_RUN_CLEAR_CONTROLLER", 20);
        c cVar22 = new c("ON_SCHEDULE_CLEAR_CONTROLLER", 21);
        c cVar23 = new c("ON_SAME_CONTROLLER_SKIPPED", 22);
        c cVar24 = new c("ON_SUBMIT_CACHE_HIT", 23);
        P = cVar24;
        Q = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) Q.clone();
    }
}
