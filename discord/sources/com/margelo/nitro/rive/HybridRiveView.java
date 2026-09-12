package com.margelo.nitro.rive;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.SMIBoolean;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.SMINumber;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.errors.AnimationException;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.MalformedFileException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.margelo.nitro.core.Promise;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0097\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ#\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\bJ)\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b*\u0010+J)\u0010,\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ/\u00106\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u001d2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001d2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000604¢\u0006\u0004\b6\u00107J9\u0010<\u001a\u00020\u0006\"\u0004\b\u0000\u001082\u0006\u00109\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u00002\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0017H\u0002¢\u0006\u0004\b<\u0010=J#\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000604H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\u00062\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000604H\u0002¢\u0006\u0004\bA\u0010BJ\u001b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bK\u0010LJ'\u0010R\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u001d0P2\n\u0010O\u001a\u00060Mj\u0002`NH\u0002¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u0016\u0010_\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR.\u0010c\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR.\u0010i\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010d\u001a\u0004\bj\u0010f\"\u0004\bk\u0010hR.\u0010l\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR*\u0010s\u001a\u00020r2\u0006\u0010 \u001a\u00020r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010D\u001a\u0004\u0018\u00010C8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010I\u001a\u0004\u0018\u00010H8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\bI\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R+\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R7\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010 \u001a\u0005\u0018\u00010\u0089\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R5\u0010\u0091\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\u00060\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0005\b\u0095\u0001\u0010\u001b¨\u0006\u0098\u0001"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveView;", "Lcom/margelo/nitro/rive/HybridRiveViewSpec;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "", "dispose", "()V", "Lcom/margelo/nitro/core/Promise;", "", "awaitViewReady", "()Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "viewModelInstance", "bindViewModelInstance", "(Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;)V", "getViewModelInstance", "()Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "play", "pause", "reset", "playIfNeeded", "Lkotlin/Function1;", "Lcom/margelo/nitro/rive/UnifiedRiveEvent;", "onEvent", "onEventListener", "(Lkotlin/jvm/functions/Function1;)V", "removeEventListeners", "", StackTraceHelper.NAME_KEY, "", "value", "path", "setNumberInputValue", "(Ljava/lang/String;DLjava/lang/String;)V", "getNumberInputValue", "(Ljava/lang/String;Ljava/lang/String;)D", "setBooleanInputValue", "(Ljava/lang/String;ZLjava/lang/String;)V", "getBooleanInputValue", "(Ljava/lang/String;Ljava/lang/String;)Z", "triggerInput", "(Ljava/lang/String;Ljava/lang/String;)V", "setTextRunValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTextRunValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "refreshAfterAssetChange", "afterUpdate", "tag", "note", "Lkotlin/Function0;", "fn", "logged", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "T", "current", "new", "setter", "changed", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "action", "asyncExecuteOnUiThread", "(Lkotlin/jvm/functions/Function0;)Lcom/margelo/nitro/core/Promise;", "executeOnUiThread", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/margelo/nitro/rive/Alignment;", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "convertAlignment", "(Lcom/margelo/nitro/rive/Alignment;)Lapp/rive/runtime/kotlin/core/Alignment;", "Lcom/margelo/nitro/rive/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "convertFit", "(Lcom/margelo/nitro/rive/Fit;)Lapp/rive/runtime/kotlin/core/Fit;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/Pair;", "Lcom/margelo/nitro/rive/RiveErrorType;", "detectErrorType", "(Ljava/lang/Exception;)Lkotlin/Pair;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "Lem/m;", "view", "Lem/m;", "getView", "()Lem/m;", "needsReload", "Z", "dataBindingChanged", "initialUpdate", "Lcom/margelo/nitro/rive/HybridRiveFile;", "registeredFile", "Lcom/margelo/nitro/rive/HybridRiveFile;", "artboardName", "Ljava/lang/String;", "getArtboardName", "()Ljava/lang/String;", "setArtboardName", "(Ljava/lang/String;)V", "stateMachineName", "getStateMachineName", "setStateMachineName", "autoPlay", "Ljava/lang/Boolean;", "getAutoPlay", "()Ljava/lang/Boolean;", "setAutoPlay", "(Ljava/lang/Boolean;)V", "Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "file", "Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "getFile", "()Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "setFile", "(Lcom/margelo/nitro/rive/HybridRiveFileSpec;)V", "Lcom/margelo/nitro/rive/Alignment;", "getAlignment", "()Lcom/margelo/nitro/rive/Alignment;", "setAlignment", "(Lcom/margelo/nitro/rive/Alignment;)V", "Lcom/margelo/nitro/rive/Fit;", "getFit", "()Lcom/margelo/nitro/rive/Fit;", "setFit", "(Lcom/margelo/nitro/rive/Fit;)V", "layoutScaleFactor", "Ljava/lang/Double;", "getLayoutScaleFactor", "()Ljava/lang/Double;", "setLayoutScaleFactor", "(Ljava/lang/Double;)V", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "dataBind", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "getDataBind", "()Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "setDataBind", "(Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;)V", "Lcom/margelo/nitro/rive/RiveError;", "onError", "Lkotlin/jvm/functions/Function1;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "setOnError", "Companion", "com/margelo/nitro/rive/t0", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@SourceDebugExtension({"SMAP\nHybridRiveView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridRiveView.kt\ncom/margelo/nitro/rive/HybridRiveView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
public final class HybridRiveView extends HybridRiveViewSpec {

