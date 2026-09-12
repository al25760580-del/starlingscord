package sh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.discord.js_watchdog.SharedPreferencesKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a5.o f20229h = new a5.o("FakeAssetPackService", 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f20230i = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f20232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f20233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f20234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f20235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f20236f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final th.f f20237g;

    public x0(File file, p pVar, p0 p0Var, Context context, h1 h1Var, th.f fVar, g1 g1Var) {
        this.f20231a = file.getAbsolutePath();
        this.f20232b = pVar;
        this.f20233c = p0Var;
        this.f20234d = h1Var;
        this.f20237g = fVar;
        this.f20235e = g1Var;
    }

    public static long h(int i7, long j) {
        if (i7 == 2) {
            return j / 2;
        }
        if (i7 == 3 || i7 == 4) {
            return j;
        }
        return 0L;
    }

    @Override // sh.v1
    public final ig.l a(ArrayList arrayList, HashMap map) {
        f20229h.d("startDownload(%s)", arrayList);
        ig.g gVar = new ig.g();
        ((Executor) this.f20237g.a()).execute(new a5.t(this, arrayList, gVar, 13));
        return gVar.f11763a;
    }

    @Override // sh.v1
    public final void b(int i7) {
        f20229h.d("notifySessionFailed", new Object[0]);
    }

    @Override // sh.v1
    public final void c(int i7, String str) {
        f20229h.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f20237g.a()).execute(new androidx.appcompat.widget.u0(this, i7, str));
    }

    @Override // sh.v1
    public final void d(int i7, int i10, String str, String str2) {
        f20229h.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // sh.v1
    public final void e(List list) {
        f20229h.d("cancelDownload(%s)", list);
    }

    @Override // sh.v1
    public final ig.l f(int i7, int i10, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i7), str, str2, Integer.valueOf(i10)};
        a5.o oVar = f20229h;
        oVar.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", objArr);
        ig.g gVar = new ig.g();
        try {
            for (File file : j(str)) {
                if (com.facebook.imagepipeline.nativecode.b.c(file).equals(str2)) {
                    gVar.b(ParcelFileDescriptor.open(file, 268435456));
                    return gVar.f11763a;
                }
            }
            throw new vh.a("Local testing slice for '" + str2 + "' not found.");
        } catch (FileNotFoundException e10) {
            oVar.e("getChunkFileDescriptor failed", e10);
            gVar.a(new vh.a("Asset Slice file not found.", e10));
        } catch (vh.a e11) {
            oVar.e("getChunkFileDescriptor failed", e11);
            gVar.a(e11);
        }
    }

    @Override // sh.v1
    public final ig.l g(HashMap map) {
        f20229h.d("syncPacks()", new Object[0]);
        return a5.l0.v(new ArrayList());
    }

    public final void i(int i7, int i10, String str) {
        Bundle bundle = new Bundle();
        h1 h1Var = this.f20234d;
        bundle.putInt("app_version_code", h1Var.a());
        bundle.putInt(SharedPreferencesKey.SESSION_ID, i7);
        File[] fileArrJ = j(str);
        ArrayList<String> arrayList = new ArrayList<>();
        int length = fileArrJ.length;
        long j = 0;
        int i11 = 0;
        while (i11 < length) {
            File file = fileArrJ[i11];
            long length2 = j + file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i10 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strC = com.facebook.imagepipeline.nativecode.b.c(file);
            bundle.putParcelableArrayList(sa.a.d("chunk_intents", str, strC), arrayList2);
            try {
                bundle.putString(sa.a.d("uncompressed_hash_sha256", str, strC), a.a(Arrays.asList(file)));
                bundle.putLong(sa.a.d("uncompressed_size", str, strC), file.length());
                arrayList.add(strC);
                i11++;
                j = length2;
            } catch (IOException e10) {
                throw new vh.a(String.format("Could not digest file: %s.", file), e10);
            } catch (NoSuchAlgorithmException e11) {
                throw new vh.a("SHA256 algorithm not supported.", e11);
            }
        }
        bundle.putStringArrayList(sa.a.a("slice_ids", str), arrayList);
        bundle.putLong(sa.a.a("pack_version", str), h1Var.a());
        bundle.putInt(sa.a.a("status", str), i10);
        bundle.putInt(sa.a.a("error_code", str), 0);
        bundle.putLong(sa.a.a("bytes_downloaded", str), h(i10, j));
        bundle.putLong(sa.a.a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", h(i10, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f20236f.post(new com.google.android.gms.internal.play_billing.u0(19, this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    public final File[] j(String str) {
        File file = new File(this.f20231a);
        if (!file.isDirectory()) {
            throw new vh.a(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new ob.a(str, 1));
        if (fileArrListFiles == null) {
            throw new vh.a(s0.g.e("Failed fetching APKs for pack '", str, "'."));
        }
        if (fileArrListFiles.length == 0) {
            throw new vh.a(s0.g.e("No APKs available for pack '", str, "'."));
        }
        for (File file2 : fileArrListFiles) {
            if (com.facebook.imagepipeline.nativecode.b.c(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new vh.a(s0.g.e("No main slice available for pack '", str, "'."));
    }

    @Override // sh.v1
    public final void f() {
        f20229h.d("keepAlive", new Object[0]);
    }
}
