package io.ktor.utils.io;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: ByteChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* synthetic */ class ByteChannel$readBuffer$1 extends FunctionReferenceImpl implements Function1<Throwable, ClosedReadChannelException> {
    public static final ByteChannel$readBuffer$1 INSTANCE = new ByteChannel$readBuffer$1();

    ByteChannel$readBuffer$1() {
        super(1, ClosedReadChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ClosedReadChannelException invoke(Throwable th) {
        return new ClosedReadChannelException(th);
    }
}
