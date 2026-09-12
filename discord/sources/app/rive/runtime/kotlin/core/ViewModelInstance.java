package app.rive.runtime.kotlin.core;

import a3.e;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001KB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0011\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0003H\u0092 J\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0092 J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010 \u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010!\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010\"\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0019\u0010#\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0092 J\u0011\u0010$\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0003H\u0092 J!\u0010%\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003H\u0092 J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u00100\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u0002042\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u00105\u001a\u0002062\u0006\u0010\u001a\u001a\u00020\u0007H\u0016JX\u00107\u001a\u0002H8\"\u000e\b\u0000\u00108\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u001a\u001a\u00020\u00072\u001a\b\u0004\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030:2\u0014\b\u0004\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H80<H\u0092\b¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020?2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010@\u001a\u00020A2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\r\u0010B\u001a\u00020\u0014H\u0011¢\u0006\u0002\bCJ\u0018\u0010D\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u0000H\u0016J\b\u0010F\u001a\u00020GH\u0016J\u0016\u0010H\u001a\u00020\u00002\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070JH\u0012R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u0006X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u0006X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006L"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "(J)V", "children", "", "", "getChildren", "()Ljava/util/Map;", "setChildren", "(Ljava/util/Map;)V", StackTraceHelper.NAME_KEY, "getName", "()Ljava/lang/String;", "properties", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "getProperties", "setProperties", "cppDelete", "", "pointer", "cppDerefInstance", "cppPointer", "cppName", "cppPropertyArtboard", "path", "cppPropertyBoolean", "cppPropertyColor", "cppPropertyEnum", "cppPropertyImage", "cppPropertyInstance", "cppPropertyList", "cppPropertyNumber", "cppPropertyString", "cppPropertyTrigger", "cppRefInstance", "cppSetInstanceProperty", "", "instancePointer", "getArtboardProperty", "Lapp/rive/runtime/kotlin/core/ViewModelArtboardProperty;", "getBooleanProperty", "Lapp/rive/runtime/kotlin/core/ViewModelBooleanProperty;", "getColorProperty", "Lapp/rive/runtime/kotlin/core/ViewModelColorProperty;", "getEnumProperty", "Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;", "getImageProperty", "Lapp/rive/runtime/kotlin/core/ViewModelImageProperty;", "getInstanceProperty", "getListProperty", "Lapp/rive/runtime/kotlin/core/ViewModelListProperty;", "getNumberProperty", "Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;", "getProperty", "T", "cppGetPropertyFn", "Lkotlin/Function2;", "constructor", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "getStringProperty", "Lapp/rive/runtime/kotlin/core/ViewModelStringProperty;", "getTriggerProperty", "Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "pollChanges", "pollChanges$kotlin_release", "setInstanceProperty", "instance", "transfer", "Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "traverse", "parts", "", "Transfer", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewModelInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelInstance.kt\napp/rive/runtime/kotlin/core/ViewModelInstance\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,766:1\n219#1,23:771\n219#1,23:794\n219#1,23:817\n219#1,23:840\n219#1,23:863\n219#1,23:886\n219#1,23:909\n219#1,23:932\n219#1,23:955\n1863#2,2:767\n1863#2,2:769\n381#3,7:978\n*S KotlinDebug\n*F\n+ 1 ViewModelInstance.kt\napp/rive/runtime/kotlin/core/ViewModelInstance\n*L\n86#1:771,23\n97#1:794,23\n108#1:817,23\n121#1:840,23\n134#1:863,23\n145#1:886,23\n156#1:909,23\n167#1:932,23\n171#1:955,23\n71#1:767,2\n72#1:769,2\n270#1:978,7\n*E\n"})
public class ViewModelInstance extends NativeObject {
    public static final int $stable = 8;

    @NotNull
    private Map<String, ViewModelInstance> children;

    @NotNull
    private Map<String, ViewModelProperty<?>> properties;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\r\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "", "instance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "valid", "", "dispose", "", ViewProps.END, "end$kotlin_release", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Transfer {
        public static final int $stable = 8;

        @NotNull
        private final ViewModelInstance instance;
        private boolean valid;

        public Transfer(@NotNull ViewModelInstance instance) throws ViewModelException {
            Intrinsics.checkNotNullParameter(instance, "instance");
            this.instance = instance;
            this.valid = true;
            if (instance.getRefCount() <= 0) {
                throw new ViewModelException("Cannot transfer a disposed ViewModelInstance.");
            }
            instance.cppRefInstance(instance.getCppPointer());
            instance.acquire();
        }

        public final void dispose() throws ViewModelException {
            if (this.valid) {
                this.valid = false;
                this.instance.release();
            } else {
                throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot dispose.");
            }
        }

