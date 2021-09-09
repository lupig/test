package com.gttc.test.domain;


/**
 * 检验项目对象 checkout
 * 
 * @author 卢品良
 * @date 2021-09-06
 */
public class Checkout
{
    private static final long serialVersionUID = 1L;

    private String category;

    private String id;

    private String name;

    private String explain;

    private String grade;

    private String content;

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setExplain(String explain) 
    {
        this.explain = explain;
    }

    public String getExplain() 
    {
        return explain;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "category='" + category + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", explain='" + explain + '\'' +
                ", grade='" + grade + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
