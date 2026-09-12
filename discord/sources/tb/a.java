package tb;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import sb.c;
import vb.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f20672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f20674f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20676b;

    static {
        String strQ = android.support.v4.media.session.b.q("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20671c = strQ;
        String strQ2 = android.support.v4.media.session.b.q("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strQ3 = android.support.v4.media.session.b.q("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20672d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f20673e = new a(strQ, null);
        f20674f = new a(strQ2, strQ3);
    }

    public a(String str, String str2) {
        this.f20675a = str;
        this.f20676b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
