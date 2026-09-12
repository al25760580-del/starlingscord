package com.margelo.nitro.rive;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import app.rive.runtime.kotlin.core.AudioAsset;
import app.rive.runtime.kotlin.core.FileAsset;
import app.rive.runtime.kotlin.core.FontAsset;
import app.rive.runtime.kotlin.core.ImageAsset;
import app.rive.runtime.kotlin.core.RiveAudio;
import app.rive.runtime.kotlin.core.RiveFont;
import app.rive.runtime.kotlin.core.RiveRenderImage;
import com.reactnativecommunity.clipboard.ClipboardModule;
import id.zelory.compressor.constraint.Compression;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6992e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6993i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f6995w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i7) {
        super(2, continuation);
        this.f6991d = i7;
        this.f6992e = obj;
        this.f6993i = obj2;
        this.f6994v = obj3;
        this.f6995w = obj4;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation completion) {
        switch (this.f6991d) {
            case 0:
                return new w1((x1) this.f6992e, (byte[]) this.f6993i, (FileAsset) this.f6994v, (ar.p) this.f6995w, completion, 0);
            case 1:
                return new w1((Context) this.f6992e, (Uri) this.f6993i, (ol.g) this.f6994v, (ol.f) this.f6995w, completion, 1);
            default:
                Intrinsics.checkParameterIsNotNull(completion, "completion");
                w1 w1Var = new w1((Function1) this.f6993i, (Context) this.f6994v, (Uri) this.f6995w, completion);
                w1Var.f6992e = (CoroutineScope) obj;
                return w1Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6991d) {
            case 0:
                return ((w1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 1:
                return ((w1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            default:
                return ((w1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
        }
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objO;
        Object objO2;
        String str;
        int i7 = this.f6991d;
        Object obj2 = this.f6995w;
        Object obj3 = this.f6994v;
        Object obj4 = this.f6993i;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                byte[] bArr = (byte[]) obj4;
                FileAsset fileAsset = (FileAsset) obj3;
                if (fileAsset instanceof ImageAsset) {
                    ((ImageAsset) fileAsset).setImage(RiveRenderImage.Companion.fromEncoded$default(RiveRenderImage.INSTANCE, bArr, null, 2, null));
                } else if (fileAsset instanceof FontAsset) {
                    ((FontAsset) fileAsset).setFont(RiveFont.Companion.make$default(RiveFont.INSTANCE, bArr, null, 2, null));
                } else {
                    if (!(fileAsset instanceof AudioAsset)) {
                        throw new rn.n();
                    }
                    ((AudioAsset) fileAsset).setAudio(RiveAudio.Companion.make$default(RiveAudio.INSTANCE, bArr, null, 2, null));
                }
                return Boolean.valueOf(((ar.p) obj2).S(Unit.f14616a));
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                Context context = (Context) this.f6992e;
                ContentResolver contentResolver = context.getContentResolver();
                Uri bookmark = (Uri) obj4;
                ol.b bVar = new ol.b(bookmark);
                bVar.f17436d = contentResolver.getType(bookmark);
                ol.g gVar = (ol.g) obj3;
                if (gVar.f17459g) {
                    bVar.f17438f = contentResolver.getStreamTypes(bookmark, "*/*");
                }
                if (gVar.f17458f) {
                    try {
                        context.getContentResolver().takePersistableUriPermission(bookmark, 3);
                        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
                        bVar.f17439g = bookmark.toString();
                    } catch (Exception e10) {
                        String localizedMessage = e10.getLocalizedMessage();
                        if (localizedMessage == null && (localizedMessage = e10.getMessage()) == null) {
                            localizedMessage = "Unknown error with takePersistableUriPermission";
                        }
                        bVar.f17440h = localizedMessage;
                    }
                    break;
                }
                boolean z5 = gVar.f17459g && DocumentsContract.isDocumentUri(context, bookmark);
                Intrinsics.checkNotNull(contentResolver);
                ol.f.b(contentResolver, bVar, z5);
                return bVar;
            default:
                wn.a aVar3 = wn.a.f22354d;
                ib.a.L(obj);
                Compression compression = new Compression();
                ((Function1) obj4).invoke(compression);
                Context context2 = (Context) obj3;
                Uri uri = (Uri) obj2;
                String str2 = pn.b.f18056a;
                Intrinsics.checkParameterIsNotNull(context2, "context");
                Intrinsics.checkParameterIsNotNull(uri, "srcFileUri");
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                File cacheDir = context2.getCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(cacheDir, "context.cacheDir");
                sb3.append(cacheDir.getPath());
                String str3 = pn.b.f18056a;
                sb3.append(str3);
                sb3.append("compressor");
                sb3.append(str3);
                sb2.append(sb3.toString());
                Intrinsics.checkParameterIsNotNull(context2, "context");
                Intrinsics.checkParameterIsNotNull(uri, "uri");
                ContentResolver contentResolver2 = context2.getContentResolver();
                try {
                    rn.q qVar = Result.f14614e;
                    Cursor cursorQuery = contentResolver2.query(uri, new String[]{"_display_name"}, null, null, null);
                    if (cursorQuery == null) {
                        Intrinsics.throwNpe();
                    }
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            throw new IllegalStateException("Cursor is empty");
                        }
                        String it = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                        Intrinsics.checkExpressionValueIsNotNull(it, "it");
                        objO = StringsKt.K(it) ? null : it;
                        if (objO == null) {
                            Intrinsics.throwNpe();
                        }
                        cursorQuery.close();
                        if (Result.a(objO) != null) {
                            try {
                                String str4 = "IMG_" + new SimpleDateFormat("yyyyMMdd_", Locale.getDefault()).format(new Date()) + System.nanoTime();
                                String type = contentResolver2.getType(uri);
                                if (Intrinsics.areEqual(type, ClipboardModule.MIMETYPE_JPG) || Intrinsics.areEqual(type, ClipboardModule.MIMETYPE_JPEG)) {
                                    str = "jpg";
                                } else if (Intrinsics.areEqual(type, ClipboardModule.MIMETYPE_PNG)) {
                                    str = "png";
                                } else {
                                    if (!Intrinsics.areEqual(type, ClipboardModule.MIMETYPE_WEBP)) {
                                        throw new IllegalArgumentException("Cannot generate fallback filename for " + type + ' ' + uri);
                                    }
                                    str = "webp";
                                }
                                objO2 = str4 + '.' + str;
                            } catch (Throwable th2) {
                                rn.q qVar2 = Result.f14614e;
                                objO2 = ib.a.o(th2);
                            }
                            objO = objO2;
                        }
                        ib.a.L(objO);
                        sb2.append((String) objO);
                        File file = new File(sb2.toString());
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        if (file.exists()) {
                            file.delete();
                        }
                        file.createNewFile();
                        file.deleteOnExit();
                        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(context2.getContentResolver().openFileDescriptor(uri, "r"));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            try {
                                m3.m.k(autoCloseInputStream, fileOutputStream, 8192);
                                fileOutputStream.close();
                                autoCloseInputStream.close();
                                for (qn.a aVar4 : compression.f11713a) {
                                    while (!aVar4.isSatisfied(file)) {
                                        file = aVar4.satisfy(file);
                                    }
                                }
                                return file;
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    ls.d.k(fileOutputStream, th3);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                ls.d.k(autoCloseInputStream, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            ls.d.k(cursorQuery, th7);
                            throw th8;
                        }
                    }
                } catch (Throwable th9) {
                    rn.q qVar3 = Result.f14614e;
                    objO = ib.a.o(th9);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Function1 function1, Context context, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f6991d = 2;
        this.f6993i = function1;
        this.f6994v = context;
        this.f6995w = uri;
    }
}
