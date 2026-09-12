package com.google.android.gms.internal.play_billing;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f6110a;

    static {
        char[] cArr = new char[80];
        f6110a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i7, String str, Object obj) {
        byte[] bArr;
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(sb2, i7);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            String strReplace2 = (String) obj;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            for (int i11 = 0; i11 < strReplace2.length(); i11++) {
                char cCharAt2 = strReplace2.charAt(i11);
                if (cCharAt2 < ' ' || cCharAt2 > '~') {
                    strReplace = z1.g(strReplace2.getBytes(StandardCharsets.UTF_8));
                    sb2.append(strReplace);
                    sb2.append('\"');
                    return;
                } else {
                    if (cCharAt2 == '\"') {
                        z7 = true;
                    } else if (cCharAt2 == '\'') {
                        z6 = true;
                    } else if (cCharAt2 == '\\') {
                        z5 = true;
                    }
                }
            }
            if (z5) {
                strReplace2 = strReplace2.replace("\\", "\\\\");
            }
            strReplace = z6 ? strReplace2.replace("'", "\\'") : strReplace2;
            if (z7) {
                strReplace = strReplace.replace("\"", "\\\"");
            }
            sb2.append(strReplace);
            sb2.append('\"');
            return;
        }
        if (obj instanceof t1) {
            sb2.append(": \"");
            t1 t1Var = (t1) obj;
            int iD = t1Var.d();
            if (iD == 0) {
                bArr = i2.f6021a;
            } else {
                byte[] bArr2 = new byte[iD];
                t1Var.h(bArr2, iD);
                bArr = bArr2;
            }
            sb2.append(z1.g(bArr));
            sb2.append('\"');
            return;
        }
        if (obj instanceof d2) {
            sb2.append(" {");
            c((d2) obj, sb2, i7 + 2);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            b(sb2, i7);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i7 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb2, i12, "key", entry.getKey());
        a(sb2, i12, "value", entry.getValue());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        b(sb2, i7);
        sb2.append("}");
    }

    public static void b(StringBuilder sb2, int i7) {
        while (i7 > 0) {
            int i10 = 80;
            if (i7 <= 80) {
                i10 = i7;
            }
            sb2.append(f6110a, 0, i10);
            i7 -= i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    public static void c(d2 d2Var, StringBuilder sb2, int i7) {
        int i10;
        int i11;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = d2Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i10);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i11 = i10;
            } else {
                i11 = i10;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i7, strSubstring.substring(0, strSubstring.length() - 4), d2.p(method2, d2Var, new Object[0]));
                }
                i10 = i11;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i7, strSubstring.substring(0, strSubstring.length() - 3), d2.p(method, d2Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objP = d2.p(method4, d2Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) d2.p(method5, d2Var, new Object[0])).booleanValue();
                    } else if (objP instanceof Boolean) {
                        if (((Boolean) objP).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objP instanceof Integer) {
                        if (((Integer) objP).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objP instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objP).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objP instanceof Double)) {
                        if (objP instanceof String) {
                            zEquals = objP.equals("");
                        } else if (objP instanceof t1) {
                            zEquals = objP.equals(t1.f6136e);
                        } else if (!(objP instanceof o1) ? !((objP instanceof Enum) && ((Enum) objP).ordinal() == 0) : objP != ((d2) ((d2) ((o1) objP)).j(6))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objP).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        a(sb2, i7, strSubstring, objP);
                    }
                }
            }
            i10 = i11;
        }
        f3 f3Var = d2Var.zzc;
        if (f3Var != null) {
            for (int i13 = 0; i13 < f3Var.f6007a; i13++) {
                a(sb2, i7, String.valueOf(f3Var.f6008b[i13] >>> 3), f3Var.f6009c[i13]);
            }
        }
    }
}
