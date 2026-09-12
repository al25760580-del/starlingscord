package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1iSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int areAllFieldsValid = 1;
    private static int getMediationNetwork;
    private static long getMonetizationNetwork;
    private static int getRevenue;
    private final Map<String, Object> AFAdRevenueData;
    private final Context getCurrencyIso4217Code;

    public static class AFa1zSDK {
        public static byte[] AFAdRevenueData(@NonNull byte[] bArr) {
            for (int i7 = 0; i7 < bArr.length; i7++) {
                bArr[i7] = (byte) (bArr[i7] ^ ((i7 % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        public static byte[] getMonetizationNetwork(@NonNull String str) {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        AFAdRevenueData();
        PointF.length(0.0f, 0.0f);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getFadingEdgeLength();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getScrollBarSize();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ViewConfiguration.getScrollFriction();
        Process.myPid();
        View.resolveSizeAndState(0, 0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getTapTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        int i7 = areAllFieldsValid + 19;
        getRevenue = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public AFc1iSDK(Map<String, Object> map, Context context) {
        this.AFAdRevenueData = map;
        this.getCurrencyIso4217Code = context;
        put(getMediationNetwork(), getMonetizationNetwork());
    }

    public static void AFAdRevenueData() {
        getMediationNetwork = -33994396;
        getMonetizationNetwork = 8254201675162375375L;
    }

    private static void a(String str, int i7, int i10, int i11, boolean z5, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            int i12 = $10 + 15;
            $11 = i12 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i12 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1cSDK aFk1cSDK = new AFk1cSDK();
        char[] cArr2 = new char[i10];
        aFk1cSDK.getMonetizationNetwork = 0;
        while (true) {
            int i13 = aFk1cSDK.getMonetizationNetwork;
            if (i13 >= i10) {
                break;
            }
            $10 = ($11 + 45) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            char c8 = cArr[i13];
            aFk1cSDK.AFAdRevenueData = c8;
            char c10 = (char) (c8 + i11);
            cArr2[i13] = c10;
            cArr2[i13] = (char) (c10 - ((int) (((long) getMediationNetwork) ^ (-1147347204026316506L))));
            aFk1cSDK.getMonetizationNetwork = i13 + 1;
        }
        if (i7 > 0) {
            $10 = ($11 + 43) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            aFk1cSDK.getCurrencyIso4217Code = i7;
            char[] cArr3 = new char[i10];
            System.arraycopy(cArr2, 0, cArr3, 0, i10);
            int i14 = aFk1cSDK.getCurrencyIso4217Code;
            System.arraycopy(cArr3, 0, cArr2, i10 - i14, i14);
            int i15 = aFk1cSDK.getCurrencyIso4217Code;
            System.arraycopy(cArr3, i15, cArr2, 0, i10 - i15);
        }
        if (z5) {
            char[] cArr4 = new char[i10];
            aFk1cSDK.getMonetizationNetwork = 0;
            while (true) {
                int i16 = aFk1cSDK.getMonetizationNetwork;
                if (i16 >= i10) {
                    break;
                }
                cArr4[i16] = cArr2[(i10 - i16) - 1];
                aFk1cSDK.getMonetizationNetwork = i16 + 1;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(String str, int i7, Object[] objArr) {
        char[] charArray;
        int i10 = $10;
        $11 = (i10 + 27) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        Object obj = str;
        if (str != null) {
            int i11 = i10 + 97;
            $11 = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i11 % 2 == 0) {
                int i12 = 74 / 0;
                charArray = str.toCharArray();
            } else {
                charArray = str.toCharArray();
            }
            $11 = ($10 + 9) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            obj = charArray;
        }
        AFk1gSDK aFk1gSDK = new AFk1gSDK();
        char[] currencyIso4217Code = AFk1gSDK.getCurrencyIso4217Code(getMonetizationNetwork ^ 7975055078221964256L, (char[]) obj, i7);
        aFk1gSDK.getCurrencyIso4217Code = 4;
        while (true) {
            int i13 = aFk1gSDK.getCurrencyIso4217Code;
            if (i13 >= currencyIso4217Code.length) {
                objArr[0] = new String(currencyIso4217Code, 4, currencyIso4217Code.length - 4);
                return;
            }
            $11 = ($10 + 23) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            int i14 = i13 - 4;
            aFk1gSDK.getMediationNetwork = i14;
            currencyIso4217Code[i13] = (char) (((long) (currencyIso4217Code[i13] ^ currencyIso4217Code[i13 % 4])) ^ (((long) i14) * (getMonetizationNetwork ^ 7975055078221964256L)));
            aFk1gSDK.getCurrencyIso4217Code = i13 + 1;
        }
    }

    private static StringBuilder getCurrencyIso4217Code(@NonNull String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i7 = 0; i7 < 3; i7++) {
            arrayList.add(Integer.valueOf(strArr[i7].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < iIntValue; i10++) {
            Integer numValueOf = null;
            for (int i11 = 0; i11 < 3; i11++) {
                getRevenue = (areAllFieldsValid + 57) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                int iCharAt = strArr[i11].charAt(i10);
                if (numValueOf == null) {
                    int i12 = areAllFieldsValid + 69;
                    getRevenue = i12 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                } else {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb2.append(Integer.toHexString(numValueOf.intValue()));
        }
        return sb2;
    }

    @NonNull
    private String getMediationNetwork() {
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFAdRevenueData;
            Object[] objArr = new Object[1];
            a("\n\ufff7\u0003\u0006\ufff7￼\ufff5\n\uffff\u0003\ufffb\t", ExpandableListView.getPackedPositionGroup(0L) + 4, 11 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getCapsMode("", 0, 0) + 172, false, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFAdRevenueData;
            Object[] objArr2 = new Object[1];
            a("\ufffa\u000b\ufffb�\u0007", 3 - View.MeasureSpec.makeMeasureSpec(0, 0), 5 - Color.blue(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 169, true, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                Object[] objArr3 = new Object[1];
                a("\u0003\u0002\ufff8\u0002\ufff5\u0006\ufff6\u0013", TextUtils.indexOf("", "") + 2, 8 - (ViewConfiguration.getTapTimeout() >> 16), 142 - Drawable.resolveOpacity(0, 0), true, objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.reverse();
            StringBuilder currencyIso4217Code = getCurrencyIso4217Code(string, string3, sb2.toString());
            int length = currencyIso4217Code.length();
            if (length > 4) {
                int i7 = areAllFieldsValid + 97;
                getRevenue = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                int i10 = i7 % 2;
                currencyIso4217Code.delete(4, length);
            } else {
                while (length < 4) {
                    getRevenue = (areAllFieldsValid + 89) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    length++;
                    currencyIso4217Code.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            b("퍵ƅ哆鈷팞뛏㫾", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
            currencyIso4217Code.insert(0, ((String) objArr4[0]).intern());
            return currencyIso4217Code.toString();
        } catch (Exception e10) {
            Object[] objArr5 = new Object[1];
            b("쬇\udc3a\uf4e9ꃕ쬧歲髒蔬\u17ed俣뾸ꋹ爆경퍙羱嵚鄵\uf01e᭰맗\uf642ᗂ㣆蓎\uda93䪂햘\ue706㿃湈\uf100쉈ᰌ茍蹄⺌䅐ꂮꮘ৬ꖘ쑧䢔", -((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e10);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b("╨鳵다턗┎\u2bbb\udcd3\uf4f6鈴ེ吏팹鱵\uec3c镗\u0e60댽퇢똟檸埿뛊叁䤏檢騎ಅꑋॹ罂⡕肋ⰸ峎앆ￃ샰ƙ\ue6bf\uda0a\ue780\ue557艱㥐먊쩒", -((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e10);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr7 = new Object[1];
            b("쁃w\uf497꜍쀨뜽骯芹᳆鎥뾴", Drawable.resolveOpacity(0, 0) + 1, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x039c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x039d  */
    private String getMonetizationNetwork() throws Throwable {
        long j;
        String string;
        char c8;
        Throwable th2;
        String string2;
        int i7;
        int i10;
        try {
            Map<String, Object> map = this.AFAdRevenueData;
            Object[] objArr = new Object[1];
            a("\n\ufff7\u0003\u0006\ufff7￼\ufff5\n\uffff\u0003\ufffb\t", (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, (ViewConfiguration.getTouchSlop() >> 8) + 172, false, objArr);
            String string3 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFAdRevenueData;
            Object[] objArr2 = new Object[1];
            a("\uffde\ufffb\u000e\uffff\u0000\u0003\f\r\u000e￦\ufffb\u000f\b�\u0002", TextUtils.indexOf("", "", 0) + 4, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, View.getDefaultSize(0, 0) + 168, false, objArr2);
            String string4 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            b("䰕袗ꊇ\uf38b䰣㾖쳨혱邇\u1b4f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            j = 0;
            try {
                Object[] objArr4 = new Object[1];
                a("￨￥￩\u001e-", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 5, 183 - AndroidCharacter.getMirror('0'), true, objArr4);
                String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string3);
                sb2.append(string4);
                sb2.append(strReplaceAll);
                String currencyIso4217Code = AFj1bSDK.getCurrencyIso4217Code(sb2.toString());
                StringBuilder sb3 = new StringBuilder("");
                sb3.append(currencyIso4217Code.substring(0, 16));
                string = sb3.toString();
            } catch (Exception e10) {
                e = e10;
                Object[] objArr5 = new Object[1];
                a("\u0013\u0006\u000f\u0006\b\uffc1\u0005\u0006\r\n\u0002\u0007\uffc1\u0006\u0016\r\u0002\ufff7ￓ\ufff7\u0015\u0006\b\u0006\u0016\r\u0002\u0017\uffc1\u0007\u0006\f\uffc1\b\u000f\n\u0015\u0002", TextUtils.indexOf("", "", 0) + 23, TextUtils.getOffsetAfter("", 0) + 38, 160 - Process.getGidForName(""), true, objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                b("罹写䟍老缟\ue6d7⧺ꗠꎠ숖\u0cf7舯왤⅐恾彶\ue92c\u1c8e䌶㮮෮箦ꛨ᠙コ坢鈴\uf559卽뉻\udd6e퇔瘪醣〻께骹쳳ᎋ謏부⠢睃桁\ue04eݰ䩁䓄", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr6);
                sb4.append(((String) objArr6[0]).intern());
                sb4.append(e);
                AFLogger.afRDLog(sb4.toString());
                StringBuilder sb5 = new StringBuilder("");
                Object[] objArr7 = new Object[1];
                a("￨\u001c\ufff1￩\u001e￪￨￩\ufff0\u001a\u0019\u001a\u001d\u0019\u001d￨￭￬", 9 - Color.red(0), 17 - Process.getGidForName(""), 138 - KeyEvent.getDeadChar(0, 0), false, objArr7);
                sb5.append(((String) objArr7[0]).intern());
                string = sb5.toString();
            }
        } catch (Exception e11) {
            e = e11;
            j = 0;
        }
        String str = string;
        try {
            Context context = this.getCurrencyIso4217Code;
            Object[] objArr8 = new Object[1];
            a("\u0016\u0010\u000bￕ\u0010\u0015\u001b\f\u0015\u001bￕ\b\n\u001b\u0010\u0016\u0015ￕ￩￨\ufffb\ufffb￬\ufff9\u0000\u0006￪\uffef￨\ufff5￮￬￫\b\u0015\u000b\u0019", 34 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 36, View.combineMeasuredStates(0, 0) + 155, false, objArr8);
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int intExtra = -2700;
            if (intentRegisterReceiver != null) {
                areAllFieldsValid = (getRevenue + 47) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                Object[] objArr9 = new Object[1];
                b("⢶鮜\ue044ᚒ⣂Ⳗ蹷㍯\uf46fࠅꬿᒯ醻\ueb49쟷", -TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
                intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str2 = this.getCurrencyIso4217Code.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                Object[] objArr10 = new Object[1];
                b("\uf68e㹥\u2e7d筻\uf6f6襲䀕", 1 - Drawable.resolveOpacity(0, 0), objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    areAllFieldsValid = (getRevenue + 87) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            Context context2 = this.getCurrencyIso4217Code;
            c8 = '0';
            try {
                th2 = null;
                try {
                    Object[] objArr11 = new Object[1];
                    a("\u0004\u0000\u0003\u0004\ufff6\uffff", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, 6 - (KeyEvent.getMaxKeyCode() >> 16), 177 - TextUtils.indexOf("", "", 0, 0), false, objArr11);
                    int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
                    StringBuilder sb6 = new StringBuilder();
                    Object[] objArr12 = new Object[1];
                    b("ē甉썕敖ű", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr12);
                    sb6.append(((String) objArr12[0]).intern());
                    sb6.append(intExtra);
                    Object[] objArr13 = new Object[1];
                    a("ￗ)", AndroidCharacter.getMirror('0') - '.', TextUtils.getCapsMode("", 0, 0) + 2, View.MeasureSpec.getSize(0) + 145, false, objArr13);
                    sb6.append(((String) objArr13[0]).intern());
                    sb6.append(i10);
                    Object[] objArr14 = new Object[1];
                    b("蕕캷卍\udf3c蕳秫", 1 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr14);
                    sb6.append(((String) objArr14[0]).intern());
                    sb6.append(size);
                    Object[] objArr15 = new Object[1];
                    b("\udfe2ஔ催뭍\udfc4볋", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr15);
                    sb6.append(((String) objArr15[0]).intern());
                    sb6.append(this.AFAdRevenueData.size());
                    String string5 = sb6.toString();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    byte[] bArrAFAdRevenueData = AFa1zSDK.AFAdRevenueData(AFa1zSDK.getMonetizationNetwork(string5));
                    StringBuilder sb8 = new StringBuilder();
                    for (byte b10 : bArrAFAdRevenueData) {
                        String hexString = Integer.toHexString(b10);
                        if (hexString.length() == 1) {
                            getRevenue = (areAllFieldsValid + 9) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            hexString = "0".concat(hexString);
                        }
                        sb8.append(hexString);
                    }
                    sb7.append(sb8.toString());
                    string2 = sb7.toString();
                } catch (Exception e12) {
                    e = e12;
                    Object[] objArr16 = new Object[1];
                    a("\u0005\u0015\f\u0001\ufff6ￒ\ufff6\u0014\u0005\u0007\u0012\u000f\u0012\u0012\u0005\uffc0", ExpandableListView.getPackedPositionType(j) + 10, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.getDeadChar(0, 0) + 162, true, objArr16);
                    AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e);
                    StringBuilder sb9 = new StringBuilder();
                    Object[] objArr17 = new Object[1];
                    b("罹写䟍老缟\ue6d7⧺ꗠꎠ숖\u0cf7舯왤⅐恾彶\ue92c\u1c8e䌶㮮෮箦ꛨ᠙コ坢鈴\uf559卽뉻\udd6e퇔瘪醣〻께骹쳳ᎋ謏부⠢睃桁\ue04eݰ䩁䓄", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr17);
                    sb9.append(((String) objArr17[0]).intern());
                    sb9.append(e);
                    AFLogger.afRDLog(sb9.toString());
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(str);
                    Object[] objArr18 = new Object[1];
                    a("\u001bￜ\u001b\uffdd\uffdd\u000e\u0013\u001f\f\u0018\u0011ￛ\u001cￛ\u001cￜ", 9 - ExpandableListView.getPackedPositionChild(j), '@' - AndroidCharacter.getMirror(c8), KeyEvent.normalizeMetaState(0) + 151, false, objArr18);
                    sb10.append(((String) objArr18[0]).intern());
                    string2 = sb10.toString();
                }
            } catch (Exception e13) {
                e = e13;
                th2 = null;
                Object[] objArr19 = new Object[1];
                a("\u0005\u0015\f\u0001\ufff6ￒ\ufff6\u0014\u0005\u0007\u0012\u000f\u0012\u0012\u0005\uffc0", ExpandableListView.getPackedPositionType(j) + 10, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.getDeadChar(0, 0) + 162, true, objArr19);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr19[0]).intern(), e);
                StringBuilder sb11 = new StringBuilder();
                Object[] objArr110 = new Object[1];
                b("罹写䟍老缟\ue6d7⧺ꗠꎠ숖\u0cf7舯왤⅐恾彶\ue92c\u1c8e䌶㮮෮箦ꛨ᠙コ坢鈴\uf559卽뉻\udd6e퇔瘪醣〻께骹쳳ᎋ謏부⠢睃桁\ue04eݰ䩁䓄", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr110);
                sb11.append(((String) objArr110[0]).intern());
                sb11.append(e);
                AFLogger.afRDLog(sb11.toString());
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                Object[] objArr111 = new Object[1];
                a("\u001bￜ\u001b\uffdd\uffdd\u000e\u0013\u001f\f\u0018\u0011ￛ\u001cￛ\u001cￜ", 9 - ExpandableListView.getPackedPositionChild(j), '@' - AndroidCharacter.getMirror(c8), KeyEvent.normalizeMetaState(0) + 151, false, objArr111);
                sb12.append(((String) objArr111[0]).intern());
                string2 = sb12.toString();
                i7 = areAllFieldsValid + 87;
                getRevenue = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i7 % 2 == 0) {
                    return string2;
                }
                throw th2;
            }
        } catch (Exception e14) {
            e = e14;
            c8 = '0';
        }
        i7 = areAllFieldsValid + 87;
        getRevenue = i7 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 % 2 == 0) {
            return string2;
        }
        throw th2;
    }
}
