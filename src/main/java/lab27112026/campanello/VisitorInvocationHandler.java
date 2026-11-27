package lab27112026.campanello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VisitorInvocationHandler implements InvocationHandler {
    Campanello campanello;

    public VisitorInvocationHandler(Campanello campanello){
        this.campanello = campanello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try{
            if(method.getName().equals("ring"))
                return method.invoke(campanello, args);
            else if(method.getName().equals("getStatus"))
                return method.invoke(campanello, args);
            else
                throw new IllegalAccessException("Method "+ method.getName() +"not allowed for Visitor");
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
