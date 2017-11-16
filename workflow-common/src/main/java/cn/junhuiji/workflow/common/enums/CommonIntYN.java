package cn.junhuiji.workflow.common.enums;

/**
 * Created by 季先生 on 2017/11/13 17:09.
 */
public enum CommonIntYN {
    Y(1, "是"), N(2, "否");

    private Integer code;
    private String name;

    /**
     * 私有的构造方法
     * @param code
     * @param name
     */
    private CommonIntYN(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 根据code查询name
     * @param code
     * @return
     */
    public static String getCodeNameByCode(Integer code) {
        for (CommonIntYN yn : CommonIntYN.values()) {
            if (yn.getCode().intValue() == code.intValue()) {
                return yn.getName();
            }
        }
        return null;
    }

    /**
     * 根据name查询code
     * @param name
     * @return
     */
    public static Integer getCodeByCodeName(String name) {
        for (CommonIntYN yn : CommonIntYN.values()) {
            if (yn.getName().equals(name)) {
                return yn.getCode();
            }
        }
        return null;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
