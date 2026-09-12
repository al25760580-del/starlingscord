package app.rive;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0087\bø\u0001\u0000J0\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0087\bø\u0001\u0000J$\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0087\bø\u0001\u0000J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J$\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0087\bø\u0001\u0000J$\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0087\bø\u0001\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lapp/rive/RiveLog;", "", "()V", "logger", "Lapp/rive/RiveLog$Logger;", "getLogger", "()Lapp/rive/RiveLog$Logger;", "setLogger", "(Lapp/rive/RiveLog$Logger;)V", "d", "", "tag", "", "msg", "Lkotlin/Function0;", "e", "t", "", "i", "logD", "logE", "logI", "logV", "logW", "v", "w", "LogcatLogger", "Logger", "NoOpLogger", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveLog {

    @NotNull
    public static final RiveLog INSTANCE = new RiveLog();

    @NotNull
    private static volatile Logger logger = NoOpLogger.INSTANCE;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\u000f"}, d2 = {"Lapp/rive/RiveLog$LogcatLogger;", "Lapp/rive/RiveLog$Logger;", "()V", "d", "", "tag", "", "msg", "Lkotlin/Function0;", "e", "t", "", "i", "v", "w", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogcatLogger implements Logger {
        public static final int $stable = 0;

        @Override // app.rive.RiveLog.Logger
        public void d(@NotNull String tag, @NotNull Function0<String> msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.d(tag, (String) msg.invoke());
        }

        @Override // app.rive.RiveLog.Logger
        public void e(@NotNull String tag, Throwable t5, @NotNull Function0<String> msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.e(tag, (String) msg.invoke(), t5);
        }

        @Override // app.rive.RiveLog.Logger
        public void i(@NotNull String tag, @NotNull Function0<String> msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.i(tag, (String) msg.invoke());
        }

        @Override // app.rive.RiveLog.Logger
        public void v(@NotNull String tag, @NotNull Function0<String> msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.v(tag, (String) msg.invoke());
        }

        @Override // app.rive.RiveLog.Logger
        public void w(@NotNull String tag, @NotNull Function0<String> msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.w(tag, (String) msg.invoke());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J*\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u001e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lapp/rive/RiveLog$Logger;", "", "d", "", "tag", "", "msg", "Lkotlin/Function0;", "e", "t", "", "i", "v", "w", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Logger {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void d(@NotNull Logger logger, @NotNull String tag, @NotNull Function0<String> msg) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            public static void e(@NotNull Logger logger, @NotNull String tag, Throwable th2, @NotNull Function0<String> msg) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            public static /* synthetic */ void e$default(Logger logger, String str, Throwable th2, Function0 function0, int i7, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
                }
                if ((i7 & 2) != 0) {
                    th2 = null;
                }
                logger.e(str, th2, function0);
            }

            public static void i(@NotNull Logger logger, @NotNull String tag, @NotNull Function0<String> msg) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            public static void v(@NotNull Logger logger, @NotNull String tag, @NotNull Function0<String> msg) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            public static void w(@NotNull Logger logger, @NotNull String tag, @NotNull Function0<String> msg) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
            }
        }

        void d(@NotNull String tag, @NotNull Function0<String> msg);

        void e(@NotNull String tag, Throwable t5, @NotNull Function0<String> msg);

        void i(@NotNull String tag, @NotNull Function0<String> msg);

        void v(@NotNull String tag, @NotNull Function0<String> msg);

        void w(@NotNull String tag, @NotNull Function0<String> msg);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lapp/rive/RiveLog$NoOpLogger;", "Lapp/rive/RiveLog$Logger;", "()V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoOpLogger implements Logger {
        public static final int $stable = 0;

        @NotNull
        public static final NoOpLogger INSTANCE = new NoOpLogger();

        private NoOpLogger() {
        }

        @Override // app.rive.RiveLog.Logger
        public void d(@NotNull String str, @NotNull Function0<String> function0) {
            Logger.DefaultImpls.d(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public void e(@NotNull String str, Throwable th2, @NotNull Function0<String> function0) {
            Logger.DefaultImpls.e(this, str, th2, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public void i(@NotNull String str, @NotNull Function0<String> function0) {
            Logger.DefaultImpls.i(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public void v(@NotNull String str, @NotNull Function0<String> function0) {
            Logger.DefaultImpls.v(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public void w(@NotNull String str, @NotNull Function0<String> function0) {
            Logger.DefaultImpls.w(this, str, function0);
        }
    }

    private RiveLog() {
    }

    public static final void d(@NotNull String tag, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.getLogger().d(tag, msg);
    }

    public static final void e(@NotNull String tag, Throwable t5, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.getLogger().e(tag, t5, msg);
    }

    public static /* synthetic */ void e$default(String tag, Throwable th2, Function0 msg, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th2 = null;
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.getLogger().e(tag, th2, msg);
    }

    public static final void i(@NotNull String tag, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.getLogger().i(tag, msg);
    }

    public static final void logD(@NotNull String tag, @NotNull final String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        logger.d(tag, new Function0<String>() { // from class: app.rive.RiveLog.logD.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return msg;
            }
        });
    }

    public static final void logE(@NotNull String tag, @NotNull final String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        logger.e(tag, null, new Function0<String>() { // from class: app.rive.RiveLog.logE.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return msg;
            }
        });
    }

    public static final void logI(@NotNull String tag, @NotNull final String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        logger.i(tag, new Function0<String>() { // from class: app.rive.RiveLog.logI.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return msg;
            }
        });
    }

    public static final void logV(@NotNull String tag, @NotNull final String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        logger.v(tag, new Function0<String>() { // from class: app.rive.RiveLog.logV.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return msg;
            }
        });
    }

    public static final void logW(@NotNull String tag, @NotNull final String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        logger.w(tag, new Function0<String>() { // from class: app.rive.RiveLog.logW.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return msg;
            }
        });
    }

    public static final void v(@NotNull String tag, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.getLogger().v(tag, msg);
    }

    public static final void w(@NotNull String tag, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.getLogger().w(tag, msg);
    }

    @NotNull
    public final Logger getLogger() {
        return logger;
    }

    public final void setLogger(@NotNull Logger logger2) {
        Intrinsics.checkNotNullParameter(logger2, "<set-?>");
        logger = logger2;
    }
}
