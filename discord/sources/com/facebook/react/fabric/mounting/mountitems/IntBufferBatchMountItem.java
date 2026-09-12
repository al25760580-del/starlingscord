package com.facebook.react.fabric.mounting.mountitems;

import a3.e;
import android.os.Trace;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.StateWrapper;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import mo.c0;
import o8.a;
import org.jetbrains.annotations.NotNull;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/BatchMountItem;", "surfaceId", "", "intBuffer", "", "objBuffer", "", "", "commitNumber", "<init>", "(I[I[Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "intBufferLen", "objBufferLen", "beginMarkers", "", "reason", "", "endMarkers", "execute", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "getSurfaceId", "isBatchEmpty", "", "toString", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntBufferBatchMountItem implements BatchMountItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int INSTRUCTION_CREATE = 2;
    public static final int INSTRUCTION_DELETE = 4;
    public static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    public static final int INSTRUCTION_INSERT = 8;
    public static final int INSTRUCTION_REMOVE = 16;
    public static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    public static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    public static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    public static final int INSTRUCTION_UPDATE_PADDING = 512;
    public static final int INSTRUCTION_UPDATE_PROPS = 32;
    public static final int INSTRUCTION_UPDATE_STATE = 64;
    private final int commitNumber;

    @NotNull
    private final int[] intBuffer;
    private final int intBufferLen;

    @NotNull
    private final Object[] objBuffer;
    private final int objBufferLen;
    private final int surfaceId;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;", "", "<init>", "()V", "INSTRUCTION_FLAG_MULTIPLE", "", "INSTRUCTION_CREATE", "INSTRUCTION_DELETE", "INSTRUCTION_INSERT", "INSTRUCTION_REMOVE", "INSTRUCTION_UPDATE_PROPS", "INSTRUCTION_UPDATE_STATE", "INSTRUCTION_UPDATE_LAYOUT", "INSTRUCTION_UPDATE_EVENT_EMITTER", "INSTRUCTION_UPDATE_PADDING", "INSTRUCTION_UPDATE_OVERFLOW_INSET", "nameForInstructionString", "", "type", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String nameForInstructionString(int type) {
            if (type == 2) {
                return "CREATE";
            }
            if (type == 4) {
                return "DELETE";
            }
            if (type == 8) {
                return "INSERT";
            }
            if (type == 16) {
                return "REMOVE";
            }
            if (type == 32) {
                return "UPDATE_PROPS";
            }
            if (type == 64) {
                return "UPDATE_STATE";
            }
            if (type == 128) {
                return "UPDATE_LAYOUT";
            }
            if (type == 256) {
                return "UPDATE_EVENT_EMITTER";
            }
            if (type != 512) {
                return type != 1024 ? "UNKNOWN" : "UPDATE_OVERFLOW_INSET";
            }
            return "UPDATE_PADDING";
        }

        private Companion() {
        }
    }

    public IntBufferBatchMountItem(int i7, @NotNull int[] intBuffer, @NotNull Object[] objBuffer, int i10) {
        Intrinsics.checkNotNullParameter(intBuffer, "intBuffer");
        Intrinsics.checkNotNullParameter(objBuffer, "objBuffer");
        this.surfaceId = i7;
        this.intBuffer = intBuffer;
        this.objBuffer = objBuffer;
        this.commitNumber = i10;
        this.intBufferLen = intBuffer.length;
        this.objBufferLen = objBuffer.length;
    }

    private final void beginMarkers(String reason) {
        q.g("IntBufferBatchMountItem::" + reason);
        int i7 = this.commitNumber;
        if (i7 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i7);
        }
    }

    private final void endMarkers() {
        int i7 = this.commitNumber;
        if (i7 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i7);
        }
        Trace.endSection();
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(@NotNull MountingManager mountingManager) {
        int i7;
        int i10;
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.surfaceId);
        if (surfaceManager == null) {
            a.i("IntBufferBatchMountItem", "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.surfaceId));
            return;
        }
        if (surfaceManager.getIsStopped()) {
            a.i("IntBufferBatchMountItem", "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.surfaceId));
            return;
        }
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            a.a(Integer.valueOf(this.surfaceId), "IntBufferBatchMountItem", "Executing IntBufferBatchMountItem on surface [%d]");
        }
        beginMarkers("mountViews");
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.intBufferLen) {
            int[] iArr = this.intBuffer;
            int i13 = i11 + 1;
            int i14 = iArr[i11];
            int i15 = i14 & (-2);
            if ((i14 & 1) != 0) {
                int i16 = iArr[i13];
                i13 = i11 + 2;
                i7 = i16;
            } else {
                i7 = 1;
            }
            String[] args = {"numInstructions", String.valueOf(i7)};
            String sectionName = "IntBufferBatchMountItem::mountInstructions::" + INSTANCE.nameForInstructionString(i15);
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            Intrinsics.checkNotNullParameter(args, "args");
            StringBuilder sb2 = new StringBuilder();
            String str = args[0];
            String str2 = args[1];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            c0.d(sectionName + "|" + string);
            int i17 = i12;
            for (int i18 = 0; i18 < i7; i18++) {
                if (i15 == 2) {
                    int i19 = i17 + 1;
                    String str3 = (String) this.objBuffer[i17];
                    if (str3 == null) {
                        str3 = "";
                    }
                    String fabricComponentName = FabricNameComponentMapping.getFabricComponentName(str3);
                    int i20 = this.intBuffer[i13];
                    Object obj = this.objBuffer[i19];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                    ReadableMap readableMap = (ReadableMap) obj;
                    Object[] objArr = this.objBuffer;
                    int i21 = i17 + 3;
                    StateWrapper stateWrapper = (StateWrapper) objArr[i17 + 2];
                    i17 += 4;
                    int i22 = i13 + 2;
                    surfaceManager.createView$ReactAndroid_release(fabricComponentName, i20, readableMap, stateWrapper, (EventEmitterWrapper) objArr[i21], this.intBuffer[i13 + 1] == 1);
                    i13 = i22;
                } else if (i15 == 4) {
                    surfaceManager.deleteView(this.intBuffer[i13]);
                    i13++;
                } else if (i15 == 8) {
                    int[] iArr2 = this.intBuffer;
                    int i23 = iArr2[i13];
                    int i24 = i13 + 2;
                    int i25 = iArr2[i13 + 1];
                    i13 += 3;
                    surfaceManager.addViewAt(i25, i23, iArr2[i24]);
                } else if (i15 == 16) {
                    int[] iArr3 = this.intBuffer;
                    int i26 = iArr3[i13];
                    int i27 = i13 + 2;
                    int i28 = iArr3[i13 + 1];
                    i13 += 3;
                    surfaceManager.removeViewAt(i26, i28, iArr3[i27]);
                } else if (i15 == 32) {
                    int i29 = i13 + 1;
                    int i30 = this.intBuffer[i13];
                    Object obj2 = this.objBuffer[i17];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                    surfaceManager.updateProps(i30, (ReadableMap) obj2);
                    i13 = i29;
                    i17++;
                } else if (i15 == 64) {
                    surfaceManager.updateState(this.intBuffer[i13], (StateWrapper) this.objBuffer[i17]);
                    i13++;
                    i17++;
                } else if (i15 == 128) {
                    int[] iArr4 = this.intBuffer;
                    surfaceManager.updateLayout(iArr4[i13], iArr4[i13 + 1], iArr4[i13 + 2], iArr4[i13 + 3], iArr4[i13 + 4], iArr4[i13 + 5], iArr4[i13 + 6], iArr4[i13 + 7]);
                    i13 += 8;
                } else if (i15 != 256) {
                    if (i15 == 512) {
                        int[] iArr5 = this.intBuffer;
                        i10 = i13 + 5;
                        surfaceManager.updatePadding(iArr5[i13], iArr5[i13 + 1], iArr5[i13 + 2], iArr5[i13 + 3], iArr5[i13 + 4]);
                    } else {
                        if (i15 != 1024) {
                            throw new IllegalArgumentException(e.g(i15, i13, "Invalid type argument to IntBufferBatchMountItem: ", " at index: "));
                        }
                        int[] iArr6 = this.intBuffer;
                        i10 = i13 + 5;
                        surfaceManager.updateOverflowInset(iArr6[i13], iArr6[i13 + 1], iArr6[i13 + 2], iArr6[i13 + 3], iArr6[i13 + 4]);
                    }
                    i13 = i10;
                } else {
                    int i31 = i17 + 1;
                    EventEmitterWrapper eventEmitterWrapper = (EventEmitterWrapper) this.objBuffer[i17];
                    if (eventEmitterWrapper != null) {
                        surfaceManager.updateEventEmitter$ReactAndroid_release(this.intBuffer[i13], eventEmitterWrapper);
                        i17 = i31;
                        i13++;
                    } else {
                        i17 = i31;
                    }
                }
            }
            Trace.endSection();
            i11 = i13;
            i12 = i17;
        }
        endMarkers();
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.BatchMountItem
    public boolean isBatchEmpty() {
        return this.intBufferLen == 0;
    }

    @NotNull
    public String toString() {
        int i7;
        int i10;
        int i11;
        String str = "";
        try {
            StringBuilder sb2 = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            int i12 = 1;
            String str2 = String.format(Locale.ROOT, "IntBufferBatchMountItem [surface:%d]:\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.surfaceId)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            sb2.append(str2);
            int i13 = 0;
            int i14 = 0;
            while (i13 < this.intBufferLen) {
                int[] iArr = this.intBuffer;
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                int i17 = i16 & (-2);
                if ((i16 & i12) != 0) {
                    int i18 = i13 + 2;
                    i7 = iArr[i15];
                    i15 = i18;
                } else {
                    i7 = i12;
                }
                i13 = i15;
                int i19 = 0;
                while (i19 < i7) {
                    if (i17 != 2) {
                        if (i17 == 4) {
                            str = str;
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            i10 = i13 + 1;
                            String str3 = String.format(Locale.ROOT, "DELETE [%d]\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i13])}, 1));
                            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                            sb2.append(str3);
                        } else if (i17 == 8) {
                            str = str;
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            Locale locale = Locale.ROOT;
                            Integer numValueOf = Integer.valueOf(this.intBuffer[i13]);
                            int i20 = i13 + 2;
                            Integer numValueOf2 = Integer.valueOf(this.intBuffer[i13 + 1]);
                            i13 += 3;
                            String str4 = String.format(locale, "INSERT [%d]->[%d] @%d\n", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, Integer.valueOf(this.intBuffer[i20])}, 3));
                            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                            sb2.append(str4);
                        } else if (i17 != 16) {
                            String string = "<hidden>";
                            if (i17 == 32) {
                                i11 = i14 + 1;
                                Object obj = this.objBuffer[i14];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT && (obj == null || (string = obj.toString()) == null)) {
                                    string = "<null>";
                                }
                                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                                i10 = i13 + 1;
                                String str5 = String.format(Locale.ROOT, "UPDATE PROPS [%d]: %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i13]), string}, 2));
                                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                                sb2.append(str5);
                            } else if (i17 == 64) {
                                i11 = i14 + 1;
                                StateWrapper stateWrapper = (StateWrapper) this.objBuffer[i14];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT && (stateWrapper == null || (string = stateWrapper.toString()) == null)) {
                                    string = "<null>";
                                }
                                StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                                i10 = i13 + 1;
                                String str6 = String.format(Locale.ROOT, "UPDATE STATE [%d]: %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i13]), string}, 2));
                                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                                sb2.append(str6);
                            } else if (i17 == 128) {
                                str = str;
                                StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                                Locale locale2 = Locale.ROOT;
                                Integer numValueOf3 = Integer.valueOf(this.intBuffer[i13]);
                                Integer numValueOf4 = Integer.valueOf(this.intBuffer[i13 + 1]);
                                Integer numValueOf5 = Integer.valueOf(this.intBuffer[i13 + 2]);
                                Integer numValueOf6 = Integer.valueOf(this.intBuffer[i13 + 3]);
                                Integer numValueOf7 = Integer.valueOf(this.intBuffer[i13 + 4]);
                                Integer numValueOf8 = Integer.valueOf(this.intBuffer[i13 + 5]);
                                int i21 = i13 + 7;
                                Integer numValueOf9 = Integer.valueOf(this.intBuffer[i13 + 6]);
                                i13 += 8;
                                String str7 = String.format(locale2, "UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection:%d\n", Arrays.copyOf(new Object[]{numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, Integer.valueOf(this.intBuffer[i21])}, 8));
                                Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                                sb2.append(str7);
                            } else if (i17 == 256) {
                                str = str;
                                i14++;
                                StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                                i10 = i13 + 1;
                                String str8 = String.format(Locale.ROOT, "UPDATE EVENTEMITTER [%d]\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i13])}, 1));
                                Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
                                sb2.append(str8);
                            } else if (i17 == 512) {
                                str = str;
                                StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                                Locale locale3 = Locale.ROOT;
                                Integer numValueOf10 = Integer.valueOf(this.intBuffer[i13]);
                                Integer numValueOf11 = Integer.valueOf(this.intBuffer[i13 + 1]);
                                Integer numValueOf12 = Integer.valueOf(this.intBuffer[i13 + 2]);
                                int i22 = i13 + 4;
                                Integer numValueOf13 = Integer.valueOf(this.intBuffer[i13 + 3]);
                                i13 += 5;
                                String str9 = String.format(locale3, "UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", Arrays.copyOf(new Object[]{numValueOf10, numValueOf11, numValueOf12, numValueOf13, Integer.valueOf(this.intBuffer[i22])}, 5));
                                Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
                                sb2.append(str9);
                            } else {
                                if (i17 != 1024) {
                                    a.g("IntBufferBatchMountItem", "String so far: " + ((Object) sb2));
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i17 + " at index: " + i13);
                                }
                                StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
                                Locale locale4 = Locale.ROOT;
                                Integer numValueOf14 = Integer.valueOf(this.intBuffer[i13]);
                                Integer numValueOf15 = Integer.valueOf(this.intBuffer[i13 + 1]);
                                Integer numValueOf16 = Integer.valueOf(this.intBuffer[i13 + 2]);
                                int i23 = i13 + 4;
                                Integer numValueOf17 = Integer.valueOf(this.intBuffer[i13 + 3]);
                                str = str;
                                try {
                                    i13 += 5;
                                    String str10 = String.format(locale4, "UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", Arrays.copyOf(new Object[]{numValueOf14, numValueOf15, numValueOf16, numValueOf17, Integer.valueOf(this.intBuffer[i23])}, 5));
                                    Intrinsics.checkNotNullExpressionValue(str10, "format(...)");
                                    sb2.append(str10);
                                } catch (Exception e10) {
                                    e = e10;
                                    a.h("IntBufferBatchMountItem", "Caught exception trying to print", e);
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i24 = 0; i24 < this.intBufferLen; i24++) {
                                        sb3.append(this.intBuffer[i24]);
                                        sb3.append(", ");
                                    }
                                    a.g("IntBufferBatchMountItem", sb3.toString());
                                    for (int i25 = 0; i25 < this.objBufferLen; i25++) {
                                        Object obj2 = this.objBuffer[i25];
                                        a.g("IntBufferBatchMountItem", obj2 != null ? String.valueOf(obj2) : "null");
                                    }
                                    return str;
                                }
                            }
                            i14 = i11;
                        } else {
                            str = str;
                            StringCompanionObject stringCompanionObject10 = StringCompanionObject.INSTANCE;
                            Locale locale5 = Locale.ROOT;
                            Integer numValueOf18 = Integer.valueOf(this.intBuffer[i13]);
                            int i26 = i13 + 2;
                            Integer numValueOf19 = Integer.valueOf(this.intBuffer[i13 + 1]);
                            i13 += 3;
                            String str11 = String.format(locale5, "REMOVE [%d]->[%d] @%d\n", Arrays.copyOf(new Object[]{numValueOf18, numValueOf19, Integer.valueOf(this.intBuffer[i26])}, 3));
                            Intrinsics.checkNotNullExpressionValue(str11, "format(...)");
                            sb2.append(str11);
                        }
                        i13 = i10;
                    } else {
                        str = str;
                        String str12 = (String) this.objBuffer[i14];
                        if (str12 == null) {
                            str12 = str;
                        }
                        String fabricComponentName = FabricNameComponentMapping.getFabricComponentName(str12);
                        i14 += 4;
                        StringCompanionObject stringCompanionObject11 = StringCompanionObject.INSTANCE;
                        Locale locale6 = Locale.ROOT;
                        int i27 = i13 + 1;
                        Integer numValueOf20 = Integer.valueOf(this.intBuffer[i13]);
                        i13 += 2;
                        String str13 = String.format(locale6, "CREATE [%d] - layoutable:%d - %s\n", Arrays.copyOf(new Object[]{numValueOf20, Integer.valueOf(this.intBuffer[i27]), fabricComponentName}, 3));
                        Intrinsics.checkNotNullExpressionValue(str13, "format(...)");
                        sb2.append(str13);
                    }
                    i19++;
                    str = str;
                    i12 = 1;
                }
            }
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        } catch (Exception e11) {
            e = e11;
            str = str;
        }
    }
}
