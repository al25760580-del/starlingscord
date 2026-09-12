package com.discord.qr.scanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.discord.crash_reporting.CrashReporting;
import com.discord.qr.scanner.databinding.QrScannerBinding;
import com.discord.theme.utils.ColorUtilsKt;
import com.google.zxing.Result;
import f6.a;
import h5.k;
import h5.n;
import h5.o;
import h5.p;
import ij.c;
import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R.\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/discord/qr/scanner/QRScanner;", "Landroid/widget/FrameLayout;", "Lh5/k;", "Lh5/p;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "requestLayout", "()V", "onDetachedFromWindow", "onAttachedToWindow", "Lcom/google/zxing/Result;", "result", "onDecoded", "(Lcom/google/zxing/Result;)V", "", "thrown", "onError", "(Ljava/lang/Throwable;)V", "Lcom/discord/qr/scanner/databinding/QrScannerBinding;", "binding", "Lcom/discord/qr/scanner/databinding/QrScannerBinding;", "Lcom/budiyev/android/codescanner/CodeScanner;", "codeScanner", "Lcom/budiyev/android/codescanner/CodeScanner;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Lkotlin/Function1;", "", "onCodeFound", "Lkotlin/jvm/functions/Function1;", "getOnCodeFound", "()Lkotlin/jvm/functions/Function1;", "setOnCodeFound", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onCodeNotFound", "Lkotlin/jvm/functions/Function0;", "getOnCodeNotFound", "()Lkotlin/jvm/functions/Function0;", "setOnCodeNotFound", "(Lkotlin/jvm/functions/Function0;)V", "qr_scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQRScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRScanner.kt\ncom/discord/qr/scanner/QRScanner\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,79:1\n257#2,2:80\n*S KotlinDebug\n*F\n+ 1 QRScanner.kt\ncom/discord/qr/scanner/QRScanner\n*L\n38#1:80,2\n*E\n"})
public final class QRScanner extends FrameLayout implements k, p {

    @NotNull
    private final QrScannerBinding binding;

    @NotNull
    private final CodeScanner codeScanner;

    @NotNull
    private Function1<? super String, Unit> onCodeFound;

    @NotNull
    private Function0<Unit> onCodeNotFound;

    @NotNull
    private final Runnable runnable;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRScanner(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCodeFound$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    @NotNull
    public final Function1<String, Unit> getOnCodeFound() {
        return this.onCodeFound;
    }

    @NotNull
    public final Function0<Unit> getOnCodeNotFound() {
        return this.onCodeNotFound;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.codeScanner.h();
    }

    @Override // h5.k
    public void onDecoded(@NotNull Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String str = result.f6648a;
        if (str == null || !URLUtil.isValidUrl(str)) {
            this.onCodeNotFound.invoke();
        } else {
            this.onCodeFound.invoke(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.codeScanner.b();
    }

    @Override // h5.p
    public void onError(@NotNull Throwable thrown) {
        Intrinsics.checkNotNullParameter(thrown, "thrown");
        CrashReporting.captureException$default(CrashReporting.INSTANCE, thrown, false, 2, null);
        this.onCodeNotFound.invoke();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.runnable);
    }

    public final void setOnCodeFound(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onCodeFound = function1;
    }

    public final void setOnCodeNotFound(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCodeNotFound = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRScanner(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ QRScanner(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRScanner(@NotNull Context context, AttributeSet attributeSet, int i7) {
        o oVar;
        o oVar2;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        QrScannerBinding qrScannerBindingInflate = QrScannerBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(qrScannerBindingInflate, "inflate(...)");
        this.binding = qrScannerBindingInflate;
        CodeScannerView codeScannerView = qrScannerBindingInflate.qrScanner;
        CodeScanner codeScanner = new CodeScanner(context, codeScannerView);
        this.codeScanner = codeScanner;
        this.runnable = new io.sentry.android.core.p(21, this);
        this.onCodeFound = new a(15);
        this.onCodeNotFound = new i5.a(20);
        qrScannerBindingInflate.getRoot().setBackgroundColor(-16777216);
        CodeScannerView qrScanner = qrScannerBindingInflate.qrScanner;
        Intrinsics.checkNotNullExpressionValue(qrScanner, "qrScanner");
        qrScanner.setVisibility(0);
        qrScannerBindingInflate.qrScanner.setFrameColor(ColorUtilsKt.getColorCompat(context, com.discord.theme.R.color.brand));
        synchronized (codeScanner.f3891a) {
            try {
                if (codeScanner.f3911w != -1) {
                    codeScanner.f3911w = -1;
                    if (codeScanner.f3907s) {
                        boolean z5 = codeScanner.f3913y;
                        codeScanner.b();
                        if (z5) {
                            codeScanner.a(codeScannerView.getWidth(), codeScannerView.getHeight());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        List list = CodeScanner.H;
        synchronized (codeScanner.f3891a) {
            try {
                Objects.requireNonNull(list);
                codeScanner.f3902n = list;
                if (codeScanner.f3907s && (oVar2 = codeScanner.f3905q) != null) {
                    n nVar = oVar2.f10366b;
                    EnumMap enumMap = nVar.f10360d;
                    enumMap.put(c.f11795e, list);
                    nVar.f10357a.c(enumMap);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (codeScanner.f3891a) {
            try {
                codeScanner.f3903o = this;
                if (codeScanner.f3907s && (oVar = codeScanner.f3905q) != null) {
                    oVar.f10366b.f10362f = this;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        codeScanner.f3904p = this;
    }
}