    @NotNull
    public static final t0 Companion = new t0();

    @NotNull
    private static final String TAG = "HybridRiveView";
    private Alignment alignment;
    private String artboardName;
    private Boolean autoPlay;

    @NotNull
    private final ThemedReactContext context;
    private Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName dataBind;
    private boolean dataBindingChanged;

    @NotNull
    private HybridRiveFileSpec file;
    private Fit fit;
    private boolean initialUpdate;
    private Double layoutScaleFactor;
    private boolean needsReload;

    @NotNull
    private Function1<? super RiveError, Unit> onError;
    private HybridRiveFile registeredFile;
    private String stateMachineName;

    @NotNull
    private final em.m view;

    public HybridRiveView(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.view = new em.m(context);
        this.initialUpdate = true;
        this.file = new HybridRiveFile();
        this.onError = new com.discord.user_search_worker.a(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_artboardName_$lambda$0(HybridRiveView hybridRiveView, String str) {
        hybridRiveView.artboardName = str;
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_autoPlay_$lambda$2(HybridRiveView hybridRiveView, Boolean bool) {
        hybridRiveView.autoPlay = bool;
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_file_$lambda$3(HybridRiveView hybridRiveView, HybridRiveFileSpec it) {
        Intrinsics.checkNotNullParameter(it, "it");
        hybridRiveView.file = it;
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_stateMachineName_$lambda$1(HybridRiveView hybridRiveView, String str) {
        hybridRiveView.stateMachineName = str;
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit afterUpdate$lambda$11(HybridRiveView hybridRiveView) {
        File riveFile;
        Float fValueOf;
        String byName;
        ViewModelInstance viewModelInstance;
        HybridRiveFileSpec file = hybridRiveView.getFile();
        HybridRiveFile hybridRiveFile = file instanceof HybridRiveFile ? (HybridRiveFile) file : null;
        if (hybridRiveFile == null || (riveFile = hybridRiveFile.getRiveFile()) == null) {
            return Unit.f14616a;
        }
        String artboardName = hybridRiveView.getArtboardName();
        String stateMachineName = hybridRiveView.getStateMachineName();
        Boolean autoPlay = hybridRiveView.getAutoPlay();
        boolean zBooleanValue = autoPlay != null ? autoPlay.booleanValue() : true;
        app.rive.runtime.kotlin.core.Alignment alignmentConvertAlignment = hybridRiveView.convertAlignment(hybridRiveView.getAlignment());
        if (alignmentConvertAlignment == null) {
            alignmentConvertAlignment = q.f6972b;
        }
        app.rive.runtime.kotlin.core.Fit fitConvertFit = hybridRiveView.convertFit(hybridRiveView.getFit());
        if (fitConvertFit == null) {
            fitConvertFit = q.f6971a;
        }
        Double layoutScaleFactor = hybridRiveView.getLayoutScaleFactor();
        if (layoutScaleFactor != null) {
            fValueOf = Float.valueOf((float) layoutScaleFactor.doubleValue());
        } else {
            app.rive.runtime.kotlin.core.Fit fit = q.f6971a;
            fValueOf = null;
        }
        Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName dataBind = hybridRiveView.getDataBind();
        android.support.v4.media.session.b bVar = em.a.f8455a;
        if (dataBind != null) {
            if (dataBind instanceof Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.First) {
                HybridViewModelInstanceSpec hybridViewModelInstanceSpecA = ((Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.First) dataBind).getValue();
                if (hybridViewModelInstanceSpecA == null) {
                    hybridViewModelInstanceSpecA = null;
                }
                HybridViewModelInstance hybridViewModelInstance = hybridViewModelInstanceSpecA instanceof HybridViewModelInstance ? (HybridViewModelInstance) hybridViewModelInstanceSpecA : null;
                if (hybridViewModelInstance == null || (viewModelInstance = hybridViewModelInstance.getViewModelInstance()) == null) {
                    throw new Error("Invalid ViewModelInstance");
                }
                bVar = new em.c(viewModelInstance);
            } else if (dataBind instanceof Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.Second) {
                DataBindMode dataBindModeA = ((Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.Second) dataBind).getValue();
                DataBindMode dataBindMode = dataBindModeA != null ? dataBindModeA : null;
                if ((dataBindMode == null ? -1 : w0.f6990a[dataBindMode.ordinal()]) != 1) {
                    bVar = em.d.f8458a;
                }
            } else {
                if (!(dataBind instanceof Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.Third)) {
                    throw new rn.n();
                }
                DataBindByName dataBindByNameA = ((Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.Third) dataBind).getValue();
                DataBindByName dataBindByName = dataBindByNameA != null ? dataBindByNameA : null;
                if (dataBindByName == null || (byName = dataBindByName.getByName()) == null) {
                    throw new Error("Missing byName value");
                }
                bVar = new em.b(byName);
            }
        }
        hybridRiveView.getView().a(new em.n(artboardName, stateMachineName, zBooleanValue, riveFile, alignmentConvertAlignment, fitConvertFit, fValueOf, bVar), hybridRiveView.dataBindingChanged, hybridRiveView.needsReload, hybridRiveView.initialUpdate);
        if (hybridRiveView.needsReload) {
            hybridRiveFile.registerView(hybridRiveView);
            hybridRiveView.registeredFile = hybridRiveFile;
        }
        hybridRiveView.needsReload = false;
        hybridRiveView.dataBindingChanged = false;
        hybridRiveView.initialUpdate = false;
        super.afterUpdate();
        return Unit.f14616a;
    }

    private final Promise<Unit> asyncExecuteOnUiThread(Function0<Unit> action) {
        return com.margelo.nitro.core.f.a(Promise.Companion, new z(this, action, null, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewModelInstance$lambda$5(HybridViewModelInstanceSpec hybridViewModelInstanceSpec, HybridRiveView hybridRiveView) {
        RiveFileController controller;
        List<StateMachineInstance> stateMachines = null;
        HybridViewModelInstance hybridViewModelInstance = hybridViewModelInstanceSpec instanceof HybridViewModelInstance ? (HybridViewModelInstance) hybridViewModelInstanceSpec : null;
        if (hybridViewModelInstance == null) {
            return Unit.f14616a;
        }
        em.m view = hybridRiveView.getView();
        ViewModelInstance vmi = hybridViewModelInstance.getViewModelInstance();
        view.getClass();
        Intrinsics.checkNotNullParameter(vmi, "vmi");
        em.e eVar = view.f8467d;
        if (eVar != null && (controller = eVar.getController()) != null) {
            stateMachines = controller.getStateMachines();
        }
        if (stateMachines != null && !stateMachines.isEmpty()) {
            ((StateMachineInstance) CollectionsKt.K(stateMachines)).setViewModelInstance(vmi);
        }
        return Unit.f14616a;
    }

    private final <T> void changed(T current, T t5, Function1<? super T, Unit> setter) {
        if (Intrinsics.areEqual(current, t5)) {
            return;
        }
        setter.invoke(t5);
        this.needsReload = true;
    }

    private final app.rive.runtime.kotlin.core.Alignment convertAlignment(Alignment alignment) {
        if (alignment == null) {
            return null;
        }
        switch (u0.f6982a[alignment.ordinal()]) {
            case 1:
                return app.rive.runtime.kotlin.core.Alignment.TOP_LEFT;
            case 2:
                return app.rive.runtime.kotlin.core.Alignment.TOP_CENTER;
            case 3:
                return app.rive.runtime.kotlin.core.Alignment.TOP_RIGHT;
            case 4:
                return app.rive.runtime.kotlin.core.Alignment.CENTER_LEFT;
            case 5:
                return app.rive.runtime.kotlin.core.Alignment.CENTER;
            case 6:
                return app.rive.runtime.kotlin.core.Alignment.CENTER_RIGHT;
            case 7:
                return app.rive.runtime.kotlin.core.Alignment.BOTTOM_LEFT;
            case 8:
                return app.rive.runtime.kotlin.core.Alignment.BOTTOM_CENTER;
            case 9:
                return app.rive.runtime.kotlin.core.Alignment.BOTTOM_RIGHT;
            default:
                throw new rn.n();
        }
    }

    private final app.rive.runtime.kotlin.core.Fit convertFit(Fit fit) {
        if (fit == null) {
            return null;
        }
        switch (u0.f6983b[fit.ordinal()]) {
            case 1:
                return app.rive.runtime.kotlin.core.Fit.FILL;
            case 2:
                return app.rive.runtime.kotlin.core.Fit.CONTAIN;
            case 3:
                return app.rive.runtime.kotlin.core.Fit.COVER;
            case 4:
                return app.rive.runtime.kotlin.core.Fit.FIT_WIDTH;
            case 5:
                return app.rive.runtime.kotlin.core.Fit.FIT_HEIGHT;
            case 6:
                return app.rive.runtime.kotlin.core.Fit.NONE;
            case 7:
                return app.rive.runtime.kotlin.core.Fit.SCALE_DOWN;
            case 8:
                return app.rive.runtime.kotlin.core.Fit.LAYOUT;
            default:
                throw new rn.n();
        }
    }

    private final Pair<RiveErrorType, String> detectErrorType(Exception exception) {
        RiveErrorType riveErrorType;
        String message = exception.getMessage();
        if (message == null) {
            message = exception.toString();
        }
        if (exception instanceof ArtboardException) {
            riveErrorType = RiveErrorType.INCORRECTARTBOARDNAME;
        } else if (exception instanceof StateMachineException) {
            riveErrorType = RiveErrorType.INCORRECTSTATEMACHINENAME;
        } else if (exception instanceof AnimationException) {
            riveErrorType = RiveErrorType.UNKNOWN;
        } else if (exception instanceof MalformedFileException) {
            riveErrorType = RiveErrorType.MALFORMEDFILE;
        } else if (exception instanceof StateMachineInputException) {
            riveErrorType = RiveErrorType.INCORRECTSTATEMACHINEINPUTNAME;
        } else {
            riveErrorType = (!(exception instanceof TextValueRunException) && (exception instanceof ViewModelException)) ? RiveErrorType.VIEWMODELINSTANCENOTFOUND : RiveErrorType.UNKNOWN;
        }
        return new Pair<>(riveErrorType, message);
    }

    private final void executeOnUiThread(Function0<Unit> action) {
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new s0(0, action));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOnUiThread$lambda$12(Function0 function0) {
        try {
            function0.invoke();
        } catch (Error e10) {
            throw new Error(e10.getMessage());
        } catch (Exception e11) {
            throw new Error(e11.getMessage());
        }
    }

    public static /* synthetic */ void logged$default(HybridRiveView hybridRiveView, String str, String str2, Function0 function0, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        hybridRiveView.logged(str, str2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onError$lambda$4(RiveError it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEventListener$lambda$9(HybridRiveView hybridRiveView, Function1 onEvent) {
        em.m view = hybridRiveView.getView();
        view.getClass();
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        em.l lVar = new em.l(view, onEvent);
        em.e eVar = view.f8467d;
        if (eVar != null) {
            eVar.addEventListener(lVar);
        }
        view.f8468e.add(lVar);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pause$lambda$7(HybridRiveView hybridRiveView) {
        em.e eVar = hybridRiveView.getView().f8467d;
        if (eVar != null) {
            eVar.pause();
            Unit unit = Unit.f14616a;
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit play$lambda$6(HybridRiveView hybridRiveView) {
        hybridRiveView.getView().c();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeEventListeners$lambda$10(HybridRiveView hybridRiveView) {
        hybridRiveView.getView().d();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reset$lambda$8(HybridRiveView hybridRiveView) {
        em.e eVar = hybridRiveView.getView().f8467d;
        if (eVar != null) {
            eVar.reset();
            Unit unit = Unit.f14616a;
        }
        return Unit.f14616a;
    }

    @Override // al.a
    public void afterUpdate() {
        logged(TAG, "afterUpdate", new r0(this, 3));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    @NotNull
    public Promise<Boolean> awaitViewReady() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new com.margelo.nitro.playagerangedeclaration.d(this, null, 2));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void bindViewModelInstance(@NotNull HybridViewModelInstanceSpec viewModelInstance) {
        Intrinsics.checkNotNullParameter(viewModelInstance, "viewModelInstance");
        executeOnUiThread(new c6.a(21, viewModelInstance, this));
    }

    @Override // com.margelo.nitro.core.HybridObject
    public void dispose() {
        getView().f8471w = true;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public Alignment getAlignment() {
        return this.alignment;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public String getArtboardName() {
        return this.artboardName;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public Boolean getAutoPlay() {
        return this.autoPlay;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public boolean getBooleanInputValue(@NotNull String name, String path) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(name, "name");
        em.m view = getView();
        view.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        SMIInput sMIInputB = view.b(name, path);
        if (!(sMIInputB instanceof SMIBoolean)) {
            throw new Error("State machine input is not a boolean");
        }
        try {
            return ((SMIBoolean) sMIInputB).getValue();
        } catch (Exception unused) {
            String simpleName = Reflection.getOrCreateKotlinClass(em.i.class).getSimpleName();
            if (simpleName != null) {
                lowerCase = simpleName.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            throw new Error(s0.g.e("Could not handle ", lowerCase, " state machine input"));
        }
    }

    @NotNull
    public final ThemedReactContext getContext() {
        return this.context;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName getDataBind() {
        return this.dataBind;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    @NotNull
    public HybridRiveFileSpec getFile() {
        return this.file;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public Fit getFit() {
        return this.fit;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public Double getLayoutScaleFactor() {
        return this.layoutScaleFactor;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public double getNumberInputValue(@NotNull String name, String path) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(name, "name");
        em.m view = getView();
        view.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        SMIInput sMIInputB = view.b(name, path);
        if (!(sMIInputB instanceof SMINumber)) {
            throw new Error("State machine input is not a number");
        }
        try {
            return ((SMINumber) sMIInputB).getValue();
        } catch (Exception unused) {
            String simpleName = Reflection.getOrCreateKotlinClass(em.j.class).getSimpleName();
            if (simpleName != null) {
                lowerCase = simpleName.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            throw new Error(s0.g.e("Could not handle ", lowerCase, " state machine input"));
        }
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    @NotNull
    public Function1<RiveError, Unit> getOnError() {
        return this.onError;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public String getStateMachineName() {
        return this.stateMachineName;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    @NotNull
    public String getTextRunValue(@NotNull String name, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        em.m view = getView();
        view.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String textRunValue = null;
        if (path == null) {
            em.e eVar = view.f8467d;
            if (eVar != null) {
                textRunValue = eVar.getTextRunValue(name);
            }
        } else {
            em.e eVar2 = view.f8467d;
            if (eVar2 != null) {
                textRunValue = eVar2.getTextRunValue(name, path);
            }
        }
        if (textRunValue != null) {
            return textRunValue;
        }
        throw new Error(s0.g.f("Could not find text run value (name: ", name, ", path: ", path, ")"));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public HybridViewModelInstanceSpec getViewModelInstance() {
        ViewModelInstance viewModelInstance = getView().getViewModelInstance();
        if (viewModelInstance == null) {
            return null;
        }
        return new HybridViewModelInstance(viewModelInstance);
    }

    public final void logged(@NotNull String tag, String note, @NotNull Function0<Unit> fn2) {
        String strConcat;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(fn2, "fn");
        try {
            fn2.invoke();
        } catch (Exception e10) {
            Pair<RiveErrorType, String> pairDetectErrorType = detectErrorType(e10);
            RiveErrorType riveErrorType = (RiveErrorType) pairDetectErrorType.f14612d;
            String str = (String) pairDetectErrorType.f14613e;
            if (note == null || (strConcat = " ".concat(note)) == null) {
                strConcat = "";
            }
            String strF = s0.g.f("[RIVE] ", tag, strConcat, " ", str);
            Log.e(TAG, strF, e10);
            getOnError().invoke(new RiveError(strF, riveErrorType));
        }
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void onEventListener(@NotNull Function1<? super UnifiedRiveEvent, Unit> onEvent) {
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        executeOnUiThread(new c6.a(20, this, onEvent));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    @NotNull
    public Promise<Unit> pause() {
        return asyncExecuteOnUiThread(new r0(this, 1));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    @NotNull
    public Promise<Unit> play() {
        return asyncExecuteOnUiThread(new r0(this, 2));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void playIfNeeded() {
        em.e eVar;
        em.m view = getView();
        em.e eVar2 = view.f8467d;
        if (eVar2 == null || eVar2.isPlaying() || (eVar = view.f8467d) == null) {
            return;
        }
        eVar.post(new com.google.firebase.messaging.s(9, view));
    }

    public final void refreshAfterAssetChange() {
        afterUpdate();
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void removeEventListeners() {
        executeOnUiThread(new r0(this, 0));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    @NotNull
    public Promise<Unit> reset() {
        return asyncExecuteOnUiThread(new r0(this, 4));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setArtboardName(String str) {
        changed(this.artboardName, str, new x(this, 3));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setAutoPlay(Boolean bool) {
        changed(this.autoPlay, bool, new x(this, 4));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setBooleanInputValue(@NotNull String name, boolean value, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        getView().e(name, value, path);
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setDataBind(Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName) {
        if (Intrinsics.areEqual(this.dataBind, variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName)) {
            return;
        }
        this.dataBind = variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;
        this.dataBindingChanged = true;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setFile(@NotNull HybridRiveFileSpec value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.file, value)) {
            HybridRiveFile hybridRiveFile = this.registeredFile;
            if (hybridRiveFile != null) {
                hybridRiveFile.unregisterView(this);
            }
            this.registeredFile = null;
        }
        changed(this.file, value, new x(this, 2));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setFit(Fit fit) {
        this.fit = fit;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setLayoutScaleFactor(Double d6) {
        this.layoutScaleFactor = d6;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setNumberInputValue(@NotNull String name, double value, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        getView().f(name, value, path);
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setOnError(@NotNull Function1<? super RiveError, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onError = function1;
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setStateMachineName(String str) {
        changed(this.stateMachineName, str, new x(this, 1));
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void setTextRunValue(@NotNull String name, @NotNull String value, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        em.m view = getView();
        view.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (path == null) {
                em.e eVar = view.f8467d;
                if (eVar != null) {
                    eVar.setTextRunValue(name, value);
                }
            } else {
                em.e eVar2 = view.f8467d;
                if (eVar2 != null) {
                    eVar2.setTextRunValue(name, value, path);
                }
            }
        } catch (Exception e10) {
            throw new Error(e10.getMessage());
        }
    }

    @Override // com.margelo.nitro.rive.HybridRiveViewSpec
    public void triggerInput(@NotNull String name, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        getView().g(name, path);
    }

    @Override // al.a
    @NotNull
    public em.m getView() {
        return this.view;
    }
}
