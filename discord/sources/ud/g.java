package ud;

import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import java.util.LinkedList;
import je.e0;
import mc.i;
import md.z0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f21074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21077i;
    public long j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f21080n;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f21078l = -1;
        this.f21080n = null;
        this.f21074f = new LinkedList();
    }

    @Override // ud.d
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f21074f.add((b) obj);
        } else if (obj instanceof a) {
            je.b.k(this.f21080n == null);
            this.f21080n = (a) obj;
        }
    }

    @Override // ud.d
    public final Object b() {
        LinkedList linkedList = this.f21074f;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        a aVar = this.f21080n;
        if (aVar != null) {
            i iVar = new i(new mc.h(aVar.f21040a, null, "video/mp4", aVar.f21041b));
            for (int i7 = 0; i7 < size; i7++) {
                b bVar = bVarArr[i7];
                int i10 = bVar.f21043a;
                if (i10 == 2 || i10 == 1) {
                    Format[] formatArr = bVar.j;
                    for (int i11 = 0; i11 < formatArr.length; i11++) {
                        g0 g0VarA = formatArr[i11].a();
                        g0VarA.f9646n = iVar;
                        formatArr[i11] = new Format(g0VarA);
                    }
                }
            }
        }
        int i12 = this.f21075g;
        int i13 = this.f21076h;
        long j = this.f21077i;
        long j5 = this.j;
        long j7 = this.k;
        return new c(i12, i13, j5 == 0 ? -9223372036854775807L : e0.P(j5, 1000000L, j), j7 != 0 ? e0.P(j7, 1000000L, j) : -9223372036854775807L, this.f21078l, this.f21079m, this.f21080n, bVarArr);
    }

    @Override // ud.d
    public final void j(XmlPullParser xmlPullParser) throws h1 {
        this.f21075g = d.i(xmlPullParser, "MajorVersion");
        this.f21076h = d.i(xmlPullParser, "MinorVersion");
        this.f21077i = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new z0("Duration", 2);
        }
        try {
            this.j = Long.parseLong(attributeValue);
            this.k = d.h(xmlPullParser, "DVRWindowLength", 0L);
            this.f21078l = d.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f21079m = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.f21077i), "TimeScale");
        } catch (NumberFormatException e10) {
            throw h1.b(null, e10);
        }
    }
}
