package io.ktor.network.sockets;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Datagram.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/DatagramReadWriteChannel;", "Lio/ktor/network/sockets/DatagramReadChannel;", "Lio/ktor/network/sockets/DatagramWriteChannel;", "ktor-network"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DatagramReadWriteChannel extends DatagramReadChannel, DatagramWriteChannel {

    /* JADX INFO: compiled from: Datagram.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static Object receive(DatagramReadWriteChannel datagramReadWriteChannel, Continuation<? super Datagram> continuation) {
            return DatagramReadWriteChannel.super.receive(continuation);
        }

        @Deprecated
        public static Object send(DatagramReadWriteChannel datagramReadWriteChannel, Datagram datagram, Continuation<? super Unit> continuation) {
            return DatagramReadWriteChannel.super.send(datagram, continuation);
        }
    }
}
