package k4;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.RNLog;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import l4.f0;
import l4.g0;
import l4.h0;
import l4.v;
import l4.z;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Function1 f14289s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f14290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView.ScaleType f14293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f14295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f14296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ReadableArray f14297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ReadableArray f14298i;
    public f0 j;
    public Integer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f14299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f14300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f14301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f14302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f14303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f14304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Float f14305r;

    public i(l4.h view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f14290a = new WeakReference(view);
        view.setFontAssetDelegate(new h(view));
    }

    public final void a() {
        int iIntValue;
        Collection collectionF0;
        Object objO;
        String str;
        l4.h hVar = (l4.h) this.f14290a.get();
        if (hVar == null) {
            return;
        }
        v vVar = hVar.f14857w;
        ReadableArray readableArray = this.f14298i;
        if (readableArray != null && readableArray.size() > 0) {
            h0 h0Var = new h0(hVar);
            int size = readableArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                ReadableMap map = readableArray.getMap(i7);
                if (map != null) {
                    h0Var.f14860a.put(map.getString("find"), map.getString("replace"));
                    l4.h hVar2 = h0Var.f14861b;
                    if (hVar2 != null) {
                        hVar2.invalidate();
                    }
                }
            }
            hVar.setTextDelegate(h0Var);
        }
        String str2 = this.f14299l;
        if (str2 != null) {
            hVar.e(new ByteArrayInputStream(str2.getBytes()), String.valueOf(str2.hashCode()));
            this.f14299l = null;
        }
        String str3 = this.f14300m;
        if (str3 != null) {
            File file = new File(str3);
            if (file.exists()) {
                hVar.e(new FileInputStream(file), String.valueOf(str3.hashCode()));
            } else {
                hVar.g(str3, String.valueOf(str3.hashCode()));
            }
            this.f14300m = null;
        }
        String str4 = this.f14301n;
        if (str4 != null) {
            Function1 function1 = f14289s;
            if (function1 != null && (str = (String) function1.invoke(str4)) != null) {
                str4 = str;
            }
            File file2 = new File(str4);
            if (file2.exists()) {
                hVar.f(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str4.hashCode()));
                this.f14301n = null;
                return;
            }
            try {
                q qVar = Result.f14614e;
                objO = Uri.parse(str4).getScheme();
            } catch (Throwable th2) {
                q qVar2 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            if (objO instanceof r) {
                objO = null;
            }
            String str5 = (String) objO;
            if (str5 != null) {
                if (Intrinsics.areEqual(str5, "file")) {
                    String path = Uri.parse(str4).getPath();
                    if (path != null) {
                        hVar.f(new ZipInputStream(new FileInputStream(new File(path))), String.valueOf(str4.hashCode()));
                    } else {
                        Log.w("lottie-react-native", "URI path is null for asset: ".concat(str4));
                    }
                } else {
                    hVar.setAnimationFromUrl(str4);
                }
                this.f14301n = null;
                return;
            }
            int identifier = hVar.getResources().getIdentifier(str4, "raw", hVar.getContext().getPackageName());
            if (identifier == 0) {
                RNLog.e("Animation for " + str4 + " was not found in raw resources");
                return;
            }
            hVar.setAnimation(identifier);
            this.f14291b = false;
            this.f14301n = null;
        }
        if (this.f14291b) {
            hVar.setAnimation(this.f14292c);
            this.f14291b = false;
        }
        Float f2 = this.f14302o;
        if (f2 != null) {
            hVar.setProgress(f2.floatValue());
            this.f14302o = null;
        }
        Boolean bool = this.f14303p;
        if (bool != null) {
            hVar.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.f14303p = null;
        }
        Boolean bool2 = this.f14304q;
        if (bool2 != null && bool2.booleanValue() && !vVar.j()) {
            hVar.playAnimation();
        }
        Float f7 = this.f14305r;
        if (f7 != null) {
            hVar.setSpeed(f7.floatValue());
            this.f14305r = null;
        }
        ImageView.ScaleType scaleType = this.f14293d;
        if (scaleType != null) {
            hVar.setScaleType(scaleType);
            this.f14293d = null;
        }
        f0 f0Var = this.j;
        if (f0Var != null) {
            hVar.setRenderMode(f0Var);
            this.j = null;
        }
        Integer num = this.k;
        if (num != null) {
            hVar.setLayerType(num.intValue(), null);
        }
        String str6 = this.f14294e;
        if (str6 != null) {
            hVar.setImageAssetsFolder(str6);
            this.f14294e = null;
        }
        Boolean bool3 = this.f14295f;
        if (bool3 != null) {
            hVar.d(bool3.booleanValue());
            this.f14295f = null;
        }
        Boolean bool4 = this.f14296g;
        if (bool4 != null) {
            hVar.setSafeMode(bool4.booleanValue());
            this.f14296g = null;
        }
        ReadableArray readableArray2 = this.f14297h;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        int size2 = readableArray2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ReadableMap map2 = readableArray2.getMap(i10);
            if (map2 != null) {
                if (map2.getType(ViewProps.COLOR) == ReadableType.Map) {
                    ReadableMap map3 = map2.getMap(ViewProps.COLOR);
                    Context context = hVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Integer color = ColorPropConverter.getColor(map3, context);
                    iIntValue = color != null ? color.intValue() : 0;
                } else {
                    iIntValue = map2.getInt(ViewProps.COLOR);
                }
                String strJ = kk.b.j(map2.getString("keypath"), ".**");
                String strQuote = Pattern.quote(".");
                Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
                List listF = new Regex(strQuote).f(strJ);
                if (listF.isEmpty()) {
                    collectionF0 = n0.f14659d;
                    break;
                }
                ListIterator listIterator = listF.listIterator(listF.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collectionF0 = CollectionsKt.f0(listF, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        collectionF0 = n0.f14659d;
                        break;
                    }
                }
                String[] strArr = (String[]) collectionF0.toArray(new String[0]);
                vVar.a(new q4.e((String[]) Arrays.copyOf(strArr, strArr.length)), z.F, new e4.c(new g0(iIntValue)));
            }
        }
    }
}
