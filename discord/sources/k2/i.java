package k2;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final Object j = new Object();
    public static volatile i k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f14233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.f f14234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f14235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f14236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a5.a f14237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f14238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k8.a f14239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f14241i;

    public i(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f14233a = reentrantReadWriteLock;
        this.f14235c = 3;
        h hVar = (h) qVar.f14231b;
        this.f14238f = hVar;
        int i7 = qVar.f14230a;
        this.f14240h = i7;
        this.f14241i = (c) qVar.f14232c;
        this.f14236d = new Handler(Looper.getMainLooper());
        this.f14234b = new s.f(0);
        this.f14239g = new k8.a();
        a5.a aVar = new a5.a(this);
        this.f14237e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f14235c = 0;
            } catch (Throwable th2) {
                this.f14233a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.O(new d(aVar));
            } catch (Throwable th3) {
                d(th3);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (j) {
            try {
                iVar = k;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public final int b() {
        this.f14233a.readLock().lock();
        try {
            return this.f14235c;
        } finally {
            this.f14233a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f14240h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f14233a.writeLock().lock();
        try {
            if (this.f14235c == 0) {
                this.f14233a.writeLock().unlock();
                return;
            }
            this.f14235c = 0;
            this.f14233a.writeLock().unlock();
            a5.a aVar = this.f14237e;
            i iVar = (i) aVar.f143a;
            try {
                iVar.f14238f.O(new d(aVar));
            } catch (Throwable th2) {
                iVar.d(th2);
            }
        } catch (Throwable th3) {
            this.f14233a.writeLock().unlock();
            throw th3;
        }
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f14233a.writeLock().lock();
        try {
            this.f14235c = 2;
            arrayList.addAll(this.f14234b);
            this.f14234b.clear();
            this.f14233a.writeLock().unlock();
            this.f14236d.post(new com.google.android.material.datepicker.g(arrayList, this.f14235c, th2));
        } catch (Throwable th3) {
            this.f14233a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[Catch: all -> 0x0087, TryCatch #2 {all -> 0x0087, blocks: (B:32:0x005f, B:35:0x0064, B:37:0x0068, B:39:0x0075, B:46:0x0094, B:48:0x009e, B:50:0x00a1, B:52:0x00a4, B:54:0x00b4, B:55:0x00b7), top: B:98:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4 A[Catch: all -> 0x0087, TryCatch #2 {all -> 0x0087, blocks: (B:32:0x005f, B:35:0x0064, B:37:0x0068, B:39:0x0075, B:46:0x0094, B:48:0x009e, B:50:0x00a1, B:52:0x00a4, B:54:0x00b4, B:55:0x00b7), top: B:98:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    public final CharSequence e(CharSequence charSequence, int i7, int i10) throws Throwable {
        Throwable th2;
        CharSequence charSequence2;
        int i11;
        int i12;
        v[] vVarArr;
        int spanStart;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        yk.a.a("start should be <= than end", i7 <= i10);
        x xVar = null;
        if (charSequence == null) {
            return null;
        }
        yk.a.a("start should be < than charSequence length", i7 <= charSequence.length());
        yk.a.a("end should be < than charSequence length", i10 <= charSequence.length());
        if (charSequence.length() == 0 || i7 == i10) {
            return charSequence;
        }
        e4.m mVar = (e4.m) this.f14237e.f144b;
        mVar.getClass();
        boolean z5 = charSequence instanceof t;
        if (z5) {
            ((t) charSequence).a();
        }
        if (z5) {
            xVar = new x((Spannable) charSequence);
            if (xVar != null) {
                for (v vVar : vVarArr) {
                    spanStart = xVar.f14275e.getSpanStart(vVar);
                    int spanEnd = xVar.f14275e.getSpanEnd(vVar);
                    if (spanStart != i10) {
                        xVar.removeSpan(vVar);
                    }
                    i7 = Math.min(spanStart, i7);
                    i10 = Math.max(spanEnd, i10);
                }
            }
            i11 = i7;
            i12 = i10;
            if (i11 != i12) {
                charSequence2 = charSequence;
                if (!z5) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z5) {
                    return charSequence2;
                }
            }
            ((t) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    xVar = new x((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z5) {
                        throw th2;
                    }
                    ((t) charSequence2).b();
                    throw th2;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i7 - 1, i10 + 1, v.class) <= i10) {
                xVar = new x();
                xVar.f14274d = false;
                xVar.f14275e = new SpannableString(charSequence);
            }
            if (xVar != null && (vVarArr = (v[]) xVar.f14275e.getSpans(i7, i10, v.class)) != null && vVarArr.length > 0) {
                while (i < r5) {
                    spanStart = xVar.f14275e.getSpanStart(vVar);
                    int spanEnd2 = xVar.f14275e.getSpanEnd(vVar);
                    if (spanStart != i10) {
                        xVar.removeSpan(vVar);
                    }
                    i7 = Math.min(spanStart, i7);
                    i10 = Math.max(spanEnd2, i10);
                }
            }
            i11 = i7;
            i12 = i10;
            if (i11 != i12 || i11 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z5) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        x xVar2 = (x) mVar.G(charSequence2, i11, i12, Integer.MAX_VALUE, false, new e4.e(12, xVar, (k8.a) mVar.f7993e));
                        if (xVar2 != null) {
                            Spannable spannable = xVar2.f14275e;
                            if (z5) {
                                ((t) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z5) {
                            return charSequence2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        if (!z5) {
                            throw th2;
                        }
                        ((t) charSequence2).b();
                        throw th2;
                    }
                } catch (Throwable th5) {
                    charSequence2 = charSequence;
                    th2 = th5;
                }
            }
            ((t) charSequence2).b();
            return charSequence2;
        } catch (Throwable th6) {
            th2 = th6;
            charSequence2 = charSequence;
        }
        if (!z5) {
            throw th2;
        }
        ((t) charSequence2).b();
        throw th2;
    }

    public final void f(g gVar) {
        yk.a.d(gVar, "initCallback cannot be null");
        this.f14233a.writeLock().lock();
        try {
            if (this.f14235c == 1 || this.f14235c == 2) {
                this.f14236d.post(new com.google.android.material.datepicker.g(Arrays.asList(gVar), this.f14235c, (Throwable) null));
            } else {
                this.f14234b.add(gVar);
            }
        } finally {
            this.f14233a.writeLock().unlock();
        }
    }
}
