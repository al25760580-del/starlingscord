package com.discord.file_manager;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import ar.b0;
import ar.k0;
import com.discord.codegen.NativeFileModuleSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import ho.c;
import hr.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.x;
import kotlinx.coroutines.CoroutineScope;
import m3.m;
import org.jetbrains.annotations.NotNull;
import rn.q;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eH\u0014J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\nH\u0007J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010(\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010\b\u001a.\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tj\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/discord/file_manager/FileModule;", "Lcom/discord/codegen/NativeFileModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "storageDirs", "Ljava/util/HashMap;", "", "kotlin.jvm.PlatformType", "Lkotlin/collections/HashMap;", "getTypedExportedConstants", "", "", "writeFile", "", "storageDir", "path", "data", "encoding", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "readFile", "readAsset", "assetUri", "openRawResource", "Ljava/io/InputStream;", "getSize", "uri", "fileExists", "saveFileToGallery", "fileName", "fileType", "moveFile", "sourcePath", "destinationPath", "removeFile", "clearFolder", "getFileHash", "algorithm", "chunkSize", "", "file_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,320:1\n29#2:321\n*S KotlinDebug\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule\n*L\n186#1:321\n*E\n"})
public final class FileModule extends NativeFileModuleSpec {

    @NotNull
    private final CoroutineScope ioScope;

