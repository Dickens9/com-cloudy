package com.bulider.common.cache;

import com.cloudy.common.entity.BaseEntity;



/**
 * User: lxd
 * Date: 11-9-15
 * Time: 下午3:40
 */
public class NullObject  extends BaseEntity<String> {
    private static final long serialVersionUID = 5454155825314635342L;
    public static final String NULL_OBJECT_CACHE_FLAG = "NullObject";


    public NullObject(Object id) {

    }

    public NullObject() {
    }



    public String getDeserFlag(){
        return NULL_OBJECT_CACHE_FLAG;
    }
}
