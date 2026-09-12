package ub;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f20987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20995i;
    public final String j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f20996l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f20987a = num;
        this.f20988b = str;
        this.f20989c = str2;
        this.f20990d = str3;
        this.f20991e = str4;
        this.f20992f = str5;
        this.f20993g = str6;
        this.f20994h = str7;
        this.f20995i = str8;
        this.j = str9;
        this.k = str10;
        this.f20996l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f20987a;
            if (num != null ? num.equals(((h) aVar).f20987a) : ((h) aVar).f20987a == null) {
                String str = this.f20988b;
                if (str != null ? str.equals(((h) aVar).f20988b) : ((h) aVar).f20988b == null) {
                    String str2 = this.f20989c;
                    if (str2 != null ? str2.equals(((h) aVar).f20989c) : ((h) aVar).f20989c == null) {
                        String str3 = this.f20990d;
                        if (str3 != null ? str3.equals(((h) aVar).f20990d) : ((h) aVar).f20990d == null) {
                            String str4 = this.f20991e;
                            if (str4 != null ? str4.equals(((h) aVar).f20991e) : ((h) aVar).f20991e == null) {
                                String str5 = this.f20992f;
                                if (str5 != null ? str5.equals(((h) aVar).f20992f) : ((h) aVar).f20992f == null) {
                                    String str6 = this.f20993g;
                                    if (str6 != null ? str6.equals(((h) aVar).f20993g) : ((h) aVar).f20993g == null) {
                                        String str7 = this.f20994h;
                                        if (str7 != null ? str7.equals(((h) aVar).f20994h) : ((h) aVar).f20994h == null) {
                                            String str8 = this.f20995i;
                                            if (str8 != null ? str8.equals(((h) aVar).f20995i) : ((h) aVar).f20995i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((h) aVar).j) : ((h) aVar).j == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(((h) aVar).k) : ((h) aVar).k == null) {
                                                        String str11 = this.f20996l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f20996l) : ((h) aVar).f20996l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f20987a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f20988b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f20989c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20990d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f20991e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f20992f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f20993g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f20994h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f20995i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f20996l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f20987a);
        sb2.append(", model=");
        sb2.append(this.f20988b);
        sb2.append(", hardware=");
        sb2.append(this.f20989c);
        sb2.append(", device=");
        sb2.append(this.f20990d);
        sb2.append(", product=");
        sb2.append(this.f20991e);
        sb2.append(", osBuild=");
        sb2.append(this.f20992f);
        sb2.append(", manufacturer=");
        sb2.append(this.f20993g);
        sb2.append(", fingerprint=");
        sb2.append(this.f20994h);
        sb2.append(", locale=");
        sb2.append(this.f20995i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.k);
        sb2.append(", applicationBuild=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f20996l, "}");
    }
}
