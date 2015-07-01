package com.apifest.api.params;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A POJO which holds the information for expected errors or exceptions when invoking the API.
 * @author Martin Boyanov
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endpoint_param_documentation")
public class ExceptionDocumentation
{
    @XmlAttribute(name = "name", required = true)
    private String name;

    @XmlAttribute(name = "condition", required = true)
    private String condition;

    @XmlAttribute(name = "description", required = true)
    private String description;

    @XmlAttribute(name = "code", required = true)
    private Integer code;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCondition()
    {
        return condition;
    }

    public void setCondition(String condition)
    {
        this.condition = condition;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }
}
