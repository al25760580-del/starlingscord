package im;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f11997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f11998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f11999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f12000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f12001e;

    public /* synthetic */ z() {
        this(0.0d, 0.0d, 0.0d, 0.0d, -1.0d);
    }

    public final WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.f11997a);
        writableMapCreateMap.putDouble("tiltY", this.f11998b);
        writableMapCreateMap.putDouble("altitudeAngle", this.f11999c);
        writableMapCreateMap.putDouble("azimuthAngle", this.f12000d);
        writableMapCreateMap.putDouble("pressure", this.f12001e);
        return writableMapCreateMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Double.compare(this.f11997a, zVar.f11997a) == 0 && Double.compare(this.f11998b, zVar.f11998b) == 0 && Double.compare(this.f11999c, zVar.f11999c) == 0 && Double.compare(this.f12000d, zVar.f12000d) == 0 && Double.compare(this.f12001e, zVar.f12001e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f12001e) + com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(Double.hashCode(this.f11997a) * 31, this.f11998b, 31), this.f11999c, 31), this.f12000d, 31);
    }

    public final String toString() {
        return "StylusData(tiltX=" + this.f11997a + ", tiltY=" + this.f11998b + ", altitudeAngle=" + this.f11999c + ", azimuthAngle=" + this.f12000d + ", pressure=" + this.f12001e + ")";
    }

    public z(double d6, double d7, double d8, double d9, double d10) {
        this.f11997a = d6;
        this.f11998b = d7;
        this.f11999c = d8;
        this.f12000d = d9;
        this.f12001e = d10;
    }
}
