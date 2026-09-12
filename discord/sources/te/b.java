package te;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b f20735e = new b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20736d;

    public /* synthetic */ b(int i7) {
        this.f20736d = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20736d) {
            case 0:
                break;
        }
        return ((Scope) obj).f5932e.compareTo(((Scope) obj2).f5932e);
    }
}
