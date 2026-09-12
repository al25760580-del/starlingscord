package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0013H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u00140\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/margelo/nitro/rive/BaseHybridViewModelPropertyImpl;", "T", "Lcom/margelo/nitro/rive/BaseHybridViewModelProperty;", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "setScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "listeners", "", "", "Lkotlin/Function1;", "", "getListeners", "()Ljava/util/Map;", "ensureValueListenerJob", "valueFlow", "Lkotlinx/coroutines/flow/Flow;", "drop", "", "onChanged", "value", "(Ljava/lang/Object;)V", "addListenerInternal", "Lkotlin/Function0;", "callback", "removeListener", StackTraceHelper.ID_KEY, "removeListeners", "dispose", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@SourceDebugExtension({"SMAP\nBaseHybridViewModelPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseHybridViewModelPropertyImpl.kt\ncom/margelo/nitro/rive/BaseHybridViewModelPropertyImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1869#2,2:71\n*S KotlinDebug\n*F\n+ 1 BaseHybridViewModelPropertyImpl.kt\ncom/margelo/nitro/rive/BaseHybridViewModelPropertyImpl\n*L\n36#1:71,2\n*E\n"})
public final class BaseHybridViewModelPropertyImpl<T> implements BaseHybridViewModelProperty<T> {
    private Job job;

    @NotNull
    private final Map<String, Function1<T, Unit>> listeners = new LinkedHashMap();
    private CoroutineScope scope;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListenerInternal$lambda$1(WeakReference weakReference, String str) {
        BaseHybridViewModelPropertyImpl baseHybridViewModelPropertyImpl = (BaseHybridViewModelPropertyImpl) weakReference.get();
        if (baseHybridViewModelPropertyImpl != null) {
            baseHybridViewModelPropertyImpl.removeListener(str);
        }
        return Unit.f14616a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    @NotNull
    public Function0<Unit> addListenerInternal(@NotNull Function1<? super T, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getListeners().put(string, callback);
        return new c6.a(19, new WeakReference(this), string);
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void dispose() {
        removeListeners();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void ensureValueListenerJob(@NotNull Flow valueFlow, int drop) {
        Intrinsics.checkNotNullParameter(valueFlow, "valueFlow");
        if (getScope() == null) {
            setScope(ar.b0.b(ar.k0.f2938a));
        }
        if (getJob() == null) {
            CoroutineScope scope = getScope();
            setJob(scope != null ? ar.b0.t(scope, null, new d(valueFlow, drop, this, null), 3) : null);
        }
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public Job getJob() {
        return this.job;
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    @NotNull
    public Map<String, Function1<T, Unit>> getListeners() {
        return this.listeners;
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public CoroutineScope getScope() {
        return this.scope;
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void onChanged(T value) {
        Iterator<T> it = getListeners().values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(value);
        }
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void removeListener(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        getListeners().remove(id2);
        if (getListeners().isEmpty()) {
            Job job = getJob();
            if (job != null) {
                job.f(null);
            }
            setJob(null);
        }
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void removeListeners() {
        getListeners().clear();
        Job job = getJob();
        if (job != null) {
            job.f(null);
        }
        CoroutineScope scope = getScope();
        if (scope != null) {
            ar.b0.f(scope, null);
        }
        setJob(null);
        setScope(null);
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setScope(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }
}
