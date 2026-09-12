package io.sentry.android.replay;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import k0.d;
import k0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Lz/f;", "sentryReplayMask", "(Lz/f;)Lz/f;", "sentryReplayUnmask", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ModifierExtensionsKt {
    @NotNull
    public static final f sentryReplayMask(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        AnonymousClass1 properties = new Function1<j, Unit>() { // from class: io.sentry.android.replay.ModifierExtensionsKt.sentryReplayMask.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((j) obj);
                return Unit.f14616a;
            }

            public final void invoke(j semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                ((d) semantics).a(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "mask");
            }
        };
        AtomicInteger atomicInteger = k0.f.f14213a;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return fVar.then(new AppendedSemanticsElement(false, properties));
    }

    @NotNull
    public static final f sentryReplayUnmask(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        C02581 properties = new Function1<j, Unit>() { // from class: io.sentry.android.replay.ModifierExtensionsKt.sentryReplayUnmask.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((j) obj);
                return Unit.f14616a;
            }

            public final void invoke(j semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                ((d) semantics).a(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "unmask");
            }
        };
        AtomicInteger atomicInteger = k0.f.f14213a;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return fVar.then(new AppendedSemanticsElement(false, properties));
    }
}
