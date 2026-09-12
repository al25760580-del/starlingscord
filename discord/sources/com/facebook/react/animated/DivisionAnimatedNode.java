package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\n\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/animated/DivisionAnimatedNode;", "Lcom/facebook/react/animated/ValueAnimatedNode;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "nativeAnimatedNodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "inputNodes", "", "update", "", "update$ReactAndroid_release", "prettyPrint", "", "prettyPrint$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDivisionAnimatedNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DivisionAnimatedNode.kt\ncom/facebook/react/animated/DivisionAnimatedNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,58:1\n13567#2,3:59\n*S KotlinDebug\n*F\n+ 1 DivisionAnimatedNode.kt\ncom/facebook/react/animated/DivisionAnimatedNode\n*L\n34#1:59,3\n*E\n"})
public final class DivisionAnimatedNode extends ValueAnimatedNode {

    @NotNull
    private final int[] inputNodes;

    @NotNull
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivisionAnimatedNode(@NotNull ReadableMap config, @NotNull NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        int[] iArr;
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("input");
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            int[] iArr2 = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr2[i7] = array.getInt(i7);
            }
            iArr = iArr2;
        }
        this.inputNodes = iArr;
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode, com.facebook.react.animated.AnimatedNode
    @NotNull
    public String prettyPrint$ReactAndroid_release() {
        return "DivisionAnimatedNode[" + this.tag + "]: input nodes: " + this.inputNodes + " - super: " + super.prettyPrint$ReactAndroid_release();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update$ReactAndroid_release() {
        int[] iArr = this.inputNodes;
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int i11 = i10 + 1;
            AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(iArr[i7]);
            if (nodeById == null || !(nodeById instanceof ValueAnimatedNode)) {
                throw new JSApplicationCausedNativeException(b.h(this.tag, "Illegal node ID set as an input for Animated.divide node with Animated ID "));
            }
            double d6 = ((ValueAnimatedNode) nodeById).nodeValue;
            if (i10 == 0) {
                this.nodeValue = d6;
            } else {
                if (d6 == 0.0d) {
                    throw new JSApplicationCausedNativeException(b.h(this.tag, "Detected a division by zero in Animated.divide node with Animated ID "));
                }
                this.nodeValue /= d6;
            }
            i7++;
            i10 = i11;
        }
    }
}
