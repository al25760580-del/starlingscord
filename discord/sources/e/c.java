package e;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements d3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7827b;

    public /* synthetic */ c(int i7, Object obj) {
        this.f7826a = i7;
        this.f7827b = obj;
    }

    @Override // d3.d
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.f7826a) {
            case 0:
                return ComponentActivity.c((ComponentActivity) this.f7827b);
            default:
                zl.e eVar = (zl.e) this.f7827b;
                for (Map.Entry entry : w0.m((LinkedHashMap) eVar.f24047v).entrySet()) {
                    eVar.i(((MutableStateFlow) entry.getValue()).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : w0.m((LinkedHashMap) eVar.f24045e).entrySet()) {
                    eVar.i(((d3.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f24044d;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle source = zs.a.f((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Intrinsics.checkNotNullParameter(source, "source");
                return source;
        }
    }
}
