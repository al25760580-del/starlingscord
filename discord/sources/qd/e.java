package qd;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.Format;
import ei.c0;
import ei.r0;
import gc.g0;
import gc.h1;
import he.m0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends DefaultHandler implements m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f18734e = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f18735i = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f18736v = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f18737w = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final XmlPullParserFactory f18738d;

    public e() {
        try {
            this.f18738d = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j, long j5, int i7, long j7) {
        int i10;
        if (i7 >= 0) {
            i10 = i7 + 1;
        } else {
            int i11 = e0.f13788a;
            i10 = (int) ((((j7 - j) + j5) - 1) / j5);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList.add(new q(j, j5));
            j += j5;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i7 = 1;
            while (i7 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i7++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i7--;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0085 A[PHI: r0
      0x0085: PHI (r0v18 int) = (r0v5 int), (r0v21 int) binds: [B:91:0x0108, B:43:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    public static int c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i7 = 6;
        byte b10 = 3;
        int i10 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount > 0 && iBitCount < 33) {
                    i10 = iBitCount;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null) {
                    i10 = Integer.parseInt(attributeValue3);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    String strT = m3.m.T(attributeValue4);
                    strT.getClass();
                    switch (strT.hashCode()) {
                        case 1596796:
                            b10 = !strT.equals("4000") ? (byte) -1 : (byte) 0;
                            break;
                        case 2937391:
                            b10 = !strT.equals("a000") ? (byte) -1 : (byte) 1;
                            break;
                        case 3094035:
                            b10 = !strT.equals("f801") ? (byte) -1 : (byte) 2;
                            break;
                        case 3133436:
                            if (!strT.equals("fa01")) {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            i7 = 1;
                            break;
                        case 1:
                            i7 = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i7 = 8;
                            break;
                        default:
                            i7 = -1;
                            break;
                    }
                } else {
                    i7 = -1;
                }
                i10 = i7;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int i11 = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (i11 >= 0) {
                    int[] iArr = f18737w;
                    if (i11 < iArr.length) {
                        i10 = iArr[i11];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 != null && (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue6, 16))) != 0) {
                    i10 = iBitCount;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!je.b.B(xmlPullParser, "AudioChannelConfiguration"));
        return i10;
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        return "INF".equals(attributeValue) ? LongCompanionObject.MAX_VALUE : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z5) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i7 = attributeValue != null ? Integer.parseInt(attributeValue) : z5 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i10 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!je.b.B(xmlPullParser, "BaseURL"));
        if (text != null && je.b.x(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return ei.p.m(new b(text, attributeValue3, i7, i10));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b bVar = (b) arrayList.get(i11);
            String strJ = je.b.J(bVar.f18711a, text);
            String str = attributeValue3 == null ? strJ : attributeValue3;
            if (z5) {
                i7 = bVar.f18713c;
                i10 = bVar.f18714d;
                str = bVar.f18712b;
            }
            arrayList2.add(new b(strJ, str, i7, i10));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static Pair f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? A;
        UUID uuid3;
        String attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue4 != null) {
            String strT = m3.m.T(attributeValue4);
            strT.getClass();
            switch (strT) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = gc.h.f9671c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = gc.h.f9673e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = gc.h.f9672d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= attributeCount) {
                            attributeValue3 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i7);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue3 = xmlPullParser.getAttributeValue(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue3) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                        String[] strArrSplit = attributeValue3.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                            uuidArr[i10] = UUID.fromString(strArrSplit[i10]);
                        }
                        uuid = gc.h.f9670b;
                        attributeValue2 = 0;
                        A = xc.j.a(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        A = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            A = uuid2;
        }
        do {
            xmlPullParser.next();
            if (je.b.C(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                A = A;
                attributeValue2 = xmlPullParser.getText();
            } else if (je.b.C(xmlPullParser, "ms:laurl")) {
                A = A;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (A == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    a1.d dVarE = xc.j.e(bArrDecode);
                    UUID uuid4 = dVarE == null ? null : (UUID) dVarE.f18i;
                    if (uuid4 == null) {
                        je.b.N("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        A = 0;
                        attributeValue2 = attributeValue2;
                    } else {
                        UUID uuid5 = uuid4;
                        A = bArrDecode;
                        uuid = uuid5;
                        attributeValue2 = attributeValue2;
                    }
                } else if (A == 0) {
                    uuid3 = gc.h.f9673e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        A = A;
                        attributeValue2 = attributeValue2;
                    } else {
                        b(xmlPullParser);
                        A = A;
                        attributeValue2 = attributeValue2;
                    }
                } else {
                    b(xmlPullParser);
                    A = A;
                    attributeValue2 = attributeValue2;
                }
            } else if (A == 0) {
                uuid3 = gc.h.f9673e;
                if (!uuid3.equals(uuid) && je.b.C(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    A = xc.j.a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    b(xmlPullParser);
                    A = A;
                    attributeValue2 = attributeValue2;
                }
            } else {
                b(xmlPullParser);
                A = A;
                attributeValue2 = attributeValue2;
            }
        } while (!je.b.B(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new mc.h(uuid, attributeValue2, "video/mp4", A) : null);
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, StackTraceHelper.ID_KEY);
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!je.b.B(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = e0.f13795h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d6 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d7 = d6 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d8 = d7 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d9 = d8 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d10 = d9 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j5 = (long) ((d10 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j5 : j5;
    }

    public static float k(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f18734e.matcher(attributeValue);
            if (matcher.matches()) {
                int i7 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i7 / Integer.parseInt(strGroup) : i7;
            }
        }
        return f2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:291:0x0853  */
    /* JADX WARN: Code duplicated, block: B:293:0x085a  */
    /* JADX WARN: Code duplicated, block: B:295:0x0860  */
    /* JADX WARN: Code duplicated, block: B:296:0x0865  */
    /* JADX WARN: Code duplicated, block: B:301:0x0876  */
    /* JADX WARN: Code duplicated, block: B:304:0x0884  */
    /* JADX WARN: Code duplicated, block: B:306:0x0890  */
    /* JADX WARN: Code duplicated, block: B:307:0x0893  */
    /* JADX WARN: Code duplicated, block: B:310:0x089c  */
    /* JADX WARN: Code duplicated, block: B:313:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:315:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:317:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:328:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:332:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:334:0x090a  */
    /* JADX WARN: Code duplicated, block: B:336:0x090e  */
    /* JADX WARN: Code duplicated, block: B:337:0x0910  */
    /* JADX WARN: Code duplicated, block: B:348:0x0935  */
    /* JADX WARN: Code duplicated, block: B:350:0x0945  */
    /* JADX WARN: Code duplicated, block: B:355:0x0959  */
    /* JADX WARN: Code duplicated, block: B:357:0x0973  */
    /* JADX WARN: Code duplicated, block: B:359:0x097d  */
    /* JADX WARN: Code duplicated, block: B:361:0x0987 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:362:0x0989  */
    /* JADX WARN: Code duplicated, block: B:363:0x098b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0992  */
    /* JADX WARN: Code duplicated, block: B:366:0x0994  */
    /* JADX WARN: Code duplicated, block: B:369:0x099d  */
    /* JADX WARN: Code duplicated, block: B:370:0x099f  */
    /* JADX WARN: Code duplicated, block: B:373:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:374:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:377:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:378:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:381:0x09be  */
    /* JADX WARN: Code duplicated, block: B:382:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:385:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:388:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:389:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:390:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:391:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:392:0x09da  */
    /* JADX WARN: Code duplicated, block: B:397:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:399:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:402:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:403:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:415:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:419:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:420:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:423:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:424:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:427:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:429:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:431:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:434:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:436:0x0ad8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:442:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:444:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:447:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:449:0x0b21 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:455:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:457:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:459:0x0b53  */
    /* JADX WARN: Code duplicated, block: B:462:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:463:0x0b61  */
    /* JADX WARN: Code duplicated, block: B:466:0x0b7a  */
    /* JADX WARN: Code duplicated, block: B:468:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:472:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:474:0x0b9d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:475:0x0b9f  */
    /* JADX WARN: Code duplicated, block: B:476:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:481:0x0bc7 A[LOOP:11: B:246:0x0640->B:481:0x0bc7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:515:0x0d56  */
    /* JADX WARN: Code duplicated, block: B:517:0x0d66  */
    /* JADX WARN: Code duplicated, block: B:520:0x0d6c  */
    /* JADX WARN: Code duplicated, block: B:523:0x0d7f  */
    /* JADX WARN: Code duplicated, block: B:526:0x0d87  */
    /* JADX WARN: Code duplicated, block: B:535:0x0db0  */
    /* JADX WARN: Code duplicated, block: B:538:0x0db8  */
    /* JADX WARN: Code duplicated, block: B:543:0x0ddf  */
    /* JADX WARN: Code duplicated, block: B:547:0x0df2  */
    /* JADX WARN: Code duplicated, block: B:550:0x0dfd  */
    /* JADX WARN: Code duplicated, block: B:553:0x0e05  */
    /* JADX WARN: Code duplicated, block: B:564:0x0e2e  */
    /* JADX WARN: Code duplicated, block: B:567:0x0e4c  */
    /* JADX WARN: Code duplicated, block: B:569:0x0e62  */
    /* JADX WARN: Code duplicated, block: B:571:0x0e70  */
    /* JADX WARN: Code duplicated, block: B:576:0x0eba A[LOOP:5: B:161:0x03e9->B:576:0x0eba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:670:0x11e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:671:0x11ea  */
    /* JADX WARN: Code duplicated, block: B:674:0x1207  */
    /* JADX WARN: Code duplicated, block: B:676:0x1213  */
    /* JADX WARN: Code duplicated, block: B:678:0x1217  */
    /* JADX WARN: Code duplicated, block: B:681:0x1223 A[LOOP:4: B:130:0x02cb->B:681:0x1223, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:687:0x125f  */
    /* JADX WARN: Code duplicated, block: B:689:0x1263  */
    /* JADX WARN: Code duplicated, block: B:691:0x1267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:693:0x126a  */
    /* JADX WARN: Code duplicated, block: B:697:0x1278  */
    /* JADX WARN: Code duplicated, block: B:699:0x1288  */
    /* JADX WARN: Code duplicated, block: B:701:0x128f A[LOOP:1: B:45:0x00cd->B:701:0x128f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:707:0x0e8b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x11ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x125b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x11cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x0d45 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x0da6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x0e23 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x084b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x08dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x0924 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x094d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x09dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x0a4e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x0b45 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:0x0afa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x0b45 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:0x0b42 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static c l(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        int i7;
        boolean z5;
        int i10;
        long j;
        ArrayList arrayList;
        long j5;
        int i11;
        long j7;
        ArrayList arrayList2;
        long j10;
        ArrayList arrayList3;
        String str;
        long j11;
        long j12;
        String str2;
        String str3;
        String str4;
        long j13;
        long j14;
        ArrayList arrayList4;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j15;
        ArrayList arrayList7;
        long j16;
        int i12;
        int i13;
        float f2;
        int i14;
        String str9;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str10;
        ArrayList arrayList11;
        String str11;
        int i15;
        String str12;
        String str13;
        int i16;
        int i17;
        String str14;
        String str15;
        ArrayList arrayList12;
        long j17;
        long j18;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        s sVarR;
        int i18;
        String str16;
        String strD;
        String str17;
        ArrayList arrayList16;
        long j19;
        String str18;
        int i19;
        int i20;
        ArrayList arrayList17;
        int i21;
        int iN;
        int i22;
        int i23;
        ArrayList arrayList18;
        int i24;
        Pair pairCreate;
        g0 g0Var;
        int iIntValue;
        int iIntValue2;
        int i25;
        int i26;
        String str19;
        int i27;
        int i28;
        String str20;
        s rVar;
        ArrayList arrayList19;
        int iH;
        int i29;
        boolean z6;
        f fVar;
        String str21;
        String[] strArrSplit;
        f fVar2;
        String str22;
        String str23;
        int i30;
        int iN2;
        f fVar3;
        f fVar4;
        String str24;
        int i31;
        int i32;
        String str25;
        ArrayList arrayList20;
        int i33;
        ArrayList arrayList21;
        g0 g0VarA;
        String str26;
        ArrayList arrayList22;
        String str27;
        long j20;
        ArrayList arrayList23;
        Format format;
        ei.e0 e0Var;
        s sVar;
        ArrayList arrayList24;
        ArrayList arrayList25;
        m kVar;
        int i34;
        String str28;
        int i35;
        mc.h hVar;
        int size;
        mc.h hVar2;
        int i36;
        mc.h hVar3;
        mc.h hVar4;
        Pair pairCreate2;
        h hVar5;
        long jLongValue;
        long j21;
        int i37 = 0;
        String[] strArrSplit2 = new String[0];
        String str29 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit2 = attributeValue.split(",");
        }
        int length = strArrSplit2.length;
        int i38 = 0;
        while (true) {
            i7 = 1;
            if (i38 >= length) {
                z5 = false;
                break;
            }
            if (strArrSplit2[i38].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z5 = true;
                break;
            }
            i38++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j22 = -9223372036854775807L;
        long jL = attributeValue2 == null ? -9223372036854775807L : e0.L(attributeValue2);
        long jI = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jI2 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jI3 = zEquals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jI4 = zEquals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jI5 = zEquals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long jL2 = attributeValue3 == null ? -9223372036854775807L : e0.L(attributeValue3);
        long jD = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListM = ei.p.m(new b(uri.toString(), uri.toString(), z5 ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList26 = new ArrayList();
        ArrayList arrayList27 = new ArrayList();
        long j23 = zEquals ? -9223372036854775807L : 0L;
        int i39 = 0;
        int i40 = 0;
        i iVar = null;
        io.sentry.internal.debugmeta.c cVar = null;
        Uri uriK = null;
        t tVar = null;
        while (true) {
            xmlPullParser.next();
            String str30 = "BaseURL";
            if (je.b.C(xmlPullParser, "BaseURL")) {
                if (i39 == 0) {
                    jD = d(xmlPullParser, jD);
                    i39 = i7;
                }
                arrayList27.addAll(e(xmlPullParser, arrayListM, z5));
                arrayList = arrayListM;
                j23 = j23;
                z5 = z5;
                i11 = i37;
                i10 = i7;
                arrayList26 = arrayList26;
                j = j22;
            } else {
                i10 = i7;
                j = j22;
                String str31 = "lang";
                if (je.b.C(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str29, "moreInformationURL");
                    String str32 = attributeValue4 == null ? str29 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str29, "lang");
                    String str33 = attributeValue5 == null ? str29 : attributeValue5;
                    String strNextText = str29;
                    String strNextText2 = strNextText;
                    String strNextText3 = strNextText2;
                    while (true) {
                        xmlPullParser.next();
                        if (je.b.C(xmlPullParser, "Title")) {
                            strNextText = xmlPullParser.nextText();
                        } else if (je.b.C(xmlPullParser, "Source")) {
                            strNextText2 = xmlPullParser.nextText();
                        } else if (je.b.C(xmlPullParser, "Copyright")) {
                            strNextText3 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str34 = strNextText;
                        String str35 = strNextText2;
                        String str36 = strNextText3;
                        if (je.b.B(xmlPullParser, "ProgramInformation")) {
                            arrayList = arrayListM;
                            iVar = new i(str34, str35, str36, str32, str33);
                        } else {
                            strNextText = str34;
                            strNextText2 = str35;
                            strNextText3 = str36;
                        }
                    }
                } else {
                    if (je.b.C(xmlPullParser, "UTCTiming")) {
                        arrayList = arrayListM;
                        j23 = j23;
                        cVar = new io.sentry.internal.debugmeta.c(xmlPullParser.getAttributeValue(str29, "schemeIdUri"), xmlPullParser.getAttributeValue(str29, "value"), 18, false);
                        z5 = z5;
                        i11 = 0;
                        arrayList26 = arrayList26;
                        j = j;
                    } else if (je.b.C(xmlPullParser, "Location")) {
                        uriK = je.b.K(uri.toString(), xmlPullParser.nextText());
                        arrayList = arrayListM;
                    } else if (je.b.C(xmlPullParser, "ServiceDescription")) {
                        long j24 = j;
                        long j25 = j24;
                        long j26 = j25;
                        float f7 = -3.4028235E38f;
                        float f10 = -3.4028235E38f;
                        while (true) {
                            xmlPullParser.next();
                            if (je.b.C(xmlPullParser, "Latency")) {
                                arrayList = arrayListM;
                                String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                j24 = attributeValue6 == null ? j : Long.parseLong(attributeValue6);
                                String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                j25 = attributeValue7 == null ? j : Long.parseLong(attributeValue7);
                                String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                j26 = attributeValue8 == null ? j : Long.parseLong(attributeValue8);
                            } else {
                                arrayList = arrayListM;
                                if (je.b.C(xmlPullParser, "PlaybackRate")) {
                                    String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                    f7 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                    String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                    f10 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                }
                            }
                            float f11 = f7;
                            float f12 = f10;
                            long j27 = j24;
                            long j28 = j25;
                            long j29 = j26;
                            if (je.b.B(xmlPullParser, "ServiceDescription")) {
                                tVar = new t(j27, j28, j29, f11, f12);
                            } else {
                                arrayListM = arrayList;
                                j24 = j27;
                                j25 = j28;
                                j26 = j29;
                                f7 = f11;
                                f10 = f12;
                            }
                        }
                    } else {
                        arrayList = arrayListM;
                        if (je.b.C(xmlPullParser, "Period") && i40 == 0) {
                            ArrayList arrayList28 = !arrayList27.isEmpty() ? arrayList27 : arrayList;
                            String str37 = StackTraceHelper.ID_KEY;
                            j5 = jD;
                            String attributeValue11 = xmlPullParser.getAttributeValue(null, StackTraceHelper.ID_KEY);
                            long jI6 = i(xmlPullParser, ViewProps.START, j23);
                            String str38 = "Period";
                            long j30 = jL != j ? jL + jI6 : j;
                            long jI7 = i(xmlPullParser, "duration", j);
                            String str39 = "duration";
                            ArrayList arrayList29 = new ArrayList();
                            String str40 = "value";
                            ArrayList arrayList30 = new ArrayList();
                            ArrayList arrayList31 = new ArrayList();
                            long j31 = j;
                            ArrayList arrayList32 = arrayList29;
                            String str41 = "schemeIdUri";
                            long jD2 = j5;
                            int i41 = 0;
                            s sVarR2 = null;
                            while (true) {
                                xmlPullParser.next();
                                if (je.b.C(xmlPullParser, str30)) {
                                    if (i41 == 0) {
                                        jD2 = d(xmlPullParser, jD2);
                                        i41 = i10;
                                    }
                                    arrayList31.addAll(e(xmlPullParser, arrayList28, z5));
                                    long j32 = jI7;
                                    arrayList27 = arrayList27;
                                    j12 = j32;
                                    arrayList3 = arrayList28;
                                    str31 = str31;
                                    str = str37;
                                    j23 = j23;
                                    str30 = str30;
                                    arrayList2 = arrayList31;
                                    j10 = jD2;
                                    j11 = j30;
                                    j = -9223372036854775807L;
                                    i11 = 0;
                                    z5 = z5;
                                } else {
                                    arrayList2 = arrayList31;
                                    j10 = jD2;
                                    if (je.b.C(xmlPullParser, "AdaptationSet")) {
                                        if (arrayList2.isEmpty()) {
                                            arrayList4 = arrayList28;
                                            arrayList3 = arrayList4;
                                        } else {
                                            arrayList3 = arrayList28;
                                            arrayList4 = arrayList2;
                                        }
                                        String attributeValue12 = xmlPullParser.getAttributeValue(null, str37);
                                        long j33 = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                        int iG = g(xmlPullParser);
                                        String str42 = "SegmentTemplate";
                                        String str43 = "mimeType";
                                        String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                        String str44 = "AdaptationSet";
                                        String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                        ArrayList arrayList33 = arrayList27;
                                        String attributeValue15 = xmlPullParser.getAttributeValue(null, "width");
                                        int i42 = attributeValue15 == null ? -1 : Integer.parseInt(attributeValue15);
                                        j23 = j23;
                                        String attributeValue16 = xmlPullParser.getAttributeValue(null, "height");
                                        int i43 = attributeValue16 == null ? -1 : Integer.parseInt(attributeValue16);
                                        float fK = k(xmlPullParser, -1.0f);
                                        long j34 = jI4;
                                        String attributeValue17 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                        int i44 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                        String attributeValue18 = xmlPullParser.getAttributeValue(null, str31);
                                        String attributeValue19 = xmlPullParser.getAttributeValue(null, "label");
                                        ArrayList arrayList34 = new ArrayList();
                                        String text = attributeValue19;
                                        ArrayList arrayList35 = new ArrayList();
                                        ArrayList arrayList36 = new ArrayList();
                                        String str45 = "SegmentList";
                                        ArrayList arrayList37 = new ArrayList();
                                        String str46 = "SegmentBase";
                                        ArrayList arrayList38 = new ArrayList();
                                        String str47 = "audioSamplingRate";
                                        ArrayList arrayList39 = new ArrayList();
                                        float f13 = fK;
                                        ArrayList arrayList40 = new ArrayList();
                                        ArrayList arrayList41 = new ArrayList();
                                        String str48 = "height";
                                        String str49 = str37;
                                        String str50 = "codecs";
                                        String str51 = "width";
                                        s sVarR3 = sVarR2;
                                        long j35 = j31;
                                        long jD3 = j10;
                                        int i45 = iG;
                                        String str52 = attributeValue18;
                                        int i46 = 0;
                                        String str53 = null;
                                        int iC = -1;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (je.b.C(xmlPullParser, str30)) {
                                                if (i46 == 0) {
                                                    jD3 = d(xmlPullParser, jD3);
                                                    i46 = i10;
                                                }
                                                jD3 = jD3;
                                                arrayList41.addAll(e(xmlPullParser, arrayList4, z5));
                                            } else {
                                                jD3 = jD3;
                                                if (je.b.C(xmlPullParser, "ContentProtection")) {
                                                    Pair pairF = f(xmlPullParser);
                                                    Object obj = pairF.first;
                                                    if (obj != null) {
                                                        str53 = (String) obj;
                                                    }
                                                    Object obj2 = pairF.second;
                                                    if (obj2 != null) {
                                                        arrayList34.add((mc.h) obj2);
                                                    }
                                                } else if (je.b.C(xmlPullParser, "ContentComponent")) {
                                                    String attributeValue20 = xmlPullParser.getAttributeValue(null, str31);
                                                    if (str52 == null) {
                                                        str52 = attributeValue20;
                                                    } else if (attributeValue20 != null) {
                                                        je.b.k(str52.equals(attributeValue20));
                                                    }
                                                    int iG2 = g(xmlPullParser);
                                                    if (i45 == -1) {
                                                        i45 = iG2;
                                                    } else if (iG2 != -1) {
                                                        je.b.k(i45 == iG2 ? i10 : 0);
                                                    }
                                                    str31 = str31;
                                                    jD3 = jD3;
                                                    i11 = 0;
                                                    i12 = i45;
                                                    arrayList6 = arrayList41;
                                                    z5 = z5;
                                                    text = text;
                                                    arrayList5 = arrayList4;
                                                    j12 = jI7;
                                                    arrayList27 = arrayList33;
                                                    arrayList7 = arrayList36;
                                                    j15 = j34;
                                                } else {
                                                    if (je.b.C(xmlPullParser, "Role")) {
                                                        arrayList37.add(h(xmlPullParser, "Role"));
                                                        str5 = str52;
                                                    } else {
                                                        String str54 = "AudioChannelConfiguration";
                                                        if (je.b.C(xmlPullParser, "AudioChannelConfiguration")) {
                                                            iC = c(xmlPullParser);
                                                            jD3 = jD3;
                                                            i11 = 0;
                                                            i12 = i45;
                                                            arrayList6 = arrayList41;
                                                            z5 = z5;
                                                            text = text;
                                                            arrayList5 = arrayList4;
                                                            j12 = jI7;
                                                            arrayList27 = arrayList33;
                                                            arrayList7 = arrayList36;
                                                            j15 = j34;
                                                        } else {
                                                            str5 = str52;
                                                            if (je.b.C(xmlPullParser, "Accessibility")) {
                                                                arrayList36.add(h(xmlPullParser, "Accessibility"));
                                                            } else if (je.b.C(xmlPullParser, "EssentialProperty")) {
                                                                arrayList38.add(h(xmlPullParser, "EssentialProperty"));
                                                            } else {
                                                                arrayList37 = arrayList37;
                                                                if (je.b.C(xmlPullParser, "SupplementalProperty")) {
                                                                    arrayList39.add(h(xmlPullParser, "SupplementalProperty"));
                                                                    str43 = str43;
                                                                    j30 = j30;
                                                                    str42 = str42;
                                                                    str7 = str44;
                                                                    arrayList35 = arrayList35;
                                                                    str45 = str45;
                                                                    str46 = str46;
                                                                    str47 = str47;
                                                                    f13 = f13;
                                                                    str48 = str48;
                                                                    str51 = str51;
                                                                    str49 = str49;
                                                                    j16 = j35;
                                                                    i11 = 0;
                                                                    arrayList6 = arrayList41;
                                                                    z5 = z5;
                                                                    arrayList5 = arrayList4;
                                                                    j12 = jI7;
                                                                    arrayList27 = arrayList33;
                                                                    arrayList7 = arrayList36;
                                                                    j15 = j34;
                                                                    str5 = str5;
                                                                    j35 = j16;
                                                                    text = text;
                                                                    str52 = str5;
                                                                    i12 = i45;
                                                                    str44 = str7;
                                                                } else {
                                                                    String str55 = "SupplementalProperty";
                                                                    String str56 = "Representation";
                                                                    String str57 = "InbandEventStream";
                                                                    if (je.b.C(xmlPullParser, "Representation")) {
                                                                        ArrayList arrayList42 = !arrayList41.isEmpty() ? arrayList41 : arrayList4;
                                                                        str31 = str31;
                                                                        String str58 = "ContentProtection";
                                                                        String str59 = str49;
                                                                        String str60 = "EssentialProperty";
                                                                        String attributeValue21 = xmlPullParser.getAttributeValue(null, str59);
                                                                        String str61 = str59;
                                                                        String attributeValue22 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                        int i47 = attributeValue22 == null ? -1 : Integer.parseInt(attributeValue22);
                                                                        String attributeValue23 = xmlPullParser.getAttributeValue(null, str43);
                                                                        String str62 = str50;
                                                                        int i48 = i47;
                                                                        String str63 = attributeValue23 == null ? attributeValue13 : attributeValue23;
                                                                        String attributeValue24 = xmlPullParser.getAttributeValue(null, str62);
                                                                        String str64 = str62;
                                                                        str51 = str51;
                                                                        String str65 = attributeValue24 == null ? attributeValue14 : attributeValue24;
                                                                        String attributeValue25 = xmlPullParser.getAttributeValue(null, str51);
                                                                        if (attributeValue25 == null) {
                                                                            str48 = str48;
                                                                            i13 = i42;
                                                                        } else {
                                                                            str48 = str48;
                                                                            i13 = Integer.parseInt(attributeValue25);
                                                                        }
                                                                        String attributeValue26 = xmlPullParser.getAttributeValue(null, str48);
                                                                        if (attributeValue26 == null) {
                                                                            f2 = f13;
                                                                            i14 = i43;
                                                                        } else {
                                                                            f2 = f13;
                                                                            i14 = Integer.parseInt(attributeValue26);
                                                                        }
                                                                        int i49 = i13;
                                                                        float fK2 = k(xmlPullParser, f2);
                                                                        f13 = f2;
                                                                        String str66 = str47;
                                                                        String attributeValue27 = xmlPullParser.getAttributeValue(null, str66);
                                                                        int i50 = attributeValue27 == null ? i44 : Integer.parseInt(attributeValue27);
                                                                        ArrayList arrayList43 = new ArrayList();
                                                                        ArrayList arrayList44 = new ArrayList();
                                                                        ArrayList arrayList45 = new ArrayList(arrayList38);
                                                                        arrayList38 = arrayList38;
                                                                        ArrayList arrayList46 = new ArrayList(arrayList39);
                                                                        ArrayList arrayList47 = new ArrayList();
                                                                        int i51 = i50;
                                                                        String str67 = str66;
                                                                        int i52 = i45;
                                                                        ArrayList arrayList48 = arrayList34;
                                                                        s sVarP = sVarR3;
                                                                        long j36 = j35;
                                                                        int iC2 = iC;
                                                                        long jD4 = jD3;
                                                                        int i53 = 0;
                                                                        String str68 = null;
                                                                        while (true) {
                                                                            xmlPullParser.next();
                                                                            if (je.b.C(xmlPullParser, str30)) {
                                                                                if (i53 == 0) {
                                                                                    jD4 = d(xmlPullParser, jD4);
                                                                                    i53 = i10;
                                                                                }
                                                                                str9 = attributeValue21;
                                                                                arrayList47.addAll(e(xmlPullParser, arrayList42, z5));
                                                                            } else {
                                                                                str9 = attributeValue21;
                                                                                if (je.b.C(xmlPullParser, str54)) {
                                                                                    iC2 = c(xmlPullParser);
                                                                                } else {
                                                                                    String str69 = str46;
                                                                                    if (je.b.C(xmlPullParser, str69)) {
                                                                                        str46 = str69;
                                                                                        sVarP = p(xmlPullParser, (r) sVarP);
                                                                                    } else {
                                                                                        String str70 = str45;
                                                                                        if (je.b.C(xmlPullParser, str70)) {
                                                                                            arrayList6 = arrayList41;
                                                                                            str30 = str30;
                                                                                            long jD5 = d(xmlPullParser, j36);
                                                                                            str8 = str70;
                                                                                            arrayList8 = arrayList47;
                                                                                            arrayList9 = arrayList42;
                                                                                            long j37 = j30;
                                                                                            str7 = str44;
                                                                                            arrayList10 = arrayList35;
                                                                                            str10 = str69;
                                                                                            arrayList11 = arrayList40;
                                                                                            str11 = str60;
                                                                                            i15 = i48;
                                                                                            str12 = str5;
                                                                                            str13 = str58;
                                                                                            str49 = str61;
                                                                                            str50 = str64;
                                                                                            arrayList34 = arrayList48;
                                                                                            i16 = i52;
                                                                                            str47 = str67;
                                                                                            i17 = i51;
                                                                                            str14 = str9;
                                                                                            str15 = str54;
                                                                                            ArrayList arrayList49 = arrayList39;
                                                                                            long j38 = jI7;
                                                                                            arrayList5 = arrayList4;
                                                                                            arrayList27 = arrayList33;
                                                                                            arrayList12 = arrayList36;
                                                                                            long j39 = j34;
                                                                                            j17 = jD4;
                                                                                            j18 = j38;
                                                                                            j30 = j37;
                                                                                            str6 = str42;
                                                                                            str57 = str57;
                                                                                            str56 = str56;
                                                                                            sVarR = q(xmlPullParser, (o) sVarP, j37, j38, jD4, jD5, j39);
                                                                                            arrayList15 = arrayList46;
                                                                                            i18 = iC2;
                                                                                            arrayList13 = arrayList49;
                                                                                            str16 = str68;
                                                                                            z5 = z5;
                                                                                            j15 = j39;
                                                                                            arrayList44 = arrayList44;
                                                                                            str55 = str55;
                                                                                            j36 = jD5;
                                                                                            arrayList14 = arrayList43;
                                                                                        } else {
                                                                                            str8 = str70;
                                                                                            arrayList6 = arrayList41;
                                                                                            str30 = str30;
                                                                                            arrayList8 = arrayList47;
                                                                                            arrayList9 = arrayList42;
                                                                                            str7 = str44;
                                                                                            arrayList10 = arrayList35;
                                                                                            str10 = str69;
                                                                                            arrayList11 = arrayList40;
                                                                                            str11 = str60;
                                                                                            i15 = i48;
                                                                                            str12 = str5;
                                                                                            str13 = str58;
                                                                                            str49 = str61;
                                                                                            str50 = str64;
                                                                                            arrayList34 = arrayList48;
                                                                                            i16 = i52;
                                                                                            str47 = str67;
                                                                                            i17 = i51;
                                                                                            str14 = str9;
                                                                                            long j40 = j30;
                                                                                            str15 = str54;
                                                                                            ArrayList arrayList50 = arrayList39;
                                                                                            long j41 = jI7;
                                                                                            arrayList5 = arrayList4;
                                                                                            arrayList27 = arrayList33;
                                                                                            arrayList12 = arrayList36;
                                                                                            long j42 = j34;
                                                                                            j17 = jD4;
                                                                                            j18 = j41;
                                                                                            String str71 = str42;
                                                                                            if (je.b.C(xmlPullParser, str71)) {
                                                                                                j15 = j42;
                                                                                                long jD6 = d(xmlPullParser, j36);
                                                                                                str6 = str71;
                                                                                                z5 = z5;
                                                                                                arrayList13 = arrayList50;
                                                                                                j30 = j40;
                                                                                                str57 = str57;
                                                                                                str56 = str56;
                                                                                                sVarR = r(xmlPullParser, (p) sVarP, arrayList50, j40, j18, j17, jD6, j15);
                                                                                                arrayList14 = arrayList43;
                                                                                                arrayList15 = arrayList46;
                                                                                                i18 = iC2;
                                                                                                str16 = str68;
                                                                                                str55 = str55;
                                                                                                j36 = jD6;
                                                                                                arrayList44 = arrayList44;
                                                                                            } else {
                                                                                                str6 = str71;
                                                                                                arrayList13 = arrayList50;
                                                                                                z5 = z5;
                                                                                                j15 = j42;
                                                                                                if (je.b.C(xmlPullParser, str13)) {
                                                                                                    Pair pairF2 = f(xmlPullParser);
                                                                                                    Object obj3 = pairF2.first;
                                                                                                    if (obj3 != null) {
                                                                                                        str68 = (String) obj3;
                                                                                                    }
                                                                                                    Object obj4 = pairF2.second;
                                                                                                    if (obj4 != null) {
                                                                                                        arrayList14 = arrayList43;
                                                                                                        arrayList14.add((mc.h) obj4);
                                                                                                    } else {
                                                                                                        arrayList14 = arrayList43;
                                                                                                    }
                                                                                                    j30 = j40;
                                                                                                    sVarR = sVarP;
                                                                                                    str16 = str68;
                                                                                                    arrayList15 = arrayList46;
                                                                                                    i18 = iC2;
                                                                                                } else {
                                                                                                    str57 = str57;
                                                                                                    arrayList14 = arrayList43;
                                                                                                    if (je.b.C(xmlPullParser, str57)) {
                                                                                                        arrayList44 = arrayList44;
                                                                                                        arrayList44.add(h(xmlPullParser, str57));
                                                                                                    } else {
                                                                                                        arrayList44 = arrayList44;
                                                                                                        if (je.b.C(xmlPullParser, str11)) {
                                                                                                            arrayList45.add(h(xmlPullParser, str11));
                                                                                                        } else {
                                                                                                            str55 = str55;
                                                                                                            if (je.b.C(xmlPullParser, str55)) {
                                                                                                                arrayList15 = arrayList46;
                                                                                                                arrayList15.add(h(xmlPullParser, str55));
                                                                                                            } else {
                                                                                                                arrayList15 = arrayList46;
                                                                                                                b(xmlPullParser);
                                                                                                            }
                                                                                                        }
                                                                                                        j30 = j40;
                                                                                                        str56 = str56;
                                                                                                        sVarR = sVarP;
                                                                                                        i18 = iC2;
                                                                                                        str16 = str68;
                                                                                                    }
                                                                                                    str55 = str55;
                                                                                                    arrayList15 = arrayList46;
                                                                                                    j30 = j40;
                                                                                                    str56 = str56;
                                                                                                    sVarR = sVarP;
                                                                                                    i18 = iC2;
                                                                                                    str16 = str68;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (je.b.B(xmlPullParser, str56)) {
                                                                                        if (je.o.j(str63)) {
                                                                                            strD = je.o.a(str65);
                                                                                        } else {
                                                                                            if (je.o.l(str63)) {
                                                                                                strD = je.o.i(str65);
                                                                                            } else if (je.o.k(str63) && !"image".equals(je.o.g(str63))) {
                                                                                                str17 = str63;
                                                                                                if ("application/mp4".equals(str17)) {
                                                                                                    strD = je.o.d(str65);
                                                                                                    if ("text/vtt".equals(strD)) {
                                                                                                        strD = "application/x-mp4-vtt";
                                                                                                    }
                                                                                                } else {
                                                                                                    strD = null;
                                                                                                }
                                                                                            } else {
                                                                                                strD = str63;
                                                                                                str17 = strD;
                                                                                            }
                                                                                            if ("audio/eac3".equals(strD)) {
                                                                                                i32 = 0;
                                                                                                while (true) {
                                                                                                    j19 = j18;
                                                                                                    str18 = "ec+3";
                                                                                                    if (i32 < arrayList15.size()) {
                                                                                                        f fVar5 = (f) arrayList15.get(i32);
                                                                                                        str25 = fVar5.f18739a;
                                                                                                        String str72 = fVar5.f18740b;
                                                                                                        arrayList16 = arrayList15;
                                                                                                        if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str25) || !"JOC".equals(str72)) && !("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str25) && "ec+3".equals(str72))) {
                                                                                                            i32++;
                                                                                                            j18 = j19;
                                                                                                            arrayList15 = arrayList16;
                                                                                                        } else {
                                                                                                            strD = "audio/eac3-joc";
                                                                                                        }
                                                                                                    } else {
                                                                                                        arrayList16 = arrayList15;
                                                                                                        strD = "audio/eac3";
                                                                                                    }
                                                                                                }
                                                                                                if (!"audio/eac3-joc".equals(strD)) {
                                                                                                }
                                                                                                i19 = 0;
                                                                                                i20 = 0;
                                                                                                while (i19 < arrayList37.size()) {
                                                                                                    ArrayList arrayList51 = arrayList37;
                                                                                                    fVar4 = (f) arrayList51.get(i19);
                                                                                                    int i54 = i19;
                                                                                                    if (!m3.m.w("urn:mpeg:dash:role:2011", fVar4.f18739a)) {
                                                                                                        str24 = fVar4.f18740b;
                                                                                                        if (str24 == null && (str24.equals("forced_subtitle") || str24.equals("forced-subtitle"))) {
                                                                                                            i31 = 2;
                                                                                                        } else {
                                                                                                            i31 = 0;
                                                                                                        }
                                                                                                        i20 = i31 | i20;
                                                                                                    }
                                                                                                    i19 = i54 + 1;
                                                                                                    arrayList37 = arrayList51;
                                                                                                }
                                                                                                arrayList17 = arrayList37;
                                                                                                ArrayList arrayList52 = arrayList14;
                                                                                                i21 = 0;
                                                                                                iN = 0;
                                                                                                while (i21 < arrayList17.size()) {
                                                                                                    fVar3 = (f) arrayList17.get(i21);
                                                                                                    int i55 = i21;
                                                                                                    if (m3.m.w("urn:mpeg:dash:role:2011", fVar3.f18739a)) {
                                                                                                        iN = n(fVar3.f18740b) | iN;
                                                                                                    }
                                                                                                    i21 = i55 + 1;
                                                                                                }
                                                                                                i22 = 0;
                                                                                                i23 = 0;
                                                                                                while (i22 < arrayList12.size()) {
                                                                                                    ArrayList arrayList53 = arrayList12;
                                                                                                    int i56 = i22;
                                                                                                    fVar2 = (f) arrayList53.get(i22);
                                                                                                    ArrayList arrayList54 = arrayList17;
                                                                                                    str22 = fVar2.f18739a;
                                                                                                    ArrayList arrayList55 = arrayList44;
                                                                                                    str23 = fVar2.f18740b;
                                                                                                    if (m3.m.w("urn:mpeg:dash:role:2011", str22)) {
                                                                                                        iN2 = n(str23);
                                                                                                    } else {
                                                                                                        if (!m3.m.w("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18739a)) {
                                                                                                            if (str23 == null) {
                                                                                                                switch (str23.hashCode()) {
                                                                                                                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                                                                                        if (str23.equals("1")) {
                                                                                                                            i30 = 0;
                                                                                                                        } else {
                                                                                                                            i30 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 50:
                                                                                                                        if (str23.equals("2")) {
                                                                                                                            i30 = i10;
                                                                                                                        } else {
                                                                                                                            i30 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                                                                                        if (str23.equals("3")) {
                                                                                                                            i30 = 2;
                                                                                                                        } else {
                                                                                                                            i30 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                                                                                        if (str23.equals("4")) {
                                                                                                                            i30 = 3;
                                                                                                                        } else {
                                                                                                                            i30 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                                                                                    default:
                                                                                                                        i30 = -1;
                                                                                                                        break;
                                                                                                                    case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                                                                                                        if (str23.equals("6")) {
                                                                                                                            i30 = 4;
                                                                                                                        } else {
                                                                                                                            i30 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                switch (i30) {
                                                                                                                    case 0:
                                                                                                                        iN2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        iN2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        iN2 = 4;
                                                                                                                        break;
                                                                                                                    case 3:
                                                                                                                        iN2 = 8;
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        iN2 = i10;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        iN2 = 0;
                                                                                                                        break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                iN2 = 0;
                                                                                                            }
                                                                                                        }
                                                                                                        i22 = i56 + 1;
                                                                                                        arrayList12 = arrayList53;
                                                                                                        arrayList17 = arrayList54;
                                                                                                        arrayList44 = arrayList55;
                                                                                                    }
                                                                                                    i23 |= iN2;
                                                                                                    i22 = i56 + 1;
                                                                                                    arrayList12 = arrayList53;
                                                                                                    arrayList17 = arrayList54;
                                                                                                    arrayList44 = arrayList55;
                                                                                                }
                                                                                                arrayList37 = arrayList17;
                                                                                                ArrayList arrayList56 = arrayList44;
                                                                                                arrayList18 = arrayList12;
                                                                                                int iO = iN | i23 | o(arrayList45) | o(arrayList16);
                                                                                                i24 = 0;
                                                                                                while (true) {
                                                                                                    if (i24 < arrayList45.size()) {
                                                                                                        fVar = (f) arrayList45.get(i24);
                                                                                                        if ((m3.m.w("http://dashif.org/thumbnail_tile", fVar.f18739a) || m3.m.w("http://dashif.org/guidelines/thumbnail_tile", fVar.f18739a)) && (str21 = fVar.f18740b) != null) {
                                                                                                            int i57 = e0.f13788a;
                                                                                                            strArrSplit = str21.split("x", -1);
                                                                                                            if (strArrSplit.length == 2) {
                                                                                                                i11 = 0;
                                                                                                                try {
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                    continue;
                                                                                                                    i24++;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        i24++;
                                                                                                    } else {
                                                                                                        i11 = 0;
                                                                                                        pairCreate = null;
                                                                                                    }
                                                                                                }
                                                                                                g0Var = new g0();
                                                                                                g0Var.f9635a = str14;
                                                                                                g0Var.j = str17;
                                                                                                g0Var.k = strD;
                                                                                                g0Var.f9642h = str18;
                                                                                                g0Var.f9641g = i15;
                                                                                                g0Var.f9638d = i20;
                                                                                                g0Var.f9639e = iO;
                                                                                                String str73 = str12;
                                                                                                g0Var.f9637c = str73;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                } else {
                                                                                                    iIntValue = -1;
                                                                                                }
                                                                                                g0Var.D = iIntValue;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                } else {
                                                                                                    iIntValue2 = -1;
                                                                                                }
                                                                                                g0Var.E = iIntValue2;
                                                                                                if (je.o.l(strD)) {
                                                                                                    g0Var.f9648p = i49;
                                                                                                    g0Var.f9649q = i14;
                                                                                                    g0Var.f9650r = fK2;
                                                                                                } else {
                                                                                                    i25 = i14;
                                                                                                    if (je.o.j(strD)) {
                                                                                                        g0Var.f9656x = i18;
                                                                                                        g0Var.f9657y = i17;
                                                                                                    } else if (je.o.k(strD)) {
                                                                                                        if ("application/cea-608".equals(strD)) {
                                                                                                            i28 = i11;
                                                                                                            while (true) {
                                                                                                                if (i28 < arrayList18.size()) {
                                                                                                                    f fVar6 = (f) arrayList18.get(i28);
                                                                                                                    str20 = fVar6.f18739a;
                                                                                                                    String str74 = fVar6.f18740b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-608:2015".equals(str20) && str74 != null) {
                                                                                                                        Matcher matcher = f18735i.matcher(str74);
                                                                                                                        if (matcher.matches()) {
                                                                                                                            i27 = Integer.parseInt(matcher.group(i10));
                                                                                                                        } else {
                                                                                                                            je.b.N("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str74));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i28++;
                                                                                                                    i10 = 1;
                                                                                                                } else {
                                                                                                                    i27 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else if ("application/cea-708".equals(strD)) {
                                                                                                            i26 = i11;
                                                                                                            while (true) {
                                                                                                                if (i26 < arrayList18.size()) {
                                                                                                                    f fVar7 = (f) arrayList18.get(i26);
                                                                                                                    str19 = fVar7.f18739a;
                                                                                                                    String str75 = fVar7.f18740b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(str19) && str75 != null) {
                                                                                                                        Matcher matcher2 = f18736v.matcher(str75);
                                                                                                                        if (matcher2.matches()) {
                                                                                                                            i27 = Integer.parseInt(matcher2.group(1));
                                                                                                                        } else {
                                                                                                                            je.b.N("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str75));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i26++;
                                                                                                                } else {
                                                                                                                    i27 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i27 = -1;
                                                                                                        }
                                                                                                        g0Var.C = i27;
                                                                                                    } else if ("image".equals(je.o.g(strD))) {
                                                                                                        g0Var.f9648p = i49;
                                                                                                        g0Var.f9649q = i25;
                                                                                                    }
                                                                                                }
                                                                                                Format format2 = new Format(g0Var);
                                                                                                if (sVarR != null) {
                                                                                                    rVar = sVarR;
                                                                                                } else {
                                                                                                    rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                }
                                                                                                if (arrayList8.isEmpty()) {
                                                                                                    arrayList19 = arrayList9;
                                                                                                } else {
                                                                                                    arrayList19 = arrayList8;
                                                                                                }
                                                                                                d dVar = new d(format2, arrayList19, rVar, str16, arrayList52, arrayList56, arrayList45, arrayList16);
                                                                                                iH = je.o.h(format2.I);
                                                                                                i29 = i16;
                                                                                                if (i29 != -1) {
                                                                                                    if (iH != -1) {
                                                                                                        if (i29 == iH) {
                                                                                                            z6 = 1;
                                                                                                        } else {
                                                                                                            z6 = i11;
                                                                                                        }
                                                                                                        je.b.k(z6);
                                                                                                    }
                                                                                                    iH = i29;
                                                                                                }
                                                                                                ArrayList arrayList57 = arrayList11;
                                                                                                arrayList57.add(dVar);
                                                                                                arrayList40 = arrayList57;
                                                                                                str52 = str73;
                                                                                                i12 = iH;
                                                                                                arrayList7 = arrayList18;
                                                                                                arrayList39 = arrayList13;
                                                                                                j12 = j19;
                                                                                                arrayList35 = arrayList10;
                                                                                                str46 = str10;
                                                                                            } else {
                                                                                                arrayList16 = arrayList15;
                                                                                                j19 = j18;
                                                                                            }
                                                                                            str18 = str65;
                                                                                            i19 = 0;
                                                                                            i20 = 0;
                                                                                            while (i19 < arrayList37.size()) {
                                                                                                ArrayList arrayList58 = arrayList37;
                                                                                                fVar4 = (f) arrayList58.get(i19);
                                                                                                int i58 = i19;
                                                                                                if (!m3.m.w("urn:mpeg:dash:role:2011", fVar4.f18739a)) {
                                                                                                    str24 = fVar4.f18740b;
                                                                                                    if (str24 == null) {
                                                                                                        i31 = 0;
                                                                                                    } else {
                                                                                                        i31 = 2;
                                                                                                    }
                                                                                                    i20 = i31 | i20;
                                                                                                }
                                                                                                i19 = i58 + 1;
                                                                                                arrayList37 = arrayList58;
                                                                                            }
                                                                                            arrayList17 = arrayList37;
                                                                                            ArrayList arrayList59 = arrayList14;
                                                                                            i21 = 0;
                                                                                            iN = 0;
                                                                                            while (i21 < arrayList17.size()) {
                                                                                                fVar3 = (f) arrayList17.get(i21);
                                                                                                int i59 = i21;
                                                                                                if (m3.m.w("urn:mpeg:dash:role:2011", fVar3.f18739a)) {
                                                                                                    iN = n(fVar3.f18740b) | iN;
                                                                                                }
                                                                                                i21 = i59 + 1;
                                                                                            }
                                                                                            i22 = 0;
                                                                                            i23 = 0;
                                                                                            while (i22 < arrayList12.size()) {
                                                                                                ArrayList arrayList510 = arrayList12;
                                                                                                int i510 = i22;
                                                                                                fVar2 = (f) arrayList510.get(i22);
                                                                                                ArrayList arrayList511 = arrayList17;
                                                                                                str22 = fVar2.f18739a;
                                                                                                ArrayList arrayList512 = arrayList44;
                                                                                                str23 = fVar2.f18740b;
                                                                                                if (m3.m.w("urn:mpeg:dash:role:2011", str22)) {
                                                                                                    iN2 = n(str23);
                                                                                                } else {
                                                                                                    if (!m3.m.w("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18739a)) {
                                                                                                        if (str23 == null) {
                                                                                                            switch (str23.hashCode()) {
                                                                                                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                                                                                    if (str23.equals("1")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = 0;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    if (str23.equals("2")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = i10;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                                                                                    if (str23.equals("3")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = 2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                                                                                    if (str23.equals("4")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = 3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                                                                                default:
                                                                                                                    i30 = -1;
                                                                                                                    break;
                                                                                                                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                                                                                                    if (str23.equals("6")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = 4;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (i30) {
                                                                                                                case 0:
                                                                                                                    iN2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    iN2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    iN2 = 4;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    iN2 = 8;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    iN2 = i10;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    iN2 = 0;
                                                                                                                    break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iN2 = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    i22 = i510 + 1;
                                                                                                    arrayList12 = arrayList510;
                                                                                                    arrayList17 = arrayList511;
                                                                                                    arrayList44 = arrayList512;
                                                                                                }
                                                                                                i23 |= iN2;
                                                                                                i22 = i510 + 1;
                                                                                                arrayList12 = arrayList510;
                                                                                                arrayList17 = arrayList511;
                                                                                                arrayList44 = arrayList512;
                                                                                            }
                                                                                            arrayList37 = arrayList17;
                                                                                            ArrayList arrayList513 = arrayList44;
                                                                                            arrayList18 = arrayList12;
                                                                                            int iO2 = iN | i23 | o(arrayList45) | o(arrayList16);
                                                                                            i24 = 0;
                                                                                            while (true) {
                                                                                                if (i24 < arrayList45.size()) {
                                                                                                    fVar = (f) arrayList45.get(i24);
                                                                                                    if (m3.m.w("http://dashif.org/thumbnail_tile", fVar.f18739a)) {
                                                                                                        int i511 = e0.f13788a;
                                                                                                        strArrSplit = str21.split("x", -1);
                                                                                                        if (strArrSplit.length == 2) {
                                                                                                            i11 = 0;
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                        }
                                                                                                    } else {
                                                                                                        int i512 = e0.f13788a;
                                                                                                        strArrSplit = str21.split("x", -1);
                                                                                                        if (strArrSplit.length == 2) {
                                                                                                            i11 = 0;
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                        }
                                                                                                    }
                                                                                                    i24++;
                                                                                                } else {
                                                                                                    i11 = 0;
                                                                                                    pairCreate = null;
                                                                                                }
                                                                                            }
                                                                                            g0Var = new g0();
                                                                                            g0Var.f9635a = str14;
                                                                                            g0Var.j = str17;
                                                                                            g0Var.k = strD;
                                                                                            g0Var.f9642h = str18;
                                                                                            g0Var.f9641g = i15;
                                                                                            g0Var.f9638d = i20;
                                                                                            g0Var.f9639e = iO2;
                                                                                            String str76 = str12;
                                                                                            g0Var.f9637c = str76;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                            } else {
                                                                                                iIntValue = -1;
                                                                                            }
                                                                                            g0Var.D = iIntValue;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                            } else {
                                                                                                iIntValue2 = -1;
                                                                                            }
                                                                                            g0Var.E = iIntValue2;
                                                                                            if (je.o.l(strD)) {
                                                                                                g0Var.f9648p = i49;
                                                                                                g0Var.f9649q = i14;
                                                                                                g0Var.f9650r = fK2;
                                                                                            } else {
                                                                                                i25 = i14;
                                                                                                if (je.o.j(strD)) {
                                                                                                    g0Var.f9656x = i18;
                                                                                                    g0Var.f9657y = i17;
                                                                                                } else if (je.o.k(strD)) {
                                                                                                    if ("application/cea-608".equals(strD)) {
                                                                                                        i28 = i11;
                                                                                                        while (true) {
                                                                                                            if (i28 < arrayList18.size()) {
                                                                                                                f fVar8 = (f) arrayList18.get(i28);
                                                                                                                str20 = fVar8.f18739a;
                                                                                                                String str77 = fVar8.f18740b;
                                                                                                                if (!"urn:scte:dash:cc:cea-608:2015".equals(str20)) {
                                                                                                                }
                                                                                                                i28++;
                                                                                                                i10 = 1;
                                                                                                            } else {
                                                                                                                i27 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else if ("application/cea-708".equals(strD)) {
                                                                                                        i26 = i11;
                                                                                                        while (true) {
                                                                                                            if (i26 < arrayList18.size()) {
                                                                                                                f fVar9 = (f) arrayList18.get(i26);
                                                                                                                str19 = fVar9.f18739a;
                                                                                                                String str78 = fVar9.f18740b;
                                                                                                                if (!"urn:scte:dash:cc:cea-708:2015".equals(str19)) {
                                                                                                                }
                                                                                                                i26++;
                                                                                                            } else {
                                                                                                                i27 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i27 = -1;
                                                                                                    }
                                                                                                    g0Var.C = i27;
                                                                                                } else if ("image".equals(je.o.g(strD))) {
                                                                                                    g0Var.f9648p = i49;
                                                                                                    g0Var.f9649q = i25;
                                                                                                }
                                                                                            }
                                                                                            Format format3 = new Format(g0Var);
                                                                                            if (sVarR != null) {
                                                                                                rVar = sVarR;
                                                                                            } else {
                                                                                                rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                            }
                                                                                            if (arrayList8.isEmpty()) {
                                                                                                arrayList19 = arrayList8;
                                                                                            } else {
                                                                                                arrayList19 = arrayList9;
                                                                                            }
                                                                                            d dVar2 = new d(format3, arrayList19, rVar, str16, arrayList59, arrayList513, arrayList45, arrayList16);
                                                                                            iH = je.o.h(format3.I);
                                                                                            i29 = i16;
                                                                                            if (i29 != -1) {
                                                                                                if (iH != -1) {
                                                                                                    if (i29 == iH) {
                                                                                                        z6 = 1;
                                                                                                    } else {
                                                                                                        z6 = i11;
                                                                                                    }
                                                                                                    je.b.k(z6);
                                                                                                }
                                                                                                iH = i29;
                                                                                            }
                                                                                            ArrayList arrayList514 = arrayList11;
                                                                                            arrayList514.add(dVar2);
                                                                                            arrayList40 = arrayList514;
                                                                                            str52 = str76;
                                                                                            i12 = iH;
                                                                                            arrayList7 = arrayList18;
                                                                                            arrayList39 = arrayList13;
                                                                                            j12 = j19;
                                                                                            arrayList35 = arrayList10;
                                                                                            str46 = str10;
                                                                                        }
                                                                                        str17 = str63;
                                                                                        if ("audio/eac3".equals(strD)) {
                                                                                            i32 = 0;
                                                                                            while (true) {
                                                                                                j19 = j18;
                                                                                                str18 = "ec+3";
                                                                                                if (i32 < arrayList15.size()) {
                                                                                                    f fVar10 = (f) arrayList15.get(i32);
                                                                                                    str25 = fVar10.f18739a;
                                                                                                    String str79 = fVar10.f18740b;
                                                                                                    arrayList16 = arrayList15;
                                                                                                    if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str25)) {
                                                                                                        i32++;
                                                                                                        j18 = j19;
                                                                                                        arrayList15 = arrayList16;
                                                                                                    } else {
                                                                                                        i32++;
                                                                                                        j18 = j19;
                                                                                                        arrayList15 = arrayList16;
                                                                                                    }
                                                                                                    strD = "audio/eac3-joc";
                                                                                                } else {
                                                                                                    arrayList16 = arrayList15;
                                                                                                    strD = "audio/eac3";
                                                                                                }
                                                                                            }
                                                                                            if (!"audio/eac3-joc".equals(strD)) {
                                                                                            }
                                                                                            i19 = 0;
                                                                                            i20 = 0;
                                                                                            while (i19 < arrayList37.size()) {
                                                                                                ArrayList arrayList515 = arrayList37;
                                                                                                fVar4 = (f) arrayList515.get(i19);
                                                                                                int i513 = i19;
                                                                                                if (!m3.m.w("urn:mpeg:dash:role:2011", fVar4.f18739a)) {
                                                                                                    str24 = fVar4.f18740b;
                                                                                                    if (str24 == null) {
                                                                                                        i31 = 0;
                                                                                                    } else {
                                                                                                        i31 = 2;
                                                                                                    }
                                                                                                    i20 = i31 | i20;
                                                                                                }
                                                                                                i19 = i513 + 1;
                                                                                                arrayList37 = arrayList515;
                                                                                            }
                                                                                            arrayList17 = arrayList37;
                                                                                            ArrayList arrayList516 = arrayList14;
                                                                                            i21 = 0;
                                                                                            iN = 0;
                                                                                            while (i21 < arrayList17.size()) {
                                                                                                fVar3 = (f) arrayList17.get(i21);
                                                                                                int i514 = i21;
                                                                                                if (m3.m.w("urn:mpeg:dash:role:2011", fVar3.f18739a)) {
                                                                                                    iN = n(fVar3.f18740b) | iN;
                                                                                                }
                                                                                                i21 = i514 + 1;
                                                                                            }
                                                                                            i22 = 0;
                                                                                            i23 = 0;
                                                                                            while (i22 < arrayList12.size()) {
                                                                                                ArrayList arrayList517 = arrayList12;
                                                                                                int i515 = i22;
                                                                                                fVar2 = (f) arrayList517.get(i22);
                                                                                                ArrayList arrayList518 = arrayList17;
                                                                                                str22 = fVar2.f18739a;
                                                                                                ArrayList arrayList519 = arrayList44;
                                                                                                str23 = fVar2.f18740b;
                                                                                                if (m3.m.w("urn:mpeg:dash:role:2011", str22)) {
                                                                                                    iN2 = n(str23);
                                                                                                } else {
                                                                                                    if (!m3.m.w("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18739a)) {
                                                                                                        if (str23 == null) {
                                                                                                            switch (str23.hashCode()) {
                                                                                                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                                                                                    if (str23.equals("1")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = 0;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    if (str23.equals("2")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = i10;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                                                                                    if (str23.equals("3")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = 2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                                                                                    if (str23.equals("4")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = 3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                                                                                default:
                                                                                                                    i30 = -1;
                                                                                                                    break;
                                                                                                                case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                                                                                                    if (str23.equals("6")) {
                                                                                                                        i30 = -1;
                                                                                                                    } else {
                                                                                                                        i30 = 4;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (i30) {
                                                                                                                case 0:
                                                                                                                    iN2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    iN2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    iN2 = 4;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    iN2 = 8;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    iN2 = i10;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    iN2 = 0;
                                                                                                                    break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iN2 = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    i22 = i515 + 1;
                                                                                                    arrayList12 = arrayList517;
                                                                                                    arrayList17 = arrayList518;
                                                                                                    arrayList44 = arrayList519;
                                                                                                }
                                                                                                i23 |= iN2;
                                                                                                i22 = i515 + 1;
                                                                                                arrayList12 = arrayList517;
                                                                                                arrayList17 = arrayList518;
                                                                                                arrayList44 = arrayList519;
                                                                                            }
                                                                                            arrayList37 = arrayList17;
                                                                                            ArrayList arrayList5110 = arrayList44;
                                                                                            arrayList18 = arrayList12;
                                                                                            int iO3 = iN | i23 | o(arrayList45) | o(arrayList16);
                                                                                            i24 = 0;
                                                                                            while (true) {
                                                                                                if (i24 < arrayList45.size()) {
                                                                                                    fVar = (f) arrayList45.get(i24);
                                                                                                    if (m3.m.w("http://dashif.org/thumbnail_tile", fVar.f18739a)) {
                                                                                                        int i516 = e0.f13788a;
                                                                                                        strArrSplit = str21.split("x", -1);
                                                                                                        if (strArrSplit.length == 2) {
                                                                                                            i11 = 0;
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                        }
                                                                                                    } else {
                                                                                                        int i517 = e0.f13788a;
                                                                                                        strArrSplit = str21.split("x", -1);
                                                                                                        if (strArrSplit.length == 2) {
                                                                                                            i11 = 0;
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                        }
                                                                                                    }
                                                                                                    i24++;
                                                                                                } else {
                                                                                                    i11 = 0;
                                                                                                    pairCreate = null;
                                                                                                }
                                                                                            }
                                                                                            g0Var = new g0();
                                                                                            g0Var.f9635a = str14;
                                                                                            g0Var.j = str17;
                                                                                            g0Var.k = strD;
                                                                                            g0Var.f9642h = str18;
                                                                                            g0Var.f9641g = i15;
                                                                                            g0Var.f9638d = i20;
                                                                                            g0Var.f9639e = iO3;
                                                                                            String str710 = str12;
                                                                                            g0Var.f9637c = str710;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                            } else {
                                                                                                iIntValue = -1;
                                                                                            }
                                                                                            g0Var.D = iIntValue;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                            } else {
                                                                                                iIntValue2 = -1;
                                                                                            }
                                                                                            g0Var.E = iIntValue2;
                                                                                            if (je.o.l(strD)) {
                                                                                                g0Var.f9648p = i49;
                                                                                                g0Var.f9649q = i14;
                                                                                                g0Var.f9650r = fK2;
                                                                                            } else {
                                                                                                i25 = i14;
                                                                                                if (je.o.j(strD)) {
                                                                                                    g0Var.f9656x = i18;
                                                                                                    g0Var.f9657y = i17;
                                                                                                } else if (je.o.k(strD)) {
                                                                                                    if ("application/cea-608".equals(strD)) {
                                                                                                        i28 = i11;
                                                                                                        while (true) {
                                                                                                            if (i28 < arrayList18.size()) {
                                                                                                                f fVar11 = (f) arrayList18.get(i28);
                                                                                                                str20 = fVar11.f18739a;
                                                                                                                String str711 = fVar11.f18740b;
                                                                                                                if (!"urn:scte:dash:cc:cea-608:2015".equals(str20)) {
                                                                                                                }
                                                                                                                i28++;
                                                                                                                i10 = 1;
                                                                                                            } else {
                                                                                                                i27 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else if ("application/cea-708".equals(strD)) {
                                                                                                        i26 = i11;
                                                                                                        while (true) {
                                                                                                            if (i26 < arrayList18.size()) {
                                                                                                                f fVar12 = (f) arrayList18.get(i26);
                                                                                                                str19 = fVar12.f18739a;
                                                                                                                String str712 = fVar12.f18740b;
                                                                                                                if (!"urn:scte:dash:cc:cea-708:2015".equals(str19)) {
                                                                                                                }
                                                                                                                i26++;
                                                                                                            } else {
                                                                                                                i27 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i27 = -1;
                                                                                                    }
                                                                                                    g0Var.C = i27;
                                                                                                } else if ("image".equals(je.o.g(strD))) {
                                                                                                    g0Var.f9648p = i49;
                                                                                                    g0Var.f9649q = i25;
                                                                                                }
                                                                                            }
                                                                                            Format format4 = new Format(g0Var);
                                                                                            if (sVarR != null) {
                                                                                                rVar = sVarR;
                                                                                            } else {
                                                                                                rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                            }
                                                                                            if (arrayList8.isEmpty()) {
                                                                                                arrayList19 = arrayList8;
                                                                                            } else {
                                                                                                arrayList19 = arrayList9;
                                                                                            }
                                                                                            d dVar3 = new d(format4, arrayList19, rVar, str16, arrayList516, arrayList5110, arrayList45, arrayList16);
                                                                                            iH = je.o.h(format4.I);
                                                                                            i29 = i16;
                                                                                            if (i29 != -1) {
                                                                                                if (iH != -1) {
                                                                                                    if (i29 == iH) {
                                                                                                        z6 = 1;
                                                                                                    } else {
                                                                                                        z6 = i11;
                                                                                                    }
                                                                                                    je.b.k(z6);
                                                                                                }
                                                                                                iH = i29;
                                                                                            }
                                                                                            ArrayList arrayList5111 = arrayList11;
                                                                                            arrayList5111.add(dVar3);
                                                                                            arrayList40 = arrayList5111;
                                                                                            str52 = str710;
                                                                                            i12 = iH;
                                                                                            arrayList7 = arrayList18;
                                                                                            arrayList39 = arrayList13;
                                                                                            j12 = j19;
                                                                                            arrayList35 = arrayList10;
                                                                                            str46 = str10;
                                                                                        } else {
                                                                                            arrayList16 = arrayList15;
                                                                                            j19 = j18;
                                                                                        }
                                                                                        str18 = str65;
                                                                                        i19 = 0;
                                                                                        i20 = 0;
                                                                                        while (i19 < arrayList37.size()) {
                                                                                            ArrayList arrayList5112 = arrayList37;
                                                                                            fVar4 = (f) arrayList5112.get(i19);
                                                                                            int i518 = i19;
                                                                                            if (!m3.m.w("urn:mpeg:dash:role:2011", fVar4.f18739a)) {
                                                                                                str24 = fVar4.f18740b;
                                                                                                if (str24 == null) {
                                                                                                    i31 = 0;
                                                                                                } else {
                                                                                                    i31 = 2;
                                                                                                }
                                                                                                i20 = i31 | i20;
                                                                                            }
                                                                                            i19 = i518 + 1;
                                                                                            arrayList37 = arrayList5112;
                                                                                        }
                                                                                        arrayList17 = arrayList37;
                                                                                        ArrayList arrayList5113 = arrayList14;
                                                                                        i21 = 0;
                                                                                        iN = 0;
                                                                                        while (i21 < arrayList17.size()) {
                                                                                            fVar3 = (f) arrayList17.get(i21);
                                                                                            int i519 = i21;
                                                                                            if (m3.m.w("urn:mpeg:dash:role:2011", fVar3.f18739a)) {
                                                                                                iN = n(fVar3.f18740b) | iN;
                                                                                            }
                                                                                            i21 = i519 + 1;
                                                                                        }
                                                                                        i22 = 0;
                                                                                        i23 = 0;
                                                                                        while (i22 < arrayList12.size()) {
                                                                                            ArrayList arrayList5114 = arrayList12;
                                                                                            int i5110 = i22;
                                                                                            fVar2 = (f) arrayList5114.get(i22);
                                                                                            ArrayList arrayList5115 = arrayList17;
                                                                                            str22 = fVar2.f18739a;
                                                                                            ArrayList arrayList5116 = arrayList44;
                                                                                            str23 = fVar2.f18740b;
                                                                                            if (m3.m.w("urn:mpeg:dash:role:2011", str22)) {
                                                                                                iN2 = n(str23);
                                                                                            } else {
                                                                                                if (!m3.m.w("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18739a)) {
                                                                                                    if (str23 == null) {
                                                                                                        switch (str23.hashCode()) {
                                                                                                            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                                                                                if (str23.equals("1")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = 0;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 50:
                                                                                                                if (str23.equals("2")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = i10;
                                                                                                                }
                                                                                                                break;
                                                                                                            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                                                                                if (str23.equals("3")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = 2;
                                                                                                                }
                                                                                                                break;
                                                                                                            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                                                                                if (str23.equals("4")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = 3;
                                                                                                                }
                                                                                                                break;
                                                                                                            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                                                                            default:
                                                                                                                i30 = -1;
                                                                                                                break;
                                                                                                            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                                                                                                if (str23.equals("6")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = 4;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                        switch (i30) {
                                                                                                            case 0:
                                                                                                                iN2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                                                                                                break;
                                                                                                            case 1:
                                                                                                                iN2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                                                                                break;
                                                                                                            case 2:
                                                                                                                iN2 = 4;
                                                                                                                break;
                                                                                                            case 3:
                                                                                                                iN2 = 8;
                                                                                                                break;
                                                                                                            case 4:
                                                                                                                iN2 = i10;
                                                                                                                break;
                                                                                                            default:
                                                                                                                iN2 = 0;
                                                                                                                break;
                                                                                                        }
                                                                                                    } else {
                                                                                                        iN2 = 0;
                                                                                                    }
                                                                                                }
                                                                                                i22 = i5110 + 1;
                                                                                                arrayList12 = arrayList5114;
                                                                                                arrayList17 = arrayList5115;
                                                                                                arrayList44 = arrayList5116;
                                                                                            }
                                                                                            i23 |= iN2;
                                                                                            i22 = i5110 + 1;
                                                                                            arrayList12 = arrayList5114;
                                                                                            arrayList17 = arrayList5115;
                                                                                            arrayList44 = arrayList5116;
                                                                                        }
                                                                                        arrayList37 = arrayList17;
                                                                                        ArrayList arrayList5117 = arrayList44;
                                                                                        arrayList18 = arrayList12;
                                                                                        int iO4 = iN | i23 | o(arrayList45) | o(arrayList16);
                                                                                        i24 = 0;
                                                                                        while (true) {
                                                                                            if (i24 < arrayList45.size()) {
                                                                                                fVar = (f) arrayList45.get(i24);
                                                                                                if (m3.m.w("http://dashif.org/thumbnail_tile", fVar.f18739a)) {
                                                                                                    int i5111 = e0.f13788a;
                                                                                                    strArrSplit = str21.split("x", -1);
                                                                                                    if (strArrSplit.length == 2) {
                                                                                                        i11 = 0;
                                                                                                        pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                    }
                                                                                                } else {
                                                                                                    int i5112 = e0.f13788a;
                                                                                                    strArrSplit = str21.split("x", -1);
                                                                                                    if (strArrSplit.length == 2) {
                                                                                                        i11 = 0;
                                                                                                        pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                    }
                                                                                                }
                                                                                                i24++;
                                                                                            } else {
                                                                                                i11 = 0;
                                                                                                pairCreate = null;
                                                                                            }
                                                                                        }
                                                                                        g0Var = new g0();
                                                                                        g0Var.f9635a = str14;
                                                                                        g0Var.j = str17;
                                                                                        g0Var.k = strD;
                                                                                        g0Var.f9642h = str18;
                                                                                        g0Var.f9641g = i15;
                                                                                        g0Var.f9638d = i20;
                                                                                        g0Var.f9639e = iO4;
                                                                                        String str713 = str12;
                                                                                        g0Var.f9637c = str713;
                                                                                        if (pairCreate != null) {
                                                                                            iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                        } else {
                                                                                            iIntValue = -1;
                                                                                        }
                                                                                        g0Var.D = iIntValue;
                                                                                        if (pairCreate != null) {
                                                                                            iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                        } else {
                                                                                            iIntValue2 = -1;
                                                                                        }
                                                                                        g0Var.E = iIntValue2;
                                                                                        if (je.o.l(strD)) {
                                                                                            g0Var.f9648p = i49;
                                                                                            g0Var.f9649q = i14;
                                                                                            g0Var.f9650r = fK2;
                                                                                        } else {
                                                                                            i25 = i14;
                                                                                            if (je.o.j(strD)) {
                                                                                                g0Var.f9656x = i18;
                                                                                                g0Var.f9657y = i17;
                                                                                            } else if (je.o.k(strD)) {
                                                                                                if ("application/cea-608".equals(strD)) {
                                                                                                    i28 = i11;
                                                                                                    while (true) {
                                                                                                        if (i28 < arrayList18.size()) {
                                                                                                            f fVar13 = (f) arrayList18.get(i28);
                                                                                                            str20 = fVar13.f18739a;
                                                                                                            String str714 = fVar13.f18740b;
                                                                                                            if (!"urn:scte:dash:cc:cea-608:2015".equals(str20)) {
                                                                                                            }
                                                                                                            i28++;
                                                                                                            i10 = 1;
                                                                                                        } else {
                                                                                                            i27 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                } else if ("application/cea-708".equals(strD)) {
                                                                                                    i26 = i11;
                                                                                                    while (true) {
                                                                                                        if (i26 < arrayList18.size()) {
                                                                                                            f fVar14 = (f) arrayList18.get(i26);
                                                                                                            str19 = fVar14.f18739a;
                                                                                                            String str715 = fVar14.f18740b;
                                                                                                            if (!"urn:scte:dash:cc:cea-708:2015".equals(str19)) {
                                                                                                            }
                                                                                                            i26++;
                                                                                                        } else {
                                                                                                            i27 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    i27 = -1;
                                                                                                }
                                                                                                g0Var.C = i27;
                                                                                            } else if ("image".equals(je.o.g(strD))) {
                                                                                                g0Var.f9648p = i49;
                                                                                                g0Var.f9649q = i25;
                                                                                            }
                                                                                        }
                                                                                        Format format5 = new Format(g0Var);
                                                                                        if (sVarR != null) {
                                                                                            rVar = sVarR;
                                                                                        } else {
                                                                                            rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                        }
                                                                                        if (arrayList8.isEmpty()) {
                                                                                            arrayList19 = arrayList8;
                                                                                        } else {
                                                                                            arrayList19 = arrayList9;
                                                                                        }
                                                                                        d dVar4 = new d(format5, arrayList19, rVar, str16, arrayList5113, arrayList5117, arrayList45, arrayList16);
                                                                                        iH = je.o.h(format5.I);
                                                                                        i29 = i16;
                                                                                        if (i29 != -1) {
                                                                                            if (iH != -1) {
                                                                                                if (i29 == iH) {
                                                                                                    z6 = 1;
                                                                                                } else {
                                                                                                    z6 = i11;
                                                                                                }
                                                                                                je.b.k(z6);
                                                                                            }
                                                                                            iH = i29;
                                                                                        }
                                                                                        ArrayList arrayList5118 = arrayList11;
                                                                                        arrayList5118.add(dVar4);
                                                                                        arrayList40 = arrayList5118;
                                                                                        str52 = str713;
                                                                                        i12 = iH;
                                                                                        arrayList7 = arrayList18;
                                                                                        arrayList39 = arrayList13;
                                                                                        j12 = j19;
                                                                                        arrayList35 = arrayList10;
                                                                                        str46 = str10;
                                                                                    } else {
                                                                                        arrayList43 = arrayList14;
                                                                                        arrayList44 = arrayList44;
                                                                                        ArrayList arrayList60 = arrayList12;
                                                                                        String str80 = str63;
                                                                                        long j43 = j18;
                                                                                        iC2 = i18;
                                                                                        arrayList46 = arrayList15;
                                                                                        str56 = str56;
                                                                                        str60 = str11;
                                                                                        arrayList4 = arrayList5;
                                                                                        str54 = str15;
                                                                                        str67 = str47;
                                                                                        arrayList42 = arrayList9;
                                                                                        arrayList39 = arrayList13;
                                                                                        j36 = j36;
                                                                                        str68 = str16;
                                                                                        i52 = i16;
                                                                                        arrayList48 = arrayList34;
                                                                                        arrayList35 = arrayList10;
                                                                                        arrayList40 = arrayList11;
                                                                                        str5 = str12;
                                                                                        attributeValue21 = str14;
                                                                                        i51 = i17;
                                                                                        str46 = str10;
                                                                                        str42 = str6;
                                                                                        i10 = 1;
                                                                                        str57 = str57;
                                                                                        str55 = str55;
                                                                                        sVarP = sVarR;
                                                                                        jD4 = j17;
                                                                                        str30 = str30;
                                                                                        str44 = str7;
                                                                                        j34 = j15;
                                                                                        z5 = z5;
                                                                                        j30 = j30;
                                                                                        str61 = str49;
                                                                                        arrayList36 = arrayList60;
                                                                                        str58 = str13;
                                                                                        arrayList41 = arrayList6;
                                                                                        arrayList47 = arrayList8;
                                                                                        str45 = str8;
                                                                                        arrayList33 = arrayList27;
                                                                                        jI7 = j43;
                                                                                        str63 = str80;
                                                                                        str64 = str50;
                                                                                        i48 = i15;
                                                                                    }
                                                                                }
                                                                            }
                                                                            str30 = str30;
                                                                            arrayList8 = arrayList47;
                                                                            arrayList9 = arrayList42;
                                                                            str6 = str42;
                                                                            str7 = str44;
                                                                            arrayList10 = arrayList35;
                                                                            str8 = str45;
                                                                            str10 = str46;
                                                                            arrayList11 = arrayList40;
                                                                            str11 = str60;
                                                                            i15 = i48;
                                                                            str12 = str5;
                                                                            str13 = str58;
                                                                            str49 = str61;
                                                                            str50 = str64;
                                                                            arrayList34 = arrayList48;
                                                                            i16 = i52;
                                                                            sVarR = sVarP;
                                                                            str47 = str67;
                                                                            i17 = i51;
                                                                            str14 = str9;
                                                                            arrayList6 = arrayList41;
                                                                            arrayList13 = arrayList39;
                                                                            j30 = j30;
                                                                            str16 = str68;
                                                                            arrayList14 = arrayList43;
                                                                            str15 = str54;
                                                                            z5 = z5;
                                                                            long j44 = jI7;
                                                                            arrayList5 = arrayList4;
                                                                            arrayList27 = arrayList33;
                                                                            arrayList12 = arrayList36;
                                                                            j15 = j34;
                                                                            j17 = jD4;
                                                                            j18 = j44;
                                                                            arrayList15 = arrayList46;
                                                                            i18 = iC2;
                                                                            if (je.b.B(xmlPullParser, str56)) {
                                                                                if (je.o.j(str63)) {
                                                                                    strD = je.o.a(str65);
                                                                                } else {
                                                                                    if (je.o.l(str63)) {
                                                                                        strD = je.o.i(str65);
                                                                                    } else if (je.o.k(str63)) {
                                                                                        strD = str63;
                                                                                        str17 = strD;
                                                                                    } else {
                                                                                        str17 = str63;
                                                                                        if ("application/mp4".equals(str17)) {
                                                                                            strD = je.o.d(str65);
                                                                                            if ("text/vtt".equals(strD)) {
                                                                                                strD = "application/x-mp4-vtt";
                                                                                            }
                                                                                        } else {
                                                                                            strD = null;
                                                                                        }
                                                                                    }
                                                                                    if ("audio/eac3".equals(strD)) {
                                                                                        i32 = 0;
                                                                                        while (true) {
                                                                                            j19 = j18;
                                                                                            str18 = "ec+3";
                                                                                            if (i32 < arrayList15.size()) {
                                                                                                f fVar15 = (f) arrayList15.get(i32);
                                                                                                str25 = fVar15.f18739a;
                                                                                                String str716 = fVar15.f18740b;
                                                                                                arrayList16 = arrayList15;
                                                                                                if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str25)) {
                                                                                                    i32++;
                                                                                                    j18 = j19;
                                                                                                    arrayList15 = arrayList16;
                                                                                                } else {
                                                                                                    i32++;
                                                                                                    j18 = j19;
                                                                                                    arrayList15 = arrayList16;
                                                                                                }
                                                                                                strD = "audio/eac3-joc";
                                                                                            } else {
                                                                                                arrayList16 = arrayList15;
                                                                                                strD = "audio/eac3";
                                                                                            }
                                                                                        }
                                                                                        if (!"audio/eac3-joc".equals(strD)) {
                                                                                        }
                                                                                        i19 = 0;
                                                                                        i20 = 0;
                                                                                        while (i19 < arrayList37.size()) {
                                                                                            ArrayList arrayList5119 = arrayList37;
                                                                                            fVar4 = (f) arrayList5119.get(i19);
                                                                                            int i5113 = i19;
                                                                                            if (!m3.m.w("urn:mpeg:dash:role:2011", fVar4.f18739a)) {
                                                                                                str24 = fVar4.f18740b;
                                                                                                if (str24 == null) {
                                                                                                    i31 = 0;
                                                                                                } else {
                                                                                                    i31 = 2;
                                                                                                }
                                                                                                i20 = i31 | i20;
                                                                                            }
                                                                                            i19 = i5113 + 1;
                                                                                            arrayList37 = arrayList5119;
                                                                                        }
                                                                                        arrayList17 = arrayList37;
                                                                                        ArrayList arrayList51110 = arrayList14;
                                                                                        i21 = 0;
                                                                                        iN = 0;
                                                                                        while (i21 < arrayList17.size()) {
                                                                                            fVar3 = (f) arrayList17.get(i21);
                                                                                            int i5114 = i21;
                                                                                            if (m3.m.w("urn:mpeg:dash:role:2011", fVar3.f18739a)) {
                                                                                                iN = n(fVar3.f18740b) | iN;
                                                                                            }
                                                                                            i21 = i5114 + 1;
                                                                                        }
                                                                                        i22 = 0;
                                                                                        i23 = 0;
                                                                                        while (i22 < arrayList12.size()) {
                                                                                            ArrayList arrayList51111 = arrayList12;
                                                                                            int i5115 = i22;
                                                                                            fVar2 = (f) arrayList51111.get(i22);
                                                                                            ArrayList arrayList51112 = arrayList17;
                                                                                            str22 = fVar2.f18739a;
                                                                                            ArrayList arrayList51113 = arrayList44;
                                                                                            str23 = fVar2.f18740b;
                                                                                            if (m3.m.w("urn:mpeg:dash:role:2011", str22)) {
                                                                                                iN2 = n(str23);
                                                                                            } else {
                                                                                                if (!m3.m.w("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18739a)) {
                                                                                                    if (str23 == null) {
                                                                                                        switch (str23.hashCode()) {
                                                                                                            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                                                                                if (str23.equals("1")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = 0;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 50:
                                                                                                                if (str23.equals("2")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = i10;
                                                                                                                }
                                                                                                                break;
                                                                                                            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                                                                                if (str23.equals("3")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = 2;
                                                                                                                }
                                                                                                                break;
                                                                                                            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                                                                                if (str23.equals("4")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = 3;
                                                                                                                }
                                                                                                                break;
                                                                                                            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                                                                            default:
                                                                                                                i30 = -1;
                                                                                                                break;
                                                                                                            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                                                                                                if (str23.equals("6")) {
                                                                                                                    i30 = -1;
                                                                                                                } else {
                                                                                                                    i30 = 4;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                        switch (i30) {
                                                                                                            case 0:
                                                                                                                iN2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                                                                                                break;
                                                                                                            case 1:
                                                                                                                iN2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                                                                                break;
                                                                                                            case 2:
                                                                                                                iN2 = 4;
                                                                                                                break;
                                                                                                            case 3:
                                                                                                                iN2 = 8;
                                                                                                                break;
                                                                                                            case 4:
                                                                                                                iN2 = i10;
                                                                                                                break;
                                                                                                            default:
                                                                                                                iN2 = 0;
                                                                                                                break;
                                                                                                        }
                                                                                                    } else {
                                                                                                        iN2 = 0;
                                                                                                    }
                                                                                                }
                                                                                                i22 = i5115 + 1;
                                                                                                arrayList12 = arrayList51111;
                                                                                                arrayList17 = arrayList51112;
                                                                                                arrayList44 = arrayList51113;
                                                                                            }
                                                                                            i23 |= iN2;
                                                                                            i22 = i5115 + 1;
                                                                                            arrayList12 = arrayList51111;
                                                                                            arrayList17 = arrayList51112;
                                                                                            arrayList44 = arrayList51113;
                                                                                        }
                                                                                        arrayList37 = arrayList17;
                                                                                        ArrayList arrayList51114 = arrayList44;
                                                                                        arrayList18 = arrayList12;
                                                                                        int iO5 = iN | i23 | o(arrayList45) | o(arrayList16);
                                                                                        i24 = 0;
                                                                                        while (true) {
                                                                                            if (i24 < arrayList45.size()) {
                                                                                                fVar = (f) arrayList45.get(i24);
                                                                                                if (m3.m.w("http://dashif.org/thumbnail_tile", fVar.f18739a)) {
                                                                                                    int i5116 = e0.f13788a;
                                                                                                    strArrSplit = str21.split("x", -1);
                                                                                                    if (strArrSplit.length == 2) {
                                                                                                        i11 = 0;
                                                                                                        pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                    }
                                                                                                } else {
                                                                                                    int i5117 = e0.f13788a;
                                                                                                    strArrSplit = str21.split("x", -1);
                                                                                                    if (strArrSplit.length == 2) {
                                                                                                        i11 = 0;
                                                                                                        pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                    }
                                                                                                }
                                                                                                i24++;
                                                                                            } else {
                                                                                                i11 = 0;
                                                                                                pairCreate = null;
                                                                                            }
                                                                                        }
                                                                                        g0Var = new g0();
                                                                                        g0Var.f9635a = str14;
                                                                                        g0Var.j = str17;
                                                                                        g0Var.k = strD;
                                                                                        g0Var.f9642h = str18;
                                                                                        g0Var.f9641g = i15;
                                                                                        g0Var.f9638d = i20;
                                                                                        g0Var.f9639e = iO5;
                                                                                        String str717 = str12;
                                                                                        g0Var.f9637c = str717;
                                                                                        if (pairCreate != null) {
                                                                                            iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                        } else {
                                                                                            iIntValue = -1;
                                                                                        }
                                                                                        g0Var.D = iIntValue;
                                                                                        if (pairCreate != null) {
                                                                                            iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                        } else {
                                                                                            iIntValue2 = -1;
                                                                                        }
                                                                                        g0Var.E = iIntValue2;
                                                                                        if (je.o.l(strD)) {
                                                                                            g0Var.f9648p = i49;
                                                                                            g0Var.f9649q = i14;
                                                                                            g0Var.f9650r = fK2;
                                                                                        } else {
                                                                                            i25 = i14;
                                                                                            if (je.o.j(strD)) {
                                                                                                g0Var.f9656x = i18;
                                                                                                g0Var.f9657y = i17;
                                                                                            } else if (je.o.k(strD)) {
                                                                                                if ("application/cea-608".equals(strD)) {
                                                                                                    i28 = i11;
                                                                                                    while (true) {
                                                                                                        if (i28 < arrayList18.size()) {
                                                                                                            f fVar16 = (f) arrayList18.get(i28);
                                                                                                            str20 = fVar16.f18739a;
                                                                                                            String str718 = fVar16.f18740b;
                                                                                                            if (!"urn:scte:dash:cc:cea-608:2015".equals(str20)) {
                                                                                                            }
                                                                                                            i28++;
                                                                                                            i10 = 1;
                                                                                                        } else {
                                                                                                            i27 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                } else if ("application/cea-708".equals(strD)) {
                                                                                                    i26 = i11;
                                                                                                    while (true) {
                                                                                                        if (i26 < arrayList18.size()) {
                                                                                                            f fVar17 = (f) arrayList18.get(i26);
                                                                                                            str19 = fVar17.f18739a;
                                                                                                            String str719 = fVar17.f18740b;
                                                                                                            if (!"urn:scte:dash:cc:cea-708:2015".equals(str19)) {
                                                                                                            }
                                                                                                            i26++;
                                                                                                        } else {
                                                                                                            i27 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    i27 = -1;
                                                                                                }
                                                                                                g0Var.C = i27;
                                                                                            } else if ("image".equals(je.o.g(strD))) {
                                                                                                g0Var.f9648p = i49;
                                                                                                g0Var.f9649q = i25;
                                                                                            }
                                                                                        }
                                                                                        Format format6 = new Format(g0Var);
                                                                                        if (sVarR != null) {
                                                                                            rVar = sVarR;
                                                                                        } else {
                                                                                            rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                        }
                                                                                        if (arrayList8.isEmpty()) {
                                                                                            arrayList19 = arrayList8;
                                                                                        } else {
                                                                                            arrayList19 = arrayList9;
                                                                                        }
                                                                                        d dVar5 = new d(format6, arrayList19, rVar, str16, arrayList51110, arrayList51114, arrayList45, arrayList16);
                                                                                        iH = je.o.h(format6.I);
                                                                                        i29 = i16;
                                                                                        if (i29 != -1) {
                                                                                            if (iH != -1) {
                                                                                                if (i29 == iH) {
                                                                                                    z6 = 1;
                                                                                                } else {
                                                                                                    z6 = i11;
                                                                                                }
                                                                                                je.b.k(z6);
                                                                                            }
                                                                                            iH = i29;
                                                                                        }
                                                                                        ArrayList arrayList51115 = arrayList11;
                                                                                        arrayList51115.add(dVar5);
                                                                                        arrayList40 = arrayList51115;
                                                                                        str52 = str717;
                                                                                        i12 = iH;
                                                                                        arrayList7 = arrayList18;
                                                                                        arrayList39 = arrayList13;
                                                                                        j12 = j19;
                                                                                        arrayList35 = arrayList10;
                                                                                        str46 = str10;
                                                                                    } else {
                                                                                        arrayList16 = arrayList15;
                                                                                        j19 = j18;
                                                                                    }
                                                                                    str18 = str65;
                                                                                    i19 = 0;
                                                                                    i20 = 0;
                                                                                    while (i19 < arrayList37.size()) {
                                                                                        ArrayList arrayList51116 = arrayList37;
                                                                                        fVar4 = (f) arrayList51116.get(i19);
                                                                                        int i5118 = i19;
                                                                                        if (!m3.m.w("urn:mpeg:dash:role:2011", fVar4.f18739a)) {
                                                                                            str24 = fVar4.f18740b;
                                                                                            if (str24 == null) {
                                                                                                i31 = 0;
                                                                                            } else {
                                                                                                i31 = 2;
                                                                                            }
                                                                                            i20 = i31 | i20;
                                                                                        }
                                                                                        i19 = i5118 + 1;
                                                                                        arrayList37 = arrayList51116;
                                                                                    }
                                                                                    arrayList17 = arrayList37;
                                                                                    ArrayList arrayList51117 = arrayList14;
                                                                                    i21 = 0;
                                                                                    iN = 0;
                                                                                    while (i21 < arrayList17.size()) {
                                                                                        fVar3 = (f) arrayList17.get(i21);
                                                                                        int i5119 = i21;
                                                                                        if (m3.m.w("urn:mpeg:dash:role:2011", fVar3.f18739a)) {
                                                                                            iN = n(fVar3.f18740b) | iN;
                                                                                        }
                                                                                        i21 = i5119 + 1;
                                                                                    }
                                                                                    i22 = 0;
                                                                                    i23 = 0;
                                                                                    while (i22 < arrayList12.size()) {
                                                                                        ArrayList arrayList51118 = arrayList12;
                                                                                        int i51110 = i22;
                                                                                        fVar2 = (f) arrayList51118.get(i22);
                                                                                        ArrayList arrayList51119 = arrayList17;
                                                                                        str22 = fVar2.f18739a;
                                                                                        ArrayList arrayList511110 = arrayList44;
                                                                                        str23 = fVar2.f18740b;
                                                                                        if (m3.m.w("urn:mpeg:dash:role:2011", str22)) {
                                                                                            iN2 = n(str23);
                                                                                        } else {
                                                                                            if (!m3.m.w("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18739a)) {
                                                                                                if (str23 == null) {
                                                                                                    switch (str23.hashCode()) {
                                                                                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                                                                            if (str23.equals("1")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = 0;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            if (str23.equals("2")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = i10;
                                                                                                            }
                                                                                                            break;
                                                                                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                                                                            if (str23.equals("3")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = 2;
                                                                                                            }
                                                                                                            break;
                                                                                                        case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                                                                            if (str23.equals("4")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = 3;
                                                                                                            }
                                                                                                            break;
                                                                                                        case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                                                                        default:
                                                                                                            i30 = -1;
                                                                                                            break;
                                                                                                        case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                                                                                            if (str23.equals("6")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = 4;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    switch (i30) {
                                                                                                        case 0:
                                                                                                            iN2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            iN2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            iN2 = 4;
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            iN2 = 8;
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            iN2 = i10;
                                                                                                            break;
                                                                                                        default:
                                                                                                            iN2 = 0;
                                                                                                            break;
                                                                                                    }
                                                                                                } else {
                                                                                                    iN2 = 0;
                                                                                                }
                                                                                            }
                                                                                            i22 = i51110 + 1;
                                                                                            arrayList12 = arrayList51118;
                                                                                            arrayList17 = arrayList51119;
                                                                                            arrayList44 = arrayList511110;
                                                                                        }
                                                                                        i23 |= iN2;
                                                                                        i22 = i51110 + 1;
                                                                                        arrayList12 = arrayList51118;
                                                                                        arrayList17 = arrayList51119;
                                                                                        arrayList44 = arrayList511110;
                                                                                    }
                                                                                    arrayList37 = arrayList17;
                                                                                    ArrayList arrayList511111 = arrayList44;
                                                                                    arrayList18 = arrayList12;
                                                                                    int iO6 = iN | i23 | o(arrayList45) | o(arrayList16);
                                                                                    i24 = 0;
                                                                                    while (true) {
                                                                                        if (i24 < arrayList45.size()) {
                                                                                            fVar = (f) arrayList45.get(i24);
                                                                                            if (m3.m.w("http://dashif.org/thumbnail_tile", fVar.f18739a)) {
                                                                                                int i51111 = e0.f13788a;
                                                                                                strArrSplit = str21.split("x", -1);
                                                                                                if (strArrSplit.length == 2) {
                                                                                                    i11 = 0;
                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                }
                                                                                            } else {
                                                                                                int i51112 = e0.f13788a;
                                                                                                strArrSplit = str21.split("x", -1);
                                                                                                if (strArrSplit.length == 2) {
                                                                                                    i11 = 0;
                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                }
                                                                                            }
                                                                                            i24++;
                                                                                        } else {
                                                                                            i11 = 0;
                                                                                            pairCreate = null;
                                                                                        }
                                                                                    }
                                                                                    g0Var = new g0();
                                                                                    g0Var.f9635a = str14;
                                                                                    g0Var.j = str17;
                                                                                    g0Var.k = strD;
                                                                                    g0Var.f9642h = str18;
                                                                                    g0Var.f9641g = i15;
                                                                                    g0Var.f9638d = i20;
                                                                                    g0Var.f9639e = iO6;
                                                                                    String str7110 = str12;
                                                                                    g0Var.f9637c = str7110;
                                                                                    if (pairCreate != null) {
                                                                                        iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                    } else {
                                                                                        iIntValue = -1;
                                                                                    }
                                                                                    g0Var.D = iIntValue;
                                                                                    if (pairCreate != null) {
                                                                                        iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                    } else {
                                                                                        iIntValue2 = -1;
                                                                                    }
                                                                                    g0Var.E = iIntValue2;
                                                                                    if (je.o.l(strD)) {
                                                                                        g0Var.f9648p = i49;
                                                                                        g0Var.f9649q = i14;
                                                                                        g0Var.f9650r = fK2;
                                                                                    } else {
                                                                                        i25 = i14;
                                                                                        if (je.o.j(strD)) {
                                                                                            g0Var.f9656x = i18;
                                                                                            g0Var.f9657y = i17;
                                                                                        } else if (je.o.k(strD)) {
                                                                                            if ("application/cea-608".equals(strD)) {
                                                                                                i28 = i11;
                                                                                                while (true) {
                                                                                                    if (i28 < arrayList18.size()) {
                                                                                                        f fVar18 = (f) arrayList18.get(i28);
                                                                                                        str20 = fVar18.f18739a;
                                                                                                        String str7111 = fVar18.f18740b;
                                                                                                        if (!"urn:scte:dash:cc:cea-608:2015".equals(str20)) {
                                                                                                        }
                                                                                                        i28++;
                                                                                                        i10 = 1;
                                                                                                    } else {
                                                                                                        i27 = -1;
                                                                                                    }
                                                                                                }
                                                                                            } else if ("application/cea-708".equals(strD)) {
                                                                                                i26 = i11;
                                                                                                while (true) {
                                                                                                    if (i26 < arrayList18.size()) {
                                                                                                        f fVar19 = (f) arrayList18.get(i26);
                                                                                                        str19 = fVar19.f18739a;
                                                                                                        String str7112 = fVar19.f18740b;
                                                                                                        if (!"urn:scte:dash:cc:cea-708:2015".equals(str19)) {
                                                                                                        }
                                                                                                        i26++;
                                                                                                    } else {
                                                                                                        i27 = -1;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i27 = -1;
                                                                                            }
                                                                                            g0Var.C = i27;
                                                                                        } else if ("image".equals(je.o.g(strD))) {
                                                                                            g0Var.f9648p = i49;
                                                                                            g0Var.f9649q = i25;
                                                                                        }
                                                                                    }
                                                                                    Format format7 = new Format(g0Var);
                                                                                    if (sVarR != null) {
                                                                                        rVar = sVarR;
                                                                                    } else {
                                                                                        rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                    }
                                                                                    if (arrayList8.isEmpty()) {
                                                                                        arrayList19 = arrayList8;
                                                                                    } else {
                                                                                        arrayList19 = arrayList9;
                                                                                    }
                                                                                    d dVar6 = new d(format7, arrayList19, rVar, str16, arrayList51117, arrayList511111, arrayList45, arrayList16);
                                                                                    iH = je.o.h(format7.I);
                                                                                    i29 = i16;
                                                                                    if (i29 != -1) {
                                                                                        if (iH != -1) {
                                                                                            if (i29 == iH) {
                                                                                                z6 = 1;
                                                                                            } else {
                                                                                                z6 = i11;
                                                                                            }
                                                                                            je.b.k(z6);
                                                                                        }
                                                                                        iH = i29;
                                                                                    }
                                                                                    ArrayList arrayList511112 = arrayList11;
                                                                                    arrayList511112.add(dVar6);
                                                                                    arrayList40 = arrayList511112;
                                                                                    str52 = str7110;
                                                                                    i12 = iH;
                                                                                    arrayList7 = arrayList18;
                                                                                    arrayList39 = arrayList13;
                                                                                    j12 = j19;
                                                                                    arrayList35 = arrayList10;
                                                                                    str46 = str10;
                                                                                }
                                                                                str17 = str63;
                                                                                if ("audio/eac3".equals(strD)) {
                                                                                    i32 = 0;
                                                                                    while (true) {
                                                                                        j19 = j18;
                                                                                        str18 = "ec+3";
                                                                                        if (i32 < arrayList15.size()) {
                                                                                            f fVar110 = (f) arrayList15.get(i32);
                                                                                            str25 = fVar110.f18739a;
                                                                                            String str7113 = fVar110.f18740b;
                                                                                            arrayList16 = arrayList15;
                                                                                            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str25)) {
                                                                                                i32++;
                                                                                                j18 = j19;
                                                                                                arrayList15 = arrayList16;
                                                                                            } else {
                                                                                                i32++;
                                                                                                j18 = j19;
                                                                                                arrayList15 = arrayList16;
                                                                                            }
                                                                                            strD = "audio/eac3-joc";
                                                                                        } else {
                                                                                            arrayList16 = arrayList15;
                                                                                            strD = "audio/eac3";
                                                                                        }
                                                                                    }
                                                                                    if (!"audio/eac3-joc".equals(strD)) {
                                                                                    }
                                                                                    i19 = 0;
                                                                                    i20 = 0;
                                                                                    while (i19 < arrayList37.size()) {
                                                                                        ArrayList arrayList511113 = arrayList37;
                                                                                        fVar4 = (f) arrayList511113.get(i19);
                                                                                        int i51113 = i19;
                                                                                        if (!m3.m.w("urn:mpeg:dash:role:2011", fVar4.f18739a)) {
                                                                                            str24 = fVar4.f18740b;
                                                                                            if (str24 == null) {
                                                                                                i31 = 0;
                                                                                            } else {
                                                                                                i31 = 2;
                                                                                            }
                                                                                            i20 = i31 | i20;
                                                                                        }
                                                                                        i19 = i51113 + 1;
                                                                                        arrayList37 = arrayList511113;
                                                                                    }
                                                                                    arrayList17 = arrayList37;
                                                                                    ArrayList arrayList511114 = arrayList14;
                                                                                    i21 = 0;
                                                                                    iN = 0;
                                                                                    while (i21 < arrayList17.size()) {
                                                                                        fVar3 = (f) arrayList17.get(i21);
                                                                                        int i51114 = i21;
                                                                                        if (m3.m.w("urn:mpeg:dash:role:2011", fVar3.f18739a)) {
                                                                                            iN = n(fVar3.f18740b) | iN;
                                                                                        }
                                                                                        i21 = i51114 + 1;
                                                                                    }
                                                                                    i22 = 0;
                                                                                    i23 = 0;
                                                                                    while (i22 < arrayList12.size()) {
                                                                                        ArrayList arrayList511115 = arrayList12;
                                                                                        int i51115 = i22;
                                                                                        fVar2 = (f) arrayList511115.get(i22);
                                                                                        ArrayList arrayList511116 = arrayList17;
                                                                                        str22 = fVar2.f18739a;
                                                                                        ArrayList arrayList511117 = arrayList44;
                                                                                        str23 = fVar2.f18740b;
                                                                                        if (m3.m.w("urn:mpeg:dash:role:2011", str22)) {
                                                                                            iN2 = n(str23);
                                                                                        } else {
                                                                                            if (!m3.m.w("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18739a)) {
                                                                                                if (str23 == null) {
                                                                                                    switch (str23.hashCode()) {
                                                                                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                                                                            if (str23.equals("1")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = 0;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            if (str23.equals("2")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = i10;
                                                                                                            }
                                                                                                            break;
                                                                                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                                                                            if (str23.equals("3")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = 2;
                                                                                                            }
                                                                                                            break;
                                                                                                        case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                                                                            if (str23.equals("4")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = 3;
                                                                                                            }
                                                                                                            break;
                                                                                                        case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                                                                        default:
                                                                                                            i30 = -1;
                                                                                                            break;
                                                                                                        case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                                                                                            if (str23.equals("6")) {
                                                                                                                i30 = -1;
                                                                                                            } else {
                                                                                                                i30 = 4;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    switch (i30) {
                                                                                                        case 0:
                                                                                                            iN2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            iN2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            iN2 = 4;
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            iN2 = 8;
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            iN2 = i10;
                                                                                                            break;
                                                                                                        default:
                                                                                                            iN2 = 0;
                                                                                                            break;
                                                                                                    }
                                                                                                } else {
                                                                                                    iN2 = 0;
                                                                                                }
                                                                                            }
                                                                                            i22 = i51115 + 1;
                                                                                            arrayList12 = arrayList511115;
                                                                                            arrayList17 = arrayList511116;
                                                                                            arrayList44 = arrayList511117;
                                                                                        }
                                                                                        i23 |= iN2;
                                                                                        i22 = i51115 + 1;
                                                                                        arrayList12 = arrayList511115;
                                                                                        arrayList17 = arrayList511116;
                                                                                        arrayList44 = arrayList511117;
                                                                                    }
                                                                                    arrayList37 = arrayList17;
                                                                                    ArrayList arrayList511118 = arrayList44;
                                                                                    arrayList18 = arrayList12;
                                                                                    int iO7 = iN | i23 | o(arrayList45) | o(arrayList16);
                                                                                    i24 = 0;
                                                                                    while (true) {
                                                                                        if (i24 < arrayList45.size()) {
                                                                                            fVar = (f) arrayList45.get(i24);
                                                                                            if (m3.m.w("http://dashif.org/thumbnail_tile", fVar.f18739a)) {
                                                                                                int i51116 = e0.f13788a;
                                                                                                strArrSplit = str21.split("x", -1);
                                                                                                if (strArrSplit.length == 2) {
                                                                                                    i11 = 0;
                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                }
                                                                                            } else {
                                                                                                int i51117 = e0.f13788a;
                                                                                                strArrSplit = str21.split("x", -1);
                                                                                                if (strArrSplit.length == 2) {
                                                                                                    i11 = 0;
                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                                }
                                                                                            }
                                                                                            i24++;
                                                                                        } else {
                                                                                            i11 = 0;
                                                                                            pairCreate = null;
                                                                                        }
                                                                                    }
                                                                                    g0Var = new g0();
                                                                                    g0Var.f9635a = str14;
                                                                                    g0Var.j = str17;
                                                                                    g0Var.k = strD;
                                                                                    g0Var.f9642h = str18;
                                                                                    g0Var.f9641g = i15;
                                                                                    g0Var.f9638d = i20;
                                                                                    g0Var.f9639e = iO7;
                                                                                    String str7114 = str12;
                                                                                    g0Var.f9637c = str7114;
                                                                                    if (pairCreate != null) {
                                                                                        iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                    } else {
                                                                                        iIntValue = -1;
                                                                                    }
                                                                                    g0Var.D = iIntValue;
                                                                                    if (pairCreate != null) {
                                                                                        iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                    } else {
                                                                                        iIntValue2 = -1;
                                                                                    }
                                                                                    g0Var.E = iIntValue2;
                                                                                    if (je.o.l(strD)) {
                                                                                        g0Var.f9648p = i49;
                                                                                        g0Var.f9649q = i14;
                                                                                        g0Var.f9650r = fK2;
                                                                                    } else {
                                                                                        i25 = i14;
                                                                                        if (je.o.j(strD)) {
                                                                                            g0Var.f9656x = i18;
                                                                                            g0Var.f9657y = i17;
                                                                                        } else if (je.o.k(strD)) {
                                                                                            if ("application/cea-608".equals(strD)) {
                                                                                                i28 = i11;
                                                                                                while (true) {
                                                                                                    if (i28 < arrayList18.size()) {
                                                                                                        f fVar111 = (f) arrayList18.get(i28);
                                                                                                        str20 = fVar111.f18739a;
                                                                                                        String str7115 = fVar111.f18740b;
                                                                                                        if (!"urn:scte:dash:cc:cea-608:2015".equals(str20)) {
                                                                                                        }
                                                                                                        i28++;
                                                                                                        i10 = 1;
                                                                                                    } else {
                                                                                                        i27 = -1;
                                                                                                    }
                                                                                                }
                                                                                            } else if ("application/cea-708".equals(strD)) {
                                                                                                i26 = i11;
                                                                                                while (true) {
                                                                                                    if (i26 < arrayList18.size()) {
                                                                                                        f fVar112 = (f) arrayList18.get(i26);
                                                                                                        str19 = fVar112.f18739a;
                                                                                                        String str7116 = fVar112.f18740b;
                                                                                                        if (!"urn:scte:dash:cc:cea-708:2015".equals(str19)) {
                                                                                                        }
                                                                                                        i26++;
                                                                                                    } else {
                                                                                                        i27 = -1;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i27 = -1;
                                                                                            }
                                                                                            g0Var.C = i27;
                                                                                        } else if ("image".equals(je.o.g(strD))) {
                                                                                            g0Var.f9648p = i49;
                                                                                            g0Var.f9649q = i25;
                                                                                        }
                                                                                    }
                                                                                    Format format8 = new Format(g0Var);
                                                                                    if (sVarR != null) {
                                                                                        rVar = sVarR;
                                                                                    } else {
                                                                                        rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                    }
                                                                                    if (arrayList8.isEmpty()) {
                                                                                        arrayList19 = arrayList8;
                                                                                    } else {
                                                                                        arrayList19 = arrayList9;
                                                                                    }
                                                                                    d dVar7 = new d(format8, arrayList19, rVar, str16, arrayList511114, arrayList511118, arrayList45, arrayList16);
                                                                                    iH = je.o.h(format8.I);
                                                                                    i29 = i16;
                                                                                    if (i29 != -1) {
                                                                                        if (iH != -1) {
                                                                                            if (i29 == iH) {
                                                                                                z6 = 1;
                                                                                            } else {
                                                                                                z6 = i11;
                                                                                            }
                                                                                            je.b.k(z6);
                                                                                        }
                                                                                        iH = i29;
                                                                                    }
                                                                                    ArrayList arrayList511119 = arrayList11;
                                                                                    arrayList511119.add(dVar7);
                                                                                    arrayList40 = arrayList511119;
                                                                                    str52 = str7114;
                                                                                    i12 = iH;
                                                                                    arrayList7 = arrayList18;
                                                                                    arrayList39 = arrayList13;
                                                                                    j12 = j19;
                                                                                    arrayList35 = arrayList10;
                                                                                    str46 = str10;
                                                                                } else {
                                                                                    arrayList16 = arrayList15;
                                                                                    j19 = j18;
                                                                                }
                                                                                str18 = str65;
                                                                                i19 = 0;
                                                                                i20 = 0;
                                                                                while (i19 < arrayList37.size()) {
                                                                                    ArrayList arrayList5111110 = arrayList37;
                                                                                    fVar4 = (f) arrayList5111110.get(i19);
                                                                                    int i51118 = i19;
                                                                                    if (!m3.m.w("urn:mpeg:dash:role:2011", fVar4.f18739a)) {
                                                                                        str24 = fVar4.f18740b;
                                                                                        if (str24 == null) {
                                                                                            i31 = 0;
                                                                                        } else {
                                                                                            i31 = 2;
                                                                                        }
                                                                                        i20 = i31 | i20;
                                                                                    }
                                                                                    i19 = i51118 + 1;
                                                                                    arrayList37 = arrayList5111110;
                                                                                }
                                                                                arrayList17 = arrayList37;
                                                                                ArrayList arrayList5111111 = arrayList14;
                                                                                i21 = 0;
                                                                                iN = 0;
                                                                                while (i21 < arrayList17.size()) {
                                                                                    fVar3 = (f) arrayList17.get(i21);
                                                                                    int i51119 = i21;
                                                                                    if (m3.m.w("urn:mpeg:dash:role:2011", fVar3.f18739a)) {
                                                                                        iN = n(fVar3.f18740b) | iN;
                                                                                    }
                                                                                    i21 = i51119 + 1;
                                                                                }
                                                                                i22 = 0;
                                                                                i23 = 0;
                                                                                while (i22 < arrayList12.size()) {
                                                                                    ArrayList arrayList5111112 = arrayList12;
                                                                                    int i511110 = i22;
                                                                                    fVar2 = (f) arrayList5111112.get(i22);
                                                                                    ArrayList arrayList5111113 = arrayList17;
                                                                                    str22 = fVar2.f18739a;
                                                                                    ArrayList arrayList5111114 = arrayList44;
                                                                                    str23 = fVar2.f18740b;
                                                                                    if (m3.m.w("urn:mpeg:dash:role:2011", str22)) {
                                                                                        iN2 = n(str23);
                                                                                    } else {
                                                                                        if (!m3.m.w("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18739a)) {
                                                                                            if (str23 == null) {
                                                                                                switch (str23.hashCode()) {
                                                                                                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                                                                        if (str23.equals("1")) {
                                                                                                            i30 = -1;
                                                                                                        } else {
                                                                                                            i30 = 0;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 50:
                                                                                                        if (str23.equals("2")) {
                                                                                                            i30 = -1;
                                                                                                        } else {
                                                                                                            i30 = i10;
                                                                                                        }
                                                                                                        break;
                                                                                                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                                                                        if (str23.equals("3")) {
                                                                                                            i30 = -1;
                                                                                                        } else {
                                                                                                            i30 = 2;
                                                                                                        }
                                                                                                        break;
                                                                                                    case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                                                                        if (str23.equals("4")) {
                                                                                                            i30 = -1;
                                                                                                        } else {
                                                                                                            i30 = 3;
                                                                                                        }
                                                                                                        break;
                                                                                                    case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                                                                    default:
                                                                                                        i30 = -1;
                                                                                                        break;
                                                                                                    case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                                                                                                        if (str23.equals("6")) {
                                                                                                            i30 = -1;
                                                                                                        } else {
                                                                                                            i30 = 4;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                switch (i30) {
                                                                                                    case 0:
                                                                                                        iN2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        iN2 = RecyclerView.ItemAnimator.FLAG_MOVED;
                                                                                                        break;
                                                                                                    case 2:
                                                                                                        iN2 = 4;
                                                                                                        break;
                                                                                                    case 3:
                                                                                                        iN2 = 8;
                                                                                                        break;
                                                                                                    case 4:
                                                                                                        iN2 = i10;
                                                                                                        break;
                                                                                                    default:
                                                                                                        iN2 = 0;
                                                                                                        break;
                                                                                                }
                                                                                            } else {
                                                                                                iN2 = 0;
                                                                                            }
                                                                                        }
                                                                                        i22 = i511110 + 1;
                                                                                        arrayList12 = arrayList5111112;
                                                                                        arrayList17 = arrayList5111113;
                                                                                        arrayList44 = arrayList5111114;
                                                                                    }
                                                                                    i23 |= iN2;
                                                                                    i22 = i511110 + 1;
                                                                                    arrayList12 = arrayList5111112;
                                                                                    arrayList17 = arrayList5111113;
                                                                                    arrayList44 = arrayList5111114;
                                                                                }
                                                                                arrayList37 = arrayList17;
                                                                                ArrayList arrayList5111115 = arrayList44;
                                                                                arrayList18 = arrayList12;
                                                                                int iO8 = iN | i23 | o(arrayList45) | o(arrayList16);
                                                                                i24 = 0;
                                                                                while (true) {
                                                                                    if (i24 < arrayList45.size()) {
                                                                                        fVar = (f) arrayList45.get(i24);
                                                                                        if (m3.m.w("http://dashif.org/thumbnail_tile", fVar.f18739a)) {
                                                                                            int i511111 = e0.f13788a;
                                                                                            strArrSplit = str21.split("x", -1);
                                                                                            if (strArrSplit.length == 2) {
                                                                                                i11 = 0;
                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                            }
                                                                                        } else {
                                                                                            int i511112 = e0.f13788a;
                                                                                            strArrSplit = str21.split("x", -1);
                                                                                            if (strArrSplit.length == 2) {
                                                                                                i11 = 0;
                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[i10])));
                                                                                            }
                                                                                        }
                                                                                        i24++;
                                                                                    } else {
                                                                                        i11 = 0;
                                                                                        pairCreate = null;
                                                                                    }
                                                                                }
                                                                                g0Var = new g0();
                                                                                g0Var.f9635a = str14;
                                                                                g0Var.j = str17;
                                                                                g0Var.k = strD;
                                                                                g0Var.f9642h = str18;
                                                                                g0Var.f9641g = i15;
                                                                                g0Var.f9638d = i20;
                                                                                g0Var.f9639e = iO8;
                                                                                String str7117 = str12;
                                                                                g0Var.f9637c = str7117;
                                                                                if (pairCreate != null) {
                                                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                } else {
                                                                                    iIntValue = -1;
                                                                                }
                                                                                g0Var.D = iIntValue;
                                                                                if (pairCreate != null) {
                                                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                } else {
                                                                                    iIntValue2 = -1;
                                                                                }
                                                                                g0Var.E = iIntValue2;
                                                                                if (je.o.l(strD)) {
                                                                                    g0Var.f9648p = i49;
                                                                                    g0Var.f9649q = i14;
                                                                                    g0Var.f9650r = fK2;
                                                                                } else {
                                                                                    i25 = i14;
                                                                                    if (je.o.j(strD)) {
                                                                                        g0Var.f9656x = i18;
                                                                                        g0Var.f9657y = i17;
                                                                                    } else if (je.o.k(strD)) {
                                                                                        if ("application/cea-608".equals(strD)) {
                                                                                            i28 = i11;
                                                                                            while (true) {
                                                                                                if (i28 < arrayList18.size()) {
                                                                                                    f fVar113 = (f) arrayList18.get(i28);
                                                                                                    str20 = fVar113.f18739a;
                                                                                                    String str7118 = fVar113.f18740b;
                                                                                                    if (!"urn:scte:dash:cc:cea-608:2015".equals(str20)) {
                                                                                                    }
                                                                                                    i28++;
                                                                                                    i10 = 1;
                                                                                                } else {
                                                                                                    i27 = -1;
                                                                                                }
                                                                                            }
                                                                                        } else if ("application/cea-708".equals(strD)) {
                                                                                            i26 = i11;
                                                                                            while (true) {
                                                                                                if (i26 < arrayList18.size()) {
                                                                                                    f fVar114 = (f) arrayList18.get(i26);
                                                                                                    str19 = fVar114.f18739a;
                                                                                                    String str7119 = fVar114.f18740b;
                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(str19)) {
                                                                                                    }
                                                                                                    i26++;
                                                                                                } else {
                                                                                                    i27 = -1;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i27 = -1;
                                                                                        }
                                                                                        g0Var.C = i27;
                                                                                    } else if ("image".equals(je.o.g(strD))) {
                                                                                        g0Var.f9648p = i49;
                                                                                        g0Var.f9649q = i25;
                                                                                    }
                                                                                }
                                                                                Format format9 = new Format(g0Var);
                                                                                if (sVarR != null) {
                                                                                    rVar = sVarR;
                                                                                } else {
                                                                                    rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                }
                                                                                if (arrayList8.isEmpty()) {
                                                                                    arrayList19 = arrayList8;
                                                                                } else {
                                                                                    arrayList19 = arrayList9;
                                                                                }
                                                                                d dVar8 = new d(format9, arrayList19, rVar, str16, arrayList5111111, arrayList5111115, arrayList45, arrayList16);
                                                                                iH = je.o.h(format9.I);
                                                                                i29 = i16;
                                                                                if (i29 != -1) {
                                                                                    if (iH != -1) {
                                                                                        if (i29 == iH) {
                                                                                            z6 = 1;
                                                                                        } else {
                                                                                            z6 = i11;
                                                                                        }
                                                                                        je.b.k(z6);
                                                                                    }
                                                                                    iH = i29;
                                                                                }
                                                                                ArrayList arrayList5111116 = arrayList11;
                                                                                arrayList5111116.add(dVar8);
                                                                                arrayList40 = arrayList5111116;
                                                                                str52 = str7117;
                                                                                i12 = iH;
                                                                                arrayList7 = arrayList18;
                                                                                arrayList39 = arrayList13;
                                                                                j12 = j19;
                                                                                arrayList35 = arrayList10;
                                                                                str46 = str10;
                                                                            } else {
                                                                                arrayList43 = arrayList14;
                                                                                arrayList44 = arrayList44;
                                                                                ArrayList arrayList61 = arrayList12;
                                                                                String str81 = str63;
                                                                                long j45 = j18;
                                                                                iC2 = i18;
                                                                                arrayList46 = arrayList15;
                                                                                str56 = str56;
                                                                                str60 = str11;
                                                                                arrayList4 = arrayList5;
                                                                                str54 = str15;
                                                                                str67 = str47;
                                                                                arrayList42 = arrayList9;
                                                                                arrayList39 = arrayList13;
                                                                                j36 = j36;
                                                                                str68 = str16;
                                                                                i52 = i16;
                                                                                arrayList48 = arrayList34;
                                                                                arrayList35 = arrayList10;
                                                                                arrayList40 = arrayList11;
                                                                                str5 = str12;
                                                                                attributeValue21 = str14;
                                                                                i51 = i17;
                                                                                str46 = str10;
                                                                                str42 = str6;
                                                                                i10 = 1;
                                                                                str57 = str57;
                                                                                str55 = str55;
                                                                                sVarP = sVarR;
                                                                                jD4 = j17;
                                                                                str30 = str30;
                                                                                str44 = str7;
                                                                                j34 = j15;
                                                                                z5 = z5;
                                                                                j30 = j30;
                                                                                str61 = str49;
                                                                                arrayList36 = arrayList61;
                                                                                str58 = str13;
                                                                                arrayList41 = arrayList6;
                                                                                arrayList47 = arrayList8;
                                                                                str45 = str8;
                                                                                arrayList33 = arrayList27;
                                                                                jI7 = j45;
                                                                                str63 = str81;
                                                                                str64 = str50;
                                                                                i48 = i15;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str31 = str31;
                                                                        arrayList34 = arrayList34;
                                                                        str30 = str30;
                                                                        arrayList38 = arrayList38;
                                                                        str43 = str43;
                                                                        long j46 = jI7;
                                                                        j30 = j30;
                                                                        str6 = str42;
                                                                        str7 = str44;
                                                                        arrayList27 = arrayList33;
                                                                        ArrayList arrayList62 = arrayList35;
                                                                        str8 = str45;
                                                                        String str82 = str46;
                                                                        str47 = str47;
                                                                        f13 = f13;
                                                                        str48 = str48;
                                                                        str51 = str51;
                                                                        str49 = str49;
                                                                        i11 = 0;
                                                                        arrayList5 = arrayList4;
                                                                        int i60 = i45;
                                                                        arrayList6 = arrayList41;
                                                                        ArrayList arrayList63 = arrayList39;
                                                                        ArrayList arrayList64 = arrayList36;
                                                                        z5 = z5;
                                                                        j15 = j34;
                                                                        if (je.b.C(xmlPullParser, str82)) {
                                                                            sVarR3 = p(xmlPullParser, (r) sVarR3);
                                                                            str46 = str82;
                                                                            str52 = str5;
                                                                            arrayList7 = arrayList64;
                                                                            i12 = i60;
                                                                            arrayList39 = arrayList63;
                                                                            j12 = j46;
                                                                            arrayList35 = arrayList62;
                                                                        } else {
                                                                            str45 = str8;
                                                                            if (je.b.C(xmlPullParser, str45)) {
                                                                                arrayList7 = arrayList64;
                                                                                long jD7 = d(xmlPullParser, j35);
                                                                                str46 = str82;
                                                                                sVarR3 = q(xmlPullParser, (o) sVarR3, j30, j46, jD3, jD7, j15);
                                                                                j15 = j15;
                                                                                j12 = j46;
                                                                                j35 = jD7;
                                                                                i12 = i60;
                                                                                arrayList39 = arrayList63;
                                                                                text = text;
                                                                                jD3 = jD3;
                                                                                str52 = str5;
                                                                                arrayList35 = arrayList62;
                                                                            } else {
                                                                                str46 = str82;
                                                                                arrayList7 = arrayList64;
                                                                                j16 = j35;
                                                                                j12 = j46;
                                                                                if (je.b.C(xmlPullParser, str6)) {
                                                                                    str5 = str5;
                                                                                    long jD8 = d(xmlPullParser, j16);
                                                                                    arrayList39 = arrayList63;
                                                                                    str42 = str6;
                                                                                    sVarR3 = r(xmlPullParser, (p) sVarR3, arrayList39, j30, j12, jD3, jD8, j15);
                                                                                    j35 = jD8;
                                                                                    text = text;
                                                                                    str52 = str5;
                                                                                    i12 = i60;
                                                                                    arrayList35 = arrayList62;
                                                                                } else {
                                                                                    i45 = i60;
                                                                                    arrayList39 = arrayList63;
                                                                                    str42 = str6;
                                                                                    if (je.b.C(xmlPullParser, "InbandEventStream")) {
                                                                                        str5 = str5;
                                                                                        arrayList35 = arrayList62;
                                                                                        arrayList35.add(h(xmlPullParser, "InbandEventStream"));
                                                                                    } else {
                                                                                        arrayList35 = arrayList62;
                                                                                        if (je.b.C(xmlPullParser, "Label")) {
                                                                                            str5 = str5;
                                                                                            text = "";
                                                                                            do {
                                                                                                xmlPullParser.next();
                                                                                                if (xmlPullParser.getEventType() == 4) {
                                                                                                    text = xmlPullParser.getText();
                                                                                                } else {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                            } while (!je.b.B(xmlPullParser, "Label"));
                                                                                            j35 = j16;
                                                                                        } else if (xmlPullParser.getEventType() == 2) {
                                                                                            str5 = str5;
                                                                                            b(xmlPullParser);
                                                                                        }
                                                                                        str52 = str5;
                                                                                        i12 = i45;
                                                                                    }
                                                                                    str5 = str5;
                                                                                    j35 = j16;
                                                                                    text = text;
                                                                                    str52 = str5;
                                                                                    i12 = i45;
                                                                                }
                                                                                str44 = str7;
                                                                            }
                                                                        }
                                                                        str44 = str7;
                                                                        str42 = str6;
                                                                    }
                                                                    str45 = str8;
                                                                    str44 = str7;
                                                                    str42 = str6;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    arrayList37 = arrayList37;
                                                    str43 = str43;
                                                    j30 = j30;
                                                    str42 = str42;
                                                    str7 = str44;
                                                    arrayList35 = arrayList35;
                                                    str45 = str45;
                                                    str46 = str46;
                                                    str47 = str47;
                                                    f13 = f13;
                                                    str48 = str48;
                                                    str51 = str51;
                                                    str49 = str49;
                                                    j16 = j35;
                                                    i11 = 0;
                                                    arrayList6 = arrayList41;
                                                    z5 = z5;
                                                    arrayList5 = arrayList4;
                                                    j12 = jI7;
                                                    arrayList27 = arrayList33;
                                                    arrayList7 = arrayList36;
                                                    j15 = j34;
                                                    str5 = str5;
                                                    j35 = j16;
                                                    text = text;
                                                    str52 = str5;
                                                    i12 = i45;
                                                    str44 = str7;
                                                }
                                                if (je.b.B(xmlPullParser, str44)) {
                                                    arrayList20 = new ArrayList(arrayList40.size());
                                                    i33 = i11;
                                                    while (i33 < arrayList40.size()) {
                                                        arrayList21 = arrayList40;
                                                        d dVar9 = (d) arrayList21.get(i33);
                                                        g0VarA = dVar9.f18726a.a();
                                                        if (text != null) {
                                                            g0VarA.f9636b = text;
                                                        }
                                                        str26 = dVar9.f18729d;
                                                        if (str26 == null) {
                                                            str26 = str53;
                                                        }
                                                        arrayList22 = dVar9.f18730e;
                                                        ArrayList arrayList65 = arrayList34;
                                                        arrayList22.addAll(arrayList65);
                                                        ArrayList arrayList66 = arrayList39;
                                                        long j47 = j12;
                                                        if (arrayList22.isEmpty()) {
                                                            str27 = text;
                                                            arrayList40 = arrayList21;
                                                            j20 = j15;
                                                        } else {
                                                            i34 = i11;
                                                            while (true) {
                                                                if (i34 < arrayList22.size()) {
                                                                    hVar4 = (mc.h) arrayList22.get(i34);
                                                                    str27 = text;
                                                                    if (gc.h.f9671c.equals(hVar4.f15554e) || (str28 = hVar4.f15555i) == null) {
                                                                        i34++;
                                                                        text = str27;
                                                                    } else {
                                                                        arrayList22.remove(i34);
                                                                    }
                                                                } else {
                                                                    str27 = text;
                                                                    str28 = null;
                                                                }
                                                            }
                                                            if (str28 != null) {
                                                                i35 = i11;
                                                                while (i35 < arrayList22.size()) {
                                                                    hVar = (mc.h) arrayList22.get(i35);
                                                                    ArrayList arrayList67 = arrayList21;
                                                                    if (!gc.h.f9670b.equals(hVar.f15554e) && hVar.f15555i == null) {
                                                                        arrayList22.set(i35, new mc.h(gc.h.f9671c, str28, hVar.f15556v, hVar.f15557w));
                                                                    }
                                                                    i35++;
                                                                    j15 = j15;
                                                                    arrayList21 = arrayList67;
                                                                }
                                                            }
                                                            arrayList40 = arrayList21;
                                                            j20 = j15;
                                                            for (size = arrayList22.size() - 1; size >= 0; size--) {
                                                                hVar2 = (mc.h) arrayList22.get(size);
                                                                if (hVar2.f15557w != null) {
                                                                    for (i36 = i11; i36 < arrayList22.size(); i36++) {
                                                                        hVar3 = (mc.h) arrayList22.get(i36);
                                                                        if (hVar3.f15557w == null && hVar2.f15557w == null && hVar3.a(hVar2.f15554e)) {
                                                                            arrayList22.remove(size);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            g0VarA.f9646n = new mc.i(str26, arrayList22);
                                                        }
                                                        arrayList23 = dVar9.f18731f;
                                                        arrayList23.addAll(arrayList35);
                                                        format = new Format(g0VarA);
                                                        e0Var = dVar9.f18727b;
                                                        sVar = dVar9.f18728c;
                                                        arrayList24 = dVar9.f18732g;
                                                        arrayList25 = dVar9.f18733h;
                                                        if (sVar instanceof r) {
                                                            kVar = new l(format, e0Var, (r) sVar, arrayList23, arrayList24, arrayList25);
                                                        } else {
                                                            if (sVar instanceof n) {
                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                            }
                                                            kVar = new k(format, e0Var, (n) sVar, arrayList23, arrayList24, arrayList25);
                                                        }
                                                        arrayList20.add(kVar);
                                                        i33++;
                                                        arrayList34 = arrayList65;
                                                        text = str27;
                                                        arrayList39 = arrayList66;
                                                        j15 = j20;
                                                        j12 = j47;
                                                    }
                                                    i10 = 1;
                                                    arrayList32.add(new a(j33, i12, arrayList20, arrayList7, arrayList38, arrayList39));
                                                    j7 = j15;
                                                    j11 = j30;
                                                    str = str49;
                                                    j = -9223372036854775807L;
                                                } else {
                                                    j34 = j15;
                                                    i10 = 1;
                                                    arrayList39 = arrayList39;
                                                    arrayList35 = arrayList35;
                                                    str46 = str46;
                                                    str42 = str42;
                                                    z5 = z5;
                                                    text = text;
                                                    str47 = str47;
                                                    arrayList36 = arrayList7;
                                                    arrayList41 = arrayList6;
                                                    str51 = str51;
                                                    arrayList37 = arrayList37;
                                                    str31 = str31;
                                                    j30 = j30;
                                                    str43 = str43;
                                                    arrayList34 = arrayList34;
                                                    str49 = str49;
                                                    str45 = str45;
                                                    arrayList33 = arrayList27;
                                                    str48 = str48;
                                                    f13 = f13;
                                                    arrayList38 = arrayList38;
                                                    int i61 = i12;
                                                    str44 = str44;
                                                    str30 = str30;
                                                    long j48 = j12;
                                                    arrayList4 = arrayList5;
                                                    jI7 = j48;
                                                    i45 = i61;
                                                }
                                            }
                                            jD3 = jD3;
                                            i11 = 0;
                                            i12 = i45;
                                            arrayList6 = arrayList41;
                                            z5 = z5;
                                            text = text;
                                            arrayList5 = arrayList4;
                                            j12 = jI7;
                                            arrayList27 = arrayList33;
                                            arrayList7 = arrayList36;
                                            j15 = j34;
                                            if (je.b.B(xmlPullParser, str44)) {
                                                arrayList20 = new ArrayList(arrayList40.size());
                                                i33 = i11;
                                                while (i33 < arrayList40.size()) {
                                                    arrayList21 = arrayList40;
                                                    d dVar10 = (d) arrayList21.get(i33);
                                                    g0VarA = dVar10.f18726a.a();
                                                    if (text != null) {
                                                        g0VarA.f9636b = text;
                                                    }
                                                    str26 = dVar10.f18729d;
                                                    if (str26 == null) {
                                                        str26 = str53;
                                                    }
                                                    arrayList22 = dVar10.f18730e;
                                                    ArrayList arrayList68 = arrayList34;
                                                    arrayList22.addAll(arrayList68);
                                                    ArrayList arrayList69 = arrayList39;
                                                    long j49 = j12;
                                                    if (arrayList22.isEmpty()) {
                                                        i34 = i11;
                                                        while (true) {
                                                            if (i34 < arrayList22.size()) {
                                                                hVar4 = (mc.h) arrayList22.get(i34);
                                                                str27 = text;
                                                                if (gc.h.f9671c.equals(hVar4.f15554e)) {
                                                                }
                                                                i34++;
                                                                text = str27;
                                                            } else {
                                                                str27 = text;
                                                                str28 = null;
                                                            }
                                                        }
                                                        if (str28 != null) {
                                                            i35 = i11;
                                                            while (i35 < arrayList22.size()) {
                                                                hVar = (mc.h) arrayList22.get(i35);
                                                                ArrayList arrayList610 = arrayList21;
                                                                if (!gc.h.f9670b.equals(hVar.f15554e)) {
                                                                }
                                                                i35++;
                                                                j15 = j15;
                                                                arrayList21 = arrayList610;
                                                            }
                                                        }
                                                        arrayList40 = arrayList21;
                                                        j20 = j15;
                                                        while (size >= 0) {
                                                            hVar2 = (mc.h) arrayList22.get(size);
                                                            if (hVar2.f15557w != null) {
                                                                while (i36 < arrayList22.size()) {
                                                                    hVar3 = (mc.h) arrayList22.get(i36);
                                                                    if (hVar3.f15557w == null) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        g0VarA.f9646n = new mc.i(str26, arrayList22);
                                                    } else {
                                                        str27 = text;
                                                        arrayList40 = arrayList21;
                                                        j20 = j15;
                                                    }
                                                    arrayList23 = dVar10.f18731f;
                                                    arrayList23.addAll(arrayList35);
                                                    format = new Format(g0VarA);
                                                    e0Var = dVar10.f18727b;
                                                    sVar = dVar10.f18728c;
                                                    arrayList24 = dVar10.f18732g;
                                                    arrayList25 = dVar10.f18733h;
                                                    if (sVar instanceof r) {
                                                        kVar = new l(format, e0Var, (r) sVar, arrayList23, arrayList24, arrayList25);
                                                    } else {
                                                        if (sVar instanceof n) {
                                                            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                        }
                                                        kVar = new k(format, e0Var, (n) sVar, arrayList23, arrayList24, arrayList25);
                                                    }
                                                    arrayList20.add(kVar);
                                                    i33++;
                                                    arrayList34 = arrayList68;
                                                    text = str27;
                                                    arrayList39 = arrayList69;
                                                    j15 = j20;
                                                    j12 = j49;
                                                }
                                                i10 = 1;
                                                arrayList32.add(new a(j33, i12, arrayList20, arrayList7, arrayList38, arrayList39));
                                                j7 = j15;
                                                j11 = j30;
                                                str = str49;
                                                j = -9223372036854775807L;
                                            } else {
                                                j34 = j15;
                                                i10 = 1;
                                                arrayList39 = arrayList39;
                                                arrayList35 = arrayList35;
                                                str46 = str46;
                                                str42 = str42;
                                                z5 = z5;
                                                text = text;
                                                str47 = str47;
                                                arrayList36 = arrayList7;
                                                arrayList41 = arrayList6;
                                                str51 = str51;
                                                arrayList37 = arrayList37;
                                                str31 = str31;
                                                j30 = j30;
                                                str43 = str43;
                                                arrayList34 = arrayList34;
                                                str49 = str49;
                                                str45 = str45;
                                                arrayList33 = arrayList27;
                                                str48 = str48;
                                                f13 = f13;
                                                arrayList38 = arrayList38;
                                                int i62 = i12;
                                                str44 = str44;
                                                str30 = str30;
                                                long j410 = j12;
                                                arrayList4 = arrayList5;
                                                jI7 = j410;
                                                i45 = i62;
                                            }
                                        }
                                    } else {
                                        arrayList3 = arrayList28;
                                        str31 = str31;
                                        String str83 = str37;
                                        j23 = j23;
                                        str30 = str30;
                                        long j50 = jI4;
                                        long j51 = jI7;
                                        long j52 = j30;
                                        i11 = 0;
                                        arrayList27 = arrayList27;
                                        z5 = z5;
                                        ArrayList arrayList70 = arrayList32;
                                        if (je.b.C(xmlPullParser, "EventStream")) {
                                            String str84 = str41;
                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str84);
                                            String str85 = attributeValue28 == null ? "" : attributeValue28;
                                            String str86 = str40;
                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str86);
                                            String str87 = attributeValue29 == null ? "" : attributeValue29;
                                            String attributeValue30 = xmlPullParser.getAttributeValue(null, "timescale");
                                            long j53 = attributeValue30 == null ? 1L : Long.parseLong(attributeValue30);
                                            String attributeValue31 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                            long j54 = attributeValue31 == null ? 0L : Long.parseLong(attributeValue31);
                                            ArrayList arrayList71 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
                                            while (true) {
                                                xmlPullParser.next();
                                                if (je.b.C(xmlPullParser, "Event")) {
                                                    str4 = str83;
                                                    String attributeValue32 = xmlPullParser.getAttributeValue(null, str4);
                                                    long j55 = attributeValue32 == null ? 0L : Long.parseLong(attributeValue32);
                                                    str3 = str39;
                                                    String attributeValue33 = xmlPullParser.getAttributeValue(null, str3);
                                                    long j56 = attributeValue33 == null ? -9223372036854775807L : Long.parseLong(attributeValue33);
                                                    String attributeValue34 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                    long j57 = attributeValue34 == null ? 0L : Long.parseLong(attributeValue34);
                                                    long jP = e0.P(j56, 1000L, j53);
                                                    long jP2 = e0.P(j57 - j54, 1000000L, j53);
                                                    String attributeValue35 = xmlPullParser.getAttributeValue(null, "messageData");
                                                    if (attributeValue35 == null) {
                                                        attributeValue35 = null;
                                                    }
                                                    byteArrayOutputStream.reset();
                                                    XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                                    xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, di.d.f7631c.name());
                                                    xmlPullParser.nextToken();
                                                    while (!je.b.B(xmlPullParser, "Event")) {
                                                        switch (xmlPullParser.getEventType()) {
                                                            case 0:
                                                                str86 = str86;
                                                                j14 = j54;
                                                                xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                                                break;
                                                            case 1:
                                                                str86 = str86;
                                                                j14 = j54;
                                                                xmlSerializerNewSerializer.endDocument();
                                                                break;
                                                            case 2:
                                                                xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                int i63 = 0;
                                                                while (i63 < xmlPullParser.getAttributeCount()) {
                                                                    xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i63), xmlPullParser.getAttributeName(i63), xmlPullParser.getAttributeValue(i63));
                                                                    i63++;
                                                                    j54 = j54;
                                                                }
                                                                j14 = j54;
                                                                break;
                                                            case 3:
                                                                xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                j14 = j54;
                                                                break;
                                                            case 4:
                                                                xmlSerializerNewSerializer.text(xmlPullParser.getText());
                                                                j14 = j54;
                                                                break;
                                                            case 5:
                                                                xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                                                                j14 = j54;
                                                                break;
                                                            case 6:
                                                                xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                                                                j14 = j54;
                                                                break;
                                                            case 7:
                                                                xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                j14 = j54;
                                                                break;
                                                            case 8:
                                                                xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                                                                j14 = j54;
                                                                break;
                                                            case 9:
                                                                xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                                                                j14 = j54;
                                                                break;
                                                            case 10:
                                                                xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                                                                j14 = j54;
                                                                break;
                                                            default:
                                                                j14 = j54;
                                                                break;
                                                        }
                                                        xmlPullParser.nextToken();
                                                        str86 = str86;
                                                        j54 = j14;
                                                    }
                                                    str2 = str86;
                                                    j13 = j54;
                                                    xmlSerializerNewSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    Long lValueOf = Long.valueOf(jP2);
                                                    if (attributeValue35 != null) {
                                                        byteArray = attributeValue35.getBytes(di.d.f7631c);
                                                    }
                                                    arrayList71.add(Pair.create(lValueOf, new ed.a(str85, str87, jP, j55, byteArray)));
                                                } else {
                                                    str2 = str86;
                                                    str3 = str39;
                                                    str4 = str83;
                                                    j13 = j54;
                                                    b(xmlPullParser);
                                                }
                                                if (je.b.B(xmlPullParser, "EventStream")) {
                                                    long[] jArr = new long[arrayList71.size()];
                                                    ed.a[] aVarArr = new ed.a[arrayList71.size()];
                                                    for (int i64 = 0; i64 < arrayList71.size(); i64++) {
                                                        Pair pair = (Pair) arrayList71.get(i64);
                                                        jArr[i64] = ((Long) pair.first).longValue();
                                                        aVarArr[i64] = (ed.a) pair.second;
                                                    }
                                                    arrayList30.add(new g(str85, str87, jArr, aVarArr));
                                                    str = str4;
                                                    str39 = str3;
                                                    arrayList32 = arrayList70;
                                                    str41 = str84;
                                                    j7 = j50;
                                                    j11 = j52;
                                                    j12 = j51;
                                                    j = -9223372036854775807L;
                                                    str40 = str2;
                                                } else {
                                                    str85 = str85;
                                                    str87 = str87;
                                                    str83 = str4;
                                                    str39 = str3;
                                                    str86 = str2;
                                                    str84 = str84;
                                                    j54 = j13;
                                                    j53 = j53;
                                                }
                                            }
                                        } else {
                                            String str88 = str39;
                                            String str89 = str40;
                                            ArrayList arrayList72 = arrayList30;
                                            String str90 = str41;
                                            if (je.b.C(xmlPullParser, "SegmentBase")) {
                                                sVarR2 = p(xmlPullParser, null);
                                                arrayList30 = arrayList72;
                                                str = str83;
                                                str39 = str88;
                                                arrayList32 = arrayList70;
                                                str38 = str38;
                                                str41 = str90;
                                                j7 = j50;
                                                j11 = j52;
                                                j12 = j51;
                                                j = -9223372036854775807L;
                                                str40 = str89;
                                            } else if (je.b.C(xmlPullParser, "SegmentList")) {
                                                j = -9223372036854775807L;
                                                long jD9 = d(xmlPullParser, -9223372036854775807L);
                                                arrayList30 = arrayList72;
                                                str = str83;
                                                str39 = str88;
                                                str41 = str90;
                                                jI4 = j50;
                                                str40 = str89;
                                                sVarR2 = q(xmlPullParser, null, j52, j51, j10, jD9, jI4);
                                                j12 = j51;
                                                j11 = j52;
                                                j31 = jD9;
                                                arrayList32 = arrayList70;
                                            } else {
                                                arrayList30 = arrayList72;
                                                str = str83;
                                                str39 = str88;
                                                str41 = str90;
                                                j11 = j52;
                                                j12 = j51;
                                                j = -9223372036854775807L;
                                                str40 = str89;
                                                if (je.b.C(xmlPullParser, "SegmentTemplate")) {
                                                    long jD10 = d(xmlPullParser, -9223372036854775807L);
                                                    c0 c0Var = ei.e0.f8303e;
                                                    arrayList32 = arrayList70;
                                                    j7 = j50;
                                                    sVarR2 = r(xmlPullParser, null, r0.f8352w, j11, j12, j10, jD10, j7);
                                                    j31 = jD10;
                                                } else {
                                                    arrayList32 = arrayList70;
                                                    j7 = j50;
                                                    if (je.b.C(xmlPullParser, "AssetIdentifier")) {
                                                        h(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        b(xmlPullParser);
                                                    }
                                                }
                                            }
                                            if (je.b.B(xmlPullParser, str38)) {
                                                pairCreate2 = Pair.create(new h(attributeValue11, jI6, arrayList32, arrayList30), Long.valueOf(j12));
                                                hVar5 = (h) pairCreate2.first;
                                                if (hVar5.f18747b != j) {
                                                    jLongValue = ((Long) pairCreate2.second).longValue();
                                                    if (jLongValue == j) {
                                                        j21 = j;
                                                    } else {
                                                        j21 = jLongValue + hVar5.f18747b;
                                                    }
                                                    arrayList26 = arrayList26;
                                                    arrayList26.add(hVar5);
                                                    j23 = j21;
                                                } else {
                                                    if (!zEquals) {
                                                        throw h1.b("Unable to determine start of period " + arrayList26.size(), null);
                                                    }
                                                    arrayList26 = arrayList26;
                                                    i40 = i10;
                                                }
                                            } else {
                                                arrayList27 = arrayList27;
                                                jI7 = j12;
                                                str38 = str38;
                                                jI4 = j7;
                                                z5 = z5;
                                                arrayList28 = arrayList3;
                                                j23 = j23;
                                                str31 = str31;
                                                str30 = str30;
                                                j30 = j11;
                                                arrayList31 = arrayList2;
                                                jD2 = j10;
                                                str37 = str;
                                            }
                                        }
                                    }
                                    str38 = str38;
                                    if (je.b.B(xmlPullParser, str38)) {
                                        pairCreate2 = Pair.create(new h(attributeValue11, jI6, arrayList32, arrayList30), Long.valueOf(j12));
                                        hVar5 = (h) pairCreate2.first;
                                        if (hVar5.f18747b != j) {
                                            jLongValue = ((Long) pairCreate2.second).longValue();
                                            if (jLongValue == j) {
                                                j21 = j;
                                            } else {
                                                j21 = jLongValue + hVar5.f18747b;
                                            }
                                            arrayList26 = arrayList26;
                                            arrayList26.add(hVar5);
                                            j23 = j21;
                                        } else {
                                            if (!zEquals) {
                                                throw h1.b("Unable to determine start of period " + arrayList26.size(), null);
                                            }
                                            arrayList26 = arrayList26;
                                            i40 = i10;
                                        }
                                    } else {
                                        arrayList27 = arrayList27;
                                        jI7 = j12;
                                        str38 = str38;
                                        jI4 = j7;
                                        z5 = z5;
                                        arrayList28 = arrayList3;
                                        j23 = j23;
                                        str31 = str31;
                                        str30 = str30;
                                        j30 = j11;
                                        arrayList31 = arrayList2;
                                        jD2 = j10;
                                        str37 = str;
                                    }
                                }
                                j7 = jI4;
                                if (je.b.B(xmlPullParser, str38)) {
                                    pairCreate2 = Pair.create(new h(attributeValue11, jI6, arrayList32, arrayList30), Long.valueOf(j12));
                                    hVar5 = (h) pairCreate2.first;
                                    if (hVar5.f18747b != j) {
                                        jLongValue = ((Long) pairCreate2.second).longValue();
                                        if (jLongValue == j) {
                                            j21 = j;
                                        } else {
                                            j21 = jLongValue + hVar5.f18747b;
                                        }
                                        arrayList26 = arrayList26;
                                        arrayList26.add(hVar5);
                                        j23 = j21;
                                    } else {
                                        if (!zEquals) {
                                            throw h1.b("Unable to determine start of period " + arrayList26.size(), null);
                                        }
                                        arrayList26 = arrayList26;
                                        i40 = i10;
                                    }
                                } else {
                                    arrayList27 = arrayList27;
                                    jI7 = j12;
                                    str38 = str38;
                                    jI4 = j7;
                                    z5 = z5;
                                    arrayList28 = arrayList3;
                                    j23 = j23;
                                    str31 = str31;
                                    str30 = str30;
                                    j30 = j11;
                                    arrayList31 = arrayList2;
                                    jD2 = j10;
                                    str37 = str;
                                }
                            }
                        } else {
                            j5 = jD;
                            j23 = j23;
                            z5 = z5;
                            arrayList26 = arrayList26;
                            j = j;
                            i11 = 0;
                            arrayList27 = arrayList27;
                            j7 = jI4;
                            b(xmlPullParser);
                        }
                        jD = j5;
                    }
                    if (je.b.B(xmlPullParser, "MPD")) {
                        if (jI == j) {
                            if (j23 != j) {
                                jI = j23;
                            } else if (!zEquals) {
                                throw h1.b("Unable to determine duration of static manifest.", null);
                            }
                        }
                        if (arrayList26.isEmpty()) {
                            throw h1.b("No periods found.", null);
                        }
                        return new c(jL, jI, jI2, zEquals, jI3, j7, jI5, jL2, iVar, cVar, tVar, uriK, arrayList26);
                    }
                    arrayList26 = arrayList26;
                    jI4 = j7;
                    j22 = j;
                    i7 = i10;
                    i37 = i11;
                    arrayList27 = arrayList27;
                    z5 = z5;
                    arrayListM = arrayList;
                    j23 = j23;
                    str29 = null;
                }
                i11 = 0;
            }
            j7 = jI4;
            if (je.b.B(xmlPullParser, "MPD")) {
                if (jI == j) {
                    if (j23 != j) {
                        jI = j23;
                    } else if (!zEquals) {
                        throw h1.b("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList26.isEmpty()) {
                    return new c(jL, jI, jI2, zEquals, jI3, j7, jI5, jL2, iVar, cVar, tVar, uriK, arrayList26);
                }
                throw h1.b("No periods found.", null);
            }
            arrayList26 = arrayList26;
            jI4 = j7;
            j22 = j;
            i7 = i10;
            i37 = i11;
            arrayList27 = arrayList27;
            z5 = z5;
            arrayListM = arrayList;
            j23 = j23;
            str29 = null;
        }
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j5 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j5 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new j(j, j5, attributeValue);
    }

    public static int n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                case "description":
                    return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                case "enhanced-audio-intelligibility":
                    return RecyclerView.ItemAnimator.FLAG_MOVED;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (m3.m.w("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).f18739a)) {
                i7 = 16384;
            }
        }
        return i7;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j = rVar != null ? rVar.f18778b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j5 = j;
        long j7 = rVar != null ? rVar.f18779c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j7 = Long.parseLong(attributeValue2);
        }
        long j10 = j7;
        long j11 = rVar != null ? rVar.f18775d : 0L;
        long j12 = rVar != null ? rVar.f18776e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j11 = Long.parseLong(strArrSplit[0]);
            j12 = (Long.parseLong(strArrSplit[1]) - j11) + 1;
        }
        long j13 = j12;
        long j14 = j11;
        j jVarM = rVar != null ? rVar.f18777a : null;
        while (true) {
            xmlPullParser.next();
            if (je.b.C(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarM;
            if (je.b.B(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j5, j10, j14, j13);
            }
            jVarM = jVar;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j, long j5, long j7, long j10, long j11) throws XmlPullParserException, IOException {
        long j12 = oVar != null ? oVar.f18778b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j12 = Long.parseLong(attributeValue);
        }
        long j13 = j12;
        long j14 = oVar != null ? oVar.f18779c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j14 = Long.parseLong(attributeValue2);
        }
        long j15 = j14;
        long j16 = oVar != null ? oVar.f18767e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j16 = Long.parseLong(attributeValue3);
        }
        long j17 = j16;
        long j18 = oVar != null ? oVar.f18766d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j18 = Long.parseLong(attributeValue4);
        }
        long j19 = j18;
        long j20 = j10 == -9223372036854775807L ? j7 : j10;
        long j21 = j20 == LongCompanionObject.MAX_VALUE ? -9223372036854775807L : j20;
        j jVarM = null;
        List listS = null;
        do {
            xmlPullParser.next();
            if (je.b.C(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (je.b.C(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j13, j5);
            } else if (je.b.C(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!je.b.B(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarM == null) {
                jVarM = oVar.f18777a;
            }
            if (listS == null) {
                listS = oVar.f18768f;
            }
            if (arrayList == null) {
                arrayList = oVar.j;
            }
        }
        return new o(jVarM, j13, j15, j19, j17, listS, j21, arrayList, e0.I(j11), e0.I(j));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j, long j5, long j7, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        long j13 = pVar != null ? pVar.f18778b : 1L;
        j jVarM = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j13 = Long.parseLong(attributeValue);
        }
        long j14 = j13;
        long j15 = pVar != null ? pVar.f18779c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j15 = Long.parseLong(attributeValue2);
        }
        long j16 = j15;
        long j17 = pVar != null ? pVar.f18767e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j17 = Long.parseLong(attributeValue3);
        }
        long j18 = j17;
        long j19 = pVar != null ? pVar.f18766d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j19 = Long.parseLong(attributeValue4);
        }
        long j20 = j19;
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                j12 = -1;
                break;
            }
            f fVar = (f) list.get(i7);
            if (m3.m.w("http://dashif.org/guidelines/last-segment-number", fVar.f18739a)) {
                j12 = Long.parseLong(fVar.f18740b);
                break;
            }
            i7++;
        }
        long j21 = j12;
        long j22 = j10 == -9223372036854775807L ? j7 : j10;
        long j23 = j22 == LongCompanionObject.MAX_VALUE ? -9223372036854775807L : j22;
        we.k kVarT = t(xmlPullParser, "media", pVar != null ? pVar.k : null);
        we.k kVarT2 = t(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List listS = null;
        do {
            xmlPullParser.next();
            if (je.b.C(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (je.b.C(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j14, j5);
            } else {
                b(xmlPullParser);
            }
        } while (!je.b.B(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarM == null) {
                jVarM = pVar.f18777a;
            }
            if (listS == null) {
                listS = pVar.f18768f;
            }
        }
        return new p(jVarM, j14, j16, j20, j21, j18, listS, j23, kVarT2, kVarT, e0.I(j11), e0.I(j));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j, long j5) throws XmlPullParserException, IOException {
        long j7;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j10 = -9223372036854775807L;
        boolean z5 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (je.b.C(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j11 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z5) {
                    int i10 = i7;
                    j7 = j11;
                    jA = a(arrayList, jA, j10, i10, j7);
                } else {
                    j7 = j11;
                }
                if (j7 != -9223372036854775807L) {
                    jA = j7;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j10 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i7 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z5 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!je.b.B(xmlPullParser, "SegmentTimeline"));
        if (!z5) {
            return arrayList;
        }
        a(arrayList, jA, j10, i7, e0.P(j5, j, 1000L));
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c2. Please report as an issue. */
    public static we.k t(XmlPullParser xmlPullParser, String str, we.k kVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return kVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i7 = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i7] = strArr[i7] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i7] = strArr[i7] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i7] = com.discord.chat.presentation.list.a.k(new StringBuilder(), strArr[i7], "$");
                length += 2;
            } else {
                int i10 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i10);
                String strSubstring2 = attributeValue.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i7] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i7] = 2;
                            break;
                        case "Time":
                            iArr[i7] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i7] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i7] = strSubstring;
                }
                i7++;
                strArr[i7] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new we.k(strArr, iArr, strArr2, i7);
    }

    @Override // he.m0
    public final Object j(Uri uri, he.n nVar) throws h1 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f18738d.newPullParser();
            xmlPullParserNewPullParser.setInput(nVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return l(xmlPullParserNewPullParser, uri);
            }
            throw h1.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw h1.b(null, e10);
        }
    }
}
