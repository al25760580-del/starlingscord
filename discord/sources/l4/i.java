package l4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f14865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f14866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f14868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f14869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArrayCompat f14870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s.k f14871i;
    public ArrayList j;
    public Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f14873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14875o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f14863a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f14864b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14876p = 0;

    public final void a(String str) {
        x4.c.b(str);
        this.f14864b.add(str);
    }

    public final float b() {
        return (long) (((this.f14873m - this.f14872l) / this.f14874n) * 1000.0f);
    }

    public final Map c() {
        float fC = x4.h.c();
        if (fC != this.f14867e) {
            for (Map.Entry entry : this.f14866d.entrySet()) {
                HashMap map = this.f14866d;
                String str = (String) entry.getKey();
                x xVar = (x) entry.getValue();
                float f2 = this.f14867e / fC;
                int i7 = (int) (xVar.f14937a * f2);
                int i10 = (int) (xVar.f14938b * f2);
                x xVar2 = new x(i7, xVar.f14939c, i10, xVar.f14940d, xVar.f14941e);
                Bitmap bitmap = xVar.f14942f;
                if (bitmap != null) {
                    xVar2.f14942f = Bitmap.createScaledBitmap(bitmap, i7, i10, true);
                }
                map.put(str, xVar2);
            }
        }
        this.f14867e = fC;
        return this.f14866d;
    }

    public final q4.h d(String str) {
        int size = this.f14869g.size();
        for (int i7 = 0; i7 < size; i7++) {
            q4.h hVar = (q4.h) this.f14869g.get(i7);
            String str2 = hVar.f18626a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb2.append(((t4.e) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}
