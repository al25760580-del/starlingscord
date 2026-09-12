package com.appsflyer.internal;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int areAllFieldsValid = 0;
    private static int component1 = 1;
    private static int getCurrencyIso4217Code;
    private static byte[] getMediationNetwork;
    private static short[] getMonetizationNetwork;
    private static int getRevenue;

    static {
        getRevenue();
        ViewConfiguration.getMaximumDrawingCacheSize();
        TypedValue.complexToFloat(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        AndroidCharacter.getMirror('0');
        AndroidCharacter.getMirror('0');
        int i7 = areAllFieldsValid + 71;
        component1 = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void a(int i7, byte b10, short s2, int i10, int i11, Object[] objArr) {
        int i12;
        int length;
        byte[] bArr;
        int i13;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        StringBuilder sb2 = new StringBuilder();
        int i14 = i10 + ((int) (((long) AFAdRevenueData) ^ 6918351348135370604L));
        boolean z5 = i14 == -1;
        if (z5) {
            byte[] bArr2 = getMediationNetwork;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i15 = 0; i15 < length2; i15++) {
                    $10 = ($11 + 69) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    bArr3[i15] = (byte) (((long) bArr2[i15]) ^ 6918351348135370604L);
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                i14 = (byte) (((byte) (((long) getMediationNetwork[((int) (((long) getCurrencyIso4217Code) ^ 6918351348135370604L)) + i7]) ^ 6918351348135370604L)) + ((int) (((long) AFAdRevenueData) ^ 6918351348135370604L)));
                $10 = ($11 + 91) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            } else {
                i14 = (short) (((short) (((long) getMonetizationNetwork[((int) (((long) getCurrencyIso4217Code) ^ 6918351348135370604L)) + i7]) ^ 6918351348135370604L)) + ((int) (((long) AFAdRevenueData) ^ 6918351348135370604L)));
            }
        }
        if (i14 > 0) {
            int i16 = ((i7 + i14) - 2) + ((int) (((long) getCurrencyIso4217Code) ^ 6918351348135370604L));
            if (z5) {
                i12 = 1;
            } else {
                $10 = ($11 + 107) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                i12 = 0;
            }
            aFk1kSDK.getCurrencyIso4217Code = i16 + i12;
            char c8 = (char) (i11 + ((int) (((long) getRevenue) ^ 6918351348135370604L)));
            aFk1kSDK.getRevenue = c8;
            sb2.append(c8);
            aFk1kSDK.getMediationNetwork = aFk1kSDK.getRevenue;
            byte[] bArr4 = getMediationNetwork;
            if (bArr4 != null) {
                int i17 = $10 + 97;
                $11 = i17 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i17 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i13 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i13 = 0;
                }
                while (i13 < length) {
                    bArr[i13] = (byte) (((long) bArr4[i13]) ^ 6918351348135370604L);
                    i13++;
                }
                bArr4 = bArr;
            }
            boolean z6 = bArr4 != null;
            aFk1kSDK.AFAdRevenueData = 1;
            while (aFk1kSDK.AFAdRevenueData < i14) {
                if (z6) {
                    byte[] bArr5 = getMediationNetwork;
                    int i18 = aFk1kSDK.getCurrencyIso4217Code;
                    aFk1kSDK.getCurrencyIso4217Code = i18 - 1;
                    aFk1kSDK.getRevenue = (char) (aFk1kSDK.getMediationNetwork + (((byte) (((byte) (((long) bArr5[i18]) ^ 6918351348135370604L)) + s2)) ^ b10));
                } else {
                    short[] sArr = getMonetizationNetwork;
                    int i19 = aFk1kSDK.getCurrencyIso4217Code;
                    aFk1kSDK.getCurrencyIso4217Code = i19 - 1;
                    aFk1kSDK.getRevenue = (char) (aFk1kSDK.getMediationNetwork + (((short) (((short) (((long) sArr[i19]) ^ 6918351348135370604L)) + s2)) ^ b10));
                }
                sb2.append(aFk1kSDK.getRevenue);
                aFk1kSDK.getMediationNetwork = aFk1kSDK.getRevenue;
                aFk1kSDK.AFAdRevenueData++;
                $10 = ($11 + 31) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
        }
        objArr[0] = sb2.toString();
    }

    @NonNull
    private static AFi1rSDK getCurrencyIso4217Code(@NonNull AFi1wSDK aFi1wSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return new AFi1rSDK(aFi1wSDK.getMediationNetwork == AFh1cSDK.DEFAULT, AFi1uSDK.NA);
        }
        String string = "";
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1522762699, (byte) (-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 107), (-82) - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1963671201, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1wSDK.getMediationNetwork == AFh1cSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = strIntern;
        }
        boolean zEquals = getMediationNetwork(new StringBuilder(str3).reverse().toString(), aFi1wSDK.getRevenue, "android", "v1", string).equals(str);
        return new AFi1rSDK(zEquals, zEquals ? AFi1uSDK.SUCCESS : AFi1uSDK.FAILURE);
    }

    private static String getMediationNetwork(String str, String str2, String str3, String str4, String str5) {
        component1 = (areAllFieldsValid + 17) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String revenue = AFj1bSDK.getRevenue(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (revenue.length() >= 12) {
            return revenue.substring(0, 12);
        }
        component1 = (areAllFieldsValid + 109) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return revenue;
    }

    @NonNull
    public final AFi1rSDK getRevenue(@NonNull AFi1wSDK aFi1wSDK, String str, @NonNull String str2, @NonNull String str3) {
        int i7 = (areAllFieldsValid + 67) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        component1 = i7;
        if (aFi1wSDK != null && str2 != null) {
            int i10 = i7 + 61;
            areAllFieldsValid = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (str3 != null) {
                return getCurrencyIso4217Code(aFi1wSDK, str, str2, str3);
            }
        }
        AFi1rSDK aFi1rSDK = new AFi1rSDK(false, AFi1uSDK.INTERNAL_ERROR);
        areAllFieldsValid = (component1 + 59) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return aFi1rSDK;
    }

    public static void getRevenue() {
        getCurrencyIso4217Code = -842505383;
        AFAdRevenueData = 1760829245;
        getRevenue = 503259577;
        getMediationNetwork = new byte[]{-125, -23, -7, -7, -7, -3, -49, -26, -30, -7, -11, -8, -8, -4, -7, -5, -3, -1, -2, -10, -14, -28, -56, -23, -7, -2, -52, -27, -2, -7, -7, -8, -29, -12, -2, -5, -50, -24, -4, -12, -12, -4, -11, -31, -5, -1, -6, -4, -8, -6, -8, -2, -9, -2, -6, -30, -5, -7, -1, -3, -8, -12, -4, -8};
    }
}