    @NotNull
    private final HashMap<String, String> storageDirs;

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$clearFolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$clearFolder$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nFileModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$clearFolder$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n13472#2,2:321\n*S KotlinDebug\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$clearFolder$1\n*L\n278#1:321,2\n*E\n"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $storageDir;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Promise promise, String str2, Continuation continuation) {
            super(2, continuation);
            this.$storageDir = str;
            this.$promise = promise;
            this.$path = str2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return FileModule.this.new AnonymousClass1(this.$storageDir, this.$promise, this.$path, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            String str = (String) FileModule.this.storageDirs.get(this.$storageDir);
            if (str == null || StringsKt.K(str)) {
                this.$promise.reject("err", "Unknown storage directory " + this.$storageDir + ". Supported storage directories: " + FileModule.this.storageDirs.keySet());
                return Unit.f14616a;
            }
            try {
                File file = new File(str, this.$path);
                File[] fileArrListFiles = file.listFiles();
                boolean z5 = false;
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        file2.delete();
                    }
                }
                Promise promise = this.$promise;
                File[] fileArrListFiles2 = file.listFiles();
                if (fileArrListFiles2 != null && fileArrListFiles2.length == 0) {
                    z5 = true;
                }
                promise.resolve(Boolean.valueOf(z5));
            } catch (Exception e10) {
                this.$promise.reject("err", "Cannot clear the folder", e10);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$fileExists$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$fileExists$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    public static final class C01201 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01201(Promise promise, String str, Continuation continuation) {
            super(2, continuation);
            this.$promise = promise;
            this.$path = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01201(this.$promise, this.$path, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                this.$promise.resolve(Boolean.valueOf(new File(this.$path).exists()));
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01201) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$getFileHash$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$getFileHash$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nFileModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$getFileHash$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n29#2:321\n1#3:322\n*S KotlinDebug\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$getFileHash$1\n*L\n293#1:321\n*E\n"})
    public static final class C01211 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $algorithm;
        final /* synthetic */ double $chunkSize;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $uri;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FileModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01211(String str, FileModule fileModule, String str2, Promise promise, double d6, Continuation continuation) {
            super(2, continuation);
            this.$algorithm = str;
            this.this$0 = fileModule;
            this.$uri = str2;
            this.$promise = promise;
            this.$chunkSize = d6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C01211 c01211 = new C01211(this.$algorithm, this.this$0, this.$uri, this.$promise, this.$chunkSize, continuation);
            c01211.L$0 = obj;
            return c01211;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Object objO;
            int i7;
            String string;
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            String str = this.$algorithm;
            FileModule fileModule = this.this$0;
            String str2 = this.$uri;
            Promise promise = this.$promise;
            double d6 = this.$chunkSize;
            try {
                q qVar = Result.f14614e;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!Intrinsics.areEqual(lowerCase, "md5")) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = fileModule.getReactApplicationContext().getContentResolver().openFileDescriptor(Uri.parse(str2), "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        byte[] bArr = new byte[c.a(d6)];
                        while (true) {
                            int i10 = fileInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            messageDigest.update(bArr, 0, i10);
                            q qVar2 = Result.f14614e;
                            objO = ib.a.o(th);
                        }
                        fileInputStream.close();
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : messageDigest.digest()) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str3 = String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                            sb2.append(str3);
                        }
                        string = sb2.toString();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        if (string == null) {
                            string = "";
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ls.d.k(parcelFileDescriptorOpenFileDescriptor, th2);
                            throw th3;
                        }
                    }
                } else {
                    string = "";
                }
                promise.resolve(string);
                objO = Unit.f14616a;
            } catch (Throwable th4) {
                q qVar3 = Result.f14614e;
                objO = ib.a.o(th4);
            }
            Promise promise2 = this.$promise;
            Throwable thA = Result.a(objO);
            if (thA != null) {
                promise2.reject("err", "Cannot get checksum of file", thA);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01211) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$getSize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$getSize$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nFileModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$getSize$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,320:1\n29#2:321\n*S KotlinDebug\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$getSize$1\n*L\n161#1:321\n*E\n"})
    public static final class C01221 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $uri;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01221(String str, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.$uri = str;
            this.$promise = promise;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C01221 c01221 = FileModule.this.new C01221(this.$uri, this.$promise, continuation);
            c01221.L$0 = obj;
            return c01221;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Object objO;
            long statSize;
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            FileModule fileModule = FileModule.this;
            String str = this.$uri;
            Promise promise = this.$promise;
            try {
                q qVar = Result.f14614e;
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = fileModule.getReactApplicationContext().getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ls.d.k(parcelFileDescriptorOpenFileDescriptor, th2);
                            throw th3;
                        }
                    }
                } else {
                    statSize = 0;
                }
                if (statSize < 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                promise.resolve(new Double(statSize));
                objO = Unit.f14616a;
                Promise promise2 = this.$promise;
                Throwable thA = Result.a(objO);
                if (thA != null) {
                    promise2.reject(thA);
                }
                return Unit.f14616a;
            } catch (Throwable th4) {
                q qVar2 = Result.f14614e;
                objO = ib.a.o(th4);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01221) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$moveFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$moveFile$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nFileModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$moveFile$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
    public static final class C01231 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $destinationPath;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $sourcePath;
        final /* synthetic */ String $storageDir;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01231(String str, Promise promise, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.$storageDir = str;
            this.$promise = promise;
            this.$sourcePath = str2;
            this.$destinationPath = str3;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return FileModule.this.new C01231(this.$storageDir, this.$promise, this.$sourcePath, this.$destinationPath, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                String str = (String) FileModule.this.storageDirs.get(this.$storageDir);
                if (str == null) {
                    this.$promise.reject("err", "Unknown storage directory '" + this.$storageDir + "'. Supported storage directories: " + FileModule.this.storageDirs.keySet());
                    return Unit.f14616a;
                }
                File file = new File(str, this.$sourcePath);
                File file2 = new File(str, this.$destinationPath);
                File parentFile = file2.getParentFile();
                if (parentFile == null) {
                    throw new IllegalArgumentException("Parent file should not be null");
                }
                parentFile.mkdirs();
                if (file.renameTo(file2)) {
                    this.$promise.resolve(Boolean.TRUE);
                } else {
                    if (!file.exists()) {
                        this.$promise.resolve(Boolean.FALSE);
                    }
                    this.$promise.reject("err", "Failed to move file from " + this.$sourcePath + " to " + this.$destinationPath);
                }
                return Unit.f14616a;
            } catch (Exception e10) {
                this.$promise.reject("err", "Error moving file", e10);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01231) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$readAsset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$readAsset$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nFileModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$readAsset$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n29#2:321\n1#3:322\n*S KotlinDebug\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$readAsset$1\n*L\n114#1:321\n*E\n"})
    public static final class C01241 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $assetUri;
        final /* synthetic */ String $encoding;
        final /* synthetic */ Promise $promise;
        int label;
        final /* synthetic */ FileModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01241(String str, FileModule fileModule, String str2, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.$assetUri = str;
            this.this$0 = fileModule;
            this.$encoding = str2;
            this.$promise = promise;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01241(this.$assetUri, this.this$0, this.$encoding, this.$promise, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0084 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:5:0x0009, B:7:0x0015, B:12:0x0024, B:14:0x002c, B:42:0x009c, B:44:0x00a9, B:45:0x00b4, B:47:0x00b8, B:48:0x00bc, B:39:0x0097, B:40:0x009a, B:17:0x003b, B:20:0x0044, B:23:0x004e, B:25:0x0057, B:26:0x005d, B:28:0x0063, B:29:0x007c, B:30:0x0083, B:31:0x0084, B:34:0x008f, B:37:0x0095), top: B:59:0x0009, inners: #0, #1 }] */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            InputStream inputStreamOpenRawResource;
            byte[] bArrK;
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                Uri uri = Uri.parse(this.$assetUri);
                String scheme = uri.getScheme();
                if (scheme == null) {
                    inputStreamOpenRawResource = this.this$0.openRawResource(this.$assetUri);
                } else {
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != 3143036) {
                        if (iHashCode == 3213448 && scheme.equals("http")) {
                            inputStreamOpenRawResource = new URL(this.$assetUri).openStream();
                        } else {
                            inputStreamOpenRawResource = this.this$0.openRawResource(this.$assetUri);
                        }
                    } else if (scheme.equals("file")) {
                        String path = uri.getPath();
                        if (path == null) {
                            path = "";
                        }
                        File file = new File(path);
                        if (file.exists()) {
                            inputStreamOpenRawResource = new FileInputStream(file);
                        } else {
                            String lastPathSegment = uri.getLastPathSegment();
                            if (lastPathSegment == null) {
                                throw new IllegalStateException("Could not find asset");
                            }
                            inputStreamOpenRawResource = this.this$0.openRawResource((String) StringsKt__StringsKt.split$default(lastPathSegment, new String[]{"."}, false, 0, 6, null).get(0));
                        }
                    } else {
                        inputStreamOpenRawResource = this.this$0.openRawResource(this.$assetUri);
                    }
                }
                if (inputStreamOpenRawResource != null) {
                    try {
                        bArrK = m.K(inputStreamOpenRawResource);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ls.d.k(inputStreamOpenRawResource, th2);
                            throw th3;
                        }
                    }
                } else {
                    bArrK = null;
                }
                ls.d.k(inputStreamOpenRawResource, null);
                if (Intrinsics.areEqual(this.$encoding, "base64")) {
                    this.$promise.resolve(Base64.encodeToString(bArrK, 2));
                } else {
                    this.$promise.resolve(bArrK != null ? x.g(bArrK) : null);
                }
            } catch (Throwable th4) {
                this.$promise.reject(th4);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01241) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$readFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$readFile$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nFileModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule$readFile$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
    public static final class C01251 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $encoding;
        final /* synthetic */ String $path;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01251(String str, String str2, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.$path = str;
            this.$encoding = str2;
            this.$promise = promise;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01251(this.$path, this.$encoding, this.$promise, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.$path));
                try {
                    byte[] bArrK = m.K(fileInputStream);
                    fileInputStream.close();
                    if (Intrinsics.areEqual(this.$encoding, "base64")) {
                        this.$promise.resolve(Base64.encodeToString(bArrK, 2));
                    } else {
                        this.$promise.resolve(x.g(bArrK));
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(fileInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                this.$promise.reject(th4);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01251) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$removeFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$removeFile$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    public static final class C01261 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $storageDir;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01261(String str, Promise promise, String str2, Continuation continuation) {
            super(2, continuation);
            this.$storageDir = str;
            this.$promise = promise;
            this.$path = str2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return FileModule.this.new C01261(this.$storageDir, this.$promise, this.$path, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            String str = (String) FileModule.this.storageDirs.get(this.$storageDir);
            if (str != null && !StringsKt.K(str)) {
                try {
                    File file = new File(str, this.$path);
                    if (file.exists()) {
                        file.delete();
                        this.$promise.resolve(Boolean.valueOf(file.delete()));
                    } else {
                        this.$promise.resolve(Boolean.FALSE);
                    }
                } catch (Exception e10) {
                    this.$promise.reject("err", "Cannot delete the file", e10);
                }
                return Unit.f14616a;
            }
            this.$promise.reject("err", "Unknown storage directory " + this.$storageDir + ". Supported storage directories: " + FileModule.this.storageDirs.keySet());
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01261) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.file_manager.FileModule$writeFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.file_manager.FileModule$writeFile$1", f = "FileModule.kt", l = {}, m = "invokeSuspend")
    public static final class C01271 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $data;
        final /* synthetic */ String $encoding;
        final /* synthetic */ String $path;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $storageDir;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01271(String str, Promise promise, String str2, String str3, String str4, Continuation continuation) {
            super(2, continuation);
            this.$storageDir = str;
            this.$promise = promise;
            this.$path = str2;
            this.$encoding = str3;
            this.$data = str4;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return FileModule.this.new C01271(this.$storageDir, this.$promise, this.$path, this.$encoding, this.$data, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            File parentFile;
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            if (!FileModule.this.storageDirs.containsKey(this.$storageDir)) {
                this.$promise.reject("err", "Unknown storage directory " + this.$storageDir + ". Supported storage directories: " + FileModule.this.storageDirs.keySet());
                return Unit.f14616a;
            }
            try {
                Object obj2 = FileModule.this.storageDirs.get(this.$storageDir);
                Intrinsics.checkNotNull(obj2);
                String str = (String) obj2;
                File file = new File(str, this.$path + ".tmp");
                File file2 = new File(str, this.$path);
                File parentFile2 = file2.getParentFile();
                if (parentFile2 != null && !parentFile2.exists() && (parentFile = file2.getParentFile()) != null && !parentFile.mkdirs()) {
                    Promise promise = this.$promise;
                    File parentFile3 = file2.getParentFile();
                    promise.reject("err", "Failed to create parent directory " + (parentFile3 != null ? parentFile3.toString() : null));
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                String str2 = this.$encoding;
                String str3 = this.$data;
                try {
                    if (Intrinsics.areEqual(str2, "base64")) {
                        fileOutputStream.write(Base64.decode(str3, 0));
                    } else {
                        byte[] bytes = str3.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        fileOutputStream.write(bytes);
                    }
                    fileOutputStream.getFD().sync();
                    Unit unit = Unit.f14616a;
                    fileOutputStream.close();
                    file.renameTo(file2);
                    this.$promise.resolve(file2.getAbsolutePath());
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                this.$promise.reject(th4);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01271) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        e eVar = k0.f2938a;
        this.ioScope = b0.b(hr.d.f11103i);
        this.storageDirs = w0.f(new Pair("cache", getReactApplicationContext().getCacheDir().getAbsolutePath()), new Pair("documents", getReactApplicationContext().getFilesDir().getAbsolutePath()));
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void clearFolder(@NotNull String storageDir, @NotNull String path, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(storageDir, "storageDir");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new AnonymousClass1(storageDir, promise, path, null), 3);
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void fileExists(@NotNull String path, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new C01201(promise, path, null), 3);
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void getFileHash(@NotNull String uri, @NotNull String algorithm, double chunkSize, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new C01211(algorithm, this, uri, promise, chunkSize, null), 3);
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void getSize(@NotNull String uri, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new C01221(uri, promise, null), 3);
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        String str = this.storageDirs.get("documents");
        Intrinsics.checkNotNull(str);
        Pair pair = new Pair("DocumentsDirPath", str);
        String str2 = this.storageDirs.get("cache");
        Intrinsics.checkNotNull(str2);
        return w0.h(pair, new Pair("CacheDirPath", str2));
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void moveFile(@NotNull String storageDir, @NotNull String sourcePath, @NotNull String destinationPath, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(storageDir, "storageDir");
        Intrinsics.checkNotNullParameter(sourcePath, "sourcePath");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new C01231(storageDir, promise, sourcePath, destinationPath, null), 3);
    }

    @SuppressLint({"DiscouragedApi"})
    @NotNull
    public final InputStream openRawResource(@NotNull String assetUri) {
        Intrinsics.checkNotNullParameter(assetUri, "assetUri");
        InputStream inputStreamOpenRawResource = getReactApplicationContext().getResources().openRawResource(getReactApplicationContext().getResources().getIdentifier(assetUri, "raw", getReactApplicationContext().getPackageName()));
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void readAsset(@NotNull String assetUri, @NotNull String encoding, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(assetUri, "assetUri");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new C01241(assetUri, this, encoding, promise, null), 3);
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void readFile(@NotNull String path, @NotNull String encoding, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new C01251(path, encoding, promise, null), 3);
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void removeFile(@NotNull String storageDir, @NotNull String path, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(storageDir, "storageDir");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new C01261(storageDir, promise, path, null), 3);
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void saveFileToGallery(@NotNull String uri, @NotNull String fileName, @NotNull String fileType, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(uri)));
        if (bitmapDecodeStream == null) {
            return;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), fileName);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (Intrinsics.areEqual(fileType, "PNG")) {
                bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else if (Intrinsics.areEqual(fileType, "JPEG")) {
                bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{file.toString()}, new String[]{file.getName()}, null);
            promise.resolve(file.getAbsolutePath());
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.discord.codegen.NativeFileModuleSpec
    public void writeFile(@NotNull String storageDir, @NotNull String path, @NotNull String data, @NotNull String encoding, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(storageDir, "storageDir");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.ioScope, null, new C01271(storageDir, promise, path, encoding, data, null), 3);
    }
}
