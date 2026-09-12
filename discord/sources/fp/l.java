package fp;

import ag.t;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lq.z;
import net.time4j.tz.m;
import net.time4j.tz.o;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9355b;

    public l(z zVar, List list, ArrayList arrayList) {
        List list2 = Collections.EMPTY_LIST;
        if (zVar == null) {
            a(0);
            throw null;
        }
        if (list == null) {
            a(1);
            throw null;
        }
        if (list2 == null) {
            a(3);
            throw null;
        }
        this.f9354a = list;
        this.f9355b = list2;
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "valueParameters";
                break;
            case 2:
                objArr[0] = "typeParameters";
                break;
            case 3:
                objArr[0] = "signatureErrors";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                break;
            default:
                objArr[0] = "returnType";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getReturnType";
        } else if (i7 == 5) {
            objArr[1] = "getValueParameters";
        } else if (i7 == 6) {
            objArr[1] = "getTypeParameters";
        } else if (i7 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
        } else {
            objArr[1] = "getErrors";
        }
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public l() {
        ArrayList arrayList = new ArrayList(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        ArrayList arrayList2 = new ArrayList(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        arrayList.add(m.f16734w);
        Iterator it = net.time4j.tz.i.K.entrySet().iterator();
        while (it.hasNext()) {
            o oVar = (o) ((Map.Entry) it.next()).getValue();
            net.time4j.tz.h hVar = net.time4j.tz.i.F;
            if (oVar != hVar || net.time4j.tz.i.G == hVar) {
                Iterator it2 = oVar.a().iterator();
                while (it2.hasNext()) {
                    net.time4j.tz.f fVarC = net.time4j.tz.i.c((String) it2.next());
                    if (!arrayList.contains(fVarC)) {
                        arrayList.add(fVarC);
                    }
                }
                arrayList2.addAll(arrayList);
                Iterator it3 = oVar.b().keySet().iterator();
                while (it3.hasNext()) {
                    net.time4j.tz.f fVarC2 = net.time4j.tz.i.c((String) it3.next());
                    if (!arrayList2.contains(fVarC2)) {
                        arrayList2.add(fVarC2);
                    }
                }
            }
        }
        t tVar = net.time4j.tz.i.f16724e;
        Collections.sort(arrayList, tVar);
        Collections.sort(arrayList2, tVar);
        this.f9354a = Collections.unmodifiableList(arrayList);
        this.f9355b = Collections.unmodifiableList(arrayList2);
    }
}
