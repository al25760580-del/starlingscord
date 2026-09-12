package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0011H\u0017J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0017J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0017J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0017J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0017J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(H\u0017J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0017J(\u0010)\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0016J0\u0010)\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0017J(\u0010)\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0016J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020+H\u0017J(\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0016J0\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016JH\u00104\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016J\"\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J,\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010\u00112\u0006\u0010=\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J,\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010\u00112\u0006\u0010=\u001a\u00020 2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J*\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017JR\u0010:\u001a\u00020+2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017JR\u0010:\u001a\u00020+2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017JL\u0010G\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010M\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0016J(\u0010N\u001a\u00020+2\u0006\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\"2\u0006\u0010Q\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0010\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020\u0007H\u0016J\u0018\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020UH\u0017J\u0018\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020VH\u0016J\u0010\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020WH\u0017J\u0018\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020W2\u0006\u0010T\u001a\u00020UH\u0017J@\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020 2\u0006\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\"2\u0006\u0010\\\u001a\u00020 2\u0006\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0017J0\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020 2\u0006\u0010_\u001a\u00020K2\u0006\u0010\\\u001a\u00020 2\u0006\u0010`\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0017J@\u0010a\u001a\u00020+2\u0006\u0010b\u001a\u00020?2\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020K2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020h2\u0006\u00109\u001a\u00020\u0017H\u0016J0\u0010i\u001a\u00020+2\u0006\u0010j\u001a\u00020\"2\u0006\u0010k\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"2\u0006\u0010m\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0018\u0010n\u001a\u00020+2\u0006\u0010o\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0016J(\u0010n\u001a\u00020+2\u0006\u0010o\u001a\u00020K2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0017H\u0016J \u0010q\u001a\u00020+2\u0006\u00109\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"H\u0002J\"\u0010r\u001a\u00020+2\u0006\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010U2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0018\u0010v\u001a\u00020+2\u0006\u00105\u001a\u00020 2\u0006\u00109\u001a\u00020\u0017H\u0016J0\u0010v\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0010\u0010w\u001a\u00020+2\u0006\u00109\u001a\u00020\u0017H\u0016J\"\u0010x\u001a\u00020+2\u0006\u0010y\u001a\u00020z2\u0006\u0010=\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J\"\u0010x\u001a\u00020+2\u0006\u0010y\u001a\u00020z2\u0006\u0010=\u001a\u00020 2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0017J\u0018\u0010{\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0010\u0010|\u001a\u00020+2\u0006\u0010}\u001a\u00020~H\u0016J\u0018\u0010|\u001a\u00020+2\u0006\u0010}\u001a\u00020~2\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0018\u0010|\u001a\u00020+2\u0006\u0010}\u001a\u00020~2\u0006\u0010=\u001a\u00020 H\u0016J \u0010\u007f\u001a\u00020+2\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0019\u0010\u0080\u0001\u001a\u00020+2\u0006\u0010o\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0016J+\u0010\u0080\u0001\u001a\u00020+2\b\u0010o\u001a\u0004\u0018\u00010K2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0017H\u0016J5\u0010\u0081\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0017J$\u0010\u0081\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0085\u0001\u001a\u00020K2\u0006\u00109\u001a\u00020\u0017H\u0017J!\u0010\u0087\u0001\u001a\u00020+2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0016J\u0019\u0010\u0088\u0001\u001a\u00020+2\u0006\u00101\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u0017H\u0016J\u0019\u0010\u0088\u0001\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00109\u001a\u00020\u0017H\u0016J1\u0010\u0088\u0001\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020+2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0016J+\u0010\u008c\u0001\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020 2\u0007\u0010\u008d\u0001\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016JC\u0010\u008c\u0001\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0007\u0010\u008d\u0001\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J<\u0010\u008f\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J=\u0010\u008f\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J+\u0010\u008f\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J=\u0010\u008f\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016JF\u0010\u0093\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u0094\u0001\u001a\u00020\"2\u0007\u0010\u0095\u0001\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016J5\u0010\u0093\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u0094\u0001\u001a\u00020\"2\u0007\u0010\u0095\u0001\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0016JX\u0010\u0096\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0098\u0001\u001a\u00020\u00072\u0007\u0010\u0099\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016JW\u0010\u0096\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0007\u0010\u009b\u0001\u001a\u00020\u00072\u0007\u0010\u009c\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016JX\u0010\u0096\u0001\u001a\u00020+2\b\u0010\u0082\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0098\u0001\u001a\u00020\u00072\u0007\u0010\u0099\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0017H\u0016Jw\u0010\u009d\u0001\u001a\u00020+2\u0007\u0010T\u001a\u00030\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00072\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00072\t\u0010 \u0001\u001a\u0004\u0018\u00010K2\u0007\u0010¡\u0001\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010M\u001a\u00020\u00072\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00012\u0007\u0010¤\u0001\u001a\u00020\u00072\u0007\u0010¥\u0001\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0017H\u0016J\t\u0010¦\u0001\u001a\u00020+H\u0017J\u0012\u0010§\u0001\u001a\u00020\u001b2\u0007\u0010¨\u0001\u001a\u00020\u0011H\u0016J\t\u0010©\u0001\u001a\u00020\u0007H\u0016J\f\u0010ª\u0001\u001a\u0005\u0018\u00010«\u0001H\u0016J\t\u0010¬\u0001\u001a\u00020\u0007H\u0016J\u0012\u0010\u00ad\u0001\u001a\u00020+2\u0007\u0010®\u0001\u001a\u00020-H\u0017J\t\u0010¯\u0001\u001a\u00020\u0007H\u0016J\t\u0010°\u0001\u001a\u00020\u0007H\u0016J\t\u0010±\u0001\u001a\u00020\u0007H\u0016J\t\u0010²\u0001\u001a\u00020\u0007H\u0016J\t\u0010³\u0001\u001a\u00020\u001bH\u0016J\t\u0010´\u0001\u001a\u00020\u001bH\u0016J\u0011\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u001b\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010¶\u0001\u001a\u00030·\u0001H\u0017J\u0011\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0017J\u001b\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010¶\u0001\u001a\u00030·\u0001H\u0017J)\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0017J3\u0010µ\u0001\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010¶\u0001\u001a\u00030·\u0001H\u0017J\u0016\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u00012\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0002J\t\u0010º\u0001\u001a\u00020+H\u0016J\u0012\u0010»\u0001\u001a\u00020+2\u0007\u0010¼\u0001\u001a\u00020\u0007H\u0016J\u0012\u0010½\u0001\u001a\u00020+2\u0007\u0010¾\u0001\u001a\u00020\"H\u0016J%\u0010¿\u0001\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u00172\b\u0010<\u001a\u0004\u0018\u00010\u0011H\u0003J\t\u0010À\u0001\u001a\u00020\u0007H\u0016J\u0010\u0010À\u0001\u001a\u00020\u00072\u0007\u0010Á\u0001\u001a\u00020\u0007J\u001e\u0010Â\u0001\u001a\u00020\u00072\t\u0010¨\u0001\u001a\u0004\u0018\u00010 2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0016J'\u0010Â\u0001\u001a\u00020\u00072\t\u0010¨\u0001\u001a\u0004\u0018\u00010 2\b\u00109\u001a\u0004\u0018\u00010\u00172\u0007\u0010Á\u0001\u001a\u00020\u0007H\u0017J3\u0010Â\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0016J<\u0010Â\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u00010\u00172\u0007\u0010Á\u0001\u001a\u00020\u0007H\u0017J\u001d\u0010Ã\u0001\u001a\u00020\u00072\t\u0010¨\u0001\u001a\u0004\u0018\u00010 2\u0007\u0010Ä\u0001\u001a\u00020\u0007H\u0016J&\u0010Ã\u0001\u001a\u00020\u00072\t\u0010¨\u0001\u001a\u0004\u0018\u00010 2\u0007\u0010Ä\u0001\u001a\u00020\u00072\u0007\u0010Á\u0001\u001a\u00020\u0007H\u0017J2\u0010Ã\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0007\u0010Ä\u0001\u001a\u00020\u0007H\u0016J;\u0010Ã\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0007\u0010Ä\u0001\u001a\u00020\u00072\u0007\u0010Á\u0001\u001a\u00020\u0007H\u0017J\u001b\u0010Å\u0001\u001a\u00020+2\u0007\u0010Æ\u0001\u001a\u00020\"2\u0007\u0010Ç\u0001\u001a\u00020\"H\u0016J\u0013\u0010È\u0001\u001a\u00020+2\b\u0010;\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010É\u0001\u001a\u00020+2\u0007\u0010Ê\u0001\u001a\u00020\u0007H\u0016J\u0015\u0010Ë\u0001\u001a\u00020+2\n\u0010Ì\u0001\u001a\u0005\u0018\u00010«\u0001H\u0016J\u0013\u0010Í\u0001\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001b\u0010Î\u0001\u001a\u00020+2\u0007\u0010Æ\u0001\u001a\u00020\"2\u0007\u0010Ç\u0001\u001a\u00020\"H\u0016J\u001b\u0010Ï\u0001\u001a\u00020+2\u0007\u0010Ð\u0001\u001a\u00020\"2\u0007\u0010Ñ\u0001\u001a\u00020\"H\u0016R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0001X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ò\u0001"}, d2 = {"Lio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas;", "Landroid/graphics/Canvas;", "()V", "bitmapColorCache", "Ljava/util/WeakHashMap;", "Landroid/graphics/Bitmap;", "Lkotlin/Pair;", "", "delegate", "getDelegate", "()Landroid/graphics/Canvas;", "setDelegate", "(Landroid/graphics/Canvas;)V", "singlePixelBitmap", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelBitmapBounds", "Landroid/graphics/Rect;", "getSinglePixelBitmapBounds", "()Landroid/graphics/Rect;", "singlePixelCanvas", "getSinglePixelCanvas", "solidPaint", "Landroid/graphics/Paint;", "textPaint", "tmpRect", "clipOutPath", "", "path", "Landroid/graphics/Path;", "clipOutRect", "rect", "Landroid/graphics/RectF;", ViewProps.LEFT, "", ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "clipPath", "op", "Landroid/graphics/Region$Op;", "clipRect", "concat", "", "matrix", "Landroid/graphics/Matrix;", "disableZ", "drawARGB", "a", "r", "g", "b", "drawArc", "oval", "startAngle", "sweepAngle", "useCenter", "paint", "drawBitmap", "bitmap", "src", "dst", LinearGradientManager.PROP_COLORS, "", "offset", "stride", "x", "y", "width", "height", "hasAlpha", "drawBitmapMesh", "meshWidth", "meshHeight", "verts", "", "vertOffset", "colorOffset", "drawCircle", "cx", "cy", "radius", "drawColor", ViewProps.COLOR, "mode", "Landroid/graphics/BlendMode;", "Landroid/graphics/PorterDuff$Mode;", "", "drawDoubleRoundRect", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "outerRadii", "innerRadii", "drawGlyphs", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "font", "Landroid/graphics/fonts/Font;", "drawLine", "startX", "startY", "stopX", "stopY", "drawLines", "pts", "count", "drawMaskedText", "drawMesh", "mesh", "Landroid/graphics/Mesh;", "blendMode", "drawOval", "drawPaint", "drawPatch", "patch", "Landroid/graphics/NinePatch;", "drawPath", "drawPicture", "picture", "Landroid/graphics/Picture;", "drawPoint", "drawPoints", "drawPosText", "text", "", "index", "pos", "", "drawRGB", "drawRect", "drawRenderNode", "renderNode", "Landroid/graphics/RenderNode;", "drawRoundRect", "rx", "ry", "drawText", "", ViewProps.START, ViewProps.END, "drawTextOnPath", "hOffset", "vOffset", "drawTextRun", "Landroid/graphics/text/MeasuredText;", "contextStart", "contextEnd", "isRtl", "contextIndex", "contextCount", "drawVertices", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "indices", "", "indexOffset", "indexCount", "enableZ", "getClipBounds", "bounds", "getDensity", "getDrawFilter", "Landroid/graphics/DrawFilter;", "getHeight", "getMatrix", "ctm", "getMaximumBitmapHeight", "getMaximumBitmapWidth", "getSaveCount", "getWidth", "isHardwareAccelerated", "isOpaque", "quickReject", "type", "Landroid/graphics/Canvas$EdgeType;", "removeBitmapShader", "Landroid/graphics/BitmapShader;", "restore", "restoreToCount", "saveCount", "rotate", "degrees", "sampleBitmapColor", "save", "saveFlags", "saveLayer", "saveLayerAlpha", "alpha", "scale", "sx", "sy", "setBitmap", "setDensity", "density", "setDrawFilter", ViewProps.FILTER, "setMatrix", "skew", "translate", "dx", "dy", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseKtx"})
@SourceDebugExtension({"SMAP\nCanvasStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasStrategy.kt\nio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1015:1\n1#2:1016\n*E\n"})
final class TextIgnoringDelegateCanvas extends Canvas {

