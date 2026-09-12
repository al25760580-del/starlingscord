package kh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public class f implements t2.b, th.g, qm.a, vk.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14462d;

    public /* synthetic */ f(int i7) {
        this.f14462d = i7;
    }

    public static ArrayList c(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((cs.t) obj) != cs.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((cs.t) it.next()).f7482d);
        }
        return arrayList2;
    }

    public static byte[] d(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Buffer buffer = new Buffer();
        for (String str : c(protocols)) {
            buffer.U(str.length());
            buffer.l0(str);
        }
        return buffer.B(buffer.f17413e);
    }

    public static f e(Context context, int i7) {
        yk.a.a("Cannot create a CalendarItemStyle with a styleResId of 0", i7 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, kg.a.f14447t);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 4);
        com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 9);
        com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        m.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        f fVar = new f(4);
        yk.a.b(rect.left);
        yk.a.b(rect.top);
        yk.a.b(rect.right);
        yk.a.b(rect.bottom);
        return fVar;
    }

    public static boolean f() {
        return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
    }

    public static String h(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // th.g
    public /* synthetic */ Object a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new i1.j(2));
        e4.f.d(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    @Override // vk.a
    public void b(qk.a sourceFrame, qk.a targetFrame) {
        ByteBuffer byteBuffer = targetFrame.f18915b;
        Intrinsics.checkNotNullParameter(sourceFrame, "sourceFrame");
        Intrinsics.checkNotNullParameter(targetFrame, "targetFrame");
        ByteBuffer byteBuffer2 = sourceFrame.f18915b;
        if (byteBuffer2 == null || byteBuffer == null) {
            throw new IllegalArgumentException("Source or target frame doesn't have a buffer, cannot process it!");
        }
        byteBuffer.put(byteBuffer2);
        byteBuffer.flip();
        MediaCodec.BufferInfo bufferInfo = targetFrame.f18916c;
        bufferInfo.offset = 0;
        MediaCodec.BufferInfo bufferInfo2 = sourceFrame.f18916c;
        bufferInfo.size = bufferInfo2.size;
        bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs;
        bufferInfo.flags = bufferInfo2.flags;
    }

    @Override // qm.a
    public String g() {
        switch (this.f14462d) {
            case 17:
                return "onDidAppear";
            default:
                return "onWillDisappear";
        }
    }

    @Override // qm.a
    public String getEventName() {
        switch (this.f14462d) {
            case 17:
                return "topDidAppear";
            default:
                return "topWillDisappear";
        }
    }

    @Override // vk.a
    public void release() {
    }
}
