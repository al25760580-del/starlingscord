package app.rive.runtime.kotlin.controllers;

import a3.e;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Trace;
import app.rive.RiveLog;
import app.rive.runtime.kotlin.ChangedInput;
import app.rive.runtime.kotlin.Observable;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.AdvanceResult;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.Helpers;
import app.rive.runtime.kotlin.core.LayerState;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.PlayableInstance;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RiveEvent;
import app.rive.runtime.kotlin.core.SMIBoolean;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.SMINumber;
import app.rive.runtime.kotlin.core.SMITrigger;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 à\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006à\u0001á\u0001â\u0001BK\b\u0016\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f¢\u0006\u0002\u0010\u0010B[\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u0017H\u0016J\u0012\u0010\u008a\u0001\u001a\u00020\u000e2\u0007\u0010\u008b\u0001\u001a\u00020JH\u0017J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020&0(2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0012J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020&0(2\u000f\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010\u008f\u0001H\u0012J\b\u0010\u0006\u001a\u00020\u000eH\u0016J+\u0010\u0090\u0001\u001a\u00020\u000e2\b\u0010\u0091\u0001\u001a\u00030\u008d\u00012\b\u0010\u0092\u0001\u001a\u00030\u008d\u00012\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u001d\u0010\u0094\u0001\u001a\u00020\u000e2\b\u0010\u0092\u0001\u001a\u00030\u008d\u00012\b\u0010\u0093\u0001\u001a\u00030\u008d\u0001H\u0016J\u0019\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020h0(2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0012J\u0016\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008d\u00012\b\u0010\u0097\u0001\u001a\u00030\u008d\u0001H\u0016J \u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008d\u00012\b\u0010\u0097\u0001\u001a\u00030\u008d\u00012\b\u0010\u0093\u0001\u001a\u00030\u008d\u0001H\u0016J\u0010\u0010\u0098\u0001\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0002\u0010MJ\u0012\u0010\u0099\u0001\u001a\u00020\u000e2\u0007\u0010\u008b\u0001\u001a\u00020JH\u0013J\u0013\u0010\u009a\u0001\u001a\u00020\u000e2\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0012J\u0013\u0010\u009d\u0001\u001a\u00020\u000e2\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0012J\u0013\u0010 \u0001\u001a\u00020\u000e2\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0012J\u0013\u0010¡\u0001\u001a\u00020\u000e2\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0012J\u001c\u0010¢\u0001\u001a\u00020\u000e2\u0007\u0010£\u0001\u001a\u00020h2\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0012J\u0013\u0010¦\u0001\u001a\u00020\u000e2\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0012J\t\u0010§\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010§\u0001\u001a\u00020\u000e2\u0007\u0010¨\u0001\u001a\u00020&H\u0012J\u0012\u0010§\u0001\u001a\u00020\u000e2\u0007\u0010£\u0001\u001a\u00020hH\u0012J\u001e\u0010§\u0001\u001a\u00020\u000e2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\t\b\u0002\u0010©\u0001\u001a\u00020\u0007H\u0016J$\u0010§\u0001\u001a\u00020\u000e2\u000e\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010(2\t\b\u0002\u0010ª\u0001\u001a\u00020\u0007H\u0016J*\u0010«\u0001\u001a\u00020\u000e2\u0007\u0010¬\u0001\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u00ad\u0001\u001a\u00030®\u0001H\u0010¢\u0006\u0003\b¯\u0001J*\u0010«\u0001\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u00ad\u0001\u001a\u00030®\u00012\t\b\u0002\u0010°\u0001\u001a\u00020\u0007H\u0016J#\u0010«\u0001\u001a\u00020\u000e2\u0007\u0010±\u0001\u001a\u00020h2\t\b\u0002\u0010²\u0001\u001a\u00020\u0007H\u0010¢\u0006\u0003\b¯\u0001J?\u0010«\u0001\u001a\u00020\u000e2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u00ad\u0001\u001a\u00030®\u00012\t\b\u0002\u0010©\u0001\u001a\u00020\u00072\t\b\u0002\u0010°\u0001\u001a\u00020\u0007H\u0016JE\u0010«\u0001\u001a\u00020\u000e2\u000e\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u00ad\u0001\u001a\u00030®\u00012\t\b\u0002\u0010ª\u0001\u001a\u00020\u00072\t\b\u0002\u0010°\u0001\u001a\u00020\u0007H\u0016J?\u0010³\u0001\u001a\u00020\u000e2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u00ad\u0001\u001a\u00030®\u00012\t\b\u0002\u0010©\u0001\u001a\u00020\u00072\t\b\u0002\u0010°\u0001\u001a\u00020\u0007H\u0012J/\u0010´\u0001\u001a\u00020\u000e2\b\u0010µ\u0001\u001a\u00030¶\u00012\b\u0010·\u0001\u001a\u00030¸\u00012\u0007\u0010¹\u0001\u001a\u00020J2\u0007\u0010º\u0001\u001a\u00020JH\u0016J\t\u0010»\u0001\u001a\u00020\u000eH\u0013J8\u0010¼\u0001\u001a\u00020\u000e2\b\u0010\u0091\u0001\u001a\u00030\u008d\u00012\b\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u000b\b\u0002\u0010\u0019\u001a\u0005\u0018\u00010½\u00012\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0012J(\u0010¾\u0001\u001a\u00020\u000e2\u0014\u0010¿\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00130À\u0001\"\u00020\u0013H\u0010¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0012\u0010Ã\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u0002H\u0016J\n\u0010Ä\u0001\u001a\u00030¸\u0001H\u0016J\u0012\u0010Å\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u0017H\u0016J\u000f\u0010Æ\u0001\u001a\u00020\u000eH\u0010¢\u0006\u0003\bÇ\u0001J\u001b\u0010È\u0001\u001a\u00020\u00072\u0007\u0010±\u0001\u001a\u00020h2\u0007\u0010\u008b\u0001\u001a\u00020JH\u0012J\u0013\u0010É\u0001\u001a\u00020\u000e2\b\u0010¤\u0001\u001a\u00030Ê\u0001H\u0017J\f\u0010Ë\u0001\u001a\u0005\u0018\u00010Ê\u0001H\u0017J\u0017\u0010Ì\u0001\u001a\u00020\u000e2\f\b\u0002\u0010Í\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u0012\u0010Î\u0001\u001a\u00020\u000e2\u0007\u0010Ï\u0001\u001a\u00020\u000bH\u0012J3\u0010Ð\u0001\u001a\u00020\u000e2\b\u0010\u0091\u0001\u001a\u00030\u008d\u00012\b\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u0006\u0010\u0019\u001a\u00020\u00072\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J%\u0010Ñ\u0001\u001a\u00020\u000e2\b\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u0093\u0001\u001a\u00030\u008d\u0001H\u0016J3\u0010Ò\u0001\u001a\u00020\u000e2\b\u0010\u0091\u0001\u001a\u00030\u008d\u00012\b\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u0006\u0010\u0019\u001a\u00020J2\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J%\u0010Ó\u0001\u001a\u00020\u000e2\b\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u0006\u0010\u0019\u001a\u00020J2\b\u0010\u0093\u0001\u001a\u00030\u008d\u0001H\u0016J\u001f\u0010Ô\u0001\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\f\b\u0002\u0010Õ\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u001d\u0010Ö\u0001\u001a\u00020\u000e2\b\u0010\u0097\u0001\u001a\u00030\u008d\u00012\b\u0010×\u0001\u001a\u00030\u008d\u0001H\u0016J'\u0010Ö\u0001\u001a\u00020\u000e2\b\u0010\u0097\u0001\u001a\u00030\u008d\u00012\b\u0010×\u0001\u001a\u00030\u008d\u00012\b\u0010\u0093\u0001\u001a\u00030\u008d\u0001H\u0016J\u0011\u0010Ø\u0001\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020JH\u0016J\u0019\u0010Ù\u0001\u001a\u00020\u000e2\b\u0010Ú\u0001\u001a\u00030Û\u0001H\u0010¢\u0006\u0003\bÜ\u0001J\u0019\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020h0(2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0012J \u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020h0(2\u000f\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010\u008f\u0001H\u0012J\u0012\u0010Ý\u0001\u001a\u00020\u000e2\u0007\u0010¨\u0001\u001a\u00020&H\u0012J\u0012\u0010Ý\u0001\u001a\u00020\u000e2\u0007\u0010£\u0001\u001a\u00020hH\u0012J\t\u0010Þ\u0001\u001a\u00020\u000eH\u0016J\u001e\u0010Þ\u0001\u001a\u00020\u000e2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\t\b\u0002\u0010©\u0001\u001a\u00020\u0007H\u0016J$\u0010Þ\u0001\u001a\u00020\u000e2\u000e\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010(2\t\b\u0002\u0010ª\u0001\u001a\u00020\u0007H\u0016J\u0012\u0010ß\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u0002H\u0016R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0092\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016X\u0092\u000e¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001e@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R2\u0010$\u001a&\u0012\f\u0012\n '*\u0004\u0018\u00010&0& '*\u0012\u0012\f\u0012\n '*\u0004\u0018\u00010&0&\u0018\u00010(0%X\u0092\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0011X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R*\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u001707j\b\u0012\u0004\u0012\u00020\u0017`88VX\u0097\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b;\u0010<R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\t@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u00020A2\u0006\u0010\u0019\u001a\u00020A@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00101\"\u0004\bH\u00103R\u0014\u0010I\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u00101R*\u0010K\u001a\u0004\u0018\u00010J2\b\u0010\u0019\u001a\u0004\u0018\u00010J@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010P\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020J8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR$\u0010T\u001a\u00020J2\u0006\u0010\u0019\u001a\u00020J@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR*\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u000207j\b\u0012\u0004\u0012\u00020\u0002`88VX\u0097\u0004¢\u0006\f\u0012\u0004\bY\u0010:\u001a\u0004\bZ\u0010<R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020&0d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020h0d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010fR2\u0010j\u001a&\u0012\f\u0012\n '*\u0004\u0018\u00010&0& '*\u0012\u0012\f\u0012\n '*\u0004\u0018\u00010&0&\u0018\u00010d0\u0016X\u0092\u000e¢\u0006\u0002\n\u0000R$\u0010k\u001a\u0012\u0012\u0004\u0012\u00020&07j\b\u0012\u0004\u0012\u00020&`88VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010<R2\u0010m\u001a&\u0012\f\u0012\n '*\u0004\u0018\u00010h0h '*\u0012\u0012\f\u0012\n '*\u0004\u0018\u00010h0h\u0018\u00010d0\u0016X\u0092\u000e¢\u0006\u0002\n\u0000R$\u0010n\u001a\u0012\u0012\u0004\u0012\u00020h07j\b\u0012\u0004\u0012\u00020h`88VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010<R\u001a\u0010p\u001a\u00020qX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020wX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020}X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR3\u0010\u0080\u0001\u001a&\u0012\f\u0012\n '*\u0004\u0018\u00010h0h '*\u0012\u0012\f\u0012\n '*\u0004\u0018\u00010h0h\u0018\u00010(0%X\u0092\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020h0(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010+R\u001e\u0010\u0083\u0001\u001a\u00020-X\u0096\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0084\u0001\u0010/\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0013\u0010\u0087\u0001\u001a\u0004\u0018\u00010JX\u0092\u000e¢\u0006\u0004\n\u0002\u0010P¨\u0006ã\u0001"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "Lapp/rive/runtime/kotlin/Observable;", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;", "Lapp/rive/runtime/kotlin/core/RefCount;", "loop", "Lapp/rive/runtime/kotlin/core/Loop;", "autoplay", "", "file", "Lapp/rive/runtime/kotlin/core/File;", "activeArtboard", "Lapp/rive/runtime/kotlin/core/Artboard;", "onStart", "Lkotlin/Function0;", "", "Lapp/rive/runtime/kotlin/controllers/OnStartCallback;", "(Lapp/rive/runtime/kotlin/core/Loop;ZLapp/rive/runtime/kotlin/core/File;Lapp/rive/runtime/kotlin/core/Artboard;Lkotlin/jvm/functions/Function0;)V", "changedInputs", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lapp/rive/runtime/kotlin/ChangedInput;", "(Lapp/rive/runtime/kotlin/core/Loop;ZLapp/rive/runtime/kotlin/core/File;Lapp/rive/runtime/kotlin/core/Artboard;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "_eventListeners", "", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;", "_listeners", "value", "getActiveArtboard", "()Lapp/rive/runtime/kotlin/core/Artboard;", "setActiveArtboard", "(Lapp/rive/runtime/kotlin/core/Artboard;)V", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "animationList", "", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "kotlin.jvm.PlatformType", "", "animations", "getAnimations", "()Ljava/util/List;", "artboardBounds", "Landroid/graphics/RectF;", "getArtboardBounds", "()Landroid/graphics/RectF;", "getAutoplay", "()Z", "setAutoplay", "(Z)V", "getChangedInputs$kotlin_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "eventListeners", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getEventListeners$annotations", "()V", "getEventListeners", "()Ljava/util/HashSet;", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", "setFile", "(Lapp/rive/runtime/kotlin/core/File;)V", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "isActive", "setActive", "isAdvancing", "", "layoutScaleFactor", "getLayoutScaleFactor", "()Ljava/lang/Float;", "setLayoutScaleFactor", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "layoutScaleFactorActive", "getLayoutScaleFactorActive$kotlin_release", "()F", "layoutScaleFactorAutomatic", "getLayoutScaleFactorAutomatic", "setLayoutScaleFactorAutomatic$kotlin_release", "(F)V", "listeners", "getListeners$annotations", "getListeners", "getLoop", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "getOnStart", "()Lkotlin/jvm/functions/Function0;", "setOnStart", "(Lkotlin/jvm/functions/Function0;)V", "pausedAnimations", "", "getPausedAnimations", "()Ljava/util/Set;", "pausedStateMachines", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "getPausedStateMachines", "playingAnimationSet", "playingAnimations", "getPlayingAnimations", "playingStateMachineSet", "playingStateMachines", "getPlayingStateMachines", "refs", "Ljava/util/concurrent/atomic/AtomicInteger;", "getRefs", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setRefs", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "requireArtboardResize", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getRequireArtboardResize$kotlin_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setRequireArtboardResize$kotlin_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "startStopLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getStartStopLock$kotlin_release", "()Ljava/util/concurrent/locks/ReentrantLock;", "stateMachineList", "stateMachines", "getStateMachines", "targetBounds", "getTargetBounds", "setTargetBounds", "(Landroid/graphics/RectF;)V", "userSetVolume", "addEventListener", "listener", "advance", "elapsed", "animationName", "", "animationNames", "", "fireState", "stateMachineName", "inputName", "path", "fireStateAtPath", "getOrCreateStateMachines", "getTextRunValue", "textRunName", "getVolume", "notifyAdvance", "notifyEvent", "event", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "notifyLoop", "playableInstance", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "notifyPause", "notifyPlay", "notifyStateChanged", "stateMachine", "state", "Lapp/rive/runtime/kotlin/core/LayerState;", "notifyStop", "pause", "animation", "isStateMachine", "areStateMachines", "play", "animationInstance", "direction", "Lapp/rive/runtime/kotlin/core/Direction;", "play$kotlin_release", "settleInitialState", "stateMachineInstance", "settleStateMachineState", "playAnimation", "pointerEvent", "eventType", "Lapp/rive/runtime/kotlin/renderers/PointerEvents;", "pointerID", "", "x", "y", "processAllInputs", "queueInput", "", "queueInputs", "inputs", "", "queueInputs$kotlin_release", "([Lapp/rive/runtime/kotlin/ChangedInput;)V", "registerListener", "release", "removeEventListener", "reset", "reset$kotlin_release", "resolveStateMachineAdvance", "restoreControllerState", "Lapp/rive/runtime/kotlin/controllers/ControllerState;", "saveControllerState", "selectArtboard", StackTraceHelper.NAME_KEY, "setArtboard", "ab", "setBooleanState", "setBooleanStateAtPath", "setNumberState", "setNumberStateAtPath", "setRiveFile", "artboardName", "setTextRunValue", "textValue", "setVolume", "setupScene", "rendererAttributes", "Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "setupScene$kotlin_release", "stop", "stopAnimations", "unregisterListener", "Companion", "Listener", "RiveEventListener", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRiveFileController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveFileController.kt\napp/rive/runtime/kotlin/controllers/RiveFileController\n+ 2 RiveLog.kt\napp/rive/RiveLog\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Tracing.kt\napp/rive/core/TracingKt\n*L\n1#1,1136:1\n57#2:1137\n65#2:1138\n57#2:1139\n57#2:1140\n57#2:1141\n57#2:1142\n57#2:1194\n57#2:1195\n65#2:1196\n57#2:1197\n57#2:1198\n57#2:1199\n65#2:1200\n57#2:1201\n70#2:1202\n57#2:1205\n57#2:1206\n57#2:1207\n57#2:1208\n57#2:1282\n57#2:1283\n57#2:1284\n1#3:1143\n1#3:1187\n1863#4,2:1144\n1863#4,2:1146\n1863#4,2:1148\n1863#4,2:1150\n1863#4,2:1161\n1863#4,2:1168\n1863#4,2:1170\n1611#4,9:1177\n1863#4:1186\n1864#4:1188\n1620#4:1189\n1863#4,2:1190\n1863#4,2:1203\n1863#4,2:1209\n1863#4,2:1211\n1863#4,2:1213\n1863#4,2:1215\n1863#4,2:1217\n1863#4,2:1219\n1863#4,2:1221\n1863#4,2:1223\n1863#4,2:1225\n1863#4,2:1227\n1863#4,2:1229\n1863#4,2:1231\n1863#4,2:1233\n1863#4,2:1235\n1863#4,2:1237\n1863#4,2:1239\n1863#4,2:1241\n1863#4,2:1243\n1863#4,2:1245\n774#4:1247\n865#4,2:1248\n774#4:1250\n865#4,2:1251\n1863#4,2:1253\n1863#4,2:1255\n1863#4,2:1257\n1863#4,2:1259\n1863#4,2:1264\n1863#4,2:1268\n1863#4,2:1270\n1863#4,2:1272\n1863#4,2:1274\n1863#4,2:1276\n1863#4,2:1278\n1863#4,2:1280\n12#5,6:1152\n12#5,3:1158\n16#5,2:1163\n12#5,3:1165\n16#5,2:1172\n12#5,3:1174\n16#5,2:1192\n12#5,3:1261\n16#5,2:1266\n*S KotlinDebug\n*F\n+ 1 RiveFileController.kt\napp/rive/runtime/kotlin/controllers/RiveFileController\n*L\n89#1:1137\n164#1:1138\n171#1:1139\n178#1:1140\n189#1:1141\n192#1:1142\n424#1:1194\n427#1:1195\n432#1:1196\n438#1:1197\n441#1:1198\n460#1:1199\n463#1:1200\n478#1:1201\n483#1:1202\n505#1:1205\n508#1:1206\n511#1:1207\n515#1:1208\n1092#1:1282\n1110#1:1283\n1117#1:1284\n393#1:1187\n307#1:1144,2\n308#1:1146,2\n309#1:1148,2\n310#1:1150,2\n338#1:1161,2\n372#1:1168,2\n387#1:1170,2\n393#1:1177,9\n393#1:1186\n393#1:1188\n393#1:1189\n394#1:1190,2\n496#1:1203,2\n529#1:1209,2\n567#1:1211,2\n570#1:1213,2\n601#1:1215,2\n602#1:1217,2\n607#1:1219,2\n609#1:1221,2\n615#1:1223,2\n617#1:1225,2\n625#1:1227,2\n630#1:1229,2\n636#1:1231,2\n638#1:1233,2\n644#1:1235,2\n646#1:1237,2\n694#1:1239,2\n719#1:1241,2\n788#1:1243,2\n801#1:1245,2\n826#1:1247\n826#1:1248,2\n830#1:1250\n830#1:1251,2\n854#1:1253,2\n857#1:1255,2\n872#1:1257,2\n878#1:1259,2\n977#1:1264,2\n1059#1:1268,2\n1063#1:1270,2\n1067#1:1272,2\n1071#1:1274,2\n1076#1:1276,2\n1081#1:1278,2\n1085#1:1280,2\n330#1:1152,6\n337#1:1158,3\n337#1:1163,2\n371#1:1165,3\n371#1:1172,2\n392#1:1174,3\n392#1:1192,2\n967#1:1261,3\n967#1:1266,2\n*E\n"})
public class RiveFileController implements Observable<Listener>, RefCount {

    @NotNull
    public static final String TAG = "RiveL/RiveFileController";

    @NotNull
    private Set<RiveEventListener> _eventListeners;

    @NotNull
    private Set<Listener> _listeners;
    private Artboard activeArtboard;

    @NotNull
    private Alignment alignment;
    private List<LinearAnimationInstance> animationList;
    private boolean autoplay;

    @NotNull
    private final ConcurrentLinkedQueue<ChangedInput> changedInputs;
    private File file;

    @NotNull
    private Fit fit;
    private boolean isActive;
    private Float layoutScaleFactor;
    private float layoutScaleFactorAutomatic;

    @NotNull
    private Loop loop;
    private Function0<Unit> onStart;
    private Set<LinearAnimationInstance> playingAnimationSet;
    private Set<StateMachineInstance> playingStateMachineSet;

    @NotNull
    private AtomicInteger refs;

    @NotNull
    private AtomicBoolean requireArtboardResize;

    @NotNull
    private final ReentrantLock startStopLock;
    private List<StateMachineInstance> stateMachineList;

    @NotNull
    private RectF targetBounds;
    private Float userSetVolume;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u0010"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;", "", "notifyAdvance", "", "elapsed", "", "notifyLoop", "animation", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "notifyPause", "notifyPlay", "notifyStateChanged", "stateMachineName", "", "stateName", "notifyStop", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void notifyAdvance(@NotNull Listener listener, float f2) {
            }
        }

        void notifyAdvance(float elapsed);

        void notifyLoop(@NotNull PlayableInstance animation);

        void notifyPause(@NotNull PlayableInstance animation);

        void notifyPlay(@NotNull PlayableInstance animation);

        void notifyStateChanged(@NotNull String stateMachineName, @NotNull String stateName);

        void notifyStop(@NotNull PlayableInstance animation);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;", "", "notifyEvent", "", "event", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RiveEventListener {
        void notifyEvent(@NotNull RiveEvent event);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PointerEvents.values().length];
            try {
                iArr2[PointerEvents.POINTER_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PointerEvents.POINTER_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PointerEvents.POINTER_MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PointerEvents.POINTER_EXIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RiveFileController() {
        this(null, false, null, null, null, null, 63, null);
    }

    private List<LinearAnimationInstance> animations(String animationName) {
        return animations(c0.c(animationName));
    }

    public static /* synthetic */ void fireState$default(RiveFileController riveFileController, String str, String str2, String str3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fireState");
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        riveFileController.fireState(str, str2, str3);
    }

    public static /* synthetic */ void getEventListeners$annotations() {
    }

    public static /* synthetic */ void getListeners$annotations() {
    }

    private List<StateMachineInstance> getOrCreateStateMachines(String animationName) {
        Artboard activeArtboard;
        List<StateMachineInstance> listStateMachines = stateMachines(animationName);
        if (!listStateMachines.isEmpty() || (activeArtboard = getActiveArtboard()) == null) {
            return listStateMachines;
        }
        StateMachineInstance stateMachineInstanceStateMachine = activeArtboard.stateMachine(animationName);
        this.stateMachineList.add(stateMachineInstanceStateMachine);
        return c0.c(stateMachineInstanceStateMachine);
    }

    private void notifyAdvance(float elapsed) {
        Iterator it = CollectionsKt.i0(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyAdvance(elapsed);
        }
    }

    private void notifyEvent(RiveEvent event) {
        Iterator it = CollectionsKt.i0(getEventListeners()).iterator();
        while (it.hasNext()) {
            ((RiveEventListener) it.next()).notifyEvent(event);
        }
    }

    private void notifyLoop(PlayableInstance playableInstance) {
        Iterator it = CollectionsKt.i0(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyLoop(playableInstance);
        }
    }

    private void notifyPause(PlayableInstance playableInstance) {
        Iterator it = CollectionsKt.i0(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPause(playableInstance);
        }
    }

    private void notifyPlay(PlayableInstance playableInstance) {
        Iterator it = CollectionsKt.i0(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPlay(playableInstance);
        }
    }

    private void notifyStateChanged(StateMachineInstance stateMachine, LayerState state) {
        Iterator it = CollectionsKt.i0(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStateChanged(stateMachine.getName(), state.toString());
        }
    }

    private void notifyStop(PlayableInstance playableInstance) {
        Iterator it = CollectionsKt.i0(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStop(playableInstance);
        }
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, List list, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        riveFileController.pause((List<String>) list, z5);
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, List list, Loop loop, Direction direction, boolean z5, boolean z6, int i7, Object obj) {
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
        riveFileController.play((List<String>) list, loop2, direction2, z7, z6);
    }

    public static /* synthetic */ void play$kotlin_release$default(RiveFileController riveFileController, StateMachineInstance stateMachineInstance, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i7 & 2) != 0) {
            z5 = true;
        }
        riveFileController.play$kotlin_release(stateMachineInstance, z5);
    }

    private void playAnimation(String animationName, Loop loop, Direction direction, boolean isStateMachine, boolean settleInitialState) {
        Artboard activeArtboard;
        if (isStateMachine) {
            Iterator<T> it = getOrCreateStateMachines(animationName).iterator();
            while (it.hasNext()) {
                play$kotlin_release((StateMachineInstance) it.next(), settleInitialState);
            }
            return;
        }
        List<LinearAnimationInstance> listAnimations = animations(animationName);
        Iterator<T> it2 = listAnimations.iterator();
        while (it2.hasNext()) {
            play$kotlin_release((LinearAnimationInstance) it2.next(), loop, direction);
        }
        if (!listAnimations.isEmpty() || (activeArtboard = getActiveArtboard()) == null) {
            return;
        }
        play$kotlin_release(activeArtboard.animation(animationName), loop, direction);
    }

    public static /* synthetic */ void playAnimation$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z5, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playAnimation");
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
        riveFileController.playAnimation(str, loop2, direction2, z7, z6);
    }

    private void processAllInputs() {
        ChangedInput changedInputPoll;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (!getChangedInputs$kotlin_release().isEmpty() && (changedInputPoll = getChangedInputs$kotlin_release().poll()) != null) {
            if (changedInputPoll.getNestedArtboardPath() == null) {
                for (StateMachineInstance stateMachineInstance : getOrCreateStateMachines(changedInputPoll.getStateMachineName())) {
                    linkedHashSet.add(stateMachineInstance);
                    SMIInput sMIInputInput = stateMachineInstance.input(changedInputPoll.getName());
                    if (sMIInputInput instanceof SMITrigger) {
                        ((SMITrigger) sMIInputInput).fire$kotlin_release();
                    } else if (sMIInputInput instanceof SMIBoolean) {
                        Object value = changedInputPoll.getValue();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Boolean");
                        ((SMIBoolean) sMIInputInput).setValue$kotlin_release(((Boolean) value).booleanValue());
                    } else if (sMIInputInput instanceof SMINumber) {
                        Object value2 = changedInputPoll.getValue();
                        Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Float");
                        ((SMINumber) sMIInputInput).setValue$kotlin_release(((Float) value2).floatValue());
                    }
                }
            } else {
                Artboard activeArtboard = getActiveArtboard();
                SMIInput sMIInputInput2 = activeArtboard != null ? activeArtboard.input(changedInputPoll.getName(), changedInputPoll.getNestedArtboardPath()) : null;
                if (sMIInputInput2 instanceof SMITrigger) {
                    ((SMITrigger) sMIInputInput2).fire$kotlin_release();
                } else if (sMIInputInput2 instanceof SMIBoolean) {
                    Object value3 = changedInputPoll.getValue();
                    Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                    ((SMIBoolean) sMIInputInput2).setValue$kotlin_release(((Boolean) value3).booleanValue());
                } else if (sMIInputInput2 instanceof SMINumber) {
                    Object value4 = changedInputPoll.getValue();
                    Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Float");
                    ((SMINumber) sMIInputInput2).setValue$kotlin_release(((Float) value4).floatValue());
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    private void queueInput(String stateMachineName, String inputName, Object value, String path) {
        queueInputs$kotlin_release(new ChangedInput(stateMachineName, inputName, value, path));
    }

    public static /* synthetic */ void queueInput$default(RiveFileController riveFileController, String str, String str2, Object obj, String str3, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queueInput");
        }
        if ((i7 & 4) != 0) {
            obj = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        riveFileController.queueInput(str, str2, obj, str3);
    }

    private boolean resolveStateMachineAdvance(StateMachineInstance stateMachineInstance, float elapsed) {
        if (!getEventListeners().isEmpty()) {
            Iterator<T> it = stateMachineInstance.getEventsReported().iterator();
            while (it.hasNext()) {
                notifyEvent((RiveEvent) it.next());
            }
        }
        boolean zAdvance = stateMachineInstance.advance(elapsed);
        if (!getListeners().isEmpty()) {
            Iterator<T> it2 = stateMachineInstance.getStatesChanged().iterator();
            while (it2.hasNext()) {
                notifyStateChanged(stateMachineInstance, (LayerState) it2.next());
            }
        }
        return zAdvance;
    }

    public static /* synthetic */ void selectArtboard$default(RiveFileController riveFileController, String str, int i7, Object obj) throws ArtboardException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectArtboard");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        riveFileController.selectArtboard(str);
    }

    private void setArtboard(Artboard ab2) {
        if (Intrinsics.areEqual(ab2, getActiveArtboard())) {
            return;
        }
        stopAnimations();
        setActiveArtboard(ab2);
        autoplay();
    }

    public static /* synthetic */ void setBooleanState$default(RiveFileController riveFileController, String str, String str2, boolean z5, String str3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanState");
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        riveFileController.setBooleanState(str, str2, z5, str3);
    }

    public static /* synthetic */ void setNumberState$default(RiveFileController riveFileController, String str, String str2, float f2, String str3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNumberState");
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        riveFileController.setNumberState(str, str2, f2, str3);
    }

    public static /* synthetic */ void setRiveFile$default(RiveFileController riveFileController, File file, String str, int i7, Object obj) throws ArtboardException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveFile");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        riveFileController.setRiveFile(file, str);
    }

    private List<StateMachineInstance> stateMachines(String animationName) {
        return stateMachines(c0.c(animationName));
    }

    private void stop(LinearAnimationInstance animation) {
        this.playingAnimationSet.remove(animation);
        if (this.animationList.remove(animation)) {
            notifyStop(animation);
        }
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, List list, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopAnimations");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        riveFileController.stopAnimations((List<String>) list, z5);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int acquire() {
        return RefCount.DefaultImpls.acquire(this);
    }

    public void addEventListener(@NotNull RiveEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (getStartStopLock()) {
            this._eventListeners.add(listener);
        }
    }

    public void advance(float elapsed) {
        ReentrantLock lock;
        File file = getFile();
        if (file == null || (lock = file.getLock()) == null) {
            return;
        }
        synchronized (lock) {
            try {
                Artboard activeArtboard = getActiveArtboard();
                if (activeArtboard != null) {
                    Trace.beginSection("Rive/Frame/Advance/ProcessInputs");
                    try {
                        processAllInputs();
                        Unit unit = Unit.f14616a;
                        Trace.endSection();
                        Trace.beginSection("Rive/Frame/Advance/Animations");
                        try {
                            boolean zIsEmpty = false;
                            for (LinearAnimationInstance linearAnimationInstance : getAnimations()) {
                                if (getPlayingAnimations().contains(linearAnimationInstance)) {
                                    AdvanceResult advanceResultAdvanceAndGetResult = linearAnimationInstance.advanceAndGetResult(elapsed);
                                    linearAnimationInstance.apply();
                                    int i7 = WhenMappings.$EnumSwitchMapping$0[advanceResultAdvanceAndGetResult.ordinal()];
                                    if (i7 == 1) {
                                        stop(linearAnimationInstance);
                                    } else if (i7 == 2 || i7 == 3) {
                                        notifyLoop(linearAnimationInstance);
                                    } else if (i7 == 4) {
                                        zIsEmpty = getPlayingStateMachines().isEmpty();
                                    }
                                }
                            }
                            if (zIsEmpty) {
                                activeArtboard.advance(elapsed);
                            }
                            Unit unit2 = Unit.f14616a;
                            Trace.endSection();
                            ArrayList arrayList = new ArrayList();
                            Trace.beginSection("Rive/Frame/Advance/StateMachines");
                            try {
                                for (StateMachineInstance stateMachineInstance : getStateMachines()) {
                                    if (getPlayingStateMachines().contains(stateMachineInstance) && !resolveStateMachineAdvance(stateMachineInstance, elapsed)) {
                                        arrayList.add(stateMachineInstance);
                                    }
                                }
                                if (elapsed > 0.0d) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        pause((StateMachineInstance) it.next());
                                    }
                                }
                                Unit unit3 = Unit.f14616a;
                                Trace.endSection();
                                Trace.beginSection("Rive/Frame/Advance/PollViewModelChanges");
                                try {
                                    HashSet<StateMachineInstance> playingStateMachines = getPlayingStateMachines();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it2 = playingStateMachines.iterator();
                                    while (it2.hasNext()) {
                                        ViewModelInstance viewModelInstance = ((StateMachineInstance) it2.next()).getViewModelInstance();
                                        if (viewModelInstance != null) {
                                            arrayList2.add(viewModelInstance);
                                        }
                                    }
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        ((ViewModelInstance) it3.next()).pollChanges$kotlin_release();
                                    }
                                    Unit unit4 = Unit.f14616a;
                                    Trace.endSection();
                                    notifyAdvance(elapsed);
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public void autoplay() {
        if (getAutoplay()) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController.autoplay.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "autoplay() with autoplay enabled. Playing all state machines and animations.";
                }
            });
            play$default(this, null, null, true, 3, null);
            return;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController.autoplay.2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "autoplay() with autoplay disabled. Advancing the artboard by 0.";
            }
        });
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            activeArtboard.advance(0.0f);
        }
        synchronized (getStartStopLock()) {
            Function0<Unit> onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
                Unit unit = Unit.f14616a;
            }
        }
    }

    public void fireState(@NotNull String stateMachineName, @NotNull String inputName, String path) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        queueInput$default(this, stateMachineName, inputName, null, path, 4, null);
    }

    public void fireStateAtPath(@NotNull String inputName, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        queueInput$default(this, "", inputName, null, path, 4, null);
    }

    public Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public List<LinearAnimationInstance> getAnimations() {
        List<LinearAnimationInstance> listI0;
        List<LinearAnimationInstance> animationList = this.animationList;
        Intrinsics.checkNotNullExpressionValue(animationList, "animationList");
        synchronized (animationList) {
            List<LinearAnimationInstance> animationList2 = this.animationList;
            Intrinsics.checkNotNullExpressionValue(animationList2, "animationList");
            listI0 = CollectionsKt.i0(animationList2);
        }
        return listI0;
    }

    @NotNull
    public RectF getArtboardBounds() {
        RectF bounds;
        Artboard activeArtboard = getActiveArtboard();
        return (activeArtboard == null || (bounds = activeArtboard.getBounds()) == null) ? new RectF() : bounds;
    }

    public boolean getAutoplay() {
        return this.autoplay;
    }

    @NotNull
    public ConcurrentLinkedQueue<ChangedInput> getChangedInputs$kotlin_release() {
        return this.changedInputs;
    }

    @NotNull
    public HashSet<RiveEventListener> getEventListeners() {
        HashSet<RiveEventListener> hashSetG0;
        synchronized (this._eventListeners) {
            hashSetG0 = CollectionsKt.g0(this._eventListeners);
        }
        return hashSetG0;
    }

    public File getFile() {
        return this.file;
    }

    @NotNull
    public Fit getFit() {
        return this.fit;
    }

    public Float getLayoutScaleFactor() {
        return this.layoutScaleFactor;
    }

    public float getLayoutScaleFactorActive$kotlin_release() {
        Float layoutScaleFactor = getLayoutScaleFactor();
        return layoutScaleFactor != null ? layoutScaleFactor.floatValue() : getLayoutScaleFactorAutomatic();
    }

    public float getLayoutScaleFactorAutomatic() {
        return this.layoutScaleFactorAutomatic;
    }

    @NotNull
    public HashSet<Listener> getListeners() {
        HashSet<Listener> hashSetG0;
        synchronized (this._listeners) {
            hashSetG0 = CollectionsKt.g0(this._listeners);
        }
        return hashSetG0;
    }

    @NotNull
    public Loop getLoop() {
        return this.loop;
    }

    public Function0<Unit> getOnStart() {
        return this.onStart;
    }

    @NotNull
    public Set<LinearAnimationInstance> getPausedAnimations() {
        List<LinearAnimationInstance> animations = getAnimations();
        Collection<?> elements = getPlayingAnimations();
        Intrinsics.checkNotNullParameter(animations, "<this>");
        Intrinsics.checkNotNullParameter(elements, "other");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(animations);
        Intrinsics.checkNotNullParameter(linkedHashSetK0, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        if (elements == null) {
            elements = CollectionsKt.i0(elements);
        }
        linkedHashSetK0.removeAll(elements);
        return linkedHashSetK0;
    }

    @NotNull
    public Set<StateMachineInstance> getPausedStateMachines() {
        List<StateMachineInstance> stateMachines = getStateMachines();
        Collection<?> elements = getPlayingStateMachines();
        Intrinsics.checkNotNullParameter(stateMachines, "<this>");
        Intrinsics.checkNotNullParameter(elements, "other");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(stateMachines);
        Intrinsics.checkNotNullParameter(linkedHashSetK0, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        if (elements == null) {
            elements = CollectionsKt.i0(elements);
        }
        linkedHashSetK0.removeAll(elements);
        return linkedHashSetK0;
    }

    @NotNull
    public HashSet<LinearAnimationInstance> getPlayingAnimations() {
        HashSet<LinearAnimationInstance> hashSetG0;
        Set<LinearAnimationInstance> playingAnimationSet = this.playingAnimationSet;
        Intrinsics.checkNotNullExpressionValue(playingAnimationSet, "playingAnimationSet");
        synchronized (playingAnimationSet) {
            Set<LinearAnimationInstance> playingAnimationSet2 = this.playingAnimationSet;
            Intrinsics.checkNotNullExpressionValue(playingAnimationSet2, "playingAnimationSet");
            hashSetG0 = CollectionsKt.g0(playingAnimationSet2);
        }
        return hashSetG0;
    }

    @NotNull
    public HashSet<StateMachineInstance> getPlayingStateMachines() {
        HashSet<StateMachineInstance> hashSetG0;
        Set<StateMachineInstance> playingStateMachineSet = this.playingStateMachineSet;
        Intrinsics.checkNotNullExpressionValue(playingStateMachineSet, "playingStateMachineSet");
        synchronized (playingStateMachineSet) {
            Set<StateMachineInstance> playingStateMachineSet2 = this.playingStateMachineSet;
            Intrinsics.checkNotNullExpressionValue(playingStateMachineSet2, "playingStateMachineSet");
            hashSetG0 = CollectionsKt.g0(playingStateMachineSet2);
        }
        return hashSetG0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    @NotNull
    public AtomicInteger getRefs() {
        return this.refs;
    }

    @NotNull
    /* JADX INFO: renamed from: getRequireArtboardResize$kotlin_release, reason: from getter */
    public AtomicBoolean getRequireArtboardResize() {
        return this.requireArtboardResize;
    }

    @NotNull
    /* JADX INFO: renamed from: getStartStopLock$kotlin_release, reason: from getter */
    public ReentrantLock getStartStopLock() {
        return this.startStopLock;
    }

    @NotNull
    public List<StateMachineInstance> getStateMachines() {
        List<StateMachineInstance> listI0;
        List<StateMachineInstance> stateMachineList = this.stateMachineList;
        Intrinsics.checkNotNullExpressionValue(stateMachineList, "stateMachineList");
        synchronized (stateMachineList) {
            List<StateMachineInstance> stateMachineList2 = this.stateMachineList;
            Intrinsics.checkNotNullExpressionValue(stateMachineList2, "stateMachineList");
            listI0 = CollectionsKt.i0(stateMachineList2);
        }
        return listI0;
    }

    @NotNull
    public RectF getTargetBounds() {
        return this.targetBounds;
    }

    public String getTextRunValue(@NotNull String textRunName) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getTextRunValue(textRunName);
        }
        return null;
    }

    public Float getVolume() {
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            return Float.valueOf(activeArtboard.getVolume());
        }
        return null;
    }

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    public boolean isAdvancing() {
        Set<LinearAnimationInstance> playingAnimationSet = this.playingAnimationSet;
        Intrinsics.checkNotNullExpressionValue(playingAnimationSet, "playingAnimationSet");
        if (!playingAnimationSet.isEmpty()) {
            return true;
        }
        Set<StateMachineInstance> playingStateMachineSet = this.playingStateMachineSet;
        Intrinsics.checkNotNullExpressionValue(playingStateMachineSet, "playingStateMachineSet");
        return (playingStateMachineSet.isEmpty() && getChangedInputs$kotlin_release().isEmpty()) ? false : true;
    }

    public void pause() {
        Iterator<T> it = getPlayingAnimations().iterator();
        while (it.hasNext()) {
            pause((LinearAnimationInstance) it.next());
        }
        Iterator<T> it2 = getPlayingStateMachines().iterator();
        while (it2.hasNext()) {
            pause((StateMachineInstance) it2.next());
        }
    }

    public void play(@NotNull String animationName, @NotNull Loop loop, @NotNull Direction direction, boolean isStateMachine, boolean settleInitialState) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        playAnimation(animationName, loop, direction, isStateMachine, settleInitialState);
    }

    public void play$kotlin_release(@NotNull StateMachineInstance stateMachineInstance, boolean settleStateMachineState) {
        Intrinsics.checkNotNullParameter(stateMachineInstance, "stateMachineInstance");
        if (!this.stateMachineList.contains(stateMachineInstance)) {
            this.stateMachineList.add(stateMachineInstance);
        }
        if (settleStateMachineState) {
            resolveStateMachineAdvance(stateMachineInstance, 0.0f);
        }
        synchronized (getStartStopLock()) {
            this.playingStateMachineSet.add(stateMachineInstance);
            Function0<Unit> onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
                Unit unit = Unit.f14616a;
            }
        }
        notifyPlay(stateMachineInstance);
    }

    public void pointerEvent(@NotNull PointerEvents eventType, int pointerID, float x5, float y5) {
        RectF rectF;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Trace.beginSection("Rive/PointerInput");
        try {
            Helpers helpers = Helpers.INSTANCE;
            RectF targetBounds = getTargetBounds();
            PointF pointF = new PointF(x5, y5);
            Fit fit = getFit();
            Alignment alignment = getAlignment();
            Artboard activeArtboard = getActiveArtboard();
            if (activeArtboard == null || (rectF = activeArtboard.getBounds()) == null) {
                rectF = new RectF();
            }
            PointF pointFConvertToArtboardSpace = helpers.convertToArtboardSpace(targetBounds, pointF, fit, alignment, rectF, getLayoutScaleFactorActive$kotlin_release());
            for (StateMachineInstance stateMachineInstance : getStateMachines()) {
                int i7 = WhenMappings.$EnumSwitchMapping$1[eventType.ordinal()];
                if (i7 == 1) {
                    stateMachineInstance.pointerDown(pointerID, pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
                } else if (i7 == 2) {
                    stateMachineInstance.pointerUp(pointerID, pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
                } else if (i7 == 3) {
                    stateMachineInstance.pointerMove(pointerID, pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
                } else if (i7 == 4) {
                    stateMachineInstance.pointerExit(pointerID, pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
                }
                play$kotlin_release(stateMachineInstance, false);
            }
            Unit unit = Unit.f14616a;
        } finally {
            Trace.endSection();
        }
    }

    public void queueInputs$kotlin_release(@NotNull ChangedInput... inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        synchronized (getStartStopLock()) {
            i0.q(getChangedInputs$kotlin_release(), inputs);
            Function0<Unit> onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
                Unit unit = Unit.f14616a;
            }
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int release() {
        final int i7 = getRefs().get();
        Function0<String> function0 = new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController.release.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                int i10 = i7;
                return e.g(i10, i10 - 1, "Releasing. Old: ", "; New: ");
            }
        };
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, function0);
        int iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRelease != 0) {
            return iRelease;
        }
        if (getIsActive()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        riveLog.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController.release.2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Final count is 0. Setting file to null.";
            }
        });
        setFile(null);
        return iRelease;
    }

    public void removeEventListener(@NotNull RiveEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (getStartStopLock()) {
            this._eventListeners.remove(listener);
        }
    }

    public void reset$kotlin_release() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$reset$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Resetting.";
            }
        });
        this.playingAnimationSet.clear();
        this.animationList.clear();
        this.playingStateMachineSet.clear();
        this.stateMachineList.clear();
        getChangedInputs$kotlin_release().clear();
        setActiveArtboard(null);
    }

    @ControllerStateManagement
    public void restoreControllerState(@NotNull ControllerState state) {
        Object lock;
        Intrinsics.checkNotNullParameter(state, "state");
        File file = getFile();
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                reset$kotlin_release();
                setFile(state.getFile());
                setActiveArtboard(state.getActiveArtboard());
                Iterator<T> it = state.getAnimations().iterator();
                while (it.hasNext()) {
                    this.animationList.add((LinearAnimationInstance) it.next());
                }
                Iterator<T> it2 = state.getStateMachines().iterator();
                while (it2.hasNext()) {
                    this.stateMachineList.add((StateMachineInstance) it2.next());
                }
                for (LinearAnimationInstance linearAnimationInstance : state.getPlayingAnimations()) {
                    play$kotlin_release(linearAnimationInstance, linearAnimationInstance.getLoop(), linearAnimationInstance.getDirection());
                }
                Iterator<T> it3 = state.getPlayingStateMachines().iterator();
                while (it3.hasNext()) {
                    play$kotlin_release$default(this, (StateMachineInstance) it3.next(), false, 2, null);
                }
                setActive(state.getIsActive());
                state.dispose();
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ControllerStateManagement
    public ControllerState saveControllerState() {
        Artboard activeArtboard;
        File file = getFile();
        if (file == null || (activeArtboard = getActiveArtboard()) == null) {
            return null;
        }
        synchronized (file.getLock()) {
            if (!file.getHasCppObject()) {
                return null;
            }
            file.acquire();
            activeArtboard.acquire();
            List<LinearAnimationInstance> animationList = this.animationList;
            Intrinsics.checkNotNullExpressionValue(animationList, "animationList");
            List listI0 = CollectionsKt.i0(animationList);
            HashSet hashSetG0 = CollectionsKt.g0(getPlayingAnimations());
            List<StateMachineInstance> stateMachineList = this.stateMachineList;
            Intrinsics.checkNotNullExpressionValue(stateMachineList, "stateMachineList");
            return new ControllerState(file, activeArtboard, listI0, hashSetG0, CollectionsKt.i0(stateMachineList), CollectionsKt.g0(getPlayingStateMachines()), getIsActive());
        }
    }

    public void selectArtboard(final String name) throws ArtboardException {
        Unit unit;
        Artboard firstArtboard;
        File file = getFile();
        if (file != null) {
            if (name != null) {
                RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$selectArtboard$1$artboard$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return e.l("Selecting artboard: ", name);
                    }
                });
                firstArtboard = file.artboard(name);
            } else {
                RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$selectArtboard$1$artboard$2
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Selecting null artboard - choosing first.";
                    }
                });
                firstArtboard = file.getFirstArtboard();
            }
            setArtboard(firstArtboard);
            unit = Unit.f14616a;
        } else {
            unit = null;
        }
        if (unit == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$selectArtboard$2$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "selectArtboard: cannot select an Artboard without a valid File.";
                }
            });
        }
    }

    public void setActive(boolean z5) {
        this.isActive = z5;
    }

    public void setActiveArtboard(Artboard artboard) {
        Object lock;
        if (Intrinsics.areEqual(artboard, this.activeArtboard)) {
            return;
        }
        File file = getFile();
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                Function0<String> function0 = new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$activeArtboard$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Artboard set; releasing old artboard (if it exists): " + this.this$0.activeArtboard;
                    }
                };
                RiveLog riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().d(TAG, function0);
                Artboard artboard2 = this.activeArtboard;
                if (artboard2 != null) {
                    artboard2.release();
                }
                this.activeArtboard = artboard;
                riveLog.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$activeArtboard$1$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Artboard set; acquiring new artboard (if it exists): " + this.this$0.activeArtboard;
                    }
                });
                Artboard artboard3 = this.activeArtboard;
                if (artboard3 != null) {
                    artboard3.acquire();
                }
                Float f2 = this.userSetVolume;
                if (f2 != null) {
                    float fFloatValue = f2.floatValue();
                    Artboard activeArtboard = getActiveArtboard();
                    if (activeArtboard != null) {
                        activeArtboard.setVolume$kotlin_release(fFloatValue);
                    }
                    Unit unit = Unit.f14616a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setAlignment(@NotNull Alignment value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.alignment = value;
        synchronized (getStartStopLock()) {
            Function0<Unit> onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
                Unit unit = Unit.f14616a;
            }
        }
    }

    public void setAutoplay(boolean z5) {
        this.autoplay = z5;
    }

    public void setBooleanState(@NotNull String stateMachineName, @NotNull String inputName, boolean value, String path) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        queueInput(stateMachineName, inputName, Boolean.valueOf(value), path);
    }

    public void setBooleanStateAtPath(@NotNull String inputName, boolean value, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        queueInput("", inputName, Boolean.valueOf(value), path);
    }

    public void setFile(final File file) {
        Object lock;
        if (Intrinsics.areEqual(file, this.file)) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$file$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Assigning the same file; ignoring.";
                }
            });
            return;
        }
        File file2 = this.file;
        if (file2 == null || (lock = file2.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                final File file3 = this.file;
                if (file3 != null) {
                    RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$file$2$1$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "File set; releasing old file: " + file3;
                        }
                    });
                    reset$kotlin_release();
                    file3.release();
                }
                this.file = file;
                RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$file$2$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "File set; acquiring new file (if it exists): " + file;
                    }
                });
                File file4 = this.file;
                if (file4 != null) {
                    file4.acquire();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setFit(@NotNull Fit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.fit = value;
        getRequireArtboardResize().set(true);
        synchronized (getStartStopLock()) {
            Function0<Unit> onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
                Unit unit = Unit.f14616a;
            }
        }
    }

    public void setLayoutScaleFactor(Float f2) {
        this.layoutScaleFactor = f2;
        getRequireArtboardResize().set(true);
        synchronized (getStartStopLock()) {
            Function0<Unit> onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
                Unit unit = Unit.f14616a;
            }
        }
    }

    public void setLayoutScaleFactorAutomatic$kotlin_release(float f2) {
        this.layoutScaleFactorAutomatic = f2;
        getRequireArtboardResize().set(true);
        synchronized (getStartStopLock()) {
            Function0<Unit> onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
                Unit unit = Unit.f14616a;
            }
        }
    }

    public void setLoop(@NotNull Loop loop) {
        Intrinsics.checkNotNullParameter(loop, "<set-?>");
        this.loop = loop;
    }

    public void setNumberState(@NotNull String stateMachineName, @NotNull String inputName, float value, String path) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        queueInput(stateMachineName, inputName, Float.valueOf(value), path);
    }

    public void setNumberStateAtPath(@NotNull String inputName, float value, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        queueInput("", inputName, Float.valueOf(value), path);
    }

    public void setOnStart(Function0<Unit> function0) {
        this.onStart = function0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public void setRefs(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<set-?>");
        this.refs = atomicInteger;
    }

    public void setRequireArtboardResize$kotlin_release(@NotNull AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.requireArtboardResize = atomicBoolean;
    }

    public void setRiveFile(@NotNull File file, String artboardName) throws ArtboardException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file, getFile())) {
            return;
        }
        setFile(file);
        selectArtboard(artboardName);
    }

    public void setTargetBounds(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.targetBounds = rectF;
    }

    public void setTextRunValue(@NotNull String textRunName, @NotNull String textValue) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            activeArtboard.setTextRunValue(textRunName, textValue);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public void setVolume(float value) {
        this.userSetVolume = Float.valueOf(value);
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard == null) {
            return;
        }
        activeArtboard.setVolume$kotlin_release(value);
    }

    public void setupScene$kotlin_release(@NotNull RiveAnimationView.RendererAttributes rendererAttributes) {
        ViewModelInstance viewModelInstanceCreateDefaultInstance;
        Intrinsics.checkNotNullParameter(rendererAttributes, "rendererAttributes");
        RiveFileController$setupScene$1 riveFileController$setupScene$1 = new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$setupScene$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "setupScene";
            }
        };
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, riveFileController$setupScene$1);
        File file = getFile();
        if (file == null) {
            riveLog.getLogger().w(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$setupScene$2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Cannot setupScene without a file.";
                }
            });
            return;
        }
        reset$kotlin_release();
        setAutoplay(rendererAttributes.getAutoplay());
        setAlignment(rendererAttributes.getAlignment());
        setFit(rendererAttributes.getFit());
        setLoop(rendererAttributes.getLoop());
        String artboardName = rendererAttributes.getArtboardName();
        setActiveArtboard(artboardName != null ? file.artboard(artboardName) : file.getFirstArtboard());
        if (rendererAttributes.getAutoBind() && getActiveArtboard() != null) {
            riveLog.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$setupScene$3
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Auto-binding to the artboard and all state machines.";
                }
            });
            final Artboard activeArtboard = getActiveArtboard();
            Intrinsics.checkNotNull(activeArtboard);
            try {
                viewModelInstanceCreateDefaultInstance = file.defaultViewModelForArtboard(activeArtboard).createDefaultInstance();
            } catch (ViewModelException e10) {
                RiveLog.INSTANCE.getLogger().e(TAG, e10, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$setupScene$defaultInstance$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return e.m("Could not auto-bind artboard ", activeArtboard.getName(), ": ", e10.getMessage());
                    }
                });
                viewModelInstanceCreateDefaultInstance = null;
            }
            if (viewModelInstanceCreateDefaultInstance != null) {
                activeArtboard.setViewModelInstance(viewModelInstanceCreateDefaultInstance);
                String stateMachineName = rendererAttributes.getStateMachineName();
                if (stateMachineName == null) {
                    stateMachineName = (String) CollectionsKt.firstOrNull(activeArtboard.getStateMachineNames());
                }
                if (stateMachineName != null) {
                    getOrCreateStateMachines(stateMachineName);
                }
                Iterator<T> it = getStateMachines().iterator();
                while (it.hasNext()) {
                    ((StateMachineInstance) it.next()).setViewModelInstance(viewModelInstanceCreateDefaultInstance);
                }
            }
        }
        if (!getAutoplay()) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$setupScene$9
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Autoplay disabled. Advancing the artboard by 0.";
                }
            });
            Artboard activeArtboard2 = getActiveArtboard();
            if (activeArtboard2 != null) {
                activeArtboard2.advance(0.0f);
            }
            synchronized (getStartStopLock()) {
                Function0<Unit> onStart = getOnStart();
                if (onStart != null) {
                    onStart.invoke();
                    Unit unit = Unit.f14616a;
                }
            }
            return;
        }
        final String animationName = rendererAttributes.getAnimationName();
        final String stateMachineName2 = rendererAttributes.getStateMachineName();
        if (animationName != null) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$setupScene$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return g.e("Autoplay enabled. Playing animation: ", animationName, ".");
                }
            });
            play$default(this, animationName, (Loop) null, (Direction) null, false, false, 30, (Object) null);
        } else if (stateMachineName2 != null) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$setupScene$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return g.e("Autoplay enabled. Playing state machine: ", stateMachineName2, ".");
                }
            });
            play$default(this, stateMachineName2, (Loop) null, (Direction) null, true, true, 6, (Object) null);
        } else {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$setupScene$8
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Autoplay enabled. Playing all state machines and animations.";
                }
            });
            play$default(this, null, null, true, 3, null);
        }
    }

    public void stopAnimations() {
        List<LinearAnimationInstance> animationList = this.animationList;
        Intrinsics.checkNotNullExpressionValue(animationList, "animationList");
        if (!animationList.isEmpty()) {
            Iterator<T> it = getAnimations().iterator();
            while (it.hasNext()) {
                stop((LinearAnimationInstance) it.next());
            }
        }
        List<StateMachineInstance> stateMachineList = this.stateMachineList;
        Intrinsics.checkNotNullExpressionValue(stateMachineList, "stateMachineList");
        if (stateMachineList.isEmpty()) {
            return;
        }
        Iterator<T> it2 = getStateMachines().iterator();
        while (it2.hasNext()) {
            stop((StateMachineInstance) it2.next());
        }
    }

    public RiveFileController(@NotNull Loop loop, boolean z5, File file, Artboard artboard, Function0<Unit> function0, @NotNull ConcurrentLinkedQueue<ChangedInput> changedInputs) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(changedInputs, "changedInputs");
        this.loop = loop;
        this.autoplay = z5;
        this.onStart = function0;
        this.changedInputs = changedInputs;
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Initializing.";
            }
        });
        this.refs = new AtomicInteger(1);
        this.requireArtboardResize = new AtomicBoolean(false);
        this.fit = Fit.CONTAIN;
        this.alignment = Alignment.CENTER;
        this.layoutScaleFactorAutomatic = 1.0f;
        this.file = file;
        this.activeArtboard = artboard;
        this.animationList = Collections.synchronizedList(new ArrayList());
        this.stateMachineList = Collections.synchronizedList(new ArrayList());
        this.playingAnimationSet = Collections.synchronizedSet(new HashSet());
        this.playingStateMachineSet = Collections.synchronizedSet(new HashSet());
        this.startStopLock = new ReentrantLock();
        this.targetBounds = new RectF();
        Set<Listener> setSynchronizedSet = Collections.synchronizedSet(new HashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet, "synchronizedSet(...)");
        this._listeners = setSynchronizedSet;
        Set<RiveEventListener> setSynchronizedSet2 = Collections.synchronizedSet(new HashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet2, "synchronizedSet(...)");
        this._eventListeners = setSynchronizedSet2;
    }

    private List<LinearAnimationInstance> animations(Collection<String> animationNames) {
        List<LinearAnimationInstance> animations = getAnimations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : animations) {
            if (animationNames.contains(((LinearAnimationInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, String str, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        riveFileController.pause(str, z5);
    }

    private List<StateMachineInstance> stateMachines(Collection<String> animationNames) {
        List<StateMachineInstance> stateMachines = getStateMachines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stateMachines) {
            if (animationNames.contains(((StateMachineInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, String str, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopAnimations");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        riveFileController.stopAnimations(str, z5);
    }

    public String getTextRunValue(@NotNull String textRunName, @NotNull String path) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(path, "path");
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getTextRunValue(textRunName, path);
        }
        return null;
    }

    public void play(@NotNull Loop loop, @NotNull Direction direction, boolean settleInitialState) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            if (!getPausedAnimations().isEmpty() || !getPausedStateMachines().isEmpty()) {
                Iterator<T> it = getAnimations().iterator();
                while (it.hasNext()) {
                    play$kotlin_release((LinearAnimationInstance) it.next(), loop, direction);
                }
                Iterator<T> it2 = getStateMachines().iterator();
                while (it2.hasNext()) {
                    play$kotlin_release((StateMachineInstance) it2.next(), settleInitialState);
                }
                return;
            }
            List<String> animationNames = activeArtboard.getAnimationNames();
            if (!animationNames.isEmpty()) {
                playAnimation$default(this, (String) CollectionsKt.K(animationNames), loop, direction, false, false, 24, null);
            }
            List<String> stateMachineNames = activeArtboard.getStateMachineNames();
            if (stateMachineNames.isEmpty()) {
                return;
            }
            playAnimation((String) CollectionsKt.K(stateMachineNames), loop, direction, true, settleInitialState);
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (getStartStopLock()) {
            this._listeners.add(listener);
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (getStartStopLock()) {
            this._listeners.remove(listener);
        }
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z5, boolean z6, int i7, Object obj) {
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
        riveFileController.play(str, loop2, direction2, z7, z6);
    }

    private void stop(StateMachineInstance stateMachine) {
        this.playingStateMachineSet.remove(stateMachine);
        if (this.stateMachineList.remove(stateMachine)) {
            notifyStop(stateMachine);
        }
    }

    public void setTextRunValue(@NotNull String textRunName, @NotNull String textValue, @NotNull String path) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Intrinsics.checkNotNullParameter(path, "path");
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            activeArtboard.setTextRunValue(textRunName, textValue, path);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, Loop loop, Direction direction, boolean z5, int i7, Object obj) {
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
        riveFileController.play(loop, direction, z5);
    }

    public void pause(@NotNull List<String> animationNames, boolean areStateMachines) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        if (areStateMachines) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public void stopAnimations(@NotNull List<String> animationNames, boolean areStateMachines) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        if (areStateMachines) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public void play$kotlin_release(@NotNull LinearAnimationInstance animationInstance, @NotNull Loop loop, @NotNull Direction direction) {
        Intrinsics.checkNotNullParameter(animationInstance, "animationInstance");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Loop loop2 = Loop.AUTO;
        if (loop == loop2) {
            loop = getLoop();
        }
        if (loop != loop2) {
            animationInstance.setLoop(loop);
        }
        if (!this.animationList.contains(animationInstance)) {
            if (direction == Direction.BACKWARDS) {
                animationInstance.time(animationInstance.getEndTime());
            }
            this.animationList.add(animationInstance);
        }
        if (direction != Direction.AUTO) {
            animationInstance.setDirection(direction);
        }
        synchronized (getStartStopLock()) {
            this.playingAnimationSet.add(animationInstance);
            Function0<Unit> onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
                Unit unit = Unit.f14616a;
            }
        }
        notifyPlay(animationInstance);
    }

    public void pause(@NotNull String animationName, boolean isStateMachine) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        if (isStateMachine) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public void stopAnimations(@NotNull String animationName, boolean isStateMachine) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        if (isStateMachine) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public void play(@NotNull List<String> animationNames, @NotNull Loop loop, @NotNull Direction direction, boolean areStateMachines, boolean settleInitialState) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Iterator<T> it = animationNames.iterator();
        while (it.hasNext()) {
            playAnimation((String) it.next(), loop, direction, areStateMachines, settleInitialState);
        }
    }

    private void pause(LinearAnimationInstance animation) {
        if (this.playingAnimationSet.remove(animation)) {
            notifyPause(animation);
        }
    }

    private void pause(StateMachineInstance stateMachine) {
        if (this.playingStateMachineSet.remove(stateMachine)) {
            notifyPause(stateMachine);
        }
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z5, File file, Artboard artboard, Function0 function0, ConcurrentLinkedQueue concurrentLinkedQueue, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Loop.AUTO : loop, (i7 & 2) != 0 ? true : z5, (i7 & 4) != 0 ? null : file, (i7 & 8) != 0 ? null : artboard, (i7 & 16) != 0 ? null : function0, (i7 & 32) != 0 ? new ConcurrentLinkedQueue() : concurrentLinkedQueue);
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z5, File file, Artboard artboard, Function0 function0, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Loop.AUTO : loop, (i7 & 2) != 0 ? true : z5, (i7 & 4) != 0 ? null : file, (i7 & 8) != 0 ? null : artboard, (i7 & 16) != 0 ? null : function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveFileController(@NotNull Loop loop, boolean z5, File file, Artboard artboard, Function0<Unit> function0) {
        this(loop, z5, file, artboard, function0, new ConcurrentLinkedQueue());
        Intrinsics.checkNotNullParameter(loop, "loop");
    }
}
