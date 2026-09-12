package app.rive.runtime.kotlin;

import a3.e;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.b1;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import app.rive.RiveLog;
import app.rive.runtime.kotlin.controllers.ControllerState;
import app.rive.runtime.kotlin.controllers.ControllerStateManagement;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.ContextAssetLoader;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.FallbackAssetLoader;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.RiveException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import app.rive.runtime.kotlin.renderers.Renderer;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import app.rive.runtime.kotlin.renderers.RiveArtboardRenderer;
import c5.o;
import c5.t;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import gn.h;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import k1.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ls.d;
import m3.m;
import org.jetbrains.annotations.NotNull;
import rn.w;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 ß\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006à\u0001ß\u0001á\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001c¢\u0006\u0004\b\u0017\u0010!J\r\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0018J%\u0010\"\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001c¢\u0006\u0004\b\"\u0010!J+\u0010(\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u001c¢\u0006\u0004\b(\u0010)JC\u0010(\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010'\u001a\u00020\u001c¢\u0006\u0004\b(\u0010*J=\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010'\u001a\u00020\u001c¢\u0006\u0004\b(\u0010+J\r\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u0018J\u001d\u0010/\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a¢\u0006\u0004\b/\u00100J%\u00102\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001c¢\u0006\u0004\b2\u00103J%\u00105\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u00101\u001a\u000204¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\b8\u00100J%\u00109\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001a2\u0006\u00101\u001a\u0002042\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\b;\u0010<J!\u0010@\u001a\u00020\u00122\u0012\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0=\"\u00020>¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\u001a¢\u0006\u0004\bC\u0010DJ\u001f\u0010C\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\bC\u0010EJ\u001d\u0010G\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001a¢\u0006\u0004\bG\u00100J%\u0010G\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u0004\u0018\u000104¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\u00122\u0006\u00101\u001a\u000204¢\u0006\u0004\bK\u0010LJm\u0010U\u001a\u00020\u00122\b\b\u0001\u0010M\u001a\u00020\u000f2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010O\u001a\u00020\u001c2\b\b\u0002\u0010P\u001a\u00020\u001c2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010T\u001a\u00020S2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\bU\u0010VJk\u0010Y\u001a\u00020\u00122\u0006\u0010X\u001a\u00020W2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010O\u001a\u00020\u001c2\b\b\u0002\u0010P\u001a\u00020\u001c2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010T\u001a\u00020S2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\bY\u0010ZJk\u0010]\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020[2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010O\u001a\u00020\u001c2\b\b\u0002\u0010P\u001a\u00020\u001c2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010T\u001a\u00020S2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u00020\u00122\b\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0014¢\u0006\u0004\bd\u0010eJ\u000f\u0010g\u001a\u00020fH\u0014¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0012H\u0014¢\u0006\u0004\bi\u0010\u0018J\u000f\u0010j\u001a\u00020\u0012H\u0014¢\u0006\u0004\bj\u0010\u0018J\u0011\u0010l\u001a\u0004\u0018\u00010kH\u0007¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00122\u0006\u0010n\u001a\u00020kH\u0007¢\u0006\u0004\bo\u0010pJ\u001f\u0010s\u001a\u00020\u00122\u0006\u0010q\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020\u000fH\u0014¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u0003H\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u0003H\u0016¢\u0006\u0004\bx\u0010wJ\u0015\u0010z\u001a\u00020\u00122\u0006\u0010u\u001a\u00020y¢\u0006\u0004\bz\u0010{J\u0015\u0010|\u001a\u00020\u00122\u0006\u0010u\u001a\u00020y¢\u0006\u0004\b|\u0010{J\u0018\u0010\u007f\u001a\u00020\u001c2\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J(\u0010\u0083\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00120\u0081\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J1\u0010\u0086\u0001\u001a\u00020\u00122\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00120\u0081\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0018J\u0011\u0010\u0089\u0001\u001a\u00020\u0012H\u0003¢\u0006\u0005\b\u0089\u0001\u0010\u0018J\u0011\u0010\u008a\u0001\u001a\u00020\u0012H\u0003¢\u0006\u0005\b\u008a\u0001\u0010\u0018J$\u0010\u008d\u0001\u001a\u00020\u001c2\u0007\u0010\u008b\u0001\u001a\u0002042\u0007\u0010\u008c\u0001\u001a\u000204H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u008f\u0001\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u0012\u0005\b\u009f\u0001\u0010\u0018\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R)\u0010©\u0001\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u0090\u0001\u001a\u0006\bª\u0001\u0010\u0092\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R1\u0010°\u0001\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u001c8\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0090\u0001\u001a\u0006\b±\u0001\u0010\u0092\u0001\"\u0006\b²\u0001\u0010¬\u0001R\u0017\u0010¶\u0001\u001a\u0005\u0018\u00010³\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R(\u0010R\u001a\u00020Q2\u0006\u00101\u001a\u00020Q8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R(\u0010T\u001a\u00020S2\u0006\u00101\u001a\u00020S8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R,\u0010Â\u0001\u001a\u0004\u0018\u0001042\b\u00101\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¿\u0001\u0010J\"\u0006\bÀ\u0001\u0010Á\u0001R(\u0010Æ\u0001\u001a\u0002042\u0006\u00101\u001a\u0002048F@@X\u0086\u000e¢\u0006\u000f\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0005\bÅ\u0001\u0010LR\u0015\u0010\\\u001a\u0004\u0018\u00010[8F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R-\u0010N\u001a\u0004\u0018\u00010\u001a2\t\u0010É\u0001\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R(\u0010O\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÎ\u0001\u0010\u0092\u0001\"\u0006\bÏ\u0001\u0010¬\u0001R\u001b\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00010\u00198F¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u001b\u0010Ö\u0001\u001a\t\u0012\u0005\u0012\u00030Ô\u00010\u00198F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ò\u0001R(\u0010Û\u0001\u001a\u0016\u0012\u0005\u0012\u00030Ð\u00010×\u0001j\n\u0012\u0005\u0012\u00030Ð\u0001`Ø\u00018F¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R(\u0010Ý\u0001\u001a\u0016\u0012\u0005\u0012\u00030Ô\u00010×\u0001j\n\u0012\u0005\u0012\u00030Ô\u0001`Ø\u00018F¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ú\u0001R\u0014\u0010Þ\u0001\u001a\u00020\u001c8F¢\u0006\b\u001a\u0006\bÞ\u0001\u0010\u0092\u0001¨\u0006â\u0001"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView;", "Lapp/rive/runtime/kotlin/RiveTextureView;", "Lapp/rive/runtime/kotlin/Observable;", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;", "builder", "(Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;)V", "Landroid/graphics/SurfaceTexture;", "surface", "", "width", "height", "", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "surfaceTexture", "onSurfaceTextureAvailable", "pause", "()V", "", "", "animationNames", "", "areStateMachines", "(Ljava/util/List;Z)V", "animationName", "isStateMachine", "(Ljava/lang/String;Z)V", "stop", "Lapp/rive/runtime/kotlin/core/Loop;", "loop", "Lapp/rive/runtime/kotlin/core/Direction;", "direction", "settleInitialState", "play", "(Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;Z)V", "(Ljava/util/List;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;ZZ)V", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;ZZ)V", "reset", "stateMachineName", "inputName", "fireState", "(Ljava/lang/String;Ljava/lang/String;)V", "value", "setBooleanState", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "setNumberState", "(Ljava/lang/String;Ljava/lang/String;F)V", "path", "fireStateAtPath", "setBooleanStateAtPath", "(Ljava/lang/String;ZLjava/lang/String;)V", "setNumberStateAtPath", "(Ljava/lang/String;FLjava/lang/String;)V", "", "Lapp/rive/runtime/kotlin/ChangedInput;", "inputs", "setMultipleStates", "([Lapp/rive/runtime/kotlin/ChangedInput;)V", "textRunName", "getTextRunValue", "(Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "textValue", "setTextRunValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVolume", "()Ljava/lang/Float;", "setVolume", "(F)V", "resId", "artboardName", "autoplay", "autoBind", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "setRiveResource", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Lapp/rive/runtime/kotlin/core/Loop;)V", "", "bytes", "setRiveBytes", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Lapp/rive/runtime/kotlin/core/Loop;)V", "Lapp/rive/runtime/kotlin/core/File;", "file", "setRiveFile", "(Lapp/rive/runtime/kotlin/core/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Lapp/rive/runtime/kotlin/core/Loop;)V", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "assetLoader", "setAssetLoader", "(Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "createRenderer", "()Lapp/rive/runtime/kotlin/renderers/Renderer;", "Landroidx/lifecycle/u;", "createObserver", "()Landroidx/lifecycle/u;", "onAttachedToWindow", "onDetachedFromWindow", "Lapp/rive/runtime/kotlin/controllers/ControllerState;", "saveControllerState", "()Lapp/rive/runtime/kotlin/controllers/ControllerState;", "state", "restoreControllerState", "(Lapp/rive/runtime/kotlin/controllers/ControllerState;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "listener", "registerListener", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;)V", "unregisterListener", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;", "addEventListener", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;)V", "removeEventListener", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lkotlin/Function1;", "onComplete", "loadFileFromResource", "(Lkotlin/jvm/functions/Function1;)V", "url", "loadFromNetwork", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "validateLifecycleOwner", "startFrameMetrics", "stopFrameMetrics", "x", "y", "inBounds", "(FF)Z", "defaultAutoplay", "Z", "getDefaultAutoplay", "()Z", "Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "controller", "Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "getController", "()Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "setController", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController;)V", "Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "rendererAttributes", "Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "getRendererAttributes", "()Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "getRendererAttributes$annotations", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "frameMetricsListener", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "Landroid/graphics/RectF;", "bounds", "Landroid/graphics/RectF;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "touchPassThrough", "getTouchPassThrough", "setTouchPassThrough", "(Z)V", "Landroid/util/SparseBooleanArray;", "pointersInsideView", "Landroid/util/SparseBooleanArray;", "multiTouchEnabled", "getMultiTouchEnabled", "setMultiTouchEnabled", "Lapp/rive/runtime/kotlin/renderers/RiveArtboardRenderer;", "getArtboardRenderer", "()Lapp/rive/runtime/kotlin/renderers/RiveArtboardRenderer;", "artboardRenderer", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "getLayoutScaleFactor", "setLayoutScaleFactor", "(Ljava/lang/Float;)V", "layoutScaleFactor", "getLayoutScaleFactorAutomatic", "()F", "setLayoutScaleFactorAutomatic$kotlin_release", "layoutScaleFactorAutomatic", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", StackTraceHelper.NAME_KEY, "getArtboardName", "()Ljava/lang/String;", "setArtboardName", "(Ljava/lang/String;)V", "getAutoplay", "setAutoplay", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "getAnimations", "()Ljava/util/List;", "animations", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "getStateMachines", "stateMachines", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getPlayingAnimations", "()Ljava/util/HashSet;", "playingAnimations", "getPlayingStateMachines", "playingStateMachines", "isPlaying", "Companion", "Builder", "RendererAttributes", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRiveAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView\n+ 2 RiveTextureView.kt\napp/rive/runtime/kotlin/RiveTextureView\n+ 3 RiveLog.kt\napp/rive/RiveLog\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1299:1\n67#2,8:1300\n57#3:1308\n57#3:1309\n65#3:1310\n57#3:1311\n57#3:1312\n57#3:1313\n57#3:1314\n57#3:1315\n57#3:1316\n57#3:1317\n65#3:1318\n57#3:1319\n57#3:1321\n57#3:1322\n65#3:1323\n65#3:1324\n65#3:1325\n1#4:1320\n*S KotlinDebug\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView\n*L\n193#1:1300,8\n330#1:1308\n411#1:1309\n459#1:1310\n462#1:1311\n468#1:1312\n480#1:1313\n496#1:1314\n809#1:1315\n847#1:1316\n891#1:1317\n916#1:1318\n919#1:1319\n937#1:1321\n946#1:1322\n1019#1:1323\n1035#1:1324\n1192#1:1325\n*E\n"})
public class RiveAnimationView extends RiveTextureView implements Observable<RiveFileController.Listener> {
    public static final int SINGLE_TOUCH_ID = 0;

