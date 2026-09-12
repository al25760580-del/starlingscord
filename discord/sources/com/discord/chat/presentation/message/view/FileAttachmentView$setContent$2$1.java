package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.widget.ProgressBar;
import ar.b0;
import ar.k0;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.PublicFileDownloader;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@xn.d(c = "com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1", f = "FileAttachmentView.kt", l = {105}, m = "invokeSuspend")
public final class FileAttachmentView$setContent$2$1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ String $attachmentDescription;
    final /* synthetic */ String $attachmentName;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ FileAttachmentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachmentView$setContent$2$1(FileAttachmentView fileAttachmentView, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fileAttachmentView;
        this.$url = str;
        this.$attachmentName = str2;
        this.$attachmentDescription = str3;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileAttachmentView$setContent$2$1(this.this$0, this.$url, this.$attachmentName, this.$attachmentDescription, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            PublicFileDownloader publicFileDownloader = PublicFileDownloader.INSTANCE;
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Flow flowDownloadFile = publicFileDownloader.downloadFile(context, this.$url, this.$attachmentName, this.$attachmentDescription);
            final FileAttachmentView fileAttachmentView = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1.1

                /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @xn.d(c = "com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1$1$1", f = "FileAttachmentView.kt", l = {}, m = "invokeSuspend")
                @SourceDebugExtension({"SMAP\nFileAttachmentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileAttachmentView.kt\ncom/discord/chat/presentation/message/view/FileAttachmentView$setContent$2$1$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,151:1\n257#2,2:152\n257#2,2:154\n*S KotlinDebug\n*F\n+ 1 FileAttachmentView.kt\ncom/discord/chat/presentation/message/view/FileAttachmentView$setContent$2$1$1$1\n*L\n108#1:152,2\n109#1:154,2\n*E\n"})
                public static final class C00241 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ DownloadState $downloadState;
                    int label;
                    final /* synthetic */ FileAttachmentView this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00241(DownloadState downloadState, FileAttachmentView fileAttachmentView, Continuation continuation) {
                        super(2, continuation);
                        this.$downloadState = downloadState;
                        this.this$0 = fileAttachmentView;
                    }

                    @Override // xn.a
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C00241(this.$downloadState, this.this$0, continuation);
                    }

                    @Override // xn.a
                    public final Object invokeSuspend(Object obj) {
                        wn.a aVar = wn.a.f22354d;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj);
                        boolean z5 = this.$downloadState instanceof DownloadState.InProgress;
                        ProgressBar fileAttachmentDownloadProgressBar = this.this$0.binding.fileAttachmentDownloadProgressBar;
                        Intrinsics.checkNotNullExpressionValue(fileAttachmentDownloadProgressBar, "fileAttachmentDownloadProgressBar");
                        fileAttachmentDownloadProgressBar.setVisibility(z5 ? 0 : 8);
                        SimpleDraweeView fileAttachmentDownload = this.this$0.binding.fileAttachmentDownload;
                        Intrinsics.checkNotNullExpressionValue(fileAttachmentDownload, "fileAttachmentDownload");
                        fileAttachmentDownload.setVisibility(z5 ? 8 : 0);
                        return Unit.f14616a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((C00241) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(DownloadState downloadState, Continuation continuation) throws Throwable {
                    hr.e eVar = k0.f2938a;
                    Object objA = b0.A(fr.q.f9394a, new C00241(downloadState, fileAttachmentView, null), continuation);
                    return objA == wn.a.f22354d ? objA : Unit.f14616a;
                }
            };
            this.label = 1;
            if (flowDownloadFile.collect(flowCollector, this) == aVar) {
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
        return ((FileAttachmentView$setContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
