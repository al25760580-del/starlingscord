package a5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DataSource.Factory, xc.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f185e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f186i;

    public g(byte[] bArr) {
        this.f186i = bArr;
    }

    @Override // xc.d
    public int a() {
        return this.f184d;
    }

    @Override // xc.d
    public int b() {
        return this.f185e;
    }

    @Override // xc.d
    public int c() {
        int i7 = this.f184d;
        return i7 == -1 ? ((je.w) this.f186i).x() : i7;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DataSource createDataSource() {
        return new he.w(this.f184d, this.f185e, (e4.l) this.f186i);
    }

    public int d() {
        return ((((byte[]) this.f186i).length - this.f184d) * 8) - this.f185e;
    }

    public BillingResult e() {
        BillingResult billingResult = new BillingResult();
        billingResult.f3788a = this.f184d;
        billingResult.f3789b = this.f185e;
        billingResult.f3790c = (String) this.f186i;
        return billingResult;
    }

    public io.sentry.android.core.internal.threaddump.a f() {
        int i7 = this.f185e;
        if (i7 < 0 || i7 >= this.f184d) {
            return null;
        }
        ArrayList arrayList = (ArrayList) this.f186i;
        this.f185e = i7 + 1;
        return (io.sentry.android.core.internal.threaddump.a) arrayList.get(i7);
    }

    public int g(int i7) {
        byte[] bArr = (byte[]) this.f186i;
        if (i7 <= 0 || i7 > 32 || i7 > d()) {
            throw new IllegalArgumentException(String.valueOf(i7));
        }
        int i10 = this.f185e;
        int i11 = 0;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int i13 = i7 < i12 ? i7 : i12;
            int i14 = i12 - i13;
            int i15 = this.f184d;
            int i16 = (((255 >> (8 - i13)) << i14) & bArr[i15]) >> i14;
            i7 -= i13;
            int i17 = i10 + i13;
            this.f185e = i17;
            if (i17 == 8) {
                this.f185e = 0;
                this.f184d = i15 + 1;
            }
            i11 = i16;
        }
        if (i7 > 0) {
            while (i7 >= 8) {
                int i18 = i11 << 8;
                int i19 = this.f184d;
                int i20 = i18 | (bArr[i19] & 255);
                this.f184d = i19 + 1;
                i7 -= 8;
                i11 = i20;
            }
            if (i7 > 0) {
                int i21 = 8 - i7;
                int i22 = ((bArr[this.f184d] & ((255 >> i21) << i21)) >> i21) | (i11 << i7);
                this.f185e += i7;
                return i22;
            }
        }
        return i11;
    }

    public synchronized int h() {
        PackageInfo packageInfo;
        if (this.f184d == 0) {
            try {
                packageInfo = hf.c.a((Context) this.f186i).f10726a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f184d = packageInfo.versionCode;
            }
        }
        return this.f184d;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0025, B:14:0x0030, B:16:0x0037, B:18:0x0049, B:26:0x006a, B:21:0x0050, B:23:0x0063, B:29:0x006e, B:33:0x007d), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    public synchronized int i() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i7 = this.f185e;
        if (i7 != 0) {
            return i7;
        }
        Context context = (Context) this.f186i;
        PackageManager packageManager = context.getPackageManager();
        if (hf.c.a(context).f10726a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (ff.c.c()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != ff.c.c()) {
                i10 = 2;
            }
            this.f185e = i10;
            return i10;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != ff.c.c()) {
                    i10 = 2;
                }
                this.f185e = i10;
                return i10;
            }
            i10 = 2;
        }
        this.f185e = i10;
        return i10;
    }

    public g(int i7) {
        switch (i7) {
            case 3:
                this.f186i = new g[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
                this.f184d = 0;
                this.f185e = 0;
                break;
            default:
                this.f186i = new e4.l(7);
                this.f184d = 8000;
                this.f185e = 8000;
                break;
        }
    }
}
