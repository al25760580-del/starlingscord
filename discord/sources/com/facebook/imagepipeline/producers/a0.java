package com.facebook.imagepipeline.producers;

import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f4940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f4941e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0 f4942i;

    public a0(d0 d0Var, c0 c0Var, v0 v0Var) {
        this.f4942i = d0Var;
        this.f4940d = c0Var;
        this.f4941e = v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:39:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.imagepipeline.producers.v0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream, java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnectionA;
        d0 d0Var = this.f4942i;
        c0 c0Var = this.f4940d;
        ?? r5 = this.f4941e;
        ?? inputStream = 0;
        ?? r6 = 0;
        inputStream = 0;
        try {
            try {
                httpURLConnectionA = d0Var.a(c0Var.f4935b.g().getSourceUri(), 5);
                try {
                    c0Var.f4955g = d0Var.f4964c.now();
                    if (httpURLConnectionA != null) {
                        inputStream = httpURLConnectionA.getInputStream();
                        r5.b(inputStream, -1);
                    }
                    if (r6 != 0) {
                        try {
                            r6 = inputStream;
                            r6.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionA == null) {
                        return;
                    }
                } catch (IOException e10) {
                    e = e10;
                    r5.onFailure(e);
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionA == null) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (0 != 0) {
                    throw th;
                }
                inputStream.disconnect();
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            httpURLConnectionA = null;
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                inputStream.close();
            }
            if (0 != 0) {
                throw th;
            }
            inputStream.disconnect();
            throw th;
        }
        httpURLConnectionA.disconnect();
    }
}
