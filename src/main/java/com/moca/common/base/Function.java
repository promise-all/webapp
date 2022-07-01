package com.moca.common.base;

public interface Function<K, V> {
    V handle(K param);
}
