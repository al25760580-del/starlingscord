package f3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.pm.ShortcutInfoCompat;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ArrayList f8798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f8799b = new Object();

    public static String a(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue(null, str) : attributeValue;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static s.e c(Context context, File file) {
        g gVarF;
        s.e eVar = new s.e(0);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                if (file.exists()) {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStream, "UTF_8");
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2 && xmlPullParserNewPullParser.getName().equals("target") && (gVarF = f(xmlPullParserNewPullParser, context)) != null) {
                            eVar.put(gVarF.f8815c.f1544b, gVarF);
                        }
                        file.delete();
                        Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
                        return eVar;
                    }
                }
                fileInputStream.close();
                return eVar;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e10);
            return eVar;
        }
    }

    public static c d(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        String strA = a(xmlResourceParser, "targetClass");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                        break;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    name.getClass();
                    if (name.equals("data")) {
                        a(xmlResourceParser, "scheme");
                        a(xmlResourceParser, "host");
                        a(xmlResourceParser, "port");
                        a(xmlResourceParser, "path");
                        a(xmlResourceParser, "pathPattern");
                        a(xmlResourceParser, "pathPrefix");
                        arrayList.add(new b(a(xmlResourceParser, "mimeType")));
                    } else if (name.equals("category")) {
                        arrayList2.add(a(xmlResourceParser, StackTraceHelper.NAME_KEY));
                    }
                }
            } else {
                break;
            }
        }
        if (arrayList.isEmpty() || strA == null || arrayList2.isEmpty()) {
            return null;
        }
        return new c((b[]) arrayList.toArray(new b[arrayList.size()]), strA, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
    }

    public static ArrayList e(Context context) {
        c cVarD;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (listQueryIntentActivities != null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                Bundle bundle = activityInfo.metaData;
                if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                    ArrayList arrayList2 = new ArrayList();
                    XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                    if (xmlResourceParserLoadXmlMetaData == null) {
                        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
                    }
                    while (true) {
                        try {
                            int next = xmlResourceParserLoadXmlMetaData.next();
                            if (next == 1) {
                                break;
                            }
                            if (next == 2 && xmlResourceParserLoadXmlMetaData.getName().equals("share-target") && (cVarD = d(xmlResourceParserLoadXmlMetaData)) != null) {
                                arrayList2.add(cVarD);
                            }
                        } catch (Exception e10) {
                            Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e10);
                        }
                    }
                    xmlResourceParserLoadXmlMetaData.close();
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public static g f(XmlPullParser xmlPullParser, Context context) throws XmlPullParserException, IOException {
        Intent intent;
        if (!xmlPullParser.getName().equals("target")) {
            return null;
        }
        String strB = b(xmlPullParser, StackTraceHelper.ID_KEY);
        String strB2 = b(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strB2)) {
            return null;
        }
        int i7 = Integer.parseInt(b(xmlPullParser, "rank"));
        String strB3 = b(xmlPullParser, "long_label");
        String strB4 = b(xmlPullParser, "disabled_message");
        String strB5 = b(xmlPullParser, "component");
        ComponentName componentNameUnflattenFromString = TextUtils.isEmpty(strB5) ? null : ComponentName.unflattenFromString(strB5);
        String strB6 = b(xmlPullParser, "icon_resource_name");
        String strB7 = b(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlPullParser.getName().equals("target")) {
                        break;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (name.equals("intent")) {
                        String strB8 = b(xmlPullParser, "action");
                        String strB9 = b(xmlPullParser, "targetPackage");
                        String strB10 = b(xmlPullParser, "targetClass");
                        if (strB8 == null) {
                            intent = null;
                        } else {
                            intent = new Intent(strB8);
                            if (!TextUtils.isEmpty(strB9) && !TextUtils.isEmpty(strB10)) {
                                intent.setClassName(strB9, strB10);
                            }
                        }
                        if (intent != null) {
                            arrayList.add(intent);
                        }
                    } else if (name.equals("categories")) {
                        String strB11 = b(xmlPullParser, StackTraceHelper.NAME_KEY);
                        if (!TextUtils.isEmpty(strB11)) {
                            hashSet.add(strB11);
                        }
                    }
                }
            } else {
                break;
            }
        }
        ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
        shortcutInfoCompat.f1543a = context;
        shortcutInfoCompat.f1544b = strB;
        shortcutInfoCompat.f1547e = strB2;
        shortcutInfoCompat.f1553m = i7;
        if (!TextUtils.isEmpty(strB3)) {
            shortcutInfoCompat.f1548f = strB3;
        }
        if (!TextUtils.isEmpty(strB4)) {
            shortcutInfoCompat.f1549g = strB4;
        }
        if (componentNameUnflattenFromString != null) {
            shortcutInfoCompat.f1546d = componentNameUnflattenFromString;
        }
        if (!arrayList.isEmpty()) {
            shortcutInfoCompat.f1545c = (Intent[]) arrayList.toArray(new Intent[0]);
        }
        if (!hashSet.isEmpty()) {
            s.f fVar = new s.f(0);
            fVar.addAll(hashSet);
            shortcutInfoCompat.j = fVar;
        }
        if (TextUtils.isEmpty(shortcutInfoCompat.f1547e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = shortcutInfoCompat.f1545c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return new g(shortcutInfoCompat, strB6, strB7);
    }

    public static void g(XmlSerializer xmlSerializer, String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void h(XmlSerializer xmlSerializer, g gVar) {
        xmlSerializer.startTag(null, "target");
        ShortcutInfoCompat shortcutInfoCompat = gVar.f8815c;
        String str = gVar.f8814b;
        String str2 = gVar.f8813a;
        g(xmlSerializer, StackTraceHelper.ID_KEY, shortcutInfoCompat.f1544b);
        g(xmlSerializer, "short_label", shortcutInfoCompat.f1547e.toString());
        g(xmlSerializer, "rank", Integer.toString(shortcutInfoCompat.f1553m));
        if (!TextUtils.isEmpty(shortcutInfoCompat.f1548f)) {
            g(xmlSerializer, "long_label", shortcutInfoCompat.f1548f.toString());
        }
        if (!TextUtils.isEmpty(shortcutInfoCompat.f1549g)) {
            g(xmlSerializer, "disabled_message", shortcutInfoCompat.f1549g.toString());
        }
        ComponentName componentName = shortcutInfoCompat.f1546d;
        if (componentName != null) {
            g(xmlSerializer, "component", componentName.flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            g(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            g(xmlSerializer, "icon_bitmap_path", str);
        }
        Intent[] intentArr = shortcutInfoCompat.f1545c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr, intentArr.length)) {
            xmlSerializer.startTag(null, "intent");
            g(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                g(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                g(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : shortcutInfoCompat.j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                g(xmlSerializer, StackTraceHelper.NAME_KEY, str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
