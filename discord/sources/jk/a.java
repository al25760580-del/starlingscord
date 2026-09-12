package jk;

import com.facebook.react.bridge.Dynamic;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13917b;

    @Override // jk.c
    public final Object a(Dynamic dynamic) {
        switch (this.f13917b) {
            case 0:
                return dynamic.asString();
            case 1:
                return dynamic.asString();
            case 2:
                return Integer.valueOf(dynamic.asInt());
            case 3:
                return dynamic.asString();
            case 4:
                return hk.a.valueOf(dynamic.asString());
            case 5:
                return dynamic.asString();
            case 6:
                return dynamic.asString();
            case 7:
                return Integer.valueOf(dynamic.asInt());
            case 8:
                return hk.b.valueOf(dynamic.asString());
            case 9:
                return dynamic.asString();
            default:
                if (dynamic.isNull()) {
                    return null;
                }
                return dynamic.asString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Serializable serializable) {
        super(serializable);
        this.f13917b = 7;
    }
}