    @NotNull
    private final WeakHashMap<Bitmap, Pair<Integer, Integer>> bitmapColorCache;
    public Canvas delegate;

    @NotNull
    private final Bitmap singlePixelBitmap;

    @NotNull
    private final Rect singlePixelBitmapBounds;

    @NotNull
    private final Canvas singlePixelCanvas;

    @NotNull
    private final Paint solidPaint = new Paint();

    @NotNull
    private final Paint textPaint = new Paint();

    @NotNull
    private final Rect tmpRect = new Rect();

    public TextIgnoringDelegateCanvas() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.singlePixelBitmap = bitmapCreateBitmap;
        this.singlePixelCanvas = new Canvas(bitmapCreateBitmap);
        this.singlePixelBitmapBounds = new Rect(0, 0, 1, 1);
        this.bitmapColorCache = new WeakHashMap<>();
    }

    private final void drawMaskedText(Paint paint, float x5, float y5) {
        this.textPaint.setColorFilter(paint.getColorFilter());
        int color = paint.getColor();
        this.textPaint.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.tmpRect;
        drawRoundRect(rect.left + x5, rect.top + y5, rect.right + x5, rect.bottom + y5, 10.0f, 10.0f, this.textPaint);
    }

    private final BitmapShader removeBitmapShader(Paint paint) {
        if (paint == null) {
            return null;
        }
        Shader shader = paint.getShader();
        if (!(shader instanceof BitmapShader)) {
            return null;
        }
        paint.setShader(null);
        return (BitmapShader) shader;
    }

    private final int sampleBitmapColor(Bitmap bitmap, Paint paint, Rect src) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        Pair<Integer, Integer> pair = this.bitmapColorCache.get(bitmap);
        if (pair != null && ((Number) pair.f14612d).intValue() == bitmap.getGenerationId()) {
            return ((Number) pair.f14613e).intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        if (config == config2 && Build.VERSION.SDK_INT >= 31) {
            BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
            this.singlePixelCanvas.drawBitmap(bitmap.asShared(), src, this.singlePixelBitmapBounds, paint);
            if (bitmapShaderRemoveBitmapShader != null && paint != null) {
                paint.setShader(bitmapShaderRemoveBitmapShader);
            }
            pixel = this.singlePixelBitmap.getPixel(0, 0);
        } else if (bitmap.getConfig() != config2) {
            BitmapShader bitmapShaderRemoveBitmapShader2 = removeBitmapShader(paint);
            this.singlePixelCanvas.drawBitmap(bitmap, src, this.singlePixelBitmapBounds, paint);
            if (bitmapShaderRemoveBitmapShader2 != null && paint != null) {
                paint.setShader(bitmapShaderRemoveBitmapShader2);
            }
            pixel = this.singlePixelBitmap.getPixel(0, 0);
        }
        this.bitmapColorCache.put(bitmap, new Pair<>(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return getDelegate().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    @d
    public boolean clipPath(@NotNull Path path, @NotNull Region.Op op2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op2, "op");
        return getDelegate().clipPath(path, op2);
    }

    @Override // android.graphics.Canvas
    @d
    public boolean clipRect(@NotNull RectF rect, @NotNull Region.Op op2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op2, "op");
        return getDelegate().clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        getDelegate().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        getDelegate().disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a10, int r5, int g6, int b10) {
        getDelegate().drawARGB(a10, r5, g6, b10);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@NotNull RectF oval, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawArc(oval, startAngle, sweepAngle, useCenter, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    @d
    public void drawBitmap(@NotNull int[] colors, int offset, int stride, float x5, float y5, int width, int height, boolean hasAlpha, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@NotNull Bitmap bitmap, int meshWidth, int meshHeight, @NotNull float[] verts, int vertOffset, int[] colors, int colorOffset, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx, float cy, float radius, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawCircle(cx, cy, radius, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        getDelegate().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(@NotNull RectF outer, float outerRx, float outerRy, @NotNull RectF inner, float innerRx, float innerRy, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(@NotNull int[] glyphIds, int glyphIdOffset, @NotNull float[] positions, int positionOffset, int glyphCount, @NotNull Font font, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(glyphIds, "glyphIds");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLine(startX, startY, stopX, stopY, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] pts, int offset, int count, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLines(pts, offset, count, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawMesh(@NotNull Mesh mesh, BlendMode blendMode, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawOval(@NotNull RectF oval, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawOval(oval, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPaint(paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(@NotNull NinePatch patch, @NotNull Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPath(path, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x5, float y5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoint(x5, y5, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, int offset, int count, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoints(pts, offset, count, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    @d
    public void drawPosText(@NotNull String text, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r5, int g6, int b10) {
        getDelegate().drawRGB(r5, g6, b10);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull RectF rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(rect, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@NotNull RectF rect, float rx, float ry, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRoundRect(rect, rx, ry, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull char[] text, int index, int count, float x5, float y5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, index, count, this.tmpRect);
        drawMaskedText(paint, x5, y5);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull String text, @NotNull Path path, float hOffset, float vOffset, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(@NotNull char[] text, int index, int count, int contextIndex, int contextCount, float x5, float y5, boolean isRtl, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, index + count, this.tmpRect);
        drawMaskedText(paint, x5, y5);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@NotNull Canvas.VertexMode mode, int vertexCount, @NotNull float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        getDelegate().enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return getDelegate().getClipBounds(bounds);
    }

    @NotNull
    public final Canvas getDelegate() {
        Canvas canvas = this.delegate;
        if (canvas != null) {
            return canvas;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegate");
        return null;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return getDelegate().getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return getDelegate().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return getDelegate().getHeight();
    }

    @Override // android.graphics.Canvas
    @d
    public void getMatrix(@NotNull Matrix ctm) {
        Intrinsics.checkNotNullParameter(ctm, "ctm");
        getDelegate().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return getDelegate().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return getDelegate().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return getDelegate().getSaveCount();
    }

    @NotNull
    public final Bitmap getSinglePixelBitmap() {
        return this.singlePixelBitmap;
    }

    @NotNull
    public final Rect getSinglePixelBitmapBounds() {
        return this.singlePixelBitmapBounds;
    }

    @NotNull
    public final Canvas getSinglePixelCanvas() {
        return this.singlePixelCanvas;
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return getDelegate().getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return getDelegate().isOpaque();
    }

    @Override // android.graphics.Canvas
    @d
    public boolean quickReject(@NotNull RectF rect, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        getDelegate().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        getDelegate().restoreToCount(saveCount);
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        getDelegate().rotate(degrees);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return getDelegate().save();
    }

    @Override // android.graphics.Canvas
    @d
    public int saveLayer(RectF bounds, Paint paint, int saveFlags) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(bounds, paint, saveFlags);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    @d
    public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) {
        return getDelegate().saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public void scale(float sx, float sy) {
        getDelegate().scale(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        getDelegate().setBitmap(bitmap);
    }

    public final void setDelegate(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.delegate = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        getDelegate().setDensity(density);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter filter) {
        getDelegate().setDrawFilter(filter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        getDelegate().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float sx, float sy) {
        getDelegate().skew(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void translate(float dx, float dy) {
        getDelegate().translate(dx, dy);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return getDelegate().clipPath(path);
    }

    @Override // android.graphics.Canvas
    @d
    public boolean clipRect(@NotNull Rect rect, @NotNull Region.Op op2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op2, "op");
        return getDelegate().clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    @d
    public void drawBitmap(@NotNull int[] colors, int offset, int stride, int x5, int y5, int width, int height, boolean hasAlpha, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color) {
        getDelegate().drawColor(color);
    }

    @Override // android.graphics.Canvas
    @d
    public void drawPosText(@NotNull char[] text, int index, int count, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull char[] text, int index, int count, @NotNull Path path, float hOffset, float vOffset, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().quickReject(rect);
    }

    public final int save(int saveFlags) {
        return save();
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha) {
        return getDelegate().saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        return getDelegate().clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, float left, float top, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(left, top, left + bitmap.getWidth(), top + bitmap.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, @NotNull PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String text, float x5, float y5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.tmpRect);
        drawMaskedText(paint, x5, y5);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(@NotNull CharSequence text, int start, int end, int contextStart, int contextEnd, float x5, float y5, boolean isRtl, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), start, end, this.tmpRect);
        drawMaskedText(paint, x5, y5);
    }

    @Override // android.graphics.Canvas
    @d
    public boolean quickReject(@NotNull Path path, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    @d
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        return getDelegate().saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        return getDelegate().clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(@NotNull RectF outer, @NotNull float[] outerRadii, @NotNull RectF inner, @NotNull float[] innerRadii, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(outerRadii, "outerRadii");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(innerRadii, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLines(pts, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawOval(left, top, right, bottom, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(@NotNull NinePatch patch, @NotNull RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull RectF dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoints(pts, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull Rect r5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(r5, "r");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(r5, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRoundRect(left, top, right, bottom, rx, ry, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return getDelegate().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(bounds, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        return getDelegate().saveLayerAlpha(left, top, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    @d
    public boolean clipRect(float left, float top, float right, float bottom, @NotNull Region.Op op2) {
        Intrinsics.checkNotNullParameter(op2, "op");
        return getDelegate().clipRect(left, top, right, bottom, op2);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String text, int start, int end, float x5, float y5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, start, end, this.tmpRect);
        drawMaskedText(paint, x5, y5);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(@NotNull MeasuredText text, int start, int end, int contextStart, int contextEnd, float x5, float y5, boolean isRtl, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), start, end, this.tmpRect);
        drawMaskedText(paint, x5, y5);
    }

    @Override // android.graphics.Canvas
    @d
    public boolean quickReject(float left, float top, float right, float bottom, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(left, top, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        return getDelegate().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float left, float top, float right, float bottom) {
        return getDelegate().quickReject(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        return getDelegate().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, Rect src, @NotNull RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, src));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull Rect dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(left, top, right, bottom, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull CharSequence text, int start, int end, float x5, float y5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.tmpRect);
        drawMaskedText(paint, x5, y5);
    }

    @Override // android.graphics.Canvas
    @d
    public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(left, top, right, bottom, paint, saveFlags);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(left, top, right, bottom, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, Rect src, @NotNull Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, src));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @NotNull Matrix matrix, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        int iSave = getDelegate().save();
        getDelegate().setMatrix(matrix);
        getDelegate().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.solidPaint);
        getDelegate().restoreToCount(iSave);
    }
}
