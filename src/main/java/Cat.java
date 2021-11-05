/**
 * Project name(项目名称)：第三次实验 实验1
 * Package(包名): PACKAGE_NAME
 * Class(类名): Cat
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 21:43
 * Version(版本): 1.0
 * Description(描述)： 1、方法的重写：
 * 编写一个Java应用程序构建一个Cat类， Cat类继承Object类。
 * Cat类具有三个成员属性String name、int furColor、int height，一个构造方法Cat(String name,int furColor,int height)，
 * 并且重写Cat类的String toString()和boolean equals(Object obj)这两个成员方法。具体要求如下：
 * a)重写toString成员方法，返回值是成员属性String name的值。
 * b)重写equals成员方法，如果两个Cat对象的furColor和height属性相等那么返回值是true，否则返回值是false。
 */

@SuppressWarnings("all")
public class Cat
{
    private String name;    //名字
    private int furColor;   //毛皮颜色
    private int height;      //高度

    public Cat(String name, int furColor, int height)
    {
        this.name = name;
        if (furColor >= 0)
        {
            this.furColor = furColor;
        }
        else
        {
            this.furColor = 0;
        }
        if (height >= 0)
        {
            this.height = height;
        }
        else
        {
            this.height = 0;
        }
    }

    public Cat()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getFurColor()
    {
        return furColor;
    }

    public void setFurColor(int furColor)
    {
        if (furColor >= 0)
        {
            this.furColor = furColor;
        }
        else
        {
            this.furColor = 0;
        }
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        if (height >= 0)
        {
            this.height = height;
        }
        else
        {
            this.height = 0;
        }
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("名字：").append(name);
        return stringbuilder.toString();
    }
    /*
    @Override
    public boolean equals(Object obj)
    {
        if (((Cat) obj).getFurColor() != this.getFurColor())
        {
            return false;
        }
        if (((Cat) obj).getHeight() != this.getHeight())
        {
            return false;
        }
        return true;
    }

 */

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)    //引用同一个对象
        {
            return true;
        }
        if (obj == null)    //检测obj是否为null
        {
            return false;
        }
        //if(!(otherObject instanceof ClassName)) //如果所有的子类都拥有统一的语义
        if (this.getClass() != obj.getClass())   //比较this与obj是否属于同一个类
        {
            return false;
        }
        //Object类向下转型
        Cat cat = (Cat) obj;
        if (cat.getFurColor() != this.getFurColor())
        {
            return false;
        }
        if (cat.getHeight() != this.getHeight())
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.setName("小猫1号");
        cat.setFurColor(2);
        cat.setHeight(18);
        System.out.println(cat);
        Cat cat1 = new Cat("小猫2号", 2, 18);
        System.out.println(cat1);
        System.out.println(cat.equals(cat1));
        Cat cat2 = new Cat("小猫2号", 3, 19);
        System.out.println(cat.equals(cat2));
    }
}
