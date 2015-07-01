package com.codiodes.aaronredditreader.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Salman Khan on 16/6/15.
 */
public class Children implements Parcelable {

    String kind;
    Data data;

    public Children(String kind, Data data) {
        this.kind = kind;
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public Data getData() {
        return data;
    }

    protected Children(Parcel in) {
        kind = in.readString();
        data = (Data) in.readValue(Data.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(kind);
        dest.writeValue(data);
    }

    @SuppressWarnings("unused")
    public static final Creator<Children> CREATOR = new Creator<Children>() {
        @Override
        public Children createFromParcel(Parcel in) {
            return new Children(in);
        }

        @Override
        public Children[] newArray(int size) {
            return new Children[size];
        }
    };
}
