package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class n6 implements Queue, Collection, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f12839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.util.a f12840e = new io.sentry.util.a();

    public n6(f fVar) {
        this.f12839d = fVar;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        r rVarA = this.f12840e.a();
        try {
            boolean zAdd = this.f12839d.add(obj);
            rVarA.close();
            return zAdd;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        r rVarA = this.f12840e.a();
        try {
            boolean zAddAll = this.f12839d.addAll(collection);
            rVarA.close();
            return zAddAll;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        r rVarA = this.f12840e.a();
        try {
            this.f12839d.clear();
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        r rVarA = this.f12840e.a();
        try {
            boolean zContains = this.f12839d.contains(obj);
            rVarA.close();
            return zContains;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        r rVarA = this.f12840e.a();
        try {
            boolean zContainsAll = this.f12839d.containsAll(collection);
            rVarA.close();
            return zContainsAll;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object element() {
        r rVarA = this.f12840e.a();
        try {
            Object objElement = this.f12839d.element();
            rVarA.close();
            return objElement;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        r rVarA = this.f12840e.a();
        try {
            boolean zEquals = this.f12839d.equals(obj);
            rVarA.close();
            return zEquals;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        r rVarA = this.f12840e.a();
        try {
            int iHashCode = this.f12839d.hashCode();
            rVarA.close();
            return iHashCode;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        r rVarA = this.f12840e.a();
        try {
            boolean zIsEmpty = this.f12839d.isEmpty();
            rVarA.close();
            return zIsEmpty;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f12839d.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        r rVarA = this.f12840e.a();
        try {
            boolean zOffer = this.f12839d.offer(obj);
            rVarA.close();
            return zOffer;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        r rVarA = this.f12840e.a();
        try {
            Object objPeek = this.f12839d.peek();
            rVarA.close();
            return objPeek;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        r rVarA = this.f12840e.a();
        try {
            Object objPoll = this.f12839d.poll();
            rVarA.close();
            return objPoll;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        r rVarA = this.f12840e.a();
        try {
            Object objRemove = this.f12839d.remove();
            rVarA.close();
            return objRemove;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        r rVarA = this.f12840e.a();
        try {
            boolean zRemoveAll = this.f12839d.removeAll(collection);
            rVarA.close();
            return zRemoveAll;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        r rVarA = this.f12840e.a();
        try {
            boolean zRetainAll = this.f12839d.retainAll(collection);
            rVarA.close();
            return zRetainAll;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        r rVarA = this.f12840e.a();
        try {
            int size = this.f12839d.size();
            rVarA.close();
            return size;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        r rVarA = this.f12840e.a();
        try {
            Object[] array = this.f12839d.toArray();
            rVarA.close();
            return array;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String toString() {
        r rVarA = this.f12840e.a();
        try {
            String string = this.f12839d.toString();
            rVarA.close();
            return string;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        r rVarA = this.f12840e.a();
        try {
            boolean zRemove = this.f12839d.remove(obj);
            rVarA.close();
            return zRemove;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        r rVarA = this.f12840e.a();
        try {
            Object[] array = this.f12839d.toArray(objArr);
            rVarA.close();
            return array;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
