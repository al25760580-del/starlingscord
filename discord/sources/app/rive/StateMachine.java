package app.rive;

import a3.e;
import app.rive.core.ArtboardHandle;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.StateMachineHandle;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0012H\u0096\u0001J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\u0019\u0010\u001d\u001a\u00020\u00192\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0002\b\u001fR\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lapp/rive/StateMachine;", "Ljava/lang/AutoCloseable;", "stateMachineHandle", "Lapp/rive/core/StateMachineHandle;", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "artboardHandle", "Lapp/rive/core/ArtboardHandle;", StackTraceHelper.NAME_KEY, "", "(JLapp/rive/core/CommandQueue;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getName", "()Ljava/lang/String;", "getStateMachineHandle-a86gHUU", "()J", "advance", "", "deltaTime", "Lkotlin/time/Duration;", "advance-LRDsOJo", "(J)V", "close", "isFromArtboard", "", "artboard", "Lapp/rive/Artboard;", "isFromArtboard$kotlin_release", "isOwnedBy", "worker", "isOwnedBy$kotlin_release", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StateMachine implements AutoCloseable {
    private final /* synthetic */ CloseOnce $$delegate_0;
    private final long artboardHandle;
    private final String name;

    @NotNull
    private final CommandQueue riveWorker;
    private final long stateMachineHandle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lapp/rive/StateMachine$Companion;", "", "()V", "fromArtboard", "Lapp/rive/StateMachine;", "artboard", "Lapp/rive/Artboard;", "stateMachineName", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStateMachine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateMachine.kt\napp/rive/StateMachine$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,124:1\n1#2:125\n57#3:126\n*S KotlinDebug\n*F\n+ 1 StateMachine.kt\napp/rive/StateMachine$Companion\n*L\n58#1:126\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ StateMachine fromArtboard$default(Companion companion, Artboard artboard, String str, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str = null;
            }
            return companion.fromArtboard(artboard, str);
        }

        @NotNull
        public final StateMachine fromArtboard(@NotNull final Artboard artboard, String stateMachineName) {
            final String strConcat;
            Intrinsics.checkNotNullParameter(artboard, "artboard");
            final long jM129createStateMachineByNameItmKBmM = stateMachineName != null ? artboard.getRiveWorker().m129createStateMachineByNameItmKBmM(artboard.getArtboardHandle(), stateMachineName) : artboard.getRiveWorker().m128createDefaultStateMachinexY8vNfM(artboard.getArtboardHandle());
            if (stateMachineName == null || (strConcat = "with name ".concat(stateMachineName)) == null) {
                strConcat = "(default)";
            }
            RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0<String>() { // from class: app.rive.StateMachine$Companion$fromArtboard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    String strM224toStringimpl = StateMachineHandle.m224toStringimpl(jM129createStateMachineByNameItmKBmM);
                    String str = strConcat;
                    return com.discord.chat.presentation.list.a.l(e.u("Created ", strM224toStringimpl, " ", str, " ("), ArtboardHandle.m108toStringimpl(artboard.getArtboardHandle()), "; ", FileHandle.m197toStringimpl(artboard.getFileHandle()), ")");
                }
            });
            return new StateMachine(jM129createStateMachineByNameItmKBmM, artboard.getRiveWorker(), artboard.getArtboardHandle(), stateMachineName, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ StateMachine(long j, CommandQueue commandQueue, long j5, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue, j5, str);
    }

    /* JADX INFO: renamed from: advance-LRDsOJo, reason: not valid java name */
    public final void m51advanceLRDsOJo(long deltaTime) {
        this.riveWorker.m122advanceStateMachineDDXDRQI(this.stateMachineHandle, deltaTime);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getStateMachineHandle-a86gHUU, reason: not valid java name and from getter */
    public final long getStateMachineHandle() {
        return this.stateMachineHandle;
    }

    public final boolean isFromArtboard$kotlin_release(@NotNull Artboard artboard) {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        return ArtboardHandle.m106equalsimpl0(this.artboardHandle, artboard.getArtboardHandle());
    }

    public final boolean isOwnedBy$kotlin_release(@NotNull CommandQueue worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        return this.riveWorker == worker;
    }

    private StateMachine(final long j, final CommandQueue riveWorker, final long j5, final String str) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        this.stateMachineHandle = j;
        this.riveWorker = riveWorker;
        this.artboardHandle = j5;
        this.name = str;
        this.$$delegate_0 = new CloseOnce(StateMachineHandle.m224toStringimpl(j), new Function0<Unit>() { // from class: app.rive.StateMachine.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m53invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m53invoke() {
                String strConcat;
                String str2 = str;
                if (str2 == null || (strConcat = "with name ".concat(str2)) == null) {
                    strConcat = "(default)";
                }
                final String str3 = strConcat;
                final long j7 = j;
                final long j10 = j5;
                RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new Function0<String>() { // from class: app.rive.StateMachine.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        String strM224toStringimpl = StateMachineHandle.m224toStringimpl(j7);
                        String str4 = str3;
                        return com.discord.chat.presentation.list.a.k(e.u("Deleting ", strM224toStringimpl, " ", str4, " ("), ArtboardHandle.m108toStringimpl(j10), ")");
                    }
                });
                riveWorker.m139deleteStateMachineAkTCgDQ(j);
            }
        });
    }
}
