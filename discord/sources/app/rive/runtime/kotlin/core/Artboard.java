package app.rive.runtime.kotlin.core;

import a3.e;
import android.graphics.RectF;
import app.rive.runtime.kotlin.core.errors.AnimationException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import lo.j;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020!H\u0016J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\nH\u0016J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000fH\u0016J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0012J\u0019\u0010B\u001a\u00020;2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010<\u001a\u00020!H\u0092 J\u0019\u0010D\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\nH\u0092 J\u0019\u0010E\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000fH\u0092 J\u0011\u0010F\u001a\u00020\n2\u0006\u0010C\u001a\u00020\u0003H\u0092 J\u0019\u0010G\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\nH\u0092 J\u0011\u0010H\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u0003H\u0092 J\u0011\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0003H\u0096 J\u0019\u0010L\u001a\u00020J2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0003H\u0092 J1\u0010N\u001a\u00020J2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020!H\u0095 J\u0019\u0010T\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000fH\u0092 J!\u0010U\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fH\u0092 J\u001b\u0010W\u001a\u0004\u0018\u00010\u000f2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000fH\u0092 J#\u0010X\u001a\u0004\u0018\u00010\u000f2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fH\u0092 J\u0011\u0010Y\u001a\u00020!2\u0006\u0010C\u001a\u00020\u0003H\u0092 J\u0011\u0010Z\u001a\u00020!2\u0006\u0010C\u001a\u00020\u0003H\u0092 J\u0011\u0010[\u001a\u00020!2\u0006\u0010C\u001a\u00020\u0003H\u0092 J!\u0010\\\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fH\u0092 J\u0011\u0010]\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u0003H\u0092 J\u0011\u0010^\u001a\u00020J2\u0006\u0010C\u001a\u00020\u0003H\u0092 J\u0019\u0010_\u001a\u00020J2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0092 J\u0019\u0010`\u001a\u00020J2\u0006\u0010C\u001a\u00020\u00032\u0006\u00107\u001a\u00020!H\u0092 J!\u0010a\u001a\u00020;2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u000fH\u0092 J)\u0010c\u001a\u00020;2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fH\u0092 J\u0019\u0010d\u001a\u00020J2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010e\u001a\u00020\u0003H\u0092 J\u0019\u0010f\u001a\u00020J2\u0006\u0010C\u001a\u00020\u00032\u0006\u00104\u001a\u00020!H\u0092 J\u0019\u0010g\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\nH\u0092 J\u0019\u0010h\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000fH\u0092 J\u0011\u0010i\u001a\u00020\n2\u0006\u0010C\u001a\u00020\u0003H\u0092 J\u0019\u0010j\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\nH\u0092 J\u0010\u0010k\u001a\u00020J2\u0006\u0010l\u001a\u00020\u0003H\u0017J*\u0010k\u001a\u00020J2\u0006\u0010l\u001a\u00020\u00032\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020!H\u0017J\u0012\u0010m\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0016J\u001a\u0010m\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fH\u0016J\u0018\u0010A\u001a\u00020@2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fH\u0016J\u0010\u0010n\u001a\u00020.2\u0006\u0010o\u001a\u00020pH\u0016J\b\u0010q\u001a\u00020\nH\u0016J\b\u0010r\u001a\u00020JH\u0016J\u0018\u0010s\u001a\u00020J2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020\u000fH\u0016J \u0010s\u001a\u00020J2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fH\u0016J\u0010\u0010u\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\nH\u0016J\u0010\u0010u\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u000fH\u0016J\u0010\u0010v\u001a\u00020w2\u0006\u0010'\u001a\u00020\u000fH\u0016J\u0018\u0010v\u001a\u00020w2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fH\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\fR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0011R(\u0010/\u001a\u0004\u0018\u00010.2\b\u0010 \u001a\u0004\u0018\u00010.@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020!2\u0006\u0010 \u001a\u00020!8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R$\u00107\u001a\u00020!2\u0006\u0010 \u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&¨\u0006x"}, d2 = {"Lapp/rive/runtime/kotlin/core/Artboard;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "file", "Lapp/rive/runtime/kotlin/core/File;", "(JLjava/util/concurrent/locks/ReentrantLock;Lapp/rive/runtime/kotlin/core/File;)V", "animationCount", "", "getAnimationCount", "()I", "animationNames", "", "", "getAnimationNames", "()Ljava/util/List;", "bounds", "Landroid/graphics/RectF;", "getBounds", "()Landroid/graphics/RectF;", "getFile$kotlin_release", "()Lapp/rive/runtime/kotlin/core/File;", "firstAnimation", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "getFirstAnimation", "()Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "firstStateMachine", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "getFirstStateMachine", "()Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "value", "", "height", "getHeight", "()F", "setHeight", "(F)V", StackTraceHelper.NAME_KEY, "getName", "()Ljava/lang/String;", "stateMachineCount", "getStateMachineCount", "stateMachineNames", "getStateMachineNames", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "viewModelInstance", "getViewModelInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "setViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "volume", "getVolume", "setVolume$kotlin_release", "width", "getWidth", "setWidth", "advance", "", "elapsedTime", "animation", "index", "convertInput", "Lapp/rive/runtime/kotlin/core/SMIInput;", "input", "cppAdvance", "cppPointer", "cppAnimationByIndex", "cppAnimationByName", "cppAnimationCount", "cppAnimationNameByIndex", "cppBounds", "cppDelete", "", "pointer", "cppDraw", "rendererPointer", "cppDrawAligned", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "scaleFactor", "cppFindTextValueRun", "cppFindTextValueRunAtPath", "path", "cppFindValueOfTextValueRun", "cppFindValueOfTextValueRunAtPath", "cppGetArtboardHeight", "cppGetArtboardWidth", "cppGetVolume", "cppInputByNameAtPath", "cppName", "cppResetArtboardSize", "cppSetArtboardHeight", "cppSetArtboardWidth", "cppSetValueOfTextValueRun", "newText", "cppSetValueOfTextValueRunAtPath", "cppSetViewModelInstance", "instancePointer", "cppSetVolume", "cppStateMachineByIndex", "cppStateMachineByName", "cppStateMachineCount", "cppStateMachineNameByIndex", "draw", "rendererAddress", "getTextRunValue", "receiveViewModelInstance", "transfer", "Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "release", "resetArtboardSize", "setTextRunValue", "textValue", "stateMachine", "textRun", "Lapp/rive/runtime/kotlin/core/RiveTextValueRun;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArtboard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artboard.kt\napp/rive/runtime/kotlin/core/Artboard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1557#2:411\n1628#2,3:412\n1557#2:416\n1628#2,3:417\n1557#2:420\n1628#2,3:421\n1#3:415\n*S KotlinDebug\n*F\n+ 1 Artboard.kt\napp/rive/runtime/kotlin/core/Artboard\n*L\n146#1:411\n146#1:412,3\n396#1:416\n396#1:417,3\n400#1:420\n400#1:421,3\n*E\n"})
public class Artboard extends NativeObject {
    public static final int $stable = 8;
    private final File file;

