package v3;

import com.discord.age_assurance.DigitalCredentialModule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f21435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f21436e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z f21437i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z f21438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z f21439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final z f21440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ z[] f21441y;

    static {
        z zVar = new z("ENQUEUED", 0);
        f21435d = zVar;
        z zVar2 = new z("RUNNING", 1);
        f21436e = zVar2;
        z zVar3 = new z("SUCCEEDED", 2);
        f21437i = zVar3;
        z zVar4 = new z(DigitalCredentialModule.CODE_FAILED, 3);
        f21438v = zVar4;
        z zVar5 = new z("BLOCKED", 4);
        f21439w = zVar5;
        z zVar6 = new z(DigitalCredentialModule.CODE_CANCELLED, 5);
        f21440x = zVar6;
        f21441y = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f21441y.clone();
    }

    public final boolean a() {
        return this == f21437i || this == f21438v || this == f21440x;
    }
}
