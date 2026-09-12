package androidx.datastore.preferences.protobuf;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f1883a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f1884b = new z0();

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i7) throws w {
        if (!h(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !h(b12) && !h(b13)) {
                int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i7] = (char) ((i10 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw w.a();
    }

    public static void b(byte b10, byte b11, char[] cArr, int i7) throws w {
        if (b10 < -62 || h(b11)) {
            throw w.a();
        }
        cArr[i7] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static void c(byte b10, byte b11, byte b12, char[] cArr, int i7) throws w {
        if (h(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || h(b12)))) {
            throw w.a();
        }
        cArr[i7] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static final String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    public static String g(e eVar) {
        StringBuilder sb2 = new StringBuilder(eVar.size());
        for (int i7 = 0; i7 < eVar.size(); i7++) {
            byte b10 = eVar.f1838e[i7];
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                        } else {
                            sb2.append((char) b10);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean h(byte b10) {
        return b10 > -65;
    }

    public static final void j(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                j(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            e eVar = e.f1835i;
            sb2.append(g(new e(((String) obj).getBytes(u.f1936a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof e) {
            sb2.append(": \"");
            sb2.append(g((e) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof s) {
            sb2.append(" {");
            k((s) obj, sb2, i7 + 2);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            while (i10 < i7) {
                sb2.append(' ');
                i10++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i7 + 2;
        j(sb2, i12, "key", entry.getKey());
        j(sb2, i12, "value", entry.getValue());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        while (i10 < i7) {
            sb2.append(' ');
            i10++;
        }
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01af  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
    public static void k(s sVar, StringBuilder sb2, int i7) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : sVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    j(sb2, i7, d(str2), s.f(method2, sVar, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    j(sb2, i7, d(str3), s.f(method3, sVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strReplaceFirst))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get".concat(strReplaceFirst));
                Method method5 = (Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objF = s.f(method4, sVar, new Object[0]);
                    if (method5 == null) {
                        if (objF instanceof Boolean) {
                            zEquals = !((Boolean) objF).booleanValue();
                        } else if (objF instanceof Integer) {
                            if (((Integer) objF).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof Float) {
                            if (((Float) objF).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof Double) {
                            if (((Double) objF).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof String) {
                            zEquals = objF.equals("");
                        } else if (objF instanceof e) {
                            zEquals = objF.equals(e.f1835i);
                        } else if (!(objF instanceof a) ? !((objF instanceof Enum) && ((Enum) objF).ordinal() == 0) : objF != ((s) ((s) ((a) objF)).d(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) s.f(method5, sVar, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        j(sb2, i7, d(str4), objF);
                    }
                }
            }
        }
        e1 e1Var = sVar.unknownFields;
        if (e1Var != null) {
            for (int i10 = 0; i10 < e1Var.f1842a; i10++) {
                j(sb2, i7, String.valueOf(e1Var.f1843b[i10] >>> 3), e1Var.f1844c[i10]);
            }
        }
    }

    public abstract String e(byte[] bArr, int i7, int i10);

    public abstract int f(String str, byte[] bArr, int i7, int i10);

    public abstract int i(byte[] bArr, int i7, int i10);

    public abstract void l(byte[] bArr, int i7, int i10);
}
