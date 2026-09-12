package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.ImageHandle;
import app.rive.core.ViewModelInstanceHandle;
import app.rive.runtime.kotlin.core.ViewModel;
import dr.i0;
import dr.v;
import dr.y;
import dr.z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import s0.g;
import xn.c;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 g2\u00020\u0001:\u0001gB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0018J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0018J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0018J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u0018J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0018J\u001d\u0010 \u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b&\u0010#J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0000¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b6\u00107J%\u0010:\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u0000¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u0000¢\u0006\u0004\b<\u00105J\u001d\u0010=\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u001c¢\u0006\u0004\b=\u0010(J\u001d\u0010>\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u0000¢\u0006\u0004\b>\u00105J%\u0010A\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u001c¢\u0006\u0004\bA\u0010BJ\u008d\u0001\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010C2\u0006\u0010\u0014\u001a\u00020\u00132\u0018\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150D2(\u0010I\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000G\u0012\u0006\u0012\u0004\u0018\u00010H0F2\u001c\u0010M\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000Kj\b\u0012\u0004\u0012\u00028\u0000`L0J2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJE\u0010S\u001a\u00020\u000b\"\u0004\b\u0000\u0010C2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00028\u00002\u001e\u0010R\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0FH\u0002¢\u0006\u0004\bS\u0010TR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010WR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010XR\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000b0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000b0J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R&\u0010`\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR&\u0010b\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR&\u0010c\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010aR&\u0010d\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010aR&\u0010e\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00150D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010aR&\u0010f\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00150D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Lapp/rive/ViewModelInstance;", "Ljava/lang/AutoCloseable;", "Lapp/rive/core/ViewModelInstanceHandle;", "instanceHandle", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/core/FileHandle;", "fileHandle", "<init>", "(JLapp/rive/core/CommandQueue;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "close", "()V", "worker", "", "isOwnedBy$kotlin_release", "(Lapp/rive/core/CommandQueue;)Z", "isOwnedBy", "", "propertyPath", "Lkotlinx/coroutines/flow/Flow;", "", "getNumberFlow", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getStringFlow", "getBooleanFlow", "getEnumFlow", "", "getColorFlow", "getTriggerFlow", "value", "setNumber", "(Ljava/lang/String;F)V", "setString", "(Ljava/lang/String;Ljava/lang/String;)V", "setBoolean", "(Ljava/lang/String;Z)V", "setEnum", "setColor", "(Ljava/lang/String;I)V", "fireTrigger", "(Ljava/lang/String;)V", "Lapp/rive/ImageAsset;", "image", "setImage", "(Ljava/lang/String;Lapp/rive/ImageAsset;)V", "Lapp/rive/Artboard;", "artboard", "setArtboard", "(Ljava/lang/String;Lapp/rive/Artboard;)V", "instance", "setViewModelInstance", "(Ljava/lang/String;Lapp/rive/ViewModelInstance;)V", "getListSize", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "index", "item", "insertToListAtIndex", "(Ljava/lang/String;ILapp/rive/ViewModelInstance;)V", "appendToList", "removeFromListAtIndex", "removeFromList", "indexA", "indexB", "swapListItems", "(Ljava/lang/String;II)V", "T", "", "cache", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "getter", "Ldr/v;", "Lapp/rive/core/CommandQueue$PropertyUpdate;", "Lapp/rive/core/RivePropertyUpdate;", "updateFlow", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "propertyType", "getPropertyFlow", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function3;Ldr/v;Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;)Lkotlinx/coroutines/flow/Flow;", "setter", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "J", "getInstanceHandle-VPLto4w", "()J", "Lapp/rive/core/CommandQueue;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_dirtyFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "dirtyFlow", "Ldr/v;", "getDirtyFlow$kotlin_release", "()Ldr/v;", "numberFlows", "Ljava/util/Map;", "stringFlows", "booleanFlows", "enumFlows", "colorFlows", "triggerFlows", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewModelInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelInstance.kt\napp/rive/ViewModelInstance\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,597:1\n381#2,3:598\n384#2,4:611\n381#2,3:615\n384#2,4:628\n17#3:601\n19#3:605\n49#3:606\n51#3:610\n17#3:618\n19#3:622\n49#3:623\n51#3:627\n46#4:602\n51#4:604\n46#4:607\n51#4:609\n46#4:619\n51#4:621\n46#4:624\n51#4:626\n105#5:603\n105#5:608\n105#5:620\n105#5:625\n57#6:632\n57#6:633\n57#6:634\n*S KotlinDebug\n*F\n+ 1 ViewModelInstance.kt\napp/rive/ViewModelInstance\n*L\n95#1:598,3\n95#1:611,4\n226#1:615,3\n226#1:628,4\n104#1:601\n104#1:605\n105#1:606\n105#1:610\n235#1:618\n235#1:622\n236#1:623\n236#1:627\n104#1:602\n104#1:604\n105#1:607\n105#1:609\n235#1:619\n235#1:621\n236#1:624\n236#1:626\n104#1:603\n105#1:608\n235#1:620\n236#1:625\n331#1:632\n345#1:633\n371#1:634\n*E\n"})
public final class ViewModelInstance implements AutoCloseable {
    private final /* synthetic */ CloseOnce $$delegate_0;

