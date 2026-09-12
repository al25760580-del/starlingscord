package kk;

import android.util.Log;
import com.discord.primitives.ChannelId;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;
import org.webrtc.Logging;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static int a(int i7) {
        switch (i7) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                throw new IllegalArgumentException(h(i7, "Unknown enum value: "));
        }
    }

    public static /* synthetic */ String b(int i7) {
        switch (i7) {
            case 1:
                return "bluetooth";
            case 2:
                return "cellular";
            case 3:
                return "ethernet";
            case 4:
                return ViewProps.NONE;
            case 5:
                return "unknown";
            case 6:
                return "wifi";
            case 7:
                return "wimax";
            case 8:
                return "vpn";
            default:
                throw null;
        }
    }

    public static float c(float f2, float f7, float f10, float f11) {
        return ((f2 - f7) * f10) + f11;
    }

    public static int d(long j, int i7, int i10) {
        return (ChannelId.m1135hashCodeimpl(j) + i7) * i10;
    }

    public static Object e(int i7, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i7);
    }

    public static Object f(int i7, List list) {
        return list.get(list.size() - i7);
    }

    public static String g(char c8, String str, String str2) {
        return str + str2 + c8;
    }

    public static String h(int i7, String str) {
        return str + i7;
    }

    public static String i(long j, String str) {
        return str + j;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb2, int i7, String str) {
        sb2.append(i7);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder m(long j, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder n(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder o(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static KProperty1 p(Class cls, String str, String str2, int i7) {
        return Reflection.property1(new PropertyReference1Impl(cls, str, str2, i7));
    }

    public static void q(int i7, String str, String str2) {
        Log.d(str2, str + i7);
    }

    public static void r(Integer num, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static void s(StringBuilder sb2, Integer num, String str, Integer num2, String str2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(num2);
        sb2.append(str2);
    }

    public static boolean t(HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        hashSet.removeAll(hashSet2);
        hashSet.removeAll(hashSet3);
        return hashSet.isEmpty();
    }

    public static boolean u(Map map, HashSet hashSet) {
        hashSet.removeAll(map.keySet());
        return hashSet.isEmpty();
    }

    public static void v(int i7, String str, String str2) {
        Logging.d(str2, str + i7);
    }

    public static /* synthetic */ String w(int i7) {
        switch (i7) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
