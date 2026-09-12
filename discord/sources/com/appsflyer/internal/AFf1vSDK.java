package com.appsflyer.internal;

import android.graphics.Color;
import android.net.Uri;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1vSDK extends AFe1eSDK<Map<String, String>> {
    private final UUID AFInAppEventParameterName;
    public AFa1vSDK areAllFieldsValid;
    private final AFd1lSDK copy;
    private String copydefault;
    private final boolean equals;
    private String hashCode;
    private String toString;

    public interface AFa1vSDK {
        void getCurrencyIso4217Code(Map<String, String> map);

        void getMediationNetwork(String str);
    }

    public AFf1vSDK(@NonNull AFc1bSDK aFc1bSDK, @NonNull UUID uuid, @NonNull Uri uri) throws Throwable {
        super(AFe1mSDK.ONELINK, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, aFc1bSDK, uuid.toString());
        this.copy = aFc1bSDK.getRevenue();
        this.AFInAppEventParameterName = uuid;
        boolean zBooleanValue = false;
        try {
            if (!AFk1xSDK.getRevenue(uri.getHost()) && !AFk1xSDK.getRevenue(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFc1bSDK.i()};
                    Map map = AFa1jSDK.unregisterClient;
                    Object declaredConstructor = map.get(228484367);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1jSDK.AFAdRevenueData(Color.alpha(0), (char) Color.blue(0), 37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getDeclaredConstructor(Uri.class, AFa1rSDK.class);
                        map.put(228484367, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(-891849335);
                        if (method == null) {
                            method = ((Class) AFa1jSDK.AFAdRevenueData(Gravity.getAbsoluteGravity(0, 0), (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 37)).getMethod("getRevenue", null);
                            map.put(-891849335, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = map.get(-1788381861);
                            if (method2 == null) {
                                method2 = ((Class) AFa1jSDK.AFAdRevenueData(38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (View.resolveSize(0, 0) + 39041), View.resolveSize(0, 0) + 51)).getMethod("getRevenue", null);
                                map.put(-1788381861, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = map.get(784237499);
                                if (method3 == null) {
                                    method3 = ((Class) AFa1jSDK.AFAdRevenueData(AndroidCharacter.getMirror('0') - 11, (char) (39041 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 50 - TextUtils.lastIndexOf("", '0'))).getMethod("getMediationNetwork", null);
                                    map.put(784237499, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                String[] strArrSplit = uri.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.toString = strArrSplit[1];
                                    this.hashCode = strArrSplit[2];
                                    this.copydefault = uri.toString();
                                }
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 == null) {
                                throw th3;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 == null) {
                            throw th4;
                        }
                        throw cause3;
                    }
                } catch (Throwable th5) {
                    Throwable cause4 = th5.getCause();
                    if (cause4 == null) {
                        throw th5;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e10);
        }
        this.equals = zBooleanValue;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public final boolean copy() {
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean copydefault() {
        return false;
    }

    public final boolean equals() {
        return (TextUtils.isEmpty(this.toString) || TextUtils.isEmpty(this.hashCode) || this.toString.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        ResponseNetwork responseNetwork;
        super.getRevenue();
        AFa1vSDK aFa1vSDK = this.areAllFieldsValid;
        if (aFa1vSDK != null) {
            if (this.AFAdRevenueData == AFe1uSDK.SUCCESS && (responseNetwork = ((AFe1eSDK) this).component3) != null) {
                aFa1vSDK.getCurrencyIso4217Code((Map) responseNetwork.getBody());
                return;
            }
            Throwable thComponent1 = component1();
            if (!(thComponent1 instanceof ParsingException)) {
                String str = this.copydefault;
                aFa1vSDK.getMediationNetwork(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) thComponent1).getRawResponse().isSuccessful()) {
                aFa1vSDK.getMediationNetwork("Can't parse one link data");
            } else {
                String str2 = this.copydefault;
                aFa1vSDK.getMediationNetwork(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1jSDK<Map<String, String>> getRevenue(@NonNull String str) {
        AFd1lSDK aFd1lSDK = this.copy;
        return (AFd1jSDK) AFd1lSDK.getRevenue(new Object[]{aFd1lSDK, this.toString, this.hashCode, this.AFInAppEventParameterName, str}, 1826287225, -1826287225, System.identityHashCode(aFd1lSDK));
    }
}
