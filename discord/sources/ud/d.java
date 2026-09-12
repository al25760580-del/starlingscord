package ud;

import android.util.Pair;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import androidx.metrics.performance.FrameData;
import androidx.metrics.performance.JankStats;
import com.discord.R;
import gc.h1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import md.z0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f21065e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractList f21069d;

    public d(JankStats jankStats, View view) {
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        this.f21066a = new WeakReference(view);
        Choreographer choreographer = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
        this.f21067b = choreographer;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new x2.h();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        this.f21068c = (x2.h) tag;
        ArrayList arrayList = new ArrayList();
        this.f21069d = arrayList;
        new FrameData(arrayList);
    }

    public static int g(XmlPullParser xmlPullParser, String str) throws h1 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e10) {
            throw h1.b(null, e10);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) throws h1 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e10) {
            throw h1.b(null, e10);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) throws h1 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new z0(str, 2);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e10) {
            throw h1.b(null, e10);
        }
    }

    public abstract Object b();

    public Object c(String str) {
        LinkedList linkedList = (LinkedList) this.f21069d;
        for (int i7 = 0; i7 < linkedList.size(); i7++) {
            Pair pair = (Pair) linkedList.get(i7);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
        }
        d dVar = (d) this.f21068c;
        if (dVar == null) {
            return null;
        }
        return dVar.c(str);
    }

    public boolean d(String str) {
        return false;
    }

    public Object e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z5 = false;
        int i7 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d hVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (((String) this.f21067b).equals(name)) {
                    j(xmlPullParser);
                    z5 = true;
                } else if (z5) {
                    if (i7 > 0) {
                        i7++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        String str = (String) this.f21066a;
                        if ("QualityLevel".equals(name)) {
                            hVar = new f(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            hVar = new e(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            hVar = new h(this, str);
                        }
                        if (hVar == null) {
                            i7 = 1;
                        } else {
                            a(hVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z5 && i7 == 0) {
                    k(xmlPullParser);
                }
            } else if (!z5) {
                continue;
            } else if (i7 > 0) {
                i7--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public void l(Object obj, String str) {
        ((LinkedList) this.f21069d).add(Pair.create(str, obj));
    }

    public d(d dVar, String str, String str2) {
        this.f21068c = dVar;
        this.f21066a = str;
        this.f21067b = str2;
        this.f21069d = new LinkedList();
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
