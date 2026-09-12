package po;

import java.lang.reflect.Method;
import java.util.Comparator;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18088d;

    public /* synthetic */ f(int i7) {
        this.f18088d = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f18088d) {
            case 0:
                return tn.a.a(((Method) obj).getName(), ((Method) obj2).getName());
            case 1:
                return tn.a.a(((x0) ((mo.m) obj)).getName(), ((x0) ((mo.m) obj2)).getName());
            default:
                Regex regex = g0.f18090d;
                Integer numB = vo.p.b((ep.p) obj, (ep.p) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
        }
    }
}
