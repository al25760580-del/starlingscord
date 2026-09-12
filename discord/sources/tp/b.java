package tp;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20871a = CollectionsKt.O(d0.g('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f20872b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listG = d0.g("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iA = zn.c.a(0, listG.size() - 1, 2);
        if (iA >= 0) {
            int i7 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f20871a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listG.get(i7));
                int i10 = i7 + 1;
                linkedHashMap.put(sb2.toString(), listG.get(i10));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(com.discord.chat.presentation.list.a.k(sb3, (String) listG.get(i7), "Array"), "[" + ((String) listG.get(i10)));
                if (i7 == iA) {
                    break;
                } else {
                    i7 += 2;
                }
            }
        }
        linkedHashMap.put(f20871a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : d0.g("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : d0.g("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, a3.e.l("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i11 = 0; i11 < 23; i11++) {
            String strH = kk.b.h(i11, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f20871a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i11);
            a(linkedHashMap, strH, sb4.toString());
            a(linkedHashMap, "reflect/KFunction" + i11, str4 + "/reflect/KFunction");
        }
        for (String str5 : d0.g("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, kk.b.j(str5, ".Companion"), com.discord.chat.presentation.list.a.l(new StringBuilder(), f20871a, "/jvm/internal/", str5, "CompanionObject"));
        }
        f20872b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f20871a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = (String) f20872b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + x.m(classId, '.', '$') + ';';
    }
}
