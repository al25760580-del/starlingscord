package ud;

import com.google.android.exoplayer2.Format;
import gc.h1;
import java.util.ArrayList;
import java.util.LinkedList;
import je.e0;
import md.z0;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedList f21082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21084i;
    public long j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f21085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f21090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f21091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21092s;

    public h(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f21081f = str;
        this.f21082g = new LinkedList();
    }

    @Override // ud.d
    public final void a(Object obj) {
        if (obj instanceof Format) {
            this.f21082g.add((Format) obj);
        }
    }

    @Override // ud.d
    public final Object b() {
        LinkedList linkedList = this.f21082g;
        Format[] formatArr = new Format[linkedList.size()];
        linkedList.toArray(formatArr);
        String str = this.f21085l;
        int i7 = this.f21083h;
        String str2 = this.f21084i;
        long j = this.j;
        String str3 = this.k;
        int i10 = this.f21086m;
        int i11 = this.f21087n;
        int i12 = this.f21088o;
        int i13 = this.f21089p;
        String str4 = this.f21090q;
        ArrayList arrayList = this.f21091r;
        long j5 = this.f21092s;
        int i14 = e0.f13788a;
        int size = arrayList.size();
        long[] jArr = new long[size];
        if (j >= 1000000 && j % 1000000 == 0) {
            long j7 = j / 1000000;
            for (int i15 = 0; i15 < size; i15++) {
                jArr[i15] = ((Long) arrayList.get(i15)).longValue() / j7;
            }
        } else if (j >= 1000000 || 1000000 % j != 0) {
            double d6 = 1000000 / j;
            int i16 = 0;
            while (i16 < size) {
                double d7 = d6;
                jArr[i16] = (long) (((Long) arrayList.get(i16)).longValue() * d7);
                i16++;
                d6 = d7;
            }
        } else {
            long j10 = 1000000 / j;
            for (int i17 = 0; i17 < size; i17++) {
                jArr[i17] = ((Long) arrayList.get(i17)).longValue() * j10;
            }
        }
        return new b(this.f21081f, str, i7, str2, j, str3, i10, i11, i12, i13, str4, formatArr, arrayList, jArr, e0.P(j5, 1000000L, j));
    }

    @Override // ud.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // ud.d
    public final void j(XmlPullParser xmlPullParser) throws h1 {
        int i7 = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new z0("Type", 2);
            }
            if (!MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                if (MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                    i7 = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw h1.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i7 = 3;
                }
            }
            this.f21083h = i7;
            l(Integer.valueOf(i7), "Type");
            if (this.f21083h == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new z0("Subtype", 2);
                }
                this.f21084i = attributeValue2;
            } else {
                this.f21084i = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.f21084i, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.k = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new z0("Url", 2);
            }
            this.f21085l = attributeValue4;
            this.f21086m = d.g(xmlPullParser, "MaxWidth");
            this.f21087n = d.g(xmlPullParser, "MaxHeight");
            this.f21088o = d.g(xmlPullParser, "DisplayWidth");
            this.f21089p = d.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f21090q = attributeValue5;
            l(attributeValue5, "Language");
            long jG = d.g(xmlPullParser, "TimeScale");
            this.j = jG;
            if (jG == -1) {
                this.j = ((Long) c("TimeScale")).longValue();
            }
            this.f21091r = new ArrayList();
            return;
        }
        int size = this.f21091r.size();
        long jH = d.h(xmlPullParser, "t", -9223372036854775807L);
        if (jH == -9223372036854775807L) {
            if (size == 0) {
                jH = 0;
            } else {
                if (this.f21092s == -1) {
                    throw h1.b("Unable to infer start time", null);
                }
                jH = this.f21092s + ((Long) this.f21091r.get(size - 1)).longValue();
            }
        }
        this.f21091r.add(Long.valueOf(jH));
        this.f21092s = d.h(xmlPullParser, "d", -9223372036854775807L);
        long jH2 = d.h(xmlPullParser, "r", 1L);
        if (jH2 > 1 && this.f21092s == -9223372036854775807L) {
            throw h1.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j = i7;
            if (j >= jH2) {
                return;
            }
            this.f21091r.add(Long.valueOf((this.f21092s * j) + jH));
            i7++;
        }
    }
}
