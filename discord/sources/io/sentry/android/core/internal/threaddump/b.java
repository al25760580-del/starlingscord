package io.sentry.android.core.internal.threaddump;

import a5.g;
import io.sentry.SentryLevel;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.w5;
import io.sentry.x4;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ue.i;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f12249f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f12250g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f12251h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f12252i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f12253l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f12254m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f12255n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f12256o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f12257p = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f12258q = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f12259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f12261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12262d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12263e = new ArrayList();

    public b(w5 w5Var, boolean z5) {
        this.f12259a = w5Var;
        this.f12260b = z5;
        this.f12261c = new i(w5Var);
    }

    public static void a(c0 c0Var, x4 x4Var) {
        Map map = c0Var.G;
        if (map == null) {
            map = new HashMap();
        }
        x4 x4Var2 = (x4) map.get(x4Var.f13279e);
        if (x4Var2 != null) {
            x4Var2.f13278d = Math.max(x4Var2.f13278d, x4Var.f13278d);
        } else {
            String str = x4Var.f13279e;
            x4 x4Var3 = new x4();
            x4Var3.f13278d = x4Var.f13278d;
            x4Var3.f13279e = str;
            x4Var3.f13280i = x4Var.f13280i;
            x4Var3.f13281v = x4Var.f13281v;
            x4Var3.f13282w = x4Var.f13282w;
            x4Var3.f13283x = m.F(x4Var.f13283x);
            map.put(str, x4Var3);
        }
        c0Var.G = map;
    }

    public static Long b(Matcher matcher, int i7) {
        String strGroup = matcher.group(i7);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0365  */
    /* JADX WARN: Code duplicated, block: B:102:0x036b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x036d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0390  */
    /* JADX WARN: Code duplicated, block: B:106:0x0396 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0398  */
    /* JADX WARN: Code duplicated, block: B:108:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:110:0x03ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:115:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:117:0x03fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0400  */
    /* JADX WARN: Code duplicated, block: B:119:0x040d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0413  */
    /* JADX WARN: Code duplicated, block: B:138:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x042b A[EDGE_INSN: B:140:0x042b->B:125:0x042b BREAK  A[LOOP:1: B:48:0x0168->B:124:0x041c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x042b A[EDGE_INSN: B:141:0x042b->B:125:0x042b BREAK  A[LOOP:1: B:48:0x0168->B:124:0x041c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0182  */
    /* JADX WARN: Code duplicated, block: B:56:0x0195  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0220  */
    /* JADX WARN: Code duplicated, block: B:78:0x0242  */
    /* JADX WARN: Code duplicated, block: B:79:0x0245  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:85:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:89:0x02df  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0311  */
    /* JADX WARN: Code duplicated, block: B:94:0x0317 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0319  */
    /* JADX WARN: Code duplicated, block: B:96:0x033b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0341 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0343  */
    public final void d(g gVar) {
        int i7;
        String str;
        ArrayList arrayList;
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        SentryStackFrame sentryStackFrame;
        a aVarF;
        String str2;
        boolean zC;
        i iVar;
        Matcher matcher11;
        Matcher matcher12;
        Matcher matcher13;
        Matcher matcher14;
        SentryStackFrame sentryStackFrame2;
        String strGroup;
        Integer numValueOf;
        String strGroup2;
        String str3;
        HashMap map;
        String strGroup3;
        Integer numValueOf2;
        boolean zEquals;
        boolean z5;
        g gVar2 = gVar;
        int i10 = gVar2.f184d;
        Pattern pattern = f12249f;
        String str4 = "";
        Matcher matcher15 = pattern.matcher("");
        Pattern pattern2 = f12250g;
        Matcher matcher16 = pattern2.matcher("");
        while (gVar2.f185e < i10) {
            a aVarF2 = gVar2.f();
            String str5 = "Internal error while parsing thread dump.";
            w5 w5Var = this.f12259a;
            if (aVarF2 == null) {
                w5Var.getLogger().q(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str6 = aVarF2.f12248a;
            if (c(matcher15, str6) || c(matcher16, str6)) {
                gVar2.f185e--;
                c0 c0Var = new c0();
                Matcher matcher17 = pattern.matcher(str4);
                Matcher matcher18 = pattern2.matcher(str4);
                if (gVar2.f185e >= i10) {
                    i7 = i10;
                    c0Var = null;
                } else {
                    a aVarF3 = gVar2.f();
                    if (aVarF3 == null) {
                        w5Var.getLogger().q(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                    } else {
                        String str7 = aVarF3.f12248a;
                        if (c(matcher17, str7)) {
                            Long lB = b(matcher17, 4);
                            if (lB == null) {
                                w5Var.getLogger().q(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                            } else {
                                c0Var.f12925d = lB;
                                c0Var.f12927i = matcher17.group(1);
                                String strGroup4 = matcher17.group(5);
                                if (strGroup4 != null) {
                                    if (strGroup4.contains(" ")) {
                                        c0Var.f12928v = strGroup4.substring(0, strGroup4.indexOf(32));
                                    } else {
                                        c0Var.f12928v = strGroup4;
                                    }
                                }
                                str = c0Var.f12927i;
                                if (str != null) {
                                    zEquals = str.equals("main");
                                    c0Var.E = Boolean.valueOf(zEquals);
                                    c0Var.f12929w = Boolean.valueOf(zEquals);
                                    if (zEquals || this.f12260b) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    c0Var.f12930x = Boolean.valueOf(z5);
                                }
                                arrayList = new ArrayList();
                                matcher = f12251h.matcher(str4);
                                matcher2 = f12252i.matcher(str4);
                                matcher3 = j.matcher(str4);
                                matcher4 = k.matcher(str4);
                                matcher5 = f12254m.matcher(str4);
                                matcher6 = f12253l.matcher(str4);
                                matcher7 = f12256o.matcher(str4);
                                matcher8 = f12255n.matcher(str4);
                                matcher9 = f12257p.matcher(str4);
                                matcher10 = f12258q.matcher(str4);
                                sentryStackFrame = null;
                                while (true) {
                                    if (gVar2.f185e >= i10) {
                                        aVarF = gVar2.f();
                                        if (aVarF == null) {
                                            w5Var.getLogger().q(SentryLevel.WARNING, str5, new Object[0]);
                                        } else {
                                            str2 = aVarF.f12248a;
                                            zC = c(matcher2, str2);
                                            iVar = this.f12261c;
                                            i7 = i10;
                                            String str8 = str5;
                                            if (zC) {
                                                sentryStackFrame = new SentryStackFrame();
                                                matcher11 = matcher8;
                                                String strK = kk.b.k(matcher2.group(1), ".", matcher2.group(2));
                                                sentryStackFrame.f12905x = strK;
                                                sentryStackFrame.f12904w = matcher2.group(3);
                                                sentryStackFrame.f12903v = matcher2.group(4);
                                                strGroup3 = matcher2.group(5);
                                                if (strGroup3 != null || strGroup3.length() == 0) {
                                                    numValueOf2 = null;
                                                } else {
                                                    int i11 = Integer.parseInt(strGroup3);
                                                    numValueOf2 = Integer.valueOf(i11);
                                                    if (i11 < 0) {
                                                        numValueOf2 = null;
                                                    }
                                                }
                                                sentryStackFrame.f12906y = numValueOf2;
                                                sentryStackFrame.H = iVar.k(strK);
                                                arrayList.add(sentryStackFrame);
                                                matcher2 = matcher2;
                                            } else {
                                                matcher11 = matcher8;
                                                if (c(matcher, str2)) {
                                                    sentryStackFrame2 = new SentryStackFrame();
                                                    sentryStackFrame2.I = matcher.group(3);
                                                    sentryStackFrame2.f12904w = matcher.group(6);
                                                    strGroup = matcher.group(7);
                                                    if (strGroup != null || strGroup.length() == 0) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
                                                    }
                                                    sentryStackFrame2.f12906y = numValueOf;
                                                    sentryStackFrame2.N = "0x" + matcher.group(2);
                                                    sentryStackFrame2.K = "native";
                                                    strGroup2 = matcher.group(8);
                                                    if (strGroup2 == null) {
                                                        str3 = null;
                                                    } else {
                                                        try {
                                                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10".concat(strGroup2), 16).toByteArray());
                                                            byteBufferWrap.get();
                                                            str3 = String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
                                                        } catch (NumberFormatException | BufferUnderflowException unused) {
                                                            str3 = null;
                                                        }
                                                    }
                                                    if (str3 != null) {
                                                        map = this.f12262d;
                                                        if (!map.containsKey(str3)) {
                                                            DebugImage debugImage = new DebugImage();
                                                            debugImage.setDebugId(str3);
                                                            debugImage.setType("elf");
                                                            debugImage.setCodeFile(matcher.group(4));
                                                            debugImage.setCodeId(strGroup2);
                                                            map.put(str3, debugImage);
                                                        }
                                                        sentryStackFrame2.O = "rel:".concat(str3);
                                                    } else {
                                                        matcher2 = matcher2;
                                                    }
                                                    arrayList.add(sentryStackFrame2);
                                                    sentryStackFrame = null;
                                                } else {
                                                    matcher2 = matcher2;
                                                    if (c(matcher3, str2)) {
                                                        sentryStackFrame = new SentryStackFrame();
                                                        String strK2 = kk.b.k(matcher3.group(1), ".", matcher3.group(2));
                                                        sentryStackFrame.f12905x = strK2;
                                                        sentryStackFrame.f12904w = matcher3.group(3);
                                                        sentryStackFrame.H = iVar.k(strK2);
                                                        sentryStackFrame.J = Boolean.TRUE;
                                                        arrayList.add(sentryStackFrame);
                                                    } else if (c(matcher4, str2)) {
                                                        if (sentryStackFrame != null) {
                                                            x4 x4Var = new x4();
                                                            x4Var.f13278d = 1;
                                                            x4Var.f13279e = matcher4.group(1);
                                                            x4Var.f13280i = matcher4.group(2);
                                                            x4Var.f13281v = matcher4.group(3);
                                                            sentryStackFrame.S = x4Var;
                                                            a(c0Var, x4Var);
                                                        }
                                                    } else if (c(matcher5, str2)) {
                                                        if (sentryStackFrame != null) {
                                                            x4 x4Var2 = new x4();
                                                            x4Var2.f13278d = 2;
                                                            x4Var2.f13279e = matcher5.group(1);
                                                            x4Var2.f13280i = matcher5.group(2);
                                                            x4Var2.f13281v = matcher5.group(3);
                                                            sentryStackFrame.S = x4Var2;
                                                            a(c0Var, x4Var2);
                                                        }
                                                    } else if (c(matcher6, str2)) {
                                                        if (c(matcher7, str2)) {
                                                            matcher12 = matcher11;
                                                            if (c(matcher12, str2)) {
                                                                matcher13 = matcher9;
                                                                if (c(matcher13, str2)) {
                                                                    if (str2.length() != 0) {
                                                                        break;
                                                                    }
                                                                    matcher14 = matcher10;
                                                                    if (c(matcher14, str2)) {
                                                                        break;
                                                                    }
                                                                } else if (sentryStackFrame != null) {
                                                                    x4 x4Var3 = new x4();
                                                                    x4Var3.f13278d = 8;
                                                                    sentryStackFrame.S = x4Var3;
                                                                    a(c0Var, x4Var3);
                                                                }
                                                            } else {
                                                                if (sentryStackFrame != null) {
                                                                    x4 x4Var4 = new x4();
                                                                    x4Var4.f13278d = 8;
                                                                    x4Var4.f13279e = matcher12.group(1);
                                                                    x4Var4.f13280i = matcher12.group(2);
                                                                    x4Var4.f13281v = matcher12.group(3);
                                                                    sentryStackFrame.S = x4Var4;
                                                                    a(c0Var, x4Var4);
                                                                }
                                                                matcher13 = matcher9;
                                                            }
                                                            matcher14 = matcher10;
                                                        } else if (sentryStackFrame != null) {
                                                            x4 x4Var5 = new x4();
                                                            x4Var5.f13278d = 8;
                                                            x4Var5.f13279e = matcher7.group(1);
                                                            x4Var5.f13280i = matcher7.group(2);
                                                            x4Var5.f13281v = matcher7.group(3);
                                                            x4Var5.f13282w = b(matcher7, 4);
                                                            sentryStackFrame.S = x4Var5;
                                                            a(c0Var, x4Var5);
                                                        }
                                                        matcher9 = matcher13;
                                                        matcher10 = matcher14;
                                                        matcher2 = matcher2;
                                                        i10 = i7;
                                                        str5 = str8;
                                                        matcher8 = matcher12;
                                                        gVar2 = gVar;
                                                    } else if (sentryStackFrame != null) {
                                                        x4 x4Var6 = new x4();
                                                        x4Var6.f13278d = 4;
                                                        x4Var6.f13279e = matcher6.group(1);
                                                        x4Var6.f13280i = matcher6.group(2);
                                                        x4Var6.f13281v = matcher6.group(3);
                                                        sentryStackFrame.S = x4Var6;
                                                        a(c0Var, x4Var6);
                                                    }
                                                }
                                            }
                                            matcher13 = matcher9;
                                            matcher14 = matcher10;
                                            matcher12 = matcher11;
                                            matcher9 = matcher13;
                                            matcher10 = matcher14;
                                            matcher2 = matcher2;
                                            i10 = i7;
                                            str5 = str8;
                                            matcher8 = matcher12;
                                            gVar2 = gVar;
                                        }
                                    }
                                    i7 = i10;
                                    break;
                                }
                                Collections.reverse(arrayList);
                                a0 a0Var = new a0(arrayList);
                                a0Var.f12916i = Boolean.TRUE;
                                c0Var.F = a0Var;
                            }
                        } else {
                            if (c(matcher18, str7)) {
                                Long lB2 = b(matcher18, 3);
                                if (lB2 == null) {
                                    w5Var.getLogger().q(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                } else {
                                    c0Var.f12925d = lB2;
                                    c0Var.f12927i = matcher18.group(1);
                                }
                            }
                            str = c0Var.f12927i;
                            if (str != null) {
                                zEquals = str.equals("main");
                                c0Var.E = Boolean.valueOf(zEquals);
                                c0Var.f12929w = Boolean.valueOf(zEquals);
                                if (zEquals) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                c0Var.f12930x = Boolean.valueOf(z5);
                            }
                            arrayList = new ArrayList();
                            matcher = f12251h.matcher(str4);
                            matcher2 = f12252i.matcher(str4);
                            matcher3 = j.matcher(str4);
                            matcher4 = k.matcher(str4);
                            matcher5 = f12254m.matcher(str4);
                            matcher6 = f12253l.matcher(str4);
                            matcher7 = f12256o.matcher(str4);
                            matcher8 = f12255n.matcher(str4);
                            matcher9 = f12257p.matcher(str4);
                            matcher10 = f12258q.matcher(str4);
                            sentryStackFrame = null;
                            while (true) {
                                if (gVar2.f185e >= i10) {
                                    aVarF = gVar2.f();
                                    if (aVarF == null) {
                                        w5Var.getLogger().q(SentryLevel.WARNING, str5, new Object[0]);
                                    } else {
                                        str2 = aVarF.f12248a;
                                        zC = c(matcher2, str2);
                                        iVar = this.f12261c;
                                        i7 = i10;
                                        String str9 = str5;
                                        if (zC) {
                                            sentryStackFrame = new SentryStackFrame();
                                            matcher11 = matcher8;
                                            String strK3 = kk.b.k(matcher2.group(1), ".", matcher2.group(2));
                                            sentryStackFrame.f12905x = strK3;
                                            sentryStackFrame.f12904w = matcher2.group(3);
                                            sentryStackFrame.f12903v = matcher2.group(4);
                                            strGroup3 = matcher2.group(5);
                                            if (strGroup3 != null) {
                                                numValueOf2 = null;
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            sentryStackFrame.f12906y = numValueOf2;
                                            sentryStackFrame.H = iVar.k(strK3);
                                            arrayList.add(sentryStackFrame);
                                            matcher2 = matcher2;
                                        } else {
                                            matcher11 = matcher8;
                                            if (c(matcher, str2)) {
                                                sentryStackFrame2 = new SentryStackFrame();
                                                sentryStackFrame2.I = matcher.group(3);
                                                sentryStackFrame2.f12904w = matcher.group(6);
                                                strGroup = matcher.group(7);
                                                if (strGroup != null) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                                sentryStackFrame2.f12906y = numValueOf;
                                                sentryStackFrame2.N = "0x" + matcher.group(2);
                                                sentryStackFrame2.K = "native";
                                                strGroup2 = matcher.group(8);
                                                if (strGroup2 == null) {
                                                    str3 = null;
                                                } else {
                                                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new BigInteger("10".concat(strGroup2), 16).toByteArray());
                                                    byteBufferWrap2.get();
                                                    str3 = String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap2.getShort()), Short.valueOf(byteBufferWrap2.getShort()), Short.valueOf(byteBufferWrap2.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap2.getShort()), Integer.valueOf(byteBufferWrap2.getInt()));
                                                }
                                                if (str3 != null) {
                                                    map = this.f12262d;
                                                    if (!map.containsKey(str3)) {
                                                        DebugImage debugImage2 = new DebugImage();
                                                        debugImage2.setDebugId(str3);
                                                        debugImage2.setType("elf");
                                                        debugImage2.setCodeFile(matcher.group(4));
                                                        debugImage2.setCodeId(strGroup2);
                                                        map.put(str3, debugImage2);
                                                    }
                                                    sentryStackFrame2.O = "rel:".concat(str3);
                                                } else {
                                                    matcher2 = matcher2;
                                                }
                                                arrayList.add(sentryStackFrame2);
                                                sentryStackFrame = null;
                                            } else {
                                                matcher2 = matcher2;
                                                if (c(matcher3, str2)) {
                                                    sentryStackFrame = new SentryStackFrame();
                                                    String strK4 = kk.b.k(matcher3.group(1), ".", matcher3.group(2));
                                                    sentryStackFrame.f12905x = strK4;
                                                    sentryStackFrame.f12904w = matcher3.group(3);
                                                    sentryStackFrame.H = iVar.k(strK4);
                                                    sentryStackFrame.J = Boolean.TRUE;
                                                    arrayList.add(sentryStackFrame);
                                                } else if (c(matcher4, str2)) {
                                                    if (sentryStackFrame != null) {
                                                        x4 x4Var7 = new x4();
                                                        x4Var7.f13278d = 1;
                                                        x4Var7.f13279e = matcher4.group(1);
                                                        x4Var7.f13280i = matcher4.group(2);
                                                        x4Var7.f13281v = matcher4.group(3);
                                                        sentryStackFrame.S = x4Var7;
                                                        a(c0Var, x4Var7);
                                                    }
                                                } else if (c(matcher5, str2)) {
                                                    if (sentryStackFrame != null) {
                                                        x4 x4Var8 = new x4();
                                                        x4Var8.f13278d = 2;
                                                        x4Var8.f13279e = matcher5.group(1);
                                                        x4Var8.f13280i = matcher5.group(2);
                                                        x4Var8.f13281v = matcher5.group(3);
                                                        sentryStackFrame.S = x4Var8;
                                                        a(c0Var, x4Var8);
                                                    }
                                                } else if (c(matcher6, str2)) {
                                                    if (c(matcher7, str2)) {
                                                        matcher12 = matcher11;
                                                        if (c(matcher12, str2)) {
                                                            matcher13 = matcher9;
                                                            if (c(matcher13, str2)) {
                                                                if (str2.length() != 0) {
                                                                    break;
                                                                    break;
                                                                }
                                                                matcher14 = matcher10;
                                                                if (c(matcher14, str2)) {
                                                                    break;
                                                                    break;
                                                                }
                                                            } else if (sentryStackFrame != null) {
                                                                x4 x4Var9 = new x4();
                                                                x4Var9.f13278d = 8;
                                                                sentryStackFrame.S = x4Var9;
                                                                a(c0Var, x4Var9);
                                                            }
                                                        } else {
                                                            if (sentryStackFrame != null) {
                                                                x4 x4Var10 = new x4();
                                                                x4Var10.f13278d = 8;
                                                                x4Var10.f13279e = matcher12.group(1);
                                                                x4Var10.f13280i = matcher12.group(2);
                                                                x4Var10.f13281v = matcher12.group(3);
                                                                sentryStackFrame.S = x4Var10;
                                                                a(c0Var, x4Var10);
                                                            }
                                                            matcher13 = matcher9;
                                                        }
                                                        matcher14 = matcher10;
                                                    } else if (sentryStackFrame != null) {
                                                        x4 x4Var11 = new x4();
                                                        x4Var11.f13278d = 8;
                                                        x4Var11.f13279e = matcher7.group(1);
                                                        x4Var11.f13280i = matcher7.group(2);
                                                        x4Var11.f13281v = matcher7.group(3);
                                                        x4Var11.f13282w = b(matcher7, 4);
                                                        sentryStackFrame.S = x4Var11;
                                                        a(c0Var, x4Var11);
                                                    }
                                                    matcher9 = matcher13;
                                                    matcher10 = matcher14;
                                                    matcher2 = matcher2;
                                                    i10 = i7;
                                                    str5 = str9;
                                                    matcher8 = matcher12;
                                                    gVar2 = gVar;
                                                } else if (sentryStackFrame != null) {
                                                    x4 x4Var12 = new x4();
                                                    x4Var12.f13278d = 4;
                                                    x4Var12.f13279e = matcher6.group(1);
                                                    x4Var12.f13280i = matcher6.group(2);
                                                    x4Var12.f13281v = matcher6.group(3);
                                                    sentryStackFrame.S = x4Var12;
                                                    a(c0Var, x4Var12);
                                                }
                                            }
                                        }
                                        matcher13 = matcher9;
                                        matcher14 = matcher10;
                                        matcher12 = matcher11;
                                        matcher9 = matcher13;
                                        matcher10 = matcher14;
                                        matcher2 = matcher2;
                                        i10 = i7;
                                        str5 = str9;
                                        matcher8 = matcher12;
                                        gVar2 = gVar;
                                    }
                                }
                                i7 = i10;
                                break;
                            }
                            Collections.reverse(arrayList);
                            a0 a0Var2 = new a0(arrayList);
                            a0Var2.f12916i = Boolean.TRUE;
                            c0Var.F = a0Var2;
                        }
                    }
                    i7 = i10;
                    c0Var = null;
                }
                if (c0Var != null) {
                    this.f12263e.add(c0Var);
                }
            } else {
                i7 = i10;
                pattern = pattern;
                str4 = str4;
                matcher15 = matcher15;
                pattern2 = pattern2;
                matcher16 = matcher16;
            }
            gVar2 = gVar;
            pattern = pattern;
            matcher15 = matcher15;
            pattern2 = pattern2;
            matcher16 = matcher16;
            str4 = str4;
            i10 = i7;
        }
    }
}
