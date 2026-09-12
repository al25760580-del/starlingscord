package io.sentry.vendor.gson.internal.bind.util;

import a3.e;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kk.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f13254a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(char c8, int i7, String str) {
        return i7 < str.length() && str.charAt(i7) == c8;
    }

    public static void b(int i7, int i10, StringBuilder sb2) {
        String string = Integer.toString(i7);
        for (int length = i10 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d9 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01f9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0130, please report this as an issue */
    public static Date c(String str, ParsePosition parsePosition) throws ParseException {
        String strG;
        String message;
        int i7;
        int i10;
        int iD;
        int iD2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id2;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i11 = index + 4;
            int iD3 = d(index, i11, str);
            if (a('-', i11, str)) {
                i11 = index + 5;
            }
            int i12 = i11 + 2;
            int iD4 = d(i11, i12, str);
            if (a('-', i12, str)) {
                i12 = i11 + 3;
            }
            int i13 = i12 + 2;
            int iD5 = d(i12, i13, str);
            boolean zA = a('T', i13, str);
            if (!zA && str.length() <= i13) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iD3, iD4 - 1, iD5);
                parsePosition.setIndex(i13);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i14 = i12 + 5;
                int iD6 = d(i12 + 3, i14, str);
                if (a(':', i14, str)) {
                    i14 = i12 + 6;
                }
                int i15 = i14 + 2;
                int iD7 = d(i14, i15, str);
                if (a(':', i15, str)) {
                    i15 = i14 + 3;
                }
                if (str.length() <= i15 || (cCharAt2 = str.charAt(i15)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i13 = i15;
                    i7 = iD6;
                    i10 = iD7;
                } else {
                    int i16 = i15 + 2;
                    iD2 = d(i15, i16, str);
                    if (iD2 > 59 && iD2 < 63) {
                        iD2 = 59;
                    }
                    if (a('.', i16, str)) {
                        int i17 = i15 + 3;
                        int i18 = i15 + 4;
                        while (true) {
                            if (i18 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i18);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i18++;
                            }
                            length2 = i18;
                            break;
                        }
                        int iMin = Math.min(length2, i15 + 6);
                        iD = d(i17, iMin, str);
                        int i19 = iMin - i17;
                        if (i19 == 1) {
                            iD *= 100;
                        } else if (i19 == 2) {
                            iD *= 10;
                        }
                        i7 = iD6;
                        i13 = length2;
                        i10 = iD7;
                    } else {
                        i7 = iD6;
                        i13 = i16;
                        i10 = iD7;
                        iD = 0;
                    }
                }
                if (str.length() > i13) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i13);
                timeZone = f13254a;
                if (cCharAt == 'Z') {
                    length = i13 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i13);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i13 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                        str2 = "GMT" + strSubstring;
                        timeZone = DesugarTimeZone.getTimeZone(str2);
                        id2 = timeZone.getID();
                        if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iD3);
                gregorianCalendar2.set(2, iD4 - 1);
                gregorianCalendar2.set(5, iD5);
                gregorianCalendar2.set(11, i7);
                gregorianCalendar2.set(12, i10);
                gregorianCalendar2.set(13, iD2);
                gregorianCalendar2.set(14, iD);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i7 = 0;
            i10 = 0;
            iD = 0;
            iD2 = 0;
            if (str.length() > i13) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i13);
            timeZone = f13254a;
            if (cCharAt == 'Z') {
                length = i13 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i13);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i13 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    str2 = "GMT" + strSubstring;
                    timeZone = DesugarTimeZone.getTimeZone(str2);
                    id2 = timeZone.getID();
                    if (!id2.equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iD3);
            gregorianCalendar3.set(2, iD4 - 1);
            gregorianCalendar3.set(5, iD5);
            gregorianCalendar3.set(11, i7);
            gregorianCalendar3.set(12, i10);
            gregorianCalendar3.set(13, iD2);
            gregorianCalendar3.set(14, iD);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                strG = null;
            } else {
                strG = b.g('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(e.m("Failed to parse date [", strG, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str == null) {
                strG = null;
            } else {
                strG = b.g('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(e.m("Failed to parse date [", strG, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e12) {
            e = e12;
            if (str == null) {
                strG = null;
            } else {
                strG = b.g('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(e.m("Failed to parse date [", strG, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int d(int i7, int i10, String str) {
        int i11;
        int i12;
        if (i7 < 0 || i10 > str.length() || i7 > i10) {
            throw new NumberFormatException(str);
        }
        if (i7 < i10) {
            i12 = i7 + 1;
            int iDigit = Character.digit(str.charAt(i7), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i10));
            }
            i11 = -iDigit;
        } else {
            i11 = 0;
            i12 = i7;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int iDigit2 = Character.digit(str.charAt(i12), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i10));
            }
            i11 = (i11 * 10) - iDigit2;
            i12 = i13;
        }
        return -i11;
    }
}
