package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>(this) { // from class: org.webrtc.Predicate.2
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.Predicate, androidx.core.util.Predicate
            public boolean test(T t5) {
                return this.this$0.test(t5) && predicate.test(t5);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: org.webrtc.Predicate.3
            @Override // org.webrtc.Predicate, androidx.core.util.Predicate
            public boolean test(T t5) {
                return !Predicate.this.test(t5);
            }
        };
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        return new Predicate<T>(this) { // from class: org.webrtc.Predicate.1
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.Predicate, androidx.core.util.Predicate
            public boolean test(T t5) {
                return this.this$0.test(t5) || predicate.test(t5);
            }
        };
    }

    boolean test(T t5);
}
