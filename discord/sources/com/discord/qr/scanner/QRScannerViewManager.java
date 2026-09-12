package com.discord.qr.scanner;

import com.discord.age_assurance.DigitalCredentialModule;
import com.discord.qr.scanner.events.OnQRCodeFoundEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.runtime.p;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.DCDQRScannerManagerDelegate;
import com.facebook.react.viewmanagers.DCDQRScannerManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import m7.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = QRScannerViewManager.NAME)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/qr/scanner/QRScannerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/qr/scanner/QRScanner;", "Lcom/facebook/react/viewmanagers/DCDQRScannerManagerInterface;", "<init>", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "delegate", "Lcom/facebook/react/viewmanagers/DCDQRScannerManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "Companion", "qr_scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QRScannerViewManager extends ViewGroupManager<QRScanner> implements DCDQRScannerManagerInterface<QRScanner> {

    @NotNull
    public static final String NAME = "DCDQRScanner";

    @NotNull
    private final DCDQRScannerManagerDelegate<QRScanner, QRScannerViewManager> delegate;

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public QRScannerViewManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.reactEvents = new ReactEvents(new Pair("onQRCodeFound", Reflection.getOrCreateKotlinClass(OnQRCodeFoundEvent.class)));
        this.delegate = new DCDQRScannerManagerDelegate<>(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2$lambda$0(QRScannerViewManager qRScannerViewManager, QRScanner qRScanner, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        qRScannerViewManager.reactEvents.emitEvent(qRScanner, new OnQRCodeFoundEvent("SUCCEEDED", code));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2$lambda$1(QRScannerViewManager qRScannerViewManager, QRScanner qRScanner) {
        qRScannerViewManager.reactEvents.emitEvent(qRScanner, new OnQRCodeFoundEvent(DigitalCredentialModule.CODE_FAILED, null));
        return Unit.f14616a;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public QRScanner createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        QRScanner qRScanner = new QRScanner(reactContext, null, 0, 6, null);
        qRScanner.setOnCodeFound(new p(4, this, qRScanner));
        qRScanner.setOnCodeNotFound(new a(0, this, qRScanner));
        return qRScanner;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDQRScannerManagerDelegate<QRScanner, QRScannerViewManager> getDelegate() {
        return this.delegate;
    }
}
