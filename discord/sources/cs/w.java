package cs;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f7499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f7500c;

    public w(a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f7498a = address;
        this.f7499b = proxy;
        this.f7500c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(wVar.f7498a, this.f7498a) && Intrinsics.areEqual(wVar.f7499b, this.f7499b) && Intrinsics.areEqual(wVar.f7500c, this.f7500c);
    }

    public final int hashCode() {
        return this.f7500c.hashCode() + ((this.f7499b.hashCode() + ((this.f7498a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f7500c + '}';
    }
}
