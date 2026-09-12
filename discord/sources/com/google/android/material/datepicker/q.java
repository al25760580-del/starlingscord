package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Comparable, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new af.m(22);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Calendar f6375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6376e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6377i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6378v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f6380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f6381y;

    public q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = z.a(calendar);
        this.f6375d = calendarA;
        this.f6376e = calendarA.get(2);
        this.f6377i = calendarA.get(1);
        this.f6378v = calendarA.getMaximum(7);
        this.f6379w = calendarA.getActualMaximum(5);
        this.f6380x = calendarA.getTimeInMillis();
    }

    public static q a(int i7, int i10) {
        Calendar calendarC = z.c(null);
        calendarC.set(1, i7);
        calendarC.set(2, i10);
        return new q(calendarC);
    }

    public static q h(long j) {
        Calendar calendarC = z.c(null);
        calendarC.setTimeInMillis(j);
        return new q(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6375d.compareTo(((q) obj).f6375d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f6376e == qVar.f6376e && this.f6377i == qVar.f6377i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6376e), Integer.valueOf(this.f6377i)});
    }

    public final String i() {
        if (this.f6381y == null) {
            long timeInMillis = this.f6375d.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = z.f6395a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f6381y = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f6381y;
    }

    public final int v(q qVar) {
        if (!(this.f6375d instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (qVar.f6376e - this.f6376e) + ((qVar.f6377i - this.f6377i) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6377i);
        parcel.writeInt(this.f6376e);
    }
}
