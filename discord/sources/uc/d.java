package uc;

import androidx.recyclerview.widget.h;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ei.c0;
import ei.e0;
import ei.p;
import ei.r0;
import ei.y;
import gc.h1;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f21037a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f21038b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f21039c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static h a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!je.b.C(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw h1.a("Couldn't find xmp metadata", null);
        }
        c0 c0Var = e0.f8303e;
        r0 r0VarB = r0.f8352w;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (je.b.C(xmlPullParserNewPullParser, "rdf:Description")) {
                int i7 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    String strW = je.b.w(xmlPullParserNewPullParser, f21037a[i10]);
                    if (strW != null) {
                        if (Integer.parseInt(strW) != 1) {
                            break loop0;
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                String strW2 = je.b.w(xmlPullParserNewPullParser, f21038b[i11]);
                                if (strW2 != null) {
                                    j = Long.parseLong(strW2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i11++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i7 >= 2) {
                                c0 c0Var2 = e0.f8303e;
                                r0VarB = r0.f8352w;
                                break;
                            }
                            String strW3 = je.b.w(xmlPullParserNewPullParser, f21039c[i7]);
                            if (strW3 != null) {
                                Object[] objArr = {new b(0L, 0L, ClipboardModule.MIMETYPE_JPEG), new b(Long.parseLong(strW3), 0L, "video/mp4")};
                                p.b(2, objArr);
                                r0VarB = e0.j(2, objArr);
                                break;
                            }
                            i7++;
                        }
                    }
                }
                return null;
            }
            if (je.b.C(xmlPullParserNewPullParser, "Container:Directory")) {
                r0VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (je.b.C(xmlPullParserNewPullParser, "GContainer:Directory")) {
                r0VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!je.b.B(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (r0VarB.isEmpty()) {
            break loop0;
        }
        return new h(j, r0VarB, 5);
        return null;
    }

    public static r0 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        c0 c0Var = e0.f8303e;
        p.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i7 = 0;
        boolean z5 = false;
        do {
            xmlPullParser.next();
            if (je.b.C(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strW = je.b.w(xmlPullParser, strConcat3);
                String strW2 = je.b.w(xmlPullParser, strConcat4);
                String strW3 = je.b.w(xmlPullParser, strConcat5);
                String strW4 = je.b.w(xmlPullParser, strConcat6);
                if (strW == null || strW2 == null) {
                    return r0.f8352w;
                }
                b bVar = new b(strW3 != null ? Long.parseLong(strW3) : 0L, strW4 != null ? Long.parseLong(strW4) : 0L, strW);
                int i10 = i7 + 1;
                if (objArrCopyOf.length < i10) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, y.d(objArrCopyOf.length, i10));
                } else {
                    if (z5) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i7] = bVar;
                    i7++;
                }
                z5 = false;
                objArrCopyOf[i7] = bVar;
                i7++;
            }
        } while (!je.b.B(xmlPullParser, strConcat2));
        return e0.j(i7, objArrCopyOf);
    }
}
