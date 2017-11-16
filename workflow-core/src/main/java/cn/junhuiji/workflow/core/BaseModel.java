package cn.junhuiji.workflow.core;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by 季先生 on 2017/11/13 16:58.
 * 所有业务类的基类
 */
public class BaseModel implements Serializable {

    /**
     * 所有类的 toString方法
     *
     * @return
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
