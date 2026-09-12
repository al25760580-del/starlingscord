package cr;

import com.discord.age_assurance.DigitalCredentialModule;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f7365a = new o(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7366b = fr.h.j(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7367c = fr.h.j(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a5.h f7368d = new a5.h("BUFFERED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a5.h f7369e = new a5.h("SHOULD_BUFFER", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a5.h f7370f = new a5.h("S_RESUMING_BY_RCV", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a5.h f7371g = new a5.h("RESUMING_BY_EB", 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a5.h f7372h = new a5.h("POISONED", 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a5.h f7373i = new a5.h("DONE_RCV", 2);
    public static final a5.h j = new a5.h("INTERRUPTED_SEND", 2);
    public static final a5.h k = new a5.h("INTERRUPTED_RCV", 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a5.h f7374l = new a5.h("CHANNEL_CLOSED", 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a5.h f7375m = new a5.h("SUSPEND", 2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a5.h f7376n = new a5.h("SUSPEND_NO_WAITER", 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a5.h f7377o = new a5.h(DigitalCredentialModule.CODE_FAILED, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a5.h f7378p = new a5.h("NO_RECEIVE_RESULT", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a5.h f7379q = new a5.h("CLOSE_HANDLER_CLOSED", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a5.h f7380r = new a5.h("CLOSE_HANDLER_INVOKED", 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a5.h f7381s = new a5.h("NO_CLOSE_CAUSE", 2);

    public static final boolean a(CancellableContinuation cancellableContinuation, Object obj, Function3 function3) {
        a5.h hVarE = cancellableContinuation.e(obj, function3);
        if (hVarE == null) {
            return false;
        }
        cancellableContinuation.s(hVarE);
        return true;
    }
}
