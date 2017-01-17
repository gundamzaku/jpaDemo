package com.springapp.model;

import com.springapp.domain.Spitter;

/**
 * Created by dan on 2017/1/17.
 */
interface JpaRepository {
    void findByUsername(String username);
}
