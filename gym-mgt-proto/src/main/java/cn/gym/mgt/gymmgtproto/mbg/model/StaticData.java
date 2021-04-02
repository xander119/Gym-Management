package cn.gym.mgt.gymmgtproto.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class StaticData implements Serializable {
    @ApiModelProperty(value = "static_data_id")
    private Long staticDataId;

    @ApiModelProperty(value = "code")
    private String code;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "type_code")
    private String typeCode;

    @ApiModelProperty(value = "active")
    private Boolean active;

    @ApiModelProperty(value = "description")
    private String description;

    private static final long serialVersionUID = 1L;

    public Long getStaticDataId() {
        return staticDataId;
    }

    public void setStaticDataId(Long staticDataId) {
        this.staticDataId = staticDataId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", staticDataId=").append(staticDataId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", typeCode=").append(typeCode);
        sb.append(", active=").append(active);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}