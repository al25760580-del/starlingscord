package app.rive.core;

import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096 J)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0096 J)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096 J\u0019\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0096 J\u0011\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0096 J)\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0096 J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0096 J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0096 J\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0096 J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH\u0096 J)\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0096 J!\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0096 J!\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0096 J!\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0096 J)\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0096 J)\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0096 J1\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\fH\u0096 J\u0011\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096 J!\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0096 J\u0019\u0010+\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0096 J!\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0096 J\u0019\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0096 J\u0019\u00100\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0096 J!\u00102\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096 J!\u00103\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096 Jq\u00104\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000208H\u0096 Jy\u0010@\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u0002082\u0006\u0010A\u001a\u00020\"H\u0096 J!\u0010B\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096 J!\u0010C\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0096 J)\u0010D\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096 J)\u0010E\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096 J)\u0010F\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0096 J)\u0010G\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096 J!\u0010H\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0096 J)\u0010I\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096 J)\u0010J\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096 J!\u0010K\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0096 J)\u0010L\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096 J)\u0010M\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\fH\u0096 J!\u0010O\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0096 J)\u0010P\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\fH\u0096 J1\u0010Q\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010R\u001a\u0002082\u0006\u0010\r\u001a\u00020\u0006H\u0096 J!\u0010S\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0096 J)\u0010T\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\fH\u0096 J)\u0010U\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\fH\u0096 J1\u0010V\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0096 JY\u0010W\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010X\u001a\u00020>2\u0006\u0010Y\u001a\u00020>2\u0006\u0010Z\u001a\u00020>2\u0006\u0010[\u001a\u0002082\u0006\u0010\\\u001a\u00020>2\u0006\u0010]\u001a\u00020>H\u0096 JY\u0010^\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010X\u001a\u00020>2\u0006\u0010Y\u001a\u00020>2\u0006\u0010Z\u001a\u00020>2\u0006\u0010[\u001a\u0002082\u0006\u0010\\\u001a\u00020>2\u0006\u0010]\u001a\u00020>H\u0096 JY\u0010_\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010X\u001a\u00020>2\u0006\u0010Y\u001a\u00020>2\u0006\u0010Z\u001a\u00020>2\u0006\u0010[\u001a\u0002082\u0006\u0010\\\u001a\u00020>2\u0006\u0010]\u001a\u00020>H\u0096 JY\u0010`\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010X\u001a\u00020>2\u0006\u0010Y\u001a\u00020>2\u0006\u0010Z\u001a\u00020>2\u0006\u0010[\u001a\u0002082\u0006\u0010\\\u001a\u00020>2\u0006\u0010]\u001a\u00020>H\u0096 J\u0011\u0010a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096 J1\u0010b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\f2\u0006\u0010R\u001a\u000208H\u0096 J)\u0010d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\fH\u0096 J!\u0010e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0006H\u0096 J!\u0010f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0006H\u0096 J!\u0010g\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0006H\u0096 J)\u0010h\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0096 J)\u0010i\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010R\u001a\u000208H\u0096 J\u0019\u0010j\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0096 J1\u0010k\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010=\u001a\u00020>H\u0096 J\u001f\u0010l\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00040nH\u0096 J)\u0010o\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0006H\u0096 J)\u0010p\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010q\u001a\u00020rH\u0096 J)\u0010s\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010q\u001a\u000208H\u0096 J)\u0010t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010q\u001a\u00020\fH\u0096 J)\u0010u\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0006H\u0096 J)\u0010v\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010q\u001a\u00020>H\u0096 J)\u0010w\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010q\u001a\u00020\fH\u0096 J\u0019\u0010x\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010y\u001a\u00020rH\u0096 J)\u0010z\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010{\u001a\u00020\u0006H\u0096 J)\u0010|\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010}\u001a\u000208H\u0096 J2\u0010~\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u007f\u001a\u0002082\u0007\u0010\u0080\u0001\u001a\u000208H\u0096 J\u001a\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0096 J\u001a\u0010\u0082\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0096 J\u001a\u0010\u0083\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0096 J\u0012\u0010\u0084\u0001\u001a\u00020r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0096 ¨\u0006\u0085\u0001"}, d2 = {"Lapp/rive/core/CommandQueueJNIBridge;", "Lapp/rive/core/CommandQueueBridge;", "()V", "cppAdvanceStateMachine", "", "pointer", "", "stateMachineHandle", "deltaTimeNs", "cppAppendToList", "viewModelInstanceHandle", "propertyPath", "", "itemHandle", "cppBindViewModelInstance", "requestID", "cppCancelDraw", "drawKey", "cppConstructor", "renderContextPointer", "cppCreateArtboardByName", "fileHandle", StackTraceHelper.NAME_KEY, "cppCreateDefaultArtboard", "cppCreateDefaultStateMachine", "artboardHandle", "cppCreateDrawKey", "cppCreateListeners", "Lapp/rive/core/Listeners;", "receiver", "Lapp/rive/core/CommandQueue;", "cppCreateStateMachineByName", "cppDecodeAudio", "bytes", "", "cppDecodeFont", "cppDecodeImage", "cppDefaultVMCreateBlankVMI", "cppDefaultVMCreateDefaultVMI", "cppDefaultVMCreateNamedVMI", "instanceName", "cppDelete", "cppDeleteArtboard", "cppDeleteAudio", "audioHandle", "cppDeleteFile", "cppDeleteFont", "fontHandle", "cppDeleteImage", "imageHandle", "cppDeleteStateMachine", "cppDeleteViewModelInstance", "cppDraw", "surfaceNativePointer", "renderTargetPointer", "width", "", "height", "fit", "", "alignment", "scaleFactor", "", "clearColor", "cppDrawToBuffer", "buffer", "cppFireTriggerProperty", "cppGetArtboardNames", "cppGetBooleanProperty", "cppGetColorProperty", "cppGetDefaultViewModelInfo", "cppGetEnumProperty", "cppGetEnums", "cppGetListSize", "cppGetNumberProperty", "cppGetStateMachineNames", "cppGetStringProperty", "cppGetViewModelInstanceNames", "viewModelName", "cppGetViewModelNames", "cppGetViewModelProperties", "cppInsertToListAtIndex", "index", "cppLoadFile", "cppNamedVMCreateBlankVMI", "cppNamedVMCreateDefaultVMI", "cppNamedVMCreateNamedVMI", "cppPointerDown", "layoutScale", "surfaceWidth", "surfaceHeight", "pointerID", "x", "y", "cppPointerExit", "cppPointerMove", "cppPointerUp", "cppPollMessages", "cppReferenceListItemVMI", "path", "cppReferenceNestedVMI", "cppRegisterAudio", "cppRegisterFont", "cppRegisterImage", "cppRemoveFromList", "cppRemoveFromListAtIndex", "cppResetArtboardSize", "cppResizeArtboard", "cppRunOnCommandServer", "work", "Lkotlin/Function0;", "cppSetArtboardProperty", "cppSetBooleanProperty", "value", "", "cppSetColorProperty", "cppSetEnumProperty", "cppSetImageProperty", "cppSetNumberProperty", "cppSetStringProperty", "cppSetTracingEnabled", ViewProps.ENABLED, "cppSetViewModelInstanceProperty", "valueHandle", "cppSubscribeToProperty", "propertyType", "cppSwapListItems", "indexA", "indexB", "cppUnregisterAudio", "cppUnregisterFont", "cppUnregisterImage", "isCurrentThreadCommandServer", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CommandQueueJNIBridge implements CommandQueueBridge {
    public static final int $stable = 0;

    @Override // app.rive.core.CommandQueueBridge
    public native void cppAdvanceStateMachine(long pointer, long stateMachineHandle, long deltaTimeNs);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppAppendToList(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long itemHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppBindViewModelInstance(long pointer, long requestID, long stateMachineHandle, long viewModelInstanceHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppCancelDraw(long pointer, long drawKey);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppConstructor(long renderContextPointer);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateArtboardByName(long pointer, long requestID, long fileHandle, @NotNull String name);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateDefaultArtboard(long pointer, long requestID, long fileHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateDefaultStateMachine(long pointer, long requestID, long artboardHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateDrawKey(long pointer);

    @Override // app.rive.core.CommandQueueBridge
    @NotNull
    public native Listeners cppCreateListeners(long pointer, @NotNull CommandQueue receiver);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateStateMachineByName(long pointer, long requestID, long artboardHandle, @NotNull String name);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDecodeAudio(long pointer, long requestID, @NotNull byte[] bytes);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDecodeFont(long pointer, long requestID, @NotNull byte[] bytes);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDecodeImage(long pointer, long requestID, @NotNull byte[] bytes);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateBlankVMI(long pointer, long requestID, long fileHandle, long artboardHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateDefaultVMI(long pointer, long requestID, long fileHandle, long artboardHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateNamedVMI(long pointer, long requestID, long fileHandle, long artboardHandle, @NotNull String instanceName);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDelete(long pointer);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteArtboard(long pointer, long requestID, long artboardHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteAudio(long pointer, long audioHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteFile(long pointer, long requestID, long fileHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteFont(long pointer, long fontHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteImage(long pointer, long imageHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteStateMachine(long pointer, long requestID, long stateMachineHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteViewModelInstance(long pointer, long requestID, long viewModelInstanceHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDraw(long pointer, long renderContextPointer, long surfaceNativePointer, long drawKey, long artboardHandle, long stateMachineHandle, long renderTargetPointer, int width, int height, byte fit, byte alignment, float scaleFactor, int clearColor);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDrawToBuffer(long pointer, long renderContextPointer, long surfaceNativePointer, long drawKey, long artboardHandle, long stateMachineHandle, long renderTargetPointer, int width, int height, byte fit, byte alignment, float scaleFactor, int clearColor, @NotNull byte[] buffer);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppFireTriggerProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetArtboardNames(long pointer, long requestID, long fileHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetBooleanProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetColorProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetDefaultViewModelInfo(long pointer, long requestID, long fileHandle, long artboardHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetEnumProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetEnums(long pointer, long requestID, long fileHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetListSize(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetNumberProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetStateMachineNames(long pointer, long requestID, long artboardHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetStringProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetViewModelInstanceNames(long pointer, long requestID, long fileHandle, @NotNull String viewModelName);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetViewModelNames(long pointer, long requestID, long fileHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetViewModelProperties(long pointer, long requestID, long fileHandle, @NotNull String viewModelName);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppInsertToListAtIndex(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int index, long itemHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppLoadFile(long pointer, long requestID, @NotNull byte[] bytes);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppNamedVMCreateBlankVMI(long pointer, long requestID, long fileHandle, @NotNull String viewModelName);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppNamedVMCreateDefaultVMI(long pointer, long requestID, long fileHandle, @NotNull String viewModelName);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppNamedVMCreateNamedVMI(long pointer, long requestID, long fileHandle, @NotNull String viewModelName, @NotNull String instanceName);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPointerDown(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x5, float y5);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPointerExit(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x5, float y5);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPointerMove(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x5, float y5);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPointerUp(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x5, float y5);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPollMessages(long pointer);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppReferenceListItemVMI(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String path, int index);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppReferenceNestedVMI(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String path);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRegisterAudio(long pointer, @NotNull String name, long audioHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRegisterFont(long pointer, @NotNull String name, long fontHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRegisterImage(long pointer, @NotNull String name, long imageHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRemoveFromList(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long itemHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRemoveFromListAtIndex(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int index);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppResetArtboardSize(long pointer, long artboardHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppResizeArtboard(long pointer, long artboardHandle, int width, int height, float scaleFactor);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRunOnCommandServer(long pointer, @NotNull Function0<Unit> work);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetArtboardProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long artboardHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetBooleanProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, boolean value);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetColorProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int value);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetEnumProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, @NotNull String value);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetImageProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long imageHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetNumberProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, float value);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetStringProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, @NotNull String value);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetTracingEnabled(long pointer, boolean enabled);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetViewModelInstanceProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long valueHandle);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSubscribeToProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int propertyType);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSwapListItems(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int indexA, int indexB);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppUnregisterAudio(long pointer, @NotNull String name);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppUnregisterFont(long pointer, @NotNull String name);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppUnregisterImage(long pointer, @NotNull String name);

    @Override // app.rive.core.CommandQueueBridge
    public native boolean isCurrentThreadCommandServer(long pointer);
}
