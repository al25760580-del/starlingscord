package a;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.view.h;
import ar.b0;
import ar.g0;
import ar.r;
import ar.u1;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.exoplayer2.metadata.Metadata;
import com.horcrux.svg.SVGLength$UnitType;
import com.horcrux.svg.l0;
import com.horcrux.svg.r0;
import e4.o;
import fr.t;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import je.w;
import jq.v;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.x;
import lq.d0;
import lq.e1;
import lq.q0;
import lq.t0;
import lq.z;
import mi.b;
import mi.i;
import mi.j;
import mi.q;
import n1.p;
import okhttp3.MediaType;
import so.k;
import t1.d;
import up.c;
import up.e;
import up.g;
import vo.e0;
import vo.l;
import wn.f;
import xr.m;
import yo.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object A(t tVar, boolean z5, t tVar2, Function2 function2) throws Throwable {
        Object rVar;
        Object objV;
        try {
            rVar = !(function2 instanceof xn.a) ? f.c(function2, tVar2, tVar) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(tVar2, tVar);
        } catch (g0 e10) {
            Throwable th2 = e10.f2914d;
            tVar.S(new r(th2, false));
            throw th2;
        } catch (Throwable th3) {
            rVar = new r(th3, false);
        }
        wn.a aVar = wn.a.f22354d;
        if (rVar == aVar || (objV = tVar.V(rVar)) == b0.f2890e) {
            return aVar;
        }
        tVar.o0();
        if (!(objV instanceof r)) {
            return b0.z(objV);
        }
        if (!z5) {
            Throwable th4 = ((r) objV).f2958a;
            if ((th4 instanceof u1) && ((u1) th4).f2971d == tVar) {
                if (rVar instanceof r) {
                    throw ((r) rVar).f2958a;
                }
                return rVar;
            }
        }
        throw ((r) objV).f2958a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public static final c B(c cVar, c packageName) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "prefix");
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!Intrinsics.areEqual(cVar, packageName) && !packageName.f21262a.c()) {
            String str = cVar.f21262a.f21265a;
            String str2 = packageName.f21262a.f21265a;
            if (x.o(str, str2, false) && str.charAt(str2.length()) == '.') {
                if (!packageName.f21262a.c()) {
                    if (Intrinsics.areEqual(cVar, packageName)) {
                        return c.f21261c;
                    }
                    String strSubstring = cVar.f21262a.f21265a.substring(packageName.f21262a.f21265a.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return new c(strSubstring);
                }
            }
        } else if (!packageName.f21262a.c()) {
            if (Intrinsics.areEqual(cVar, packageName)) {
                return c.f21261c;
            }
            String strSubstring2 = cVar.f21262a.f21265a.substring(packageName.f21262a.f21265a.length() + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return new c(strSubstring2);
        }
        return cVar;
    }

    public static int C(ReadableArray readableArray, float[] fArr, float f2) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f2;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f2;
        return 6;
    }

    public static final Class D(ClassLoader classLoader, String fqName) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public static final String b(vo.f classDescriptor, np.f typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(classDescriptor, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        typeMappingConfiguration.getClass();
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        l lVarG = classDescriptor.g();
        Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
        e name = classDescriptor.getName();
        if (name != null) {
            e eVar = g.f21273a;
            if (name.f21270e) {
                name = g.f21275c;
            }
        } else {
            name = g.f21275c;
        }
        String strC = name.c();
        Intrinsics.checkNotNullExpressionValue(strC, "getIdentifier(...)");
        if (lVarG instanceof e0) {
            c cVar = ((yo.b0) ((e0) lVarG)).f23420x;
            if (cVar.f21262a.c()) {
                return strC;
            }
            return x.m(cVar.f21262a.f21265a, '.', '/') + '/' + strC;
        }
        vo.f classDescriptor2 = lVarG instanceof vo.f ? (vo.f) lVarG : null;
        if (classDescriptor2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + lVarG + " for " + classDescriptor);
        }
        Intrinsics.checkNotNullParameter(classDescriptor2, "classDescriptor");
        return b(classDescriptor2, typeMappingConfiguration) + '$' + strC;
    }

    public static Handler c(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return h.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean d(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!d(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static void e(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i7 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (mi.g gVar : (Set) it2.next()) {
                        for (i iVar : gVar.f15815a.f15801c) {
                            if (iVar.f15822c == 0) {
                                Set<mi.g> set = (Set) map.get(new mi.h(iVar.f15820a, iVar.f15821b == 2));
                                if (set != null) {
                                    for (mi.g gVar2 : set) {
                                        gVar.f15816b.add(gVar2);
                                        gVar2.f15817c.add(gVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<mi.g> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (mi.g gVar3 : hashSet) {
                    if (gVar3.f15817c.isEmpty()) {
                        hashSet2.add(gVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    mi.g gVar4 = (mi.g) hashSet2.iterator().next();
                    hashSet2.remove(gVar4);
                    i7++;
                    for (mi.g gVar5 : gVar4.f15816b) {
                        gVar5.f15817c.remove(gVar4);
                        if (gVar5.f15817c.isEmpty()) {
                            hashSet2.add(gVar5);
                        }
                    }
                }
                if (i7 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (mi.g gVar6 : hashSet) {
                    if (!gVar6.f15817c.isEmpty() && !gVar6.f15816b.isEmpty()) {
                        arrayList2.add(gVar6.f15815a);
                    }
                }
                throw new j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            b bVar = (b) it.next();
            mi.g gVar7 = new mi.g(bVar);
            for (q qVar : bVar.f15800b) {
                boolean z5 = bVar.f15803e == 0;
                mi.h hVar = new mi.h(qVar, !z5);
                if (!map.containsKey(hVar)) {
                    map.put(hVar, new HashSet());
                }
                Set set2 = (Set) map.get(hVar);
                if (!set2.isEmpty() && z5) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set2.add(gVar7);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double f(double d6, String str, double d7, double d8) {
        double dDoubleValue;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i7 = length - 1;
        if (length == 0 || strTrim.equals("normal")) {
            return 0.0d;
        }
        if (strTrim.codePointAt(i7) == 37) {
            return (Double.valueOf(strTrim.substring(0, i7)).doubleValue() / 100.0d) * d6;
        }
        int i10 = length - 2;
        if (i10 > 0) {
            String strSubstring = strTrim.substring(i10);
            strSubstring.getClass();
            switch (strSubstring) {
                case "cm":
                    d8 = 35.43307d;
                    length = i10;
                    break;
                case "em":
                    length = i10;
                    break;
                case "in":
                    d8 = 90.0d;
                    length = i10;
                    break;
                case "mm":
                    d8 = 3.543307d;
                    length = i10;
                    break;
                case "pc":
                    d8 = 15.0d;
                    length = i10;
                    break;
                case "pt":
                    d8 = 1.25d;
                    length = i10;
                    break;
                case "px":
                    length = i10;
                    d8 = 1.0d;
                    break;
                default:
                    d8 = 1.0d;
                    break;
            }
            dDoubleValue = Double.valueOf(strTrim.substring(0, length)).doubleValue() * d8;
        } else {
            dDoubleValue = Double.valueOf(strTrim).doubleValue();
        }
        return dDoubleValue * d7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double g(r0 r0Var, double d6, double d7, double d8) {
        double d9;
        if (r0Var == null) {
            return 0.0d;
        }
        SVGLength$UnitType sVGLength$UnitType = r0Var.f6787b;
        double d10 = r0Var.f6786a;
        switch (l0.f6748a[sVGLength$UnitType.ordinal()]) {
            case 1:
            case 2:
                d8 = 1.0d;
                d10 *= d8;
                d9 = d10 * d7;
                break;
            case 3:
                d9 = (d10 / 100.0d) * d6;
                break;
            case 4:
                d10 *= d8;
                d9 = d10 * d7;
                break;
            case 5:
                d8 /= 2.0d;
                d10 *= d8;
                d9 = d10 * d7;
                break;
            case 6:
                d8 = 35.43307d;
                d10 *= d8;
                d9 = d10 * d7;
                break;
            case 7:
                d8 = 3.543307d;
                d10 *= d8;
                d9 = d10 * d7;
                break;
            case 8:
                d8 = 90.0d;
                d10 *= d8;
                d9 = d10 * d7;
                break;
            case 9:
                d8 = 1.25d;
                d10 *= d8;
                d9 = d10 * d7;
                break;
            case 10:
                d8 = 15.0d;
                d10 *= d8;
                d9 = d10 * d7;
                break;
            default:
                d9 = d10 * d7;
                break;
        }
        return d9 + 0.0d;
    }

    public static final e4.j h(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return new e4.j(oVar.f7998a, oVar.f8015t);
    }

    public static MediaType i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = MediaType.f17329d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(kk.b.g('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
        Locale US = Locale.US;
        String strP = a3.e.p(US, "US", strGroup, US, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
        Intrinsics.checkNotNullExpressionValue(US, "US");
        Intrinsics.checkNotNullExpressionValue(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = MediaType.f17330e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(s0.g.g(sb2, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (x.o(strGroup4, "'", false) && x.h(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new MediaType(str, strP, (String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final int j(qo.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.a().size();
    }

    public static final int k(Cursor c8, String name) {
        String strA;
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c8.getColumnIndex(name);
        if (columnIndex < 0) {
            columnIndex = c8.getColumnIndex("`" + name + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && name.length() != 0) {
                    String[] columnNames = c8.getColumnNames();
                    Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
                    Intrinsics.checkNotNullParameter(columnNames, "columnNames");
                    Intrinsics.checkNotNullParameter(name, "name");
                    String strConcat = ".".concat(name);
                    String strG = kk.b.g('`', ".", name);
                    int length = columnNames.length;
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            String str = columnNames[i10];
                            int i11 = i7 + 1;
                            if (str.length() < name.length() + 2 || !(x.h(str, strConcat, false) || (str.charAt(0) == '`' && x.h(str, strG, false)))) {
                                i10++;
                                i7 = i11;
                            } else {
                                columnIndex = i7;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c8.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames2, "c.columnNames");
            strA = y.A(columnNames2, null, null, null, null, 63);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strA = "unknown";
        }
        throw new IllegalArgumentException(a3.e.m("column '", name, "' does not exist. Available columns: ", strA));
    }

    public static Drawable l(Context context, TypedArray typedArray, int i7) {
        int resourceId = typedArray.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static i9.b m(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        if (genericDraweeHierarchyBuilder.f4719q == null) {
            genericDraweeHierarchyBuilder.f4719q = new i9.b();
        }
        return genericDraweeHierarchyBuilder.f4719q;
    }

    public static n n(TypedArray typedArray, int i7) {
        switch (typedArray.getInt(i7, -2)) {
            case -1:
                return null;
            case 0:
                return com.facebook.drawee.drawable.o.f4695i;
            case 1:
                return com.facebook.drawee.drawable.o.f4694h;
            case 2:
                return com.facebook.drawee.drawable.o.f4692f;
            case 3:
                return com.facebook.drawee.drawable.o.f4693g;
            case 4:
                return com.facebook.drawee.drawable.o.f4688b;
            case 5:
                return com.facebook.drawee.drawable.o.f4690d;
            case 6:
                return com.facebook.drawee.drawable.o.f4689c;
            case 7:
                return com.facebook.drawee.drawable.o.j;
            case 8:
                return com.facebook.drawee.drawable.o.f4691e;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static String o(String tableName, String triggerType) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    public static void p(int i7, int i10, Intent intent, Executor executor, n1.h callback, CancellationSignal cancellationSignal) {
        p pVar;
        Bundle bundle;
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i11 = d.f20575c;
        if (i7 != i11) {
            Log.w("GetCredentialController", "Returned request code " + i11 + " which  does not match what was given " + i7);
            return;
        }
        t1.a aVar = d.f20573a;
        if (t1.c.b(i10, new ol.c(1), new t1.e(executor, callback), cancellationSignal)) {
            return;
        }
        if (intent == null) {
            t1.c.a(cancellationSignal, new s1.b(executor, callback, 4));
            return;
        }
        Intrinsics.checkNotNullParameter(intent, "intent");
        int i12 = Build.VERSION.SDK_INT;
        o1.l lVarM = null;
        if (i12 >= 34) {
            pVar = a2.a.d(intent);
        } else {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Bundle bundle2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
            if (bundle2 == null) {
                pVar = null;
            } else {
                Intrinsics.checkNotNullParameter(bundle2, "bundle");
                String string = bundle2.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE");
                if (string == null || (bundle = bundle2.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                    pVar = null;
                } else {
                    pVar = new p(mf.f.o(string, bundle));
                }
            }
        }
        if (pVar != null) {
            t1.c.a(cancellationSignal, new com.discord.chat.presentation.list.delegate.c(executor, callback, pVar, 7));
            return;
        }
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i12 >= 34) {
            lVarM = a2.a.c(intent);
        } else {
            Intrinsics.checkNotNullParameter(intent, "intent");
            int i13 = o1.l.f17101e;
            Bundle bundle3 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
            if (bundle3 != null) {
                Intrinsics.checkNotNullParameter(bundle3, "bundle");
                String string2 = bundle3.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                if (string2 == null) {
                    throw new IllegalArgumentException("Bundle was missing exception type.");
                }
                lVarM = com.facebook.imagepipeline.nativecode.c.M(bundle3.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
            }
        }
        t1.c.a(cancellationSignal, new t1.f(executor, callback, lVarM, 0));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0204 A[PHI: r0 r1 r4
      0x0204: PHI (r0v19 boolean) = (r0v14 boolean), (r0v21 boolean) binds: [B:148:0x0228, B:131:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r1v17 boolean) = (r1v12 boolean), (r1v19 boolean) binds: [B:148:0x0228, B:131:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r4v11 boolean) = (r4v6 boolean), (r4v13 boolean) binds: [B:148:0x0228, B:131:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0207 A[PHI: r0 r1 r4
      0x0207: PHI (r0v16 boolean) = (r0v14 boolean), (r0v14 boolean), (r0v21 boolean), (r0v21 boolean) binds: [B:147:0x0226, B:148:0x0228, B:130:0x0200, B:131:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r1v14 boolean) = (r1v12 boolean), (r1v12 boolean), (r1v19 boolean), (r1v19 boolean) binds: [B:147:0x0226, B:148:0x0228, B:130:0x0200, B:131:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r4v8 boolean) = (r4v6 boolean), (r4v6 boolean), (r4v13 boolean), (r4v13 boolean) binds: [B:147:0x0226, B:148:0x0228, B:130:0x0200, B:131:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    public static GenericDraweeHierarchyBuilder q(Context context, AttributeSet attributeSet) throws Throwable {
        float f2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z10;
        int i7;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        Context context2 = context;
        sa.a.w();
        GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(context2.getResources());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, b9.a.f3082a);
            try {
                int integer = 0;
                int i12 = 0;
                boolean z14 = true;
                boolean z15 = true;
                boolean z16 = true;
                boolean z17 = true;
                boolean z18 = true;
                boolean z19 = true;
                boolean z20 = true;
                boolean z21 = true;
                int dimensionPixelSize = 0;
                for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i12 < indexCount; indexCount = i11) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i12);
                        if (index == 0) {
                            genericDraweeHierarchyBuilder.f4714l = n(typedArrayObtainStyledAttributes, index);
                        } else {
                            if (index == 6) {
                                genericDraweeHierarchyBuilder.f4708d = l(context2, typedArrayObtainStyledAttributes, index);
                            } else {
                                i11 = indexCount;
                                if (index == 8) {
                                    Drawable drawableL = l(context2, typedArrayObtainStyledAttributes, index);
                                    if (drawableL == null) {
                                        genericDraweeHierarchyBuilder.f4718p = null;
                                    } else {
                                        StateListDrawable stateListDrawable = new StateListDrawable();
                                        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawableL);
                                        genericDraweeHierarchyBuilder.f4718p = stateListDrawable;
                                    }
                                } else if (index == 10) {
                                    genericDraweeHierarchyBuilder.j = l(context2, typedArrayObtainStyledAttributes, index);
                                } else if (index == 2) {
                                    genericDraweeHierarchyBuilder.f4706b = typedArrayObtainStyledAttributes.getInt(index, 0);
                                } else if (index == 28) {
                                    genericDraweeHierarchyBuilder.f4707c = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                                } else if (index == 7) {
                                    genericDraweeHierarchyBuilder.f4709e = n(typedArrayObtainStyledAttributes, index);
                                } else if (index == 12) {
                                    genericDraweeHierarchyBuilder.f4710f = l(context2, typedArrayObtainStyledAttributes, index);
                                } else if (index == 13) {
                                    genericDraweeHierarchyBuilder.f4711g = n(typedArrayObtainStyledAttributes, index);
                                } else if (index == 3) {
                                    genericDraweeHierarchyBuilder.f4712h = l(context2, typedArrayObtainStyledAttributes, index);
                                } else if (index == 4) {
                                    genericDraweeHierarchyBuilder.f4713i = n(typedArrayObtainStyledAttributes, index);
                                } else if (index == 11) {
                                    genericDraweeHierarchyBuilder.k = n(typedArrayObtainStyledAttributes, index);
                                } else if (index == 9) {
                                    integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                                } else if (index == 1) {
                                    genericDraweeHierarchyBuilder.f4716n = l(context2, typedArrayObtainStyledAttributes, index);
                                } else if (index == 5) {
                                    Drawable drawableL2 = l(context2, typedArrayObtainStyledAttributes, index);
                                    if (drawableL2 == null) {
                                        genericDraweeHierarchyBuilder.f4717o = null;
                                    } else {
                                        genericDraweeHierarchyBuilder.f4717o = Arrays.asList(drawableL2);
                                    }
                                } else if (index == 14) {
                                    m(genericDraweeHierarchyBuilder).f11403b = typedArrayObtainStyledAttributes.getBoolean(index, false);
                                } else if (index == 24) {
                                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                                } else {
                                    int i13 = dimensionPixelSize;
                                    if (index == 20) {
                                        z14 = typedArrayObtainStyledAttributes.getBoolean(index, z14);
                                    } else if (index == 21) {
                                        z16 = typedArrayObtainStyledAttributes.getBoolean(index, z16);
                                    } else if (index == 16) {
                                        z20 = typedArrayObtainStyledAttributes.getBoolean(index, z20);
                                    } else if (index == 17) {
                                        z18 = typedArrayObtainStyledAttributes.getBoolean(index, z18);
                                    } else if (index == 22) {
                                        z15 = typedArrayObtainStyledAttributes.getBoolean(index, z15);
                                    } else if (index == 19) {
                                        z17 = typedArrayObtainStyledAttributes.getBoolean(index, z17);
                                    } else if (index == 18) {
                                        z21 = typedArrayObtainStyledAttributes.getBoolean(index, z21);
                                    } else if (index == 15) {
                                        z19 = typedArrayObtainStyledAttributes.getBoolean(index, z19);
                                    } else if (index == 23) {
                                        i9.b bVarM = m(genericDraweeHierarchyBuilder);
                                        bVarM.f11405d = typedArrayObtainStyledAttributes.getColor(index, 0);
                                        bVarM.f11402a = 1;
                                    } else if (index == 27) {
                                        i9.b bVarM2 = m(genericDraweeHierarchyBuilder);
                                        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                                        bVarM2.getClass();
                                        dimensionPixelSize = i13;
                                        n8.i.b("the border width cannot be < 0", dimensionPixelSize2 >= 0.0f);
                                        bVarM2.f11406e = dimensionPixelSize2;
                                    } else {
                                        dimensionPixelSize = i13;
                                        if (index == 25) {
                                            m(genericDraweeHierarchyBuilder).f11407f = typedArrayObtainStyledAttributes.getColor(index, 0);
                                        } else if (index == 26) {
                                            i9.b bVarM3 = m(genericDraweeHierarchyBuilder);
                                            float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                                            bVarM3.getClass();
                                            n8.i.b("the padding cannot be < 0", dimensionPixelSize3 >= 0.0f);
                                            bVarM3.f11408g = dimensionPixelSize3;
                                        }
                                    }
                                    dimensionPixelSize = i13;
                                }
                            }
                            i12++;
                            context2 = context;
                        }
                        i11 = indexCount;
                        i12++;
                        context2 = context;
                    } catch (Throwable th2) {
                        th = th2;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                f2 = 0.0f;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z11 = z14 && z17;
                    z12 = z16 && z15;
                    z13 = z18 && z21;
                    if (z20 && z19) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z11 = z14 && z15;
                    z12 = z16 && z17;
                    z13 = z18 && z19;
                    if (z20 && z21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                int i14 = integer;
                z7 = z11;
                i10 = i14;
                z6 = z13;
                z5 = z12;
                i7 = dimensionPixelSize;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            f2 = 0.0f;
            z5 = true;
            z6 = true;
            z7 = true;
            z10 = true;
            i7 = 0;
            i10 = 0;
        }
        if (genericDraweeHierarchyBuilder.j != null && i10 > 0) {
            genericDraweeHierarchyBuilder.j = new com.facebook.drawee.drawable.b(genericDraweeHierarchyBuilder.j, i10);
        }
        if (i7 > 0) {
            m(genericDraweeHierarchyBuilder).a(z7 ? i7 : f2, z5 ? i7 : f2, z6 ? i7 : f2, z10 ? i7 : f2);
        }
        sa.a.w();
        return genericDraweeHierarchyBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x032b  */
    /* JADX WARN: Code duplicated, block: B:133:0x034a  */
    /* JADX WARN: Code duplicated, block: B:136:0x037c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0389  */
    /* JADX WARN: Code duplicated, block: B:139:0x0390  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:149:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x03df  */
    /* JADX WARN: Code duplicated, block: B:160:0x0408  */
    /* JADX WARN: Code duplicated, block: B:36:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0243  */
    /* JADX WARN: Code duplicated, block: B:82:0x024d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0255  */
    /* JADX WARN: Code duplicated, block: B:86:0x025b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0264  */
    /* JADX WARN: Code duplicated, block: B:90:0x028a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0290  */
    /* JADX WARN: Code duplicated, block: B:94:0x0296  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a7  */
    /* JADX WARN: Instruction removed from duplicated block: B:160:0x0408, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0264, please report this as an issue */
    public static final Object r(z type, np.r mode, Function3 writeGenericType) {
        boolean z5;
        up.b bVarF;
        Object objD;
        List list;
        np.j jVar;
        boolean z6;
        q0 q0VarR0;
        vo.i iVarG;
        boolean z7;
        z zVarU;
        vo.f fVar;
        np.i iVarD;
        z zVar;
        np.r rVar;
        Object objR;
        int iOrdinal;
        lq.y yVar;
        z zVar2;
        boolean z10 = mode.f17021c;
        np.f typeFactory = np.f.f16998c;
        np.f typeMappingConfiguration = np.f.f17001f;
        Intrinsics.checkNotNullParameter(type, "kotlinType");
        Intrinsics.checkNotNullParameter(typeFactory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        Intrinsics.checkNotNullParameter(type, "kotlinType");
        if (m.B(type)) {
            a0 a0Var = so.q.f20409a;
            Intrinsics.checkNotNullParameter(type, "suspendFunType");
            m.B(type);
            so.i iVarO = c9.a.o(type);
            wo.h annotations = type.getAnnotations();
            z zVarU2 = m.u(type);
            List listQ = m.q(type);
            List listV = m.v(type);
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(listV, 10));
            Iterator it = listV.iterator();
            while (it.hasNext()) {
                arrayList.add(((t0) it.next()).b());
            }
            lq.l0.f15225e.getClass();
            lq.l0 l0Var = lq.l0.f15226i;
            q0 q0VarN = so.q.f20409a.n();
            Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
            Intrinsics.checkNotNullParameter(type, "<this>");
            m.y(type);
            z zVarB = ((t0) CollectionsKt.Q(type.l0())).b();
            Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
            ArrayList arrayListW = CollectionsKt.W(arrayList, lq.c.t(c0.c(c9.a.e(zVarB)), l0Var, q0VarN, false));
            d0 d0VarP = c9.a.o(type).p();
            Intrinsics.checkNotNullExpressionValue(d0VarP, "getNullableAnyType(...)");
            return r(m.i(iVarO, annotations, zVarU2, listQ, arrayListW, d0VarP, false).x0(type.t0()), mode, writeGenericType);
        }
        mq.m mVar = mq.m.f16035d;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        q0 receiver = mVar.Q(type);
        if (e4.f.P(receiver)) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            z5 = z10;
            if (!(receiver instanceof q0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
            }
            vo.i iVarG2 = receiver.g();
            Intrinsics.checkNotNull(iVarG2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            k primitiveType = so.i.u((vo.f) iVarG2);
            if (primitiveType != null) {
                Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
                switch (primitiveType.ordinal()) {
                    case 0:
                        jVar = np.k.f17008a;
                        break;
                    case 1:
                        jVar = np.k.f17009b;
                        break;
                    case 2:
                        jVar = np.k.f17010c;
                        break;
                    case 3:
                        jVar = np.k.f17011d;
                        break;
                    case 4:
                        jVar = np.k.f17012e;
                        break;
                    case 5:
                        jVar = np.k.f17013f;
                        break;
                    case 6:
                        jVar = np.k.f17014g;
                        break;
                    case 7:
                        jVar = np.k.f17015h;
                        break;
                    default:
                        throw new rn.n();
                }
                if (e4.f.Y(type)) {
                    z6 = true;
                } else {
                    Intrinsics.checkNotNullParameter(mVar, "<this>");
                    Intrinsics.checkNotNullParameter(type, "type");
                    c ENHANCED_NULLABILITY_ANNOTATION = ep.a0.f8501p;
                    Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (e4.f.J(type, ENHANCED_NULLABILITY_ANNOTATION)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objD = com.facebook.imagepipeline.nativecode.c.f(jVar, z6);
            } else {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                if (!(receiver instanceof q0)) {
                    throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
                }
                vo.i iVarG3 = receiver.g();
                Intrinsics.checkNotNull(iVarG3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                k kVarS = so.i.s((vo.f) iVarG3);
                if (kVarS != null) {
                    StringBuilder sb2 = new StringBuilder("[");
                    cq.c cVar = (cq.c) cq.c.K.get(kVarS);
                    if (cVar == null) {
                        cq.c.a(6);
                        throw null;
                    }
                    sb2.append(cVar.c());
                    objD = np.f.b(sb2.toString());
                } else {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    if (!(receiver instanceof q0)) {
                        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
                    }
                    vo.i iVarG4 = receiver.g();
                    if (iVarG4 != null && so.i.J(iVarG4)) {
                        Intrinsics.checkNotNullParameter(receiver, "$receiver");
                        if (!(receiver instanceof q0)) {
                            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
                        }
                        vo.i iVarG5 = receiver.g();
                        Intrinsics.checkNotNull(iVarG5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        up.d dVarH = bq.e.h((vo.f) iVarG5);
                        if (dVarH != null) {
                            String str = uo.d.f21197a;
                            bVarF = uo.d.f(dVarH);
                        } else {
                            bVarF = null;
                        }
                        if (bVarF != null) {
                            if (!mode.f17025g && ((list = uo.d.f21208n) == null || !list.isEmpty())) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (Intrinsics.areEqual(((uo.c) it2.next()).f21194a, bVarF)) {
                                        }
                                    }
                                }
                            }
                            String strE = cq.b.e(bVarF);
                            Intrinsics.checkNotNullExpressionValue(strE, "internalNameByClassId(...)");
                            objD = np.f.d(strE);
                        }
                    }
                }
            }
            if (objD != null) {
                Object objF = com.facebook.imagepipeline.nativecode.c.f(objD, mode.f17019a);
                writeGenericType.invoke(type, objF, mode);
                return objF;
            }
            q0VarR0 = type.r0();
            if (q0VarR0 instanceof lq.y) {
                yVar = (lq.y) q0VarR0;
                zVar2 = yVar.f15264a;
                if (zVar2 != null) {
                    return r(c9.a.G(zVar2), mode, writeGenericType);
                }
                LinkedHashSet types = yVar.f15265b;
                Intrinsics.checkNotNullParameter(types, "types");
                throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.O(types, null, null, null, null, 63));
            }
            iVarG = q0VarR0.g();
            if (iVarG != null) {
                throw new UnsupportedOperationException("no descriptor for type constructor of " + type);
            }
            if (nq.l.f(iVarG)) {
                np.i iVarD2 = np.f.d("error/NonExistentClass");
                vo.f descriptor = (vo.f) iVarG;
                Intrinsics.checkNotNullParameter(type, "kotlinType");
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return iVarD2;
            }
            z7 = iVarG instanceof vo.f;
            if (!z7 && so.i.z(type)) {
                if (type.l0().size() != 1) {
                    throw new UnsupportedOperationException("arrays must have one type argument");
                }
                t0 t0Var = (t0) type.l0().get(0);
                z zVarB2 = t0Var.b();
                Intrinsics.checkNotNullExpressionValue(zVarB2, "getType(...)");
                if (t0Var.a() == e1.IN_VARIANCE) {
                    objR = np.f.d("java/lang/Object");
                } else {
                    e1 effectiveVariance = t0Var.a();
                    Intrinsics.checkNotNullExpressionValue(effectiveVariance, "getProjectionKind(...)");
                    Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
                    if (z5 || ((iOrdinal = effectiveVariance.ordinal()) == 0 ? (rVar = mode.f17027i) == null : !(iOrdinal == 1 ? (rVar = mode.f17026h) != null : (rVar = mode.f17024f) != null))) {
                        rVar = mode;
                    }
                    objR = r(zVarB2, rVar, writeGenericType);
                }
                return np.f.b("[" + np.f.l((np.k) objR));
            }
            if (z7) {
                if (iVarG instanceof vo.r0) {
                    zVarU = c9.a.u((vo.r0) iVarG);
                    if (type.t0()) {
                        zVarU = c9.a.B(zVarU);
                    }
                    return r(zVarU, mode, vq.d.f21939d);
                }
                if (!(iVarG instanceof vo.q0) && mode.j) {
                    return r(((v) ((vo.q0) iVarG)).C0(), mode, writeGenericType);
                }
                throw new UnsupportedOperationException("Unknown type " + type);
            }
            if (xp.g.b(iVarG) && !mode.f17020b) {
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                Intrinsics.checkNotNullParameter(type, "inlineClassType");
                zVar = (z) lq.c.d(type, new HashSet());
                if (zVar != null) {
                    return r(zVar, new np.r(mode.f17019a, true, mode.f17021c, mode.f17022d, mode.f17023e, mode.f17024f, mode.f17025g, mode.f17026h, mode.f17027i, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING), writeGenericType);
                }
            }
            if (z5) {
                e eVar = so.i.f20342e;
                if (so.i.b((vo.f) iVarG, so.o.Q)) {
                    iVarD = np.f.d("java/lang/Class");
                } else {
                    fVar = (vo.f) iVarG;
                    vo.f classDescriptor = fVar.a();
                    Intrinsics.checkNotNullExpressionValue(classDescriptor, "getOriginal(...)");
                    Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
                    if (fVar.c() == vo.g.f21811v) {
                        l lVarG = fVar.g();
                        Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        fVar = (vo.f) lVarG;
                    }
                    vo.f fVarA = fVar.a();
                    Intrinsics.checkNotNullExpressionValue(fVarA, "getOriginal(...)");
                    iVarD = np.f.d(b(fVarA, typeMappingConfiguration));
                }
            } else {
                fVar = (vo.f) iVarG;
                vo.f classDescriptor2 = fVar.a();
                Intrinsics.checkNotNullExpressionValue(classDescriptor2, "getOriginal(...)");
                Intrinsics.checkNotNullParameter(classDescriptor2, "classDescriptor");
                if (fVar.c() == vo.g.f21811v) {
                    l lVarG2 = fVar.g();
                    Intrinsics.checkNotNull(lVarG2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    fVar = (vo.f) lVarG2;
                }
                vo.f fVarA2 = fVar.a();
                Intrinsics.checkNotNullExpressionValue(fVarA2, "getOriginal(...)");
                iVarD = np.f.d(b(fVarA2, typeMappingConfiguration));
            }
            writeGenericType.invoke(type, iVarD, mode);
            return iVarD;
        }
        z5 = z10;
        objD = null;
        if (objD != null) {
            Object objF2 = com.facebook.imagepipeline.nativecode.c.f(objD, mode.f17019a);
            writeGenericType.invoke(type, objF2, mode);
            return objF2;
        }
        q0VarR0 = type.r0();
        if (q0VarR0 instanceof lq.y) {
            yVar = (lq.y) q0VarR0;
            zVar2 = yVar.f15264a;
            if (zVar2 != null) {
                return r(c9.a.G(zVar2), mode, writeGenericType);
            }
            LinkedHashSet types2 = yVar.f15265b;
            Intrinsics.checkNotNullParameter(types2, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.O(types2, null, null, null, null, 63));
        }
        iVarG = q0VarR0.g();
        if (iVarG != null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + type);
        }
        if (nq.l.f(iVarG)) {
            np.i iVarD3 = np.f.d("error/NonExistentClass");
            vo.f descriptor2 = (vo.f) iVarG;
            Intrinsics.checkNotNullParameter(type, "kotlinType");
            Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
            return iVarD3;
        }
        z7 = iVarG instanceof vo.f;
        if (!z7) {
        }
        if (z7) {
            if (iVarG instanceof vo.r0) {
                zVarU = c9.a.u((vo.r0) iVarG);
                if (type.t0()) {
                    zVarU = c9.a.B(zVarU);
                }
                return r(zVarU, mode, vq.d.f21939d);
            }
            if (!(iVarG instanceof vo.q0)) {
            }
            throw new UnsupportedOperationException("Unknown type " + type);
        }
        if (xp.g.b(iVarG)) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(type, "inlineClassType");
            zVar = (z) lq.c.d(type, new HashSet());
            if (zVar != null) {
                return r(zVar, new np.r(mode.f17019a, true, mode.f17021c, mode.f17022d, mode.f17023e, mode.f17024f, mode.f17025g, mode.f17026h, mode.f17027i, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING), writeGenericType);
            }
        }
        if (z5) {
            e eVar2 = so.i.f20342e;
            if (so.i.b((vo.f) iVarG, so.o.Q)) {
                iVarD = np.f.d("java/lang/Class");
            } else {
                fVar = (vo.f) iVarG;
                vo.f classDescriptor3 = fVar.a();
                Intrinsics.checkNotNullExpressionValue(classDescriptor3, "getOriginal(...)");
                Intrinsics.checkNotNullParameter(classDescriptor3, "classDescriptor");
                if (fVar.c() == vo.g.f21811v) {
                    l lVarG3 = fVar.g();
                    Intrinsics.checkNotNull(lVarG3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    fVar = (vo.f) lVarG3;
                }
                vo.f fVarA3 = fVar.a();
                Intrinsics.checkNotNullExpressionValue(fVarA3, "getOriginal(...)");
                iVarD = np.f.d(b(fVarA3, typeMappingConfiguration));
            }
        } else {
            fVar = (vo.f) iVarG;
            vo.f classDescriptor4 = fVar.a();
            Intrinsics.checkNotNullExpressionValue(classDescriptor4, "getOriginal(...)");
            Intrinsics.checkNotNullParameter(classDescriptor4, "classDescriptor");
            if (fVar.c() == vo.g.f21811v) {
                l lVarG4 = fVar.g();
                Intrinsics.checkNotNull(lVarG4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                fVar = (vo.f) lVarG4;
            }
            vo.f fVarA4 = fVar.a();
            Intrinsics.checkNotNullExpressionValue(fVarA4, "getOriginal(...)");
            iVarD = np.f.d(b(fVarA4, typeMappingConfiguration));
        }
        writeGenericType.invoke(type, iVarD, mode);
        return iVarD;
    }

    public static MediaType u(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return i(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static Metadata v(pc.l lVar, boolean z5) {
        gb.a aVar = z5 ? null : hd.i.f10568g;
        w wVar = new w(10);
        Metadata metadataE = null;
        int i7 = 0;
        while (true) {
            try {
                lVar.C(wVar.f13860a, 0, 10);
                wVar.F(0);
                if (wVar.w() != 4801587) {
                    break;
                }
                wVar.G(3);
                int iT = wVar.t();
                int i10 = iT + 10;
                if (metadataE == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(wVar.f13860a, 0, bArr, 0, 10);
                    lVar.C(bArr, 10, iT);
                    metadataE = new hd.i(aVar).E(bArr, i10);
                } else {
                    lVar.n(iT);
                }
                i7 += i10;
            } catch (EOFException unused) {
            }
        }
        lVar.t();
        lVar.n(i7);
        if (metadataE == null || metadataE.f5693d.length == 0) {
            return null;
        }
        return metadataE;
    }

    public static byte[] w(long j, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(s0.g.e("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(s0.g.e("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(s0.g.e("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    while (true) {
                        int i7 = bufferedInputStream.read(bArr);
                        if (i7 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i7);
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                bufferedInputStream.close();
                throw th5;
            }
        } catch (Throwable th6) {
            try {
                fileInputStream.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public static e4.r x(w wVar) {
        wVar.G(1);
        int iW = wVar.w();
        long j = ((long) wVar.f13861b) + ((long) iW);
        int i7 = iW / 18;
        long[] jArrCopyOf = new long[i7];
        long[] jArrCopyOf2 = new long[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            long jO = wVar.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jO;
            jArrCopyOf2[i10] = wVar.o();
            wVar.G(2);
        }
        wVar.G((int) (j - ((long) wVar.f13861b)));
        return new e4.r(17, jArrCopyOf, jArrCopyOf2);
    }

    public static String y(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb2.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                sb2.append(line2);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public abstract ye.n await(long j, TimeUnit timeUnit);

    public abstract void s(Throwable th2);

    public abstract void t(com.google.firebase.messaging.r rVar);

    public abstract void z();
}
