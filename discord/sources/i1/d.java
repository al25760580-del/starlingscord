package i1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11362e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f11363i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f11365w;

    public /* synthetic */ d(String str, Context context, Object obj, int i7, int i10) {
        this.f11361d = i10;
        this.f11362e = str;
        this.f11363i = context;
        this.f11365w = obj;
        this.f11364v = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11361d) {
            case 0:
                Object[] objArr = {(c) this.f11365w};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return f.b(this.f11362e, this.f11363i, Collections.unmodifiableList(arrayList), this.f11364v);
            default:
                try {
                    return f.b(this.f11362e, this.f11363i, (ArrayList) this.f11365w, this.f11364v);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