    @NotNull
    public static final String TAG = "RiveL/RiveAnimationView";
    public static final boolean shouldLoadCDNAssetsDefault = true;
    public static final boolean traceAnimationsDefault = false;

    @NotNull
    private final RectF bounds;

    @NotNull
    private RiveFileController controller;
    private final boolean defaultAutoplay;
    private Window.OnFrameMetricsAvailableListener frameMetricsListener;
    private LifecycleOwner lifecycleOwner;
    private boolean multiTouchEnabled;

    @NotNull
    private final SparseBooleanArray pointersInsideView;

    @NotNull
    private final RendererAttributes rendererAttributes;
    private boolean touchPassThrough;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int alignmentIndexDefault = Alignment.CENTER.ordinal();
    private static final int fitIndexDefault = Fit.CONTAIN.ordinal();
    private static final int loopIndexDefault = Loop.AUTO.ordinal();
    private static final int rendererIndexDefault = Rive.INSTANCE.getDefaultRendererType().getValue();

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0006J\u000e\u0010X\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fJ\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fJ\u000e\u0010Z\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0015J\u000e\u0010[\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010\\\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010]\u001a\u00020\u00002\u0006\u0010W\u001a\u00020)J\u000e\u0010^\u001a\u00020\u00002\u0006\u0010W\u001a\u00020/J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010`\u001a\u00020\u00002\u0006\u0010W\u001a\u000208J\u000e\u0010a\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0001J\u000e\u0010b\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010c\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fJ\u000e\u0010d\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010e\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010\u001bX\u0080\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\u001c\u00107\u001a\u0004\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001d\"\u0004\bJ\u0010\u001fR\u001c\u0010K\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u0010\u0010R\u001a\u0010N\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001fR\u001e\u0010Q\u001a\u0004\u0018\u00010\u001bX\u0080\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010$¨\u0006f"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "getAlignment$kotlin_release", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment$kotlin_release", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "animationName", "", "getAnimationName$kotlin_release", "()Ljava/lang/String;", "setAnimationName$kotlin_release", "(Ljava/lang/String;)V", "artboardName", "getArtboardName$kotlin_release", "setArtboardName$kotlin_release", "assetLoader", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "getAssetLoader$kotlin_release", "()Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "setAssetLoader$kotlin_release", "(Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "autoBind", "", "getAutoBind$kotlin_release", "()Z", "setAutoBind$kotlin_release", "(Z)V", "autoplay", "getAutoplay$kotlin_release", "()Ljava/lang/Boolean;", "setAutoplay$kotlin_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getContext$kotlin_release", "()Landroid/content/Context;", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "getFit$kotlin_release", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit$kotlin_release", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "loop", "Lapp/rive/runtime/kotlin/core/Loop;", "getLoop$kotlin_release", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop$kotlin_release", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "multiTouchEnabled", "getMultiTouchEnabled$kotlin_release", "setMultiTouchEnabled$kotlin_release", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "getRendererType$kotlin_release", "()Lapp/rive/runtime/kotlin/core/RendererType;", "setRendererType$kotlin_release", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "resource", "getResource$kotlin_release", "()Ljava/lang/Object;", "setResource$kotlin_release", "(Ljava/lang/Object;)V", "resourceType", "Lapp/rive/runtime/kotlin/ResourceType;", "getResourceType$kotlin_release", "()Lapp/rive/runtime/kotlin/ResourceType;", "setResourceType$kotlin_release", "(Lapp/rive/runtime/kotlin/ResourceType;)V", "shouldLoadCDNAssets", "getShouldLoadCDNAssets$kotlin_release", "setShouldLoadCDNAssets$kotlin_release", "stateMachineName", "getStateMachineName$kotlin_release", "setStateMachineName$kotlin_release", "touchPassThrough", "getTouchPassThrough$kotlin_release", "setTouchPassThrough$kotlin_release", "traceAnimations", "getTraceAnimations$kotlin_release", "setTraceAnimations$kotlin_release", "build", "Lapp/rive/runtime/kotlin/RiveAnimationView;", "setAlignment", "value", "setAnimationName", "setArtboardName", "setAssetLoader", "setAutoBind", "setAutoplay", "setFit", "setLoop", "setMultiTouchEnabled", "setRendererType", "setResource", "setShouldLoadCDNAssets", "setStateMachineName", "setTouchPassThrough", "setTraceAnimations", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRiveAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1299:1\n1#2:1300\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;
        private Alignment alignment;
        private String animationName;
        private String artboardName;
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private Boolean autoplay;

        @NotNull
        private final Context context;
        private Fit fit;
        private Loop loop;
        private boolean multiTouchEnabled;
        private RendererType rendererType;
        private Object resource;
        private ResourceType resourceType;
        private boolean shouldLoadCDNAssets;
        private String stateMachineName;
        private boolean touchPassThrough;
        private Boolean traceAnimations;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.shouldLoadCDNAssets = true;
        }

        @NotNull
        public final RiveAnimationView build() {
            return new RiveAnimationView(this);
        }

        /* JADX INFO: renamed from: getAlignment$kotlin_release, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: getAnimationName$kotlin_release, reason: from getter */
        public final String getAnimationName() {
            return this.animationName;
        }

        /* JADX INFO: renamed from: getArtboardName$kotlin_release, reason: from getter */
        public final String getArtboardName() {
            return this.artboardName;
        }

        /* JADX INFO: renamed from: getAssetLoader$kotlin_release, reason: from getter */
        public final FileAssetLoader getAssetLoader() {
            return this.assetLoader;
        }

        /* JADX INFO: renamed from: getAutoBind$kotlin_release, reason: from getter */
        public final boolean getAutoBind() {
            return this.autoBind;
        }

        /* JADX INFO: renamed from: getAutoplay$kotlin_release, reason: from getter */
        public final Boolean getAutoplay() {
            return this.autoplay;
        }

        @NotNull
        /* JADX INFO: renamed from: getContext$kotlin_release, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: getFit$kotlin_release, reason: from getter */
        public final Fit getFit() {
            return this.fit;
        }

        /* JADX INFO: renamed from: getLoop$kotlin_release, reason: from getter */
        public final Loop getLoop() {
            return this.loop;
        }

        /* JADX INFO: renamed from: getMultiTouchEnabled$kotlin_release, reason: from getter */
        public final boolean getMultiTouchEnabled() {
            return this.multiTouchEnabled;
        }

        /* JADX INFO: renamed from: getRendererType$kotlin_release, reason: from getter */
        public final RendererType getRendererType() {
            return this.rendererType;
        }

        /* JADX INFO: renamed from: getResource$kotlin_release, reason: from getter */
        public final Object getResource() {
            return this.resource;
        }

        /* JADX INFO: renamed from: getResourceType$kotlin_release, reason: from getter */
        public final ResourceType getResourceType() {
            return this.resourceType;
        }

        /* JADX INFO: renamed from: getShouldLoadCDNAssets$kotlin_release, reason: from getter */
        public final boolean getShouldLoadCDNAssets() {
            return this.shouldLoadCDNAssets;
        }

        /* JADX INFO: renamed from: getStateMachineName$kotlin_release, reason: from getter */
        public final String getStateMachineName() {
            return this.stateMachineName;
        }

        /* JADX INFO: renamed from: getTouchPassThrough$kotlin_release, reason: from getter */
        public final boolean getTouchPassThrough() {
            return this.touchPassThrough;
        }

        /* JADX INFO: renamed from: getTraceAnimations$kotlin_release, reason: from getter */
        public final Boolean getTraceAnimations() {
            return this.traceAnimations;
        }

        @NotNull
        public final Builder setAlignment(@NotNull Alignment value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.alignment = value;
            return this;
        }

        public final void setAlignment$kotlin_release(Alignment alignment) {
            this.alignment = alignment;
        }

        @NotNull
        public final Builder setAnimationName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.animationName = value;
            return this;
        }

        public final void setAnimationName$kotlin_release(String str) {
            this.animationName = str;
        }

        @NotNull
        public final Builder setArtboardName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.artboardName = value;
            return this;
        }

        public final void setArtboardName$kotlin_release(String str) {
            this.artboardName = str;
        }

        @NotNull
        public final Builder setAssetLoader(@NotNull FileAssetLoader value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.assetLoader = value;
            return this;
        }

        public final void setAssetLoader$kotlin_release(FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        @NotNull
        public final Builder setAutoBind(boolean value) {
            this.autoBind = value;
            return this;
        }

        public final void setAutoBind$kotlin_release(boolean z5) {
            this.autoBind = z5;
        }

        @NotNull
        public final Builder setAutoplay(boolean value) {
            this.autoplay = Boolean.valueOf(value);
            return this;
        }

        public final void setAutoplay$kotlin_release(Boolean bool) {
            this.autoplay = bool;
        }

        @NotNull
        public final Builder setFit(@NotNull Fit value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.fit = value;
            return this;
        }

        public final void setFit$kotlin_release(Fit fit) {
            this.fit = fit;
        }

        @NotNull
        public final Builder setLoop(@NotNull Loop value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.loop = value;
            return this;
        }

        public final void setLoop$kotlin_release(Loop loop) {
            this.loop = loop;
        }

        @NotNull
        public final Builder setMultiTouchEnabled(boolean value) {
            this.multiTouchEnabled = value;
            return this;
        }

        public final void setMultiTouchEnabled$kotlin_release(boolean z5) {
            this.multiTouchEnabled = z5;
        }

        @NotNull
        public final Builder setRendererType(@NotNull RendererType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.rendererType = value;
            return this;
        }

        public final void setRendererType$kotlin_release(RendererType rendererType) {
            this.rendererType = rendererType;
        }

        @NotNull
        public final Builder setResource(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.resourceType = ResourceType.INSTANCE.makeMaybeResource(value);
            this.resource = value;
            return this;
        }

        public final void setResource$kotlin_release(Object obj) {
            this.resource = obj;
        }

        public final void setResourceType$kotlin_release(ResourceType resourceType) {
            this.resourceType = resourceType;
        }

        @NotNull
        public final Builder setShouldLoadCDNAssets(boolean value) {
            this.shouldLoadCDNAssets = value;
            return this;
        }

        public final void setShouldLoadCDNAssets$kotlin_release(boolean z5) {
            this.shouldLoadCDNAssets = z5;
        }

        @NotNull
        public final Builder setStateMachineName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.stateMachineName = value;
            return this;
        }

        public final void setStateMachineName$kotlin_release(String str) {
            this.stateMachineName = str;
        }

        @NotNull
        public final Builder setTouchPassThrough(boolean value) {
            this.touchPassThrough = value;
            return this;
        }

        public final void setTouchPassThrough$kotlin_release(boolean z5) {
            this.touchPassThrough = z5;
        }

        @NotNull
        public final Builder setTraceAnimations(boolean value) {
            this.traceAnimations = Boolean.valueOf(value);
            return this;
        }

        public final void setTraceAnimations$kotlin_release(Boolean bool) {
            this.traceAnimations = bool;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView$Companion;", "", "()V", "SINGLE_TOUCH_ID", "", "TAG", "", "alignmentIndexDefault", "getAlignmentIndexDefault", "()I", "fitIndexDefault", "getFitIndexDefault", "loopIndexDefault", "getLoopIndexDefault", "rendererIndexDefault", "getRendererIndexDefault", "shouldLoadCDNAssetsDefault", "", "traceAnimationsDefault", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAlignmentIndexDefault() {
            return RiveAnimationView.alignmentIndexDefault;
        }

        public final int getFitIndexDefault() {
            return RiveAnimationView.fitIndexDefault;
        }

        public final int getLoopIndexDefault() {
            return RiveAnimationView.loopIndexDefault;
        }

        public final int getRendererIndexDefault() {
            return RiveAnimationView.rendererIndexDefault;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"app/rive/runtime/kotlin/RiveAnimationView$onTouchEvent$PointerInfo", "", StackTraceHelper.ID_KEY, "", "x", "", "y", "(IFF)V", "getId", "()I", "getX", "()F", "getY", "component1", "component2", "component3", "copy", "(IFF)Lapp/rive/runtime/kotlin/RiveAnimationView$onTouchEvent$PointerInfo;", "equals", "", "other", "hashCode", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PointerInfo {
        private final int id;
        private final float x;
        private final float y;

        public PointerInfo(int i7, float f2, float f7) {
            this.id = i7;
            this.x = f2;
            this.y = f7;
        }

        public static /* synthetic */ PointerInfo copy$default(PointerInfo pointerInfo, int i7, float f2, float f7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = pointerInfo.id;
            }
            if ((i10 & 2) != 0) {
                f2 = pointerInfo.x;
            }
            if ((i10 & 4) != 0) {
                f7 = pointerInfo.y;
            }
            return pointerInfo.copy(i7, f2, f7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final PointerInfo copy(int id2, float x5, float y5) {
            return new PointerInfo(id2, x5, y5);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointerInfo)) {
                return false;
            }
            PointerInfo pointerInfo = (PointerInfo) other;
            return this.id == pointerInfo.id && Float.compare(this.x, pointerInfo.x) == 0 && Float.compare(this.y, pointerInfo.y) == 0;
        }

        public final int getId() {
            return this.id;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + e.a(Integer.hashCode(this.id) * 31, 31, this.x);
        }

        @NotNull
        public String toString() {
            return "PointerInfo(id=" + this.id + ", x=" + this.x + ", y=" + this.y + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$startFrameMetrics$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00872 extends Lambda implements Function0<String> {
        public static final C00872 INSTANCE = new C00872();

        public C00872() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "FrameMetrics is available with Android SDK 24 (Nougat) and higher";
        }
    }

    public /* synthetic */ RiveAnimationView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void getRendererAttributes$annotations() {
    }

    private final boolean inBounds(float x5, float y5) {
        return x5 >= 0.0f && y5 >= 0.0f && x5 < ((float) getWidth()) && y5 < ((float) getHeight());
    }

    private final void loadFileFromResource(Function1<? super File, Unit> onComplete) {
        final ResourceType resource = this.rendererAttributes.getResource();
        if (resource == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.loadFileFromResource.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "loadResource: no resource to load";
                }
            });
            return;
        }
        if (resource instanceof ResourceType.ResourceRiveFile) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.loadFileFromResource.2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Loading Rive file from existing Rive File. No extra work required.";
                }
            });
            onComplete.invoke(((ResourceType.ResourceRiveFile) resource).getFile());
            return;
        }
        if (resource instanceof ResourceType.ResourceUrl) {
            loadFromNetwork(((ResourceType.ResourceUrl) resource).getUrl(), onComplete);
            return;
        }
        if (resource instanceof ResourceType.ResourceBytes) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.loadFileFromResource.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return kk.b.h(((ResourceType.ResourceBytes) resource).getBytes().length, "Loading Rive file from bytes with length: ");
                }
            });
            File file = new File(((ResourceType.ResourceBytes) resource).getBytes(), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
            onComplete.invoke(file);
            file.release();
            return;
        }
        if (resource instanceof ResourceType.ResourceId) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.loadFileFromResource.4
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return kk.b.h(((ResourceType.ResourceId) resource).getId(), "Loading Rive file from resource ID: ");
                }
            });
            InputStream inputStreamOpenRawResource = getResources().openRawResource(((ResourceType.ResourceId) resource).getId());
            try {
                Intrinsics.checkNotNull(inputStreamOpenRawResource);
                File file2 = new File(m.K(inputStreamOpenRawResource), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
                onComplete.invoke(file2);
                file2.release();
                d.k(inputStreamOpenRawResource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    d.k(inputStreamOpenRawResource, th2);
                    throw th3;
                }
            }
        }
    }

    private final void loadFromNetwork(final String url, Function1<? super File, Unit> onComplete) {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.loadFromNetwork.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return e.l("Loading Rive file from network: ", url);
            }
        });
        o oVarH = h.H(getContext().getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(oVarH, "newRequestQueue(...)");
        oVarH.a(new RiveFileRequest(url, this.rendererAttributes.getRendererType(), new a(onComplete), new b(url, 0), this.rendererAttributes.getAssetLoader()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromNetwork$lambda$4(Function1 onComplete, File file) {
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        Intrinsics.checkNotNull(file);
        onComplete.invoke(file);
        file.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromNetwork$lambda$5(String url, t tVar) throws IOException {
        Intrinsics.checkNotNullParameter(url, "$url");
        throw new IOException(e.l("Unable to download Rive file ", url), tVar);
    }

    private static final PointerInfo onTouchEvent$pointerInfoAt(RiveAnimationView riveAnimationView, MotionEvent motionEvent, int i7) {
        return new PointerInfo(riveAnimationView.getMultiTouchEnabled() ? motionEvent.getPointerId(i7) : 0, motionEvent.getX(i7), motionEvent.getY(i7));
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, List list, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        riveAnimationView.pause((List<String>) list, z5);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, Loop loop, Direction direction, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i7 & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i7 & 2) != 0) {
            direction = Direction.AUTO;
        }
        if ((i7 & 4) != 0) {
            z5 = true;
        }
        riveAnimationView.play(loop, direction, z5);
    }

    public static /* synthetic */ void setRiveBytes$default(RiveAnimationView riveAnimationView, byte[] bArr, String str, String str2, String str3, boolean z5, boolean z6, Fit fit, Alignment alignment, Loop loop, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveBytes");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            z5 = riveAnimationView.controller.getAutoplay();
        }
        if ((i7 & 32) != 0) {
            z6 = false;
        }
        if ((i7 & 64) != 0) {
            fit = Fit.INSTANCE.fromIndex(fitIndexDefault);
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            alignment = Alignment.INSTANCE.fromIndex(alignmentIndexDefault);
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            loop = Loop.INSTANCE.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveBytes(bArr, str, str2, str3, z5, z6, fit, alignment, loop);
    }

    public static /* synthetic */ void setRiveFile$default(RiveAnimationView riveAnimationView, File file, String str, String str2, String str3, boolean z5, boolean z6, Fit fit, Alignment alignment, Loop loop, int i7, Object obj) throws RiveException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveFile");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            z5 = riveAnimationView.controller.getAutoplay();
        }
        if ((i7 & 32) != 0) {
            z6 = false;
        }
        if ((i7 & 64) != 0) {
            fit = Fit.INSTANCE.fromIndex(fitIndexDefault);
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            alignment = Alignment.INSTANCE.fromIndex(alignmentIndexDefault);
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            loop = Loop.INSTANCE.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveFile(file, str, str2, str3, z5, z6, fit, alignment, loop);
    }

    public static /* synthetic */ void setRiveResource$default(RiveAnimationView riveAnimationView, int i7, String str, String str2, String str3, boolean z5, boolean z6, Fit fit, Alignment alignment, Loop loop, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveResource");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            z5 = riveAnimationView.controller.getAutoplay();
        }
        if ((i10 & 32) != 0) {
            z6 = false;
        }
        if ((i10 & 64) != 0) {
            fit = Fit.INSTANCE.fromIndex(fitIndexDefault);
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            alignment = Alignment.INSTANCE.fromIndex(alignmentIndexDefault);
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            loop = Loop.INSTANCE.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveResource(i7, str, str2, str3, z5, z6, fit, alignment, loop);
    }

    @TargetApi(24)
    private final void startFrameMetrics() {
        RendererMetrics rendererMetrics = new RendererMetrics(getActivity());
        getActivity().getWindow().addOnFrameMetricsAvailableListener(rendererMetrics, new Handler(Looper.getMainLooper()));
        this.frameMetricsListener = rendererMetrics;
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, List list, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        riveAnimationView.stop((List<String>) list, z5);
    }

    @TargetApi(24)
    private final void stopFrameMetrics() {
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.frameMetricsListener;
        if (onFrameMetricsAvailableListener != null) {
            getActivity().getWindow().removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    private final void validateLifecycleOwner() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwnerB = b1.b(this);
        if (lifecycleOwnerB == null || Intrinsics.areEqual(lifecycleOwnerB, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.c(getLifecycleObserver());
        }
        this.lifecycleOwner = lifecycleOwnerB;
        Lifecycle lifecycle2 = lifecycleOwnerB.getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.a(getLifecycleObserver());
        }
    }

    public final void addEventListener(@NotNull RiveFileController.RiveEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.controller.addEventListener(listener);
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView
    @NotNull
    public u createObserver() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.createObserver.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Creating lifecycle observer.";
            }
        });
        RefCount[] elements = {this.controller, this.rendererAttributes.getAssetLoader()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new RiveViewLifecycleObserver(CollectionsKt.j0(y.r(elements)));
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView
    @NotNull
    public Renderer createRenderer() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.createRenderer.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Creating RiveArtboardRenderer.";
            }
        });
        return new RiveArtboardRenderer(this.rendererAttributes.getRiveTraceAnimations(), this.rendererAttributes.getRendererType(), this.controller);
    }

    public final void fireState(@NotNull String stateMachineName, @NotNull String inputName) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        RiveFileController.fireState$default(this.controller, stateMachineName, inputName, null, 4, null);
    }

    public final void fireStateAtPath(@NotNull String inputName, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.controller.fireStateAtPath(inputName, path);
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    @NotNull
    public final List<LinearAnimationInstance> getAnimations() {
        return this.controller.getAnimations();
    }

    public final String getArtboardName() {
        Artboard activeArtboard = this.controller.getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getName();
        }
        return null;
    }

    public final RiveArtboardRenderer getArtboardRenderer() {
        Renderer renderer = getRenderer();
        if (renderer == null ? true : renderer instanceof RiveArtboardRenderer) {
            return (RiveArtboardRenderer) getRenderer();
        }
        Renderer renderer2 = getRenderer();
        String simpleName = renderer2 != null ? renderer2.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        }
        throw new w("Expected RiveArtboardRenderer but got ".concat(simpleName));
    }

    public final boolean getAutoplay() {
        return this.controller.getAutoplay();
    }

    @NotNull
    public final RiveFileController getController() {
        return this.controller;
    }

    public boolean getDefaultAutoplay() {
        return this.defaultAutoplay;
    }

    public final File getFile() {
        return this.controller.getFile();
    }

    @NotNull
    public final Fit getFit() {
        return this.controller.getFit();
    }

    public final Float getLayoutScaleFactor() {
        return this.controller.getLayoutScaleFactor();
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.controller.getLayoutScaleFactorAutomatic();
    }

    public boolean getMultiTouchEnabled() {
        return this.multiTouchEnabled;
    }

    @NotNull
    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        return this.controller.getPlayingAnimations();
    }

    @NotNull
    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        return this.controller.getPlayingStateMachines();
    }

    @NotNull
    public final RendererAttributes getRendererAttributes() {
        return this.rendererAttributes;
    }

    @NotNull
    public final List<StateMachineInstance> getStateMachines() {
        return this.controller.getStateMachines();
    }

    public final String getTextRunValue(@NotNull String textRunName) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        return this.controller.getTextRunValue(textRunName);
    }

    public boolean getTouchPassThrough() {
        return this.touchPassThrough;
    }

    public final Float getVolume() {
        return this.controller.getVolume();
    }

    public final boolean isPlaying() {
        Renderer renderer = getRenderer();
        return renderer != null && renderer.getIsPlaying();
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        validateLifecycleOwner();
        if (this.controller.getFile() == null) {
            loadFileFromResource(new Function1<File, Unit>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.onAttachedToWindow.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((File) obj);
                    return Unit.f14616a;
                }

                public final void invoke(@NotNull File it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RiveAnimationView.this.getController().setFile(it);
                    RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
                }
            });
        }
        Renderer renderer = getRenderer();
        Intrinsics.checkNotNull(renderer);
        if (renderer.getTrace()) {
            startFrameMetrics();
        }
        this.controller.setActive(true);
        Renderer renderer2 = getRenderer();
        Intrinsics.checkNotNull(renderer2);
        renderer2.start();
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.View
    public void onDetachedFromWindow() {
        this.controller.setActive(false);
        stopFrameMetrics();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getRenderer() == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.onMeasure.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "onMeasure(): Renderer not instantiated yet.";
                }
            });
            return;
        }
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int iWidth = mode == 0 ? (int) this.controller.getArtboardBounds().width() : View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int iHeight = mode2 == 0 ? (int) this.controller.getArtboardBounds().height() : View.MeasureSpec.getSize(heightMeasureSpec);
        this.controller.setLayoutScaleFactorAutomatic$kotlin_release(getResources().getDisplayMetrics().density);
        this.controller.getRequireArtboardResize().set(true);
        this.bounds.set(0.0f, 0.0f, iWidth, iHeight);
        RectF rectFCalculateRequiredBounds = Rive.INSTANCE.calculateRequiredBounds(this.controller.getFit(), this.controller.getAlignment(), this.bounds, this.controller.getArtboardBounds(), this.controller.getLayoutScaleFactorActive$kotlin_release());
        if (mode == Integer.MIN_VALUE) {
            iWidth = Math.min((int) rectFCalculateRequiredBounds.width(), iWidth);
        } else if (mode != 1073741824) {
            iWidth = (int) rectFCalculateRequiredBounds.width();
        }
        if (mode2 == Integer.MIN_VALUE) {
            iHeight = Math.min((int) rectFCalculateRequiredBounds.height(), iHeight);
        } else if (mode2 != 1073741824) {
            iHeight = (int) rectFCalculateRequiredBounds.height();
        }
        setMeasuredDimension(iWidth, iHeight);
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        super.onSurfaceTextureAvailable(surfaceTexture, width, height);
        this.controller.setTargetBounds(new RectF(0.0f, 0.0f, width, height));
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        super.onSurfaceTextureSizeChanged(surface, width, height);
        this.controller.setTargetBounds(new RectF(0.0f, 0.0f, width, height));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z5 = !getTouchPassThrough();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            PointerInfo pointerInfoOnTouchEvent$pointerInfoAt = onTouchEvent$pointerInfoAt(this, event, event.getActionIndex());
            int id2 = pointerInfoOnTouchEvent$pointerInfoAt.getId();
            float x5 = pointerInfoOnTouchEvent$pointerInfoAt.getX();
            float y5 = pointerInfoOnTouchEvent$pointerInfoAt.getY();
            this.pointersInsideView.put(id2, inBounds(x5, y5));
            this.controller.pointerEvent(PointerEvents.POINTER_DOWN, id2, x5, y5);
            return z5;
        }
        if (actionMasked == 1) {
            PointerInfo pointerInfoOnTouchEvent$pointerInfoAt2 = onTouchEvent$pointerInfoAt(this, event, event.getActionIndex());
            int id3 = pointerInfoOnTouchEvent$pointerInfoAt2.getId();
            float x6 = pointerInfoOnTouchEvent$pointerInfoAt2.getX();
            float y8 = pointerInfoOnTouchEvent$pointerInfoAt2.getY();
            this.controller.pointerEvent(PointerEvents.POINTER_UP, id3, x6, y8);
            this.controller.pointerEvent(PointerEvents.POINTER_EXIT, id3, x6, y8);
            if (this.pointersInsideView.get(id3)) {
                performClick();
            }
            this.pointersInsideView.clear();
            return z5;
        }
        if (actionMasked == 2) {
            int pointerCount = getMultiTouchEnabled() ? event.getPointerCount() : 1;
            for (int i7 = 0; i7 < pointerCount; i7++) {
                PointerInfo pointerInfoOnTouchEvent$pointerInfoAt3 = onTouchEvent$pointerInfoAt(this, event, i7);
                int id4 = pointerInfoOnTouchEvent$pointerInfoAt3.getId();
                float x10 = pointerInfoOnTouchEvent$pointerInfoAt3.getX();
                float y10 = pointerInfoOnTouchEvent$pointerInfoAt3.getY();
                boolean z6 = this.pointersInsideView.get(id4);
                boolean zInBounds = inBounds(x10, y10);
                if (z6 && !zInBounds) {
                    this.controller.pointerEvent(PointerEvents.POINTER_EXIT, id4, x10, y10);
                }
                this.pointersInsideView.put(id4, zInBounds);
                this.controller.pointerEvent(PointerEvents.POINTER_MOVE, id4, x10, y10);
            }
        } else {
            if (actionMasked == 3) {
                c cVar = new c(this.pointersInsideView);
                while (cVar.hasNext()) {
                    int iNextInt = cVar.nextInt();
                    this.controller.pointerEvent(PointerEvents.POINTER_UP, iNextInt, -1.0f, -1.0f);
                    this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iNextInt, -1.0f, -1.0f);
                }
                this.pointersInsideView.clear();
                return z5;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    RiveLog.INSTANCE.getLogger().w(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.onTouchEvent.1
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "onTouchEvent(): Renderer not instantiated yet.";
                        }
                    });
                    return z5;
                }
                if (getMultiTouchEnabled()) {
                    PointerInfo pointerInfoOnTouchEvent$pointerInfoAt4 = onTouchEvent$pointerInfoAt(this, event, event.getActionIndex());
                    int id5 = pointerInfoOnTouchEvent$pointerInfoAt4.getId();
                    float x11 = pointerInfoOnTouchEvent$pointerInfoAt4.getX();
                    float y11 = pointerInfoOnTouchEvent$pointerInfoAt4.getY();
                    this.controller.pointerEvent(PointerEvents.POINTER_UP, id5, x11, y11);
                    this.controller.pointerEvent(PointerEvents.POINTER_EXIT, id5, x11, y11);
                    if (this.pointersInsideView.get(id5)) {
                        performClick();
                    }
                    this.pointersInsideView.delete(id5);
                    return z5;
                }
            } else if (getMultiTouchEnabled()) {
                PointerInfo pointerInfoOnTouchEvent$pointerInfoAt5 = onTouchEvent$pointerInfoAt(this, event, event.getActionIndex());
                int id6 = pointerInfoOnTouchEvent$pointerInfoAt5.getId();
                float x12 = pointerInfoOnTouchEvent$pointerInfoAt5.getX();
                float y12 = pointerInfoOnTouchEvent$pointerInfoAt5.getY();
                this.pointersInsideView.put(id6, inBounds(x12, y12));
                this.controller.pointerEvent(PointerEvents.POINTER_DOWN, id6, x12, y12);
                return z5;
            }
        }
        return z5;
    }

    public final void pause() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.stop();
        }
        this.controller.pause();
        stopFrameMetrics();
    }

    public final void play(@NotNull Loop loop, @NotNull Direction direction, boolean settleInitialState) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.rendererAttributes.setLoop(loop);
        this.controller.play(loop, direction, settleInitialState);
    }

    public final void removeEventListener(@NotNull RiveFileController.RiveEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.controller.removeEventListener(listener);
    }

    public final void reset() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.reset();
        }
    }

    @ControllerStateManagement
    public final void restoreControllerState(@NotNull ControllerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.controller.restoreControllerState(state);
    }

    @ControllerStateManagement
    public final ControllerState saveControllerState() {
        this.rendererAttributes.setResource(null);
        return this.controller.saveControllerState();
    }

    public final void setAlignment(@NotNull Alignment value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.controller.setAlignment(value);
    }

    public final void setArtboardName(String str) throws ArtboardException {
        this.controller.selectArtboard(str);
    }

    public final void setAssetLoader(final FileAssetLoader assetLoader) {
        if (Intrinsics.areEqual(assetLoader, this.rendererAttributes.getAssetLoader())) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.setAssetLoader.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "setAssetLoader: assetLoader is already set to " + assetLoader;
                }
            });
            return;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.setAssetLoader.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "setAssetLoader: " + assetLoader;
            }
        });
        FileAssetLoader assetLoader2 = this.rendererAttributes.getAssetLoader();
        this.rendererAttributes.setAssetLoader(assetLoader);
        if (assetLoader != null) {
            assetLoader.acquire();
        }
        if (assetLoader2 != null) {
            assetLoader2.release();
        }
        u lifecycleObserver = getLifecycleObserver();
        RiveViewLifecycleObserver riveViewLifecycleObserver = lifecycleObserver instanceof RiveViewLifecycleObserver ? (RiveViewLifecycleObserver) lifecycleObserver : null;
        if (riveViewLifecycleObserver != null) {
            if (assetLoader2 != null) {
                riveViewLifecycleObserver.remove(assetLoader2);
            }
            if (assetLoader != null) {
                riveViewLifecycleObserver.insert(assetLoader);
            }
        }
    }

    public final void setAutoplay(boolean z5) {
        this.controller.setAutoplay(z5);
    }

    public final void setBooleanState(@NotNull String stateMachineName, @NotNull String inputName, boolean value) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        RiveFileController.setBooleanState$default(this.controller, stateMachineName, inputName, value, null, 8, null);
    }

    public final void setBooleanStateAtPath(@NotNull String inputName, boolean value, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.controller.setBooleanStateAtPath(inputName, value, path);
    }

    public final void setController(@NotNull RiveFileController riveFileController) {
        Intrinsics.checkNotNullParameter(riveFileController, "<set-?>");
        this.controller = riveFileController;
    }

    public final void setFit(@NotNull Fit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.controller.setFit(value);
    }

    public final void setLayoutScaleFactor(Float f2) {
        this.controller.setLayoutScaleFactor(f2);
    }

    public final void setLayoutScaleFactorAutomatic$kotlin_release(float f2) {
        this.controller.setLayoutScaleFactorAutomatic$kotlin_release(f2);
    }

    public void setMultiTouchEnabled(boolean z5) {
        this.multiTouchEnabled = z5;
        if (z5) {
            return;
        }
        c cVar = new c(this.pointersInsideView);
        while (cVar.hasNext()) {
            int iNextInt = cVar.nextInt();
            if (iNextInt != 0) {
                this.controller.pointerEvent(PointerEvents.POINTER_UP, iNextInt, -1.0f, -1.0f);
                this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iNextInt, -1.0f, -1.0f);
                this.pointersInsideView.delete(iNextInt);
            }
        }
    }

    public final void setMultipleStates(@NotNull ChangedInput... inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.controller.queueInputs$kotlin_release((ChangedInput[]) Arrays.copyOf(inputs, inputs.length));
    }

    public final void setNumberState(@NotNull String stateMachineName, @NotNull String inputName, float value) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        RiveFileController.setNumberState$default(this.controller, stateMachineName, inputName, value, null, 8, null);
    }

    public final void setNumberStateAtPath(@NotNull String inputName, float value, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.controller.setNumberStateAtPath(inputName, value, path);
    }

    public final void setRiveBytes(@NotNull final byte[] bytes, String artboardName, String animationName, String stateMachineName, boolean autoplay, boolean autoBind, @NotNull Fit fit, @NotNull Alignment alignment, @NotNull Loop loop) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(loop, "loop");
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.setRiveBytes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return kk.b.h(bytes.length, "setRiveBytes with bytes length: ");
            }
        });
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(artboardName);
        rendererAttributes.setAnimationName(animationName);
        rendererAttributes.setStateMachineName(stateMachineName);
        rendererAttributes.setAutoplay(autoplay);
        rendererAttributes.setAutoBind(autoBind);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.INSTANCE.makeMaybeResource(bytes));
        loadFileFromResource(new Function1<File, Unit>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.setRiveBytes.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((File) obj);
                return Unit.f14616a;
            }

            public final void invoke(@NotNull File it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RiveAnimationView.this.getController().setFile(it);
                RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
            }
        });
    }

    public final void setRiveFile(@NotNull final File file, String artboardName, String animationName, String stateMachineName, boolean autoplay, boolean autoBind, @NotNull Fit fit, @NotNull Alignment alignment, @NotNull Loop loop) throws RiveException {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(loop, "loop");
        if (file.getRendererType() != this.rendererAttributes.getRendererType()) {
            throw new RiveException(e.m("Incompatible Renderer types: file initialized with ", file.getRendererType().name(), " but View is set up for ", this.rendererAttributes.getRendererType().name()));
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.setRiveFile.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "setRiveFile with file: " + file;
            }
        });
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(artboardName);
        rendererAttributes.setAnimationName(animationName);
        rendererAttributes.setStateMachineName(stateMachineName);
        rendererAttributes.setAutoplay(autoplay);
        rendererAttributes.setAutoBind(autoBind);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.INSTANCE.makeMaybeResource(file));
        this.controller.setFile(file);
        this.controller.setupScene$kotlin_release(this.rendererAttributes);
    }

    public final void setRiveResource(final int resId, String artboardName, String animationName, String stateMachineName, boolean autoplay, boolean autoBind, @NotNull Fit fit, @NotNull Alignment alignment, @NotNull Loop loop) {
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(loop, "loop");
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.setRiveResource.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return kk.b.h(resId, "setRiveResource with resId: ");
            }
        });
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(artboardName);
        rendererAttributes.setAnimationName(animationName);
        rendererAttributes.setStateMachineName(stateMachineName);
        rendererAttributes.setAutoplay(autoplay);
        rendererAttributes.setAutoBind(autoBind);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.INSTANCE.makeMaybeResource(Integer.valueOf(resId)));
        loadFileFromResource(new Function1<File, Unit>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.setRiveResource.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((File) obj);
                return Unit.f14616a;
            }

            public final void invoke(@NotNull File it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RiveAnimationView.this.getController().setFile(it);
                RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
            }
        });
    }

    public final void setTextRunValue(@NotNull String textRunName, @NotNull String textValue) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        this.controller.setTextRunValue(textRunName, textValue);
    }

    public void setTouchPassThrough(boolean z5) {
        this.touchPassThrough = z5;
    }

    public final void setVolume(float value) {
        this.controller.setVolume(value);
    }

    public final void stop() {
        this.controller.stopAnimations();
        stopFrameMetrics();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveAnimationView(@NotNull Context context, AttributeSet attributeSet) {
        Lifecycle lifecycle;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultAutoplay = true;
        this.bounds = new RectF();
        Object context2 = getContext();
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = null;
                break;
            } else if (context2 instanceof LifecycleOwner) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        this.lifecycleOwner = (LifecycleOwner) context2;
        this.pointersInsideView = new SparseBooleanArray();
        AnonymousClass1 anonymousClass1 = new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Creating RiveAnimationView.";
            }
        };
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, anonymousClass1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.RiveAnimationView, 0, 0);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RiveAnimationView_riveResource, -1);
            Object string = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveUrl);
            ResourceType.Companion companion = ResourceType.INSTANCE;
            if (resourceId != -1) {
                string = Integer.valueOf(resourceId);
            }
            ResourceType resourceTypeMakeMaybeResource = companion.makeMaybeResource(string);
            RendererAttributes.Companion companion2 = RendererAttributes.INSTANCE;
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveAssetLoaderClass);
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            FileAssetLoader fileAssetLoaderAssetLoaderFrom = companion2.assetLoaderFrom(string2, applicationContext);
            boolean z5 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveShouldLoadCDNAssets, true);
            setTouchPassThrough(typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveTouchPassThrough, false));
            setMultiTouchEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveMultiTouchEnabled, false));
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveAlignment, alignmentIndexDefault);
            int integer2 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveFit, fitIndexDefault);
            int integer3 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveLoop, loopIndexDefault);
            boolean z6 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveAutoPlay, getDefaultAutoplay());
            boolean z7 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveAutoBind, false);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveTraceAnimations, false);
            String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveArtboard);
            String string4 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveAnimation);
            String string5 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveStateMachine);
            int integer4 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveRenderer, rendererIndexDefault);
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2);
            RendererAttributes rendererAttributes = new RendererAttributes(integer, integer2, integer3, integer4, z6, z7, z10, string3, string4, string5, resourceTypeMakeMaybeResource, new FallbackAssetLoader(applicationContext2, z5, fileAssetLoaderAssetLoaderFrom));
            this.rendererAttributes = rendererAttributes;
            this.controller = new RiveFileController(rendererAttributes.getLoop(), rendererAttributes.getAutoplay(), null, null, null, 28, null);
            LifecycleOwner lifecycleOwner = this.lifecycleOwner;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.a(getLifecycleObserver());
            }
            if (resourceTypeMakeMaybeResource != null) {
                riveLog.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView$2$1$1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Resource available - loading file immediately.";
                    }
                });
                loadFileFromResource(new Function1<File, Unit>() { // from class: app.rive.runtime.kotlin.RiveAnimationView$2$1$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((File) obj);
                        return Unit.f14616a;
                    }

                    public final void invoke(@NotNull File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.this$0.getController().setFile(it);
                        this.this$0.getController().setupScene$kotlin_release(this.this$0.getRendererAttributes());
                    }
                });
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, String str, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        riveAnimationView.pause(str, z5);
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, String str, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        riveAnimationView.stop(str, z5);
    }

    public final String getTextRunValue(@NotNull String textRunName, @NotNull String path) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(path, "path");
        return this.controller.getTextRunValue(textRunName, path);
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(@NotNull RiveFileController.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.controller.registerListener(listener);
    }

    public final void setTextRunValue(@NotNull String textRunName, @NotNull String textValue, @NotNull String path) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Intrinsics.checkNotNullParameter(path, "path");
        this.controller.setTextRunValue(textRunName, textValue, path);
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(@NotNull RiveFileController.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.controller.unregisterListener(listener);
    }

    public final void stop(@NotNull List<String> animationNames, boolean areStateMachines) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        this.controller.stopAnimations(animationNames, areStateMachines);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, List list, Loop loop, Direction direction, boolean z5, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i7 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i7 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        boolean z7 = z5;
        if ((i7 & 16) != 0) {
            z6 = true;
        }
        riveAnimationView.play((List<String>) list, loop2, direction2, z7, z6);
    }

    public final void pause(@NotNull List<String> animationNames, boolean areStateMachines) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        this.controller.pause(animationNames, areStateMachines);
    }

    public final void play(@NotNull List<String> animationNames, @NotNull Loop loop, @NotNull Direction direction, boolean areStateMachines, boolean settleInitialState) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.rendererAttributes.setLoop(loop);
        this.controller.play(animationNames, loop, direction, areStateMachines, settleInitialState);
    }

    public final void stop(@NotNull String animationName, boolean isStateMachine) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        this.controller.stopAnimations(animationName, isStateMachine);
    }

    public final void pause(@NotNull String animationName, boolean isStateMachine) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        this.controller.pause(animationName, isStateMachine);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, String str, Loop loop, Direction direction, boolean z5, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i7 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i7 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        boolean z7 = z5;
        if ((i7 & 16) != 0) {
            z6 = true;
        }
        riveAnimationView.play(str, loop2, direction2, z7, z6);
    }

    public final void play(@NotNull String animationName, @NotNull Loop loop, @NotNull Direction direction, boolean isStateMachine, boolean settleInitialState) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setAnimationName(isStateMachine ? null : animationName);
        rendererAttributes.setStateMachineName(isStateMachine ? animationName : null);
        rendererAttributes.setLoop(loop);
        this.controller.play(animationName, loop, direction, isStateMachine, settleInitialState);
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DB}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010%\"\u0004\bA\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010\u001d¨\u0006E"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "", "alignmentIndex", "", "fitIndex", "loopIndex", "rendererIndex", "autoplay", "", "autoBind", "riveTraceAnimations", "artboardName", "", "animationName", "stateMachineName", "resource", "Lapp/rive/runtime/kotlin/ResourceType;", "assetLoader", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "(IIIIZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/rive/runtime/kotlin/ResourceType;Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "getAnimationName", "()Ljava/lang/String;", "setAnimationName", "(Ljava/lang/String;)V", "getArtboardName", "setArtboardName", "getAssetLoader", "()Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "setAssetLoader", "(Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "getAutoBind", "()Z", "setAutoBind", "(Z)V", "getAutoplay", "setAutoplay", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "loop", "Lapp/rive/runtime/kotlin/core/Loop;", "getLoop", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "getRendererType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "setRendererType", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "getResource", "()Lapp/rive/runtime/kotlin/ResourceType;", "setResource", "(Lapp/rive/runtime/kotlin/ResourceType;)V", "getRiveTraceAnimations", "setRiveTraceAnimations", "getStateMachineName", "setStateMachineName", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RendererAttributes {

        @NotNull
        private Alignment alignment;
        private String animationName;
        private String artboardName;
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private boolean autoplay;

        @NotNull
        private Fit fit;

        @NotNull
        private Loop loop;

        @NotNull
        private RendererType rendererType;
        private ResourceType resource;
        private boolean riveTraceAnimations;
        private String stateMachineName;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes$Companion;", "", "()V", "assetLoaderFrom", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", StackTraceHelper.NAME_KEY, "", "context", "Landroid/content/Context;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nRiveAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,1299:1\n1#2:1300\n69#3,2:1301\n69#3,2:1303\n*S KotlinDebug\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes$Companion\n*L\n270#1:1301,2\n273#1:1303,2\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FileAssetLoader assetLoaderFrom(final String name, @NotNull Context context) {
                Constructor<?> constructor;
                Constructor<?> constructor2;
                Object objNewInstance;
                Object objNewInstance2;
                Intrinsics.checkNotNullParameter(context, "context");
                if (name != null && name.length() != 0) {
                    try {
                        Class<?> cls = Class.forName(name);
                        Constructor<?>[] constructors = cls.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
                        int length = constructors.length;
                        int i7 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                constructor = null;
                                break;
                            }
                            constructor = constructors[i10];
                            if (constructor.getParameterTypes().length == 1 && Intrinsics.areEqual(constructor.getParameterTypes()[0], Context.class)) {
                                break;
                            }
                            i10++;
                        }
                        if (constructor != null && (objNewInstance2 = constructor.newInstance(context.getApplicationContext())) != null && (objNewInstance2 instanceof ContextAssetLoader)) {
                            return (FileAssetLoader) objNewInstance2;
                        }
                        Constructor<?>[] constructors2 = cls.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors2, "getConstructors(...)");
                        int length2 = constructors2.length;
                        while (true) {
                            if (i7 >= length2) {
                                constructor2 = null;
                                break;
                            }
                            constructor2 = constructors2[i7];
                            Class<?>[] parameterTypes = constructor2.getParameterTypes();
                            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                break;
                            }
                            i7++;
                        }
                        if (constructor2 != null && (objNewInstance = constructor2.newInstance(null)) != null && (objNewInstance instanceof FileAssetLoader)) {
                            return (FileAssetLoader) objNewInstance;
                        }
                        RiveLog.INSTANCE.getLogger().e(RiveAnimationView.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView$RendererAttributes$Companion$assetLoaderFrom$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return e.l("Failed to initialize AssetLoader: No suitable constructor in ", name);
                            }
                        });
                        return null;
                    } catch (Exception e10) {
                        RiveLog.INSTANCE.getLogger().e(RiveAnimationView.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.RiveAnimationView$RendererAttributes$Companion$assetLoaderFrom$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return g.f("Failed to initialize AssetLoader from name: ", name, " (exception: ", e10.getMessage(), ")");
                            }
                        });
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        public RendererAttributes(int i7, int i10, int i11, int i12, boolean z5, boolean z6, boolean z7, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader) {
            this.autoplay = z5;
            this.autoBind = z6;
            this.riveTraceAnimations = z7;
            this.artboardName = str;
            this.animationName = str2;
            this.stateMachineName = str3;
            this.resource = resourceType;
            this.assetLoader = fileAssetLoader;
            this.alignment = Alignment.INSTANCE.fromIndex(i7);
            this.fit = Fit.INSTANCE.fromIndex(i10);
            this.loop = Loop.INSTANCE.fromIndex(i11);
            this.rendererType = RendererType.INSTANCE.fromIndex(i12);
        }

        @NotNull
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final String getAnimationName() {
            return this.animationName;
        }

        public final String getArtboardName() {
            return this.artboardName;
        }

        public final FileAssetLoader getAssetLoader() {
            return this.assetLoader;
        }

        public final boolean getAutoBind() {
            return this.autoBind;
        }

        public final boolean getAutoplay() {
            return this.autoplay;
        }

        @NotNull
        public final Fit getFit() {
            return this.fit;
        }

        @NotNull
        public final Loop getLoop() {
            return this.loop;
        }

        @NotNull
        public final RendererType getRendererType() {
            return this.rendererType;
        }

        public final ResourceType getResource() {
            return this.resource;
        }

        public final boolean getRiveTraceAnimations() {
            return this.riveTraceAnimations;
        }

        public final String getStateMachineName() {
            return this.stateMachineName;
        }

        public final void setAlignment(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "<set-?>");
            this.alignment = alignment;
        }

        public final void setAnimationName(String str) {
            this.animationName = str;
        }

        public final void setArtboardName(String str) {
            this.artboardName = str;
        }

        public final void setAssetLoader(FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        public final void setAutoBind(boolean z5) {
            this.autoBind = z5;
        }

        public final void setAutoplay(boolean z5) {
            this.autoplay = z5;
        }

        public final void setFit(@NotNull Fit fit) {
            Intrinsics.checkNotNullParameter(fit, "<set-?>");
            this.fit = fit;
        }

        public final void setLoop(@NotNull Loop loop) {
            Intrinsics.checkNotNullParameter(loop, "<set-?>");
            this.loop = loop;
        }

        public final void setRendererType(@NotNull RendererType rendererType) {
            Intrinsics.checkNotNullParameter(rendererType, "<set-?>");
            this.rendererType = rendererType;
        }

        public final void setResource(ResourceType resourceType) {
            this.resource = resourceType;
        }

        public final void setRiveTraceAnimations(boolean z5) {
            this.riveTraceAnimations = z5;
        }

        public final void setStateMachineName(String str) {
            this.stateMachineName = str;
        }

        public /* synthetic */ RendererAttributes(int i7, int i10, int i11, int i12, boolean z5, boolean z6, boolean z7, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? RiveAnimationView.INSTANCE.getAlignmentIndexDefault() : i7, (i13 & 2) != 0 ? RiveAnimationView.INSTANCE.getFitIndexDefault() : i10, (i13 & 4) != 0 ? RiveAnimationView.INSTANCE.getLoopIndexDefault() : i11, (i13 & 8) != 0 ? RiveAnimationView.INSTANCE.getRendererIndexDefault() : i12, z5, (i13 & 32) != 0 ? false : z6, (i13 & 64) != 0 ? false : z7, str, str2, str3, resourceType, (i13 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : fileAssetLoader);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RiveAnimationView(@NotNull Builder builder) {
        this(builder.getContext(), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (getArtboardRenderer() == null) {
            RendererAttributes rendererAttributes = this.rendererAttributes;
            RendererType rendererType = builder.getRendererType();
            rendererAttributes.setRendererType(rendererType == null ? RendererType.INSTANCE.fromIndex(rendererIndexDefault) : rendererType);
            Boolean autoplay = builder.getAutoplay();
            rendererAttributes.setAutoplay(autoplay != null ? autoplay.booleanValue() : getDefaultAutoplay());
            rendererAttributes.setAutoBind(builder.getAutoBind());
            Boolean traceAnimations = builder.getTraceAnimations();
            rendererAttributes.setRiveTraceAnimations(traceAnimations != null ? traceAnimations.booleanValue() : false);
            rendererAttributes.setArtboardName(builder.getArtboardName());
            rendererAttributes.setAnimationName(builder.getAnimationName());
            rendererAttributes.setStateMachineName(builder.getStateMachineName());
            rendererAttributes.setResource(builder.getResourceType());
            FileAssetLoader assetLoader = rendererAttributes.getAssetLoader();
            Intrinsics.checkNotNull(assetLoader, "null cannot be cast to non-null type app.rive.runtime.kotlin.core.FallbackAssetLoader");
            ((FallbackAssetLoader) assetLoader).resetWith$kotlin_release(builder);
            Alignment alignment = builder.getAlignment();
            rendererAttributes.setAlignment(alignment == null ? rendererAttributes.getAlignment() : alignment);
            Fit fit = builder.getFit();
            rendererAttributes.setFit(fit == null ? rendererAttributes.getFit() : fit);
            Loop loop = builder.getLoop();
            rendererAttributes.setLoop(loop == null ? rendererAttributes.getLoop() : loop);
            setTouchPassThrough(builder.getTouchPassThrough());
            setMultiTouchEnabled(builder.getMultiTouchEnabled());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
