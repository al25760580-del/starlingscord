package l4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.discord.R;
import com.facebook.react.uimanager.ThemedReactContext;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.appcompat.widget.y {
    public static final d K = new d();
    public boolean E;
    public boolean F;
    public boolean G;
    public final HashSet H;
    public final HashSet I;
    public c0 J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f14853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f14854e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f14855i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v f14857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f14858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14859y;

    public h(ThemedReactContext themedReactContext) {
        String string;
        super(themedReactContext);
        this.f14853d = new g(this, 1);
        this.f14854e = new g(this, 0);
        this.f14856v = 0;
        v vVar = new v();
        this.f14857w = vVar;
        this.E = false;
        this.F = false;
        this.G = true;
        HashSet hashSet = new HashSet();
        this.H = hashSet;
        this.I = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, e0.f14839a, R.attr.lottieAnimationViewStyle, 0);
        this.G = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.F = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(12, false)) {
            vVar.f14919e.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(11));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(13);
        float f2 = typedArrayObtainStyledAttributes.getFloat(13, 0.0f);
        if (zHasValue4) {
            hashSet.add(f.f14841e);
        }
        vVar.v(f2);
        d(typedArrayObtainStyledAttributes.getBoolean(7, false));
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            vVar.a(new q4.e("**"), z.F, new e4.c(new g0(y0.b.c(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i7 = typedArrayObtainStyledAttributes.getInt(15, 0);
            setRenderMode(f0.values()[i7 >= f0.values().length ? 0 : i7]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
            setAsyncUpdates(a.values()[i10 >= f0.values().length ? 0 : i10]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(c0 c0Var) {
        a0 a0Var = c0Var.f14828d;
        v vVar = this.f14857w;
        if (a0Var != null && vVar == getDrawable() && vVar.f14917d == a0Var.f14820a) {
            return;
        }
        this.H.add(f.f14840d);
        this.f14857w.d();
        a();
        c0Var.b(this.f14853d);
        c0Var.a(this.f14854e);
        this.J = c0Var;
    }

    public final void a() {
        c0 c0Var = this.J;
        if (c0Var != null) {
            g gVar = this.f14853d;
            synchronized (c0Var) {
                c0Var.f14825a.remove(gVar);
            }
            c0 c0Var2 = this.J;
            g gVar2 = this.f14854e;
            synchronized (c0Var2) {
                c0Var2.f14826b.remove(gVar2);
            }
        }
    }

    public final void d(boolean z5) {
        v vVar = this.f14857w;
        HashSet hashSet = (HashSet) vVar.K.f9547e;
        w wVar = w.f14935d;
        boolean zAdd = z5 ? hashSet.add(wVar) : hashSet.remove(wVar);
        if (vVar.f14917d == null || !zAdd) {
            return;
        }
        vVar.c();
    }

    public final void e(InputStream inputStream, String str) {
        setCompositionTask(m.a(str, new com.facebook.react.runtime.o(11, inputStream, str), new io.sentry.android.core.p(16, inputStream)));
    }

    public final void f(ZipInputStream zipInputStream, String str) {
        setCompositionTask(m.a(str, new com.facebook.react.runtime.o(12, zipInputStream, str), new io.sentry.android.core.p(17, zipInputStream)));
    }

    public final void g(String str, String str2) {
        setCompositionTask(m.a(str2, new j(getContext(), str, str2, 0), null));
    }

    public a getAsyncUpdates() {
        a aVar = this.f14857w.f14924i0;
        return aVar != null ? aVar : a.f14817d;
    }

    public boolean getAsyncUpdatesEnabled() {
        a aVar = this.f14857w.f14924i0;
        if (aVar == null) {
            aVar = a.f14817d;
        }
        return aVar == a.f14818e;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f14857w.S;
    }

    public boolean getClipToCompositionBounds() {
        return this.f14857w.M;
    }

    public i getComposition() {
        Drawable drawable = getDrawable();
        v vVar = this.f14857w;
        if (drawable == vVar) {
            return vVar.f14917d;
        }
        return null;
    }

    public long getDuration() {
        i composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f14857w.f14919e.E;
    }

    public String getImageAssetsFolder() {
        return this.f14857w.E;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f14857w.L;
    }

    public float getMaxFrame() {
        return this.f14857w.f14919e.e();
    }

    public float getMinFrame() {
        return this.f14857w.f14919e.f();
    }

    public d0 getPerformanceTracker() {
        i iVar = this.f14857w.f14917d;
        if (iVar != null) {
            return iVar.f14863a;
        }
        return null;
    }

    public float getProgress() {
        return this.f14857w.f14919e.d();
    }

    public f0 getRenderMode() {
        return this.f14857w.U ? f0.f14849i : f0.f14848e;
    }

    public int getRepeatCount() {
        return this.f14857w.f14919e.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f14857w.f14919e.getRepeatMode();
    }

    public float getSpeed() {
        return this.f14857w.f14919e.f22630v;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof v) {
            boolean z5 = ((v) drawable).U;
            f0 f0Var = f0.f14849i;
            if ((z5 ? f0Var : f0.f14848e) == f0Var) {
                this.f14857w.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        v vVar = this.f14857w;
        if (drawable2 == vVar) {
            super.invalidateDrawable(vVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.F) {
            return;
        }
        this.f14857w.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i7;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f14858x = eVar.f14832d;
        HashSet hashSet = this.H;
        f fVar = f.f14840d;
        if (!hashSet.contains(fVar) && !TextUtils.isEmpty(this.f14858x)) {
            setAnimation(this.f14858x);
        }
        this.f14859y = eVar.f14833e;
        if (!hashSet.contains(fVar) && (i7 = this.f14859y) != 0) {
            setAnimation(i7);
        }
        if (!hashSet.contains(f.f14841e)) {
            this.f14857w.v(eVar.f14834i);
        }
        if (!hashSet.contains(f.f14845x) && eVar.f14835v) {
            playAnimation();
        }
        if (!hashSet.contains(f.f14844w)) {
            setImageAssetsFolder(eVar.f14836w);
        }
        if (!hashSet.contains(f.f14842i)) {
            setRepeatMode(eVar.f14837x);
        }
        if (hashSet.contains(f.f14843v)) {
            return;
        }
        setRepeatCount(eVar.f14838y);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z5;
        e eVar = new e(super.onSaveInstanceState());
        eVar.f14832d = this.f14858x;
        eVar.f14833e = this.f14859y;
        v vVar = this.f14857w;
        x4.e eVar2 = vVar.f14919e;
        x4.e eVar3 = vVar.f14919e;
        eVar.f14834i = eVar2.d();
        if (vVar.isVisible()) {
            z5 = eVar3.J;
        } else {
            int i7 = vVar.f14930o0;
            z5 = i7 == 2 || i7 == 3;
        }
        eVar.f14835v = z5;
        eVar.f14836w = vVar.E;
        eVar.f14837x = eVar3.getRepeatMode();
        eVar.f14838y = eVar3.getRepeatCount();
        return eVar;
    }

    public final void playAnimation() {
        this.H.add(f.f14845x);
        this.f14857w.l();
    }

    public void setAnimation(final int i7) {
        c0 c0VarA;
        this.f14859y = i7;
        final String str = null;
        this.f14858x = null;
        if (isInEditMode()) {
            c0VarA = new c0(new f4.f(i7, 1, this), true);
        } else if (this.G) {
            Context context = getContext();
            final String strJ = m.j(context, i7);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            c0VarA = m.a(strJ, new Callable() { // from class: l4.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return m.e(context2, strJ, i7);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap map = m.f14888a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            c0VarA = m.a(null, new Callable() { // from class: l4.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context3 = (Context) weakReference2.get();
                    if (context3 == null) {
                        context3 = applicationContext2;
                    }
                    return m.e(context3, str, i7);
                }
            }, null);
        }
        setCompositionTask(c0VarA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        e(new ByteArrayInputStream(str.getBytes()), null);
    }

    public void setAnimationFromUrl(String str) {
        c0 c0VarA;
        int i7 = 0;
        String str2 = null;
        if (this.G) {
            Context context = getContext();
            HashMap map = m.f14888a;
            String strL = a3.e.l("url_", str);
            c0VarA = m.a(strL, new j(context, str, strL, i7), null);
        } else {
            c0VarA = m.a(null, new j(getContext(), str, str2, i7), null);
        }
        setCompositionTask(c0VarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z5) {
        this.f14857w.R = z5;
    }

    public void setAsyncUpdates(a aVar) {
        this.f14857w.f14924i0 = aVar;
    }

    public void setCacheComposition(boolean z5) {
        this.G = z5;
    }

    public void setClipTextToBoundingBox(boolean z5) {
        v vVar = this.f14857w;
        if (z5 != vVar.S) {
            vVar.S = z5;
            vVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z5) {
        v vVar = this.f14857w;
        if (z5 != vVar.M) {
            vVar.M = z5;
            t4.c cVar = vVar.N;
            if (cVar != null) {
                cVar.J = z5;
            }
            vVar.invalidateSelf();
        }
    }

    public void setComposition(@NonNull i iVar) {
        v vVar = this.f14857w;
        vVar.setCallback(this);
        boolean z5 = true;
        this.E = true;
        ArrayList arrayList = vVar.f14933x;
        x4.e eVar = vVar.f14919e;
        if (vVar.f14917d == iVar) {
            z5 = false;
        } else {
            vVar.h0 = true;
            vVar.d();
            vVar.f14917d = iVar;
            vVar.c();
            boolean z6 = eVar.I == null;
            eVar.I = iVar;
            if (z6) {
                eVar.k(Math.max(eVar.G, iVar.f14872l), Math.min(eVar.H, iVar.f14873m));
            } else {
                eVar.k((int) iVar.f14872l, (int) iVar.f14873m);
            }
            float f2 = eVar.E;
            eVar.E = 0.0f;
            eVar.f22633y = 0.0f;
            eVar.j((int) f2);
            eVar.c();
            vVar.v(eVar.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar != null) {
                    uVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            iVar.f14863a.f14829a = vVar.P;
            vVar.e();
            Drawable.Callback callback = vVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(vVar);
            }
        }
        if (this.F) {
            vVar.l();
        }
        this.E = false;
        if (getDrawable() != vVar || z5) {
            if (!z5) {
                boolean zJ = vVar.j();
                setImageDrawable(null);
                setImageDrawable(vVar);
                if (zJ) {
                    vVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.I.iterator();
            while (it2.hasNext()) {
                LottieAnimationViewManager.createViewInstance$lambda$1(((k4.b) it2.next()).f14278a, iVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        v vVar = this.f14857w;
        vVar.H = str;
        af.c cVarI = vVar.i();
        if (cVarI != null) {
            cVarI.f395i = str;
        }
    }

    public void setFailureListener(y yVar) {
        this.f14855i = yVar;
    }

    public void setFallbackResource(int i7) {
        this.f14856v = i7;
    }

    public void setFontAssetDelegate(b bVar) {
        v vVar = this.f14857w;
        vVar.I = bVar;
        af.c cVar = vVar.F;
        if (cVar != null) {
            cVar.f398x = bVar;
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        v vVar = this.f14857w;
        if (map == vVar.G) {
            return;
        }
        vVar.G = map;
        vVar.invalidateSelf();
    }

    public void setFrame(int i7) {
        this.f14857w.o(i7);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z5) {
        this.f14857w.f14931v = z5;
    }

    public void setImageAssetDelegate(c cVar) {
        p4.a aVar = this.f14857w.f14934y;
    }

    public void setImageAssetsFolder(String str) {
        this.f14857w.E = str;
    }

    @Override // androidx.appcompat.widget.y, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f14859y = 0;
        this.f14858x = null;
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.y, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f14859y = 0;
        this.f14858x = null;
        a();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.y, android.widget.ImageView
    public void setImageResource(int i7) {
        this.f14859y = 0;
        this.f14858x = null;
        a();
        super.setImageResource(i7);
    }

    public void setMaintainOriginalImageBounds(boolean z5) {
        this.f14857w.L = z5;
    }

    public void setMaxFrame(int i7) {
        this.f14857w.p(i7);
    }

    public void setMaxProgress(float f2) {
        v vVar = this.f14857w;
        i iVar = vVar.f14917d;
        if (iVar == null) {
            vVar.f14933x.add(new r(vVar, f2, 0));
            return;
        }
        x4.e eVar = vVar.f14919e;
        eVar.k(eVar.G, x4.g.e(iVar.f14872l, iVar.f14873m, f2));
    }

    public void setMinAndMaxFrame(String str) {
        this.f14857w.s(str);
    }

    public void setMinFrame(int i7) {
        this.f14857w.t(i7);
    }

    public void setMinProgress(float f2) {
        v vVar = this.f14857w;
        i iVar = vVar.f14917d;
        if (iVar == null) {
            vVar.f14933x.add(new r(vVar, f2, 1));
        } else {
            vVar.t((int) x4.g.e(iVar.f14872l, iVar.f14873m, f2));
        }
    }

    public void setOutlineMasksAndMattes(boolean z5) {
        v vVar = this.f14857w;
        if (vVar.Q == z5) {
            return;
        }
        vVar.Q = z5;
        t4.c cVar = vVar.N;
        if (cVar != null) {
            cVar.r(z5);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z5) {
        v vVar = this.f14857w;
        vVar.P = z5;
        i iVar = vVar.f14917d;
        if (iVar != null) {
            iVar.f14863a.f14829a = z5;
        }
    }

    public void setProgress(float f2) {
        this.H.add(f.f14841e);
        this.f14857w.v(f2);
    }

    public void setRenderMode(f0 f0Var) {
        v vVar = this.f14857w;
        vVar.T = f0Var;
        vVar.e();
    }

    public void setRepeatCount(int i7) {
        this.H.add(f.f14843v);
        this.f14857w.f14919e.setRepeatCount(i7);
    }

    public void setRepeatMode(int i7) {
        this.H.add(f.f14842i);
        this.f14857w.f14919e.setRepeatMode(i7);
    }

    public void setSafeMode(boolean z5) {
        this.f14857w.f14932w = z5;
    }

    public void setSpeed(float f2) {
        this.f14857w.f14919e.f22630v = f2;
    }

    public void setTextDelegate(h0 h0Var) {
        this.f14857w.J = h0Var;
    }

    public void setUseCompositionFrameRate(boolean z5) {
        this.f14857w.f14919e.K = z5;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        v vVar;
        if (!this.E && drawable == (vVar = this.f14857w) && vVar.j()) {
            this.F = false;
            vVar.k();
        } else if (!this.E && (drawable instanceof v)) {
            v vVar2 = (v) drawable;
            if (vVar2.j()) {
                vVar2.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f14857w.q(str);
    }

    public void setMinFrame(String str) {
        this.f14857w.u(str);
    }

    public void setAnimation(String str) {
        c0 c0VarA;
        this.f14858x = str;
        this.f14859y = 0;
        int i7 = 1;
        if (isInEditMode()) {
            c0VarA = new c0(new com.facebook.react.runtime.o(10, this, str), true);
        } else {
            String str2 = null;
            if (this.G) {
                Context context = getContext();
                HashMap map = m.f14888a;
                String strL = a3.e.l("asset_", str);
                c0VarA = m.a(strL, new j(context.getApplicationContext(), str, strL, i7), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = m.f14888a;
                c0VarA = m.a(null, new j(context2.getApplicationContext(), str, str2, i7), null);
            }
        }
        setCompositionTask(c0VarA);
    }
}
