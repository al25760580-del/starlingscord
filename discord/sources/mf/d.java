package mf;

import af.w;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import gc.l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f15745c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f15746d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f15747e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f15748f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f15749g;
    public static i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static j f15752l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15753a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f15750h = new ThreadLocal();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final hs.c f15751i = new hs.c(4);
    public static final io.sentry.hints.j j = new io.sentry.hints.j(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k8.a f15744b = new k8.a();

    public d(Context context) {
        this.f15753a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (w.j(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(str.length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021e A[Catch: all -> 0x0207, b -> 0x020a, RemoteException -> 0x020d, TryCatch #11 {RemoteException -> 0x020d, b -> 0x020a, all -> 0x0207, blocks: (B:89:0x01f8, B:102:0x023f, B:104:0x0245, B:105:0x024e, B:106:0x0255, B:96:0x0210, B:97:0x0219, B:100:0x021e, B:101:0x022f, B:107:0x0256, B:108:0x025f, B:109:0x0260, B:110:0x0269, B:118:0x027a), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x022f A[Catch: all -> 0x0207, b -> 0x020a, RemoteException -> 0x020d, TryCatch #11 {RemoteException -> 0x020d, b -> 0x020a, all -> 0x0207, blocks: (B:89:0x01f8, B:102:0x023f, B:104:0x0245, B:105:0x024e, B:106:0x0255, B:96:0x0210, B:97:0x0219, B:100:0x021e, B:101:0x022f, B:107:0x0256, B:108:0x025f, B:109:0x0260, B:110:0x0269, B:118:0x027a), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0245 A[Catch: all -> 0x0207, b -> 0x020a, RemoteException -> 0x020d, TryCatch #11 {RemoteException -> 0x020d, b -> 0x020a, all -> 0x0207, blocks: (B:89:0x01f8, B:102:0x023f, B:104:0x0245, B:105:0x024e, B:106:0x0255, B:96:0x0210, B:97:0x0219, B:100:0x021e, B:101:0x022f, B:107:0x0256, B:108:0x025f, B:109:0x0260, B:110:0x0269, B:118:0x027a), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x024e A[Catch: all -> 0x0207, b -> 0x020a, RemoteException -> 0x020d, TryCatch #11 {RemoteException -> 0x020d, b -> 0x020a, all -> 0x0207, blocks: (B:89:0x01f8, B:102:0x023f, B:104:0x0245, B:105:0x024e, B:106:0x0255, B:96:0x0210, B:97:0x0219, B:100:0x021e, B:101:0x022f, B:107:0x0256, B:108:0x025f, B:109:0x0260, B:110:0x0269, B:118:0x027a), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0256 A[Catch: all -> 0x0207, b -> 0x020a, RemoteException -> 0x020d, TryCatch #11 {RemoteException -> 0x020d, b -> 0x020a, all -> 0x0207, blocks: (B:89:0x01f8, B:102:0x023f, B:104:0x0245, B:105:0x024e, B:106:0x0255, B:96:0x0210, B:97:0x0219, B:100:0x021e, B:101:0x022f, B:107:0x0256, B:108:0x025f, B:109:0x0260, B:110:0x0269, B:118:0x027a), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0260 A[Catch: all -> 0x0207, b -> 0x020a, RemoteException -> 0x020d, TryCatch #11 {RemoteException -> 0x020d, b -> 0x020a, all -> 0x0207, blocks: (B:89:0x01f8, B:102:0x023f, B:104:0x0245, B:105:0x024e, B:106:0x0255, B:96:0x0210, B:97:0x0219, B:100:0x021e, B:101:0x022f, B:107:0x0256, B:108:0x025f, B:109:0x0260, B:110:0x0269, B:118:0x027a), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x026e  */
    /* JADX WARN: Code duplicated, block: B:135:0x02df  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ff A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:5:0x0042, B:9:0x00a5, B:16:0x00b1, B:19:0x00b7, B:31:0x00e2, B:119:0x027b, B:120:0x0282, B:128:0x0291, B:130:0x02b9, B:132:0x02c9, B:142:0x02f7, B:143:0x02fe, B:123:0x0285, B:124:0x0286, B:125:0x028d, B:144:0x02ff, B:145:0x031f, B:146:0x0320, B:147:0x0365), top: B:163:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b7 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #4 {all -> 0x00ac, blocks: (B:5:0x0042, B:9:0x00a5, B:16:0x00b1, B:19:0x00b7, B:31:0x00e2, B:119:0x027b, B:120:0x0282, B:128:0x0291, B:130:0x02b9, B:132:0x02c9, B:142:0x02f7, B:143:0x02fe, B:123:0x0285, B:124:0x0286, B:125:0x028d, B:144:0x02ff, B:145:0x031f, B:146:0x0320, B:147:0x0365), top: B:163:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00df  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed A[Catch: all -> 0x026a, TryCatch #2 {all -> 0x026a, blocks: (B:34:0x00e7, B:36:0x00ed, B:37:0x00ef), top: B:159:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2 A[Catch: all -> 0x015f, b -> 0x0164, RemoteException -> 0x0169, TRY_ENTER, TryCatch #10 {RemoteException -> 0x0169, b -> 0x0164, all -> 0x015f, blocks: (B:33:0x00e6, B:39:0x00f2, B:41:0x00f9, B:42:0x011e, B:46:0x0124, B:48:0x012c, B:50:0x0130, B:51:0x013e, B:58:0x0149, B:66:0x0183, B:68:0x018b, B:69:0x0192, B:70:0x0199, B:65:0x016e, B:73:0x019c, B:74:0x019d, B:75:0x01a4, B:76:0x01a5, B:77:0x01ac, B:80:0x01af, B:81:0x01b0, B:83:0x01d9, B:85:0x01ec, B:87:0x01f4), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f9 A[Catch: all -> 0x015f, b -> 0x0164, RemoteException -> 0x0169, TryCatch #10 {RemoteException -> 0x0169, b -> 0x0164, all -> 0x015f, blocks: (B:33:0x00e6, B:39:0x00f2, B:41:0x00f9, B:42:0x011e, B:46:0x0124, B:48:0x012c, B:50:0x0130, B:51:0x013e, B:58:0x0149, B:66:0x0183, B:68:0x018b, B:69:0x0192, B:70:0x0199, B:65:0x016e, B:73:0x019c, B:74:0x019d, B:75:0x01a4, B:76:0x01a5, B:77:0x01ac, B:80:0x01af, B:81:0x01b0, B:83:0x01d9, B:85:0x01ec, B:87:0x01f4), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0124 A[Catch: all -> 0x015f, b -> 0x0164, RemoteException -> 0x0169, TRY_ENTER, TryCatch #10 {RemoteException -> 0x0169, b -> 0x0164, all -> 0x015f, blocks: (B:33:0x00e6, B:39:0x00f2, B:41:0x00f9, B:42:0x011e, B:46:0x0124, B:48:0x012c, B:50:0x0130, B:51:0x013e, B:58:0x0149, B:66:0x0183, B:68:0x018b, B:69:0x0192, B:70:0x0199, B:65:0x016e, B:73:0x019c, B:74:0x019d, B:75:0x01a4, B:76:0x01a5, B:77:0x01ac, B:80:0x01af, B:81:0x01b0, B:83:0x01d9, B:85:0x01ec, B:87:0x01f4), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a5 A[Catch: all -> 0x015f, b -> 0x0164, RemoteException -> 0x0169, TryCatch #10 {RemoteException -> 0x0169, b -> 0x0164, all -> 0x015f, blocks: (B:33:0x00e6, B:39:0x00f2, B:41:0x00f9, B:42:0x011e, B:46:0x0124, B:48:0x012c, B:50:0x0130, B:51:0x013e, B:58:0x0149, B:66:0x0183, B:68:0x018b, B:69:0x0192, B:70:0x0199, B:65:0x016e, B:73:0x019c, B:74:0x019d, B:75:0x01a4, B:76:0x01a5, B:77:0x01ac, B:80:0x01af, B:81:0x01b0, B:83:0x01d9, B:85:0x01ec, B:87:0x01f4), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b0 A[Catch: all -> 0x015f, b -> 0x0164, RemoteException -> 0x0169, TryCatch #10 {RemoteException -> 0x0169, b -> 0x0164, all -> 0x015f, blocks: (B:33:0x00e6, B:39:0x00f2, B:41:0x00f9, B:42:0x011e, B:46:0x0124, B:48:0x012c, B:50:0x0130, B:51:0x013e, B:58:0x0149, B:66:0x0183, B:68:0x018b, B:69:0x0192, B:70:0x0199, B:65:0x016e, B:73:0x019c, B:74:0x019d, B:75:0x01a4, B:76:0x01a5, B:77:0x01ac, B:80:0x01af, B:81:0x01b0, B:83:0x01d9, B:85:0x01ec, B:87:0x01f4), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9 A[Catch: all -> 0x015f, b -> 0x0164, RemoteException -> 0x0169, TryCatch #10 {RemoteException -> 0x0169, b -> 0x0164, all -> 0x015f, blocks: (B:33:0x00e6, B:39:0x00f2, B:41:0x00f9, B:42:0x011e, B:46:0x0124, B:48:0x012c, B:50:0x0130, B:51:0x013e, B:58:0x0149, B:66:0x0183, B:68:0x018b, B:69:0x0192, B:70:0x0199, B:65:0x016e, B:73:0x019c, B:74:0x019d, B:75:0x01a4, B:76:0x01a5, B:77:0x01ac, B:80:0x01af, B:81:0x01b0, B:83:0x01d9, B:85:0x01ec, B:87:0x01f4), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec A[Catch: all -> 0x015f, b -> 0x0164, RemoteException -> 0x0169, TryCatch #10 {RemoteException -> 0x0169, b -> 0x0164, all -> 0x015f, blocks: (B:33:0x00e6, B:39:0x00f2, B:41:0x00f9, B:42:0x011e, B:46:0x0124, B:48:0x012c, B:50:0x0130, B:51:0x013e, B:58:0x0149, B:66:0x0183, B:68:0x018b, B:69:0x0192, B:70:0x0199, B:65:0x016e, B:73:0x019c, B:74:0x019d, B:75:0x01a4, B:76:0x01a5, B:77:0x01ac, B:80:0x01af, B:81:0x01b0, B:83:0x01d9, B:85:0x01ec, B:87:0x01f4), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4 A[Catch: all -> 0x015f, b -> 0x0164, RemoteException -> 0x0169, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x0169, b -> 0x0164, all -> 0x015f, blocks: (B:33:0x00e6, B:39:0x00f2, B:41:0x00f9, B:42:0x011e, B:46:0x0124, B:48:0x012c, B:50:0x0130, B:51:0x013e, B:58:0x0149, B:66:0x0183, B:68:0x018b, B:69:0x0192, B:70:0x0199, B:65:0x016e, B:73:0x019c, B:74:0x019d, B:75:0x01a4, B:76:0x01a5, B:77:0x01ac, B:80:0x01af, B:81:0x01b0, B:83:0x01d9, B:85:0x01ec, B:87:0x01f4), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0210 A[Catch: all -> 0x0207, b -> 0x020a, RemoteException -> 0x020d, TryCatch #11 {RemoteException -> 0x020d, b -> 0x020a, all -> 0x0207, blocks: (B:89:0x01f8, B:102:0x023f, B:104:0x0245, B:105:0x024e, B:106:0x0255, B:96:0x0210, B:97:0x0219, B:100:0x021e, B:101:0x022f, B:107:0x0256, B:108:0x025f, B:109:0x0260, B:110:0x0269, B:118:0x027a), top: B:166:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x021a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [k8.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    public static d b(Context context, k8.a aVar) throws b {
        ?? r6;
        int i7;
        d dVar;
        Cursor cursor;
        int i10;
        Boolean bool;
        i iVarF;
        int i11;
        lf.a aVarY;
        Object objA;
        h hVar;
        j jVar;
        h hVar2;
        boolean z5;
        lf.a aVarY2;
        Cursor cursor2;
        String str = "Considering local module com.google.android.gms.cronet_dynamite:";
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = f15750h;
        h hVar3 = (h) threadLocal.get();
        h hVar4 = new h();
        threadLocal.set(hVar4);
        hs.c cVar = f15751i;
        Long l6 = (Long) cVar.get();
        long jLongValue = l6.longValue();
        try {
            cVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            l lVarK = aVar.k(context, j);
            int i12 = lVarK.f9744a;
            int i13 = lVarK.f9745b;
            StringBuilder sb2 = new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 26 + String.valueOf(i12).length() + 19 + "com.google.android.gms.cronet_dynamite".length() + 1 + String.valueOf(i13).length());
            sb2.append("Considering local module com.google.android.gms.cronet_dynamite:");
            sb2.append(i12);
            sb2.append(" and remote module com.google.android.gms.cronet_dynamite:");
            sb2.append(i13);
            Log.i("DynamiteModule", sb2.toString());
            int i14 = lVarK.f9746c;
            if (i14 != 0) {
                if (i14 != -1) {
                    if (i14 == 1 || lVarK.f9745b != 0) {
                        if (i14 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cronet_dynamite"));
                            d dVar2 = new d(applicationContext);
                            if (jLongValue == 0) {
                                cVar.remove();
                            } else {
                                cVar.set(l6);
                            }
                            cursor2 = hVar4.f15758a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(hVar3);
                            return dVar2;
                        }
                        if (i14 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i14);
                            throw new b(sb3.toString());
                        }
                        try {
                            try {
                                i10 = lVarK.f9745b;
                                try {
                                    try {
                                        try {
                                            synchronized (d.class) {
                                                try {
                                                    if (c(context)) {
                                                        throw new b("Remote loading disabled");
                                                    }
                                                    bool = f15745c;
                                                    if (bool != null) {
                                                        throw new b("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb4 = new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 40 + String.valueOf(i10).length());
                                                        sb4.append("Selected remote version of com.google.android.gms.cronet_dynamite, version >= ");
                                                        sb4.append(i10);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        synchronized (d.class) {
                                                            jVar = f15752l;
                                                        }
                                                        if (jVar != null) {
                                                            throw new b("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        hVar2 = (h) threadLocal.get();
                                                        if (hVar2 != null || hVar2.f15758a == null) {
                                                            throw new b("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = hVar2.f15758a;
                                                        new lf.b(null);
                                                        synchronized (d.class) {
                                                            z5 = f15748f >= 2;
                                                        }
                                                        if (z5) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            aVarY2 = jVar.z(new lf.b(applicationContext2), i10, new lf.b(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            aVarY2 = jVar.y(new lf.b(applicationContext2), i10, new lf.b(cursor3));
                                                        }
                                                        Context context2 = (Context) lf.b.A(aVarY2);
                                                        if (context2 == null) {
                                                            throw new b("Failed to get module context");
                                                        }
                                                        dVar = new d(context2);
                                                    } else {
                                                        StringBuilder sb5 = new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 40 + String.valueOf(i10).length());
                                                        sb5.append("Selected remote version of com.google.android.gms.cronet_dynamite, version >= ");
                                                        sb5.append(i10);
                                                        Log.i("DynamiteModule", sb5.toString());
                                                        iVarF = f(context);
                                                        if (iVarF != null) {
                                                            throw new b("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelT = iVarF.t(6, iVarF.u());
                                                        i11 = parcelT.readInt();
                                                        parcelT.recycle();
                                                        if (i11 >= 3) {
                                                            hVar = (h) threadLocal.get();
                                                            if (hVar != null) {
                                                                throw new b("No cached result cursor holder");
                                                            }
                                                            aVarY = iVarF.B(new lf.b(context), i10, new lf.b(hVar.f15758a));
                                                        } else if (i11 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            aVarY = iVarF.z(new lf.b(context), i10);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            aVarY = iVarF.y(new lf.b(context), i10);
                                                        }
                                                        objA = lf.b.A(aVarY);
                                                        if (objA != null) {
                                                            throw new b("Failed to load remote module.");
                                                        }
                                                        dVar = new d((Context) objA);
                                                    }
                                                    if (jLongValue == 0) {
                                                        f15751i.remove();
                                                    } else {
                                                        f15751i.set(l6);
                                                    }
                                                    cursor = hVar4.f15758a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    f15750h.set(hVar3);
                                                    return dVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                        throw new b("Failed to load remote module.", e);
                                    } catch (b e11) {
                                        throw e11;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        throw new b("Failed to load remote module.", th);
                                    }
                                } catch (RemoteException e12) {
                                    e = e12;
                                    throw new b("Failed to load remote module.", e);
                                } catch (b e13) {
                                    throw e13;
                                } catch (Throwable th5) {
                                    th = th5;
                                    throw new b("Failed to load remote module.", th);
                                }
                            } catch (b e14) {
                                e = e14;
                                r6 = context;
                                String message = e.getMessage();
                                StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb6.append("Failed to load remote module: ");
                                sb6.append(message);
                                Log.w("DynamiteModule", sb6.toString());
                                i7 = lVarK.f9744a;
                                if (i7 != 0 || aVar.k(r6, new o9.d(i7, 5)).f9746c != -1) {
                                    throw new b("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cronet_dynamite"));
                                dVar = new d(applicationContext);
                            }
                        } catch (b e15) {
                            e = e15;
                            r6 = str;
                            String message2 = e.getMessage();
                            StringBuilder sb7 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb7.append("Failed to load remote module: ");
                            sb7.append(message2);
                            Log.w("DynamiteModule", sb7.toString());
                            i7 = lVarK.f9744a;
                            if (i7 != 0) {
                            }
                            throw new b("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (lVarK.f9744a != 0) {
                    i14 = -1;
                    if (i14 == 1) {
                    }
                    if (i14 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cronet_dynamite"));
                        d dVar3 = new d(applicationContext);
                        if (jLongValue == 0) {
                            cVar.remove();
                        } else {
                            cVar.set(l6);
                        }
                        cursor2 = hVar4.f15758a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(hVar3);
                        return dVar3;
                    }
                    if (i14 == 1) {
                        StringBuilder sb8 = new StringBuilder(String.valueOf(i14).length() + 36);
                        sb8.append("VersionPolicy returned invalid code:");
                        sb8.append(i14);
                        throw new b(sb8.toString());
                    }
                    i10 = lVarK.f9745b;
                    synchronized (d.class) {
                        if (c(context)) {
                            throw new b("Remote loading disabled");
                        }
                        bool = f15745c;
                        if (bool != null) {
                            throw new b("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb9 = new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 40 + String.valueOf(i10).length());
                            sb9.append("Selected remote version of com.google.android.gms.cronet_dynamite, version >= ");
                            sb9.append(i10);
                            Log.i("DynamiteModule", sb9.toString());
                            synchronized (d.class) {
                                jVar = f15752l;
                                if (jVar != null) {
                                    throw new b("DynamiteLoaderV2 was not cached.");
                                }
                                hVar2 = (h) threadLocal.get();
                                if (hVar2 != null) {
                                }
                                throw new b("No result cursor");
                            }
                        }
                        StringBuilder sb10 = new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 40 + String.valueOf(i10).length());
                        sb10.append("Selected remote version of com.google.android.gms.cronet_dynamite, version >= ");
                        sb10.append(i10);
                        Log.i("DynamiteModule", sb10.toString());
                        iVarF = f(context);
                        if (iVarF != null) {
                            throw new b("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelT2 = iVarF.t(6, iVarF.u());
                        i11 = parcelT2.readInt();
                        parcelT2.recycle();
                        if (i11 >= 3) {
                            hVar = (h) threadLocal.get();
                            if (hVar != null) {
                                throw new b("No cached result cursor holder");
                            }
                            aVarY = iVarF.B(new lf.b(context), i10, new lf.b(hVar.f15758a));
                        } else if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarY = iVarF.z(new lf.b(context), i10);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarY = iVarF.y(new lf.b(context), i10);
                        }
                        objA = lf.b.A(aVarY);
                        if (objA != null) {
                            throw new b("Failed to load remote module.");
                        }
                        dVar = new d((Context) objA);
                        if (jLongValue == 0) {
                            f15751i.remove();
                        } else {
                            f15751i.set(l6);
                        }
                        cursor = hVar4.f15758a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f15750h.set(hVar3);
                        return dVar;
                    }
                }
            }
            int i15 = lVarK.f9744a;
            int i16 = lVarK.f9745b;
            StringBuilder sb11 = new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 46 + String.valueOf(i15).length() + 23 + String.valueOf(i16).length() + 1);
            sb11.append("No acceptable module com.google.android.gms.cronet_dynamite found. Local version is ");
            sb11.append(i15);
            sb11.append(" and remote version is ");
            sb11.append(i16);
            sb11.append(".");
            throw new b(sb11.toString());
        } catch (Throwable th6) {
            if (jLongValue == 0) {
                f15751i.remove();
            } else {
                f15751i.set(l6);
            }
            Cursor cursor4 = hVar4.f15758a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f15750h.set(hVar3);
            throw th6;
        }
    }

    public static boolean c(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f15749g)) {
            return true;
        }
        boolean z5 = false;
        if (f15749g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (xe.f.f22924b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z5 = true;
            }
            f15749g = Boolean.valueOf(z5);
            if (z5 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f15747e = true;
            }
        }
        if (!z5) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v7 boolean) = (r3v6 boolean), (r3v9 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int d(Context context, boolean z5, boolean z6) throws Throwable {
        Exception exc;
        Throwable th2;
        MatrixCursor matrixCursor;
        boolean z7;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z10 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z5 ? "api" : "api_force_staging").appendPath("com.google.android.gms.cronet_dynamite").appendQueryParameter("requestStartUptime", String.valueOf(((Long) f15751i.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z11 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i7 = 0; i7 < count; i7++) {
                                    if (!cursorQuery.moveToPosition(i7)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i10 = 0; i10 < columnCount; i10++) {
                                        int type = cursorQuery.getType(i10);
                                        if (type == 0) {
                                            objArr[i10] = null;
                                        } else if (type == 1) {
                                            objArr[i10] = Long.valueOf(cursorQuery.getLong(i10));
                                        } else if (type == 2) {
                                            objArr[i10] = Double.valueOf(cursorQuery.getDouble(i10));
                                        } else if (type == 3) {
                                            objArr[i10] = cursorQuery.getString(i10);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i10] = cursorQuery.getBlob(i10);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th3) {
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i11 = matrixCursor.getInt(0);
                            if (i11 > 0) {
                                synchronized (d.class) {
                                    try {
                                        f15746d = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f15748f = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z7 = matrixCursor.getInt(columnIndex2) != 0;
                                            f15747e = z7;
                                        } else {
                                            z7 = false;
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                h hVar = (h) f15750h.get();
                                if (hVar == null || hVar.f15758a != null) {
                                    z10 = false;
                                } else {
                                    hVar.f15758a = matrixCursor;
                                }
                                z11 = z7;
                                matrixCursor2 = z10 ? null : matrixCursor;
                            }
                            if (z6 && z11) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i11;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (exc instanceof b) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new b(sb2.toString(), exc);
                    } catch (Throwable th7) {
                        th2 = th7;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th2;
                        }
                        matrixCursor2.close();
                        throw th2;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th8) {
                th2 = th8;
            }
        } catch (Exception e11) {
            exc = e11;
        }
    }

    public static void e(ClassLoader classLoader) throws b {
        try {
            j jVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 5);
            }
            f15752l = jVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new b("Failed to instantiate dynamite loader", e10);
        }
    }

    public static i f(Context context) {
        i iVar;
        synchronized (d.class) {
            i iVar2 = k;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    iVar = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 5);
                }
                if (iVar != null) {
                    k = iVar;
                    return iVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }
}
