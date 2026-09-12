package app.rive;

import a3.e;
import app.rive.core.ArtboardHandle;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.RiveSurface;
import app.rive.core.SuspendLazy;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0086@¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0002\b\u001eJ\u0006\u0010\u001f\u001a\u00020\u0018J\u0018\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u00020\bX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Lapp/rive/Artboard;", "Ljava/lang/AutoCloseable;", "artboardHandle", "Lapp/rive/core/ArtboardHandle;", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "fileHandle", "Lapp/rive/core/FileHandle;", StackTraceHelper.NAME_KEY, "", "(JLapp/rive/core/CommandQueue;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArtboardHandle-nSTdbJo", "()J", "J", "getFileHandle-ENT3xMk$kotlin_release", "getName", "()Ljava/lang/String;", "getRiveWorker$kotlin_release", "()Lapp/rive/core/CommandQueue;", "stateMachineNamesCache", "Lapp/rive/core/SuspendLazy;", "", "close", "", "getStateMachineNames", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isOwnedBy", "", "worker", "isOwnedBy$kotlin_release", "resetArtboardSize", "resizeArtboard", "surface", "Lapp/rive/core/RiveSurface;", "scaleFactor", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Artboard implements AutoCloseable {
    private final /* synthetic */ CloseOnce $$delegate_0;
    private final long artboardHandle;
    private final long fileHandle;
    private final String name;

    @NotNull
    private final CommandQueue riveWorker;

    @NotNull
    private final SuspendLazy<List<String>> stateMachineNamesCache;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lapp/rive/Artboard$Companion;", "", "()V", "fromFile", "Lapp/rive/Artboard;", "file", "Lapp/rive/RiveFile;", "artboardName", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nArtboard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artboard.kt\napp/rive/Artboard$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,141:1\n1#2:142\n57#3:143\n*S KotlinDebug\n*F\n+ 1 Artboard.kt\napp/rive/Artboard$Companion\n*L\n56#1:143\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Artboard fromFile$default(Companion companion, RiveFile riveFile, String str, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str = null;
            }
            return companion.fromFile(riveFile, str);
        }

        @NotNull
        public final Artboard fromFile(@NotNull final RiveFile file, String artboardName) {
            final String strConcat;
            Intrinsics.checkNotNullParameter(file, "file");
            final long jM126createArtboardByName2ZIOzHc = artboardName != null ? file.getRiveWorker().m126createArtboardByName2ZIOzHc(file.getFileHandle(), artboardName) : file.getRiveWorker().m127createDefaultArtboard6NrLy0M(file.getFileHandle());
            if (artboardName == null || (strConcat = "with name ".concat(artboardName)) == null) {
                strConcat = "(default)";
            }
            RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Function0<String>() { // from class: app.rive.Artboard$Companion$fromFile$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    String strM108toStringimpl = ArtboardHandle.m108toStringimpl(jM126createArtboardByName2ZIOzHc);
                    String str = strConcat;
                    return com.discord.chat.presentation.list.a.k(e.u("Created ", strM108toStringimpl, " ", str, " ("), FileHandle.m197toStringimpl(file.getFileHandle()), ")");
                }
            });
            return new Artboard(jM126createArtboardByName2ZIOzHc, file.getRiveWorker(), file.getFileHandle(), artboardName, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Artboard(long j, CommandQueue commandQueue, long j5, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue, j5, str);
    }

    public static /* synthetic */ void resizeArtboard$default(Artboard artboard, RiveSurface riveSurface, float f2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            f2 = 1.0f;
        }
        artboard.resizeArtboard(riveSurface, f2);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }

    /* JADX INFO: renamed from: getArtboardHandle-nSTdbJo, reason: not valid java name and from getter */
    public final long getArtboardHandle() {
        return this.artboardHandle;
    }

    /* JADX INFO: renamed from: getFileHandle-ENT3xMk$kotlin_release, reason: not valid java name and from getter */
    public final long getFileHandle() {
        return this.fileHandle;
    }

    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: getRiveWorker$kotlin_release, reason: from getter */
    public final CommandQueue getRiveWorker() {
        return this.riveWorker;
    }

    public final Object getStateMachineNames(@NotNull Continuation continuation) {
        return this.stateMachineNamesCache.await(continuation);
    }

    public final boolean isOwnedBy$kotlin_release(@NotNull CommandQueue worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        return this.riveWorker == worker;
    }

    public final void resetArtboardSize() {
        this.riveWorker.m168resetArtboardSizeuiJWFY8(this.artboardHandle);
    }

    public final void resizeArtboard(@NotNull RiveSurface surface, float scaleFactor) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.riveWorker.m169resizeArtboardVFK_cXo(this.artboardHandle, surface, scaleFactor);
    }

    private Artboard(final long j, final CommandQueue riveWorker, final long j5, final String str) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        this.artboardHandle = j;
        this.riveWorker = riveWorker;
        this.fileHandle = j5;
        this.name = str;
        this.$$delegate_0 = new CloseOnce(ArtboardHandle.m108toStringimpl(j), new Function0<Unit>() { // from class: app.rive.Artboard.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m7invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7invoke() {
                String strConcat;
                String str2 = str;
                if (str2 == null || (strConcat = "with name ".concat(str2)) == null) {
                    strConcat = "(default)";
                }
                final String str3 = strConcat;
                final long j7 = j;
                final long j10 = j5;
                RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Function0<String>() { // from class: app.rive.Artboard.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        String strM108toStringimpl = ArtboardHandle.m108toStringimpl(j7);
                        String str4 = str3;
                        return com.discord.chat.presentation.list.a.k(e.u("Deleting ", strM108toStringimpl, " ", str4, " ("), FileHandle.m197toStringimpl(j10), ")");
                    }
                });
                riveWorker.m134deleteArtboarduiJWFY8(j);
            }
        });
        this.stateMachineNamesCache = new SuspendLazy<>(new Artboard$stateMachineNamesCache$1(this, null));
    }
}
