package Break_Singleton;

import java.io.Serializable;

public class DeserObject  implements Serializable{
    private static DeserObject deserObject = null;
    private DeserObject(){
        // Make the constructor private. So that no one can access the constructor to create the object.
        if(deserObject!=null){
            throw new RuntimeException("You are trying to break singleon Pattern");
        }
    }
    // Thread Safe in a optimized way
    public synchronized static DeserObject
     getDeserObjThreadSafeOptimized(){

        // lots of code
        if(deserObject==null){
            synchronized(DeserObject.class){
                if(deserObject == null){
                    deserObject = new DeserObject();
                }
            }
        }
        
        //lots of code
        return deserObject;
    }
}
