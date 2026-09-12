package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f12035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c1 f12036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ILogger f12037g;

    public a0(x0 x0Var, c1 c1Var, ILogger iLogger, long j, int i7) {
        super(x0Var, iLogger, j, i7);
        com.facebook.imagepipeline.nativecode.c.H(x0Var, "Scopes are required.");
        this.f12035e = x0Var;
        com.facebook.imagepipeline.nativecode.c.H(c1Var, "Serializer is required.");
        this.f12036f = c1Var;
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "Logger is required.");
        this.f12037g = iLogger;
    }

    public static void c(a0 a0Var, File file, io.sentry.hints.h hVar) {
        ILogger iLogger = a0Var.f12037g;
        if (hVar.a()) {
            iLogger.q(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                iLogger.q(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th2) {
            iLogger.e(SentryLevel.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        iLogger.q(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.v
    public final boolean a(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        c(r8, r9, (io.sentry.hints.h) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0160, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
    
        return;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:339)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:591)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // io.sentry.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.io.File r9, io.sentry.Hint r10) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.a0.b(java.io.File, io.sentry.Hint):void");
    }
}
