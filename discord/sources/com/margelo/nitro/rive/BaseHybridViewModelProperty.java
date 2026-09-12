package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J \u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H&J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0019J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\rH&J\b\u0010\u001f\u001a\u00020\u000fH&J\b\u0010 \u001a\u00020\u000fH&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e0\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/margelo/nitro/rive/BaseHybridViewModelProperty;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "listeners", "", "", "Lkotlin/Function1;", "", "getListeners", "()Ljava/util/Map;", "ensureValueListenerJob", "valueFlow", "Lkotlinx/coroutines/flow/Flow;", "drop", "", "onChanged", "value", "(Ljava/lang/Object;)V", "addListenerInternal", "Lkotlin/Function0;", "callback", "removeListener", StackTraceHelper.ID_KEY, "removeListeners", "dispose", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BaseHybridViewModelProperty<T> {
    @NotNull
    Function0<Unit> addListenerInternal(@NotNull Function1<? super T, Unit> callback);

    void dispose();

    void ensureValueListenerJob(@NotNull Flow valueFlow, int drop);

    Job getJob();

    @NotNull
    Map<String, Function1<T, Unit>> getListeners();

    CoroutineScope getScope();

    void onChanged(T value);

    void removeListener(@NotNull String id2);

    void removeListeners();
}
