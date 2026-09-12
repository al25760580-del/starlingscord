package ir;

import com.discord.age_assurance.DigitalCredentialModule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f13430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f13431e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f13432i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f13433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ i[] f13434w;

    static {
        i iVar = new i("SUCCESSFUL", 0);
        f13430d = iVar;
        i iVar2 = new i("REREGISTER", 1);
        f13431e = iVar2;
        i iVar3 = new i(DigitalCredentialModule.CODE_CANCELLED, 2);
        f13432i = iVar3;
        i iVar4 = new i("ALREADY_SELECTED", 3);
        f13433v = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f13434w = iVarArr;
        com.facebook.imagepipeline.nativecode.b.l(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f13434w.clone();
    }
}
