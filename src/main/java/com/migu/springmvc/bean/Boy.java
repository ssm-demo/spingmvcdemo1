package com.migu.springmvc.bean;

public class Boy
{
    private String name;
    private String love;

    public Boy()
    {

    }

    public Boy(String name , String love)
    {
        this.name = name;
        this.love = love;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLove()
    {
        return love;
    }

    public void setLove(String love)
    {
        this.love = love;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Boy{");
        sb.append("name='").append(name).append('\'');
        sb.append(", love='").append(love).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