    @NotNull
    private final MutableSharedFlow _dirtyFlow;

    @NotNull
    private final Map<String, Flow> booleanFlows;

    @NotNull
    private final Map<String, Flow> colorFlows;

    @NotNull
    private final v dirtyFlow;

    @NotNull
    private final Map<String, Flow> enumFlows;
    private final long fileHandle;
    private final long instanceHandle;

    @NotNull
    private final Map<String, Flow> numberFlows;

    @NotNull
    private final CommandQueue riveWorker;

    @NotNull
    private final Map<String, Flow> stringFlows;

    @NotNull
    private final Map<String, Flow> triggerFlows;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lapp/rive/ViewModelInstance$Companion;", "", "()V", "fromFile", "Lapp/rive/ViewModelInstance;", "file", "Lapp/rive/RiveFile;", "source", "Lapp/rive/ViewModelInstanceSource;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nViewModelInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelInstance.kt\napp/rive/ViewModelInstance$Companion\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,597:1\n57#2:598\n*S KotlinDebug\n*F\n+ 1 ViewModelInstance.kt\napp/rive/ViewModelInstance$Companion\n*L\n60#1:598\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ViewModelInstance fromFile(@NotNull final RiveFile file, @NotNull final ViewModelInstanceSource source) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(source, "source");
            final long jM130createViewModelInstancej73Dd8U = file.getRiveWorker().m130createViewModelInstancej73Dd8U(file.getFileHandle(), source);
            RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0<String>() { // from class: app.rive.ViewModelInstance$Companion$fromFile$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    String strM233toStringimpl = ViewModelInstanceHandle.m233toStringimpl(jM130createViewModelInstancej73Dd8U);
                    ViewModelInstanceSource viewModelInstanceSource = source;
                    String strM197toStringimpl = FileHandle.m197toStringimpl(file.getFileHandle());
                    StringBuilder sb2 = new StringBuilder("Created ");
                    sb2.append(strM233toStringimpl);
                    sb2.append(" from source: ");
                    sb2.append(viewModelInstanceSource);
                    sb2.append(" (");
                    return com.discord.chat.presentation.list.a.k(sb2, strM197toStringimpl, ")");
                }
            });
            return new ViewModelInstance(jM130createViewModelInstancej73Dd8U, file.getRiveWorker(), file.getFileHandle(), null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getBooleanFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00531 extends FunctionReferenceImpl implements Function3 {
        public C00531(Object obj) {
            super(3, obj, CommandQueue.class, "getBooleanProperty", "getBooleanProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m56invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, (Continuation) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m56invokeiFQtAB8(long j, @NotNull String str, @NotNull Continuation continuation) {
            return ((CommandQueue) this.receiver).m145getBooleanPropertyiFQtAB8(j, str, continuation);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getColorFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00541 extends FunctionReferenceImpl implements Function3 {
        public C00541(Object obj) {
            super(3, obj, CommandQueue.class, "getColorProperty", "getColorProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m57invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, (Continuation) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m57invokeiFQtAB8(long j, @NotNull String str, @NotNull Continuation continuation) {
            return ((CommandQueue) this.receiver).m146getColorPropertyiFQtAB8(j, str, continuation);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getEnumFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00551 extends FunctionReferenceImpl implements Function3 {
        public C00551(Object obj) {
            super(3, obj, CommandQueue.class, "getEnumProperty", "getEnumProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m58invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, (Continuation) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m58invokeiFQtAB8(long j, @NotNull String str, @NotNull Continuation continuation) {
            return ((CommandQueue) this.receiver).m148getEnumPropertyiFQtAB8(j, str, continuation);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getNumberFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00561 extends FunctionReferenceImpl implements Function3 {
        public C00561(Object obj) {
            super(3, obj, CommandQueue.class, "getNumberProperty", "getNumberProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m59invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, (Continuation) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m59invokeiFQtAB8(long j, @NotNull String str, @NotNull Continuation continuation) {
            return ((CommandQueue) this.receiver).m151getNumberPropertyiFQtAB8(j, str, continuation);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getStringFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00571 extends FunctionReferenceImpl implements Function3 {
        public C00571(Object obj) {
            super(3, obj, CommandQueue.class, "getStringProperty", "getStringProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m60invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, (Continuation) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m60invokeiFQtAB8(long j, @NotNull String str, @NotNull Continuation continuation) {
            return ((CommandQueue) this.receiver).m153getStringPropertyiFQtAB8(j, str, continuation);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setArtboard$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass2(Object obj) {
            super(3, obj, CommandQueue.class, "setArtboardProperty", "setArtboardProperty-d7r-qXY(JLjava/lang/String;J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m61invoked7rqXY(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, ((ArtboardHandle) obj3).m109unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-d7r-qXY, reason: not valid java name */
        public final void m61invoked7rqXY(long j, @NotNull String p3, long j5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            ((CommandQueue) this.receiver).m170setArtboardPropertyd7rqXY(j, p3, j5);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setBoolean$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00591 extends FunctionReferenceImpl implements Function3 {
        public C00591(Object obj) {
            super(3, obj, CommandQueue.class, "setBooleanProperty", "setBooleanProperty-iFQtAB8(JLjava/lang/String;Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m62invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, ((Boolean) obj3).booleanValue());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m62invokeiFQtAB8(long j, @NotNull String p3, boolean z5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            ((CommandQueue) this.receiver).m171setBooleanPropertyiFQtAB8(j, p3, z5);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setColor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00601 extends FunctionReferenceImpl implements Function3 {
        public C00601(Object obj) {
            super(3, obj, CommandQueue.class, "setColorProperty", "setColorProperty-iFQtAB8(JLjava/lang/String;I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m63invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, ((Number) obj3).intValue());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m63invokeiFQtAB8(long j, @NotNull String p3, int i7) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            ((CommandQueue) this.receiver).m172setColorPropertyiFQtAB8(j, p3, i7);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setEnum$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00611 extends FunctionReferenceImpl implements Function3 {
        public C00611(Object obj) {
            super(3, obj, CommandQueue.class, "setEnumProperty", "setEnumProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m64invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, (String) obj3);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m64invokeiFQtAB8(long j, @NotNull String p3, @NotNull String p5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            Intrinsics.checkNotNullParameter(p5, "p2");
            ((CommandQueue) this.receiver).m173setEnumPropertyiFQtAB8(j, p3, p5);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setImage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00632 extends FunctionReferenceImpl implements Function3 {
        public C00632(Object obj) {
            super(3, obj, CommandQueue.class, "setImageProperty", "setImageProperty-ugE2Goo(JLjava/lang/String;J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m65invokeugE2Goo(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, ((ImageHandle) obj3).m212unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-ugE2Goo, reason: not valid java name */
        public final void m65invokeugE2Goo(long j, @NotNull String p3, long j5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            ((CommandQueue) this.receiver).m174setImagePropertyugE2Goo(j, p3, j5);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setNumber$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00641 extends FunctionReferenceImpl implements Function3 {
        public C00641(Object obj) {
            super(3, obj, CommandQueue.class, "setNumberProperty", "setNumberProperty-iFQtAB8(JLjava/lang/String;F)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m66invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, ((Number) obj3).floatValue());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m66invokeiFQtAB8(long j, @NotNull String p3, float f2) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            ((CommandQueue) this.receiver).m175setNumberPropertyiFQtAB8(j, p3, f2);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setString$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00651 extends FunctionReferenceImpl implements Function3 {
        public C00651(Object obj) {
            super(3, obj, CommandQueue.class, "setStringProperty", "setStringProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m67invokeiFQtAB8(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, (String) obj3);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m67invokeiFQtAB8(long j, @NotNull String p3, @NotNull String p5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            Intrinsics.checkNotNullParameter(p5, "p2");
            ((CommandQueue) this.receiver).m176setStringPropertyiFQtAB8(j, p3, p5);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setViewModelInstance$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00672 extends FunctionReferenceImpl implements Function3 {
        public C00672(Object obj) {
            super(3, obj, CommandQueue.class, "setViewModelInstanceProperty", "setViewModelInstanceProperty-Y8k3COA(JLjava/lang/String;J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m68invokeY8k3COA(((ViewModelInstanceHandle) obj).m234unboximpl(), (String) obj2, ((ViewModelInstanceHandle) obj3).m234unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-Y8k3COA, reason: not valid java name */
        public final void m68invokeY8k3COA(long j, @NotNull String p3, long j5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            ((CommandQueue) this.receiver).m177setViewModelInstancePropertyY8k3COA(j, p3, j5);
        }
    }

    public /* synthetic */ ViewModelInstance(long j, CommandQueue commandQueue, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue, j5);
    }

    private final <T> Flow getPropertyFlow(final String propertyPath, Map<String, Flow> cache, Function3 getter, v updateFlow, ViewModel.PropertyDataType propertyType) {
        Flow flowH = cache.get(propertyPath);
        if (flowH == null) {
            final i0 i0Var = new i0(updateFlow, new ViewModelInstance$getPropertyFlow$1$1(this, propertyPath, propertyType, getter, null));
            final Flow flow = new Flow() { // from class: app.rive.ViewModelInstance$getPropertyFlow$lambda$2$$inlined$filter$1

                /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$lambda$2$$inlined$filter$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ViewModelInstance.kt\napp/rive/ViewModelInstance\n*L\n1#1,218:1\n18#2:219\n19#2:221\n104#3:220\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ String $propertyPath$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ ViewModelInstance this$0;

                    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$lambda$2$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @d(c = "app.rive.ViewModelInstance$getPropertyFlow$lambda$2$$inlined$filter$1$2", f = "ViewModelInstance.kt", l = {219}, m = "emit")
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // xn.a
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ViewModelInstance viewModelInstance, String str) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = viewModelInstance;
                        this.$propertyPath$inlined = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i7 = anonymousClass1.label;
                            if ((i7 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i7 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        wn.a aVar = wn.a.f22354d;
                        int i10 = anonymousClass1.label;
                        if (i10 == 0) {
                            ib.a.L(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            CommandQueue.PropertyUpdate propertyUpdate = (CommandQueue.PropertyUpdate) obj;
                            if (ViewModelInstanceHandle.m231equalsimpl0(propertyUpdate.m183getHandleVPLto4w(), this.this$0.getInstanceHandle()) && Intrinsics.areEqual(propertyUpdate.getPropertyPath(), this.$propertyPath$inlined)) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ib.a.L(obj2);
                        }
                        return Unit.f14616a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = i0Var.collect(new AnonymousClass2(flowCollector, this, propertyPath), continuation);
                    return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
                }
            };
            flowH = z.h(new Flow() { // from class: app.rive.ViewModelInstance$getPropertyFlow$lambda$2$$inlined$map$1

                /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$lambda$2$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ViewModelInstance.kt\napp/rive/ViewModelInstance\n*L\n1#1,218:1\n50#2:219\n105#3:220\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @d(c = "app.rive.ViewModelInstance$getPropertyFlow$lambda$2$$inlined$map$1$2", f = "ViewModelInstance.kt", l = {219}, m = "emit")
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // xn.a
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i7 = anonymousClass1.label;
                            if ((i7 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i7 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        wn.a aVar = wn.a.f22354d;
                        int i10 = anonymousClass1.label;
                        if (i10 == 0) {
                            ib.a.L(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Object value = ((CommandQueue.PropertyUpdate) obj).getValue();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(value, anonymousClass1) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ib.a.L(obj2);
                        }
                        return Unit.f14616a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
                }
            });
            cache.put(propertyPath, flowH);
        }
        return flowH;
    }

    private final <T> void setProperty(String propertyPath, T value, Function3 setter) {
        setter.invoke(ViewModelInstanceHandle.m228boximpl(this.instanceHandle), propertyPath, value);
        this._dirtyFlow.d(Unit.f14616a);
    }

    public final void appendToList(@NotNull String propertyPath, @NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(item, "item");
        this.riveWorker.m123appendToListY8k3COA(this.instanceHandle, propertyPath, item.instanceHandle);
        this._dirtyFlow.d(Unit.f14616a);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }

    public final void fireTrigger(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        this.riveWorker.m143fireTriggerPropertyippgHXQ(this.instanceHandle, propertyPath);
    }

    @NotNull
    public final Flow getBooleanFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.booleanFlows, new C00531(this.riveWorker), this.riveWorker.getBooleanPropertyFlow(), ViewModel.PropertyDataType.BOOLEAN);
    }

    @NotNull
    public final Flow getColorFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.colorFlows, new C00541(this.riveWorker), this.riveWorker.getColorPropertyFlow(), ViewModel.PropertyDataType.COLOR);
    }

    @NotNull
    /* JADX INFO: renamed from: getDirtyFlow$kotlin_release, reason: from getter */
    public final v getDirtyFlow() {
        return this.dirtyFlow;
    }

    @NotNull
    public final Flow getEnumFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.enumFlows, new C00551(this.riveWorker), this.riveWorker.getEnumPropertyFlow(), ViewModel.PropertyDataType.ENUM);
    }

    /* JADX INFO: renamed from: getInstanceHandle-VPLto4w, reason: not valid java name and from getter */
    public final long getInstanceHandle() {
        return this.instanceHandle;
    }

    public final Object getListSize(@NotNull String str, @NotNull Continuation continuation) {
        return this.riveWorker.m150getListSizeiFQtAB8(this.instanceHandle, str, continuation);
    }

    @NotNull
    public final Flow getNumberFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.numberFlows, new C00561(this.riveWorker), this.riveWorker.getNumberPropertyFlow(), ViewModel.PropertyDataType.NUMBER);
    }

    @NotNull
    public final Flow getStringFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.stringFlows, new C00571(this.riveWorker), this.riveWorker.getStringPropertyFlow(), ViewModel.PropertyDataType.STRING);
    }

    @NotNull
    public final Flow getTriggerFlow(@NotNull final String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Map<String, Flow> map = this.triggerFlows;
        Flow flowE = map.get(propertyPath);
        if (flowE == null) {
            final i0 i0Var = new i0(this.riveWorker.getTriggerPropertyFlow(), new ViewModelInstance$getTriggerFlow$1$1(this, propertyPath, null));
            final Flow flow = new Flow() { // from class: app.rive.ViewModelInstance$getTriggerFlow$lambda$5$$inlined$filter$1

                /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$lambda$5$$inlined$filter$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ViewModelInstance.kt\napp/rive/ViewModelInstance\n*L\n1#1,218:1\n18#2:219\n19#2:221\n235#3:220\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ String $propertyPath$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ ViewModelInstance this$0;

                    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @d(c = "app.rive.ViewModelInstance$getTriggerFlow$lambda$5$$inlined$filter$1$2", f = "ViewModelInstance.kt", l = {219}, m = "emit")
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // xn.a
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ViewModelInstance viewModelInstance, String str) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = viewModelInstance;
                        this.$propertyPath$inlined = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i7 = anonymousClass1.label;
                            if ((i7 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i7 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        wn.a aVar = wn.a.f22354d;
                        int i10 = anonymousClass1.label;
                        if (i10 == 0) {
                            ib.a.L(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            CommandQueue.PropertyUpdate propertyUpdate = (CommandQueue.PropertyUpdate) obj;
                            if (ViewModelInstanceHandle.m231equalsimpl0(propertyUpdate.m183getHandleVPLto4w(), this.this$0.getInstanceHandle()) && Intrinsics.areEqual(propertyUpdate.getPropertyPath(), this.$propertyPath$inlined)) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ib.a.L(obj2);
                        }
                        return Unit.f14616a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = i0Var.collect(new AnonymousClass2(flowCollector, this, propertyPath), continuation);
                    return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
                }
            };
            flowE = z.e(new Flow() { // from class: app.rive.ViewModelInstance$getTriggerFlow$lambda$5$$inlined$map$1

                /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$lambda$5$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ViewModelInstance.kt\napp/rive/ViewModelInstance\n*L\n1#1,218:1\n50#2:219\n236#3:220\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @d(c = "app.rive.ViewModelInstance$getTriggerFlow$lambda$5$$inlined$map$1$2", f = "ViewModelInstance.kt", l = {219}, m = "emit")
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // xn.a
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i7 = anonymousClass1.label;
                            if ((i7 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i7 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        wn.a aVar = wn.a.f22354d;
                        int i10 = anonymousClass1.label;
                        if (i10 == 0) {
                            ib.a.L(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Unit unit = Unit.f14616a;
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(unit, anonymousClass1) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ib.a.L(obj2);
                        }
                        return Unit.f14616a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
                }
            }, 32, cr.a.f7343e);
            map.put(propertyPath, flowE);
        }
        return flowE;
    }

    public final void insertToListAtIndex(@NotNull String propertyPath, int index, @NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(item, "item");
        this.riveWorker.m157insertToListAtIndex4ua1WBo(this.instanceHandle, propertyPath, index, item.instanceHandle);
        this._dirtyFlow.d(Unit.f14616a);
    }

    public final boolean isOwnedBy$kotlin_release(@NotNull CommandQueue worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        return this.riveWorker == worker;
    }

    public final void removeFromList(@NotNull String propertyPath, @NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(item, "item");
        this.riveWorker.m166removeFromListY8k3COA(this.instanceHandle, propertyPath, item.instanceHandle);
        this._dirtyFlow.d(Unit.f14616a);
    }

    public final void removeFromListAtIndex(@NotNull String propertyPath, int index) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        this.riveWorker.m167removeFromListAtIndexiFQtAB8(this.instanceHandle, propertyPath, index);
        this._dirtyFlow.d(Unit.f14616a);
    }

    public final void setArtboard(@NotNull final String propertyPath, @NotNull final Artboard artboard) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0<String>() { // from class: app.rive.ViewModelInstance.setArtboard.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                Artboard artboard2 = artboard;
                String str = propertyPath;
                String strM197toStringimpl = FileHandle.m197toStringimpl(this.fileHandle);
                StringBuilder sb2 = new StringBuilder("Assigning ");
                sb2.append(artboard2);
                sb2.append(" to ");
                sb2.append(str);
                sb2.append(" (");
                return com.discord.chat.presentation.list.a.k(sb2, strM197toStringimpl, ")");
            }
        });
        setProperty(propertyPath, ArtboardHandle.m103boximpl(artboard.getArtboardHandle()), new AnonymousClass2(this.riveWorker));
    }

    public final void setBoolean(@NotNull String propertyPath, boolean value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        setProperty(propertyPath, Boolean.valueOf(value), new C00591(this.riveWorker));
    }

    public final void setColor(@NotNull String propertyPath, int value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        setProperty(propertyPath, Integer.valueOf(value), new C00601(this.riveWorker));
    }

    public final void setEnum(@NotNull String propertyPath, @NotNull String value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(value, "value");
        setProperty(propertyPath, value, new C00611(this.riveWorker));
    }

    public final void setImage(@NotNull final String propertyPath, @NotNull final ImageAsset image) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(image, "image");
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0<String>() { // from class: app.rive.ViewModelInstance.setImage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                ImageAsset imageAsset = image;
                String str = propertyPath;
                String strM197toStringimpl = FileHandle.m197toStringimpl(this.fileHandle);
                StringBuilder sb2 = new StringBuilder("Assigning ");
                sb2.append(imageAsset);
                sb2.append(" to ");
                sb2.append(str);
                sb2.append(" (");
                return com.discord.chat.presentation.list.a.k(sb2, strM197toStringimpl, ")");
            }
        });
        setProperty(propertyPath, image.getHandle(), new C00632(this.riveWorker));
    }

    public final void setNumber(@NotNull String propertyPath, float value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        setProperty(propertyPath, Float.valueOf(value), new C00641(this.riveWorker));
    }

    public final void setString(@NotNull String propertyPath, @NotNull String value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(value, "value");
        setProperty(propertyPath, value, new C00651(this.riveWorker));
    }

    public final void setViewModelInstance(@NotNull final String propertyPath, @NotNull ViewModelInstance instance) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(instance, "instance");
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0<String>() { // from class: app.rive.ViewModelInstance.setViewModelInstance.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                ViewModelInstance viewModelInstance = ViewModelInstance.this;
                String str = propertyPath;
                String strM197toStringimpl = FileHandle.m197toStringimpl(this.fileHandle);
                StringBuilder sb2 = new StringBuilder("Assigning ");
                sb2.append(viewModelInstance);
                sb2.append(" to ");
                sb2.append(str);
                sb2.append(" (");
                return com.discord.chat.presentation.list.a.k(sb2, strM197toStringimpl, ")");
            }
        });
        setProperty(propertyPath, ViewModelInstanceHandle.m228boximpl(instance.instanceHandle), new C00672(this.riveWorker));
    }

    public final void swapListItems(@NotNull String propertyPath, int indexA, int indexB) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        this.riveWorker.m179swapListItemsC5vwGj0(this.instanceHandle, propertyPath, indexA, indexB);
        this._dirtyFlow.d(Unit.f14616a);
    }

    private ViewModelInstance(final long j, final CommandQueue riveWorker, final long j5) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        this.instanceHandle = j;
        this.riveWorker = riveWorker;
        this.fileHandle = j5;
        this.$$delegate_0 = new CloseOnce(ViewModelInstanceHandle.m233toStringimpl(j), new Function0<Unit>() { // from class: app.rive.ViewModelInstance.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m55invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m55invoke() {
                final long j7 = j;
                final long j10 = j5;
                RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0<String>() { // from class: app.rive.ViewModelInstance.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return g.f("Deleting ", ViewModelInstanceHandle.m233toStringimpl(j7), " (", FileHandle.m197toStringimpl(j10), ")");
                    }
                });
                riveWorker.m140deleteViewModelInstancemBajs_U(j);
            }
        });
        y yVarA = z.a(1, 1, cr.a.f7343e);
        this._dirtyFlow = yVarA;
        this.dirtyFlow = yVarA;
        this.numberFlows = new LinkedHashMap();
        this.stringFlows = new LinkedHashMap();
        this.booleanFlows = new LinkedHashMap();
        this.enumFlows = new LinkedHashMap();
        this.colorFlows = new LinkedHashMap();
        this.triggerFlows = new LinkedHashMap();
    }
}
