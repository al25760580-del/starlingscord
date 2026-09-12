package ud;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import xc.j;
import xc.p;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public UUID f21071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f21072h;

    @Override // ud.d
    public final Object b() {
        UUID uuid = this.f21071g;
        byte[] bArrA = j.a(uuid, null, this.f21072h);
        byte[] bArr = this.f21072h;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < bArr.length; i7 += 2) {
            sb2.append((char) bArr[i7]);
        }
        String string = sb2.toString();
        byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
        byte b10 = bArrDecode[0];
        bArrDecode[0] = bArrDecode[3];
        bArrDecode[3] = b10;
        byte b11 = bArrDecode[1];
        bArrDecode[1] = bArrDecode[2];
        bArrDecode[2] = b11;
        byte b12 = bArrDecode[4];
        bArrDecode[4] = bArrDecode[5];
        bArrDecode[5] = b12;
        byte b13 = bArrDecode[6];
        bArrDecode[6] = bArrDecode[7];
        bArrDecode[7] = b13;
        return new a(uuid, bArrA, new p[]{new p(true, null, 8, bArrDecode, 0, 0, null)});
    }

    @Override // ud.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // ud.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f21070f = false;
        }
    }

    @Override // ud.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f21070f = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f21071g = UUID.fromString(attributeValue);
        }
    }

    @Override // ud.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f21070f) {
            this.f21072h = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
