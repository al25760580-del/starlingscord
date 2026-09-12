package com.appsflyer.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1pSDK extends AFf1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 1760829264;
    private static int AFInAppEventType = 2059786070;
    private static byte[] AFKeystoreWrapper = {-102, 97, -125, 124, 108};
    private static short[] AFLogger = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f3850d = 0;
    private static int registerClient = -1524191679;
    private static int unregisterClient = 1;
    private final AFc1pSDK copydefault;
    private final AFg1rSDK equals;
    private final String hashCode;
    private final AFc1gSDK toString;

    public AFf1pSDK(@NonNull String str, @NonNull AFc1bSDK aFc1bSDK) {
        super(new AFg1uSDK(), aFc1bSDK, str);
        this.copydefault = aFc1bSDK.getCurrencyIso4217Code();
        this.toString = aFc1bSDK.registerClient();
        this.hashCode = str;
        this.equals = aFc1bSDK.component4();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    private static void a(int i7, byte b10, short s2, int i10, int i11, Object[] objArr) {
        boolean z5;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        StringBuilder sb2 = new StringBuilder();
        int i12 = i10 + ((int) (((long) AFInAppEventParameterName) ^ 6918351348135370604L));
        int i13 = i12 == -1 ? 1 : 0;
        if (i13 != 0) {
            $11 = ($10 + 45) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            byte[] bArr = AFKeystoreWrapper;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i14 = 0; i14 < length; i14++) {
                    $10 = ($11 + 35) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    bArr2[i14] = (byte) (((long) bArr[i14]) ^ 6918351348135370604L);
                }
                bArr = bArr2;
            }
            i12 = bArr != null ? (byte) (((byte) (((long) AFKeystoreWrapper[((int) (((long) registerClient) ^ 6918351348135370604L)) + i7]) ^ 6918351348135370604L)) + ((int) (((long) AFInAppEventParameterName) ^ 6918351348135370604L))) : (short) (((short) (((long) AFLogger[((int) (((long) registerClient) ^ 6918351348135370604L)) + i7]) ^ 6918351348135370604L)) + ((int) (((long) AFInAppEventParameterName) ^ 6918351348135370604L)));
        }
        if (i12 > 0) {
            aFk1kSDK.getCurrencyIso4217Code = ((i7 + i12) - 2) + ((int) (((long) registerClient) ^ 6918351348135370604L)) + i13;
            char c8 = (char) (i11 + ((int) (((long) AFInAppEventType) ^ 6918351348135370604L)));
            aFk1kSDK.getRevenue = c8;
            sb2.append(c8);
            aFk1kSDK.getMediationNetwork = aFk1kSDK.getRevenue;
            byte[] bArr3 = AFKeystoreWrapper;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                $11 = ($10 + 117) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                for (int i15 = 0; i15 < length2; i15++) {
                    bArr4[i15] = (byte) (((long) bArr3[i15]) ^ 6918351348135370604L);
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i16 = $10 + 25;
                $11 = i16 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i16 % 2 == 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            } else {
                z5 = false;
            }
            aFk1kSDK.AFAdRevenueData = 1;
            while (aFk1kSDK.AFAdRevenueData < i12) {
                if (z5) {
                    byte[] bArr5 = AFKeystoreWrapper;
                    int i17 = aFk1kSDK.getCurrencyIso4217Code;
                    aFk1kSDK.getCurrencyIso4217Code = i17 - 1;
                    aFk1kSDK.getRevenue = (char) (aFk1kSDK.getMediationNetwork + (((byte) (((byte) (((long) bArr5[i17]) ^ 6918351348135370604L)) + s2)) ^ b10));
                } else {
                    short[] sArr = AFLogger;
                    int i18 = aFk1kSDK.getCurrencyIso4217Code;
                    aFk1kSDK.getCurrencyIso4217Code = i18 - 1;
                    aFk1kSDK.getRevenue = (char) (aFk1kSDK.getMediationNetwork + (((short) (((short) (((long) sArr[i18]) ^ 6918351348135370604L)) + s2)) ^ b10));
                }
                sb2.append(aFk1kSDK.getRevenue);
                aFk1kSDK.getMediationNetwork = aFk1kSDK.getRevenue;
                aFk1kSDK.AFAdRevenueData++;
            }
        }
        objArr[0] = sb2.toString();
    }

    private void equals() {
        unregisterClient = (f3850d + 41) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        ((AFf1uSDK) this).areAllFieldsValid.getCurrencyIso4217Code("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        unregisterClient = (f3850d + 9) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i7, int i10, int i11) {
        int i12 = ~i10;
        int i13 = (((~((~i7) | i11)) | i12) * (-318)) + (i10 * (-317)) + (i7 * 319);
        int i14 = ~(i12 | i11);
        int i15 = ~i11;
        return (((~((i7 | i10) | i11)) | (~((i12 | i15) | i7))) * 318) + (((i14 | (~((i15 | i7) | i10))) * 318) + i13) != 1 ? getMonetizationNetwork(objArr) : getMediationNetwork(objArr);
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1pSDK aFf1pSDK = (AFf1pSDK) objArr[0];
        PackageManager packageManager = (PackageManager) objArr[1];
        ApplicationInfo applicationInfo = aFf1pSDK.copydefault.n_().applicationInfo;
        if (applicationInfo == null) {
            int i7 = unregisterClient + 103;
            f3850d = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i7 % 2 == 0) {
                return "";
            }
            throw null;
        }
        String string = packageManager.getApplicationLabel(applicationInfo).toString();
        int i10 = f3850d + 73;
        unregisterClient = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @NonNull
    private String s_(PackageManager packageManager) {
        return (String) getMediationNetwork(new Object[]{this, packageManager}, -182789500, 182789500, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFAdRevenueData(AFh1jSDK aFh1jSDK) {
        int i7 = unregisterClient + 29;
        f3850d = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void areAllFieldsValid(AFh1jSDK aFh1jSDK) {
        int i7 = unregisterClient + 23;
        f3850d = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            this.copydefault.component4();
            throw null;
        }
        String strComponent4 = this.copydefault.component4();
        if (strComponent4 != null) {
            aFh1jSDK.getMonetizationNetwork("advertiserId", strComponent4);
            unregisterClient = (f3850d + 35) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean copydefault() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, 222839034, -222839033, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) {
        f3850d = (unregisterClient + 53) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        f3850d = (unregisterClient + 55) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
        if (responseNetwork != null && responseNetwork.isSuccessful()) {
            equals();
        }
        unregisterClient = (f3850d + 49) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0100  */
    /* JADX WARN: Code duplicated, block: B:28:0x0110  */
    /* JADX WARN: Code duplicated, block: B:31:0x016e  */
    /* JADX WARN: Code duplicated, block: B:33:0x017c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0183  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r11.getRevenue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r13.getMonetizationNetwork("app_version_code", java.lang.Integer.toString(r12.copydefault.n_().versionCode));
        r13.getMonetizationNetwork("app_version_name", r12.copydefault.n_().versionName);
        r13.getMonetizationNetwork("app_name", (java.lang.String) getMediationNetwork(new java.lang.Object[]{r12, r2.getPackageManager()}, -182789500, 182789500, java.lang.System.identityHashCode(r12)));
        r13.getMonetizationNetwork("installDate", com.appsflyer.internal.AFa1uSDK.getMediationNetwork(new java.text.SimpleDateFormat("yyyy-MM-dd_HHmmssZ", java.util.Locale.US), r12.copydefault.n_().firstInstallTime));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
    
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0187, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0193, code lost:
    
        throw new java.lang.IllegalStateException("CustomerUserId not set, register is not sent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019b, code lost:
    
        throw new java.lang.IllegalStateException("Context is not provided, can't send register request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r0 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        r11 = r2;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r0 != null) goto L6;
     */
    @Override // com.appsflyer.internal.AFf1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getMediationNetwork(com.appsflyer.internal.AFh1jSDK r13) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.getMediationNetwork(com.appsflyer.internal.AFh1jSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void getMonetizationNetwork(AFh1jSDK aFh1jSDK) {
        unregisterClient = (f3850d + 103) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void getRevenue(AFh1jSDK aFh1jSDK) {
        int i7 = unregisterClient + 7;
        f3850d = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        int i7 = (f3850d + 35) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        unregisterClient = i7;
        int i10 = i7 + 69;
        f3850d = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i10 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i11 = 75 / 0;
        return Boolean.FALSE;
    }
}