        @NotNull
        public final ViewModelInstance end$kotlin_release() {
            if (this.valid) {
                this.valid = false;
                return this.instance;
            }
            throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot end transfer again.");
        }
    }

    public ViewModelInstance(long j) {
        super(j);
        this.properties = new ConcurrentHashMap();
        this.children = new ConcurrentHashMap();
        cppRefInstance(getCppPointer());
    }

    private native void cppDerefInstance(long cppPointer);

    private native String cppName(long cppPointer);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyArtboard(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyBoolean(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyColor(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyEnum(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyImage(long cppPointer, String path);

    private native long cppPropertyInstance(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyList(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyNumber(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyString(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native long cppPropertyTrigger(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public native void cppRefInstance(long cppPointer);

    private native boolean cppSetInstanceProperty(long cppPointer, String path, long instancePointer);

    private /* synthetic */ <T extends ViewModelProperty<?>> T getProperty(String path, Function2<? super Long, ? super String, Long> cppGetPropertyFn, Function1<? super Long, ? extends T> constructor) throws ViewModelException {
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        T t5 = (T) viewModelInstanceTraverse.getProperties().get(str);
        if (t5 != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            return t5;
        }
        long jLongValue = ((Number) cppGetPropertyFn.invoke(Long.valueOf(viewModelInstanceTraverse.getCppPointer()), str)).longValue();
        if (jLongValue == 0) {
            throw new ViewModelException(e.l("Property not found: ", path));
        }
        T t10 = (T) constructor.invoke(Long.valueOf(jLongValue));
        viewModelInstanceTraverse.getProperties().put(str, t10);
        getDependencies().add(t10);
        return t10;
    }

    private ViewModelInstance traverse(List<String> parts) throws ViewModelException {
        if (parts.isEmpty()) {
            return this;
        }
        String str = (String) CollectionsKt.K(parts);
        Map<String, ViewModelInstance> children = getChildren();
        ViewModelInstance viewModelInstanceTraverse$createChildInstance = children.get(str);
        if (viewModelInstanceTraverse$createChildInstance == null) {
            viewModelInstanceTraverse$createChildInstance = traverse$createChildInstance(this, str);
            children.put(str, viewModelInstanceTraverse$createChildInstance);
        }
        return viewModelInstanceTraverse$createChildInstance.traverse(parts.subList(1, parts.size()));
    }

    private static final ViewModelInstance traverse$createChildInstance(ViewModelInstance viewModelInstance, String str) throws ViewModelException {
        long jCppPropertyInstance = viewModelInstance.cppPropertyInstance(viewModelInstance.getCppPointer(), str);
        if (jCppPropertyInstance == 0) {
            throw new ViewModelException(e.l("Property not found: ", str));
        }
        ViewModelInstance viewModelInstance2 = new ViewModelInstance(jCppPropertyInstance);
        viewModelInstance.getChildren().put(str, viewModelInstance2);
        viewModelInstance.getDependencies().add(viewModelInstance2);
        return viewModelInstance2;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long pointer) {
        cppDerefInstance(pointer);
    }

    @NotNull
    public ViewModelArtboardProperty getArtboardProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyArtboard = cppPropertyArtboard(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyArtboard == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelArtboardProperty viewModelArtboardProperty = new ViewModelArtboardProperty(jCppPropertyArtboard);
            viewModelInstanceTraverse.getProperties().put(str, viewModelArtboardProperty);
            getDependencies().add(viewModelArtboardProperty);
            viewModelProperty = viewModelArtboardProperty;
        } else if (!(viewModelProperty instanceof ViewModelArtboardProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelArtboardProperty) viewModelProperty;
    }

    @NotNull
    public ViewModelBooleanProperty getBooleanProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyBoolean = cppPropertyBoolean(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyBoolean == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelBooleanProperty viewModelBooleanProperty = new ViewModelBooleanProperty(jCppPropertyBoolean);
            viewModelInstanceTraverse.getProperties().put(str, viewModelBooleanProperty);
            getDependencies().add(viewModelBooleanProperty);
            viewModelProperty = viewModelBooleanProperty;
        } else if (!(viewModelProperty instanceof ViewModelBooleanProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelBooleanProperty) viewModelProperty;
    }

    @NotNull
    public Map<String, ViewModelInstance> getChildren() {
        return this.children;
    }

    @NotNull
    public ViewModelColorProperty getColorProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyColor = cppPropertyColor(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyColor == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelColorProperty viewModelColorProperty = new ViewModelColorProperty(jCppPropertyColor);
            viewModelInstanceTraverse.getProperties().put(str, viewModelColorProperty);
            getDependencies().add(viewModelColorProperty);
            viewModelProperty = viewModelColorProperty;
        } else if (!(viewModelProperty instanceof ViewModelColorProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelColorProperty) viewModelProperty;
    }

    @NotNull
    public ViewModelEnumProperty getEnumProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyEnum = cppPropertyEnum(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyEnum == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelEnumProperty viewModelEnumProperty = new ViewModelEnumProperty(jCppPropertyEnum);
            viewModelInstanceTraverse.getProperties().put(str, viewModelEnumProperty);
            getDependencies().add(viewModelEnumProperty);
            viewModelProperty = viewModelEnumProperty;
        } else if (!(viewModelProperty instanceof ViewModelEnumProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelEnumProperty) viewModelProperty;
    }

    @NotNull
    public ViewModelImageProperty getImageProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyImage = cppPropertyImage(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyImage == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelImageProperty viewModelImageProperty = new ViewModelImageProperty(jCppPropertyImage);
            viewModelInstanceTraverse.getProperties().put(str, viewModelImageProperty);
            getDependencies().add(viewModelImageProperty);
            viewModelProperty = viewModelImageProperty;
        } else if (!(viewModelProperty instanceof ViewModelImageProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelImageProperty) viewModelProperty;
    }

    @NotNull
    public ViewModelInstance getInstanceProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return traverse(StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null));
    }

    @NotNull
    public ViewModelListProperty getListProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyList = cppPropertyList(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyList == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelListProperty viewModelListProperty = new ViewModelListProperty(jCppPropertyList);
            viewModelInstanceTraverse.getProperties().put(str, viewModelListProperty);
            getDependencies().add(viewModelListProperty);
            viewModelProperty = viewModelListProperty;
        } else if (!(viewModelProperty instanceof ViewModelListProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelListProperty) viewModelProperty;
    }

    @NotNull
    public String getName() {
        return cppName(getCppPointer());
    }

    @NotNull
    public ViewModelNumberProperty getNumberProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyNumber = cppPropertyNumber(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyNumber == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelNumberProperty viewModelNumberProperty = new ViewModelNumberProperty(jCppPropertyNumber);
            viewModelInstanceTraverse.getProperties().put(str, viewModelNumberProperty);
            getDependencies().add(viewModelNumberProperty);
            viewModelProperty = viewModelNumberProperty;
        } else if (!(viewModelProperty instanceof ViewModelNumberProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelNumberProperty) viewModelProperty;
    }

    @NotNull
    public Map<String, ViewModelProperty<?>> getProperties() {
        return this.properties;
    }

    @NotNull
    public ViewModelStringProperty getStringProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyString = cppPropertyString(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyString == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelStringProperty viewModelStringProperty = new ViewModelStringProperty(jCppPropertyString);
            viewModelInstanceTraverse.getProperties().put(str, viewModelStringProperty);
            getDependencies().add(viewModelStringProperty);
            viewModelProperty = viewModelStringProperty;
        } else if (!(viewModelProperty instanceof ViewModelStringProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelStringProperty) viewModelProperty;
    }

    @NotNull
    public ViewModelTriggerProperty getTriggerProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.getProperties().get(str);
        if (viewModelProperty == null) {
            long jCppPropertyTrigger = cppPropertyTrigger(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyTrigger == 0) {
                throw new ViewModelException(e.l("Property not found: ", path));
            }
            ViewModelTriggerProperty viewModelTriggerProperty = new ViewModelTriggerProperty(jCppPropertyTrigger);
            viewModelInstanceTraverse.getProperties().put(str, viewModelTriggerProperty);
            getDependencies().add(viewModelTriggerProperty);
            viewModelProperty = viewModelTriggerProperty;
        } else if (!(viewModelProperty instanceof ViewModelTriggerProperty)) {
            throw new ViewModelException(g.e("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelTriggerProperty) viewModelProperty;
    }

    public void pollChanges$kotlin_release() {
        Iterator<T> it = getProperties().values().iterator();
        while (it.hasNext()) {
            ((ViewModelProperty) it.next()).pollChanges$kotlin_release();
        }
        Iterator<T> it2 = getChildren().values().iterator();
        while (it2.hasNext()) {
            ((ViewModelInstance) it2.next()).pollChanges$kotlin_release();
        }
    }

    public void setChildren(@NotNull Map<String, ViewModelInstance> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.children = map;
    }

    public void setInstanceProperty(@NotNull String path, @NotNull ViewModelInstance instance) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(instance, "instance");
        List listSplit$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.Q(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        if (!cppSetInstanceProperty(viewModelInstanceTraverse.getCppPointer(), str, instance.getCppPointer())) {
            throw new ViewModelException(g.e("Property not found: ", path, "; or instance is incompatible."));
        }
        viewModelInstanceTraverse.getChildren().put(str, instance);
    }

    public void setProperties(@NotNull Map<String, ViewModelProperty<?>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.properties = map;
    }

    @NotNull
    public Transfer transfer() {
        return new Transfer(this);
    }
}
