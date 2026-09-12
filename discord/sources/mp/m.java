package mp;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f15993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f15996d;

    public m(s sVar, ArrayList parametersInfo, String str) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.f15993a = sVar;
        this.f15994b = parametersInfo;
        this.f15995c = str;
        m mVar = null;
        if (str != null) {
            s sVarA = sVar != null ? sVar.a() : null;
            ArrayList arrayList = new ArrayList(e0.l(parametersInfo, 10));
            Iterator it = parametersInfo.iterator();
            while (it.hasNext()) {
                s sVar2 = (s) it.next();
                arrayList.add(sVar2 != null ? sVar2.a() : null);
            }
            mVar = new m(sVarA, arrayList, null);
        }
        this.f15996d = mVar;
    }
}
