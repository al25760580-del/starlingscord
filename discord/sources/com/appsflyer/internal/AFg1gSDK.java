package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1gSDK {
    private final LinkedHashMap<String, Object> getMediationNetwork;
    public static final Object getRevenue = new Object() { // from class: com.appsflyer.internal.AFg1gSDK.1
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double getMonetizationNetwork = Double.valueOf(-0.0d);

    public AFg1gSDK() {
        this.getMediationNetwork = new LinkedHashMap<>();
    }

    public static String getMediationNetwork(Number number) throws Throwable {
        if (number == null) {
            throw new AFg1jSDK("Number must be non-null");
        }
        double dDoubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(dDoubleValue)};
            Map map = AFa1jSDK.unregisterClient;
            Object declaredMethod = map.get(-1755342830);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1jSDK.AFAdRevenueData(KeyEvent.normalizeMetaState(0) + 285, (char) (33655 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).getDeclaredMethod("getMonetizationNetwork", Double.TYPE);
                map.put(-1755342830, declaredMethod);
            }
            ((Double) ((Method) declaredMethod).invoke(null, objArr)).getClass();
            if (number.equals(getMonetizationNetwork)) {
                return "-0";
            }
            long jLongValue = number.longValue();
            return dDoubleValue == ((double) jLongValue) ? Long.toString(jLongValue) : number.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final AFg1gSDK getRevenue(String str, Object obj) throws Throwable {
        if (obj == null) {
            this.getMediationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1jSDK.unregisterClient;
                Object method = map.get(-1755342830);
                if (method == null) {
                    method = ((Class) AFa1jSDK.AFAdRevenueData(AndroidCharacter.getMirror('0') + 237, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 33655), 36 - TextUtils.indexOf("", ""))).getMethod("getMonetizationNetwork", Double.TYPE);
                    map.put(-1755342830, method);
                }
                ((Double) ((Method) method).invoke(null, objArr)).getClass();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getMediationNetwork;
        if (str == null) {
            throw new AFg1jSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public final String toString() {
        try {
            AFg1dSDK aFg1dSDK = new AFg1dSDK();
            getRevenue(aFg1dSDK);
            return aFg1dSDK.toString();
        } catch (AFg1jSDK unused) {
            return null;
        }
    }

    public AFg1gSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.getMediationNetwork.put(str, getMediationNetwork(entry.getValue()));
            } else {
                throw new NullPointerException("key == null");
            }
        }
    }

    private AFg1gSDK(Object obj) throws Throwable {
        try {
            Map map = AFa1jSDK.unregisterClient;
            Object declaredMethod = map.get(953122140);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1jSDK.AFAdRevenueData((ViewConfiguration.getKeyRepeatDelay() >> 16) + 357, (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getTrimmedLength("") + 36)).getDeclaredMethod("getMediationNetwork", null);
                map.put(953122140, declaredMethod);
            }
            Object objInvoke = ((Method) declaredMethod).invoke(obj, null);
            if (!(objInvoke instanceof AFg1gSDK)) {
                Object[] objArr = {objInvoke, "AFJsonObject"};
                Object declaredMethod2 = map.get(-362099263);
                if (declaredMethod2 == null) {
                    declaredMethod2 = ((Class) AFa1jSDK.AFAdRevenueData(285 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (33655 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 35 - ImageFormat.getBitsPerPixel(0))).getDeclaredMethod("getMediationNetwork", Object.class, String.class);
                    map.put(-362099263, declaredMethod2);
                }
                throw ((Throwable) ((Method) declaredMethod2).invoke(null, objArr));
            }
            this.getMediationNetwork = ((AFg1gSDK) objInvoke).getMediationNetwork;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public final void getRevenue(AFg1dSDK aFg1dSDK) throws AFg1jSDK {
        aFg1dSDK.AFAdRevenueData(AFg1dSDK.AFa1uSDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMediationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                aFg1dSDK.getCurrencyIso4217Code();
                aFg1dSDK.getCurrencyIso4217Code(key);
                aFg1dSDK.getMonetizationNetwork(entry.getValue());
            } else {
                throw new AFg1jSDK("Names must be non-null");
            }
        }
        aFg1dSDK.getMediationNetwork(AFg1dSDK.AFa1uSDK.EMPTY_OBJECT, AFg1dSDK.AFa1uSDK.NONEMPTY_OBJECT, "}");
    }

    public static Object getMediationNetwork(Object obj) throws Throwable {
        if (obj == null) {
            return getRevenue;
        }
        if (((Class) AFa1jSDK.AFAdRevenueData((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 321, (char) (TextUtils.indexOf("", "", 0) + 56708), 36 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).isInstance(obj) || (obj instanceof AFg1gSDK)) {
            return obj;
        }
        try {
            if (obj instanceof JSONArray) {
                try {
                    Object[] objArr = {obj.toString()};
                    Map map = AFa1jSDK.unregisterClient;
                    Object declaredConstructor = map.get(-2136715534);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1jSDK.AFAdRevenueData(ExpandableListView.getPackedPositionType(0L) + 321, (char) (56708 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Color.rgb(0, 0, 0) + 16777252)).getDeclaredConstructor(String.class);
                        map.put(-2136715534, declaredConstructor);
                    }
                    obj = ((Constructor) declaredConstructor).newInstance(objArr);
                    return obj;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            if (obj instanceof JSONObject) {
                return new AFg1gSDK(obj.toString());
            }
            if (obj.equals(getRevenue)) {
                return obj;
            }
            try {
                if (obj instanceof Collection) {
                    try {
                        Object[] objArr2 = {(Collection) obj};
                        Map map2 = AFa1jSDK.unregisterClient;
                        Object declaredConstructor2 = map2.get(-1441240789);
                        if (declaredConstructor2 == null) {
                            declaredConstructor2 = ((Class) AFa1jSDK.AFAdRevenueData(322 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (56708 - TextUtils.getOffsetBefore("", 0)), 36 - KeyEvent.keyCodeFromString(""))).getDeclaredConstructor(Collection.class);
                            map2.put(-1441240789, declaredConstructor2);
                        }
                        return ((Constructor) declaredConstructor2).newInstance(objArr2);
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
                if (obj.getClass().isArray()) {
                    try {
                        Object[] objArr3 = {obj};
                        Map map3 = AFa1jSDK.unregisterClient;
                        Object declaredConstructor3 = map3.get(453738144);
                        if (declaredConstructor3 == null) {
                            declaredConstructor3 = ((Class) AFa1jSDK.AFAdRevenueData(320 - ExpandableListView.getPackedPositionChild(0L), (char) (56708 - TextUtils.getOffsetBefore("", 0)), 36 - View.combineMeasuredStates(0, 0))).getDeclaredConstructor(Object.class);
                            map3.put(453738144, declaredConstructor3);
                        }
                        return ((Constructor) declaredConstructor3).newInstance(objArr3);
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th4;
                    }
                }
                if (obj instanceof Map) {
                    return new AFg1gSDK((Map) obj);
                }
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            } catch (Exception unused) {
            }
            return null;
        } catch (AFg1jSDK unused2) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFg1gSDK(String str) throws Throwable {
        try {
            Object[] objArr = {str};
            Map map = AFa1jSDK.unregisterClient;
            Object declaredConstructor = map.get(932770076);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1jSDK.AFAdRevenueData((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 357, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 36 - (ViewConfiguration.getScrollBarSize() >> 8))).getDeclaredConstructor(String.class);
                map.put(932770076, declaredConstructor);
            }
            this(((Constructor) declaredConstructor).newInstance(objArr));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
