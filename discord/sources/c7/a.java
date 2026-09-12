package c7;

import com.discord.minibsdiff.BSDiff;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3530e;

    public /* synthetic */ a(long j, int i7) {
        this.f3529d = i7;
        this.f3530e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3529d) {
            case 0:
                return Integer.valueOf(BSDiff.chunkRange$lambda$0(this.f3530e, ((Long) obj).longValue()));
            default:
                return Long.valueOf(this.f3530e);
        }
    }
}
