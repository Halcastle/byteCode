import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

public class JvmClassLoaderPrintPath {

    public static void main(String[] args){
        //启动类加载器,加载jre和jre\\lib下的核心库
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        System.out.println("BootStrapClassLoader");
        for(URL url : urls){
            System.out.println(" ==>"+url.toExternalForm());
        }

        //扩展类加载器,加载jre\\lib\\ext目录下的扩展包
        printClassLoader("ExtClassLoader",JvmClassLoaderPrintPath.class.getClassLoader().getParent());

        //应用类加载器
        printClassLoader("AppClassLoader",JvmClassLoaderPrintPath.class.getClassLoader());
    }

    public static void printClassLoader(String name,ClassLoader cl){
        if(cl != null){
            System.out.println(name + "ClassLoader -> "+cl.toString());
            printURLForClassLoader(cl);
        }else{
            System.out.println(name + "ClassLoader -> null");
        }
    }

    public static void printURLForClassLoader(ClassLoader cl){
        Object ucp = insightField(cl,"ucp");
        Object path = insightField(ucp,"path");
        ArrayList ps = (ArrayList) path;
        for(Object p : ps){
            System.out.println(" ==> "+p.toString());
        }
    }

    private static Object insightField(Object obj,String fName){
        try{
            Field f = null ;
            if(obj instanceof URLClassLoader){
                f = URLClassLoader.class.getDeclaredField(fName);
            }else{
                f = obj.getClass().getDeclaredField(fName);
            }
            f.setAccessible(true);
            return f.get(obj);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
