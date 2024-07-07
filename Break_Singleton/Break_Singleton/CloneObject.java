package Break_Singleton;

import java.io.Serializable;

public class CloneObject implements Cloneable , Serializable {
    private static CloneObject cloneObject = null;
    private CloneObject(){
        // Make the constructor private. So that no one can access the constructor to create the object.
        if(cloneObject!=null){
            throw new RuntimeException("You are trying to break singleon Pattern");
        }
    }
    // Thread Safe in a optimized way
    public synchronized static CloneObject
     getDeserObjThreadSafeOptimized(){

        // lots of code
        if(cloneObject==null){
            synchronized(CloneObject.class){
                if(cloneObject == null){
                    cloneObject = new CloneObject();
                }
            }
        }
        
        //lots of code
        return cloneObject;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
