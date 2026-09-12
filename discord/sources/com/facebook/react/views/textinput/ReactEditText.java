package com.facebook.react.views.textinput;

import a3.e;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.util.Predicate;
import androidx.core.view.u0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributes;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTextPaintHolderSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 ð\u00012\u00020\u0001:\u0006î\u0001ï\u0001ð\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010e\u001a\u00020fH\u0005J\b\u0010g\u001a\u00020\u000bH\u0016J0\u0010h\u001a\u00020f2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u00102\u0006\u0010k\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u0010H\u0014J\u0010\u0010n\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020pH\u0016J\u0018\u0010q\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u00102\u0006\u0010s\u001a\u00020tH\u0016J\u0010\u0010u\u001a\u00020f2\u0006\u0010v\u001a\u00020\u0010H\u0016J(\u0010w\u001a\u00020f2\u0006\u0010x\u001a\u00020\u00102\u0006\u0010y\u001a\u00020\u00102\u0006\u0010z\u001a\u00020\u00102\u0006\u0010{\u001a\u00020\u0010H\u0014J\u0012\u0010|\u001a\u0004\u0018\u00010}2\u0006\u0010~\u001a\u00020\u007fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u000b2\u0007\u0010\u0081\u0001\u001a\u00020\u0010H\u0016J\u000f\u0010\u0082\u0001\u001a\u00020fH\u0000¢\u0006\u0003\b\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020fH\u0000¢\u0006\u0003\b\u0085\u0001J\t\u0010\u0086\u0001\u001a\u00020\u000bH\u0002J\u0012\u0010\u0087\u0001\u001a\u00020f2\u0007\u0010\u0088\u0001\u001a\u00020\u0019H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020f2\u0007\u0010\u0088\u0001\u001a\u00020\u0019H\u0016J\u0011\u0010\u008a\u0001\u001a\u00020f2\b\u0010.\u001a\u0004\u0018\u00010/J\u0011\u0010\u008b\u0001\u001a\u00020f2\b\u00100\u001a\u0004\u0018\u000101J\"\u0010\u008c\u0001\u001a\u00020f2\u0007\u0010\u008d\u0001\u001a\u00020\u00102\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010J\u001b\u0010\u008c\u0001\u001a\u00020f2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0002J\u0011\u0010\u0090\u0001\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u0010H\u0002J\u001b\u0010\u0091\u0001\u001a\u00020f2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016J\u001b\u0010\u0092\u0001\u001a\u00020f2\u0007\u0010\u0093\u0001\u001a\u00020\u00102\u0007\u0010\u0094\u0001\u001a\u00020\u0010H\u0014J'\u0010\u0095\u0001\u001a\u00020f2\u0007\u0010\u0096\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020\u00102\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0014J\u0019\u0010\u009a\u0001\u001a\u00020f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0003\b\u009b\u0001J\u000f\u0010\u009c\u0001\u001a\u00020f2\u0006\u00106\u001a\u00020\u000bJ\u0007\u0010\u009d\u0001\u001a\u00020\u000bJ\u0007\u0010\u009e\u0001\u001a\u00020\u000bJ\u000f\u0010\u009f\u0001\u001a\u00020fH\u0000¢\u0006\u0003\b \u0001J\u0012\u0010¡\u0001\u001a\u00020f2\u0007\u0010¢\u0001\u001a\u00020\u0010H\u0016J\u0011\u0010£\u0001\u001a\u00020f2\b\u0010A\u001a\u0004\u0018\u00010\tJ\t\u0010¤\u0001\u001a\u00020fH\u0002J\u0011\u0010¥\u0001\u001a\u00020f2\b\u0010:\u001a\u0004\u0018\u00010\tJ\u0012\u0010¦\u0001\u001a\u00020f2\t\u0010§\u0001\u001a\u0004\u0018\u00010\tJ\u0012\u0010¨\u0001\u001a\u00020f2\t\u0010©\u0001\u001a\u0004\u0018\u00010\tJ\u0014\u0010ª\u0001\u001a\u00020f2\t\u0010«\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0007\u0010¬\u0001\u001a\u00020fJ\u0007\u0010\u00ad\u0001\u001a\u00020fJ\u0007\u0010®\u0001\u001a\u00020\u0010J\u0019\u0010¯\u0001\u001a\u00020f2\b\u0010°\u0001\u001a\u00030±\u0001H\u0000¢\u0006\u0003\b²\u0001J\u0019\u0010³\u0001\u001a\u00020f2\b\u0010°\u0001\u001a\u00030±\u0001H\u0000¢\u0006\u0003\b´\u0001J\u0010\u0010µ\u0001\u001a\u00020\u000b2\u0007\u0010\u008d\u0001\u001a\u00020\u0010J\u0013\u0010¶\u0001\u001a\u00020f2\b\u0010°\u0001\u001a\u00030±\u0001H\u0002J\u0013\u0010·\u0001\u001a\u00020f2\b\u0010¸\u0001\u001a\u00030¹\u0001H\u0002J\u0013\u0010º\u0001\u001a\u00020f2\b\u0010»\u0001\u001a\u00030¹\u0001H\u0002J<\u0010¼\u0001\u001a\u00020f\"\u0005\b\u0000\u0010½\u00012\b\u0010»\u0001\u001a\u00030¹\u00012\u000f\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u0003H½\u00010¿\u00012\u000f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u0003H½\u00010Á\u0001H\u0002J\u0013\u0010Â\u0001\u001a\u00020f2\b\u0010Ã\u0001\u001a\u00030¹\u0001H\u0002J\t\u0010Ä\u0001\u001a\u00020\u000bH\u0004J\t\u0010Å\u0001\u001a\u00020fH\u0004J\t\u0010Æ\u0001\u001a\u00020fH\u0002J\t\u0010Ç\u0001\u001a\u00020fH\u0002J\t\u0010È\u0001\u001a\u00020fH\u0002J\u0013\u0010É\u0001\u001a\u00020f2\b\u0010Ê\u0001\u001a\u00030Ë\u0001H\u0016J\t\u0010Ì\u0001\u001a\u00020fH\u0016J\u0012\u0010Í\u0001\u001a\u00020f2\u0007\u0010Î\u0001\u001a\u00020\u0010H\u0016J\u001a\u0010Ï\u0001\u001a\u00020f2\u0007\u0010Ð\u0001\u001a\u00020\u00102\b\u0010Ñ\u0001\u001a\u00030Ò\u0001J!\u0010Ó\u0001\u001a\u00020f2\u0007\u0010Ð\u0001\u001a\u00020\u00102\t\u0010Î\u0001\u001a\u0004\u0018\u00010\u0010¢\u0006\u0003\u0010Ô\u0001J\u0010\u0010Õ\u0001\u001a\u00020\u00102\u0007\u0010Ð\u0001\u001a\u00020\u0010J\u0011\u0010Ö\u0001\u001a\u00020f2\b\u0010×\u0001\u001a\u00030Ò\u0001J\u001a\u0010Ö\u0001\u001a\u00020f2\b\u0010×\u0001\u001a\u00030Ò\u00012\u0007\u0010Ð\u0001\u001a\u00020\u0010J\u0012\u0010Ø\u0001\u001a\u00020f2\t\u0010Ù\u0001\u001a\u0004\u0018\u00010\tJ\u0011\u0010Ú\u0001\u001a\u00020f2\b\u0010Û\u0001\u001a\u00030Ò\u0001J\u0010\u0010Ü\u0001\u001a\u00020f2\u0007\u0010Ý\u0001\u001a\u00020\u000bJ\u0011\u0010Þ\u0001\u001a\u00020f2\b\u0010ß\u0001\u001a\u00030Ò\u0001J\u0011\u0010à\u0001\u001a\u00020f2\b\u0010á\u0001\u001a\u00030Ò\u0001J\u000f\u0010â\u0001\u001a\u00020f2\u0006\u0010=\u001a\u00020\u000bJ\u000f\u0010ã\u0001\u001a\u00020f2\u0006\u0010@\u001a\u00020\u000bJ\u000f\u0010ä\u0001\u001a\u00020f2\u0006\u0010>\u001a\u00020\u000bJ\t\u0010å\u0001\u001a\u00020fH\u0004J\t\u0010æ\u0001\u001a\u00020fH\u0002J\u0011\u0010ç\u0001\u001a\u00020f2\b\u0010O\u001a\u0004\u0018\u00010PJ\u0011\u0010è\u0001\u001a\u00020f2\b\u0010B\u001a\u0004\u0018\u00010\tJ\u0013\u0010é\u0001\u001a\u00020f2\b\u0010ê\u0001\u001a\u00030ë\u0001H\u0016J\u0012\u0010ì\u0001\u001a\u00020\u000b2\u0007\u0010s\u001a\u00030í\u0001H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0004\n\u0002\b4R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\u001a\u0010M\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010\u000eR\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Q\u001a\b\u0018\u00010RR\u00020\u00008BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\fR\u0014\u0010W\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\fR$\u0010X\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010\u000eR(\u0010\\\u001a\u0004\u0018\u00010\t2\b\u0010[\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\"\"\u0004\b^\u0010$R$\u0010_\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00108@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b`\u0010\u0014\"\u0004\ba\u0010\u0016R$\u0010b\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00108@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bc\u0010\u0014\"\u0004\bd\u0010\u0016¨\u0006ñ\u0001"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "TAG", "", "isSettingTextFromJS", "", "()Z", "setSettingTextFromJS", "(Z)V", "defaultGravityHorizontal", "", "defaultGravityVertical", "nativeEventCount", "getNativeEventCount", "()I", "setNativeEventCount", "(I)V", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/text/TextWatcher;", "stagedInputType", "getStagedInputType", "setStagedInputType", "stagedAutoCapitalize", "getStagedAutoCapitalize$ReactAndroid_release", "setStagedAutoCapitalize$ReactAndroid_release", "submitBehavior", "getSubmitBehavior", "()Ljava/lang/String;", "setSubmitBehavior", "(Ljava/lang/String;)V", "dragAndDropFilter", "", "getDragAndDropFilter", "()Ljava/util/List;", "setDragAndDropFilter", "(Ljava/util/List;)V", "disableFullscreen", "selectionWatcher", "Lcom/facebook/react/views/textinput/SelectionWatcher;", "contentSizeWatcher", "Lcom/facebook/react/views/textinput/ContentSizeWatcher;", "scrollWatcher", "Lcom/facebook/react/views/textinput/ScrollWatcher;", "keyListener", "Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;", "keyListener$1", "detectScrollMovement", "onKeyPress", "textAttributes", "Lcom/facebook/react/views/text/TextAttributes;", "typefaceDirty", ViewProps.FONT_FAMILY, ViewProps.FONT_WEIGHT, ViewProps.FONT_STYLE, "autoFocus", "contextMenuHidden", "didAttachToWindow", "selectTextOnFocus", "placeholder", ViewProps.OVERFLOW, "Lcom/facebook/react/uimanager/style/Overflow;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "disableTextDiffing", "getDisableTextDiffing$ReactAndroid_release", "setDisableTextDiffing$ReactAndroid_release", "isSettingTextFromState", "setSettingTextFromState", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "textWatcherDelegator", "Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;", "getTextWatcherDelegator", "()Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;", "isMultiline", "isMultiline$ReactAndroid_release", "isSecureText", "disableFullscreenUI", "getDisableFullscreenUI", "setDisableFullscreenUI", "value", "returnKeyType", "getReturnKeyType", "setReturnKeyType", "gravityHorizontal", "getGravityHorizontal$ReactAndroid_release", "setGravityHorizontal$ReactAndroid_release", "gravityVertical", "getGravityVertical$ReactAndroid_release", "setGravityVertical$ReactAndroid_release", "finalize", "", "isLayoutRequested", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onTouchEvent", "ev", "Landroid/view/MotionEvent;", "onKeyUp", "keyCode", "event", "Landroid/view/KeyEvent;", "setLineHeight", ViewProps.LINE_HEIGHT, "onScrollChanged", "horiz", "vert", "oldHoriz", "oldVert", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onTextContextMenuItem", StackTraceHelper.ID_KEY, "clearFocusAndMaybeRefocus", "clearFocusAndMaybeRefocus$ReactAndroid_release", "clearFocusFromJS", "clearFocusFromJS$ReactAndroid_release", "requestFocusProgrammatically", "addTextChangedListener", "watcher", "removeTextChangedListener", "setContentSizeWatcher", "setScrollWatcher", "maybeSetSelection", "eventCounter", ViewProps.START, ViewProps.END, "clampToTextLength", "setSelection", "onSelectionChanged", "selStart", "selEnd", "onFocusChanged", "focused", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "setSelectionWatcher", "setSelectionWatcher$ReactAndroid_release", "setOnKeyPress", "shouldBlurOnReturn", "shouldSubmitOnReturn", "commitStagedInputType", "commitStagedInputType$ReactAndroid_release", "setInputType", "type", "setPlaceholder", "updatePlaceholderEllipsize", "setFontFamily", "setFontWeight", "fontWeightString", "setFontStyle", "fontStyleString", "setFontFeatureSettings", "fontFeatureSettings", "maybeUpdateTypeface", "requestFocusFromJS", "incrementAndGetEventCounter", "maybeSetTextFromJS", "reactTextUpdate", "Lcom/facebook/react/views/text/ReactTextUpdate;", "maybeSetTextFromJS$ReactAndroid_release", "maybeSetTextFromState", "maybeSetTextFromState$ReactAndroid_release", "canUpdateWithEventCount", "maybeSetText", "manageSpans", "spannableStringBuilder", "Landroid/text/SpannableStringBuilder;", "stripStyleEquivalentSpans", "sb", "stripSpansOfKind", "T", "clazz", "Ljava/lang/Class;", "shouldStrip", "Landroidx/core/util/Predicate;", "addSpansFromStyleAttributes", "workingText", "showSoftKeyboard", "hideSoftKeyboard", "onContentSizeChange", "setIntrinsicContentSize", "updateImeOptions", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onAttachedToWindow", "setBackgroundColor", ViewProps.COLOR, "setBorderWidth", ViewProps.POSITION, "width", "", "setBorderColor", "(ILjava/lang/Integer;)V", "getBorderColor", "setBorderRadius", "borderRadius", "setBorderStyle", "style", "setLetterSpacingPt", "letterSpacingPt", "setAllowFontScaling", ViewProps.ALLOW_FONT_SCALING, "setFontSize", ViewProps.FONT_SIZE, "setMaxFontSizeMultiplier", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "setAutoFocus", "setSelectTextOnFocus", "setContextMenuHidden", "applyTextAttributes", "updateCachedSpannable", "setEventDispatcher", "setOverflow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDragEvent", "Landroid/view/DragEvent;", "TextWatcherDelegator", "InternalKeyListener", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1253:1\n1761#2,3:1254\n*S KotlinDebug\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText\n*L\n1151#1:1254,3\n*E\n"})
public class ReactEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean DEBUG_MODE;

    @NotNull
    private static final KeyListener keyListener;

    @NotNull
    private final String TAG;
    private boolean autoFocus;
    private ContentSizeWatcher contentSizeWatcher;
    private boolean contextMenuHidden;
    private final int defaultGravityHorizontal;
    private final int defaultGravityVertical;
    private boolean detectScrollMovement;
    private boolean didAttachToWindow;
    private boolean disableFullscreen;
    private boolean disableTextDiffing;
    private List<String> dragAndDropFilter;
    private EventDispatcher eventDispatcher;
    private String fontFamily;
    private int fontStyle;
    private int fontWeight;

    @NotNull
    private final InputMethodManager inputMethodManager;
    private boolean isSettingTextFromJS;
    private boolean isSettingTextFromState;

    /* JADX INFO: renamed from: keyListener$1, reason: from kotlin metadata */
    private InternalKeyListener keyListener;
    private CopyOnWriteArrayList<TextWatcher> listeners;
    private int nativeEventCount;
    private boolean onKeyPress;

    @NotNull
    private Overflow overflow;
    private String placeholder;
    private String returnKeyType;
    private ScrollWatcher scrollWatcher;
    private boolean selectTextOnFocus;
    private SelectionWatcher selectionWatcher;
    private int stagedAutoCapitalize;
    private int stagedInputType;
    private StateWrapper stateWrapper;
    private String submitBehavior;

    @NotNull
    private final TextAttributes textAttributes;
    private TextWatcherDelegator textWatcherDelegator;
    private boolean typefaceDirty;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditText$Companion;", "", "<init>", "()V", "DEBUG_MODE", "", "getDEBUG_MODE", "()Z", "keyListener", "Landroid/text/method/KeyListener;", "sameTextForSpan", "oldText", "Landroid/text/Editable;", "newText", "Landroid/text/SpannableStringBuilder;", ViewProps.START, "", ViewProps.END, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean sameTextForSpan(Editable oldText, SpannableStringBuilder newText, int start, int end) {
            if (start > newText.length() || end > newText.length()) {
                return false;
            }
            while (start < end) {
                if (oldText.charAt(start) != newText.charAt(start)) {
                    return false;
                }
                start++;
            }
            return true;
        }

        public final boolean getDEBUG_MODE() {
            return ReactEditText.DEBUG_MODE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;", "Landroid/text/method/KeyListener;", "<init>", "()V", "_inputType", "", "getInputType", "setInputType", "", "inputType", "onKeyDown", "", "view", "Landroid/view/View;", "text", "Landroid/text/Editable;", "keyCode", "event", "Landroid/view/KeyEvent;", "onKeyUp", "onKeyOther", "clearMetaKeyState", "content", "states", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalKeyListener implements KeyListener {
        private int _inputType;

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(@NotNull View view, @NotNull Editable content, int states) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(content, "content");
            ReactEditText.keyListener.clearMetaKeyState(view, content, states);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this._inputType;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(@NotNull View view, @NotNull Editable text, int keyCode, @NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return ReactEditText.keyListener.onKeyDown(view, text, keyCode, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(@NotNull View view, @NotNull Editable text, @NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return ReactEditText.keyListener.onKeyOther(view, text, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(@NotNull View view, @NotNull Editable text, int keyCode, @NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return ReactEditText.keyListener.onKeyUp(view, text, keyCode, event);
        }

        public final void setInputType(int inputType) {
            this._inputType = inputType;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;", "Landroid/text/TextWatcher;", "<init>", "(Lcom/facebook/react/views/textinput/ReactEditText;)V", "beforeTextChanged", "", "s", "", ViewProps.START, "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1253:1\n1869#2,2:1254\n1869#2,2:1256\n1869#2,2:1258\n*S KotlinDebug\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator\n*L\n1166#1:1254,2\n1176#1:1256,2\n1186#1:1258,2\n*E\n"})
    public final class TextWatcherDelegator implements TextWatcher {
        public TextWatcherDelegator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable s2) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s2, "s");
            if (ReactEditText.this.getIsSettingTextFromJS() || (copyOnWriteArrayList = ReactEditText.this.listeners) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(s2);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@NotNull CharSequence s2, int start, int count, int after) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s2, "s");
            if (ReactEditText.this.getIsSettingTextFromJS() || (copyOnWriteArrayList = ReactEditText.this.listeners) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(s2, start, count, after);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence s2, int start, int before, int count) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s2, "s");
            if (ReactEditText.INSTANCE.getDEBUG_MODE()) {
                String str = ReactEditText.this.TAG;
                int id2 = ReactEditText.this.getId();
                StringBuilder sb2 = new StringBuilder("onTextChanged[");
                sb2.append(id2);
                sb2.append("]: ");
                sb2.append((Object) s2);
                sb2.append(" ");
                e.z(sb2, start, " ", before, " ");
                sb2.append(count);
                o8.a.g(str, sb2.toString());
            }
            if (!ReactEditText.this.getIsSettingTextFromJS() && (copyOnWriteArrayList = ReactEditText.this.listeners) != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(s2, start, before, count);
                }
            }
            ReactEditText.this.updateCachedSpannable();
            ReactEditText.this.onContentSizeChange();
        }
    }

    static {
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        DEBUG_MODE = false;
        QwertyKeyListener instanceForFullKeyboard = QwertyKeyListener.getInstanceForFullKeyboard();
        Intrinsics.checkNotNullExpressionValue(instanceForFullKeyboard, "getInstanceForFullKeyboard(...)");
        keyListener = instanceForFullKeyboard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactEditText(@NotNull Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullExpressionValue("ReactEditText", "getSimpleName(...)");
        this.TAG = "ReactEditText";
        this.fontWeight = -1;
        this.fontStyle = -1;
        this.overflow = Overflow.VISIBLE;
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.inputMethodManager = (InputMethodManager) systemService;
        this.defaultGravityHorizontal = getGravity() & 8388615;
        this.defaultGravityVertical = getGravity() & 112;
        this.nativeEventCount = 0;
        this.isSettingTextFromJS = false;
        this.disableFullscreen = false;
        this.listeners = null;
        this.stagedInputType = getInputType();
        if (this.keyListener == null) {
            this.keyListener = new InternalKeyListener();
        }
        this.scrollWatcher = null;
        this.textAttributes = new TextAttributes();
        applyTextAttributes();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && i7 <= 27) {
            setLayerType(1, null);
        }
        final boolean zIsFocusable = isFocusable();
        final int importantForAccessibility = getImportantForAccessibility();
        u0.p(this, new ReactAccessibilityDelegate(zIsFocusable, importantForAccessibility) { // from class: com.facebook.react.views.textinput.ReactEditText$editTextAccessibilityDelegate$1
            @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.core.view.b
            public boolean performAccessibilityAction(View host, int action, Bundle args) {
                Intrinsics.checkNotNullParameter(host, "host");
                if (action != 16) {
                    return super.performAccessibilityAction(host, action, args);
                }
                Editable text = this.this$0.getText();
                if (text == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int length = text.length();
                if (length > 0) {
                    this.this$0.setSelection(length);
                }
                return this.this$0.requestFocusProgrammatically();
            }
        });
        ActionMode.Callback callback = new ActionMode.Callback() { // from class: com.facebook.react.views.textinput.ReactEditText$customActionModeCallback$1
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(item, "item");
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(menu, "menu");
                if (this.this$0.contextMenuHidden) {
                    return false;
                }
                menu.removeItem(R.id.pasteAsPlainText);
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode mode) {
                Intrinsics.checkNotNullParameter(mode, "mode");
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(menu, "menu");
                return true;
            }
        };
        setCustomSelectionActionModeCallback(callback);
        setCustomInsertionActionModeCallback(callback);
    }

    private final void addSpansFromStyleAttributes(SpannableStringBuilder workingText) {
        workingText.setSpan(new ReactAbsoluteSizeSpan(this.textAttributes.getEffectiveFontSize()), 0, workingText.length(), 16711698);
        workingText.setSpan(new ReactForegroundColorSpan(getCurrentTextColor()), 0, workingText.length(), 16711698);
        Integer backgroundColor = BackgroundStyleApplicator.getBackgroundColor(this);
        if (backgroundColor != null && backgroundColor.intValue() != 0) {
            workingText.setSpan(new ReactBackgroundColorSpan(backgroundColor.intValue()), 0, workingText.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            workingText.setSpan(new ReactStrikethroughSpan(), 0, workingText.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            workingText.setSpan(new ReactUnderlineSpan(), 0, workingText.length(), 16711698);
        }
        float effectiveLetterSpacing = this.textAttributes.getEffectiveLetterSpacing();
        if (!Float.isNaN(effectiveLetterSpacing)) {
            workingText.setSpan(new CustomLetterSpacingSpan(effectiveLetterSpacing), 0, workingText.length(), 16711698);
        }
        if (this.fontStyle != -1 || this.fontWeight != -1 || this.fontFamily != null || getFontFeatureSettings() != null) {
            int i7 = this.fontStyle;
            int i10 = this.fontWeight;
            String fontFeatureSettings = getFontFeatureSettings();
            String str = this.fontFamily;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            workingText.setSpan(new CustomStyleSpan(i7, i10, fontFeatureSettings, str, assets), 0, workingText.length(), 16711698);
        }
        float effectiveLineHeight = this.textAttributes.getEffectiveLineHeight();
        if (Float.isNaN(effectiveLineHeight)) {
            return;
        }
        workingText.setSpan(new CustomLineHeightSpan(effectiveLineHeight), 0, workingText.length(), 16711698);
    }

    private final int clampToTextLength(int value) {
        int length;
        if (getText() == null) {
            length = 0;
        } else {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            length = text.length();
        }
        return (int) Math.max(0.0d, Math.min(value, length));
    }

    private final TextWatcherDelegator getTextWatcherDelegator() {
        if (this.textWatcherDelegator == null) {
            this.textWatcherDelegator = new TextWatcherDelegator();
        }
        return this.textWatcherDelegator;
    }

    private final boolean isSecureText() {
        return (getInputType() & 144) != 0;
    }

    private final void manageSpans(SpannableStringBuilder spannableStringBuilder) {
        Editable text = getText();
        if (text == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (Object obj : text.getSpans(0, length(), Object.class)) {
            int spanFlags = text.getSpanFlags(obj);
            boolean z5 = (spanFlags & 33) == 33;
            if (obj instanceof ReactSpan) {
                text.removeSpan(obj);
            }
            if (z5) {
                int spanStart = text.getSpanStart(obj);
                int spanEnd = text.getSpanEnd(obj);
                text.removeSpan(obj);
                if (INSTANCE.sameTextForSpan(text, spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private final void maybeSetText(ReactTextUpdate reactTextUpdate) {
        if (!(isSecureText() && Intrinsics.areEqual(getText(), reactTextUpdate.getText())) && canUpdateWithEventCount(reactTextUpdate.getJsEventCounter())) {
            if (DEBUG_MODE) {
                o8.a.g(this.TAG, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) reactTextUpdate.getText()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reactTextUpdate.getText());
            manageSpans(spannableStringBuilder);
            stripStyleEquivalentSpans(spannableStringBuilder);
            this.disableTextDiffing = true;
            if (reactTextUpdate.getText().length() == 0) {
                setText((CharSequence) null);
            } else {
                Editable text = getText();
                if (text == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                text.replace(0, length(), spannableStringBuilder);
            }
            this.disableTextDiffing = false;
            if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
            }
            updateCachedSpannable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContentSizeChange() {
        ContentSizeWatcher contentSizeWatcher = this.contentSizeWatcher;
        if (contentSizeWatcher != null) {
            contentSizeWatcher.onLayout();
        }
        setIntrinsicContentSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean requestFocusProgrammatically() {
        boolean zRequestFocus = super.requestFocus(130, null);
        if (isInTouchMode() && getShowSoftInputOnFocus()) {
            showSoftKeyboard();
        }
        return zRequestFocus;
    }

    private final void setIntrinsicContentSize() {
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE || this.stateWrapper != null || reactContext.isBridgeless()) {
            return;
        }
        ReactTextInputLocalData reactTextInputLocalData = new ReactTextInputLocalData(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), reactTextInputLocalData);
        }
    }

    private final <T> void stripSpansOfKind(SpannableStringBuilder sb2, Class<T> clazz, Predicate shouldStrip) {
        Iterator it = ArrayIteratorKt.iterator(sb2.getSpans(0, sb2.length(), clazz));
        while (it.hasNext()) {
            Object next = it.next();
            if (shouldStrip.test(next)) {
                sb2.removeSpan(next);
            }
        }
    }

    private final void stripStyleEquivalentSpans(SpannableStringBuilder sb2) {
        final int i7 = 0;
        stripSpansOfKind(sb2, ReactAbsoluteSizeSpan.class, new Predicate(this) { // from class: com.facebook.react.views.textinput.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ReactEditText f5356e;

            {
                this.f5356e = this;
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                switch (i7) {
                    case 0:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$1(this.f5356e, (ReactAbsoluteSizeSpan) obj);
                    case 1:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$2(this.f5356e, (ReactBackgroundColorSpan) obj);
                    case 2:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$3(this.f5356e, (ReactForegroundColorSpan) obj);
                    case 3:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$4(this.f5356e, (ReactStrikethroughSpan) obj);
                    case 4:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$5(this.f5356e, (ReactUnderlineSpan) obj);
                    case 5:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$6(this.f5356e, (CustomLetterSpacingSpan) obj);
                    default:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$7(this.f5356e, (CustomStyleSpan) obj);
                }
            }
        });
        final int i10 = 1;
        stripSpansOfKind(sb2, ReactBackgroundColorSpan.class, new Predicate(this) { // from class: com.facebook.react.views.textinput.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ReactEditText f5356e;

            {
                this.f5356e = this;
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                switch (i10) {
                    case 0:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$1(this.f5356e, (ReactAbsoluteSizeSpan) obj);
                    case 1:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$2(this.f5356e, (ReactBackgroundColorSpan) obj);
                    case 2:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$3(this.f5356e, (ReactForegroundColorSpan) obj);
                    case 3:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$4(this.f5356e, (ReactStrikethroughSpan) obj);
                    case 4:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$5(this.f5356e, (ReactUnderlineSpan) obj);
                    case 5:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$6(this.f5356e, (CustomLetterSpacingSpan) obj);
                    default:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$7(this.f5356e, (CustomStyleSpan) obj);
                }
            }
        });
        final int i11 = 2;
        stripSpansOfKind(sb2, ReactForegroundColorSpan.class, new Predicate(this) { // from class: com.facebook.react.views.textinput.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ReactEditText f5356e;

            {
                this.f5356e = this;
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                switch (i11) {
                    case 0:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$1(this.f5356e, (ReactAbsoluteSizeSpan) obj);
                    case 1:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$2(this.f5356e, (ReactBackgroundColorSpan) obj);
                    case 2:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$3(this.f5356e, (ReactForegroundColorSpan) obj);
                    case 3:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$4(this.f5356e, (ReactStrikethroughSpan) obj);
                    case 4:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$5(this.f5356e, (ReactUnderlineSpan) obj);
                    case 5:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$6(this.f5356e, (CustomLetterSpacingSpan) obj);
                    default:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$7(this.f5356e, (CustomStyleSpan) obj);
                }
            }
        });
        final int i12 = 3;
        stripSpansOfKind(sb2, ReactStrikethroughSpan.class, new Predicate(this) { // from class: com.facebook.react.views.textinput.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ReactEditText f5356e;

            {
                this.f5356e = this;
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                switch (i12) {
                    case 0:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$1(this.f5356e, (ReactAbsoluteSizeSpan) obj);
                    case 1:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$2(this.f5356e, (ReactBackgroundColorSpan) obj);
                    case 2:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$3(this.f5356e, (ReactForegroundColorSpan) obj);
                    case 3:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$4(this.f5356e, (ReactStrikethroughSpan) obj);
                    case 4:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$5(this.f5356e, (ReactUnderlineSpan) obj);
                    case 5:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$6(this.f5356e, (CustomLetterSpacingSpan) obj);
                    default:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$7(this.f5356e, (CustomStyleSpan) obj);
                }
            }
        });
        final int i13 = 4;
        stripSpansOfKind(sb2, ReactUnderlineSpan.class, new Predicate(this) { // from class: com.facebook.react.views.textinput.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ReactEditText f5356e;

            {
                this.f5356e = this;
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                switch (i13) {
                    case 0:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$1(this.f5356e, (ReactAbsoluteSizeSpan) obj);
                    case 1:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$2(this.f5356e, (ReactBackgroundColorSpan) obj);
                    case 2:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$3(this.f5356e, (ReactForegroundColorSpan) obj);
                    case 3:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$4(this.f5356e, (ReactStrikethroughSpan) obj);
                    case 4:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$5(this.f5356e, (ReactUnderlineSpan) obj);
                    case 5:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$6(this.f5356e, (CustomLetterSpacingSpan) obj);
                    default:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$7(this.f5356e, (CustomStyleSpan) obj);
                }
            }
        });
        final int i14 = 5;
        stripSpansOfKind(sb2, CustomLetterSpacingSpan.class, new Predicate(this) { // from class: com.facebook.react.views.textinput.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ReactEditText f5356e;

            {
                this.f5356e = this;
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                switch (i14) {
                    case 0:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$1(this.f5356e, (ReactAbsoluteSizeSpan) obj);
                    case 1:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$2(this.f5356e, (ReactBackgroundColorSpan) obj);
                    case 2:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$3(this.f5356e, (ReactForegroundColorSpan) obj);
                    case 3:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$4(this.f5356e, (ReactStrikethroughSpan) obj);
                    case 4:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$5(this.f5356e, (ReactUnderlineSpan) obj);
                    case 5:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$6(this.f5356e, (CustomLetterSpacingSpan) obj);
                    default:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$7(this.f5356e, (CustomStyleSpan) obj);
                }
            }
        });
        final int i15 = 6;
        stripSpansOfKind(sb2, CustomStyleSpan.class, new Predicate(this) { // from class: com.facebook.react.views.textinput.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ReactEditText f5356e;

            {
                this.f5356e = this;
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                switch (i15) {
                    case 0:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$1(this.f5356e, (ReactAbsoluteSizeSpan) obj);
                    case 1:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$2(this.f5356e, (ReactBackgroundColorSpan) obj);
                    case 2:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$3(this.f5356e, (ReactForegroundColorSpan) obj);
                    case 3:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$4(this.f5356e, (ReactStrikethroughSpan) obj);
                    case 4:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$5(this.f5356e, (ReactUnderlineSpan) obj);
                    case 5:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$6(this.f5356e, (CustomLetterSpacingSpan) obj);
                    default:
                        return ReactEditText.stripStyleEquivalentSpans$lambda$7(this.f5356e, (CustomStyleSpan) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$1(ReactEditText reactEditText, ReactAbsoluteSizeSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getSize() == reactEditText.textAttributes.getEffectiveFontSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$2(ReactEditText reactEditText, ReactBackgroundColorSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        int backgroundColor = span.getBackgroundColor();
        Integer backgroundColor2 = BackgroundStyleApplicator.getBackgroundColor(reactEditText);
        return backgroundColor2 != null && backgroundColor == backgroundColor2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$3(ReactEditText reactEditText, ReactForegroundColorSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getForegroundColor() == reactEditText.getCurrentTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$4(ReactEditText reactEditText, ReactStrikethroughSpan reactStrikethroughSpan) {
        return (reactEditText.getPaintFlags() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$5(ReactEditText reactEditText, ReactUnderlineSpan reactUnderlineSpan) {
        return (reactEditText.getPaintFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$6(ReactEditText reactEditText, CustomLetterSpacingSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getSpacing() == reactEditText.textAttributes.getEffectiveLetterSpacing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$7(ReactEditText reactEditText, CustomStyleSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getStyle() == reactEditText.fontStyle && Intrinsics.areEqual(span.getFontFamily(), reactEditText.fontFamily) && span.getWeight() == reactEditText.fontWeight && Intrinsics.areEqual(span.getFontFeatureSettings(), reactEditText.getFontFeatureSettings());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCachedSpannable() {
        if (this.stateWrapper == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z5 = text == null || text.length() == 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (text != null && !z5) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e10) {
                ReactSoftExceptionLogger.logSoftException(this.TAG, e10);
            }
        }
        if (z5 && getHint() != null) {
            CharSequence hint = getHint();
            Intrinsics.checkNotNullExpressionValue(hint, "getHint(...)");
            if (hint.length() > 0) {
                spannableStringBuilder.append(getHint());
            }
        }
        addSpansFromStyleAttributes(spannableStringBuilder);
        spannableStringBuilder.setSpan(new ReactTextPaintHolderSpan(new TextPaint(getPaint())), 0, spannableStringBuilder.length(), 18);
        TextLayoutManager.INSTANCE.setCachedSpannableForTag(getId(), spannableStringBuilder);
    }

    private final void updateImeOptions() {
        String str = this.returnKeyType;
        int i7 = 6;
        if (str != null) {
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        i7 = 7;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        i7 = 3;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        i7 = 2;
                    }
                    break;
                case 3089282:
                    str.equals("done");
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        i7 = 5;
                    }
                    break;
                case 3387192:
                    if (str.equals(ViewProps.NONE)) {
                        i7 = 1;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        i7 = 4;
                    }
                    break;
            }
        }
        if (this.disableFullscreen) {
            i7 |= 33554432;
        }
        setImeOptions(i7);
    }

    private final void updatePlaceholderEllipsize() {
        setEllipsize(!isMultiline$ReactAndroid_release() ? TextUtils.TruncateAt.END : null);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        if (this.listeners == null) {
            this.listeners = new CopyOnWriteArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList = this.listeners;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(watcher);
        }
    }

    public final void applyTextAttributes() {
        setTextSize(0, this.textAttributes.getEffectiveFontSize());
        float effectiveLetterSpacing = this.textAttributes.getEffectiveLetterSpacing();
        if (Float.isNaN(effectiveLetterSpacing)) {
            return;
        }
        setLetterSpacing(effectiveLetterSpacing);
    }

    public final boolean canUpdateWithEventCount(int eventCounter) {
        return eventCounter >= this.nativeEventCount;
    }

    public final void clearFocusAndMaybeRefocus$ReactAndroid_release() {
        if (Build.VERSION.SDK_INT > 28 || !isInTouchMode()) {
            super.clearFocus();
        } else {
            View rootView = getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            int descendantFocusability = viewGroup.getDescendantFocusability();
            viewGroup.setDescendantFocusability(393216);
            super.clearFocus();
            viewGroup.setDescendantFocusability(descendantFocusability);
        }
        hideSoftKeyboard();
    }

    public final void clearFocusFromJS$ReactAndroid_release() {
        clearFocusAndMaybeRefocus$ReactAndroid_release();
    }

    public final void commitStagedInputType$ReactAndroid_release() {
        if (getInputType() != this.stagedInputType) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.stagedInputType);
            maybeSetSelection(selectionStart, selectionEnd);
        }
    }

    @SuppressLint({"ClassImplementsFinalize"})
    public final void finalize() {
        if (DEBUG_MODE) {
            o8.a.g(this.TAG, "finalize[" + getId() + "] delete cached spannable");
        }
        TextLayoutManager.INSTANCE.deleteCachedSpannableForTag(getId());
    }

    public final int getBorderColor(int position) {
        Integer borderColor = BackgroundStyleApplicator.getBorderColor(this, (LogicalEdge) LogicalEdge.getEntries().get(position));
        if (borderColor != null) {
            return borderColor.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: getDisableFullscreenUI, reason: from getter */
    public final boolean getDisableFullscreen() {
        return this.disableFullscreen;
    }

    /* JADX INFO: renamed from: getDisableTextDiffing$ReactAndroid_release, reason: from getter */
    public final boolean getDisableTextDiffing() {
        return this.disableTextDiffing;
    }

    public final List<String> getDragAndDropFilter() {
        return this.dragAndDropFilter;
    }

    public final int getGravityHorizontal$ReactAndroid_release() {
        return getGravity() & 8388615;
    }

    public final int getGravityVertical$ReactAndroid_release() {
        return getGravity() & 112;
    }

    public final int getNativeEventCount() {
        return this.nativeEventCount;
    }

    public final String getReturnKeyType() {
        return this.returnKeyType;
    }

    /* JADX INFO: renamed from: getStagedAutoCapitalize$ReactAndroid_release, reason: from getter */
    public final int getStagedAutoCapitalize() {
        return this.stagedAutoCapitalize;
    }

    public final int getStagedInputType() {
        return this.stagedInputType;
    }

    public final StateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    public final String getSubmitBehavior() {
        return this.submitBehavior;
    }

    public final void hideSoftKeyboard() {
        this.inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final int incrementAndGetEventCounter() {
        int i7 = this.nativeEventCount + 1;
        this.nativeEventCount = i7;
        return i7;
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    public final boolean isMultiline$ReactAndroid_release() {
        return (getInputType() & 131072) != 0;
    }

    /* JADX INFO: renamed from: isSettingTextFromJS, reason: from getter */
    public final boolean getIsSettingTextFromJS() {
        return this.isSettingTextFromJS;
    }

    /* JADX INFO: renamed from: isSettingTextFromState, reason: from getter */
    public final boolean getIsSettingTextFromState() {
        return this.isSettingTextFromState;
    }

    public final void maybeSetSelection(int eventCounter, int start, int end) {
        if (canUpdateWithEventCount(eventCounter)) {
            maybeSetSelection(start, end);
        }
    }

    public final void maybeSetTextFromJS$ReactAndroid_release(@NotNull ReactTextUpdate reactTextUpdate) {
        Intrinsics.checkNotNullParameter(reactTextUpdate, "reactTextUpdate");
        this.isSettingTextFromJS = true;
        maybeSetText(reactTextUpdate);
        this.isSettingTextFromJS = false;
    }

    public final void maybeSetTextFromState$ReactAndroid_release(@NotNull ReactTextUpdate reactTextUpdate) {
        Intrinsics.checkNotNullParameter(reactTextUpdate, "reactTextUpdate");
        this.isSettingTextFromState = true;
        maybeSetText(reactTextUpdate);
        this.isSettingTextFromState = false;
    }

    public final void maybeUpdateTypeface() {
        if (this.typefaceDirty) {
            this.typefaceDirty = false;
            Typeface typeface = getTypeface();
            int i7 = this.fontStyle;
            int i10 = this.fontWeight;
            String str = this.fontFamily;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            setTypeface(ReactTypefaceUtils.applyStyles(typeface, i7, i10, str, assets));
            boolean z5 = (this.fontStyle == -1 && this.fontWeight == -1 && this.fontFamily == null && getFontFeatureSettings() == null) ? false : true;
            setPaintFlags(z5 ? getPaintFlags() | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : getPaintFlags() & (-129));
            setPaintFlags(z5 ? getPaintFlags() | 64 : getPaintFlags() & (-65));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        maybeSetSelection(selectionStart, selectionEnd);
        if (this.autoFocus && !this.didAttachToWindow) {
            requestFocusProgrammatically();
        }
        this.didAttachToWindow = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && ReactNativeFeatureFlags.enableFontScaleChangesUpdatingLayout()) {
            applyTextAttributes();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection != null && this.onKeyPress) {
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher == null) {
                throw new IllegalStateException("Required value was null.");
            }
            inputConnectionOnCreateInputConnection = new ReactEditTextInputConnectionWrapper(inputConnectionOnCreateInputConnection, reactContext, this, eventDispatcher);
        }
        if (isMultiline$ReactAndroid_release() && (shouldBlurOnReturn() || shouldSubmitOnReturn())) {
            outAttrs.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public boolean onDragEvent(@NotNull DragEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List<String> list = this.dragAndDropFilter;
        if (list != null && event.getAction() == 1) {
            if (list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (event.getClipDescription().hasMimeType((String) it.next())) {
                }
            }
            return false;
        }
        return super.onDragEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.overflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        SelectionWatcher selectionWatcher;
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (!focused || (selectionWatcher = this.selectionWatcher) == null || selectionWatcher == null) {
            return;
        }
        selectionWatcher.onSelectionChanged(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode != 66 || isMultiline$ReactAndroid_release()) {
            return super.onKeyUp(keyCode, event);
        }
        hideSoftKeyboard();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        onContentSizeChange();
        if (this.selectTextOnFocus && isFocused()) {
            selectAll();
            this.selectTextOnFocus = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int horiz, int vert, int oldHoriz, int oldVert) {
        super.onScrollChanged(horiz, vert, oldHoriz, oldVert);
        ScrollWatcher scrollWatcher = this.scrollWatcher;
        if (scrollWatcher != null) {
            scrollWatcher.onScrollChanged(horiz, vert, oldHoriz, oldVert);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        SelectionWatcher selectionWatcher;
        if (DEBUG_MODE) {
            String str = this.TAG;
            StringBuilder sbR = e.r(getId(), "onSelectionChanged[", selStart, "]: ", " ");
            sbR.append(selEnd);
            o8.a.g(str, sbR.toString());
        }
        super.onSelectionChanged(selStart, selEnd);
        if (this.selectionWatcher == null || !hasFocus() || (selectionWatcher = this.selectionWatcher) == null) {
            return;
        }
        selectionWatcher.onSelectionChanged(selStart, selEnd);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int id2) {
        if (id2 == 16908322) {
            id2 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(id2);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.detectScrollMovement = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.detectScrollMovement) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.detectScrollMovement = false;
        }
        return super.onTouchEvent(ev);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList = this.listeners;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(watcher);
            if (copyOnWriteArrayList.isEmpty()) {
                this.listeners = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public final void requestFocusFromJS() {
        requestFocusProgrammatically();
    }

    public final void setAllowFontScaling(boolean allowFontScaling) {
        if (this.textAttributes.getAllowFontScaling() != allowFontScaling) {
            this.textAttributes.setAllowFontScaling(allowFontScaling);
            applyTextAttributes();
        }
    }

    public final void setAutoFocus(boolean autoFocus) {
        this.autoFocus = autoFocus;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(color));
    }

    public final void setBorderColor(int position, Integer color) {
        BackgroundStyleApplicator.setBorderColor(this, (LogicalEdge) LogicalEdge.getEntries().get(position), color);
    }

    public final void setBorderRadius(float borderRadius) {
        setBorderRadius(borderRadius, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public final void setBorderStyle(String style) {
        BackgroundStyleApplicator.setBorderStyle(this, style == null ? null : BorderStyle.INSTANCE.fromString(style));
    }

    public final void setBorderWidth(int position, float width) {
        BackgroundStyleApplicator.setBorderWidth(this, (LogicalEdge) LogicalEdge.getEntries().get(position), Float.valueOf(PixelUtil.toDIPFromPixel(width)));
    }

    public final void setContentSizeWatcher(ContentSizeWatcher contentSizeWatcher) {
        this.contentSizeWatcher = contentSizeWatcher;
    }

    public final void setContextMenuHidden(boolean contextMenuHidden) {
        this.contextMenuHidden = contextMenuHidden;
    }

    public final void setDisableFullscreenUI(boolean z5) {
        this.disableFullscreen = z5;
        updateImeOptions();
    }

    public final void setDisableTextDiffing$ReactAndroid_release(boolean z5) {
        this.disableTextDiffing = z5;
    }

    public final void setDragAndDropFilter(List<String> list) {
        this.dragAndDropFilter = list;
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }

    public final void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        this.typefaceDirty = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String fontFeatureSettings) {
        if (Intrinsics.areEqual(fontFeatureSettings, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(fontFeatureSettings);
        this.typefaceDirty = true;
    }

    public final void setFontSize(float fontSize) {
        this.textAttributes.setFontSize(fontSize);
        applyTextAttributes();
    }

    public final void setFontStyle(String fontStyleString) {
        int fontStyle = ReactTypefaceUtils.parseFontStyle(fontStyleString);
        if (fontStyle != this.fontStyle) {
            this.fontStyle = fontStyle;
            this.typefaceDirty = true;
        }
    }

    public final void setFontWeight(String fontWeightString) {
        int fontWeight = ReactTypefaceUtils.parseFontWeight(fontWeightString);
        if (fontWeight != this.fontWeight) {
            this.fontWeight = fontWeight;
            this.typefaceDirty = true;
        }
    }

    public final void setGravityHorizontal$ReactAndroid_release(int i7) {
        if (i7 == 0) {
            i7 = this.defaultGravityHorizontal;
        }
        setGravity(i7 | (getGravity() & (-8388616)));
    }

    public final void setGravityVertical$ReactAndroid_release(int i7) {
        if (i7 == 0) {
            i7 = this.defaultGravityVertical;
        }
        setGravity(i7 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int type) {
        Typeface typeface = super.getTypeface();
        super.setInputType(type);
        this.stagedInputType = type;
        super.setTypeface(typeface);
        if (isMultiline$ReactAndroid_release()) {
            setSingleLine(false);
        }
        updatePlaceholderEllipsize();
        if (this.keyListener == null) {
            this.keyListener = new InternalKeyListener();
        }
        InternalKeyListener internalKeyListener = this.keyListener;
        if (internalKeyListener != null) {
            internalKeyListener.setInputType(type);
        }
        super.setKeyListener(this.keyListener);
    }

    public final void setLetterSpacingPt(float letterSpacingPt) {
        this.textAttributes.setLetterSpacing(letterSpacingPt);
        applyTextAttributes();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int lineHeight) {
        this.textAttributes.setLineHeight(lineHeight);
    }

    public final void setMaxFontSizeMultiplier(float maxFontSizeMultiplier) {
        if (maxFontSizeMultiplier == this.textAttributes.getMaxFontSizeMultiplier()) {
            return;
        }
        this.textAttributes.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
        applyTextAttributes();
    }

    public final void setNativeEventCount(int i7) {
        this.nativeEventCount = i7;
    }

    public final void setOnKeyPress(boolean onKeyPress) {
        this.onKeyPress = onKeyPress;
    }

    public final void setOverflow(String overflow) {
        if (overflow == null) {
            this.overflow = Overflow.VISIBLE;
        } else {
            Overflow overflowFromString = Overflow.INSTANCE.fromString(overflow);
            if (overflowFromString == null) {
                overflowFromString = Overflow.VISIBLE;
            }
            this.overflow = overflowFromString;
        }
        invalidate();
    }

    public final void setPlaceholder(String placeholder) {
        if (!Intrinsics.areEqual(placeholder, this.placeholder)) {
            this.placeholder = placeholder;
            setHint(placeholder);
        }
        updatePlaceholderEllipsize();
    }

    public final void setReturnKeyType(String str) {
        this.returnKeyType = str;
        updateImeOptions();
    }

    public final void setScrollWatcher(ScrollWatcher scrollWatcher) {
        this.scrollWatcher = scrollWatcher;
    }

    public final void setSelectTextOnFocus(boolean selectTextOnFocus) {
        super.setSelectAllOnFocus(selectTextOnFocus);
        this.selectTextOnFocus = selectTextOnFocus;
    }

    @Override // android.widget.EditText
    public void setSelection(int start, int end) {
        if (DEBUG_MODE) {
            String str = this.TAG;
            StringBuilder sbR = e.r(getId(), "setSelection[", start, "]: ", " ");
            sbR.append(end);
            o8.a.g(str, sbR.toString());
        }
        super.setSelection(start, end);
    }

    public final void setSelectionWatcher$ReactAndroid_release(SelectionWatcher selectionWatcher) {
        this.selectionWatcher = selectionWatcher;
    }

    public final void setSettingTextFromJS(boolean z5) {
        this.isSettingTextFromJS = z5;
    }

    public final void setSettingTextFromState(boolean z5) {
        this.isSettingTextFromState = z5;
    }

    public final void setStagedAutoCapitalize$ReactAndroid_release(int i7) {
        this.stagedAutoCapitalize = i7;
    }

    public final void setStagedInputType(int i7) {
        this.stagedInputType = i7;
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
    }

    public final void setSubmitBehavior(String str) {
        this.submitBehavior = str;
    }

    public final boolean shouldBlurOnReturn() {
        String str = this.submitBehavior;
        if (str == null) {
            return !isMultiline$ReactAndroid_release();
        }
        return Intrinsics.areEqual(str, "blurAndSubmit");
    }

    public final boolean shouldSubmitOnReturn() {
        String str = this.submitBehavior;
        if (str == null) {
            return !isMultiline$ReactAndroid_release();
        }
        return Intrinsics.areEqual(str, "submit") || Intrinsics.areEqual(str, "blurAndSubmit");
    }

    public final boolean showSoftKeyboard() {
        return this.inputMethodManager.showSoftInput(this, 0);
    }

    public final void setBorderRadius(float borderRadius, int position) {
        BackgroundStyleApplicator.setBorderRadius(this, (BorderRadiusProp) BorderRadiusProp.getEntries().get(position), Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(borderRadius), LengthPercentageType.POINT));
    }

    private final void maybeSetSelection(int start, int end) {
        if (start == -1 || end == -1) {
            return;
        }
        setSelection(clampToTextLength(start), clampToTextLength(end));
    }
}
