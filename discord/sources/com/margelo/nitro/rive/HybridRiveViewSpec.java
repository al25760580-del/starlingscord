package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 h2\u00020\u0001:\u0002ijB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b\u000f\u0010\u0007J\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b\u0010\u0010\u0007J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\nH'¢\u0006\u0004\b\u0012\u0010\u0003J#\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH'¢\u0006\u0004\b\u0018\u0010\u0003J)\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\n2\u0006\u0010\u0015\u001a\u000201H\u0003¢\u0006\u0004\b2\u00103R(\u00107\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00198g@gX¦\u000e¢\u0006\f\u001a\u0004\b4\u0010-\"\u0004\b5\u00106R(\u0010:\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00198g@gX¦\u000e¢\u0006\f\u001a\u0004\b8\u0010-\"\u0004\b9\u00106R(\u0010?\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00058g@gX¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010E\u001a\u00020@2\u0006\u0010\u001c\u001a\u00020@8g@gX¦\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010K\u001a\u0004\u0018\u00010F2\b\u0010\u001c\u001a\u0004\u0018\u00010F8g@gX¦\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010Q\u001a\u0004\u0018\u00010L2\b\u0010\u001c\u001a\u0004\u0018\u00010L8g@gX¦\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010V\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8g@gX¦\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010\\\u001a\u0004\u0018\u00010W2\b\u0010\u001c\u001a\u0004\u0018\u00010W8g@gX¦\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R(\u0010a\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\n0\u00138&@&X¦\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010\u0017R$\u0010g\u001a\u00020b2\u0006\u0010\u001c\u001a\u00020b8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006k"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveViewSpec;", "Lal/a;", "<init>", "()V", "Lcom/margelo/nitro/core/Promise;", "", "awaitViewReady", "()Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "viewModelInstance", "", "bindViewModelInstance", "(Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;)V", "getViewModelInstance", "()Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "play", "pause", "reset", "playIfNeeded", "Lkotlin/Function1;", "Lcom/margelo/nitro/rive/UnifiedRiveEvent;", "onEvent", "onEventListener", "(Lkotlin/jvm/functions/Function1;)V", "removeEventListeners", "", StackTraceHelper.NAME_KEY, "", "value", "path", "setNumberInputValue", "(Ljava/lang/String;DLjava/lang/String;)V", "getNumberInputValue", "(Ljava/lang/String;Ljava/lang/String;)D", "setBooleanInputValue", "(Ljava/lang/String;ZLjava/lang/String;)V", "getBooleanInputValue", "(Ljava/lang/String;Ljava/lang/String;)Z", "triggerInput", "(Ljava/lang/String;Ljava/lang/String;)V", "setTextRunValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTextRunValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridRiveViewSpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridRiveViewSpec$CxxPart;", "Lcom/margelo/nitro/rive/Func_void_UnifiedRiveEvent;", "onEventListener_cxx", "(Lcom/margelo/nitro/rive/Func_void_UnifiedRiveEvent;)V", "getArtboardName", "setArtboardName", "(Ljava/lang/String;)V", "artboardName", "getStateMachineName", "setStateMachineName", "stateMachineName", "getAutoPlay", "()Ljava/lang/Boolean;", "setAutoPlay", "(Ljava/lang/Boolean;)V", "autoPlay", "Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "getFile", "()Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "setFile", "(Lcom/margelo/nitro/rive/HybridRiveFileSpec;)V", "file", "Lcom/margelo/nitro/rive/Alignment;", "getAlignment", "()Lcom/margelo/nitro/rive/Alignment;", "setAlignment", "(Lcom/margelo/nitro/rive/Alignment;)V", "alignment", "Lcom/margelo/nitro/rive/Fit;", "getFit", "()Lcom/margelo/nitro/rive/Fit;", "setFit", "(Lcom/margelo/nitro/rive/Fit;)V", "fit", "getLayoutScaleFactor", "()Ljava/lang/Double;", "setLayoutScaleFactor", "(Ljava/lang/Double;)V", "layoutScaleFactor", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "getDataBind", "()Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "setDataBind", "(Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;)V", "dataBind", "Lcom/margelo/nitro/rive/RiveError;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "setOnError", "onError", "Lcom/margelo/nitro/rive/Func_void_RiveError;", "getOnError_cxx", "()Lcom/margelo/nitro/rive/Func_void_RiveError;", "setOnError_cxx", "(Lcom/margelo/nitro/rive/Func_void_RiveError;)V", "onError_cxx", "Companion", "CxxPart", "com/margelo/nitro/rive/x0", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridRiveViewSpec extends al.a {

    @NotNull
    public static final x0 Companion = new x0();

    @NotNull
    protected static final String TAG = "HybridRiveViewSpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveViewSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridRiveViewSpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridRiveViewSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridObject.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridRiveViewSpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }

        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        @NotNull
        public native HybridData initHybrid();
    }

    @xa.a
    @Keep
    private final Func_void_RiveError getOnError_cxx() {
        return new Func_void_RiveError_java(getOnError());
    }

    @xa.a
    @Keep
    private final void onEventListener_cxx(Func_void_UnifiedRiveEvent onEvent) {
        onEventListener(onEvent);
        Unit unit = Unit.f14616a;
    }

    @xa.a
    @Keep
    private final void setOnError_cxx(Func_void_RiveError func_void_RiveError) {
        setOnError(func_void_RiveError);
    }

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Boolean> awaitViewReady();

    @xa.a
    @Keep
    public abstract void bindViewModelInstance(@NotNull HybridViewModelInstanceSpec viewModelInstance);

    @xa.a
    @Keep
    public abstract Alignment getAlignment();

    @xa.a
    @Keep
    public abstract String getArtboardName();

    @xa.a
    @Keep
    public abstract Boolean getAutoPlay();

    @xa.a
    @Keep
    public abstract boolean getBooleanInputValue(@NotNull String name, String path);

    @xa.a
    @Keep
    public abstract Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName getDataBind();

    @xa.a
    @Keep
    @NotNull
    public abstract HybridRiveFileSpec getFile();

    @xa.a
    @Keep
    public abstract Fit getFit();

    @xa.a
    @Keep
    public abstract Double getLayoutScaleFactor();

    @xa.a
    @Keep
    public abstract double getNumberInputValue(@NotNull String name, String path);

    @NotNull
    public abstract Function1<RiveError, Unit> getOnError();

    @xa.a
    @Keep
    public abstract String getStateMachineName();

    @xa.a
    @Keep
    @NotNull
    public abstract String getTextRunValue(@NotNull String name, String path);

    @xa.a
    @Keep
    public abstract HybridViewModelInstanceSpec getViewModelInstance();

    public abstract void onEventListener(@NotNull Function1<? super UnifiedRiveEvent, Unit> onEvent);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> pause();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> play();

    @xa.a
    @Keep
    public abstract void playIfNeeded();

    @xa.a
    @Keep
    public abstract void removeEventListeners();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> reset();

    @xa.a
    @Keep
    public abstract void setAlignment(Alignment alignment);

    @xa.a
    @Keep
    public abstract void setArtboardName(String str);

    @xa.a
    @Keep
    public abstract void setAutoPlay(Boolean bool);

    @xa.a
    @Keep
    public abstract void setBooleanInputValue(@NotNull String name, boolean value, String path);

    @xa.a
    @Keep
    public abstract void setDataBind(Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName);

    @xa.a
    @Keep
    public abstract void setFile(@NotNull HybridRiveFileSpec hybridRiveFileSpec);

    @xa.a
    @Keep
    public abstract void setFit(Fit fit);

    @xa.a
    @Keep
    public abstract void setLayoutScaleFactor(Double d6);

    @xa.a
    @Keep
    public abstract void setNumberInputValue(@NotNull String name, double value, String path);

    public abstract void setOnError(@NotNull Function1<? super RiveError, Unit> function1);

    @xa.a
    @Keep
    public abstract void setStateMachineName(String str);

    @xa.a
    @Keep
    public abstract void setTextRunValue(@NotNull String name, @NotNull String value, String path);

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject RiveView]";
    }

    @xa.a
    @Keep
    public abstract void triggerInput(@NotNull String name, String path);

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