    @NotNull
    private final ReentrantLock lock;
    private ViewModelInstance viewModelInstance;

    public /* synthetic */ Artboard(long j, ReentrantLock reentrantLock, File file, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, reentrantLock, (i7 & 4) != 0 ? null : file);
    }

    private SMIInput convertInput(SMIInput input) throws StateMachineInputException {
        if (input.isBoolean()) {
            return new SMIBoolean(input.getCppPointer());
        }
        if (input.isTrigger()) {
            return new SMITrigger(input.getCppPointer());
        }
        if (input.isNumber()) {
            return new SMINumber(input.getCppPointer());
        }
        throw new StateMachineInputException(g.e("Unknown State Machine Input Instance for ", input.getName(), "."));
    }

    private native boolean cppAdvance(long cppPointer, float elapsedTime);

    private native long cppAnimationByIndex(long cppPointer, int index);

    private native long cppAnimationByName(long cppPointer, String name);

    private native int cppAnimationCount(long cppPointer);

    private native String cppAnimationNameByIndex(long cppPointer, int index);

    private native RectF cppBounds(long cppPointer);

    private native void cppDraw(long cppPointer, long rendererPointer);

    private native long cppFindTextValueRun(long cppPointer, String name);

    private native long cppFindTextValueRunAtPath(long cppPointer, String name, String path);

    private native String cppFindValueOfTextValueRun(long cppPointer, String name);

    private native String cppFindValueOfTextValueRunAtPath(long cppPointer, String name, String path);

    private native float cppGetArtboardHeight(long cppPointer);

    private native float cppGetArtboardWidth(long cppPointer);

    private native float cppGetVolume(long cppPointer);

    private native long cppInputByNameAtPath(long cppPointer, String name, String path);

    private native String cppName(long cppPointer);

    private native void cppResetArtboardSize(long cppPointer);

    private native void cppSetArtboardHeight(long cppPointer, float height);

    private native void cppSetArtboardWidth(long cppPointer, float width);

    private native boolean cppSetValueOfTextValueRun(long cppPointer, String name, String newText);

    private native boolean cppSetValueOfTextValueRunAtPath(long cppPointer, String name, String newText, String path);

    private native void cppSetViewModelInstance(long cppPointer, long instancePointer);

    private native void cppSetVolume(long cppPointer, float volume);

    private native long cppStateMachineByIndex(long cppPointer, int index);

    private native long cppStateMachineByName(long cppPointer, String name);

    private native int cppStateMachineCount(long cppPointer);

    private native String cppStateMachineNameByIndex(long cppPointer, int index);

    public static /* synthetic */ void draw$default(Artboard artboard, long j, Fit fit, Alignment alignment, float f2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
        }
        if ((i7 & 8) != 0) {
            f2 = 1.0f;
        }
        artboard.draw(j, fit, alignment, f2);
    }

    public boolean advance(float elapsedTime) {
        boolean zCppAdvance;
        synchronized (this.lock) {
            zCppAdvance = cppAdvance(getCppPointer(), elapsedTime);
        }
        return zCppAdvance;
    }

    @NotNull
    public LinearAnimationInstance animation(int index) throws AnimationException {
        long jCppAnimationByIndex = cppAnimationByIndex(getCppPointer(), index);
        if (jCppAnimationByIndex == 0) {
            throw new AnimationException(g.d(index, "No Animation found at index ", "."));
        }
        LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByIndex, this.lock, 0.0f, 4, null);
        getDependencies().add(linearAnimationInstance);
        return linearAnimationInstance;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public native void cppDrawAligned(long cppPointer, long rendererPointer, @NotNull Fit fit, @NotNull Alignment alignment, float scaleFactor);

    public void draw(long rendererAddress) {
        synchronized (this.lock) {
            if (getHasCppObject()) {
                cppDraw(getCppPointer(), rendererAddress);
                Unit unit = Unit.f14616a;
            }
        }
    }

    public int getAnimationCount() {
        return cppAnimationCount(getCppPointer());
    }

    @NotNull
    public List<String> getAnimationNames() {
        IntRange intRangeI = j.i(0, getAnimationCount());
        ArrayList arrayList = new ArrayList(e0.l(intRangeI, 10));
        Iterator it = intRangeI.iterator();
        while (it.hasNext()) {
            arrayList.add(cppAnimationNameByIndex(getCppPointer(), ((s0) it).nextInt()));
        }
        return arrayList;
    }

    @NotNull
    public RectF getBounds() {
        return cppBounds(getCppPointer());
    }

    /* JADX INFO: renamed from: getFile$kotlin_release, reason: from getter */
    public File getFile() {
        return this.file;
    }

    @NotNull
    public LinearAnimationInstance getFirstAnimation() {
        return animation(0);
    }

    @NotNull
    public StateMachineInstance getFirstStateMachine() {
        return stateMachine(0);
    }

    public float getHeight() {
        return cppGetArtboardHeight(getCppPointer());
    }

    @NotNull
    public String getName() {
        return cppName(getCppPointer());
    }

    public int getStateMachineCount() {
        return cppStateMachineCount(getCppPointer());
    }

    @NotNull
    public List<String> getStateMachineNames() {
        IntRange intRangeI = j.i(0, getStateMachineCount());
        ArrayList arrayList = new ArrayList(e0.l(intRangeI, 10));
        Iterator it = intRangeI.iterator();
        while (it.hasNext()) {
            arrayList.add(cppStateMachineNameByIndex(getCppPointer(), ((s0) it).nextInt()));
        }
        return arrayList;
    }

    public String getTextRunValue(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return cppFindValueOfTextValueRun(getCppPointer(), name);
    }

    public ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public float getVolume() {
        return cppGetVolume(getCppPointer());
    }

    public float getWidth() {
        return cppGetArtboardWidth(getCppPointer());
    }

    @NotNull
    public SMIInput input(@NotNull String name, @NotNull String path) throws StateMachineInputException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        long jCppInputByNameAtPath = cppInputByNameAtPath(getCppPointer(), name, path);
        if (jCppInputByNameAtPath != 0) {
            return convertInput(new SMIInput(jCppInputByNameAtPath));
        }
        throw new StateMachineInputException(g.f("No StateMachineInput found with name \"", name, "\" in nested artboard ", path, "."));
    }

    @NotNull
    public ViewModelInstance receiveViewModelInstance(@NotNull ViewModelInstance.Transfer transfer) {
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (this.lock) {
            iRelease = super.release();
        }
        return iRelease;
    }

    public void resetArtboardSize() {
        cppResetArtboardSize(getCppPointer());
    }

    public void setHeight(float f2) {
        cppSetArtboardHeight(getCppPointer(), f2);
    }

    public void setTextRunValue(@NotNull String name, @NotNull String textValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        if (!cppSetValueOfTextValueRun(getCppPointer(), name, textValue)) {
            throw new TextValueRunException(g.e("Could not set text run. No Rive TextValueRun found with name \"", name, ".\""));
        }
    }

    public void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            synchronized (this.lock) {
                cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
                this.viewModelInstance = viewModelInstance;
                Unit unit = Unit.f14616a;
            }
        }
    }

    public void setVolume$kotlin_release(float f2) {
        cppSetVolume(getCppPointer(), f2);
    }

    public void setWidth(float f2) {
        cppSetArtboardWidth(getCppPointer(), f2);
    }

    @NotNull
    public StateMachineInstance stateMachine(int index) throws StateMachineException {
        long jCppStateMachineByIndex = cppStateMachineByIndex(getCppPointer(), index);
        if (jCppStateMachineByIndex == 0) {
            throw new StateMachineException(g.d(index, "No StateMachine found at index ", "."));
        }
        StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByIndex, this.lock);
        getDependencies().add(stateMachineInstance);
        return stateMachineInstance;
    }

    @NotNull
    public RiveTextValueRun textRun(@NotNull String name) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppFindTextValueRun = cppFindTextValueRun(getCppPointer(), name);
        if (jCppFindTextValueRun == 0) {
            throw new TextValueRunException(g.e("No Rive TextValueRun found with name \"", name, ".\""));
        }
        RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRun);
        getDependencies().add(riveTextValueRun);
        return riveTextValueRun;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard(long j, @NotNull ReentrantLock lock, File file) {
        super(j);
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.lock = lock;
        this.file = file;
    }

    public String getTextRunValue(@NotNull String name, @NotNull String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        return cppFindValueOfTextValueRunAtPath(getCppPointer(), name, path);
    }

    public void draw(long rendererAddress, @NotNull Fit fit, @NotNull Alignment alignment, float scaleFactor) {
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        synchronized (this.lock) {
            if (getHasCppObject()) {
                cppDrawAligned(getCppPointer(), rendererAddress, fit, alignment, scaleFactor);
                Unit unit = Unit.f14616a;
            }
        }
    }

    public void setTextRunValue(@NotNull String name, @NotNull String textValue, @NotNull String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Intrinsics.checkNotNullParameter(path, "path");
        if (!cppSetValueOfTextValueRunAtPath(getCppPointer(), name, textValue, path)) {
            throw new TextValueRunException(g.f("Could not set text run value at path. No Rive TextValueRun found with name \"", name, ".\" in nested artboard \"", path, ".\""));
        }
    }

    @NotNull
    public LinearAnimationInstance animation(@NotNull String name) throws AnimationException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppAnimationByName = cppAnimationByName(getCppPointer(), name);
        if (jCppAnimationByName == 0) {
            List<String> animationNames = getAnimationNames();
            ArrayList arrayList = new ArrayList(e0.l(animationNames, 10));
            Iterator<T> it = animationNames.iterator();
            while (it.hasNext()) {
                arrayList.add("\"" + ((String) it.next()) + "\"");
            }
            throw new AnimationException("Animation \"" + name + "\" not found. Available Animations: " + arrayList + "\"");
        }
        LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByName, this.lock, 0.0f, 4, null);
        getDependencies().add(linearAnimationInstance);
        return linearAnimationInstance;
    }

    @NotNull
    public StateMachineInstance stateMachine(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppStateMachineByName = cppStateMachineByName(getCppPointer(), name);
        if (jCppStateMachineByName != 0) {
            StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByName, this.lock);
            getDependencies().add(stateMachineInstance);
            return stateMachineInstance;
        }
        throw new StateMachineException(g.e("No StateMachine found with name ", name, "."));
    }

    @NotNull
    public RiveTextValueRun textRun(@NotNull String name, @NotNull String path) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        long jCppFindTextValueRunAtPath = cppFindTextValueRunAtPath(getCppPointer(), name, path);
        if (jCppFindTextValueRunAtPath != 0) {
            RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRunAtPath);
            getDependencies().add(riveTextValueRun);
            return riveTextValueRun;
        }
        throw new TextValueRunException(e.m("No Rive TextValueRun found with name \"", name, ".\" in nested artboard ", path));
    }
}
