package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1aSDK implements AFa1bSDK {

    @NotNull
    private final AFc1gSDK AFAdRevenueData;
    private boolean getMonetizationNetwork;
    Map<String, Object> getRevenue;

    public static final class AFa1uSDK implements AFb1zSDK.AFa1uSDK {
        private /* synthetic */ long getCurrencyIso4217Code;

        public AFa1uSDK(long j) {
            this.getCurrencyIso4217Code = j;
        }

        @Override // com.appsflyer.internal.AFb1zSDK.AFa1uSDK
        public final void AFAdRevenueData(String str) {
            Map<String, Object> map = AFa1aSDK.this.getRevenue;
            if (map != null) {
                map.put("error", str);
            }
        }

        @Override // com.appsflyer.internal.AFb1zSDK.AFa1uSDK
        public final void getMediationNetwork(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFa1aSDK.this.getRevenue;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFa1aSDK.this.getRevenue) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFa1aSDK.getRevenue;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFa1aSDK.this.getRevenue;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.getCurrencyIso4217Code);
            Map<String, Object> map5 = AFa1aSDK.this.getRevenue;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }
    }

    public AFa1aSDK(@NotNull AFc1gSDK aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.AFAdRevenueData = aFc1gSDK;
    }

    @Override // com.appsflyer.internal.AFa1bSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFa1bSDK
    public final void getMediationNetwork() {
        Context context;
        if (getMonetizationNetwork() && (context = this.AFAdRevenueData.getRevenue) != null) {
            this.getRevenue = new LinkedHashMap();
            AFa1uSDK aFa1uSDK = new AFa1uSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFb1zSDK.1
                    private /* synthetic */ AFa1uSDK getMonetizationNetwork;
                    private /* synthetic */ Class getRevenue;

                    public AnonymousClass1() {
                        cls = cls;
                        aFa1uSDK = aFa1uSDK;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1uSDK aFa1uSDK2 = aFa1uSDK;
                            if (aFa1uSDK2 != null) {
                                aFa1uSDK2.AFAdRevenueData("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1uSDK aFa1uSDK3 = aFa1uSDK;
                            if (aFa1uSDK3 != null) {
                                aFa1uSDK3.getMediationNetwork(string2, string3, string);
                            }
                        } else {
                            AFa1uSDK aFa1uSDK4 = aFa1uSDK;
                            if (aFa1uSDK4 != null) {
                                aFa1uSDK4.getMediationNetwork(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1uSDK.AFAdRevenueData("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e10) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e10);
                aFa1uSDK.AFAdRevenueData(e10.toString());
            } catch (IllegalAccessException e11) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e11);
                aFa1uSDK.AFAdRevenueData(e11.toString());
            } catch (NoSuchMethodException e12) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e12);
                aFa1uSDK.AFAdRevenueData(e12.toString());
            } catch (InvocationTargetException e13) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e13);
                aFa1uSDK.AFAdRevenueData(e13.toString());
            }
        }
    }

    @Override // com.appsflyer.internal.AFa1bSDK
    public final void getMonetizationNetwork(boolean z5) {
        this.getMonetizationNetwork = z5;
    }

    @Override // com.appsflyer.internal.AFa1bSDK
    public final boolean getRevenue() {
        if (!getMonetizationNetwork()) {
            return false;
        }
        Map<String, Object> map = this.getRevenue;
        return map == null || map.isEmpty();
    }

    private boolean getMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }
}
