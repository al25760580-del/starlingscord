package pa;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import androidx.core.text.PrecomputedTextCompat;
import com.discord.chat.presentation.message.view.a0;
import com.facebook.common.references.CloseableReference;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class s implements w, t2.b, com.reactnativecommunity.webview.p, ec.a, g5.b, ib.b, io.sentry.util.runtime.b, od.m, th.g, qm.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static s f17829d;

    public static CloseableReference k(CloseableReference closeableReference) {
        CloseableReference closeableReferenceG;
        try {
            if (CloseableReference.z(closeableReference)) {
                Intrinsics.checkNotNull(closeableReference);
                if (closeableReference.q() instanceof na.d) {
                    Object objQ = closeableReference.q();
                    Intrinsics.checkNotNull(objQ, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                    na.g gVar = (na.g) ((na.d) objQ);
                    synchronized (gVar) {
                        closeableReferenceG = CloseableReference.g(gVar.f16527v);
                    }
                    closeableReference.close();
                    return closeableReferenceG;
                }
            }
            CloseableReference.l(closeableReference);
            return null;
        } catch (Throwable th2) {
            CloseableReference.l(closeableReference);
            throw th2;
        }
    }

    public static synchronized s l() {
        try {
            if (f17829d == null) {
                f17829d = new s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f17829d;
    }

    public static boolean m(m2.b bVar, Editable editable, int i7, int i10, boolean z5) {
        int iMin;
        if (editable != null && i7 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z5) {
                    int iMax = Math.max(i7, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z6 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z6) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z6) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z6 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i10, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z7 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z7) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z7) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z7 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i7, 0);
                    iMin = Math.min(selectionEnd + i10, editable.length());
                }
                k2.v[] vVarArr = (k2.v[]) editable.getSpans(selectionStart, iMin, k2.v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (k2.v vVar : vVarArr) {
                        int spanStart = editable.getSpanStart(vVar);
                        int spanEnd = editable.getSpanEnd(vVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // th.g
    public /* synthetic */ Object a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new i1.j(1));
        e4.f.d(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    @Override // ec.a
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // io.sentry.util.runtime.b
    public void c(a0 a0Var) {
        a0Var.run();
    }

    @Override // od.m
    public long d() {
        throw new NoSuchElementException();
    }

    @Override // od.m
    public long f() {
        throw new NoSuchElementException();
    }

    @Override // qm.a
    public String g() {
        return "onDidDisappear";
    }

    @Override // qm.a
    public String getEventName() {
        return "topDidDisappear";
    }

    @Override // io.sentry.util.runtime.b
    public Object h(io.sentry.util.runtime.a aVar) {
        return aVar.run();
    }

    @Override // ib.b
    public boolean i(String str) {
        System.loadLibrary(str);
        return true;
    }

    public ye.e j(Bundle bundle) {
        int i7 = bundle.getInt("error");
        if (i7 == 0) {
            return null;
        }
        bundle.getBoolean("is.error.remediable");
        return new wh.b(i7, null);
    }

    public boolean n(CharSequence charSequence) {
        return charSequence instanceof PrecomputedTextCompat;
    }

    @Override // od.m
    public boolean next() {
        return false;
    }

    public List o(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (mi.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f15799a;
            if (str != null) {
                bVar = new mi.b(str, bVar.f15800b, bVar.f15801c, bVar.f15802d, bVar.f15803e, new bc.i(15, str, bVar), bVar.f15805g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // g5.b
    public void e() {
    }
}
