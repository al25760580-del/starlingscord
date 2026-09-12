package y6;

import com.discord.intents.LinkingModule;
import com.facebook.react.bridge.Promise;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Promise f23210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23211c;

    public /* synthetic */ a(String str, int i7, Promise promise) {
        this.f23209a = i7;
        this.f23210b = promise;
        this.f23211c = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f23209a) {
            case 0:
                return LinkingModule.tryOpenUrlAsUniversalLink$lambda$3(this.f23210b, this.f23211c, (Throwable) obj);
            default:
                return LinkingModule.tryOpenScheme$lambda$7(this.f23210b, this.f23211c, (Throwable) obj);
        }
    }
}
