package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1kSDK {
    private static AFf1kSDK AFAdRevenueData;
    private final Map<String, String> getCurrencyIso4217Code = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1kSDK.3
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    public enum AFa1tSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String AFAdRevenueData;

        AFa1tSDK(String str) {
            this.AFAdRevenueData = str;
        }
    }

    public enum AFa1ySDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMediationNetwork;

        AFa1ySDK(String str) {
            this.getMediationNetwork = str;
        }
    }

    private AFf1kSDK() {
    }

    private static String AFAdRevenueData() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i7 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i10 <= 2) {
                        i10++;
                        sb2.append(AFa1tSDK.XPOSED.AFAdRevenueData);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb2.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb2.append("+h");
                        }
                        sb2.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i7++;
                    }
                }
            }
            if (i7 > 1) {
                sb2.append("mz;");
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th2);
        }
        try {
            StringBuilder sb3 = new StringBuilder("/proc/");
            sb3.append(Process.myPid());
            sb3.append("/maps");
            if (AFAdRevenueData(sb3.toString(), "frida")) {
                sb2.append(AFa1tSDK.FRIDA.AFAdRevenueData);
                if (Build.VERSION.SDK_INT < 29 && AFAdRevenueData("/proc/net/tcp", "69A2")) {
                    sb2.append("+prt");
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e10);
            sb2.append(e10.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb2.append(";");
        return sb2.toString();
    }

    @SuppressLint({"PrivateApi"})
    private static String getCurrencyIso4217Code(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e10);
            return null;
        }
    }

    private AFg1gSDK getMediationNetwork() throws Throwable {
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        try {
            for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                String currencyIso4217Code = getCurrencyIso4217Code(entry.getValue());
                if (currencyIso4217Code != null && !currencyIso4217Code.equals("")) {
                    aFg1gSDK.getRevenue(entry.getKey(), currencyIso4217Code);
                }
            }
            return aFg1gSDK;
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e10);
            return aFg1gSDK;
        }
    }

    private static boolean getMonetizationNetwork(String str) {
        return str.matches("\\d+");
    }

    public static AFf1kSDK getRevenue() {
        if (AFAdRevenueData == null) {
            AFAdRevenueData = new AFf1kSDK();
        }
        return AFAdRevenueData;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public final Object getRevenue(Context context, String str) throws Throwable {
        String str2 = null;
        if (str != null) {
            try {
                str2 = getMonetizationNetwork(str) ? null : "invalid timestamp";
            } catch (Exception e10) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e10);
                return str2;
            }
        }
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        aFg1gSDK.getRevenue("pr", getMediationNetwork());
        aFg1gSDK.getRevenue("an", AFAdRevenueData(context));
        return aFg1gSDK;
    }

    private AFg1gSDK AFAdRevenueData(Context context) {
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        try {
            aFg1gSDK.getRevenue(AFa1ySDK.HOOKING.getMediationNetwork, AFAdRevenueData());
            aFg1gSDK.getRevenue(AFa1ySDK.DEBUGGABLE.getMediationNetwork, Boolean.valueOf(getMonetizationNetwork(context)));
            return aFg1gSDK;
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th2);
            return aFg1gSDK;
        }
    }

    private static boolean AFAdRevenueData(String str, String str2) throws Exception {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(line.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e10);
            throw new Exception("FNF");
        } catch (IOException e11) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e11);
            throw new Exception("IOF");
        } catch (Exception e12) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e12);
            throw new Exception("GF");
        }
    }
}
