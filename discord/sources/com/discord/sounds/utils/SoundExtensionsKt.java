package com.discord.sounds.utils;

import android.content.Context;
import android.net.Uri;
import ar.b0;
import ar.k0;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.logging.Log;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.discord.sounds.SoundManager;
import hr.e;
import java.io.File;
import java.util.Comparator;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.collections.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "Ljava/io/File;", "getSoundsCacheDirectory", "(Landroid/content/Context;)Ljava/io/File;", "", "tryPruneSoundsCache", "(Landroid/content/Context;)V", "", "url", "getRemoteSoundFilename", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/discord/sounds/SoundManager;", "soundManager", "", "key", "usage", "Lkotlin/Function1;", "soundResIdPrepared", "fetchSound", "(Landroid/content/Context;Ljava/lang/String;Lcom/discord/sounds/SoundManager;IILkotlin/jvm/functions/Function1;)V", "sounds_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSoundExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundExtensions.kt\ncom/discord/sounds/utils/SoundExtensionsKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,76:1\n29#2:77\n*S KotlinDebug\n*F\n+ 1 SoundExtensions.kt\ncom/discord/sounds/utils/SoundExtensionsKt\n*L\n26#1:77\n*E\n"})
public final class SoundExtensionsKt {

    /* JADX INFO: renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1", f = "SoundExtensions.kt", l = {ChatViewRecyclerTypes.REACTION_ADD_REACTION}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fileName;
        final /* synthetic */ int $key;
        final /* synthetic */ File $soundDirectory;
        final /* synthetic */ SoundManager $soundManager;
        final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
        final /* synthetic */ String $url;
        final /* synthetic */ int $usage;
        int label;

        /* JADX INFO: renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C00421<T> implements FlowCollector {
            final /* synthetic */ int $key;
            final /* synthetic */ SoundManager $soundManager;
            final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
            final /* synthetic */ int $usage;

            /* JADX INFO: renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @d(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1", f = "SoundExtensions.kt", l = {}, m = "invokeSuspend")
            public static final class C00431 extends h implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ DownloadState $downloadState;
                final /* synthetic */ int $key;
                final /* synthetic */ SoundManager $soundManager;
                final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
                final /* synthetic */ int $usage;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00431(SoundManager soundManager, int i7, int i10, DownloadState downloadState, Function1<? super Integer, Unit> function1, Continuation continuation) {
                    super(2, continuation);
                    this.$soundManager = soundManager;
                    this.$key = i7;
                    this.$usage = i10;
                    this.$downloadState = downloadState;
                    this.$soundResIdPrepared = function1;
                }

