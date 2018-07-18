package com.example.ymeng.tomorrowhelper.util;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

import java.security.MessageDigest;

/**
 * Author:YMeng
 * Time:2018/7/12  13:49
 * This is ObjKey
 */
public class ObjKey implements Key {

    private final Object object;

    public ObjKey(Object object) {
        this.object = Preconditions.checkNotNull(object);
    }

    @Override
    public String toString() {
        return "ObjectKey{"
                + "object=" + object
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ObjKey) {
            ObjKey other = (ObjKey) o;
            return object.equals(other.object);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return object.hashCode();
    }


    // Charset CHARSET = Charset.forName("UTF-8");
    @Override
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(object.toString().getBytes(CHARSET));
    }


}


