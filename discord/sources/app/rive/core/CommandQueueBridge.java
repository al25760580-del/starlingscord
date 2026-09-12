package app.rive.core;

import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J(\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J(\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000bH&J \u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J \u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH&J(\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000bH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H&J \u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H&J \u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H&J(\u0010$\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J(\u0010%\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J0\u0010&\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u000bH&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H&J \u0010,\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H&J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H&J \u00101\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u00102\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&Jp\u00103\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000207H&Jx\u0010?\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u0002072\u0006\u0010@\u001a\u00020!H&J \u0010A\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J \u0010B\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J(\u0010C\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010D\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010E\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J(\u0010F\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J \u0010G\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J(\u0010H\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010I\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J \u0010J\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J(\u0010K\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010L\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u000bH&J \u0010N\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J(\u0010O\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u000bH&J0\u0010P\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010Q\u001a\u0002072\u0006\u0010\f\u001a\u00020\u0005H&J \u0010R\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H&J(\u0010S\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u000bH&J(\u0010T\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u000bH&J0\u0010U\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH&JX\u0010V\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010W\u001a\u00020=2\u0006\u0010X\u001a\u00020=2\u0006\u0010Y\u001a\u00020=2\u0006\u0010Z\u001a\u0002072\u0006\u0010[\u001a\u00020=2\u0006\u0010\\\u001a\u00020=H&JX\u0010]\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010W\u001a\u00020=2\u0006\u0010X\u001a\u00020=2\u0006\u0010Y\u001a\u00020=2\u0006\u0010Z\u001a\u0002072\u0006\u0010[\u001a\u00020=2\u0006\u0010\\\u001a\u00020=H&JX\u0010^\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010W\u001a\u00020=2\u0006\u0010X\u001a\u00020=2\u0006\u0010Y\u001a\u00020=2\u0006\u0010Z\u001a\u0002072\u0006\u0010[\u001a\u00020=2\u0006\u0010\\\u001a\u00020=H&JX\u0010_\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010W\u001a\u00020=2\u0006\u0010X\u001a\u00020=2\u0006\u0010Y\u001a\u00020=2\u0006\u0010Z\u001a\u0002072\u0006\u0010[\u001a\u00020=2\u0006\u0010\\\u001a\u00020=H&J\u0010\u0010`\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J0\u0010a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010b\u001a\u00020\u000b2\u0006\u0010Q\u001a\u000207H&J(\u0010c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010b\u001a\u00020\u000bH&J \u0010d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0005H&J \u0010e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0005H&J \u0010f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0005H&J(\u0010g\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J(\u0010h\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010Q\u001a\u000207H&J\u0018\u0010i\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J0\u0010j\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u0010<\u001a\u00020=H&J\u001e\u0010k\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030mH&J(\u0010n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0005H&J(\u0010o\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020qH&J(\u0010r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010p\u001a\u000207H&J(\u0010s\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020\u000bH&J(\u0010t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0005H&J(\u0010u\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020=H&J(\u0010v\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020\u000bH&J\u0018\u0010w\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010x\u001a\u00020qH&J(\u0010y\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010z\u001a\u00020\u0005H&J(\u0010{\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010|\u001a\u000207H&J0\u0010}\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010~\u001a\u0002072\u0006\u0010\u007f\u001a\u000207H&J\u0019\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000bH&J\u0019\u0010\u0081\u0001\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000bH&J\u0019\u0010\u0082\u0001\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000bH&J\u0011\u0010\u0083\u0001\u001a\u00020q2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0084\u0001"}, d2 = {"Lapp/rive/core/CommandQueueBridge;", "", "cppAdvanceStateMachine", "", "pointer", "", "stateMachineHandle", "deltaTimeNs", "cppAppendToList", "viewModelInstanceHandle", "propertyPath", "", "itemHandle", "cppBindViewModelInstance", "requestID", "cppCancelDraw", "drawKey", "cppConstructor", "renderContextPointer", "cppCreateArtboardByName", "fileHandle", StackTraceHelper.NAME_KEY, "cppCreateDefaultArtboard", "cppCreateDefaultStateMachine", "artboardHandle", "cppCreateDrawKey", "cppCreateListeners", "Lapp/rive/core/Listeners;", "receiver", "Lapp/rive/core/CommandQueue;", "cppCreateStateMachineByName", "cppDecodeAudio", "bytes", "", "cppDecodeFont", "cppDecodeImage", "cppDefaultVMCreateBlankVMI", "cppDefaultVMCreateDefaultVMI", "cppDefaultVMCreateNamedVMI", "instanceName", "cppDelete", "cppDeleteArtboard", "cppDeleteAudio", "audioHandle", "cppDeleteFile", "cppDeleteFont", "fontHandle", "cppDeleteImage", "imageHandle", "cppDeleteStateMachine", "cppDeleteViewModelInstance", "cppDraw", "surfaceNativePointer", "renderTargetPointer", "width", "", "height", "fit", "", "alignment", "scaleFactor", "", "clearColor", "cppDrawToBuffer", "buffer", "cppFireTriggerProperty", "cppGetArtboardNames", "cppGetBooleanProperty", "cppGetColorProperty", "cppGetDefaultViewModelInfo", "cppGetEnumProperty", "cppGetEnums", "cppGetListSize", "cppGetNumberProperty", "cppGetStateMachineNames", "cppGetStringProperty", "cppGetViewModelInstanceNames", "viewModelName", "cppGetViewModelNames", "cppGetViewModelProperties", "cppInsertToListAtIndex", "index", "cppLoadFile", "cppNamedVMCreateBlankVMI", "cppNamedVMCreateDefaultVMI", "cppNamedVMCreateNamedVMI", "cppPointerDown", "layoutScale", "surfaceWidth", "surfaceHeight", "pointerID", "x", "y", "cppPointerExit", "cppPointerMove", "cppPointerUp", "cppPollMessages", "cppReferenceListItemVMI", "path", "cppReferenceNestedVMI", "cppRegisterAudio", "cppRegisterFont", "cppRegisterImage", "cppRemoveFromList", "cppRemoveFromListAtIndex", "cppResetArtboardSize", "cppResizeArtboard", "cppRunOnCommandServer", "work", "Lkotlin/Function0;", "cppSetArtboardProperty", "cppSetBooleanProperty", "value", "", "cppSetColorProperty", "cppSetEnumProperty", "cppSetImageProperty", "cppSetNumberProperty", "cppSetStringProperty", "cppSetTracingEnabled", ViewProps.ENABLED, "cppSetViewModelInstanceProperty", "valueHandle", "cppSubscribeToProperty", "propertyType", "cppSwapListItems", "indexA", "indexB", "cppUnregisterAudio", "cppUnregisterFont", "cppUnregisterImage", "isCurrentThreadCommandServer", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CommandQueueBridge {
    void cppAdvanceStateMachine(long pointer, long stateMachineHandle, long deltaTimeNs);

    void cppAppendToList(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long itemHandle);

    void cppBindViewModelInstance(long pointer, long requestID, long stateMachineHandle, long viewModelInstanceHandle);

    void cppCancelDraw(long pointer, long drawKey);

    long cppConstructor(long renderContextPointer);

    long cppCreateArtboardByName(long pointer, long requestID, long fileHandle, @NotNull String name);

    long cppCreateDefaultArtboard(long pointer, long requestID, long fileHandle);

    long cppCreateDefaultStateMachine(long pointer, long requestID, long artboardHandle);

    long cppCreateDrawKey(long pointer);

    @NotNull
    Listeners cppCreateListeners(long pointer, @NotNull CommandQueue receiver);

    long cppCreateStateMachineByName(long pointer, long requestID, long artboardHandle, @NotNull String name);

    void cppDecodeAudio(long pointer, long requestID, @NotNull byte[] bytes);

    void cppDecodeFont(long pointer, long requestID, @NotNull byte[] bytes);

    void cppDecodeImage(long pointer, long requestID, @NotNull byte[] bytes);

    long cppDefaultVMCreateBlankVMI(long pointer, long requestID, long fileHandle, long artboardHandle);

    long cppDefaultVMCreateDefaultVMI(long pointer, long requestID, long fileHandle, long artboardHandle);

    long cppDefaultVMCreateNamedVMI(long pointer, long requestID, long fileHandle, long artboardHandle, @NotNull String instanceName);

    void cppDelete(long pointer);

    void cppDeleteArtboard(long pointer, long requestID, long artboardHandle);

    void cppDeleteAudio(long pointer, long audioHandle);

    void cppDeleteFile(long pointer, long requestID, long fileHandle);

    void cppDeleteFont(long pointer, long fontHandle);

    void cppDeleteImage(long pointer, long imageHandle);

    void cppDeleteStateMachine(long pointer, long requestID, long stateMachineHandle);

    void cppDeleteViewModelInstance(long pointer, long requestID, long viewModelInstanceHandle);

    void cppDraw(long pointer, long renderContextPointer, long surfaceNativePointer, long drawKey, long artboardHandle, long stateMachineHandle, long renderTargetPointer, int width, int height, byte fit, byte alignment, float scaleFactor, int clearColor);

    void cppDrawToBuffer(long pointer, long renderContextPointer, long surfaceNativePointer, long drawKey, long artboardHandle, long stateMachineHandle, long renderTargetPointer, int width, int height, byte fit, byte alignment, float scaleFactor, int clearColor, @NotNull byte[] buffer);

    void cppFireTriggerProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath);

    void cppGetArtboardNames(long pointer, long requestID, long fileHandle);

    void cppGetBooleanProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    void cppGetColorProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    void cppGetDefaultViewModelInfo(long pointer, long requestID, long fileHandle, long artboardHandle);

    void cppGetEnumProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    void cppGetEnums(long pointer, long requestID, long fileHandle);

    void cppGetListSize(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    void cppGetNumberProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    void cppGetStateMachineNames(long pointer, long requestID, long artboardHandle);

    void cppGetStringProperty(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String propertyPath);

    void cppGetViewModelInstanceNames(long pointer, long requestID, long fileHandle, @NotNull String viewModelName);

    void cppGetViewModelNames(long pointer, long requestID, long fileHandle);

    void cppGetViewModelProperties(long pointer, long requestID, long fileHandle, @NotNull String viewModelName);

    void cppInsertToListAtIndex(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int index, long itemHandle);

    void cppLoadFile(long pointer, long requestID, @NotNull byte[] bytes);

    long cppNamedVMCreateBlankVMI(long pointer, long requestID, long fileHandle, @NotNull String viewModelName);

    long cppNamedVMCreateDefaultVMI(long pointer, long requestID, long fileHandle, @NotNull String viewModelName);

    long cppNamedVMCreateNamedVMI(long pointer, long requestID, long fileHandle, @NotNull String viewModelName, @NotNull String instanceName);

    void cppPointerDown(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x5, float y5);

    void cppPointerExit(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x5, float y5);

    void cppPointerMove(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x5, float y5);

    void cppPointerUp(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x5, float y5);

    void cppPollMessages(long pointer);

    long cppReferenceListItemVMI(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String path, int index);

    long cppReferenceNestedVMI(long pointer, long requestID, long viewModelInstanceHandle, @NotNull String path);

    void cppRegisterAudio(long pointer, @NotNull String name, long audioHandle);

    void cppRegisterFont(long pointer, @NotNull String name, long fontHandle);

    void cppRegisterImage(long pointer, @NotNull String name, long imageHandle);

    void cppRemoveFromList(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long itemHandle);

    void cppRemoveFromListAtIndex(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int index);

    void cppResetArtboardSize(long pointer, long artboardHandle);

    void cppResizeArtboard(long pointer, long artboardHandle, int width, int height, float scaleFactor);

    void cppRunOnCommandServer(long pointer, @NotNull Function0<Unit> work);

    void cppSetArtboardProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long artboardHandle);

    void cppSetBooleanProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, boolean value);

    void cppSetColorProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int value);

    void cppSetEnumProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, @NotNull String value);

    void cppSetImageProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long imageHandle);

    void cppSetNumberProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, float value);

    void cppSetStringProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, @NotNull String value);

    void cppSetTracingEnabled(long pointer, boolean enabled);

    void cppSetViewModelInstanceProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, long valueHandle);

    void cppSubscribeToProperty(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int propertyType);

    void cppSwapListItems(long pointer, long viewModelInstanceHandle, @NotNull String propertyPath, int indexA, int indexB);

    void cppUnregisterAudio(long pointer, @NotNull String name);

    void cppUnregisterFont(long pointer, @NotNull String name);

    void cppUnregisterImage(long pointer, @NotNull String name);

    boolean isCurrentThreadCommandServer(long pointer);
}