                @Override // xn.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C00431(this.$soundManager, this.$key, this.$usage, this.$downloadState, this.$soundResIdPrepared, continuation);
                }

                @Override // xn.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f22354d;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    this.$soundManager.prepare(this.$key, this.$usage, null, ((DownloadState.Completed) this.$downloadState).getFile().getAbsolutePath(), this.$soundResIdPrepared);
                    return Unit.f14616a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C00431) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
                }
            }

            /* JADX INFO: renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @d(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2", f = "SoundExtensions.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ Exception $e;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Exception exc, Continuation continuation) {
                    super(2, continuation);
                    this.$e = exc;
                }

                @Override // xn.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.$e, continuation);
                }

                @Override // xn.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f22354d;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    Log.INSTANCE.w(SoundManager.INSTANCE.getLogTag(), "Failed to download sound.", this.$e);
                    return Unit.f14616a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
                }
            }

            /* JADX INFO: renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @d(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3", f = "SoundExtensions.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass3 extends h implements Function2<CoroutineScope, Continuation, Object> {
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // xn.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass3(continuation);
                }

                @Override // xn.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f22354d;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return Unit.f14616a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C00421(SoundManager soundManager, int i7, int i10, Function1<? super Integer, Unit> function1) {
                this.$soundManager = soundManager;
                this.$key = i7;
                this.$usage = i10;
                this.$soundResIdPrepared = function1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
            
                if (ar.b0.A(r0, r9, r2) == r3) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
            
                if (ar.b0.A(r4, r6, r2) == r3) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
            
                if (ar.b0.A(r0, r4, r2) == r3) goto L33;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.discord.file_downloader.DownloadState r17, kotlin.coroutines.Continuation r18) {
                /*
                    r16 = this;
                    r1 = r16
                    r0 = r18
                    boolean r2 = r0 instanceof com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1
                    if (r2 == 0) goto L17
                    r2 = r0
                    com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1 r2 = (com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L17
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L1c
                L17:
                    com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1 r2 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1
                    r2.<init>(r1, r0)
                L1c:
                    java.lang.Object r0 = r2.result
                    wn.a r3 = wn.a.f22354d
                    int r4 = r2.label
                    r5 = 0
                    r6 = 3
                    r7 = 2
                    r8 = 1
                    if (r4 == 0) goto L44
                    if (r4 == r8) goto L3e
                    if (r4 == r7) goto L3a
                    if (r4 != r6) goto L32
                    ib.a.L(r0)
                    goto L8f
                L32:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L3a:
                    ib.a.L(r0)
                    goto L7a
                L3e:
                    ib.a.L(r0)     // Catch: java.lang.Exception -> L42
                    goto L7a
                L42:
                    r0 = move-exception
                    goto L68
                L44:
                    ib.a.L(r0)
                    r13 = r17
                    boolean r0 = r13 instanceof com.discord.file_downloader.DownloadState.Completed
                    if (r0 == 0) goto L7d
                    hr.e r0 = ar.k0.f2938a     // Catch: java.lang.Exception -> L42
                    br.d r0 = fr.q.f9394a     // Catch: java.lang.Exception -> L42
                    com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1 r9 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1     // Catch: java.lang.Exception -> L42
                    com.discord.sounds.SoundManager r10 = r1.$soundManager     // Catch: java.lang.Exception -> L42
                    int r11 = r1.$key     // Catch: java.lang.Exception -> L42
                    int r12 = r1.$usage     // Catch: java.lang.Exception -> L42
                    kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r14 = r1.$soundResIdPrepared     // Catch: java.lang.Exception -> L42
                    r15 = 0
                    r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L42
                    r2.label = r8     // Catch: java.lang.Exception -> L42
                    java.lang.Object r0 = ar.b0.A(r0, r9, r2)     // Catch: java.lang.Exception -> L42
                    if (r0 != r3) goto L7a
                    goto L8e
                L68:
                    hr.e r4 = ar.k0.f2938a
                    br.d r4 = fr.q.f9394a
                    com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2 r6 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2
                    r6.<init>(r0, r5)
                    r2.label = r7
                    java.lang.Object r0 = ar.b0.A(r4, r6, r2)
                    if (r0 != r3) goto L7a
                    goto L8e
                L7a:
                    kotlin.Unit r0 = kotlin.Unit.f14616a
                    return r0
                L7d:
                    hr.e r0 = ar.k0.f2938a
                    br.d r0 = fr.q.f9394a
                    com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3 r4 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3
                    r4.<init>(r5)
                    r2.label = r6
                    java.lang.Object r0 = ar.b0.A(r0, r4, r2)
                    if (r0 != r3) goto L8f
                L8e:
                    return r3
                L8f:
                    kotlin.Unit r0 = kotlin.Unit.f14616a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.sounds.utils.SoundExtensionsKt.AnonymousClass1.C00421.emit(com.discord.file_downloader.DownloadState, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, String str, String str2, File file, SoundManager soundManager, int i7, int i10, Function1<? super Integer, Unit> function1, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
            this.$url = str;
            this.$fileName = str2;
            this.$soundDirectory = file;
            this.$soundManager = soundManager;
            this.$key = i7;
            this.$usage = i10;
            this.$soundResIdPrepared = function1;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$context, this.$url, this.$fileName, this.$soundDirectory, this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                Flow flowDownloadFile$default = FileDownloader.downloadFile$default(FileDownloader.INSTANCE, this.$context, this.$url, this.$fileName, this.$soundDirectory, false, 16, null);
                C00421 c00421 = new C00421(this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared);
                this.label = 1;
                if (flowDownloadFile$default.collect(c00421, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    public static final void fetchSound(@NotNull Context context, @NotNull String url, @NotNull SoundManager soundManager, int i7, int i10, @NotNull Function1<? super Integer, Unit> soundResIdPrepared) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(soundManager, "soundManager");
        Intrinsics.checkNotNullParameter(soundResIdPrepared, "soundResIdPrepared");
        tryPruneSoundsCache(context);
        String remoteSoundFilename = getRemoteSoundFilename(url);
        File soundsCacheDirectory = getSoundsCacheDirectory(context);
        fr.d dVarC = b0.c();
        e eVar = k0.f2938a;
        b0.t(dVarC, hr.d.f11103i, new AnonymousClass1(context, url, remoteSoundFilename, soundsCacheDirectory, soundManager, i7, i10, soundResIdPrepared, null), 2);
    }

    @NotNull
    public static final String getRemoteSoundFilename(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return b.j(Uri.parse(url).getLastPathSegment(), ".mp3");
    }

    @NotNull
    public static final File getSoundsCacheDirectory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return new File(context.getCacheDir(), "sounds");
    }

    public static final void tryPruneSoundsCache(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File[] fileArrListFiles = getSoundsCacheDirectory(context).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length < 20) {
            return;
        }
        w.n(fileArrListFiles, new Comparator() { // from class: com.discord.sounds.utils.SoundExtensionsKt$tryPruneSoundsCache$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                return tn.a.a(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t5).lastModified()));
            }
        });
        File file = (File) y.B(fileArrListFiles);
        if (file != null) {
            file.delete();
        }
    }
}
