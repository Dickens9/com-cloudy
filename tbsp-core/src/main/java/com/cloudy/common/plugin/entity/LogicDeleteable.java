
package com.cloudy.common.plugin.entity;

/**
 * <p>实体实现该接口表示想要逻辑删除
 * 为了简化开发 约定删除标识列名为deleted，如果想自定义删除的标识列名：
 * 1、使用注解元数据
 * 2、写一个 getColumn() 方法 返回列名
 * <p/>
 * <p>Version: 1.0
 */
public interface LogicDeleteable {

    public String getIsDeleted();

    public void setIsDeleted(String deleted);

    /**
     * 标识为已删除
     */
    public void markDeleted();

}
