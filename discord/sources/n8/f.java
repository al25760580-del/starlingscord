package n8;

import a5.i0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.b4;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.x0;
import androidx.core.view.y0;
import androidx.datastore.preferences.protobuf.d1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import app.rive.runtime.kotlin.fonts.Fonts;
import bc.k;
import com.discord.R;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.PixelUtil;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.r;
import e4.o;
import gc.g0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import je.b0;
import je.e0;
import je.w;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import or.i1;
import pa.s;
import pc.m;
import pc.x;
import v3.t;
import v3.y;
import vb.p;
import vm.n;
import xj.j;
import zc.d0;
import zc.z;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Encoder, CompositeEncoder, xb.b, OnCompleteListener, z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16510e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f16511i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f16512v;

    public /* synthetic */ f(int i7, boolean z5) {
        this.f16509d = i7;
    }

    public static int Q(int i7, int i10, mj.a aVar) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (aVar.a(i7 + i12)) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public static void Y(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void A(SerialDescriptor descriptor, int i7, double d6) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P(T(descriptor, i7), Double.valueOf(d6));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void B(long j) {
        P(c0(), Long.valueOf(j));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void C(SerialDescriptor descriptor, int i7, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P(T(descriptor, i7), Long.valueOf(j));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void D(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object objC0 = c0();
        Intrinsics.checkNotNullParameter(value, "value");
        P(objC0, value);
    }

    public ArrayList E(String str) {
        switch (this.f16509d) {
            case 11:
                ArrayList<String> stringArrayList = ((Bundle) this.f16512v).getStringArrayList(str);
                if (stringArrayList == null) {
                    return new ArrayList();
                }
                String[] strArr = new String[stringArrayList.size()];
                for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                    String str2 = stringArrayList.get(i7);
                    if (str2 == null) {
                        str2 = "";
                    }
                    strArr[i7] = str2;
                }
                ((v3.f) this.f16511i).f21402a.put(((String) this.f16510e).concat(str), strArr);
                return stringArrayList;
            default:
                Object obj = ((v3.g) this.f16512v).f21405a.get(((String) this.f16510e).concat(str));
                String[] strArr2 = obj instanceof String[] ? (String[]) obj : null;
                if (strArr2 == null) {
                    return new ArrayList();
                }
                ArrayList<String> arrayList = new ArrayList<>(strArr2.length);
                for (String str3 : strArr2) {
                    if (true == str3.isEmpty()) {
                        str3 = null;
                    }
                    arrayList.add(str3);
                }
                ((Bundle) this.f16511i).putStringArrayList(str, arrayList);
                return arrayList;
        }
    }

    public void F(int i7, String str) {
        H(String.valueOf(i7), str);
    }

    public void G(String str, boolean z5) {
        H(String.valueOf(z5), str);
    }

    public void H(Object obj, String str) {
        f fVar = new f(0, false);
        ((f) this.f16512v).f16511i = fVar;
        this.f16512v = fVar;
        fVar.f16512v = obj;
        fVar.f16510e = str;
    }

    public t I() {
        Intrinsics.checkNotNullParameter(this, "builder");
        t tVar = new t((UUID) this.f16510e, (o) this.f16512v, (LinkedHashSet) this.f16511i);
        v3.e eVar = ((o) this.f16512v).j;
        boolean z5 = eVar.a() || eVar.f21397d || eVar.f21395b || eVar.f21396c;
        o oVar = (o) this.f16512v;
        if (oVar.f8012q) {
            if (z5) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (oVar.f8004g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID id2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(id2, "randomUUID()");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f16510e = id2;
        String newId = id2.toString();
        Intrinsics.checkNotNullExpressionValue(newId, "id.toString()");
        o other = (o) this.f16512v;
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
        this.f16512v = new o(newId, other.f7999b, other.f8000c, other.f8001d, new v3.g(other.f8002e), new v3.g(other.f8003f), other.f8004g, other.f8005h, other.f8006i, new v3.e(other.j), other.k, other.f8007l, other.f8008m, other.f8009n, other.f8010o, other.f8011p, other.f8012q, other.f8013r, other.f8014s, other.f8016u, other.f8017v, other.f8018w, 524288);
        return tVar;
    }

    public vb.i J() {
        String strConcat = ((String) this.f16510e) == null ? " backendName" : "";
        if (((sb.d) this.f16511i) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new vb.i((String) this.f16510e, (byte[]) this.f16512v, (sb.d) this.f16511i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public void K(String str) {
        switch (this.f16509d) {
            case 11:
                Bundle bundle = (Bundle) this.f16512v;
                String str2 = (String) this.f16510e;
                ((v3.f) this.f16511i).f21402a.put(str2.concat(str), Integer.valueOf(bundle.getInt(str)));
                break;
            default:
                String str3 = (String) this.f16510e;
                Object obj = ((v3.g) this.f16512v).f21405a.get(str3.concat(str));
                ((Bundle) this.f16511i).putInt(str, obj instanceof Integer ? ((Integer) obj).intValue() : 0);
                break;
        }
    }

    public String L(StringBuilder sb2, int i7) throws ij.d {
        String str = null;
        while (true) {
            xj.h hVarM = M(i7, str);
            String strA = j.a(hVarM.f22957i);
            if (strA != null) {
                sb2.append(strA);
            }
            String strValueOf = hVarM.f22959w ? String.valueOf(hVarM.f22958v) : null;
            int i10 = hVarM.f14999e;
            if (i7 == i10) {
                return sb2.toString();
            }
            i7 = i10;
            str = strValueOf;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0229  */
    /* JADX WARN: Code duplicated, block: B:140:0x0231  */
    /* JADX WARN: Code duplicated, block: B:142:0x0237  */
    /* JADX WARN: Code duplicated, block: B:210:0x0339  */
    /* JADX WARN: Code duplicated, block: B:211:0x033b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0340 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x0348  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    public xj.h M(int i7, String str) throws ij.d {
        boolean zA;
        boolean z5;
        boolean z6;
        i0 i0Var;
        boolean z7;
        boolean z10;
        xj.i iVar;
        int i10;
        int i11;
        int i12;
        int iQ;
        int iQ2;
        int iQ3;
        char c8;
        xj.g gVar;
        int i13;
        boolean z11;
        int i14;
        int iQ4;
        int iQ5;
        char c10;
        xj.g gVar2;
        xj.g gVar3;
        mj.a aVar = (mj.a) this.f16510e;
        c5.e eVar = (c5.e) this.f16512v;
        StringBuilder sb2 = (StringBuilder) this.f16511i;
        sb2.setLength(0);
        if (str != null) {
            sb2.append(str);
        }
        eVar.f3485b = i7;
        do {
            int i15 = eVar.f3485b;
            int i16 = eVar.f3486c;
            if (i16 != 2) {
                if (i16 == 3) {
                    while (true) {
                        int i17 = eVar.f3485b;
                        int i18 = i17 + 5;
                        int i19 = aVar.f15838e;
                        if (i18 <= i19 && (((iQ = Q(i17, 5, aVar)) >= 5 && iQ < 16) || (i17 + 7 <= i19 && (((iQ2 = Q(i17, 7, aVar)) >= 64 && iQ2 < 116) || (i17 + 8 <= i19 && (iQ3 = Q(i17, 8, aVar)) >= 232 && iQ3 < 253))))) {
                            int i20 = eVar.f3485b;
                            int iQ6 = Q(i20, 5, aVar);
                            if (iQ6 == 15) {
                                gVar = new xj.g('$', i20 + 5);
                            } else if (iQ6 < 5 || iQ6 >= 15) {
                                int iQ7 = Q(i20, 7, aVar);
                                if (iQ7 >= 64 && iQ7 < 90) {
                                    gVar = new xj.g((char) (iQ7 + 1), i20 + 7);
                                } else if (iQ7 < 90 || iQ7 >= 116) {
                                    switch (Q(i20, 8, aVar)) {
                                        case 232:
                                            c8 = '!';
                                            break;
                                        case 233:
                                            c8 = '\"';
                                            break;
                                        case 234:
                                            c8 = '%';
                                            break;
                                        case 235:
                                            c8 = '&';
                                            break;
                                        case 236:
                                            c8 = '\'';
                                            break;
                                        case 237:
                                            c8 = '(';
                                            break;
                                        case 238:
                                            c8 = ')';
                                            break;
                                        case 239:
                                            c8 = '*';
                                            break;
                                        case 240:
                                            c8 = '+';
                                            break;
                                        case 241:
                                            c8 = ',';
                                            break;
                                        case 242:
                                            c8 = '-';
                                            break;
                                        case 243:
                                            c8 = '.';
                                            break;
                                        case 244:
                                            c8 = '/';
                                            break;
                                        case 245:
                                            c8 = ':';
                                            break;
                                        case 246:
                                            c8 = ';';
                                            break;
                                        case 247:
                                            c8 = '<';
                                            break;
                                        case 248:
                                            c8 = '=';
                                            break;
                                        case 249:
                                            c8 = '>';
                                            break;
                                        case h0.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                            c8 = '?';
                                            break;
                                        case 251:
                                            c8 = '_';
                                            break;
                                        case 252:
                                            c8 = ' ';
                                            break;
                                        default:
                                            throw ij.d.a();
                                    }
                                    gVar = new xj.g(c8, i20 + 8);
                                } else {
                                    gVar = new xj.g((char) (iQ7 + 7), i20 + 7);
                                }
                            } else {
                                gVar = new xj.g((char) (iQ6 + 43), i20 + 5);
                            }
                            int i21 = gVar.f14999e;
                            eVar.f3485b = i21;
                            char c11 = gVar.f22956i;
                            if (c11 == '$') {
                                i0Var = new i0(new xj.h(i21, sb2.toString()), true, 13);
                            } else {
                                sb2.append(c11);
                            }
                        } else {
                            int i22 = eVar.f3485b;
                            int i23 = i22 + 3;
                            if (i23 <= aVar.f15838e) {
                                while (true) {
                                    if (i22 >= i23) {
                                        eVar.f3485b += 3;
                                        eVar.f3486c = 1;
                                    } else if (!aVar.a(i22)) {
                                        i22++;
                                    } else if (W(eVar.f3485b)) {
                                        i10 = eVar.f3485b;
                                        i11 = i10 + 5;
                                        i12 = aVar.f15838e;
                                        if (i11 < i12) {
                                            eVar.f3485b = i10 + 5;
                                        } else {
                                            eVar.f3485b = i12;
                                        }
                                        eVar.f3486c = 2;
                                    }
                                }
                            } else if (W(eVar.f3485b)) {
                                i10 = eVar.f3485b;
                                i11 = i10 + 5;
                                i12 = aVar.f15838e;
                                if (i11 < i12) {
                                    eVar.f3485b = i10 + 5;
                                } else {
                                    eVar.f3485b = i12;
                                }
                                eVar.f3486c = 2;
                            }
                            i0Var = new i0(null, false, 13);
                        }
                    }
                    z10 = i0Var.f214e;
                } else {
                    while (true) {
                        int i24 = eVar.f3485b;
                        int i25 = i24 + 7;
                        int i26 = aVar.f15838e;
                        if (i25 > i26) {
                            zA = i24 + 4 <= i26;
                        } else {
                            int i27 = i24;
                            while (true) {
                                int i28 = i24 + 3;
                                if (i27 >= i28) {
                                    zA = aVar.a(i28);
                                } else if (!aVar.a(i27)) {
                                    i27++;
                                }
                            }
                        }
                        if (zA) {
                            int i29 = eVar.f3485b;
                            int i30 = i29 + 7;
                            if (i30 > i26) {
                                int iQ8 = Q(i29, 4, aVar);
                                iVar = iQ8 == 0 ? new xj.i(i26, 10, 10) : new xj.i(i26, iQ8 - 1, 10);
                            } else {
                                int iQ9 = Q(i29, 7, aVar) - 8;
                                iVar = new xj.i(i30, iQ9 / 11, iQ9 % 11);
                            }
                            int i31 = iVar.f14999e;
                            eVar.f3485b = i31;
                            int i32 = iVar.f22960i;
                            boolean z12 = i32 == 10;
                            int i33 = iVar.f22961v;
                            if (z12) {
                                i0Var = new i0(i33 == 10 ? new xj.h(i31, sb2.toString()) : new xj.h(i31, i33, sb2.toString()), true, 13);
                                z5 = true;
                            } else {
                                sb2.append(i32);
                                if (i33 == 10) {
                                    z5 = true;
                                    i0Var = new i0(new xj.h(eVar.f3485b, sb2.toString()), z5, 13);
                                } else {
                                    sb2.append(i33);
                                }
                            }
                            z7 = false;
                        } else {
                            z5 = true;
                            int i34 = eVar.f3485b;
                            if (i34 + 1 > i26) {
                                z6 = false;
                            } else {
                                int i35 = 0;
                                while (true) {
                                    if (i35 < 4) {
                                        int i36 = i35 + i34;
                                        if (i36 < i26) {
                                            if (aVar.a(i36)) {
                                                z6 = false;
                                            } else {
                                                i35++;
                                            }
                                        }
                                    }
                                    z6 = true;
                                }
                            }
                            if (z6) {
                                eVar.f3486c = 2;
                                eVar.f3485b += 4;
                            }
                            z7 = false;
                            i0Var = new i0(null, z7, 13);
                        }
                    }
                    z10 = i0Var.f214e;
                }
                i13 = eVar.f3485b;
                if (i15 != i13) {
                    z11 = z5;
                } else {
                    z11 = z7;
                }
                if (!z11 || z10) {
                }
                xj.h hVar = (xj.h) i0Var.f215i;
                return (hVar == null && hVar.f22959w) ? new xj.h(i13, hVar.f22958v, sb2.toString()) : new xj.h(i13, sb2.toString());
            }
            while (true) {
                int i37 = eVar.f3485b;
                int i38 = i37 + 5;
                int i39 = aVar.f15838e;
                if (i38 <= i39 && (((iQ4 = Q(i37, 5, aVar)) >= 5 && iQ4 < 16) || (i37 + 6 <= i39 && (iQ5 = Q(i37, 6, aVar)) >= 16 && iQ5 < 63))) {
                    int i40 = eVar.f3485b;
                    int iQ10 = Q(i40, 5, aVar);
                    if (iQ10 == 15) {
                        gVar3 = new xj.g('$', i40 + 5);
                    } else {
                        if (iQ10 < 5 || iQ10 >= 15) {
                            int iQ11 = Q(i40, 6, aVar);
                            if (iQ11 < 32 || iQ11 >= 58) {
                                switch (iQ11) {
                                    case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                                        c10 = '*';
                                        break;
                                    case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                                        c10 = ',';
                                        break;
                                    case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                                        c10 = '-';
                                        break;
                                    case 61:
                                        c10 = '.';
                                        break;
                                    case 62:
                                        c10 = '/';
                                        break;
                                    default:
                                        throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(iQ11)));
                                }
                                gVar2 = new xj.g(c10, i40 + 6);
                            } else {
                                gVar2 = new xj.g((char) (iQ11 + 33), i40 + 6);
                            }
                        } else {
                            gVar2 = new xj.g((char) (iQ10 + 43), i40 + 5);
                        }
                        gVar3 = gVar2;
                    }
                    int i41 = gVar3.f14999e;
                    eVar.f3485b = i41;
                    char c12 = gVar3.f22956i;
                    if (c12 == '$') {
                        i0Var = new i0(new xj.h(i41, sb2.toString()), true, 13);
                    } else {
                        sb2.append(c12);
                    }
                } else {
                    int i42 = eVar.f3485b;
                    int i43 = i42 + 3;
                    if (i43 <= aVar.f15838e) {
                        while (true) {
                            if (i42 >= i43) {
                                eVar.f3485b += 3;
                                eVar.f3486c = 1;
                            } else if (!aVar.a(i42)) {
                                i42++;
                            } else if (W(eVar.f3485b)) {
                                i14 = eVar.f3485b;
                                if (i14 + 5 < i39) {
                                    eVar.f3485b = i14 + 5;
                                } else {
                                    eVar.f3485b = i39;
                                }
                                eVar.f3486c = 3;
                            }
                        }
                    } else if (W(eVar.f3485b)) {
                        i14 = eVar.f3485b;
                        if (i14 + 5 < i39) {
                            eVar.f3485b = i14 + 5;
                        } else {
                            eVar.f3485b = i39;
                        }
                        eVar.f3486c = 3;
                    }
                    i0Var = new i0(null, false, 13);
                }
            }
            z10 = i0Var.f214e;
            z7 = false;
            z5 = true;
            i13 = eVar.f3485b;
            if (i15 != i13) {
                z11 = z5;
            } else {
                z11 = z7;
            }
            if (!z11) {
            }
            xj.h hVar2 = (xj.h) i0Var.f215i;
            if (hVar2 == null) {
            }
        } while (!z10);
        xj.h hVar3 = (xj.h) i0Var.f215i;
        if (hVar3 == null) {
        }
    }

    public void N(String str) {
        switch (this.f16509d) {
            case 11:
                R(0L, str);
                break;
            default:
                R(0L, str);
                break;
        }
    }

    public void O(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f16510e;
        ti.f fVar = new ti.f(byteArrayOutputStream, map, (HashMap) this.f16512v, (qi.d) this.f16511i);
        qi.d dVar = (qi.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new qi.b("No encoder for " + obj.getClass());
        }
    }

    public void P(Object obj, Object value) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f16511i;
        Intrinsics.checkNotNullParameter(value, "value");
        linkedHashMap.put(tag, value);
    }

    public void R(long j, String str) {
        switch (this.f16509d) {
            case 11:
                Bundle bundle = (Bundle) this.f16512v;
                String str2 = (String) this.f16510e;
                v3.f fVar = (v3.f) this.f16511i;
                fVar.f21402a.put(str2.concat(str), Long.valueOf(bundle.getLong(str, j)));
                break;
            default:
                String str3 = (String) this.f16510e;
                v3.g gVar = (v3.g) this.f16512v;
                Object obj = gVar.f21405a.get(str3.concat(str));
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                }
                ((Bundle) this.f16511i).putLong(str, j);
                break;
        }
    }

    public void S(String str) {
        switch (this.f16509d) {
            case 11:
                String string = ((Bundle) this.f16512v).getString(str);
                if (string != null) {
                    ((v3.f) this.f16511i).f21402a.put(((String) this.f16510e).concat(str), string);
                    break;
                }
                break;
            default:
                String str2 = (String) this.f16510e;
                Object obj = ((v3.g) this.f16512v).f21405a.get(str2.concat(str));
                ((Bundle) this.f16511i).putString(str, obj instanceof String ? (String) obj : null);
                break;
        }
    }

    public String T(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return a0(descriptor.h(i7));
    }

    public File U(Context context, String str) {
        ((kh.f) this.f16512v).getClass();
        return new File(context.getDir("lib", 0), kh.f.h(str));
    }

    public boolean V() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f16511i;
        if (((String) this.f16510e) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f16510e = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f16512v).readLine();
                this.f16510e = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f16510e = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public boolean W(int i7) {
        int i10;
        int i11 = i7 + 1;
        mj.a aVar = (mj.a) this.f16510e;
        if (i11 > aVar.f15838e) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i10 = i12 + i7) < aVar.f15838e; i12++) {
            if (i12 == 2) {
                if (!aVar.a(i7 + 2)) {
                    return false;
                }
            } else if (aVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public void X(Context context, String str) throws Throwable {
        String[] strArrI;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        kh.f fVar = (kh.f) this.f16512v;
        HashSet hashSet = (HashSet) this.f16510e;
        if (hashSet.contains(str)) {
            Y("%s already loaded previously!", str);
            return;
        }
        io.sentry.internal.debugmeta.c cVar = null;
        try {
            fVar.getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            Y("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e10) {
            Y("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            Y("%s (%s) was not loaded normally, re-linking...", str, null);
            File fileU = U(context, str);
            if (!fileU.exists()) {
                File dir = context.getDir("lib", 0);
                File fileU2 = U(context, str);
                fVar.getClass();
                File[] fileArrListFiles = dir.listFiles(new ob.a(kh.f.h(str), 0));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileU2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                k8.a aVar = (k8.a) this.f16511i;
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str2 = Build.CPU_ABI2;
                    strArr = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                }
                String strH = kh.f.h(str);
                aVar.getClass();
                try {
                    io.sentry.internal.debugmeta.c cVarF = k8.a.f(context, strArr, strH);
                    try {
                        if (cVarF == null) {
                            try {
                                strArrI = k8.a.i(context, strH);
                            } catch (Exception e11) {
                                strArrI = new String[]{e11.toString()};
                            }
                            StringBuilder sbN = com.discord.chat.presentation.list.a.n("Could not find '", strH, "'. Looked for: ");
                            sbN.append(Arrays.toString(strArr));
                            sbN.append(", but only found: ");
                            throw new d1(com.discord.chat.presentation.list.a.k(sbN, Arrays.toString(strArrI), "."));
                        }
                        ZipFile zipFile = (ZipFile) cVarF.f12759e;
                        int i7 = 0;
                        while (true) {
                            int i10 = i7 + 1;
                            if (i7 >= 5) {
                                break;
                            }
                            Y("Found %s! Extracting...", strH);
                            try {
                                if (fileU.exists() || fileU.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream((ZipEntry) cVarF.f12760i);
                                        try {
                                            fileOutputStream2 = new FileOutputStream(fileU);
                                            try {
                                                byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
                                                long j = 0;
                                                while (true) {
                                                    int i11 = inputStream2.read(bArr);
                                                    if (i11 == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream2.write(bArr, 0, i11);
                                                    j += (long) i11;
                                                    inputStream2 = inputStream2;
                                                }
                                                fileOutputStream2.flush();
                                                try {
                                                    fileOutputStream2.getFD().sync();
                                                    if (j == fileU.length()) {
                                                        k8.a.e(inputStream2);
                                                        k8.a.e(fileOutputStream2);
                                                        fileU.setReadable(true, false);
                                                        fileU.setExecutable(true, false);
                                                        fileU.setWritable(true);
                                                        break;
                                                    }
                                                } catch (FileNotFoundException | IOException unused) {
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    k8.a.e(inputStream);
                                                    k8.a.e(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused2) {
                                                inputStream2 = inputStream2;
                                            } catch (IOException unused3) {
                                                inputStream2 = inputStream2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                            }
                                        } catch (FileNotFoundException unused4) {
                                            fileOutputStream2 = null;
                                            k8.a.e(inputStream2);
                                            k8.a.e(fileOutputStream2);
                                            i7 = i10;
                                        } catch (IOException unused5) {
                                            fileOutputStream2 = null;
                                            k8.a.e(inputStream2);
                                            k8.a.e(fileOutputStream2);
                                            i7 = i10;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                            fileOutputStream = null;
                                            k8.a.e(inputStream);
                                            k8.a.e(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused6) {
                                        inputStream2 = null;
                                    } catch (IOException unused7) {
                                        inputStream2 = null;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStream = null;
                                    }
                                    k8.a.e(inputStream2);
                                    k8.a.e(fileOutputStream2);
                                }
                            } catch (IOException unused8) {
                            }
                            i7 = i10;
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused9) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        cVar = cVarF;
                        if (cVar != null) {
                            try {
                                ((ZipFile) cVar.f12759e).close();
                            } catch (IOException unused10) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            String absolutePath = fileU.getAbsolutePath();
            fVar.getClass();
            System.load(absolutePath);
            hashSet.add(str);
            Y("%s (%s) was re-linked!", str, null);
        }
    }

    public boolean Z(int i7, ConstraintWidget constraintWidget, s0.c cVar) {
        s0.b bVar = (s0.b) this.f16512v;
        int[] iArr = constraintWidget.f1262o0;
        int[] iArr2 = constraintWidget.f1266s;
        bVar.f19653a = iArr[0];
        bVar.f19654b = iArr[1];
        bVar.f19655c = constraintWidget.n();
        bVar.f19656d = constraintWidget.k();
        bVar.f19661i = false;
        bVar.j = i7;
        boolean z5 = bVar.f19653a == 3;
        boolean z6 = bVar.f19654b == 3;
        boolean z7 = z5 && constraintWidget.V > 0.0f;
        boolean z10 = z6 && constraintWidget.V > 0.0f;
        if (z7 && iArr2[0] == 4) {
            bVar.f19653a = 1;
        }
        if (z10 && iArr2[1] == 4) {
            bVar.f19654b = 1;
        }
        ((ConstraintLayout.Measurer) cVar).b(constraintWidget, bVar);
        constraintWidget.J(bVar.f19657e);
        constraintWidget.G(bVar.f19658f);
        constraintWidget.D = bVar.f19660h;
        constraintWidget.D(bVar.f19659g);
        bVar.j = 0;
        return bVar.f19661i;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void a() {
        String tag = (String) c0();
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public String a0(String childName) {
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) CollectionsKt.S((ArrayList) this.f16510e);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + '.' + childName;
    }

    @Override // zc.z
    public void b(b0 b0Var, m mVar, d0 d0Var) {
        this.f16512v = b0Var;
        d0Var.a();
        d0Var.b();
        x xVarX = mVar.x(d0Var.f23691d, 5);
        this.f16511i = xVarX;
        xVarX.e((Format) this.f16510e);
    }

    public String b0() {
        if (!V()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f16510e;
        this.f16510e = null;
        return str;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // zc.z
    public void c(w wVar) {
        long jC;
        long j;
        je.b.l((b0) this.f16512v);
        int i7 = e0.f13788a;
        b0 b0Var = (b0) this.f16512v;
        synchronized (b0Var) {
            try {
                long j5 = b0Var.f13769c;
                jC = j5 != -9223372036854775807L ? j5 + b0Var.f13768b : b0Var.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b0 b0Var2 = (b0) this.f16512v;
        synchronized (b0Var2) {
            j = b0Var2.f13768b;
        }
        if (jC == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        Format format = (Format) this.f16510e;
        if (j != format.M) {
            g0 g0VarA = format.a();
            g0VarA.f9647o = j;
            Format format2 = new Format(g0VarA);
            this.f16510e = format2;
            ((x) this.f16511i).e(format2);
        }
        int iA = wVar.a();
        ((x) this.f16511i).d(iA, wVar);
        ((x) this.f16511i).c(jC, 1, iA, 0, null);
    }

    public Object c0() {
        ArrayList arrayList = (ArrayList) this.f16510e;
        if (arrayList.isEmpty()) {
            throw new kr.g("No tag in stack for requested element");
        }
        return arrayList.remove(kotlin.collections.d0.f(arrayList));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void d(i1 descriptor, int i7, byte b10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P(T(descriptor, i7), Byte.valueOf(b10));
    }

    public synchronized void d0(pa.g gVar) {
        try {
            pa.g gVar2 = gVar.f17815a;
            pa.g gVar3 = gVar.f17818d;
            if (gVar2 != null) {
                gVar2.f17818d = gVar3;
            }
            if (gVar3 != null) {
                gVar3.f17815a = gVar2;
            }
            gVar.f17815a = null;
            gVar.f17818d = null;
            if (gVar == ((pa.g) this.f16512v)) {
                this.f16512v = gVar3;
            }
            if (gVar == ((pa.g) this.f16511i)) {
                this.f16511i = gVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(double d6) {
        P(c0(), Double.valueOf(d6));
    }

    public boolean e0(int i7, int i10, int i11, int i12) {
        if (i7 < 0) {
            i7 += i11;
            i10 += 4 - ((i11 + 4) & 7);
        }
        if (i10 < 0) {
            i10 += i12;
            i7 += 4 - ((i12 + 4) & 7);
        }
        ((mj.b) this.f16512v).f(i10, i7);
        return ((mj.b) this.f16510e).b(i10, i7);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!((ArrayList) this.f16510e).isEmpty()) {
            c0();
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void f(short s2) {
        P(c0(), Short.valueOf(s2));
    }

    public int f0(int i7, int i10, int i11, int i12) {
        int i13 = i7 - 2;
        int i14 = i10 - 2;
        int i15 = (e0(i13, i14, i11, i12) ? 1 : 0) << 1;
        int i16 = i10 - 1;
        if (e0(i13, i16, i11, i12)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i7 - 1;
        if (e0(i18, i14, i11, i12)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (e0(i18, i16, i11, i12)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (e0(i18, i10, i11, i12)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (e0(i7, i14, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (e0(i7, i16, i11, i12)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        return e0(i7, i10, i11, i12) ? i23 | 1 : i23;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void g(SerialDescriptor descriptor, int i7, KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        ((ArrayList) this.f16510e).add(T(descriptor, i7));
        y(serializer, obj);
    }

    public void g0(Object obj) {
        long jA = x.c.a();
        if (jA == x.e.f22495a) {
            this.f16511i = obj;
            return;
        }
        synchronized (this.f16512v) {
            x.d dVar = (x.d) ((AtomicReference) this.f16510e).get();
            int iA = dVar.a(jA);
            if (iA >= 0) {
                dVar.f22494c[iA] = obj;
            } else {
                ((AtomicReference) this.f16510e).set(dVar.b(jA, obj));
                Unit unit = Unit.f14616a;
            }
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f16509d) {
            case 18:
                return new p(new q8.c(), new s(), (ac.d) ((e9.b) this.f16510e).get(), (k) ((b4) this.f16512v).get(), (r) ((e4.i) this.f16511i).get());
            default:
                long jA = x.c.a();
                if (jA == x.e.f22495a) {
                    return this.f16511i;
                }
                x.d dVar = (x.d) ((AtomicReference) this.f16510e).get();
                int iA = dVar.a(jA);
                if (iA >= 0) {
                    return dVar.f22494c[iA];
                }
                return null;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public SerializersModule getSerializersModule() {
        return (SerializersModule) this.f16512v;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(byte b10) {
        P(c0(), Byte.valueOf(b10));
    }

    public void h0(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f16510e = str;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void i(boolean z5) {
        P(c0(), Boolean.valueOf(z5));
    }

    public void i0(ConstraintWidgetContainer constraintWidgetContainer, int i7, int i10, int i11) {
        int i12 = constraintWidgetContainer.a0;
        int i13 = constraintWidgetContainer.f1239b0;
        constraintWidgetContainer.a0 = 0;
        constraintWidgetContainer.f1239b0 = 0;
        constraintWidgetContainer.J(i10);
        constraintWidgetContainer.G(i11);
        if (i12 < 0) {
            constraintWidgetContainer.a0 = 0;
        } else {
            constraintWidgetContainer.a0 = i12;
        }
        if (i13 < 0) {
            constraintWidgetContainer.f1239b0 = 0;
        } else {
            constraintWidgetContainer.f1239b0 = i13;
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) this.f16511i;
        constraintWidgetContainer2.f1277s0 = i7;
        constraintWidgetContainer2.P();
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void j(SerialDescriptor descriptor, int i7, float f2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P(T(descriptor, i7), Float.valueOf(f2));
    }

    public Bundle j0() {
        Bundle bundle = new Bundle();
        Integer num = (Integer) this.f16510e;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = (Integer) this.f16512v;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = (Integer) this.f16511i;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        return bundle;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void k(i1 descriptor, int i7, char c8) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P(T(descriptor, i7), Character.valueOf(c8));
    }

    public void k0(ConstraintWidgetContainer constraintWidgetContainer) {
        ArrayList arrayList = (ArrayList) this.f16510e;
        arrayList.clear();
        int size = constraintWidgetContainer.f1274p0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) constraintWidgetContainer.f1274p0.get(i7);
            int[] iArr = constraintWidget.f1262o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(constraintWidget);
            }
        }
        constraintWidgetContainer.f1276r0.f19664b = true;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void l(int i7, int i10, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P(T(descriptor, i7), Integer.valueOf(i10));
    }

    public void l0(MenuItem menuItem, vm.k tabsScreen) {
        eh.e eVar;
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        vm.g gVar = (vm.g) this.f16511i;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        if (!Intrinsics.areEqual(menuItem.getTitle(), tabsScreen.getTabTitle())) {
            menuItem.setTitle(tabsScreen.getTabTitle());
        }
        if (!Intrinsics.areEqual(menuItem.getIcon(), tabsScreen.getIcon())) {
            menuItem.setIcon(tabsScreen.getIcon());
        }
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        qg.e eVar2 = gVar.f21771b;
        Menu menu = eVar2.getMenu();
        qg.b bVar = eVar2.f8272e;
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        int iL = xq.r.l(new androidx.core.view.o(menu), menuItem);
        String badgeValue = tabsScreen.getBadgeValue();
        if (badgeValue == null) {
            ng.a aVar = (ng.a) bVar.S.get(iL);
            if (aVar != null) {
                ng.c cVar = aVar.f16809w;
                ng.b bVar2 = cVar.f16820a;
                Boolean bool = Boolean.FALSE;
                bVar2.Q = bool;
                cVar.f16821b.Q = bool;
                aVar.setVisible(bool.booleanValue(), false);
                return;
            }
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull(badgeValue);
        bVar.getClass();
        if (iL == -1) {
            throw new IllegalArgumentException(iL + " is not a valid view id");
        }
        SparseArray sparseArray = bVar.S;
        ng.a aVar2 = (ng.a) sparseArray.get(iL);
        if (aVar2 == null) {
            ng.a aVar3 = new ng.a(bVar.getContext(), null);
            sparseArray.put(iL, aVar3);
            aVar2 = aVar3;
        }
        ng.c cVar2 = aVar2.f16809w;
        if (iL == -1) {
            throw new IllegalArgumentException(iL + " is not a valid view id");
        }
        eh.h[] hVarArr = bVar.f8259y;
        if (hVarArr == null) {
            eVar = null;
            break;
        }
        int length = hVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                eVar = null;
                break;
            }
            eh.h hVar = hVarArr[i7];
            if (hVar instanceof eh.e) {
                eVar = (eh.e) hVar;
                if (eVar.getId() == iL) {
                    break;
                }
            }
            i7++;
        }
        if (eVar != null) {
            eVar.setBadge(aVar2);
        }
        Intrinsics.checkNotNullExpressionValue(aVar2, "getOrCreateBadge(...)");
        ng.b bVar3 = cVar2.f16820a;
        Boolean bool2 = Boolean.TRUE;
        bVar3.Q = bool2;
        cVar2.f16821b.Q = bool2;
        aVar2.setVisible(bool2.booleanValue(), false);
        boolean zA = cVar2.a();
        ng.b bVar4 = cVar2.f16821b;
        ng.b bVar5 = cVar2.f16820a;
        if (zA) {
            bVar5.G = null;
            bVar4.G = null;
            aVar2.h();
        }
        if (bVar4.H != -1) {
            bVar5.H = -1;
            bVar4.H = -1;
            if (!cVar2.a()) {
                aVar2.h();
            }
        }
        if (intOrNull != null) {
            int iMax = Math.max(0, intOrNull.intValue());
            if (bVar4.H != iMax) {
                bVar5.H = iMax;
                bVar4.H = iMax;
                if (!cVar2.a()) {
                    aVar2.h();
                }
            }
        } else if (!Intrinsics.areEqual(badgeValue, "") && !TextUtils.equals(bVar4.G, badgeValue)) {
            bVar5.G = badgeValue;
            bVar4.G = badgeValue;
            aVar2.h();
        }
        Integer tabBarItemBadgeTextColor = tabsScreen.getTabBarItemBadgeTextColor();
        int iIntValue = tabBarItemBadgeTextColor != null ? tabBarItemBadgeTextColor.intValue() : gVar.a(R.attr.colorOnError);
        if (aVar2.f16807i.f3285a.getColor() != iIntValue) {
            bVar5.f16815i = Integer.valueOf(iIntValue);
            bVar4.f16815i = Integer.valueOf(iIntValue);
            aVar2.j();
        }
        Integer tabBarItemBadgeBackgroundColor = tabsScreen.getTabBarItemBadgeBackgroundColor();
        int iIntValue2 = tabBarItemBadgeBackgroundColor != null ? tabBarItemBadgeBackgroundColor.intValue() : gVar.a(R.attr.colorError);
        bVar5.f16814e = Integer.valueOf(iIntValue2);
        bVar4.f16814e = Integer.valueOf(iIntValue2);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(cVar2.f16821b.f16814e.intValue());
        kh.i iVar = aVar2.f16806e;
        if (iVar.f14483e.f14466d != colorStateListValueOf) {
            iVar.q(colorStateListValueOf);
            aVar2.invalidateSelf();
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(float f2) {
        P(c0(), Float.valueOf(f2));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x023d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0260  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    public void m0(vm.e tabsHost) {
        int i7;
        int iIntValue;
        Integer intOrNull;
        float dimension;
        float dimension2;
        Intrinsics.checkNotNullParameter(tabsHost, "tabsHost");
        vm.g gVar = (vm.g) this.f16511i;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(tabsHost, "tabsHost");
        qg.e eVar = gVar.f21771b;
        eVar.setVisibility(!tabsHost.getTabBarHidden() ? 0 : 8);
        Integer tabBarBackgroundColor = tabsHost.getTabBarBackgroundColor();
        eVar.setBackgroundColor(tabBarBackgroundColor != null ? tabBarBackgroundColor.intValue() : gVar.a(R.attr.colorSurfaceContainer));
        int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
        Integer tabBarItemTitleFontColor = tabsHost.getTabBarItemTitleFontColor();
        int iIntValue2 = tabBarItemTitleFontColor != null ? tabBarItemTitleFontColor.intValue() : gVar.a(R.attr.colorOnSurfaceVariant);
        Integer tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColorActive();
        eVar.setItemTextColor(new ColorStateList(iArr, new int[]{iIntValue2, (tabBarItemTitleFontColorActive == null && (tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColor()) == null) ? gVar.a(R.attr.colorSecondary) : tabBarItemTitleFontColorActive.intValue()}));
        Integer tabBarItemIconColor = tabsHost.getTabBarItemIconColor();
        int iIntValue3 = tabBarItemIconColor != null ? tabBarItemIconColor.intValue() : gVar.a(R.attr.colorOnSurfaceVariant);
        Integer tabBarItemIconColorActive = tabsHost.getTabBarItemIconColorActive();
        eVar.setItemIconTintList(new ColorStateList(iArr, new int[]{iIntValue3, (tabBarItemIconColorActive == null && (tabBarItemIconColorActive = tabsHost.getTabBarItemIconColor()) == null) ? gVar.a(R.attr.colorOnSecondaryContainer) : tabBarItemIconColorActive.intValue()}));
        String tabBarItemLabelVisibilityMode = tabsHost.getTabBarItemLabelVisibilityMode();
        if (tabBarItemLabelVisibilityMode == null) {
            i7 = -1;
        } else {
            int iHashCode = tabBarItemLabelVisibilityMode.hashCode();
            if (iHashCode != -63201645) {
                if (iHashCode != 1191572123) {
                    if (iHashCode == 1648599514 && tabBarItemLabelVisibilityMode.equals("unlabeled")) {
                        i7 = 2;
                    } else {
                        i7 = -1;
                    }
                } else if (tabBarItemLabelVisibilityMode.equals("selected")) {
                    i7 = 0;
                } else {
                    i7 = -1;
                }
            } else if (tabBarItemLabelVisibilityMode.equals("labeled")) {
                i7 = 1;
            } else {
                i7 = -1;
            }
        }
        eVar.setLabelVisibilityMode(i7);
        Integer tabBarItemRippleColor = tabsHost.getTabBarItemRippleColor();
        eVar.setItemRippleColor(ColorStateList.valueOf(tabBarItemRippleColor != null ? tabBarItemRippleColor.intValue() : gVar.a(R.attr.itemRippleColor)));
        Integer tabBarItemActiveIndicatorColor = tabsHost.getTabBarItemActiveIndicatorColor();
        int iIntValue4 = tabBarItemActiveIndicatorColor != null ? tabBarItemActiveIndicatorColor.intValue() : gVar.a(R.attr.colorSecondaryContainer);
        eVar.setItemActiveIndicatorEnabled(((Boolean) tabsHost.N.getValue(tabsHost, vm.e.f21756f0[2])).booleanValue());
        eVar.setItemActiveIndicatorColor(ColorStateList.valueOf(iIntValue4));
        qg.e eVar2 = (qg.e) this.f16510e;
        Menu menu = eVar2.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        int size = menu.size();
        ArrayList arrayList = (ArrayList) this.f16512v;
        if (size != arrayList.size()) {
            eVar2.getMenu().clear();
        }
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            n nVar = (n) obj;
            Menu menu2 = eVar2.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu2, "getMenu(...)");
            vm.k kVar = nVar.f21781d;
            MenuItem menuItemFindItem = menu2.findItem(i10);
            if (menuItemFindItem == null) {
                menuItemFindItem = menu2.add(0, i10, 0, kVar.getTabTitle());
                Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "add(...)");
            }
            if (menuItemFindItem.getItemId() != i10) {
                throw new IllegalStateException("[RNScreens] Illegal state: menu items are shuffled");
            }
            l0(menuItemFindItem, nVar.f21781d);
            i10 = i11;
        }
        ContextThemeWrapper contextThemeWrapper = gVar.f21770a;
        Intrinsics.checkNotNullParameter(tabsHost, "tabsHost");
        View childAt = eVar.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        Iterator it = new x0((ViewGroup) childAt).iterator();
        while (true) {
            y0 y0Var = (y0) it;
            if (!y0Var.hasNext()) {
                return;
            }
            View view = (View) y0Var.next();
            TextView textView = (TextView) view.findViewById(R.id.navigation_bar_item_large_label_view);
            TextView textView2 = (TextView) view.findViewById(R.id.navigation_bar_item_small_label_view);
            boolean zAreEqual = Intrinsics.areEqual(tabsHost.getTabBarItemTitleFontStyle(), Fonts.Font.STYLE_ITALIC);
            if (Intrinsics.areEqual(tabsHost.getTabBarItemTitleFontWeight(), "bold")) {
                iIntValue = ReactFontManager.TypefaceStyle.BOLD;
            } else {
                String tabBarItemTitleFontWeight = tabsHost.getTabBarItemTitleFontWeight();
                iIntValue = (tabBarItemTitleFontWeight == null || (intOrNull = StringsKt.toIntOrNull(tabBarItemTitleFontWeight)) == null) ? ReactFontManager.TypefaceStyle.NORMAL : intOrNull.intValue();
            }
            ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
            String tabBarItemTitleFontFamily = tabsHost.getTabBarItemTitleFontFamily();
            if (tabBarItemTitleFontFamily == null) {
                tabBarItemTitleFontFamily = "";
            }
            Typeface typeface = companion.getTypeface(tabBarItemTitleFontFamily, iIntValue, zAreEqual, contextThemeWrapper.getAssets());
            Float tabBarItemTitleFontSize = tabsHost.getTabBarItemTitleFontSize();
            if (tabBarItemTitleFontSize == null) {
                dimension = contextThemeWrapper.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
            } else {
                if (tabBarItemTitleFontSize.floatValue() <= 0.0f) {
                    tabBarItemTitleFontSize = null;
                }
                if (tabBarItemTitleFontSize != null) {
                    dimension = PixelUtil.toPixelFromSP$default(tabBarItemTitleFontSize.floatValue(), 0.0f, 2, null);
                } else {
                    dimension = contextThemeWrapper.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
                }
            }
            Float tabBarItemTitleFontSizeActive = tabsHost.getTabBarItemTitleFontSizeActive();
            if (tabBarItemTitleFontSizeActive == null) {
                dimension2 = contextThemeWrapper.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
            } else {
                if (tabBarItemTitleFontSizeActive.floatValue() <= 0.0f) {
                    tabBarItemTitleFontSizeActive = null;
                }
                if (tabBarItemTitleFontSizeActive != null) {
                    dimension2 = PixelUtil.toPixelFromSP$default(tabBarItemTitleFontSizeActive.floatValue(), 0.0f, 2, null);
                } else {
                    dimension2 = contextThemeWrapper.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
                }
            }
            textView2.setTextSize(0, dimension);
            textView2.setTypeface(typeface);
            textView.setTextSize(0, dimension2);
            textView.setTypeface(typeface);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n(char c8) {
        P(c0(), Character.valueOf(c8));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o() {
        CollectionsKt.Q((ArrayList) this.f16510e);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Rpc rpc = (Rpc) this.f16512v;
        String str = (String) this.f16510e;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f16511i;
        synchronized (rpc.f5922a) {
            rpc.f5922a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void p(SerialDescriptor descriptor, int i7, boolean z5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P(T(descriptor, i7), Boolean.valueOf(z5));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void q(SerialDescriptor descriptor, int i7, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        String strT = T(descriptor, i7);
        Intrinsics.checkNotNullParameter(value, "value");
        P(strT, value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void r(SerialDescriptor descriptor, int i7, KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        ((ArrayList) this.f16510e).add(T(descriptor, i7));
        e4.f.x(this, serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder s(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        beginStructure(descriptor);
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void t(SerialDescriptor enumDescriptor, int i7) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        String tag = (String) c0();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f16511i;
        String value = enumDescriptor.h(i7);
        Intrinsics.checkNotNullParameter(value, "value");
        linkedHashMap.put(tag, value);
    }

    public String toString() {
        switch (this.f16509d) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f16510e);
                sb2.append('{');
                f fVar = (f) ((f) this.f16511i).f16511i;
                String str = "";
                while (fVar != null) {
                    Object obj = fVar.f16512v;
                    sb2.append(str);
                    String str2 = (String) fVar.f16510e;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    fVar = (f) fVar.f16511i;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public boolean u(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void v(int i7) {
        P(c0(), Integer.valueOf(i7));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder w(SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "descriptor");
        Object objC0 = c0();
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        ((ArrayList) this.f16510e).add(objC0);
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public Encoder x(i1 descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strT = T(descriptor, i7);
        SerialDescriptor inlineDescriptor = descriptor.j(i7);
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        ((ArrayList) this.f16510e).add(strT);
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y(KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (!(serializer instanceof or.b)) {
            serializer.serialize(this, obj);
            return;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
        KSerializer kSerializerZ = m3.m.z((or.b) serializer, this, obj);
        String strA0 = a0("type");
        String value = kSerializerZ.getDescriptor().d();
        Intrinsics.checkNotNullParameter(value, "value");
        P(strA0, value);
        kSerializerZ.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void z(i1 descriptor, int i7, short s2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        P(T(descriptor, i7), Short.valueOf(s2));
    }

    public /* synthetic */ f(Rpc rpc, String str, ScheduledFuture scheduledFuture) {
        this.f16509d = 22;
        this.f16512v = rpc;
        this.f16510e = str;
        this.f16511i = scheduledFuture;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i7) {
        this.f16509d = i7;
        this.f16510e = obj;
        this.f16512v = obj2;
        this.f16511i = obj3;
    }

    public /* synthetic */ f(String str, v3.g gVar) {
        this.f16509d = 12;
        this.f16511i = new Bundle();
        this.f16510e = str;
        this.f16512v = gVar;
    }

    public f(ContextThemeWrapper context, qg.e bottomNavigationView, ArrayList tabsScreenFragments) {
        this.f16509d = 19;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(tabsScreenFragments, "tabsScreenFragments");
        this.f16510e = bottomNavigationView;
        this.f16512v = tabsScreenFragments;
        this.f16511i = new vm.g(context, bottomNavigationView);
    }

    public f(List list) {
        this.f16509d = 2;
        this.f16511i = list;
        this.f16510e = new ArrayList(list.size());
        this.f16512v = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((ArrayList) this.f16510e).add(new o4.n((List) ((s4.f) list.get(i7)).f19743b.f9357e));
            ((ArrayList) this.f16512v).add(((s4.f) list.get(i7)).f19744c.l0());
        }
    }

    public f(mj.b bVar) throws ij.d {
        int i7;
        int i10;
        this.f16509d = 7;
        int i11 = bVar.f15840e;
        if (i11 >= 8 && i11 <= 144 && (i7 = i11 & 1) == 0) {
            int i12 = bVar.f15839d;
            qj.b[] bVarArr = qj.b.f18906h;
            if (i7 == 0 && (i12 & 1) == 0) {
                qj.b[] bVarArr2 = qj.b.f18906h;
                for (int i13 = 0; i13 < 30; i13++) {
                    qj.b bVar2 = bVarArr2[i13];
                    int i14 = bVar2.f18908b;
                    if (i14 == i11 && (i10 = bVar2.f18909c) == i12) {
                        this.f16511i = bVar2;
                        if (i11 == i14) {
                            int i15 = bVar2.f18910d;
                            int i16 = bVar2.f18911e;
                            int i17 = i14 / i15;
                            int i18 = i10 / i16;
                            mj.b bVar3 = new mj.b(i18 * i16, i17 * i15);
                            for (int i19 = 0; i19 < i17; i19++) {
                                int i20 = i19 * i15;
                                for (int i21 = 0; i21 < i18; i21++) {
                                    int i22 = i21 * i16;
                                    for (int i23 = 0; i23 < i15; i23++) {
                                        int i24 = ((i15 + 2) * i19) + 1 + i23;
                                        int i25 = i20 + i23;
                                        for (int i26 = 0; i26 < i16; i26++) {
                                            if (bVar.b(((i16 + 2) * i21) + 1 + i26, i24)) {
                                                bVar3.f(i22 + i26, i25);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f16510e = bVar3;
                            this.f16512v = new mj.b(bVar3.f15839d, bVar3.f15840e);
                            return;
                        }
                        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                    }
                }
                throw ij.d.a();
            }
            throw ij.d.a();
        }
        throw ij.d.a();
    }

    public f(Class workerClass) {
        this.f16509d = 16;
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        this.f16510e = uuidRandomUUID;
        String id2 = ((UUID) this.f16510e).toString();
        Intrinsics.checkNotNullExpressionValue(id2, "id.toString()");
        String workerClassName_ = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(workerClassName_, "workerClass.name");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
        this.f16512v = new o(id2, (v3.z) null, workerClassName_, (String) null, (v3.g) null, (v3.g) null, 0L, 0L, 0L, (v3.e) null, 0, (v3.a) null, 0L, 0L, 0L, 0L, false, (y) null, 0, 0L, 0, 0, 8388602);
        String name = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
        String[] elements = {name};
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(v0.a(1));
        kotlin.collections.y.F(elements, linkedHashSet);
        this.f16511i = linkedHashSet;
    }

    public f(int i7) {
        this.f16509d = i7;
        switch (i7) {
            case 5:
                this.f16510e = new SparseArray();
                break;
            case 13:
                this.f16510e = new ArrayList();
                break;
            case 23:
                this.f16510e = new AtomicReference(x.c.f22491a);
                this.f16512v = new Object();
                break;
            default:
                kh.f fVar = new kh.f(13);
                k8.a aVar = new k8.a();
                this.f16510e = new HashSet();
                this.f16512v = fVar;
                this.f16511i = aVar;
                break;
        }
    }

    public f(mj.a aVar) {
        this.f16509d = 24;
        c5.e eVar = new c5.e(9);
        eVar.f3485b = 0;
        eVar.f3486c = 1;
        this.f16512v = eVar;
        this.f16511i = new StringBuilder();
        this.f16510e = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(sr.a aVar) {
        this(13);
        this.f16509d = 13;
        this.f16512v = aVar.f20557a;
        this.f16511i = new LinkedHashMap();
    }

    public f(vo.j classifierDescriptor, List arguments, f fVar) {
        this.f16509d = 20;
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f16510e = classifierDescriptor;
        this.f16512v = arguments;
        this.f16511i = fVar;
    }

    public f(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f16509d = 9;
        this.f16510e = new ArrayList();
        this.f16512v = new s0.b();
        this.f16511i = constraintWidgetContainer;
    }

    public f(IntRange argumentRange, List[] unboxParameters, Method method) {
        this.f16509d = 8;
        Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
        Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
        this.f16510e = argumentRange;
        this.f16512v = unboxParameters;
        this.f16511i = method;
    }

    public f(int i7, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f16509d = 27;
        this.f16510e = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f16512v = listUnmodifiableList;
        this.f16511i = bArr;
    }

    public f(List allDependencies, p0 modulesWhoseInternalsAreVisible, n0 directExpectedByDependencies, p0 allExpectedByDependencies) {
        this.f16509d = 25;
        Intrinsics.checkNotNullParameter(allDependencies, "allDependencies");
        Intrinsics.checkNotNullParameter(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(allExpectedByDependencies, "allExpectedByDependencies");
        this.f16510e = allDependencies;
        this.f16512v = modulesWhoseInternalsAreVisible;
        this.f16511i = directExpectedByDependencies;
    }

    public f(String str, int i7) {
        this.f16509d = i7;
        switch (i7) {
            case 26:
                g0 g0Var = new g0();
                g0Var.k = str;
                this.f16510e = new Format(g0Var);
                break;
            default:
                f fVar = new f(0, false);
                this.f16511i = fVar;
                this.f16512v = fVar;
                this.f16510e = str;
                break;
        }
    }

    public f(URL url, ub.i iVar, String str) {
        this.f16509d = 14;
        this.f16512v = url;
        this.f16511i = iVar;
        this.f16510e = str;
    }

    public f(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f16509d = 10;
        this.f16511i = arrayDeque;
        this.f16512v = bufferedReader;
    }
}
