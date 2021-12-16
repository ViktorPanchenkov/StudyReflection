package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionCheker {

    public void showClassName(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }
    public void showClassFields(Object object){
        Class clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields();

        for (Field field : fields){
            System.out.println(field.getName());
        }
    }

    public void showClassMethods(Object object){
        Class clazz = object.getClass();
        Method [] methods = clazz.getMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }
    }
    public void showFieldsClassAnnotations(Object object){
        Class clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields();

        for (Field field : fields){
          //  System.out.println(field.getAnnotations());
            Annotation [] annotations = field.getDeclaredAnnotations();
            for( Annotation annotation : annotations){
                System.out.println(field.getName() + annotation.toString());
            }
        }
    }

    public void fillPrivetFileds(Object object) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields();

        for (Field field : fields){
         Annotation annotation =  field.getAnnotation(RabbitAnnotation.class);
         if (annotation == null){
             continue;
         }

         field.setAccessible(true);
         field.set(object,"Field");
         field.setAccessible(false);
        }
    }

    public  Object createNewObject(Object object) throws InstantiationException, IllegalAccessException {
        Class clazz = object.getClass();
       return clazz.newInstance();
    }
}
